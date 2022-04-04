package net.brcdev.myspawners.hook;

import net.brcdev.myspawners.MySpawnersPlugin;
import net.brcdev.shopgui.ShopGuiPlusApi;
import net.brcdev.shopgui.event.ShopGUIPlusPostEnableEvent;
import net.brcdev.shopgui.exception.api.ExternalSpawnerProviderNameConflictException;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ShopGUIPlusHook implements Listener {

  private MySpawnersPlugin mySpawnersPlugin;

  public ShopGUIPlusHook(MySpawnersPlugin mySpawnersPlugin) {
    this.mySpawnersPlugin = mySpawnersPlugin;
  }

  @EventHandler
  public void onShopGUIPlusPostEnable(ShopGUIPlusPostEnableEvent event) {
    try {
      ShopGuiPlusApi.registerSpawnerProvider(mySpawnersPlugin.getSpawnerProvider());
    } catch (ExternalSpawnerProviderNameConflictException e) {
      mySpawnersPlugin.getLogger().warning("Failed to hook into ShopGUI+: " + e.getMessage());
    }
    mySpawnersPlugin.getLogger().info("Registered spawner provider in ShopGUI+!");
  }
}

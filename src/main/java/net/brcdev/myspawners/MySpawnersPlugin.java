package net.brcdev.myspawners;

import net.brcdev.myspawners.spawner.MySpawnerProvider;
import net.brcdev.shopgui.ShopGuiPlusApi;
import net.brcdev.shopgui.exception.api.ExternalSpawnerProviderNameConflictException;
import org.bukkit.plugin.java.JavaPlugin;

public class MySpawnersPlugin extends JavaPlugin {

  private MySpawnerProvider spawnerProvider;

  @Override
  public void onEnable() {
    this.spawnerProvider = new MySpawnerProvider();

    hookIntoShopGui();
  }

  private void hookIntoShopGui() {
    try {
      ShopGuiPlusApi.registerSpawnerProvider(spawnerProvider);
    } catch (ExternalSpawnerProviderNameConflictException e) {
      this.getLogger().warning("Failed to hook into ShopGUI+: " + e.getMessage());
    }
  }
}

package net.brcdev.myspawners;

import net.brcdev.myspawners.hook.ShopGUIPlusHook;
import net.brcdev.myspawners.spawner.MySpawnerProvider;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class MySpawnersPlugin extends JavaPlugin {

  private MySpawnerProvider spawnerProvider;
  private ShopGUIPlusHook shopGUIPlusHook;

  @Override
  public void onEnable() {
    this.spawnerProvider = new MySpawnerProvider();

    hookIntoShopGUIPlus();
  }

  public MySpawnerProvider getSpawnerProvider() {
    return spawnerProvider;
  }

  private void hookIntoShopGUIPlus() {
    if (Bukkit.getPluginManager().getPlugin("ShopGUIPlus") != null) {
      this.shopGUIPlusHook = new ShopGUIPlusHook(this);
      Bukkit.getPluginManager().registerEvents(shopGUIPlusHook, this);

      this.getLogger().info("ShopGUI+ detected.");
    } else {
      this.getLogger().warning("ShopGUI+ not found.");
    }
  }
}

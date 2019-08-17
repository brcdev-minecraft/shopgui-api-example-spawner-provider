package net.brcdev.myspawners.spawner;

import net.brcdev.shopgui.spawner.external.provider.ExternalSpawnerProvider;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MySpawnerProvider implements ExternalSpawnerProvider {
  @Override
  public String getName() {
    return "MySpawners";
  }

  @Override
  public ItemStack getSpawnerItem(EntityType entityType) {
    // This won't actually produce a working spawner in Minecraft 1.14,
    // but it shows where you can apply all the necessary logic (such as NBT etc.)

    ItemStack itemStack = new ItemStack(Material.SPAWNER);
    ItemMeta itemMeta = itemStack.getItemMeta();
    itemMeta.setDisplayName(entityType.name().replace("_", " ") + " SPAWNER");
    itemStack.setItemMeta(itemMeta);

    return itemStack;
  }

  @Override
  public EntityType getSpawnerEntityType(ItemStack itemStack) {
    // Same as above, it's just a very simple example

    if (!itemStack.hasItemMeta()) {
      return getDefaultEntityType();
    }

    ItemMeta itemMeta = itemStack.getItemMeta();

    if (!itemMeta.hasDisplayName() || !itemMeta.getDisplayName().contains(" SPAWNER")) {
      return getDefaultEntityType();
    }

    String displayName = itemMeta.getDisplayName();
    String entityTypeName = displayName.substring(0, displayName.length() - 8);

    EntityType entityType;
    try {
      entityType = EntityType.valueOf(entityTypeName);
    } catch (IllegalArgumentException ex) {
      return getDefaultEntityType();
    }

    return entityType;
  }

  private EntityType getDefaultEntityType() {
    return EntityType.UNKNOWN;
  }
}

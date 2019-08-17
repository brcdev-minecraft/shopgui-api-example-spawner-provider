# MySpawners - Example plugin using ShopGUI+'s API
This repository contains an example Spigot plugin, MySpawners, created with use of [ShopGUI+'s API](https://github.com/brcdev-minecraft/shopgui-api).
It shows how to correctly implement a spawner provider which will be registered in ShopGUI+ and used for spawner items handling. 

## Building
`mvn clean package`

## Using
After you build the artifact using Maven command above, you can drop in the plugin to the `plugins` directory of your server along with regular ShopGUI+ plugin and see how it works.

You can expect this kind of messages during server startup:
```[14:43:26] [Server thread/INFO]: [ShopGUIPlus] Enabling ShopGUIPlus v1.19.9
[14:43:26] [Server thread/INFO]: [ShopGUIPlus] Permissions support enabled.
[14:43:26] [Server thread/INFO]: [ShopGUIPlus] Vault economy support enabled.
[14:43:26] [Server thread/INFO]: [MySpawners] Enabling MySpawners v1.0.0
[14:43:26] [Server thread/INFO]: [ShopGUIPlus] Registered spawners support for MySpawners!
(...)
[14:43:32] [Server thread/INFO]: Done (15.498s)! For help, type "help"
(...)
[14:43:33] [Server thread/INFO]: [ShopGUIPlus] Using MySpawners for spawner support!
[14:43:33] [Server thread/INFO]: [ShopGUIPlus] Loaded 9 main menu items!
[14:43:33] [Server thread/INFO]: [ShopGUIPlus] Loaded 9 shops with total of 164 items!
```

It means that the MySpawners plugin successfully registered its spawner provider in ShopGUI+ and will be used for handling spawner items.

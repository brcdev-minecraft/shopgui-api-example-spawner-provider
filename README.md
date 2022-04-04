# MySpawners - Example plugin using ShopGUI+'s API

This repository contains an example Spigot plugin, MySpawners, created with use
of [ShopGUI+'s API](https://github.com/brcdev-minecraft/shopgui-api). It shows how to correctly implement a spawner
provider which will be registered in ShopGUI+ and used for spawner items handling.

## Building

`./mvnw clean package`

## Using

After you build the artifact using Maven command above, you can drop in the plugin to the `plugins` directory of your
server along with regular ShopGUI+ plugin and see how it works.

You can expect this kind of messages during server startup:

```
[21:30:06] [Server thread/INFO]: [MySpawners] Enabling MySpawners v1.1.0
[21:30:06] [Server thread/INFO]: [MySpawners] ShopGUI+ detected.
...
[21:30:08] [Server thread/INFO]: Done (13.344s)! For help, type "help"
...
[21:30:11] [Server thread/INFO]: [ShopGUIPlus] Registered spawners support for MySpawners.
[21:30:11] [Server thread/INFO]: [MySpawners] Registered spawner provider in ShopGUI+!
...
[21:34:08] [Server thread/INFO]: [ShopGUIPlus] Using MySpawners for spawners support.
```

It means that the MySpawners plugin successfully registered its spawner provider in ShopGUI+ and will be used for
handling spawner items.

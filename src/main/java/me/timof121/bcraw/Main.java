package me.timof121.bcraw;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("bcraw").setExecutor(new bcrawCommand());
    }

    @Override
    public void onDisable() {

    }
}

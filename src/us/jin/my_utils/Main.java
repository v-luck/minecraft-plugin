package us.jin.my_utils;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import us.jin.my_utils.commands.SetHome;

import java.io.File;
import java.io.IOException;

public final class Main extends JavaPlugin {
    //private File customConfigFile;
    //private FileConfiguration customConfig;

    @Override
    public void onEnable() {
        getLogger().info("onEnable has been invoked!!!");

        File customConfigFile = new File(getDataFolder(), "custom.yml");
        this.saveDefaultConfig();
        getCommand("sethome").setExecutor(new SetHome(this));
    }

    @Override
    public void onDisable() {
        getLogger().info("onDisable has been invoked???");
    }

    //public FileConfiguration getCustomConfig() {
    //    customConfigFile = new File(getDataFolder(), "custom.yml");
    //    if (!customConfigFile.exists()) {
    //        customConfigFile.getParentFile().mkdirs();
    //        saveResource("custom.yml", false);
    //    }
    //}
}

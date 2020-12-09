package us.jin.my_utils;

import org.bukkit.plugin.java.JavaPlugin;
import us.jin.my_utils.commands.SetHome;

public final class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("onEnable has been invoked!!!");
        getCommand("sethome").setExecutor(new SetHome(this));
    }

    @Override
    public void onDisable() {
        getLogger().info("onDisable has been invoked???");
    }



}

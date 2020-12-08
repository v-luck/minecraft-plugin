package us.jin.plugin_tools;

import org.bukkit.plugin.java.JavaPlugin;

public final class SetHome extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("onEnable has been invoked!!!");
    }

    @Override
    public void onDisable() {
        getLogger().info("onDisable has been invoked???");
    }


}

package us.jin.plugin_tools;

import org.bukkit.plugin.java.JavaPlugin;
import us.jin.plugin_tools.commands.CreeperCommand;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        new CreeperCommand(this);
    }
}

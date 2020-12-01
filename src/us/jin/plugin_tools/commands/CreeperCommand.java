package us.jin.plugin_tools.commands;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import us.jin.plugin_tools.Main;

public class CreeperCommand implements CommandExecutor {
    private Main plugin;

    public CreeperCommand(Main plugin) {
        this.plugin = plugin;
        plugin.getCommand("creepspawn").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        Location location = p.getLocation();
        World w = p.getWorld();
        for (int i = 0; i < 10; i ++) {
            w.spawnEntity(location, EntityType.CREEPER);
        }
        return false;
    }
}

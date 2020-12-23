package us.jin.my_utils.commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import us.jin.my_utils.Main;

public class SetSkin implements CommandExecutor {
    private Main plugin;

    public SetSkin (Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender playerSender, Command playerCommand, String label, String[] args) {
        if (!(playerSender instanceof Player)) {
            playerSender.sendMessage("This command can only be run by a player");
            return true;
        }
        Player player = (Player) playerSender;
        Location location = player.getLocation();
        player.setBedSpawnLocation(location);
        playerSender.sendMessage("Spawnpoint set!");
        return true;
    }

}

package me.deveroonie.essentialsk.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class God implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof ConsoleCommandSender) {
            sender.sendMessage(ChatColor.RED + "Console cannot run this command.");
            return true;
        } else {
            Player player = (Player) sender;
            if(player.isInvulnerable() == true) {
                player.setInvulnerable(false);
                sender.sendMessage(ChatColor.YELLOW + "You can now take damage");
            } else {

                player.setInvulnerable(true);
                sender.sendMessage(ChatColor.GREEN + "You can no longer take damage");
            }
        }
        return true;
    }
}

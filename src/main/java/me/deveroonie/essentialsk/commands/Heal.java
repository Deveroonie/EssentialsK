package me.deveroonie.essentialsk.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class Heal implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof ConsoleCommandSender) {
            sender.sendMessage(ChatColor.RED + "Console cannot run this command.");
            return true;
        } else {
            Player player = (Player) sender;
            player.setHealth(20);
            sender.sendMessage(ChatColor.GREEN + "You are now at full health");
        }
        return true;
    }
}

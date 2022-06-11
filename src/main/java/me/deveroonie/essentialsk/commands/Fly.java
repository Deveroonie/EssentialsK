package me.deveroonie.essentialsk.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof ConsoleCommandSender) {
            sender.sendMessage(ChatColor.RED + "Console cannot run this command.");
            return true;
        } else {

            Player player = (Player) sender;
            if (player.getAllowFlight() == false) { // if they cant fly
                player.setAllowFlight(true); //let them
                sender.sendMessage(ChatColor.GREEN + "You can now fly.");
                return true;
            } else { // if they can fly
                player.setAllowFlight(false); //now they cant
                sender.sendMessage(ChatColor.YELLOW + "You can no longer fly, I hope you are on the ground.");
                return true;
            }
        }
    }
}

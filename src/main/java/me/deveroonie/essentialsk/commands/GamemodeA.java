package me.deveroonie.essentialsk.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class GamemodeA implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String alias, String[] args) {
        if (sender instanceof ConsoleCommandSender) {
            sender.sendMessage(ChatColor.RED + "Console cannot run this command.");
            return true;
        } else {
            Player player = (Player) sender;
            try {
                player.setGameMode(GameMode.ADVENTURE);
                sender.sendMessage(ChatColor.GREEN + "You have set to gamemode adventure!");
            } catch(Error err) {
                sender.sendMessage(ChatColor.RED + "An error occurred" + err);
            }

        }
        return true;
    }
}

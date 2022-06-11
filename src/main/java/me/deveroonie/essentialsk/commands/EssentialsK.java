package me.deveroonie.essentialsk.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class EssentialsK implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(ChatColor.GREEN + "_--------| " + ChatColor.GOLD + "EssentialsK" + ChatColor.GREEN + " |--------_");
        sender.sendMessage(ChatColor.GREEN + "Running version " + ChatColor.GOLD + Bukkit.getServer().getPluginManager().getPlugin("EssentialsK").getDescription().getVersion());
        sender.sendMessage(ChatColor.GREEN + "On server version " + ChatColor.GOLD + Bukkit.getBukkitVersion());
        sender.sendMessage(ChatColor.GREEN + "Made by " + ChatColor.DARK_PURPLE + "Deveroonie (1Deveroonie#9907)");
        return true;
    }
}

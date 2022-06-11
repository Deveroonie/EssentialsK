package me.deveroonie.essentialsk.commands;

import com.google.common.base.Joiner;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.ChatColor;
public class Broadcast implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String alias, String[] args) {
        if (args.length == 0) {
          sender.sendMessage(ChatColor.RED + "Please specify a message to broadcast");
          return false;
        } else {
            Bukkit.broadcastMessage(ChatColor.GOLD + "[" + ChatColor.RED + "BROADCAST" + ChatColor.GOLD + "] " + ChatColor.WHITE + Joiner.on(" ").join(args));
            return true;
        }
    }
}

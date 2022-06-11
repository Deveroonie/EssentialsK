package me.deveroonie.essentialsk;

import com.jeff_media.updatechecker.UpdateCheckSource;
import me.deveroonie.essentialsk.commands.*;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;
import com.jeff_media.updatechecker.UpdateChecker;
import com.jeff_media.updatechecker.UserAgentBuilder;
public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        //REGISTER COMMANDS
        getCommand("broadcast").setExecutor(new Broadcast());
        getCommand("feed").setExecutor(new Feed());
        getCommand("starve").setExecutor(new Starve());
        getCommand("fly").setExecutor(new Fly());
        getCommand("heal").setExecutor(new Heal());
        getCommand("god").setExecutor(new God());
        getCommand("essentialsk").setExecutor(new EssentialsK());
        //GAMEMODES
        getCommand("gamemodec").setExecutor(new GamemodeC());
        getCommand("gamemodea").setExecutor(new GamemodeA());
        getCommand("gamemodes").setExecutor(new GamemodeS());
        getCommand("gamemodesp").setExecutor(new GamemodeSP());


        getLogger().info(ChatColor.GREEN + "/----------------/");
        getLogger().info(ChatColor.GOLD + "Enabling " + ChatColor.BOLD + "EssentialsK");
        getLogger().info(ChatColor.GOLD + "By " + ChatColor.BOLD + "Deveroonie");
        getLogger().info(ChatColor.GREEN + "/----------------/");

        //UPDATE CHECKER
        new UpdateChecker(this, UpdateCheckSource.SPIGOT, "102473") // A link to a URL that contains the latest version as String
                .setDownloadLink("https://www.spigotmc.org/resources/essentialsk.102473/") // You can either use a custom URL or the Spigot Resource ID
                .setChangelogLink("https://www.spigotmc.org/resources/essentialsk.102473/") // Same as for the Download link: URL or Spigot Resource ID
                .setNotifyOpsOnJoin(true) // Notify OPs on Join when a new version is found (default)
                .setNotifyByPermissionOnJoin("essentialsk.getupdatenotifs") // Also notify people on join with this permission
                .setUserAgent(new UserAgentBuilder().addPluginNameAndVersion())
                .checkEveryXHours(0.5) // Check every 30 minutes
                .checkNow(); // And check right now
    }

    @Override
    public void onDisable() {
        getLogger().info(ChatColor.RED + "/----------------/");
        getLogger().info(ChatColor.GOLD + "Disabling " + ChatColor.BOLD + "EssentialsK");
        getLogger().info(ChatColor.GOLD + "By " + ChatColor.BOLD + "Deveroonie");
        getLogger().info(ChatColor.RED + "/----------------/");
    }

}

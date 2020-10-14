package me.thecoolcat92.utilityplugin;

import me.thecoolcat92.utilityplugin.events.PlayerJoin;
import me.thecoolcat92.utilityplugin.events.PlayerLeave;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class UtilityPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("UtilityPlugin started!");
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new PlayerLeave(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("UtilityPlugin stopped!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equals("die")){
            if(sender instanceof Player) {
                Player player = (Player) sender;
                player.sendMessage("haha u ded");
                player.setHealth(0);
            }else{
                System.out.println("You must be a player to run this command.");
            }
        }

        if(command.getName().equals("rickroll")){
            if(sender instanceof Player) {
                Player player = (Player) sender;
                player.sendMessage(ChatColor.AQUA + "Never gonna give you up");
                player.sendMessage(ChatColor.AQUA + "Never gonna let you down");
                player.sendMessage(ChatColor.AQUA +"Never gonna run around and desert you");
                player.sendMessage(ChatColor.AQUA +"Never gonna make you cry");
                player.sendMessage(ChatColor.AQUA +"Never gonna say goodbye");
                player.sendMessage(ChatColor.AQUA +"Never gonna tell a lie and hurt you");
                player.setHealth(0);
            }else{
                System.out.println("You must be a player to run this command.");
            }
        }
        return false;
    }
}

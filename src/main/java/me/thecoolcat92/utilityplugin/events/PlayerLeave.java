package me.thecoolcat92.utilityplugin.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerLeave implements Listener {

    @EventHandler
    void onPlayerJoin(PlayerQuitEvent e){
        Player player = e.getPlayer();
        e.setQuitMessage(ChatColor.DARK_AQUA + "- " + ChatColor.DARK_BLUE + player.getDisplayName());
    }
}

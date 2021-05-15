package me.augusto.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class Event implements Listener {
	
	
	@EventHandler
	public void onMotd(ServerListPingEvent e) {
		
		String motd = " §6§lSimpleMotd";
		
		e.setMotd(motd);
		
	}
	
	
	
	
}

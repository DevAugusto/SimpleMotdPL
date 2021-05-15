package me.augusto;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.augusto.listener.Event;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(new Event(), this );
		
		Bukkit.getConsoleSender().sendMessage("§m-------------------------------");
		Bukkit.getConsoleSender().sendMessage("");
		Bukkit.getConsoleSender().sendMessage("");
		Bukkit.getConsoleSender().sendMessage("§aPlugin iniciado com sucesso!");
		Bukkit.getConsoleSender().sendMessage("");
		Bukkit.getConsoleSender().sendMessage("");
		Bukkit.getConsoleSender().sendMessage("§m-------------------------------");
		
	}

}

package com.tenjava.entries.nate22233.t3.Events;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class RandomTeleportation {
	
	public void callEvent(){
		Player[] playersOnline = Bukkit.getServer().getOnlinePlayers();
		Bukkit.getServer().broadcastMessage("§7[§bRandomEvents§7] §8Everyone on the server has been teleported to a random location in their world!");
		for (Player p: playersOnline){
			Random rx = new Random();
			int x = rx.nextInt(100000);
			Random rz = new Random();
			int z = rz.nextInt(100000);
			int y = p.getWorld().getHighestBlockYAt(x,z);
			p.teleport(new Location(Bukkit.getWorld(p.getWorld().getName()),x, y + 5, z));
		}
	}
	}

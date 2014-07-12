package com.tenjava.entries.nate22233.t3.Events;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class MineralRain {
	
	@SuppressWarnings("deprecation")
	public void callEvent(){
		Bukkit.getServer().broadcastMessage("§7[§bRandomEvents§7] §8Mineral Rain is occuring! Hurry get outside and pick up the goods!");
		for (Player p : Bukkit.getServer().getOnlinePlayers()){
			for (int x = 0; x<20; x++){
				for (int z = 0; z<20; z++){
			Random ritem = new Random();
			int itemid = 0;
			int i = ritem.nextInt(3);
			if (i == 0){
				itemid = 265;
			}
			if (i == 1){
				itemid = 266;
			}
			if (i == 2){
				itemid = 263;
			}
			p.getWorld().dropItem(new Location(p.getWorld(), p.getLocation().getX() + x, 256, p.getLocation().getZ() + z), new ItemStack(itemid));
		}
			}
		}
	}

}

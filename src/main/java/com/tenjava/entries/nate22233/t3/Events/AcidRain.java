package com.tenjava.entries.nate22233.t3.Events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class AcidRain {

	public void callEvent(Plugin pl){
		Bukkit.getWorld("world").setStorm(true);
		Bukkit.getServer().broadcastMessage("§7[§bRandomEvents§7] §8It has started to rain acid! Take cover now!");
		for (final Player p : pl.getServer().getOnlinePlayers()){
			final int id = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(pl, new Runnable(){
				public void run(){
						if (p.getLocation().getBlockY() >= p.getWorld().getHighestBlockYAt(p.getLocation().getBlockX(), p.getLocation().getBlockZ())){
								p.removePotionEffect(PotionEffectType.POISON);
								p.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 20, 4));
					}
						else {
							p.removePotionEffect(PotionEffectType.POISON);
						}
				}
			}, 0, 1);
			Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(pl, new Runnable(){
				public void run(){
					Bukkit.getWorld("world").setStorm(false);
					Bukkit.getServer().getScheduler().cancelTask(id);
				}
			}, 30 * 20);
		}
	}
}

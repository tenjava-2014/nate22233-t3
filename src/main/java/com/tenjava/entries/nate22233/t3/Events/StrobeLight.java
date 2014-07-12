package com.tenjava.entries.nate22233.t3.Events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class StrobeLight {
	
	public void callEvent(Plugin pl){
		Bukkit.getServer().broadcastMessage("§7[§bRandomEvents§7] §8Dance Dance Dance! Strobe Light Activated!");
		for (final Player p : pl.getServer().getOnlinePlayers()){
			final int id = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(pl, new Runnable(){
				public void run(){
					p.removePotionEffect(PotionEffectType.NIGHT_VISION);
					p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 20, 0));
				}
			}, 0, 18);
			Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(pl, new Runnable(){
				public void run(){
					Bukkit.getServer().getScheduler().cancelTask(id);
				}
			}, 20 * 30);
		}
	}

}

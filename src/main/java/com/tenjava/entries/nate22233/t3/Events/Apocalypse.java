package com.tenjava.entries.nate22233.t3.Events;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.CreatureType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.plugin.Plugin;

@SuppressWarnings("deprecation")
public class Apocalypse {
	
	final ArrayList<Zombie> zam = new ArrayList<Zombie>();
	
	public void callEvent(Plugin plugin){
		for (Player p : Bukkit.getServer().getOnlinePlayers()){
			Bukkit.getServer().broadcastMessage("§7[§bRandomEvents§7] §8An apocalypse has started if you were unlucky enough to be caught with one they will despawn after 60 seconds if you do not manage to kill them.");
			Random r = new Random();
			int i = r.nextInt(2);
			if (i == 0){
				for (int x = 0; x < 4; x++){
					for (int z = 0; z < 4; z++){
						CreatureType type = null;
						type = CreatureType.ZOMBIE;
						final Zombie c = (Zombie) Bukkit.getWorld(p.getWorld().getName()).spawnCreature(new Location(p.getWorld(), p.getLocation().getX() + x, p.getWorld().getHighestBlockYAt(x, z),  p.getLocation().getZ() + z), type);
						zam.add(c);
						final Zombie c2 = (Zombie) Bukkit.getWorld(p.getWorld().getName()).spawnCreature(new Location(p.getWorld(), p.getLocation().getX() - x, p.getWorld().getHighestBlockYAt(x, z),  p.getLocation().getZ() - z), type);
						zam.add(c2);
						final Zombie c3 = (Zombie) Bukkit.getWorld(p.getWorld().getName()).spawnCreature(new Location(p.getWorld(), p.getLocation().getX() + x, p.getWorld().getHighestBlockYAt(x, z),  p.getLocation().getZ() - z), type);
						zam.add(c3);
						final Zombie c4 = (Zombie) Bukkit.getWorld(p.getWorld().getName()).spawnCreature(new Location(p.getWorld(), p.getLocation().getX() - x, p.getWorld().getHighestBlockYAt(x, z),  p.getLocation().getZ() + z), type);
						zam.add(c4);
						Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){
							public void run(){
								try {
								c.remove();
								c2.remove();
								c3.remove();
								c4.remove();
								}
								catch (Exception e){
									System.out.println("Unable to despawn zombies!");
								}
							}
						}, 20 * 60);
					}
				}
			}
		}
	}

}

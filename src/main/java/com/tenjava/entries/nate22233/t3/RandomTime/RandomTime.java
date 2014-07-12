package com.tenjava.entries.nate22233.t3.RandomTime;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

import com.tenjava.entries.nate22233.t3.TenJava;
import com.tenjava.entries.nate22233.t3.Events.AcidRain;
import com.tenjava.entries.nate22233.t3.Events.Apocalypse;
import com.tenjava.entries.nate22233.t3.Events.MineralRain;
import com.tenjava.entries.nate22233.t3.Events.RandomTeleportation;
import com.tenjava.entries.nate22233.t3.Events.StrobeLight;

public class RandomTime {
	
	private TenJava plugin;
	
	public RandomTime(TenJava instance){
		plugin = instance;
	}
	int i = 0;
	public void runCheck(final Plugin p){
		Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(p, new Runnable(){
			public void run(){
				if (p.getServer().getWorld("world").getTime() == 0){
					Random r = new Random();
					i = r.nextInt(24000);
					System.out.println("The random event for the day will start at " + i + " ticks.");
					return;
					}
				if (p.getServer().getWorld("world").getTime() == i){
					Random s = new Random();
					int w = s.nextInt(5);
					if (w == 0){
						runEvent("RandomTeleportation");
						i = 0;
					}
					if (w == 1){
						runEvent("MineralRain");
						i = 0;
					}
					if (w == 2){
						runEvent("Apocalypse");
						i = 0;
					}
					if (w == 3){
						runEvent("AcidRain");
						i = 0;
					}
					if (w == 4){
						runEvent("StrobLight");
						i = 0;
					}
				}
				else return;
			}
		}, 0, 1);
	}
	
	public void runEvent(String eventName){
		if (eventName.equalsIgnoreCase("randomteleportation")){
			new RandomTeleportation().callEvent();
		}
		if (eventName.equalsIgnoreCase("Apocalypse")){
			new Apocalypse().callEvent(plugin);
		}
		if (eventName.equalsIgnoreCase("MineralRain")){
			new MineralRain().callEvent();
		}
		if (eventName.equalsIgnoreCase("acidrain")){
			new AcidRain().callEvent(plugin);
		}
		if (eventName.equalsIgnoreCase("strobelight")){
			new StrobeLight().callEvent(plugin);
		}

}
}

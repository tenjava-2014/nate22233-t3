package com.tenjava.entries.nate22233.t3.Command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.tenjava.entries.nate22233.t3.TenJava;
import com.tenjava.entries.nate22233.t3.Events.AcidRain;
import com.tenjava.entries.nate22233.t3.Events.Apocalypse;
import com.tenjava.entries.nate22233.t3.Events.MineralRain;
import com.tenjava.entries.nate22233.t3.Events.RandomTeleportation;
import com.tenjava.entries.nate22233.t3.Events.StrobeLight;

public class EventCommand implements CommandExecutor {

	private TenJava plugin;
	
	public EventCommand(TenJava instance){
		plugin = instance;
	}
	
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		if (!(sender instanceof Player)){
			sender.sendMessage("§cOnly players can run this command!");
			return true;
		}
		Player p = (Player) sender;
		if (command.getName().equalsIgnoreCase("event")){
			if (!p.hasPermission("randomevents.command")){
				p.sendMessage("§cYou do not have permission to this command!");
				return true;
			}
			if (args.length != 1){
				p.sendMessage("§cIncorrect Number of Arguments!");
				p.sendMessage("§cUse: /event <eventName>");
				p.sendMessage("§cType '/event help' for more info.");
				return true;
			}
			if (args.length == 1){
				if (args[0].equalsIgnoreCase("help")){
					p.sendMessage("§6§lRandomEvents:");
					p.sendMessage("§eUsage: /event <eventName>");
					p.sendMessage("§eEvents:");
					p.sendMessage("§7- RandomTeleportation");
					p.sendMessage("§7- Apocalypse");
					p.sendMessage("§7- MineralRain");
					p.sendMessage("§7- AcidRain");
					p.sendMessage("§7- StrobeLight");
					return true;
				}
				if (args[0].equalsIgnoreCase("randomteleportation")){
					new RandomTeleportation().callEvent();
					return true;
				}
				if (args[0].equalsIgnoreCase("apocalypse")){
					new Apocalypse().callEvent(plugin);
					return true;
				}
				if (args[0].equalsIgnoreCase("mineralrain")){
					new MineralRain().callEvent();
					return true;
				}
				if (args[0].equalsIgnoreCase("acidrain")){
					new AcidRain().callEvent(plugin);
					return true;
				}
				if (args[0].equalsIgnoreCase("strobelight")){
					new StrobeLight().callEvent(plugin);
					return true;
				}
				else {
					p.sendMessage("§cInvalid event!");
					p.sendMessage("§cDo '/event help' to see a list of events.");
					return true;
				}
			}
		}
		return true;
	}
	
	
}

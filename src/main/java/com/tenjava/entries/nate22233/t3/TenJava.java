package com.tenjava.entries.nate22233.t3;

import org.bukkit.plugin.java.JavaPlugin;

import com.tenjava.entries.nate22233.t3.Command.EventCommand;
import com.tenjava.entries.nate22233.t3.RandomTime.RandomTime;

public class TenJava extends JavaPlugin {
	
	public void onEnable(){
		getCommand("event").setExecutor(new EventCommand(this));
		new RandomTime(this).runCheck(this);
	}

}

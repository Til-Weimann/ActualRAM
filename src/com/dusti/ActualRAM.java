package com.dusti;

import com.dusti.commands.ActualRAMCommands;
import org.bukkit.plugin.java.JavaPlugin;

public class ActualRAM extends JavaPlugin {

    @Override
    public void onEnable() {
        ActualRAMCommands commands = new ActualRAMCommands();
        getCommand("showram").setExecutor(commands);
        System.out.println("ActualRAM enabled");
    }

    @Override
    public void onDisable() {
        System.out.println("ActualRAM disabled");
    }

}

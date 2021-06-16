package com.dusti.commands;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ActualRAMCommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (command.getName().equalsIgnoreCase("showram")) {
            try {
                Runtime r = Runtime.getRuntime();
                float usedMemory = (r.totalMemory() - r.freeMemory()) / 1048576F;
                int usedMemoryPercentage = (int) ((100 * usedMemory) / (r.maxMemory() / 1048576));
                commandSender.sendMessage(ChatColor.DARK_GREEN + "[ActualRAM] §aCurrent RAM Usage: §f" + (int) usedMemory + "§a/§f" + (r.totalMemory() / 1048576) + "§a/§f" + (r.maxMemory() / 1048576) + "§aMB (§f" + usedMemoryPercentage + "§a%)");
            } catch (IllegalArgumentException e) {
                commandSender.sendMessage(ChatColor.RED + "[ActualRAM] §cAn error occurred while executing this command.");
            }
        }
        return true;
    }
}

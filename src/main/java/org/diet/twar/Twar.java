package org.diet.twar;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.diet.twar.utils.TwarLogger;

import static java.util.logging.Level.*;
import static org.diet.twar.utils.TwarLogger.log;


public final class Twar extends JavaPlugin {

    @Override
    public void onEnable() {
        TwarLogger.initialize(this);
        log(INFO, ChatColor.AQUA + "twar " + ChatColor.GOLD + "v" + getDescription().getVersion() + ChatColor.RESET + " started!");
    }

    @Override
    public void onDisable() {
        log(INFO, ChatColor.AQUA + "twar " + ChatColor.GOLD + "v" + getDescription().getVersion() + ChatColor.RESET + " stopped!");
    }
}

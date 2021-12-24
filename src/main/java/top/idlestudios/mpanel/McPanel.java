package top.idlestudios.mpanel;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class McPanel extends JavaPlugin {
    // Public variables
    public FileConfiguration config = null;
    public String McPanel_API_version = null;

    @Override
    public void onLoad() {
        saveDefaultConfig();
        System.out.println("McsPanel Loaded");
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        // Get config
        FileConfiguration config = getConfig();
        String McPanel_API_version = config.getString("API-version");

        // Load completed
        System.out.println("McsPanel load completed.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        saveConfig();
        System.out.println("McPanel disabled");
    }
}

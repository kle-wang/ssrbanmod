package cn.ikaile;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ssrbanmod extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(new event(),this);
        this.getLogger().info("[ssrbanmod]加载完毕！");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        this.getLogger().info("[ssrbanmod]卸载完毕！");
    }
}

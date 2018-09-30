package com.miclesworkshop.nophantoms;

import com.destroystokyo.paper.event.entity.PhantomPreSpawnEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoPhantoms extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void on(PhantomPreSpawnEvent event) {
        event.setCancelled(true);
    }
}

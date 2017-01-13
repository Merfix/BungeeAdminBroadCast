package dedfais.merfix.bungeeabc;

import dedfais.merfix.bungeeabc.admin.BCAdmin;
import dedfais.merfix.bungeeabc.moder.BCModer;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.PrintStream;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.api.plugin.PluginManager;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.TabExecutor;

public class Main
extends Plugin {
    
    public void onDisable() {
        System.out.println("[BungeeABC] Плагин отключён");
    }

    public void onEnable() {
        this.registerCommands();
        System.out.println("[BungeeABC] Плагин включён");
    }

    private void registerCommands() {
        ProxyServer.getInstance().getPluginManager().registerCommand((Plugin)this, (Command)new BCAdmin("bcadmin"));
        ProxyServer.getInstance().getPluginManager().registerCommand((Plugin)this, (Command)new BCModer("bcmoder"));
    }
}


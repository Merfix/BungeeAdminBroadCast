package dedfais.merfix.bungeeabc.moder;

import java.util.ArrayList;
import java.util.Iterator;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.TabExecutor;

public class BCModer
extends Command {
    public BCModer(String name) {
        super(name);
    }

    public void execute(CommandSender sender, String[] args) {
        ProxiedPlayer pp;
        if (sender instanceof ProxiedPlayer && (pp = (ProxiedPlayer)sender).hasPermission("bungeeabc.moder")) {
            if (pp.hasPermission("bungeeabc.moder")) {
                if (args.length > 0) {
                    ProxiedPlayer p = (ProxiedPlayer)sender;
                    String message = "";
                    int i = 0;
                    while (i < args.length) {
                        message = String.valueOf(message) + args[i] + " ";
                        ++i;
                    }
                    message = ChatColor.translateAlternateColorCodes((char)'&', (String)message);
                    ProxyServer.getInstance().broadcast("§7[§9Moder§7] §f" + sender.getName() + " >> " + message);
                    Iterator var11 = p.getServer().getInfo().getPlayers().iterator();
                } else {
                    pp.sendMessage("§cWrong number of arguments try /bcmoder [message]");
                }
            } else {
                sender.sendMessage("§cThe command is not executed through the console");
            }
        }
    }
}


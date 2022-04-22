package me.timof121.bcraw;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class bcrawCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        String originalmsg = "";
        for (String arg : args) {
            originalmsg += arg + " ";
        }
        String parsedmessage = originalmsg.replaceAll("&","§");
        if (args.length == 0) {
            sender.sendMessage("§c/bcraw <message>");
        }
        else if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission("bcraw.use")) {
                Bukkit.broadcastMessage(parsedmessage);
            }
        }
        else if (sender instanceof ConsoleCommandSender) {
            Bukkit.broadcastMessage(parsedmessage);
        }
        return true;
    }
}

package com.r3creat3;
 
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
 
 
public class CommandExec extends JavaPlugin implements Listener{
    public void onEnable() {
        getLogger().info("PotionCommand V0.1 has been enabled!");
    }
    public void onDisable() {
        getLogger().info("PotionCommand V0.1 has been disabled!");
    }
    @SuppressWarnings("deprecation")
 public boolean onCommand(
            CommandSender sender,
            Command cmd,
            String commandLabel,
            String[] args){
        int duration = Integer.parseInt(args[3])*20;
        int amplifier = Integer.parseInt(args[2]);
        Player player = (Player)sender;
        Player target = player.getServer().getPlayer(args[0]);
        if(args.length == 4) {
        if(cmd.getName().equalsIgnoreCase("potion")) {
            sender.sendMessage("[RCpotions]");
        	if (args.length > 4) {
                sender.sendMessage(ChatColor.RED + "Invalid usage. Try using /potion <player> <effect> <strength> <time>");
                return false;
             } 
             if (args.length < 4) {
                sender.sendMessage(ChatColor.RED + "Invalid usage. Try using /potion <player> <effect> <strength> <time>");
                return false;
             }
     }
            if(args[1].equalsIgnoreCase("fireresistance")){
                            target.addPotionEffect(new PotionEffect(
                                    PotionEffectType.FIRE_RESISTANCE,
                                    duration,
                                    amplifier));
                            sender.sendMessage( args[0] + " has recieved potion and it's effects!");
                      target.sendMessage(ChatColor.GOLD + "You can feel like you can walk through fire!");
                        return false;
                    }
            if(args[1].equalsIgnoreCase("HARM")) {
                            target.addPotionEffect(new PotionEffect(
                                    PotionEffectType.HARM,
                                    duration,
                                    amplifier));
                            sender.sendMessage( args[0] + " has recieved potion and it's effects!");
                      target.sendMessage(ChatColor.RED + "You have been damaged!");
                        return false;
                    }
            if(args[1].equalsIgnoreCase("HEAL")) {
                            target.addPotionEffect(new PotionEffect(
                                    PotionEffectType.HEAL,
                                    duration,
                                    amplifier));
                            sender.sendMessage( args[0] + " has recieved potion and it's effects!");
                            target.sendMessage(ChatColor.LIGHT_PURPLE + "You regain some health!");
                        return false;
                    }
            if(args[1].equalsIgnoreCase("POISON")) {
                            target.addPotionEffect(new PotionEffect(
                                    PotionEffectType.POISON,
                                    duration,
                                    amplifier));
                            sender.sendMessage( args[0] + " has recieved potion and it's effects!");
                            target.sendMessage(ChatColor.GREEN + "You have been poisoned!");
                        return false;
                    }
            if(args[1].equalsIgnoreCase("SPEED")) {
                            target.addPotionEffect(new PotionEffect(
                                    PotionEffectType.SPEED,
                                    duration,
                                    amplifier));
                            sender.sendMessage( args[0] + " has recieved potion and it's effects!");
                            target.sendMessage(ChatColor.DARK_BLUE + "Your running ability improves drastically!");
                        return false;
                    }
            if(args[1].equalsIgnoreCase("CONFUSION")) {
                target.addPotionEffect(new PotionEffect(
                        PotionEffectType.CONFUSION,
                        duration,
                        amplifier));
                sender.sendMessage( args[0] + " has recieved potion and it's effects!");
                target.sendMessage(ChatColor.DARK_GREEN + "You are now feeling nauseous!");
            return false;
        }
            if(args[1].equalsIgnoreCase("BLINDNESS")) {
                target.addPotionEffect(new PotionEffect(
                        PotionEffectType.BLINDNESS,
                        duration,
                        amplifier));
                sender.sendMessage( args[0] + " has recieved potion and it's effects!");
                target.sendMessage(ChatColor.BLACK + "Your line of sight decreases dramatically!");
            return false;
        }
            if(args[1].equalsIgnoreCase("HASTE")) {
                target.addPotionEffect(new PotionEffect(
                        PotionEffectType.FAST_DIGGING,
                        duration,
                        amplifier));
                sender.sendMessage( args[0] + " has recieved potion and it's effects!");
                target.sendMessage(ChatColor.YELLOW + "Your mining speeds improve dramatically!");
            return false;
        }
            if(args[1].equalsIgnoreCase("RESISTANCE")) {
                target.addPotionEffect(new PotionEffect(
                        PotionEffectType.DAMAGE_RESISTANCE,
                        duration,
                        amplifier));
                sender.sendMessage( args[0] + " has recieved potion and it's effects!");
                target.sendMessage(ChatColor.GRAY + "You start to feel more resistant!");
            return false;
        }
            if(args[1].equalsIgnoreCase("SLOWMINE")) {
                target.addPotionEffect(new PotionEffect(
                        PotionEffectType.SLOW_DIGGING,
                        duration,
                        amplifier));
                sender.sendMessage( args[0] + " has recieved potion and it's effects!");
                target.sendMessage(ChatColor.DARK_GRAY + "Your mining speed decreases dramatically!");
            return false;
        }
            if(args[1].equalsIgnoreCase("STRENGTH")) {
                 target.addPotionEffect(new PotionEffect(
                        PotionEffectType.INCREASE_DAMAGE,
                        duration,
                        amplifier));
                 sender.sendMessage( args[0] + " has recieved potion and it's effects!");
                target.sendMessage(ChatColor.DARK_RED + "You start to grow strong!");
            return false;
        }
            if(args[1].equalsIgnoreCase("WATERMINE")) {
                target.addPotionEffect(new PotionEffect(
                        PotionEffectType.WATER_BREATHING,
                        duration,
                        amplifier));
                sender.sendMessage( args[0] + " has recieved potion and it's effects!");
                target.sendMessage(ChatColor.AQUA + "You are able to mine quicker and stay underwater longer!");
            return false;
        }
            if(args[1].equalsIgnoreCase("REGEN")) {
                target.addPotionEffect(new PotionEffect(
                        PotionEffectType.REGENERATION,
                        duration,
                        amplifier));
                sender.sendMessage( args[0] + " has recieved potion and it's effects!");
                target.sendMessage(ChatColor.DARK_PURPLE + "Your health starts to regenerate!");
            return false;
            }
            if(args[1].equalsIgnoreCase("HUNGER")) {
                target.addPotionEffect(new PotionEffect(
                        PotionEffectType.HUNGER,
                        duration,
                        amplifier));
                sender.sendMessage( args[0] + " has recieved potion and it's effects!");
                target.sendMessage(ChatColor.DARK_RED + "You start to go hungry!");
            return false;
            }
            if(args[1].equalsIgnoreCase("NIGHTVISION")) {
                target.addPotionEffect(new PotionEffect(
                        PotionEffectType.NIGHT_VISION,
                        duration,
                        amplifier));
                sender.sendMessage( args[0] + " has recieved potion and it's effects!");
                target.sendMessage(ChatColor.GREEN + "You can now see in the dark!!");
            return false;
            } 
            if(args[1].equalsIgnoreCase("INVISIBLE")) {
                target.addPotionEffect(new PotionEffect(
                        PotionEffectType.INVISIBILITY,
                        duration,
                        amplifier));
                sender.sendMessage( args[0] + " has recieved potion and it's effects!");
                target.sendMessage(ChatColor.DARK_PURPLE + "Your health starts to regenerate!");
            return false;
            }   
            if(args[1].equalsIgnoreCase("JUMP")) {
                target.addPotionEffect(new PotionEffect(
                        PotionEffectType.JUMP,
                        duration,
                        amplifier));
                sender.sendMessage( args[0] + " has recieved potion and it's effects!");
                target.sendMessage(ChatColor.DARK_BLUE + "You can jump higher now!");
            return false;
            } 
        	if (args.length > 4) {
                sender.sendMessage(ChatColor.RED + "Invalid usage. Try using /potion <player> <effect> <strength> <time>");
                return false;
             } 
             if (args.length < 4) {
                sender.sendMessage(ChatColor.RED + "Invalid usage. Try using /potion <player> <effect> <strength> <time>");
                return false;
             }
            if(args[1].equalsIgnoreCase("SLOW")) {
                target.addPotionEffect(new PotionEffect(
                        PotionEffectType.SLOW,
                        duration,
                        amplifier));
                sender.sendMessage( args[0] + " has recieved potion and it's effects!");
                target.sendMessage(ChatColor.DARK_PURPLE + "Your moving has been slowed!");
            return false;
            }   if (player == null) {
                sender.sendMessage(ChatColor.RED + args[0] + " is not online!");
        }
        return true;
        }
		return false;
}
}
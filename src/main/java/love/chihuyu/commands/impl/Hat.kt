package love.chihuyu.commands.impl

import love.chihuyu.commands.Command
import net.md_5.bungee.api.ChatColor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

object Hat : Command("hat") {

    override fun onCommand(sender: CommandSender, label: String, args: Array<out String>) {
        if (sender !is Player) return

        val helmet = sender.inventory.helmet
        val hand = sender.inventory.itemInMainHand
        sender.inventory.helmet = hand
        sender.inventory.itemInMainHand.amount = 0
        if (helmet != null) sender.inventory.addItem(helmet)
        sender.sendMessage("Hat!")
        return
    }

    override fun onTabComplete(sender: CommandSender, alias: String, args: Array<out String>): List<String> {
        return mutableListOf()
    }
}
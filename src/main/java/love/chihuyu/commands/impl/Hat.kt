package love.chihuyu.commands.impl

import love.chihuyu.commands.Command
import org.bukkit.ChatColor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

object Hat : Command("hat") {
    override fun onCommand(sender: CommandSender, label: String, args: Array<out String>) {
        if (sender !is Player || sender.hasPermission("hatblock.cmd.hat")) return

        val helmet = sender.inventory.helmet
        if (helmet != null) sender.inventory.addItem(helmet)
        sender.inventory.helmet = sender.inventory.itemInMainHand
        sender.sendMessage("" +
                "${ChatColor.getByChar("#ffafbd")}§l§n§oH" +
                "${ChatColor.getByChar("#ffa0b4")}§l§n§oa" +
                "${ChatColor.getByChar("#ffb9aa")}§l§n§ot" +
                "${ChatColor.getByChar("#ffc3a0")}§l§n§o!")
    }

    override fun onTabComplete(sender: CommandSender, alias: String, args: Array<out String>): List<String>? {
        TODO("Not yet implemented")
    }
}
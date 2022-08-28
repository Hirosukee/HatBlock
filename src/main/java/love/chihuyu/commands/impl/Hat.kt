package love.chihuyu.commands.impl

import org.bukkit.ChatColor
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.command.TabCompleter
import org.bukkit.entity.Player

object Hat : CommandExecutor, TabCompleter {

    override fun onCommand(
        sender: CommandSender,
        command: Command,
        commandLabel: String,
        args: Array<out String>
    ): Boolean {
        if (sender !is Player || sender.hasPermission("hatblock.cmd.hat")) return true

        val helmet = sender.inventory.helmet
        if (helmet != null) sender.inventory.addItem(helmet)
        sender.inventory.helmet = sender.inventory.itemInMainHand
        sender.sendMessage("" +
                "${ChatColor.getByChar("#ffafbd")}§l§n§oH" +
                "${ChatColor.getByChar("#ffa0b4")}§l§n§oa" +
                "${ChatColor.getByChar("#ffb9aa")}§l§n§ot" +
                "${ChatColor.getByChar("#ffc3a0")}§l§n§o!")
        return true
    }

    override fun onTabComplete(
        sender: CommandSender,
        command: Command,
        label: String,
        args: Array<out String>,
    ): MutableList<String>? {
        return mutableListOf()
    }
}
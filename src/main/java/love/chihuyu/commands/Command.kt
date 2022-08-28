package love.chihuyu.commands

import love.chihuyu.HatBlock.Companion.plugin
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.command.TabCompleter

abstract class Command(private val name: String) : CommandExecutor, TabCompleter {
    fun register() {
        val command = plugin.getCommand(name) ?: throw IllegalStateException()
        command.setExecutor(this)
        command.tabCompleter = this
    }

    override fun onCommand(sender: CommandSender, command: org.bukkit.command.Command, label: String, args: Array<out String>): Boolean {
        onCommand(sender, label, args)
        return true
    }

    override fun onTabComplete(sender: CommandSender, command: org.bukkit.command.Command, alias: String, args: Array<out String>): List<String>? {
        return onTabComplete(sender, alias, args)
    }

    abstract fun onCommand(sender: CommandSender, label: String, args: Array<out String>)

    abstract fun onTabComplete(sender: CommandSender, alias: String, args: Array<out String>): List<String>?
}
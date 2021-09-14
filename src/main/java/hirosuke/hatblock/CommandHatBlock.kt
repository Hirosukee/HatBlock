package hirosuke.hatblock

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class CommandHatBlock : CommandExecutor {

    @Override
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (command.isRegistered and (sender is Player)) {
            sender.inventory.helmet = sender.inventory.itemInMainHand
            sender.sendMessage("§f§l§oHat!")
            return true
        }
        return false
    }

}

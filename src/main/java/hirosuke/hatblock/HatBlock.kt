package hirosuke.hatblock;

import org.bukkit.plugin.java.JavaPlugin

class HatBlock : JavaPlugin() {

        @Override
        override fun onEnable() {
                getCommand("hat").executor = CommandHatBlock()
                logger.info("plugin has loaded.")
        }

        @Override
        override fun onDisable() {
                logger.info("plugin has unloaded.")
        }
}

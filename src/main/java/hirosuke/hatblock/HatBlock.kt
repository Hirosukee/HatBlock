package hirosuke.hatblock;

import org.bukkit.plugin.java.JavaPlugin

class HatBlock : JavaPlugin() {

        @Override
        override fun onEnable() {
                getCommand("hat").setExecutor(CommandHatBlock())
                logger.info("plugin has loaded.")
        }

        @Override
        override fun onDisable() {
                logger.info("plugin has unloaded.")
        }
}

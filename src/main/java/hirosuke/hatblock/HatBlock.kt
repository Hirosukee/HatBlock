package hirosuke.hatblock;

import org.bukkit.plugin.java.JavaPlugin

class KotlinPlugin : JavaPlugin() {

        override fun onEnable() {
                logger.info("plugin has loaded.")
        }

        override fun onDisable() {
                logger.info("plugin has unloaded.")
        }
}

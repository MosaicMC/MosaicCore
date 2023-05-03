package io.github.mosaicmc.mosaiccore.utils

import net.minecraft.util.Identifier
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.nio.file.Path

/**
 * A class representing a mod.
 * @param name The name of the mod.
 */
data class Mod (
    val name: String,
    val logger: Logger = LoggerFactory.getLogger(name),
    val configPath: Path = Path.of("$name.json")
) {
    /**
     * Gets the identifier for a resource.
     * @param path The path to the resource.
     * @return The identifier for the resource.
     */
    fun idOf(path: String): Identifier {
        return Identifier(name, path)
    }
}


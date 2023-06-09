package com.example.examplemod.platform

import com.example.examplemod.platform.services.PlatformHelper
import net.fabricmc.loader.api.FabricLoader

class FabricPlatformHelper : PlatformHelper {
    override val platformName = "Fabric"

    override fun isModLoaded(modId: String) = FabricLoader.getInstance().isModLoaded(modId)

    override val isDevelopmentEnvironment: Boolean
        by lazy { FabricLoader.getInstance().isDevelopmentEnvironment }
}

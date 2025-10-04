package com.rerurate.extremeae.block

import com.rerurate.extremeae.Extremeae
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.SoundType
import net.minecraft.world.level.block.state.BlockBehaviour
import net.neoforged.neoforge.registries.DeferredRegister

// THIS LINE IS REQUIRED FOR USING PROPERTY DELEGATES
import thedarkcolour.kotlinforforge.neoforge.forge.getValue

object ModBlocks {
    val REGISTRY = DeferredRegister.createBlocks(Extremeae.ID)

    val HYPERDIMENSIONAL_ALLOY_BLOCK by REGISTRY.register("hyperdimensional_alloy_block") { ->
        Block(BlockBehaviour.Properties.of()
            .strength(5.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.METAL)
        )
    }
}
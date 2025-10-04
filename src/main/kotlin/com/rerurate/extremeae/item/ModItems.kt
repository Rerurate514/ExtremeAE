package com.rerurate.extremeae.item

import com.rerurate.extremeae.Extremeae
import com.rerurate.extremeae.block.ModBlocks
import net.minecraft.core.registries.Registries
import net.minecraft.network.chat.Component
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.Item
import net.minecraft.world.item.ItemStack
import net.neoforged.neoforge.registries.DeferredRegister
import thedarkcolour.kotlinforforge.neoforge.forge.getValue

object ModItems {
    val REGISTRY = DeferredRegister.createItems(Extremeae.ID)

    val CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Extremeae.ID)
    val EXTREME_AE_TAB by CREATIVE_TABS.register("extremeae_tab") { ->
        CreativeModeTab.builder()
            .icon { ItemStack(HYPERDIMENSIONAL_PROCESSER_TRANSCENDENSE_EMBODIMENT) }
            .title(Component.translatable("itemGroup.${Extremeae.ID}.extremeae_tab"))
            .displayItems { _, output ->
                output.accept(HYPERDIMENSIONAL_ALLOY)
                output.accept(HYPERDIMENSIONAL_ALLOY_BLOCK_ITEM)
                output.accept(UNBOUND_HYPERDIMENSIONAL_PROCESSER)
                output.accept(HYPERDIMENSIONAL_PROCESSER_TRANSCENDENSE_EMBODIMENT)
            }
            .build()
    }

    val HYPERDIMENSIONAL_ALLOY by REGISTRY.register("hyperdimensional_alloy") { ->
        Item(Item.Properties().stacksTo(64))
    }

    val HYPERDIMENSIONAL_ALLOY_BLOCK_ITEM by REGISTRY.register("hyperdimensional_alloy_block") { ->
        BlockItem(
            ModBlocks.HYPERDIMENSIONAL_ALLOY_BLOCK,
            Item.Properties()
        )
    }

    val UNBOUND_HYPERDIMENSIONAL_PROCESSER by REGISTRY.register("unbound_hyperdimensional_processer") { ->
        Item(Item.Properties().stacksTo(64))
    }

    val HYPERDIMENSIONAL_PROCESSER_TRANSCENDENSE_EMBODIMENT by REGISTRY.register("hyperdimensional_processer_transcendence_embodiment") { ->
        Item(Item.Properties().stacksTo(64))
    }
}
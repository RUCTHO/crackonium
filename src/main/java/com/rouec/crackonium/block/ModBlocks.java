package com.rouec.crackonium.block;

import com.rouec.crackonium.Crackonium;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;


public class ModBlocks {
public static final Block LITHIUM_BLOCK = registerBlock("lithium_block",
        new Block(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).requiresTool()
                .strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Crackonium.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Crackonium.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Crackonium.LOGGER.info("Registering Mod Blocks for Crackonium!");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.LITHIUM_BLOCK);
        });
    }
}

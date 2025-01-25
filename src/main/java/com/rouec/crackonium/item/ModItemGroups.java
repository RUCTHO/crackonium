package com.rouec.crackonium.item;

import com.rouec.crackonium.Crackonium;
import com.rouec.crackonium.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup METALS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Crackonium.MOD_ID, "metals"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.LITHIUM_INGOT))
                    .displayName(Text.translatable("itemgroup.crackonium.metals"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.LITHIUM_CHUNK);
                        entries.add(ModItems.LITHIUM_INGOT);
                        entries.add(ModBlocks.LITHIUM_BLOCK);
                    }).build());




    public static void registerItemGroups() {
        Crackonium.LOGGER.info("Registering Item Groups for Crackonium");
    }
}

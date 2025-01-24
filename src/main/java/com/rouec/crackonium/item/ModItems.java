package com.rouec.crackonium.item;

import com.rouec.crackonium.Crackonium;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item LITHIUM_CHUNK = registerItem("lithium_chunk", new Item(new Item.Settings()));
    public static final Item LITHIUM_INGOT = registerItem("lithium_ingot", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Crackonium.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Crackonium.LOGGER.info("Registering ModItems for Crackonium");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(LITHIUM_CHUNK);
            entries.add(LITHIUM_INGOT);
        });
    }
}

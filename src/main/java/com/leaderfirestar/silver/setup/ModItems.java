package com.leaderfirestar.silver.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> SILVER_INGOT = Registration.Items.register("silver_ingot", () ->
            new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    static void register(){

    }
}

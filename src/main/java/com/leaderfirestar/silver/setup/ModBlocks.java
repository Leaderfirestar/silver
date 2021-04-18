package com.leaderfirestar.silver.setup;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    static void register(){}
    public static final RegistryObject<Block> SILVER_ORE = register("silver_ore", () ->
            new Block(AbstractBlock.Properties.of(Material.STONE).strength(3, 10).harvestLevel(2).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILVER_BLOCK = register("silver_block", () ->
            new Block(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(3, 10).sound(SoundType.METAL)));
    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block){
        return Registration.Blocks.register(name, block);
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block){
        RegistryObject<T> output = registerNoItem(name, block);
        Registration.Items.register(name, () -> new BlockItem(output.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
        return output;
    }
}

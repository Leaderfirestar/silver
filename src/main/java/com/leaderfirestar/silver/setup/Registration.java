package com.leaderfirestar.silver.setup;

import com.leaderfirestar.silver.Main;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {
    public static final DeferredRegister<Block> Blocks = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MOD_ID);
    public static final DeferredRegister<Item> Items = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);
    public static void register(){
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        Blocks.register(modEventBus);
        Items.register(modEventBus);
        ModItems.register();
    }
}

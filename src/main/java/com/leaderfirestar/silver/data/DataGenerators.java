package com.leaderfirestar.silver.data;

import com.leaderfirestar.silver.Main;
import com.leaderfirestar.silver.data.client.ModBlockState;
import com.leaderfirestar.silver.data.client.ModItemModels;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    private DataGenerators(){}
    @SubscribeEvent
    public static void gatherData(GatherDataEvent e){
        DataGenerator gen = e.getGenerator();
        ExistingFileHelper existingFileHelper = e.getExistingFileHelper();
        gen.addProvider(new ModItemModels(gen, existingFileHelper));
        gen.addProvider(new ModBlockState(gen, existingFileHelper));
    }
}

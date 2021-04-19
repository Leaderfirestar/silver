package com.leaderfirestar.silver.data.client;

import com.leaderfirestar.silver.Main;
import com.leaderfirestar.silver.setup.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockState extends BlockStateProvider {
    public ModBlockState(DataGenerator gen, ExistingFileHelper existingFileHelper){
        super(gen, Main.MOD_ID, existingFileHelper);
    }
    @Override
    protected void registerStatesAndModels(){
        simpleBlock(ModBlocks.SILVER_BLOCK.get());
        simpleBlock(ModBlocks.SILVER_ORE.get());
    }
}

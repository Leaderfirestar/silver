package com.leaderfirestar.silver.data.client;

import com.leaderfirestar.silver.Main;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModels extends ItemModelProvider {
    public ModItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Main.MOD_ID, existingFileHelper);
    }
    @Override
    protected void registerModels(){
        withExistingParent("silver_block", modLoc("block/silver_block"));
        withExistingParent("silver_ore", modLoc("block/silver_ore"));
        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
        builder(itemGenerated, "silver_ingot");
    }

    private void builder(ModelFile itemGenerated, String name) {
        getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}

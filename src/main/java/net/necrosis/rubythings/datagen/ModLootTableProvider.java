package net.necrosis.rubythings.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.necrosis.rubythings.block.ModBlocks;
import net.necrosis.rubythings.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RUBY_BLOCK);

        addDrop(ModBlocks.RUBY_ORE, oreDrops(ModBlocks.RUBY_ORE, ModItems.RAW_RUBY));
        addDrop(ModBlocks.RUBY_DEEPSLATE_ORE, oreDrops(ModBlocks.RUBY_DEEPSLATE_ORE, ModItems.RAW_RUBY));
    }
}

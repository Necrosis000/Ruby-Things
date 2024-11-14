package net.necrosis.rubythings.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.necrosis.rubythings.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.RUBY_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.RUBY_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.RUBY_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.RUBY_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.RUBY_HOE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.RUBY_HELMET)
                .add(ModItems.RUBY_CHESTPLATE)
                .add(ModItems.RUBY_LEGGINGS)
                .add(ModItems.RUBY_BOOTS);

    }
}

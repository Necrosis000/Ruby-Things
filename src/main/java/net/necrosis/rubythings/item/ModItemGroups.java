package net.necrosis.rubythings.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.necrosis.rubythings.RubyThings;
import net.necrosis.rubythings.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup RUBY_THINGS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RubyThings.MOD_ID, "ruby_things_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RUBY))
                    .displayName(Text.translatable("itemgroup.rubythings.ruby_things_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.RUBY_DEEPSLATE_ORE);
                    }).build());



    public static void registerItemGroups() {
        RubyThings.LOGGER.info("Registering Item Groups for" + RubyThings.MOD_ID);
    }
}

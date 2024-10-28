package net.necrosis.rubythings.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.necrosis.rubythings.RubyThings;

public class ModBlocks {

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block RUBY_DEEPSLATE_ORE = registerBlock("ruby_deepslate_ore",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(RubyThings.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(RubyThings.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerBlocks() {
        RubyThings.LOGGER.info("Registering ModBlocks for " + RubyThings.MOD_ID);
    }
}

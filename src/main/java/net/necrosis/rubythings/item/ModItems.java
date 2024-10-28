package net.necrosis.rubythings.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.necrosis.rubythings.RubyThings;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(RubyThings.MOD_ID, name), item);
    }

    public static void registerItems() {
        RubyThings.LOGGER.info("Registering ModItems for " + RubyThings.MOD_ID);
    }
}

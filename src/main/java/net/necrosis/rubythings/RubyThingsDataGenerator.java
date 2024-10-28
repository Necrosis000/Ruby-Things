package net.necrosis.rubythings;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.necrosis.rubythings.datagen.ModBlockTagProvider;
import net.necrosis.rubythings.datagen.ModItemTagProvider;
import net.necrosis.rubythings.datagen.ModLootTableProvider;
import net.necrosis.rubythings.datagen.ModModelProvider;

public class RubyThingsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
	}
}

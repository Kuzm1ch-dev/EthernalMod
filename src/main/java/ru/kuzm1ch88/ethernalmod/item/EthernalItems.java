    package ru.kuzm1ch88.ethernalmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import ru.kuzm1ch88.ethernalmod.EthernalMod;

public class EthernalItems {

    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item RAW_MYTHRIL = registerItem("raw_mythril",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(EthernalMod.MOD_ID, name), item);
    }

    public static void registerEthernalItems(){
        EthernalMod.LOGGER.info("Registering Mod Items for " + EthernalMod.MOD_ID);
    }
}

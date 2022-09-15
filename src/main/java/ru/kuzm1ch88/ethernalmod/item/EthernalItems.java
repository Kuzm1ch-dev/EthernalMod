    package ru.kuzm1ch88.ethernalmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import ru.kuzm1ch88.ethernalmod.EthernalMod;

public class EthernalItems {


    //Fuel
    public static final Item ALATY_STONE = registerItem("alaty_stone",
            new Item(new FabricItemSettings().group(EthernalItemGroup.ETHERNAL_ITEM_GROUP)));

    //Ingots
    public static final Item BRONZE_INGOT = registerItem("bronze_ingot",
            new Item(new FabricItemSettings().group(EthernalItemGroup.ETHERNAL_ITEM_GROUP)));

    public static final Item TIN_INGOT = registerItem("tin_ingot",
            new Item(new FabricItemSettings().group(EthernalItemGroup.ETHERNAL_ITEM_GROUP)));

    public static final Item COLD_IRON_INGOT = registerItem("cold_iron_ingot",
            new Item(new FabricItemSettings().group(EthernalItemGroup.ETHERNAL_ITEM_GROUP)));

    //Fabric
    public static final Item FABRIC = registerItem("fabric",
            new Item(new FabricItemSettings().group(EthernalItemGroup.ETHERNAL_ITEM_GROUP)));

    public static final Item GOLDEN_STRING = registerItem("golden_string",
            new Item(new FabricItemSettings().group(EthernalItemGroup.ETHERNAL_ITEM_GROUP)));

    public static final Item GOLDEN_FABRIC = registerItem("golden_fabric",
            new Item(new FabricItemSettings().group(EthernalItemGroup.ETHERNAL_ITEM_GROUP)));

    //Raw
    public static final Item RAW_TIN = registerItem("raw_tin",
            new Item(new FabricItemSettings().group(EthernalItemGroup.ETHERNAL_ITEM_GROUP)));

    public static final Item RAW_COLD_IRON = registerItem("raw_cold_iron",
            new Item(new FabricItemSettings().group(EthernalItemGroup.ETHERNAL_ITEM_GROUP)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(EthernalMod.MOD_ID, name), item);
    }

    public static void registerEthernalItems(){
        EthernalMod.LOGGER.info("Registering Mod Items for " + EthernalMod.MOD_ID);
    }
}

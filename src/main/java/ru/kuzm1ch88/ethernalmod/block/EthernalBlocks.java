package ru.kuzm1ch88.ethernalmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import ru.kuzm1ch88.ethernalmod.EthernalMod;
import ru.kuzm1ch88.ethernalmod.item.EthernalItemGroup;

public class EthernalBlocks {

    //Ore Block's
    public static final Block TIN_BLOCK = registerBlock("tin_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(1.0f).requiresTool()), EthernalItemGroup.ETHERNAL_ITEM_GROUP);

    public static final Block BRONZE_BLOCK = registerBlock("bronze_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(1.0f).requiresTool()), EthernalItemGroup.ETHERNAL_ITEM_GROUP);

    public static final Block COLD_IRON_BLOCK = registerBlock("cold_iron_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(1.0f).requiresTool()), EthernalItemGroup.ETHERNAL_ITEM_GROUP);

    public static final Block ALATY_STONE_BLOCK = registerBlock("alaty_stone_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool()), EthernalItemGroup.ETHERNAL_ITEM_GROUP);

    //Ore's
    public static final Block AUMENTIT_ORE = registerBlock("aumentit_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool()), EthernalItemGroup.ETHERNAL_ITEM_GROUP);

    public static final Block TIN_ORE = registerBlock("tin_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool()), EthernalItemGroup.ETHERNAL_ITEM_GROUP);

    public static final Block COLD_IRON_ORE = registerBlock("cold_iron_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool()), EthernalItemGroup.ETHERNAL_ITEM_GROUP);

    public static final Block ALATY_STONE_ORE = registerBlock("alaty_stone_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool()), EthernalItemGroup.ETHERNAL_ITEM_GROUP);


    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(EthernalMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(EthernalMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerEthernalBlocks(){
        EthernalMod.LOGGER.info("Registering Mod Bloks for " + EthernalMod.MOD_ID);
    }
}


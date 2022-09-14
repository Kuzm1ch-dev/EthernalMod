package ru.kuzm1ch88.ethernalmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import ru.kuzm1ch88.ethernalmod.EthernalMod;

public class EthernalItemGroup {
    public static final ItemGroup ETHERNAL_ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(EthernalMod.MOD_ID, "ethernal"),
    () -> new ItemStack(EthernalItems.MYTHRIL_INGOT));
}

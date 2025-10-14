package com.luvas.tutorialmod.item;

import com.luvas.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_ALEXANDRITE = ITEMS.register("raw_alexandrite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GOOFY_AHH_GEM = ITEMS.register("goofy_ahh_gem",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SHWEYLIAM_FRAGMENT = ITEMS.register("shweyliam_fragment",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRENIUM_INGOT = ITEMS.register("brenium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRENIUM_ORE = ITEMS.register("brenium_ore",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRENO_CANDIDATO_MK_3 = ITEMS.register("breno_candidato_mk_3",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

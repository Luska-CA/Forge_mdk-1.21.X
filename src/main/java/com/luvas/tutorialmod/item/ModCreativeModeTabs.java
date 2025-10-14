package com.luvas.tutorialmod.item;

import com.luvas.tutorialmod.TutorialMod;
import com.luvas.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SHWEYLIAM_ITEMS_TAB = CREATIVE_MODE_TABS.register("shweyliam_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SHWEYLIAM_FRAGMENT.get())).title(Component.translatable("creativetab.tutorialmod.shweyliam_items"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SHWEYLIAM_FRAGMENT.get());
                        pOutput.accept(ModItems.GOOFY_AHH_GEM.get());
                        pOutput.accept((ModItems.ALEXANDRITE.get()));
                        pOutput.accept(ModItems.RAW_ALEXANDRITE.get());
                        pOutput.accept(ModItems.BRENIUM_INGOT.get());
                        pOutput.accept(ModItems.BRENIUM_ORE.get());
                        pOutput.accept(ModItems.BRENO_CANDIDATO_MK_3.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> SHWEYLIAM_BLOCKS_TAB = CREATIVE_MODE_TABS.register("shweyliam_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.SHEY_BLOCK.get()))
                    .withTabsBefore(SHWEYLIAM_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.tutorialmod.shweyliam_block"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.SHEY_BLOCK.get());
                        pOutput.accept(ModBlocks.ALEXANDRITE_BLOCK.get());
                        pOutput.accept(ModBlocks.BRENIUM_ORE_BLOCK.get());
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

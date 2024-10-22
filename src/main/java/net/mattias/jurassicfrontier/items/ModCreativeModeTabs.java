package net.mattias.jurassicfrontier.items;

import net.mattias.jurassicfrontier.JurassicFrontier;
import net.mattias.jurassicfrontier.blocks.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JurassicFrontier.MOD_ID);

    public static final RegistryObject<CreativeModeTab> JURASSIC_FRONTIER = CREATIVE_MODE_TABS.register("jurassicfrontier",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.TRICERATOPS_FOSSIL.get()))
                    .title(Component.translatable("creativetab.jurassicfrontier"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.TRICERATOPS_FOSSIL.get());
                        pOutput.accept(ModItems.TRICERATOPS_SPAWN_EGG.get());


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
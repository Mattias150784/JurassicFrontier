package net.mattias.jurassicfrontier.event;

import net.mattias.jurassicfrontier.JurassicFrontier;
import net.mattias.jurassicfrontier.entity.ModEntities;
import net.mattias.jurassicfrontier.entity.custom.TriceratopsEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = JurassicFrontier.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.TRICERATOPS.get(), TriceratopsEntity.createAttributes().build());
    }
}
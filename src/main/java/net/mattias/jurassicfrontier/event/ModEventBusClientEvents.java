package net.mattias.jurassicfrontier.event;

import net.mattias.jurassicfrontier.JurassicFrontier;
import net.mattias.jurassicfrontier.entity.client.ModModelLayers;
import net.mattias.jurassicfrontier.entity.client.TriceratopsModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = JurassicFrontier.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.TRICERATOPS_LAYER, TriceratopsModel::createBodyLayer);
    }
}
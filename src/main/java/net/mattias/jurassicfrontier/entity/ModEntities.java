package net.mattias.jurassicfrontier.entity;

import net.mattias.jurassicfrontier.JurassicFrontier;
import net.mattias.jurassicfrontier.entity.custom.TriceratopsEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, JurassicFrontier.MOD_ID);

    public static final RegistryObject<EntityType<TriceratopsEntity>> TRICERATOPS =
            ENTITY_TYPES.register("triceratops", () -> EntityType.Builder.of(TriceratopsEntity::new, MobCategory.CREATURE)
                    .sized(4.2f, 3.2f).build("triceratops"));





    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
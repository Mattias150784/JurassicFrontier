package net.mattias.jurassicfrontier.entity.custom;

import net.mattias.jurassicfrontier.entity.ModEntities;
import net.mattias.jurassicfrontier.entity.ai.TriceratopsAttackGoal;
import net.mattias.jurassicfrontier.sounds.ModSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializer;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public class TriceratopsEntity extends Animal {
    public TriceratopsEntity(EntityType<? extends Animal> pEntitytype, Level pLevel) {
        super(pEntitytype, pLevel);
    }

    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    @Override
    public void tick() {
        super.tick();

        if(this.level().isClientSide()) {
            this.setupAnimationStates();
        }
    }

    private void setupAnimationStates() {
    if(this.idleAnimationTimeout <= 0) {
        this.idleAnimationTimeout = this.random.nextInt(40) + 80;
        this.idleAnimationState.start(this.tickCount);
    }
    else {
        --this.idleAnimationTimeout;
    }
    }

    @Override
    protected void updateWalkAnimation(float pPartialTick) {
       float f;
       if(this.getPose() == Pose.STANDING) {
           f = Math.min(pPartialTick * 6F, 1f);
       }
       else {
           f = 0f;
       }

       this.walkAnimation.update(f, 0.2f);
    }

    @Override
    protected void registerGoals() {
      this.goalSelector.addGoal(0, new FloatGoal(this));
      this.goalSelector.addGoal(1, new BreedGoal(this, 1.15D));
      this.goalSelector.addGoal(2, new FollowParentGoal(this, 1.15D));
      this.goalSelector.addGoal(3, new WaterAvoidingRandomStrollGoal(this, 1.15D));
      this.goalSelector.addGoal(4, new LookAtPlayerGoal(this, Player.class, 3f));
      this.goalSelector.addGoal(1, new RandomLookAroundGoal(this));

    }

    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 40D)
                .add(Attributes.FOLLOW_RANGE, 24D)
                .add(Attributes.MOVEMENT_SPEED, 0.3D)
                .add(Attributes.ATTACK_KNOCKBACK, 0.5f)
                .add(Attributes.ATTACK_DAMAGE, 3f);
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel pLevel, AgeableMob ageableMob) {
        return ModEntities.TRICERATOPS.get().create(pLevel);
    }

    @Override
    public boolean isFood(ItemStack pStack) {
        return pStack.is(Items.SWEET_BERRIES);
    }
/*
    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return super.getAmbientSound();
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return super.getDeathSound();
    }

    @Override
    protected void playStepSound(BlockPos p_20135_, BlockState p_20136_) {
        super.playStepSound(p_20135_, p_20136_);
    } */
}
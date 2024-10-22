package net.mattias.jurassicfrontier.entity.animations;


import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

public class ModAnimationDefinitions {
        public static final AnimationDefinition TriceratopsIdle = AnimationDefinition.Builder.withLength(3.58F).looping()
                .addAnimation("gTorso", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.3662F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("gBacklegs", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.3662F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("gTail", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.5954F, 0.6522F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("gTail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.6522F, -0.7049F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("gFrontlegs", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.3662F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("gNeck", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.3662F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("gHead", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.1831F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .build();

        public static final AnimationDefinition TriceratopsWalk = AnimationDefinition.Builder.withLength(2.375F).looping()
                .addAnimation("gTorso", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.204F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("gBacklegs", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.204F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("gLeftbackleg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.4088F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("gLeftbackleg", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.7109F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("gRightbackleg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.4088F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("gRightbackleg", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.7109F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("gTail", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0818F, -1.4218F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("gTail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(-1.4218F, -3.9828F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("gFrontlegs", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.204F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("gLeftfrontleg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.6541F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("gLeftfrontleg", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.7109F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("gRightfrontleg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.6541F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("gRightfrontleg", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.7109F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("gNeck", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0818F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("gHead", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.7109F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .build();
}
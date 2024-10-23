package net.mattias.jurassicfrontier.entity.animations;


import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

public class ModAnimationDefinitions {

        public static final AnimationDefinition TriceratopsIdle = AnimationDefinition.Builder.withLength(3.58f).looping()
                .addAnimation("gTorso",
                        new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation("gBacklegs",
                        new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation("gTail",
                        new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation("gTail2",
                        new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation("gFrontlegs",
                        new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation("gNeck",
                        new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation("gHead",
                        new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR))).build();
        public static final AnimationDefinition TriceratopsWalk = AnimationDefinition.Builder.withLength(2.375f).looping()
                .addAnimation("gTorso",
                        new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation("gBacklegs",
                        new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation("gLeftbackleg",
                        new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation("gLeftbackleg",
                        new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation("gRightbackleg",
                        new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation("gRightbackleg",
                        new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation("gTail",
                        new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation("gTail2",
                        new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation("gFrontlegs",
                        new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation("gLeftfrontleg",
                        new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation("gLeftfrontleg",
                        new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation("gRightfrontleg",
                        new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation("gRightfrontleg",
                        new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation("gNeck",
                        new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation("gHead",
                        new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR))).build();
        public static final AnimationDefinition TRICERATOPSIDLE2 = AnimationDefinition.Builder.withLength(0.75f).looping()
                .addAnimation("gTail",
                        new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.25f, KeyframeAnimations.degreeVec(0f, 2.5f, 0f),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, -2.5f, 0f),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation("gTail2",
                        new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.25f, KeyframeAnimations.degreeVec(0f, 2.5f, 0f),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation("gNeck",
                        new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.25f, KeyframeAnimations.posVec(0f, -0.5f, 0f),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR))).build();
        public static final AnimationDefinition TRICERATOPSWALK2 = AnimationDefinition.Builder.withLength(0.625f).looping()
                .addAnimation("gLeftbackleg",
                        new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.25f, KeyframeAnimations.degreeVec(-2.5f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5f, KeyframeAnimations.degreeVec(2.5f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation("gRightbackleg",
                        new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.25f, KeyframeAnimations.degreeVec(2.5f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5f, KeyframeAnimations.degreeVec(-2.5f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation("gLeftfrontleg",
                        new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.25f, KeyframeAnimations.degreeVec(-2.5f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5f, KeyframeAnimations.degreeVec(2.5f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation("gRightfrontleg",
                        new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.25f, KeyframeAnimations.degreeVec(2.5f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5f, KeyframeAnimations.degreeVec(-2.5f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation("gTail",
                        new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.25f, KeyframeAnimations.degreeVec(0f, -2.5f, 0f),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 2.5f, 0f),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation("gTail2",
                        new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.25f, KeyframeAnimations.degreeVec(0f, -2.5f, 0f),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                        AnimationChannel.Interpolations.LINEAR))).build();


}
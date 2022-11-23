package net.mindshake.securityforfabric.client.model.block;

import net.mindshake.securityforfabric.Main;
import net.mindshake.securityforfabric.block.entity.SpikesBlockEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SpikesBlockModel extends AnimatedGeoModel<SpikesBlockEntity> {
    @Override
    public Identifier getModelResource(SpikesBlockEntity object) {
        return new Identifier(Main.MODID, "geo/spikes.geo.json");
    }

    @Override
    public Identifier getTextureResource(SpikesBlockEntity object) {
        return new Identifier(Main.MODID, "textures/block/spikes.png");
    }

    @Override
    public Identifier getAnimationResource(SpikesBlockEntity animatable) {
        return new Identifier(Main.MODID, "animations/spikes.animation.json");
    }
}

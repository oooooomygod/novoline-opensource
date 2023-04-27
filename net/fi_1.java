/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.Entity;
import net.minecraft.block.BlockPos;
import net.CreativeTabs;

/*
 * Renamed from net.fI
 */
public class fi_1
extends f3_0 {
    public fi_1() {
        super(Material.N, false, MapColor.r);
        this.a(CreativeTabs.l);
        this.z = 0.8f;
    }

    @Override
    public void a(World world, BlockPos blockPos, Entity entity) {
        if (MathInvoker.a(entity.motionY) < 0.1 && !ayj_0.l(entity)) {
            double d = 0.4 + MathInvoker.a(entity.motionY) * 0.2;
            entity.motionX *= d;
            entity.motionZ *= d;
        }
        super.a(world, blockPos, entity);
    }

    @Override
    public void a(World world, Entity entity) {
        if (ayj_0.l(entity)) {
            super.a(world, entity);
        } else if (entity.motionY < 0.0) {
            entity.motionY = -entity.motionY;
        }
    }

    @Override
    public a5w_0 K() {
        return a5w_0.TRANSLUCENT;
    }

    @Override
    public void a(World world, BlockPos blockPos, Entity entity, float f) {
        if (ayj_0.l(entity)) {
            super.a(world, blockPos, entity, f);
        } else {
            ayj_0.a(entity, f, 0.0f);
        }
    }
}


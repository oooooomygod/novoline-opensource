/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.dispenser;

import deobf.IProjectile;
import net.World;
import net.aKJ;
import net.oz_1;
import net.vt_0;
import net.z7_0;

class BehaviorProjectileDispense
extends aKJ {
    @Override
    protected float b() {
        return super.b() * 0.5f;
    }

    @Override
    protected float a() {
        return super.a() * 1.25f;
    }

    @Override
    protected IProjectile a(World world, vt_0 vt_02) {
        return new oz_1(world, z7_0.b(vt_02), z7_0.a(vt_02), z7_0.c(vt_02));
    }

    BehaviorProjectileDispense() {
    }
}


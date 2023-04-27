/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.IProjectile;
import deobf.EntityArrow;

/*
 * Renamed from net.abl
 */
class abl_2
extends aKJ {
    @Override
    protected IProjectile a(World world, vt_0 vt_02) {
        EntityArrow entityArrow = new EntityArrow(world, z7_0.b(vt_02), z7_0.a(vt_02), z7_0.c(vt_02));
        entityArrow.au = 1;
        return entityArrow;
    }

    abl_2() {
    }
}


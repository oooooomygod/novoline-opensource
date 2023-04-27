/*
 * Decompiled with CFR 0.152.
 */
package deobf;

import deobf.IProjectile;
import net.World;
import net.aKJ;
import net.oq_2;
import net.vt_0;
import net.z7_0;

class EntitySnowball
extends aKJ {
    @Override
    protected IProjectile a(World world, vt_0 vt_02) {
        return new oq_2(world, z7_0.b(vt_02), z7_0.a(vt_02), z7_0.c(vt_02));
    }

    EntitySnowball() {
    }
}


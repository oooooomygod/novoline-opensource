/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.World;
import net.nv_1;

/*
 * Renamed from net.nr
 */
public class nr_2
extends nv_1 {
    protected nr_2(World world, double d, double d2, double d3, double d4, double d5, double d6) {
        super(world, d, d2, d3);
        this.ar = 0.04f;
        this.a();
        if (d5 == 0.0 && (d4 != 0.0 || d6 != 0.0)) {
            this.motionX = d4;
            this.motionY = d5 + 0.1;
            this.motionZ = d6;
        }
    }
}


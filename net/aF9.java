/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.renderer.WorldRenderer;
import java.util.Comparator;

class aF9
implements Comparator {
    float[] b;
    WorldRenderer a;

    aF9(WorldRenderer worldRenderer, float[] fArray) {
        this.a = worldRenderer;
        this.b = fArray;
    }

    public int a(Integer n, Integer n2) {
        return aNS.a(this.b[P8.b(n2)], this.b[P8.b(n)]);
    }

    public int compare(Object object, Object object2) {
        return this.a((Integer)object, (Integer)object2);
    }
}


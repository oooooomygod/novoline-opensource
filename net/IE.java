/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.vector.Vector3f
 */
package net;

import cc.novoline.invoke.MapInvoker;
import java.util.Iterator;
import java.util.Map;
import deobf.EnumFacing;
import org.lwjgl.util.vector.Vector3f;

public class IE {
    public boolean a;
    public Vector3f b;
    public Map<EnumFacing, aL1> d;
    public Vector3f e;
    public WJ c;

    private void a() {
        Iterator iterator = aS0.f(MapInvoker.b(this.d));
        while (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            float[] fArray = this.a((EnumFacing)FG.b(entry));
            aiq_1.a(((aL1)FG.a((Map.Entry)entry)).a, fArray);
        }
    }

    public IE(Vector3f vector3f, Vector3f vector3f2, Map<EnumFacing, aL1> map, WJ wJ, boolean bl) {
        this.e = vector3f;
        this.b = vector3f2;
        this.d = map;
        this.c = wJ;
        this.a = bl;
        this.a();
    }

    private float[] a(EnumFacing enumFacing) {
        float[] fArray;
        switch (a7p_0.a[enumFacing.ordinal()]) {
            case 1: 
            case 2: {
                fArray = new float[]{this.e.x, this.e.z, this.b.x, this.b.z};
                break;
            }
            case 3: 
            case 4: {
                fArray = new float[]{this.e.x, 16.0f - this.b.y, this.b.x, 16.0f - this.e.y};
                break;
            }
            case 5: 
            case 6: {
                fArray = new float[]{this.e.z, 16.0f - this.b.y, this.b.z, 16.0f - this.e.y};
                break;
            }
            default: {
                throw new NullPointerException();
            }
        }
        return fArray;
    }
}


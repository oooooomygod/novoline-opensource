/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import net.aSZ;
import net.go_0;

public class HL {
    public static float j;
    public aSZ k;
    public static float i;
    public static float l;
    public static float m;
    public static float p;
    public static float h;
    public static float b;
    public aSZ a;
    public aSZ f;
    public aSZ e;
    public static float n;
    public static float c;
    public aSZ d;
    public static HL o;
    public aSZ g;

    private HL() {
        this(aSZ.d, aSZ.d, aSZ.d, aSZ.d, aSZ.d, aSZ.d);
    }

    public void a(go_0 go_02) {
        aSZ aSZ2 = this.c(go_02);
        if (aSZ2 != aSZ.d) {
            GlStateManagerInvoker.translate(aSZ2.b.x + h, aSZ2.b.y + c, aSZ2.b.z + b);
            GlStateManagerInvoker.b(aSZ2.a.y + l, 0.0f, 1.0f, 0.0f);
            GlStateManagerInvoker.b(aSZ2.a.x + j, 1.0f, 0.0f, 0.0f);
            GlStateManagerInvoker.b(aSZ2.a.z + m, 0.0f, 0.0f, 1.0f);
            GlStateManagerInvoker.c(aSZ2.c.x + i, aSZ2.c.y + n, aSZ2.c.z + p);
        }
    }

    public HL(HL hL) {
        this.d = hL.d;
        this.a = hL.a;
        this.g = hL.g;
        this.f = hL.f;
        this.k = hL.k;
        this.e = hL.e;
    }

    public aSZ c(go_0 go_02) {
        switch (go_02) {
            case THIRD_PERSON: {
                return this.d;
            }
            case FIRST_PERSON: {
                return this.a;
            }
            case HEAD: {
                return this.g;
            }
            case GUI: {
                return this.f;
            }
            case GROUND: {
                return this.k;
            }
            case FIXED: {
                return this.e;
            }
        }
        return aSZ.d;
    }

    static {
        o = new HL();
        h = 0.0f;
        c = 0.0f;
        b = 0.0f;
        j = 0.0f;
        l = 0.0f;
        m = 0.0f;
        i = 0.0f;
        n = 0.0f;
        p = 0.0f;
    }

    public boolean b(go_0 go_02) {
        return !this.c(go_02).equals(aSZ.d);
    }

    public HL(aSZ aSZ2, aSZ aSZ3, aSZ aSZ4, aSZ aSZ5, aSZ aSZ6, aSZ aSZ7) {
        this.d = aSZ2;
        this.a = aSZ3;
        this.g = aSZ4;
        this.f = aSZ5;
        this.k = aSZ6;
        this.e = aSZ7;
    }
}


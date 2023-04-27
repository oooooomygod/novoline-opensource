/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.qv
 */
public enum qv_2 {
    BASE(a2k_0.ct, a2k_0.aD),
    SQUARE_BOTTOM_LEFT(a2k_0.aT, a2k_0.ah, a2k_0.bU, a2k_0.m, a2k_0.a0),
    SQUARE_BOTTOM_RIGHT(a2k_0.bu, a2k_0.z, a2k_0.A, a2k_0.ci, a2k_0.cm),
    SQUARE_TOP_LEFT(a2k_0.ch, a2k_0.a3, a2k_0.b4, a2k_0.bf, a2k_0.bv),
    SQUARE_TOP_RIGHT(a2k_0.bF, a2k_0.O, a2k_0.bn, a2k_0.af, a2k_0.ak),
    STRIPE_BOTTOM(a2k_0.aa, a2k_0.bc, a2k_0.cD, a2k_0.C, a2k_0.au),
    STRIPE_TOP(a2k_0.Y, a2k_0.ar, a2k_0.W, a2k_0.cB, a2k_0.bt),
    STRIPE_LEFT(a2k_0.a8, a2k_0.ab, a2k_0.bN, a2k_0.bW, a2k_0.bb),
    STRIPE_RIGHT(a2k_0.bV, a2k_0.c, a2k_0.bB, a2k_0.a, a2k_0.cf),
    STRIPE_CENTER(a2k_0.aG, a2k_0.bZ, a2k_0.at, a2k_0.bO, a2k_0.cr),
    STRIPE_MIDDLE(a2k_0.aV, a2k_0.bi, a2k_0.aL, a2k_0.bX, a2k_0.cc),
    STRIPE_DOWNRIGHT(a2k_0.bo, a2k_0.aZ, a2k_0.a5, a2k_0.bm, a2k_0.J),
    STRIPE_DOWNLEFT(a2k_0.aQ, a2k_0.br, a2k_0.bH, a2k_0.b3, a2k_0.bk),
    STRIPE_SMALL(a2k_0.e, a2k_0.bT, a2k_0.bM, a2k_0.aH, a2k_0.F),
    CROSS(a2k_0.bQ, a2k_0.i, a2k_0.bs, a2k_0.cb, a2k_0.b7),
    STRAIGHT_CROSS(a2k_0.cs, a2k_0.V, a2k_0.P, a2k_0.bz, a2k_0.bA),
    TRIANGLE_BOTTOM(a2k_0.I, a2k_0.bd, a2k_0.aC, a2k_0.a7, a2k_0.cw),
    TRIANGLE_TOP(a2k_0.ax, a2k_0.w, a2k_0.t, a2k_0.aR, a2k_0.aw),
    TRIANGLES_BOTTOM(a2k_0.aB, a2k_0.aW, a2k_0.bK, a2k_0.l, a2k_0.aj),
    TRIANGLES_TOP(a2k_0.aI, a2k_0.aP, a2k_0.cq, a2k_0.aS, a2k_0.bl),
    DIAGONAL_LEFT(a2k_0.cd, a2k_0.by, a2k_0.as, a2k_0.M, a2k_0.bx),
    DIAGONAL_RIGHT(a2k_0.co, a2k_0.cj, a2k_0.bJ, a2k_0.cp, a2k_0.L),
    DIAGONAL_LEFT_MIRROR(a2k_0.a2, a2k_0.cg, a2k_0.ck, a2k_0.cE, a2k_0.B),
    DIAGONAL_RIGHT_MIRROR(a2k_0.ai, a2k_0.h, a2k_0.u, a2k_0.j, a2k_0.p),
    CIRCLE_MIDDLE(a2k_0.x, a2k_0.n, a2k_0.cx, a2k_0.bj, a2k_0.a4),
    RHOMBUS_MIDDLE(a2k_0.bP, a2k_0.bI, a2k_0.v, a2k_0.a6, a2k_0.a9),
    HALF_VERTICAL(a2k_0.b0, a2k_0.aA, a2k_0.bg, a2k_0.cI, a2k_0.al),
    HALF_HORIZONTAL(a2k_0.be, a2k_0.bL, a2k_0.ad, a2k_0.H, a2k_0.bD),
    HALF_VERTICAL_MIRROR(a2k_0.bG, a2k_0.aN, a2k_0.q, a2k_0.ce, a2k_0.K),
    HALF_HORIZONTAL_MIRROR(a2k_0.f, a2k_0.cF, a2k_0.d, a2k_0.aM, a2k_0.aY),
    BORDER(a2k_0.cG, a2k_0.G, a2k_0.bC, a2k_0.ca, a2k_0.aK),
    CURLY_BORDER(a2k_0.y, a2k_0.aJ, new ItemStack(Blocks.as)),
    CREEPER(a2k_0.b, a2k_0.b_, new ItemStack(Items.skull, 1, 4)),
    GRADIENT(a2k_0.a_, a2k_0.av, a2k_0.aO, a2k_0.a1, a2k_0.aq),
    GRADIENT_UP(a2k_0.ac, a2k_0.aX, a2k_0.cH, a2k_0.am, a2k_0.aF),
    BRICKS(a2k_0.o, a2k_0.b1, new ItemStack(Blocks.bL)),
    SKULL(a2k_0.N, a2k_0.b2, new ItemStack(Items.skull, 1, 1)),
    FLOWER(a2k_0.b8, a2k_0.bE, new ItemStack(Blocks.bY, 1, aj4.a(dq_1.OXEYE_DAISY))),
    MOJANG(a2k_0.ao, a2k_0.s, new ItemStack(Items.golden_apple, 1, 1));

    private String c;
    private ItemStack b;
    private String e;
    private String[] d = new String[3];

    public boolean e() {
        return this.b != null || this.d[0] != null;
    }

    private qv_2(String string2, String string3, ItemStack itemStack) {
        this(string2, string3);
        this.b = itemStack;
    }

    private qv_2(String string2, String string3, String string4, String string5, String string6) {
        this(string2, string3);
        this.d[0] = string4;
        this.d[1] = string5;
        this.d[2] = string6;
    }

    public static qv_2 a(String string) {
        for (qv_2 qv_22 : qv_2.values()) {
            if (!qv_22.c.equals(string)) continue;
            return qv_22;
        }
        return null;
    }

    public String[] f() {
        return this.d;
    }

    public ItemStack b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public String a() {
        return this.e;
    }

    private qv_2(String string2, String string3) {
        this.e = string2;
        this.c = string3;
    }

    public boolean d() {
        return this.b != null;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import net.a08;

public enum y9 {
    KEBAB(a08.D, 16, 16, 0, 0),
    AZTEC(a08.I, 16, 16, 16, 0),
    ALBAN(a08.v, 16, 16, 32, 0),
    AZTEC_2(a08.X, 16, 16, 48, 0),
    BOMB(a08.O, 16, 16, 64, 0),
    PLANT(a08.J, 16, 16, 80, 0),
    WASTELAND(a08.K, 16, 16, 96, 0),
    POOL(a08.A, 32, 16, 0, 32),
    COURBET(a08.H, 32, 16, 32, 32),
    SEA(a08.V, 32, 16, 64, 32),
    SUNSET(a08.w, 32, 16, 96, 32),
    CREEBET(a08.y, 32, 16, 128, 32),
    WANDERER(a08.q, 16, 32, 0, 64),
    GRAHAM(a08.d, 16, 32, 16, 64),
    MATCH(a08.T, 32, 32, 0, 128),
    BUST(a08.Z, 32, 32, 32, 128),
    STAGE(a08.P, 32, 32, 64, 128),
    VOID(a08.C, 32, 32, 96, 128),
    SKULL_AND_ROSES(a08.S, 32, 32, 128, 128),
    WITHER(a08.l, 32, 32, 160, 128),
    FIGHTERS(a08.Y, 64, 32, 0, 96),
    POINTER(a08.L, 64, 64, 0, 192),
    PIGSCENE(a08.r, 64, 64, 64, 192),
    BURNING_SKULL(a08.j, 64, 64, 128, 192),
    SKELETON(a08.M, 64, 48, 192, 64),
    DONKEY_KONG(a08.s, 64, 48, 192, 112);

    public int offsetY;
    public static int field_180001_A;
    public int sizeX;
    public String title;
    public int offsetX;
    public int sizeY;

    private y9(String string2, int n2, int n3, int n4, int n5) {
        this.title = string2;
        this.sizeX = n2;
        this.sizeY = n3;
        this.offsetX = n4;
        this.offsetY = n5;
    }

    static {
        field_180001_A = StringInvoker.c(a08.U);
    }
}


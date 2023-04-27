/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumFacing;

/*
 * Renamed from net.axS
 */
enum axs_1 {
    UP(EnumFacing.UP, 0, -1),
    DOWN(EnumFacing.DOWN, 0, 1),
    LEFT(EnumFacing.EAST, -1, 0),
    RIGHT(EnumFacing.WEST, 1, 0);

    private EnumFacing a;
    private int b;
    private int c;

    private boolean a() {
        return this == DOWN || this == UP;
    }

    static boolean a(axs_1 axs_12) {
        return axs_12.a();
    }

    public EnumFacing d() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    private axs_1(EnumFacing enumFacing, int n2, int n3) {
        this.a = enumFacing;
        this.c = n2;
        this.b = n3;
    }

    public int c() {
        return this.c;
    }
}


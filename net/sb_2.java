/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.sb
 */
class sb_2 {
    private static String b = "CL_00002554";
    private int a;
    private boolean c = false;

    public void a() {
        this.a(false);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "\u001e;->,\u0000^oBG:".toCharArray();
        int n2 = 0;
        int n3 = 96;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x3D));
            n3 = n3;
        }
    }

    public sb_2(int n) {
        this.a = n;
    }

    public void b() {
        this.a(true);
    }

    public void a(boolean bl) {
        if (bl != this.c) {
            this.c = bl;
            GL11.glEnable((int)this.a);
        }
    }
}


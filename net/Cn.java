/*
 * Decompiled with CFR 0.152.
 */
package net;

public class Cn {
    private KM[] b;
    private static String c = "CL_00002568";
    private VertexFormat d;
    private int[] a;

    public VertexFormat a() {
        return this.d;
    }

    public int c() {
        return this.a.length / zv_2.d(this.d);
    }

    public Cn(int[] nArray, VertexFormat aqn_02) {
        this.a = nArray;
        this.d = aqn_02;
    }

    public Cn(int[] nArray, VertexFormat aqn_02, KM[] kMArray) {
        this.a = nArray;
        this.d = aqn_02;
        this.b = kMArray;
    }

    public int[] b() {
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "\u0012~S4\u0014\u0000jc\u0007:<".toCharArray();
        int n2 = 0;
        int n3 = 42;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x7B));
            n3 = n3;
        }
    }

    static KM[] a(Cn cn) {
        return cn.b;
    }
}


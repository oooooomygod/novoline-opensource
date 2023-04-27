/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aE0;
import net.aL0;
import net.aac_1;
import net.lx_2;

class NI {
    long d;
    int a;
    NI e;
    private static String b = "CL_00001493";
    Object c;

    public String toString() {
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), this.a()), aE0.a), this.b()).toString();
    }

    public long a() {
        return this.d;
    }

    NI(int n, long l4, Object object, NI nI) {
        this.c = object;
        this.e = nI;
        this.d = l4;
        this.a = n;
    }

    public Object b() {
        return this.c;
    }

    public int hashCode() {
        return aac_1.c(this.d);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "\u001a:9%\u001f})hB_&".toCharArray();
        int n2 = 0;
        int n3 = 6;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x5F));
            n3 = n3;
        }
    }

    public boolean equals(Object object) {
        if (object instanceof NI) {
            Long l4;
            NI nI = (NI)object;
            Long l5 = lx_2.b(this.a());
            if (l5 == (l4 = lx_2.b(nI.a())) || l5.equals(l4)) {
                Object object2;
                Object object3 = this.b();
                return object3 == (object2 = nI.b()) || object3.equals(object2);
            }
        }
        return false;
    }
}


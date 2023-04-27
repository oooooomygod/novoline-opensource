/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
package net;

import com.google.common.base.Function;
import java.util.Map;
import net.aSh;

class a3R
implements Function {
    private static String a = "CL_00002031";

    public Object apply(Object object) {
        return this.a((Map.Entry)object);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = ",Gm\bx\u001e\r];\u0001\t".toCharArray();
        int n2 = 0;
        int n3 = 39;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x48));
            n3 = n3;
        }
    }

    a3R() {
    }

    public String a(Map.Entry entry) {
        return aSh.b;
    }
}


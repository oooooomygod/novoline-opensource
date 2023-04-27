/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aP2;

/*
 * Renamed from net.aHe
 */
public class ahe_0 {
    public static int a(int[] nArray) {
        aP2.b();
        if (nArray.length <= 0) {
            return 0;
        }
        int n = 0;
        int n2 = 0;
        if (n2 < nArray.length) {
            int n3 = nArray[n2];
            n += n3;
            ++n2;
        }
        n2 = n / nArray.length;
        return n2;
    }
}


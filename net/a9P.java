/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.KM;
import net.a7r_0;
import net.a9Z;
import net.abj_1;
import net.axx_1;
import net.ayf_2;
import net.qg_2;

public class a9P
extends a9Z {
    private static String g = "CL_00002492";
    private KM h;

    public a9P(a9Z a9Z2, KM kM) {
        super(a7r_0.b(a9Z2.d(), a9Z2.d().length), a9Z2.d, abj_1.a(a9Z2.d()));
        this.h = kM;
        this.a();
    }

    private void a(int n) {
        int n2 = this.e.length / 4;
        int n3 = n2 * n;
        float f = axx_1.a(this.e[n3]);
        float f2 = axx_1.a(this.e[n3 + 1]);
        float f3 = axx_1.a(this.e[n3 + 2]);
        float f4 = 0.0f;
        float f5 = 0.0f;
        switch (ayf_2.a[this.a.ordinal()]) {
            case 1: {
                f4 = f * 16.0f;
                f5 = (1.0f - f3) * 16.0f;
                break;
            }
            case 2: {
                f4 = f * 16.0f;
                f5 = f3 * 16.0f;
                break;
            }
            case 3: {
                f4 = (1.0f - f) * 16.0f;
                f5 = (1.0f - f2) * 16.0f;
                break;
            }
            case 4: {
                f4 = f * 16.0f;
                f5 = (1.0f - f2) * 16.0f;
                break;
            }
            case 5: {
                f4 = f3 * 16.0f;
                f5 = (1.0f - f2) * 16.0f;
                break;
            }
            case 6: {
                f4 = (1.0f - f3) * 16.0f;
                f5 = (1.0f - f2) * 16.0f;
            }
        }
        this.e[n3 + 4] = axx_1.e(qg_2.a(this.h, (double)f4));
        this.e[n3 + 4 + 1] = axx_1.e(qg_2.b(this.h, (double)f5));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "D1\r\u001e(\u001e\u00105Ik\u001c".toCharArray();
        int n2 = 0;
        int n3 = 52;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x33));
            n3 = n3;
        }
    }

    private void a() {
        int n = 0;
        while (true) {
            this.a(n);
            ++n;
        }
    }
}


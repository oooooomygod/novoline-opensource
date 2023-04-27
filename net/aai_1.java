/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.StringInvoker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.AP;
import net.KM;
import net.MathHelper;
import net.P8;
import net.a7r_0;
import net.aS0;
import net.aZL;
import net.aet_1;
import net.ajb_0;
import net.akr_1;
import net.akv_2;
import net.alz_2;
import net.axe_2;
import net.dz_0;
import net.my_0;
import net.qg_2;

/*
 * Renamed from net.aaI
 */
public class aai_1 {
    private int g;
    private Set h = axe_2.a(256);
    private int a;
    private boolean f;
    private int b;
    private static String e = "CL_00001054";
    private int d;
    private int i;
    private int c;
    private List j = my_0.b(256);

    public void a() {
        aZL[] aZLArray = (aZL[])aS0.a(this.h, new aZL[aS0.d(this.h)]);
        a7r_0.d(aZLArray);
        for (aZL aZL2 : aZLArray) {
            if (this.a(aZL2)) continue;
            String string = StringInvoker.a(ajb_0.a, new Object[]{qg_2.g(aet_1.d(aZL2)), P8.d(qg_2.b(aet_1.d(aZL2))), P8.d(qg_2.i(aet_1.d(aZL2))), P8.d(this.b), P8.d(this.d), P8.d(this.c), P8.d(this.i)});
            throw new AP(aZL2, string);
        }
        if (this.f) {
            this.b = MathHelper.c(this.b);
            this.d = MathHelper.c(this.d);
        }
    }

    public int c() {
        return this.d;
    }

    static int a(int n, int n2) {
        return aai_1.b(n, n2);
    }

    public int d() {
        return this.b;
    }

    private boolean b(aZL aZL2) {
        int n = MathInvoker.b(aet_1.a(aZL2), aet_1.e(aZL2));
        boolean bl = this.b == 0 && this.d == 0;
        if (this.f) {
            MathHelper.c(this.b);
            MathHelper.c(this.d);
            int n2 = MathHelper.c(this.b + n);
            int n3 = MathHelper.c(this.d + n);
            boolean bl2 = n2 <= this.c;
            boolean bl3 = n3 <= this.i;
            return false;
        }
        boolean bl4 = this.b + n <= this.c;
        boolean bl5 = this.d + n <= this.i;
        return false;
    }

    private static AP a(AP aP10) {
        return aP10;
    }

    private boolean a(aZL aZL2) {
        Iterator iterator = ListInvoker.iterator(this.j);
        while (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            if (akv_2.a((alz_2)object, aZL2)) {
                return true;
            }
            aet_1.b(aZL2);
            if (akv_2.a((alz_2)object, aZL2)) {
                return true;
            }
            aet_1.b(aZL2);
        }
        return this.b(aZL2);
    }

    public List b() {
        Object object;
        ArrayList arrayList = my_0.c();
        Object object2 = ListInvoker.iterator(this.j);
        while (dz_0.c((Iterator)object2)) {
            object = dz_0.b((Iterator)object2);
            akv_2.a((alz_2)object, arrayList);
        }
        object2 = my_0.c();
        object = akr_1.a(arrayList);
        while (dz_0.c((Iterator)object)) {
            Object object3 = dz_0.b((Iterator)object);
            alz_2 alz_22 = (alz_2)object3;
            aZL aZL2 = akv_2.a(alz_22);
            KM kM = aet_1.d(aZL2);
            qg_2.a(kM, this.b, this.d, akv_2.c(alz_22), akv_2.b(alz_22), aet_1.c(aZL2));
            akr_1.a((ArrayList)object2, kM);
        }
        return object2;
    }

    private static int b(int n, int n2) {
        return (n >> n2) + ((n & (1 << n2) - 1) == 0 ? 0 : 1) << n2;
    }

    public void a(KM kM) {
        aZL aZL2 = new aZL(kM, this.a);
        if (this.g > 0) {
            aet_1.a(aZL2, this.g);
        }
        aS0.b(this.h, aZL2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "\b'\u0007\u0001\u007f\u001dRz[m\u0005".toCharArray();
        int n2 = 0;
        int n3 = 7;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x4C));
            n3 = n3;
        }
    }

    public aai_1(int n, int n2, boolean bl, int n3, int n4) {
        this.a = n4;
        this.c = n;
        this.i = n2;
        this.f = bl;
        this.g = n3;
    }
}


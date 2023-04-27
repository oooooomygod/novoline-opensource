/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.anw_0;
import net.ao5_0;
import net.aoa_0;
import net.aoa_1;
import net.aod_1;
import net.aoe_1;
import net.aor_1;
import net.aou_1;
import net.skidunion.Y;
import net.skidunion.b_0;
import net.vp_1;

/*
 * Renamed from net.azO
 */
public class azo_1 {
    private static ListInvoker[] b;

    public static ListInvoker[] b() {
        return b;
    }

    public static ao5_0 a(String string, anw_0 anw_02) {
        return vp_1.a(string, anw_02);
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static aod_1 a(String string, String string2, aoa_1[] aoa_1Array) {
        return vp_1.a(string, string2, aoa_1Array);
    }

    public static aou_1 a() {
        return vp_1.a();
    }

    static {
        if (azo_1.b() != null) {
            azo_1.b(new ListInvoker[1]);
        }
    }

    public static aoa_1 a(String string, String string2) {
        return vp_1.a(string, string2);
    }

    public static ao5_0 a(String string) {
        return vp_1.b(string);
    }

    public static aoa_0 a(b_0 b_02) {
        return vp_1.a(b_02);
    }

    public static aoe_1 a(Y y, String string) {
        return vp_1.a(y, string);
    }

    public static aor_1 b(String string) {
        return vp_1.a(string);
    }
}


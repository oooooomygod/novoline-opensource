/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import java.util.Map;
import net.vr_1;

/*
 * Renamed from net.k
 */
public enum k_0 {
    OPEN_URL(vr_1.k, true),
    OPEN_FILE(vr_1.b, false),
    RUN_COMMAND(vr_1.e, true),
    TWITCH_USER_INFO(vr_1.j, false),
    SUGGEST_COMMAND(vr_1.f, true),
    CHANGE_PAGE(vr_1.l, true);

    private String b;
    private boolean c;
    private static Map<String, k_0> d;

    public static k_0 a(String string) {
        return (k_0)((Object)MapInvoker.c(d, string));
    }

    public boolean b() {
        return this.c;
    }

    static {
        d = MapsInvoker.a();
        for (k_0 k_02 : k_0.values()) {
            MapInvoker.c(d, k_02.a(), (Object)k_02);
        }
    }

    private k_0(String string2, boolean bl) {
        this.b = string2;
        this.c = bl;
    }

    public String a() {
        return this.b;
    }
}


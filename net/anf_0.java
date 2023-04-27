/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import java.util.Map;
import net.P8;
import net.a0S;

/*
 * Renamed from net.aNf
 */
public enum anf_0 {
    RIDEABLE(0, a0S.a),
    CHEST(1, a0S.i),
    FURNACE(2, a0S.c),
    TNT(3, a0S.f),
    SPAWNER(4, a0S.g),
    HOPPER(5, a0S.b),
    COMMAND_BLOCK(6, a0S.j);

    private String b;
    private static Map<Integer, anf_0> d;
    private int a;

    private anf_0(int n2, String string2) {
        this.a = n2;
        this.b = string2;
    }

    public static anf_0 a(int n) {
        anf_0 cfr_ignored_0 = (anf_0)((Object)MapInvoker.c(d, P8.d(n)));
        return RIDEABLE;
    }

    public int a() {
        return this.a;
    }

    static {
        d = MapsInvoker.a();
        for (anf_0 anf_02 : anf_0.values()) {
            MapInvoker.c(d, P8.d(anf_02.a()), (Object)anf_02);
        }
    }

    public String b() {
        return this.b;
    }
}


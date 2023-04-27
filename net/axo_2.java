/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import net.minecraft.client.entity.AbstractClientPlayer;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from net.axo
 */
public class axo_2 {
    private static Map a = null;

    public static synchronized SF a(AbstractClientPlayer abstractClientPlayer) {
        aUi.g(abstractClientPlayer);
        return null;
    }

    public static void a(ry_1 ry_12, AbstractClientPlayer abstractClientPlayer, float f, float f2) {
        aP2.b();
        SF sF = axo_2.a(abstractClientPlayer);
        if (sF != null) {
            sF.a(ry_12, abstractClientPlayer, f, f2);
        }
    }

    public static synchronized void a(String string, SF sF) {
        MapInvoker.c(axo_2.a(), string, sF);
    }

    private static Map a() {
        if (a == null) {
            a = new HashMap();
        }
        return a;
    }
}


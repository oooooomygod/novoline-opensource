/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.gerrygames.viarewind.api.ViaRewindConfigImpl
 */
package net;

import cc.novoline.invoke.ListInvoker;
import de.gerrygames.viarewind.api.ViaRewindConfigImpl;

/*
 * Renamed from net.y8
 */
public class y8_0 {
    private static ListInvoker[] b;

    public static void a(ViaRewindConfigImpl viaRewindConfigImpl) {
        viaRewindConfigImpl.reloadConfig();
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    static {
        if (y8_0.b() == null) {
            y8_0.b(new ListInvoker[2]);
        }
    }

    public static ListInvoker[] b() {
        return b;
    }
}


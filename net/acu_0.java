/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package net;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import net.aON;
import net.ajP;

/*
 * Renamed from net.acu
 */
public class acu_0 {
    private static int[] b;

    public static ajP c(int n) {
        return ajP.a(n);
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    static {
        if (acu_0.b() != null) {
            acu_0.b(new int[5]);
        }
    }

    public static aON b(int n) {
        return ajP.c(n);
    }

    public static ProtocolVersion a(ajP ajP2) {
        return ajP2.b();
    }

    public static int[] b() {
        return b;
    }

    public static ProtocolVersion a(int n) {
        return ajP.b(n);
    }
}


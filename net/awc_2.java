/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package net;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;

/*
 * Renamed from net.awc
 */
public class awc_2 {
    private static String b = "DAece";

    public static String a(ProtocolVersion protocolVersion) {
        return protocolVersion.getName();
    }

    public static void b(String string) {
        b = string;
    }

    static {
        if (awc_2.b() == null) {
            awc_2.b("DAece");
        }
    }

    public static int b(ProtocolVersion protocolVersion) {
        return protocolVersion.getVersion();
    }

    public static String b() {
        return b;
    }
}


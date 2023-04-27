/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.ViaManager
 *  com.viaversion.viaversion.api.platform.ViaPlatform
 */
package net;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.ViaManager;
import com.viaversion.viaversion.api.platform.ViaPlatform;

/*
 * Renamed from net.tE
 */
public class te_1 {
    private static String b;

    public static void a(ViaManager viaManager) {
        Via.init((ViaManager)viaManager);
    }

    public static String b() {
        return b;
    }

    public static ViaPlatform c() {
        return Via.getPlatform();
    }

    static {
        if (te_1.b() != null) {
            te_1.b("bZtJb");
        }
    }

    public static void b(String string) {
        b = string;
    }

    public static ViaManager a() {
        return Via.getManager();
    }
}


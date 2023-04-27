/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javafx.application.Platform
 */
package net;

import javafx.application.Platform;

/*
 * Renamed from net.afB
 */
public class afb_1 {
    private static String b = "OcnPf";

    static {
        if (afb_1.b() == null) {
            afb_1.b("OcnPf");
        }
    }

    public static void a(Runnable runnable) {
        Platform.runLater((Runnable)runnable);
    }

    public static String b() {
        return b;
    }

    public static void b(String string) {
        b = string;
    }
}


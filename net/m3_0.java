/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.awt.Desktop;
import java.net.URI;

/*
 * Renamed from net.m3
 */
public class m3_0 {
    public static void a(Desktop desktop, URI uRI) {
        desktop.browse(uRI);
    }

    public static Desktop a() {
        return Desktop.getDesktop();
    }
}


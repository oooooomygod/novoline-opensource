/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javafx.scene.web.WebEngine
 *  javafx.scene.web.WebView
 */
package net;

import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/*
 * Renamed from net.axI
 */
public class axi_1 {
    private static int[] b;

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static WebEngine a(WebView webView) {
        return webView.getEngine();
    }

    static {
        if (axi_1.b() != null) {
            axi_1.b(new int[3]);
        }
    }

    public static int[] b() {
        return b;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

public class aj7 {
    public static Dimension a(Toolkit toolkit) {
        return toolkit.getScreenSize();
    }

    public static Clipboard b(Toolkit toolkit) {
        return toolkit.getSystemClipboard();
    }

    public static Toolkit a() {
        return Toolkit.getDefaultToolkit();
    }
}


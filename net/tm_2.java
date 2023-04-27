/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;

/*
 * Renamed from net.tm
 */
public class tm_2 {
    private static String[] b;

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static String[] b() {
        return b;
    }

    public static Transferable a(Clipboard clipboard, Object object) {
        return clipboard.getContents(object);
    }

    public static void a(Clipboard clipboard, Transferable transferable, ClipboardOwner clipboardOwner) {
        clipboard.setContents(transferable, clipboardOwner);
    }

    static {
        if (tm_2.b() != null) {
            tm_2.b(new String[2]);
        }
    }
}


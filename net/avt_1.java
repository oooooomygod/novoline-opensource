/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.awt.FileDialog;

/*
 * Renamed from net.avT
 */
public class avt_1 {
    public static void a(FileDialog fileDialog, int n) {
        fileDialog.setMode(n);
    }

    public static String a(FileDialog fileDialog) {
        return fileDialog.getDirectory();
    }

    public static String b(FileDialog fileDialog) {
        return fileDialog.getFile();
    }

    public static void a(FileDialog fileDialog, boolean bl) {
        fileDialog.setVisible(bl);
    }
}


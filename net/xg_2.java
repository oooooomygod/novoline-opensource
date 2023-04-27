/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;

/*
 * Renamed from net.xg
 */
public class xg_2 {
    public static boolean b(Transferable transferable, DataFlavor dataFlavor) {
        return transferable.isDataFlavorSupported(dataFlavor);
    }

    public static Object a(Transferable transferable, DataFlavor dataFlavor) {
        return transferable.getTransferData(dataFlavor);
    }
}


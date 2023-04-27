/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.nio.channels.FileChannel;
import java.nio.file.OpenOption;
import java.nio.file.Path;

public class Gs {
    private static ListInvoker[] b;

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static long a(FileChannel fileChannel) {
        return fileChannel.size();
    }

    static {
        if (Gs.b() != null) {
            Gs.b(new ListInvoker[5]);
        }
    }

    public static FileChannel a(Path path, OpenOption[] openOptionArray) {
        return FileChannel.open(path, openOptionArray);
    }
}


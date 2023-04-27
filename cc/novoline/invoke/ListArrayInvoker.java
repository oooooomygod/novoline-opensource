/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import deobf.GuiScreen;
import net.sy_0;

public class ListArrayInvoker {
    private static ListInvoker[] b;

    static {
        if (ListArrayInvoker.b() != null) {
            ListArrayInvoker.b(new ListInvoker[4]);
        }
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static void a(GuiScreen guiScreen) {
        sy_0.a(guiScreen);
    }
}


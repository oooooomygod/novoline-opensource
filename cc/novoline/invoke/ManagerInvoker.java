/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.modules.AbstractModule;
import java.util.List;
import net.we_1;

public class ManagerInvoker {
    private static ListInvoker[] b;

    public static List a(AbstractModule abstractModule) {
        return we_1.a(abstractModule);
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static void put(Setting setting) {
        we_1.a(setting);
    }

    static {
        if (ManagerInvoker.b() == null) {
            ManagerInvoker.b(new ListInvoker[4]);
        }
    }

    public static List a() {
        return we_1.a();
    }
}


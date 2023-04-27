/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.TaskManager;
import java.util.List;
import net.FutureTask;

/*
 * Renamed from net.acI
 */
public class aci_0 {
    private static ListInvoker[] b;

    public static ListInvoker[] b() {
        return b;
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    static {
        if (aci_0.b() == null) {
            aci_0.b(new ListInvoker[3]);
        }
    }

    public static void a(TaskManager taskManager, FutureTask futureTask) {
        taskManager.a(futureTask);
    }

    public static List a(TaskManager taskManager) {
        return taskManager.a();
    }
}


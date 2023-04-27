/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.utils.tasks;

import cc.novoline.invoke.EventManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.FutureTask;

public class TaskManager {
    private List<FutureTask> futureTasks = new CopyOnWriteArrayList<FutureTask>();

    public List<FutureTask> a() {
        return this.futureTasks;
    }

    public void a(FutureTask futureTask) {
        ListInvoker.add(this.futureTasks, futureTask);
        EventManagerInvoker.a(this);
    }
}


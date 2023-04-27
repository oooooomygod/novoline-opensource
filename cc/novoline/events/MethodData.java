/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.events;

import cc.novoline.events.EventManager;
import cc.novoline.invoke.ListInvoker;
import java.lang.reflect.Method;

class MethodData {
    private byte a;
    private Method b;
    private Object c;

    public MethodData(Object object, Method method, byte by) {
        this.c = object;
        EventManager.b();
        this.b = method;
        this.a = by;
        ListInvoker.b(new ListInvoker[1]);
    }

    public Object b() {
        return this.c;
    }

    public Method c() {
        return this.b;
    }

    public byte a() {
        return this.a;
    }
}


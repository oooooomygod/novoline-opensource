/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import cc.novoline.events.Event;
import cc.novoline.events.EventManager;

public class EventManagerInvoker {
    private static boolean b;

    public static void a(Object object) {
        EventManager.a(object);
    }

    public static void b(Object object) {
        EventManager.b(object);
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static Event call(Event event) {
        return EventManager.a(event);
    }

    public static boolean b() {
        return b;
    }

    public static boolean a() {
        EventManagerInvoker.b();
        return true;
    }

    static {
        if (!EventManagerInvoker.b()) {
            EventManagerInvoker.b(true);
        }
    }
}


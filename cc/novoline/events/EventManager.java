/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.events;

import cc.novoline.events.Event;
import cc.novoline.events.EventTarget;
import cc.novoline.events.MethodData;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import net.FG;
import net.VT;
import net.aL8;
import net.aS0;
import net.ahz_0;
import net.ara_2;
import net.az_2;
import net.dz_0;
import net.ms_0;

public class EventManager {
    private static int b;
    private static Map<Class<? extends Event>, List<MethodData>> a;

    public static void b(int n) {
        b = n;
    }

    private static void a(Method method, Object object) {
        block5: {
            MethodData methodData;
            Class clazz;
            block4: {
                EventManager.b();
                clazz = VT.b(method)[0];
                methodData = new MethodData(object, method, az_2.a((EventTarget)VT.b(method, EventTarget.class)));
                if (!VT.d(methodData.c())) {
                    VT.a(methodData.c(), true);
                }
                if (!MapInvoker.b(a, clazz)) break block4;
                if (ListInvoker.contains((List)MapInvoker.c(a, clazz), methodData)) break block5;
                ListInvoker.add((List)MapInvoker.c(a, clazz), methodData);
                EventManager.b(clazz);
            }
            MapInvoker.c(a, clazz, new ahz_0(methodData));
        }
    }

    private static boolean lambda$unregister$1(Object object, MethodData methodData) {
        return methodData.b().equals(object);
    }

    private static void a(MethodData methodData, Event event) {
        try {
            VT.a(methodData.c(), methodData.b(), new Object[]{event});
        }
        catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException exception) {}
    }

    public static void a(Object object) {
        Method[] methodArray = ara_2.f(object.getClass());
        int n = methodArray.length;
        EventManager.a();
        int n2 = 0;
        if (n2 < n) {
            Method method = methodArray[n2];
            if (EventManager.a(method)) {
                // empty if block
            }
            EventManager.a(method, object);
            ++n2;
        }
    }

    private static boolean a(Method method) {
        EventManager.b();
        return VT.b(method).length != 1 || !VT.a(method, EventTarget.class);
    }

    public static int b() {
        return b;
    }

    public static void a(Object object, Class<? extends Event> clazz) {
        Method[] methodArray = ara_2.f(object.getClass());
        int n = methodArray.length;
        int n2 = EventManager.a();
        int n3 = 0;
        if (n3 < n) {
            Method method = methodArray[n3];
            if (EventManager.a(method, clazz)) {
                // empty if block
            }
            EventManager.a(method, object);
            ++n3;
        }
        if (ListInvoker.b() != null) {
            EventManager.b(++n2);
        }
    }

    public static int a() {
        EventManager.b();
        return 1;
    }

    public static Event a(Event event) {
        EventManager.b();
        List cfr_ignored_0 = (List)MapInvoker.c(a, event.getClass());
        return event;
    }

    static {
        a = new HashMap<Class<? extends Event>, List<MethodData>>();
        EventManager.b(80);
    }

    private static void b(Class<? extends Event> clazz) {
        EventManager.a();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        byte[] byArray = aL8.g;
        int n = byArray.length;
        int n2 = 0;
        if (n2 < n) {
            MethodData methodData;
            byte by = byArray[n2];
            Iterator iterator = ListInvoker.iterator((List)MapInvoker.c(a, clazz));
            if (dz_0.c(iterator) && (methodData = (MethodData)dz_0.b(iterator)).a() == by) {
                ListInvoker.add(copyOnWriteArrayList, methodData);
            }
            ++n2;
        }
        MapInvoker.c(a, clazz, copyOnWriteArrayList);
    }

    public static void a(boolean bl) {
        EventManager.a();
        Iterator iterator = aS0.f(MapInvoker.b(a));
        while (dz_0.c(iterator)) {
            if (bl && !ListInvoker.isEmpty((List)FG.a((Map.Entry)dz_0.b(iterator)))) continue;
            dz_0.a(iterator);
            break;
        }
    }

    private static boolean lambda$unregister$0(Object object, MethodData methodData) {
        return methodData.b().equals(object);
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private static boolean a(Method method, Class<? extends Event> clazz) {
        EventManager.b();
        return EventManager.a(method) || !VT.b(method)[0].equals(clazz);
    }

    public static void b(Object object, Class<? extends Event> clazz) {
        EventManager.b();
        if (MapInvoker.b(a, clazz)) {
            ListInvoker.removeIf((List)MapInvoker.c(a, clazz), arg_0 -> EventManager.lambda$unregister$1(object, arg_0));
            EventManager.a(true);
        }
    }

    private EventManager() {
    }

    public static void a(Class<? extends Event> clazz) {
        EventManager.b();
        Iterator iterator = aS0.f(MapInvoker.b(a));
        while (dz_0.c(iterator)) {
            if (!((Class)FG.b((Map.Entry)dz_0.b(iterator))).equals(clazz)) continue;
            dz_0.a(iterator);
            break;
        }
    }

    public static void b(Object object) {
        EventManager.b();
        Iterator iterator = ms_0.a(a.values());
        if (dz_0.c(iterator)) {
            List list = (List)dz_0.b(iterator);
            ListInvoker.removeIf(list, arg_0 -> EventManager.lambda$unregister$0(object, arg_0));
        }
        EventManager.a(true);
    }
}


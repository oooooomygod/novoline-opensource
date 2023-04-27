/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.IntProperty;
import java.util.Collection;
import java.util.List;
import net.BooleanProperty;
import net.DoubleProperty;
import net.E3;
import net.EQ;
import net.FloatProperty;
import net.ListProperty;
import net.StringProperty;
import net.ae6_0;
import net.ci_1;
import net.eu_0;

/*
 * Renamed from net.asp
 */
public class asp_2 {
    private static ListInvoker[] b;

    public static ListProperty a(List list) {
        return ci_1.a(list);
    }

    public static E3 a(Long l4) {
        return ci_1.a(l4);
    }

    public static StringProperty a(String string) {
        return ci_1.a(string);
    }

    public static ListProperty a(Object object, Object object2, Object object3) {
        return ci_1.a(object, object2, object3);
    }

    public static ListProperty a(Object object, Object object2) {
        return ci_1.a(object, object2);
    }

    static {
        if (asp_2.b() == null) {
            asp_2.b(new ListInvoker[2]);
        }
    }

    public static IntProperty a(Integer n) {
        return ci_1.a(n);
    }

    public static ListProperty a(Object[] objectArray) {
        return ci_1.a(objectArray);
    }

    public static ListProperty a(Collection collection) {
        return ci_1.a(collection);
    }

    public static FloatProperty a(Float f) {
        return ci_1.a(f);
    }

    public static BooleanProperty a(Boolean bl) {
        return ci_1.a(bl);
    }

    public static ListProperty a(Object object) {
        return ci_1.a(object);
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static BooleanProperty d() {
        return ci_1.g();
    }

    public static BooleanProperty c() {
        return ci_1.c();
    }

    public static DoubleProperty a(Double d) {
        return ci_1.a(d);
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static EQ a(ae6_0 ae6_02) {
        return ci_1.a(ae6_02);
    }

    public static eu_0 b(Integer n) {
        return ci_1.b(n);
    }
}


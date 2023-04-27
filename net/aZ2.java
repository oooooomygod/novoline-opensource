/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.text.SimpleDateFormat;
import java.util.Date;

public class aZ2 {
    private static ListInvoker[] b;

    public static String a(SimpleDateFormat simpleDateFormat, Object object) {
        return simpleDateFormat.format(object);
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static String a(SimpleDateFormat simpleDateFormat, Date date) {
        return simpleDateFormat.format(date);
    }

    public static Date a(SimpleDateFormat simpleDateFormat, String string) {
        return simpleDateFormat.parse(string);
    }

    static {
        if (aZ2.b() == null) {
            aZ2.b(new ListInvoker[1]);
        }
    }

    public static ListInvoker[] b() {
        return b;
    }
}


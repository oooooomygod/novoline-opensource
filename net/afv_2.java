/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Calendar;
import java.util.Date;

/*
 * Renamed from net.afv
 */
public class afv_2 {
    public static Date a(Calendar calendar) {
        return calendar.getTime();
    }

    public static int a(Calendar calendar, int n) {
        return calendar.get(n);
    }

    public static void a(Calendar calendar, long l4) {
        calendar.setTimeInMillis(l4);
    }

    public static void a(Calendar calendar, Date date) {
        calendar.setTime(date);
    }

    public static Calendar a() {
        return Calendar.getInstance();
    }

    public static void a(Calendar calendar, int n, int n2) {
        calendar.add(n, n2);
    }
}


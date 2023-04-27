/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import java.util.Map;
import net.BS;
import net.NBTTagCompound;
import net.World;
import net.Y_;
import net.a4C;
import net.aK4;
import net.aK5;
import net.aKA;
import net.aKD;
import net.aKR;
import net.aKU;
import net.aL0;
import net.aS8;
import net.acx_1;
import net.aka_0;
import net.akl_1;
import net.any_2;
import net.ara_2;
import net.awj_0;
import net.ch_2;
import net.lr_2;
import net.tn_0;
import net.v1_0;
import org.apache.logging.log4j.Logger;

public class _6 {
    private static Map<String, Class<? extends aKU>> e;
    private static Map<Class<? extends Y_>, String> d;
    private static Map<Class<? extends aKU>, String> a;
    private static Map<String, Class<? extends Y_>> c;
    private static Logger b;

    public static String a(Y_ y_) {
        return (String)MapInvoker.c(d, y_.getClass());
    }

    private static void a(Class<? extends aKU> clazz, String string) {
        MapInvoker.c(e, string, clazz);
        MapInvoker.c(a, clazz, string);
    }

    static {
        b = LogManagerInvoker.c();
        e = MapsInvoker.a();
        a = MapsInvoker.a();
        c = MapsInvoker.a();
        d = MapsInvoker.a();
        _6.a(aKR.class, aS8.c);
        _6.a(aka_0.class, aS8.d);
        _6.a(aK4.class, aS8.a);
        _6.a(aKD.class, aS8.f);
        _6.a(aK5.class, aS8.i);
        _6.a(aKA.class, aS8.j);
        v1_0.a();
        BS.a();
        awj_0.a();
        akl_1.b();
        lr_2.a();
        acx_1.a();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public static String a(aKU aKU2) {
        return (String)MapInvoker.c(a, aKU2.getClass());
    }

    static void b(Class<? extends Y_> clazz, String string) {
        MapInvoker.c(c, string, clazz);
        MapInvoker.c(d, clazz, string);
    }

    public static Y_ b(NBTTagCompound nBTTagCompound, World world) {
        Y_ y_ = null;
        try {
            Class clazz = (Class)MapInvoker.c(c, tn_0.m(nBTTagCompound, aS8.l));
            y_ = (Y_)ara_2.q(clazz);
        }
        catch (Exception exception) {
            LoggerInvoker.warn(b, aL0.a(aL0.a(new StringBuilder(), aS8.n), tn_0.m(nBTTagCompound, aS8.m)).toString());
            ch_2.a(exception);
        }
        any_2.a(y_, world, nBTTagCompound);
        return y_;
    }

    public static aKU a(NBTTagCompound nBTTagCompound, World world) {
        aKU aKU2 = null;
        try {
            Class clazz = (Class)MapInvoker.c(e, tn_0.m(nBTTagCompound, aS8.p));
            aKU2 = (aKU)ara_2.q(clazz);
        }
        catch (Exception exception) {
            LoggerInvoker.warn(b, aL0.a(aL0.a(new StringBuilder(), aS8.g), tn_0.m(nBTTagCompound, aS8.e)).toString());
            ch_2.a(exception);
        }
        a4C.a(aKU2, world, nBTTagCompound);
        return aKU2;
    }
}


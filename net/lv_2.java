/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.util.HashMap;
import net.AJ;
import net.N1;
import net.apb_1;
import net.ara_2;
import net.at2;
import net.avx_0;
import net.ds_2;
import net.oc_1;
import net.tk_0;
import net.wf_2;
import org.apache.logging.log4j.Logger;

/*
 * Renamed from net.lv
 */
public class lv_2 {
    private static Logger c;
    private HashMap<String, MethodHandle> b = new HashMap();
    private static Field d;
    private static MethodHandles.Lookup a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public lv_2(String string) {
        try {
            Class clazz = ara_2.a(string);
            Field field = d;
            Field[] fieldArray = ara_2.e(clazz);
            int n = fieldArray.length;
            int n2 = 0;
            while (true) {
                if (n2 >= n) {
                    return;
                }
                Field field2 = fieldArray[n2];
                avx_0.a(field2, true);
                int n3 = avx_0.b(field2);
                if (AJ.d(n3)) {
                    avx_0.a(field, (Object)field2, n3 & 0xFFFFFFEF);
                }
                MethodHandle methodHandle = N1.a(a, field2);
                methodHandle = at2.a(methodHandle, apb_1.a(apb_1.a(at2.a(methodHandle)), Void.TYPE));
                ds_2.a(this.b, avx_0.a(field2), methodHandle);
                ++n2;
            }
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new RuntimeException(wf_2.c);
        }
        catch (Exception exception) {
            throw new RuntimeException(wf_2.b);
        }
    }

    private static ClassNotFoundException a(ClassNotFoundException classNotFoundException) {
        return classNotFoundException;
    }

    public void a(String string, Object object) {
        oc_1.a(oc_1.a(ds_2.a(this.b, string)), arg_0 -> lv_2.lambda$updateFieldIfPresent$0(object, arg_0));
    }

    static {
        MethodHandles.Lookup lookup;
        c = LogManagerInvoker.c();
        try {
            d = ara_2.a(Field.class, wf_2.d);
            avx_0.a(d, true);
        }
        catch (NoSuchFieldException noSuchFieldException) {
            LoggerInvoker.b(c, noSuchFieldException);
        }
        try {
            Field field = ara_2.a(MethodHandles.Lookup.class, wf_2.a);
            avx_0.a(field, true);
            lookup = (MethodHandles.Lookup)avx_0.a(field, null);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            lookup = tk_0.a();
        }
        a = lookup;
    }

    private static void lambda$updateFieldIfPresent$0(Object object, MethodHandle methodHandle) {
        try {
            at2.a(methodHandle, object);
        }
        catch (Throwable throwable) {
            LoggerInvoker.b(c, throwable);
        }
    }
}


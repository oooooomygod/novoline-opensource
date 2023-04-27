/*
 * Decompiled with CFR 0.152.
 */
package net.skidunion;

import cc.novoline.invoke.ListInvoker;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;

import novoline0.Loader;
import sun.reflect.CallerSensitive;

public class Protection {
    private static ListInvoker[] p;
    public double i;
    public static String e;
    private boolean M;
    public static StringBuilder u;
    public static String w;
    public boolean s;
    private static AtomicBoolean d;
    private boolean P;
    private String z;
    public static Object E;
    public static boolean g;
    public static String I;
    private boolean C;
    public static ArrayList<Object> m;
    public static boolean r = true;
    public static String q;
    private boolean t;
    private a_0 O;
    public String v;
    public static String K;
    public String F;
    private String L;
    public String j;
    public double J;
    public int R;
    public static String A;
    public static byte o;
    private boolean D;
    public long c;
    public boolean G;
    public static String h;
    private boolean B;
    public static Object x;
    private boolean N;
    public String n;
    public static ArrayList<String> b;
    private String H;
    public static int k;
    public String a;
    public static boolean y;
    public static boolean l;
    public static String f;
    public String Q;

    public static native void b(ListInvoker[] var0);

    public static native ListInvoker[] b();

    private native String c();

    private native String a(String var1, String var2, String var3);

    private static native String lambda$pushIntoStack$0();

    private native String d(String var1);

    private native void b(Object var1);

    private native String a(String var1, String var2);

    private native void h();

    private native String c(String var1);

    private native String i();

    public native void a(String var1) throws R;

    public native void a(Object var1);

    private native boolean b(String var1, String var2);

    public native void f();

    public native String g();

    public Protection(a_0 a_02) throws R {
        this(a_02, true, false);
    }

    public Protection(a_0 a_02, boolean bl, boolean bl2) throws R {
        Protection.b();
        this.a(a_02, bl, bl2);
        if (ListInvoker.b() != null) {
            Protection.b(new ListInvoker[5]);
        }
    }

    static {
        Loader.registerNativesForClass(2);
        Protection.native_special_clinit18();
    }

    private native String m();

    @CallerSensitive
    private native void a(a_0 var1, boolean var2, boolean var3) throws R;

    private native void b(String var1);

    public native boolean e();

    public native boolean l();

    public native boolean k();

    private native int d();

    public native void a(Throwable var1);

    private native boolean j();

    private static native Throwable b(Throwable var0);

    private static native /* synthetic */ void native_special_clinit18();

    private static /* synthetic */ Supplier invokedynamic$b$0() {
        return Protection::lambda$pushIntoStack$0;
    }
}


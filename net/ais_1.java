/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.StringInvoker;
import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Pattern;
import net.W2;
import net.a0D;
import net.a0h_0;
import net.a48;
import net.a4E;
import net.aH1;
import net.aL0;
import net.aLA;
import net.aLL;
import net.aNK;
import net.aS0;
import net.agy_2;
import net.ak_2;
import net.aox_2;
import net.aq8_0;
import net.ara_2;
import net.auq_0;
import net.dk_0;
import net.dk_1;
import net.dz_0;
import net.mk_0;
import net.ow_1;
import net.ps_0;
import net.ys_2;

/*
 * Renamed from net.aiS
 */
public class ais_1 {
    private static Set<String> c;
    private static Pattern a;
    private static Pattern b;

    static {
        b = ow_1.c(a48.ac);
        a = ow_1.c(a48.u);
        c = ais_1.a();
    }

    private static aH1 a(String string, Properties properties, Set<String> set, a0D[] a0DArray) {
        String[] stringArray;
        String string2 = a48.F;
        a0D.k();
        String string3 = aL0.a(aL0.a(new StringBuilder(), string2), string).toString();
        if (aS0.c(set, string3)) {
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), a48.at), string).toString());
            return null;
        }
        aS0.b(set, string);
        aH1 aH12 = new aH1(string);
        String string4 = dk_1.a(properties, string3);
        String[] stringArray2 = stringArray = ys_2.a(string4, a48.av);
        int n = stringArray2.length;
        int n2 = 0;
        if (n2 < n) {
            Object object;
            Object object2;
            Object object3;
            String string5 = stringArray2[n2];
            if (StringInvoker.e(string5, string2)) {
                object3 = StringInvoker.a(string5, StringInvoker.c(string2));
                object2 = ais_1.a((String)object3, properties, set, a0DArray);
                if (aH12 != null) {
                    aLA.a(aH12, (aH1)object2);
                    aLA.a(aH12, aLA.a((aH1)object2));
                }
            }
            if (((String[])(object3 = ys_2.a(string5, a48.y))).length == 1) {
                object2 = object3[0];
                boolean bl = true;
                if (StringInvoker.e((String)object2, a48.i)) {
                    bl = false;
                    object2 = StringInvoker.a((String)object2, 1);
                }
                object = a48.a6;
                a0D a0D2 = aNK.a((String)object2, a0DArray);
                if (!(a0D2 instanceof a0h_0)) {
                    ys_2.d(aL0.a(aL0.a(new StringBuilder(), a48.af), (String)object2).toString());
                }
                aLA.a(aH12, (String)object2, StringInvoker.a(bl));
                mk_0.b(a0D2, true);
            }
            if (((String[])object3).length != 2) {
                ys_2.d(aL0.a(aL0.a(new StringBuilder(), a48.ar), string5).toString());
            }
            object2 = object3[0];
            String string6 = object3[1];
            object = aNK.a((String)object2, a0DArray);
            if (object == null) {
                ys_2.d(aL0.a(aL0.a(new StringBuilder(), a48.N), string5).toString());
            }
            if (!mk_0.d((a0D)object, string6)) {
                ys_2.d(aL0.a(aL0.a(new StringBuilder(), a48.aV), string5).toString());
            }
            mk_0.b((a0D)object, true);
            aLA.a(aH12, (String)object2, string6);
            ++n2;
        }
        return aH12;
    }

    private static String[] a(String string, String[] stringArray) {
        a0D.k();
        ArrayList arrayList = new ArrayList();
        String[] stringArray2 = stringArray;
        int n = stringArray2.length;
        int n2 = 0;
        if (n2 < n) {
            String string2 = stringArray2[n2];
            if (StringInvoker.a(string, (CharSequence)string2)) {
                ListInvoker.add(arrayList, string2);
            }
            ++n2;
        }
        stringArray2 = (String[])ListInvoker.toArray(arrayList, new String[ListInvoker.size(arrayList)]);
        return stringArray2;
    }

    private static String[] a(W2 w2, String string) {
        try {
            ArrayList<String> arrayList = new ArrayList<String>();
            ais_1.a(string, w2, 0, arrayList, 0);
            return new String[0];
        }
        catch (IOException iOException) {
            ys_2.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), ara_2.b(iOException.getClass())), a48.aC), a4E.a(iOException)).toString());
            return new String[0];
        }
    }

    private static a0D a(String string, String string2) {
        a0D.k();
        a0D a0D2 = null;
        a0D2 = aq8_0.a(string, string2);
        if (a0D2 == null) {
            a0D2 = ps_0.a(string, string2);
        }
        if (a0D2 != null) {
            return a0D2;
        }
        if (a0D2 == null) {
            a0D2 = aox_2.a(string, string2);
        }
        if (a0D2 == null) {
            a0D2 = agy_2.a(string, string2);
        }
        return a0D2 != null && aS0.c(c, mk_0.i(a0D2)) ? a0D2 : null;
    }

    private static boolean a(a0D a0D2, String[] stringArray) {
        String[] stringArray2 = stringArray;
        int n = stringArray2.length;
        a0D.k();
        int n2 = 0;
        if (n2 < n) {
            String string = stringArray2[n2];
            if (mk_0.e(a0D2, string)) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public static BufferedReader a(BufferedReader bufferedReader, String string, W2 w2, int n, List<String> list, int n2) throws IOException {
        a0D.r();
        int n3 = StringInvoker.j(string, a48.aI);
        StringInvoker.b(string, 0, n3);
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        int n4 = -1;
        new LinkedHashSet();
        auq_0.c(bufferedReader);
        char[] cArray = aLL.a(charArrayWriter);
        CharArrayReader charArrayReader = new CharArrayReader(cArray);
        return new BufferedReader(charArrayReader);
    }

    public static Map<String, a0D[]> a(Properties properties, aH1[] aH1Array, a0D[] a0DArray) {
        HashMap<String, a0D[]> hashMap = new HashMap<String, a0D[]>();
        ais_1.a(a48.aY, properties, hashMap, aH1Array, a0DArray);
        return MapInvoker.e(hashMap) ? null : hashMap;
    }

    private static void a(W2 w2, String string, Map<String, a0D> map) {
        a0D.r();
        String[] stringArray = ais_1.a(w2, string);
        String[] stringArray2 = stringArray;
        int n = stringArray2.length;
        int n2 = 0;
        if (n2 < n) {
            String string2 = stringArray2[n2];
            a0D a0D2 = ais_1.a(string2, string);
            if (!(StringInvoker.e(mk_0.i(a0D2), ak_2.a()) || mk_0.b(a0D2) && !ais_1.a(a0D2, stringArray))) {
                String string3 = mk_0.i(a0D2);
                a0D a0D3 = (a0D)MapInvoker.c(map, string3);
                if (a0D3 != null) {
                    if (!ys_2.a((Object)mk_0.o(a0D3), (Object)mk_0.o(a0D2))) {
                        ys_2.d(aL0.a(aL0.a(new StringBuilder(), a48.a5), mk_0.i(a0D2)).toString());
                        ys_2.d(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), a48.A), ys_2.a(mk_0.m(a0D3))), a48.S), mk_0.o(a0D3)).toString());
                        ys_2.d(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), a48.o), ys_2.a(mk_0.m(a0D2))), a48.ag), mk_0.o(a0D2)).toString());
                        mk_0.a(a0D3, false);
                    }
                    if (mk_0.j(a0D3) == null || StringInvoker.c(mk_0.j(a0D3)) <= 0) {
                        mk_0.b(a0D3, mk_0.j(a0D2));
                    }
                    mk_0.a(a0D3, mk_0.m(a0D2));
                }
                MapInvoker.c(map, string3, a0D2);
            }
            ++n2;
        }
    }

    private static String a(String string, W2 w2, int n, List<String> list, int n2) throws IOException {
        a0D.r();
        if (n2 >= 10) {
            throw new IOException(aL0.a(aL0.a(aL0.c(aL0.a(new StringBuilder(), a48.aW), n2), a48.ab), string).toString());
        }
        ++n2;
        dk_0.b(w2, string);
        return null;
    }

    private static void a(W2 w2, String string, String[] stringArray, Map<String, a0D> map) {
        String[] stringArray2 = stringArray;
        a0D.k();
        int n = stringArray2.length;
        int n2 = 0;
        if (n2 < n) {
            String string2 = stringArray2[n2];
            if (!string2.equals(a48.aF)) {
                String string3 = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), string), a48.O), string2), a48.a2).toString();
                String string4 = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), string), a48.Q), string2), a48.M).toString();
                ais_1.a(w2, string3, map);
                ais_1.a(w2, string4, map);
            }
            ++n2;
        }
    }

    private static boolean a(String string, Properties properties, Map<String, a0D[]> map, aH1[] aH1Array, a0D[] a0DArray) {
        a0D.r();
        dk_1.a(properties, string);
        return false;
    }

    private static Set<String> a() {
        HashSet<String> hashSet = new HashSet<String>();
        aS0.b(hashSet, a48.K);
        aS0.b(hashSet, a48.ap);
        aS0.b(hashSet, a48.aS);
        aS0.b(hashSet, a48.v);
        aS0.b(hashSet, a48.a0);
        aS0.b(hashSet, a48.g);
        aS0.b(hashSet, a48.aE);
        aS0.b(hashSet, a48.aX);
        aS0.b(hashSet, a48.r);
        aS0.b(hashSet, a48.aj);
        aS0.b(hashSet, a48.aO);
        aS0.b(hashSet, a48.aT);
        aS0.b(hashSet, a48.a1);
        aS0.b(hashSet, a48.aa);
        aS0.b(hashSet, a48.aM);
        aS0.b(hashSet, a48.l);
        aS0.b(hashSet, a48.aw);
        aS0.b(hashSet, a48.k);
        aS0.b(hashSet, a48.H);
        aS0.b(hashSet, a48.z);
        aS0.b(hashSet, a48.az);
        aS0.b(hashSet, a48.V);
        aS0.b(hashSet, a48.aD);
        aS0.b(hashSet, a48.n);
        aS0.b(hashSet, a48.ak);
        aS0.b(hashSet, a48.ay);
        aS0.b(hashSet, a48.a4);
        aS0.b(hashSet, a48.aQ);
        aS0.b(hashSet, a48.c);
        aS0.b(hashSet, a48.X);
        aS0.b(hashSet, a48.P);
        aS0.b(hashSet, a48.d);
        aS0.b(hashSet, a48.W);
        aS0.b(hashSet, a48.a7);
        return hashSet;
    }

    public static aH1[] a(Properties properties, a0D[] a0DArray) {
        Object object;
        String string;
        String string2 = a48.aH;
        ArrayList arrayList = new ArrayList();
        a0D.k();
        aH1[] aH1Array = aS0.f(dk_1.c(properties));
        if (dz_0.c((Iterator)aH1Array) && StringInvoker.e(string = (String)(object = dz_0.b((Iterator)aH1Array)), string2)) {
            String string3 = StringInvoker.a(string, StringInvoker.c(string2));
            dk_1.a(properties, string);
            HashSet<String> hashSet = new HashSet<String>();
            aH1 aH12 = ais_1.a(string3, properties, hashSet, a0DArray);
            ListInvoker.add(arrayList, aH12);
        }
        if (ListInvoker.size(arrayList) <= 0) {
            return null;
        }
        aH1Array = (aH1[])ListInvoker.toArray(arrayList, new aH1[ListInvoker.size(arrayList)]);
        return aH1Array;
    }

    public static a0D[] a(W2 w2, String[] stringArray, List<Integer> list) {
        a0D.k();
        return new a0D[0];
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}


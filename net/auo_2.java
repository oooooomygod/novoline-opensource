/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  org.apache.commons.io.Charsets
 */
package net;

import cc.novoline.invoke.IOUtilsInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.common.base.Splitter;
import deobf.IResourcePack;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import net.DZ;
import net.I18n;
import net.ResourceLocation;
import net.a4E;
import net.aL0;
import net.aP2;
import net.aVI;
import net.amx_2;
import net.avv_0;
import net.dz_0;
import net.ow_1;
import net.wk_2;
import net.ys_2;
import org.apache.commons.io.Charsets;

/*
 * Renamed from net.auo
 */
public class auo_2 {
    private static Pattern b;
    private static Splitter a;

    public static String a(String string, String string2) {
        aP2.b();
        String string3 = I18n.format(string, new Object[0]);
        return string3 != null && !string3.equals(string) ? string3 : string2;
    }

    static {
        a = amx_2.a(amx_2.a('='), 2);
        b = ow_1.c(aVI.h);
    }

    public static String f() {
        return I18n.format(aVI.b, new Object[0]);
    }

    public static String d() {
        return I18n.format(aVI.d, new Object[0]);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public static String c() {
        return I18n.format(aVI.e, new Object[0]);
    }

    public static void a() {
        aP2.b();
        Map map = I18n.b();
        ArrayList arrayList = new ArrayList();
        String string = aVI.c;
        String string2 = aVI.i;
        String string3 = aVI.g;
        ListInvoker.add(arrayList, aL0.a(aL0.a(aL0.a(new StringBuilder(), string), string2), string3).toString());
        if (!ys_2.ax().gameSettings.equals(string2)) {
            ListInvoker.add(arrayList, aL0.a(aL0.a(aL0.a(new StringBuilder(), string), ys_2.ax().gameSettings), string3).toString());
        }
        String[] stringArray = (String[])ListInvoker.toArray(arrayList, new String[ListInvoker.size(arrayList)]);
        auo_2.a(ys_2.g(), stringArray, map);
        IResourcePack[] iResourcePackArray = ys_2.d();
        int n = 0;
        if (n < iResourcePackArray.length) {
            IResourcePack iResourcePack = iResourcePackArray[n];
            auo_2.a(iResourcePack, stringArray, map);
            ++n;
        }
    }

    private static void a(IResourcePack iResourcePack, String[] stringArray, Map map) {
        aP2.b();
        int n = 0;
        if (n < stringArray.length) {
            block6: {
                String string = stringArray[n];
                ResourceLocation resourceLocation = new ResourceLocation(string);
                if (!avv_0.b(iResourcePack, resourceLocation)) break block6;
                InputStream inputStream = avv_0.a(iResourcePack, resourceLocation);
                try {
                    auo_2.a(inputStream, map);
                }
                catch (IOException iOException) {
                    a4E.b(iOException);
                }
            }
            ++n;
        }
    }

    public static void a(InputStream inputStream, Map map) throws IOException {
        String[] stringArray;
        String string;
        aP2.b();
        Iterator iterator = ListInvoker.iterator(IOUtilsInvoker.a(inputStream, Charsets.UTF_8));
        if (dz_0.c(iterator) && !StringInvoker.g(string = (String)dz_0.b(iterator)) && StringInvoker.b(string, 0) != '#' && (stringArray = (String[])DZ.a(amx_2.b(a, string), String.class)) != null && stringArray.length == 2) {
            String string2 = stringArray[0];
            String string3 = wk_2.a(ow_1.a(b, stringArray[1]), aVI.f);
            MapInvoker.c(map, string2, string3);
        }
    }

    public static String e() {
        return I18n.format(aVI.a, new Object[0]);
    }

    public static String b() {
        return I18n.format(aVI.j, new Object[0]);
    }

    public static String a(String string) {
        return I18n.format(string, new Object[0]);
    }
}


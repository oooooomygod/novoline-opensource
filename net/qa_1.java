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
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import com.google.common.base.Splitter;
import java.io.IOException;
import java.io.InputStream;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import net.DZ;
import net.I9;
import net.aL0;
import net.amx_2;
import net.ara_2;
import net.dz_0;
import net.ow_1;
import net.wk_2;
import org.apache.commons.io.Charsets;

/*
 * Renamed from net.qA
 */
public class qa_1 {
    private Map<String, String> a = MapsInvoker.a();
    private static Pattern d = ow_1.c(I9.c);
    private static qa_1 b;
    private long e;
    private static Splitter c;

    static {
        c = amx_2.a(amx_2.a('='), 2);
        b = new qa_1();
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public qa_1() {
        try {
            InputStream inputStream = ara_2.b(qa_1.class, I9.b);
            Iterator iterator = ListInvoker.iterator(IOUtilsInvoker.a(inputStream, Charsets.UTF_8));
            while (true) {
                String[] stringArray;
                if (!dz_0.c(iterator)) {
                    this.e = SystemInvoker.f();
                    return;
                }
                String string = (String)dz_0.b(iterator);
                if (StringInvoker.g(string) || StringInvoker.b(string, 0) == '#' || (stringArray = (String[])DZ.a(amx_2.b(c, string), String.class)).length != 2) continue;
                String string2 = stringArray[0];
                String string3 = wk_2.a(ow_1.a(d, stringArray[1]), I9.a);
                MapInvoker.c(this.a, string2, string3);
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    public static synchronized void a(Map<String, String> map) {
        MapInvoker.d(qa_1.b.a);
        MapInvoker.a(qa_1.b.a, map);
        qa_1.b.e = SystemInvoker.f();
    }

    private String b(String string) {
        String cfr_ignored_0 = (String)MapInvoker.c(this.a, string);
        return string;
    }

    static qa_1 a() {
        return b;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public synchronized String a(String string) {
        return this.b(string);
    }

    public synchronized String a(String string, Object ... objectArray) {
        String string2 = this.b(string);
        try {
            return StringInvoker.a(string2, objectArray);
        }
        catch (IllegalFormatException illegalFormatException) {
            return aL0.a(aL0.a(new StringBuilder(), I9.d), string2).toString();
        }
    }

    public synchronized boolean c(String string) {
        return MapInvoker.b(this.a, string);
    }

    public long b() {
        return this.e;
    }
}


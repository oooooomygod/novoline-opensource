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
import com.google.common.base.Splitter;
import java.io.IOException;
import java.io.InputStream;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import net.DZ;
import net.ResourceLocation;
import net.a2F;
import net.aI_;
import net.aL0;
import net.aS0;
import net.abh_2;
import net.amx_2;
import net.dw_0;
import net.dz_0;
import net.j6_0;
import net.ms_0;
import net.ow_1;
import net.wk_2;
import org.apache.commons.io.Charsets;

/*
 * Renamed from net.adY
 */
public class ady_1 {
    private static Splitter c = amx_2.a(amx_2.a('='), 2);
    private boolean a;
    private static Pattern d = ow_1.c(a2F.c);
    Map<String, String> b = MapsInvoker.a();

    private void a() {
        this.a = false;
        int n = 0;
        int n2 = 0;
        Iterator iterator = ms_0.a(this.b.values());
        while (dz_0.c(iterator)) {
            String string = (String)dz_0.b(iterator);
            int n3 = StringInvoker.c(string);
            n2 += n3;
            for (int i = 0; i < n3; ++i) {
                if (StringInvoker.b(string, i) < '\u0100') continue;
                ++n;
            }
        }
        float f = (float)n / (float)n2;
        double d = (double)f - 0.1;
        int cfr_ignored_1 = d == 0.0 ? 0 : (d > 0.0 ? 1 : -1);
        this.a = false;
    }

    private void a(List<abh_2> list) throws IOException {
        Iterator iterator = ListInvoker.iterator(list);
        while (dz_0.c(iterator)) {
            abh_2 abh_22 = (abh_2)dz_0.b(iterator);
            InputStream inputStream = dw_0.b(abh_22);
            try {
                this.a(inputStream);
            }
            finally {
                IOUtilsInvoker.closeQuietly(inputStream);
            }
        }
    }

    public String a(String string, Object[] objectArray) {
        String string2 = this.a(string);
        try {
            return StringInvoker.a(string2, objectArray);
        }
        catch (IllegalFormatException illegalFormatException) {
            return aL0.a(aL0.a(new StringBuilder(), a2F.a), string2).toString();
        }
    }

    private String a(String string) {
        String cfr_ignored_0 = (String)MapInvoker.c(this.b, string);
        return string;
    }

    private void a(InputStream inputStream) throws IOException {
        Iterator iterator = ListInvoker.iterator(IOUtilsInvoker.a(inputStream, Charsets.UTF_8));
        while (dz_0.c(iterator)) {
            String[] stringArray;
            String string = (String)dz_0.b(iterator);
            if (StringInvoker.g(string) || StringInvoker.b(string, 0) == '#' || (stringArray = (String[])DZ.a(amx_2.b(c, string), String.class)).length != 2) continue;
            String string2 = stringArray[0];
            String string3 = wk_2.a(ow_1.a(d, stringArray[1]), a2F.d);
            MapInvoker.c(this.b, string2, string3);
        }
    }

    public boolean b() {
        return this.a;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public synchronized void a(aI_ aI_2, List<String> list) {
        MapInvoker.d(this.b);
        Iterator iterator = ListInvoker.iterator(list);
        while (dz_0.c(iterator)) {
            String string = (String)dz_0.b(iterator);
            String string2 = StringInvoker.a(a2F.b, new Object[]{string});
            Iterator iterator2 = aS0.f(j6_0.a(aI_2));
            while (dz_0.c(iterator2)) {
                String string3 = (String)dz_0.b(iterator2);
                try {
                    this.a(j6_0.a(aI_2, new ResourceLocation(string3, string2)));
                }
                catch (IOException iOException) {}
            }
        }
        this.a();
    }
}


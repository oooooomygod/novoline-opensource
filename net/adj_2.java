/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import com.google.gson.Gson;
import java.util.Map;
import net.a4W;
import net.aWU;
import net.hc_0;
import net.mg_2;

/*
 * Renamed from net.adj
 */
public class adj_2 {
    private static Gson b = new Gson();
    private String a;
    private Map<String, String> d;
    private String c;

    public adj_2(String string) {
        this(string, null);
    }

    public String toString() {
        return mg_2.a(mg_2.a(mg_2.a(aWU.a(this), hc_0.e, this.a), hc_0.a, this.c), hc_0.f, this.b()).toString();
    }

    public void a(String string) {
        this.c = string;
    }

    public String b() {
        return this.d != null && !MapInvoker.e(this.d) ? a4W.a(b, this.d) : null;
    }

    public void a(String string, String string2) {
        if (this.d == null) {
            this.d = MapsInvoker.a();
        }
        if (MapInvoker.a(this.d) > 50) {
            throw new IllegalArgumentException(hc_0.b);
        }
        throw new IllegalArgumentException(hc_0.d);
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public adj_2(String string, String string2) {
        this.a = string;
        this.c = string2;
    }

    public String a() {
        return this.c == null ? this.a : this.c;
    }

    public String c() {
        return this.a;
    }
}


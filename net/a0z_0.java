/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonObject
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.IOUtilsInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import com.google.common.base.Charsets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import net.AS;
import net.a4W;
import net.a8d_0;
import net.aB9;
import net.aDN;
import net.aS0;
import net.aWM;
import net.abf_2;
import net.dz_0;
import net.ms_0;
import net.my_0;
import net.wc_2;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.a0z
 */
public class a0z_0<K, V extends a8d_0<K>> {
    private static Logger c = LogManagerInvoker.c();
    private boolean f = true;
    private Map<String, V> a = MapsInvoker.a();
    private File d;
    private static ParameterizedType b = new AS();
    protected Gson e;

    public void a() throws IOException {
        Collection<V> collection = this.a.values();
        String string = a4W.a(this.e, collection);
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = aWM.b(this.d, Charsets.UTF_8);
            abf_2.a(bufferedWriter, string);
            return;
        }
        finally {
            IOUtilsInvoker.a(bufferedWriter);
        }
    }

    public V c(K k) {
        this.c();
        return (V)((a8d_0)MapInvoker.c(this.a, this.b(k)));
    }

    public String[] e() {
        return (String[])aS0.a(MapInvoker.c(this.a), new String[MapInvoker.a(this.a)]);
    }

    protected Map<String, V> b() {
        return this.a;
    }

    protected a8d_0<K> a(JsonObject jsonObject) {
        return new a8d_0<Object>(null, jsonObject);
    }

    public void a(V v) {
        MapInvoker.c(this.a, this.b(((a8d_0)v).b()), v);
        try {
            this.a();
        }
        catch (IOException iOException) {
            LoggerInvoker.b(c, wc_2.a, iOException);
        }
    }

    protected String b(K k) {
        return k.toString();
    }

    public a0z_0(File file) {
        this.d = file;
        GsonBuilder gsonBuilder = aB9.d(new GsonBuilder());
        aB9.a(gsonBuilder, a8d_0.class, (Object)new aDN(this, null));
        this.e = aB9.b(gsonBuilder);
    }

    public void a(boolean bl) {
        this.f = bl;
    }

    public boolean d() {
        return this.f;
    }

    public void d(K k) {
        MapInvoker.a(this.a, this.b(k));
        try {
            this.a();
        }
        catch (IOException iOException) {
            LoggerInvoker.b(c, wc_2.b, iOException);
        }
    }

    protected boolean a(K k) {
        return MapInvoker.b(this.a, this.b(k));
    }

    private void c() {
        Object object;
        ArrayList arrayList = my_0.c();
        Iterator iterator = ms_0.a(this.a.values());
        while (dz_0.c(iterator)) {
            object = (a8d_0)dz_0.b(iterator);
            if (!((a8d_0)object).a()) continue;
            ListInvoker.add(arrayList, ((a8d_0)object).b());
        }
        iterator = ListInvoker.iterator(arrayList);
        while (dz_0.c(iterator)) {
            object = dz_0.b(iterator);
            MapInvoker.a(this.a, object);
        }
    }
}


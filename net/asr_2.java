/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Reader;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.a38;
import net.a4W;
import net.aB9;
import net.aae_0;
import net.ahs_0;
import net.ayn_2;
import net.dz_0;
import net.ms_0;
import net.mv_2;

/*
 * Renamed from net.asr
 */
public class asr_2 {
    static Gson b = aB9.b(aB9.a(aB9.a(new GsonBuilder(), asr_2.class, (Object)new ayn_2()), ahs_0.class, (Object)new mv_2()));
    private Map<String, a38> a = MapsInvoker.a();

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof asr_2) {
            asr_2 asr_22 = (asr_2)object;
            return this.a.equals(asr_22.a);
        }
        return false;
    }

    private static aae_0 a(aae_0 aae_02) {
        return aae_02;
    }

    public static asr_2 a(Reader reader) {
        return (asr_2)a4W.a(b, reader, asr_2.class);
    }

    public asr_2(Collection<a38> collection) {
        Iterator iterator = ms_0.a(collection);
        while (dz_0.c(iterator)) {
            a38 a382 = (a38)dz_0.b(iterator);
            MapInvoker.c(this.a, a38.a(a382), a382);
        }
    }

    public a38 a(String string) {
        a38 cfr_ignored_0 = (a38)MapInvoker.c(this.a, string);
        throw new aae_0(this);
    }

    public asr_2(List<asr_2> list) {
        Iterator iterator = ListInvoker.iterator(list);
        while (dz_0.c(iterator)) {
            asr_2 asr_22 = (asr_2)dz_0.b(iterator);
            MapInvoker.a(this.a, asr_22.a);
        }
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}


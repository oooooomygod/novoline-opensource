/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.ImmutableSet
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import net.J0;
import net.MV;
import net.YH;
import net.aG1;
import net.aL0;
import net.ab9_0;
import net.an7_0;
import net.ara_2;
import net.dz_0;
import net.ms_0;
import net.my_0;

public class JC<T extends Enum<T>>
extends J0<T> {
    private Map<String, T> d = MapsInvoker.a();
    private ImmutableSet<T> c;

    @Override
    public Collection<T> c() {
        return this.c;
    }

    protected JC(String string, Class<T> clazz, Collection<T> collection) {
        super(string, clazz);
        this.c = MV.a(collection);
        Iterator iterator = ms_0.a(collection);
        while (dz_0.c(iterator)) {
            Enum enum_ = (Enum)dz_0.b(iterator);
            String string2 = ((ab9_0)((Object)enum_)).a();
            if (MapInvoker.b(this.d, string2)) {
                throw new IllegalArgumentException(aL0.a(aL0.a(aL0.a(new StringBuilder(), YH.b), string2), YH.a).toString());
            }
            MapInvoker.c(this.d, string2, enum_);
        }
    }

    public static <T extends Enum<T>> JC<T> a(String string, Class<T> clazz, Predicate<T> predicate) {
        return JC.a(string, clazz, aG1.a((Collection)my_0.a(ara_2.c(clazz)), predicate));
    }

    public static <T extends Enum<T>> JC<T> a(String string, Class<T> clazz) {
        return JC.a(string, clazz, an7_0.a());
    }

    public static <T extends Enum<T>> JC<T> a(String string, Class<T> clazz, Collection<T> collection) {
        return new JC<T>(string, clazz, collection);
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public static <T extends Enum<T>> JC<T> a(String string, Class<T> clazz, T ... TArray) {
        return JC.a(string, clazz, my_0.a(TArray));
    }

    @Override
    public String a(T t) {
        return ((ab9_0)t).a();
    }
}


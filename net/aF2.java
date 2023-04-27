/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.google.common.base.Predicate
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.common.base.Joiner;
import com.google.common.base.Predicate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.FG;
import net.JI;
import net.O_;
import net.aL0;
import net.aS0;
import net.aSB;
import net.an7_0;
import net.aoe_2;
import net.auo_0;
import net.aw__0;
import net.aze_0;
import net.dz_0;
import net.my_0;
import net.ov_0;

public class aF2 {
    private Map<Character, Predicate<auo_0>> d;
    private int e;
    private static Joiner c = aSB.a(O_.d);
    private int b;
    private List<String[]> a = my_0.c();

    public aF2 a(String ... stringArray) {
        if (!aoe_2.a(stringArray) && !aw__0.b((CharSequence)stringArray[0])) {
            if (ListInvoker.isEmpty(this.a)) {
                this.e = stringArray.length;
                this.b = StringInvoker.c(stringArray[0]);
            }
            if (stringArray.length != this.e) {
                throw new IllegalArgumentException(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), O_.h), this.e), O_.i), stringArray.length), O_.f).toString());
            }
            for (String string : stringArray) {
                if (StringInvoker.c(string) != this.b) {
                    throw new IllegalArgumentException(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), O_.j), this.b), O_.g), StringInvoker.c(string)), O_.e).toString());
                }
                for (char c : StringInvoker.f(string)) {
                    if (MapInvoker.b(this.d, aze_0.c(c))) continue;
                    MapInvoker.c(this.d, aze_0.c(c), null);
                }
            }
            ListInvoker.add(this.a, stringArray);
            return this;
        }
        throw new IllegalArgumentException(O_.c);
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private Predicate<auo_0>[][][] b() {
        this.c();
        Predicate[][][] predicateArray = (Predicate[][][])JI.a(Predicate.class, new int[]{ListInvoker.size(this.a), this.e, this.b});
        for (int i = 0; i < ListInvoker.size(this.a); ++i) {
            for (int j = 0; j < this.e; ++j) {
                for (int k = 0; k < this.b; ++k) {
                    predicateArray[i][j][k] = (Predicate)MapInvoker.c(this.d, aze_0.c(StringInvoker.b(((String[])ListInvoker.get(this.a, i))[j], k)));
                }
            }
        }
        return predicateArray;
    }

    private aF2() {
        this.d = MapsInvoker.a();
        MapInvoker.c(this.d, aze_0.c(' '), an7_0.a());
    }

    public aF2 a(char c, Predicate<auo_0> predicate) {
        MapInvoker.c(this.d, aze_0.c(c), predicate);
        return this;
    }

    private void c() {
        ArrayList arrayList = my_0.c();
        Iterator iterator = aS0.f(MapInvoker.b(this.d));
        while (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            if (FG.a(entry) != null) continue;
            ListInvoker.add(arrayList, FG.b(entry));
        }
        if (!ListInvoker.isEmpty(arrayList)) {
            throw new IllegalStateException(aL0.a(aL0.a(aL0.a(new StringBuilder(), O_.b), aSB.a(c, arrayList)), O_.a).toString());
        }
    }

    public static aF2 a() {
        return new aF2();
    }

    public ov_0 d() {
        return new ov_0(this.b());
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.IntIterator
 *  kotlin.random.Random
 *  kotlin.ranges.CharRange
 *  kotlin.ranges.IntRange
 *  org.jetbrains.annotations.NotNull
 */
package net.skidunion;

import cc.novoline.invoke.ListInvoker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.random.Random;
import kotlin.ranges.CharRange;
import kotlin.ranges.IntRange;
import net.OV;
import net.P8;
import net.a4j_0;
import net.aOB;
import net.abk_1;
import net.acL;
import net.acU;
import net.aze_0;
import net.dz_0;
import net.ms_0;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2={"Lnet/net.skidunion/ay;", "", "()V", "a", "", "", "c", "", "client"})
public class ay {
    private static int c;
    private static List<Character> a;
    public static ay b;

    public static int b() {
        return c;
    }

    @NotNull
    public String c() {
        Comparable<Integer> comparable;
        int n;
        Collection collection;
        int n2 = 1;
        ay.b();
        Iterable iterable = (Iterable)new IntRange(n2, 16);
        boolean bl = false;
        Iterable iterable2 = iterable;
        Iterable iterable3 = new ArrayList(acL.a(iterable, 10));
        boolean bl2 = false;
        Iterator iterator = OV.a(iterable2);
        if (dz_0.c(iterator)) {
            int n3;
            int n4 = n3 = aOB.a((IntIterator)iterator);
            collection = iterable3;
            n = 0;
            comparable = P8.d(abk_1.a(Random.Default, 0, ListInvoker.size(a)));
            ms_0.c(collection, comparable);
            ListInvoker.b(new ListInvoker[3]);
        }
        iterable = (List)iterable3;
        List<Character> list = a;
        boolean bl3 = false;
        iterable3 = iterable;
        Collection collection2 = new ArrayList(acL.a(iterable, 10));
        boolean bl4 = false;
        Iterator iterator2 = OV.a(iterable3);
        if (dz_0.c(iterator2)) {
            Object object = dz_0.b(iterator2);
            n = acU.e((Number)object);
            collection = collection2;
            comparable = aze_0.c(aze_0.a((Character)ListInvoker.get(list, n)));
            ms_0.c(collection, comparable);
        }
        return acL.a((List)collection2, a4j_0.a, null, null, 0, null, null, 62, null);
    }

    public static void b(int n) {
        c = n;
    }

    static {
        ay ay2;
        b = ay2 = new ay();
        char c = 'a';
        CharRange charRange = new CharRange(c, 'z');
        c = 'A';
        a = acL.a((Iterable)charRange, (Iterable)new CharRange(c, 'Z'));
        ay.b(0);
    }

    private ay() {
    }

    public static int d() {
        ay.b();
        return 28;
    }
}


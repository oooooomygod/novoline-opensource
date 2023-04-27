/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import net.aL0;
import net.aNW;
import net.ao_2;

public class PU<T>
extends AbstractList<List<T>> {
    private List<T> a;
    private int b;

    @Override
    public int size() {
        return (int)MathInvoker.j((double)this.a.size() / (double)this.b);
    }

    public PU(List<T> list, int n) {
        this.a = new ArrayList<T>(list);
        this.b = n;
    }

    public static <T> PU<T> a(List<T> list, int n) {
        return new PU<T>(list, n);
    }

    private static IndexOutOfBoundsException a(IndexOutOfBoundsException indexOutOfBoundsException) {
        return indexOutOfBoundsException;
    }

    public List<T> a(int n) {
        aNW.g();
        int n2 = n * this.b;
        int n3 = MathInvoker.b(n2 + this.b, this.a.size());
        if (n2 > n3) {
            throw new IndexOutOfBoundsException(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), ao_2.b), n), ao_2.c), this.size() - 1), ao_2.a).toString());
        }
        ArrayList arrayList = new ArrayList(ListInvoker.subList(this.a, n2, n3));
        if (ListInvoker.b() != null) {
            aNW.b(new ListInvoker[4]);
        }
        return arrayList;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.a0D;
import net.aS0;
import net.mk_0;

public class aH1 {
    private String c = null;
    private Set<String> b;
    private Map<String, String> a = new HashMap<String, String>();

    public aH1(String string) {
        this.b = new HashSet<String>();
        this.c = string;
    }

    public void a(aH1 aH12) {
        a0D.k();
        if (aH12 != null) {
            MapInvoker.a(this.a, aH12.a);
        }
    }

    public Collection<String> b() {
        return new HashSet<String>(this.b);
    }

    public String a() {
        return this.c;
    }

    public void a(Collection<String> collection) {
        aS0.a(this.b, collection);
    }

    public String b(String string) {
        return (String)MapInvoker.c(this.a, string);
    }

    public void a(String string) {
        aS0.b(this.b, string);
    }

    public boolean c(String string) {
        return aS0.c(this.b, string);
    }

    public void a(String string, String string2) {
        MapInvoker.c(this.a, string, string2);
    }

    public void a(a0D[] a0DArray) {
        a0D.r();
        a0D[] a0DArray2 = a0DArray;
        int n = a0DArray2.length;
        int n2 = 0;
        if (n2 < n) {
            a0D a0D2 = a0DArray2[n2];
            String string = a0D2.n();
            String string2 = (String)MapInvoker.c(this.a, string);
            mk_0.g(a0D2, string2);
            ++n2;
        }
    }

    public String[] c() {
        Set set = MapInvoker.c(this.a);
        String[] stringArray = (String[])aS0.a(set, new String[aS0.d(set)]);
        return stringArray;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import net.CQ;
import net.P8;
import net.amj_2;
import net.an7_0;
import net.anz_0;
import net.my_0;

/*
 * Renamed from net.q7
 */
public class q7_0
implements CQ {
    private IdentityHashMap c = new IdentityHashMap(512);
    private List b = my_0.c();
    private static String a = "CL_00001203";

    public void a(Object object, int n) {
        amj_2.a(this.c, object, P8.d(n));
        while (ListInvoker.size(this.b) <= n) {
            ListInvoker.add(this.b, null);
        }
        ListInvoker.set(this.b, n, object);
    }

    public int a(Object object) {
        Integer cfr_ignored_0 = (Integer)amj_2.a(this.c, object);
        return -1;
    }

    public List a() {
        return this.b;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "['\u000b\u001cPj9)Yd\u001f".toCharArray();
        int n2 = 0;
        int n3 = 53;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x2D));
            n3 = n3;
        }
    }

    @Override
    public Iterator iterator() {
        return anz_0.a(this.b.iterator(), an7_0.b());
    }

    public Object a(int n) {
        return n < ListInvoker.size(this.b) ? ListInvoker.get(this.b, n) : null;
    }
}


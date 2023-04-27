/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.StringInvoker;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * Renamed from net.Nv
 */
public class nv_0 {
    private Map<String, Map<String, String>> b;
    private List<wi_1> c = my_0.c();
    private int a;

    public int c() {
        return this.a;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public static nv_0 e() {
        nv_0 nv_02 = new nv_0();
        nv_02.a(il_0.G.s);
        ListInvoker.add(nv_02.a(), new wi_1(1, Blocks.bedrock));
        ListInvoker.add(nv_02.a(), new wi_1(2, Blocks.dirt));
        ListInvoker.add(nv_02.a(), new wi_1(1, Blocks.grass));
        nv_02.d();
        MapInvoker.c(nv_02.b(), vs_1.a, MapsInvoker.a());
        return nv_02;
    }

    public static nv_0 a(String string) {
        return nv_0.e();
    }

    public void d() {
        int n = 0;
        Iterator iterator = ListInvoker.iterator(this.c);
        while (dz_0.c(iterator)) {
            wi_1 wi_12 = (wi_1)dz_0.b(iterator);
            aFB.a(wi_12, n);
            n += aFB.c(wi_12);
        }
    }

    public Map<String, Map<String, String>> b() {
        return this.b;
    }

    public void a(int n) {
        this.a = n;
    }

    private static List<wi_1> a(int n, String string) {
        if (StringInvoker.c(string) >= 1) {
            ArrayList arrayList = my_0.c();
            String[] stringArray = StringInvoker.g(string, vs_1.u);
            int n2 = 0;
            int n3 = 0;
            String[] stringArray2 = stringArray;
            int n4 = stringArray2.length;
            if (n3 < n4) {
                String string2 = stringArray2[n3];
                nv_0.a(n, string2, n2);
                return null;
            }
            return arrayList;
        }
        return null;
    }

    private static wi_1 a(int n, String string, int n2) {
        Object object;
        Block block;
        int n3;
        int n4;
        block12: {
            int n5;
            block14: {
                block13: {
                    String[] stringArray = n >= 3 ? StringInvoker.a(string, vs_1.b, 2) : StringInvoker.a(string, vs_1.t, 2);
                    n4 = 1;
                    n3 = 0;
                    if (stringArray.length == 2) {
                        try {
                            n4 = P8.a(stringArray[0]);
                            if (n2 + n4 >= 256) {
                                n4 = 256 - n2;
                            }
                            n4 = 0;
                        }
                        catch (Throwable throwable) {
                            return null;
                        }
                    }
                    block = null;
                    try {
                        object = stringArray[stringArray.length - 1];
                        if (n < 3) {
                            stringArray = StringInvoker.a((String)object, vs_1.c, 2);
                            if (stringArray.length > 1) {
                                n3 = P8.a(stringArray[1]);
                            }
                            block = BlocksInvoker.a(P8.a(stringArray[0]));
                            break block12;
                        }
                        stringArray = StringInvoker.a((String)object, vs_1.f, 3);
                        block = stringArray.length > 1 ? BlocksInvoker.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), stringArray[0]), vs_1.x), stringArray[1]).toString()) : null;
                    }
                    catch (Throwable throwable) {
                        return null;
                    }
                    if (stringArray.length <= 2) break block13;
                    n5 = P8.a(stringArray[2]);
                    break block14;
                }
                n5 = 0;
            }
            n3 = n5;
            return null;
        }
        if (block == Blocks.air) {
            n3 = 0;
        }
        object = new wi_1(n, n4, block, n3);
        aFB.a((wi_1)object, n2);
        return object;
    }

    public nv_0() {
        this.b = MapsInvoker.a();
    }

    public List<wi_1> a() {
        return this.c;
    }

    public String toString() {
        int n;
        StringBuilder stringBuilder = new StringBuilder();
        aL0.c(stringBuilder, 3);
        aL0.a(stringBuilder, vs_1.d);
        for (n = 0; n < ListInvoker.size(this.c); ++n) {
            aL0.a(stringBuilder, vs_1.i);
            aL0.a(stringBuilder, ((wi_1)ListInvoker.get(this.c, n)).toString());
        }
        aL0.a(stringBuilder, vs_1.l);
        aL0.c(stringBuilder, this.a);
        if (!MapInvoker.e(this.b)) {
            aL0.a(stringBuilder, vs_1.v);
            n = 0;
            Iterator iterator = aS0.f(MapInvoker.b(this.b));
            while (dz_0.c(iterator)) {
                Map.Entry entry = (Map.Entry)dz_0.b(iterator);
                ++n;
                aL0.a(stringBuilder, StringInvoker.i((String)FG.b(entry)));
                Map map = (Map)FG.a(entry);
                if (MapInvoker.e(map)) continue;
                aL0.a(stringBuilder, vs_1.n);
                int n2 = 0;
                Iterator iterator2 = aS0.f(MapInvoker.b(map));
                while (dz_0.c(iterator2)) {
                    Map.Entry entry2 = (Map.Entry)dz_0.b(iterator2);
                    ++n2;
                    aL0.a(stringBuilder, (String)FG.b(entry2));
                    aL0.a(stringBuilder, vs_1.e);
                    aL0.a(stringBuilder, (String)FG.a(entry2));
                }
                aL0.a(stringBuilder, vs_1.h);
            }
        } else {
            aL0.a(stringBuilder, vs_1.j);
        }
        return stringBuilder.toString();
    }
}


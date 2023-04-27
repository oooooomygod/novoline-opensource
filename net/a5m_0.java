/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.Chunk;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import net.Hv;
import net.aL0;
import net.aP2;
import net.aqp_2;
import net.ara_2;
import net.auk_2;
import net.avx_0;
import net.ch_2;
import net.dz_0;
import net.ys_2;

/*
 * Renamed from net.a5m
 */
public class a5m_0 {
    private static boolean b;
    private static Field a;

    static {
        a = null;
        b = false;
    }

    /*
     * Unable to fully structure code
     */
    private static Field b(Chunk var0) {
        block15: {
            block14: {
                block13: {
                    block11: {
                        block12: {
                            aP2.b();
                            var2_1 = new ArrayList<E>();
                            var3_3 = new ArrayList<E>();
                            var4_4 = ara_2.e(Chunk.class);
                            var5_5 = 0;
                            if (var5_5 >= var4_4.length) break block11;
                            var6_7 = var4_4[var5_5];
                            if (avx_0.e((Field)var6_7) != Boolean.TYPE) break block12;
                            avx_0.a((Field)var6_7, true);
                            ListInvoker.add(var2_1, var6_7);
                            ListInvoker.add(var3_3, avx_0.a((Field)var6_7, var0));
                        }
                        ++var5_5;
                    }
                    aqp_2.e(var0, false);
                    var5_6 = new ArrayList<E>();
                    var6_7 = ListInvoker.iterator(var2_1);
                    if (!dz_0.c((Iterator)var6_7)) break block13;
                    var7_8 = dz_0.b((Iterator)var6_7);
                    ListInvoker.add(var5_6, avx_0.a((Field)var7_8, var0));
                }
                aqp_2.e(var0, true);
                var6_7 = new ArrayList<E>();
                var7_8 = ListInvoker.iterator(var2_1);
                if (!dz_0.c((Iterator)var7_8)) break block14;
                var8_9 = dz_0.b((Iterator)var7_8);
                ListInvoker.add(var6_7, avx_0.a((Field)var8_9, var0));
            }
            var7_8 = new ArrayList<E>();
            var8_10 = 0;
            if (var8_10 >= ListInvoker.size(var2_1)) ** GOTO lbl56
            var9_12 = (Field)ListInvoker.get(var2_1, var8_10);
            var10_13 = (Boolean)ListInvoker.get(var5_6, var8_10);
            var11_14 = (Boolean)ListInvoker.get(var6_7, var8_10);
            if (auk_2.a(var10_13)) ** GOTO lbl55
            if (!auk_2.a(var11_14)) ** GOTO lbl55
            ListInvoker.add(var7_8, var9_12);
            var12_15 = (Boolean)ListInvoker.get(var3_3, var8_10);
            avx_0.a(var9_12, (Object)var0, var12_15);
lbl55:
            // 3 sources

            ++var8_10;
lbl56:
            // 2 sources

            if (ListInvoker.size(var7_8) != 1) break block15;
            try {
                var8_11 = (Field)ListInvoker.get(var7_8, 0);
                return var8_11;
            }
            catch (Exception var2_2) {
                ys_2.d(aL0.a(aL0.a(aL0.a(new StringBuilder(), ara_2.b(var2_2.getClass())), Hv.b), ch_2.b(var2_2)).toString());
            }
        }
        ys_2.d(Hv.d);
        return null;
    }

    public static boolean a(Chunk chunk) {
        aP2.b();
        if (a == null) {
            if (b) {
                return true;
            }
            a = a5m_0.b(chunk);
            if (a == null) {
                b = true;
                return true;
            }
        }
        try {
            return avx_0.b(a, chunk);
        }
        catch (Exception exception) {
            ys_2.d(Hv.c);
            ys_2.d(aL0.a(aL0.a(aL0.a(new StringBuilder(), ara_2.b(exception.getClass())), Hv.a), ch_2.b(exception)).toString());
            b = true;
            return true;
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}


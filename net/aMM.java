/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import net.minecraft.block.BlockPos;

public class aMM {
    private static ck_2[] a = new ck_2[0];

    /*
     * Unable to fully structure code
     */
    public static void a() {
        block27: {
            block26: {
                block25: {
                    block24: {
                        block23: {
                            block22: {
                                block21: {
                                    aP2.b();
                                    aMM.a = new ck_2[0];
                                    if (!ys_2.B()) break block27;
                                    var1 = aqz_1.x;
                                    var2_1 = new ResourceLocation(var1);
                                    if (ys_2.d(var2_1)) break block21;
                                    ys_2.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aqz_1.a), var1), aqz_1.w).toString());
                                    return;
                                }
                                var3_4 = ys_2.e(var2_1);
                                var4_5 = ys_2.b(var2_1);
                                var5_6 = new ArrayList<E>(256);
                                var6_7 = ys_2.c(var4_5);
                                aZ6.b(var4_5);
                                var7_8 = ys_2.a(var6_7, aqz_1.m);
                                ys_2.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aqz_1.j), var1), aqz_1.q).toString());
                                ys_2.a(aqz_1.u);
                                ys_2.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aqz_1.h), var1), aqz_1.e).toString());
                                var8_9 = aH3.a();
                                var9_10 = 0;
                                if (var9_10 >= var7_8.length) ** GOTO lbl71
                                var10_11 = StringInvoker.h(var7_8[var9_10]);
                                if (StringInvoker.e(var10_11, aqz_1.c)) ** GOTO lbl70
                                var11_12 = ys_2.a(var10_11, aqz_1.d);
                                if (var11_12.length == 2) break block22;
                                ys_2.d(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aqz_1.s), var1), aqz_1.l), var10_11).toString());
                            }
                            var12_13 = StringInvoker.h(var11_12[0]);
                            var13_14 = StringInvoker.h(var11_12[1]);
                            var14_15 = h9.a(var8_9, aL0.a(aL0.a(new StringBuilder(), aqz_1.t), var12_13).toString());
                            if (var14_15 != null) break block23;
                            ys_2.d(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aqz_1.g), var1), aqz_1.p), var10_11).toString());
                        }
                        var15_16 = qg_2.o(var14_15);
                        if (var15_16 >= 0) break block24;
                        ys_2.d(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aqz_1.i), var1), aqz_1.f), var10_11).toString());
                    }
                    if (var3_4) {
                        if (ys_2.e(new ResourceLocation(aL0.a(aL0.a(aL0.a(new StringBuilder(), aqz_1.k), var12_13), aqz_1.o).toString()))) break block25;
                        return;
                    }
                }
                var16_17 = new ck_2(var13_14);
                if (!aev_2.a(var16_17)) ** GOTO lbl70
                if (akr_1.d(var5_6) > var15_16) break block26;
                akr_1.a(var5_6, null);
            }
            try {
                akr_1.a(var5_6, var15_16, var16_17);
                ys_2.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aqz_1.v), var12_13), aqz_1.r), var13_14).toString());
lbl70:
                // 3 sources

                ++var9_10;
lbl71:
                // 2 sources

                aMM.a = (ck_2[])akr_1.a(var5_6, new ck_2[akr_1.d(var5_6)]);
            }
            catch (Exception var2_3) {
                ch_2.a(var2_3);
            }
            {
                catch (FileNotFoundException var2_2) {
                    ys_2.d(aL0.a(aL0.a(aL0.a(new StringBuilder(), aqz_1.n), var1), aqz_1.b).toString());
                    return;
                }
            }
        }
    }

    private static FileNotFoundException a(FileNotFoundException fileNotFoundException) {
        return fileNotFoundException;
    }

    public static ck_2 a(KM kM) {
        aP2.b();
        if (!(kM instanceof KM)) {
            return null;
        }
        int n = qg_2.o(kM);
        if (n >= 0 && n < a.length) {
            ck_2 ck_22 = a[n];
            return ck_22;
        }
        return null;
    }

    public static a9Z a(BlockPos blockPos, a9Z a9Z2) {
        aP2.b();
        KM kM = aX3.a(a9Z2);
        if (kM == null) {
            return a9Z2;
        }
        aMM.a(kM);
        return a9Z2;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.Novoline;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.NotificationManagerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.ModuleRegistry;
import java.io.IOException;
import java.util.List;
import net.NotificationType;
import net.Waypoints;
import net.a0_0;
import net.aL0;
import net.aa2_0;
import net.aeq_0;
import net.amv_2;
import net.asi_1;
import net.ayg_2;
import net.azo_1;
import net.dz_0;
import net.lj_1;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.bc
 */
public class bc_2
extends a0_0 {
    private void a() {
        this.a(aeq_0.B, aeq_0.k, azo_1.a(aeq_0.r, aeq_0.a), azo_1.a(aeq_0.p, aeq_0.s), azo_1.a(aeq_0.v, aeq_0.f), azo_1.a(aeq_0.n, aeq_0.m));
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void a(String[] var1_1, int var2_2, int var3_3) {
        var5_4 = (Waypoints)ModuleInvoker.isEnable(ModuleRegistry.WAYPOINTS);
        var4_5 = amv_2.b();
        if (var1_1.length == 0) {
            this.a();
            return;
        }
        var6_6 = var1_1[0];
        var7_7 = StringInvoker.i(var6_6);
        var8_8 = -1;
        switch (var7_7.hashCode()) {
            case 96417: {
                if (!var7_7.equals(aeq_0.e)) ** GOTO lbl30
                var8_8 = 0;
            }
            case -934610812: {
                if (!var7_7.equals(aeq_0.j)) ** GOTO lbl30
                var8_8 = 1;
            }
            case -1335458389: {
                if (!var7_7.equals(aeq_0.o)) ** GOTO lbl30
                var8_8 = 2;
            }
            case 99339: {
                if (!var7_7.equals(aeq_0.w)) ** GOTO lbl30
                var8_8 = 3;
            }
            case 94746189: {
                if (!var7_7.equals(aeq_0.q)) ** GOTO lbl30
                var8_8 = 4;
            }
            case 3322014: {
                v0 = (int)var7_7.equals(aeq_0.x);
                if (var4_5 != null) break;
                if (v0 != 0) {
                    var8_8 = 5;
                }
            }
lbl30:
            // 9 sources

            default: {
                v0 = var8_8;
            }
        }
        if (var4_5 != null) ** GOTO lbl36
        switch (v0) {
            case 0: {
                v0 = var1_1.length;
lbl36:
                // 2 sources

                if (v0 != 5) {
                    this.a();
                    return;
                }
                ayg_2.a(var5_4, asi_1.a(var1_1[4], Integer.parseInt(var1_1[1]), Integer.parseInt(var1_1[2]), Integer.parseInt(var1_1[3])));
                try {
                    aa2_0.c(ayg_2.b(var5_4));
                    this.b(aL0.a(aL0.a(aL0.a(new StringBuilder(), aeq_0.C), var1_1[4]), aeq_0.h).toString(), 5000);
                    break;
                }
                catch (IOException var9_9) {
                    this.b(aeq_0.b);
                    LoggerInvoker.b(var5_4.j(), aeq_0.y, var9_9);
                }
            }
            case 1: 
            case 2: 
            case 3: {
                if (var1_1.length != 2) {
                    this.a();
                    return;
                }
                if (ayg_2.a(var5_4, var1_1[1])) {
                    this.b(aL0.a(aL0.a(aL0.a(new StringBuilder(), aeq_0.D), var1_1[1]), aeq_0.l).toString(), 5000);
                    try {
                        aa2_0.c(ayg_2.b(var5_4));
                        break;
                    }
                    catch (IOException var9_10) {
                        NotificationManagerInvoker.a(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), aeq_0.d, NotificationType.ERROR);
                        LoggerInvoker.b(var5_4.j(), aeq_0.c, var9_10);
                        if (var4_5 == null) break;
                    }
                }
                this.a(aeq_0.i, 5000);
                if (var4_5 == null) break;
            }
            case 4: {
                if (var1_1.length != 1) {
                    this.a();
                    return;
                }
                if (ListInvoker.isEmpty(ayg_2.a(var5_4))) break;
                ListInvoker.clear(ayg_2.a(var5_4));
            }
            case 5: {
                if (var1_1.length != 1) {
                    this.a();
                    return;
                }
                this.e(aeq_0.z);
                var9_11 = ListInvoker.iterator(ayg_2.a(var5_4));
                if (!dz_0.c(var9_11)) break;
                var10_12 = (lj_1)dz_0.b(var9_11);
                this.e(aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.a(aL0.a(new StringBuilder(), aeq_0.A), asi_1.b(var10_12)), aeq_0.u), asi_1.c(var10_12)), aeq_0.g), asi_1.d(var10_12)), aeq_0.t), asi_1.a(var10_12)).toString());
            }
        }
    }

    public bc_2(@NonNull Novoline novoline, String string, String string2, List<String> list) {
        super(novoline, string, string2, list);
    }
}


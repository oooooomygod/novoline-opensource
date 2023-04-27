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
import cc.novoline.invoke.NotificationManagerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.modules.configurations.ConfigManager;
import cc.novoline.modules.EnumModuleType;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.invoke.LambdaMetafactory;
import java.util.List;
import java.util.function.Consumer;

import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.aY
 */
public class ay_1
extends a0_0 {
    public static String k = OD.R;

    /*
     * Unable to fully structure code
     */
    @Override
    public void a(String[] var1_1, int var2_2, int var3_3) {
        var4_4 = amv_2.b();
        if (var1_1.length < 1) {
            this.a(OD.i, OD.ac, new aoa_1[]{azo_1.a(OD.k, OD.Z), azo_1.a(OD.w, OD.F), azo_1.a(OD.ax, OD.at), azo_1.a(OD.T, OD.an)});
            return;
        }
        var5_5 = aen_2.b(NovolineInvoker.l(this.g));
        var7_7 = var6_6 = StringInvoker.i(var1_1[0]);
        var8_8 = -1;
        switch (var7_7.hashCode()) {
            case 1427818632: {
                if (!var7_7.equals(OD.C)) ** GOTO lbl37
                var8_8 = 0;
                if (var4_4 == null) ** GOTO lbl37
                ListInvoker.b(new ListInvoker[3]);
            }
            case -838595071: {
                if (!var7_7.equals(OD.X)) ** GOTO lbl37
                var8_8 = 1;
            }
            case -934610812: {
                if (!var7_7.equals(OD.b)) ** GOTO lbl37
                var8_8 = 2;
            }
            case 3237038: {
                if (!var7_7.equals(OD.m)) ** GOTO lbl37
                var8_8 = 3;
            }
            case 3327206: {
                if (!var7_7.equals(OD.ao)) ** GOTO lbl37
                var8_8 = 4;
            }
            case 3522941: {
                if (!var7_7.equals(OD.n)) ** GOTO lbl37
                var8_8 = 5;
            }
            case -1335458389: {
                if (!var7_7.equals(OD.o)) ** GOTO lbl37
                var8_8 = 6;
            }
            case 3322014: {
                v0 = (int)var7_7.equals(OD.af);
                if (var4_4 != null) break;
                if (v0 != 0) {
                    var8_8 = 7;
                }
            }
lbl37:
            // 12 sources

            default: {
                v0 = var8_8;
            }
        }
        if (var4_4 != null) ** GOTO lbl43
        switch (v0) {
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: {
                v0 = var1_1.length;
lbl43:
                // 2 sources

                if (v0 < 2) {
                    this.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), OD.ae), var6_6), OD.A).toString(), anw_0.RED);
                    return;
                }
                var9_9 = var1_1[1];
                var10_11 = var6_6;
                var11_13 = -1;
                switch (var10_11.hashCode()) {
                    case 3327206: {
                        if (!var10_11.equals(OD.g)) break;
                        var11_13 = 0;
                    }
                    case 3522941: {
                        if (!var10_11.equals(OD.aa)) break;
                        var11_13 = 1;
                    }
                    case -1335458389: {
                        if (!var10_11.equals(OD.h)) break;
                        var11_13 = 2;
                    }
                    case -838595071: {
                        if (!var10_11.equals(OD.as)) break;
                        var11_13 = 3;
                    }
                    case 1427818632: {
                        if (!var10_11.equals(OD.ag)) break;
                        var11_13 = 4;
                    }
                    case -934610812: {
                        if (!var10_11.equals(OD.I)) break;
                        var11_13 = 5;
                    }
                }
                return;
            }
            case 7: {
                var9_10 = aHE.c(var5_5);
                var10_12 = azo_1.a(OD.ah);
                if (ListInvoker.isEmpty(var9_10)) {
                    aar_1.a(var10_12, OD.z, anw_0.RED);
                }
                this.a(var10_12, true);
                ListInvoker.forEach(var9_10, (Consumer<String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$process$0(java.lang.String ), (Ljava/lang/String;)V)((ay_1)this));
                return;
            }
        }
        this.b(aL0.a(aL0.a(new StringBuilder(), OD.aj), var1_1[0]).toString());
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public static void c(@NonNull ConfigManager configManager, @NonNull String string) {
        amv_2.b();
        if (StringInvoker.g(StringInvoker.h(string))) {
            NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), OD.P, 2000, NotificationType.ERROR);
            return;
        }
        try {
            aHE.d(configManager, string);
            NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), aL0.a(aL0.a(aL0.a(new StringBuilder(), OD.ap), string), OD.E).toString(), 2000, NotificationType.SUCCESS);
        }
        catch (FileNotFoundException fileNotFoundException) {
            NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), OD.V, 2000, NotificationType.ERROR);
        }
        catch (IOException iOException) {
            LoggerInvoker.a(Novoline.f(), OD.D, iOException);
            NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), OD.H, 2000, NotificationType.ERROR);
        }
        catch (Throwable throwable) {
            LoggerInvoker.b(Novoline.f(), OD.K, throwable);
            NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), OD.S, 2000, NotificationType.ERROR);
        }
    }

    public static void a(@NonNull ConfigManager configManager, @NonNull String string) {
        amv_2.b();
        if (StringInvoker.g(StringInvoker.h(string))) {
            NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), OD.e, 2000, NotificationType.ERROR);
            return;
        }
        try {
            aHE.b(configManager, string);
            NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), aL0.a(aL0.a(aL0.a(new StringBuilder(), OD.au), string), OD.aq).toString(), 2000, NotificationType.SUCCESS);
        }
        catch (yz_1 yz_12) {
            LoggerInvoker.b(Novoline.f(), OD.t, yz_12);
            NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), OD.j, 2000, NotificationType.ERROR);
        }
        catch (IOException iOException) {
            LoggerInvoker.b(Novoline.f(), OD.ay, iOException);
            NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), OD.am, 2000, NotificationType.ERROR);
        }
        catch (a68 a682) {
            LoggerInvoker.b(Novoline.f(), OD.aw, a682);
            NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), OD.ar, 2000, NotificationType.ERROR);
        }
        catch (Throwable throwable) {
            LoggerInvoker.b(Novoline.f(), OD.q, throwable);
            NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), OD.v, 2000, NotificationType.ERROR);
        }
    }

    private void lambda$process$0(String string) {
        this.a(aar_1.a(azo_1.a(OD.Q, anw_0.GRAY), string, anw_0.GREEN));
    }

    public static void a(@NonNull ConfigManager configManager, @NonNull String string, EnumModuleType[] enumModuleTypeArray) {
        amv_2.b();
        if (StringInvoker.g(StringInvoker.h(string))) {
            NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), OD.x, 2000, NotificationType.ERROR);
            return;
        }
        try {
            aHE.a(configManager, string, true, enumModuleTypeArray);
            NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), aL0.a(aL0.a(aL0.a(new StringBuilder(), OD.a), string), OD.av).toString(), 2000, NotificationType.SUCCESS);
            k = string;
        }
        catch (FileNotFoundException fileNotFoundException) {
            NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), OD.Y, 2000, NotificationType.ERROR);
        }
        catch (IOException iOException) {
            LoggerInvoker.b(Novoline.f(), OD.f, iOException);
            NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), OD.al, 2000, NotificationType.ERROR);
        }
        catch (a68 a682) {
            LoggerInvoker.b(Novoline.f(), OD.y, a682);
            NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), OD.c, 2000, NotificationType.ERROR);
        }
        catch (PT pT) {
            NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), OD.l, 2000, NotificationType.ERROR);
        }
        catch (Throwable throwable) {
            LoggerInvoker.b(Novoline.f(), OD.L, throwable);
            NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), OD.J, 2000, NotificationType.ERROR);
        }
    }

    public static String d(@NonNull ConfigManager configManager, @NonNull String string) {
        amv_2.b();
        if (StringInvoker.g(StringInvoker.h(string))) {
            NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), OD.B, 2000, NotificationType.ERROR);
            return null;
        }
        try {
            return aHE.a(configManager, string);
        }
        catch (IOException iOException) {
            LoggerInvoker.b(Novoline.f(), OD.W, iOException);
            NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), OD.O, 2000, NotificationType.ERROR);
        }
        catch (a68 a682) {
            LoggerInvoker.b(Novoline.f(), OD.ab, a682);
            NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), OD.ak, 2000, NotificationType.ERROR);
        }
        return null;
    }

    public ay_1(@NonNull Novoline novoline, String string, String string2, List<String> list) {
        super(novoline, string, string2, list);
    }

    public static void b(@NonNull ConfigManager configManager, @NonNull String string) {
        amv_2.b();
        if (StringInvoker.g(StringInvoker.h(string))) {
            NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), OD.N, 2000, NotificationType.ERROR);
            return;
        }
        try {
            aHE.a(configManager, string, true);
            NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), aL0.a(aL0.a(aL0.a(new StringBuilder(), OD.ai), string), OD.d).toString(), 2000, NotificationType.SUCCESS);
            k = string;
        }
        catch (FileNotFoundException fileNotFoundException) {
            NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), OD.p, 2000, NotificationType.ERROR);
        }
        catch (IOException iOException) {
            LoggerInvoker.b(Novoline.f(), OD.G, iOException);
            NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), OD.s, 2000, NotificationType.ERROR);
        }
        catch (a68 a682) {
            LoggerInvoker.b(Novoline.f(), OD.M, a682);
            NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), OD.ad, 2000, NotificationType.ERROR);
        }
        catch (PT pT) {
            NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), OD.u, 2000, NotificationType.ERROR);
        }
        catch (Throwable throwable) {
            LoggerInvoker.b(Novoline.f(), OD.r, throwable);
            NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), OD.U, 2000, NotificationType.ERROR);
        }
    }
}


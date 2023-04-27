/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.Novoline;
import cc.novoline.invoke.KeyboardInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.NotificationManagerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.modules.visual.ClickGui;
import deobf.ModuleRegistry;
import deobf.TimerUtil;
import java.awt.Color;
import java.util.Iterator;
import java.util.List;

import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.avW
 */
public class avw_1 {
    static int c = 5;
    private static String b;
    private static ListInvoker[] e;
    private static TimerUtil d;
    public static boolean a;

    public static boolean e(int n, int n2) {
        avw_1.b();
        DiscordGUI discordGUI = NovolineInvoker.u(NovolineInvoker.getInstance());
        return n >= FK.a(discordGUI) + 44 && n <= FK.a(discordGUI) + 45 + 110 && n2 >= FK.h(discordGUI) + 44 && n2 <= FK.h(discordGUI) + 58;
    }

    public static void a(char c, int n) {
        avw_1.b();
        if (n == 63) {
            FK.d(NovolineInvoker.u(NovolineInvoker.getInstance()));
            return;
        }
        if (a) {
            if (n == 1) {
                a = false;
            }
            if (KF.a(c)) {
                b = aL0.a(aL0.a(new StringBuilder(), b), aze_0.d(c)).toString();
            }
        }
    }

    public static boolean f(int n, int n2) {
        avw_1.b();
        DiscordGUI discordGUI = NovolineInvoker.u(NovolineInvoker.getInstance());
        return n >= FK.a(discordGUI) + 44 && n <= FK.a(discordGUI) + 45 + 110 && n2 >= FK.h(discordGUI) + 80 && n2 <= FK.h(discordGUI) + 94;
    }

    public static boolean c(int n, int n2) {
        avw_1.b();
        DiscordGUI discordGUI = NovolineInvoker.u(NovolineInvoker.getInstance());
        return n >= FK.a(discordGUI) + 50 && n <= FK.a(discordGUI) + 120 && n2 >= FK.h(discordGUI) + 100 && n2 <= FK.h(discordGUI) + 110;
    }

    static {
        avw_1.b(new ListInvoker[5]);
        b = dn_2.a;
        d = new TimerUtil();
    }

    public static void a(int n, int n2, int n3) {
        avw_1.b();
        Novoline novoline = NovolineInvoker.getInstance();
        ModuleManager moduleManager = NovolineInvoker.l(novoline);
        aen_2.b(moduleManager);
        DiscordGUI discordGUI = NovolineInvoker.u(novoline);
        List list = FK.f(discordGUI);
        boolean bl = false;
        Iterator iterator = ListInvoker.iterator(list);
        if (dz_0.c(iterator)) {
            GuiConfig guiConfig = (GuiConfig)dz_0.b(iterator);
            if (guiConfig.b(n, n2)) {
                Iterator iterator2 = ListInvoker.iterator(list);
                if (dz_0.c(iterator2)) {
                    GuiConfig guiConfig2 = (GuiConfig)dz_0.b(iterator2);
                    to_2.a(guiConfig2, false);
                }
                to_2.a(guiConfig, true);
            }
            if (to_2.f(guiConfig)) {
                if (avw_1.b(n, n2)) {
                    a4_.c(aen_2.b(moduleManager), to_2.c(guiConfig));
                    FK.d(discordGUI);
                }
                if (avw_1.e(n, n2)) {
                    a4_.a(aen_2.b(moduleManager), to_2.c(guiConfig));
                    FK.d(discordGUI);
                }
                if (avw_1.g(n, n2)) {
                    a4_.b(aen_2.b(moduleManager), to_2.c(guiConfig));
                    FK.d(discordGUI);
                    bl = true;
                }
            }
        }
        if (avw_1.g(n, n2)) {
            if (StringInvoker.c(b) > 25) {
                NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), dn_2.i, 2000, NotificationType.ERROR);
            }
            a4_.b(aen_2.b(moduleManager), b);
            FK.d(discordGUI);
        }
        if (avw_1.f(n, n2)) {
            FK.d(discordGUI);
        }
        if (avw_1.c(n, n2)) {
            boolean bl2 = a = !a;
        }
        if (a) {
            a = false;
        }
    }

    public static boolean b(int n, int n2) {
        avw_1.b();
        DiscordGUI discordGUI = NovolineInvoker.u(NovolineInvoker.getInstance());
        return n >= FK.a(discordGUI) + 44 && n <= FK.a(discordGUI) + 45 + 110 && n2 >= FK.h(discordGUI) + 26 && n2 <= FK.h(discordGUI) + 40;
    }

    public static boolean g(int n, int n2) {
        avw_1.b();
        DiscordGUI discordGUI = NovolineInvoker.u(NovolineInvoker.getInstance());
        return n >= FK.a(discordGUI) + 44 && n <= FK.a(discordGUI) + 45 + 110 && n2 >= FK.h(discordGUI) + 62 && n2 <= FK.h(discordGUI) + 76;
    }

    public static void d(int n, int n2) {
        Object object;
        avw_1.b();
        Novoline novoline = NovolineInvoker.getInstance();
        DiscordGUI discordGUI = NovolineInvoker.u(novoline);
        ml_0 ml_02 = FK.c();
        int n3 = FK.a(discordGUI);
        int n4 = FK.h(discordGUI);
        if (!ListInvoker.isEmpty(FK.f(discordGUI))) {
            switch (ml_02) {
                case DOWN: {
                    if (to_2.e((GuiConfig)ListInvoker.get(FK.f(discordGUI), ListInvoker.size(FK.f(discordGUI)) - 1)) <= n4 + FK.g(discordGUI) - 14) break;
                    Iterator iterator = ListInvoker.iterator(FK.f(discordGUI));
                    if (dz_0.c(iterator)) {
                        object = (GuiConfig)dz_0.b(iterator);
                        to_2.a((GuiConfig)object, to_2.a((GuiConfig)object) - 7);
                        ListInvoker.b(new ListInvoker[2]);
                    }
                }
                case UP: {
                    Iterator iterator;
                    if (to_2.a((GuiConfig)ListInvoker.get(FK.f(discordGUI), 0)) >= 30 || !dz_0.c(iterator = ListInvoker.iterator(FK.f(discordGUI)))) break;
                    object = (GuiConfig)dz_0.b(iterator);
                    to_2.a((GuiConfig)object, to_2.a((GuiConfig)object) + 7);
                }
            }
        }
        if (FK.i(discordGUI) && c <= 10) {
            ++c;
        }
        if (!FK.i(discordGUI)) {
            c = 5;
        }
        object = (ClickGui)ModuleInvoker.isEnable(ModuleRegistry.CLICKGUI);
        int n5 = z4_0.p((ClickGui)object);
        if (avw_1.a(n, n2)) {
            if (FK.i(discordGUI)) {
                a1V.c(n3, n4 + 274 - c, n3 + 2, n4 + 274 + c, -1);
            }
            a1V.c(n3, n4 + 269, n3 + 2, n4 + 279, -1);
        }
        if (FK.i(discordGUI)) {
            a1V.c(n3, n4 + 274 - c, n3 + 2, n4 + 274 + c, -1);
        }
        a1V.a(n3 + 22, n4 + 274, 15.0f, -13223617);
        a7l_0.a(aSl.a, (CharSequence)dn_2.b, n3 + 16, n4 + 268, avw_1.a(n, n2) ? n5 : -1);
        if (FK.i(discordGUI)) {
            boolean bl = avw_1.a(discordGUI);
            if (bl && avw_1.b(n, n2)) {
                a1V.c(n3 + 44, n4 + 26, n3 + 45 + 110, n4 + 40, -13223618);
            }
            if (bl && avw_1.e(n, n2)) {
                a1V.c(n3 + 44, n4 + 44, n3 + 45 + 110, n4 + 58, -13223618);
            }
            if (bl && avw_1.g(n, n2)) {
                a1V.c(n3 + 44, n4 + 62, n3 + 45 + 110, n4 + 76, -13223618);
            }
            if (avw_1.f(n, n2)) {
                a1V.c(n3 + 44, n4 + 80, n3 + 45 + 110, n4 + 94, -13223618);
            }
            a7l_0.a(a4V.a, (CharSequence)dn_2.d, n3 + 50, n4 + 7, -1);
            a7l_0.a(we_2.a, (CharSequence)dn_2.c, n3 + 63, n4 + 7, -1);
            int n6 = bl ? -7961722 : aol_1.b(new Color(0x4E4B4E));
            a7l_0.a(ad4_0.a, (CharSequence)dn_2.k, n3 + 50, n4 + 28, n6);
            a7l_0.a(ad4_0.a, (CharSequence)dn_2.n, n3 + 50, n4 + 46, n6);
            a7l_0.a(ad4_0.a, (CharSequence)dn_2.f, n3 + 50, n4 + 64, -7961722);
            a7l_0.a(ad4_0.a, (CharSequence)dn_2.m, n3 + 50, n4 + 82, -7961722);
            a7l_0.a(we_2.a, (CharSequence)dn_2.j, n3 + 63, n4 + 30, n6);
            a7l_0.a(we_2.a, (CharSequence)dn_2.h, n3 + 63, n4 + 48, n6);
            a7l_0.a(we_2.a, (CharSequence)dn_2.g, n3 + 63, n4 + 66, -7961722);
            a7l_0.a(we_2.a, (CharSequence)dn_2.e, n3 + 63, n4 + 84, -7961722);
            if (a && KeyboardInvoker.a(14) && qh_1.c(d, 100L) && StringInvoker.c(b) >= 1) {
                b = StringInvoker.b(b, 0, StringInvoker.c(b) - 1);
                qh_1.b(d);
            }
            a1V.a(n3 + 50, n4 + 100, n3 + 120, n4 + 110, 1.0f, avw_1.c(n, n2) || a ? -8225316 : 0x64000000, -13684945);
            if (StringInvoker.g(b)) {
                a7l_0.a(aPc.a, (CharSequence)dn_2.l, n3 + 52, n4 + 102, 0x64FFFFFF);
            }
            if (a7l_0.a(aPc.a, b) > 65) {
                a7l_0.a(aPc.a, (CharSequence)a7l_0.a(aPc.a, b, 60, true), n3 + 52, n4 + 102, -1);
            }
            a7l_0.a(aPc.a, (CharSequence)b, n3 + 52, n4 + 102, -1);
            Iterator iterator = ListInvoker.iterator(FK.f(discordGUI));
            if (dz_0.c(iterator)) {
                GuiConfig guiConfig = (GuiConfig)dz_0.b(iterator);
                to_2.b(guiConfig);
                if (!to_2.d(guiConfig)) {
                    guiConfig.a(n, n2);
                }
            }
        }
    }

    public static boolean a(int n, int n2) {
        avw_1.b();
        DiscordGUI discordGUI = NovolineInvoker.u(NovolineInvoker.getInstance());
        return n >= FK.a(discordGUI) + 8 && n <= FK.a(discordGUI) + 35 && n2 >= FK.h(discordGUI) + 259 && n2 <= FK.h(discordGUI) + 289;
    }

    public static void b(ListInvoker[] listInvokerArray) {
        e = listInvokerArray;
    }

    private static boolean a(@NonNull DiscordGUI discordGUI) {
        return aMF.c(ListInvoker.stream(FK.f(discordGUI)), GuiConfig::d);
    }

    public static ListInvoker[] b() {
        return e;
    }
}


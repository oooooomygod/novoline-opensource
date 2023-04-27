/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package net;

import cc.novoline.Novoline;
import cc.novoline.invoke.NotificationManagerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.SystemInvoker;
import deobf.MCInvoker;
import net.NotificationType;
import net.PF;
import net.aGO;
import net.aR7;
import net.aVU;
import net.alh_0;
import net.azo_1;
import net.ea_1;
import net.gd_0;
import net.mg_0;
import net.ni_0;
import net.skidunion.B;
import net.skidunion.Z;
import net.skidunion.r_0;
import net.skidunion.s_0;
import net.skidunion.t_0;
import net.skidunion.u_0;
import net.skidunion.y_0;
import org.jetbrains.annotations.NotNull;

public class aFA
extends Z {
    private String a;

    @Override
    public void a(@NotNull s_0 s_02) {
        Novoline.j();
        if (MCInvoker.f().player != null) {
            this.a = alh_0.c(aR7.b(ni_0.a(s_02)));
            PlayerInvoker.b(MCInvoker.f().player, azo_1.a(aR7.b(ni_0.a(s_02)), aR7.a(ni_0.a(s_02))));
        }
    }

    public void a(String string) {
        this.a = string;
    }

    @Override
    public void a(@NotNull u_0 u_02) {
        if (MCInvoker.f().player != null && !aVU.a(u_02)) {
            PlayerInvoker.b(MCInvoker.f().player, azo_1.b(aVU.b(u_02)));
        }
    }

    public String a() {
        return this.a;
    }

    @Override
    public void a(@NotNull y_0 y_02) {
        if (PF.a(y_02) == 4004 && MCInvoker.f().player != null) {
            NotificationManagerInvoker.a(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), gd_0.b, gd_0.c, 2000, NotificationType.ERROR);
        }
    }

    @Override
    public void a(@NotNull t_0 t_02) {
        ea_1.a(System.out, gd_0.a);
        SystemInvoker.a(0);
    }

    @Override
    public void a(@NotNull r_0 r_02) {
        Novoline.j();
        if (MCInvoker.f().player != null) {
            PlayerInvoker.b(MCInvoker.f().player, azo_1.a(aGO.a(r_02)));
        }
    }

    @Override
    public void a(@NotNull B b) {
    }

    public static aFA b() {
        return mg_0.a(mg_0.INSTANCE);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package cc.novoline.utils.notifications;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.StringPropertyInvoker;

import java.awt.Color;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import cc.novoline.modules.visual.HUD;
import deobf.MCInvoker;
import deobf.ModuleRegistry;
import net.minecraft.client.Minecraft;
import net.D6;
import net.Notification;
import net.NotificationType;
import net.ScaledResolution;
import net.WR;
import net.aod_2;
import net.cw_2;
import net.dz_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class NotificationManager {
    private List<Notification> a;
    private Minecraft b = MCInvoker.f();
    public static int DEFAULT_DELAY = 2000;

    public void a(@NotNull String string, int n, @Nullable NotificationType notificationType) {
        this.a(aod_2.d(StringInvoker.i(notificationType.name())), string, n, notificationType);
    }

    public void a(@NotNull String string, @NotNull String string2, @Nullable NotificationType notificationType) {
        this.a(string, string2, 2000, notificationType);
    }

    private void a(Notification notification) {
        Notification notification2 = new Notification(notification, this);
        ListInvoker.add(this.a, notification2);
        NotificationType.b();
        ScaledResolution scaledResolution = new ScaledResolution(this.b);
        HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        Notification notification3 = (Notification)ListInvoker.get(this.a, ListInvoker.indexOf(this.a, notification2));
        if (StringPropertyInvoker.isMode(cw_2.s(hUD), WR.a)) {
            notification3.c = ScaledResolutionInvoker.g(scaledResolution) - 48 * (ListInvoker.indexOf(this.a, notification2) + 1);
            notification3.t = ScaledResolutionInvoker.a(scaledResolution);
        }
        if (StringPropertyInvoker.isMode(cw_2.s(hUD), WR.b)) {
            notification3.c = ScaledResolutionInvoker.g(scaledResolution) - 42 * (ListInvoker.indexOf(this.a, notification2) + 1);
            notification3.t = ScaledResolutionInvoker.a(scaledResolution) - 12;
        }
        notification3.c = 15 * (ListInvoker.indexOf(this.a, notification2) + 1);
        notification3.t = ScaledResolutionInvoker.a(scaledResolution) / 2;
    }

    public Color a(NotificationType notificationType) {
        switch (notificationType) {
            case WARNING: {
                return new Color(255, 182, 0);
            }
            case SUCCESS: {
                return new Color(85, 255, 53);
            }
            case ERROR: {
                return new Color(255, 72, 72);
            }
        }
        return new Color(0, 120, 200);
    }

    public List<Notification> a() {
        return this.a;
    }

    public void a(@NotNull String string, @NotNull String string2, int n, @Nullable NotificationType notificationType) {
        NotificationType.b();
        Notification notification = new Notification(notificationType, string, string2, n);
        Iterator iterator = ListInvoker.iterator(this.a());
        if (dz_0.c(iterator)) {
            Notification notification2 = (Notification)dz_0.b(iterator);
            if (D6.a(notification).equals(D6.a(notification2)) && D6.b(notification).equals(D6.b(notification2))) {
                return;
            }
        }
        this.a(notification);
    }

    public NotificationManager() {
        this.a = new CopyOnWriteArrayList<Notification>();
    }

    public void a(@NotNull String string, @Nullable NotificationType notificationType) {
        this.a(aod_2.d(StringInvoker.i(notificationType.name())), string, 2000, notificationType);
    }
}


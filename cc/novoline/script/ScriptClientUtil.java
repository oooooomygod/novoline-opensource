/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.script;

import cc.novoline.invoke.NotificationManagerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import deobf.Entity;
import deobf.MCInvoker;
import net.ChatComponentText;
import net.GW;
import net.KillAura;
import net.NotificationType;
import net.a7r_0;
import net.aen_2;
import net.atH;
import net.awe_0;
import net.kp_1;
import net.wc_1;
import net.skidunion.annotations;

public class ScriptClientUtil {
    @annotations
    public String getVersion() {
        return NovolineInvoker.getInstance().getVersion();
    }

    @annotations
    public void toggleModule(String string) {
        wc_1.k(aen_2.a(NovolineInvoker.l(NovolineInvoker.getInstance()), string));
    }

    @annotations
    public void print(String ... stringArray) {
        String string = a7r_0.b(stringArray);
        kp_1.a(GW.f(MCInvoker.f().ingameGUI), new ChatComponentText(string));
    }

    @annotations
    public Entity getAuraTarget() {
        KillAura killAura = (KillAura)aen_2.a(NovolineInvoker.l(NovolineInvoker.getInstance()), KillAura.class);
        return atH.a(killAura);
    }

    @annotations
    public boolean isEnabled(String string) {
        return wc_1.g(awe_0.a(aen_2.c(NovolineInvoker.l(NovolineInvoker.getInstance())), string));
    }

    @annotations
    public void postNotification(String string, String string2, int n, NotificationType notificationType) {
        NotificationManagerInvoker.a(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), string, string2, n, notificationType);
    }
}


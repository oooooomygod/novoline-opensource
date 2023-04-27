/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.NotificationManagerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.MCInvoker;
import net.HW;
import net.NotificationType;
import net.Session;
import net.aL0;
import net.aeo_0;
import net.ah2_0;
import net.ahu_2;
import net.ahv_1;
import net.ahv_2;
import net.awc_1;

/*
 * Renamed from net.ahU
 */
class ahu_1
extends ah2_0 {
    ahv_1 i;

    @Override
    public double a() {
        return ((ahu_2)this.c()).a() + 200.0;
    }

    ahu_1(ahv_1 ahv_12, ahu_2 ahu_22, String string) {
        this.i = ahv_12;
        super(ahu_22, string);
    }

    @Override
    public double e() {
        return ((ahu_2)this.c()).e() + 230.0;
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public void a(int n, int n2, int n3) {
        ahv_2.e();
        if (this.a(n, n2) && n3 == 0) {
            this.a(false);
            ((ahv_2)((ahu_2)this.c()).c()).a(true);
            String string = aeo_0.a(this.i.a());
            String string2 = StringInvoker.b(string, 0, MathInvoker.b(16, StringInvoker.c(string)));
            MCInvoker.f().session = new Session(string2, awc_1.a().toString(), HW.d, HW.b);
            NotificationManagerInvoker.a(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), HW.c, aL0.a(aL0.a(new StringBuilder(), HW.a), string2).toString(), NotificationType.INFO);
        }
    }
}


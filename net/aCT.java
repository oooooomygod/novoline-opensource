/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.MCInvoker;
import deobf.TimerUtil;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;

public class aCT {
    public double c;
    public double a;
    private Minecraft e = MCInvoker.f();
    private l9 d;
    private List<tt_2> b = new ArrayList<tt_2>();

    public void a(int n, double d, int n2) {
        TimerUtil.e();
        int n3 = 0;
        if (n3 < n2) {
            ListInvoker.add(this.b, new tt_2(this, this.a, this.c, n, d));
            ++n3;
        }
    }

    public void a(double d, double d2, int n) {
        TimerUtil.e();
        int n2 = 0;
        if (n2 < n) {
            ListInvoker.add(this.b, new tt_2(this, d, d2));
            ++n2;
        }
    }

    private static boolean lambda$draw$4(tt_2 tt_22) {
        TimerUtil.e();
        return tt_22.a <= 0.45;
    }

    public void a(boolean bl, boolean bl2) {
        TimerUtil.e();
        if (!ListInvoker.isEmpty(this.b)) {
            double d = ua_2.a(true);
            ListInvoker.removeIf(this.b, aCT::lambda$draw$0);
            agg_2.a(this.d, 9, 400, true, () -> this.lambda$draw$2(bl2), null);
            ListInvoker.forEach(this.b, arg_0 -> aCT.lambda$draw$3(bl2, arg_0));
            ua_2.a(d);
        }
    }

    public void a(double d, int n) {
        TimerUtil.e();
        int n2 = 0;
        if (n2 < n) {
            ListInvoker.add(this.b, new tt_2(this, this.a, this.c, d));
            ++n2;
        }
    }

    public void a(int n) {
        TimerUtil.e();
        int n2 = 0;
        if (n2 < n) {
            ListInvoker.add(this.b, new tt_2(this, this.a, this.c));
            ++n2;
        }
    }

    public void a() {
        this.b.clear();
    }

    private static void lambda$draw$7(int n, boolean bl, tt_2 tt_22) {
        un_2.a(tt_22, n, bl);
    }

    private void lambda$draw$6(int n, boolean bl) {
        ListInvoker.forEach(this.b, arg_0 -> aCT.lambda$null$5(n, bl, arg_0));
    }

    public void a(double d, double d2, double d3, int n) {
        TimerUtil.e();
        int n2 = 0;
        if (n2 < n) {
            ListInvoker.add(this.b, new tt_2(this, d, d2, d3));
            ++n2;
        }
    }

    private void lambda$draw$2(boolean bl) {
        ListInvoker.forEach(this.b, arg_0 -> aCT.lambda$null$1(bl, arg_0));
    }

    public aCT() {
        this.d = new l9();
    }

    public void a(int n, int n2, double d, int n3) {
        TimerUtil.e();
        int n4 = 0;
        if (n4 < n3) {
            ListInvoker.add(this.b, new tt_2(this, this.a, this.c, n, n2, d));
            ++n4;
        }
    }

    public void a(boolean bl, int n, boolean bl2) {
        TimerUtil.e();
        if (!ListInvoker.isEmpty(this.b)) {
            double d = ua_2.a(true);
            ListInvoker.removeIf(this.b, aCT::lambda$draw$4);
            agg_2.a(this.d, 9, 400, true, () -> this.lambda$draw$6(n, bl2), null);
            ListInvoker.forEach(this.b, arg_0 -> aCT.lambda$draw$7(n, bl2, arg_0));
            ua_2.a(d);
        }
    }

    private static void lambda$draw$3(boolean bl, tt_2 tt_22) {
        un_2.a(tt_22, bl);
    }

    private static void lambda$null$1(boolean bl, tt_2 tt_22) {
        un_2.a(tt_22, -0.4, bl);
    }

    private static void lambda$null$5(int n, boolean bl, tt_2 tt_22) {
        un_2.a(tt_22, -0.4, n, bl);
    }

    private static boolean lambda$draw$0(tt_2 tt_22) {
        TimerUtil.e();
        return tt_22.a <= 0.45;
    }
}


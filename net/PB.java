/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import java.util.ArrayList;
import java.util.List;
import net.D2;
import net.a5K;
import net.aRS;
import net.ajJ;
import net.ala_1;
import net.aov_2;
import net.asj_0;
import net.ay_2;

public class PB {
    public List<D2> b = new ArrayList<D2>();
    public String a;
    public float c;

    public void a(a5K a5K2, String string, String string2) {
        D2.b();
        int n = 0;
        if (n < ListInvoker.size(this.b)) {
            if ((StringInvoker.d(((D2)ListInvoker.get(this.b, (int)n)).f, string) | StringInvoker.d(((D2)ListInvoker.get(this.b, (int)n)).f, aov_2.a)) & StringInvoker.d(((D2)ListInvoker.get(this.b, (int)n)).h, string2)) {
                if (((D2)ListInvoker.get(this.b, (int)n)).d == aRS.ROT) {
                    asj_0.a(a5K2.D, ((D2)ListInvoker.get(this.b, (int)n)).a, ala_1.a((D2)ListInvoker.get(this.b, n), ((D2)ListInvoker.get(this.b, (int)n)).a == ajJ.X ? a5K2.D.c.x : (((D2)ListInvoker.get(this.b, (int)n)).a == ajJ.Y ? a5K2.D.c.y : a5K2.D.c.z)), ((D2)ListInvoker.get(this.b, (int)n)).i);
                }
                if (((D2)ListInvoker.get(this.b, (int)n)).d == aRS.PREROT) {
                    asj_0.a(a5K2.H, ((D2)ListInvoker.get(this.b, (int)n)).a, ala_1.a((D2)ListInvoker.get(this.b, n), ((D2)ListInvoker.get(this.b, (int)n)).a == ajJ.X ? a5K2.H.c.x : (((D2)ListInvoker.get(this.b, (int)n)).a == ajJ.Y ? a5K2.H.c.y : a5K2.H.c.z)), ((D2)ListInvoker.get(this.b, (int)n)).i);
                }
                if (((D2)ListInvoker.get(this.b, (int)n)).d == aRS.SCALE) {
                    boolean cfr_ignored_0 = ((D2)ListInvoker.get(this.b, (int)n)).a == null | ((D2)ListInvoker.get(this.b, (int)n)).a == ajJ.X;
                    boolean cfr_ignored_1 = ((D2)ListInvoker.get(this.b, (int)n)).a == null | ((D2)ListInvoker.get(this.b, (int)n)).a == ajJ.Y;
                    boolean cfr_ignored_2 = ((D2)ListInvoker.get(this.b, (int)n)).a == null | ((D2)ListInvoker.get(this.b, (int)n)).a == ajJ.Z;
                }
            }
            ++n;
        }
    }

    public PB(String string) {
        this.a = string;
        this.c = 0.0f;
    }

    public void a(ay_2 ay_22, String string, String string2) {
        D2.b();
        int n = 0;
        if (n < ListInvoker.size(this.b)) {
            if ((StringInvoker.d(((D2)ListInvoker.get(this.b, (int)n)).f, string) | StringInvoker.d(((D2)ListInvoker.get(this.b, (int)n)).f, aov_2.b)) & StringInvoker.d(((D2)ListInvoker.get(this.b, (int)n)).h, string2) && ((D2)ListInvoker.get(this.b, (int)n)).d == aRS.ROT) {
                asj_0.a(ay_22, ((D2)ListInvoker.get(this.b, (int)n)).a, ala_1.a((D2)ListInvoker.get(this.b, n), ((D2)ListInvoker.get(this.b, (int)n)).a == ajJ.X ? ay_22.c.x : (((D2)ListInvoker.get(this.b, (int)n)).a == ajJ.Y ? ay_22.c.y : ay_22.c.z)), ((D2)ListInvoker.get(this.b, (int)n)).i);
            }
            ++n;
        }
    }
}


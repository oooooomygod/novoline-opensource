/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.stats;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import deobf.IChatComponent;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import net.ChatComponentText;
import net.H6;
import net.HX;
import net.aBO;
import net.aL0;
import net.aOA;
import net.aQG;
import net.ac__0;
import net.amn_0;
import net.anw_0;
import net.aon_1;
import net.aop_1;
import net.ap_1;
import net.ash_0;
import net.asr_1;
import net.awz_0;
import net.axq_2;
import net.azi_2;
import net.dw_1;
import net.yt_0;

public class StatBase {
    public boolean j;
    public String l;
    private static DecimalFormat a;
    public static aQG b;
    private aQG h;
    private Class<? extends ac__0> i;
    public static aQG g;
    public static aQG d;
    private static NumberFormat k;
    public static aQG f;
    private IChatComponent e;
    private aOA c;

    public IChatComponent e() {
        IChatComponent iChatComponent = this.g();
        IChatComponent iChatComponent2 = aBO.a(axq_2.a(new ChatComponentText(azi_2.k), iChatComponent), azi_2.f);
        aBO.a(iChatComponent2, aBO.f(iChatComponent));
        return iChatComponent2;
    }

    public IChatComponent g() {
        IChatComponent iChatComponent = aBO.c(this.e);
        HX.a(aBO.f(iChatComponent), anw_0.GRAY);
        HX.a(aBO.f(iChatComponent), new amn_0(H6.SHOW_ACHIEVEMENT, new ChatComponentText(this.l)));
        return iChatComponent;
    }

    public aOA f() {
        return this.c;
    }

    public Class<? extends ac__0> c() {
        return this.i;
    }

    public StatBase(String string, IChatComponent iChatComponent, aQG aQG2) {
        this.l = string;
        this.e = iChatComponent;
        this.h = aQG2;
        this.c = new yt_0(this);
        MapInvoker.c(aOA.c, aon_1.a(this.c), this.c);
    }

    public StatBase(String string, IChatComponent iChatComponent) {
        this(string, iChatComponent, b);
    }

    public StatBase b() {
        if (MapInvoker.b(aop_1.H, this.l)) {
            throw new RuntimeException(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), azi_2.i), ((StatBase)MapInvoker.c(aop_1.H, (Object)this.l)).e), azi_2.d), this.e), azi_2.h), this.l).toString());
        }
        ListInvoker.add(aop_1.o, this);
        MapInvoker.c(aop_1.H, this.l, this);
        return this;
    }

    public boolean a() {
        return false;
    }

    public StatBase i() {
        this.j = true;
        return this;
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), azi_2.j), this.l), azi_2.g), this.e), azi_2.c), this.j), azi_2.e), this.h), azi_2.a), this.c), '}').toString();
    }

    public String a(int n) {
        return this.h.a(n);
    }

    static DecimalFormat d() {
        return a;
    }

    static {
        k = asr_1.a(Locale.US);
        b = new ap_1();
        a = new DecimalFormat(azi_2.b);
        f = new ash_0();
        d = new dw_1();
        g = new awz_0();
    }

    static NumberFormat h() {
        return k;
    }

    public int hashCode() {
        return this.l.hashCode();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (this.getClass() == object.getClass()) {
            StatBase statBase = (StatBase)object;
            return this.l.equals(statBase.l);
        }
        return false;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    public StatBase a(Class<? extends ac__0> clazz) {
        this.i = clazz;
        return this;
    }
}


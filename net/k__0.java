/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.TimerUtil;
import net.ChatComponentText;
import net.ChatStyle;
import net.HX;
import net.aL0;
import net.aff_1;
import net.an5_0;
import net.anw_0;
import net.auk_2;
import net.axq_2;

/*
 * Renamed from net.k_
 */
public class k__0 {
    private ChatStyle e;
    private static anw_0 a = anw_0.WHITE;
    private boolean d;
    private ChatComponentText b;
    private ChatComponentText c;

    public k__0 a(String string) {
        TimerUtil.e();
        this.c();
        this.c = new ChatComponentText(string);
        this.e = new ChatStyle();
        if (this.d) {
            this.a(a);
        }
        return this;
    }

    public k__0() {
        this.b = new ChatComponentText(an5_0.a);
        this.d = false;
        this.e = new ChatStyle();
        this.c = new ChatComponentText(an5_0.e);
    }

    private void c() {
        axq_2.a(this.b, axq_2.a(this.c, this.e));
    }

    public k__0(boolean bl, boolean bl2) {
        TimerUtil.e();
        this.b = new ChatComponentText(an5_0.d);
        this.d = false;
        this.e = new ChatStyle();
        this.c = new ChatComponentText(an5_0.b);
        axq_2.a(this.b, aff_1.a(new k__0(false, false).a(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.AQUA), an5_0.c).toString()).a(anw_0.RED).f()));
        this.d = bl2;
    }

    public k__0 a() {
        HX.b(this.e, auk_2.b(true));
        return this;
    }

    public k__0 e() {
        HX.d(this.e, auk_2.b(true));
        return this;
    }

    public k__0 d() {
        HX.a(this.e, auk_2.b(true));
        return this;
    }

    public k__0 b() {
        HX.c(this.e, auk_2.b(true));
        return this;
    }

    public aff_1 f() {
        this.c();
        return new aff_1(this.b, null);
    }

    public k__0 a(anw_0 anw_02) {
        HX.a(this.e, anw_02);
        return this;
    }
}


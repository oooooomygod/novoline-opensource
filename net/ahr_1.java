/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import cc.novoline.utils.fonts.api.FontRenderer;
import cc.novoline.gui.alt.AltList;
import java.awt.Color;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.ahR
 */
public class ahr_1
extends ahp_2<ahv_2> {
    private String i;
    private float g;
    private static boolean a;
    private FontRenderer h;

    public static void c(boolean bl) {
        a = bl;
    }

    @Override
    public double e() {
        return ((ahv_2)this.c()).e() - avf_2.h((AltList)((ahv_2)this.c()).c()) + 215.0 - (double)(a7l_0.a(this.h, this.i) / 2);
    }

    public static boolean e() {
        return a;
    }

    public ahr_1(ahv_2 ahv_22, FontRenderer fontRenderer, String string) {
        super(ahv_22);
        this.i = string;
        this.h = fontRenderer;
    }

    @Override
    public double a() {
        return ((ahv_2)this.c()).a() + 233.0;
    }

    @Override
    public void b(int n, int n2) {
    }

    @Override
    public void c(int n, int n2) {
        ahr_1.e();
        if (this.a(n, n2)) {
            this.g += (1.0f - this.g) * 0.02f;
        }
        this.g -= this.g * 0.02f;
        a7l_0.b(this.h, this.i, this.e(), this.a(), a1V.a(aol_1.d(Color.WHITE), Color.WHITE, (double)this.g), true);
    }

    @Override
    public void a(int n, int n2, int n3) {
    }

    @Override
    public void a(char c, int n) {
    }

    protected boolean a(int n, int n2) {
        ahr_1.e();
        return MathInvoker.a((double)n - (this.e() + (double)(a7l_0.a(this.h, this.i) / 2))) <= 12.0 && MathInvoker.a((double)n2 - (this.a() + (double)(a7l_0.a(this.h) / 2))) <= 12.0;
    }

    static {
        if (ahr_1.e()) {
            ahr_1.c(true);
        }
    }

    public static boolean a() {
        ahr_1.e();
        return true;
    }

    @Override
    public void a(int n, int n2) {
    }
}


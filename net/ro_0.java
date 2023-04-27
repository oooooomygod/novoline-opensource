/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.KeyboardInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import net.minecraft.init.Blocks;
import deobf.GuiScreen;
import deobf.MCInvoker;
import java.io.IOException;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.Ro
 */
public class ro_0
extends GuiScreen {
    private Rx y;
    private String w;
    private String x;
    private static List<MJ> z = my_0.c();
    private sc_0 C;
    private ai1_0 A;
    private String B;
    private QG v;

    static List b() {
        return z;
    }

    private static void a(String string, Item item, int n, il_0 il_02, List<String> list, wi_1 ... wi_1Array) {
        nv_0 nv_02 = new nv_0();
        int n2 = wi_1Array.length - 1;
        while (true) {
            ListInvoker.add(KX.a(nv_02), wi_1Array[n2]);
            --n2;
        }
    }

    @Override
    public void i() {
        KeyboardInvoker.a(false);
    }

    @Override
    public void a(int n, int n2, float f) {
        this.h();
        this.A.a(n, n2, f);
        this.b(this.q, this.x, this.n / 2, 8, 0xFFFFFF);
        this.a(this.q, this.B, 50, 30, 0xA0A0A0);
        this.a(this.q, this.w, 50, 70, 0xA0A0A0);
        hc_1.d(this.C);
        super.a(n, n2, f);
    }

    static ai1_0 a(ro_0 ro_02) {
        return ro_02.A;
    }

    private boolean c() {
        return this.A.x > -1 && this.A.x < ListInvoker.size(z) || StringInvoker.c(hc_1.a(this.C)) > 1;
    }

    public ro_0(Rx rx) {
        this.y = rx;
    }

    @Override
    public void g() {
        hc_1.c(this.C);
        super.g();
    }

    @Override
    protected void a(char c, int n) throws IOException {
        if (!hc_1.a(this.C, c, n)) {
            super.a(c, n);
        }
    }

    @Override
    public void l() {
        ListInvoker.clear(this.l);
        KeyboardInvoker.a(true);
        this.x = I18n.format(ala_0.i, new Object[0]);
        this.B = I18n.format(ala_0.M, new Object[0]);
        this.w = I18n.format(ala_0.C, new Object[0]);
        this.C = new sc_0(2, this.q, 50, 40, this.n - 100, 20);
        this.A = new ai1_0(this);
        hc_1.a(this.C, 1230);
        hc_1.b(this.C, pq_2.b(this.y));
        this.v = new QG(0, this.n / 2 - 155, this.f - 28, 150, 20, I18n.format(ala_0.I, new Object[0]));
        ListInvoker.add(this.l, this.v);
        ListInvoker.add(this.l, new QG(1, this.n / 2 + 5, this.f - 28, 150, 20, I18n.format(ala_0.k, new Object[0])));
        this.a();
    }

    private static void a(String string, Item item, il_0 il_02, List<String> list, wi_1 ... wi_1Array) {
        ro_0.a(string, item, 0, il_02, list, wi_1Array);
    }

    private static void a(String string, Item item, il_0 il_02, wi_1 ... wi_1Array) {
        ro_0.a(string, item, 0, il_02, (List<String>)null, wi_1Array);
    }

    @Override
    protected void a(QG qG) throws IOException {
        if (qG.m == 0 && this.c()) {
            pq_2.a(this.y, hc_1.a(this.C));
            MCInvoker.displayGuiScreen(this.t, this.y);
        } else if (qG.m == 1) {
            MCInvoker.displayGuiScreen(this.t, this.y);
        }
    }

    @Override
    protected void b(int n, int n2, int n3) throws IOException {
        this.C.a(n, n2, n3);
        super.b(n, n2, n3);
    }

    static {
        ro_0.a(ala_0.h, px_0.a(Blocks.grass), il_0.G, a7r_0.a(new String[]{ala_0.j}), new wi_1(1, Blocks.grass), new wi_1(2, Blocks.dirt), new wi_1(1, Blocks.bedrock));
        ro_0.a(ala_0.w, px_0.a(Blocks.stone), il_0.L, a7r_0.a(new String[]{ala_0.t, ala_0.H, ala_0.D, ala_0.e, ala_0.a}), new wi_1(1, Blocks.grass), new wi_1(5, Blocks.dirt), new wi_1(230, Blocks.stone), new wi_1(1, Blocks.bedrock));
        ro_0.a(ala_0.u, Items.water_bucket, il_0.r, a7r_0.a(new String[]{ala_0.o, ala_0.z}), new wi_1(90, Blocks.water), new wi_1(5, Blocks.sand), new wi_1(5, Blocks.dirt), new wi_1(5, Blocks.stone), new wi_1(1, Blocks.bedrock));
        ro_0.a(ala_0.G, px_0.a(Blocks.bN), aW5.a(a4b.GRASS), il_0.G, a7r_0.a(new String[]{ala_0.A, ala_0.d, ala_0.y, ala_0.r, ala_0.p, ala_0.F, ala_0.b, ala_0.K}), new wi_1(1, Blocks.grass), new wi_1(3, Blocks.dirt), new wi_1(59, Blocks.stone), new wi_1(1, Blocks.bedrock));
        ro_0.a(ala_0.E, px_0.a(Blocks.cm), il_0.n, a7r_0.a(new String[]{ala_0.J, ala_0.c}), new wi_1(1, Blocks.cm), new wi_1(1, Blocks.grass), new wi_1(3, Blocks.dirt), new wi_1(59, Blocks.stone), new wi_1(1, Blocks.bedrock));
        ro_0.a(ala_0.L, Items.feather, il_0.G, a7r_0.a(new String[]{ala_0.m, ala_0.B}), new wi_1(1, Blocks.grass), new wi_1(3, Blocks.dirt), new wi_1(2, Blocks.cobblestone));
        ro_0.a(ala_0.l, px_0.a(Blocks.sand), il_0.V, a7r_0.a(new String[]{ala_0.x, ala_0.n, ala_0.v, ala_0.q, ala_0.f, ala_0.s}), new wi_1(8, Blocks.sand), new wi_1(52, Blocks.bG), new wi_1(3, Blocks.stone), new wi_1(1, Blocks.bedrock));
        ro_0.a(ala_0.g, Items.redstone, il_0.V, new wi_1(52, Blocks.bG), new wi_1(3, Blocks.stone), new wi_1(1, Blocks.bedrock));
    }

    static sc_0 b(ro_0 ro_02) {
        return ro_02.C;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public void a() {
        boolean bl;
        this.v.g = bl = this.c();
    }

    @Override
    public void c() throws IOException {
        super.c();
        this.A.g();
    }
}


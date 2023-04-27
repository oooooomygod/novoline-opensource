/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.PacketBufferInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import net.minecraft.network.packts.C17PacketCustomPayload;
import java.io.IOException;
import java.util.Iterator;

/*
 * Renamed from net.Rm
 */
public class rm_0
extends GuiContainer {
    private rs_1 aj;
    private Q9 ai;
    private static ResourceLocation ak = new ResourceLocation(ad9_0.b);
    private boolean al;

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void g() {
        super.g();
        int n = apw_0.a(this.aj, 0);
        int n2 = apw_0.a(this.aj, 1);
        apw_0.a(this.aj, 2);
        if (this.al) {
            this.al = false;
            int n3 = 0;
            while (true) {
                int n4 = a6G.r[n3].length;
                int n5 = n4 * 22 + (n4 - 1) * 2;
                for (int i = 0; i < n4; ++i) {
                    int n6 = ari_0.f(a6G.r[n3][i]);
                    QH qH = new QH(this, n3 << 8 | n6, this.P + 76 + i * 24 - n5 / 2, this.A + 22 + n3 * 25, n6, n3);
                    ListInvoker.add(this.l, qH);
                    if (n3 >= n) {
                        qH.g = false;
                        continue;
                    }
                    if (n6 != n2) continue;
                    qH.a(true);
                }
                ++n3;
            }
        }
        this.ai.g = apw_0.b(this.aj, 0) != null;
    }

    @Override
    protected void a(float f, int n, int n2) {
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.t), ak);
        int n3 = (this.n - this.L) / 2;
        int n4 = (this.f - this.Y) / 2;
        this.c(n3, n4, 0, 0, this.L, this.Y);
        this.i.e = 100.0f;
        DU.b(this.i, new ItemStack(Items.emerald), n3 + 42, n4 + 109);
        DU.b(this.i, new ItemStack(Items.diamond), n3 + 42 + 22, n4 + 109);
        DU.b(this.i, new ItemStack(Items.gold_ingot), n3 + 42 + 44, n4 + 109);
        DU.b(this.i, new ItemStack(Items.iron_ingot), n3 + 42 + 66, n4 + 109);
        this.i.e = 0.0f;
    }

    static void a(rm_0 rm_02, String string, int n, int n2) {
        rm_02.a(string, n, n2);
    }

    static ResourceLocation a() {
        return ak;
    }

    static void b(rm_0 rm_02, String string, int n, int n2) {
        rm_02.a(string, n, n2);
    }

    static void c(rm_0 rm_02, String string, int n, int n2) {
        rm_02.a(string, n, n2);
    }

    @Override
    protected void a(QG qG) throws IOException {
        if (qG.m == -2) {
            MCInvoker.displayGuiScreen(this.t, null);
        } else if (qG.m == -1) {
            String string = ad9_0.e;
            PacketBuffer packetBuffer = new PacketBuffer(FH.d());
            PacketBufferInvoker.e(packetBuffer, apw_0.a(this.aj, 1));
            PacketBufferInvoker.e(packetBuffer, apw_0.a(this.aj, 2));
            aDM.a(MCInvoker.aa(this.t), new C17PacketCustomPayload(ad9_0.d, packetBuffer));
            MCInvoker.displayGuiScreen(this.t, null);
        } else if (qG instanceof QH) {
            if (((QH)qG).a()) {
                return;
            }
            int n = qG.m;
            int n2 = n & 0xFF;
            int n3 = n >> 8;
            if (n3 < 3) {
                apw_0.a(this.aj, 1, n2);
            } else {
                apw_0.a(this.aj, 2, n2);
            }
            ListInvoker.clear(this.l);
            this.l();
            this.g();
        }
    }

    @Override
    public void l() {
        super.l();
        this.ai = new Q9(this, -1, this.P + 164, this.A + 107);
        ListInvoker.add(this.l, this.ai);
        ListInvoker.add(this.l, new QM(this, -2, this.P + 190, this.A + 107));
        this.al = true;
        this.ai.g = false;
    }

    public rm_0(aSK aSK2, rs_1 rs_12) {
        super(new aaq_1(aSK2, rs_12));
        this.aj = rs_12;
        this.L = 230;
        this.Y = 219;
    }

    @Override
    protected void b(int n, int n2) {
        ne_0.e();
        this.b(this.q, I18n.format(ad9_0.a, new Object[0]), 62, 10, 0xE0E0E0);
        this.b(this.q, I18n.format(ad9_0.c, new Object[0]), 169, 10, 0xE0E0E0);
        Iterator iterator = ListInvoker.iterator(this.l);
        while (dz_0.c(iterator)) {
            QG qG = (QG)dz_0.b(iterator);
            if (!atB.a(qG)) continue;
            atB.a(qG, n - this.P, n2 - this.A);
            break;
        }
        ne_0.f();
    }
}


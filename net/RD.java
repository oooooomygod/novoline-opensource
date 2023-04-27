/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.EntityRendererInvoker;
import cc.novoline.invoke.IStreamInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.EnumDifficulty;
import deobf.GameSettings;
import deobf.GuiControls;
import deobf.GuiScreen;
import cc.novoline.invoke.ListArrayInvoker;
import deobf.GuiYesNoCallback;
import deobf.IChatComponent;
import deobf.MCInvoker;
import java.io.IOException;

public class RD
extends GuiScreen
implements GuiYesNoCallback {
    private GameSettings y;
    private static aj2[] x = new aj2[]{aj2.FOV};
    private QG w;
    protected String v = ud_1.c;
    private qf_0 z;
    private GuiScreen A;

    @Override
    public void l() {
        int n = 0;
        this.v = I18n.format(ud_1.p, new Object[0]);
        for (aj2 aj22 : x) {
            if (aDY.b(aj22)) {
                ListInvoker.add(this.l, new qt_0(aDY.e(aj22), this.n / 2 - 155 + n % 2 * 160, this.f / 6 - 12 + 24 * (n >> 1), aj22));
            } else {
                qe_0 qe_02 = new qe_0(aDY.e(aj22), this.n / 2 - 155 + n % 2 * 160, this.f / 6 - 12 + 24 * (n >> 1), aj22, awu_1.a(this.y, aj22));
                ListInvoker.add(this.l, qe_02);
            }
            ++n;
        }
        if (this.t.world != null) {
            EnumDifficulty enumDifficulty = BlockInvoker.d(this.t.world);
            this.w = new QG(108, this.n / 2 - 155 + n % 2 * 160, this.f / 6 - 12 + 24 * (n >> 1), 150, 20, this.a(enumDifficulty));
            ListInvoker.add(this.l, this.w);
            if (MCInvoker.k(this.t) && !uv_2.t(BlockInvoker.q(this.t.world))) {
                atB.a(this.w, atB.b(this.w) - 20);
                this.z = new qf_0(109, (int)this.w.n + atB.b(this.w), (int)this.w.h);
                ListInvoker.add(this.l, this.z);
                h_0.a(this.z, uv_2.c(BlockInvoker.q(this.t.world)));
                this.z.g = !h_0.a(this.z);
                this.w.g = !h_0.a(this.z);
            } else {
                this.w.g = false;
            }
        }
        ListInvoker.add(this.l, new QG(110, this.n / 2 - 155, this.f / 6 + 48 - 6, 150, 20, I18n.format(ud_1.r, new Object[0])));
        ListInvoker.add(this.l, new QN(this, 8675309, this.n / 2 + 5, this.f / 6 + 48 - 6, 150, 20, ud_1.n));
        ListInvoker.add(this.l, new QG(106, this.n / 2 - 155, this.f / 6 + 72 - 6, 150, 20, I18n.format(ud_1.i, new Object[0])));
        ListInvoker.add(this.l, new QG(107, this.n / 2 + 5, this.f / 6 + 72 - 6, 150, 20, I18n.format(ud_1.m, new Object[0])));
        ListInvoker.add(this.l, new QG(101, this.n / 2 - 155, this.f / 6 + 96 - 6, 150, 20, I18n.format(ud_1.e, new Object[0])));
        ListInvoker.add(this.l, new QG(100, this.n / 2 + 5, this.f / 6 + 96 - 6, 150, 20, I18n.format(ud_1.g, new Object[0])));
        ListInvoker.add(this.l, new QG(102, this.n / 2 - 155, this.f / 6 + 120 - 6, 150, 20, I18n.format(ud_1.o, new Object[0])));
        ListInvoker.add(this.l, new QG(103, this.n / 2 + 5, this.f / 6 + 120 - 6, 150, 20, I18n.format(ud_1.a, new Object[0])));
        ListInvoker.add(this.l, new QG(105, this.n / 2 - 155, this.f / 6 + 144 - 6, 150, 20, I18n.format(ud_1.l, new Object[0])));
        ListInvoker.add(this.l, new QG(104, this.n / 2 + 5, this.f / 6 + 144 - 6, 150, 20, I18n.format(ud_1.b, new Object[0])));
        ListInvoker.add(this.l, new QG(200, this.n / 2 - 100, this.f / 6 + 168, I18n.format(ud_1.d, new Object[0])));
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void a(boolean bl, int n) {
        MCInvoker.displayGuiScreen(this.t, this);
        if (n == 109 && this.t.world != null) {
            uv_2.g(BlockInvoker.q(this.t.world), true);
            h_0.a(this.z, true);
            this.z.g = false;
            this.w.g = false;
        }
    }

    public String a(EnumDifficulty enumDifficulty) {
        ChatComponentText chatComponentText = new ChatComponentText(ud_1.q);
        aBO.a((IChatComponent)chatComponentText, new aoz_1(ud_1.h, new Object[0]));
        aBO.a((IChatComponent)chatComponentText, ud_1.j);
        aBO.a((IChatComponent)chatComponentText, new aoz_1(aYj.b(enumDifficulty), new Object[0]));
        return aBO.a(chatComponentText);
    }

    public RD(GuiScreen guiScreen, GameSettings gameSettings) {
        this.A = guiScreen;
        this.y = gameSettings;
    }

    @Override
    public void a(int n, int n2, float f) {
        this.h();
        this.b(this.q, this.v, this.n / 2, 15, 0xFFFFFF);
        super.a(n, n2, f);
    }

    @Override
    protected void a(QG qG) throws IOException {
        if (qG.g) {
            Object object;
            if (qG.m < 100 && qG instanceof qe_0) {
                object = ud_0.a((qe_0)qG);
                awu_1.a(this.y, object, 1);
                qG.k = awu_1.a(this.y, aDY.a(qG.m));
            }
            if (qG.m == 108) {
                uv_2.a(BlockInvoker.q(this.t.world), aYj.a(aYj.a(BlockInvoker.d(this.t.world)) + 1));
                this.w.k = this.a(BlockInvoker.d(this.t.world));
            }
            if (qG.m == 109) {
                MCInvoker.displayGuiScreen(this.t, new GuiYesNo(this, aIW.c(new aoz_1(ud_1.k, new Object[0])), aIW.c(new aoz_1(ud_1.f, new aoz_1(aYj.b(uv_2.m(BlockInvoker.q(this.t.world))), new Object[0]))), 109));
            }
            if (qG.m == 110) {
                awu_1.c(this.t.gameSettings);
                MCInvoker.displayGuiScreen(this.t, new RQ(this));
            }
            if (qG.m == 8675309) {
                EntityRendererInvoker.g(this.t.entityRenderer);
            }
            if (qG.m == 101) {
                awu_1.c(this.t.gameSettings);
                MCInvoker.displayGuiScreen(this.t, new re_0(this, this.y));
            }
            if (qG.m == 100) {
                awu_1.c(this.t.gameSettings);
                MCInvoker.displayGuiScreen(this.t, new GuiControls(this, this.y));
            }
            if (qG.m == 102) {
                awu_1.c(this.t.gameSettings);
                MCInvoker.displayGuiScreen(this.t, new RL(this, this.y, MCInvoker.i(this.t)));
            }
            if (qG.m == 103) {
                awu_1.c(this.t.gameSettings);
                MCInvoker.displayGuiScreen(this.t, new RN(this, this.y));
            }
            if (qG.m == 104) {
                awu_1.c(this.t.gameSettings);
                MCInvoker.displayGuiScreen(this.t, new rq_0(this, this.y));
            }
            if (qG.m == 200) {
                awu_1.c(this.t.gameSettings);
                MCInvoker.displayGuiScreen(this.t, this.A);
            }
            if (qG.m == 105) {
                awu_1.c(this.t.gameSettings);
                MCInvoker.displayGuiScreen(this.t, new RB(this));
            }
            if (qG.m == 106) {
                awu_1.c(this.t.gameSettings);
                MCInvoker.displayGuiScreen(this.t, new RE(this, this.y));
            }
            if (qG.m == 107) {
                awu_1.c(this.t.gameSettings);
                object = MCInvoker.a(this.t);
                if (IStreamInvoker.r((a5f_0)object) && IStreamInvoker.k((a5f_0)object)) {
                    MCInvoker.displayGuiScreen(this.t, new sl_0(this, this.y));
                } else {
                    ListArrayInvoker.a(this);
                }
            }
        }
    }
}


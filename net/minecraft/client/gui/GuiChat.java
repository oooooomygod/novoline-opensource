/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.gui;

import cc.novoline.events.events.RenderGuiEvent;
import cc.novoline.invoke.EventManagerInvoker;
import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.KeyboardInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.MouseInvoker;
import cc.novoline.invoke.ObjectMouseOverInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.GuiScreen;
import deobf.IChatComponent;
import deobf.MCInvoker;
import net.minecraft.network.packts.C14PacketTabComplete;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.BlockPos;
import net.ChatComponentText;
import org.apache.logging.log4j.Logger;

public class GuiChat
extends GuiScreen {
    private int y;
    private boolean v;
    private List<String> z;
    private static Logger B = LogManagerInvoker.c();
    private int w;
    private String C;
    protected sc_0 x;
    private String D;
    private boolean A;

    public void a(int n) {
        int n2 = this.w + n;
        int n3 = ListInvoker.size(kp_1.d(GW.f(this.t.ingameGUI)));
        if ((n2 = MathHelper.a(n2, 0, n3)) != this.w) {
            if (n2 == n3) {
                this.w = n3;
                hc_1.b(this.x, this.C);
            } else {
                if (this.w == n3) {
                    this.C = hc_1.a(this.x);
                }
                hc_1.b(this.x, (String)ListInvoker.get(kp_1.d(GW.f(this.t.ingameGUI)), n2));
                this.w = n2;
            }
        }
    }

    @Override
    public void l() {
        EventManagerInvoker.call(new RenderGuiEvent((GuiScreen)this, 1L));
        KeyboardInvoker.a(true);
        this.w = ListInvoker.size(kp_1.d(GW.f(this.t.ingameGUI)));
        this.x = new sc_0(0, this.q, 4, this.f - 12, this.n - 4, 12);
        hc_1.a(this.x, 100);
        hc_1.e(this.x, false);
        hc_1.c(this.x, true);
        hc_1.b(this.x, this.D);
        hc_1.a(this.x, false);
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public void c() throws IOException {
        super.c();
        int n = MouseInvoker.h();
        if (n > 1) {
            n = 1;
        }
        if (n < -1) {
            n = -1;
        }
        if (!GuiChat.j()) {
            n *= 7;
        }
        kp_1.b(GW.f(this.t.ingameGUI), n);
    }

    private void a(String string, String string2) {
        if (StringInvoker.c(string) >= 1) {
            BlockPos blockPos = null;
            if (this.t.objectMouseOver != null && this.t.objectMouseOver.typeOfHit == I.BLOCK) {
                blockPos = ObjectMouseOverInvoker.getBlockPos(this.t.objectMouseOver);
            }
            aDM.a(this.t.player.connection, new C14PacketTabComplete(string, blockPos));
            this.v = true;
        }
    }

    public GuiChat(String string) {
        this.C = vi_0.f;
        this.w = -1;
        this.z = my_0.c();
        this.D = vi_0.e;
        this.D = string;
    }

    @Override
    protected void a(int n, int n2, int n3) {
        EventManagerInvoker.call(new RenderGuiEvent((GuiScreen)this, n3));
    }

    @Override
    public void g() {
        hc_1.c(this.x);
    }

    @Override
    protected void a(String string, boolean bl) {
        hc_1.b(this.x, string);
    }

    @Override
    public void a(int n, int n2, float f) {
        this.a(2, this.f - 14, this.n - 2, this.f - 2, Integer.MIN_VALUE);
        FontRendererInvoker.a(this.t.fontRendererCrack, vi_0.c, -10.0f, 0.0f, 0);
        hc_1.d(this.x);
        IChatComponent iChatComponent = kp_1.a(GW.f(this.t.ingameGUI), MouseInvoker.a(), MouseInvoker.k());
        if (HX.f(aBO.f(iChatComponent)) != null) {
            this.a(iChatComponent, n, n2);
        }
        super.a(n, n2, f);
    }

    private static IOException b(IOException iOException) {
        return iOException;
    }

    @Override
    public void i() {
        EventManagerInvoker.call(new RenderGuiEvent((GuiScreen)this, 0L));
        KeyboardInvoker.a(false);
        kp_1.a(GW.f(this.t.ingameGUI));
    }

    public GuiChat() {
        this.C = vi_0.d;
        this.w = -1;
        this.z = my_0.c();
        this.D = vi_0.a;
    }

    public void a() {
        String string;
        Object object;
        if (this.A) {
            hc_1.b(this.x, hc_1.a(this.x, -1, hc_1.e(this.x), false) - hc_1.e(this.x));
            if (this.y >= ListInvoker.size(this.z)) {
                this.y = 0;
            }
        } else {
            int n = hc_1.a(this.x, -1, hc_1.e(this.x), false);
            ListInvoker.clear(this.z);
            this.y = 0;
            object = StringInvoker.i(StringInvoker.a(hc_1.a(this.x), n));
            string = StringInvoker.b(hc_1.a(this.x), 0, hc_1.e(this.x));
            this.a(string, (String)object);
            if (ListInvoker.isEmpty(this.z)) {
                return;
            }
            this.A = true;
            hc_1.b(this.x, n - hc_1.e(this.x));
        }
        if (ListInvoker.size(this.z) > 1) {
            StringBuilder stringBuilder = new StringBuilder();
            object = ListInvoker.iterator(this.z);
            while (dz_0.c((Iterator)object)) {
                string = (String)dz_0.b((Iterator)object);
                if (aL0.a(stringBuilder) > 0) {
                    aL0.a(stringBuilder, vi_0.b);
                }
                aL0.a(stringBuilder, string);
            }
            kp_1.a(GW.f(this.t.ingameGUI), new ChatComponentText(stringBuilder.toString()), 1);
        }
        hc_1.a(this.x, (String)ListInvoker.get(this.z, this.y++));
    }

    @Override
    protected void b(int n, int n2, int n3) throws IOException {
        IChatComponent iChatComponent = kp_1.a(GW.f(this.t.ingameGUI), MouseInvoker.a(), MouseInvoker.k());
        if (this.a(iChatComponent)) {
            return;
        }
        this.x.a(n, n2, n3);
        super.b(n, n2, n3);
    }

    @Override
    protected void a(char c, int n) throws IOException {
        this.v = false;
        if (n == 15) {
            this.a();
        } else {
            this.A = false;
        }
        if (n == 1) {
            MCInvoker.displayGuiScreen(this.t, null);
        } else if (n != 28 && n != 156) {
            if (n == 200) {
                this.a(-1);
            } else if (n == 208) {
                this.a(1);
            } else if (n == 201) {
                kp_1.b(GW.f(this.t.ingameGUI), kp_1.b(GW.f(this.t.ingameGUI)) - 1);
            } else if (n == 209) {
                kp_1.b(GW.f(this.t.ingameGUI), -kp_1.b(GW.f(this.t.ingameGUI)) + 1);
            } else {
                hc_1.a(this.x, c, n);
            }
        } else {
            String string = StringInvoker.h(hc_1.a(this.x));
            if (StringInvoker.c(string) > 0) {
                this.f(string);
            }
            MCInvoker.displayGuiScreen(this.t, null);
        }
    }

    public void a(String[] stringArray) {
        if (this.v) {
            this.A = false;
            ListInvoker.clear(this.z);
            for (String string : stringArray) {
                if (StringInvoker.c(string) <= 0) continue;
                ListInvoker.add(this.z, string);
            }
            String string = StringInvoker.a(hc_1.a(this.x), hc_1.a(this.x, -1, hc_1.e(this.x), false));
            String string2 = aw__0.a(stringArray);
            if (StringInvoker.c(string2) > 0 && !StringInvoker.d(string, string2)) {
                hc_1.b(this.x, hc_1.a(this.x, -1, hc_1.e(this.x), false) - hc_1.e(this.x));
                hc_1.a(this.x, string2);
            } else if (ListInvoker.size(this.z) > 0) {
                this.A = true;
                this.a();
            }
        }
    }
}


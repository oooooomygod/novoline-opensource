/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  org.apache.logging.log4j.Logger
 *  tv.twitch.chat.ChatUserInfo
 */
package net.minecraft.client.gui;

import cc.novoline.events.events.RenderGuiEvent;
import cc.novoline.invoke.EventManagerInvoker;
import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.IStreamInvoker;
import cc.novoline.invoke.KeyboardInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MouseInvoker;
import cc.novoline.invoke.StatListInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import com.google.common.base.Splitter;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.minecraft.client.Minecraft;
import net.GW;
import net.Gui;
import net.H6;
import net.HX;
import net.K6;
import net.NBTTagCompound;
import net.NW;
import net.QG;
import net.Qw;
import net.S6;
import net.VT;
import net.aBO;
import net.aK8;
import net.aL0;
import net.aa6_0;
import net.act_2;
import net.aj7;
import net.ame_0;
import net.amn_0;
import net.amx_2;
import net.anw_0;
import net.aoz_1;
import net.ara_2;
import net.asg_0;
import net.atB;
import net.auk_2;
import net.aw__0;
import net.awv_1;
import net.axe_2;
import net.az3_0;
import net.aze_0;
import net.dz_0;
import net.jv_2;
import net.k_0;
import net.kp_1;
import net.minecraft.item.ItemStack;
import net.minecraft.renderer.WorldRenderer;
import net.minecraft.stats.Achievement;
import net.my_0;
import net.ne_0;
import net.qt_2;
import net.tm_2;
import net.tn_0;
import net.ub_1;
import net.wn_0;
import net.xg_2;
import net.zq_2;
import org.apache.logging.log4j.Logger;
import tv.twitch.chat.ChatUserInfo;

public abstract class GuiScreen
extends Gui
implements GuiYesNoCallback {
    private long j;
    protected FontRenderer q;
    protected List<QG> l = my_0.c();
    public int f;
    public QG m;
    private int o;
    private static Logger p = LogManagerInvoker.c();
    private URI r;
    protected RenderItem i;
    protected Minecraft t;
    public boolean allowUserInput = true;
    protected List<Qw> g = my_0.c();
    public int n;
    private int u;
    private static Set<String> s = axe_2.a(new String[]{aK8.g, aK8.b});
    private static Splitter k = amx_2.a('\n');

    protected boolean a(IChatComponent iChatComponent) {
        awv_1 awv_12 = HX.b(aBO.f(iChatComponent));
        if (GuiScreen.j()) {
            if (HX.e(aBO.f(iChatComponent)) != null) {
                this.a(HX.e(aBO.f(iChatComponent)), false);
            }
        } else {
            if (wn_0.b(awv_12) == k_0.OPEN_URL) {
                if (!this.t.gameSettings.aq) {
                    return false;
                }
                try {
                    URI uRI = new URI(wn_0.a(awv_12));
                    ame_0.c(uRI);
                    throw new URISyntaxException(wn_0.a(awv_12), aK8.k);
                }
                catch (URISyntaxException uRISyntaxException) {
                    LoggerInvoker.a(p, aL0.a(aL0.a(new StringBuilder(), aK8.e), awv_12).toString(), uRISyntaxException);
                }
            } else if (wn_0.b(awv_12) == k_0.OPEN_FILE) {
                URI uRI = zq_2.l(new File(wn_0.a(awv_12)));
                this.a(uRI);
            } else if (wn_0.b(awv_12) == k_0.SUGGEST_COMMAND) {
                this.a(wn_0.a(awv_12), true);
            } else if (wn_0.b(awv_12) == k_0.RUN_COMMAND) {
                this.b(wn_0.a(awv_12), false);
            } else if (wn_0.b(awv_12) == k_0.TWITCH_USER_INFO) {
                ChatUserInfo chatUserInfo = IStreamInvoker.b(MCInvoker.a(this.t), wn_0.a(awv_12));
                MCInvoker.displayGuiScreen(this.t, new S6(MCInvoker.a(this.t), chatUserInfo));
            } else {
                LoggerInvoker.f(p, aL0.a(aL0.a(new StringBuilder(), aK8.f), awv_12).toString());
            }
            return true;
        }
        return false;
    }

    private void a(URI uRI) {
        try {
            Class clazz = ara_2.a(aK8.y);
            Object object = VT.a(ara_2.a(clazz, aK8.q, new Class[0]), null, new Object[0]);
            VT.a(ara_2.a(clazz, aK8.d, new Class[]{URI.class}), object, new Object[]{uRI});
        }
        catch (Throwable throwable) {
            LoggerInvoker.a(p, aK8.p, throwable);
        }
    }

    public void b(Minecraft minecraft, int n, int n2) {
        this.a(minecraft, n, n2);
    }

    public static void e(String string) {
        if (!aw__0.b((CharSequence)string)) {
            try {
                StringSelection stringSelection = new StringSelection(string);
                tm_2.a(aj7.b(aj7.a()), stringSelection, null);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public static boolean c(int n) {
        return n == 46 && GuiScreen.m() && !GuiScreen.j() && !GuiScreen.k();
    }

    protected void b(int n, int n2, int n3) throws IOException {
        EventManagerInvoker.call(new RenderGuiEvent(this, n, n2, n3));
        for (int i = 0; i < ListInvoker.size(this.l); ++i) {
            QG qG = (QG)ListInvoker.get(this.l, i);
            if (!atB.a(qG, this.t, n, n2)) continue;
            this.m = qG;
            atB.a(qG, MCInvoker.l(this.t));
            this.a(qG);
        }
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    public void a(Minecraft minecraft, int n, int n2) {
        this.t = minecraft;
        this.i = MCInvoker.A(minecraft);
        this.q = minecraft.fontRendererObj;
        this.n = n;
        this.f = n2;
        ListInvoker.clear(this.l);
        this.l();
    }

    public void b(String string, boolean bl) {
        kp_1.a(GW.f(this.t.ingameGUI), string);
        this.t.player.b(string);
    }

    protected void a(int n, int n2, int n3) {
        EventManagerInvoker.call(new RenderGuiEvent(this, n3));
        if (this.m != null) {
            atB.b(this.m, n, n2);
            this.m = null;
        }
    }

    public void d(int n) {
        if (this.t.world != null) {
            this.b(0, 0, this.n, this.f, -1072689136, -804253680);
        } else {
            this.e(n);
        }
    }

    public void g() {
    }

    public static boolean b(int n) {
        return n == 30 && GuiScreen.m() && !GuiScreen.j() && !GuiScreen.k();
    }

    protected void a(String string, boolean bl) {
    }

    public void h() {
        this.d(0);
    }

    public static boolean j() {
        return KeyboardInvoker.a(42) || KeyboardInvoker.a(54);
    }

    public void c() throws IOException {
        int n = MouseInvoker.l() * this.n / this.t.displayWidth;
        int n2 = this.f - MouseInvoker.d() * this.f / this.t.displayHeight - 1;
        int n3 = MouseInvoker.c();
        if (MouseInvoker.i()) {
            if (this.t.gameSettings.Y && this.u++ > 0) {
                return;
            }
            this.o = n3;
            this.j = MCInvoker.a();
            this.b(n, n2, this.o);
        } else if (n3 != -1) {
            if (this.t.gameSettings.Y && --this.u > 0) {
                return;
            }
            this.o = -1;
            this.a(n, n2, n3);
        } else if (this.o != -1 && this.j > 0L) {
            long l4 = MCInvoker.a() - this.j;
            this.a(n, n2, this.o, l4);
        }
    }

    protected void a(IChatComponent iChatComponent, int n, int n2) {
        if (HX.f(aBO.f(iChatComponent)) != null) {
            amn_0 amn_02 = HX.f(aBO.f(iChatComponent));
            if (aa6_0.a(amn_02) == H6.SHOW_ITEM) {
                ItemStack itemStack = null;
                try {
                    NBTTagCompound nBTTagCompound = jv_2.a(aBO.d(aa6_0.b(amn_02)));
                    itemStack = act_2.a(nBTTagCompound);
                }
                catch (az3_0 az3_02) {
                    // empty catch block
                }
                this.a(itemStack, n, n2);
            } else if (aa6_0.a(amn_02) == H6.SHOW_ENTITY) {
                if (this.t.gameSettings.bm) {
                    try {
                        NBTTagCompound nBTTagCompound = jv_2.a(aBO.d(aa6_0.b(amn_02)));
                        ArrayList arrayList = my_0.c();
                        NBTTagCompound nBTTagCompound2 = nBTTagCompound;
                        ListInvoker.add(arrayList, tn_0.m(nBTTagCompound2, aK8.n));
                        if (tn_0.a(nBTTagCompound2, aK8.u, 8)) {
                            String string = tn_0.m(nBTTagCompound2, aK8.r);
                            ListInvoker.add(arrayList, aL0.a(aL0.c(aL0.a(aL0.a(aL0.a(new StringBuilder(), aK8.s), string), aK8.v), ub_1.a(string)), aK8.w).toString());
                        }
                        ListInvoker.add(arrayList, tn_0.m(nBTTagCompound2, aK8.l));
                        this.a(arrayList, n, n2);
                    }
                    catch (az3_0 az3_03) {
                        this.a(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.RED), aK8.i).toString(), n, n2);
                    }
                }
            } else if (aa6_0.a(amn_02) == H6.SHOW_TEXT) {
                this.a(amx_2.a(k, aBO.a(aa6_0.b(amn_02))), n, n2);
            } else if (aa6_0.a(amn_02) == H6.SHOW_ACHIEVEMENT) {
                StatBase statBase = StatListInvoker.a(aBO.d(aa6_0.b(amn_02)));
                IChatComponent iChatComponent2 = NW.b(statBase);
                aoz_1 aoz_12 = new aoz_1(aL0.a(aL0.a(new StringBuilder(), aK8.a), NW.d(statBase) ? aK8.h : aK8.j).toString(), new Object[0]);
                HX.a(aBO.f(aoz_12), auk_2.b(true));
                String string = statBase instanceof Achievement ? K6.e((Achievement)statBase) : null;
                ArrayList arrayList = my_0.a(new String[]{aBO.a(iChatComponent2), aBO.a(aoz_12)});
                ListInvoker.addAll(arrayList, FontRendererInvoker.b(this.q, string, 150));
                this.a(arrayList, n, n2);
            }
            GlStateManagerInvoker.disableLighting();
        }
    }

    public void f() throws IOException {
        char c = KeyboardInvoker.getEventCharacter();
        int n = KeyboardInvoker.b();
        if (KeyboardInvoker.getEventKey() || aze_0.a(c)) {
            this.a(c, n);
        }
        MCInvoker.p(this.t);
    }

    public void e() {
    }

    public static boolean k() {
        return KeyboardInvoker.a(56) || KeyboardInvoker.a(184);
    }

    public void i() {
        EventManagerInvoker.call(new RenderGuiEvent(this, 0L));
    }

    public static boolean m() {
        return Minecraft.R ? KeyboardInvoker.a(219) || KeyboardInvoker.a(220) : KeyboardInvoker.a(29) || KeyboardInvoker.a(157);
    }

    public static boolean f(int n) {
        return n == 45 && GuiScreen.m() && !GuiScreen.j() && !GuiScreen.k();
    }

    public static String o() {
        block3: {
            Transferable transferable = tm_2.a(aj7.b(aj7.a()), null);
            if (!xg_2.b(transferable, DataFlavor.stringFlavor)) break block3;
            try {
                return (String)xg_2.a(transferable, DataFlavor.stringFlavor);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        return aK8.x;
    }

    public void a(int n, int n2, float f) {
        Gui gui;
        Iterator iterator;
        if (!(this instanceof GuiLogin)) {
            iterator = ListInvoker.iterator(this.l);
            while (dz_0.c(iterator)) {
                gui = (QG)dz_0.b(iterator);
                atB.b(gui, this.t, n, n2);
            }
        }
        iterator = ListInvoker.iterator(this.g);
        while (dz_0.c(iterator)) {
            gui = (Qw)dz_0.b(iterator);
            qt_2.a((Qw)gui, this.t, n, n2);
        }
        EventManagerInvoker.call(new RenderGuiEvent(this, n, n2));
    }

    protected void a(ItemStack itemStack, int n, int n2) {
        List list = act_2.a(itemStack, (EntityPlayer)this.t.player, this.t.gameSettings.bm);
        for (int i = 0; i < ListInvoker.size(list); ++i) {
            ListInvoker.set(list, i, aL0.a(aL0.a(new StringBuilder(), (Object)act_2.D((ItemStack)itemStack).rarityColor), (String)ListInvoker.get(list, i)).toString());
        }
        this.a(list, n, n2);
    }

    @Override
    public void a(boolean bl, int n) {
        if (n == 31102009) {
            this.a(this.r);
            this.r = null;
            MCInvoker.displayGuiScreen(this.t, this);
        }
    }

    public void l() {
        EventManagerInvoker.call(new RenderGuiEvent(this, 1L));
    }

    public boolean d() {
        return true;
    }

    public void f(String string) {
        this.b(string, true);
    }

    protected void a(char c, int n) throws IOException {
        if (n == 1) {
            MCInvoker.displayGuiScreen(this.t, null);
            if (this.t.currentScreen == null) {
                MCInvoker.r(this.t);
            }
        }
    }

    protected void a(String string, int n, int n2) {
        this.a(asg_0.b((Object)string), n, n2);
    }

    protected void a(List<String> list, int n, int n2) {
        if (!ListInvoker.isEmpty(list)) {
            int n3;
            GlStateManagerInvoker.y();
            ne_0.e();
            GlStateManagerInvoker.disableLighting();
            GlStateManagerInvoker.disableDepth();
            int n4 = 0;
            Iterator iterator = ListInvoker.iterator(list);
            while (dz_0.c(iterator)) {
                String string = (String)dz_0.b(iterator);
                n3 = FontRendererInvoker.a(this.q, string);
                if (n3 <= n4) continue;
                n4 = n3;
            }
            int n5 = n + 12;
            int n6 = n2 - 12;
            n3 = 8;
            if (ListInvoker.size(list) > 1) {
                n3 += 2 + (ListInvoker.size(list) - 1) * 10;
            }
            if (n5 + n4 > this.n) {
                n5 -= 28 + n4;
            }
            if (n6 + n3 + 6 > this.f) {
                n6 = this.f - n3 - 6;
            }
            zLevel = 300.0f;
            this.i.e = 300.0f;
            int n7 = -267386864;
            this.b(n5 - 3, n6 - 4, n5 + n4 + 3, n6 - 3, n7, n7);
            this.b(n5 - 3, n6 + n3 + 3, n5 + n4 + 3, n6 + n3 + 4, n7, n7);
            this.b(n5 - 3, n6 - 3, n5 + n4 + 3, n6 + n3 + 3, n7, n7);
            this.b(n5 - 4, n6 - 3, n5 - 3, n6 + n3 + 3, n7, n7);
            this.b(n5 + n4 + 3, n6 - 3, n5 + n4 + 4, n6 + n3 + 3, n7, n7);
            int n8 = 0x505000FF;
            int n9 = (n8 & 0xFEFEFE) >> 1 | n8 & 0xFF000000;
            this.b(n5 - 3, n6 - 3 + 1, n5 - 3 + 1, n6 + n3 + 3 - 1, n8, n9);
            this.b(n5 + n4 + 2, n6 - 3 + 1, n5 + n4 + 3, n6 + n3 + 3 - 1, n8, n9);
            this.b(n5 - 3, n6 - 3, n5 + n4 + 3, n6 - 3 + 1, n8, n8);
            this.b(n5 - 3, n6 + n3 + 2, n5 + n4 + 3, n6 + n3 + 3, n9, n9);
            for (int i = 0; i < ListInvoker.size(list); ++i) {
                String string = (String)ListInvoker.get(list, i);
                FontRendererInvoker.drawStringWithShadow(this.q, string, n5, n6, -1);
                n6 += 2;
                n6 += 10;
            }
            zLevel = 0.0f;
            this.i.e = 0.0f;
            GlStateManagerInvoker.D();
            GlStateManagerInvoker.enableDepth();
            ne_0.a();
            GlStateManagerInvoker.c();
        }
    }

    public static boolean a(int n) {
        return n == 47 && GuiScreen.m() && !GuiScreen.j() && !GuiScreen.k();
    }

    public void handleInput() throws IOException {
        if (MouseInvoker.f()) {
            while (MouseInvoker.j()) {
                this.c();
            }
        }
        if (KeyboardInvoker.g()) {
            while (KeyboardInvoker.d()) {
                this.f();
            }
        }
    }

    protected void a(QG qG) throws IOException {
    }

    protected void a(int n, int n2, int n3, long l4) {
    }

    public void e(int n) {
        GlStateManagerInvoker.disableLighting();
        GlStateManagerInvoker.disableFog();
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.t), a);
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.POSITION_TEX_COLOR);
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.0, this.f, 0.0), 0.0, (float)this.f / 32.0f + (float)n), 64, 64, 64, 255));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, this.n, this.f, 0.0), (float)this.n / 32.0f, (float)this.f / 32.0f + (float)n), 64, 64, 64, 255));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, this.n, 0.0, 0.0), (float)this.n / 32.0f, n), 64, 64, 64, 255));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.0, 0.0, 0.0), 0.0, n), 64, 64, 64, 255));
        TessellatorInvoker.draw(tessellator);
    }
}


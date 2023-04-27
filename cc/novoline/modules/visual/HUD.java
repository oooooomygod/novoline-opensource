/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.lwjgl.opengl.GL11
 */
package cc.novoline.modules.visual;

import cc.novoline.Novoline;
import cc.novoline.events.EventTarget;
import cc.novoline.events.events.KeyPressEvent;
import cc.novoline.events.events.ModuleUpdateEvent;
import cc.novoline.events.events.Render2DEvent;
import cc.novoline.events.events.RenderGuiEvent;
import cc.novoline.events.events.SettingEvent;
import cc.novoline.events.events.ShaderEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GameSettingsInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.KeyboardInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.invoke.SystemInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import cc.novoline.modules.AbstractModule;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontFormatException;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;

import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.*;
import net.minecraft.client.Minecraft;
import net.Ba;
import net.BooleanProperty;
import net.DoubleProperty;
import net.FloatProperty;
import net.FontFamily;
import net.HN;
import net.I18n;
import net.Items;
import net.ListProperty;
import net.MD;
import net.MathHelper;
import net.ModuleManager;
import net.P8;
import net.Potion;
import net.Qj;
import net.RK;
import net.GuiChat;
import net.ScaledResolution;
import net.StringProperty;
import net.VX;
import net._j_0;
import net.a1V;
import net.a1c;
import net.a2l_0;
import net.a3M;
import net.a4E;
import net.a5P;
import net.a7g_0;
import net.a7l_0;
import net.a9V;
import net.aB0;
import net.aCM;
import net.aFF;
import net.aKp;
import net.aL0;
import net.aL_;
import net.aMF;
import net.aN_;
import net.aO3;
import net.aQ0;
import net.aRM;
import net.aV3;
import net.aZ2;
import net.aZP;
import net.aci_0;
import net.act_2;
import net.adj_1;
import net.adp_0;
import net.adt_2;
import net.ae6_0;
import net.ae7_0;
import net.aen_2;
import net.aev_1;
import net.aff_2;
import net.afm_0;
import net.ag3_0;
import net.age_2;
import net.agg_2;
import net.aj7;
import net.akk_0;
import net.als_2;
import net.alw_0;
import net.anv_0;
import net.anw_0;
import net.aoc_1;
import net.aod_2;
import net.aol_1;
import net.ap1;
import net.ap2_0;
import net.ari_0;
import net.arj_0;
import net.asg_0;
import net.asp_2;
import net.asx_1;
import net.auc_2;
import net.auk_2;
import net.aus_0;
import net.auw_0;
import net.ava_0;
import net.avj_2;
import net.axx_1;
import net.azf_2;
import net.da_0;
import net.db_0;
import net.dz_0;
import net.ec_1;
import net.eu_0;
import net.hb_2;
import net.is_1;
import net.kb_0;
import net.lx_2;
import net.minecraft.item.ItemStack;
import net.my_0;
import net.ng_0;
import net.oc_1;
import net.pI;
import net.pt_0;
import net.q_0;
import net.qh_1;
import net.rj_0;
import net.sj_1;
import net.ua_2;
import net.uc_0;
import net.us_2;
import net.uw_0;
import net.wb_0;
import net.wh_1;
import net.wq_0;
import net.z4_0;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.lwjgl.opengl.GL11;
import net.skidunion.Protection;


public class HUD
extends AbstractModule {
    @Property(value="module-list-glow-type")
    private StringProperty b0;
    private avj_2 ce;
    @Property(value="keybinds-pos-y")
    private IntProperty ae;
    @Property(value="module-list-suffixes")
    private StringProperty bg;
    private static long eb = a1c.a(573706411588172516L, -7265708375581625915L, MethodHandles.lookup().lookupClass()).a(110101152433451L);
    @Property(value="keybinds-alpha")
    private IntProperty bB;
    private double a0;
    @Property(value="armor-background")
    private BooleanProperty b1;
    @Property(value="color")
    private eu_0 aP;
    private List<aff_2> cF;
    @Property(value="font-size")
    private IntProperty bF;
    @Property(value="show-module-list-settings")
    private BooleanProperty ay;
    @Property(value="module-list-padding")
    private DoubleProperty cR;
    @Property(value="font")
    private StringProperty cz;
    @Property(value="chat-roundness")
    private DoubleProperty bo;
    @Property(value="show-keybinds-settings")
    private BooleanProperty as;
    @Property(value="show-tps-ram-settings")
    private BooleanProperty ck;
    @Property(value="hud-hotbar")
    private BooleanProperty Y;
    private FontFamily bz;
    private static Map kb = new HashMap(13);
    @Property(value="notification-style")
    private StringProperty b7;
    private double c1;
    @Property(value="watermark-addons")
    private ListProperty<String> cy;
    private boolean cH;
    private FontFamily ar;
    private double c2;
    private int ca;
    @Property(value="chat-smoothness")
    private IntProperty W;
    private FontFamily bn;
    @Property(value="potions-blur")
    private BooleanProperty aq;
    private List<AbstractModule> bw;
    @Property(value="tps-x-position")
    private IntProperty am;
    @Property(value="show-inventory-settings")
    private BooleanProperty bP;
    private TimerUtil b9;
    private int aj;
    private Runnable cm;
    @Property(value="show-name-settings")
    private BooleanProperty cE;
    @Property(value="module-list-glow-alpha")
    private IntProperty bE;
    private int aC;
    @Property(value="color-effect")
    private StringProperty X;
    private int U;
    @Property(value="hotbar-smoothness")
    private IntProperty bl;
    @Property(value="watermark-alpha")
    private IntProperty aI;
    @Property(value="module-list-y-position")
    private IntProperty aR;
    @Property(value="module-list-background-alpha")
    private IntProperty al;
    @Property(value="hud-keyStrokes")
    private BooleanProperty bN;
    private boolean aG;
    private FontFamily a6;
    @Property(value="keystrokes-blur")
    private BooleanProperty ch;
    private double ap;
    @Property(value="chat-height")
    private IntProperty ak;
    private double bH;
    private double M;
    @Property(value="potion-background")
    private BooleanProperty aD;
    @Property(value="armor-background-alpha")
    private IntProperty cX;
    @Property(value="armor-x-position")
    private IntProperty a_;
    @Property(value="watermark-style")
    private StringProperty bW;
    private FontFamily c3;
    @Property(value="notification-alpha")
    private IntProperty aM;
    private double cg;
    private int bG;
    @Property(value="module-list-name-height")
    private DoubleProperty aW;
    private FontFamily br;
    @Property(value="information-elements")
    private ListProperty<String> aQ;
    private int aS;
    private boolean aF;
    @Property(value="hud-module-list")
    private BooleanProperty bf;
    @Property(value="show-information-settings")
    private BooleanProperty ax;
    private FontFamily cd;
    @Property(value="ram-y-position")
    private IntProperty ah;
    @Property(value="font-outline")
    private BooleanProperty cP;
    @Property(value="name-font-size")
    private IntProperty ad;
    @Property(value="module-list-glow-mode")
    private StringProperty az;
    @Property(value="fade-begin-color")
    private eu_0 cN;
    @Property(value="outline-width")
    private FloatProperty b6;
    @Property(value="chat-size")
    public IntProperty cr;
    @Property(value="name-scale")
    private DoubleProperty cM;
    @Property(value="hotbar-blur")
    private BooleanProperty cl;
    @Property(value="information-padding")
    private DoubleProperty c5;
    private boolean b_;
    @Property(value="watermark-roundess")
    private IntProperty aT;
    @Property(value="fade-end-color")
    private eu_0 cW;
    private int aX;
    @Property(value="show-keystrokes-settings")
    private BooleanProperty a4;
    @Property(value="tpr-ram-smoothness")
    private IntProperty cU;
    @Property(value="module-list-x-position")
    private IntProperty cG;
    private int cu;
    @Property(value="name-glow-radius")
    private IntProperty b8;
    private boolean aJ;
    @Property(value="module-list-background-color")
    private StringProperty K;
    @Property(value="show-armor-settings")
    private BooleanProperty bU;
    private double by;
    private FontFamily bA;
    @Property(value="module-list-aligment")
    private StringProperty b4;
    private int bi;
    private FontFamily cj;
    @Property(value="module-list-shaders")
    private ListProperty I;
    private int aU;
    @Property(value="key-strokes-smoothness")
    private IntProperty cv;
    private Dimension bQ;
    @Property(value="modulelist-hide-on-debug")
    private BooleanProperty R;
    @Property(value="show-potion-settings")
    private BooleanProperty bj;
    @Property(value="time-format")
    private StringProperty bK;
    @Property(value="name-position-x")
    private IntProperty cJ;
    @Property(value="potions-y-position")
    private IntProperty c7;
    @Property(value="hotbar-style")
    private StringProperty co;
    @Property(value="potion-style")
    private StringProperty cA;
    private static boolean c0;
    @Property(value="module-list-bar-aligment")
    private StringProperty af;
    private double T;
    @Property(value="notification-accent-color")
    private StringProperty c4;
    @Property(value="keybinds-pos-x")
    private IntProperty c6;
    @Property(value="potion-alpha")
    private IntProperty ac;
    @Property(value="key-strokes-radius")
    private DoubleProperty bR;
    @Property(value="armor-blur")
    private BooleanProperty cs;
    @Property(value="name-glow-alpha")
    private IntProperty bb;
    private int aE;
    @Property(value="hotbar-alpha")
    private IntProperty aZ;
    @Property(value="potion-icon")
    private BooleanProperty bC;
    @Property(value="watermark-background-type")
    private StringProperty bt;
    private int av;
    @Property(value="armor-background-roundness")
    private DoubleProperty aH;
    @Property(value="hud-name")
    private BooleanProperty bc;
    @Property(value="potions-x-position")
    private IntProperty cZ;
    @Property(value="keystrokes-hide-on-debug")
    private BooleanProperty bu;
    private double bm;
    @Property(value="keybinds-smoothness")
    private IntProperty bI;
    @Property(value="show-time")
    private BooleanProperty aB;
    @Property(value="armor-align")
    private StringProperty bX;
    private FontFamily H;
    private double bq;
    @Property(value="notification-show-delay")
    private BooleanProperty L;
    @Property(value="font-type")
    private StringProperty b5;
    @Property(value="chat-alpha")
    private IntProperty ct;
    @Property(value="armor-y-position")
    private IntProperty be;
    @Property(value="module-list-sorting")
    private StringProperty bh;
    private boolean bD;
    @Property(value="watermark-smoothness")
    private IntProperty aL;
    @Property(value="tps-ram-alpha")
    private IntProperty cB;
    @Property(value="potion-roundness")
    private DoubleProperty bV;
    private static String[] ib;
    private double Z;
    private double a7;
    @Property(value="show-notification-settings")
    private BooleanProperty a5;
    @Property(value="notification-shader")
    private ListProperty<String> b2;
    private double aw;
    @Property(value="armor-background-smoothness")
    private IntProperty cY;
    @Property(value="keybinds-bar-color")
    private StringProperty ab;
    @Property(value="show-hotbar-settings")
    private BooleanProperty cK;
    @Property(value="notification-font")
    private StringProperty cS;
    @Property(value="shadow-offset")
    private static FloatProperty aA;
    private FontFamily cp;
    @Property(value="name-client-name")
    private StringProperty a1;
    private int at;
    @Property(value="show-version")
    private BooleanProperty cc;
    @Property(value="notification-bg-color")
    private StringProperty bY;
    private Runnable cL;
    @Property(value="keybinds-hide-on-debug")
    private BooleanProperty ba;
    @Property(value="tps-y-position")
    private IntProperty bd;
    @Property(value="module-list-width-offset")
    private DoubleProperty cQ;
    private int aV;
    private FontFamily cT;
    @Property(value="inventory-animation")
    private StringProperty cw;
    @Property(value="tps-ram-blur")
    private BooleanProperty au;
    @Property(value="name-hide-on-debug")
    private BooleanProperty cf;
    private avj_2 ag;
    private int P;
    @Property(value="watermark-shaders")
    private ListProperty<String> cD;
    @Property(value="module-list-glow-radius")
    private IntProperty cb;
    private String cq;
    private double V;
    @Property(value="key-strokes-alpha")
    private IntProperty cC;
    @Property(value="watermark-pos-x")
    private DoubleProperty S;
    @Property(value="key-strokes-pos-y")
    private IntProperty Q;
    private FontFamily bS;
    @Property(value="module-list-background")
    private StringProperty bs;
    private double a2;
    @Property(value="watermark-name-effect")
    private StringProperty aY;
    @Property(value="name-position-y")
    private IntProperty bx;
    @Property(value="name-glow")
    private BooleanProperty bL;
    private List<ItemStack> a9;
    private int bv;
    @Property(value="potion-length-sorting")
    private BooleanProperty ao;
    @Property(value="chat-font")
    private StringProperty cn;
    @Property(value="watermark-pos-y")
    private DoubleProperty a3;
    private int a8;
    @Property(value="hud-keybinds")
    private BooleanProperty an;
    private boolean aa;
    @Property(value="potion-smoothness")
    private IntProperty bM;
    private int bk;
    private List<a2l_0> bO;
    private static String[] jb;
    private double cI;
    @Property(value="ram-x-position")
    private IntProperty cO;
    @Property(value="keybinds-blur")
    private BooleanProperty ci;
    @Property(value="client-font")
    private StringProperty bT;
    private List<a5P> J;
    @Property(value="watermark-name-color")
    private StringProperty bZ;
    @Property(value="module-list-name-case")
    private StringProperty bJ;
    @Property(value="key-strokes-pos-x")
    private IntProperty N;
    private FontFamily aN;
    private boolean ai;
    private FontFamily cx;
    @Property(value="watermark-outline-width")
    private FloatProperty aK;
    @Property(value="show-chat-settings")
    private BooleanProperty bp;
    private FontFamily b3;
    private FontFamily aO;
    @Property(value="name-type")
    private StringProperty O;
    @Property(value="hud-information")
    private BooleanProperty cV;

    private void l(Render2DEvent render2DEvent) {
        String string;
        String string2;
        HUD.t();
        int n = P8.b((Integer)adt_2.a(this.ad));
        if (StringPropertyInvoker.isMode(this.O, ap1.aJ)) {
            double d;
            double d2;
            string2 = StringPropertyInvoker.isMode(this.bW, ap1.c5) ? (String)StringPropertyInvoker.b(this.a1) : StringInvoker.a((String)StringPropertyInvoker.b(this.a1));
            string = ap1.bE;
            if (ava_0.b(this.cy, ap1.cx)) {
                string = aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), string), (Object)anw_0.DARK_GRAY), ap1.W), (Object)anw_0.RESET), NovolineInvoker.getVersion(this.novoline)).toString();
            }
            if (ava_0.b(this.cy, ap1.dN)) {
                string = aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), string), (Object)anw_0.DARK_GRAY), ap1.dR), (Object)anw_0.RESET), Protection.I).toString();
            }
            if (ava_0.b(this.cy, ap1.aC)) {
                string = aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), string), (Object)anw_0.DARK_GRAY), ap1.aR), (Object)anw_0.RESET), Qj.a(NovolineInvoker.a(this.novoline))), ap1.aj).toString();
            }
            if (ava_0.b(this.cy, ap1.dL)) {
                string = aL0.a(aL0.c(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), string), (Object)anw_0.DARK_GRAY), ap1.d6), (Object)anw_0.RESET), MCInvoker.O(this.mc)), ap1.b1).toString();
            }
            if (ava_0.b(this.cy, ap1.ah)) {
                string = aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), string), (Object)anw_0.DARK_GRAY), ap1.bS), (Object)anw_0.RESET), aCM.d() ? ap1.aE : (MCInvoker.k(this.mc) ? ap1.b3 : StringInvoker.i(MCInvoker.W((Minecraft)this.mc).k))).toString();
            }
            if (ava_0.b(this.cy, ap1.d3)) {
                string = aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), string), (Object)anw_0.DARK_GRAY), ap1.a7), (Object)anw_0.RESET), this.U()).toString();
            }
            double d3 = db_0.b((Double)MD.b(this.S));
            double d4 = db_0.b((Double)MD.b(this.a3));
            if (StringPropertyInvoker.isMode(this.bW, ap1.dT)) {
                double d5 = 4.0 + (!StringPropertyInvoker.isMode(this.bt, ap1.dv) ? 0.08333333333333333 * (double)P8.b((Integer)adt_2.a(this.aT)) : 0.0);
                this.a7 = (double)this.a(n, aL0.a(aL0.a(new StringBuilder(), string2), string).toString()) + d5 * 2.0;
                this.c2 = (double)this.c(n) + d5 * 2.0;
                double d6 = this.c2 * 0.5 * (0.08333333333333333 * (double)P8.b((Integer)adt_2.a(this.aT)));
                int n2 = hb_2.a(0, 0, 0, P8.b((Integer)adt_2.a(this.aI)));
                if (StringPropertyInvoker.isMode(this.bt, ap1.br)) {
                    a1V.a(d3, d4, this.a7, this.c2, n2, 6, ava_0.b(this.cD, ap1.o) ? agg_2.c() : null, P8.b((Integer)adt_2.a(this.b8)), P8.b((Integer)adt_2.a(this.bb)));
                }
                if (StringPropertyInvoker.isMode(this.bt, ap1.bF)) {
                    a1V.a(d3, d4, this.a7, this.c2, d6, n2);
                }
                if (StringPropertyInvoker.isMode(this.bt, ap1.cs)) {
                    a1V.a(d3, d4, this.a7, this.c2, d6, axx_1.a((Float)a9V.a(this.aK)), n2, 6, ava_0.b(this.cD, ap1.dB) ? agg_2.c() : null, P8.b((Integer)adt_2.a(this.b8)), P8.b((Integer)adt_2.a(this.bb)));
                }
                d2 = d3;
                d = d4;
                this.cL = () -> this.lambda$drawName$134(d2, d, d6);
                this.a(n, aL0.a(aL0.a(new StringBuilder(), string2), string).toString(), d3 += d5, d4 += d5 + 0.5, 0xFFFFFF);
            }
            if (StringPropertyInvoker.isMode(this.bW, ap1.eD)) {
                String string3 = ap1.by;
                String string4 = ap1.cC;
                cc.novoline.utils.fonts.api.FontRenderer fontRenderer = this.a(string3, n);
                cc.novoline.utils.fonts.api.FontRenderer fontRenderer2 = this.a(string4, n - 4);
                Color color = new Color(0, 0, 0, P8.b((Integer)adt_2.a(this.aI)));
                d2 = 3.0 + 0.08333333333333333 * (double)P8.b((Integer)adt_2.a(this.aT));
                this.a7 = (double)(this.a(string3, n, string2) + this.a(string4, n - 4, string)) + d2 * 2.0;
                this.c2 = (double)this.c(n) + d2 * 2.0;
                d = this.c2 * (0.08333333333333333 * (double)P8.b((Integer)adt_2.a(this.aT)));
                aV3.a(aV3.a(), d3, d4, this.a7, this.c2, d, (double)P8.b((Integer)adt_2.a(this.aL)), color, true);
                int n3 = hb_2.a(225, 225, 225);
                int n4 = hb_2.a(210, 210, 210);
                this.a(fontRenderer2, string, (d3 += d2) + (double)this.a(string3, n, string2), (d4 += d2 + 0.5) + (double)(this.c(n) / 2) - (double)(this.c(n - 4) / 2), n3, true);
                double d7 = d3;
                double d8 = d4;
                this.cm = () -> this.lambda$drawName$135(fontRenderer, string2, d7, d8);
                if (StringPropertyInvoker.isMode(this.aY, ap1.dr)) {
                    int n5 = (int)(1.5686274509803921 * (double)P8.b((Integer)adt_2.a(this.bb)));
                    agg_2.a(agg_2.c(), P8.b((Integer)adt_2.a(this.b8)), n5, true, this.cm, null);
                }
                if (StringPropertyInvoker.isMode(this.aY, ap1.dF)) {
                    arj_0.a(this.ag, () -> this.lambda$drawName$136(fontRenderer, string2, d7, d8, n4));
                }
                if (StringPropertyInvoker.isMode(this.bZ, ap1.cw)) {
                    this.a(fontRenderer, string2, d3, d4, n4, StringPropertyInvoker.isMode(this.aY, ap1.cO));
                }
                sj_1.a(this.cm);
            }
        }
        if (StringPropertyInvoker.isMode(this.O, ap1.d5)) {
            string2 = (String)StringPropertyInvoker.b(this.a1);
            string = auk_2.a((Boolean)Ba.b(this.aB)) ? aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GRAY), ap1.cr), (Object)anw_0.RESET), this.U()), (Object)anw_0.GRAY), ap1.cq).toString() : ap1.cG;
            String string5 = auk_2.a((Boolean)Ba.b(this.cc)) ? NovolineInvoker.getVersion(this.novoline) : ap1.N;
            double d = 3.0;
            double d9 = 4.0;
            if (StringPropertyInvoker.isMode(this.cz, ap1.d9)) {
                double d10 = db_0.b((Double)MD.b(this.cM));
                GL11.glPushMatrix();
                GL11.glTranslated((double)d, (double)d9, (double)0.0);
                GL11.glScaled((double)d10, (double)d10, (double)d10);
                GL11.glTranslated((double)(-d), (double)(-d9), (double)0.0);
            }
            this.a(n, StringInvoker.b(string2, 0, 1), d, d9, hb_2.a(0L));
            this.a(n, StringInvoker.a(string2, 1), d + this.a(n, StringInvoker.f(string2)[0]), d9, 0xFFFFFF);
            this.a(n, string5, d + 3.0 + (double)this.a(n, string2), d9, 0xDDDDDD);
            this.a(n, string, d + (double)(StringInvoker.g(string5) ? 3 : 5) + (double)this.a(n, aL0.a(aL0.a(new StringBuilder(), string2), string5).toString()), d9, 0xDDDDDD);
            if (StringPropertyInvoker.isMode(this.cz, ap1.bs)) {
                GL11.glPopMatrix();
            }
        }
        if (StringPropertyInvoker.isMode(this.O, ap1.dY)) {
            string2 = NovolineInvoker.getVersion(this.novoline);
            string = this.U();
            String string6 = (String)StringPropertyInvoker.b(this.a1);
            this.a(string6, string2, string, n);
            if (auk_2.a((Boolean)Ba.b(this.bL))) {
                agg_2.a(agg_2.c(), P8.b((Integer)adt_2.a(this.b8)), P8.b((Integer)adt_2.a(this.bb)), true, () -> this.lambda$drawName$137(string6, string2, string, n), null);
            }
        }
    }

    private Boolean lambda$new$72() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.cV)) && auk_2.a((Boolean)Ba.b(this.ck)) && auk_2.a((Boolean)Ba.b(this.ax)) && (ava_0.b(this.aQ, ap1.aZ) || ava_0.b(this.aQ, ap1.aS)));
    }

    private boolean g() {
        HUD.j();
        return auk_2.a((Boolean)Ba.b(this.bN)) && this.d(auk_2.a((Boolean)Ba.b(this.bu)));
    }

    private Boolean lambda$new$82() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bN)) && auk_2.a((Boolean)Ba.b(this.a4)));
    }

    private Boolean lambda$new$48() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bf)) && auk_2.a((Boolean)Ba.b(this.ay)) && ava_0.b(this.I, ap1.am));
    }

    private Boolean lambda$new$57() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.cV)) && auk_2.a((Boolean)Ba.b(this.bj)) && auk_2.a((Boolean)Ba.b(this.ax)) && ava_0.b(this.aQ, ap1.bw) && StringPropertyInvoker.isMode(this.cA, ap1.bv) && auk_2.a((Boolean)Ba.b(this.aD)));
    }

    private Boolean lambda$new$13() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bc)) && auk_2.a((Boolean)Ba.b(this.cE)) && StringPropertyInvoker.isMode(this.cz, ap1.dA));
    }

    private static void lambda$null$115(double d, int n, double d2, double d3, double d4, int n2, int n3) {
        a1V.b(d + (double)n + 0.5 + d2, d3 - d4 + 1.0, d + (double)n + 3.5 + d2, d3 + (double)n2 + d4 - 1.0, n3);
    }

    private String a(a2l_0 a2l_02) {
        return ari_0.a(a2l_02);
    }

    public StringProperty A() {
        return this.cS;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/aCp" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private Boolean lambda$new$77() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.an)) && auk_2.a((Boolean)Ba.b(this.as)));
    }

    public void a(cc.novoline.utils.fonts.api.FontRenderer fontRenderer, String string, double d, double d2, boolean bl) {
        HUD.t();
        int n = 0;
        char[] cArray = StringInvoker.f(string);
        int n2 = cArray.length;
        int n3 = 0;
        if (n3 < n2) {
            char c = cArray[n3];
            this.a(fontRenderer, StringInvoker.a(c), d, d2, hb_2.a((long)n), bl);
            d += StringPropertyInvoker.isMode(this.cz, ap1.I) ? (double)FontRendererInvoker.a(this.mc.fontRendererObj, c) : a7l_0.a(fontRenderer, c);
            n -= 120;
            ++n3;
        }
    }

    @EventTarget
    public void a(ModuleUpdateEvent moduleUpdateEvent) {
        this.b();
    }

    private static void lambda$onSetting$103(aff_2 aff_22) {
        ListInvoker.clear(aff_2.b(aff_22));
    }

    private static void lambda$drawModuleList$125(List list) {
        ListInvoker.forEach(list, HUD::lambda$null$124);
    }

    static Minecraft e(HUD hUD) {
        return hUD.mc;
    }

    private static void lambda$drawModuleList$127(AbstractModule abstractModule) {
        abstractModule.a(() -> HUD.lambda$null$126(abstractModule));
    }

    public void b(int n, String string, String string2, double d, double d2, int n2, boolean bl) {
        HUD.j();
        if (StringPropertyInvoker.isMode(this.cz, ap1.bA)) {
            FontRendererInvoker.a(this.mc.fontRendererObj, string2, (float)d, (float)d2, n2, bl);
        }
        if (auk_2.a((Boolean)Ba.b(this.cP))) {
            a7l_0.a(this.a(string, n), (CharSequence)string2, d, d2, n2, axx_1.a((Float)a9V.a(this.b6)));
        }
        a7l_0.b(this.a(string, n), string2, d, d2, n2, bl);
    }

    private Boolean lambda$new$68() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.cV)) && auk_2.a((Boolean)Ba.b(this.bU)) && auk_2.a((Boolean)Ba.b(this.ax)) && ava_0.b(this.aQ, ap1.bP) && auk_2.a((Boolean)Ba.b(this.b1)));
    }

    private Boolean lambda$new$84() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bN)) && auk_2.a((Boolean)Ba.b(this.a4)));
    }

    private static void lambda$drawModuleList$122(AbstractModule abstractModule) {
        abstractModule.a(() -> HUD.lambda$null$121(abstractModule));
    }

    private Boolean lambda$new$52() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.cV)) && !ava_0.c(this.aQ) && auk_2.a((Boolean)Ba.b(this.ax)));
    }

    private Boolean lambda$new$51() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.cV)) && auk_2.a((Boolean)Ba.b(this.ax)));
    }

    public void a(cc.novoline.utils.fonts.api.FontRenderer fontRenderer, String string, double d, double d2, boolean bl, boolean bl2, int n) {
        HUD.t();
        int n2 = 0;
        char[] cArray = StringInvoker.f(string);
        int n3 = cArray.length;
        int n4 = 0;
        if (n4 < n3) {
            char c = cArray[n4];
            this.a(fontRenderer, StringInvoker.a(c), d, d2, hb_2.a((long)n2), bl);
            d += StringPropertyInvoker.isMode(this.cz, ap1.cJ) ? (double)FontRendererInvoker.a(this.mc.fontRendererObj, c) : a7l_0.a(fontRenderer, c);
            n2 -= n;
            ++n4;
        }
    }

    private int lambda$longestModuleInfo$139(AbstractModule abstractModule) {
        return this.a(18, this.c(abstractModule));
    }

    private static void lambda$null$124(AbstractModule abstractModule) {
        abstractModule.a(() -> HUD.lambda$null$123(abstractModule));
    }

    private void a(Render2DEvent render2DEvent) {
        ScaledResolution scaledResolution = uc_0.a(render2DEvent);
        HUD.t();
        ClickGui cfr_ignored_0 = (ClickGui)ModuleInvoker.isEnable(ModuleRegistry.CLICKGUI);
        ScaledResolutionInvoker.a(scaledResolution);
        int n = ScaledResolutionInvoker.g(scaledResolution);
        ArrayList arrayList = new ArrayList();
        if (ava_0.b(this.aQ, ap1.aw)) {
            Entity entity = MCInvoker.v(this.mc);
            ListInvoker.add(arrayList, StringInvoker.a(ap1.bJ, new Object[]{db_0.a(entity.posX), db_0.a(entity.posY), db_0.a(entity.posZ)}));
        }
        if (ava_0.b(this.aQ, ap1.dO)) {
            ListInvoker.add(arrayList, aL0.a(aL0.a(new StringBuilder(), ap1.J), Qj.a(NovolineInvoker.a(this.novoline))).toString());
        }
        if (ava_0.b(this.aQ, ap1.cV)) {
            double d = this.T == 0.0 ? PlayerInvoker.n(this.mc.player) : this.T;
            String string = StringInvoker.a(ap1.c1, new Object[]{db_0.a(d * 20.0 * (double)this.mc.timer.timerSpeed)});
            ListInvoker.add(arrayList, StringInvoker.a(string, (CharSequence)ap1.u, (CharSequence)ap1.x));
        }
        if (ava_0.b(this.aQ, ap1.a6)) {
            ListInvoker.add(arrayList, aL0.c(aL0.a(new StringBuilder(), ap1.be), MCInvoker.O(this.mc)).toString());
        }
        double d = db_0.b((Double)MD.b(this.c5)) - 1.0;
        double d2 = n;
        double d3 = StringPropertyInvoker.isMode(this.cz, ap1.dk) ? 2.0 : 1.0;
        Iterator iterator = ListInvoker.iterator(arrayList);
        if (dz_0.c(iterator)) {
            String string = (String)dz_0.b(iterator);
            String[] stringArray = StringInvoker.g(string, ap1.ax);
            String string2 = stringArray[0];
            String string3 = stringArray[1];
            this.b(aL0.a(aL0.a(new StringBuilder(), string2), ap1.bN).toString(), d3, (d2 -= (double)this.y() + d) + d / 2.0);
            this.a(string3, d3 + 3.0 + (double)this.g(string2), d2 + d / 2.0, hb_2.a(asx_1.WHITE));
        }
    }

    private String d(a2l_0 a2l_02) {
        return aod_2.b(a3M.g(a2l_02) + 1);
    }

    private Boolean lambda$new$37() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bf)) && auk_2.a((Boolean)Ba.b(this.ay)));
    }

    public void b() {
        this.bw = this.H();
    }

    public StringProperty q() {
        return this.cz;
    }

    public StringProperty J() {
        return this.bJ;
    }

    private Boolean lambda$new$6() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.cP)) && !StringPropertyInvoker.isMode(this.cz, ap1.cR));
    }

    private Boolean lambda$new$71() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.cV)) && auk_2.a((Boolean)Ba.b(this.ck)) && auk_2.a((Boolean)Ba.b(this.ax)) && (ava_0.b(this.aQ, ap1.ed) || ava_0.b(this.aQ, ap1.l)));
    }

    private Boolean lambda$new$43() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bf)) && auk_2.a((Boolean)Ba.b(this.ay)) && !StringPropertyInvoker.isMode(this.bs, ap1.v));
    }

    static DoubleProperty f(HUD hUD) {
        return hUD.bR;
    }

    private Boolean lambda$new$15() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bc)) && auk_2.a((Boolean)Ba.b(this.cE)) && StringPropertyInvoker.isMode(this.O, ap1.dc));
    }

    private static void lambda$drawModuleList$130(List list) {
        ListInvoker.forEach(list, HUD::lambda$null$129);
    }

    public int c(int n) {
        HUD.j();
        return StringPropertyInvoker.isMode(this.cz, ap1.cd) ? FontRendererInvoker.d(this.mc.fontRendererObj) : a7l_0.a(this.a(n));
    }

    private List<ItemStack> N() {
        HUD.j();
        ItemStack[] itemStackArray = this.mc.player.inventory.d;
        return this.mc.currentScreen instanceof GuiChat ? this.a9 : my_0.a(new ItemStack[]{PlayerInvoker.h(this.mc.player), itemStackArray[0], itemStackArray[1], itemStackArray[2], itemStackArray[3]});
    }

    @EventTarget
    public void a(RenderGuiEvent renderGuiEvent) {
        block40: {
            Iterator iterator;
            int n;
            int n2;
            int n3;
            block45: {
                int n4;
                int n5;
                int n6;
                int n7;
                int n8;
                block46: {
                    block43: {
                        int n9;
                        block44: {
                            block41: {
                                int n10;
                                block42: {
                                    long l4 = eb ^ 0xAC925506CE5L;
                                    long l5 = l4 ^ 0x5C9BC26811BCL;
                                    n8 = (int)(l5 >>> 48);
                                    n7 = (int)(l5 << 16 >>> 48);
                                    n6 = (int)(l5 << 32 >>> 32);
                                    HUD.j();
                                    if (!(HN.d(renderGuiEvent) instanceof GuiChat)) break block40;
                                    n3 = ua_2.a(HN.b(renderGuiEvent));
                                    n2 = ua_2.b(HN.a(renderGuiEvent));
                                    if (auk_2.a((Boolean)Ba.b(this.cV)) && ava_0.b(this.aQ, ap1.cX)) {
                                        boolean bl;
                                        int n11;
                                        if (HN.c(renderGuiEvent) == alw_0.CLICK) {
                                            n11 = P8.b((Integer)adt_2.a(this.am));
                                            n5 = P8.b((Integer)adt_2.a(this.bd));
                                            boolean bl2 = bl = n3 > n11 && n3 <= n11 + 42 && n2 > n5 && n2 <= n5 + 47;
                                        }
                                        if (HN.c(renderGuiEvent) == alw_0.RENDER) {
                                            if (this.aJ) {
                                                adt_2.b(this.am, P8.d(MathHelper.a(this.aS + n3, P8.b((Integer)adt_2.b(this.am)), P8.b((Integer)adt_2.c(this.am)))));
                                                adt_2.b(this.bd, P8.d(MathHelper.a(this.aj + n2, P8.b((Integer)adt_2.b(this.bd)), P8.b((Integer)adt_2.c(this.bd)))));
                                            }
                                            n11 = P8.b((Integer)adt_2.a(this.am));
                                            n5 = P8.b((Integer)adt_2.a(this.bd));
                                            boolean bl3 = bl = n3 > n11 && n3 <= n11 + 42 && n2 > n5 && n2 <= n5 + 47;
                                        }
                                    }
                                    if (this.R() && StringPropertyInvoker.isMode(this.O, ap1.w)) {
                                        double d = db_0.b((Double)MD.b(this.S));
                                        double d2 = db_0.b((Double)MD.b(this.a3));
                                        int n12 = n = (double)n3 > d && (double)n3 < d + this.a7 && (double)n2 > d2 && (double)n2 < d2 + this.c2 ? 1 : 0;
                                        if (HN.c(renderGuiEvent) == alw_0.CLICK) {
                                            if (HN.e(renderGuiEvent) == 0) {
                                                // empty if block
                                            }
                                        } else if (HN.c(renderGuiEvent) == alw_0.RENDER && this.cH) {
                                            MD.b(this.S, db_0.a(MathHelper.b(this.V + (double)n3, db_0.b((Double)MD.a(this.S)), db_0.b((Double)MD.c(this.S)))));
                                            MD.b(this.a3, db_0.a(MathHelper.b(this.bm + (double)n2, db_0.b((Double)MD.a(this.a3)), db_0.b((Double)MD.c(this.a3)))));
                                        }
                                    }
                                    if (auk_2.a((Boolean)Ba.b(this.cV)) && ava_0.b(this.aQ, ap1.f)) {
                                        if (HN.c(renderGuiEvent) == alw_0.CLICK) {
                                            boolean bl;
                                            int n13 = P8.b((Integer)adt_2.a(this.cO));
                                            n5 = P8.b((Integer)adt_2.a(this.ah));
                                            boolean bl4 = bl = n3 > n13 && n3 <= n13 + 42 && n2 > n5 && n2 <= n5 + 47;
                                        }
                                        if (HN.c(renderGuiEvent) == alw_0.RENDER) {
                                            boolean bl;
                                            if (this.ai) {
                                                adt_2.b(this.cO, P8.d(MathHelper.a(this.aU + n3, P8.b((Integer)adt_2.b(this.cO)), P8.b((Integer)adt_2.c(this.cO)))));
                                                adt_2.b(this.ah, P8.d(MathHelper.a(this.bk + n2, P8.b((Integer)adt_2.b(this.ah)), P8.b((Integer)adt_2.c(this.ah)))));
                                            }
                                            int n14 = P8.b((Integer)adt_2.a(this.cO));
                                            n5 = P8.b((Integer)adt_2.a(this.ah));
                                            boolean bl5 = bl = n3 > n14 && n3 <= n14 + 42 && n2 > n5 && n2 <= n5 + 47;
                                        }
                                    }
                                    if (!this.K()) break block41;
                                    n10 = P8.b((Integer)adt_2.a(this.cG));
                                    n5 = P8.b((Integer)adt_2.a(this.aR));
                                    if (HN.c(renderGuiEvent) != alw_0.CLICK) break block42;
                                    if (!this.a(n10, n5, n3, n2) || HN.e(renderGuiEvent) != 0) break block41;
                                    this.bi = n10 - n3;
                                    this.aC = n5 - n2;
                                    this.aF = true;
                                }
                                if (HN.c(renderGuiEvent) == alw_0.RENDER) {
                                    if (this.aF) {
                                        adt_2.b(this.cG, P8.d(MathHelper.a(this.bi + n3, P8.b((Integer)adt_2.b(this.cG)), P8.b((Integer)adt_2.c(this.cG)))));
                                        adt_2.b(this.aR, P8.d(MathHelper.a(this.aC + n2, P8.b((Integer)adt_2.b(this.aR)), P8.b((Integer)adt_2.c(this.aR)))));
                                    }
                                    if (this.a(n10, n5, n3, n2)) {
                                        double d = this.a(n10, n5)[0];
                                        double d3 = this.a(n10, n5)[1];
                                        double d4 = this.a(n10, n5)[2];
                                        double d5 = this.a(n10, n5)[3];
                                        double d6 = ua_2.a(true);
                                        a1V.a(d, d3, d4, d5, 2.5f, hb_2.a(asx_1.WHITE), hb_2.a(hb_2.a(asx_1.BLACK), 100));
                                        ua_2.a(d6);
                                    }
                                }
                            }
                            if (!this.n()) break block43;
                            n9 = P8.b((Integer)adt_2.a(this.c6));
                            n5 = P8.b((Integer)adt_2.a(this.ae));
                            if (HN.c(renderGuiEvent) != alw_0.CLICK) break block44;
                            if (n3 <= n9 - 3 || !((double)n3 <= this.a2 + 1.0) || !((double)n2 > (double)n5 - 21.5) || !((double)n2 <= this.by - 0.5) || HN.e(renderGuiEvent) != 0) break block43;
                            this.P = n9 - n3;
                            this.aV = n5 - n2;
                            this.aa = true;
                        }
                        if (HN.c(renderGuiEvent) == alw_0.RENDER) {
                            if (this.aa) {
                                adt_2.b(this.c6, P8.d(MathHelper.a(this.P + n3, P8.b((Integer)adt_2.b(this.c6)), P8.b((Integer)adt_2.c(this.c6)))));
                                adt_2.b(this.ae, P8.d(MathHelper.a(this.aV + n2, P8.b((Integer)adt_2.b(this.ae)), P8.b((Integer)adt_2.c(this.ae)))));
                            }
                            if (n3 > n9 - 3 && (double)n3 <= this.a2 + 1.0 && (double)n2 > (double)n5 - 21.5 && (double)n2 <= this.by - 0.5) {
                                double d = ua_2.a(true);
                                a1V.a((double)(n9 - 3), (double)n5 - 21.5, this.a2 + 1.0, this.by - 0.5, 2.5f, hb_2.a(asx_1.WHITE), hb_2.a(hb_2.a(asx_1.BLACK), 100));
                                ua_2.a(d);
                            }
                        }
                    }
                    if (!this.g()) break block45;
                    n4 = P8.b((Integer)adt_2.a(this.N));
                    n5 = P8.b((Integer)adt_2.a(this.Q));
                    if (HN.c(renderGuiEvent) != alw_0.CLICK) break block46;
                    if (n3 <= n4 - 6 || n3 > n4 + 84 || n2 <= n5 - 6 || n2 > n5 + 84 || HN.e(renderGuiEvent) != 0) break block45;
                    this.bG = n4 - n3;
                    this.aE = n5 - n2;
                    this.bD = true;
                }
                if (HN.c(renderGuiEvent) == alw_0.RENDER) {
                    if (this.bD) {
                        adt_2.b(this.N, P8.d(MathHelper.a(this.bG + n3, P8.b((Integer)adt_2.b(this.N)), P8.b((Integer)adt_2.c(this.N)))));
                        adt_2.b(this.Q, P8.d(MathHelper.a(this.aE + n2, P8.b((Integer)adt_2.b(this.Q)), P8.b((Integer)adt_2.c(this.Q)))));
                        this.h((short)n8, (char)n7, n6);
                    }
                    if (n3 > n4 - 6 && n3 <= n4 + 84 && n2 > n5 - 6 && n2 <= n5 + 84) {
                        double d = ua_2.a(true);
                        a1V.a(n4 - 6, n5 - 6, n4 + 84, n5 + 84, 2.5f, hb_2.a(asx_1.WHITE), hb_2.a(hb_2.a(asx_1.BLACK), 100));
                        ua_2.a(d);
                    }
                }
            }
            if (auk_2.a((Boolean)Ba.b(this.cV)) && ava_0.b(this.aQ, ap1.aB) && dz_0.c(iterator = ListInvoker.iterator(this.P()))) {
                a2l_0 a2l_02 = (a2l_0)dz_0.b(iterator);
                boolean bl = (double)n3 > a2l_02.f && (double)n3 <= a2l_02.i && (double)n2 > a2l_02.a && (double)n2 <= a2l_02.g;
                int n15 = P8.b((Integer)adt_2.a(this.cZ));
                n = P8.b((Integer)adt_2.a(this.c7));
                if (HN.c(renderGuiEvent) == alw_0.CLICK) {
                    this.a8 = n15 - n3;
                    this.U = n - n2;
                    this.b_ = true;
                }
                if (HN.c(renderGuiEvent) == alw_0.RENDER && this.b_) {
                    adt_2.b(this.cZ, P8.d(MathHelper.a(this.a8 + n3, P8.b((Integer)adt_2.b(this.cZ)), P8.b((Integer)adt_2.c(this.cZ)))));
                    adt_2.b(this.c7, P8.d(MathHelper.a(this.U + n2, P8.b((Integer)adt_2.b(this.c7)), P8.b((Integer)adt_2.c(this.c7)))));
                }
            }
            if (auk_2.a((Boolean)Ba.b(this.cV)) && ava_0.b(this.aQ, ap1.cB) && aMF.c(ListInvoker.stream(this.N()), Objects::nonNull)) {
                boolean bl = (double)n3 > this.bq && (double)n3 <= this.bH && (double)n2 > this.M && (double)n2 <= this.aw;
                int n16 = P8.b((Integer)adt_2.a(this.a_));
                int n17 = P8.b((Integer)adt_2.a(this.be));
                if (HN.c(renderGuiEvent) != alw_0.CLICK && HN.c(renderGuiEvent) == alw_0.RENDER && this.aG) {
                    adt_2.b(this.a_, P8.d(MathHelper.a(this.av + n3, P8.b((Integer)adt_2.b(this.a_)), P8.b((Integer)adt_2.c(this.a_)))));
                    adt_2.b(this.be, P8.d(MathHelper.a(this.aX + n2, P8.b((Integer)adt_2.b(this.be)), P8.b((Integer)adt_2.c(this.be)))));
                }
            }
            if (HN.c(renderGuiEvent).equals((Object)alw_0.RELEASE) && HN.e(renderGuiEvent) == 0) {
                this.aF = false;
                this.bD = false;
                this.cH = false;
                this.aa = false;
                this.aJ = false;
                this.ai = false;
                this.b_ = false;
                this.aG = false;
            }
        }
    }

    static Minecraft a(HUD hUD) {
        return hUD.mc;
    }

    private Boolean lambda$new$65() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.cV)) && auk_2.a((Boolean)Ba.b(this.bU)) && auk_2.a((Boolean)Ba.b(this.ax)) && ava_0.b(this.aQ, ap1.eI) && auk_2.a((Boolean)Ba.b(this.b1)));
    }

    private Boolean lambda$new$47() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bf)) && auk_2.a((Boolean)Ba.b(this.ay)) && ava_0.b(this.I, ap1.ep));
    }

    static IntProperty b(HUD hUD) {
        return hUD.cv;
    }

    public int z() {
        return P8.b((Integer)adt_2.b(this.cr));
    }

    private void k(Render2DEvent render2DEvent) {
        HUD.j();
        if (this.bw == null || ListInvoker.isEmpty(this.bw) || this.mc.player != null && this.mc.player.ticksExisted < 5) {
            this.b();
        }
        if (aen_2.b((ModuleManager)NovolineInvoker.l((Novoline)this.novoline)).c) {
            this.b();
            aen_2.b((ModuleManager)NovolineInvoker.l((Novoline)this.novoline)).c = false;
        }
        ScaledResolution scaledResolution = uc_0.a(render2DEvent);
        ScaledResolutionInvoker.g(scaledResolution);
        ScaledResolutionInvoker.a(scaledResolution);
        int n = this.y();
        double d = P8.b((Integer)adt_2.a(this.cG));
        double[] dArray = new double[]{P8.b((Integer)adt_2.a(this.aR))};
        int[] nArray = new int[]{0};
        List list = (List)aMF.a(aMF.b(ListInvoker.stream(this.bw), HUD::lambda$drawModuleList$112), aB0.a());
        int n2 = 0;
        if (n2 < ListInvoker.size(list)) {
            AbstractModule abstractModule = (AbstractModule)ListInvoker.get(list, n2);
            boolean bl = StringPropertyInvoker.isMode(this.b4, ap1.aV);
            boolean bl2 = StringPropertyInvoker.isMode(this.b4, ap1.D);
            abstractModule.w = d - (double)(a7l_0.a(this.S(), abstractModule.b()) / 2 * (bl2 ? -1 : 1));
            abstractModule.q = abstractModule.e() + (double)(a7l_0.a(this.S()) / 2);
            int n3 = n2++;
            abstractModule.a(() -> this.lambda$drawModuleList$117(abstractModule, dArray, d, nArray, bl, bl2, n, n3, list));
        }
        if (ava_0.b(this.I, ap1.A)) {
            n2 = P8.b((Integer)adt_2.a(this.cb));
            int n4 = P8.b((Integer)adt_2.a(this.bE));
            if (StringPropertyInvoker.isMode(this.az, ap1.cH)) {
                if (StringPropertyInvoker.isMode(this.bs, ap1.B)) {
                    agg_2.a(agg_2.c(), n2, n4, true, () -> HUD.lambda$drawModuleList$120(list), StringPropertyInvoker.isMode(this.K, ap1.cL) ? null : Color.BLACK);
                    adp_0.b(false);
                    ListInvoker.forEach(list, HUD::lambda$drawModuleList$122);
                    adp_0.a(false);
                    n4 = (int)(1.2549019607843137 * (double)n4);
                    agg_2.a(agg_2.c(), n2, n4, true, () -> HUD.lambda$drawModuleList$125(list), null);
                    adp_0.a();
                    ListInvoker.forEach(list, HUD::lambda$drawModuleList$127);
                }
                agg_2.a(agg_2.c(), n2, n4, true, () -> HUD.lambda$drawModuleList$130(list), StringPropertyInvoker.isMode(this.b0, ap1.bi) ? Color.BLACK : null);
            }
            if (StringPropertyInvoker.isMode(this.az, ap1.cz)) {
                n4 = (int)(1.5686274509803921 * (double)n4);
                agg_2.a(agg_2.c(), n2, n4, true, () -> HUD.lambda$drawModuleList$133(list), null);
            }
        }
    }

    private static void lambda$null$113(double d, double d2, double d3, double d4, int n, double d5, double d6, int n2, int n3) {
        a1V.b(d - 2.0 - d2, d3 - d4, d + (double)n + 2.0 + d5 + d6, d3 + (double)n2 + d4, n3);
    }

    private Boolean lambda$new$89() {
        HUD.t();
        return auk_2.b(StringPropertyInvoker.isMode(this.co, ap1.bo) && auk_2.a((Boolean)Ba.b(this.Y)) && auk_2.a((Boolean)Ba.b(this.cK)));
    }

    public static void c(boolean bl) {
        c0 = bl;
    }

    public int a(String string, int n, String string2) {
        HUD.t();
        return StringPropertyInvoker.isMode(this.cz, ap1.ct) ? this.mc.fontRendererObj.a(string2) : a7l_0.a(this.a(string, n), string2);
    }

    private Boolean lambda$new$42() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bf)) && auk_2.a((Boolean)Ba.b(this.ay)));
    }

    private Boolean lambda$new$27() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bc)) && auk_2.a((Boolean)Ba.b(this.cE)) && StringPropertyInvoker.isMode(this.O, ap1.dd) && StringPropertyInvoker.isMode(this.bW, ap1.bT));
    }

    private static void lambda$null$118(AbstractModule abstractModule) {
        sj_1.a(abstractModule.s);
    }

    private Boolean lambda$new$76() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.an)) && auk_2.a((Boolean)Ba.b(this.as)));
    }

    public double f() {
        return db_0.b((Double)MD.b(this.bo));
    }

    private static void lambda$null$123(AbstractModule abstractModule) {
        sj_1.a(abstractModule.e);
    }

    private Boolean lambda$new$12() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bc)) && auk_2.a((Boolean)Ba.b(this.cE)) && !StringPropertyInvoker.isMode(this.cz, ap1.a5));
    }

    private static void lambda$null$131(AbstractModule abstractModule) {
        sj_1.a(abstractModule.B);
    }

    private Boolean lambda$new$79() {
        return (Boolean)Ba.b(this.bN);
    }

    private Boolean lambda$new$92() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.a5)) && StringPropertyInvoker.isMode(this.b7, ap1.n));
    }

    private Integer lambda$getModuleList$106(AbstractModule abstractModule) {
        return P8.d(this.g(abstractModule.b()));
    }

    static FontFamily d(HUD hUD) {
        return hUD.a6;
    }

    public boolean l() {
        return auk_2.a((Boolean)Ba.b(this.Y));
    }

    private Boolean lambda$new$24() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bc)) && auk_2.a((Boolean)Ba.b(this.cE)) && StringPropertyInvoker.isMode(this.O, ap1.bI) && StringPropertyInvoker.isMode(this.bW, ap1.eG));
    }

    private static void lambda$drawModuleList$133(List list) {
        ListInvoker.forEach(list, HUD::lambda$null$132);
    }

    private Boolean lambda$new$83() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bN)) && auk_2.a((Boolean)Ba.b(this.a4)));
    }

    private Boolean lambda$new$54() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.cV)) && auk_2.a((Boolean)Ba.b(this.bj)) && auk_2.a((Boolean)Ba.b(this.ax)) && ava_0.b(this.aQ, ap1.cu));
    }

    private Boolean lambda$new$67() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.cV)) && auk_2.a((Boolean)Ba.b(this.bU)) && auk_2.a((Boolean)Ba.b(this.ax)) && ava_0.b(this.aQ, ap1.ab) && auk_2.a((Boolean)Ba.b(this.b1)));
    }

    private static boolean lambda$drawModuleList$112(AbstractModule abstractModule) {
        HUD.t();
        return _j_0.a(abstractModule.p()) > 0.0;
    }

    private void lambda$drawModuleList$117(AbstractModule abstractModule, double[] dArray, double d, int[] nArray, boolean bl, boolean bl2, int n, int n2, List list) {
        HUD.j();
        double d2 = 2000 / MCInvoker.O(this.mc);
        if (!qh_1.c(this.b9, 50L) || this.mc.currentScreen instanceof GuiChat || abstractModule.e() == 0.0) {
            abstractModule.a(dArray[0]);
        }
        if (abstractModule.e() > dArray[0]) {
            abstractModule.a(MathHelper.b(abstractModule.e() - 0.0625 * d2, dArray[0], 999.0));
        }
        if (abstractModule.e() < dArray[0]) {
            abstractModule.a(MathHelper.b(abstractModule.e() + 0.0625 * d2, 0.0, dArray[0]));
        }
        String string = abstractModule.b();
        int n3 = this.g(string);
        double d3 = d;
        double d4 = abstractModule.e();
        d3 -= StringPropertyInvoker.isMode(this.b4, ap1.cQ) ? (double)n3 : 0.0;
        double d5 = db_0.b((Double)MD.b(this.cR)) * 0.5;
        int n4 = hb_2.a((long)nArray[0]);
        double d6 = db_0.b((Double)MD.b(this.cQ));
        double d7 = 1.0 + d6;
        double d8 = 1.0 + d6;
        double d9 = d3;
        abstractModule.s = () -> HUD.lambda$null$113(d9, d6, d4, d5, n3, d7, d8, n, n4);
        if (!StringPropertyInvoker.isMode(this.bs, ap1.eu)) {
            int n5 = hb_2.a(StringPropertyInvoker.isMode(this.K, ap1.dn) ? hb_2.a(asx_1.BLACK) : n4, P8.b((Integer)adt_2.a(this.al)));
            a1V.b(d3 - 2.0 - d6, d4 - d5, d3 + (double)n3 + 2.0 + d7 + d8, d4 + (double)n + d5, n5);
            String string2 = (String)StringPropertyInvoker.b(this.bs);
            String string3 = (String)StringPropertyInvoker.b(this.af);
            boolean bl3 = string2.equals(ap1.bz);
            boolean bl4 = bl3 || string2.equals(ap1.bV) && (string3.equals(ap1.dK) || string3.equals(ap1.a3));
            boolean bl5 = bl3 || string2.equals(ap1.bY) && (string3.equals(ap1.cM) || string3.equals(ap1.ce));
            boolean bl6 = StringPropertyInvoker.isMode(this.bh, ap1.en);
            boolean bl7 = string2.equals(ap1.es);
            if (bl7) {
                abstractModule.D = () -> HUD.lambda$null$114(d9, n3, d7, d4, d5, n, n4);
                if (ava_0.b(this.I, ap1.bc) && StringPropertyInvoker.isMode(this.az, ap1.t)) {
                    abstractModule.e = () -> HUD.lambda$null$115(d9, n3, d7, d4, d5, n, n4);
                }
                sj_1.a(abstractModule.D);
            }
            if (n2 == 0) {
                a1V.b(d3 - (double)(bl3 || bl2 ? 3 : 2) - d6, d4 - d5 - 1.0, d3 + (double)n3 + (double)(bl3 || bl ? 3 : 2) + d7 + d8, d4 - d5, n4);
                a1V.b(d3 - (double)(bl3 || bl2 ? 3 : 2) - d6, d4 + (double)n + d5, d3 + (double)n3 + (double)(bl3 || bl ? 3 : 2) + d7 + d8, d4 + (double)n + d5 + 1.0, n4);
            }
            a1V.b(d3 + (double)n3 + 2.0 + d7, d4 - d5, d3 + (double)n3 + 3.0 + d7, d4 + (double)n + d5, n4);
            a1V.b(d3 - 3.0 - d6, d4 - d5, d3 - 2.0 - d6, d4 + (double)n + d5, n4);
            if (bl3) {
                a1V.b(d3 - 3.0 - d6, d4 - d5, d3 - 2.0 - d6, d4 + (double)n + d5, n4);
                a1V.b(d3 + (double)n3 + 2.0 + d8, d4 - d5, d3 + (double)n3 + 3.0 + d8, d4 + (double)n + d5, n4);
                if (bl) {
                    if (bl6) {
                        if (n2 < ListInvoker.size(list) - 1) {
                            a1V.b(d3 - 3.0 - d6, d4 + (double)n + d5, d3 + (double)n3 - (double)this.g(((AbstractModule)ListInvoker.get(list, n2 + 1)).b()) - 3.0 - d6, d4 + (double)n + d5 + 1.0, n4);
                        }
                        a1V.b(d3 - 3.0 - d6, d4 + (double)n + d5, d3 + (double)n3 + 3.0 + d7, d4 + (double)n + d5 + 1.0, n4);
                    }
                    if (n2 < ListInvoker.size(list) - 1) {
                        a1V.b(d3 - 3.0 - d6, d4 - d5 - 1.0, d3 + (double)n3 - (double)this.g(((AbstractModule)ListInvoker.get(list, n2 + 1)).b()) - 3.0 - d6, d4 - d5, n4);
                    }
                    a1V.b(d3 - 3.0 - d6, d4 - d5 - 1.0, d3 + (double)n3 + 3.0 + d7, d4 - d5, n4);
                }
                if (bl6) {
                    if (n2 < ListInvoker.size(list) - 1) {
                        a1V.b(d3 + (double)this.g(((AbstractModule)ListInvoker.get(list, n2 + 1)).b()) + 3.0 + d8, d4 + (double)n + d5, d3 + (double)n3 + 3.0 + d8, d4 + (double)n + d5 + 1.0, n4);
                    }
                    a1V.b(d3 - 3.0 - d6, d4 + (double)n + d5, d3 + (double)n3 + 3.0 + d8, d4 + (double)n + d5 + 1.0, n4);
                }
                if (n2 < ListInvoker.size(list) - 1) {
                    a1V.b(d3 + (double)this.g(((AbstractModule)ListInvoker.get(list, n2 + 1)).b()) + 3.0 + d8, d4 - d5 - 1.0, d3 + (double)n3 + 3.0 + d8, d4 - d5, n4);
                }
                a1V.b(d3 - 3.0 - d6, d4 - d5 - 1.0, d3 + (double)n3 + 3.0 + d8, d4 - d5, n4);
            }
        }
        if (StringPropertyInvoker.isMode(this.cz, ap1.ea)) {
            this.a(string, d9 + 0.5, d4 + db_0.b((Double)MD.b(this.aW)), n4);
        }
        this.a(string, d9, d4 + db_0.b((Double)MD.b(this.aW)), n4);
        abstractModule.B = () -> this.lambda$null$116(string, d9, d4, n4);
        if (StringPropertyInvoker.isMode(this.bh, ap1.ad)) {
            dArray[0] = dArray[0] - ((double)n + db_0.b((Double)MD.b(this.cR)));
        }
        if (StringPropertyInvoker.isMode(this.bh, ap1.dx)) {
            dArray[0] = dArray[0] + ((double)n + db_0.b((Double)MD.b(this.cR)));
        }
        nArray[0] = nArray[0] - 180;
    }

    public eu_0 d() {
        return this.cW;
    }

    private Boolean lambda$new$63() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.cV)) && auk_2.a((Boolean)Ba.b(this.bU)) && auk_2.a((Boolean)Ba.b(this.ax)) && ava_0.b(this.aQ, ap1.bU));
    }

    private Boolean lambda$new$70() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.cV)) && auk_2.a((Boolean)Ba.b(this.ck)) && auk_2.a((Boolean)Ba.b(this.ax)) && (ava_0.b(this.aQ, ap1.Y) || ava_0.b(this.aQ, ap1.aF)));
    }

    public cc.novoline.utils.fonts.api.FontRenderer a(String string, int n) {
        return adj_1.a(this.h(string), n);
    }

    private Boolean lambda$new$90() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.a5)) && (StringPropertyInvoker.isMode(this.b7, ap1.dM) || StringPropertyInvoker.isMode(this.b7, ap1.bg)));
    }

    public void h(short s, char c, int n) {
        long l4 = ((long)s << 48 | (long)c << 48 >>> 16 | (long)n << 32 >>> 32) ^ eb;
        long l5 = l4 ^ 0x2BB600793D7EL;
        int n2 = (int)(l5 >>> 48);
        int n3 = (int)(l5 << 16 >>> 48);
        int n4 = (int)(l5 << 32 >>> 32);
        ListInvoker.clear(this.cF);
        int n5 = P8.b((Integer)adt_2.a(this.N));
        int n6 = P8.b((Integer)adt_2.a(this.Q));
        double d = 1 + P8.b((Integer)adt_2.a(this.cv));
        ListInvoker.add(this.cF, new aff_2(this, this.mc.gameSettings.cd, (double)n5 + this.Z, (double)n6 - d, this.Z, this.a0));
        ListInvoker.add(this.cF, new aff_2(this, this.mc.gameSettings.ac, (double)n5 - d, (double)n6 + this.a0, this.Z, this.a0));
        ListInvoker.add(this.cF, new aff_2(this, this.mc.gameSettings.L, (double)n5 + this.Z, (double)n6 + this.a0, this.Z, this.a0));
        ListInvoker.add(this.cF, new aff_2(this, this.mc.gameSettings.ab, (double)n5 + this.Z * 2.0 + d, (double)n6 + this.a0, this.Z, this.a0));
        ListInvoker.add(this.cF, new aff_2((short)n2, this, (short)n3, ap1.d0, (double)n5 + this.Z / 2.0 - 2.0 - d / 2.0, (double)n6 + this.a0 * 2.0 + d, this.cI, this.a0, n4));
        ListInvoker.add(this.cF, new aff_2((short)n2, this, (short)n3, ap1.dm, (double)n5 + this.Z * 1.5 + d / 2.0, (double)n6 + this.a0 * 2.0 + d, this.cI, this.a0, n4));
    }

    private Boolean lambda$new$3() {
        HUD.t();
        return auk_2.b(!StringPropertyInvoker.isMode(this.cz, ap1.a4));
    }

    private Boolean lambda$new$2() {
        return auk_2.b(StringPropertyInvoker.isMode(this.cz, ap1.bR));
    }

    private long a(long l4) {
        return l4 / 1024L / 1024L;
    }

    private static void lambda$onBlur$110(aff_2 aff_22) {
        azf_2.a(aff_22, false, Color.BLACK);
    }

    public void b(int n, String string, double d, double d2, int n2) {
        HUD.t();
        if (StringPropertyInvoker.isMode(this.cz, ap1.bZ)) {
            this.mc.fontRendererObj.b(string, d - (double)this.g(string) * 0.5, d2, n2, true);
        }
        if (auk_2.a((Boolean)Ba.b(this.cP))) {
            a7l_0.a(this.a(n), (CharSequence)string, d - (double)this.a(n, string) * 0.5, d2, n2, axx_1.a((Float)a9V.a(this.b6)));
        }
        a7l_0.b(this.a(n), string, d - (double)this.a(n, string) * 0.5, d2, n2, true);
    }

    private Boolean lambda$new$1() {
        return auk_2.b(StringPropertyInvoker.isMode(this.cz, ap1.eE));
    }

    private static boolean lambda$keyBindsModuleList$138(ModuleHolder moduleHolder) {
        HUD.t();
        return akk_0.b(moduleHolder) != ModuleInvoker.isEnable(ModuleRegistry.CLICKGUI) && age_2.a((ae6_0)aoc_1.a(akk_0.b(moduleHolder).n())) != 0;
    }

    private Boolean lambda$new$97() {
        return (Boolean)Ba.b(this.bp);
    }

    private Boolean lambda$new$55() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.cV)) && auk_2.a((Boolean)Ba.b(this.bj)) && auk_2.a((Boolean)Ba.b(this.ax)) && ava_0.b(this.aQ, ap1.c) && StringPropertyInvoker.isMode(this.cA, ap1.cg));
    }

    private Boolean lambda$new$102() {
        return (Boolean)Ba.b(this.bP);
    }

    private Boolean lambda$new$81() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bN)) && auk_2.a((Boolean)Ba.b(this.a4)));
    }

    private int lambda$getLongestEffectWidth$144(a2l_0 a2l_02) {
        return this.a(19, this.b(a2l_02));
    }

    private Boolean lambda$new$33() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bf)) && auk_2.a((Boolean)Ba.b(this.ay)));
    }

    private static void lambda$null$129(AbstractModule abstractModule) {
        abstractModule.a(() -> HUD.lambda$null$128(abstractModule));
    }

    public void a(cc.novoline.utils.fonts.api.FontRenderer fontRenderer, String string, double d, double d2, boolean bl, boolean bl2, int n, int n2) {
        int n3 = 0;
        HUD.j();
        char[] cArray = StringInvoker.f(string);
        int n4 = cArray.length;
        int n5 = 0;
        if (n5 < n4) {
            char c = cArray[n5];
            a7l_0.b(fontRenderer, StringInvoker.a(c), d, d2, hb_2.a(n, n2, (long)n3), bl);
            d += a7l_0.a(fontRenderer, c);
            n3 -= 90;
            ++n5;
        }
    }

    public void e(String string) {
        Path path;
        block4: {
            HUD.j();
            this.bz = ae7_0.a(null, wq_0.a(0, new FileInputStream(string)));
            path = da_0.a(this.cq, new String[0]);
            if (aev_1.b(path, new LinkOption[0])) break block4;
            aev_1.c(path, new FileAttribute[0]);
        }
        try {
            aev_1.a(path, StringInvoker.e(string), new OpenOption[]{StandardOpenOption.TRUNCATE_EXISTING});
        }
        catch (FontFormatException | IOException exception) {
            // empty catch block
        }
    }

    private List<AbstractModule> s() {
        return (List)aMF.a(aMF.a(aMF.b(uw_0.a(aen_2.c(this.moduleManager).values()), HUD::lambda$keyBindsModuleList$138), ModuleHolder::c), aB0.a());
    }

    @Override
    public void o() {
        this.ce = new avj_2();
        this.ag = new avj_2();
        aci_0.a(NovolineInvoker.i(this.novoline), new auw_0(this, 60, ag3_0.TICK));
    }

    public void a(int n, String string, double d, double d2, int n2, boolean bl) {
        HUD.t();
        if (StringPropertyInvoker.isMode(this.cz, ap1.a9)) {
            FontRendererInvoker.a(this.mc.fontRendererObj, string, (float)d, (float)d2, n2, bl);
        }
        if (auk_2.a((Boolean)Ba.b(this.cP))) {
            a7l_0.a(this.a(n), (CharSequence)string, d, d2, n2, axx_1.a((Float)a9V.a(this.b6)));
        }
        a7l_0.b(this.a(n), string, d, d2, n2, bl);
    }

    private void b(Render2DEvent render2DEvent) {
        int n;
        Object object;
        Object object2;
        int n2;
        double d;
        double d2;
        double d3;
        double d4;
        HUD.t();
        if (StringPropertyInvoker.isMode(this.co, ap1.d4)) {
            d4 = 32.0;
            d3 = ScaledResolutionInvoker.getScaledWidth(uc_0.a(render2DEvent)) / 2 - 137;
            double d5 = ScaledResolutionInvoker.i(uc_0.a(render2DEvent)) - 24;
            d2 = 2000 / MCInvoker.O(this.mc);
            d = d3;
            n2 = 0;
            object2 = ListInvoker.iterator(this.J);
            if (dz_0.c((Iterator)object2)) {
                object = (a5P)dz_0.b((Iterator)object2);
                a5P.b((a5P)object, d + 6.0);
                a5P.a((a5P)object, d5 + 4.5);
                a5P.a((a5P)object, InventoryInvoker.c(this.mc.player.inventory, a5P.b((a5P)object)));
                n = a5P.b((a5P)object) == this.mc.player.inventory.a ? 1 : 0;
                a5P.c((a5P)object, MathHelper.b(a5P.a((a5P)object) + 0.00125 * d2, 0.0, 1.5));
                a5P.c((a5P)object, MathHelper.b(a5P.a((a5P)object) - 0.00125 * d2, 1.0, 999.0));
                Color color = new Color(hb_2.a((long)n2));
                ((a5P)object).a(render2DEvent, aol_1.b(color));
                n2 -= 120;
                d += d4;
            }
        }
        d4 = ScaledResolutionInvoker.getScaledWidth(uc_0.a(render2DEvent)) / 2;
        d3 = ScaledResolutionInvoker.i(uc_0.a(render2DEvent));
        aV3.a(aV3.a(), d4 - 90.5, d3 - 22.5, 181.0, 22.5, 0.0, (double)P8.b((Integer)adt_2.a(this.bl)), new Color(0, 0, 0, P8.b((Integer)adt_2.a(this.aZ))), true);
        int n3 = 0;
        int n4 = this.mc.player.inventory.a;
        d2 = 2000 / MCInvoker.O(this.mc);
        d = 20 * n4;
        if (this.at != n4) {
            if (MathInvoker.a(n4 - this.at) > 7) {
                this.ap = d;
            }
            this.at = n4;
        }
        if (this.ap < d) {
            this.ap = MathHelper.b(this.ap + 0.125 * d2, 0.0, d);
        }
        if (this.ap > d) {
            this.ap = MathHelper.b(this.ap - 0.125 * d2, d, 999.0);
        }
        aV3.a(aV3.a(), d4 - 90.0 + this.ap - 0.5, d3 - 22.5, 20.5, 22.5, 0.0, (double)P8.b((Integer)adt_2.a(this.bl)), new Color(0, 0, 0, P8.b((Integer)adt_2.a(this.aZ))), true);
        n2 = 0;
        object2 = InventoryInvoker.c(this.mc.player.inventory, n2);
        a1V.a((ItemStack)object2, (float)(d4 - 90.0 + (double)(20 * n2) + 2.0), (float)(d3 - 20.5));
        if (((ItemStack)object2).a > 1) {
            object = StringInvoker.a(((ItemStack)object2).a);
            n = StringInvoker.c((String)object);
            int n5 = 0;
            if (n == 2) {
                n5 = 4;
            }
            if (n == 1) {
                n5 = 9;
            }
            GlStateManagerInvoker.disableDepth();
            this.a(18, StringInvoker.a(((ItemStack)object2).a), d4 - 90.0 + (double)(20 * n2) + 4.0 + (double)n5, d3 - 10.0, 0xFFFFFF, true, false);
            GlStateManagerInvoker.enableDepth();
        }
        a1V.b(d4 - 90.0 + (double)(20 * n2) + 1.0, d3 - 2.0, d4 - 90.0 + (double)(20 * (n2 + 1)) - 1.0, d3 - 1.0, hb_2.a((long)n3));
        n3 -= 180;
        ++n2;
    }

    public StringProperty i() {
        return this.cw;
    }

    public void a(int n, String string, double d, double d2, boolean bl) {
        HUD.j();
        int n2 = 0;
        char[] cArray = StringInvoker.f(string);
        int n3 = cArray.length;
        int n4 = 0;
        if (n4 < n3) {
            char c = cArray[n4];
            this.a(n, StringInvoker.a(c), d, d2, hb_2.a((long)n2), bl);
            d += StringPropertyInvoker.isMode(this.cz, ap1.af) ? (double)FontRendererInvoker.a(this.mc.fontRendererObj, c) : a7l_0.a(this.a(n), c);
            n2 -= 120;
            ++n4;
        }
    }

    public BooleanProperty G() {
        return this.L;
    }

    public StringProperty O() {
        return this.c4;
    }

    static IntProperty c(HUD hUD) {
        return hUD.cC;
    }

    private boolean n() {
        HUD.t();
        return auk_2.a((Boolean)Ba.b(this.an)) && this.d(auk_2.a((Boolean)Ba.b(this.ba)));
    }

    private boolean d(boolean bl) {
        HUD.t();
        return !bl || !this.mc.gameSettings.ar;
    }

    private Boolean lambda$new$45() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bf)) && auk_2.a((Boolean)Ba.b(this.ay)) && ava_0.b(this.I, ap1.dP));
    }

    private Boolean lambda$new$85() {
        return (Boolean)Ba.b(this.Y);
    }

    private Boolean lambda$new$75() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.an)) && auk_2.a((Boolean)Ba.b(this.as)));
    }

    public eu_0 F() {
        return this.aP;
    }

    public double L() {
        HUD.t();
        return StringPropertyInvoker.isMode(this.cz, ap1.aP) ? FontRendererInvoker.c(this.mc.fontRendererObj) : a7l_0.b(this.S());
    }

    public static boolean j() {
        HUD.t();
        return true;
    }

    public int w() {
        return P8.b((Integer)adt_2.a(this.W));
    }

    private Boolean lambda$new$14() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bc)) && auk_2.a((Boolean)Ba.b(this.cE)));
    }

    public StringProperty T() {
        return this.cn;
    }

    public void a(String string, double d, double d2, int n) {
        HUD.j();
        if (StringPropertyInvoker.isMode(this.cz, ap1.U)) {
            FontRendererInvoker.a(this.mc.fontRendererObj, string, (float)d, (float)d2, n, true);
        }
        if (auk_2.a((Boolean)Ba.b(this.cP))) {
            a7l_0.a(this.S(), (CharSequence)string, d, d2, n, axx_1.a((Float)a9V.a(this.b6)));
        }
        a7l_0.b(this.S(), string, d, d2, n, true);
    }

    public double a(int n, char c) {
        HUD.t();
        return StringPropertyInvoker.isMode(this.cz, ap1.bM) ? (double)FontRendererInvoker.a(this.mc.fontRendererObj, c) : a7l_0.a(this.a(n), c);
    }

    private void c(Render2DEvent render2DEvent) {
        ScaledResolution scaledResolution = uc_0.a(render2DEvent);
        int n = P8.b((Integer)adt_2.a(this.cZ));
        HUD.t();
        int n2 = P8.b((Integer)adt_2.a(this.c7));
        double d = n;
        double d2 = n2;
        int n3 = 0;
        boolean bl = n >= ScaledResolutionInvoker.a(scaledResolution) / 2;
        boolean bl2 = n2 >= ScaledResolutionInvoker.g(scaledResolution) / 2;
        StringProperty stringProperty = this.cA;
        boolean bl3 = auk_2.a((Boolean)Ba.b(this.aD));
        int n4 = this.y();
        double d3 = StringPropertyInvoker.isMode(stringProperty, ap1.aN) ? (double)n4 + db_0.b((Double)MD.b(this.c5)) : (double)(n4 * 2 + (bl3 ? 12 : 6)) + (double)P8.b((Integer)adt_2.a(this.bM)) / 1.75;
        List<a2l_0> list = this.P();
        Iterator iterator = ListInvoker.iterator(list);
        if (dz_0.c(iterator)) {
            a2l_0 a2l_02 = (a2l_0)dz_0.b(iterator);
            String string = this.e(a2l_02);
            String string2 = this.d(a2l_02);
            String string3 = this.a(a2l_02);
            String string4 = aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aod_2.c(string)), ap1.dC), string2), ap1.av), string3).toString();
            int n5 = hb_2.a((long)n3);
            if (StringPropertyInvoker.isMode(stringProperty, ap1.bC)) {
                this.a(string4, d - (double)this.g(string4), d2, n5);
                a2l_02.a = d2 - 2.0;
                a2l_02.g = d2 + (double)n4 + 1.0;
                a2l_02.f = d - (double)this.g(string4) - 2.5;
                a2l_02.i = d + 2.5;
                a2l_02.f = d - 2.0;
                a2l_02.i = d + (double)this.g(string4) + 2.5;
            }
            String string5 = aL0.a(aL0.a(aL0.a(new StringBuilder(), string), ap1.au), string2).toString();
            boolean bl4 = auk_2.a((Boolean)Ba.b(this.bC));
            a2l_02.a = d2 - 3.0;
            a2l_02.g = d2 + (double)(n4 * 2) + 3.0;
            a2l_02.f = d - (double)this.g(string5) - 6.5;
            a2l_02.i = d + (double)(bl4 ? 20 : 0);
            a2l_02.f = d - 2.0;
            a2l_02.i = d + (double)this.g(string5) + 23.0;
            if (bl3) {
                aV3.a(aV3.a(), a2l_02.f, a2l_02.a, a2l_02.i - a2l_02.f, a2l_02.g - a2l_02.a, db_0.b((Double)MD.b(this.bV)), (double)P8.b((Integer)adt_2.a(this.bM)), new Color(0, 0, 0, P8.b((Integer)adt_2.a(this.ac))), true);
            }
            if (bl4) {
                this.a(a2l_02, d, d2 + (double)n4 - 8.5);
            }
            double d4 = d + (double)(bl4 ? 20 : 0);
            this.a(string5, d4 - (double)this.g(string5), d2, n5);
            this.a(aL0.a(aL0.a(new StringBuilder(), ap1.az), string3).toString(), d4 - (double)this.g(string3), d2 + (double)n4 + 1.5, n5);
            d2 -= d3;
            d2 += d3;
            n3 -= 180;
        }
    }

    public cc.novoline.utils.fonts.api.FontRenderer S() {
        return adj_1.a(this.c(), P8.b((Integer)adt_2.a(this.bF)));
    }

    private boolean K() {
        HUD.j();
        return auk_2.a((Boolean)Ba.b(this.bf)) && this.d(auk_2.a((Boolean)Ba.b(this.R)));
    }

    private List<AbstractModule> H() {
        ClickGui clickGui = (ClickGui)ModuleInvoker.isEnable(ModuleRegistry.CLICKGUI);
        List list = (List)aMF.a(aMF.a(aMF.b(aMF.a(uw_0.a(aen_2.c(this.moduleManager).values()), ModuleHolder::c), arg_0 -> HUD.lambda$getModuleList$105(clickGui, arg_0)), aN_.a(this::lambda$getModuleList$106)), aB0.a());
        asg_0.e(list);
        return list;
    }

    private Boolean lambda$new$96() {
        return (Boolean)Ba.b(this.bp);
    }

    private static boolean lambda$onBlur$107(AbstractModule abstractModule) {
        HUD.t();
        return _j_0.a(abstractModule.p()) > 0.0;
    }

    private static void lambda$null$108(AbstractModule abstractModule) {
        sj_1.a(abstractModule.s);
    }

    /*
     * Exception decompiling
     */
    private FontFamily h(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$TooOptimisticMatchException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.getString(SwitchStringRewriter.java:404)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.access$600(SwitchStringRewriter.java:53)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$SwitchStringMatchResultCollector.collectMatches(SwitchStringRewriter.java:368)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.KleeneN.match(KleeneN.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.MatchSequence.match(MatchSequence.java:26)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:23)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewriteComplex(SwitchStringRewriter.java:201)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewrite(SwitchStringRewriter.java:73)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:881)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private Boolean lambda$new$40() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bf)) && auk_2.a((Boolean)Ba.b(this.ay)) && StringPropertyInvoker.isMode(this.bs, ap1.ey));
    }

    private Boolean lambda$new$58() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.cV)) && auk_2.a((Boolean)Ba.b(this.bj)) && auk_2.a((Boolean)Ba.b(this.ax)) && ava_0.b(this.aQ, ap1.em) && StringPropertyInvoker.isMode(this.cA, ap1.bK) && auk_2.a((Boolean)Ba.b(this.aD)));
    }

    private Boolean lambda$new$26() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bc)) && auk_2.a((Boolean)Ba.b(this.cE)) && StringPropertyInvoker.isMode(this.O, ap1.dQ) && StringPropertyInvoker.isMode(this.bW, ap1.ba) && !StringPropertyInvoker.isMode(this.aY, ap1.a0));
    }

    private Boolean lambda$new$17() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bc)) && auk_2.a((Boolean)Ba.b(this.cE)) && !StringPropertyInvoker.isMode(this.O, ap1.ez));
    }

    private static void lambda$drawModuleList$120(List list) {
        ListInvoker.forEach(list, HUD::lambda$null$119);
    }

    private void lambda$drawName$135(cc.novoline.utils.fonts.api.FontRenderer fontRenderer, String string, double d, double d2) {
        this.a(fontRenderer, string, d, d2, StringPropertyInvoker.isMode(this.aY, ap1.ae));
    }

    private Boolean lambda$new$31() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bc)) && auk_2.a((Boolean)Ba.b(this.cE)));
    }

    private static void lambda$onBlur$109(AbstractModule abstractModule) {
        abstractModule.a(() -> HUD.lambda$null$108(abstractModule));
    }

    private void a(int n, String string, double d, double d2) {
        char[] cArray = StringInvoker.f(string);
        int n2 = cArray.length;
        HUD.j();
        int n3 = 0;
        if (n3 < n2) {
            char c = cArray[n3];
            this.a(n, StringInvoker.a(c), d, d2, hb_2.a((long)this.cu), true);
            d += this.a(n, c);
            this.cu -= 120;
            ++n3;
        }
    }

    public StringProperty r() {
        return this.bT;
    }

    public void a(String string, double d, double d2, int n, boolean bl) {
        HUD.j();
        if (StringPropertyInvoker.isMode(this.cz, ap1.eb)) {
            FontRendererInvoker.a(this.mc.fontRendererObj, string, (float)d, (float)d2, n, bl);
        }
        if (auk_2.a((Boolean)Ba.b(this.cP))) {
            a7l_0.a(this.S(), (CharSequence)string, d, d2, n, axx_1.a((Float)a9V.a(this.b6)));
        }
        a7l_0.b(this.S(), string, d, d2, n, bl);
    }

    private Boolean lambda$new$20() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bc)) && auk_2.a((Boolean)Ba.b(this.cE)) && StringPropertyInvoker.isMode(this.O, ap1.da) && StringPropertyInvoker.isMode(this.bW, ap1.eh));
    }

    public cc.novoline.utils.fonts.api.FontRenderer a(int n) {
        return adj_1.a(this.c(), n);
    }

    @EventTarget
    public void a(ShaderEvent shaderEvent) {
        double d;
        double d2;
        double d3;
        HUD.t();
        if (this.K() && ava_0.b(this.I, ap1.c4)) {
            d3 = ua_2.a(true);
            aMF.a(aMF.b(ListInvoker.stream(this.bw), HUD::lambda$onBlur$107), HUD::lambda$onBlur$109);
            ua_2.a(d3);
        }
        if (this.n() && auk_2.a((Boolean)Ba.b(this.ci))) {
            d3 = ua_2.a(true);
            int n = P8.b((Integer)adt_2.a(this.c6));
            int n2 = P8.b((Integer)adt_2.a(this.ae));
            a1V.b((double)(n - 3), (double)n2 - 21.5, this.a2 + 1.0, this.by - 0.5, hb_2.a(asx_1.BLACK));
            ua_2.a(d3);
        }
        if (this.R() && StringPropertyInvoker.isMode(this.O, ap1.b4) && StringPropertyInvoker.isMode(this.bW, ap1.dV) && ava_0.b(this.cD, ap1.cS)) {
            d3 = ua_2.a(true);
            sj_1.a(this.cL);
            ua_2.a(d3);
        }
        if (this.g() && auk_2.a((Boolean)Ba.b(this.ch))) {
            d3 = ua_2.a(true);
            ListInvoker.forEach(this.cF, HUD::lambda$onBlur$110);
            GL11.glScaled((double)(1.0 / d3), (double)(1.0 / d3), (double)(1.0 / d3));
        }
        if (auk_2.a((Boolean)Ba.b(this.Y)) && auk_2.a((Boolean)Ba.b(this.cl)) && StringPropertyInvoker.isMode(this.co, ap1.dX)) {
            ScaledResolution scaledResolution = new ScaledResolution(this.mc);
            double d4 = ScaledResolutionInvoker.getScaledWidth(scaledResolution) / 2;
            double d5 = ScaledResolutionInvoker.i(scaledResolution);
            a1V.b(d4 - 90.5, d5 - 22.5, d4 + 90.5, d5, hb_2.a(asx_1.BLACK));
        }
        if (auk_2.a((Boolean)Ba.b(this.cV)) && ava_0.b(this.aQ, ap1.h) && auk_2.a((Boolean)Ba.b(this.au))) {
            int n = P8.b((Integer)adt_2.a(this.am));
            int n3 = P8.b((Integer)adt_2.a(this.bd));
            double d6 = ua_2.a(true);
            d2 = 42.0;
            d = 47.0;
            a1V.b((double)n, (double)n3, (double)n + d2, (double)n3 + d, hb_2.a(asx_1.BLACK));
            GL11.glScaled((double)(1.0 / d6), (double)(1.0 / d6), (double)(1.0 / d6));
        }
        if (auk_2.a((Boolean)Ba.b(this.cV)) && ava_0.b(this.aQ, ap1.dJ) && auk_2.a((Boolean)Ba.b(this.au))) {
            int n = P8.b((Integer)adt_2.a(this.cO));
            int n4 = P8.b((Integer)adt_2.a(this.ah));
            double d7 = ua_2.a(true);
            d2 = 42.0;
            d = 47.0;
            a1V.b((double)n, (double)n4, (double)n + d2, (double)n4 + d, hb_2.a(asx_1.BLACK));
            ua_2.a(d7);
        }
        if (auk_2.a((Boolean)Ba.b(this.cV)) && ava_0.b(this.aQ, ap1.cy) && StringPropertyInvoker.isMode(this.cA, ap1.b0) && auk_2.a((Boolean)Ba.b(this.aD)) && auk_2.a((Boolean)Ba.b(this.aq))) {
            double d8 = ua_2.a(true);
            ListInvoker.forEach(this.P(), this::lambda$onBlur$111);
            ua_2.a(d8);
        }
        if (auk_2.a((Boolean)Ba.b(this.cV)) && ava_0.b(this.aQ, ap1.bh) && auk_2.a((Boolean)Ba.b(this.b1)) && auk_2.a((Boolean)Ba.b(this.cs))) {
            double d9 = ua_2.a(true);
            this.a(false, Color.BLACK);
            ua_2.a(d9);
        }
    }

    private Boolean lambda$new$8() {
        return auk_2.b(StringPropertyInvoker.isMode(this.X, ap1.bB));
    }

    public String v() {
        return (String)StringPropertyInvoker.b(this.co);
    }

    public void b(String string, double d, double d2) {
        int n = 0;
        HUD.t();
        char[] cArray = StringInvoker.f(string);
        int n2 = cArray.length;
        int n3 = 0;
        if (n3 < n2) {
            char c = cArray[n3];
            this.a(StringInvoker.a(c), d, d2, hb_2.a((long)n));
            d += StringPropertyInvoker.isMode(this.cz, ap1.bQ) ? (double)FontRendererInvoker.a(this.mc.fontRendererObj, c) : a7l_0.a(this.S(), c);
            n -= 120;
            ++n3;
        }
    }

    private static String b(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    public double b(int n) {
        HUD.j();
        return StringPropertyInvoker.isMode(this.cz, ap1.an) ? FontRendererInvoker.c(this.mc.fontRendererObj) : a7l_0.b(this.a(n));
    }

    private Boolean lambda$new$38() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bf)) && auk_2.a((Boolean)Ba.b(this.ay)));
    }

    private void lambda$null$116(String string, double d, double d2, int n) {
        HUD.j();
        if (StringPropertyInvoker.isMode(this.cz, ap1.dy)) {
            this.a(string, d + 0.5, d2 + db_0.b((Double)MD.b(this.aW)), n, false);
        }
        this.a(string, d, d2 + db_0.b((Double)MD.b(this.aW)), n, false);
    }

    private Boolean lambda$new$29() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bc)) && auk_2.a((Boolean)Ba.b(this.cE)) && (StringPropertyInvoker.isMode(this.O, ap1.ds) && auk_2.a((Boolean)Ba.b(this.bL)) || StringPropertyInvoker.isMode(this.O, ap1.Z) && (StringPropertyInvoker.isMode(this.bW, ap1.cn) && ava_0.b(this.cD, ap1.p) && (StringPropertyInvoker.isMode(this.bt, ap1.dq) || StringPropertyInvoker.isMode(this.bt, ap1.ee)) || StringPropertyInvoker.isMode(this.bW, ap1.ex) && StringPropertyInvoker.isMode(this.aY, ap1.cZ))));
    }

    @EventTarget
    private void d(Render2DEvent render2DEvent) {
        HUD.t();
        double d = ua_2.a(true);
        if (this.R()) {
            this.l(render2DEvent);
        }
        if (auk_2.a((Boolean)Ba.b(this.cV))) {
            this.a(render2DEvent);
        }
        if (auk_2.a((Boolean)Ba.b(this.cV)) && ava_0.b(this.aQ, ap1.F)) {
            this.c(render2DEvent);
        }
        if (auk_2.a((Boolean)Ba.b(this.cV)) && ava_0.b(this.aQ, ap1.aa)) {
            this.j(render2DEvent);
        }
        if (auk_2.a((Boolean)Ba.b(this.cV)) && ava_0.b(this.aQ, ap1.V)) {
            this.i(render2DEvent);
        }
        if (this.n()) {
            this.f(render2DEvent);
        }
        if (this.g()) {
            this.h(render2DEvent);
        }
        if (auk_2.a((Boolean)Ba.b(this.cV)) && ava_0.b(this.aQ, ap1.c0)) {
            this.e(render2DEvent);
        }
        if (auk_2.a((Boolean)Ba.b(this.cV)) && ava_0.b(this.aQ, ap1.bH)) {
            this.g(render2DEvent);
        }
        ua_2.a(d);
        if (auk_2.a((Boolean)Ba.b(this.Y))) {
            this.b(render2DEvent);
        }
        if (this.K()) {
            ua_2.a(true);
            this.k(render2DEvent);
            ua_2.a(d);
        }
    }

    public static boolean t() {
        return c0;
    }

    private Boolean lambda$new$35() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bf)) && auk_2.a((Boolean)Ba.b(this.ay)));
    }

    public double a(String string, int n, char c) {
        HUD.t();
        return StringPropertyInvoker.isMode(this.cz, ap1.r) ? (double)FontRendererInvoker.a(this.mc.fontRendererObj, c) : a7l_0.a(this.a(string, n), c);
    }

    private Boolean lambda$new$44() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bf)) && auk_2.a((Boolean)Ba.b(this.ay)));
    }

    private Boolean lambda$new$28() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bc)) && auk_2.a((Boolean)Ba.b(this.cE)) && StringPropertyInvoker.isMode(this.O, ap1.aX));
    }

    private Boolean lambda$new$94() {
        HUD.j();
        return auk_2.b(StringPropertyInvoker.isMode(this.bY, ap1.cv) && auk_2.a((Boolean)Ba.b(this.a5)) && StringPropertyInvoker.isMode(this.b7, ap1.aA));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @EventTarget
    public void a(SettingEvent settingEvent) {
        String string;
        long l4 = eb ^ 0x1CBBF8132141L;
        long l5 = l4 ^ 0x4AE91F2B5C18L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        HUD.t();
        aci_0.a(NovolineInvoker.i(this.novoline), new aus_0(this, 50, ag3_0.TICK));
        String string2 = string = afm_0.b(settingEvent);
        int n = -1;
        switch (string2.hashCode()) {
            case 1059843520: {
                if (!string2.equals(ap1.G)) return;
                n = 0;
            }
            case -1790138802: {
                if (!string2.equals(ap1.df)) return;
                n = 1;
            }
            case -1815976029: {
                if (!string2.equals(ap1.K)) return;
                return;
            }
        }
    }

    public StringProperty E() {
        return this.X;
    }

    public StringProperty k() {
        return this.b7;
    }

    @EventTarget
    public void a(aKp aKp2) {
        aff_2 aff_22;
        HUD.t();
        Iterator iterator = ListInvoker.iterator(this.cF);
        if (dz_0.c(iterator) && (GameSettingsInvoker.getKeyCode(aff_2.a(aff_22 = (aff_2)dz_0.b(iterator))) == -100 && ap2_0.a(aKp2) == 0 || GameSettingsInvoker.getKeyCode(aff_2.a(aff_22)) == -99 && ap2_0.a(aKp2) == 1)) {
            azf_2.a(aff_22);
        }
    }

    private static void lambda$null$114(double d, int n, double d2, double d3, double d4, int n2, int n3) {
        a1V.b(d + (double)n + 2.0 + d2, d3 - d4 + 1.0, d + (double)n + 3.5 + d2, d3 + (double)n2 + d4 - 1.0, n3);
    }

    private static boolean lambda$moduleListArea$104(AbstractModule abstractModule) {
        HUD.t();
        return _j_0.a(abstractModule.p()) > 0.0;
    }

    private static void lambda$drawMemory$141(int n, double d, int n2, long l4, long l5) {
        a1V.a((double)n + d / 2.0 + 0.25, (double)(n2 + 18), 0.0, 360.0 / (double)l4 * (double)l5, 13.25, 4.5f, 22L);
    }

    static {
        HUD.c(false);
        long l4 = eb ^ 0x3D3E35D314B6L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        int n = 2;
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l4 >>> 56);
        int n2 = 1;
        while (true) {
            byArray2 = byArray2;
            byArray2[n2] = (byte)(l4 << n2 * 8 >>> 56);
            ++n2;
        }
    }

    private Boolean lambda$new$9() {
        return auk_2.b(StringPropertyInvoker.isMode(this.X, ap1.ev));
    }

    private static void lambda$drawTPS$140(int n, double d, int n2, double d2) {
        a1V.a((double)n + d / 2.0 + 0.25, (double)(n2 + 18), 0.0, 18.0 * d2, 13.25, 4.5f, 22L);
    }

    private String c(a2l_0 a2l_02) {
        String string = this.e(a2l_02);
        String string2 = this.d(a2l_02);
        String string3 = this.a(a2l_02);
        return StringPropertyInvoker.isMode(this.cA, ap1.dw) ? aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), string), ap1.a), string2), ap1.eg), string3).toString() : aL0.a(aL0.a(aL0.a(new StringBuilder(), string), ap1.cF), string2).toString();
    }

    public IntProperty V() {
        return this.ct;
    }

    public void b(String string, double d, double d2, int n) {
        HUD.j();
        if (StringPropertyInvoker.isMode(this.cz, ap1.dU)) {
            this.mc.fontRendererObj.b(string, d - (double)this.g(string) * 0.5, d2, n, true);
        }
        if (auk_2.a((Boolean)Ba.b(this.cP))) {
            a7l_0.a(this.S(), (CharSequence)string, d - (double)this.g(string) * 0.5, d2, n, axx_1.a((Float)a9V.a(this.b6)));
        }
        a7l_0.b(this.S(), string, d - (double)this.g(string) * 0.5, d2, n, true);
    }

    public static FloatProperty C() {
        return aA;
    }

    private double[] a(int n, int n2) {
        List list = (List)aMF.a(aMF.b(ListInvoker.stream(this.bw), HUD::lambda$moduleListArea$104), aB0.a());
        int n3 = this.g(((AbstractModule)ListInvoker.get(list, 0)).b());
        HUD.t();
        double d = (double)n2 - db_0.b((Double)MD.b(this.cR)) / 2.0;
        double d2 = this.y();
        double d3 = (double)ListInvoker.size(list) * (d2 + db_0.b((Double)MD.b(this.cR)));
        double d4 = 0.0;
        double d5 = 0.0;
        double d6 = 0.0;
        double d7 = 0.0;
        boolean bl = StringPropertyInvoker.isMode(this.b4, ap1.ai);
        boolean bl2 = StringPropertyInvoker.isMode(this.bh, ap1.i);
        if (bl) {
            d4 = n - n3 - 4;
            if (bl2) {
                d5 = d - 2.5;
                d6 = (double)n + 4.5;
                d7 = d + d3 + 1.5;
            }
            d5 = d - d3 + d2 + db_0.b((Double)MD.b(this.cR)) - 2.5;
            d6 = (double)n + 4.5;
            d7 = d + d2 + db_0.b((Double)MD.b(this.cR)) + 1.5;
        }
        d4 = n - 4;
        if (bl2) {
            d5 = d - 2.5;
            d6 = (double)(n + n3) + 4.5;
            d7 = d + d3 + 1.5;
        }
        d5 = d - d3 + d2 + db_0.b((Double)MD.b(this.cR)) - 2.5;
        d6 = (double)(n + n3) + 4.5;
        d7 = d + d2 + db_0.b((Double)MD.b(this.cR)) + 1.5;
        return new double[]{d4, d5, d6, d7};
    }

    private Boolean lambda$new$7() {
        HUD.j();
        return auk_2.b(!StringPropertyInvoker.isMode(this.X, ap1.cD));
    }

    private void i(Render2DEvent render2DEvent) {
        ScaledResolution scaledResolution = uc_0.a(render2DEvent);
        HUD.j();
        int n = ScaledResolutionInvoker.a(scaledResolution);
        int n2 = ScaledResolutionInvoker.g(scaledResolution);
        String string = Protection.I;
        String string2 = this.f(Protection.q);
        String string3 = aL0.a(aL0.a(aL0.a(new StringBuilder(), NovolineInvoker.getVersion(this.novoline)), ap1.Q), NovolineInvoker.q(this.novoline) ? ap1.q : (NovolineInvoker.w(this.novoline) ? ap1.cP : ap1.db)).toString();
        String string4 = aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), string), ap1.dS), string2), ap1.ak), string3).toString();
        double d = this.g(string4) + 2;
        this.b(string4, (double)n - d, (double)(n2 - this.y()) - 1.5);
    }

    private Boolean lambda$new$100() {
        return (Boolean)Ba.b(this.bp);
    }

    private Boolean lambda$new$69() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.cV)) && auk_2.a((Boolean)Ba.b(this.ax)) && (ava_0.b(this.aQ, ap1.aq) || ava_0.b(this.aQ, ap1.cT)));
    }

    private static void lambda$null$128(AbstractModule abstractModule) {
        sj_1.a(abstractModule.s);
    }

    public StringProperty D() {
        return this.bg;
    }

    private Boolean lambda$new$11() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bc)) && auk_2.a((Boolean)Ba.b(this.cE)));
    }

    private Boolean lambda$new$22() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bc)) && auk_2.a((Boolean)Ba.b(this.cE)) && StringPropertyInvoker.isMode(this.O, ap1.cU) && (!StringPropertyInvoker.isMode(this.bt, ap1.ek) || StringPropertyInvoker.isMode(this.bW, ap1.ag)));
    }

    private void g(Render2DEvent render2DEvent) {
        cc.novoline.utils.fonts.api.FontRenderer fontRenderer = adj_1.a(pI.a, 17);
        long l4 = als_2.d(als_2.a());
        long l5 = als_2.b(als_2.a());
        long l6 = als_2.a(als_2.a());
        long l7 = l5 - l6;
        long l8 = this.a(l4);
        long l10 = this.a(l7);
        int n = P8.b((Integer)adt_2.a(this.cO));
        int n2 = P8.b((Integer)adt_2.a(this.ah));
        double d = 42.0;
        double d2 = 47.0;
        aV3.a(aV3.a(), (double)n, (double)n2, d, d2, 0.0, (double)P8.b((Integer)adt_2.a(this.cU)), new Color(0, 0, 0, P8.b((Integer)adt_2.a(this.cB))), true);
        a1V.a((double)n + d / 2.0 + 0.25, (double)(n2 + 18), 0.0, 360.0 / (double)l8 * (double)l10, 13.25, 4.5f, hb_2.a(0, 0, 0, 50));
        agg_2.a(agg_2.c(), 8, 280, true, () -> HUD.lambda$drawMemory$141(n, d, n2, l8, l10), null);
        a1V.a((double)n + d / 2.0 + 0.25, (double)(n2 + 18), 0.0, 360.0 / (double)l8 * (double)l10, 13.25, 4.5f, 22L);
        a7l_0.a(fontRenderer, (CharSequence)ap1.z, (double)n + d / 2.0, (double)(n2 + 16), 0xFFFFFF, true);
        String string = aL0.a(aL0.a(new StringBuilder(), MathHelper.a(100.0 / (double)l8 * (double)l10, 1)), ap1.at).toString();
        a7l_0.a(fontRenderer, (CharSequence)string, (double)n + d / 2.0, (double)n2 + 37.5, 0xFFFFFF, true);
    }

    private void lambda$drawName$137(String string, String string2, String string3, int n) {
        this.a(string, string2, string3, n);
    }

    private Boolean lambda$new$16() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bc)) && auk_2.a((Boolean)Ba.b(this.cE)) && !StringPropertyInvoker.isMode(this.O, ap1.bO));
    }

    private Boolean lambda$new$62() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.cV)) && auk_2.a((Boolean)Ba.b(this.ax)) && ava_0.b(this.aQ, ap1.bu));
    }

    private Boolean lambda$new$99() {
        return (Boolean)Ba.b(this.bp);
    }

    public void a(cc.novoline.utils.fonts.api.FontRenderer fontRenderer, String string, double d, double d2, int n, boolean bl) {
        HUD.j();
        if (StringPropertyInvoker.isMode(this.cz, ap1.a_)) {
            this.mc.fontRendererObj.b(string, d, d2, n, bl);
        }
        if (auk_2.a((Boolean)Ba.b(this.cP))) {
            a7l_0.a(fontRenderer, (CharSequence)string, d, d2, n, axx_1.a((Float)a9V.a(this.b6)));
        }
        a7l_0.b(fontRenderer, string, d, d2, n, bl);
    }

    private Boolean lambda$new$34() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bf)) && auk_2.a((Boolean)Ba.b(this.ay)));
    }

    private Boolean lambda$new$18() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bc)) && auk_2.a((Boolean)Ba.b(this.cE)) && auk_2.a((Boolean)Ba.b(this.aB)) && (!StringPropertyInvoker.isMode(this.O, ap1.c_) || ava_0.b(this.cy, ap1.co)));
    }

    private void h(Render2DEvent render2DEvent) {
        ListInvoker.forEach(this.cF, aff_2::b);
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x79BC;
        if (jb[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])kb.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                kb.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/aCp", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return jb[n2];
    }

    private Boolean lambda$new$101() {
        return (Boolean)Ba.b(this.bp);
    }

    private String b(AbstractModule abstractModule) {
        return abstractModule.x() ? ap1.eq : ap1.d_;
    }

    public double a(cc.novoline.utils.fonts.api.FontRenderer fontRenderer, char c) {
        HUD.j();
        return StringPropertyInvoker.isMode(this.cz, ap1.ap) ? (double)FontRendererInvoker.a(this.mc.fontRendererObj, c) : a7l_0.a(fontRenderer, c);
    }

    private void lambda$onBlur$111(a2l_0 a2l_02) {
        a1V.a(a2l_02.f, a2l_02.a, a2l_02.i - a2l_02.f, a2l_02.g - a2l_02.a, db_0.b((Double)MD.b(this.bV)) / 2.0, 1.0f, hb_2.a(asx_1.BLACK), 0);
    }

    private Boolean lambda$new$36() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bf)) && auk_2.a((Boolean)Ba.b(this.ay)));
    }

    private Boolean lambda$new$93() {
        HUD.j();
        return auk_2.b(StringPropertyInvoker.isMode(this.bY, ap1.bd) && auk_2.a((Boolean)Ba.b(this.a5)) && StringPropertyInvoker.isMode(this.b7, ap1.dH));
    }

    public String f(String string) {
        HUD.t();
        StringBuilder stringBuilder = new StringBuilder();
        int n = 0;
        if (n < 4 - StringInvoker.c(string)) {
            aL0.a(stringBuilder, ap1.dl);
            ++n;
        }
        aL0.a(stringBuilder, string);
        return stringBuilder.toString();
    }

    private Boolean lambda$new$80() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bN)) && auk_2.a((Boolean)Ba.b(this.a4)));
    }

    public void a(int n, String string, double d, double d2, int n2) {
        HUD.t();
        if (StringPropertyInvoker.isMode(this.cz, ap1.m)) {
            this.mc.fontRendererObj.b(string, d, d2, n2, true);
        }
        if (auk_2.a((Boolean)Ba.b(this.cP))) {
            a7l_0.a(this.a(n), (CharSequence)string, d, d2, n2, axx_1.a((Float)a9V.a(this.b6)));
        }
        a7l_0.b(this.a(n), string, d, d2, n2, true);
    }

    private Boolean lambda$new$88() {
        HUD.t();
        return auk_2.b(StringPropertyInvoker.isMode(this.co, ap1.el) && auk_2.a((Boolean)Ba.b(this.Y)) && auk_2.a((Boolean)Ba.b(this.cK)));
    }

    private Boolean lambda$new$64() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.cV)) && auk_2.a((Boolean)Ba.b(this.bU)) && auk_2.a((Boolean)Ba.b(this.ax)) && ava_0.b(this.aQ, ap1.c3));
    }

    private static void lambda$null$119(AbstractModule abstractModule) {
        abstractModule.a(() -> HUD.lambda$null$118(abstractModule));
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private void lambda$drawName$134(double d, double d2, double d3) {
        a1V.a(d, d2, this.a7, this.c2, d3, hb_2.a(asx_1.BLACK));
    }

    private static void lambda$null$121(AbstractModule abstractModule) {
        sj_1.a(abstractModule.s);
    }

    public int a(cc.novoline.utils.fonts.api.FontRenderer fontRenderer, String string) {
        HUD.t();
        return StringPropertyInvoker.isMode(this.cz, ap1.e) ? this.mc.fontRendererObj.a(string) : a7l_0.a(fontRenderer, string);
    }

    private Boolean lambda$new$87() {
        HUD.t();
        return auk_2.b(StringPropertyInvoker.isMode(this.co, ap1.P) && auk_2.a((Boolean)Ba.b(this.Y)) && auk_2.a((Boolean)Ba.b(this.cK)));
    }

    private void a(String string, double d, double d2) {
        char[] cArray = StringInvoker.f(string);
        int n = cArray.length;
        HUD.j();
        int n2 = 0;
        if (n2 < n) {
            char c = cArray[n2];
            this.mc.fontRendererObj.b(StringInvoker.a(c), d, d2, hb_2.a((long)this.cu), true);
            d += (double)FontRendererInvoker.a(this.mc.fontRendererObj, c);
            this.cu -= 120;
            ++n2;
        }
    }

    public IntProperty Q() {
        return this.ak;
    }

    private static void lambda$null$126(AbstractModule abstractModule) {
        sj_1.a(abstractModule.D);
    }

    public ListProperty<String> W() {
        return this.b2;
    }

    private String b(a2l_0 a2l_02) {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), this.e(a2l_02)), ap1.c8), this.d(a2l_02)), ap1.aT), this.a(a2l_02)).toString();
    }

    private Boolean lambda$new$32() {
        return (Boolean)Ba.b(this.bf);
    }

    public StringProperty I() {
        return this.bY;
    }

    private Boolean lambda$new$19() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bc)) && auk_2.a((Boolean)Ba.b(this.cE)) && StringPropertyInvoker.isMode(this.O, ap1.a8));
    }

    private Boolean lambda$new$41() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bf)) && auk_2.a((Boolean)Ba.b(this.ay)) && !StringPropertyInvoker.isMode(this.bs, ap1.eC));
    }

    private void a(boolean bl, Color color) {
        HUD.j();
        int n = P8.b((Integer)adt_2.a(this.a_));
        int n2 = P8.b((Integer)adt_2.a(this.be));
        List list = (List)aMF.a(aMF.b(ListInvoker.stream(this.N()), Objects::nonNull), aB0.a());
        if (!ListInvoker.isEmpty(list)) {
            if (StringPropertyInvoker.isMode(this.bX, ap1.ec)) {
                this.bq = n - 3;
                this.M = (double)n2 - 0.5;
                this.bH = (double)(n + 17 * ListInvoker.size(list)) + 1.5;
                this.aw = n2 + 27;
            }
            this.bq = (double)n - 2.5;
            this.M = (double)n2 - 0.5;
            this.bH = (double)n + 18.5;
            this.aw = (double)(n2 + 26 * ListInvoker.size(list)) + 1.5;
            if (auk_2.a((Boolean)Ba.b(this.b1))) {
                if (bl) {
                    aV3.a(aV3.a(), this.bq, this.M, this.bH - this.bq, this.aw - this.M, db_0.b((Double)MD.b(this.aH)), (double)P8.b((Integer)adt_2.a(this.cY)), color, true);
                }
                a1V.a(this.bq, this.M, this.bH - this.bq, this.aw - this.M, db_0.b((Double)MD.b(this.aH)) / 2.0, 1.0f, aol_1.b(color), 0);
            }
        }
    }

    private Boolean lambda$new$66() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.cV)) && auk_2.a((Boolean)Ba.b(this.bU)) && auk_2.a((Boolean)Ba.b(this.ax)) && ava_0.b(this.aQ, ap1.bL) && auk_2.a((Boolean)Ba.b(this.b1)));
    }

    private Boolean lambda$new$23() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bc)) && auk_2.a((Boolean)Ba.b(this.cE)) && StringPropertyInvoker.isMode(this.O, ap1.aL) && StringPropertyInvoker.isMode(this.bW, ap1.g) && StringPropertyInvoker.isMode(this.bt, ap1.bW));
    }

    public void a(cc.novoline.utils.fonts.api.FontRenderer fontRenderer, String string, double d, double d2, boolean bl, boolean bl2) {
        HUD.t();
        int n = 0;
        char[] cArray = StringInvoker.f(string);
        int n2 = cArray.length;
        int n3 = 0;
        if (n3 < n2) {
            char c = cArray[n3];
            this.a(fontRenderer, StringInvoker.a(c), d, d2, hb_2.a((long)n), bl);
            d += StringPropertyInvoker.isMode(this.cz, ap1.er) ? (double)FontRendererInvoker.a(this.mc.fontRendererObj, c) : a7l_0.a(fontRenderer, c);
            n -= 120;
            ++n3;
        }
    }

    private String e(a2l_0 a2l_02) {
        return I18n.format(Potion.potionTypes[a3M.b(a2l_02)].h(), new Object[0]);
    }

    @EventTarget
    public void a(KeyPressEvent keyPressEvent) {
        aff_2 aff_22;
        HUD.j();
        Iterator iterator = ListInvoker.iterator(this.cF);
        if (dz_0.c(iterator) && GameSettingsInvoker.getKeyCode(aff_2.a(aff_22 = (aff_2)dz_0.b(iterator))) == aO3.b(keyPressEvent)) {
            azf_2.a(aff_22);
        }
    }

    public void b(int n, String string, double d, double d2) {
        HUD.j();
        int n2 = 0;
        char[] cArray = StringInvoker.f(string);
        int n3 = cArray.length;
        int n4 = 0;
        if (n4 < n3) {
            char c = cArray[n4];
            this.a(n, StringInvoker.a(c), d, d2, hb_2.a((long)n2));
            d += StringPropertyInvoker.isMode(this.cz, ap1.ei) ? (double)FontRendererInvoker.a(this.mc.fontRendererObj, c) : a7l_0.a(this.a(n), c);
            n2 -= 120;
            ++n4;
        }
    }

    private Boolean lambda$new$98() {
        return (Boolean)Ba.b(this.bp);
    }

    private void f(Render2DEvent render2DEvent) {
        HUD.t();
        int n = P8.b((Integer)adt_2.a(this.c6));
        int n2 = P8.b((Integer)adt_2.a(this.ae));
        int n3 = this.c(18);
        this.a2 = n + this.x() + 37;
        this.by = n2 + ListInvoker.size(this.s()) * (n3 + 3);
        aV3.a(aV3.a(), (double)(n - 3), (double)n2 - 21.5, this.a2 - (double)n + 4.0, this.by - (double)n2 + 21.0, 0.0, (double)P8.b((Integer)adt_2.a(this.bI)), new Color(0, 0, 0, P8.b((Integer)adt_2.a(this.bB))), true);
        if (StringPropertyInvoker.isMode(this.ab, ap1.cA)) {
            a1V.b((double)(n + 1), (double)n2 - 5.5, this.a2 - 3.0, (double)(n2 - 4), hb_2.a(hb_2.a(asx_1.WHITE), 180));
        }
        int n4 = 0;
        double d = n + 1;
        if (d < this.a2 - 3.0) {
            a1V.b(d, (double)n2 - 5.5, d + 0.5, (double)(n2 - 4), hb_2.a(hb_2.a((long)n4), 180));
            n4 -= 15;
            d += 0.5;
        }
        String string = ap1.de;
        a7l_0.b(adj_1.a(us_2.a, 60), ap1.dz, n, (double)n2 - 24.5, 0xFFFFFF, true);
        this.a(21, string, (double)(n + 27), (double)n2 - ((StringPropertyInvoker.isMode(this.cz, ap1.d1) ? 8.0 : 9.5) + (double)n3), 0xFFFFFF);
        Iterator iterator = ListInvoker.iterator(this.s());
        if (dz_0.c(iterator)) {
            AbstractModule abstractModule = (AbstractModule)dz_0.b(iterator);
            this.a(18, this.c(abstractModule), (double)n, (double)n2, 0xFFFFFF);
            this.a(18, this.b(abstractModule), this.a2 - (double)this.a(18, this.b(abstractModule)) - 1.0, (double)n2, this.a(abstractModule));
            n2 += n3 + 3;
        }
    }

    public void a(cc.novoline.utils.fonts.api.FontRenderer fontRenderer, String string, double d, double d2, int n) {
        HUD.t();
        if (auk_2.a((Boolean)Ba.b(this.cP))) {
            a7l_0.a(fontRenderer, (CharSequence)string, d, d2, n, axx_1.a((Float)a9V.a(this.b6)));
        }
        a7l_0.b(fontRenderer, string, d, d2, n, true);
    }

    private Boolean lambda$new$73() {
        return (Boolean)Ba.b(this.an);
    }

    public cc.novoline.utils.fonts.api.FontRenderer a(String string) {
        return adj_1.a(this.h(string), P8.b((Integer)adt_2.a(this.bF)));
    }

    private Boolean lambda$new$60() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.cV)) && auk_2.a((Boolean)Ba.b(this.bj)) && auk_2.a((Boolean)Ba.b(this.ax)) && ava_0.b(this.aQ, ap1.bk));
    }

    public double a(char c) {
        HUD.j();
        return StringPropertyInvoker.isMode(this.cz, ap1.S) ? (double)FontRendererInvoker.a(this.mc.fontRendererObj, c) : a7l_0.a(this.S(), c);
    }

    private void lambda$drawName$136(cc.novoline.utils.fonts.api.FontRenderer fontRenderer, String string, double d, double d2, int n) {
        this.a(fontRenderer, string, d, d2, n, false);
    }

    public int y() {
        HUD.t();
        return StringPropertyInvoker.isMode(this.cz, ap1.cm) ? FontRendererInvoker.d(this.mc.fontRendererObj) : a7l_0.a(this.S());
    }

    public eu_0 B() {
        return this.cN;
    }

    private boolean R() {
        HUD.j();
        return auk_2.a((Boolean)Ba.b(this.bc)) && this.d(auk_2.a((Boolean)Ba.b(this.cf)));
    }

    private boolean a(int n, int n2, int n3, int n4) {
        double d = this.a(n, n2)[0];
        HUD.j();
        double d2 = this.a(n, n2)[1];
        double d3 = this.a(n, n2)[2];
        double d4 = this.a(n, n2)[3];
        return (double)n3 >= d && (double)n3 < d3 && (double)n4 >= d2 && (double)n4 < d4;
    }

    private Boolean lambda$new$50() {
        return (Boolean)Ba.b(this.cV);
    }

    private Boolean lambda$new$4() {
        HUD.t();
        return auk_2.b(!StringPropertyInvoker.isMode(this.cz, ap1.y));
    }

    public int a(int n, String string) {
        HUD.j();
        return StringPropertyInvoker.isMode(this.cz, ap1.cN) ? this.mc.fontRendererObj.a(string) : a7l_0.a(this.a(n), string);
    }

    private String c(AbstractModule abstractModule) {
        String string = abstractModule.t();
        String string2 = aL0.a(aL0.a(aL0.a(new StringBuilder(), ap1.cK), KeyboardInvoker.b(age_2.a((ae6_0)aoc_1.a(abstractModule.n())))), ap1.L).toString();
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), string), ap1.cj), string2).toString();
    }

    public void a(int n, String string, double d, double d2, int n2, boolean bl, boolean bl2) {
        HUD.j();
        if (StringPropertyInvoker.isMode(this.cz, ap1.ci)) {
            FontRendererInvoker.a(this.mc.fontRendererObj, string, (float)d, (float)d2, n2, bl);
        }
        if (auk_2.a((Boolean)Ba.b(this.cP))) {
            a7l_0.a(this.a(n), (CharSequence)string, d, d2, n2, axx_1.a((Float)a9V.a(this.b6)), bl2);
        }
        a7l_0.a(this.a(n), (CharSequence)string, d, d2, n2, bl, bl2);
    }

    private int x() {
        return this.a(18, this.c((AbstractModule)oc_1.b(aMF.c(ListInvoker.stream(this.s()), aN_.a(this::lambda$longestModuleInfo$139)))));
    }

    private Boolean lambda$new$10() {
        return (Boolean)Ba.b(this.bc);
    }

    private Boolean lambda$new$5() {
        HUD.t();
        return auk_2.b(!StringPropertyInvoker.isMode(this.cz, ap1.dE));
    }

    private void j(Render2DEvent render2DEvent) {
        int n = P8.b((Integer)adt_2.a(this.a_));
        HUD.t();
        int n2 = P8.b((Integer)adt_2.a(this.be));
        List list = (List)aMF.a(aMF.b(ListInvoker.stream(this.N()), Objects::nonNull), aB0.a());
        this.a(true, new Color(0, 0, 0, P8.b((Integer)adt_2.a(this.cX))));
        int n3 = 0;
        Iterator iterator = ListInvoker.iterator(list);
        if (dz_0.c(iterator)) {
            ItemStack itemStack = (ItemStack)dz_0.b(iterator);
            int n4 = hb_2.a((long)n3);
            a1V.a(itemStack, n, (float)n2);
            String string = this.a(itemStack);
            cc.novoline.utils.fonts.api.FontRenderer fontRenderer = adj_1.a(this.cT, 11);
            this.a(fontRenderer, string, (double)n + 7.5 - (double)(a7l_0.a(fontRenderer, string) / 2), (double)n2 + 18.5, n4);
            double d = 15.0 / (double)(act_2.q(itemStack) && itemStack.a > 1 ? 64 : act_2.u(itemStack)) * (double)P8.a(string);
            if (auk_2.a((Boolean)Ba.b(this.b1))) {
                a1V.b((double)n + 0.5, (double)(n2 + 23), (double)n + 15.5, (double)(n2 + 24), hb_2.a(asx_1.BLACK));
                a1V.b((double)n + 0.5, (double)(n2 + 23), (double)n + 0.5 + d, (double)(n2 + 24), n4);
            }
            if (StringPropertyInvoker.isMode(this.bX, ap1.T)) {
                n += 17;
            }
            n2 += 26;
            n3 -= 240;
        }
    }

    private Boolean lambda$new$78() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.an)) && auk_2.a((Boolean)Ba.b(this.as)));
    }

    public double a(cc.novoline.utils.fonts.api.FontRenderer fontRenderer) {
        HUD.j();
        return StringPropertyInvoker.isMode(this.cz, ap1.bp) ? FontRendererInvoker.c(this.mc.fontRendererObj) : a7l_0.b(fontRenderer);
    }

    private void a(String string, String string2, String string3, int n) {
        double d;
        HUD.j();
        this.cu = 0;
        if (StringPropertyInvoker.isMode(this.cz, ap1.k)) {
            d = db_0.b((Double)MD.b(this.cM));
            double d2 = 3.0 + d;
            double d3 = 3.0 + d;
            GL11.glPushMatrix();
            GL11.glTranslated((double)d2, (double)d3, (double)0.0);
            GL11.glScaled((double)d, (double)d, (double)d);
            GL11.glTranslated((double)(-d2), (double)(-d3), (double)0.0);
            this.a(string, d2, d3);
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            if (auk_2.a((Boolean)Ba.b(this.cc))) {
                this.a(string2, (d2 + (double)this.g(string) + 1.0) * 2.0, (d3 - 1.0) * 2.0);
            }
            if (auk_2.a((Boolean)Ba.b(this.aB))) {
                this.a(string3, (d2 + (double)this.g(string) + 1.0) * 2.0, (d3 - 1.0) * 2.0);
            }
            if (auk_2.a((Boolean)Ba.b(this.cc)) && auk_2.a((Boolean)Ba.b(this.aB))) {
                this.a(string3, (d2 + (double)this.g(string) + 1.0) * 2.0, (d3 + (double)this.y() * 0.5 - 0.5) * 2.0);
            }
            GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            GL11.glPopMatrix();
        }
        d = 1.5 - 0.06818181818181818 * (double)(40 - n);
        this.a(n, string, 3.0, d + (double)this.c(n) * 0.5 - 3.0);
        int n2 = n - 12;
        if (auk_2.a((Boolean)Ba.b(this.cc))) {
            this.a(n2, string2, (double)(4 + this.a(n, string)) + 1.0, 4.0);
        }
        if (auk_2.a((Boolean)Ba.b(this.aB))) {
            this.a(n2, string3, (double)(4 + this.a(n, string)) + 1.0, 4.0);
        }
        if (auk_2.a((Boolean)Ba.b(this.cc)) && auk_2.a((Boolean)Ba.b(this.aB))) {
            this.a(n2, string3, (double)(4 + this.a(n, string)) + 1.0, d + 4.0 + (double)this.c(n) * 0.5);
        }
    }

    private Boolean lambda$new$30() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bc)) && auk_2.a((Boolean)Ba.b(this.cE)) && (StringPropertyInvoker.isMode(this.O, ap1.H) && auk_2.a((Boolean)Ba.b(this.bL)) || StringPropertyInvoker.isMode(this.O, ap1.aO) && (StringPropertyInvoker.isMode(this.bW, ap1.cc) && ava_0.b(this.cD, ap1.cI) && (StringPropertyInvoker.isMode(this.bt, ap1.cW) || StringPropertyInvoker.isMode(this.bt, ap1.bl)) || StringPropertyInvoker.isMode(this.bW, ap1.ac) && StringPropertyInvoker.isMode(this.aY, ap1.bb))));
    }

    private Boolean lambda$new$56() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.cV)) && auk_2.a((Boolean)Ba.b(this.bj)) && auk_2.a((Boolean)Ba.b(this.ax)) && ava_0.b(this.aQ, ap1.dD) && StringPropertyInvoker.isMode(this.cA, ap1.cY));
    }

    private Boolean lambda$new$61() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.cV)) && auk_2.a((Boolean)Ba.b(this.bj)) && auk_2.a((Boolean)Ba.b(this.ax)) && ava_0.b(this.aQ, ap1.d8) && StringPropertyInvoker.isMode(this.cA, ap1.bG));
    }

    private void a(a2l_0 a2l_02, double d, double d2) {
        HUD.j();
        Potion potion = Potion.potionTypes[a3M.b(a2l_02)];
        if (ari_0.e(potion)) {
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            int n = ari_0.i(potion);
            TextureManagerInvoker.bindTexture(MCInvoker.E(this.mc), RK.ae);
            wh_1.a(d, d2, n % 8 * 18, 198 + n / 8 * 18, 18, 18);
        }
    }

    private String a(ItemStack itemStack) {
        int n;
        int n2;
        HUD.t();
        if (act_2.q(itemStack) && itemStack.a > 1) {
            n2 = itemStack.a;
        }
        if ((n = act_2.u(itemStack) - act_2.s(itemStack)) < 0) {
            n2 = 1;
        }
        n2 = n;
        return P8.g(n2);
    }

    private int lambda$getEffectList$143(a2l_0 a2l_02) {
        return this.g(this.c(a2l_02));
    }

    private Boolean lambda$new$74() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.an)) && auk_2.a((Boolean)Ba.b(this.as)));
    }

    public HUD(@NonNull short s, ModuleManager moduleManager, EnumModuleType enumModuleType, String string, int n, int n2) {
        long l4 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ eb;
        long l5 = l4 ^ 0x6A6DCEFB3091L;
        int n3 = (int)(l5 >>> 56);
        long l6 = l5 << 8 >>> 8;
        super((byte)n3, moduleManager, l6, enumModuleType, string);
        this.a9 = my_0.a(new ItemStack[]{new ItemStack(Items.diamond_sword), new ItemStack(Items.diamond_helmet), new ItemStack(Items.diamond_chestplate), new ItemStack(Items.diamond_leggings), new ItemStack(Items.diamond_boots)});
        this.bO = my_0.a(new a2l_0[]{new a2l_0(1, 4800), new a2l_0(10, 4800), new a2l_0(11, 4800), new a2l_0(12, 4800)});
        this.bQ = aj7.a(aj7.a());
        this.c1 = anv_0.a(this.bQ) * 0.5;
        this.cg = anv_0.b(this.bQ) * 0.5;
        this.cq = aL0.a(aL0.a(new StringBuilder(), NovolineInvoker.t(this.novoline)), (String)((Object)HUD.b("b", (int)32648, (long)(0x384193FCF19B111DL ^ l4)))).toString();
        this.b3 = VX.a;
        boolean bl = HUD.j();
        this.cp = ng_0.a;
        this.cT = pI.a;
        this.cj = pt_0.a;
        this.cx = is_1.a;
        this.cd = wb_0.a;
        this.c3 = aQ0.a;
        this.br = aFF.a;
        this.aO = aL_.a;
        this.bS = aRM.a;
        this.bA = ec_1.a;
        this.ar = q_0.a;
        this.bn = a7g_0.a;
        this.H = aZP.a;
        this.a6 = kb_0.a;
        this.aN = auc_2.a;
        this.bz = null;
        this.cz = StringPropertyInvoker.b(asp_2.a((String)((Object)HUD.b("b", (int)23530, (long)(0x706602F8218FB50DL ^ l4)))), new String[]{HUD.b("b", (int)25218, (long)(0x7AF3A9FDAB60DAEL ^ l4)), HUD.b("b", (int)9733, (long)(0x1C57DCFADE0AC801L ^ l4)), HUD.b("b", (int)9483, (long)(0x1E6EE44730BD4B44L ^ l4))});
        this.cP = asp_2.a(auk_2.b(false));
        this.b6 = (FloatProperty)a9V.a((FloatProperty)a9V.b(asp_2.a(axx_1.a(1.5f)), axx_1.a(0.5f)), axx_1.a(1.5f));
        this.bT = StringPropertyInvoker.b(asp_2.a((String)((Object)HUD.b("b", (int)18446, (long)(0x2601676512BCA61CL ^ l4)))), new String[]{HUD.b("b", (int)25558, (long)(0x613415DAF7728DE2L ^ l4)), HUD.b("b", (int)1240, (long)(0x5ACFC86BF2A46BDFL ^ l4)), HUD.b("b", (int)8866, (long)(0x64C4DF28C621CCB6L ^ l4)), HUD.b("b", (int)6597, (long)(0x2D9AC04B1C03F736L ^ l4)), HUD.b("b", (int)19681, (long)(0x20FCE57F4C282237L ^ l4))});
        this.b5 = StringPropertyInvoker.b(asp_2.a((String)((Object)HUD.b("b", (int)22589, (long)(0x2272E2A772E8364AL ^ l4)))), new String[]{HUD.b("b", (int)138, (long)(0x30F11F8D94396F84L ^ l4)), HUD.b("b", (int)8500, (long)(0x246DED91004E01L ^ l4)), HUD.b("b", (int)11811, (long)(0x30B81A7B1A3EC0F7L ^ l4))});
        this.bF = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(17)), P8.d(15)), P8.d(40));
        this.X = StringPropertyInvoker.b(asp_2.a((String)((Object)HUD.b("b", (int)5788, (long)(0x569B59B51D9CF88BL ^ l4)))), new String[]{HUD.b("b", (int)22090, (long)(0x70E33FB44E85384AL ^ l4)), HUD.b("b", (int)13856, (long)(0x2741E322D06DD841L ^ l4)), HUD.b("b", (int)11805, (long)(0x1B02370AC060C13FL ^ l4)), HUD.b("b", (int)6630, (long)(0xCFF2AFE408CF6D5L ^ l4)), HUD.b("b", (int)22654, (long)(0x63FBE07F7A7036BEL ^ l4))});
        this.aP = asp_2.b(P8.d(aol_1.b(new Color(0, 100, 255))));
        this.cN = asp_2.b(P8.d(aol_1.b(new Color(-13790475))));
        this.cW = asp_2.b(P8.d(aol_1.b(new Color(-3126795))));
        this.bc = asp_2.a(auk_2.b(true));
        this.Y = asp_2.a(auk_2.b(true));
        this.an = asp_2.a(auk_2.b(false));
        this.bN = asp_2.a(auk_2.b(false));
        this.bf = asp_2.a(auk_2.b(true));
        this.cV = asp_2.a(auk_2.b(true));
        this.a1 = asp_2.a((String)((Object)HUD.b("b", (int)6737, (long)(0x5BBD0D179F71743FL ^ l4))));
        this.cJ = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(5)), P8.d(1)), P8.d((int)this.c1));
        this.bx = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(6)), P8.d(1)), P8.d((int)this.cg));
        this.bJ = StringPropertyInvoker.b(asp_2.a((String)((Object)HUD.b("b", (int)22737, (long)(0x2A04982BBCB43647L ^ l4)))), new String[]{HUD.b("b", (int)8568, (long)(0x76904A3E34694F2DL ^ l4)), HUD.b("b", (int)7285, (long)(0x356078C30A9672CDL ^ l4)), HUD.b("b", (int)22410, (long)(0x78DA3CE95431B8AEL ^ l4))});
        this.bg = StringPropertyInvoker.b(asp_2.a((String)((Object)HUD.b("b", (int)2425, (long)(0x6EF14BE98CB8E778L ^ l4)))), new String[]{HUD.b("b", (int)23401, (long)(0x72B12C7634ADB586L ^ l4)), HUD.b("b", (int)2425, (long)(0x6EF14BE98CB8E778L ^ l4)), HUD.b("b", (int)185, (long)(0x74E349D3DF3CEEE9L ^ l4)), HUD.b("b", (int)23355, (long)(0x4A5715D1AF013541L ^ l4))});
        this.cR = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(4.5)), db_0.a(0.0)), db_0.a(7.0));
        this.aW = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(0.5)), db_0.a(0.0)), db_0.a(2.0));
        this.b4 = StringPropertyInvoker.b(asp_2.a((String)((Object)HUD.b("b", (int)23222, (long)(0x3EF483108AA23456L ^ l4)))), new String[]{HUD.b("b", (int)27138, (long)(0x475F11FD57FF04A3L ^ l4)), HUD.b("b", (int)10445, (long)(0x6A04442F68AA4615L ^ l4))});
        this.bh = StringPropertyInvoker.b(asp_2.a((String)((Object)HUD.b("b", (int)569, (long)(0x73C18D13B39D6C7FL ^ l4)))), new String[]{HUD.b("b", (int)19700, (long)(0x6EEB6B4A068DA3E5L ^ l4)), HUD.b("b", (int)23633, (long)(0x31C07C0906B43268L ^ l4))});
        this.bs = StringPropertyInvoker.b(asp_2.a((String)((Object)HUD.b("b", (int)10129, (long)(0x134160D97430C92FL ^ l4)))), new String[]{HUD.b("b", (int)18146, (long)(0x472C4D18B3F22881L ^ l4)), HUD.b("b", (int)2425, (long)(0x6EF14BE98CB8E778L ^ l4)), HUD.b("b", (int)18416, (long)(0x4B62E5156669A92EL ^ l4)), HUD.b("b", (int)7990, (long)(0x358B3558AAA0F1E7L ^ l4)), HUD.b("b", (int)14900, (long)(0x1665980780D0D4FAL ^ l4))});
        this.af = StringPropertyInvoker.b(asp_2.a((String)((Object)HUD.b("b", (int)17672, (long)(0x1AAD68D2EC2C2BFFL ^ l4)))), new String[]{HUD.b("b", (int)14664, (long)(0x4DB4CFBDC449D795L ^ l4)), HUD.b("b", (int)22981, (long)(0x658BCE8B1E7B37BAL ^ l4)), HUD.b("b", (int)10893, (long)(0x17119E6328CFC4F0L ^ l4))});
        this.K = StringPropertyInvoker.b(asp_2.a((String)((Object)HUD.b("b", (int)4475, (long)(0x53B55A7D39C7FCAL ^ l4)))), new String[]{HUD.b("b", (int)1428, (long)(0x79F41941BA1F6B14L ^ l4)), HUD.b("b", (int)6125, (long)(0x2D7A0FF8409278E5L ^ l4))});
        this.al = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(50)), P8.d(50)), P8.d(255));
        this.cG = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d((int)this.c1 - 6)), P8.d(1)), P8.d((int)this.c1));
        this.aR = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(12)), P8.d(1)), P8.d((int)this.cg));
        this.aQ = ava_0.a(asp_2.a(HUD.b("b", (int)22978, (long)(0x7387D3CF051337EDL ^ l4)), HUD.b("b", (int)8694, (long)(0x7D3FB2BE41D9CFF9L ^ l4))), new String[]{HUD.b("b", (int)26547, (long)(0x3FA12A5A25868957L ^ l4)), HUD.b("b", (int)2446, (long)(0x28CA3694CB10E700L ^ l4)), HUD.b("b", (int)14771, (long)(0x6323EBC909A0572BL ^ l4)), HUD.b("b", (int)22297, (long)(0x411D81A23147B801L ^ l4)), HUD.b("b", (int)18594, (long)(0xF3B8AA3223827A0L ^ l4)), HUD.b("b", (int)8642, (long)(0x253B8270E9FECF79L ^ l4)), HUD.b("b", (int)10196, (long)(0x57EFFF5534C84955L ^ l4)), HUD.b("b", (int)14477, (long)(0x5224F1D2B9535792L ^ l4)), HUD.b("b", (int)23840, (long)(0x1DF47BDD7AEE331BL ^ l4))});
        this.c5 = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(2.0)), db_0.a(0.0)), db_0.a(4.0));
        this.cn = StringPropertyInvoker.b(asp_2.a((String)((Object)HUD.b("b", (int)28400, (long)(0x31F0B56A9FE800E8L ^ l4)))), new String[]{HUD.b("b", (int)17545, (long)(0x4EF3FDA88A122A71L ^ l4)), HUD.b("b", (int)28400, (long)(0x31F0B56A9FE800E8L ^ l4))});
        this.ct = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(120)), P8.d(100)), P8.d(200));
        this.bo = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(0.0)), db_0.a(0.0)), db_0.a(10.0));
        this.W = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(4)), P8.d(0)), P8.d(10));
        this.ak = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(0)), P8.d(0)), P8.d(60));
        this.cr = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(100)), P8.d(100)), P8.d(300));
        this.cw = StringPropertyInvoker.b(asp_2.a((String)((Object)HUD.b("b", (int)18146, (long)(0x472C4D18B3F22881L ^ l4)))), new String[]{HUD.b("b", (int)18146, (long)(0x472C4D18B3F22881L ^ l4)), HUD.b("b", (int)20195, (long)(0x8FD59AD85F02068L ^ l4)), HUD.b("b", (int)24270, (long)(0x660C31C2793831F5L ^ l4))});
        this.c6 = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(10)), P8.d(1)), P8.d((int)this.c1));
        this.ae = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d((int)this.cg / 2)), P8.d(1)), P8.d((int)this.cg));
        this.ab = StringPropertyInvoker.b(asp_2.a((String)((Object)HUD.b("b", (int)2411, (long)(0x22E180D453E16679L ^ l4)))), new String[]{HUD.b("b", (int)28213, (long)(0x14FE2229D5070087L ^ l4)), HUD.b("b", (int)4944, (long)(0x43A9D2984D247D23L ^ l4))});
        this.bB = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(100)), P8.d(100)), P8.d(200));
        this.bI = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(2)), P8.d(0)), P8.d(16));
        this.ci = asp_2.c();
        this.N = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d((int)this.c1 / 4)), P8.d(1)), P8.d((int)this.c1));
        this.Q = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(30)), P8.d(1)), P8.d((int)this.cg));
        this.cC = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(100)), P8.d(100)), P8.d(200));
        this.bR = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(0.0)), db_0.a(0.0)), db_0.a(26.0));
        this.cv = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(2)), P8.d(0)), P8.d(8));
        this.Z = 26.0;
        this.cI = 28.0;
        this.a0 = 26.0;
        this.ag = new avj_2();
        this.ce = new avj_2();
        this.cf = asp_2.c();
        this.R = asp_2.c();
        this.ba = asp_2.c();
        this.bu = asp_2.c();
        this.am = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(250)), P8.d(1)), P8.d((int)this.c1));
        this.bd = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d((int)this.cg / 2)), P8.d(1)), P8.d((int)this.cg));
        this.cO = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(200)), P8.d(1)), P8.d((int)this.c1));
        this.ah = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d((int)this.cg / 2)), P8.d(1)), P8.d((int)this.cg));
        this.cB = (IntProperty)adt_2.c((IntProperty)adt_2.a(asp_2.a(P8.d(120)), P8.d(200)), P8.d(100));
        this.cU = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(2)), P8.d(1)), P8.d(16));
        this.co = StringPropertyInvoker.b(asp_2.a((String)((Object)HUD.b("b", (int)27537, (long)(0x27BF3DBDF13D0527L ^ l4)))), new String[]{HUD.b("b", (int)27896, (long)(0x35FF981FBBF82EEL ^ l4)), HUD.b("b", (int)2425, (long)(0x6EF14BE98CB8E778L ^ l4))});
        this.b7 = StringPropertyInvoker.b(asp_2.a((String)((Object)HUD.b("b", (int)2913, (long)(0x6BC0755D328FE5B3L ^ l4)))), new String[]{HUD.b("b", (int)22256, (long)(0x592340CEDE0339F0L ^ l4)), HUD.b("b", (int)2425, (long)(0x6EF14BE98CB8E778L ^ l4)), HUD.b("b", (int)19679, (long)(0x45195EFCB17522D5L ^ l4))});
        this.cS = StringPropertyInvoker.b(asp_2.a((String)((Object)HUD.b("b", (int)17704, (long)(0x13A8A4C1BA7B2BE3L ^ l4)))), new String[]{HUD.b("b", (int)23114, (long)(0x5A53133B09D8B4B5L ^ l4)), HUD.b("b", (int)28400, (long)(0x31F0B56A9FE800E8L ^ l4))});
        this.c4 = StringPropertyInvoker.b(asp_2.a((String)((Object)HUD.b("b", (int)20306, (long)(0x18F8F75BEB48A1B9L ^ l4)))), new String[]{HUD.b("b", (int)12111, (long)(0x171BE46180BB405AL ^ l4)), HUD.b("b", (int)20306, (long)(0x18F8F75BEB48A1B9L ^ l4))});
        this.bY = StringPropertyInvoker.b(asp_2.a((String)((Object)HUD.b("b", (int)23689, (long)(0x6C512C0F5753328BL ^ l4)))), new String[]{HUD.b("b", (int)14863, (long)(0x497F5D4FF6105525L ^ l4)), HUD.b("b", (int)23689, (long)(0x6C512C0F5753328BL ^ l4))});
        this.aM = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(150)), P8.d(50)), P8.d(200));
        this.b2 = ava_0.a(asp_2.a(HUD.b("b", (int)22148, (long)(0x231799AA944A38B4L ^ l4))), new String[]{HUD.b("b", (int)9986, (long)(0x21DE9FDD60FFC984L ^ l4)), HUD.b("b", (int)21379, (long)(0x2AECAA2F73953DEFL ^ l4))});
        this.L = asp_2.c();
        this.cZ = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(10)), P8.d(1)), P8.d((int)this.c1));
        this.c7 = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d((int)this.cg / 2)), P8.d(1)), P8.d((int)this.cg));
        this.cA = StringPropertyInvoker.b(asp_2.a((String)((Object)HUD.b("b", (int)2425, (long)(0x6EF14BE98CB8E778L ^ l4)))), new String[]{HUD.b("b", (int)2425, (long)(0x6EF14BE98CB8E778L ^ l4)), HUD.b("b", (int)27896, (long)(0x35FF981FBBF82EEL ^ l4))});
        this.aD = asp_2.d();
        this.bC = asp_2.d();
        this.ac = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(100)), P8.d(100)), P8.d(200));
        this.bV = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(0.0)), db_0.a(0.0)), db_0.a(16.0));
        this.bM = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(2)), P8.d(0)), P8.d(16));
        this.ao = asp_2.d();
        this.a_ = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d((int)this.c1 / 2)), P8.d(1)), P8.d((int)this.c1));
        this.be = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d((int)this.cg - 35)), P8.d(1)), P8.d((int)this.cg));
        this.bX = StringPropertyInvoker.b(asp_2.a((String)((Object)HUD.b("b", (int)14154, (long)(0x69095CE42FDE5846L ^ l4)))), new String[]{HUD.b("b", (int)14154, (long)(0x69095CE42FDE5846L ^ l4)), HUD.b("b", (int)16830, (long)(0x52C6478AC6D3AF0AL ^ l4))});
        this.b1 = asp_2.a(auk_2.b(true));
        this.cX = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(150)), P8.d(100)), P8.d(200));
        this.aH = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(0.0)), db_0.a(0.0)), db_0.a(12.0));
        this.cY = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(6)), P8.d(0)), P8.d(16));
        this.aZ = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(100)), P8.d(100)), P8.d(200));
        this.bl = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(2)), P8.d(0)), P8.d(8));
        this.cE = asp_2.d();
        this.ay = asp_2.d();
        this.ax = asp_2.d();
        this.bj = asp_2.d();
        this.bU = asp_2.d();
        this.ck = asp_2.d();
        this.cK = asp_2.d();
        this.a5 = asp_2.d();
        this.bp = asp_2.d();
        this.bP = asp_2.d();
        this.as = asp_2.d();
        this.a4 = asp_2.d();
        this.ch = asp_2.c();
        this.cl = asp_2.c();
        this.au = asp_2.c();
        this.aq = asp_2.c();
        this.cs = asp_2.c();
        this.cQ = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(0.5)), db_0.a(0.0)), db_0.a(3.0));
        this.I = ava_0.a(asp_2.a(HUD.b("b", (int)9986, (long)(0x21DE9FDD60FFC984L ^ l4))), new String[]{HUD.b("b", (int)29254, (long)(0x72B09F2296E61D68L ^ l4)), HUD.b("b", (int)9986, (long)(0x21DE9FDD60FFC984L ^ l4))});
        this.az = StringPropertyInvoker.b(asp_2.a((String)((Object)HUD.b("b", (int)7791, (long)(0x2D9C89C838F7F0C2L ^ l4)))), new String[]{HUD.b("b", (int)24253, (long)(0x2739D592714C30C3L ^ l4)), HUD.b("b", (int)1000, (long)(0x2BC0E396161DED15L ^ l4))});
        this.b0 = StringPropertyInvoker.b(asp_2.a((String)((Object)HUD.b("b", (int)10761, (long)(0x2DB779C7E291C4DEL ^ l4)))), new String[]{HUD.b("b", (int)31692, (long)(0x2B91CE3A27AC95DCL ^ l4)), HUD.b("b", (int)6943, (long)(0x3BD75B4B7DC7F5D7L ^ l4))});
        this.cb = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(5)), P8.d(5)), P8.d(25));
        this.bE = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(180)), P8.d(50)), P8.d(255));
        this.ad = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(22)), P8.d(18)), P8.d(40));
        this.cM = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(1.0)), db_0.a(1.0)), db_0.a(3.0));
        this.O = StringPropertyInvoker.b(asp_2.a((String)((Object)HUD.b("b", (int)9000, (long)(0x4BBB8AD561944C3BL ^ l4)))), new String[]{HUD.b("b", (int)2425, (long)(0x6EF14BE98CB8E778L ^ l4)), HUD.b("b", (int)22256, (long)(0x592340CEDE0339F0L ^ l4)), HUD.b("b", (int)15352, (long)(0x2E4D6D57A92E55F5L ^ l4))});
        this.cc = asp_2.a(auk_2.b(true));
        this.aB = asp_2.a(auk_2.b(true));
        this.bK = StringPropertyInvoker.b(asp_2.a((String)((Object)HUD.b("b", (int)16162, (long)(0x29DB8B0E1EF7D1C8L ^ l4)))), new String[]{HUD.b("b", (int)11321, (long)(0x5C3EA0D7F13AC256L ^ l4)), HUD.b("b", (int)8788, (long)(0x5C29BA6CE1ED4D55L ^ l4)), HUD.b("b", (int)15619, (long)(0x14FE1354A252D23BL ^ l4)), HUD.b("b", (int)7189, (long)(0x4E115E8C8116F270L ^ l4))});
        this.bL = asp_2.c();
        this.b8 = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(12)), P8.d(5)), P8.d(20));
        this.bb = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(160)), P8.d(50)), P8.d(255));
        this.S = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(6.0)), db_0.a(0.0)), db_0.a(this.c1));
        this.a3 = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(6.0)), db_0.a(0.0)), db_0.a(this.cg));
        this.cy = ava_0.a(asp_2.a(new String[]{HUD.b("b", (int)17975, (long)(0x1FF38C3C041FA8ECL ^ l4)), HUD.b("b", (int)7643, (long)(0x50AD64ACD6C2F341L ^ l4)), HUD.b("b", (int)3106, (long)(0x1F573FF57645633FL ^ l4)), HUD.b("b", (int)11164, (long)(0x63C74AE982B5449FL ^ l4))}), new String[]{HUD.b("b", (int)16997, (long)(0x7A107ABE3E512C17L ^ l4)), HUD.b("b", (int)11009, (long)(0x19096B389F9B4578L ^ l4)), HUD.b("b", (int)28727, (long)(0x3BDB5A7CB20E1EB8L ^ l4)), HUD.b("b", (int)3106, (long)(0x1F573FF57645633FL ^ l4)), HUD.b("b", (int)13175, (long)(0x276EF6F010FCDC52L ^ l4)), HUD.b("b", (int)14445, (long)(0x1D9EB6D09BD4563EL ^ l4))});
        this.bW = StringPropertyInvoker.b(asp_2.a((String)((Object)HUD.b("b", (int)19988, (long)(0x6307E95F256BA03CL ^ l4)))), new String[]{HUD.b("b", (int)2425, (long)(0x6EF14BE98CB8E778L ^ l4)), HUD.b("b", (int)5096, (long)(0x4645320061FFFD01L ^ l4))});
        this.bt = StringPropertyInvoker.b(asp_2.a((String)((Object)HUD.b("b", (int)2425, (long)(0x6EF14BE98CB8E778L ^ l4)))), new String[]{HUD.b("b", (int)22069, (long)(0x75363E515D0B38DDL ^ l4)), HUD.b("b", (int)2425, (long)(0x6EF14BE98CB8E778L ^ l4)), HUD.b("b", (int)14750, (long)(0x54CFCEE3D39FD7C2L ^ l4))});
        this.aI = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(180)), P8.d(50)), P8.d(255));
        this.aT = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(0)), P8.d(0)), P8.d(12));
        this.aL = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(6)), P8.d(0)), P8.d(12));
        this.aK = (FloatProperty)a9V.a((FloatProperty)a9V.b(asp_2.a(axx_1.a(2.0f)), axx_1.a(2.0f)), axx_1.a(4.0f));
        this.cD = ava_0.a(asp_2.a(HUD.b("b", (int)11455, (long)(0x78F10600EB12C232L ^ l4))), new String[]{HUD.b("b", (int)9986, (long)(0x21DE9FDD60FFC984L ^ l4)), HUD.b("b", (int)11455, (long)(0x78F10600EB12C232L ^ l4))});
        this.bZ = StringPropertyInvoker.b(asp_2.a((String)((Object)HUD.b("b", (int)28213, (long)(0x14FE2229D5070087L ^ l4)))), new String[]{HUD.b("b", (int)28213, (long)(0x14FE2229D5070087L ^ l4)), HUD.b("b", (int)20306, (long)(0x18F8F75BEB48A1B9L ^ l4))});
        this.aY = StringPropertyInvoker.b(asp_2.a((String)((Object)HUD.b("b", (int)19882, (long)(0x9C265626BFA281L ^ l4)))), new String[]{HUD.b("b", (int)11455, (long)(0x78F10600EB12C232L ^ l4)), HUD.b("b", (int)17452, (long)(0x39DD0FCBE2082A47L ^ l4)), HUD.b("b", (int)18146, (long)(0x472C4D18B3F22881L ^ l4))});
        this.b9 = new TimerUtil();
        this.bw = new ArrayList<AbstractModule>();
        this.J = my_0.a(new a5P[]{new a5P(this, 0), new a5P(this, 1), new a5P(this, 2), new a5P(this, 3), new a5P(this, 4), new a5P(this, 5), new a5P(this, 6), new a5P(this, 7), new a5P(this, 8)});
        this.cF = new ArrayList<aff_2>();
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)1322, (long)(0x4E63576D6F02EA1CL ^ l4))), (String)((Object)HUD.b("b", (int)1298, (long)(0x5CD62D8A09DFEA0EL ^ l4))), SettingType.BUTTON, (AbstractModule)this, this::lambda$new$0));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)28783, (long)(0x73D47B4794BA9E13L ^ l4))), (String)((Object)HUD.b("b", (int)736, (long)(0x420CCA1425BBEDC3L ^ l4))), SettingType.SEPARATOR, this));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)15808, (long)(0x7E876EF7F984D325L ^ l4))), (String)((Object)HUD.b("b", (int)2530, (long)(0x7A0FF5FACBE7E7D8L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.cz));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)16305, (long)(0x384236C22A89D10BL ^ l4))), (String)((Object)HUD.b("b", (int)6740, (long)(0x3524565D3D30F475L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.bT, this::lambda$new$1));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)14356, (long)(0x23329CEA4E62D6C7L ^ l4))), (String)((Object)HUD.b("b", (int)1315, (long)(0x7D589D08A71D6BE1L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.b5, this::lambda$new$2));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)18195, (long)(0x47DF52DEFAF9A9C3L ^ l4))), (String)((Object)HUD.b("b", (int)3208, (long)(0x531CD2B565E2620AL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.bF, 1.0, this::lambda$new$3));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)15002, (long)(0x114E51E11C9CD426L ^ l4))), (String)((Object)HUD.b("b", (int)31741, (long)(0x3DC78E15439D1527L ^ l4))), SettingType.SLIDER, (AbstractModule)this, aA, 0.1, this::lambda$new$4));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)16976, (long)(0x45E456C64C68AC2BL ^ l4))), (String)((Object)HUD.b("b", (int)4951, (long)(0x7B7CCF93538AFD2FL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.cP, this::lambda$new$5));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)30600, (long)(0x47EAADE701E099F8L ^ l4))), (String)((Object)HUD.b("b", (int)11472, (long)(0x113E86438234C2E1L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.b6, 0.1, this::lambda$new$6));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)5718, (long)(0x71D0AA69D84F84BL ^ l4))), (String)((Object)HUD.b("b", (int)9842, (long)(0x7D263441589848FEL ^ l4))), SettingType.SEPARATOR, this));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)10096, (long)(0x6D56CE73C136493BL ^ l4))), (String)((Object)HUD.b("b", (int)2830, (long)(0x6A343146C75165A2L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.X));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)29896, (long)(0x57B322C7C4989A8CL ^ l4))), (String)((Object)HUD.b("b", (int)26105, (long)(0x76D28E8496F30B66L ^ l4))), SettingType.COLOR_PICKER, (AbstractModule)this, this.aP, null, this::lambda$new$7));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)22257, (long)(0x7E230B3D1699B8A7L ^ l4))), (String)((Object)HUD.b("b", (int)4423, (long)(0x17DF7919C36E7FB2L ^ l4))), SettingType.COLOR_PICKER, (AbstractModule)this, this.cN, null, this::lambda$new$8));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)7858, (long)(0x37D06076F87C707BL ^ l4))), (String)((Object)HUD.b("b", (int)28068, (long)(0x47CA02B3F30D828CL ^ l4))), SettingType.COLOR_PICKER, (AbstractModule)this, this.cW, null, this::lambda$new$9));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)8196, (long)(0x4FE83F0607684E46L ^ l4))), (String)((Object)HUD.b("b", (int)12091, (long)(0x7AD1999803604159L ^ l4))), SettingType.SEPARATOR, this));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)32018, (long)(0x7CF1F46CB0593E4L ^ l4))), (String)((Object)HUD.b("b", (int)7786, (long)(0x1054093D4C1CF173L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.bc));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)27600, (long)(0x6C2DB0E07D0484FFL ^ l4))), (String)((Object)HUD.b("b", (int)10990, (long)(0x4AB6CE6B1538C4A4L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.Y));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)640, (long)(0x2EFE4645AAE46C2BL ^ l4))), (String)((Object)HUD.b("b", (int)1838, (long)(0x56C2939732DCE814L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.an));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)3014, (long)(0x158A3BB9E95E65A2L ^ l4))), (String)((Object)HUD.b("b", (int)22451, (long)(0x42333F816A773943L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.bN));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)12207, (long)(0x42BA227E9A6B4163L ^ l4))), (String)((Object)HUD.b("b", (int)30597, (long)(0x403C923353C81912L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.bf));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)27114, (long)(0x2CFB1EEFB73B87D8L ^ l4))), (String)((Object)HUD.b("b", (int)21503, (long)(0x52905F3D56FABD01L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.cV));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)2126, (long)(0x3630C3500933E6A2L ^ l4))), (String)((Object)HUD.b("b", (int)13305, (long)(0x6B52C1B8AB95DD02L ^ l4))), this, this.cE, this::lambda$new$10));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)21362, (long)(0x54D1C294916BBDABL ^ l4))), (String)((Object)HUD.b("b", (int)1333, (long)(0x6D3374FDDA27EB82L ^ l4))), SettingType.TEXTBOX, (AbstractModule)this, (String)((Object)HUD.b("b", (int)32334, (long)(0x57D4EE3E7F329141L ^ l4))), this.a1, this::lambda$new$11));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)16690, (long)(0x188C7147F3652F66L ^ l4))), (String)((Object)HUD.b("b", (int)31147, (long)(0x5DB474E6D8AD16B0L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.ad, 2.0, this::lambda$new$12));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)8518, (long)(0x5CFDD160B2904FE9L ^ l4))), (String)((Object)HUD.b("b", (int)25501, (long)(0x687EA72149E30CADL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.cM, 0.5, this::lambda$new$13));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)11116, (long)(0x704C8CCC01FA451DL ^ l4))), (String)((Object)HUD.b("b", (int)4180, (long)(0x3A4E547019F9FF74L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.O, this::lambda$new$14));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)12956, (long)(0x2A3FAED4BBA35CBAL ^ l4))), (String)((Object)HUD.b("b", (int)1905, (long)(0x19923883DE4F69D8L ^ l4))), SettingType.SELECTBOX, (AbstractModule)this, this.cy, this::lambda$new$15));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)21756, (long)(0x1D34A930E369BA23L ^ l4))), (String)((Object)HUD.b("b", (int)25992, (long)(0x2A55948904168B13L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.cc, this::lambda$new$16));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)24664, (long)(0x77A439DC249F0F6AL ^ l4))), (String)((Object)HUD.b("b", (int)20796, (long)(0x481A223ECC1C3FE0L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.aB, this::lambda$new$17));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)25962, (long)(0x55962DFC7FD50B41L ^ l4))), (String)((Object)HUD.b("b", (int)13442, (long)(0x58B1B9C77D54DAB5L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.bK, this::lambda$new$18));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)27503, (long)(0xD14E1DCB54E0548L ^ l4))), (String)((Object)HUD.b("b", (int)1264, (long)(0x2A5E20475E37EABEL ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.bW, this::lambda$new$19));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)20371, (long)(0x125D70583A29A1CCL ^ l4))), (String)((Object)HUD.b("b", (int)31134, (long)(0x1887F01219B797B3L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.bt, this::lambda$new$20));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)17075, (long)(0x57DC32E1F47F2C0CL ^ l4))), (String)((Object)HUD.b("b", (int)10092, (long)(0x6A93F8884BA5C9F2L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.aI, 5.0, this::lambda$new$21));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)27541, (long)(0x1884C74C263705C7L ^ l4))), (String)((Object)HUD.b("b", (int)22963, (long)(0x41A791726E19B68FL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.aT, 1.0, this::lambda$new$22));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)30772, (long)(0x5BA5D3F66AFD9602L ^ l4))), (String)((Object)HUD.b("b", (int)22121, (long)(0xD8980B61E70382EL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.aK, 0.1, this::lambda$new$23));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)12281, (long)(0x24D7A8EBCA2F41DBL ^ l4))), (String)((Object)HUD.b("b", (int)25950, (long)(0x6662409BEEA28B34L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.aL, 1.0, this::lambda$new$24));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)6421, (long)(0x1031C42087F2F729L ^ l4))), (String)((Object)HUD.b("b", (int)29974, (long)(0xF89AA27E3719A1FL ^ l4))), SettingType.SELECTBOX, (AbstractModule)this, this.cD, this::lambda$new$25));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)7620, (long)(0x6210B3A71D59F3E4L ^ l4))), (String)((Object)HUD.b("b", (int)31398, (long)(0x174367E0A71D94B5L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.bZ, this::lambda$new$26));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)25695, (long)(0x4CF46F7B9E1E8AC6L ^ l4))), (String)((Object)HUD.b("b", (int)27477, (long)(0x2AF4029B303E853DL ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.aY, this::lambda$new$27));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)25016, (long)(0x124A0B8D4B030F1BL ^ l4))), (String)((Object)HUD.b("b", (int)11455, (long)(0x78F10600EB12C232L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.bL, this::lambda$new$28));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)5922, (long)(0x4B279F3FF2F962L ^ l4))), (String)((Object)HUD.b("b", (int)12019, (long)(0x682D48F92B254053L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.b8, 1.0, this::lambda$new$29));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)17947, (long)(0x53865FDE9B3A815L ^ l4))), (String)((Object)HUD.b("b", (int)19846, (long)(0x454F23B00E0DA39CL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.bb, 5.0, this::lambda$new$30));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)7049, (long)(0x62767507C996751BL ^ l4))), (String)((Object)HUD.b("b", (int)24350, (long)(0x50E4C1300A6EB18EL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.cf, this::lambda$new$31));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)20238, (long)(0x5E62939B433D2159L ^ l4))), (String)((Object)HUD.b("b", (int)30757, (long)(0x51419F6E26779609L ^ l4))), this, this.ay, this::lambda$new$32));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)15893, (long)(0x33F33F05BC5FD0E9L ^ l4))), (String)((Object)HUD.b("b", (int)18290, (long)(0x4D981D13EC452874L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.bJ, this::lambda$new$33));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)12857, (long)(0x1A6E7F18916DDCBDL ^ l4))), (String)((Object)HUD.b("b", (int)2649, (long)(0x6A80792A7FB7656DL ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.bg, this::lambda$new$34));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)4706, (long)(0x31E1C9541E357CAFL ^ l4))), (String)((Object)HUD.b("b", (int)26096, (long)(0x7C9DC73A8F1B0B13L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.cR, 0.5, this::lambda$new$35));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)16395, (long)(0x1EC61AE8F3862F3AL ^ l4))), (String)((Object)HUD.b("b", (int)5101, (long)(0x386091E5E33EFD84L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.aW, 0.05, this::lambda$new$36));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)29182, (long)(0x702ABDD22EAD9EE9L ^ l4))), (String)((Object)HUD.b("b", (int)19138, (long)(0x1AD9969A814248FL ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.b4, this::lambda$new$37));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)16095, (long)(0x11258B743864507BL ^ l4))), (String)((Object)HUD.b("b", (int)10668, (long)(0x61D3AD3BC2A2476FL ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.bh, this::lambda$new$38));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)13721, (long)(0x51C60C22617DBEDL ^ l4))), (String)((Object)HUD.b("b", (int)29854, (long)(0x2BBE0EC25D131AF3L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.bs, this::lambda$new$39));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)23668, (long)(0x51343E31A9163241L ^ l4))), (String)((Object)HUD.b("b", (int)7132, (long)(0x663FCBF05875F5E2L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.af, this::lambda$new$40));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)22938, (long)(0x23670B92F0A9B7A7L ^ l4))), (String)((Object)HUD.b("b", (int)10325, (long)(0x64CC88CDE300C614L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.K, this::lambda$new$41));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)18117, (long)(0x2F311954C805280AL ^ l4))), (String)((Object)HUD.b("b", (int)4241, (long)(0x7F2F7E173482FE57L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.cQ, 0.1, this::lambda$new$42));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)10436, (long)(0x940B9AAFBC947F9L ^ l4))), (String)((Object)HUD.b("b", (int)21399, (long)(0x3241253C8D9FBDF0L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.al, 5.0, this::lambda$new$43));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)25810, (long)(0x11C59FD04AFC0BC8L ^ l4))), (String)((Object)HUD.b("b", (int)19853, (long)(0x8776ECABDECA2B3L ^ l4))), SettingType.SELECTBOX, (AbstractModule)this, this.I, this::lambda$new$44));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)23106, (long)(0x50D931094DAB453L ^ l4))), (String)((Object)HUD.b("b", (int)7420, (long)(0x1C619CE89D33F2ADL ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.az, this::lambda$new$45));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)26791, (long)(0x469EAF9E17D086BCL ^ l4))), (String)((Object)HUD.b("b", (int)18913, (long)(0x5627FFC204E9A6D8L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.b0, this::lambda$new$46));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)25648, (long)(0x5BAAECFF35B38A36L ^ l4))), (String)((Object)HUD.b("b", (int)17124, (long)(0x63ACC1ADB8D62DE0L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.cb, 1.0, this::lambda$new$47));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)22403, (long)(0x351D413044643965L ^ l4))), (String)((Object)HUD.b("b", (int)3565, (long)(0x13A64A905AD8E329L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.bE, 5.0, this::lambda$new$48));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)27602, (long)(0x6A6A69F71773857CL ^ l4))), (String)((Object)HUD.b("b", (int)7620, (long)(0x33F85E7722BD73C7L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.R, this::lambda$new$49));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)5655, (long)(0x47C696009421F854L ^ l4))), (String)((Object)HUD.b("b", (int)29391, (long)(0x7198C67190C31C95L ^ l4))), this, this.ax, this::lambda$new$50));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)13667, (long)(0x6BBE25A74C685B16L ^ l4))), (String)((Object)HUD.b("b", (int)3859, (long)(0x27B9A66A89DDE1B6L ^ l4))), SettingType.SELECTBOX, (AbstractModule)this, this.aQ, this::lambda$new$51));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)17155, (long)(0x169BF8F880252D30L ^ l4))), (String)((Object)HUD.b("b", (int)17182, (long)(0x2B2E774904582D19L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.c5, 0.1, this::lambda$new$52));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)30404, (long)(0x749CE25F94C4184DL ^ l4))), (String)((Object)HUD.b("b", (int)31502, (long)(0x40A7A2150F7F150BL ^ l4))), this, this.bj, this::lambda$new$53));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)19111, (long)(0x6E24CE72B493243BL ^ l4))), (String)((Object)HUD.b("b", (int)30801, (long)(0x3AA7DF7817631777L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.cA, this::lambda$new$54));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)8774, (long)(0x1540C05D9C6E4CB2L ^ l4))), (String)((Object)HUD.b("b", (int)4673, (long)(0x7EEA245728497CEBL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.bC, this::lambda$new$55));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)23057, (long)(0x551015492A183449L ^ l4))), (String)((Object)HUD.b("b", (int)1000, (long)(0x2BC0E396161DED15L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.aD, this::lambda$new$56));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)7797, (long)(0x46849AC5BE2770C5L ^ l4))), (String)((Object)HUD.b("b", (int)26811, (long)(0x54E2467535A7861DL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.ac, 5.0, this::lambda$new$57));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)27001, (long)(0x5103FC942CF087C4L ^ l4))), (String)((Object)HUD.b("b", (int)6010, (long)(0x6A686FD189CDF96FL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.bV, 1.0, this::lambda$new$58));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)5491, (long)(0x12B9DB4DB287B56L ^ l4))), (String)((Object)HUD.b("b", (int)29420, (long)(0x4B8C0EE6CA861C15L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.bM, 1.0, this::lambda$new$59));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)17146, (long)(0x36964BE99768ADF0L ^ l4))), (String)((Object)HUD.b("b", (int)5690, (long)(0x35878D94F06CF8CBL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.ao, this::lambda$new$60));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)12097, (long)(0xF2ED016549041E9L ^ l4))), (String)((Object)HUD.b("b", (int)9986, (long)(0x21DE9FDD60FFC984L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.aq, this::lambda$new$61));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)32646, (long)(0x22E54C8955121105L ^ l4))), (String)((Object)HUD.b("b", (int)4758, (long)(0x1B330659E0DC7C05L ^ l4))), this, this.bU, this::lambda$new$62));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)26185, (long)(0x6B8C769E9F0408EEL ^ l4))), (String)((Object)HUD.b("b", (int)10826, (long)(0x13D2EDCF2880C55AL ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.bX, this::lambda$new$63));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)22485, (long)(0x7FBFEBEF6E9DB941L ^ l4))), (String)((Object)HUD.b("b", (int)1000, (long)(0x2BC0E396161DED15L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.b1, this::lambda$new$64));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)20907, (long)(0xC7E2013BCC63F82L ^ l4))), (String)((Object)HUD.b("b", (int)25982, (long)(0x55E13B4D69320B75L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.cX, 5.0, this::lambda$new$65));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)23071, (long)(0x35F12C6CF5683528L ^ l4))), (String)((Object)HUD.b("b", (int)6010, (long)(0x6A686FD189CDF96FL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.aH, 1.0, this::lambda$new$66));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)11985, (long)(0x4CEC3245C25EC1F0L ^ l4))), (String)((Object)HUD.b("b", (int)29420, (long)(0x4B8C0EE6CA861C15L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.cY, 1.0, this::lambda$new$67));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)8066, (long)(0x720B2154BC0CF1C7L ^ l4))), (String)((Object)HUD.b("b", (int)9986, (long)(0x21DE9FDD60FFC984L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.cs, this::lambda$new$68));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)14871, (long)(0x707E6749BA3DD44AL ^ l4))), (String)((Object)HUD.b("b", (int)9883, (long)(0x1174B18E102FC8C5L ^ l4))), this, this.ck, this::lambda$new$69));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)10174, (long)(0x39BF8F2938594990L ^ l4))), (String)((Object)HUD.b("b", (int)25982, (long)(0x55E13B4D69320B75L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.cB, 5.0, this::lambda$new$70));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)24436, (long)(0x1FB25761DBDF316DL ^ l4))), (String)((Object)HUD.b("b", (int)29420, (long)(0x4B8C0EE6CA861C15L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.cU, 1.0, this::lambda$new$71));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)27256, (long)(0x590BEAD70E8884C1L ^ l4))), (String)((Object)HUD.b("b", (int)9986, (long)(0x21DE9FDD60FFC984L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.au, this::lambda$new$72));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)32706, (long)(0x6E78959A58771177L ^ l4))), (String)((Object)HUD.b("b", (int)2644, (long)(0x3F112EBA1AEEE4BAL ^ l4))), this, this.as, this::lambda$new$73));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)14646, (long)(0x73CEE2187271D709L ^ l4))), (String)((Object)HUD.b("b", (int)30089, (long)(0x213E2EFD9A7E9B0EL ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.ab, this::lambda$new$74));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)27296, (long)(0x6BB494A8E6F84A9L ^ l4))), (String)((Object)HUD.b("b", (int)25982, (long)(0x55E13B4D69320B75L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.bB, 5.0, this::lambda$new$75));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)4169, (long)(0x65FF9EC18ABE7F76L ^ l4))), (String)((Object)HUD.b("b", (int)29420, (long)(0x4B8C0EE6CA861C15L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.bI, 1.0, this::lambda$new$76));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)28074, (long)(0x6487ADB32BD303E2L ^ l4))), (String)((Object)HUD.b("b", (int)9986, (long)(0x21DE9FDD60FFC984L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.ci, this::lambda$new$77));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)29985, (long)(0x58D2DBE1FDBE9BEBL ^ l4))), (String)((Object)HUD.b("b", (int)7620, (long)(0x33F85E7722BD73C7L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.ba, this::lambda$new$78));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)10343, (long)(0x484D146B7232C6FAL ^ l4))), (String)((Object)HUD.b("b", (int)23083, (long)(0x7AC42046EA8BB437L ^ l4))), this, this.a4, this::lambda$new$79));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)29646, (long)(0x33DCC7605C4C1CD0L ^ l4))), (String)((Object)HUD.b("b", (int)25982, (long)(0x55E13B4D69320B75L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.cC, 5.0, this::lambda$new$80));
        boolean bl2 = bl;
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)24427, (long)(0x6B2346750AED31C9L ^ l4))), (String)((Object)HUD.b("b", (int)6010, (long)(0x6A686FD189CDF96FL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.bR, 1.0, this::lambda$new$81));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)27833, (long)(0x7FD8A275ECEF0243L ^ l4))), (String)((Object)HUD.b("b", (int)29420, (long)(0x4B8C0EE6CA861C15L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.cv, 1.0, this::lambda$new$82));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)20413, (long)(0x3270B288B0B721A3L ^ l4))), (String)((Object)HUD.b("b", (int)7620, (long)(0x33F85E7722BD73C7L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.bu, this::lambda$new$83));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)6883, (long)(0x213335A32839F4FCL ^ l4))), (String)((Object)HUD.b("b", (int)9986, (long)(0x21DE9FDD60FFC984L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.ch, this::lambda$new$84));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)28830, (long)(0x2D3992AC8E7B9E96L ^ l4))), (String)((Object)HUD.b("b", (int)22589, (long)(0x7FBB8FDD72D361EL ^ l4))), this, this.cK, this::lambda$new$85));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)5061, (long)(0x412F096FA3EA7DA5L ^ l4))), (String)((Object)HUD.b("b", (int)30801, (long)(0x3AA7DF7817631777L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.co, this::lambda$new$86));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)8714, (long)(0x44C6690292F74D27L ^ l4))), (String)((Object)HUD.b("b", (int)25982, (long)(0x55E13B4D69320B75L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.aZ, 5.0, this::lambda$new$87));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)22860, (long)(0x10DB434000293665L ^ l4))), (String)((Object)HUD.b("b", (int)29420, (long)(0x4B8C0EE6CA861C15L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.bl, 1.0, this::lambda$new$88));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)4137, (long)(0x53F8ACFBE26FE5FL ^ l4))), (String)((Object)HUD.b("b", (int)9986, (long)(0x21DE9FDD60FFC984L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.cl, this::lambda$new$89));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)20490, (long)(0x62E082959AB13EE8L ^ l4))), (String)((Object)HUD.b("b", (int)18479, (long)(0x3E46FA0EB1B5A674L ^ l4))), this, this.a5));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)18641, (long)(0x3EE9CFBF6C1E2623L ^ l4))), (String)((Object)HUD.b("b", (int)30801, (long)(0x3AA7DF7817631777L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.b7, this.a5::get));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)6709, (long)(0x203A9E08AADAF53EL ^ l4))), (String)((Object)HUD.b("b", (int)2530, (long)(0x7A0FF5FACBE7E7D8L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.cS, this::lambda$new$90));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)29921, (long)(0x6A27BCD85ECD9A24L ^ l4))), (String)((Object)HUD.b("b", (int)13793, (long)(0x1FB83B79795A5BA8L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.c4, this::lambda$new$91));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)7763, (long)(0x266435390AF0F06BL ^ l4))), (String)((Object)HUD.b("b", (int)28034, (long)(0x40762DC2F0888307L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.bY, this::lambda$new$92));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)31808, (long)(0x1D6C3BCF91F924CL ^ l4))), (String)((Object)HUD.b("b", (int)25982, (long)(0x55E13B4D69320B75L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.aM, 5.0, this::lambda$new$93));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)951, (long)(0x22621F03D3546CBAL ^ l4))), (String)((Object)HUD.b("b", (int)19853, (long)(0x8776ECABDECA2B3L ^ l4))), SettingType.SELECTBOX, (AbstractModule)this, this.b2, this::lambda$new$94));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)26167, (long)(0x3C9C475991008BDL ^ l4))), (String)((Object)HUD.b("b", (int)11369, (long)(0x237C305F8AD2C225L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.L, this::lambda$new$95));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)20243, (long)(0x19BAA3A1D736214AL ^ l4))), (String)((Object)HUD.b("b", (int)14525, (long)(0x7C0A8A7797D357B8L ^ l4))), this, this.bp));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)7678, (long)(0x5BBE73D37A817398L ^ l4))), (String)((Object)HUD.b("b", (int)2530, (long)(0x7A0FF5FACBE7E7D8L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.cn, this::lambda$new$96));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)21114, (long)(0x253D5C2990E63CF2L ^ l4))), (String)((Object)HUD.b("b", (int)25982, (long)(0x55E13B4D69320B75L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.ct, 5.0, this::lambda$new$97));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)20416, (long)(0x3915181587B02101L ^ l4))), (String)((Object)HUD.b("b", (int)8921, (long)(0x7F853DC91CECCF3L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.bo, 1.0, this::lambda$new$98));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)14189, (long)(0x68EE607CAB0FD9B8L ^ l4))), (String)((Object)HUD.b("b", (int)29420, (long)(0x4B8C0EE6CA861C15L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.W, 1.0, this::lambda$new$99));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)21114, (long)(0x253D5C2990E63CF2L ^ l4))), (String)((Object)HUD.b("b", (int)9571, (long)(0x1F802A06B47FCA75L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.ak, 1.0, this::lambda$new$100));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)19299, (long)(0x4199DF70BBCB258EL ^ l4))), (String)((Object)HUD.b("b", (int)30034, (long)(0x176A3887EF419A46L ^ l4))), SettingType.SLIDER, this, this.cr, 5.0, (String)((Object)HUD.b("b", (int)8103, (long)(0x1193B2D89D50F183L ^ l4))), this::lambda$new$101));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)12048, (long)(0x65D041E1B04D41A3L ^ l4))), (String)((Object)HUD.b("b", (int)14575, (long)(0x4CEB251A6840567EL ^ l4))), this, this.bP));
        ManagerInvoker.put(new Setting((String)((Object)HUD.b("b", (int)11377, (long)(0x2CF1C264C84D42B6L ^ l4))), (String)((Object)HUD.b("b", (int)5582, (long)(0x7C42582EB7E47B2FL ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.cw, this::lambda$new$102));
        if (aev_1.b(da_0.a(this.cq, new String[0]), new LinkOption[0])) {
            try {
                Iterator iterator = ListInvoker.iterator(aev_1.c(da_0.a(this.cq, new String[0])));
                while (dz_0.c(iterator)) {
                    String string2 = (String)dz_0.b(iterator);
                    this.e(string2);
                    if (bl2 && bl2) continue;
                    break;
                }
            }
            catch (IOException iOException) {
                a4E.b(iOException);
            }
        }
    }

    private Boolean lambda$new$59() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.cV)) && auk_2.a((Boolean)Ba.b(this.bj)) && auk_2.a((Boolean)Ba.b(this.ax)) && ava_0.b(this.aQ, ap1.b8) && StringPropertyInvoker.isMode(this.cA, ap1.aY) && auk_2.a((Boolean)Ba.b(this.aD)));
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = HUD.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private int lambda$getEffectList$142(a2l_0 a2l_02) {
        return this.g(this.c(a2l_02));
    }

    private Boolean lambda$new$53() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.cV)) && auk_2.a((Boolean)Ba.b(this.ax)) && ava_0.b(this.aQ, ap1.b2));
    }

    private String U() {
        HUD.t();
        StringInvoker.a((String)StringPropertyInvoker.b(this.bK), (CharSequence)ap1.aM);
        StringInvoker.a((String)StringPropertyInvoker.b(this.bK), (CharSequence)ap1.aK);
        String string = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), ap1.O), ap1.dW), ap1.d), ap1.c9).toString();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(string);
        return aZ2.a(simpleDateFormat, lx_2.b(SystemInvoker.f()));
    }

    private void a(FontRenderer fontRenderer, String string, double d, double d2, int n, double d3, boolean bl) {
        GL11.glPushMatrix();
        GL11.glTranslated((double)d, (double)d2, (double)0.0);
        GL11.glScaled((double)d3, (double)d3, (double)1.0);
        GL11.glTranslated((double)(-d), (double)(-d2), (double)0.0);
        FontRendererInvoker.a(fontRenderer, string, (float)d, (float)d2, n, bl);
        GL11.glPopMatrix();
    }

    private static boolean lambda$getModuleList$105(ClickGui clickGui, AbstractModule abstractModule) {
        HUD.j();
        return abstractModule != clickGui && !abstractModule.k();
    }

    public void b(double d) {
        this.T = NovolineInvoker.w(this.novoline) ? 0.0 : d;
    }

    public FontFamily M() {
        return this.bz;
    }

    private int p() {
        HUD.j();
        ArrayList arrayList = new ArrayList(PlayerInvoker.E(this.mc.player));
        a2l_0 a2l_02 = (a2l_0)oc_1.b(aMF.c(ListInvoker.stream(arrayList), aN_.a(this::lambda$getLongestEffectWidth$144)));
        return StringPropertyInvoker.isMode(this.cA, ap1.E) ? this.a(19, this.b(a2l_02)) : this.a(19, aL0.a(aL0.a(aL0.a(new StringBuilder(), this.e(a2l_02)), ap1.d2), this.d(a2l_02)).toString()) + (auk_2.a((Boolean)Ba.b(this.bC)) ? 20 : 0);
    }

    private Boolean lambda$new$49() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bf)) && auk_2.a((Boolean)Ba.b(this.ay)));
    }

    public int b(cc.novoline.utils.fonts.api.FontRenderer fontRenderer) {
        HUD.j();
        return StringPropertyInvoker.isMode(this.cz, ap1.dp) ? FontRendererInvoker.d(this.mc.fontRendererObj) : a7l_0.a(fontRenderer);
    }

    /*
     * Exception decompiling
     */
    private FontFamily c() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$TooOptimisticMatchException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.getString(SwitchStringRewriter.java:404)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.access$600(SwitchStringRewriter.java:53)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$SwitchStringMatchResultCollector.collectMatches(SwitchStringRewriter.java:368)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.KleeneN.match(KleeneN.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.MatchSequence.match(MatchSequence.java:26)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:23)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewriteComplex(SwitchStringRewriter.java:201)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewrite(SwitchStringRewriter.java:73)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:881)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private void e(Render2DEvent render2DEvent) {
        cc.novoline.utils.fonts.api.FontRenderer fontRenderer = adj_1.a(pI.a, 17);
        ClickGui clickGui = (ClickGui)ModuleInvoker.isEnable(ModuleRegistry.CLICKGUI);
        double d = z4_0.j(clickGui);
        int n = P8.b((Integer)adt_2.a(this.am));
        int n2 = P8.b((Integer)adt_2.a(this.bd));
        double d2 = 42.0;
        double d3 = 47.0;
        aV3.a(aV3.a(), n, n2, d2, d3, P8.b((Integer)adt_2.a(this.cU)), new Color(0, 0, 0, P8.b((Integer)adt_2.a(this.cB))), true);
        a1V.a((double)n + d2 / 2.0 + 0.25, (double)(n2 + 18), 0.0, 360.0, 13.25, 4.5f, hb_2.a(0, 0, 0, 50));
        agg_2.a(agg_2.c(), 8, 280, true, () -> HUD.lambda$drawTPS$140(n, d2, n2, d), null);
        a1V.a((double)n + d2 / 2.0 + 0.25, (double)(n2 + 18), 0.0, 18.0 * d, 13.25, 4.5f, 22L);
        a7l_0.a(fontRenderer, (CharSequence)ap1.d7, (double)n + d2 / 2.0, (double)(n2 + 16), 0xFFFFFF, true);
        String string = aL0.a(aL0.a(new StringBuilder(), MathHelper.a(5.0 * d, 1)), ap1.cl).toString();
        a7l_0.a(fontRenderer, (CharSequence)string, (double)n + d2 / 2.0, (double)n2 + 37.5, 0xFFFFFF, true);
    }

    public void a(int n, String string, String string2, double d, double d2, int n2, boolean bl) {
        HUD.j();
        if (StringPropertyInvoker.isMode(this.cz, ap1.bn)) {
            FontRendererInvoker.a(this.mc.fontRendererObj, string2, d - (double)this.g(string2) * 0.5, d2, n2, bl);
        }
        if (auk_2.a((Boolean)Ba.b(this.cP))) {
            a7l_0.a(this.a(string, n), (CharSequence)string2, d - (double)(this.a(string, n, string2) / 2), d2, n2, axx_1.a((Float)a9V.a(this.b6)));
        }
        a7l_0.b(this.a(string, n), string2, d - (double)(this.a(string, n, string2) / 2), d2, n2, bl);
    }

    private Boolean lambda$new$86() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.Y)) && auk_2.a((Boolean)Ba.b(this.cK)));
    }

    private List<a2l_0> P() {
        HUD.t();
        if (this.mc.currentScreen instanceof GuiChat) {
            if (auk_2.a((Boolean)Ba.b(this.ao))) {
                return this.a((List)aMF.a(aMF.a(ListInvoker.stream(this.bO), aN_.a(this::lambda$getEffectList$142)), aB0.a()));
            }
            return this.bO;
        }
        ArrayList<a2l_0> arrayList = new ArrayList<a2l_0>(PlayerInvoker.E(this.mc.player));
        if (auk_2.a((Boolean)Ba.b(this.ao))) {
            List list = (List)aMF.a(aMF.a(ListInvoker.stream(arrayList), aN_.a(this::lambda$getEffectList$143)), aB0.a());
            asg_0.e(list);
            return list;
        }
        return arrayList;
    }

    private void lambda$new$0(String string) {
        MCInvoker.displayGuiScreen(this.mc, new rj_0());
    }

    private Boolean lambda$new$25() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bc)) && auk_2.a((Boolean)Ba.b(this.cE)) && StringPropertyInvoker.isMode(this.O, ap1.c6) && StringPropertyInvoker.isMode(this.bW, ap1.as));
    }

    private int a(AbstractModule abstractModule) {
        HUD.t();
        return abstractModule.x() ? hb_2.a(asx_1.WHITE) : hb_2.a(asx_1.GREY, 0.65);
    }

    private Boolean lambda$new$91() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.a5)) && (StringPropertyInvoker.isMode(this.b7, ap1.aG) || StringPropertyInvoker.isMode(this.b7, ap1.eo)));
    }

    private Boolean lambda$new$21() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bc)) && auk_2.a((Boolean)Ba.b(this.cE)) && StringPropertyInvoker.isMode(this.O, ap1.ca));
    }

    private Boolean lambda$new$95() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.a5)) && (StringPropertyInvoker.isMode(this.b7, ap1.aW) || StringPropertyInvoker.isMode(this.b7, ap1.ej)));
    }

    public int g(String string) {
        HUD.t();
        return StringPropertyInvoker.isMode(this.cz, ap1.aI) ? this.mc.fontRendererObj.a(string) : a7l_0.a(this.S(), string);
    }

    public IntProperty o() {
        return this.aM;
    }

    private static void lambda$null$132(AbstractModule abstractModule) {
        abstractModule.a(() -> HUD.lambda$null$131(abstractModule));
    }

    public void a(cc.novoline.utils.fonts.api.FontRenderer fontRenderer, String string, double d, double d2, int n, boolean bl, boolean bl2) {
        HUD.t();
        if (StringPropertyInvoker.isMode(this.cz, ap1.a1)) {
            this.mc.fontRendererObj.b(string, d, d2, n, bl);
        }
        if (auk_2.a((Boolean)Ba.b(this.cP))) {
            a7l_0.a(fontRenderer, (CharSequence)string, d, d2, n, axx_1.a((Float)a9V.a(this.b6)), bl2);
        }
        a7l_0.a(fontRenderer, (CharSequence)string, d, d2, n, bl, bl2);
    }

    private Boolean lambda$new$46() {
        HUD.t();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bf)) && auk_2.a((Boolean)Ba.b(this.ay)) && ava_0.b(this.I, ap1.dI) && !StringPropertyInvoker.isMode(this.az, ap1.b7) && !StringPropertyInvoker.isMode(this.bs, ap1.aU));
    }

    private List a(List list) {
        asg_0.e(list);
        return list;
    }

    private Boolean lambda$new$39() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.bf)) && auk_2.a((Boolean)Ba.b(this.ay)));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(HUD.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


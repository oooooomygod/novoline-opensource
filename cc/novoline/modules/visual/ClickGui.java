/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.http.HttpResponse
 *  org.apache.http.client.methods.CloseableHttpResponse
 *  org.apache.http.client.methods.HttpGet
 *  org.apache.http.client.methods.HttpUriRequest
 *  org.apache.http.impl.client.CloseableHttpClient
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.json.JSONObject
 *  org.lwjgl.LWJGLException
 *  org.lwjgl.opengl.DisplayMode
 */
package cc.novoline.modules.visual;

import cc.novoline.Initializer;
import cc.novoline.events.EventTarget;
import cc.novoline.events.State;
import cc.novoline.events.events.IRCMessageEvent;
import cc.novoline.events.events.LoadWorldEvent;
import cc.novoline.events.events.PacketEvent;
import cc.novoline.events.events.PlayerUpdateEvent;
import cc.novoline.events.events.Render2DEvent;
import cc.novoline.events.events.SettingEvent;
import cc.novoline.events.events.ShaderEvent;
import cc.novoline.events.events.SpawnCheckEvent;
import cc.novoline.events.events.TickUpdateEvent;
import cc.novoline.gui.screen.ClickGUI;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.DisplayInvoker;
import cc.novoline.invoke.EventManagerInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.IOUtilsInvoker;
import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.NotificationManagerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.PacketEventInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.invoke.SystemInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.combat.Criticals;
import cc.novoline.modules.configurations.annotation.Property;
import cc.novoline.modules.exploits.Blink;
import cc.novoline.modules.exploits.Disabler;
import cc.novoline.modules.exploits.NoFall;
import cc.novoline.modules.player.Scaffold;
import cc.novoline.modules.move.Speed;
import cc.novoline.modules.move.Step;
import cc.novoline.modules.move.WaterWalk;
import cc.novoline.modules.player.AutoArmor;
import cc.novoline.modules.player.InvManager;
import cc.novoline.utils.fonts.api.FontRenderer;
import deobf.*;
import net.minecraft.network.packts.C01PacketChatMessage;
import net.minecraft.network.packts.C03PacketPlayer;
import net.minecraft.network.packts.S00PacketKeepAlive;
import net.minecraft.network.packts.S01PacketJoinGame;
import net.minecraft.network.packts.S02PacketChat;
import net.minecraft.network.packts.S02PacketLoginSuccess;
import net.minecraft.network.packts.S03PacketTimeUpdate;
import net.minecraft.network.packts.S12PacketEntityVelocity;
import net.minecraft.network.packts.S2DPacketOpenWindow;
import net.minecraft.network.packts.S2EPacketCloseWindow;
import net.minecraft.network.packts.S2FPacketSetSlot;
import net.minecraft.network.packts.S3DPacketDisplayScoreboard;
import net.minecraft.network.packts.S45PacketTitle;
import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.Minecraft;
import net.Ba;
import net.BedBreaker;
import net.BooleanProperty;
import net.CE;
import net.ChestStealer;
import net.DoubleProperty;
import net.GameSpeed;
import net.I_;
import net.KN;
import net.KillAura;
import net.Ln;
import net.LongJump;
import net.MD;
import net.ModuleManager;
import net.NoSlow;
import net.Notification;
import net.NotificationType;
import net.OF;
import net.P8;
import net.Q2;
import net.R1;
import net.GuiChat;
import net.ScaledResolution;
import net.StringProperty;
import net.TargetStrafe;
import net.V9;
import net.Velocity;
import net.W_;
import net.Y2;
import net._j_0;
import net.a13;
import net.a1V;
import net.a1c;
import net.a4E;
import net.a7l_0;
import net.a8F;
import net.aBO;
import net.aCM;
import net.aDM;
import net.aFW;
import net.aGR;
import net.aL0;
import net.aQI;
import net.aSK;
import net.aUC;
import net.aUJ;
import net.aU_;
import net.aXI;
import net.aYC;
import net.aYL;
import net.aZ2;
import net.aZ9;
import net.aZR;
import net.abb_2;
import net.acf_2;
import net.aci_0;
import net.aco_0;
import net.act_2;
import net.ad8_0;
import net.adj_1;
import net.adt_2;
import net.ag3_0;
import net.aj7;
import net.ake_2;
import net.akr_1;
import net.anf_2;
import net.anv_0;
import net.aod_2;
import net.aol_1;
import net.aq3_0;
import net.asp_2;
import net.asx_1;
import net.atz_0;
import net.auk_2;
import net.ava_0;
import net.avj_1;
import net.avs_1;
import net.c__0;
import net.cw_2;
import net.db_0;
import net.dz_0;
import net.eu_0;
import net.hb_2;
import net.li_2;
import net.lx_2;
import net.ms_0;
import net.nr_0;
import net.o_0;
import net.pI;
import net.pR;
import net.qh_1;
import net.rj_0;
import net.ty_2;
import net.uc_0;
import net.ue_2;
import net.xx_1;
import net.xz_0;
import net.yd_2;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.json.JSONObject;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.DisplayMode;


public class ClickGui
extends AbstractModule {
    private static Map ib;
    private TimerUtil az;
    private int J;
    @Property(value="crystal-gui-pos-y")
    private IntProperty X;
    @Property(value="open-animation")
    private StringProperty ay;
    @Property(value="close_previous")
    private BooleanProperty al;
    private int ag;
    private boolean af;
    private String M;
    @Property(value="dpi-scale-crystal")
    private DoubleProperty ad;
    @Property(value="color-crystal")
    private eu_0 aB;
    private int N;
    private static int V;
    private TimerUtil S;
    private int aF;
    private static String[] cb;
    private int U;
    @Property(value="dropdown-transparecny")
    private IntProperty ac;
    @Property(value="dpi_scale")
    private DoubleProperty Y;
    @Property(value="razer_fanboy")
    private BooleanProperty am;
    private long Z;
    private TimerUtil av;
    private String ab;
    private long P;
    private double ao;
    private int au;
    private Q2 ax;
    private static long bb;
    private boolean ai;
    private Dimension at;
    private TimerUtil I;
    private int O;
    private boolean L;
    @Property(value="blur")
    private BooleanProperty an;
    private TimerUtil aj;
    private double aE;
    @Property(value="crystal-gui-pos-x")
    private IntProperty aq;
    @Property(value="shadow-effect-crystal")
    private BooleanProperty ae;
    @Property(value="dropdown-design")
    private StringProperty R;
    private TimerUtil Q;
    private int H;
    private int aC;
    private Initializer ar;
    private abb_2 as;
    private int aD;
    private int ah;
    @Property(value="mode")
    private StringProperty aA;
    private String aw;
    @Property(value="dsv")
    private BooleanProperty K;
    @Property(value="crystal-gui-height")
    private DoubleProperty ak;
    private ArrayList<Long> aa;
    private int T;
    @Property(value="crystal-gui-current-tab")
    private StringProperty W;
    private static String[] eb;
    @Property(value="crystal-gui-width")
    private DoubleProperty ap;

    public BooleanProperty d() {
        return this.al;
    }

    private Boolean lambda$new$10() {
        return auk_2.b(StringPropertyInvoker.isMode(this.aA, ake_2.C));
    }

    private Boolean lambda$new$12() {
        return auk_2.b(StringPropertyInvoker.isMode(this.aA, ake_2.aB));
    }

    private void lambda$new$11(String string) {
        HUD.j();
        if (NovolineInvoker.e(this.novoline) != null) {
            ClickGUI clickGUI = NovolineInvoker.e(this.novoline);
            Iterator iterator = ListInvoker.iterator(KN.b(clickGUI));
            if (dz_0.c(iterator)) {
                aq3_0 aq3_02 = (aq3_0)dz_0.b(iterator);
                if (a13.b(aq3_02) == EnumModuleType.COMBAT) {
                    a13.b(aq3_02, clickGUI.D[0] - 65);
                    a13.a(aq3_02, clickGUI.D[1] - 100);
                }
                if (a13.b(aq3_02) == EnumModuleType.MISC) {
                    a13.b(aq3_02, clickGUI.w[0] - 65);
                    a13.a(aq3_02, clickGUI.w[1] - 100);
                }
                if (a13.b(aq3_02) == EnumModuleType.EXPLOITS) {
                    a13.b(aq3_02, clickGUI.A[0] - 65);
                    a13.a(aq3_02, clickGUI.A[1] - 100);
                }
                if (a13.b(aq3_02) == EnumModuleType.MOVEMENT) {
                    a13.b(aq3_02, clickGUI.C[0] - 65);
                    a13.a(aq3_02, clickGUI.C[1] - 100);
                }
                if (a13.b(aq3_02) == EnumModuleType.PLAYER) {
                    a13.b(aq3_02, clickGUI.G[0] - 65);
                    a13.a(aq3_02, clickGUI.G[1] - 100);
                }
                if (a13.b(aq3_02) == EnumModuleType.VISUALS) {
                    a13.b(aq3_02, clickGUI.E[0] - 65);
                    a13.a(aq3_02, clickGUI.E[1] - 100);
                }
            }
            I_.b(KN.e(clickGUI), clickGUI.z[0] - 65);
            I_.a(KN.e(clickGUI), clickGUI.z[1] - 70);
            acf_2.a(KN.c(clickGUI), clickGUI.F[0] - 65);
            acf_2.b(KN.c(clickGUI), clickGUI.F[1] - 80);
        }
    }

    public StringProperty q() {
        return this.W;
    }

    @EventTarget
    public void a(ShaderEvent shaderEvent) {
        Iterator iterator;
        HUD.t();
        HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        if (StringPropertyInvoker.isMode(cw_2.f(hUD), ake_2.P) && ava_0.b(cw_2.t(hUD), ake_2.ak) && StringPropertyInvoker.isMode(cw_2.s(hUD), ake_2.u) && dz_0.c(iterator = ListInvoker.iterator(NotificationManagerInvoker.a(NovolineInvoker.getNotificationManager(this.novoline))))) {
            Notification notification = (Notification)dz_0.b(iterator);
            _j_0.a(notification.a, notification.u, notification.s, 0.05, () -> ClickGui.lambda$onBlurNotifications$15(notification), 200L);
        }
    }

    @EventTarget
    public void a(OF oF) {
        PlayerInvoker.b(this.mc.player, aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), ake_2.aQ), c__0.b(oF).t()), ake_2.I), c__0.a(oF)).toString());
    }

    public void a(abb_2 abb_22) {
        this.as = abb_22;
    }

    public static int B() {
        ClickGui.a();
        return 26;
    }

    public boolean g() {
        return auk_2.a((Boolean)Ba.b(this.ae));
    }

    public long D() {
        return this.Z;
    }

    private Boolean lambda$new$6() {
        return auk_2.b(StringPropertyInvoker.isMode(this.aA, ake_2.ah));
    }

    private Boolean lambda$new$5() {
        return auk_2.b(StringPropertyInvoker.isMode(this.aA, ake_2.ap));
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x6E2B;
        if (eb[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])ib.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                ib.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_1", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return eb[n2];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_1" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    public ClickGui(@NonNull int n, int n2, ModuleManager moduleManager, EnumModuleType enumModuleType, String string, String string2, int n3) {
        long l4 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)n3 << 48 >>> 48) ^ bb;
        long l5 = l4 ^ 0xD5307CF41B5L;
        int n4 = (int)(l5 >>> 48);
        int n5 = (int)(l5 << 16 >>> 48);
        int n6 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n4, enumModuleType, string, (char)n5, n6, string2);
        this.as = abb_2.NONE;
        this.ax = Q2.ALL;
        this.S = new TimerUtil();
        this.av = new TimerUtil();
        this.ao = 1.0;
        this.ar = atz_0.a();
        this.M = this.ar.e;
        this.O = this.ar.c;
        this.ag = anf_2.a(anf_2.c(), 10, 25);
        this.ab = "";
        this.at = aj7.a(aj7.a());
        this.U = (int)(anv_0.a(this.at) / 2.0);
        this.J = (int)(anv_0.b(this.at) / 2.0);
        this.an = asp_2.c();
        this.al = asp_2.c();
        this.aA = StringPropertyInvoker.b(asp_2.a((String)((Object)ClickGui.b("k", (int)32589, (long)(0x25FD876938B80082L ^ l4)))), new String[]{ClickGui.b("k", (int)26324, (long)(0x31B6DD92E1AD190CL ^ l4)), ClickGui.b("k", (int)31531, (long)(0x6B223650A29384EFL ^ l4)), ClickGui.b("k", (int)24897, (long)(0x5EE92CB13089E84L ^ l4)), ClickGui.b("k", (int)5025, (long)(0x7CCBB6ADF5FF6C61L ^ l4))});
        this.am = asp_2.c();
        this.K = asp_2.c();
        this.Y = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(1.0)), db_0.a(0.5)), db_0.a(3.0));
        this.ad = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(1.0)), db_0.a(0.6)), db_0.a(1.0));
        this.aB = asp_2.b(P8.d(aol_1.b(new Color(150, 100, 255))));
        this.ae = asp_2.c();
        this.aq = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(100)), P8.d(1)), P8.d(this.U));
        this.X = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(this.J / 4)), P8.d(1)), P8.d(this.J));
        this.ap = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(560.0)), db_0.a(560.0)), db_0.a((double)this.U));
        this.ak = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(330.0)), db_0.a(330.0)), db_0.a((double)this.J));
        this.W = asp_2.a((String)((Object)ClickGui.b("k", (int)22023, (long)(0x51918A6F2BA9C6L ^ l4))));
        this.ay = StringPropertyInvoker.b(asp_2.a((String)((Object)ClickGui.b("k", (int)764, (long)(0x1BE6BE63C9227D3BL ^ l4)))), new String[]{ClickGui.b("k", (int)10748, (long)(0x3D9C7C770FFD5637L ^ l4)), ClickGui.b("k", (int)28374, (long)(0x21701F0AADB31109L ^ l4)), ClickGui.b("k", (int)10818, (long)(0x79DF4C34BA61D581L ^ l4))});
        this.R = StringPropertyInvoker.b(asp_2.a((String)((Object)ClickGui.b("k", (int)4632, (long)(0x943ABAA9B426DC6L ^ l4)))), new String[]{ClickGui.b("k", (int)4015, (long)(0xA416784B452F043L ^ l4)), ClickGui.b("k", (int)12370, (long)(0x66A7BC5BE8BD4F9CL ^ l4))});
        this.ac = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(40)), P8.d(0)), P8.d(100));
        this.aj = new TimerUtil();
        this.I = new TimerUtil();
        this.aa = new ArrayList();
        this.Q = new TimerUtil();
        this.aE = 20.0;
        this.az = new TimerUtil();
        StringPropertyInvoker.b(this.aA, (String)((Object)ClickGui.b("k", (int)31531, (long)(0x6B223650A29384EFL ^ l4))));
        ManagerInvoker.put(new Setting((String)((Object)ClickGui.b("k", (int)916, (long)(0x18152438BF9C7C7BL ^ l4))), (String)((Object)ClickGui.b("k", (int)3866, (long)(0x2E89DC11B57770F7L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.R, this::lambda$new$0));
        ManagerInvoker.put(new Setting((String)((Object)ClickGui.b("k", (int)6876, (long)(0x7F5CD0EEE1E51EL ^ l4))), (String)((Object)ClickGui.b("k", (int)28743, (long)(0x2CE0EC37C6AB0FA9L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.ay, this::lambda$new$1));
        ManagerInvoker.put(new Setting((String)((Object)ClickGui.b("k", (int)28035, (long)(0x646750DD8C699253L ^ l4))), (String)((Object)ClickGui.b("k", (int)26646, (long)(0x1F41F1D880FF17CCL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.an, this::lambda$new$2));
        ManagerInvoker.put(new Setting((String)((Object)ClickGui.b("k", (int)10058, (long)(0x7ACE5B4C8E505891L ^ l4))), (String)((Object)ClickGui.b("k", (int)3144, (long)(0x79D59FAB4487F382L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.al, this::lambda$new$3));
        ManagerInvoker.put(new Setting((String)((Object)ClickGui.b("k", (int)14142, (long)(0xE356749C9A148F2L ^ l4))), (String)((Object)ClickGui.b("k", (int)4053, (long)(0x4819AED95493F001L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.am, this::lambda$new$4));
        ManagerInvoker.put(new Setting((String)((Object)ClickGui.b("k", (int)25825, (long)(0x6CEF5538E45A9B34L ^ l4))), (String)((Object)ClickGui.b("k", (int)27444, (long)(0x4FECEA500B2F94EDL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.K, this::lambda$new$5));
        ManagerInvoker.put(new Setting((String)((Object)ClickGui.b("k", (int)22383, (long)(0x383325A8BADEA8B2L ^ l4))), (String)((Object)ClickGui.b("k", (int)22577, (long)(0x1B72C9C45FF2A7F8L ^ l4))), SettingType.COLOR_PICKER, (AbstractModule)this, this.aB, null, this::lambda$new$6));
        ManagerInvoker.put(new Setting((String)((Object)ClickGui.b("k", (int)16856, (long)(0x58E6074C2C2C3E1EL ^ l4))), (String)((Object)ClickGui.b("k", (int)15441, (long)(0x73A62B364BF84382L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.ad, 0.05, this::lambda$new$7));
        ManagerInvoker.put(new Setting((String)((Object)ClickGui.b("k", (int)3491, (long)(0x3C277B61C67FF275L ^ l4))), (String)((Object)ClickGui.b("k", (int)17169, (long)(0x2C039763C174BCC6L ^ l4))), SettingType.SLIDER, this, this.ac, 2.0, "%", this::lambda$new$8));
        ManagerInvoker.put(new Setting((String)((Object)ClickGui.b("k", (int)5137, (long)(0x396A968A5035EBC3L ^ l4))), (String)((Object)ClickGui.b("k", (int)28249, (long)(0x20A2823E1CE79191L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.Y, 0.05, this::lambda$new$9));
        ManagerInvoker.put(new Setting((String)((Object)ClickGui.b("k", (int)1142, (long)(0x5B1EB59229B7FB9DL ^ l4))), (String)((Object)ClickGui.b("k", (int)23270, (long)(0x4B6B69D8D449A52BL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.ae, this::lambda$new$10));
        ManagerInvoker.put(new Setting((String)((Object)ClickGui.b("k", (int)29287, (long)(0x21FD71A13EE20DB6L ^ l4))), (String)((Object)ClickGui.b("k", (int)424, (long)(0x60F2DFD2F7097E74L ^ l4))), SettingType.BUTTON, (AbstractModule)this, this::lambda$new$11, this::lambda$new$12));
    }

    public DoubleProperty i() {
        return this.ad;
    }

    static Minecraft e(ClickGui clickGui) {
        return clickGui.mc;
    }

    public String e() {
        return this.ab;
    }

    static {
        bb = a1c.a(4245106911808737332L, -7148512410690033438L, MethodHandles.lookup().lookupClass()).a(45497285022534L);
        ib = new HashMap(13);
        long l4 = bb ^ 0x204103C9C9B2L;
        ClickGui.a(10);
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

    private Boolean lambda$new$0() {
        return auk_2.b(StringPropertyInvoker.isMode(this.aA, ake_2.l));
    }

    @EventTarget
    public void b(TickUpdateEvent tickUpdateEvent) {
        HUD.j();
        if (this.L != this.mc.gameSettings.bB) {
            this.L = this.mc.gameSettings.bB;
            if (this.L) {
                SystemInvoker.b(ake_2.A, ake_2.aI);
                DisplayInvoker.a(DisplayInvoker.g());
                DisplayInvoker.a(0, 0);
                DisplayInvoker.b(false);
                DisplayInvoker.a(false);
            }
            try {
                SystemInvoker.b(ake_2.aX, ake_2.aa);
                DisplayInvoker.a(new DisplayMode(this.mc.displayWidth, this.mc.displayHeight));
                DisplayInvoker.b(true);
                DisplayInvoker.a(true);
            }
            catch (LWJGLException lWJGLException) {
                aQI.a(lWJGLException);
            }
        }
    }

    public DoubleProperty m() {
        return this.Y;
    }

    private static void lambda$onBlurNotifications$15(Notification notification) {
        a1V.b(notification.d, notification.j, notification.d + notification.h, notification.j + notification.w, hb_2.a(asx_1.BLACK));
    }

    public StringProperty f() {
        return this.aA;
    }

    static Minecraft f(ClickGui clickGui) {
        return clickGui.mc;
    }

    public DoubleProperty b() {
        return this.ap;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = ClickGui.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    public String v() {
        HUD.j();
        return this.ax.equals((Object)Q2.PM) ? ake_2.ag : aod_2.d(StringInvoker.i(this.ax.name()));
    }

    public Q2 y() {
        return this.ax;
    }

    public Integer w() {
        return P8.d(this.aC);
    }

    public BooleanProperty s() {
        return this.K;
    }

    public static void a(int n) {
        V = n;
    }

    static Minecraft c(ClickGui clickGui) {
        return clickGui.mc;
    }

    public int o() {
        return hb_2.a(asx_1.WHITE);
    }

    private Boolean lambda$new$8() {
        HUD.j();
        return auk_2.b(StringPropertyInvoker.isMode(this.aA, ake_2.a5) && StringPropertyInvoker.isMode(this.R, ake_2.aE));
    }

    @EventTarget
    public void a(Render2DEvent render2DEvent) {
        if (NovolineInvoker.q(this.novoline)) {
            ScaledResolution scaledResolution = uc_0.a(render2DEvent);
            int n = ScaledResolutionInvoker.getScaledWidth(scaledResolution) / 2;
            String string = aL0.a(aL0.a(new StringBuilder(), ake_2.S), NovolineInvoker.getVersion(this.novoline)).toString();
            FontRenderer fontRenderer = adj_1.a(pI.a, 40);
            int n2 = a7l_0.a(fontRenderer, string) / 2;
            GlStateManagerInvoker.disableBlend();
            a7l_0.a(fontRenderer, (CharSequence)string, n - n2, 40.0f, hb_2.a(hb_2.a(asx_1.WHITE), 30));
            GlStateManagerInvoker.enableBlend();
        }
    }

    private Boolean lambda$new$1() {
        return auk_2.b(StringPropertyInvoker.isMode(this.aA, ake_2.ad));
    }

    public DoubleProperty z() {
        return this.ak;
    }

    public StringProperty G() {
        return this.ay;
    }

    static Minecraft d(ClickGui clickGui) {
        return clickGui.mc;
    }

    public double C() {
        return 1.0 - 0.01 * (double)(P8.b((Integer)adt_2.a(this.ac)) / 2);
    }

    static Minecraft b(ClickGui clickGui) {
        return clickGui.mc;
    }

    private Boolean lambda$new$2() {
        return auk_2.b(StringPropertyInvoker.isMode(this.aA, ake_2.ac));
    }

    public IntProperty u() {
        return this.aq;
    }

    public Integer A() {
        return P8.d(this.ah);
    }

    public eu_0 l() {
        return this.aB;
    }

    @EventTarget
    public void a(PacketEvent packetEvent) {
        HUD.t();
        if (PacketEventInvoker.getState(packetEvent) == State.INCOMING && PacketEventInvoker.c(packetEvent) instanceof S02PacketLoginSuccess && NovolineInvoker.n(this.novoline) != null) {
            S02PacketLoginSuccess s02PacketLoginSuccess = (S02PacketLoginSuccess)PacketEventInvoker.c(packetEvent);
            aGR.a(NovolineInvoker.n(this.novoline), new aZ9(aUJ.a(s02PacketLoginSuccess).getName()));
        }
    }

    private void lambda$hypixelStats$14(JSONObject jSONObject, Throwable throwable) {
        HUD.j();
        if (aZR.b(jSONObject, ake_2.L)) {
            if (this.H == 0 || this.N == 0) {
                this.aF = aZR.f(jSONObject, ake_2.aR);
                this.T = aZR.f(jSONObject, ake_2.an);
                this.H = this.aF;
                this.N = this.T;
            }
            this.aF = aZR.f(jSONObject, ake_2.a3);
            this.T = aZR.f(jSONObject, ake_2.a);
            if (this.aF - this.H > 0) {
                this.ah += this.aF - this.H;
            }
            if (this.T - this.N > 0) {
                this.aD += this.T - this.N;
            }
            this.H = this.aF;
            this.N = this.T;
        }
    }

    public double t() {
        return this.ao;
    }

    static void a(ClickGui clickGui, Packet packet) {
        clickGui.b(packet);
    }

    @EventTarget
    public void c(PacketEvent packetEvent) {
        HUD.t();
        if (PacketEventInvoker.getState(packetEvent).equals((Object)State.INCOMING)) {
            S00PacketKeepAlive s00PacketKeepAlive;
            if (PacketEventInvoker.c(packetEvent) instanceof S00PacketKeepAlive && xx_1.a(s00PacketKeepAlive = (S00PacketKeepAlive)PacketEventInvoker.c(packetEvent)) % 4 == 0 && aCM.d() && !StringInvoker.g(this.ab)) {
                CompletableFuture completableFuture = avs_1.a(this::lambda$hypixelStats$13, (Executor)aFW.a());
                avs_1.b(completableFuture, this::lambda$hypixelStats$14);
            }
            if (PacketEventInvoker.c(packetEvent) instanceof S03PacketTimeUpdate) {
                Iterator iterator;
                akr_1.a(this.aa, lx_2.b(MathInvoker.a(1000L, qh_1.c(this.Q))));
                long l4 = 0L;
                if (akr_1.d(this.aa) > 5) {
                    akr_1.b(this.aa, 0);
                }
                if (dz_0.c(iterator = akr_1.a(this.aa))) {
                    long l5 = lx_2.a((Long)dz_0.b(iterator));
                    l4 += l5;
                }
                long l6 = l4 / (long)akr_1.d(this.aa);
                this.aE = 20.0 / (double)l6 * 1000.0;
                qh_1.b(this.Q);
            }
        }
    }

    private static LWJGLException a(LWJGLException lWJGLException) {
        return lWJGLException;
    }

    private Boolean lambda$new$4() {
        return auk_2.b(StringPropertyInvoker.isMode(this.aA, ake_2.aL));
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

    public abb_2 x() {
        return this.as;
    }

    private JSONObject lambda$hypixelStats$13() {
        CloseableHttpClient closeableHttpClient = CE.c();
        String string = aL0.a(aL0.a(new StringBuilder(), ake_2.aF), this.ab).toString();
        HttpGet httpGet = new HttpGet(string);
        Y2.a(httpGet, ake_2.aP, this.ab);
        Y2.a(httpGet, ake_2.O, ake_2.aj);
        CloseableHttpResponse closeableHttpResponse = null;
        try {
            closeableHttpResponse = aXI.a(closeableHttpClient, (HttpUriRequest)httpGet);
        }
        catch (IOException iOException) {
            a4E.b(iOException);
        }
        String string2 = null;
        try {
            string2 = IOUtilsInvoker.b(pR.a(V9.a((HttpResponse)closeableHttpResponse)), StandardCharsets.UTF_8);
        }
        catch (IOException iOException) {
            a4E.b(iOException);
        }
        return new JSONObject(string2);
    }

    public void b(double d) {
        this.ao = d;
    }

    public BooleanProperty n() {
        return this.an;
    }

    public void e(String string) {
        this.aw = string;
    }

    public BooleanProperty c() {
        return this.am;
    }

    public Integer p() {
        return P8.d(this.au);
    }

    public Integer k() {
        return P8.d(this.aD);
    }

    /*
     * Exception decompiling
     */
    @EventTarget
    public void a(SettingEvent var1_1) {
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

    @EventTarget
    public void b(PacketEvent packetEvent) {
        block43: {
            Object object;
            block44: {
                block42: {
                    Object object2;
                    Object object3;
                    HUD.j();
                    if (!PacketEventInvoker.getState(packetEvent).equals((Object)State.INCOMING)) break block42;
                    if (PacketEventInvoker.c(packetEvent) instanceof S12PacketEntityVelocity) {
                        object = (S12PacketEntityVelocity)PacketEventInvoker.c(packetEvent);
                        object3 = (Velocity)ModuleInvoker.isEnable(ModuleRegistry.VELOCITY);
                        if (!(aYL.d((S12PacketEntityVelocity)object) != PlayerInvoker.O(this.mc.player) || ((AbstractModule)object3).x() && StringPropertyInvoker.isMode(((Velocity)object3).a(), ake_2.i) || MathInvoker.a(aYL.a((S12PacketEntityVelocity)object)) <= 2000 && MathInvoker.a(aYL.c((S12PacketEntityVelocity)object)) <= 2000)) {
                            this.mc.player.fuck = 20;
                        }
                    }
                    if (PacketEventInvoker.c(packetEvent) instanceof S02PacketLoginSuccess) {
                        this.aF = 0;
                        this.T = 0;
                        this.ah = 0;
                        this.aD = 0;
                        this.au = 0;
                        this.aC = 0;
                        this.P = SystemInvoker.f();
                        object = (SessionInfo)ModuleInvoker.isEnable(ModuleRegistry.SESSION);
                        object3 = aZ2.a(aYC.a((SessionInfo)object), new Date(SystemInvoker.f() - this.P));
                        this.Z = (long)P8.a(StringInvoker.g((String)object3, ake_2.a6)[0]) * 3600000L;
                        this.af = !MCInvoker.k(this.mc) && (StringInvoker.a(StringInvoker.i(MCInvoker.W((Minecraft)this.mc).k), (CharSequence)ake_2.J) || StringInvoker.a(StringInvoker.i(MCInvoker.W((Minecraft)this.mc).k), (CharSequence)ake_2.R));
                        this.b(db_0.b((Double)MD.b(this.Y)));
                        object2 = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
                        cw_2.m((HUD)object2);
                    }
                    if (PacketEventInvoker.c(packetEvent) instanceof S01PacketJoinGame) {
                        ms_0.f(aDM.b(MCInvoker.aa(this.mc)));
                        object = (ChestStealer)ModuleInvoker.isEnable(ModuleRegistry.CHESTSTEALER);
                        ListInvoker.clear(ty_2.c((ChestStealer)object));
                        this.as = abb_2.NONE;
                        object3 = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
                        cw_2.z((HUD)object3);
                    }
                    if (PacketEventInvoker.c(packetEvent) instanceof S02PacketChat) {
                        object = (S02PacketChat)PacketEventInvoker.c(packetEvent);
                        if (aCM.d()) {
                            object3 = aBO.a(ue_2.c((S02PacketChat)object));
                            object2 = aBO.d(ue_2.c((S02PacketChat)object));
                            if (((String)object3).equals(ake_2.a1)) {
                                PacketEventInvoker.setCancelled(packetEvent, true);
                            }
                            if ((StringInvoker.a((String)object3, (CharSequence)ake_2.aG) || StringInvoker.a((String)object2, (CharSequence)ake_2.Q)) && StringInvoker.a((String)object2, (CharSequence)this.mc.player.getName()) && !StringInvoker.g((String)object2, ake_2.a0)[0].equals(this.mc.player.getName())) {
                                ++this.au;
                            }
                            if (StringInvoker.g(this.ab) && StringInvoker.e((String)object3, ake_2.f)) {
                                this.ab = StringInvoker.a(aBO.d(ue_2.c((S02PacketChat)object)), (CharSequence)ake_2.U, (CharSequence)ake_2.X);
                                PacketEventInvoker.setCancelled(packetEvent, true);
                            }
                            if (StringInvoker.e((String)object3, ake_2.aY)) {
                                this.ax = Q2.PM;
                                this.a(ake_2.s, aL0.a(aL0.a(aL0.a(new StringBuilder(), ake_2.o), this.v()), ake_2.Y).toString(), 3000, NotificationType.INFO);
                                PacketEventInvoker.setCancelled(packetEvent, true);
                            }
                            if (((String)object3).equals(ake_2.aW)) {
                                this.ax = Q2.ALL;
                                this.a(ake_2.aJ, aL0.a(aL0.a(aL0.a(new StringBuilder(), ake_2.aq), this.v()), ake_2.z).toString(), 3000, NotificationType.INFO);
                                PacketEventInvoker.setCancelled(packetEvent, true);
                            }
                            if (((String)object3).equals(ake_2.W)) {
                                this.ax = Q2.PARTY;
                                this.a(ake_2.F, aL0.a(aL0.a(aL0.a(new StringBuilder(), ake_2.au), this.v()), ake_2.aH).toString(), 3000, NotificationType.INFO);
                                PacketEventInvoker.setCancelled(packetEvent, true);
                            }
                            if (((String)object3).equals(ake_2.t)) {
                                this.ax = Q2.GUILD;
                                this.a(ake_2.aS, aL0.a(aL0.a(aL0.a(new StringBuilder(), ake_2.b), this.v()), ake_2.aT).toString(), 3000, NotificationType.INFO);
                                PacketEventInvoker.setCancelled(packetEvent, true);
                            }
                            if (!this.ax.equals((Object)Q2.GUILD) && StringInvoker.e((String)object3, ake_2.B) && StringInvoker.a((String)object3, (CharSequence)aBO.a(PlayerInvoker.Z(this.mc.player)))) {
                                this.ax = Q2.GUILD;
                                this.a(ake_2.g, aL0.a(aL0.a(aL0.a(new StringBuilder(), ake_2.y), this.v()), ake_2.E).toString(), 3000, NotificationType.INFO);
                            }
                            if (!this.ax.equals((Object)Q2.PARTY) && StringInvoker.e((String)object3, ake_2.aK) && StringInvoker.a((String)object3, (CharSequence)aBO.a(PlayerInvoker.Z(this.mc.player)))) {
                                this.ax = Q2.PARTY;
                                this.a(ake_2.ao, aL0.a(aL0.a(aL0.a(new StringBuilder(), ake_2.al), this.v()), ake_2.m).toString(), 3000, NotificationType.INFO);
                            }
                            if (!this.ax.equals((Object)Q2.PM) && StringInvoker.e((String)object3, ake_2.M)) {
                                this.ax = Q2.PM;
                                this.a(ake_2.a2, aL0.a(aL0.a(aL0.a(new StringBuilder(), ake_2.aU), this.v()), ake_2.p).toString(), 3000, NotificationType.INFO);
                            }
                            if (this.ax.equals((Object)Q2.PARTY) && StringInvoker.a((String)object3, (CharSequence)this.mc.player.getName()) && StringInvoker.c((String)object3, ake_2.as)) {
                                this.b(new C01PacketChatMessage(ake_2.c));
                            }
                            if (!this.ax.equals((Object)Q2.ALL) && ((String)object3).equals(ake_2.D)) {
                                this.ax = Q2.ALL;
                                this.a(ake_2.H, aL0.a(aL0.a(aL0.a(new StringBuilder(), ake_2.h), this.v()), ake_2.G).toString(), 3000, NotificationType.INFO);
                            }
                        }
                    }
                    if (PacketEventInvoker.c(packetEvent) instanceof S45PacketTitle && avj_1.d((S45PacketTitle)(object = (S45PacketTitle)PacketEventInvoker.c(packetEvent))).equals((Object)xz_0.TITLE) && StringInvoker.a(aBO.d(avj_1.e((S45PacketTitle)object)), (CharSequence)ake_2.at)) {
                        ++this.aC;
                    }
                    if (PacketEventInvoker.c(packetEvent) instanceof S3DPacketDisplayScoreboard) {
                        object = (S3DPacketDisplayScoreboard)PacketEventInvoker.c(packetEvent);
                        if (aCM.d()) {
                            object3 = ad8_0.b((S3DPacketDisplayScoreboard)object);
                            if (StringInvoker.d((String)object3, ake_2.av)) {
                                this.as = abb_2.MW;
                            }
                            if (StringInvoker.d((String)object3, ake_2.ae)) {
                                this.as = abb_2.UHC;
                            }
                            if (StringInvoker.d((String)object3, ake_2.aw)) {
                                this.as = abb_2.SW;
                            }
                            if (StringInvoker.d((String)object3, ake_2.N)) {
                                this.as = abb_2.BW;
                            }
                            if (StringInvoker.d((String)object3, ake_2.aM)) {
                                this.as = abb_2.PRE;
                            }
                            if (StringInvoker.d((String)object3, ake_2.d)) {
                                this.as = abb_2.DUELS;
                            }
                            if (StringInvoker.d((String)object3, ake_2.q)) {
                                this.as = abb_2.PIT;
                            }
                            if (StringInvoker.d((String)object3, ake_2.ar)) {
                                this.as = abb_2.SG;
                            }
                            if (StringInvoker.d((String)object3, ake_2.aC)) {
                                this.as = abb_2.MM;
                            }
                            if (!StringInvoker.a((String)object3, (CharSequence)ake_2.az) && !StringInvoker.a((String)object3, (CharSequence)ake_2.aD)) {
                                this.as = abb_2.NONE;
                            }
                        }
                    }
                    if (PacketEventInvoker.c(packetEvent) instanceof S2DPacketOpenWindow) {
                        object = (S2DPacketOpenWindow)PacketEventInvoker.c(packetEvent);
                        if (aCM.d() && aBO.a(li_2.f((S2DPacketOpenWindow)object)).equals(ake_2.aN)) {
                            PacketEventInvoker.setCancelled(packetEvent, true);
                        }
                    }
                    if (PacketEventInvoker.c(packetEvent) instanceof S2EPacketCloseWindow) {
                        object = (S2EPacketCloseWindow)PacketEventInvoker.c(packetEvent);
                        if (this.mc.currentScreen instanceof GuiChat || this.mc.currentScreen instanceof R1 || this.mc.currentScreen instanceof rj_0 || this.mc.currentScreen instanceof ClickGUI) {
                            PacketEventInvoker.setCancelled(packetEvent, true);
                        }
                    }
                    if (!(PacketEventInvoker.c(packetEvent) instanceof S2FPacketSetSlot)) break block43;
                    object = (S2FPacketSetSlot)PacketEventInvoker.c(packetEvent);
                    if (aCM.d() && aCM.a(abb_2.LOBBY) && W_.a((S2FPacketSetSlot)object) != null && act_2.k(W_.a((S2FPacketSetSlot)object)) instanceof Ln) {
                        PacketEventInvoker.setCancelled(packetEvent, true);
                    }
                }
                if (!(PacketEventInvoker.c(packetEvent) instanceof C03PacketPlayer)) break block44;
                if (!this.af || this.mc.player.ticksExisted <= this.ag) break block43;
                if (aCM.d()) {
                    this.a(ake_2.af, ake_2.Z, NotificationType.INFO);
                    this.b(new C01PacketChatMessage(ake_2.ay));
                    aci_0.a(NovolineInvoker.i(this.novoline), new aU_(this, 1500, ag3_0.TICK));
                }
                this.a(ake_2.aO, ake_2.V, 6000, NotificationType.ERROR);
                this.af = false;
            }
            if (PacketEventInvoker.c(packetEvent) instanceof C01PacketChatMessage) {
                object = (C01PacketChatMessage)PacketEventInvoker.c(packetEvent);
                if (aCM.d() && StringInvoker.e(aco_0.a((C01PacketChatMessage)object), ake_2.ax)) {
                    PacketEventInvoker.setCancelled(packetEvent, true);
                }
            }
        }
    }

    @EventTarget
    public void a(IRCMessageEvent iRCMessageEvent) {
        this.mc.timer.timerSpeed = 1.0f;
        ms_0.f(aDM.b(MCInvoker.aa(this.mc)));
        this.as = abb_2.NONE;
        ListInvoker.clear(ty_2.c((ChestStealer)ModuleInvoker.isEnable(ModuleRegistry.CHESTSTEALER)));
        ListInvoker.clear(aci_0.a(NovolineInvoker.i(this.novoline)));
        this.ab = ake_2.aA;
        this.aF = 0;
        this.T = 0;
        this.ah = 0;
        this.aD = 0;
        this.H = 0;
        this.N = 0;
        this.au = 0;
        this.aC = 0;
    }

    @EventTarget
    public void a(PlayerUpdateEvent playerUpdateEvent) {
        int n;
        HUD.j();
        if (aCM.a(abb_2.PRE)) {
            this.ai = true;
        }
        if (this.ai && aCM.a(abb_2.BW)) {
            BedBreaker bedBreaker = (BedBreaker)ModuleInvoker.isEnable(ModuleRegistry.BEDBREAKER);
            o_0.a(bedBreaker, null);
            aci_0.a(NovolineInvoker.i(this.novoline), new aUC(this, 500, ag3_0.TICK, bedBreaker));
            this.ai = false;
        }
        if (InventoryInvoker.c(this.mc.player.inventory, n = 0) != null && InventoryInvoker.c((aSK)this.mc.player.inventory, (int)n).a == 0) {
            InventoryInvoker.b(this.mc.player.inventory, n);
        }
        ++n;
    }

    public double E() {
        return this.aE;
    }

    @Override
    public void o() {
        MCInvoker.displayGuiScreen(this.mc, NovolineInvoker.e(this.novoline));
        this.d();
    }

    public StringProperty h() {
        return this.R;
    }

    @EventTarget
    public void a(TickUpdateEvent tickUpdateEvent) {
        HUD.j();
        if (this.mc.world != null && this.mc.player != null && !MCInvoker.k(this.mc)) {
            if (!(aCM.a(abb_2.PRE) || aCM.a(abb_2.LOBBY) || aCM.a(abb_2.NONE))) {
                aCM.a(aCM.c() + 1);
            }
            if (aCM.c() > 0) {
                aCM.a(0);
            }
        }
    }

    @Override
    public void w() {
        EventManagerInvoker.a(this);
    }

    static void a(ClickGui clickGui, String string, String string2, int n, NotificationType notificationType) {
        clickGui.a(string, string2, n, notificationType);
    }

    static Minecraft a(ClickGui clickGui) {
        return clickGui.mc;
    }

    public long j() {
        return this.P;
    }

    private Boolean lambda$new$9() {
        HUD.j();
        return auk_2.b(StringPropertyInvoker.isMode(this.aA, ake_2.e) || StringPropertyInvoker.isMode(this.aA, ake_2.T));
    }

    public IntProperty F() {
        return this.X;
    }

    @EventTarget
    public void a(SpawnCheckEvent spawnCheckEvent) {
        HUD.j();
        if (nr_0.b(spawnCheckEvent) == yd_2.ADD && nr_0.a(spawnCheckEvent) instanceof EntityPlayer) {
            EntityPlayer entityPlayer = (EntityPlayer)nr_0.a(spawnCheckEvent);
            if (a8F.a(NovolineInvoker.A(this.novoline), entityPlayer.getName(), EnumPlayerType.TARGET)) {
                this.a(aL0.a(aL0.a(new StringBuilder(), ake_2.w), entityPlayer.getName()).toString(), 3000, NotificationType.WARNING);
            }
        }
    }

    private Boolean lambda$new$3() {
        return auk_2.b(StringPropertyInvoker.isMode(this.aA, ake_2.aZ));
    }

    public static int a() {
        return V;
    }

    public IntProperty r() {
        return this.ac;
    }

    private Boolean lambda$new$7() {
        return auk_2.b(StringPropertyInvoker.isMode(this.aA, ake_2.r));
    }

    @EventTarget
    public void a(LoadWorldEvent loadWorldEvent) {
        if (aCM.d()) {
            InvManager invManager = (InvManager)ModuleInvoker.isEnable(ModuleRegistry.INVMANAGER);
            invManager.a((SettingEvent)null);
            AutoArmor autoArmor = (AutoArmor)ModuleInvoker.isEnable(ModuleRegistry.AUTOARMOR);
            autoArmor.a((SettingEvent)null);
            Scaffold scaffold = (Scaffold)ModuleInvoker.isEnable(ModuleRegistry.SCAFFOLD);
            scaffold.a((SettingEvent)null);
            Speed speed = (Speed)ModuleInvoker.isEnable(ModuleRegistry.SPEED);
            speed.a((SettingEvent)null);
            NoSlow noSlow = (NoSlow)ModuleInvoker.isEnable(ModuleRegistry.NOSLOWDOWN);
            noSlow.a((SettingEvent)null);
            KillAura killAura = (KillAura)ModuleInvoker.isEnable(ModuleRegistry.KILLAURA);
            killAura.b((SettingEvent)null);
            NoFall noFall = (NoFall)ModuleInvoker.isEnable(ModuleRegistry.NOFALL);
            noFall.a((SettingEvent)null);
            Criticals criticals = (Criticals)ModuleInvoker.isEnable(ModuleRegistry.CRITICALS);
            criticals.a((SettingEvent)null);
            Step step = (Step)ModuleInvoker.isEnable(ModuleRegistry.STEP);
            step.a((SettingEvent)null);
            LongJump longJump = (LongJump)ModuleInvoker.isEnable(ModuleRegistry.LONGJUMP);
            longJump.a((SettingEvent)null);
            Disabler disabler = (Disabler)ModuleInvoker.isEnable(ModuleRegistry.DISABLER);
            disabler.a((SettingEvent)null);
            Velocity velocity = (Velocity)ModuleInvoker.isEnable(ModuleRegistry.VELOCITY);
            velocity.a((SettingEvent)null);
            TargetStrafe targetStrafe = (TargetStrafe)ModuleInvoker.isEnable(ModuleRegistry.TARGETSTRAFE);
            targetStrafe.a((SettingEvent)null);
            WaterWalk waterWalk = (WaterWalk)ModuleInvoker.isEnable(ModuleRegistry.WATERWALK);
            waterWalk.a((SettingEvent)null);
            GameSpeed gameSpeed = (GameSpeed)ModuleInvoker.isEnable(ModuleRegistry.GAMESPEED);
            gameSpeed.a((SettingEvent)null);
            Blink blink = (Blink)ModuleInvoker.isEnable(ModuleRegistry.BLINK);
            blink.a((SettingEvent)null);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ClickGui.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


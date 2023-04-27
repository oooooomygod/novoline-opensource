/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Vector4d
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.combat;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.PlayerUpdateEvent;
import cc.novoline.events.events.Render2DEvent;
import cc.novoline.events.events.RenderGuiEvent;
import cc.novoline.events.events.ShaderEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;

import java.awt.Color;
import java.awt.Dimension;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.vecmath.Vector4d;

import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.*;
import net.minecraft.client.Minecraft;
import net.Ba;
import net.BooleanProperty;
import net.DoubleProperty;
import net.KillAura;
import net.ListProperty;
import net.MD;
import net.ModuleManager;
import net.P8;
import net.GuiChat;
import net.ScaledResolution;
import net.StringProperty;
import net._j_0;
import net.a1V;
import net.a1c;
import net.adt_2;
import net.aj7;
import net.anv_0;
import net.aol_1;
import net.asp_2;
import net.atH;
import net.auk_2;
import net.ava_0;
import net.aym_0;
import net.db_0;
import net.eu_0;
import net.oi_0;
import net.qi_2;
import net.ta_0;
import org.checkerframework.checker.nullness.qual.NonNull;

public class TargetHUD
extends AbstractModule {
    @Property(value="color-begin")
    private eu_0 af;
    @Property(value="smoothness")
    private IntProperty ad;
    @Property(value="shaders")
    private ListProperty<String> ac;
    @Property(value="roundness")
    private IntProperty X;
    @Property(value="pos-y")
    private DoubleProperty L;
    private static String[] cb;
    private double T;
    private double Y;
    private static Map ib;
    private ta_0 N;
    private Dimension O;
    private boolean ag;
    @Property(value="color-end")
    private eu_0 P;
    @Property(value="color")
    private eu_0 V;
    @Property(value="drop-effect-quantity")
    private IntProperty R;
    private double H;
    @Property(value="drop-effect-mode")
    private StringProperty I;
    private oi_0 U;
    @Property(value="alpha")
    private IntProperty ae;
    @Property(value="follow-player")
    private BooleanProperty J;
    @Property(value="show-health-value")
    private BooleanProperty S;
    @Property(value="draw-drop-effect")
    private BooleanProperty K;
    @Property(value="pos-x")
    private DoubleProperty M;
    private static String[] eb;
    private aym_0 Z;
    private double W;
    @Property(value="style")
    private StringProperty ab;
    private static long bb;
    @Property(value="color-type")
    private StringProperty Q;
    private KillAura aa;

    private boolean e() {
        return true;
    }

    static DoubleProperty e(TargetHUD targetHUD) {
        return targetHUD.L;
    }

    @EventTarget
    public void a(Render2DEvent render2DEvent) {
        KillAura.w();
        if (this.mc.currentScreen instanceof GuiChat) {
            this.H = db_0.b((Double)MD.b(this.M));
            this.Y = db_0.b((Double)MD.b(this.L));
        }
        if (this.h()) {
            KillAura killAura = (KillAura)ModuleInvoker.isEnable(ModuleRegistry.KILLAURA);
            ScaledResolution scaledResolution = new ScaledResolution(this.mc);
            Vector4d vector4d = a1V.a(atH.a(killAura), ScaledResolutionInvoker.getScaleFactor(scaledResolution));
            if (auk_2.a((Boolean)Ba.b(this.J))) {
                this.H = (int)vector4d.z;
                this.Y = (int)(vector4d.w - (vector4d.w - vector4d.y) * 0.5);
            }
            this.H = db_0.b((Double)MD.b(this.M));
            this.Y = db_0.b((Double)MD.b(this.L));
        }
    }

    static double D(TargetHUD targetHUD) {
        return targetHUD.H;
    }

    static Minecraft B(TargetHUD targetHUD) {
        return targetHUD.mc;
    }

    static {
        bb = a1c.a(-1717245067744440577L, 4434690900377762040L, MethodHandles.lookup().lookupClass()).a(101698297974114L);
        ib = new HashMap(13);
        long l4 = bb ^ 0x2136BC33A838L;
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

    private Boolean lambda$new$5() {
        return auk_2.b(StringPropertyInvoker.isMode(this.Q, qi_2.j));
    }

    static IntProperty a(TargetHUD targetHUD) {
        return targetHUD.R;
    }

    private Boolean lambda$new$3() {
        return auk_2.b(StringPropertyInvoker.isMode(this.ab, qi_2.t));
    }

    static boolean l(TargetHUD targetHUD) {
        return targetHUD.ag;
    }

    static Minecraft r(TargetHUD targetHUD) {
        return targetHUD.mc;
    }

    static Minecraft y(TargetHUD targetHUD) {
        return targetHUD.mc;
    }

    static Minecraft z(TargetHUD targetHUD) {
        return targetHUD.mc;
    }

    static Minecraft t(TargetHUD targetHUD) {
        return targetHUD.mc;
    }

    private Boolean lambda$new$8() {
        KillAura.w();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.K)) && !StringPropertyInvoker.isMode(this.ab, qi_2.w));
    }

    static double E(TargetHUD targetHUD) {
        return targetHUD.Y;
    }

    public void c() {
        KillAura.w();
        if (StringPropertyInvoker.isMode(this.ab, qi_2.f) && _j_0.a(ta_0.a(this.N)) <= 0.05) {
            this.N.e();
        }
        if (StringPropertyInvoker.isMode(this.ab, qi_2.u) && _j_0.a(aym_0.a(this.Z)) <= 0.05) {
            this.Z.c();
        }
        if (StringPropertyInvoker.isMode(this.ab, qi_2.r) && _j_0.a(oi_0.a(this.U)) <= 0.05) {
            this.U.b();
        }
    }

    static DoubleProperty j(TargetHUD targetHUD) {
        return targetHUD.M;
    }

    static IntProperty p(TargetHUD targetHUD) {
        return targetHUD.ad;
    }

    static StringProperty m(TargetHUD targetHUD) {
        return targetHUD.Q;
    }

    @EventTarget
    public void a(ShaderEvent shaderEvent) {
        KillAura.w();
        if (ava_0.b(this.ac, qi_2.c)) {
            this.g();
        }
    }

    static IntProperty n(TargetHUD targetHUD) {
        return targetHUD.X;
    }

    private Boolean lambda$new$7() {
        KillAura.w();
        return auk_2.b(StringPropertyInvoker.isMode(this.ab, qi_2.y) || StringPropertyInvoker.isMode(this.ab, qi_2.g));
    }

    static BooleanProperty x(TargetHUD targetHUD) {
        return targetHUD.S;
    }

    static Minecraft c(TargetHUD targetHUD) {
        return targetHUD.mc;
    }

    static StringProperty g(TargetHUD targetHUD) {
        return targetHUD.I;
    }

    public void a(KillAura killAura) {
        this.aa = killAura;
    }

    private Boolean lambda$new$0() {
        KillAura.w();
        return auk_2.b(StringPropertyInvoker.isMode(this.ab, qi_2.b) || StringPropertyInvoker.isMode(this.ab, qi_2.d));
    }

    public void a(EntityPlayer entityPlayer) {
        KillAura.w();
        if (StringPropertyInvoker.isMode(this.ab, qi_2.a)) {
            this.N.a(entityPlayer);
        }
        if (StringPropertyInvoker.isMode(this.ab, qi_2.B)) {
            this.Z.c(entityPlayer);
        }
        if (StringPropertyInvoker.isMode(this.ab, qi_2.h)) {
            this.U.b(entityPlayer);
        }
    }

    private Boolean lambda$new$6() {
        return auk_2.b(StringPropertyInvoker.isMode(this.Q, qi_2.E));
    }

    static Minecraft f(TargetHUD targetHUD) {
        return targetHUD.mc;
    }

    static eu_0 s(TargetHUD targetHUD) {
        return targetHUD.P;
    }

    public void g() {
        KillAura.w();
        if (StringPropertyInvoker.isMode(this.ab, qi_2.e)) {
            this.N.b();
        }
        if (StringPropertyInvoker.isMode(this.ab, qi_2.D)) {
            this.Z.a();
        }
    }

    private Boolean lambda$new$2() {
        return auk_2.b(StringPropertyInvoker.isMode(this.ab, qi_2.i));
    }

    static Minecraft v(TargetHUD targetHUD) {
        return targetHUD.mc;
    }

    static Minecraft h(TargetHUD targetHUD) {
        return targetHUD.mc;
    }

    public TargetHUD(@NonNull char c, int n, short s, ModuleManager moduleManager, EnumModuleType enumModuleType, String string, String string2) {
        long l4 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48) ^ bb;
        long l5 = l4 ^ 0x2F178DBDDE52L;
        int n2 = (int)(l5 >>> 48);
        int n3 = (int)(l5 << 16 >>> 48);
        int n4 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n2, enumModuleType, string, (char)n3, n4, string2);
        this.O = aj7.a(aj7.a());
        this.T = anv_0.a(this.O) * 0.5;
        this.W = anv_0.b(this.O) * 0.5;
        this.N = new ta_0(this, null);
        this.Z = new aym_0(this, null);
        this.U = new oi_0(this, null);
        this.M = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(this.T * 0.5 - 40.0)), db_0.a(0.0)), db_0.a(this.T));
        this.L = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(this.W - 140.0)), db_0.a(0.0)), db_0.a(this.W));
        KillAura.w();
        this.ab = StringPropertyInvoker.b(asp_2.a((String)((Object)TargetHUD.b("u", (int)6161, (long)(0x61D8EDBFE9E84177L ^ l4)))), new String[]{TargetHUD.b("u", (int)17679, (long)(0x565819B0317E1C61L ^ l4)), TargetHUD.b("u", (int)19959, (long)(0x58CDDA5AACE0149EL ^ l4)), TargetHUD.b("u", (int)8147, (long)(0x6C5CB0E624F34685L ^ l4))});
        this.ac = ava_0.a(asp_2.a(TargetHUD.b("u", (int)25754, (long)(0x1077CB851284BDCFL ^ l4)), TargetHUD.b("u", (int)23230, (long)(0x25F4BA2190F483EDL ^ l4))), new String[]{TargetHUD.b("u", (int)2669, (long)(0x404156A197C8D33DL ^ l4)), TargetHUD.b("u", (int)15700, (long)(0x3C4F60C5CCD66439L ^ l4))});
        this.ae = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(100)), P8.d(50)), P8.d(255));
        this.X = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(8)), P8.d(0)), P8.d(16));
        this.ad = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(8)), P8.d(0)), P8.d(16));
        this.Q = StringPropertyInvoker.b(asp_2.a((String)((Object)TargetHUD.b("u", (int)5586, (long)(0x364245A694DDCCBAL ^ l4)))), new String[]{TargetHUD.b("u", (int)15382, (long)(0x6F5081F38547E54CL ^ l4)), TargetHUD.b("u", (int)30389, (long)(0xC2D677534332FF0L ^ l4)), TargetHUD.b("u", (int)27714, (long)(0xFFF619773CF3528L ^ l4))});
        this.V = asp_2.b(P8.d(aol_1.b(new Color(150, 200, 0, 255))));
        this.af = asp_2.b(P8.d(aol_1.b(new Color(150, 200, 0, 255))));
        this.P = asp_2.b(P8.d(aol_1.b(new Color(200, 150, 0, 255))));
        this.K = asp_2.d();
        this.I = StringPropertyInvoker.b(asp_2.a((String)((Object)TargetHUD.b("u", (int)15737, (long)(0x558440B59C23E436L ^ l4)))), new String[]{TargetHUD.b("u", (int)22493, (long)(0x4E8397AA927A0E9DL ^ l4)), TargetHUD.b("u", (int)22255, (long)(0x788C4EEE795D8FA4L ^ l4))});
        this.R = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(6)), P8.d(4)), P8.d(16));
        this.S = asp_2.d();
        this.J = asp_2.c();
        ManagerInvoker.put(new Setting((String)((Object)TargetHUD.b("u", (int)30724, (long)(0x31F0946D8E0EA145L ^ l4))), (String)((Object)TargetHUD.b("u", (int)494, (long)(0x6D14B1B204565881L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.ab));
        ManagerInvoker.put(new Setting((String)((Object)TargetHUD.b("u", (int)14133, (long)(0x15594C54610BEE6DL ^ l4))), (String)((Object)TargetHUD.b("u", (int)5335, (long)(0x30F3095D5D84D9FL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.J));
        ManagerInvoker.put(new Setting((String)((Object)TargetHUD.b("u", (int)8934, (long)(0x40DDC5AEE927FBB2L ^ l4))), (String)((Object)TargetHUD.b("u", (int)2679, (long)(0x6D11F3DA86135335L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.ae, 5.0, this::lambda$new$0));
        ManagerInvoker.put(new Setting((String)((Object)TargetHUD.b("u", (int)22942, (long)(0xAE962CC64C380D2L ^ l4))), (String)((Object)TargetHUD.b("u", (int)15849, (long)(0x4380A9AB5FAB648CL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.X, 1.0, this::lambda$new$1));
        ManagerInvoker.put(new Setting((String)((Object)TargetHUD.b("u", (int)3660, (long)(0xEE4F8C0E39D570AL ^ l4))), (String)((Object)TargetHUD.b("u", (int)23653, (long)(0x53364F51EA550509L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.S, this::lambda$new$2));
        ManagerInvoker.put(new Setting((String)((Object)TargetHUD.b("u", (int)15247, (long)(0x97FE6442BFBE2D6L ^ l4))), (String)((Object)TargetHUD.b("u", (int)16714, (long)(0x5CAF57FFCDA0180DL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.ad, 1.0, this::lambda$new$3));
        ManagerInvoker.put(new Setting((String)((Object)TargetHUD.b("u", (int)32184, (long)(0x4A1F2BFA6A2324E5L ^ l4))), (String)((Object)TargetHUD.b("u", (int)31256, (long)(0x2050AF498B27A346L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.Q));
        ManagerInvoker.put(new Setting((String)((Object)TargetHUD.b("u", (int)5392, (long)(0x2DC75FD96BE5CC77L ^ l4))), (String)((Object)TargetHUD.b("u", (int)8722, (long)(0x6C91E6CB5794FB49L ^ l4))), SettingType.COLOR_PICKER, (AbstractModule)this, this.V, null, this::lambda$new$4));
        ManagerInvoker.put(new Setting((String)((Object)TargetHUD.b("u", (int)8387, (long)(0x2B3578670B8479A8L ^ l4))), (String)((Object)TargetHUD.b("u", (int)4363, (long)(0xF1B0DE603F4C854L ^ l4))), SettingType.COLOR_PICKER, (AbstractModule)this, this.af, null, this::lambda$new$5));
        ManagerInvoker.put(new Setting((String)((Object)TargetHUD.b("u", (int)2609, (long)(0x20022EF2B6BE5366L ^ l4))), (String)((Object)TargetHUD.b("u", (int)19700, (long)(0x1D2CF49E858B15BAL ^ l4))), SettingType.COLOR_PICKER, (AbstractModule)this, this.P, null, this::lambda$new$6));
        ManagerInvoker.put(new Setting((String)((Object)TargetHUD.b("u", (int)8222, (long)(0x2A3E4A4E838AF94FL ^ l4))), (String)((Object)TargetHUD.b("u", (int)16281, (long)(0x2669A3D8BA466D0L ^ l4))), SettingType.SELECTBOX, (AbstractModule)this, this.ac, this::lambda$new$7));
        ManagerInvoker.put(new Setting((String)((Object)TargetHUD.b("u", (int)14438, (long)(0x452C997AD1D8E12BL ^ l4))), (String)((Object)TargetHUD.b("u", (int)25698, (long)(0x5FA9B5DFC7893D30L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.K));
        ManagerInvoker.put(new Setting((String)((Object)TargetHUD.b("u", (int)30842, (long)(0x51D3BE9A7E262126L ^ l4))), (String)((Object)TargetHUD.b("u", (int)7232, (long)(0x214BE81F5502C50AL ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.I, this::lambda$new$8));
        ManagerInvoker.put(new Setting((String)((Object)TargetHUD.b("u", (int)29939, (long)(0x35B4A9AEC8F12DB7L ^ l4))), (String)((Object)TargetHUD.b("u", (int)1940, (long)(0x349D929688C9DED7L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.R, 1.0, this.K::get));
        if (ListInvoker.b() != null) {
            KillAura.b(new int[3]);
        }
    }

    static Minecraft u(TargetHUD targetHUD) {
        return targetHUD.mc;
    }

    public void f() {
        KillAura.w();
        if (StringPropertyInvoker.isMode(this.ab, qi_2.k)) {
            this.N.d();
        }
        if (StringPropertyInvoker.isMode(this.ab, qi_2.x)) {
            this.Z.d();
        }
        if (StringPropertyInvoker.isMode(this.ab, qi_2.z)) {
            this.U.c();
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_l" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x574C;
        if (eb[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])ib.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                ib.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_l", exception);
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

    private Boolean lambda$new$1() {
        KillAura.w();
        return auk_2.b(!StringPropertyInvoker.isMode(this.ab, qi_2.F));
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = TargetHUD.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    static IntProperty o(TargetHUD targetHUD) {
        return targetHUD.ae;
    }

    static eu_0 q(TargetHUD targetHUD) {
        return targetHUD.V;
    }

    public void b() {
        KillAura.w();
        if (StringPropertyInvoker.isMode(this.ab, qi_2.l)) {
            this.N.c();
        }
        if (StringPropertyInvoker.isMode(this.ab, qi_2.v)) {
            this.Z.e();
        }
        if (StringPropertyInvoker.isMode(this.ab, qi_2.m)) {
            this.U.a();
        }
    }

    public void d() {
        KillAura.w();
        if (StringPropertyInvoker.isMode(this.ab, qi_2.C)) {
            this.N.a();
        }
        if (StringPropertyInvoker.isMode(this.ab, qi_2.p)) {
            this.Z.b();
        }
        if (StringPropertyInvoker.isMode(this.ab, qi_2.n)) {
            this.U.d();
        }
    }

    static eu_0 i(TargetHUD targetHUD) {
        return targetHUD.af;
    }

    public void a(RenderGuiEvent renderGuiEvent) {
        KillAura.w();
        if (StringPropertyInvoker.isMode(this.ab, qi_2.A)) {
            this.N.a(renderGuiEvent);
        }
        if (StringPropertyInvoker.isMode(this.ab, qi_2.s)) {
            this.Z.a(renderGuiEvent);
        }
        if (StringPropertyInvoker.isMode(this.ab, qi_2.o)) {
            this.U.a(renderGuiEvent);
        }
    }

    static ListProperty w(TargetHUD targetHUD) {
        return targetHUD.ac;
    }

    static Minecraft A(TargetHUD targetHUD) {
        return targetHUD.mc;
    }

    static Minecraft k(TargetHUD targetHUD) {
        return targetHUD.mc;
    }

    @EventTarget
    public void b(Render2DEvent render2DEvent) {
        KillAura.w();
        if (this.h()) {
            if (!this.ag) {
                this.b();
            }
            this.d();
            this.ag = true;
        }
        if (this.ag && !(this.mc.currentScreen instanceof GuiChat)) {
            this.f();
            this.d();
            this.ag = false;
        }
        this.c();
    }

    @EventTarget
    public void a(PlayerUpdateEvent playerUpdateEvent) {
        KillAura.w();
        if (this.h()) {
            this.a(atH.h(this.aa));
        }
    }

    private Boolean lambda$new$4() {
        KillAura.w();
        return auk_2.b(!StringPropertyInvoker.isMode(this.Q, qi_2.q));
    }

    private boolean h() {
        KillAura.w();
        return (atH.m(this.aa) || atH.b(this.aa)) && atH.h(this.aa) != null;
    }

    static Minecraft C(TargetHUD targetHUD) {
        return targetHUD.mc;
    }

    @EventTarget
    public void b(RenderGuiEvent renderGuiEvent) {
        this.a(renderGuiEvent);
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

    @Override
    public void w() {
        this.f();
    }

    static boolean b(TargetHUD targetHUD) {
        return targetHUD.h();
    }

    static BooleanProperty d(TargetHUD targetHUD) {
        return targetHUD.K;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(TargetHUD.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


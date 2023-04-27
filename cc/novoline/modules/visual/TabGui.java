/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.checkerframework.checker.nullness.qual.Nullable
 *  org.lwjgl.opengl.GL11
 */
package cc.novoline.modules.visual;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.KeyPressEvent;
import cc.novoline.events.events.Render2DEvent;
import cc.novoline.events.events.RenderGuiEvent;
import cc.novoline.events.events.ShaderEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.visual.HUD;
import deobf.IntProperty;
import deobf.ModuleRegistry;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.awt.Color;
import java.awt.Dimension;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.lwjgl.opengl.GL11;

public class TabGui
extends AbstractModule {
    private static String[] Y;
    private static long X;
    private int M;
    @Property(value="blur")
    private BooleanProperty L;
    private Dimension S;
    private static String[] Z;
    @Property(value="height")
    private IntProperty P;
    private int K;
    private int T;
    private int V;
    @Property(value="padding")
    private IntProperty Q;
    private static Map ab;
    private int W;
    @Property(value="hide-on-debug")
    private BooleanProperty H;
    private int R;
    public List<XJ> J;
    @Property(value="alpha")
    private IntProperty N;
    @Property(value="font-size")
    private IntProperty U;
    @Property(value="smoothness")
    private IntProperty O;
    private boolean I;

    public List<XJ> e() {
        return this.J;
    }

    public void a(float f, float f2, float f3, float f4, int n) {
        arn_1.a(f, f2, f3, f4, n);
    }

    static {
        X = a1c.a(-6821240372344453826L, -7961885541804219009L, MethodHandles.lookup().lookupClass()).a(205900707395136L);
        ab = new HashMap(13);
        long l4 = X ^ 0x338D06D1FD57L;
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

    public int b() {
        return this.W;
    }

    @EventTarget
    public void a(Render2DEvent render2DEvent) {
        HUD.j();
        if (!ListInvoker.isEmpty(this.J) && this.a(auk_2.a((Boolean)Ba.b(this.H)))) {
            GL11.glPushMatrix();
            ua_2.a(true);
            float f = 0.0f;
            float f2 = this.d();
            float f3 = this.f();
            float f4 = 6 * this.a();
            this.a(f, f2, f3, f4);
            ListInvoker.forEach(this.J, XJ::a);
            GL11.glPopMatrix();
        }
    }

    public int f() {
        return this.a(vj_1.a) + 15;
    }

    public void a(String string, double d, double d2, int n) {
        HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        cw_2.b(hUD, P8.b((Integer)adt_2.a(this.U)), string, d, d2, n);
    }

    public void a(float f, float f2, float f3, float f4) {
        aV3.a(aV3.a(), (double)f, (double)f2, (double)f3, (double)f4, 0.0, (double)P8.b((Integer)adt_2.a(this.O)), new Color(0, 0, 0, P8.b((Integer)adt_2.a(this.N))), true);
    }

    public int j() {
        return this.V;
    }

    @EventTarget
    public void a(ShaderEvent shaderEvent) {
        HUD.j();
        if (!ListInvoker.isEmpty(this.J) && this.a(auk_2.a((Boolean)Ba.b(this.H))) && auk_2.a((Boolean)Ba.b(this.L))) {
            double d = ua_2.a(true);
            float f = 0.0f;
            float f2 = this.d();
            float f3 = this.f();
            float f4 = this.d() + 6 * this.a();
            this.a(f, f2, f3, f4, hb_2.a(asx_1.BLACK));
            GL11.glScaled((double)(1.0 / d), (double)(1.0 / d), (double)(1.0 / d));
        }
    }

    @EventTarget
    public void a(RenderGuiEvent renderGuiEvent) {
        block5: {
            block7: {
                int n;
                int n2;
                block6: {
                    HUD.j();
                    if (!(HN.d(renderGuiEvent) instanceof GuiChat) || !this.a(auk_2.a((Boolean)Ba.b(this.H)))) break block5;
                    n2 = ua_2.a(HN.b(renderGuiEvent));
                    n = ua_2.b(HN.a(renderGuiEvent));
                    int n3 = this.d();
                    if (HN.c(renderGuiEvent) != alw_0.CLICK) break block6;
                    if (!this.a(n2, n) || HN.e(renderGuiEvent) != 0) break block5;
                    this.M = n3 - n;
                    this.I = true;
                }
                if (HN.c(renderGuiEvent) != alw_0.RENDER) break block7;
                if (this.I) {
                    adt_2.b(this.P, P8.d(MathHelper.a(this.M + n, P8.b((Integer)adt_2.b(this.P)), P8.b((Integer)adt_2.c(this.P)))));
                }
                if (!this.a(n2, n)) break block5;
                GL11.glPushMatrix();
                ua_2.a(true);
                a1V.a(0.0f, this.d(), this.f(), this.d() + 6 * this.a(), 2.5f, hb_2.a(asx_1.WHITE), hb_2.a(0, 0, 0, 100));
                GL11.glPopMatrix();
            }
            if (HN.c(renderGuiEvent) == alw_0.RELEASE && HN.e(renderGuiEvent) == 0) {
                this.I = false;
            }
        }
    }

    public int d() {
        return P8.b((Integer)adt_2.a(this.P));
    }

    public int i() {
        return P8.b((Integer)adt_2.a(this.Q));
    }

    private @Nullable XJ c() {
        return (XJ)oc_1.a(aMF.b(aMF.b(ListInvoker.stream(this.J), XJ::g)), null);
    }

    public int k() {
        return this.R;
    }

    @Override
    public void w() {
        ListInvoker.clear(this.J);
    }

    private boolean a(boolean bl) {
        HUD.t();
        return !bl || !this.mc.gameSettings.ar;
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x4EDD;
        if (Z[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])ab.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                ab.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/aCn", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return Z[n2];
    }

    @Override
    public void o() {
        EnumModuleType[] enumModuleTypeArray = EnumModuleType.values();
        HUD.t();
        int n = enumModuleTypeArray.length;
        int n2 = 0;
        if (n2 < n) {
            EnumModuleType enumModuleType = enumModuleTypeArray[n2];
            ListInvoker.add(this.J, new XJ(this, enumModuleType));
            ++n2;
        }
    }

    public int a(String string) {
        HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        return cw_2.a(hUD, P8.b((Integer)adt_2.a(this.U)), string);
    }

    @EventTarget
    public void a(KeyPressEvent keyPressEvent) {
        Setting setting;
        int n = aO3.b(keyPressEvent);
        XJ xJ = this.c();
        HUD.t();
        boolean bl = lx_1.c((XJ)UY.b(xJ));
        aWH aWH2 = lx_1.d(xJ);
        boolean bl2 = agh_1.b(aWH2);
        aiy_0 aiy_02 = agh_1.e(aWH2);
        if (aiy_02 != null) {
            setting = a3u_0.b(aiy_02);
        }
        setting = null;
        switch (n) {
            case 28: {
                if (!bl) break;
                if (bl2) {
                    if (ahg_0.v((Setting)UY.b(setting)) == SettingType.CHECKBOX) {
                        Ba.a(ahg_0.l(setting));
                    }
                    aS4 aS42 = a3u_0.d(aiy_02);
                    switch (aG2.a[ahg_0.v(setting).ordinal()]) {
                        case 1: {
                            ahg_0.a(setting, aqe_2.c(aS42));
                        }
                        case 2: {
                            if (ListInvoker.contains(ahg_0.o(setting), aqe_2.c(aS42))) {
                                ListInvoker.remove(ahg_0.o(setting), aqe_2.c(aS42));
                            }
                            ListInvoker.add(ahg_0.o(setting), aqe_2.c(aS42));
                        }
                    }
                }
                agh_1.d(aWH2).d();
            }
            case 200: {
                if (!bl) {
                    if (this.W == 0) {
                        this.W = ListInvoker.size(this.J) - 1;
                    }
                    --this.W;
                }
                if (!bl2) {
                    if (this.R == 0) {
                        this.R = ListInvoker.size(lx_1.a(xJ)) - 1;
                    }
                    --this.R;
                }
                if (!a3u_0.e((aiy_0)UY.b(aiy_02))) {
                    if (this.V == 0) {
                        this.V = ListInvoker.size(agh_1.a(aWH2)) - 1;
                    }
                    --this.V;
                }
                if (ahg_0.v((Setting)UY.b(setting)) == SettingType.SLIDER) {
                    ahg_0.a(setting, db_0.a(ahg_0.x(setting) + ahg_0.t(setting)));
                }
                if (this.K == 0) {
                    this.K = ListInvoker.size(a3u_0.c(aiy_02)) - 1;
                }
                --this.K;
            }
            case 208: {
                if (!bl) {
                    if (this.W == ListInvoker.size(this.J) - 1) {
                        this.W = 0;
                    }
                    ++this.W;
                }
                if (!bl2) {
                    if (this.R == ListInvoker.size(lx_1.a(xJ)) - 1) {
                        this.R = 0;
                    }
                    ++this.R;
                }
                if (!a3u_0.e((aiy_0)UY.b(aiy_02))) {
                    if (this.V == ListInvoker.size(agh_1.a(aWH2)) - 1) {
                        this.V = 0;
                    }
                    ++this.V;
                }
                if (ahg_0.v(setting) == SettingType.SLIDER) {
                    ahg_0.a(setting, db_0.a(ahg_0.x(setting) - ahg_0.t(setting)));
                }
                if (this.K == ListInvoker.size(a3u_0.c(aiy_02)) - 1) {
                    this.K = 0;
                }
                ++this.K;
            }
            case 205: {
                if (!bl) {
                    this.R = 0;
                    lx_1.a(xJ, true);
                }
                if (!bl2 && !agh_1.g(aWH2)) {
                    this.V = 0;
                    agh_1.a(aWH2, true);
                }
                if (a3u_0.e((aiy_0)UY.b(aiy_02)) || ahg_0.v(setting) != SettingType.SELECTBOX && ahg_0.v(setting) != SettingType.COMBOBOX && ahg_0.v(setting) != SettingType.SLIDER) break;
                a3u_0.a(aiy_02, true);
            }
            case 203: {
                if (!lx_1.c(xJ)) break;
                if (agh_1.b(aWH2)) {
                    if (a3u_0.e((aiy_0)UY.b(aiy_02))) {
                        this.K = 0;
                        a3u_0.a(aiy_02, false);
                    }
                    this.V = 0;
                    agh_1.a(aWH2, false);
                }
                this.R = 0;
                lx_1.a(xJ, false);
            }
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

    public int a(int n) {
        HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        return hUD.c(n) + 1 + P8.b((Integer)adt_2.a(this.Q));
    }

    public TabGui(@NonNull ModuleManager moduleManager, EnumModuleType enumModuleType, String string, int n, String string2, long l4) {
        long l5 = ((long)n << 32 | l4 << 32 >>> 32) ^ X;
        long l6 = l5 ^ 0x35F1ED77BCF0L;
        int n2 = (int)(l6 >>> 48);
        int n3 = (int)(l6 << 16 >>> 48);
        int n4 = (int)(l6 << 32 >>> 32);
        super(moduleManager, (char)n2, enumModuleType, string, (char)n3, n4, string2);
        this.S = aj7.a(aj7.a());
        this.T = (int)(anv_0.b(this.S) / 2.0);
        this.J = new ObjectArrayList();
        this.W = 0;
        this.R = 0;
        this.V = 0;
        this.K = 0;
        this.U = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(18)), P8.d(15)), P8.d(30));
        this.Q = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(1)), P8.d(1)), P8.d(9));
        this.N = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(120)), P8.d(100)), P8.d(200));
        this.P = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(2)), P8.d(2)), P8.d(this.T));
        this.L = asp_2.a(auk_2.b(false));
        this.O = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(2)), P8.d(0)), P8.d(16));
        this.H = asp_2.c();
        ManagerInvoker.put(new Setting((String)((Object)TabGui.b("x", (int)19160, (long)(0xD5E6B248DDDE8ACL ^ l5))), (String)((Object)TabGui.b("x", (int)28903, (long)(0x21C62139781AD29EL ^ l5))), SettingType.SLIDER, (AbstractModule)this, this.U, 1.0));
        ManagerInvoker.put(new Setting((String)((Object)TabGui.b("x", (int)18710, (long)(0x7044D852B0116B68L ^ l5))), (String)((Object)TabGui.b("x", (int)3681, (long)(0x7638821EEBE2AC1BL ^ l5))), SettingType.SLIDER, (AbstractModule)this, this.Q, 1.0));
        ManagerInvoker.put(new Setting((String)((Object)TabGui.b("x", (int)14721, (long)(0x6E001CC6BB029BF9L ^ l5))), (String)((Object)TabGui.b("x", (int)6425, (long)(0x67947681AD65BB65L ^ l5))), SettingType.SLIDER, (AbstractModule)this, this.N, 5.0));
        ManagerInvoker.put(new Setting((String)((Object)TabGui.b("x", (int)3989, (long)(0xB2FF7317D66ADEEL ^ l5))), (String)((Object)TabGui.b("x", (int)28100, (long)(0x72A774056074CFB9L ^ l5))), SettingType.SLIDER, (AbstractModule)this, this.O, 1.0));
        ManagerInvoker.put(new Setting((String)((Object)TabGui.b("x", (int)29812, (long)(0x711AF23F2073D60BL ^ l5))), (String)((Object)TabGui.b("x", (int)31043, (long)(0x66F89F3208F9DB36L ^ l5))), SettingType.CHECKBOX, (AbstractModule)this, this.L));
        ManagerInvoker.put(new Setting((String)((Object)TabGui.b("x", (int)30167, (long)(0x12CB70C8BFA3D7A1L ^ l5))), (String)((Object)TabGui.b("x", (int)10001, (long)(0x24A8B51E1E3C8566L ^ l5))), SettingType.CHECKBOX, (AbstractModule)this, this.H));
    }

    private boolean a(int n, int n2) {
        HUD.t();
        return n >= 0 && n < this.f() && n2 >= this.d() && n2 < this.d() + 6 * this.a();
    }

    public int h() {
        return this.K;
    }

    public int a() {
        HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        return hUD.c(P8.b((Integer)adt_2.a(this.U))) + 1 + P8.b((Integer)adt_2.a(this.Q));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/aCn" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = TabGui.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(TabGui.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


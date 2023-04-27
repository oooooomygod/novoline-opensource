/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.visual;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.Render2DEvent;
import cc.novoline.events.events.RenderGuiEvent;
import cc.novoline.events.events.ShaderEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.invoke.SystemInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.utils.fonts.api.FontRenderer;
import cc.novoline.modules.EnumModuleType;
import deobf.IntProperty;
import deobf.ModuleRegistry;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import java.awt.Color;
import java.awt.Dimension;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import net.Ba;
import net.BooleanProperty;
import net.DoubleProperty;
import net.FloatProperty;
import net.HN;
import net.ListProperty;
import net.MD;
import net.MathHelper;
import net.ModuleManager;
import net.P8;
import net.GuiChat;
import net.StringProperty;
import net.a1V;
import net.a1c;
import net.a7l_0;
import net.a9V;
import net.aL0;
import net.aMF;
import net.aN_;
import net.aV3;
import net.aZ2;
import net.adj_1;
import net.adt_2;
import net.aer_2;
import net.aj7;
import net.alw_0;
import net.anv_0;
import net.aol_1;
import net.asp_2;
import net.asx_1;
import net.auk_2;
import net.ava_0;
import net.avj_0;
import net.axx_1;
import net.cw_2;
import net.db_0;
import net.hb_2;
import net.l9;
import net.my_0;
import net.oc_1;
import net.sj_1;
import net.ua_2;
import net.z4_0;
import org.checkerframework.checker.nullness.qual.NonNull;

public class SessionInfo
extends AbstractModule {
    @Property(value="padding")
    private DoubleProperty U;
    @Property(value="elements")
    private ListProperty<String> J;
    @Property(value="draw-icons")
    private BooleanProperty O;
    private Runnable af;
    private l9 N;
    @Property(value="pos-y")
    private DoubleProperty ag;
    private boolean ae;
    private static String[] cb;
    private double Q;
    @Property(value="glow-radius")
    private IntProperty ac;
    @Property(value="debug-hide")
    private BooleanProperty Y;
    private static String[] eb;
    private double Z;
    private double aa;
    @Property(value="roundess")
    private IntProperty S;
    @Property(value="outline-width")
    private FloatProperty P;
    @Property(value="font-size")
    private IntProperty ah;
    @Property(value="glow-alpha")
    private IntProperty K;
    private double L;
    @Property(value="ban-type")
    private BooleanProperty I;
    private double W;
    @Property(value="pos-x")
    private DoubleProperty M;
    @Property(value="shaders")
    private ListProperty<String> ad;
    private static long bb;
    @Property(value="alpha")
    private IntProperty H;
    private double T;
    private SimpleDateFormat X;
    private static Map ib;
    private Dimension R;
    @Property(value="smoothness")
    private IntProperty ab;
    @Property(value="background-type")
    private StringProperty V;

    @EventTarget
    public void a(Render2DEvent render2DEvent) {
        HUD.j();
        if (auk_2.a((Boolean)Ba.b(this.Y)) && this.mc.gameSettings.ar) {
            return;
        }
        double d = ua_2.a(true);
        HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        List<String> list = this.a();
        boolean bl = StringPropertyInvoker.isMode(cw_2.j(hUD), avj_0.a);
        int n = bl ? 20 : P8.b((Integer)adt_2.a(this.ah));
        double d2 = cw_2.a(hUD, n);
        double d3 = db_0.b((Double)MD.b(this.M));
        double d4 = db_0.b((Double)MD.b(this.ag));
        double d5 = d3;
        double d6 = d4;
        Color color = new Color(0, 0, 0, P8.b((Integer)adt_2.a(this.H)));
        double d7 = 4.0 + (!StringPropertyInvoker.isMode(this.V, avj_0.J) ? 0.08333333333333333 * (double)P8.b((Integer)adt_2.a(this.S)) : 0.0);
        String cfr_ignored_0 = (String)oc_1.b(aMF.c(ListInvoker.stream(list), aN_.a(arg_0 -> SessionInfo.lambda$onRender2D$7(hUD, n, arg_0))));
        this.aa = 6.5 * (double)n + d7 * 2.0 + (double)(auk_2.a((Boolean)Ba.b(this.O)) ? 8 : 0);
        this.L = (double)ListInvoker.size(list) * (d2 + db_0.b((Double)MD.b(this.U))) + d7 * 2.0;
        if (StringPropertyInvoker.isMode(this.V, avj_0.Q)) {
            a1V.a(d3, d4, this.aa, this.L, aol_1.b(color), 6, ava_0.b(this.ad, avj_0.j) ? this.N : null, P8.b((Integer)adt_2.a(this.ac)), P8.b((Integer)adt_2.a(this.K)));
        }
        if (StringPropertyInvoker.isMode(this.V, avj_0.c)) {
            aV3.a(aV3.a(), d3, d4, this.aa, this.L, (double)(P8.b((Integer)adt_2.a(this.S)) * 2), (double)P8.b((Integer)adt_2.a(this.ab)), color, true);
        }
        if (StringPropertyInvoker.isMode(this.V, avj_0.K)) {
            a1V.a(d3, d4, this.aa, this.L, P8.b((Integer)adt_2.a(this.S)), axx_1.a((Float)a9V.a(this.P)), aol_1.b(color), 6, ava_0.b(this.ad, avj_0.O) ? this.N : null, P8.b((Integer)adt_2.a(this.ac)), P8.b((Integer)adt_2.a(this.K)));
        }
        if (StringPropertyInvoker.isMode(this.V, avj_0.n)) {
            a1V.a(d3, d4, this.aa, this.L, (double)P8.b((Integer)adt_2.a(this.S)), aol_1.b(color));
        }
        if (ava_0.b(this.ad, avj_0.o) && !StringPropertyInvoker.isMode(this.V, avj_0.B)) {
            this.af = () -> this.lambda$onRender2D$8(d5, d6);
        }
        d3 += d7;
        d4 += d7 + 1.0 + db_0.b((Double)MD.b(this.U)) * 0.5;
        FontRenderer fontRenderer = adj_1.a(aer_2.a, n + 10);
        int n2 = 0;
        if (n2 < ListInvoker.size(list)) {
            String string = (String)ListInvoker.get(list, n2);
            String[] stringArray = StringInvoker.g(string, avj_0.A);
            String string2 = stringArray[0];
            String string3 = stringArray[1];
            String string4 = this.a(string2);
            cw_2.a(hUD, n, string2, d3 + this.aa * 0.5 - d7, d4 - 1.0, 0xFFFFFF);
            if (auk_2.a((Boolean)Ba.b(this.O))) {
                a7l_0.b(fontRenderer, string4, d3, d4 + 0.0, 0xFFFFFF, true);
            }
            cw_2.b(hUD, n, string2, d3 + (auk_2.a((Boolean)Ba.b(this.O)) ? 0.7 * (double)n + 2.0 : 0.0), d4 + (double)(!bl ? 1 : 0), 0xFFFFFF);
            cw_2.b(hUD, n, string3, d3 + this.aa - (double)cw_2.a(hUD, n, string3) - d7 * 2.0, d4 + (double)(!bl ? 1 : 0), 0xFFFFFF);
            d4 += d2 + db_0.b((Double)MD.b(this.U));
            ++n2;
        }
        ua_2.a(d);
    }

    private List<String> a() {
        ArrayList arrayList = my_0.c();
        HUD.t();
        ClickGui clickGui = (ClickGui)ModuleInvoker.isEnable(ModuleRegistry.CLICKGUI);
        Integer n = z4_0.k(clickGui);
        Integer n2 = z4_0.a(clickGui);
        Integer n3 = z4_0.g(clickGui);
        Integer n4 = z4_0.b(clickGui);
        long l4 = SystemInvoker.f() - z4_0.r(clickGui) - z4_0.i(clickGui);
        String string = aZ2.a(this.X, new Date(l4));
        ListInvoker.add(arrayList, avj_0.t);
        ListInvoker.add(arrayList, aL0.a(aL0.a(new StringBuilder(), avj_0.u), string).toString());
        if (ava_0.b(this.J, avj_0.r)) {
            ListInvoker.add(arrayList, aL0.a(aL0.a(new StringBuilder(), avj_0.e), n2).toString());
        }
        if (ava_0.b(this.J, avj_0.P)) {
            ListInvoker.add(arrayList, aL0.a(aL0.a(new StringBuilder(), avj_0.z), n).toString());
        }
        if (ava_0.b(this.J, avj_0.x)) {
            ListInvoker.add(arrayList, aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), avj_0.s), auk_2.a((Boolean)Ba.b(this.I)) ? avj_0.S : avj_0.R), avj_0.G), n3), avj_0.g), n4).toString());
        }
        return arrayList;
    }

    private Boolean lambda$new$4() {
        HUD.t();
        return auk_2.b(!StringPropertyInvoker.isMode(this.V, avj_0.l));
    }

    private Boolean lambda$new$5() {
        HUD.j();
        return auk_2.b(ava_0.b(this.ad, avj_0.F) && (StringPropertyInvoker.isMode(this.V, avj_0.H) || StringPropertyInvoker.isMode(this.V, avj_0.E)));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/aCg" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private Boolean lambda$new$6() {
        HUD.t();
        return auk_2.b(ava_0.b(this.ad, avj_0.y) && (StringPropertyInvoker.isMode(this.V, avj_0.w) || StringPropertyInvoker.isMode(this.V, avj_0.T)));
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x5B26;
        if (eb[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])ib.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                ib.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/aCg", exception);
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

    @Override
    public void o() {
        this.N = new l9();
    }

    @EventTarget
    public void a(RenderGuiEvent renderGuiEvent) {
        HUD.t();
        if (!(!(HN.d(renderGuiEvent) instanceof GuiChat) || auk_2.a((Boolean)Ba.b(this.Y)) && this.mc.gameSettings.ar)) {
            boolean bl;
            double d = ua_2.a(HN.b(renderGuiEvent));
            double d2 = ua_2.b(HN.a(renderGuiEvent));
            double d3 = db_0.b((Double)MD.b(this.M));
            double d4 = db_0.b((Double)MD.b(this.ag));
            boolean bl2 = bl = d > d3 && d <= d3 + this.aa && d2 > d4 && d2 <= d4 + this.L;
            if (HN.c(renderGuiEvent) == alw_0.CLICK) {
                if (HN.e(renderGuiEvent) == 0) {
                    // empty if block
                }
            } else if (HN.c(renderGuiEvent) == alw_0.RENDER) {
                if (this.ae) {
                    MD.b(this.M, db_0.a(MathHelper.b(this.Q + d, db_0.b((Double)MD.a(this.M)), db_0.b((Double)MD.c(this.M)))));
                    MD.b(this.ag, db_0.a(MathHelper.b(this.T + d2, db_0.b((Double)MD.a(this.ag)), db_0.b((Double)MD.c(this.ag)))));
                }
            } else if (HN.c(renderGuiEvent) == alw_0.RELEASE && HN.e(renderGuiEvent) == 0) {
                this.ae = false;
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

    public String a(String string) {
        String string2 = string;
        HUD.t();
        int n = -1;
        switch (string2.hashCode()) {
            case 67316793: {
                if (!string2.equals(avj_0.b)) break;
                n = 0;
            }
            case 72499381: {
                if (!string2.equals(avj_0.D)) break;
                n = 1;
            }
            case 2696247: {
                if (!string2.equals(avj_0.d)) break;
                n = 2;
            }
        }
        return avj_0.M;
    }

    private Boolean lambda$new$0() {
        return auk_2.b(ava_0.b(this.J, avj_0.h));
    }

    private Boolean lambda$new$3() {
        return auk_2.b(StringPropertyInvoker.isMode(this.V, avj_0.i));
    }

    private static Integer lambda$onRender2D$7(HUD hUD, int n, String string) {
        return P8.d(cw_2.a(hUD, n, string));
    }

    private Boolean lambda$new$2() {
        return auk_2.b(StringPropertyInvoker.isMode(this.V, avj_0.k));
    }

    private void lambda$onRender2D$8(double d, double d2) {
        HUD.j();
        a1V.a(d, d2, this.aa, this.L, StringPropertyInvoker.isMode(this.V, avj_0.C) ? 0.0 : (double)P8.b((Integer)adt_2.a(this.S)), hb_2.a(asx_1.BLACK));
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = SessionInfo.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    @EventTarget
    public void a(ShaderEvent shaderEvent) {
        HUD.t();
        if (auk_2.a((Boolean)Ba.b(this.Y)) && this.mc.gameSettings.ar) {
            return;
        }
        if (ava_0.b(this.ad, avj_0.v) && !StringPropertyInvoker.isMode(this.V, avj_0.N)) {
            double d = ua_2.a(true);
            sj_1.a(this.af);
            ua_2.a(d);
        }
    }

    public SessionInfo(@NonNull ModuleManager moduleManager, EnumModuleType enumModuleType, String string, long l4, String string2) {
        long l5 = (l4 = bb ^ l4) ^ 0x1E94B4017122L;
        int n = (int)(l5 >>> 48);
        int n2 = (int)(l5 << 16 >>> 48);
        int n3 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n, enumModuleType, string, (char)n2, n3, string2);
        this.X = new SimpleDateFormat((String)((Object)SessionInfo.b("p", (int)18582, (long)(0x2BBCCD27CF8532E6L ^ l4))));
        this.R = aj7.a(aj7.a());
        this.W = anv_0.a(this.R) * 0.5;
        this.Z = anv_0.b(this.R) * 0.5;
        this.M = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(10.0)), db_0.a(0.0)), db_0.a(this.W));
        this.ag = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(80.0)), db_0.a(0.0)), db_0.a(this.Z));
        this.J = ava_0.a(asp_2.a(SessionInfo.b("p", (int)28812, (long)(0x4095E453EC898AFBL ^ l4)), SessionInfo.b("p", (int)3821, (long)(0x486247A2084874AFL ^ l4))), new String[]{SessionInfo.b("p", (int)18110, (long)(0x7D255A83DA5FBCFAL ^ l4)), SessionInfo.b("p", (int)1002, (long)(0x2E1D6FB8842DF9BFL ^ l4)), SessionInfo.b("p", (int)3171, (long)(0x25953E77642E763FL ^ l4))});
        this.I = asp_2.d();
        this.O = asp_2.d();
        this.ah = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(18)), P8.d(15)), P8.d(40));
        this.U = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(0.0)), db_0.a(0.0)), db_0.a(6.0));
        this.V = StringPropertyInvoker.b(asp_2.a((String)((Object)SessionInfo.b("p", (int)25635, (long)(0x707DA2EB98149E7CL ^ l4)))), new String[]{SessionInfo.b("p", (int)15316, (long)(0x7D777B9CD3FEC19BL ^ l4)), SessionInfo.b("p", (int)22366, (long)(0x5D6E98450EAEAD04L ^ l4)), SessionInfo.b("p", (int)28193, (long)(0x4298B740C70A146BL ^ l4)), SessionInfo.b("p", (int)21235, (long)(0x66F8834FF935A88FL ^ l4))});
        this.H = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(150)), P8.d(50)), P8.d(255));
        this.S = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(0)), P8.d(0)), P8.d(12));
        this.ab = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(0)), P8.d(0)), P8.d(12));
        this.P = (FloatProperty)a9V.a((FloatProperty)a9V.b(asp_2.a(axx_1.a(2.0f)), axx_1.a(2.0f)), axx_1.a(4.0f));
        this.ad = ava_0.a(asp_2.a(SessionInfo.b("p", (int)3286, (long)(0x5759258947A87697L ^ l4))), new String[]{SessionInfo.b("p", (int)18216, (long)(0x545A4EF6E6BDBD6BL ^ l4)), SessionInfo.b("p", (int)29037, (long)(0x3D1517FBD8B38B28L ^ l4))});
        this.ac = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(12)), P8.d(5)), P8.d(30));
        this.K = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(100)), P8.d(50)), P8.d(255));
        this.Y = asp_2.d();
        this.N = new l9();
        ManagerInvoker.put(new Setting((String)((Object)SessionInfo.b("p", (int)23061, (long)(0x5ECE59BB38552046L ^ l4))), (String)((Object)SessionInfo.b("p", (int)19086, (long)(0x5A80CE6F20B8B0C6L ^ l4))), SettingType.SELECTBOX, (AbstractModule)this, this.J));
        ManagerInvoker.put(new Setting((String)((Object)SessionInfo.b("p", (int)32688, (long)(0x37ABB761E25185FBL ^ l4))), (String)((Object)SessionInfo.b("p", (int)3053, (long)(0x9ACC07A6C3971B9L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.I, this::lambda$new$0));
        ManagerInvoker.put(new Setting((String)((Object)SessionInfo.b("p", (int)7561, (long)(0x502DA6815AFAE7C7L ^ l4))), (String)((Object)SessionInfo.b("p", (int)20345, (long)(0x7E82C2D7D44D352EL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.O));
        ManagerInvoker.put(new Setting((String)((Object)SessionInfo.b("p", (int)30122, (long)(0x19642CB8EC898FEAL ^ l4))), (String)((Object)SessionInfo.b("p", (int)20356, (long)(0x320196A0D336B5C9L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.ah, 1.0));
        ManagerInvoker.put(new Setting((String)((Object)SessionInfo.b("p", (int)21127, (long)(0x79E92247A8C3A8F2L ^ l4))), (String)((Object)SessionInfo.b("p", (int)23469, (long)(0x6DE782F12A25A1DEL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.U, 0.1));
        ManagerInvoker.put(new Setting((String)((Object)SessionInfo.b("p", (int)29010, (long)(0x28FF404108CF0B09L ^ l4))), (String)((Object)SessionInfo.b("p", (int)31872, (long)(0x28D7E8CF58B986D6L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.V));
        ManagerInvoker.put(new Setting((String)((Object)SessionInfo.b("p", (int)9325, (long)(0x112CE1341564DE33L ^ l4))), (String)((Object)SessionInfo.b("p", (int)6829, (long)(0x76507AC5F8CF60F5L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.H, 5.0));
        ManagerInvoker.put(new Setting((String)((Object)SessionInfo.b("p", (int)8033, (long)(0x393F38613FAC6538L ^ l4))), (String)((Object)SessionInfo.b("p", (int)17031, (long)(0x6AC29DAF847F38D7L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.S, 1.0, this::lambda$new$1));
        ManagerInvoker.put(new Setting((String)((Object)SessionInfo.b("p", (int)25008, (long)(0xEECA9390FEB9BE2L ^ l4))), (String)((Object)SessionInfo.b("p", (int)15011, (long)(0x5B119B40480540D1L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.P, 0.2, this::lambda$new$2));
        ManagerInvoker.put(new Setting((String)((Object)SessionInfo.b("p", (int)20703, (long)(0x4D818B0FFD68AAAEL ^ l4))), (String)((Object)SessionInfo.b("p", (int)2300, (long)(0x5D1FFB59F7347288L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.ab, 1.0, this::lambda$new$3));
        ManagerInvoker.put(new Setting((String)((Object)SessionInfo.b("p", (int)27559, (long)(0x5304133F0D4F91D1L ^ l4))), (String)((Object)SessionInfo.b("p", (int)22154, (long)(0x62044F3E5A862CC3L ^ l4))), SettingType.SELECTBOX, (AbstractModule)this, this.ad, this::lambda$new$4));
        ManagerInvoker.put(new Setting((String)((Object)SessionInfo.b("p", (int)6474, (long)(0x63710407DEA7E31BL ^ l4))), (String)((Object)SessionInfo.b("p", (int)4029, (long)(0x3ABA3AA269C175F1L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.ac, 1.0, this::lambda$new$5));
        ManagerInvoker.put(new Setting((String)((Object)SessionInfo.b("p", (int)9861, (long)(0x797F19A20FB8DCF8L ^ l4))), (String)((Object)SessionInfo.b("p", (int)9751, (long)(0x158203AE04D4DC4AL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.K, 5.0, this::lambda$new$6));
        ManagerInvoker.put(new Setting((String)((Object)SessionInfo.b("p", (int)2670, (long)(0x6BFAAA4033EC7028L ^ l4))), (String)((Object)SessionInfo.b("p", (int)25643, (long)(0x71A39E149D649E6CL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.Y));
    }

    static {
        bb = a1c.a(8495028621313116140L, -3269310657800472622L, MethodHandles.lookup().lookupClass()).a(275259850023302L);
        ib = new HashMap(13);
        long l4 = bb ^ 0x72821930AB2EL;
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

    public SimpleDateFormat b() {
        return this.X;
    }

    private Boolean lambda$new$1() {
        HUD.j();
        return auk_2.b(!StringPropertyInvoker.isMode(this.V, avj_0.q));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(SessionInfo.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


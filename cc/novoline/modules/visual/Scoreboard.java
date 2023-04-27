/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectArrayList
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
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectArrayList;
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
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import net.DZ;
import net.DoubleProperty;
import net.FloatProperty;
import net.GW;
import net.HN;
import net.ListProperty;
import net.MD;
import net.MathHelper;
import net.ModuleManager;
import net.P8;
import net.QU;
import net.GuiChat;
import net.StringProperty;
import net.Team;
import net.VM;
import net.a1V;
import net.a1c;
import net.a9V;
import net.aB0;
import net.aMF;
import net.aN_;
import net.aV3;
import net.acl_0;
import net.adt_2;
import net.afi_1;
import net.agg_2;
import net.aj7;
import net.alw_0;
import net.anv_0;
import net.aod_2;
import net.aol_1;
import net.asg_0;
import net.asp_2;
import net.asx_1;
import net.auk_2;
import net.ava_0;
import net.axx_1;
import net.cw_2;
import net.db_0;
import net.hb_2;
import net.hs_0;
import net.ms_0;
import net.my_0;
import net.oc_1;
import net.pp_1;
import net.sd_1;
import net.sj_1;
import net.ua_2;
import net.za_2;
import org.checkerframework.checker.nullness.qual.NonNull;

public class Scoreboard
extends AbstractModule {
    @Property(value="pos-y")
    private DoubleProperty U;
    @Property(value="glow-radius")
    private IntProperty S;
    private double Q;
    private double Z;
    private static String[] eb;
    private double O;
    @Property(value="smoothness")
    private IntProperty J;
    @Property(value="background-type")
    private StringProperty I;
    @Property(value="alpha")
    private IntProperty Y;
    @Property(value="roundess")
    private IntProperty N;
    @Property(value="outline-width")
    private FloatProperty M;
    private static long bb;
    private boolean H;
    @Property(value="shaders")
    private ListProperty<String> T;
    @Property(value="pos-x")
    private DoubleProperty X;
    private double ab;
    private Runnable L;
    private double aa;
    private static String[] cb;
    private double V;
    @Property(value="padding")
    private DoubleProperty K;
    private static Map ib;
    @Property(value="glow-alpha")
    private IntProperty P;
    private Dimension W;
    @Property(value="font-size")
    private IntProperty R;

    @Override
    public void o() {
    }

    private static boolean lambda$getLines$6(QU qU) {
        HUD.j();
        return hs_0.c(qU) != null && !StringInvoker.e(hs_0.c(qU), pp_1.t);
    }

    private Boolean lambda$new$1() {
        return auk_2.b(StringPropertyInvoker.isMode(this.I, pp_1.G));
    }

    @EventTarget
    public void a(ShaderEvent shaderEvent) {
        HUD.t();
        if (ava_0.b(this.T, pp_1.i) && !StringPropertyInvoker.isMode(this.I, pp_1.h)) {
            double d = ua_2.a(true);
            sj_1.a(this.L);
            ua_2.a(d);
        }
    }

    private List<String> a(acl_0 acl_02) {
        HUD.j();
        za_2 za_22 = afi_1.e(acl_02);
        Collection collection = VM.b(za_22, acl_02);
        List list = (List)aMF.a(aMF.b(ms_0.b(collection), Scoreboard::lambda$getLines$6), aB0.a(ObjectArrayList::new));
        ArrayList arrayList = ListInvoker.size(list) > 15 ? my_0.a(DZ.a((Iterable)list, ms_0.d(collection) - 15)) : new ArrayList(list);
        List list2 = (List)aMF.a(aMF.a(ListInvoker.stream(arrayList), arg_0 -> Scoreboard.lambda$getLines$7(za_22, arg_0)), aB0.a());
        ListInvoker.add(list2, aod_2.c(acl_02.e()));
        List list3 = (List)aMF.a(aMF.a(ListInvoker.stream(list2), Scoreboard::lambda$getLines$8), aB0.a());
        asg_0.e(list3);
        return list3;
    }

    static {
        bb = a1c.a(-6835203205588010540L, -3725327124715202068L, MethodHandles.lookup().lookupClass()).a(166118535753057L);
        ib = new HashMap(13);
        long l4 = bb ^ 0x13EF71DA1B0CL;
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
        HUD.j();
        return auk_2.b(!StringPropertyInvoker.isMode(this.I, pp_1.F));
    }

    private Boolean lambda$new$3() {
        HUD.j();
        return auk_2.b(!StringPropertyInvoker.isMode(this.I, pp_1.b));
    }

    private static String lambda$getLines$7(za_2 za_22, QU qU) {
        return sd_1.a((Team)VM.c(za_22, hs_0.c(qU)), hs_0.c(qU));
    }

    private static Integer lambda$onRender2D$9(HUD hUD, int n, String string) {
        return P8.d(cw_2.a(hUD, n, string));
    }

    public Scoreboard(@NonNull ModuleManager moduleManager, EnumModuleType enumModuleType, byte by, String string, int n, int n2) {
        long l4 = ((long)by << 56 | (long)n << 32 >>> 8 | (long)n2 << 40 >>> 40) ^ bb;
        long l5 = l4 ^ 0x2D7A8058F306L;
        int n3 = (int)(l5 >>> 56);
        long l6 = l5 << 8 >>> 8;
        super((byte)n3, moduleManager, l6, enumModuleType, string);
        this.W = aj7.a(aj7.a());
        this.Z = anv_0.a(this.W) * 0.5;
        this.ab = anv_0.b(this.W) * 0.5;
        this.X = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(this.Z - 10.0)), db_0.a(0.0)), db_0.a(this.Z));
        this.U = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(this.ab * 0.5 + 100.0)), db_0.a(0.0)), db_0.a(this.ab));
        this.R = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(18)), P8.d(15)), P8.d(40));
        this.K = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(0.0)), db_0.a(0.0)), db_0.a(4.0));
        this.I = StringPropertyInvoker.b(asp_2.a((String)((Object)Scoreboard.b("a", (int)8441, (long)(0x2591DF427BEED5D2L ^ l4)))), new String[]{Scoreboard.b("a", (int)18944, (long)(0x2C1DC55483D23F27L ^ l4)), Scoreboard.b("a", (int)31532, (long)(0x1909C21E70350E17L ^ l4)), Scoreboard.b("a", (int)4501, (long)(0x4B03EA919C0C64ACL ^ l4)), Scoreboard.b("a", (int)25338, (long)(0xC5DAE45F9D797D9L ^ l4))});
        this.Y = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(150)), P8.d(50)), P8.d(255));
        this.N = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(0)), P8.d(0)), P8.d(12));
        this.J = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(0)), P8.d(0)), P8.d(12));
        this.M = (FloatProperty)a9V.a((FloatProperty)a9V.b(asp_2.a(axx_1.a(2.0f)), axx_1.a(2.0f)), axx_1.a(4.0f));
        this.T = ava_0.a(asp_2.a(Scoreboard.b("a", (int)2661, (long)(0x29492F032C577F48L ^ l4))), new String[]{Scoreboard.b("a", (int)25433, (long)(0x7F7B1C6A8A189669L ^ l4)), Scoreboard.b("a", (int)23502, (long)(0x6E8726A455442EF1L ^ l4))});
        this.S = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(12)), P8.d(5)), P8.d(30));
        this.P = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(100)), P8.d(50)), P8.d(255));
        ManagerInvoker.put(new Setting((String)((Object)Scoreboard.b("a", (int)3877, (long)(0x3BB86E9B33CA7A17L ^ l4))), (String)((Object)Scoreboard.b("a", (int)29040, (long)(0x4EA6DDF2D89C0455L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.R, 1.0));
        ManagerInvoker.put(new Setting((String)((Object)Scoreboard.b("a", (int)7478, (long)(0x60AEB2015B4B6819L ^ l4))), (String)((Object)Scoreboard.b("a", (int)9400, (long)(0x54BE34101B70D184L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.K, 0.1));
        ManagerInvoker.put(new Setting((String)((Object)Scoreboard.b("a", (int)4662, (long)(0xD0CAF0F19026707L ^ l4))), (String)((Object)Scoreboard.b("a", (int)1033, (long)(0x44FFB71B966FF12FL ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.I));
        ManagerInvoker.put(new Setting((String)((Object)Scoreboard.b("a", (int)5555, (long)(0x4474D0CE82B1609AL ^ l4))), (String)((Object)Scoreboard.b("a", (int)31730, (long)(0x6729336F13488EC8L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.Y, 5.0));
        ManagerInvoker.put(new Setting((String)((Object)Scoreboard.b("a", (int)29815, (long)(0x73C9975981C48156L ^ l4))), (String)((Object)Scoreboard.b("a", (int)25020, (long)(0x274D110E1DEB9490L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.N, 1.0, this::lambda$new$0));
        ManagerInvoker.put(new Setting((String)((Object)Scoreboard.b("a", (int)16823, (long)(0x55C8DEBBC3AFB484L ^ l4))), (String)((Object)Scoreboard.b("a", (int)8206, (long)(0x5277D8B436D95520L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.M, 0.2, this::lambda$new$1));
        ManagerInvoker.put(new Setting((String)((Object)Scoreboard.b("a", (int)12334, (long)(0x16C7EBA496F0C504L ^ l4))), (String)((Object)Scoreboard.b("a", (int)31991, (long)(0xDC978D3125709D3L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.J, 1.0, this::lambda$new$2));
        ManagerInvoker.put(new Setting((String)((Object)Scoreboard.b("a", (int)4156, (long)(0x75C706F643C9E514L ^ l4))), (String)((Object)Scoreboard.b("a", (int)7510, (long)(0x4FE5B4FEA58EE86BL ^ l4))), SettingType.SELECTBOX, (AbstractModule)this, this.T, this::lambda$new$3));
        ManagerInvoker.put(new Setting((String)((Object)Scoreboard.b("a", (int)9001, (long)(0x9ED1B711C66D611L ^ l4))), (String)((Object)Scoreboard.b("a", (int)14820, (long)(0x34A6CB74210C4CC6L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.S, 1.0, this::lambda$new$4));
        ManagerInvoker.put(new Setting((String)((Object)Scoreboard.b("a", (int)3921, (long)(0x4D9E79E7EC6EFA6FL ^ l4))), (String)((Object)Scoreboard.b("a", (int)32137, (long)(0x1870043D498108A9L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.P, 5.0, this::lambda$new$5));
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = Scoreboard.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private void lambda$onRender2D$10(double d, double d2) {
        HUD.j();
        a1V.a(d, d2, this.aa, this.Q, StringPropertyInvoker.isMode(this.I, pp_1.z) ? 0.0 : (double)P8.b((Integer)adt_2.a(this.N)), hb_2.a(asx_1.BLACK));
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

    private Boolean lambda$new$4() {
        HUD.j();
        return auk_2.b(ava_0.b(this.T, pp_1.D) && (StringPropertyInvoker.isMode(this.I, pp_1.p) || StringPropertyInvoker.isMode(this.I, pp_1.B)));
    }

    @EventTarget
    public void a(RenderGuiEvent renderGuiEvent) {
        HUD.j();
        if (HN.d(renderGuiEvent) instanceof GuiChat && GW.d(this.mc.ingameGUI) != null) {
            boolean bl;
            double d = ua_2.a(HN.b(renderGuiEvent));
            double d2 = ua_2.b(HN.a(renderGuiEvent));
            double d3 = db_0.b((Double)MD.b(this.X));
            double d4 = db_0.b((Double)MD.b(this.U));
            boolean bl2 = bl = d > (d3 -= this.aa) && d <= d3 + this.aa && d2 > d4 && d2 <= d4 + this.Q;
            if (HN.c(renderGuiEvent) == alw_0.CLICK) {
                if (HN.e(renderGuiEvent) == 0) {
                    // empty if block
                }
            } else if (HN.c(renderGuiEvent) == alw_0.RENDER) {
                if (this.H) {
                    MD.b(this.X, db_0.a(MathHelper.b(this.V + d + this.aa, db_0.b((Double)MD.a(this.X)), db_0.b((Double)MD.c(this.X)))));
                    MD.b(this.U, db_0.a(MathHelper.b(this.O + d2, db_0.b((Double)MD.a(this.U)), db_0.b((Double)MD.c(this.U)))));
                }
            } else if (HN.c(renderGuiEvent) == alw_0.RELEASE && HN.e(renderGuiEvent) == 0) {
                this.H = false;
            }
        }
    }

    private Boolean lambda$new$5() {
        HUD.t();
        return auk_2.b(ava_0.b(this.T, pp_1.n) && (StringPropertyInvoker.isMode(this.I, pp_1.d) || StringPropertyInvoker.isMode(this.I, pp_1.E)));
    }

    @EventTarget
    public void a(Render2DEvent render2DEvent) {
        HUD.j();
        if (GW.d(this.mc.ingameGUI) == null) {
            return;
        }
        List<String> list = this.a(GW.d(this.mc.ingameGUI));
        if (ListInvoker.size(list) < 2) {
            return;
        }
        double d = ua_2.a(true);
        HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        int n = P8.b((Integer)adt_2.a(this.R));
        double d2 = db_0.b((Double)MD.b(this.X));
        double d3 = db_0.b((Double)MD.b(this.U));
        double d4 = cw_2.a(hUD, n);
        String string = (String)oc_1.b(aMF.c(ListInvoker.stream(list), aN_.a(arg_0 -> Scoreboard.lambda$onRender2D$9(hUD, n, arg_0))));
        Color color = new Color(0, 0, 0, P8.b((Integer)adt_2.a(this.Y)));
        double d5 = 4.0 + (!StringPropertyInvoker.isMode(this.I, pp_1.v) ? 0.08333333333333333 * (double)P8.b((Integer)adt_2.a(this.N)) : 0.0);
        this.aa = (double)MathInvoker.max(cw_2.a(hUD, n, pp_1.l), cw_2.a(hUD, n, string)) + d5 * 2.0;
        this.Q = (double)ListInvoker.size(list) * (d4 + db_0.b((Double)MD.b(this.K))) + d5 * 2.0;
        double d6 = d2 -= this.aa;
        double d7 = d3;
        if (StringPropertyInvoker.isMode(this.I, pp_1.a)) {
            a1V.a(d2, d3, this.aa, this.Q, aol_1.b(color), 6, ava_0.b(this.T, pp_1.s) ? agg_2.c() : null, P8.b((Integer)adt_2.a(this.S)), P8.b((Integer)adt_2.a(this.P)));
        }
        if (StringPropertyInvoker.isMode(this.I, pp_1.A)) {
            a1V.a(d2, d3, this.aa, this.Q, (double)P8.b((Integer)adt_2.a(this.N)), aol_1.b(color));
        }
        if (StringPropertyInvoker.isMode(this.I, pp_1.o)) {
            aV3.a(aV3.a(), d2, d3, this.aa, this.Q, (double)(P8.b((Integer)adt_2.a(this.N)) * 2), (double)P8.b((Integer)adt_2.a(this.J)), color, true);
        }
        if (StringPropertyInvoker.isMode(this.I, pp_1.w)) {
            a1V.a(d2, d3, this.aa, this.Q, P8.b((Integer)adt_2.a(this.N)), axx_1.a((Float)a9V.a(this.M)), aol_1.b(color), 6, ava_0.b(this.T, pp_1.H) ? agg_2.c() : null, P8.b((Integer)adt_2.a(this.S)), P8.b((Integer)adt_2.a(this.P)));
        }
        if (ava_0.b(this.T, pp_1.y) && !StringPropertyInvoker.isMode(this.I, pp_1.j)) {
            this.L = () -> this.lambda$onRender2D$10(d6, d7);
        }
        d2 += d5;
        d3 += d5 + 1.0 + db_0.b((Double)MD.b(this.K)) * 0.5;
        int n2 = 0;
        if (n2 < ListInvoker.size(list)) {
            if (n2 == ListInvoker.size(list) - 1) {
                cw_2.a(hUD, n, pp_1.g, d2 + this.aa * 0.5 - (double)cw_2.a(hUD, n, pp_1.f) * 0.5 - d5, d3);
            }
            String string2 = (String)ListInvoker.get(list, n2);
            cw_2.a(hUD, n, string2, d2 + this.aa * 0.5 - d5, d3 - 1.5, 0xDDDDDD);
            cw_2.b(hUD, n, string2, d2, d3, 0xFFFFFF);
            d3 += d4 + db_0.b((Double)MD.b(this.K));
            ++n2;
        }
        ua_2.a(d);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/aCI" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private Boolean lambda$new$2() {
        return auk_2.b(StringPropertyInvoker.isMode(this.I, pp_1.I));
    }

    private static String lambda$getLines$8(String string) {
        return StringInvoker.a(StringInvoker.a(StringInvoker.a(string, (CharSequence)pp_1.u, (CharSequence)pp_1.q), (CharSequence)pp_1.x, (CharSequence)pp_1.c), (CharSequence)pp_1.r, (CharSequence)pp_1.C);
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x211B;
        if (eb[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])ib.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                ib.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/aCI", exception);
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Scoreboard.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.visual;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.Render2DEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.visual.HUD;
import deobf.MCInvoker;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import java.awt.Color;
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

import org.checkerframework.checker.nullness.qual.NonNull;

public class Crosshair
extends AbstractModule {
    private double K;
    @Property(value="width")
    private DoubleProperty J;
    @Property(value="gap")
    private DoubleProperty M;
    @Property(value="sise")
    private DoubleProperty P;
    private static String[] S;
    @Property(value="dot")
    private BooleanProperty H;
    @Property(value="dynamic")
    private BooleanProperty N;
    private static Map T;
    @Property(value="length")
    private DoubleProperty I;
    @Property(value="color")
    private eu_0 O;
    private static String[] R;
    @Property(value="color-mode")
    private StringProperty L;
    private static long Q;

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_T" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = Crosshair.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    @EventTarget
    public void a(Render2DEvent render2DEvent) {
        double d;
        HUD.j();
        ScaledResolution scaledResolution = uc_0.a(render2DEvent);
        Color color = StringPropertyInvoker.isMode(this.L, aql_0.b) ? aUL.c(this.O) : new Color(hb_2.a(0L));
        double d2 = ScaledResolutionInvoker.f(scaledResolution) / 2.0;
        double d3 = ScaledResolutionInvoker.c(scaledResolution) / 2.0;
        double d4 = ua_2.a(true);
        double d5 = 2000 / MCInvoker.O(this.mc);
        if (auk_2.a((Boolean)Ba.b(this.N))) {
            d = PlayerInvoker.n(this.mc.player) * 5.0;
            if (this.K < d) {
                this.K = MathHelper.b(this.K + 0.025 * d5, 0.0, d);
            }
            if (this.K > d) {
                this.K = MathHelper.b(this.K - 0.025 * d5, d, 999.0);
            }
        }
        this.K = 0.0;
        if (auk_2.a((Boolean)Ba.b(this.H))) {
            d = db_0.b((Double)MD.b(this.P)) + this.K;
            aV3.a(aV3.a(), d2, d3, d, 2.0, color, true);
        }
        d = db_0.b((Double)MD.b(this.J));
        double d6 = db_0.b((Double)MD.b(this.I));
        double d7 = db_0.b((Double)MD.b(this.M)) + this.K;
        aV3.a(aV3.a(), d2 + d7 + 1.0, d3, d6, 1.0, 0.0, d, color, true);
        aV3.a(aV3.a(), d2 - d6 - d7, d3, d6, 1.0, 0.0, d, color, true);
        aV3.a(aV3.a(), d2, d3 + d7 + 1.0, 1.0, d6, 0.0, d, color, true);
        aV3.a(aV3.a(), d2, d3 - d6 - d7, 1.0, d6, 0.0, d, color, true);
        ua_2.a(d4);
    }

    private Boolean lambda$new$3() {
        HUD.t();
        return auk_2.b(!auk_2.a((Boolean)Ba.b(this.H)));
    }

    public Crosshair(@NonNull ModuleManager moduleManager, int n, int n2, EnumModuleType enumModuleType, String string, short s) {
        long l4 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)s << 48 >>> 48) ^ Q;
        long l5 = l4 ^ 0x1118450AD2E6L;
        int n3 = (int)(l5 >>> 56);
        long l6 = l5 << 8 >>> 8;
        super((byte)n3, moduleManager, l6, enumModuleType, string);
        this.L = StringPropertyInvoker.b(asp_2.a((String)((Object)Crosshair.b("o", (int)26014, (long)(0x57F3C5AA6F0F3240L ^ l4)))), new String[]{Crosshair.b("o", (int)13059, (long)(0x27E5C70CF18764C7L ^ l4)), Crosshair.b("o", (int)12437, (long)(0x61CF33B44EC9E754L ^ l4))});
        this.O = asp_2.b(P8.d(aol_1.b(Color.CYAN)));
        this.J = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(1.0)), db_0.a(0.5)), db_0.a(2.0));
        this.M = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(4.0)), db_0.a(1.0)), db_0.a(8.0));
        this.I = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(5.0)), db_0.a(2.0)), db_0.a(16.0));
        this.H = asp_2.c();
        this.P = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(4.0)), db_0.a(2.0)), db_0.a(8.0));
        this.N = asp_2.c();
        ManagerInvoker.put(new Setting((String)((Object)Crosshair.b("o", (int)11296, (long)(0x1C2416F747FEFBEFL ^ l4))), (String)((Object)Crosshair.b("o", (int)23264, (long)(0x48C4E0DB92FA0D23L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.L));
        ManagerInvoker.put(new Setting((String)((Object)Crosshair.b("o", (int)4074, (long)(0x31C45E3538D824L ^ l4))), (String)((Object)Crosshair.b("o", (int)5987, (long)(0x4EC6106BBAC640A5L ^ l4))), SettingType.COLOR_PICKER, (AbstractModule)this, this.O, null, this::lambda$new$0));
        ManagerInvoker.put(new Setting((String)((Object)Crosshair.b("o", (int)31552, (long)(0x2670B2ABD9EAC80L ^ l4))), (String)((Object)Crosshair.b("o", (int)13465, (long)(0xBF8F8179F6AE352L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.H));
        ManagerInvoker.put(new Setting((String)((Object)Crosshair.b("o", (int)1559, (long)(0x69DB814743AED1CAL ^ l4))), (String)((Object)Crosshair.b("o", (int)8630, (long)(0x641AA0AD182F7669L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.P, 0.5, this::lambda$new$1));
        ManagerInvoker.put(new Setting((String)((Object)Crosshair.b("o", (int)26997, (long)(0x3514AB8EB1553EBFL ^ l4))), (String)((Object)Crosshair.b("o", (int)1147, (long)(0x267505FD22DCD3BCL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.J, 0.1, this::lambda$new$2));
        ManagerInvoker.put(new Setting((String)((Object)Crosshair.b("o", (int)24882, (long)(0x4D113D63F801B6FEL ^ l4))), (String)((Object)Crosshair.b("o", (int)27787, (long)(0x94BFC99B4BEBB42L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.M, 0.5, this::lambda$new$3));
        ManagerInvoker.put(new Setting((String)((Object)Crosshair.b("o", (int)17300, (long)(0x669E8B3A8C24145CL ^ l4))), (String)((Object)Crosshair.b("o", (int)13063, (long)(0x1D5AA6589D95E4C2L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.I, 0.5, this::lambda$new$4));
        ManagerInvoker.put(new Setting((String)((Object)Crosshair.b("o", (int)2767, (long)(0x30AF92D6FBF4DD02L ^ l4))), (String)((Object)Crosshair.b("o", (int)6622, (long)(0x17937785B17F4E1CL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.N));
    }

    private Boolean lambda$new$2() {
        HUD.j();
        return auk_2.b(!auk_2.a((Boolean)Ba.b(this.H)));
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x221C;
        if (S[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])T.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                T.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_T", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return S[n2];
    }

    private Boolean lambda$new$1() {
        return (Boolean)Ba.b(this.H);
    }

    static {
        Q = a1c.a(8498103941005601694L, 8975137824862523065L, MethodHandles.lookup().lookupClass()).a(165532436098479L);
        T = new HashMap(13);
        long l4 = Q ^ 0x67DC11EA4F2BL;
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

    private Boolean lambda$new$4() {
        HUD.j();
        return auk_2.b(!auk_2.a((Boolean)Ba.b(this.H)));
    }

    private Boolean lambda$new$0() {
        return auk_2.b(StringPropertyInvoker.isMode(this.L, aql_0.a));
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Crosshair.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


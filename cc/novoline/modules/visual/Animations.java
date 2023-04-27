/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.visual;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.Render2DEvent;
import cc.novoline.events.events.TickUpdateEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import deobf.IntProperty;
import deobf.MCInvoker;
import deobf.ModuleRegistry;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
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
import net.Ba;
import net.BooleanProperty;
import net.DoubleProperty;
import net.FloatProperty;
import net.KillAura;
import net.MD;
import net.ModuleManager;
import net.P8;
import net.StringProperty;
import net.a1c;
import net.a9V;
import net.adt_2;
import net.asp_2;
import net.atH;
import net.auk_2;
import net.axx_1;
import net.db_0;
import org.checkerframework.checker.nullness.qual.NonNull;

public class Animations
extends AbstractModule {
    @Property(value="rotating")
    private BooleanProperty M;
    @Property(value="type")
    private StringProperty N;
    private static String[] R;
    @Property(value="hit")
    private StringProperty I;
    private static String[] Q;
    private static Map S;
    @Property(value="block-height")
    private FloatProperty J;
    @Property(value="slowdown")
    private IntProperty K;
    private static long P;
    @Property(value="hit-height")
    private FloatProperty O;
    @Property(value="downscale-factor")
    private DoubleProperty L;
    private float H;

    public float b() {
        return this.H;
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

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = Animations.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    public StringProperty a() {
        return this.N;
    }

    @EventTarget
    public void a(Render2DEvent render2DEvent) {
        HUD.t();
        KillAura killAura = (KillAura)ModuleInvoker.isEnable(ModuleRegistry.KILLAURA);
        float f = 20.0f - (PlayerInvoker.m(this.mc.player) || atH.b(killAura) ? axx_1.a((Float)a9V.a(this.J)) : (PlayerInvoker.h(this.mc.player) == null ? 0.0f : axx_1.a((Float)a9V.a(this.O))));
        float cfr_ignored_0 = 2000 / MCInvoker.O(this.mc);
        if (this.H > f) {
            this.H -= 1.0f;
        }
        if (this.H < f) {
            this.H += 1.0f;
        }
    }

    public StringProperty e() {
        return this.I;
    }

    public boolean c() {
        return auk_2.a((Boolean)Ba.b(this.M));
    }

    public DoubleProperty d() {
        return this.L;
    }

    @Override
    public void o() {
        this.a((String)StringPropertyInvoker.b(this.N));
    }

    @EventTarget
    public void a(TickUpdateEvent tickUpdateEvent) {
        this.a((String)StringPropertyInvoker.b(this.N));
    }

    public IntProperty f() {
        return this.K;
    }

    public Animations(@NonNull int n, long l4, ModuleManager moduleManager, EnumModuleType enumModuleType, String string) {
        long l5 = ((long)n << 32 | l4 << 32 >>> 32) ^ P;
        long l6 = l5 ^ 0x468CFAE4689EL;
        int n2 = (int)(l6 >>> 56);
        long l7 = l6 << 8 >>> 8;
        super((byte)n2, moduleManager, l7, enumModuleType, string);
        this.N = StringPropertyInvoker.b(asp_2.a((String)((Object)Animations.b("d", (int)30351, (long)(0x5D572327E86B1275L ^ l5)))), new String[]{Animations.b("d", (int)18955, (long)(0x51C73D9688DB2EECL ^ l5)), Animations.b("d", (int)421, (long)(0x5331EC44DDABE547L ^ l5)), Animations.b("d", (int)15900, (long)(0x6A9FED6B01865AE1L ^ l5)), Animations.b("d", (int)11597, (long)(0x59880BDEDBA1C9B3L ^ l5)), Animations.b("d", (int)15474, (long)(0x6788F9FADB635889L ^ l5)), Animations.b("d", (int)15303, (long)(0x5800D1FE84815F2CL ^ l5)), Animations.b("d", (int)3589, (long)(0x6EFE487185BC6AEDL ^ l5)), Animations.b("d", (int)22359, (long)(0x32A46C622EFB3B8L ^ l5)), Animations.b("d", (int)362, (long)(0x55800B4959C16592L ^ l5)), Animations.b("d", (int)29860, (long)(0x1F96ED21F952104EL ^ l5)), Animations.b("d", (int)6538, (long)(0x651126FA4D77D7CL ^ l5)), Animations.b("d", (int)9324, (long)(0x217F9C08EEF64098L ^ l5)), Animations.b("d", (int)28279, (long)(0xA8FBDEAA750A9BL ^ l5)), Animations.b("d", (int)23734, (long)(0x71312A7C8BFDB85BL ^ l5)), Animations.b("d", (int)25206, (long)(0x31DC213A40B8068AL ^ l5)), Animations.b("d", (int)5631, (long)(0x3FDDEFC7B7B87100L ^ l5))});
        this.I = StringPropertyInvoker.b(asp_2.a((String)((Object)Animations.b("d", (int)23540, (long)(0x508FDECFF4DCBF1AL ^ l5)))), new String[]{Animations.b("d", (int)24590, (long)(0x73B7505E38F184EBL ^ l5)), Animations.b("d", (int)10300, (long)(0x1F26C6AB8F64CCD5L ^ l5))});
        this.K = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(0)), P8.d(-4)), P8.d(6));
        this.L = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(0.3)), db_0.a(0.0)), db_0.a(0.5));
        this.O = (FloatProperty)a9V.a((FloatProperty)a9V.b(asp_2.a(axx_1.a(10.0f)), axx_1.a(-10.0f)), axx_1.a(30.0f));
        this.J = (FloatProperty)a9V.a((FloatProperty)a9V.b(asp_2.a(axx_1.a(10.0f)), axx_1.a(0.0f)), axx_1.a(60.0f));
        this.M = asp_2.a(auk_2.b(false));
        ManagerInvoker.put(new Setting((String)((Object)Animations.b("d", (int)15826, (long)(0x53624D541338592BL ^ l5))), (String)((Object)Animations.b("d", (int)22004, (long)(0x5359433D401B313CL ^ l5))), SettingType.COMBOBOX, (AbstractModule)this, this.N));
        ManagerInvoker.put(new Setting((String)((Object)Animations.b("d", (int)5209, (long)(0x1948D881F693F0ABL ^ l5))), (String)((Object)Animations.b("d", (int)14673, (long)(0x2937850C4F7DDDA4L ^ l5))), SettingType.COMBOBOX, (AbstractModule)this, this.I));
        ManagerInvoker.put(new Setting((String)((Object)Animations.b("d", (int)5328, (long)(0xE9FF1F78CABF023L ^ l5))), (String)((Object)Animations.b("d", (int)6692, (long)(0x32744BCD18F17EC4L ^ l5))), SettingType.SLIDER, (AbstractModule)this, this.K, 1.0));
        ManagerInvoker.put(new Setting((String)((Object)Animations.b("d", (int)23039, (long)(0x4BACACC8120E3D08L ^ l5))), (String)((Object)Animations.b("d", (int)18947, (long)(0x4B12503A9C79AECAL ^ l5))), SettingType.SLIDER, (AbstractModule)this, this.L, 0.1));
        ManagerInvoker.put(new Setting((String)((Object)Animations.b("d", (int)10698, (long)(0x168B6C3F758ACD2EL ^ l5))), (String)((Object)Animations.b("d", (int)5140, (long)(0x6DD0E20B39A470E5L ^ l5))), SettingType.SLIDER, (AbstractModule)this, this.J, 1.0));
        ManagerInvoker.put(new Setting((String)((Object)Animations.b("d", (int)5496, (long)(0x35E1314A08D07188L ^ l5))), (String)((Object)Animations.b("d", (int)1753, (long)(0x6DBCD790AACAE238L ^ l5))), SettingType.SLIDER, (AbstractModule)this, this.O, 1.0));
        ManagerInvoker.put(new Setting((String)((Object)Animations.b("d", (int)14475, (long)(0x6BE11FDBF9C95C6DL ^ l5))), (String)((Object)Animations.b("d", (int)261, (long)(0x737258537C38E5E6L ^ l5))), SettingType.CHECKBOX, (AbstractModule)this, this.M));
    }

    static {
        P = a1c.a(8637142909439522821L, -1665220853979821288L, MethodHandles.lookup().lookupClass()).a(78732024154651L);
        S = new HashMap(13);
        long l4 = P ^ 0x1E0460895458L;
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

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x2B43;
        if (R[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])S.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                S.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_m", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return R[n2];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_m" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Animations.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


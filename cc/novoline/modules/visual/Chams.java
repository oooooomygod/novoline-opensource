/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.lwjgl.opengl.GL11
 */
package cc.novoline.modules.visual;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.Render2DEvent;
import cc.novoline.events.events.TickUpdateEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import deobf.Entity;
import deobf.EntityPlayer;
import cc.novoline.modules.EnumModuleType;
import deobf.EnumPlayerType;
import cc.novoline.modules.visual.HUD;
import deobf.MCInvoker;
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

import org.checkerframework.checker.nullness.qual.NonNull;
import org.lwjgl.opengl.GL11;

public class Chams
extends AbstractModule {
    @Property(value="chams-hand")
    private eu_0 K;
    private boolean M;
    private static String[] ab;
    @Property(value="colored")
    private BooleanProperty W;
    @Property(value="mode")
    private StringProperty V;
    @Property(value="visible-alpha")
    private FloatProperty Q;
    @Property(value="rainbow")
    private BooleanProperty J;
    private static Map cb;
    @Property(value="chams-material")
    private BooleanProperty H;
    hx_0 L;
    private static boolean S;
    private static long Z;
    @Property(value="shader-color")
    private eu_0 P;
    @Property(value="pulse-speed")
    private FloatProperty O;
    private static String[] bb;
    @Property(value="chams-onlyTargets")
    private BooleanProperty T;
    @Property(value="chams-visible")
    private eu_0 N;
    @Property(value="targets")
    private ListProperty<String> Y;
    @Property(value="hand")
    private BooleanProperty R;
    @Property(value="chams-hidden")
    private eu_0 X;
    private static float U;
    @Property(value="pulse")
    private BooleanProperty I;

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

    public eu_0 k() {
        return this.P;
    }

    @Override
    public void w() {
        S = false;
    }

    public eu_0 c() {
        return this.K;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = Chams.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    public boolean j() {
        HUD.j();
        return StringPropertyInvoker.isMode(this.V, amf_0.t) && auk_2.a((Boolean)Ba.b(this.W));
    }

    private Boolean lambda$new$5() {
        return auk_2.b(StringPropertyInvoker.isMode(this.V, amf_0.o));
    }

    public BooleanProperty a() {
        return this.J;
    }

    private Boolean lambda$new$7() {
        return auk_2.b(StringPropertyInvoker.isMode(this.V, amf_0.g));
    }

    private Boolean lambda$new$1() {
        HUD.j();
        return auk_2.b(!auk_2.a((Boolean)Ba.b(this.J)) && StringPropertyInvoker.isMode(this.V, amf_0.h) || StringPropertyInvoker.isMode(this.V, amf_0.a) && auk_2.a((Boolean)Ba.b(this.W)));
    }

    public ListProperty<String> b() {
        return this.Y;
    }

    private Boolean lambda$new$10() {
        return auk_2.b(StringPropertyInvoker.isMode(this.V, amf_0.b));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_K" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    public BooleanProperty h() {
        return this.R;
    }

    public BooleanProperty e() {
        return this.H;
    }

    public eu_0 i() {
        return this.N;
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x4705;
        if (bb[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])cb.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                cb.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_K", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return bb[n2];
    }

    private Boolean lambda$new$9() {
        HUD.j();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.I)) && StringPropertyInvoker.isMode(this.V, amf_0.m));
    }

    @EventTarget
    public void a(BP bP) {
        HUD.t();
        if (StringPropertyInvoker.isMode(this.V, amf_0.q) && !auk_2.a((Boolean)Ba.b(this.W)) && this.b(v0_0.f(bP))) {
            if (v0_0.b(bP) == ad3_0.PRE) {
                GL11.glEnable((int)32823);
                GL11.glPolygonOffset((float)1.0f, (float)-1100000.0f);
            }
            GL11.glDisable((int)32823);
            GL11.glPolygonOffset((float)1.0f, (float)1100000.0f);
        }
    }

    public boolean b(Entity entity) {
        HUD.j();
        return !(entity instanceof op_2) && this.a(entity) && ayj_0.a(entity) && !ayj_0.L(entity) && entity != MCInvoker.f().player && (!auk_2.a((Boolean)Ba.b(this.T)) || a8F.a(NovolineInvoker.A(NovolineInvoker.getInstance()), entity.getName(), EnumPlayerType.TARGET));
    }

    private Boolean lambda$new$6() {
        return auk_2.b(StringPropertyInvoker.isMode(this.V, amf_0.r));
    }

    private boolean a(Entity entity) {
        HUD.j();
        return ava_0.b(this.Y, amf_0.n) && entity instanceof EntityPlayer || ava_0.b(this.Y, amf_0.s) && (entity instanceof ne_2 || entity instanceof ny_1) || ava_0.b(this.Y, amf_0.i) && (entity instanceof nz_0 || entity instanceof np_1) || ava_0.b(this.Y, amf_0.j) && entity instanceof n5_0;
    }

    @EventTarget
    public void a(TickUpdateEvent tickUpdateEvent) {
        HUD.j();
        U = MathHelper.b(U, 0.0f, axx_1.a((Float)a9V.a(this.Q)));
        if (!this.M && U < axx_1.a((Float)a9V.a(this.Q))) {
            U = MathHelper.b(U + axx_1.a((Float)a9V.a(this.O)), 0.0f, axx_1.a((Float)a9V.a(this.Q)));
        }
        if (!this.M && U == axx_1.a((Float)a9V.a(this.Q))) {
            this.M = true;
        }
        if (this.M && U > 0.0f) {
            U = MathHelper.b(U - axx_1.a((Float)a9V.a(this.O)), 0.0f, axx_1.a((Float)a9V.a(this.Q)));
        }
        if (this.M && U == 0.0f) {
            this.M = false;
        }
    }

    private Boolean lambda$new$0() {
        return auk_2.b(StringPropertyInvoker.isMode(this.V, amf_0.e));
    }

    private Boolean lambda$new$2() {
        HUD.t();
        return auk_2.b(!auk_2.a((Boolean)Ba.b(this.J)) && StringPropertyInvoker.isMode(this.V, amf_0.p) || StringPropertyInvoker.isMode(this.V, amf_0.l) && auk_2.a((Boolean)Ba.b(this.W)));
    }

    private Boolean lambda$new$8() {
        HUD.j();
        return auk_2.b(!auk_2.a((Boolean)Ba.b(this.J)) && StringPropertyInvoker.isMode(this.V, amf_0.c) && auk_2.a((Boolean)Ba.b(this.R)));
    }

    @Override
    public void o() {
        S = true;
        U = 0.0f;
        this.M = false;
    }

    public eu_0 d() {
        return this.X;
    }

    private Boolean lambda$new$4() {
        return auk_2.b(StringPropertyInvoker.isMode(this.V, amf_0.d));
    }

    public float g() {
        HUD.t();
        return auk_2.a((Boolean)Ba.b(this.I)) ? U : axx_1.a((Float)a9V.a(this.Q));
    }

    private Boolean lambda$new$3() {
        return auk_2.b(StringPropertyInvoker.isMode(this.V, amf_0.f));
    }

    @EventTarget
    public void a(Render2DEvent render2DEvent) {
        HUD.t();
        if (StringPropertyInvoker.isMode(this.V, amf_0.k) && aMF.c(ListInvoker.stream(BlockInvoker.e(this.mc.world)), this::b)) {
            aim_2.a(this.L, this, render2DEvent);
        }
    }

    static {
        Z = a1c.a(-5599075686516822793L, -4088628178003945876L, MethodHandles.lookup().lookupClass()).a(216857837511670L);
        cb = new HashMap(13);
        long l4 = Z ^ 0x399B57976C79L;
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

    public Chams(@NonNull ModuleManager moduleManager, char c, short s, int n, EnumModuleType enumModuleType, String string) {
        long l4;
        long l5 = l4 = ((long)c << 48 | (long)s << 48 >>> 16 | (long)n << 32 >>> 32) ^ Z;
        long l6 = l5 ^ 0x65F3FFA70FE1L;
        int n2 = (int)(l6 >>> 56);
        long l7 = l6 << 8 >>> 8;
        long l8 = l5 ^ 0x33493DFE99E8L;
        int n3 = (int)(l8 >>> 48);
        int n4 = (int)(l8 << 16 >>> 48);
        int n5 = (int)(l8 << 32 >>> 32);
        super((byte)n2, moduleManager, l7, enumModuleType, string);
        this.V = StringPropertyInvoker.b(asp_2.a((String)((Object)Chams.b("v", (int)15207, (long)(0x14A7C9E7992954A6L ^ l4)))), new String[]{Chams.b("v", (int)6395, (long)(0x73347E4E4EB3F720L ^ l4)), Chams.b("v", (int)10423, (long)(0x31C2E6739717C765L ^ l4)), Chams.b("v", (int)1462, (long)(0xA72DE72BA546A6CL ^ l4))});
        this.N = asp_2.b(P8.d(-7697665));
        this.X = asp_2.b(P8.d(-7697665));
        this.K = asp_2.b(P8.d(-7697665));
        this.P = asp_2.b(P8.d(-7697665));
        this.Q = (FloatProperty)a9V.a((FloatProperty)a9V.b(asp_2.a(axx_1.a(255.0f)), axx_1.a(50.0f)), axx_1.a(255.0f));
        this.O = (FloatProperty)a9V.a((FloatProperty)a9V.b(asp_2.a(axx_1.a(10.0f)), axx_1.a(5.0f)), axx_1.a(20.0f));
        this.J = asp_2.c();
        this.I = asp_2.c();
        this.R = asp_2.c();
        this.Y = ava_0.a(asp_2.a(Chams.b("v", (int)20995, (long)(0x4A254264220C3DD2L ^ l4))), new String[]{Chams.b("v", (int)55, (long)(0x6A0C10F25F8CEFF0L ^ l4)), Chams.b("v", (int)27461, (long)(0x76FD33D4E6990496L ^ l4)), Chams.b("v", (int)31541, (long)(0x3505F7DB4D294FBL ^ l4)), Chams.b("v", (int)2702, (long)(0x1ADF8A217A56547L ^ l4))});
        this.T = asp_2.c();
        this.H = asp_2.c();
        this.W = asp_2.c();
        this.M = false;
        this.L = new hx_0((char)n3, (short)n4, n5);
        ManagerInvoker.put(new Setting((String)((Object)Chams.b("v", (int)21934, (long)(0x6181BBBC8B95BA7AL ^ l4))), (String)((Object)Chams.b("v", (int)29959, (long)(0x7929CF8B47489AC2L ^ l4))), SettingType.SELECTBOX, (AbstractModule)this, this.Y));
        ManagerInvoker.put(new Setting((String)((Object)Chams.b("v", (int)29352, (long)(0x1C377CB10B389D63L ^ l4))), (String)((Object)Chams.b("v", (int)1914, (long)(0x7C96D005B4A4E8B0L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.V));
        ManagerInvoker.put(new Setting((String)((Object)Chams.b("v", (int)1400, (long)(0x225380FBC6F26ABEL ^ l4))), (String)((Object)Chams.b("v", (int)5888, (long)(0x4433E847CCAA78CDL ^ l4))), SettingType.COLOR_PICKER, (AbstractModule)this, this.P, null, this::lambda$new$0));
        ManagerInvoker.put(new Setting((String)((Object)Chams.b("v", (int)7370, (long)(0x7950E0E71B4FF316L ^ l4))), (String)((Object)Chams.b("v", (int)6715, (long)(0x49360E0E4D8CF5E2L ^ l4))), SettingType.COLOR_PICKER, (AbstractModule)this, this.N, null, this::lambda$new$1));
        ManagerInvoker.put(new Setting((String)((Object)Chams.b("v", (int)31516, (long)(0x20B62EE7998B14C3L ^ l4))), (String)((Object)Chams.b("v", (int)12492, (long)(0x39BA4E968145DF1AL ^ l4))), SettingType.COLOR_PICKER, (AbstractModule)this, this.X, null, this::lambda$new$2));
        ManagerInvoker.put(new Setting((String)((Object)Chams.b("v", (int)12052, (long)(0x7E5E9B8F6EAA40E5L ^ l4))), (String)((Object)Chams.b("v", (int)27347, (long)(0x6AB86D879C240517L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.Q, 5.0, this::lambda$new$3));
        ManagerInvoker.put(new Setting((String)((Object)Chams.b("v", (int)30865, (long)(0x2E9CC0AF7BBD9751L ^ l4))), (String)((Object)Chams.b("v", (int)27846, (long)(0x5DFE6828F7D68304L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.H, this::lambda$new$4));
        ManagerInvoker.put(new Setting((String)((Object)Chams.b("v", (int)18165, (long)(0x21E5DBEE3B43292BL ^ l4))), (String)((Object)Chams.b("v", (int)26064, (long)(0x57F61FAC736E0A22L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.J, this::lambda$new$5));
        ManagerInvoker.put(new Setting((String)((Object)Chams.b("v", (int)25447, (long)(0x6700BC2028940CB2L ^ l4))), (String)((Object)Chams.b("v", (int)32650, (long)(0x429FEED7955E9049L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.I, this::lambda$new$6));
        ManagerInvoker.put(new Setting((String)((Object)Chams.b("v", (int)29941, (long)(0x46D1E38C22249B2DL ^ l4))), (String)((Object)Chams.b("v", (int)12753, (long)(0x5F3FD61A39055E1EL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.R, this::lambda$new$7));
        ManagerInvoker.put(new Setting((String)((Object)Chams.b("v", (int)18511, (long)(0x4867B3F282DC279FL ^ l4))), (String)((Object)Chams.b("v", (int)27548, (long)(0x50004D9B7C7E0450L ^ l4))), SettingType.COLOR_PICKER, (AbstractModule)this, this.K, null, this::lambda$new$8));
        ManagerInvoker.put(new Setting((String)((Object)Chams.b("v", (int)6628, (long)(0x71047FEBAF66F617L ^ l4))), (String)((Object)Chams.b("v", (int)13102, (long)(0x44ABF6F46BF05CF3L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.O, 1.0, this::lambda$new$9));
        ManagerInvoker.put(new Setting((String)((Object)Chams.b("v", (int)11155, (long)(0x9E75B42E61AC444L ^ l4))), (String)((Object)Chams.b("v", (int)12699, (long)(0x29A360AA43585E6BL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.W, this::lambda$new$10));
        ManagerInvoker.put(new Setting((String)((Object)Chams.b("v", (int)3578, (long)(0x283C6317258A6232L ^ l4))), (String)((Object)Chams.b("v", (int)13203, (long)(0x3882F519C0135C66L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.T));
    }

    public StringProperty f() {
        return this.V;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Chams.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


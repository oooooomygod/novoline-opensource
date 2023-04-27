/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.combat;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.type.State;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.MouseInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.modules.AbstractModule;
import deobf.Entity;
import deobf.EntityPlayer;
import deobf.EntityPlayerSP;
import cc.novoline.modules.EnumModuleType;
import deobf.EnumPlayerType;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import deobf.TimerUtil;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;

import org.checkerframework.checker.nullness.qual.NonNull;

public class AimAssist
extends AbstractModule {
    private static Map bb;
    @Property(value="aim-delay")
    private E3 T;
    private static float Q;
    @Property(value="click-aim")
    private BooleanProperty R;
    private static List<Entity> I;
    private static String[] ab;
    @Property(value="horizontal-right")
    private DoubleProperty N;
    @Property(value="ray-trace")
    private BooleanProperty J;
    @Property(value="only-axe-sword")
    private BooleanProperty V;
    @Property(value="height")
    private DoubleProperty S;
    private static float W;
    @Property(value="vertical-up")
    private DoubleProperty H;
    private static String[] Z;
    private Comparator<Entity> O;
    @Property(value="reach")
    private DoubleProperty M;
    private int P;
    @Property(value="horizontal-left")
    private DoubleProperty L;
    private static long Y;
    private TimerUtil K;
    private static Entity U;
    @Property(value="vertical-down")
    private DoubleProperty X;

    private static double lambda$new$0(Entity entity) {
        return AimAssist.a(entity)[0];
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

    public static double[] a(Entity entity) {
        return null;
    }

    private void b() {
        KillAura.w();
        EntityPlayerSP entityPlayerSP = this.mc.player;
        if (entityPlayerSP.rotationYaw < Q) {
            entityPlayerSP.rotationYaw = MathHelper.b((float)((double)entityPlayerSP.rotationYaw + db_0.b((Double)MD.b(this.N))), -9999.0f, Q);
        }
        if (entityPlayerSP.rotationYaw > Q) {
            entityPlayerSP.rotationYaw = MathHelper.b((float)((double)entityPlayerSP.rotationYaw - db_0.b((Double)MD.b(this.N))), Q, 9999.0f);
        }
        if (entityPlayerSP.rotationPitch < W) {
            entityPlayerSP.rotationPitch = MathHelper.b((float)((double)entityPlayerSP.rotationPitch + db_0.b((Double)MD.b(this.X))), -9999.0f, W);
        }
        if (entityPlayerSP.rotationPitch > W) {
            entityPlayerSP.rotationPitch = MathHelper.b((float)((double)entityPlayerSP.rotationPitch - db_0.b((Double)MD.b(this.H))), W, 99999.0f);
        }
    }

    @EventTarget
    private void a(MotionUpdateEvent motionUpdateEvent) {
        block9: {
            block10: {
                boolean bl;
                KillAura.w();
                if (!EventInvoker.getState(motionUpdateEvent).equals((Object)State.PRE)) break block9;
                I = this.a();
                ListInvoker.sort(I, this.O);
                if (U instanceof EntityPlayer || U instanceof ne_2 || U instanceof n5_0) {
                    U = null;
                }
                if (this.mc.player.ticksExisted % 50 == 0 && ListInvoker.size(I) > 1) {
                    ++this.P;
                }
                if (auk_2.a((Boolean)Ba.b(this.R)) && !MouseInvoker.c(0)) {
                    return;
                }
                if (ListInvoker.isEmpty(I)) break block9;
                if (this.P >= ListInvoker.size(I)) {
                    this.P = 0;
                }
                U = (Entity)ListInvoker.get(I, this.P);
                double[] dArray = AimAssist.a(U);
                if (qh_1.c(this.K, lx_2.a((Long)ac7.a(this.T)))) {
                    W = (float)(dArray[1] + db_0.b((Double)MD.b(this.S)));
                    Q = (float)dArray[0];
                    qh_1.b(this.K);
                }
                boolean bl2 = bl = !auk_2.a((Boolean)Ba.b(this.V));
                if (!auk_2.a((Boolean)Ba.b(this.J))) break block10;
                if (!PlayerInvoker.e(this.mc.player, U) || !(act_2.k(PlayerInvoker.W(this.mc.player)) instanceof LC) && !(act_2.k(PlayerInvoker.W(this.mc.player)) instanceof ls_0)) break block9;
                this.b();
            }
            if (act_2.k(PlayerInvoker.W(this.mc.player)) instanceof LC || act_2.k(PlayerInvoker.W(this.mc.player)) instanceof ls_0) {
                this.b();
            }
        }
    }

    private boolean lambda$loadTargets$1(Entity entity) {
        KillAura.w();
        return (double)PlayerInvoker.b(this.mc.player, entity) <= db_0.b((Double)MD.b(this.M)) && this.b(entity);
    }

    public AimAssist(@NonNull byte by, ModuleManager moduleManager, EnumModuleType enumModuleType, int n, String string, int n2, String string2) {
        long l4 = ((long)by << 56 | (long)n << 32 >>> 8 | (long)n2 << 40 >>> 40) ^ Y;
        long l5 = l4 ^ 0x4E52333D2539L;
        int n3 = (int)(l5 >>> 48);
        int n4 = (int)(l5 << 16 >>> 48);
        int n5 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n3, enumModuleType, string, (char)n4, n5, string2);
        this.K = new TimerUtil();
        this.O = aN_.a(AimAssist::lambda$new$0);
        this.M = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(3.0)), db_0.a(1.0)), db_0.a(6.0));
        this.T = (E3)ac7.a((E3)ac7.b(asp_2.a(lx_2.b(0L)), lx_2.b(0L)), lx_2.b(1000L));
        this.S = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(3.5)), db_0.a(-8.0)), db_0.a(8.0));
        this.L = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(1.0)), db_0.a(0.0)), db_0.a(5.0));
        this.N = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(1.0)), db_0.a(0.0)), db_0.a(5.0));
        this.H = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(1.0)), db_0.a(0.0)), db_0.a(5.0));
        this.X = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(1.0)), db_0.a(0.0)), db_0.a(5.0));
        this.V = asp_2.c();
        this.J = asp_2.c();
        this.R = asp_2.c();
        ManagerInvoker.put(new Setting((String)((Object)AimAssist.b("a", (int)3938, (long)(0x187CE54A0985ED98L ^ l4))), (String)((Object)AimAssist.b("a", (int)27187, (long)(0x65A518757BA908C6L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.M, 0.1));
        ManagerInvoker.put(new Setting((String)((Object)AimAssist.b("a", (int)19598, (long)(0x6A480C3BAFA62E7AL ^ l4))), (String)((Object)AimAssist.b("a", (int)3597, (long)(0x72D16BE450AA6CECL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.T, 50.0));
        ManagerInvoker.put(new Setting((String)((Object)AimAssist.b("a", (int)1796, (long)(0x65D401924BC65FCL ^ l4))), (String)((Object)AimAssist.b("a", (int)14537, (long)(0x73F846B52404DA37L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.S, 1.0));
        ManagerInvoker.put(new Setting((String)((Object)AimAssist.b("a", (int)32658, (long)(0x11207C6DF68D1D71L ^ l4))), (String)((Object)AimAssist.b("a", (int)3074, (long)(0x482CFCAB139CEEE2L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.L, 0.1));
        ManagerInvoker.put(new Setting((String)((Object)AimAssist.b("a", (int)14391, (long)(0x4D362C50974B5AC4L ^ l4))), (String)((Object)AimAssist.b("a", (int)12378, (long)(0x3E0EE0817B8852A6L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.N, 0.1));
        ManagerInvoker.put(new Setting((String)((Object)AimAssist.b("a", (int)2553, (long)(0x2BA05E219C9BEB02L ^ l4))), (String)((Object)AimAssist.b("a", (int)30858, (long)(0xE1D1D17EE179A68L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.H, 0.1));
        ManagerInvoker.put(new Setting((String)((Object)AimAssist.b("a", (int)14604, (long)(0x21971668349B5BFAL ^ l4))), (String)((Object)AimAssist.b("a", (int)4864, (long)(0x101A8C39474371F9L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.X, 0.1));
        ManagerInvoker.put(new Setting((String)((Object)AimAssist.b("a", (int)22088, (long)(0x5A00E7F833A534BFL ^ l4))), (String)((Object)AimAssist.b("a", (int)18434, (long)(0x12088ECF9873AAFFL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.V));
        ManagerInvoker.put(new Setting((String)((Object)AimAssist.b("a", (int)9632, (long)(0xEB001886C43C750L ^ l4))), (String)((Object)AimAssist.b("a", (int)5596, (long)(0x2F0AC0D64597F723L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.J));
        ManagerInvoker.put(new Setting((String)((Object)AimAssist.b("a", (int)18890, (long)(0x25D00F7E1CBAAB38L ^ l4))), (String)((Object)AimAssist.b("a", (int)898, (long)(0x73124DEA7D8B6173L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.R));
    }

    private double lambda$loadTargets$2(Object object) {
        return ayj_0.d((Entity)object, this.mc.player);
    }

    static {
        Y = a1c.a(7629952762868437384L, 4487961672589319117L, MethodHandles.lookup().lookupClass()).a(251724440474673L);
        bb = new HashMap(13);
        long l4 = Y ^ 0x4AD8B012F0EEL;
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

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = AimAssist.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x179A;
        if (ab[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])bb.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                bb.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a0_", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return ab[n2];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a0_" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private List<Entity> a() {
        return (List)aMF.a(aMF.a(aMF.b(ListInvoker.stream(BlockInvoker.e(this.mc.world)), this::lambda$loadTargets$1), aN_.a(aN_.a(this::lambda$loadTargets$2))), aB0.a(ObjectArrayList::new));
    }

    private boolean b(Entity entity) {
        KillAura.w();
        return entity != this.mc.player && ayj_0.a(entity) && !a8F.a(NovolineInvoker.A(this.novoline), entity.getName(), EnumPlayerType.FRIEND) && entity instanceof EntityPlayer;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AimAssist.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


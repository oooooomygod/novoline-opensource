/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.lwjgl.opengl.GL11
 */
package cc.novoline.modules.move;

import cc.novoline.events.EventTarget;
import cc.novoline.events.State;
import cc.novoline.events.events.PacketEvent;
import cc.novoline.events.events.PlayerUpdateEvent;
import cc.novoline.events.events.Render3DEvent;
import cc.novoline.events.events.SettingEvent;
import cc.novoline.events.events.TickUpdateEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.GameSettingsInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.PacketEventInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.player.Scaffold;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import cc.novoline.modules.exploits.Disabler;
import deobf.Entity;
import cc.novoline.modules.EnumModuleType;
import deobf.EnumPlayerType;
import deobf.IntProperty;
import deobf.MCInvoker;
import deobf.ModuleRegistry;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import deobf.TimerUtil;
import deobf.Vec3;
import net.minecraft.network.packts.S08PacketPlayerPosLook;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collector;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.Minecraft;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.lwjgl.opengl.GL11;

public class TargetStrafe
extends AbstractModule {
    private TimerUtil O;
    @Property(value="strafe-on")
    private ListProperty<String> N;
    @Property(value="range")
    private DoubleProperty J;
    @Property(value="height")
    private IntProperty X;
    private static double I = 3.5;
    private boolean T;
    private static Map bb;
    private static double W = Math.PI * 2;
    @Property(value="auto-third-person")
    private BooleanProperty H;
    private int M;
    @Property(value="avoid-edges")
    private BooleanProperty P;
    private double L;
    @Property(value="strafe-mode")
    private StringProperty U;
    @Property(value="modules-support")
    private ListProperty<String> S;
    @Property(value="points")
    private BooleanProperty Q;
    private static String[] Z;
    private boolean V;
    private float R;
    @Property(value="only-target")
    private BooleanProperty K;
    private static long Y;
    private static String[] ab;

    private List<mz_0> b(Entity entity) {
        CopyOnWriteArrayList<mz_0> copyOnWriteArrayList = new CopyOnWriteArrayList<mz_0>();
        Scaffold.p();
        double d = db_0.b((Double)MD.b(this.J));
        int n = (int)((double)((int)(Math.PI * d)) * this.a());
        int n2 = 0;
        if (n2 <= n) {
            double d2 = Math.PI * 2 / (double)n;
            double d3 = (double)MathHelper.h(d2 * (double)n2) * d;
            double d4 = (double)MathHelper.b(d2 * (double)n2) * d;
            ListInvoker.add(copyOnWriteArrayList, new mz_0(entity.posX + d3, entity.posZ + d4, n2));
            ++n2;
        }
        return copyOnWriteArrayList;
    }

    private boolean a(double d, double d2, double d3) {
        Scaffold.n();
        int n = (int)d2;
        if (BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, new BlockPos(d, (double)n, d3))) != Blocks.air) {
            return true;
        }
        --n;
        return false;
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x77E0;
        if (ab[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])bb.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                bb.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_f", exception);
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

    static {
        Y = a1c.a(7874421339159520129L, 93161230793351645L, MethodHandles.lookup().lookupClass()).a(72353017839894L);
        bb = new HashMap(13);
        long l4 = Y ^ 0x155FDD0DDC02L;
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

    public float j() {
        KillAura killAura = (KillAura)ModuleInvoker.isEnable(ModuleRegistry.KILLAURA);
        Entity entity = atH.a(killAura);
        double d = db_0.b((Double)MD.b(this.J));
        Scaffold.p();
        int n = (int)((double)((int)(Math.PI * d)) * this.a());
        double d2 = Math.PI * 2 / (double)n;
        double d3 = (double)MathHelper.h(d2 * (double)this.M) * d;
        double d4 = (double)MathHelper.b(d2 * (double)this.M) * d;
        Vec3 vec3 = new Vec3(this.mc.player.posX, this.mc.player.posY + (double)PlayerInvoker.X(this.mc.player), this.mc.player.posZ);
        Vec3 vec32 = this.a(90.0f, 0.0f);
        Vec3 vec33 = aNE.a(vec3, vec32.xCoord * (double)P8.b((Integer)adt_2.a(this.X)), vec32.yCoord * (double)P8.b((Integer)adt_2.a(this.X)), vec32.zCoord * (double)P8.b((Integer)adt_2.a(this.X)));
        BlockInvoker.a(this.mc.world, vec3, vec33, false, false, false);
        double d5 = MathInvoker.a(entity.posX + d3 - this.mc.player.posX);
        double d6 = MathInvoker.a(entity.posZ + d4 - this.mc.player.posZ);
        this.L = MathInvoker.d(d5 * d5 + d6 * d6);
        if (this.L <= (double)this.R) {
            this.M += (this.T ? -1 : 1) % n;
            this.V = this.T;
        }
        if (this.L > 3.0) {
            this.M = this.a(entity);
        }
        return ae4_0.a(entity.posX + d3, entity.posY, entity.posZ + d4)[0];
    }

    public BooleanProperty b() {
        return this.K;
    }

    @EventTarget
    public void a(PlayerUpdateEvent playerUpdateEvent) {
        Scaffold.n();
        Disabler disabler = (Disabler)ModuleInvoker.isEnable(ModuleRegistry.DISABLER);
        if (!disabler.x() || !aAK.a(disabler)) {
            this.a(this.r(), B_.g, 3500, NotificationType.WARNING);
            this.d();
        }
    }

    private boolean c() {
        Scaffold.n();
        return !ListInvoker.isEmpty(BlockInvoker.b(this.mc.world, this.mc.player, h__0.b(PlayerInvoker.p(this.mc.player), 0.0, 0.0, -0.5))) || !ListInvoker.isEmpty(BlockInvoker.b(this.mc.world, this.mc.player, h__0.b(PlayerInvoker.p(this.mc.player), 0.5, 0.0, 0.0))) || !ListInvoker.isEmpty(BlockInvoker.b(this.mc.world, this.mc.player, h__0.b(PlayerInvoker.p(this.mc.player), 0.0, 0.0, 0.5))) || !ListInvoker.isEmpty(BlockInvoker.b(this.mc.world, this.mc.player, h__0.b(PlayerInvoker.p(this.mc.player), -0.5, 0.0, 0.0)));
    }

    public void c(boolean bl) {
        this.T = bl;
    }

    public boolean e() {
        Scaffold.n();
        return this.x() && this.g() && auk_2.a((Boolean)Ba.b(this.H));
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = TargetStrafe.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    public boolean f() {
        return this.T;
    }

    @EventTarget
    public void a(TickUpdateEvent tickUpdateEvent) {
        double d;
        Scaffold.p();
        if (this.c()) {
            if (qh_1.c(this.O, 200L)) {
                this.T = !this.T;
                this.M = this.T ? this.M - 1 : this.M + 1;
            }
            qh_1.b(this.O);
        }
        KillAura killAura = (KillAura)ModuleInvoker.isEnable(ModuleRegistry.KILLAURA);
        double d2 = db_0.b((Double)MD.b(this.J));
        int n = (int)(Math.PI * d2);
        double d3 = Math.PI * 2 / (double)n;
        Entity entity = atH.a(killAura);
        double d4 = MathHelper.h(d3 * (double)(this.M + 1) * d2);
        if (!this.a(entity.posX + d4, entity.posY, entity.posZ + (d = (double)MathHelper.b(d3 * (double)(this.M + 1)) * d2))) {
            this.T = !this.T;
        }
        this.R = 0.7f;
    }

    public StringProperty i() {
        return this.U;
    }

    private int a(Entity entity) {
        return ((mz_0)ListInvoker.get((List)((List)aMF.a((Stream)aMF.a((Stream)ListInvoker.stream(this.b((Entity)entity)), (Comparator)aN_.a((ToDoubleFunction<mz_0>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, a(), (Lnet/Mz;)D)())), (Collector)aB0.a())), (int)0)).c;
    }

    @EventTarget
    public void a(Render3DEvent render3DEvent) {
        Scaffold.p();
        KillAura killAura = (KillAura)ModuleInvoker.isEnable(ModuleRegistry.KILLAURA);
        if (atH.a(killAura) != null && auk_2.a((Boolean)Ba.b(this.Q)) && (double)PlayerInvoker.b(this.mc.player, atH.a(killAura)) < db_0.b((Double)MD.b(atH.d(killAura))) && ayj_0.a(atH.a(killAura)) && this.g()) {
            a1V.e();
            this.a(render3DEvent, atH.a(killAura), 4.0f, Color.BLACK);
            this.a(render3DEvent, atH.a(killAura), 2.0f);
            GlStateManagerInvoker.disableBlend();
            a1V.b();
        }
    }

    private void a(Render3DEvent render3DEvent, Entity entity, float f, Color color) {
        GL11.glLineWidth((float)f);
        GL11.glBegin((int)3);
        Scaffold.n();
        double d = db_0.b((Double)MD.b(this.J));
        double d2 = Math.PI * 2 / (Math.PI * d * this.a());
        a1V.a(color);
        double d3 = 0.0;
        double d4 = d3 - Math.PI * 2;
        int cfr_ignored_1 = d4 == 0.0 ? 0 : (d4 < 0.0 ? -1 : 1);
        double d5 = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double)a1j.a(render3DEvent) + MathInvoker.i(d3) * d - MCInvoker.j((Minecraft)this.mc).s;
        double d6 = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)a1j.a(render3DEvent) - MCInvoker.j((Minecraft)this.mc).h;
        double d7 = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double)a1j.a(render3DEvent) + MathInvoker.m(d3) * d - MCInvoker.j((Minecraft)this.mc).m;
        GL11.glVertex3d((double)d5, (double)d6, (double)d7);
        d3 += d2;
        d3 = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double)a1j.a(render3DEvent) + MathInvoker.i(0.0) * d - MCInvoker.j((Minecraft)this.mc).s;
        d5 = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)a1j.a(render3DEvent) - MCInvoker.j((Minecraft)this.mc).h;
        d6 = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double)a1j.a(render3DEvent) + MathInvoker.m(0.0) * d - MCInvoker.j((Minecraft)this.mc).m;
        GL11.glVertex3d((double)d3, (double)d5, (double)d6);
        GL11.glEnd();
    }

    private void a(Render3DEvent render3DEvent, Entity entity, float f) {
        GL11.glLineWidth((float)f);
        Scaffold.n();
        GL11.glBegin((int)3);
        double d = db_0.b((Double)MD.b(this.J));
        double d2 = Math.PI * 2 / (Math.PI * d * this.a());
        int n = 0;
        double d3 = 0.0;
        double d4 = d3 - Math.PI * 2;
        int cfr_ignored_1 = d4 == 0.0 ? 0 : (d4 < 0.0 ? -1 : 1);
        double d5 = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double)a1j.a(render3DEvent) + MathInvoker.i(d3) * d - MCInvoker.j((Minecraft)this.mc).s;
        double d6 = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)a1j.a(render3DEvent) - MCInvoker.j((Minecraft)this.mc).h;
        double d7 = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double)a1j.a(render3DEvent) + MathInvoker.m(d3) * d - MCInvoker.j((Minecraft)this.mc).m;
        a1V.a(hb_2.a((long)n));
        GL11.glVertex3d((double)d5, (double)d6, (double)d7);
        d3 += d2;
        d3 = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double)a1j.a(render3DEvent) + MathInvoker.i(0.0) * d - MCInvoker.j((Minecraft)this.mc).s;
        d5 = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)a1j.a(render3DEvent) - MCInvoker.j((Minecraft)this.mc).h;
        d6 = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double)a1j.a(render3DEvent) + MathInvoker.m(0.0) * d - MCInvoker.j((Minecraft)this.mc).m;
        a1V.a(hb_2.a((long)(n -= 360)));
        GL11.glVertex3d((double)d3, (double)d5, (double)d6);
        GL11.glEnd();
    }

    private boolean h() {
        Scaffold.p();
        return ava_0.c(this.N) || ava_0.b(this.N, B_.a) && ava_0.b(this.N, B_.e) ? this.mc.player.fuck > 4 && GameSettingsInvoker.e(this.mc.gameSettings.bo) : ava_0.b(this.N, B_.h) && this.mc.player.fuck > 4 || ava_0.b(this.N, B_.i) && GameSettingsInvoker.e(this.mc.gameSettings.bo);
    }

    private double a() {
        return 2.5;
    }

    public void a(SettingEvent settingEvent) {
        Scaffold.p();
        if ((settingEvent == null || afm_0.b(settingEvent).equals(B_.m)) && StringPropertyInvoker.isMode(this.U, B_.l)) {
            this.a(this.r(), B_.c, 3500, NotificationType.WARNING);
            StringPropertyInvoker.b(this.U, B_.j);
        }
    }

    public boolean d(boolean bl) {
        Scaffold.p();
        KillAura killAura = (KillAura)ModuleInvoker.isEnable(ModuleRegistry.KILLAURA);
        return this.x() && (!bl || atH.m(killAura)) && atH.a(killAura) != null && PlayerInvoker.e(this.mc.player, atH.a(killAura)) && (!auk_2.a((Boolean)Ba.b(this.K)) || a8F.a(NovolineInvoker.A(this.novoline), atH.a(killAura).getName(), EnumPlayerType.TARGET)) && PlayerInvoker.d(this.mc.player, atH.a(killAura)) < db_0.b((Double)MD.b(atH.d(killAura))) + 2.0 && this.mc.player.posY >= atH.a((KillAura)killAura).posY - 3.4 && ayj_0.a(atH.a(killAura)) && PlayerInvoker.q(this.mc.player) && this.mc.player.posY <= atH.a((KillAura)killAura).posY + 3.4 && this.h() && (ava_0.b(this.S, B_.b) && ModuleInvoker.isEnable(ModuleRegistry.SPEED).x() || ava_0.b(this.S, B_.f) && ModuleInvoker.isEnable(ModuleRegistry.FLY).x());
    }

    public TargetStrafe(@NonNull ModuleManager moduleManager, EnumModuleType enumModuleType, String string, byte by, String string2, long l4) {
        long l5 = ((long)by << 56 | l4 << 8 >>> 8) ^ Y;
        long l6 = l5 ^ 0x3F5F90F2B21EL;
        int n = (int)(l6 >>> 48);
        int n2 = (int)(l6 << 16 >>> 48);
        int n3 = (int)(l6 << 32 >>> 32);
        super(moduleManager, (char)n, enumModuleType, string, (char)n2, n3, string2);
        this.J = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(2.0)), db_0.a(1.0)), db_0.a(4.5));
        this.K = asp_2.c();
        this.Q = asp_2.c();
        this.P = asp_2.c();
        this.X = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(5)), P8.d(4)), P8.d(10));
        this.S = ava_0.a(asp_2.a(TargetStrafe.b("c", (int)14303, (long)(0x4AAC064C9A832268L ^ l5))), new String[]{TargetStrafe.b("c", (int)6495, (long)(0x22EAF496F2258CEAL ^ l5)), TargetStrafe.b("c", (int)7789, (long)(0x4682E91424998BD5L ^ l5))});
        this.N = ava_0.a(asp_2.a(TargetStrafe.b("c", (int)19313, (long)(0x272218A1EAC2DED5L ^ l5))), new String[]{TargetStrafe.b("c", (int)22507, (long)(0x3B3A62A20A9C24AL ^ l5)), TargetStrafe.b("c", (int)16717, (long)(0x11A4C4E0DF9D4F4L ^ l5))});
        this.U = StringPropertyInvoker.b(asp_2.a((String)((Object)TargetStrafe.b("c", (int)11738, (long)(0x35A9E4104D723861L ^ l5)))), new String[]{TargetStrafe.b("c", (int)26910, (long)(0xCC764F6104F7CB0L ^ l5)), TargetStrafe.b("c", (int)9794, (long)(0x552CD2ACEB86B3E4L ^ l5))});
        this.H = asp_2.c();
        this.O = new TimerUtil();
        this.R = 0.0f;
        ManagerInvoker.put(new Setting((String)((Object)TargetStrafe.b("c", (int)27350, (long)(0x35B002EB9198FF75L ^ l5))), (String)((Object)TargetStrafe.b("c", (int)8459, (long)(0x19FAA68A9A2934BDL ^ l5))), SettingType.SLIDER, (AbstractModule)this, this.J, 0.1));
        ManagerInvoker.put(new Setting((String)((Object)TargetStrafe.b("c", (int)1564, (long)(0x161A1F66641313A2L ^ l5))), (String)((Object)TargetStrafe.b("c", (int)25816, (long)(0x10587A96B8B47165L ^ l5))), SettingType.COMBOBOX, (AbstractModule)this, this.U));
        ManagerInvoker.put(new Setting((String)((Object)TargetStrafe.b("c", (int)8755, (long)(0x1925153F8CEAB79EL ^ l5))), (String)((Object)TargetStrafe.b("c", (int)20827, (long)(0x7A16F9FE6CA6C4E1L ^ l5))), SettingType.CHECKBOX, (AbstractModule)this, this.K));
        ManagerInvoker.put(new Setting((String)((Object)TargetStrafe.b("c", (int)2406, (long)(0x15DC5EA70DC59CCAL ^ l5))), (String)((Object)TargetStrafe.b("c", (int)28551, (long)(0x7BED049D0691FA2CL ^ l5))), SettingType.SELECTBOX, (AbstractModule)this, this.N));
        ManagerInvoker.put(new Setting((String)((Object)TargetStrafe.b("c", (int)8549, (long)(0x4D4671F6726F34CDL ^ l5))), (String)((Object)TargetStrafe.b("c", (int)26872, (long)(0x564C8F5B37AC7D5AL ^ l5))), SettingType.CHECKBOX, (AbstractModule)this, this.Q));
        ManagerInvoker.put(new Setting((String)((Object)TargetStrafe.b("c", (int)31155, (long)(0x5668E0CE0C1AEC1AL ^ l5))), (String)((Object)TargetStrafe.b("c", (int)12055, (long)(0x6A612F5957153AA8L ^ l5))), SettingType.CHECKBOX, (AbstractModule)this, this.H));
        ManagerInvoker.put(new Setting((String)((Object)TargetStrafe.b("c", (int)25881, (long)(0x42731F35DCB270B6L ^ l5))), (String)((Object)TargetStrafe.b("c", (int)15044, (long)(0x4388CE8F7DBFAF78L ^ l5))), SettingType.CHECKBOX, (AbstractModule)this, this.P));
        ManagerInvoker.put(new Setting((String)((Object)TargetStrafe.b("c", (int)19016, (long)(0x11739467FFFC5FE8L ^ l5))), (String)((Object)TargetStrafe.b("c", (int)14643, (long)(0x6B35DC04EFF02C96L ^ l5))), SettingType.SLIDER, (AbstractModule)this, this.X, 1.0, this.P::get));
        ManagerInvoker.put(new Setting((String)((Object)TargetStrafe.b("c", (int)3354, (long)(0x10E56BF9D48F18BDL ^ l5))), (String)((Object)TargetStrafe.b("c", (int)28508, (long)(0x5E595E4B943E7AF6L ^ l5))), SettingType.SELECTBOX, (AbstractModule)this, this.S));
    }

    public double k() {
        return this.L;
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

    @EventTarget
    public void a(PacketEvent packetEvent) {
        Scaffold.n();
        if (PacketEventInvoker.getState(packetEvent) == State.INCOMING && PacketEventInvoker.c(packetEvent) instanceof S08PacketPlayerPosLook && this.g()) {
            S08PacketPlayerPosLook cfr_ignored_0 = (S08PacketPlayerPosLook)PacketEventInvoker.c(packetEvent);
        }
    }

    public boolean g() {
        Scaffold.p();
        KillAura killAura = (KillAura)ModuleInvoker.isEnable(ModuleRegistry.KILLAURA);
        return this.x() && atH.m(killAura) && atH.a(killAura) != null && PlayerInvoker.e(this.mc.player, atH.a(killAura)) && (!auk_2.a((Boolean)Ba.b(this.K)) || a8F.a(NovolineInvoker.A(this.novoline), atH.a(killAura).getName(), EnumPlayerType.TARGET)) && PlayerInvoker.d(this.mc.player, atH.a(killAura)) < db_0.b((Double)MD.b(atH.d(killAura))) + 2.0 && this.mc.player.posY >= atH.a((KillAura)killAura).posY - 3.4 && ayj_0.a(atH.a(killAura)) && PlayerInvoker.q(this.mc.player) && this.mc.player.posY <= atH.a((KillAura)killAura).posY + 3.4 && this.h() && (ava_0.b(this.S, B_.d) && ModuleInvoker.isEnable(ModuleRegistry.SPEED).x() || ava_0.b(this.S, B_.k) && ModuleInvoker.isEnable(ModuleRegistry.FLY).x());
    }

    private Vec3 a(float f, float f2) {
        float f3 = MathHelper.b(MathInvoker.o(-f2) - 3.1415927410125732);
        float f4 = MathHelper.h(MathInvoker.o(-f2) - 3.1415927410125732);
        float f5 = -MathHelper.b(MathInvoker.o(-f));
        float f6 = MathHelper.h(MathInvoker.o(-f));
        return new Vec3(f4 * f5, f6, f3 * f5);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_f" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(TargetStrafe.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


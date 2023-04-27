/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.move;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.CollideWithBlockEvent;
import cc.novoline.events.events.EntityBouondingEvent;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.events.MoveEvent;
import cc.novoline.events.events.Render3DEvent;
import cc.novoline.events.events.SettingEvent;
import cc.novoline.events.events.TickUpdateEvent;
import cc.novoline.events.type.State;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.configurations.annotation.Property;
import cc.novoline.modules.player.Scaffold;
import deobf.*;
import net.minecraft.init.Blocks;
import net.minecraft.network.packts.C04PacketPlayerPosition;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.FloatProperty;
import net.MathHelper;
import net.ModuleManager;
import net.NotificationType;
import net.SD;
import net.StringProperty;
import net.a1c;
import net.a9V;
import net.aL0;
import net.aW9;
import net.afm_0;
import net.akm_1;
import net.asp_2;
import net.auk_2;
import net.av0_0;
import net.axx_1;
import net.db_0;
import net.my_0;
import net.wj_0;
import org.checkerframework.checker.nullness.qual.NonNull;

public class Step
extends AbstractModule {
    private List<Double> K;
    private int P;
    private static String[] X;
    @Property(value="height")
    private FloatProperty R;
    @Property(value="timer-speed")
    private FloatProperty L;
    private List<Double> S;
    @Property(value="mode")
    private StringProperty T;
    public double I;
    private static long V;
    private static Map Y;
    private List<Double> M;
    private boolean J;
    private TimerUtil U;
    public double N;
    public double Q;
    private List<Packet> O;
    private List<Double> H;
    private static String[] W;

    @EventTarget
    public void a(Render3DEvent render3DEvent) {
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x2F6D;
        if (X[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])Y.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                Y.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_P", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return X[n2];
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

    public boolean a() {
        Scaffold.n();
        return this.x() && StringPropertyInvoker.isMode(this.T, av0_0.i) && this.J;
    }

    private void lambda$onStepConfirm$3(double d, double d2, double d3, Double d4) {
        this.a(new C04PacketPlayerPosition(d, d2 + db_0.b(d4), d3, false));
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = Step.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    public FloatProperty b() {
        return this.R;
    }

    private Boolean lambda$new$1() {
        return auk_2.b(StringPropertyInvoker.isMode(this.T, av0_0.d));
    }

    @EventTarget
    public void a(MoveEvent moveEvent) {
    }

    public Step(@NonNull short s, short s3, ModuleManager moduleManager, EnumModuleType enumModuleType, int n, String string) {
        long l4 = ((long)s << 48 | (long)s3 << 48 >>> 16 | (long)n << 32 >>> 32) ^ V;
        long l5 = l4 ^ 0x2C03332A46DBL;
        int n2 = (int)(l5 >>> 56);
        long l6 = l5 << 8 >>> 8;
        super((byte)n2, moduleManager, l6, enumModuleType, string);
        this.M = my_0.a(new Double[]{db_0.a(0.42f), db_0.a(0.7531999805212)});
        this.H = my_0.a(new Double[]{db_0.a(0.42f), db_0.a(0.7531999805212), db_0.a(1.00133597911214), db_0.a(1.084), db_0.a(1.006)});
        this.K = my_0.a(new Double[]{db_0.a(0.425f), db_0.a(0.821), db_0.a(0.699), db_0.a(0.599), db_0.a(1.022), db_0.a(1.372), db_0.a(1.652), db_0.a(1.869)});
        this.S = my_0.a(new Double[]{db_0.a(0.425f), db_0.a(0.821), db_0.a(0.699), db_0.a(0.599), db_0.a(1.022), db_0.a(1.372), db_0.a(1.652), db_0.a(1.869), db_0.a(2.019), db_0.a(1.907)});
        this.T = StringPropertyInvoker.b(asp_2.a((String)((Object)Step.b("c", (int)18964, (long)(0x6AEEEE0C88C48493L ^ l4)))), new String[]{Step.b("c", (int)11159, (long)(0x2B6BE2383037E51CL ^ l4)), Step.b("c", (int)1423, (long)(0x489CD11A54F0CB0EL ^ l4)), Step.b("c", (int)1646, (long)(0x3974C11120C748EAL ^ l4))});
        this.R = (FloatProperty)a9V.a((FloatProperty)a9V.b(asp_2.a(axx_1.a(1.5f)), axx_1.a(1.0f)), axx_1.a(2.5f));
        boolean bl = Scaffold.n();
        this.L = (FloatProperty)a9V.a((FloatProperty)a9V.b(asp_2.a(axx_1.a(0.6f)), axx_1.a(0.1f)), axx_1.a(1.0f));
        this.O = new ArrayList<Packet>();
        this.U = new TimerUtil();
        ManagerInvoker.put(new Setting((String)((Object)Step.b("c", (int)12648, (long)(0x5CD445E31925FFEAL ^ l4))), (String)((Object)Step.b("c", (int)12763, (long)(0x29D501399188FF5DL ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.T));
        ManagerInvoker.put(new Setting((String)((Object)Step.b("c", (int)30046, (long)(0x5EECECC189303BD4L ^ l4))), (String)((Object)Step.b("c", (int)6855, (long)(0x6399ACBA6363D444L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.R, 0.5, this::lambda$new$0));
        ManagerInvoker.put(new Setting((String)((Object)Step.b("c", (int)2907, (long)(0x682DB242132F45DEL ^ l4))), (String)((Object)Step.b("c", (int)20584, (long)(0x452D2EDF352C9EE8L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.L, (double)0.05f, this::lambda$new$1));
        if (ListInvoker.b() != null) {
            Scaffold.c(!bl);
        }
    }

    private Boolean lambda$new$0() {
        return auk_2.b(StringPropertyInvoker.isMode(this.T, av0_0.l));
    }

    private void lambda$onStepConfirm$2(double d, double d2, double d3, Double d4) {
        this.a(new C04PacketPlayerPosition(d, d2 + db_0.b(d4), d3, false));
    }

    @EventTarget
    public void a(MotionUpdateEvent motionUpdateEvent) {
        block16: {
            block17: {
                Scaffold.p();
                if (EventInvoker.getState(motionUpdateEvent) != State.PRE) break block16;
                this.mc.player.U = 0.625f;
                if (this.a(ModuleRegistry.SPEED, ModuleRegistry.SCAFFOLD, ModuleRegistry.LONGJUMP, ModuleRegistry.FLY) || wj_0.d(PlayerInvoker.j(this.mc.player)) || !this.mc.player.onGround) {
                    return;
                }
                if (StringPropertyInvoker.isMode(this.T, av0_0.f)) {
                    boolean bl;
                    boolean bl2;
                    double d = this.mc.player.posX;
                    double d2 = MathHelper.floor_double(this.mc.player.posY);
                    double d3 = this.mc.player.posZ;
                    double d4 = -MathHelper.h(MathInvoker.o(PlayerInvoker.c(this.mc.player)));
                    double d5 = MathHelper.b(MathInvoker.o(PlayerInvoker.c(this.mc.player)));
                    double d6 = 0.5;
                    Block block = BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, new BlockPos(d + d4 * d6, d2 + 2.0, d3 + d5 * d6)));
                    Block block2 = BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, new BlockPos(d + d4 * d6, d2 + 1.0, d3 + d5 * d6)));
                    Block block3 = BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, new BlockPos(d + d4 * d6, d2, d3 + d5 * d6)));
                    boolean bl3 = bl2 = block == Blocks.air || akm_1.f(BlocksInvoker.getBlockState(block));
                    boolean bl4 = block2 == Blocks.cm ? BlocksInvoker.I(block2) == 0.125 : block2 == Blocks.air || akm_1.f(BlocksInvoker.getBlockState(block2));
                    boolean bl5 = BlocksInvoker.s(block3);
                    boolean bl6 = bl = bl5;
                    if (!this.mc.player.g || this.mc.player.onGround) {
                        // empty if block
                    }
                    if (this.mc.player.onGround || !PlayerInvoker.q(this.mc.player)) {
                        this.J = false;
                    }
                    if (this.J) {
                        this.mc.player.ap = 0.0f;
                        this.mc.player.bO = 0.0f;
                        if (this.mc.player.ticksOffground > 2 && this.mc.player.ticksOffground < 7) {
                            this.mc.player.motionY = 0.0;
                        }
                        if (this.mc.player.ticksOffground == 4) {
                            EventInvoker.b(motionUpdateEvent, d2 + 0.166109260938216);
                        }
                        if (this.mc.player.ticksOffground == 5) {
                            EventInvoker.b(motionUpdateEvent, d2 + 0.249187078744683);
                        }
                        if (this.mc.player.ticksOffground == 6) {
                            EventInvoker.b(motionUpdateEvent, d2 + 0.170783338727846);
                        }
                        if (this.mc.player.ticksOffground == 7) {
                            EventInvoker.b(motionUpdateEvent, d2 + 0.015547670490035);
                        }
                    }
                }
                this.mc.player.U = axx_1.a((Float)a9V.a(this.R));
                ++this.P;
                if (!StringPropertyInvoker.isMode(this.T, av0_0.a)) break block17;
                if (this.P == 1) {
                    ListInvoker.add(this.O, EventInvoker.d(motionUpdateEvent));
                    EventInvoker.a(motionUpdateEvent, true);
                }
                if (this.P == 2) {
                    ListInvoker.forEach(this.O, this::a);
                    ListInvoker.clear(this.O);
                    this.mc.timer.timerSpeed = 0.6f;
                }
                if (this.P != 3) break block16;
                this.mc.timer.timerSpeed = 1.0f;
            }
            if (this.P == 2) {
                this.mc.timer.timerSpeed = 1.0f;
            }
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_P" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private void lambda$onStepConfirm$4(double d, double d2, double d3, Double d4) {
        this.a(new C04PacketPlayerPosition(d, d2 + db_0.b(d4), d3, false));
    }

    public void a(SettingEvent settingEvent) {
        Scaffold.n();
        if ((settingEvent == null || afm_0.b(settingEvent).equals(av0_0.j)) && (StringPropertyInvoker.isMode(this.T, av0_0.g) || StringPropertyInvoker.isMode(this.T, av0_0.m))) {
            this.a(this.r(), aL0.a(aL0.a(aL0.a(new StringBuilder(), av0_0.b), StringInvoker.a((String)StringPropertyInvoker.b(this.T))), av0_0.e).toString(), 3500, NotificationType.WARNING);
            StringPropertyInvoker.b(this.T, av0_0.c);
        }
    }

    @EventTarget
    public void a(TickUpdateEvent tickUpdateEvent) {
        this.a((String)StringPropertyInvoker.b(this.T));
    }

    @EventTarget
    public void a(CollideWithBlockEvent collideWithBlockEvent) {
    }

    static {
        V = a1c.a(19321678234589088L, 4390254518498009367L, MethodHandles.lookup().lookupClass()).a(225941278922745L);
        Y = new HashMap(13);
        long l4 = V ^ 0x6408D79F9AB3L;
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

    @EventTarget
    public void a(EntityBouondingEvent entityBouondingEvent) {
        block11: {
            double d;
            double d2;
            double d3;
            double d4;
            double d5;
            double d6;
            block12: {
                Scaffold.p();
                if (SD.b(entityBouondingEvent) != aW9.CONFIRM) break block11;
                if (this.a(ModuleRegistry.SPEED, ModuleRegistry.SCAFFOLD, ModuleRegistry.LONGJUMP, ModuleRegistry.FLY) || wj_0.d(PlayerInvoker.j(this.mc.player)) || !this.mc.player.onGround) {
                    return;
                }
                d6 = this.mc.player.posX;
                d5 = this.mc.player.posY;
                d4 = this.mc.player.posZ;
                d3 = PlayerInvoker.p((EntityPlayerSP)this.mc.player).a - d5;
                if (!StringPropertyInvoker.isMode(this.T, av0_0.k)) break block12;
                if (d3 != 1.0) break block11;
                this.mc.timer.timerSpeed = 0.18f;
                this.P = 0;
                d2 = -MathHelper.h(MathInvoker.o(PlayerInvoker.c(this.mc.player)));
                d = MathHelper.b(MathInvoker.o(PlayerInvoker.c(this.mc.player)));
                ListInvoker.add(this.O, new C04PacketPlayerPosition(d6 - d2 * 0.28, d5 + (double)0.42f, d4 - d * 0.28, false));
                ListInvoker.add(this.O, new C04PacketPlayerPosition(d6 - d2 * 0.12, d5 + 0.7531999805212, d4 - d * 0.12, false));
                ListInvoker.add(this.O, new C04PacketPlayerPosition(d6 + d2 * 0.04, d5 + 1.001335979112147, d4 + d * 0.04, false));
                ListInvoker.add(this.O, new C04PacketPlayerPosition(d6 + d2 * 0.2, d5 + 1.0, d4 + d * 0.2, true));
            }
            if (StringPropertyInvoker.isMode(this.T, av0_0.h) && d3 > 0.625 && d3 <= 2.5) {
                this.mc.timer.timerSpeed = (float)((double)axx_1.a((Float)a9V.a(this.L)) * (1.0 - 0.15 * d3 / 0.5)) + 0.075f;
                this.P = 0;
                if (d3 == 1.5) {
                    ListInvoker.forEach(this.H, arg_0 -> this.lambda$onStepConfirm$2(d6, d5, d4, arg_0));
                }
                if (d3 == 2.0) {
                    ListInvoker.forEach(this.K, arg_0 -> this.lambda$onStepConfirm$3(d6, d5, d4, arg_0));
                }
                if (d3 == 2.5) {
                    ListInvoker.forEach(this.S, arg_0 -> this.lambda$onStepConfirm$4(d6, d5, d4, arg_0));
                }
                if (d3 > 0.625) {
                    d2 = db_0.b((Double)ListInvoker.get(this.M, 0));
                    d = db_0.b((Double)ListInvoker.get(this.M, 1));
                    d2 *= d3;
                    d *= d3;
                    if (d2 > 0.425) {
                        d2 = 0.425f;
                    }
                    if (d2 > 0.78) {
                        d2 = 0.78f;
                    }
                    this.a(new C04PacketPlayerPosition(d6, d5 + d2, d4, false));
                    this.a(new C04PacketPlayerPosition(d6, d5 + d, d4, false));
                }
            }
        }
    }

    @Override
    public void w() {
        Scaffold.n();
        if (!ListInvoker.isEmpty(this.O)) {
            ListInvoker.forEach(this.O, this::a);
            ListInvoker.clear(this.O);
        }
        this.mc.timer.timerSpeed = 1.0f;
        this.mc.player.U = 0.625f;
        this.J = false;
    }

    @Override
    public void o() {
        this.a((String)StringPropertyInvoker.b(this.T));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Step.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


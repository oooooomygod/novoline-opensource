/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.move;

import cc.novoline.events.EventTarget;
import cc.novoline.events.State;
import cc.novoline.events.events.JumpEvent;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.events.MoveEvent;
import cc.novoline.events.events.PacketEvent;
import cc.novoline.events.events.PlayerUpdateEvent;
import cc.novoline.events.events.SettingEvent;
import cc.novoline.events.events.TickUpdateEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.MoveInoker;
import cc.novoline.invoke.PacketEventInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.configurations.annotation.Property;
import cc.novoline.modules.exploits.Disabler;
import cc.novoline.modules.player.Scaffold;
import deobf.*;
import net.minecraft.network.packts.C03PacketPlayer;
import net.minecraft.network.packts.S08PacketPlayerPosLook;
import net.minecraft.network.packts.S12PacketEntityVelocity;
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
import net.LongJump;
import net.MD;
import net.MathHelper;
import net.ModuleManager;
import net.NotificationType;
import net.Potion;
import net.SU;
import net.StringProperty;
import net.TargetStrafe;
import net.a1c;
import net.aAK;
import net.aL0;
import net.aYL;
import net.afm_0;
import net.akr_0;
import net.asp_2;
import net.auk_2;
import net.azd_2;
import net.db_0;
import net.ka_0;
import org.checkerframework.checker.nullness.qual.NonNull;

public class Speed
extends AbstractModule {
    private static String[] cb;
    private static long bb;
    private float Q;
    private double J;
    private float ab;
    @Property(value="strafe-mode")
    private StringProperty R;
    @Property(value="collide")
    private BooleanProperty X;
    private double I;
    @Property(value="in-liquid")
    private BooleanProperty Z;
    @Property(value="damage-boost")
    private BooleanProperty W;
    @Property(value="mode")
    private StringProperty O;
    private double S;
    private boolean K;
    private static Map ib;
    private double M;
    @Property(value="ice-boost")
    private BooleanProperty H;
    private double T;
    private double Y;
    private double V;
    private boolean L;
    private boolean P;
    @Property(value="lagback-check")
    private BooleanProperty aa;
    @Property(value="down-motion")
    private BooleanProperty N;
    @Property(value="damage-boost-multiplier")
    private DoubleProperty U;
    private static String[] eb;

    private Boolean lambda$new$3() {
        Scaffold.n();
        return auk_2.b(!StringPropertyInvoker.isMode(this.O, akr_0.E));
    }

    private Boolean lambda$new$4() {
        Scaffold.n();
        return auk_2.b(!StringPropertyInvoker.isMode(this.O, akr_0.F));
    }

    static {
        bb = a1c.a(-2490859357824919868L, -9030811022249521135L, MethodHandles.lookup().lookupClass()).a(146980031736640L);
        ib = new HashMap(13);
        long l4 = bb ^ 0x1E0DC831702EL;
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

    private Boolean lambda$new$1() {
        return auk_2.b(StringPropertyInvoker.isMode(this.O, akr_0.s));
    }

    public void b(double d) {
        this.M = d;
    }

    @EventTarget
    public void a(MotionUpdateEvent motionUpdateEvent) {
        Scaffold.n();
        if (EventInvoker.getState(motionUpdateEvent) == cc.novoline.events.type.State.PRE && StringPropertyInvoker.isMode(this.O, akr_0.J) && PlayerInvoker.q(this.mc.player)) {
            if (this.mc.player.onGround) {
                PlayerInvoker.v(this.mc.player);
                PlayerInvoker.d(this.mc.player, PlayerInvoker.a(this.mc.player, true, 0.14) * 1.69);
            }
            this.ab = PlayerInvoker.c(this.mc.player);
            double d = MathInvoker.a(MathHelper.j(this.Q - this.ab));
            if (StringPropertyInvoker.isMode(this.R, akr_0.W)) {
                PlayerInvoker.d(this.mc.player, PlayerInvoker.r(this.mc.player));
            }
            if (StringPropertyInvoker.isMode(this.R, akr_0.g) && d > 14.0) {
                PlayerInvoker.d(this.mc.player, PlayerInvoker.r(this.mc.player) * 0.72);
            }
            this.Q = this.ab;
            if (auk_2.a((Boolean)Ba.b(this.N)) && this.mc.player.ticksOffground == 4) {
                this.mc.player.motionY -= 0.184;
            }
        }
    }

    @Override
    public void o() {
        this.a((String)StringPropertyInvoker.b(this.O));
        this.checkModule(LongJump.class, Scaffold.class, Fly.class);
        this.M = this.V = PlayerInvoker.a(this.mc.player, true, 0.05);
        this.ab = this.Q = PlayerInvoker.c(this.mc.player);
        this.L = true;
        this.I = 0.0;
    }

    private void a(MoveEvent moveEvent, int n) {
        block19: {
            block22: {
                int n2;
                block23: {
                    TargetStrafe targetStrafe;
                    boolean bl;
                    block21: {
                        block20: {
                            Scaffold.n();
                            if (!PlayerInvoker.q(this.mc.player)) break block19;
                            int n3 = PlayerInvoker.c(this.mc.player, Potion.moveSpeed) - PlayerInvoker.c(this.mc.player, Potion.moveSlowdown);
                            if (this.mc.player.onGround) {
                                this.P = auk_2.a((Boolean)Ba.b(this.H)) && PlayerInvoker.z((EntityPlayerSP)this.mc.player).z == 0.98f;
                                this.K = auk_2.a((Boolean)Ba.b(this.Z)) && PlayerInvoker.ac(this.mc.player);
                                this.mc.player.motionY = n > 7 && this.I > 0.0 ? this.I : PlayerInvoker.e(this.mc.player);
                                MoveInoker.setY(moveEvent, this.mc.player.motionY);
                                this.M = this.V * (this.K ? 0.42999998 : (this.P ? 2.01399998 : 2.13999998));
                                this.I = 0.0;
                            }
                            if (this.mc.player.ticksOffground != 1) break block20;
                            if (this.P && !this.K) {
                                this.M *= 0.93598615916;
                            }
                            this.M = this.T - 0.66 * (this.T - this.V);
                            double d = n3 == 0 ? 0.9808305162963192 : (n3 == 1 ? 0.9775896153661018 : (this.J = n3 == 2 ? 0.9746325193602489 : 0.9719226917746409));
                            double d2 = n3 == 0 ? 0.00138324022307878 : (n3 == 1 ? 0.0015492432535351 : (this.Y = n3 == 2 ? 0.00168274354355435 : 0.001789345235545));
                            double d3 = n3 == 0 ? 7.03245479062E-5 : (n3 == 1 ? 7.069516069901E-5 : (this.S = n3 == 2 ? 7.43379728481E-5 : 7.63243776977E-5));
                            if (this.P) {
                                this.J -= 0.026479009717;
                            }
                            if (!auk_2.a((Boolean)Ba.b(this.W)) || n <= 7) break block21;
                            this.M *= db_0.b((Double)MD.b(this.U));
                            this.L = false;
                        }
                        this.M *= MathInvoker.a(this.J, 1.0);
                        this.J += MathInvoker.d(this.Y, 0.0);
                        this.Y -= this.S;
                    }
                    if (bl = azd_2.d(targetStrafe = (TargetStrafe)ModuleInvoker.isEnable(ModuleRegistry.TARGETSTRAFE))) {
                        this.ab = azd_2.c(targetStrafe);
                    }
                    if (StringPropertyInvoker.isMode(this.R, akr_0.z) || StringPropertyInvoker.isMode(this.R, akr_0.x)) {
                        this.ab = PlayerInvoker.c(this.mc.player);
                    }
                    if (this.mc.player.onGround) {
                        this.ab = PlayerInvoker.c(this.mc.player);
                    }
                    n2 = (int)MathInvoker.a(MathHelper.j(this.Q - this.ab));
                    if (this.mc.player.ticksOffground <= 0) break block22;
                    if (!bl) break block23;
                    if (!this.L || !StringPropertyInvoker.isMode(azd_2.a(targetStrafe), akr_0.S)) break block22;
                    if (n2 > 40) {
                        this.M *= 0.56;
                    }
                    if (n2 > 25) {
                        this.M *= 0.64;
                    }
                    if (n2 <= 10) break block22;
                    this.M *= 0.72;
                }
                if (StringPropertyInvoker.isMode(this.R, akr_0.w)) {
                    if (n2 > 140) {
                        this.M *= 0.24;
                    }
                    if (n2 > 40) {
                        this.M *= 0.64;
                    }
                    if (n2 > 7) {
                        this.M *= 0.9;
                    }
                    if (n2 > 2) {
                        this.M *= 0.96;
                    }
                }
            }
            MoveInoker.a(moveEvent, this.ab, auk_2.a((Boolean)Ba.b(this.X)) && this.mc.player.g ? 0.02 : this.M);
            this.M = MathInvoker.d(this.M, 0.22);
            this.Q = this.ab;
        }
    }

    private void b(MoveEvent moveEvent) {
        block15: {
            block18: {
                int n;
                block19: {
                    TargetStrafe targetStrafe;
                    boolean bl;
                    block17: {
                        block16: {
                            Scaffold.n();
                            if (!PlayerInvoker.q(this.mc.player)) break block15;
                            if (this.mc.player.onGround) {
                                this.mc.player.motionY = PlayerInvoker.e(this.mc.player);
                                MoveInoker.setY(moveEvent, this.mc.player.motionY);
                                this.M = this.V * 2.13999998;
                            }
                            if (this.mc.player.ticksOffground != 1) break block16;
                            this.M = this.T - 0.81999 * (this.T - this.V);
                            if (this.mc.player.fuck <= 8 || !auk_2.a((Boolean)Ba.b(this.W))) break block17;
                            this.M *= db_0.b((Double)MD.b(this.U));
                            this.L = false;
                        }
                        this.M -= this.T / 159.9;
                    }
                    if (bl = azd_2.d(targetStrafe = (TargetStrafe)ModuleInvoker.isEnable(ModuleRegistry.TARGETSTRAFE))) {
                        this.ab = azd_2.c(targetStrafe);
                    }
                    if (StringPropertyInvoker.isMode(this.R, akr_0.M) || StringPropertyInvoker.isMode(this.R, akr_0.T)) {
                        this.ab = PlayerInvoker.c(this.mc.player);
                    }
                    if (this.mc.player.onGround) {
                        this.ab = PlayerInvoker.c(this.mc.player);
                    }
                    n = (int)MathInvoker.a(MathHelper.j(this.Q - this.ab));
                    if (this.mc.player.ticksOffground <= 0) break block18;
                    if (!bl) break block19;
                    if (!this.L || !StringPropertyInvoker.isMode(azd_2.a(targetStrafe), akr_0.j)) break block18;
                    if (n > 40) {
                        this.M *= 0.56;
                    }
                    if (n > 25) {
                        this.M *= 0.72;
                    }
                    if (n <= 10) break block18;
                    this.M *= 0.82;
                }
                if (StringPropertyInvoker.isMode(this.R, akr_0.U)) {
                    if (n >= 180) {
                        this.M *= 0.24;
                    }
                    if (n > 10) {
                        this.M *= 0.64;
                    }
                }
            }
            MoveInoker.a(moveEvent, this.ab, this.M);
            this.M = MathInvoker.d(this.M, 0.22);
            this.Q = this.ab;
        }
    }

    public double f() {
        return this.T;
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x46B9;
        if (eb[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])ib.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                ib.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_F", exception);
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
    public void w() {
    }

    @EventTarget
    public void a(TickUpdateEvent tickUpdateEvent) {
        this.a((String)StringPropertyInvoker.b(this.O));
    }

    public boolean c() {
        Scaffold.p();
        return this.x() && StringPropertyInvoker.isMode(this.O, akr_0.d) && this.T > 0.09;
    }

    @EventTarget
    public void a(JumpEvent jumpEvent) {
        if (!StringPropertyInvoker.isMode(this.O, akr_0.e)) {
            SU.a(jumpEvent, true);
        }
    }

    public Speed(@NonNull char c, ModuleManager moduleManager, EnumModuleType enumModuleType, int n, short s, String string) {
        long l4 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48) ^ bb;
        long l5 = l4 ^ 0xC8710CB0047L;
        int n2 = (int)(l5 >>> 56);
        long l6 = l5 << 8 >>> 8;
        super((byte)n2, moduleManager, l6, enumModuleType, string);
        this.O = StringPropertyInvoker.b(asp_2.a((String)((Object)Speed.b("z", (int)13644, (long)(0x6674E3626D8B5490L ^ l4)))), new String[]{Speed.b("z", (int)27856, (long)(0x284A9210F0DC0D1EL ^ l4)), Speed.b("z", (int)21847, (long)(0x5D99C87A70D2B49EL ^ l4)), Speed.b("z", (int)14628, (long)(0x1F2254B2F11FD8E8L ^ l4))});
        this.R = StringPropertyInvoker.b(asp_2.a((String)((Object)Speed.b("z", (int)26234, (long)(0x1AC76FDB4AE787BDL ^ l4)))), new String[]{Speed.b("z", (int)27125, (long)(0x11EBB5743D91882AL ^ l4)), Speed.b("z", (int)26741, (long)(0x664EB7DE9CED89A8L ^ l4)), Speed.b("z", (int)12079, (long)(0x5CD4482787D5CEFDL ^ l4))});
        this.W = asp_2.c();
        this.U = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(1.3)), db_0.a(1.1)), db_0.a(1.8));
        this.N = asp_2.c();
        this.aa = asp_2.c();
        this.H = asp_2.c();
        this.Z = asp_2.d();
        this.X = asp_2.d();
        ManagerInvoker.put(new Setting((String)((Object)Speed.b("z", (int)9637, (long)(0x3B0DBA10F25A4466L ^ l4))), (String)((Object)Speed.b("z", (int)1534, (long)(0x7BF270F28866E43BL ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.O));
        ManagerInvoker.put(new Setting((String)((Object)Speed.b("z", (int)3143, (long)(0x6A315BE6A7EEED9FL ^ l4))), (String)((Object)Speed.b("z", (int)3930, (long)(0xC2420CF48BD6E9EL ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.R));
        ManagerInvoker.put(new Setting((String)((Object)Speed.b("z", (int)24622, (long)(0x44A86A1C260F81E6L ^ l4))), (String)((Object)Speed.b("z", (int)4195, (long)(0x148EB9C2AEC1F1AEL ^ l4))), SettingType.SEPARATOR, this));
        ManagerInvoker.put(new Setting((String)((Object)Speed.b("z", (int)5996, (long)(0x16AF9E45208776A6L ^ l4))), (String)((Object)Speed.b("z", (int)1626, (long)(0x3ACFAE18504DE789L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.H, this::lambda$new$0));
        ManagerInvoker.put(new Setting((String)((Object)Speed.b("z", (int)4229, (long)(0x2D276861BAAEF152L ^ l4))), (String)((Object)Speed.b("z", (int)29149, (long)(0x552B23FECD73100CL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.Z, this::lambda$new$1));
        ManagerInvoker.put(new Setting((String)((Object)Speed.b("z", (int)23606, (long)(0x35347D0997683DEFL ^ l4))), (String)((Object)Speed.b("z", (int)15944, (long)(0x71F148F6E63A5F87L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.X, this::lambda$new$2));
        ManagerInvoker.put(new Setting((String)((Object)Speed.b("z", (int)26072, (long)(0xB3A19F3F601841EL ^ l4))), (String)((Object)Speed.b("z", (int)26293, (long)(0x592CA9A6CC8F8777L ^ l4))), SettingType.SEPARATOR, this));
        ManagerInvoker.put(new Setting((String)((Object)Speed.b("z", (int)28330, (long)(0x57C38904B8F18F7AL ^ l4))), (String)((Object)Speed.b("z", (int)28257, (long)(0x79B3E25EF82E0FA0L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.N, this::lambda$new$3));
        ManagerInvoker.put(new Setting((String)((Object)Speed.b("z", (int)7575, (long)(0x1B271DB51C63FC4CL ^ l4))), (String)((Object)Speed.b("z", (int)12890, (long)(0x7460D9218AF4D384L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.aa));
        ManagerInvoker.put(new Setting((String)((Object)Speed.b("z", (int)29596, (long)(0x1684AA936CDB924AL ^ l4))), (String)((Object)Speed.b("z", (int)28693, (long)(0x6A892E6805E991D5L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.W, this::lambda$new$4));
        ManagerInvoker.put(new Setting((String)((Object)Speed.b("z", (int)9694, (long)(0xE24CD26BC6EC415L ^ l4))), (String)((Object)Speed.b("z", (int)18002, (long)(0x6DECEB150793A788L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.U, 0.1, this::lambda$new$5));
    }

    private Boolean lambda$new$2() {
        return auk_2.b(StringPropertyInvoker.isMode(this.O, akr_0.G));
    }

    private Boolean lambda$new$0() {
        return auk_2.b(StringPropertyInvoker.isMode(this.O, akr_0.V));
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = Speed.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    public void a(SettingEvent settingEvent) {
        block7: {
            block8: {
                Scaffold.n();
                if ((settingEvent == null || afm_0.b(settingEvent).equals(akr_0.f)) && StringPropertyInvoker.isMode(this.O, akr_0.b)) {
                    this.a(this.r(), aL0.a(aL0.a(aL0.a(new StringBuilder(), akr_0.c), StringInvoker.a((String)StringPropertyInvoker.b(this.O))), akr_0.R).toString(), 3500, NotificationType.WARNING);
                    StringPropertyInvoker.b(this.O, akr_0.r);
                }
                if (settingEvent != null && !afm_0.b(settingEvent).equals(akr_0.a)) break block7;
                Disabler disabler = (Disabler)ModuleInvoker.isEnable(ModuleRegistry.DISABLER);
                if (!disabler.x() || !aAK.a(disabler)) break block8;
                if (!StringPropertyInvoker.isMode(this.R, akr_0.Q)) break block7;
                this.a(this.r(), aL0.a(aL0.a(aL0.a(new StringBuilder(), akr_0.L), StringInvoker.a((String)StringPropertyInvoker.b(this.R))), akr_0.q).toString(), 3500, NotificationType.WARNING);
                StringPropertyInvoker.b(this.R, akr_0.l);
            }
            if (StringPropertyInvoker.isMode(this.R, akr_0.k)) {
                this.a(this.r(), aL0.a(aL0.a(aL0.a(new StringBuilder(), akr_0.v), StringInvoker.a((String)StringPropertyInvoker.b(this.R))), akr_0.o).toString(), 3500, NotificationType.WARNING);
                StringPropertyInvoker.b(this.R, akr_0.A);
            }
            if (StringPropertyInvoker.isMode(this.R, akr_0.p)) {
                this.a(this.r(), aL0.a(aL0.a(aL0.a(new StringBuilder(), akr_0.y), StringInvoker.a((String)StringPropertyInvoker.b(this.R))), akr_0.C).toString(), 3500, NotificationType.WARNING);
                StringPropertyInvoker.b(this.R, akr_0.B);
            }
        }
        if ((settingEvent == null || afm_0.b(settingEvent).equals(akr_0.m)) && auk_2.a((Boolean)Ba.b(this.N))) {
            this.a(this.r(), akr_0.h, 3500, NotificationType.WARNING);
            Ba.a(this.N, auk_2.b(false));
        }
    }

    @EventTarget
    public void a(PacketEvent packetEvent) {
        block5: {
            S12PacketEntityVelocity s12PacketEntityVelocity;
            block6: {
                Scaffold.p();
                if (PacketEventInvoker.getState(packetEvent) != State.INCOMING) break block5;
                if (!(PacketEventInvoker.c(packetEvent) instanceof S08PacketPlayerPosLook)) break block6;
                if (!auk_2.a((Boolean)Ba.b(this.aa))) break block5;
                this.a(this.getClass());
            }
            if (PacketEventInvoker.c(packetEvent) instanceof S12PacketEntityVelocity && aYL.d(s12PacketEntityVelocity = (S12PacketEntityVelocity)PacketEventInvoker.c(packetEvent)) == PlayerInvoker.O(this.mc.player) && StringPropertyInvoker.isMode(this.O, akr_0.N)) {
                double d = (double)aYL.b(s12PacketEntityVelocity) / 8000.0;
                if (this.mc.player.b > 1) {
                    this.mc.player.motionY = d;
                }
                this.I = d;
            }
        }
    }

    public StringProperty a() {
        return this.O;
    }

    @EventTarget
    public void a(MoveEvent moveEvent) {
        Scaffold.n();
        if (StringPropertyInvoker.isMode(this.O, akr_0.H)) {
            this.a(moveEvent, this.mc.player.fuck);
        }
        if (StringPropertyInvoker.isMode(this.O, akr_0.u)) {
            this.b(moveEvent);
        }
    }

    public boolean e() {
        boolean bl;
        boolean bl2;
        Scaffold.p();
        TargetStrafe targetStrafe = (TargetStrafe)ModuleInvoker.isEnable(ModuleRegistry.TARGETSTRAFE);
        int n = PlayerInvoker.c(this.mc.player, Potion.moveSpeed) - PlayerInvoker.c(this.mc.player, Potion.moveSlowdown);
        boolean bl3 = bl2 = StringPropertyInvoker.isMode(this.R, akr_0.i) || azd_2.d(targetStrafe) && StringPropertyInvoker.isMode(azd_2.a(targetStrafe), akr_0.n);
        if (this.x() && StringPropertyInvoker.isMode(this.O, akr_0.K) && this.mc.player.ticksOffground > 1 && this.mc.player.ticksOffground % 2 == 0 && this.T > 0.09 && (double)this.mc.player.fallDistance < 1.1455 && this.mc.player.fuck < 19 && !PlayerInvoker.ac(this.mc.player)) {
            if (n <= 0) {
                // empty if block
            }
            bl = true;
        } else {
            bl = false;
        }
        return bl;
    }

    public double b() {
        return this.M;
    }

    public boolean a(C03PacketPlayer c03PacketPlayer) {
        boolean bl;
        Scaffold.n();
        TargetStrafe targetStrafe = (TargetStrafe)ModuleInvoker.isEnable(ModuleRegistry.TARGETSTRAFE);
        int n = PlayerInvoker.c(this.mc.player, Potion.moveSpeed) - PlayerInvoker.c(this.mc.player, Potion.moveSlowdown);
        boolean bl2 = StringPropertyInvoker.isMode(this.R, akr_0.O) || azd_2.d(targetStrafe) && StringPropertyInvoker.isMode(azd_2.a(targetStrafe), akr_0.P);
        double d = ka_0.a(c03PacketPlayer) % 1.0;
        if (this.x() && StringPropertyInvoker.isMode(this.O, akr_0.I) && this.T > 0.09 && d > 0.0 && d != (double)0.42f && (double)this.mc.player.fallDistance < 1.1455 && this.mc.player.fuck < 19 && !PlayerInvoker.ac(this.mc.player)) {
            if (n <= 0) {
                // empty if block
            }
            bl = true;
        } else {
            bl = false;
        }
        return bl;
    }

    private Boolean lambda$new$5() {
        Scaffold.n();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.W)) && !StringPropertyInvoker.isMode(this.O, akr_0.D));
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

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_F" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    @EventTarget
    public void a(PlayerUpdateEvent playerUpdateEvent) {
        Scaffold.p();
        if (StringPropertyInvoker.isMode(this.O, akr_0.t)) {
            Disabler disabler = (Disabler)ModuleInvoker.isEnable(ModuleRegistry.DISABLER);
            this.V = PlayerInvoker.a(this.mc.player, true, this.K ? 0.0 : (disabler.x() && aAK.a(disabler) ? 0.06 : 0.005));
        }
        this.V = PlayerInvoker.a(this.mc.player, true, 0.18);
        this.T = PlayerInvoker.n(this.mc.player);
        if (this.mc.player.onGround) {
            this.L = true;
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Speed.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


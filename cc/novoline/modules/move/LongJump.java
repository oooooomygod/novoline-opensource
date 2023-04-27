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
import cc.novoline.events.events.JumpEvent;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.events.MoveEvent;
import cc.novoline.events.events.PacketEvent;
import cc.novoline.events.events.PlayerUpdateEvent;
import cc.novoline.events.events.Render2DEvent;
import cc.novoline.events.events.SettingEvent;
import cc.novoline.events.events.TickUpdateEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.MoveInoker;
import cc.novoline.invoke.PacketEventInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.player.Scaffold;
import cc.novoline.utils.Timer;
import cc.novoline.modules.exploits.Disabler;
import cc.novoline.modules.EnumModuleType;
import deobf.LongJumpMode;
import deobf.MCInvoker;
import deobf.ModuleRegistry;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import net.minecraft.network.packts.C04PacketPlayerPosition;
import net.minecraft.network.packts.C0BPacketEntityAction;
import net.minecraft.network.packts.C0BPacketEntityAction$Action;
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
import net.minecraft.client.Minecraft;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.lwjgl.opengl.GL11;

public class LongJump
extends AbstractModule {
    private double P;
    private int Z;
    private static String[] eb;
    private Timer S;
    @Property(value="boost-speed")
    private DoubleProperty boostSpeed;
    private double aa;
    @Property(value="hypixel-mode")
    private StringProperty hypixel;
    @Property(value="timer-boost")
    private BooleanProperty timer;
    private boolean H;
    private static Map ib;
    private boolean ab;
    @Property(value="mode")
    private StringProperty mode;
    private int I;
    private boolean K;
    private double U;
    private static String[] cb;
    private boolean O;
    private static long bb;
    private double X;
    @Property(value="visual-airwalk")
    private BooleanProperty airWalk;
    private LongJumpMode V;
    @Property(value="auto-disable")
    private BooleanProperty autoDisable;
    private double posY;
    private int N;
    private String T;

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

    public LongJump(@NonNull short s, ModuleManager moduleManager, int n, EnumModuleType enumModuleType, String string, String string2, int n2) {
        long l4 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ bb;
        long l5 = l4 ^ 0x446A65B9DFC3L;
        int n3 = (int)(l5 >>> 48);
        int n4 = (int)(l5 << 16 >>> 48);
        int n5 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n3, enumModuleType, string, (char)n4, n5, string2);
        this.mode = StringPropertyInvoker.b(asp_2.a((String)((Object)LongJump.b("c", (int)16713, (long)(0x830C22DD8FBCBA8L ^ l4)))), new String[]{LongJump.b("c", (int)16749, (long)(0xA53DC3D2AF94B8AL ^ l4)), LongJump.b("c", (int)13689, (long)(0x3F39F5CB04123F95L ^ l4)), LongJump.b("c", (int)17160, (long)(0x7D8EA3B6F55949ECL ^ l4))});
        this.hypixel = StringPropertyInvoker.b(asp_2.a((String)((Object)LongJump.b("c", (int)14272, (long)(0xD2FC20DA884BD29L ^ l4)))), new String[]{LongJump.b("c", (int)4470, (long)(0x5057ECA3A9281B89L ^ l4)), LongJump.b("c", (int)9457, (long)(0x15ADAE8FB9CD2E0CL ^ l4))});
        this.airWalk = asp_2.c();
        this.boostSpeed = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(3.0)), db_0.a(1.5)), db_0.a(9.0));
        this.autoDisable = asp_2.d();
        this.timer = asp_2.c();
        this.S = new Timer();
        ManagerInvoker.put(new Setting((String)((Object)LongJump.b("c", (int)14290, (long)(0x11427CA1D76A3D39L ^ l4))), (String)((Object)LongJump.b("c", (int)21616, (long)(0x17EEE1B8638A5E8EL ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.mode));
        ManagerInvoker.put(new Setting((String)((Object)LongJump.b("c", (int)7102, (long)(0x1A6D12104D1B1153L ^ l4))), (String)((Object)LongJump.b("c", (int)11319, (long)(0x6B7B7E87254526CBL ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.hypixel, this::lambda$new$0));
        ManagerInvoker.put(new Setting((String)((Object)LongJump.b("c", (int)27102, (long)(0x7049B9027FE5633CL ^ l4))), (String)((Object)LongJump.b("c", (int)31780, (long)(0x405296F81912F6C1L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.boostSpeed, 0.1, this::lambda$new$1));
        ManagerInvoker.put(new Setting((String)((Object)LongJump.b("c", (int)25005, (long)(0x1656A89BF0EEB4DL ^ l4))), (String)((Object)LongJump.b("c", (int)12167, (long)(0xD1DCFA1E210A564L ^ l4))), SettingType.SEPARATOR, this));
        ManagerInvoker.put(new Setting((String)((Object)LongJump.b("c", (int)1974, (long)(0x256DE6E878F30D59L ^ l4))), (String)((Object)LongJump.b("c", (int)19728, (long)(0x27842A44E469C7F6L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.timer, this::lambda$new$2));
        ManagerInvoker.put(new Setting((String)((Object)LongJump.b("c", (int)6459, (long)(0x5EC10C29E83113D5L ^ l4))), (String)((Object)LongJump.b("c", (int)32582, (long)(0x2441EE65F528F5AEL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.airWalk, this::lambda$new$3));
        ManagerInvoker.put(new Setting((String)((Object)LongJump.b("c", (int)26850, (long)(0x3B478BCBF31C6208L ^ l4))), (String)((Object)LongJump.b("c", (int)19274, (long)(0x35A8AC5D9A87C1B1L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.autoDisable));
    }

    private Boolean lambda$new$0() {
        return auk_2.b(StringPropertyInvoker.isMode(this.mode, aqf_0.h));
    }

    public StringProperty f() {
        return this.mode;
    }

    public boolean e() {
        Scaffold.n();
        return this.x() && auk_2.a((Boolean)Ba.b(this.timer)) && !this.ab && this.mc.player.ticksOffground > 0 && this.mc.player.ticksOffground < 30;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_E" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private Boolean lambda$new$1() {
        return auk_2.b(StringPropertyInvoker.isMode(this.mode, aqf_0.l));
    }

    private Boolean lambda$new$3() {
        return auk_2.b(StringPropertyInvoker.isMode(this.mode, aqf_0.k));
    }

    @Override
    public void o() {
        this.checkModule(Speed.class, Fly.class, Scaffold.class);
        this.O = false;
        this.K = false;
        this.H = false;
        Scaffold.n();
        this.posY = this.mc.player.posY;
        this.P = 0.0;
        this.Z = 0;
        this.U = PlayerInvoker.d(this.mc.player, true);
        if (StringPropertyInvoker.isMode(this.mode, aqf_0.p)) {
            this.V = LongJumpMode.NCP;
        }
        if (StringPropertyInvoker.isMode(this.mode, aqf_0.b)) {
            this.V = LongJumpMode.NODAMAGE;
        }
        this.V = LongJumpMode.HYPIXEL;
        String string = this.T = StringPropertyInvoker.isMode(this.mode, aqf_0.w) ? aqf_0.e : aqf_0.v;
        if (PlayerInvoker.q(this.mc.player) && this.mc.player.onGround) {
            if (this.V.equals((Object)LongJumpMode.HYPIXEL)) {
                this.b(new C0BPacketEntityAction(this.mc.player, C0BPacketEntityAction$Action.START_SPRINTING));
                abl_1.b(this.S);
                this.ab = true;
                this.I = 0;
            }
            if (this.V.equals((Object)LongJumpMode.NCP)) {
                this.d();
            }
        }
        this.a((String)StringPropertyInvoker.b(this.mode));
        this.K = false;
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x57D;
        if (eb[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])ib.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                ib.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_E", exception);
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

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = LongJump.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    public StringProperty g() {
        return this.mode;
    }

    private double c() {
        double d = PlayerInvoker.a(this.mc.player, true);
        Scaffold.p();
        int n = PlayerInvoker.c(this.mc.player, Potion.moveSpeed);
        int n2 = PlayerInvoker.c(this.mc.player, Potion.moveSlowdown);
        double d2 = n - n2;
        return d *= 1.0 + d2 * (StringPropertyInvoker.isMode(this.mode, aqf_0.s) ? (StringPropertyInvoker.isMode(this.hypixel, aqf_0.u) ? 0.07 : 0.15) : 0.2);
    }

    @EventTarget
    public void onUpdate(MotionUpdateEvent motionUpdateEvent) {
        Scaffold.n();
        if (EventInvoker.getState(motionUpdateEvent).equals((Object)cc.novoline.events.type.State.PRE)) {
            if (this.V == LongJumpMode.HYPIXEL) {
                if (this.mc.player.onGround) {
                    if (this.I < this.a()) {
                        this.mc.player.motionY = 0.42f;
                        EventInvoker.b(motionUpdateEvent, false);
                        ++this.I;
                    }
                    this.ab = false;
                    EventInvoker.b(motionUpdateEvent, false);
                }
                if (!this.ab) {
                    if (this.mc.player.ticksOffground == 2) {
                        this.O = true;
                        EventInvoker.b(motionUpdateEvent, true);
                    }
                    if (auk_2.a((Boolean)Ba.b(this.timer))) {
                        if (this.mc.player.ticksOffground == 1) {
                            this.mc.timer.timerSpeed = 0.18f;
                        }
                        if (this.mc.player.ticksOffground == 2) {
                            this.mc.timer.timerSpeed = 0.1f;
                        }
                        if (this.mc.player.ticksOffground > 23) {
                            this.mc.timer.timerSpeed = 1.0f;
                        }
                        this.mc.timer.timerSpeed = 3.0f;
                    }
                }
            }
            if (this.mc.player.posY >= this.posY && (auk_2.a((Boolean)Ba.b(this.airWalk)) || this.ab)) {
                MCInvoker.v((Minecraft)this.mc).posY = this.posY + (this.ab ? 0.0 : (double)0.42f);
                this.mc.player.ap = 0.0f;
                this.mc.player.bO = 0.0f;
            }
            if (this.K && this.mc.player.i) {
                this.a(this.getClass());
                this.K = false;
            }
        }
    }

    private void a(MoveEvent moveEvent) {
        Scaffold.n();
        if (this.mc.player.onGround) {
            if (this.H) {
                this.mc.player.motionY = PlayerInvoker.e(this.mc.player);
                MoveInoker.setY(moveEvent, this.mc.player.motionY);
                this.U *= (double)2.145f;
            }
            this.U = PlayerInvoker.k(this.mc.player) * db_0.b((Double)MD.b(this.boostSpeed));
        }
        if (this.H) {
            this.U = this.aa - 0.66 * (this.aa - this.X);
        }
        this.U -= this.aa / 159.0;
        this.K = true;
        this.U = MathInvoker.d(this.U, this.X);
        MoveInoker.setSpeed(moveEvent, this.U);
        this.H = this.mc.player.onGround;
    }

    public StringProperty b() {
        return this.hypixel;
    }

    @Override
    public void w() {
        Scaffold.p();
        if (!this.ab) {
            this.mc.player.motionX = 0.0;
            this.mc.player.motionY = -0.0785;
            this.mc.player.motionZ = 0.0;
        }
        this.K = false;
        this.ab = false;
        this.mc.timer.timerSpeed = 1.0f;
        this.b(new C0BPacketEntityAction(this.mc.player, C0BPacketEntityAction$Action.STOP_SPRINTING));
    }

    private int a() {
        Scaffold.n();
        int n = PlayerInvoker.c(this.mc.player, Potion.jump);
        int n2 = 3;
        if (n == 1) {
            n2 = 4;
        }
        if (n == 2) {
            n2 = 5;
        }
        if (n == 3) {
            n2 = 5;
        }
        if (n == 4) {
            n2 = 6;
        }
        if (n > 4) {
            n2 = 3 + n;
        }
        return n2;
    }

    @EventTarget
    public void onPacket(PacketEvent packetEvent) {
        Scaffold.n();
        if (PacketEventInvoker.getState(packetEvent).equals((Object)State.INCOMING)) {
            S12PacketEntityVelocity s12PacketEntityVelocity;
            if (PacketEventInvoker.c(packetEvent) instanceof S08PacketPlayerPosLook) {
                this.a(this.getClass());
            }
            if (PacketEventInvoker.c(packetEvent) instanceof S12PacketEntityVelocity && aYL.d(s12PacketEntityVelocity = (S12PacketEntityVelocity)PacketEventInvoker.c(packetEvent)) == PlayerInvoker.O(this.mc.player) && this.V == LongJumpMode.HYPIXEL && !this.ab) {
                this.P = (double)aYL.b(s12PacketEntityVelocity) / 8000.0;
                PacketEventInvoker.setCancelled(packetEvent, true);
            }
        }
    }

    private void onMoveUpdate(MoveEvent moveEvent) {
        Scaffold.p();
        if (this.mc.player.onGround) {
            if (this.H) {
                this.mc.player.motionY = PlayerInvoker.e(this.mc.player);
                MoveInoker.setY(moveEvent, this.mc.player.motionY);
                this.U *= 2.139999980926514;
            }
            this.U = PlayerInvoker.a(this.mc.player, true) * 2.0;
        }
        if (this.H) {
            this.U = this.aa - 0.66 * (this.aa - this.X);
        }
        this.U -= this.aa / 19.0;
        this.K = true;
        if (!PlayerInvoker.b(this.mc.player, Potion.jump) && this.mc.player.motionY < 0.0) {
            this.U = this.X;
            if (this.mc.player.ticksExisted % 2 == 0 && (double)this.mc.player.fallDistance < 0.45) {
                this.U = this.X * 1.2;
                this.mc.player.motionY = 0.0;
            }
        }
        this.U = MathInvoker.d(this.U, this.X);
        MoveInoker.setSpeed(moveEvent, this.U);
        this.H = this.mc.player.onGround;
    }

    private int a(double d) {
        Scaffold.n();
        boolean bl = aCM.a(abb_2.UHC);
        boolean bl2 = aCM.a(abb_2.SG);
        int n = PlayerInvoker.b(this.mc.player, Potion.jump) ? a3M.g(PlayerInvoker.a(this.mc.player, Potion.jump)) + 1 : 0;
        return (int)((double)(3 + n + (bl || bl2 ? 1 : 0)) / d);
    }

    static {
        bb = a1c.a(4066276825025548469L, -7165403585685918270L, MethodHandles.lookup().lookupClass()).a(132831189379158L);
        ib = new HashMap(13);
        long l4 = bb ^ 0x15A203445011L;
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
    public void a(TickUpdateEvent tickUpdateEvent) {
        this.a((String)StringPropertyInvoker.b(this.mode));
    }

    @EventTarget
    public void a(JumpEvent jumpEvent) {
        if (PlayerInvoker.q(this.mc.player)) {
            SU.a(jumpEvent, true);
        }
    }

    @EventTarget
    public void b(Render2DEvent render2DEvent) {
        Scaffold.p();
        if (this.V.equals((Object)LongJumpMode.HYPIXEL) && this.T.equals(aqf_0.a) && this.ab) {
            this.a(render2DEvent);
        }
    }

    private void b(MoveEvent moveEvent) {
        Scaffold.n();
        if (this.mc.player.onGround) {
            if (this.H) {
                this.mc.player.motionY = PlayerInvoker.e(this.mc.player);
                MoveInoker.setY(moveEvent, this.mc.player.motionY);
                this.U *= 2.1399999;
            }
            this.U = PlayerInvoker.a(this.mc.player, true);
        }
        if (this.H) {
            this.U = this.aa - 0.3 * (this.aa - this.X);
        }
        this.U -= this.aa / 59.0;
        this.K = true;
        if (this.mc.player.a8 < 8) {
            MoveInoker.setY(moveEvent, this.mc.player.motionY += 0.028);
        }
        this.U = MathInvoker.d(this.U, this.X);
        MoveInoker.setSpeed(moveEvent, this.U);
        this.H = this.mc.player.onGround;
    }

    private void d() {
        Scaffold.n();
        if (!aCM.a(abb_2.PRE) && !aCM.a(abb_2.LOBBY)) {
            double d = this.mc.player.posX;
            double d2 = this.mc.player.posY;
            double d3 = this.mc.player.posZ;
            int n = 0;
            if (n <= this.a(0.0625) + 1) {
                double d4 = MathHelper.a(4.0E-4, 5.0E-4);
                this.a(new C04PacketPlayerPosition(d, d2 + 0.0625 + d4, d3, false));
                this.a(new C04PacketPlayerPosition(d, d2 + d4, d3, false));
                ++n;
            }
        }
    }

    @EventTarget
    public void onMove(MoveEvent moveEvent) {
        Scaffold.n();
        if (this.ab || !PlayerInvoker.q(this.mc.player)) {
            MoveInoker.setSpeed(moveEvent, 0.0);
        }
        if (this.V.equals((Object)LongJumpMode.HYPIXEL)) {
            if (StringPropertyInvoker.isMode(this.hypixel, aqf_0.f)) {
                this.c(moveEvent);
            }
            this.b(moveEvent);
        }
        if (this.V.equals((Object)LongJumpMode.NODAMAGE)) {
            this.onMoveUpdate(moveEvent);
        }
        if (this.V.equals((Object)LongJumpMode.NCP)) {
            this.a(moveEvent);
        }
    }

    @EventTarget
    public void a(PlayerUpdateEvent playerUpdateEvent) {
        this.aa = PlayerInvoker.n(this.mc.player);
        this.X = this.c();
    }

    private Boolean lambda$new$2() {
        Scaffold.n();
        return auk_2.b(StringPropertyInvoker.isMode(this.mode, aqf_0.q) && StringPropertyInvoker.isMode(this.hypixel, aqf_0.i));
    }

    private void a(Render2DEvent render2DEvent) {
        int n = ScaledResolutionInvoker.getScaledWidth(uc_0.a(render2DEvent));
        int n2 = ScaledResolutionInvoker.i(uc_0.a(render2DEvent));
        double d = n / 2;
        double d2 = n2 / 2 + 20;
        double d3 = 100.0;
        double d4 = 6.0;
        long l4 = 36L + 12L * (long)(this.a() - 3);
        double d5 = abl_1.a(this.S, l4 * 50L, d3);
        a1V.b((d -= d3 / 2.0) - 1.0, (d2 -= d4 / 2.0) - 1.0, d + d3 + 1.0, d2 + d4 + 1.0, hb_2.a(hb_2.a(asx_1.BLACK), 150));
        Scaffold.n();
        int n3 = 0;
        double d6 = d;
        if (d6 < d + d5) {
            a1V.b(d6, d2, d6 + 0.5, d2 + d4, hb_2.a(hb_2.a((long)n3), 150));
            n3 -= 15;
            d6 += 0.5;
        }
        GL11.glPushMatrix();
        GL11.glTranslated((double)(d += d3 / 2.0 - 5.0), (double)(d2 += 1.0), (double)0.0);
        GL11.glScaled((double)0.5, (double)0.5, (double)0.0);
        GL11.glTranslated((double)(-d), (double)(-d2), (double)0.0);
        FontRendererInvoker.drawStringWithShadow(this.mc.fontRendererCrack, aL0.a(aL0.a(new StringBuilder(), StringInvoker.a(aqf_0.o, new Object[]{db_0.a(d5)})), aqf_0.n).toString(), (float)d, (float)d2, 0xFFFFFF);
        GL11.glPopMatrix();
    }

    private void c(MoveEvent moveEvent) {
        Scaffold.n();
        if (this.mc.player.onGround) {
            if (this.H) {
                this.mc.player.motionY = PlayerInvoker.e(this.mc.player);
                MoveInoker.setY(moveEvent, this.mc.player.motionY);
                this.U *= 2.1399999;
            }
            this.U = PlayerInvoker.a(this.mc.player, true);
        }
        if (this.H) {
            this.U = this.aa - 0.76999 * (this.aa - this.X);
        }
        this.U *= 0.9788305162963192;
        this.K = true;
        if (this.mc.player.ticksOffground > 1) {
            MoveInoker.setY(moveEvent, this.mc.player.motionY += 0.028);
            if (this.P > 0.0 && this.mc.player.motionY < 0.0) {
                this.mc.player.motionY = this.P;
                MoveInoker.setY(moveEvent, this.mc.player.motionY);
                this.P = 0.0;
            }
        }
        if (this.mc.player.ticksOffground > 3 && this.O) {
            this.U *= 2.2 - 0.35 * (double)PlayerInvoker.c(this.mc.player, Potion.moveSpeed);
            this.O = false;
        }
        this.U = MathInvoker.d(this.U, this.X);
        MoveInoker.setSpeed(moveEvent, this.U);
        this.H = this.mc.player.onGround;
    }

    public void a(SettingEvent settingEvent) {
        Scaffold.p();
        if ((settingEvent == null || afm_0.b(settingEvent).equals(aqf_0.r)) && !StringPropertyInvoker.isMode(this.mode, aqf_0.j)) {
            this.a(this.r(), aL0.a(aL0.a(aL0.a(new StringBuilder(), aqf_0.t), StringInvoker.a((String)StringPropertyInvoker.b(this.mode))), aqf_0.m).toString(), 3500, NotificationType.WARNING);
            StringPropertyInvoker.b(this.mode, aqf_0.d);
        }
        if (settingEvent == null || afm_0.b(settingEvent).equals(aqf_0.c) || afm_0.b(settingEvent).equals(aqf_0.g)) {
            boolean bl;
            Disabler disabler = (Disabler)ModuleInvoker.isEnable(ModuleRegistry.DISABLER);
            boolean bl2 = bl = disabler.x() && aAK.a(disabler);
            if (auk_2.a((Boolean)Ba.b(this.timer))) {
                this.a(this.r(), aqf_0.x, 4500, NotificationType.WARNING);
                Ba.a(this.timer, auk_2.b(false));
            }
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(LongJump.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


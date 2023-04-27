/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.move;

import cc.novoline.events.EventTarget;
import cc.novoline.events.State;
import cc.novoline.events.events.CollideWithBlockEvent;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.events.MoveEvent;
import cc.novoline.events.events.PacketEvent;
import cc.novoline.events.events.TickUpdateEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.C08PacketPlayerBlockPlacementInvoker;
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.MoveInoker;
import cc.novoline.invoke.PacketEventInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.configurations.annotation.Property;
import cc.novoline.modules.player.Scaffold;
import deobf.*;
import net.minecraft.network.packts.C06PacketPlayerPosLook;
import net.minecraft.network.packts.C08PacketPlayerBlockPlacement;
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
import net.A_;
import net.Ba;
import net.BooleanProperty;
import net.DoubleProperty;
import net.INetHandlerPlayServer;
import net.LC;
import net.LongJump;
import net.MD;
import net.MathHelper;
import net.ModuleManager;
import net.StringProperty;
import net.TargetStrafe;
import net.a1c;
import net.aCM;
import net.aIY;
import net.aYL;
import net.act_2;
import net.alp_0;
import net.amv_2;
import net.asp_2;
import net.auk_2;
import net.azd_2;
import net.db_0;
import net.rm_2;
import net.wj_0;
import org.checkerframework.checker.nullness.qual.NonNull;

public class Fly
extends AbstractModule {
    @Property(value="auto-motion")
    private BooleanProperty J;
    @Property(value="motion-speed")
    private DoubleProperty H;
    private int M;
    private String Q;
    @Property(value="toggle-jump")
    private BooleanProperty L;
    private static Map X;
    private static String[] V;
    private static String[] W;
    @Property(value="glide")
    private BooleanProperty I;
    private double P;
    @Property(value="air-walk")
    private BooleanProperty N;
    private double K;
    private boolean T;
    private double R;
    @Property(value="mode")
    private StringProperty S;
    private double O;
    private static long U;

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_h" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    @EventTarget
    public void a(CollideWithBlockEvent collideWithBlockEvent) {
        Scaffold.n();
        if (!wj_0.d(PlayerInvoker.j(this.mc.player)) && this.Q.equals(ListInvoker.get(StringPropertyInvoker.a(this.S), 1)) && (double)amv_2.h(A_.a(collideWithBlockEvent)) == this.R - (this.R % 1.0 == 0.0 ? 1.0 : this.R % 1.0)) {
            A_.a(collideWithBlockEvent, new rm_2(A_.a(collideWithBlockEvent), amv_2.a(A_.a(collideWithBlockEvent), 1, 1, 1)));
        }
    }

    private Boolean lambda$new$2() {
        return auk_2.b(StringPropertyInvoker.isMode(this.S, aIY.b));
    }

    private Boolean lambda$new$1() {
        return auk_2.b(StringPropertyInvoker.isMode(this.S, aIY.d));
    }

    static {
        U = a1c.a(8147902783986537843L, -772593803866767999L, MethodHandles.lookup().lookupClass()).a(215991089567058L);
        X = new HashMap(13);
        long l4 = U ^ 0x53723502DA97L;
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
    public void a(MotionUpdateEvent motionUpdateEvent) {
        block9: {
            block10: {
                block11: {
                    Scaffold.p();
                    if (EventInvoker.getState(motionUpdateEvent) != cc.novoline.events.type.State.PRE) break block9;
                    if (!this.Q.equals(ListInvoker.get(StringPropertyInvoker.a(this.S), 1))) break block10;
                    if (auk_2.a((Boolean)Ba.b(this.N)) && EventInvoker.e(motionUpdateEvent) >= this.R) {
                        this.mc.player.bO = PlayerInvoker.c(this.mc.player, PlayerInvoker.n(this.mc.player));
                        MCInvoker.v((Minecraft)this.mc).posY = this.R;
                        this.mc.player.ap = 0.0f;
                    }
                    if (!wj_0.d(PlayerInvoker.j(this.mc.player))) break block11;
                    this.R = (double)MathHelper.floor_double(EventInvoker.e(motionUpdateEvent)) - 1.0;
                    if (this.mc.player.ticksOffground <= 6) break block9;
                    this.mc.player.motionY = 0.0;
                    if (this.mc.player.ticksOffground != 7) break block9;
                    EventInvoker.b(motionUpdateEvent, -999.0);
                }
                if (this.mc.player.b != 1) break block9;
                EventInvoker.b(motionUpdateEvent, -999.0);
            }
            if (this.Q.equals(ListInvoker.get(StringPropertyInvoker.a(this.S), 0))) {
                this.mc.player.bO = PlayerInvoker.c(this.mc.player, PlayerInvoker.n(this.mc.player));
                this.mc.player.ap = 0.0f;
                if (wj_0.d(PlayerInvoker.j(this.mc.player))) {
                    TargetStrafe targetStrafe = (TargetStrafe)ModuleInvoker.isEnable(ModuleRegistry.TARGETSTRAFE);
                    double d = this.mc.player.motionY = azd_2.d(targetStrafe) ? 0.0 : (double)0.42f;
                }
                if (wj_0.a(PlayerInvoker.j(this.mc.player))) {
                    this.mc.player.motionY = -0.42f;
                }
                if (!auk_2.a((Boolean)Ba.b(this.L)) || this.mc.player.ticksOffground > 4) {
                    double d = this.mc.player.motionY = auk_2.a((Boolean)Ba.b(this.I)) ? -0.024 : 0.0;
                    if (PlayerInvoker.a(this.mc.player, 1.0E-4)) {
                        EventInvoker.b(motionUpdateEvent, true);
                    }
                }
            }
        }
    }

    public Fly(@NonNull ModuleManager moduleManager, EnumModuleType enumModuleType, char c, char c2, String string, int n) {
        long l4 = ((long)c << 48 | (long)c2 << 48 >>> 16 | (long)n << 32 >>> 32) ^ U;
        long l5 = l4 ^ 0x5FB1A3802B15L;
        int n2 = (int)(l5 >>> 56);
        long l6 = l5 << 8 >>> 8;
        super((byte)n2, moduleManager, l6, enumModuleType, string);
        this.S = StringPropertyInvoker.b(asp_2.a((String)((Object)Fly.b("w", (int)30695, (long)(0x2A2E5AEAB63F8893L ^ l4)))), new String[]{Fly.b("w", (int)12884, (long)(0x72C465258575CD29L ^ l4)), Fly.b("w", (int)25965, (long)(0x764E8BAE26639A18L ^ l4))});
        this.H = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(5.0)), db_0.a(1.0)), db_0.a(10.0));
        this.J = asp_2.d();
        this.N = asp_2.c();
        this.L = asp_2.c();
        this.I = asp_2.c();
        ManagerInvoker.put(new Setting((String)((Object)Fly.b("w", (int)11967, (long)(0x382947D1A9AD51C9L ^ l4))), (String)((Object)Fly.b("w", (int)4358, (long)(0x4E90417E804FEE79L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.S));
        ManagerInvoker.put(new Setting((String)((Object)Fly.b("w", (int)30363, (long)(0x75E547F1951089E0L ^ l4))), (String)((Object)Fly.b("w", (int)18524, (long)(0x3A5B4A5D0799372FL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.N, this::lambda$new$0));
        ManagerInvoker.put(new Setting((String)((Object)Fly.b("w", (int)14745, (long)(0x51F75038B45F46E0L ^ l4))), (String)((Object)Fly.b("w", (int)30348, (long)(0x665D6B4044189FDL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.J, this::lambda$new$1));
        ManagerInvoker.put(new Setting((String)((Object)Fly.b("w", (int)15652, (long)(0x42EA9C32794BC254L ^ l4))), (String)((Object)Fly.b("w", (int)8220, (long)(0x2FA2561A3D9DF66L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.L, this::lambda$new$2));
        ManagerInvoker.put(new Setting((String)((Object)Fly.b("w", (int)20187, (long)(0x4E0F3C5BE74531A7L ^ l4))), (String)((Object)Fly.b("w", (int)18458, (long)(0x1973BE3C589BB764L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.I, this::lambda$new$3));
        ManagerInvoker.put(new Setting((String)((Object)Fly.b("w", (int)10685, (long)(0x690DF3944BF056CAL ^ l4))), (String)((Object)Fly.b("w", (int)29373, (long)(0x2B539526DED18DCFL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.H, 0.5, this::lambda$new$4));
    }

    @EventTarget
    public void a(PacketEvent packetEvent) {
        block10: {
            Packet<INetHandlerPlayServer> packet;
            block8: {
                block9: {
                    Scaffold.p();
                    if (PacketEventInvoker.getState(packetEvent) != State.INCOMING) break block8;
                    if (!(PacketEventInvoker.c(packetEvent) instanceof S08PacketPlayerPosLook)) break block9;
                    if (!this.Q.equals(ListInvoker.get(StringPropertyInvoker.a(this.S), 1))) break block10;
                    packet = (S08PacketPlayerPosLook)PacketEventInvoker.c(packetEvent);
                    this.b(new C06PacketPlayerPosLook(alp_0.b((S08PacketPlayerPosLook)packet), alp_0.e((S08PacketPlayerPosLook)packet), alp_0.a((S08PacketPlayerPosLook)packet), alp_0.f((S08PacketPlayerPosLook)packet), alp_0.d((S08PacketPlayerPosLook)packet), false));
                    PlayerInvoker.b(this.mc.player, alp_0.b((S08PacketPlayerPosLook)packet), alp_0.e((S08PacketPlayerPosLook)packet), alp_0.a((S08PacketPlayerPosLook)packet));
                    if (auk_2.a((Boolean)Ba.b(this.N)) && this.mc.player.posY >= this.R) {
                        MCInvoker.v((Minecraft)this.mc).posY = this.mc.player.prevPosY;
                    }
                    if (!MCInvoker.aa((Minecraft)this.mc).c) {
                        MCInvoker.displayGuiScreen(this.mc, null);
                        MCInvoker.aa((Minecraft)this.mc).c = true;
                    }
                    this.P = PlayerInvoker.d(this.mc.player, true) * 0.98;
                    this.mc.player.motionY = 0.42f;
                    this.mc.player.ticksOffground = 0;
                    PacketEventInvoker.setCancelled(packetEvent, true);
                }
                if (!(PacketEventInvoker.c(packetEvent) instanceof S12PacketEntityVelocity)) break block10;
                packet = (S12PacketEntityVelocity)PacketEventInvoker.c(packetEvent);
                if (aYL.d((S12PacketEntityVelocity)packet) == PlayerInvoker.O(this.mc.player)) {
                    if (aCM.a() && this.Q.equals(ListInvoker.get(StringPropertyInvoker.a(this.S), 0))) {
                        this.mc.player.motionY = (double)aYL.b((S12PacketEntityVelocity)packet) / 8000.0;
                    }
                    PacketEventInvoker.setCancelled(packetEvent, true);
                }
            }
            if (PacketEventInvoker.c(packetEvent) instanceof C08PacketPlayerBlockPlacement && C08PacketPlayerBlockPlacementInvoker.b(packet = (C08PacketPlayerBlockPlacement)PacketEventInvoker.c(packetEvent)) == 255 && this.Q.equals(ListInvoker.get(StringPropertyInvoker.a(this.S), 1)) && PlayerInvoker.h(this.mc.player) != null && act_2.k(PlayerInvoker.h(this.mc.player)) instanceof LC) {
                PacketEventInvoker.setCancelled(packetEvent, true);
            }
        }
    }

    private Boolean lambda$new$4() {
        Scaffold.p();
        return auk_2.b(StringPropertyInvoker.isMode(this.S, aIY.a) || auk_2.a((Boolean)Ba.b(this.J)));
    }

    private Boolean lambda$new$3() {
        return auk_2.b(StringPropertyInvoker.isMode(this.S, aIY.c));
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
    public void a(MoveEvent moveEvent) {
        Scaffold.p();
        if (this.Q.equals(ListInvoker.get(StringPropertyInvoker.a(this.S), 1))) {
            if (this.mc.player.onGround || wj_0.d(PlayerInvoker.j(this.mc.player)) && this.mc.player.ticksOffground > 6) {
                MoveInoker.setSpeed(moveEvent, 0.0);
            }
            this.P -= this.P / 229.0;
            MoveInoker.setSpeed(moveEvent, this.P);
        }
        if (this.Q.equals(ListInvoker.get(StringPropertyInvoker.a(this.S), 0))) {
            TargetStrafe targetStrafe = (TargetStrafe)ModuleInvoker.isEnable(ModuleRegistry.TARGETSTRAFE);
            MoveInoker.a(moveEvent, azd_2.d(targetStrafe) ? azd_2.c(targetStrafe) : PlayerInvoker.c(this.mc.player), azd_2.d(targetStrafe) ? 0.7 : db_0.b((Double)MD.b(this.H)));
        }
    }

    private Boolean lambda$new$0() {
        return auk_2.b(StringPropertyInvoker.isMode(this.S, aIY.e));
    }

    @Override
    public void o() {
        Scaffold.p();
        this.checkModule(Scaffold.class, Speed.class, LongJump.class);
        this.Q = (String)StringPropertyInvoker.b(this.S);
        this.M = 0;
        if (!this.mc.player.onGround && auk_2.a((Boolean)Ba.b(this.J))) {
            this.Q = (String)ListInvoker.get(StringPropertyInvoker.a(this.S), 0);
        }
        this.a(this.Q);
        if (this.Q.equals(ListInvoker.get(StringPropertyInvoker.a(this.S), 1))) {
            this.P = PlayerInvoker.d(this.mc.player, true) * 0.98;
            if (this.mc.player.onGround) {
                this.R = this.mc.player.posY;
                PlayerInvoker.v(this.mc.player);
            }
            this.R = MathHelper.d(this.mc.player.posY, 0.125) - 1.0;
        }
        if (this.Q.equals(ListInvoker.get(StringPropertyInvoker.a(this.S), 0)) && auk_2.a((Boolean)Ba.b(this.L)) && this.mc.player.onGround) {
            this.mc.player.motionY = 0.42f;
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = Fly.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    @EventTarget
    public void a(TickUpdateEvent tickUpdateEvent) {
        this.a(this.Q);
        ++this.M;
    }

    public StringProperty a() {
        return this.S;
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x7357;
        if (W[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])X.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                X.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_h", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return W[n2];
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Fly.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


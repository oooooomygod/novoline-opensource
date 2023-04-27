/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.move;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.CollideWithBlockEvent;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.events.MoveEvent;
import cc.novoline.events.events.SettingEvent;
import cc.novoline.events.events.TickUpdateEvent;
import cc.novoline.events.type.State;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.MoveInoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.player.Scaffold;
import deobf.EntityPlayerSP;
import cc.novoline.modules.EnumModuleType;
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
import net.A6;
import net.A_;
import net.minecraft.block.BlockPos;
import net.MathHelper;
import net.ModuleManager;
import net.NotificationType;
import net.P8;
import net.StringProperty;
import net.a1c;
import net.aB2;
import net.aCM;
import net.aL0;
import net.afm_0;
import net.akm_1;
import net.amv_2;
import net.asp_2;
import net.da_1;
import net.minecraft.block.BlockLiquid;
import net.rm_2;
import net.wj_0;
import org.checkerframework.checker.nullness.qual.NonNull;

public class WaterWalk
extends AbstractModule {
    private double L;
    private int K;
    private static Map P;
    private static String[] N;
    private boolean I;
    @Property(value="mode")
    private StringProperty H;
    private static long M;
    private static String[] O;
    private int J;

    @EventTarget
    public void a(CollideWithBlockEvent collideWithBlockEvent) {
        Scaffold.n();
        if (StringPropertyInvoker.isMode(this.H, aB2.f)) {
            Speed speed = (Speed)ModuleInvoker.isEnable(ModuleRegistry.SPEED);
            if (akm_1.f(BlocksInvoker.getBlockState(A_.d(collideWithBlockEvent))) && !PlayerInvoker.ac(this.mc.player) && !wj_0.a(PlayerInvoker.j(this.mc.player)) && this.a(amv_2.j(A_.a(collideWithBlockEvent)), (double)amv_2.h(A_.a(collideWithBlockEvent)), amv_2.i(A_.a(collideWithBlockEvent))) && !speed.x()) {
                A_.a(collideWithBlockEvent, new rm_2(A_.a(collideWithBlockEvent), amv_2.a(A_.a(collideWithBlockEvent), 1, 1, 1)));
            }
        }
    }

    private boolean a(double d, double d2, double d3) {
        Scaffold.n();
        return P8.b((Integer)((Comparable)da_1.b(BlockStateInvoker.b(BlockInvoker.getMaterial(this.mc.world, new BlockPos(d, d2, d3))), BlockLiquid.P))) < 4;
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

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x401F;
        if (O[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])P.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                P.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_q", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return O[n2];
    }

    public StringProperty a() {
        return this.H;
    }

    private boolean b(MotionUpdateEvent motionUpdateEvent) {
        return BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, new BlockPos(EventInvoker.h(motionUpdateEvent), PlayerInvoker.p((EntityPlayerSP)this.mc.player).c - 1.0, EventInvoker.c(motionUpdateEvent)))) instanceof BlockLiquid;
    }

    @EventTarget
    public void a(TickUpdateEvent tickUpdateEvent) {
        this.a((String)StringPropertyInvoker.b(this.H));
    }

    static {
        M = a1c.a(8520376115400318592L, -3268427667352182414L, MethodHandles.lookup().lookupClass()).a(194535764167302L);
        P = new HashMap(13);
        long l4 = M ^ 0x37A5C2FF087FL;
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

    @Override
    public void w() {
        this.mc.player.U = 0.625f;
        this.I = false;
        this.J = 0;
        this.K = 0;
    }

    @EventTarget
    public void a(MoveEvent moveEvent) {
        block5: {
            block6: {
                Scaffold.n();
                Speed speed = (Speed)ModuleInvoker.isEnable(ModuleRegistry.SPEED);
                if (!aCM.d() || wj_0.a(PlayerInvoker.j(this.mc.player)) || speed.x()) break block5;
                if (!StringPropertyInvoker.isMode(this.H, aB2.a)) break block6;
                if (!PlayerInvoker.ak(this.mc.player) || PlayerInvoker.ac(this.mc.player)) break block5;
                MoveInoker.setSpeed(moveEvent, 0.16);
            }
            if (StringPropertyInvoker.isMode(this.H, aB2.b) && this.a(MathHelper.d(this.mc.player.posY, 1.0) - 0.001) && !this.a(this.mc.player.posY + 0.5)) {
                if (this.mc.player.ticksExisted % 8 == 0) {
                    MoveInoker.setSpeed(moveEvent, 0.16);
                }
                MoveInoker.setSpeed(moveEvent, 0.16);
            }
        }
    }

    private boolean a(double d) {
        return akm_1.f(BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, new BlockPos(this.mc.player.posX, d, this.mc.player.posZ)))));
    }

    public void a(SettingEvent settingEvent) {
        Scaffold.p();
        if ((settingEvent == null || afm_0.b(settingEvent).equals(aB2.g)) && !StringPropertyInvoker.isMode(this.H, aB2.h)) {
            this.a(this.r(), aL0.a(aL0.a(aL0.a(new StringBuilder(), aB2.d), StringInvoker.a((String)StringPropertyInvoker.b(this.H))), aB2.e).toString(), 3500, NotificationType.WARNING);
            StringPropertyInvoker.b(this.H, aB2.l);
        }
    }

    public WaterWalk(@NonNull ModuleManager moduleManager, char c, int n, short s, EnumModuleType enumModuleType, String string, String string2) {
        long l4 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48) ^ M;
        long l5 = l4 ^ 0x3AB22693E496L;
        int n2 = (int)(l5 >>> 48);
        int n3 = (int)(l5 << 16 >>> 48);
        int n4 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n2, enumModuleType, string, (char)n3, n4, string2);
        this.H = StringPropertyInvoker.b(asp_2.a((String)((Object)WaterWalk.b("w", (int)11999, (long)(0x66BB2DECA537DA07L ^ l4)))), new String[]{WaterWalk.b("w", (int)17473, (long)(0x74DBFA34AB5A309CL ^ l4)), WaterWalk.b("w", (int)1439, (long)(0x2C1A3F4AF160F141L ^ l4)), WaterWalk.b("w", (int)17772, (long)(0xB21676F215D31B5L ^ l4)), WaterWalk.b("w", (int)23964, (long)(0x112BAC581026A940L ^ l4))});
        ManagerInvoker.put(new Setting((String)((Object)WaterWalk.b("w", (int)1777, (long)(0x3C3F07D18136F22BL ^ l4))), (String)((Object)WaterWalk.b("w", (int)19958, (long)(0x320D2A08BA31B92DL ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.H));
    }

    @Override
    public void o() {
        this.a((String)StringPropertyInvoker.b(this.H));
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = WaterWalk.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_q" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    @EventTarget
    public void a(MotionUpdateEvent motionUpdateEvent) {
        block23: {
            block25: {
                block26: {
                    block24: {
                        Scaffold.n();
                        if (!EventInvoker.getState(motionUpdateEvent).equals((Object)State.PRE)) break block23;
                        if (this.a(ModuleRegistry.SPEED)) {
                            return;
                        }
                        if (!StringPropertyInvoker.isMode(this.H, aB2.j)) break block24;
                        if (!PlayerInvoker.ac(this.mc.player) || !this.a(this.mc.player.posX, this.mc.player.posY, this.mc.player.posZ)) break block23;
                        if (wj_0.a(PlayerInvoker.j(this.mc.player))) {
                            this.mc.player.motionY = -0.15;
                        }
                        if (wj_0.d(PlayerInvoker.j(this.mc.player))) {
                            this.mc.player.motionY = 0.0735;
                        }
                        if (EventInvoker.e(motionUpdateEvent) % 1.0 < 0.6) {
                            this.mc.player.motionY = 0.008;
                        }
                        if (!PlayerInvoker.q(this.mc.player)) break block23;
                        if (this.mc.player.motionY < 0.0 && !wj_0.a(PlayerInvoker.j(this.mc.player))) {
                            PlayerInvoker.d(this.mc.player, 0.22);
                        }
                        PlayerInvoker.d(this.mc.player, 0.11);
                    }
                    if (!StringPropertyInvoker.isMode(this.H, aB2.i)) break block25;
                    if (wj_0.a(PlayerInvoker.j(this.mc.player)) || !PlayerInvoker.ak(this.mc.player) || PlayerInvoker.ac(this.mc.player)) break block26;
                    if (this.mc.player.fallDistance != 0.0f) break block23;
                    this.mc.player.U = 0.015625f;
                    ++this.K;
                    if (aCM.d()) {
                        if (this.K == 1) {
                            EventInvoker.b(motionUpdateEvent, EventInvoker.e(motionUpdateEvent) - A6.a(A6.a(), 0.015525, 0.015625));
                        }
                        if (this.K == 2) {
                            EventInvoker.b(motionUpdateEvent, EventInvoker.e(motionUpdateEvent) + A6.a(A6.a(), 0.0149, 0.015));
                        }
                        if (this.K == 3) {
                            EventInvoker.b(motionUpdateEvent, EventInvoker.e(motionUpdateEvent) + A6.a(A6.a(), 0.0199, 0.02));
                        }
                        if (this.K >= 4) {
                            EventInvoker.b(motionUpdateEvent, EventInvoker.e(motionUpdateEvent) + 0.015625);
                            this.K = 0;
                        }
                        EventInvoker.b(motionUpdateEvent, PlayerInvoker.b(this.mc.player, EventInvoker.e(motionUpdateEvent)));
                    }
                    if (this.K % 2 == 0) {
                        EventInvoker.b(motionUpdateEvent, EventInvoker.e(motionUpdateEvent) - 1.0E-13);
                    }
                    EventInvoker.b(motionUpdateEvent, EventInvoker.e(motionUpdateEvent) + 1.0E-13);
                }
                this.K = 0;
                this.mc.player.U = 0.625f;
                if (wj_0.a(PlayerInvoker.j(this.mc.player)) || !PlayerInvoker.ac(this.mc.player) || !this.a(this.mc.player.posX, this.mc.player.posY, this.mc.player.posZ) && !this.a(this.mc.player.posY - 1.0) && !this.a(this.mc.player.posY + 1.0)) break block23;
                this.mc.player.motionY = 0.11999998688698;
            }
            if (StringPropertyInvoker.isMode(this.H, aB2.c) && PlayerInvoker.ac(this.mc.player) && !wj_0.a(PlayerInvoker.j(this.mc.player))) {
                this.mc.player.motionY = 0.11999998688698;
            }
            if (StringPropertyInvoker.isMode(this.H, aB2.k) && !wj_0.a(PlayerInvoker.j(this.mc.player))) {
                if (this.mc.player.onGround || PlayerInvoker.I(this.mc.player)) {
                    this.I = false;
                }
                if (this.mc.player.motionY > 0.0 && this.I) {
                    if (this.mc.player.motionY <= 0.1127) {
                        this.mc.player.motionY *= 1.267;
                    }
                    this.mc.player.motionY += 0.05172;
                }
                if (PlayerInvoker.ac(this.mc.player)) {
                    if (!this.b(motionUpdateEvent)) {
                        if (this.J < 3) {
                            this.mc.player.motionY = 0.13;
                            ++this.J;
                            this.I = false;
                        }
                        this.mc.player.motionY = 0.5;
                        this.J = 0;
                        this.I = true;
                    }
                    if (!wj_0.d(PlayerInvoker.j(this.mc.player))) {
                        this.mc.player.motionY = 0.09;
                    }
                }
            }
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(WaterWalk.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


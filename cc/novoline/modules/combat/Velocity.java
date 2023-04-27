/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.combat;

import cc.novoline.events.EventTarget;
import cc.novoline.events.State;
import cc.novoline.events.events.JumpEvent;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.events.PacketEvent;
import cc.novoline.events.events.SettingEvent;
import cc.novoline.events.events.TickUpdateEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.PacketEventInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import deobf.IntProperty;
import deobf.ModuleRegistry;
import cc.novoline.modules.exploits.NoFall;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import cc.novoline.modules.move.Speed;
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

import org.checkerframework.checker.nullness.qual.NonNull;

public class Velocity
extends AbstractModule {
    private double M;
    @Property(value="mode")
    private StringProperty N;
    private static Map R;
    @Property(value="vertical")
    private DoubleProperty K;
    @Property(value="horizontal")
    private DoubleProperty H;
    private static String[] Q;
    @Property(value="velocity-tick")
    private IntProperty I;
    private static String[] P;
    private double L;
    private double J;
    private static long O;

    public StringProperty a() {
        return this.N;
    }

    @EventTarget
    public void a(JumpEvent jumpEvent) {
        KillAura.w();
        if (this.mc.player.fuck > 7 && this.L > 0.0 && StringPropertyInvoker.isMode(this.N, aaw_2.m)) {
            SU.a(jumpEvent, this.L);
            this.L = 0.0;
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_y" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    @EventTarget
    public void a(TickUpdateEvent tickUpdateEvent) {
        this.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), MD.b(this.H)), aaw_2.d), MD.b(this.K)), aaw_2.l).toString());
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x6F1D;
        if (Q[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])R.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                R.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_y", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return Q[n2];
    }

    @EventTarget
    public void a(MotionUpdateEvent motionUpdateEvent) {
        KillAura.w();
        if (EventInvoker.getState(motionUpdateEvent) == cc.novoline.events.type.State.PRE && StringPropertyInvoker.isMode(this.N, aaw_2.g) && this.mc.player.onGround && !wj_0.d(PlayerInvoker.j(this.mc.player)) && this.mc.player.fuck > 7 && this.L > 0.0) {
            this.mc.player.motionY = this.L;
            this.L = 0.0;
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = Velocity.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
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

    public void a(SettingEvent settingEvent) {
        KillAura.w();
        if ((settingEvent == null || afm_0.b(settingEvent).equals(aaw_2.e)) && db_0.b((Double)MD.b(this.K)) < 100.0) {
            MD.b(this.K, db_0.a(100.0));
        }
    }

    @EventTarget
    private void a(PacketEvent packetEvent) {
        block11: {
            block13: {
                block12: {
                    S12PacketEntityVelocity s12PacketEntityVelocity;
                    KillAura.w();
                    if (!PacketEventInvoker.getState(packetEvent).equals((Object)State.INCOMING) || !(PacketEventInvoker.c(packetEvent) instanceof S12PacketEntityVelocity) || aYL.d(s12PacketEntityVelocity = (S12PacketEntityVelocity)PacketEventInvoker.c(packetEvent)) != PlayerInvoker.O(this.mc.player)) break block11;
                    this.M = 0.0;
                    this.L = 0.0;
                    this.J = 0.0;
                    PacketEventInvoker.setCancelled(packetEvent, true);
                    NoFall noFall = (NoFall)ModuleInvoker.isEnable(ModuleRegistry.NOFALL);
                    Speed speed = (Speed)ModuleInvoker.isEnable(ModuleRegistry.SPEED);
                    if (noFall.x() && aca_1.a(noFall) || this.a(ModuleRegistry.LONGJUMP) || speed.x() && StringPropertyInvoker.isMode(speed.a(), aaw_2.b)) {
                        return;
                    }
                    double d = (double)aYL.a(s12PacketEntityVelocity) / 8000.0;
                    double d2 = (double)aYL.b(s12PacketEntityVelocity) / 8000.0;
                    double d3 = (double)aYL.c(s12PacketEntityVelocity) / 8000.0;
                    this.J = d * (0.01 * db_0.b((Double)MD.b(this.H)));
                    this.L = d2 * (0.01 * db_0.b((Double)MD.b(this.K)));
                    this.M = d3 * (0.01 * db_0.b((Double)MD.b(this.H)));
                    if (!StringPropertyInvoker.isMode(this.N, aaw_2.j)) break block12;
                    if (this.J != 0.0) {
                        this.mc.player.motionX = this.J;
                    }
                    if (this.M != 0.0) {
                        this.mc.player.motionZ = this.M;
                    }
                    if (!this.mc.player.onGround || !(this.L > 0.0)) break block13;
                    this.mc.player.motionY = this.L;
                    this.L = 0.0;
                }
                if (StringPropertyInvoker.isMode(this.N, aaw_2.i) || StringPropertyInvoker.isMode(this.N, aaw_2.f) && (this.mc.player.fuck < P8.b((Integer)adt_2.a(this.I)) || this.mc.player.onGround)) {
                    if (this.J != 0.0) {
                        this.mc.player.motionX = this.J;
                    }
                    if (this.M != 0.0) {
                        this.mc.player.motionZ = this.M;
                    }
                    if (this.L != 0.0) {
                        this.mc.player.motionY = this.L;
                    }
                }
            }
            if (StringPropertyInvoker.isMode(this.N, aaw_2.h)) {
                this.mc.player.fuck = 20;
            }
        }
    }

    public Velocity(@NonNull int n, char c, ModuleManager moduleManager, EnumModuleType enumModuleType, String string, short s) {
        long l4 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)s << 48 >>> 48) ^ O;
        long l5 = l4 ^ 0x1703323F07BL;
        int n2 = (int)(l5 >>> 56);
        long l6 = l5 << 8 >>> 8;
        super((byte)n2, moduleManager, l6, enumModuleType, string);
        this.N = StringPropertyInvoker.b(asp_2.a((String)((Object)Velocity.b("o", (int)30145, (long)(0x71F87DD7BA184D9AL ^ l4)))), new String[]{Velocity.b("o", (int)25430, (long)(0x1AA82BF41BC75B0FL ^ l4)), Velocity.b("o", (int)26186, (long)(0x490CD7CFF9E05E1EL ^ l4)), Velocity.b("o", (int)7195, (long)(0x2EB9A1786F8C2441L ^ l4))});
        this.I = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(9)), P8.d(5)), P8.d(20));
        this.H = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(0.0)), db_0.a(-100.0)), db_0.a(100.0));
        this.K = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(100.0)), db_0.a(0.0)), db_0.a(100.0));
        ManagerInvoker.put(new Setting((String)((Object)Velocity.b("o", (int)28714, (long)(0x2983B18C5EE4487BL ^ l4))), (String)((Object)Velocity.b("o", (int)25413, (long)(0x19EE8188BB71DB12L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.N));
        ManagerInvoker.put(new Setting((String)((Object)Velocity.b("o", (int)24428, (long)(0x26C682FD5FFA6734L ^ l4))), (String)((Object)Velocity.b("o", (int)11642, (long)(0x7CF3DA2C57559529L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.I, 1.0, this::lambda$new$0));
        ManagerInvoker.put(new Setting((String)((Object)Velocity.b("o", (int)18677, (long)(0x496691090EA70A5L ^ l4))), (String)((Object)Velocity.b("o", (int)19942, (long)(0x71A9B92C161175B0L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.H, 5.0, "%"));
        ManagerInvoker.put(new Setting((String)((Object)Velocity.b("o", (int)24882, (long)(0x941624C280F5967L ^ l4))), (String)((Object)Velocity.b("o", (int)17173, (long)(0x2DB20A3306137B47L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.K, 5.0, "%"));
    }

    private Boolean lambda$new$0() {
        return auk_2.b(StringPropertyInvoker.isMode(this.N, aaw_2.k));
    }

    static {
        O = a1c.a(2452134572770719488L, 4669941516193769096L, MethodHandles.lookup().lookupClass()).a(139058650940113L);
        R = new HashMap(13);
        long l4 = O ^ 0x7B87660EEC4BL;
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
    public void o() {
        this.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), MD.b(this.H)), aaw_2.c), MD.b(this.K)), aaw_2.a).toString());
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Velocity.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


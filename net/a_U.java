/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.events.MoveEvent;
import cc.novoline.events.type.State;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.MoveInoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import deobf.IntProperty;
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
import net.minecraft.client.Minecraft;
import org.checkerframework.checker.nullness.qual.NonNull;

public class a_U
extends AbstractModule {
    private static long K = a1c.a(-4035184173179740769L, -8490411743441693641L, MethodHandles.lookup().lookupClass()).a(96488186213648L);
    private int I;
    private static String[] M;
    @Property(value="jumps")
    private IntProperty J;
    @Property(value="timer-speed")
    public DoubleProperty H;
    private static Map N;
    private static String[] L;

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = a_U.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    public a_U(@NonNull ModuleManager moduleManager, int n, EnumModuleType enumModuleType, String string, int n2, String string2, short s) {
        long l4 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)s << 48 >>> 48) ^ K;
        long l5 = l4 ^ 0x3372CC5DEAF7L;
        int n3 = (int)(l5 >>> 48);
        int n4 = (int)(l5 << 16 >>> 48);
        int n5 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n3, enumModuleType, string, (char)n4, n5, string2);
        this.H = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(1.0)), db_0.a(1.0)), db_0.a(2.0));
        this.J = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(10)), P8.d(5)), P8.d(25));
        ManagerInvoker.put(new Setting((String)((Object)a_U.b("m", (int)4235, (long)(0x1170B0560E8A3CD9L ^ l4))), (String)((Object)a_U.b("m", (int)8309, (long)(0x2D506348FA2B8C24L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.J, 1.0));
        ManagerInvoker.put(new Setting((String)((Object)a_U.b("m", (int)20301, (long)(0x5F4CCB6EF52B631DL ^ l4))), (String)((Object)a_U.b("m", (int)12197, (long)(0x5A29EB9C6CF483F6L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.H, 0.1));
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

    static {
        N = new HashMap(13);
        long l4 = K ^ 0xAAFA13B58D4L;
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
    public void a(MoveEvent moveEvent) {
        if (this.I < P8.b((Integer)adt_2.a(this.J)) * 2) {
            MoveInoker.setSpeed(moveEvent, 0.0);
        }
    }

    @Override
    public void o() {
        this.I = 0;
    }

    @EventTarget
    public void a(MotionUpdateEvent motionUpdateEvent) {
        UhcCrafts.d();
        if (EventInvoker.getState(motionUpdateEvent) == State.PRE) {
            if (this.I < P8.b((Integer)adt_2.a(this.J)) * 2) {
                this.mc.timer.timerSpeed = db_0.a((Double)MD.b(this.H));
                if (this.mc.player.onGround) {
                    if (this.I % 2 == 0) {
                        double d = -MathHelper.h(MathInvoker.o(PlayerInvoker.c(this.mc.player)));
                        double d2 = MathHelper.b(MathInvoker.o(PlayerInvoker.c(this.mc.player)));
                        EventInvoker.c(motionUpdateEvent, EventInvoker.h(motionUpdateEvent) + d * PlayerInvoker.a(this.mc.player, false) * 0.15);
                        EventInvoker.a(motionUpdateEvent, EventInvoker.c(motionUpdateEvent) + d2 * PlayerInvoker.a(this.mc.player, false) * 0.15);
                        EventInvoker.b(motionUpdateEvent, EventInvoker.e(motionUpdateEvent) + MathHelper.a(4.0E-4, 5.0E-4));
                        EventInvoker.b(motionUpdateEvent, false);
                    }
                    EventInvoker.b(motionUpdateEvent, EventInvoker.e(motionUpdateEvent) + 0.1249999999);
                    EventInvoker.b(motionUpdateEvent, false);
                    ++this.I;
                }
                MCInvoker.v((Minecraft)this.mc).posY = EventInvoker.e(motionUpdateEvent);
            }
            this.mc.timer.timerSpeed = 1.0f;
            this.d();
        }
    }

    @Override
    public void w() {
        this.mc.timer.timerSpeed = 1.0f;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_U" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x16F5;
        if (M[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])N.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                N.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_U", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return M[n2];
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(a_U.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


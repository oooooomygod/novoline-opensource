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
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.player.Scaffold;
import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import net.minecraft.network.packts.C04PacketPlayerPosition;
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

public class HClip
extends AbstractModule {
    private static Map M;
    private static String[] K;
    @Property(value="mode")
    private StringProperty I;
    private int H;
    private static long J;
    private static String[] L;

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = HClip.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    public HClip(@NonNull ModuleManager moduleManager, short s, EnumModuleType enumModuleType, int n, short s3, String string) {
        long l4 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)s3 << 48 >>> 48) ^ J;
        long l5 = l4 ^ 0x249F71E31A49L;
        int n2 = (int)(l5 >>> 56);
        long l6 = l5 << 8 >>> 8;
        super((byte)n2, moduleManager, l6, enumModuleType, string);
        this.I = StringPropertyInvoker.b(asp_2.a((String)((Object)HClip.b("p", (int)3004, (long)(0x6C3506552CAE5E61L ^ l4)))), new String[]{HClip.b("p", (int)22563, (long)(0x60D694C282F58DFFL ^ l4)), HClip.b("p", (int)16138, (long)(0x3670951B80AE6AD4L ^ l4))});
        ManagerInvoker.put(new Setting((String)((Object)HClip.b("p", (int)1113, (long)(0x70C0EBEA72C9D182L ^ l4))), (String)((Object)HClip.b("p", (int)700, (long)(0x27646A3FC5705763L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.I));
    }

    static {
        J = a1c.a(3576938018145401699L, 9133366297192467974L, MethodHandles.lookup().lookupClass()).a(62862278794860L);
        M = new HashMap(13);
        long l4 = J ^ 0x7AACD81581F3L;
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
        Scaffold.p();
        if (EventInvoker.getState(motionUpdateEvent) == State.PRE) {
            double d = this.mc.player.posX;
            double d2 = this.mc.player.posY;
            double d3 = this.mc.player.posZ;
            if (StringPropertyInvoker.isMode(this.I, aHh.b)) {
                double d4 = -MathHelper.h(MathInvoker.o(PlayerInvoker.c(this.mc.player)));
                double d5 = MathHelper.b(MathInvoker.o(PlayerInvoker.c(this.mc.player)));
                this.a(new C04PacketPlayerPosition(d + d4 * 7.5, d2 - 1.75, d3 + d5 * 7.5, true));
                PlayerInvoker.b(this.mc.player, d + d4 * 7.5, d2 - 1.75, d3 + d5 * 7.5);
                this.d();
            }
            this.mc.timer.timerSpeed = 0.5f;
            this.mc.player.bO = 0.1f;
            ++this.H;
            if (this.H > 12) {
                this.a(new C04PacketPlayerPosition(d, d2 - 1.75, d3, true));
                PlayerInvoker.b(this.mc.player, d, d2 - 1.75, d3);
                this.H = 0;
            }
            this.mc.player.motionY = 0.0;
            EventInvoker.a(motionUpdateEvent, true);
        }
    }

    @EventTarget
    public void a(MoveEvent moveEvent) {
        Scaffold.p();
        if (StringPropertyInvoker.isMode(this.I, aHh.a)) {
            MoveInoker.setSpeed(moveEvent, 0.0);
        }
        MoveInoker.setSpeed(moveEvent, PlayerInvoker.a(this.mc.player, true) * 2.0);
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
            throw new RuntimeException("net/a_G" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x68A3;
        if (L[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])M.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                M.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_G", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return L[n2];
    }

    @Override
    public void o() {
        this.H = 0;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(HClip.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


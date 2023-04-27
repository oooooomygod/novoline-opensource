/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.CollideWithBlockEvent;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.events.MoveEvent;
import cc.novoline.events.type.State;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.GameSettingsInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.MoveInoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.exploits.Disabler;
import cc.novoline.modules.EnumModuleType;
import deobf.IntProperty;
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

public class Phase
extends AbstractModule {
    private static Map M;
    private static String[] L;
    private static String[] K;
    @Property(value="mode")
    private StringProperty H;
    private static long J;
    @Property(value="hieght")
    private IntProperty I;

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_v" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = Phase.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    static {
        J = a1c.a(-7119268960391400130L, 2344448119356691106L, MethodHandles.lookup().lookupClass()).a(274092738991495L);
        M = new HashMap(13);
        long l4 = J ^ 0x3301EFAE6C4FL;
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
        Disabler.d();
        if (StringPropertyInvoker.isMode(this.H, vl_0.e) && PlayerInvoker.Q(this.mc.player)) {
            if (GameSettingsInvoker.e(this.mc.gameSettings.bo)) {
                MoveInoker.setY(moveEvent, this.mc.player.motionY += (double)0.09f);
            }
            if (GameSettingsInvoker.e(this.mc.gameSettings.A)) {
                MoveInoker.setY(moveEvent, this.mc.player.motionY -= (double)0.09f);
            }
            this.mc.player.motionY = 0.0;
            MoveInoker.setY(moveEvent, 0.0);
            MoveInoker.setSpeed(moveEvent, PlayerInvoker.M(this.mc.player));
        }
    }

    private Boolean lambda$new$0() {
        return auk_2.b(StringPropertyInvoker.isMode(this.H, vl_0.d));
    }

    @EventTarget
    public void a(CollideWithBlockEvent collideWithBlockEvent) {
        Disabler.d();
        if (StringPropertyInvoker.isMode(this.H, vl_0.a) && PlayerInvoker.Q(this.mc.player)) {
            A_.a(collideWithBlockEvent, null);
        }
    }

    @Override
    public void w() {
        this.mc.player.U = 0.625f;
    }

    public Phase(@NonNull ModuleManager moduleManager, char c, EnumModuleType enumModuleType, long l4, String string) {
        long l5 = ((long)c << 48 | l4 << 16 >>> 16) ^ J;
        long l6 = l5 ^ 0x3C36AE640648L;
        int n = (int)(l6 >>> 56);
        long l7 = l6 << 8 >>> 8;
        super((byte)n, moduleManager, l7, enumModuleType, string);
        this.H = StringPropertyInvoker.b(asp_2.a((String)((Object)Phase.b("s", (int)22665, (long)(0x6991B24FB38461L ^ l5)))), new String[]{Phase.b("s", (int)3248, (long)(0x11A93B6034E4505FL ^ l5)), Phase.b("s", (int)18773, (long)(0xF4D51222F3715B8L ^ l5))});
        this.I = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(-3)), P8.d(-10)), P8.d(10));
        ManagerInvoker.put(new Setting((String)((Object)Phase.b("s", (int)7078, (long)(0x30E88628BFCD474AL ^ l5))), (String)((Object)Phase.b("s", (int)27078, (long)(0x60E8DF442AC3B528L ^ l5))), SettingType.COMBOBOX, (AbstractModule)this, this.H));
        ManagerInvoker.put(new Setting((String)((Object)Phase.b("s", (int)2902, (long)(0x62E7FB259D8257BDL ^ l5))), (String)((Object)Phase.b("s", (int)10084, (long)(0x8171625BA91FB8DL ^ l5))), SettingType.SLIDER, (AbstractModule)this, this.I, 1.0, this::lambda$new$0));
    }

    @EventTarget
    public void a(MotionUpdateEvent motionUpdateEvent) {
        Disabler.d();
        if (StringPropertyInvoker.isMode(this.H, vl_0.c) && EventInvoker.getState(motionUpdateEvent).equals((Object)State.PRE)) {
            this.mc.player.U = 0.015625f;
            float f = wj_0.b(PlayerInvoker.j(this.mc.player));
            float f2 = wj_0.c(PlayerInvoker.j(this.mc.player));
            float f3 = this.mc.player.rotationYaw;
            double d = 0.3;
            double d2 = -MathHelper.h(MathInvoker.o(f3));
            double d3 = MathHelper.b(MathInvoker.o(f3));
            double d4 = (double)f2 * d * d2 + (double)f * d * d3;
            double d5 = (double)f2 * d * d3 - (double)f * d * d2;
            if (this.mc.player.g && !PlayerInvoker.I(this.mc.player) && this.mc.player.onGround) {
                double d6 = this.mc.player.posX;
                double d7 = this.mc.player.posY;
                double d8 = this.mc.player.posZ;
                this.a(new C04PacketPlayerPosition(d6 + d4, d7, d8 + d5, true));
                this.a(new C04PacketPlayerPosition(d6, d7 + 3.0, d8, true));
                PlayerInvoker.b(this.mc.player, d6 + d4, d7, d8 + d5);
            }
        }
    }

    @Override
    public void o() {
        Disabler.d();
        if (StringPropertyInvoker.isMode(this.H, vl_0.b)) {
            PlayerInvoker.b(this.mc.player, this.mc.player.posX, this.mc.player.posY + (double)P8.b((Integer)adt_2.a(this.I)), this.mc.player.posZ);
            this.d();
        }
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
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x7D90;
        if (L[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])M.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                M.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_v", exception);
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Phase.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


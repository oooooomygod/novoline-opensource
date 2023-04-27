/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.visual;

import cc.novoline.events.EventTarget;
import cc.novoline.events.State;
import cc.novoline.events.events.PacketEvent;
import cc.novoline.events.events.PlayerUpdateEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.PacketEventInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import deobf.ModuleRegistry;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import net.minecraft.network.packts.S1DPacketEntityEffect;
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

public class NoEffects
extends AbstractModule {
    private static String[] K;
    private static Map L;
    private static long I;
    @Property(value="effects")
    private ListProperty<String> H;
    private static String[] J;

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = NoEffects.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    public NoEffects(@NonNull int n, ModuleManager moduleManager, int n2, EnumModuleType enumModuleType, String string, String string2) {
        long l4 = ((long)n << 32 | (long)n2 << 32 >>> 32) ^ I;
        long l5 = l4 ^ 0x565C430CFD69L;
        int n3 = (int)(l5 >>> 48);
        int n4 = (int)(l5 << 16 >>> 48);
        int n5 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n3, enumModuleType, string, (char)n4, n5, string2);
        this.H = ava_0.a(asp_2.a(NoEffects.b("d", (int)26296, (long)(0x81A06EEB7F6674L ^ l4)), NoEffects.b("d", (int)10636, (long)(0x289FDA246476A945L ^ l4)), NoEffects.b("d", (int)2186, (long)(0x56EEDED8AC878845L ^ l4))), new String[]{NoEffects.b("d", (int)6778, (long)(0x16F2DF80DE169AB2L ^ l4)), NoEffects.b("d", (int)29761, (long)(0x27188A8645C9748AL ^ l4)), NoEffects.b("d", (int)6180, (long)(0x41852D5FDB4498EEL ^ l4))});
        ManagerInvoker.put(new Setting((String)((Object)NoEffects.b("d", (int)21921, (long)(0x5BAC8EDE87DD556FL ^ l4))), (String)((Object)NoEffects.b("d", (int)11342, (long)(0x5F02EF9CF4D4AC83L ^ l4))), SettingType.SELECTBOX, (AbstractModule)this, this.H));
    }

    @EventTarget
    public void a(PlayerUpdateEvent playerUpdateEvent) {
        FullBright fullBright;
        UhcCrafts.d();
        if (ava_0.b(this.H, vw_2.e) && PlayerInvoker.a(this.mc.player, 9)) {
            PlayerInvoker.e(this.mc.player, 9);
        }
        if ((!(fullBright = (FullBright)ModuleInvoker.isEnable(ModuleRegistry.BRIGHTNESS)).x() || !StringPropertyInvoker.isMode(bp_0.a(fullBright), vw_2.b)) && ava_0.b(this.H, vw_2.c) && PlayerInvoker.a(this.mc.player, 16)) {
            PlayerInvoker.e(this.mc.player, 16);
        }
        if (ava_0.b(this.H, vw_2.g) && PlayerInvoker.a(this.mc.player, 15)) {
            PlayerInvoker.e(this.mc.player, 15);
        }
    }

    @EventTarget
    public void a(PacketEvent packetEvent) {
        UhcCrafts.d();
        if (PacketEventInvoker.getState(packetEvent).equals((Object)State.INCOMING) && PacketEventInvoker.c(packetEvent) instanceof S1DPacketEntityEffect) {
            S1DPacketEntityEffect s1DPacketEntityEffect = (S1DPacketEntityEffect)PacketEventInvoker.c(packetEvent);
            if (ava_0.b(this.H, vw_2.d) && a3M.b(azg_0.g(s1DPacketEntityEffect)) == 9 || ava_0.b(this.H, vw_2.f) && a3M.b(azg_0.g(s1DPacketEntityEffect)) == 16 || ava_0.b(this.H, vw_2.a) && a3M.b(azg_0.g(s1DPacketEntityEffect)) == 15) {
                a3M.c(azg_0.g(s1DPacketEntityEffect), false);
                PacketEventInvoker.setCancelled(packetEvent, true);
            }
        }
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x2DF5;
        if (K[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])L.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                L.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_n", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return K[n2];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_n" + " : " + string + " : " + methodType.toString(), exception);
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

    static {
        I = a1c.a(360692212270318930L, 7802226902973917647L, MethodHandles.lookup().lookupClass()).a(247232149483832L);
        L = new HashMap(13);
        long l4 = I ^ 0x7942C107CC37L;
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(NoEffects.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


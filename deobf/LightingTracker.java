/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package deobf;

import cc.novoline.events.EventTarget;
import cc.novoline.events.State;
import cc.novoline.events.events.PacketEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.PacketEventInvoker;
import cc.novoline.invoke.S29PacketSoundEffectInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import net.minecraft.network.packts.S29PacketSoundEffect;
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
import net.BooleanProperty;
import net.ChatComponentText;
import net.GW;
import net.H6;
import net.HX;
import net.ModuleManager;
import net.UV;
import net.UhcCrafts;
import net.Waypoints;
import net.a1c;
import net.aL0;
import net.aar_1;
import net.amn_0;
import net.asp_2;
import net.awv_1;
import net.axq_2;
import net.ayg_2;
import net.di_2;
import net.k_0;
import net.kp_1;
import net.lj_1;
import org.checkerframework.checker.nullness.qual.NonNull;

public class LightingTracker
extends AbstractModule {
    @Property(value="auto-waypoint")
    BooleanProperty H;
    private static String[] K;
    private static Map L;
    private static String[] J;
    private static long I;

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = LightingTracker.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    @EventTarget
    public void a(PacketEvent packetEvent) {
        S29PacketSoundEffect s29PacketSoundEffect;
        UhcCrafts.d();
        if (PacketEventInvoker.getState(packetEvent).equals((Object)State.INCOMING) && PacketEventInvoker.c(packetEvent) instanceof S29PacketSoundEffect && S29PacketSoundEffectInvoker.c(s29PacketSoundEffect = (S29PacketSoundEffect)PacketEventInvoker.c(packetEvent)).equals(di_2.c)) {
            int n = (int)S29PacketSoundEffectInvoker.e(s29PacketSoundEffect);
            int n2 = (int)MathInvoker.d(100.0, S29PacketSoundEffectInvoker.b(s29PacketSoundEffect));
            int n3 = (int)S29PacketSoundEffectInvoker.d(s29PacketSoundEffect);
            String string = MCInvoker.k(this.mc) ? di_2.d : di_2.e;
            String string2 = aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(new StringBuilder(), n), di_2.a), n2), di_2.f), n3).toString();
            ChatComponentText chatComponentText = new ChatComponentText(string2);
            axq_2.a(chatComponentText, HX.a(axq_2.b(chatComponentText), new amn_0(H6.SHOW_TEXT, new ChatComponentText(aL0.a(aL0.a(new StringBuilder(), string), string2).toString()))));
            axq_2.a(chatComponentText, HX.a(axq_2.b(chatComponentText), new awv_1(k_0.RUN_COMMAND, aL0.a(aL0.a(new StringBuilder(), string), string2).toString())));
            ChatComponentText chatComponentText2 = new ChatComponentText(aL0.a(aL0.a(new StringBuilder(), aar_1.a(UV.a(this.r()))), di_2.g).toString());
            axq_2.a(chatComponentText2, chatComponentText);
            kp_1.a(GW.f(this.mc.ingameGUI), chatComponentText2);
            Waypoints waypoints = (Waypoints)ModuleInvoker.isEnable(ModuleRegistry.WAYPOINTS);
            ayg_2.a(waypoints, new lj_1(di_2.b, n, n2, n3));
        }
    }

    public LightingTracker(@NonNull char c, ModuleManager moduleManager, EnumModuleType enumModuleType, String string, int n, short s, String string2) {
        long l4 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48) ^ I;
        long l5 = l4 ^ 0x562964CF9093L;
        int n2 = (int)(l5 >>> 48);
        int n3 = (int)(l5 << 16 >>> 48);
        int n4 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n2, enumModuleType, string, (char)n3, n4, string2);
        this.H = asp_2.c();
        ManagerInvoker.put(new Setting((String)((Object)LightingTracker.b("v", (int)125, (long)(0x6235ED69F2AC6748L ^ l4))), (String)((Object)LightingTracker.b("v", (int)6928, (long)(0x2AAD1E2E135B7C24L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.H));
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x27F6;
        if (K[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])L.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                L.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_g", exception);
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

    static {
        I = a1c.a(7240278771680726005L, -3474828577920875722L, MethodHandles.lookup().lookupClass()).a(241788996852725L);
        L = new HashMap(13);
        long l4 = I ^ 0x47DE6BB9AC57L;
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

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_g" + " : " + string + " : " + methodType.toString(), exception);
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(LightingTracker.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


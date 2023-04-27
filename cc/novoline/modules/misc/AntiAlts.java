/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.misc;

import cc.novoline.events.EventTarget;
import cc.novoline.events.State;
import cc.novoline.events.events.LoadWorldEvent;
import cc.novoline.events.events.PacketEvent;
import cc.novoline.events.events.PlayerUpdateEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.PacketEventInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import deobf.MCInvoker;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import deobf.TimerUtil;
import net.minecraft.network.packts.C01PacketChatMessage;
import net.minecraft.network.packts.S02PacketChat;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;

import org.checkerframework.checker.nullness.qual.NonNull;

public class AntiAlts
extends AbstractModule {
    private static Map N;
    private static String[] L;
    private static long K;
    @Property(value="report-bot")
    private BooleanProperty H;
    private List<UUID> I;
    private TimerUtil J;
    private static String[] M;

    public AntiAlts(@NonNull short s, ModuleManager moduleManager, EnumModuleType enumModuleType, String string, String string2, long l4) {
        long l5 = ((long)s << 48 | l4 << 16 >>> 16) ^ K;
        long l6 = l5 ^ 0x1FE02ED0D6ECL;
        int n = (int)(l6 >>> 48);
        int n2 = (int)(l6 << 16 >>> 48);
        int n3 = (int)(l6 << 32 >>> 32);
        super(moduleManager, (char)n, enumModuleType, string, (char)n2, n3, string2);
        this.I = new CopyOnWriteArrayList<UUID>();
        this.J = new TimerUtil();
        this.H = asp_2.c();
        ManagerInvoker.put(new Setting((String)((Object)AntiAlts.b("z", (int)24390, (long)(0x4766CEA51F1C534CL ^ l5))), (String)((Object)AntiAlts.b("z", (int)7789, (long)(0x7A0D2B8185809266L ^ l5))), SettingType.CHECKBOX, (AbstractModule)this, this.H));
    }

    @EventTarget
    public void a(LoadWorldEvent loadWorldEvent) {
        ListInvoker.clear(this.I);
        qh_1.b(this.J);
    }

    static {
        K = a1c.a(-1755429842186331741L, 154314514825953029L, MethodHandles.lookup().lookupClass()).a(243462397965988L);
        N = new HashMap(13);
        long l4 = K ^ 0x6C4AC84B560EL;
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
            throw new RuntimeException("net/a_V" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    @EventTarget
    public void a(PlayerUpdateEvent playerUpdateEvent) {
        UhcCrafts.d();
        Iterator iterator = ms_0.a(aDM.b(MCInvoker.aa(this.mc)));
        if (dz_0.c(iterator)) {
            NetworkPlayerInfo networkPlayerInfo = (NetworkPlayerInfo)dz_0.b(iterator);
            UUID uUID = a4Z.a(aNL.a(networkPlayerInfo));
            String string = aNL.a(networkPlayerInfo).getName();
            if (qh_1.c(this.J, 1000L) && !ListInvoker.contains(this.I, uUID) && !uUID.equals(PlayerInvoker.ad(this.mc.player))) {
                String string2 = aL0.a(aL0.a(aL0.a(new StringBuilder(), EH.a), string), EH.c).toString();
                this.a(new C01PacketChatMessage(string2));
                if (auk_2.a((Boolean)Ba.b(this.H))) {
                    // empty if block
                }
                ListInvoker.add(this.I, uUID);
                qh_1.b(this.J);
            }
        }
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0xAB7;
        if (M[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])N.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                N.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_V", exception);
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

    @EventTarget
    public void a(PacketEvent packetEvent) {
        S02PacketChat s02PacketChat;
        UhcCrafts.d();
        if (PacketEventInvoker.getState(packetEvent).equals((Object)State.INCOMING) && PacketEventInvoker.c(packetEvent) instanceof S02PacketChat && StringInvoker.e(aBO.a(ue_2.c(s02PacketChat = (S02PacketChat)PacketEventInvoker.c(packetEvent))), EH.b)) {
            PacketEventInvoker.setCancelled(packetEvent, true);
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

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = AntiAlts.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AntiAlts.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


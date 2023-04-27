/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.events.EventTarget;
import cc.novoline.events.State;
import cc.novoline.events.events.PacketEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.PacketEventInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import net.minecraft.network.packts.C01PacketChatMessage;
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

public class a_3
extends AbstractModule {
    private static Map L;
    private static long I;
    private static String[] J;
    @Property(value="mode")
    private StringProperty H;
    private static String[] K;

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x519A;
        if (K[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])L.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                L.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_3", exception);
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

    @EventTarget
    public void a(PacketEvent packetEvent) {
        C01PacketChatMessage c01PacketChatMessage;
        String string;
        UhcCrafts.d();
        if (PacketEventInvoker.getState(packetEvent) == State.OUTGOING && PacketEventInvoker.c(packetEvent) instanceof C01PacketChatMessage && !StringInvoker.e(string = aco_0.a(c01PacketChatMessage = (C01PacketChatMessage)PacketEventInvoker.c(packetEvent)), anc_1.z) && !StringInvoker.e(string, anc_1.n)) {
            char[] cArray;
            int n;
            int n2;
            StringBuilder stringBuilder = new StringBuilder();
            if (StringPropertyInvoker.isMode(this.H, anc_1.y)) {
                string = StringInvoker.a(string, (CharSequence)anc_1.e, (CharSequence)anc_1.x);
                string = StringInvoker.a(string, (CharSequence)anc_1.C, (CharSequence)anc_1.c);
                string = StringInvoker.a(string, (CharSequence)anc_1.h, (CharSequence)anc_1.o);
                string = StringInvoker.a(string, (CharSequence)anc_1.w, (CharSequence)anc_1.j);
                string = StringInvoker.a(string, (CharSequence)anc_1.r, (CharSequence)anc_1.a);
                string = StringInvoker.a(string, (CharSequence)anc_1.m, (CharSequence)anc_1.b);
                string = StringInvoker.a(string, (CharSequence)anc_1.q, (CharSequence)anc_1.v);
                string = StringInvoker.a(string, (CharSequence)anc_1.t, (CharSequence)anc_1.D);
                string = StringInvoker.a(string, (CharSequence)anc_1.k, (CharSequence)anc_1.s);
                string = StringInvoker.a(string, (CharSequence)anc_1.f, (CharSequence)anc_1.u);
                string = StringInvoker.a(string, (CharSequence)anc_1.i, (CharSequence)anc_1.A);
                string = StringInvoker.a(string, (CharSequence)anc_1.l, (CharSequence)anc_1.g);
                string = StringInvoker.a(string, (CharSequence)anc_1.d, (CharSequence)anc_1.p);
                aco_0.a(c01PacketChatMessage, string);
            }
            if ((n2 = 0) < (n = (cArray = StringInvoker.f(string)).length)) {
                char c = cArray[n2];
                aL0.a(aL0.a(stringBuilder, c), anc_1.B);
                ++n2;
            }
            aco_0.a(c01PacketChatMessage, stringBuilder.toString());
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = a_3.b(n, l4);
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
            throw new RuntimeException("net/a_3" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    static {
        I = a1c.a(-7694892226200174366L, -7186845398557252123L, MethodHandles.lookup().lookupClass()).a(246560192239755L);
        L = new HashMap(13);
        long l4 = I ^ 0x6CF840878648L;
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

    public a_3(@NonNull ModuleManager moduleManager, EnumModuleType enumModuleType, short s, int n, String string, short s3, String string2) {
        long l4 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)s3 << 48 >>> 48) ^ I;
        long l5 = l4 ^ 0x654D4DF5E8CFL;
        int n2 = (int)(l5 >>> 48);
        int n3 = (int)(l5 << 16 >>> 48);
        int n4 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n2, enumModuleType, string, (char)n3, n4, string2);
        this.H = StringPropertyInvoker.b(asp_2.a((String)((Object)a_3.b("h", (int)15715, (long)(0x6A2EE1920AACD465L ^ l4)))), new String[]{a_3.b("h", (int)12763, (long)(0x48B381D2B086D8DCL ^ l4)), a_3.b("h", (int)17107, (long)(0x245A70F16DE4ABD3L ^ l4))});
        ManagerInvoker.put(new Setting((String)((Object)a_3.b("h", (int)17172, (long)(0x5BB0DF207A91AA10L ^ l4))), (String)((Object)a_3.b("h", (int)13922, (long)(0x2E8A1907E5D4DF67L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.H));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(a_3.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


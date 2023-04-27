/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.combat;

import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
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
import net.FloatProperty;
import net.ModuleManager;
import net.a1c;
import net.a9V;
import net.asp_2;
import net.axx_1;
import org.checkerframework.checker.nullness.qual.NonNull;

public class Reach
extends AbstractModule {
    private static Map M;
    @Property(value="range")
    private FloatProperty I;
    private static String[] K;
    private boolean H;
    private static long J;
    private static String[] L;

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = Reach.b(n, l4);
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

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a0J" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    public float a() {
        return axx_1.a((Float)a9V.a(this.I));
    }

    public Reach(@NonNull char c, ModuleManager moduleManager, int n, EnumModuleType enumModuleType, String string, char c2) {
        long l4 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)c2 << 48 >>> 48) ^ J;
        long l5 = l4 ^ 0x5CBF04EA88EEL;
        int n2 = (int)(l5 >>> 56);
        long l6 = l5 << 8 >>> 8;
        super((byte)n2, moduleManager, l6, enumModuleType, string);
        this.I = (FloatProperty)a9V.a((FloatProperty)a9V.b(asp_2.a(axx_1.a(5.0f)), axx_1.a(3.0f)), axx_1.a(5.0f));
        ManagerInvoker.put(new Setting((String)((Object)Reach.b("o", (int)11211, (long)(0x99DBB1B281E3A4AL ^ l4))), (String)((Object)Reach.b("o", (int)6656, (long)(0x36E1B256B8730B80L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.I, 0.1));
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x3E5B;
        if (L[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])M.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                M.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a0J", exception);
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

    static {
        J = a1c.a(6486759776460401305L, -4251236571603299058L, MethodHandles.lookup().lookupClass()).a(274438926301029L);
        M = new HashMap(13);
        long l4 = J ^ 0x5EB60D17C77DL;
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
            return MethodHandles.lookup().findStatic(Reach.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


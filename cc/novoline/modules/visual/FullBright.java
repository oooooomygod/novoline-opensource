/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.visual;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.TickUpdateEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
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
import net.ModuleManager;
import net.StringProperty;
import net.a1c;
import net.asp_2;
import org.checkerframework.checker.nullness.qual.NonNull;

public class FullBright
extends AbstractModule {
    private static String[] K;
    private static long I;
    @Property(value="mode")
    private StringProperty H;
    private static Map L;
    private static String[] J;

    public boolean a(String string) {
        HUD.t();
        return this.x() && StringPropertyInvoker.isMode(this.H, string);
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x120;
        if (K[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])L.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                L.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_s", exception);
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

    @EventTarget
    public void a(TickUpdateEvent tickUpdateEvent) {
        this.a((String)StringPropertyInvoker.b(this.H));
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = FullBright.b(n, l4);
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
            throw new RuntimeException("net/a_s" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    static {
        I = a1c.a(-6773426465349562919L, 5733011188571737594L, MethodHandles.lookup().lookupClass()).a(42618221972122L);
        L = new HashMap(13);
        long l4 = I ^ 0x41D9E3A21662L;
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

    public StringProperty a() {
        return this.H;
    }

    public FullBright(@NonNull ModuleManager moduleManager, EnumModuleType enumModuleType, long l4, int n, String string) {
        long l5 = (l4 << 32 | (long)n << 32 >>> 32) ^ I;
        long l6 = l5 ^ 0x134216FF94AFL;
        int n2 = (int)(l6 >>> 56);
        long l7 = l6 << 8 >>> 8;
        super((byte)n2, moduleManager, l7, enumModuleType, string);
        this.H = StringPropertyInvoker.b(asp_2.a((String)((Object)FullBright.b("g", (int)14637, (long)(0x5FA923CA51ED0B94L ^ l5)))), new String[]{FullBright.b("g", (int)18213, (long)(0x47C280B6DB87F59BL ^ l5)), FullBright.b("g", (int)28889, (long)(0x62550B9F9DF3C262L ^ l5))});
        ManagerInvoker.put(new Setting((String)((Object)FullBright.b("g", (int)28854, (long)(0x7179EDCF80A4C20EL ^ l5))), (String)((Object)FullBright.b("g", (int)32710, (long)(0x6AB2D07C9D644D7CL ^ l5))), SettingType.COMBOBOX, (AbstractModule)this, this.H));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(FullBright.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


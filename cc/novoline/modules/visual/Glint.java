/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.visual;

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
import net.Ba;
import net.BooleanProperty;
import net.ModuleManager;
import net.P8;
import net.a1c;
import net.aUL;
import net.asp_2;
import net.auk_2;
import net.eu_0;
import net.hb_2;
import org.checkerframework.checker.nullness.qual.NonNull;

public class Glint
extends AbstractModule {
    private static Map M;
    @Property(value="glint-color")
    private eu_0 H;
    private static String[] K;
    private static long J;
    @Property(value="synced")
    private BooleanProperty I;
    private static String[] L;

    static {
        J = a1c.a(5665306972970597789L, 928069984840013740L, MethodHandles.lookup().lookupClass()).a(55800743211422L);
        M = new HashMap(13);
        long l4 = J ^ 0x39D0EA1E2615L;
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

    public eu_0 b() {
        return this.H;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = Glint.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    public Glint(@NonNull int n, ModuleManager moduleManager, short s, EnumModuleType enumModuleType, String string, char c, String string2) {
        long l4 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)c << 48 >>> 48) ^ J;
        long l5 = l4 ^ 0x1C3962C4B86AL;
        int n2 = (int)(l5 >>> 48);
        int n3 = (int)(l5 << 16 >>> 48);
        int n4 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n2, enumModuleType, string, (char)n3, n4, string2);
        this.H = asp_2.b(P8.d(-7697665));
        this.I = asp_2.c();
        ManagerInvoker.put(new Setting((String)((Object)Glint.b("f", (int)24623, (long)(0x502FE598E660D155L ^ l4))), (String)((Object)Glint.b("f", (int)31158, (long)(0x6ED3E0B9966B48CEL ^ l4))), SettingType.COLOR_PICKER, (AbstractModule)this, this.H, null, this::lambda$new$0));
        ManagerInvoker.put(new Setting((String)((Object)Glint.b("f", (int)23084, (long)(0x1150A362F35E6B55L ^ l4))), (String)((Object)Glint.b("f", (int)7375, (long)(0x697985BB24C5ADB4L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.I));
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x5942;
        if (L[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])M.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                M.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/aC6", exception);
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
            throw new RuntimeException("net/aC6" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private Boolean lambda$new$0() {
        HUD.t();
        return auk_2.b(!auk_2.a((Boolean)Ba.b(this.I)));
    }

    public int a() {
        HUD.j();
        return auk_2.a((Boolean)Ba.b(this.I)) ? hb_2.a(0L) : P8.b(aUL.f(this.H));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Glint.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


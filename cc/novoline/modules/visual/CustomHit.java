/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.visual;

import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import java.awt.Color;
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
import net.ModuleManager;
import net.P8;
import net.StringProperty;
import net.a1c;
import net.a4R;
import net.aUL;
import net.aol_1;
import net.asp_2;
import net.auk_2;
import net.eu_0;
import net.hb_2;
import org.checkerframework.checker.nullness.qual.NonNull;

public class CustomHit
extends AbstractModule {
    @Property(value="color")
    private eu_0 I;
    private static String[] M;
    private static Map N;
    private static String[] L;
    @Property(value="legacy-render")
    private BooleanProperty H;
    private static long K;
    @Property(value="color-mode")
    private StringProperty J;

    public BooleanProperty a() {
        return this.H;
    }

    public Color b() {
        HUD.j();
        return StringPropertyInvoker.isMode(this.J, a4R.a) ? aUL.c(this.I) : new Color(hb_2.a(0L));
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
        K = a1c.a(3252944559749244905L, -8797631482716418044L, MethodHandles.lookup().lookupClass()).a(56770085130269L);
        N = new HashMap(13);
        long l4 = K ^ 0x41015D4790BAL;
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

    private Boolean lambda$new$0() {
        return auk_2.b(StringPropertyInvoker.isMode(this.J, a4R.b));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_J" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = CustomHit.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x40C6;
        if (M[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])N.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                N.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_J", exception);
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

    public CustomHit(@NonNull ModuleManager moduleManager, int n, EnumModuleType enumModuleType, String string, String string2, short s, char c) {
        long l4 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)c << 48 >>> 48) ^ K;
        long l5 = l4 ^ 0x4C97C9B52F4AL;
        int n2 = (int)(l5 >>> 48);
        int n3 = (int)(l5 << 16 >>> 48);
        int n4 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n2, enumModuleType, string, (char)n3, n4, string2);
        this.J = StringPropertyInvoker.b(asp_2.a((String)((Object)CustomHit.b("r", (int)18473, (long)(0x61E6529D0E6277F0L ^ l4)))), new String[]{CustomHit.b("r", (int)22232, (long)(0x433FECAA28C86907L ^ l4)), CustomHit.b("r", (int)28435, (long)(0x514DEF560CBA50CDL ^ l4))});
        this.I = asp_2.b(P8.d(aol_1.b(new Color(200, 200, 200))));
        this.H = asp_2.c();
        ManagerInvoker.put(new Setting((String)((Object)CustomHit.b("r", (int)8944, (long)(0x424D9E7D709F1D2AL ^ l4))), (String)((Object)CustomHit.b("r", (int)16309, (long)(0x74C6F088EF6E0068L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.J));
        ManagerInvoker.put(new Setting((String)((Object)CustomHit.b("r", (int)23444, (long)(0x46F88E706453E441L ^ l4))), (String)((Object)CustomHit.b("r", (int)29888, (long)(0x66F6427A4AC44B1BL ^ l4))), SettingType.COLOR_PICKER, (AbstractModule)this, this.I, null, this::lambda$new$0));
        ManagerInvoker.put(new Setting((String)((Object)CustomHit.b("r", (int)7832, (long)(0x6739FB4EF5E22144L ^ l4))), (String)((Object)CustomHit.b("r", (int)10366, (long)(0x39466D0D7A3C97A6L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.H));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CustomHit.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.visual;

import cc.novoline.events.EventTarget;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;

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

import cc.novoline.modules.EnumModuleType;
import deobf.IntProperty;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import net.BP;
import net.ModuleManager;
import net.P8;
import net.StringProperty;
import net.a1c;
import net.aUL;
import net.ad3_0;
import net.adt_2;
import net.agv_1;
import net.aol_1;
import net.asp_2;
import net.auk_2;
import net.eu_0;
import net.hb_2;
import net.qt_1;
import net.qx_2;
import net.v0_0;
import org.checkerframework.checker.nullness.qual.NonNull;

public class Wings
extends AbstractModule {
    @Property(value="color-mode")
    private StringProperty J;
    @Property(value="scale")
    private IntProperty K;
    private static String[] M;
    @Property(value="color")
    private eu_0 I;
    private static String[] N;
    private static long L;
    private qt_1 H;
    private static Map O;

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/aCL" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private Color a() {
        HUD.j();
        return StringPropertyInvoker.isMode(this.J, qx_2.a) ? aUL.c(this.I) : new Color(hb_2.a(0L));
    }

    static {
        L = a1c.a(-4033536721301519814L, 7341563707465260345L, MethodHandles.lookup().lookupClass()).a(267119974856418L);
        O = new HashMap(13);
        long l4 = L ^ 0x7FB1BF6526ECL;
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

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x850;
        if (N[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])O.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                O.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/aCL", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return N[n2];
    }

    private Boolean lambda$new$0() {
        return auk_2.b(StringPropertyInvoker.isMode(this.J, qx_2.b));
    }

    public Wings(@NonNull ModuleManager moduleManager, EnumModuleType enumModuleType, char c, char c2, String string, int n) {
        long l4;
        long l5 = l4 = ((long)c << 48 | (long)c2 << 48 >>> 16 | (long)n << 32 >>> 32) ^ L;
        long l6 = l5 ^ 0x1A303E74251AL;
        int n2 = (int)(l6 >>> 56);
        long l7 = l6 << 8 >>> 8;
        long l8 = l5 ^ 0x62F1ABFEB069L;
        int n3 = (int)(l8 >>> 48);
        int n4 = (int)(l8 << 16 >>> 32);
        int n5 = (int)(l8 << 48 >>> 48);
        super((byte)n2, moduleManager, l7, enumModuleType, string);
        this.H = new qt_1((short)n3, n4, (short)n5);
        this.J = StringPropertyInvoker.b(asp_2.a((String)((Object)Wings.b("s", (int)3986, (long)(0x6CB7EC194CE705E9L ^ l4)))), new String[]{Wings.b("s", (int)19437, (long)(0x4A6CB5AB3DE6C192L ^ l4)), Wings.b("s", (int)27294, (long)(0x742696D8BE5160E9L ^ l4))});
        this.I = asp_2.b(P8.d(aol_1.b(new Color(200, 200, 200))));
        this.K = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(100)), P8.d(50)), P8.d(250));
        ManagerInvoker.put(new Setting((String)((Object)Wings.b("s", (int)458, (long)(0x3447541A96018BB3L ^ l4))), (String)((Object)Wings.b("s", (int)11437, (long)(0x631E8C48D8DE26D5L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.J));
        ManagerInvoker.put(new Setting((String)((Object)Wings.b("s", (int)16142, (long)(0x7B4C807B8B843570L ^ l4))), (String)((Object)Wings.b("s", (int)21389, (long)(0x7E98500BC72A59F1L ^ l4))), SettingType.COLOR_PICKER, (AbstractModule)this, this.I, null, this::lambda$new$0));
        ManagerInvoker.put(new Setting((String)((Object)Wings.b("s", (int)32570, (long)(0x390F3652E484F540L ^ l4))), (String)((Object)Wings.b("s", (int)18118, (long)(0x56EBC792F8984CBBL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.K, 5.0));
    }

    @EventTarget
    public void a(BP bP) {
        HUD.t();
        if (v0_0.b(bP) == ad3_0.PRE && v0_0.f(bP) == this.mc.player) {
            agv_1.a(this.H, this.mc.player, this.mc.timer.renderPartialTicks, P8.b((Integer)adt_2.a(this.K)), this.a());
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = Wings.b(n, l4);
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Wings.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


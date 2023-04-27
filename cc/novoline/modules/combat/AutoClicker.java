/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.combat;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.TickUpdateEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.GameSettingsInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.PlayerControllerInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import deobf.IntProperty;
import deobf.MCInvoker;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import deobf.TimerUtil;
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

public class AutoClicker
extends AbstractModule {
    private TimerUtil I;
    @Property(value="only-swords-tools")
    private BooleanProperty K;
    private static String[] M;
    private static long L;
    @Property(value="minimum-cps")
    private IntProperty J;
    @Property(value="maximum-cps")
    private IntProperty H;
    private static String[] N;
    private static Map O;

    public AutoClicker(@NonNull ModuleManager moduleManager, long l4, EnumModuleType enumModuleType, String string, String string2, char c) {
        long l5 = (l4 << 16 | (long)c << 48 >>> 48) ^ L;
        long l6 = l5 ^ 0x1516FEAAED28L;
        int n = (int)(l6 >>> 48);
        int n2 = (int)(l6 << 16 >>> 48);
        int n3 = (int)(l6 << 32 >>> 32);
        super(moduleManager, (char)n, enumModuleType, string, (char)n2, n3, string2);
        this.I = new TimerUtil();
        this.J = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(8)), P8.d(1)), P8.d(20));
        this.H = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(10)), P8.d(1)), P8.d(20));
        this.K = asp_2.d();
        ManagerInvoker.put(new Setting((String)((Object)AutoClicker.b("s", (int)9529, (long)(0x4BE98014DC95E5F8L ^ l5))), (String)((Object)AutoClicker.b("s", (int)17523, (long)(0x552B6D83FB0B84B3L ^ l5))), SettingType.SLIDER, (AbstractModule)this, this.J, 1.0));
        ManagerInvoker.put(new Setting((String)((Object)AutoClicker.b("s", (int)24487, (long)(0x39808D1985AC9F61L ^ l5))), (String)((Object)AutoClicker.b("s", (int)27583, (long)(0x21E9A1FAD6EA2B78L ^ l5))), SettingType.SLIDER, (AbstractModule)this, this.H, 1.0));
        ManagerInvoker.put(new Setting((String)((Object)AutoClicker.b("s", (int)5184, (long)(0x6AB430EACCE05483L ^ l5))), (String)((Object)AutoClicker.b("s", (int)29727, (long)(0x4BF1BA17BA0BB4DDL ^ l5))), SettingType.CHECKBOX, (AbstractModule)this, this.K));
    }

    public IntProperty a() {
        return this.H;
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x7DBA;
        if (N[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])O.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                O.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a0w", exception);
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
        String string2 = AutoClicker.b(n, l4);
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
            throw new RuntimeException("net/a0w" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    public IntProperty b() {
        return this.J;
    }

    static {
        L = a1c.a(-3415966107522524894L, -107975163935832859L, MethodHandles.lookup().lookupClass()).a(1664540775211L);
        O = new HashMap(13);
        long l4 = L ^ 0x74A550EE3294L;
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
    public void a(TickUpdateEvent tickUpdateEvent) {
        KillAura.w();
        if (GameSettingsInvoker.e(this.mc.gameSettings.G) && (!auk_2.a((Boolean)Ba.b(this.K)) || !PlayerControllerInvoker.c(this.mc.playerController) && PlayerInvoker.h(this.mc.player) != null && (act_2.k(PlayerInvoker.h(this.mc.player)) instanceof lw_0 || act_2.k(PlayerInvoker.h(this.mc.player)) instanceof LC)) && qh_1.c(this.I, 1000 / anf_2.a(anf_2.c(), P8.b((Integer)adt_2.a(this.J)), P8.b((Integer)adt_2.a(this.H)) + 1))) {
            MCInvoker.s(this.mc);
            this.mc.leftClickCounter = 0;
            qh_1.b(this.I);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AutoClicker.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


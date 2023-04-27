/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.misc;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.type.State;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.visual.ClickGui;
import cc.novoline.modules.EnumModuleType;
import deobf.IntProperty;
import deobf.ModuleRegistry;
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

public class StaffAnalyzer
extends AbstractModule {
    private static long L = a1c.a(8829060329884820691L, 219194256287434605L, MethodHandles.lookup().lookupClass()).a(281468913994697L);
    private int J;
    private static String[] N;
    private static Map O;
    private static String[] M;
    private int H;
    private TimerUtil K;
    @Property(value="delay")
    private IntProperty I;

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
    public void a(MotionUpdateEvent motionUpdateEvent) {
        UhcCrafts.d();
        if (EventInvoker.getState(motionUpdateEvent).equals((Object)State.PRE)) {
            ClickGui clickGui = (ClickGui)ModuleInvoker.isEnable(ModuleRegistry.CLICKGUI);
            this.J = P8.b(z4_0.g(clickGui)) - this.H;
            if (qh_1.c(this.K, P8.b((Integer)adt_2.a(this.I)) * 1000)) {
                if (this.J > 0) {
                    this.a(hn_1.d, aL0.a(aL0.a(aL0.a(aL0.a(aL0.c(aL0.a(new StringBuilder(), hn_1.f), this.J), this.J > 1 || this.J == 0 ? hn_1.b : hn_1.a), hn_1.e), adt_2.a(this.I)), hn_1.c).toString(), 3000, NotificationType.INFO);
                }
                this.H = P8.b(z4_0.g(clickGui));
                qh_1.b(this.K);
            }
        }
    }

    static {
        O = new HashMap(13);
        long l4 = L ^ 0x71CB094D4E02L;
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
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x7E23;
        if (N[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])O.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                O.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_a", exception);
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

    public StaffAnalyzer(@NonNull ModuleManager moduleManager, EnumModuleType enumModuleType, long l4, String string, int n, String string2) {
        long l5 = (l4 << 32 | (long)n << 32 >>> 32) ^ L;
        long l6 = l5 ^ 0x532E31D90023L;
        int n2 = (int)(l6 >>> 48);
        int n3 = (int)(l6 << 16 >>> 48);
        int n4 = (int)(l6 << 32 >>> 32);
        super(moduleManager, (char)n2, enumModuleType, string, (char)n3, n4, string2);
        this.I = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(60)), P8.d(10)), P8.d(180));
        this.K = new TimerUtil();
        ManagerInvoker.put(new Setting((String)((Object)StaffAnalyzer.b("m", (int)30821, (long)(0x363191696AF4D635L ^ l5))), (String)((Object)StaffAnalyzer.b("m", (int)11753, (long)(0x56B0A4F8ACD683B8L ^ l5))), SettingType.SLIDER, (AbstractModule)this, this.I, 5.0, "s"));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_a" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = StaffAnalyzer.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(StaffAnalyzer.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


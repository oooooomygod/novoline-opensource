/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.type.State;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import deobf.IntProperty;
import deobf.MCInvoker;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import deobf.TimerUtil;
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

public class a_D
extends AbstractModule {
    private static char[] J;
    @Property(value="delay")
    private IntProperty K;
    private static Map Q;
    private static String[] P;
    private boolean L;
    private static long N;
    @Property(value="text")
    private StringProperty H;
    @Property(value="name")
    private StringProperty M;
    private static String[] O;
    private TimerUtil I;

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_D" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    public a_D(@NonNull ModuleManager moduleManager, char c, int n, int n2, EnumModuleType enumModuleType, String string) {
        long l4 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ N;
        long l5 = l4 ^ 0x2E95637D5B3BL;
        int n3 = (int)(l5 >>> 56);
        long l6 = l5 << 8 >>> 8;
        super((byte)n3, moduleManager, l6, enumModuleType, string);
        this.I = new TimerUtil();
        this.L = true;
        this.M = asp_2.a((String)((Object)a_D.b("v", (int)34, (long)(0x12E132D276525F8DL ^ l4))));
        this.H = asp_2.a((String)((Object)a_D.b("v", (int)5281, (long)(0x66C3FE9CE00CB0AL ^ l4))));
        this.K = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(3000)), P8.d(100)), P8.d(15000));
        ManagerInvoker.put(new Setting((String)((Object)a_D.b("v", (int)24978, (long)(0x3DC3D38851F2BE3FL ^ l4))), (String)((Object)a_D.b("v", (int)29095, (long)(0x641728B04482E0FL ^ l4))), SettingType.TEXTBOX, (AbstractModule)this, (String)((Object)a_D.b("v", (int)13453, (long)(0x157609CA1E416B23L ^ l4))), this.H));
        ManagerInvoker.put(new Setting((String)((Object)a_D.b("v", (int)10886, (long)(0x54B98623DD96752FL ^ l4))), (String)((Object)a_D.b("v", (int)7104, (long)(0x5A86DAAC45D9C46CL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.K, 100.0));
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
        String string2 = a_D.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x23A3;
        if (P[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])Q.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                Q.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_D", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return P[n2];
    }

    static {
        N = a1c.a(7409757734767443587L, -1392523638754668280L, MethodHandles.lookup().lookupClass()).a(81697097218465L);
        Q = new HashMap(13);
        long l4 = N ^ 0x790AC33CE88L;
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
    public void a(MotionUpdateEvent motionUpdateEvent) {
        UhcCrafts.d();
        if (EventInvoker.getState(motionUpdateEvent).equals((Object)State.PRE) && qh_1.c(this.I, P8.b((Integer)adt_2.a(this.K)))) {
            StringBuilder stringBuilder = new StringBuilder();
            int n = 0;
            char[] cArray = StringInvoker.f((String)StringPropertyInvoker.b(this.H));
            char[] cArray2 = cArray;
            int n2 = cArray2.length;
            if (n < n2) {
                char c = cArray2[n];
                aL0.a(stringBuilder, c);
                int n3 = 0;
                if (n3 < anf_2.a(anf_2.c(), 0, 4)) {
                    aL0.a(stringBuilder, '\u05fc');
                    ++n3;
                }
                ++n;
            }
            if (StringInvoker.e((String)StringPropertyInvoker.b(this.H), ayc_1.a)) {
                this.a(new C01PacketChatMessage((String)StringPropertyInvoker.b(this.H)));
            }
            this.a(new C01PacketChatMessage(aL0.a(aL0.a(new StringBuilder(), aCM.d() && !MCInvoker.k(this.mc) ? ayc_1.b : ayc_1.c), stringBuilder).toString()));
            qh_1.b(this.I);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(a_D.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.combat;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.type.State;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.GameSettingsInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.PlayerInvoker;
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
import net.DoubleProperty;
import net.Items;
import net.KillAura;
import net.MD;
import net.ModuleManager;
import net.a1c;
import net.aKp;
import net.aU9;
import net.aci_0;
import net.act_2;
import net.ag3_0;
import net.ap2_0;
import net.asp_2;
import net.db_0;
import org.checkerframework.checker.nullness.qual.NonNull;

public class AutoGApple
extends AbstractModule {
    private static String[] L;
    private static long K;
    private static Map N;
    private boolean H;
    @Property(value="health")
    private DoubleProperty I;
    private int J;
    private static String[] M;

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x1B88;
        if (M[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])N.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                N.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a0s", exception);
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

    private void lambda$onMotion$1() {
        this.mc.player.inventory.a = this.J;
    }

    private void a(Runnable runnable, int n) {
        aci_0.a(NovolineInvoker.i(this.novoline), new aU9(this, n, ag3_0.TICK, runnable));
    }

    private void lambda$onMotion$0() {
        GameSettingsInvoker.a(this.mc.gameSettings.aj, true);
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
            throw new RuntimeException("net/a0s" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    @EventTarget
    public void a(MotionUpdateEvent motionUpdateEvent) {
        block5: {
            block6: {
                KillAura.w();
                if (EventInvoker.getState(motionUpdateEvent) != State.PRE) break block5;
                if (this.a() != -1 && (double)PlayerInvoker.aa(this.mc.player) < db_0.b((Double)MD.b(this.I)) && !this.H) {
                    this.mc.player.inventory.a = this.a();
                    this.a(this::lambda$onMotion$0, 150);
                    this.H = true;
                }
                if (!this.H) break block6;
                if (PlayerInvoker.H(this.mc.player) != act_2.A(PlayerInvoker.h(this.mc.player))) break block5;
                this.H = false;
                GameSettingsInvoker.a(this.mc.gameSettings.aj, false);
                this.a(this::lambda$onMotion$1, 10);
            }
            if (this.J != this.mc.player.inventory.a) {
                this.J = this.mc.player.inventory.a;
            }
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = AutoGApple.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    @EventTarget
    public void a(aKp aKp2) {
        KillAura.w();
        if (ap2_0.a(aKp2) == 1 && this.H && this.mc.player != null && this.mc.world != null) {
            this.mc.player.inventory.a = this.J;
            this.H = false;
        }
    }

    private int a() {
        return PlayerInvoker.c(this.mc.player, Items.golden_apple);
    }

    public AutoGApple(@NonNull ModuleManager moduleManager, short s, int n, short s3, EnumModuleType enumModuleType, String string, String string2) {
        long l4 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)s3 << 48 >>> 48) ^ K;
        long l5 = l4 ^ 0x243AA3806C1BL;
        int n2 = (int)(l5 >>> 48);
        int n3 = (int)(l5 << 16 >>> 48);
        int n4 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n2, enumModuleType, string, (char)n3, n4, string2);
        this.I = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(14.0)), db_0.a(0.5)), db_0.a(20.0));
        ManagerInvoker.put(new Setting((String)((Object)AutoGApple.b("n", (int)879, (long)(0x549B472A454B24ADL ^ l4))), (String)((Object)AutoGApple.b("n", (int)4416, (long)(0x617143AD0AD3683L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.I, 0.5));
    }

    static {
        K = a1c.a(-3149385176646190932L, 4737820583704959451L, MethodHandles.lookup().lookupClass()).a(277522833213832L);
        N = new HashMap(13);
        long l4 = K ^ 0x6D123F6B04CFL;
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
            return MethodHandles.lookup().findStatic(AutoGApple.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


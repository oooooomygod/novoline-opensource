/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.move;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.events.PlayerUpdateEvent;
import cc.novoline.events.events.TickUpdateEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.modules.AbstractModule;

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

import cc.novoline.modules.player.Scaffold;
import cc.novoline.modules.EnumModuleType;
import deobf.ModuleRegistry;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import net.Ba;
import net.BooleanProperty;
import net.ModuleManager;
import net.a1c;
import net.ah8_0;
import net.asp_2;
import net.auk_2;
import net.wj_0;
import org.checkerframework.checker.nullness.qual.NonNull;

public class Sprint
extends AbstractModule {
    @Property(value="omni")
    private BooleanProperty I;
    @Property(value="keep-sprint")
    private BooleanProperty H;
    private static long J = a1c.a(-6912126628729641825L, -3265357430422052898L, MethodHandles.lookup().lookupClass()).a(28295851318919L);
    private static Map M = new HashMap(13);
    private static String[] K;
    private static String[] L;

    @EventTarget
    public void a(TickUpdateEvent tickUpdateEvent) {
        this.a(auk_2.a((Boolean)Ba.b(this.I)) ? ah8_0.b : ah8_0.a);
    }

    static {
        long l4 = J ^ 0x1D9F464C8139L;
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

    private boolean a() {
        Scaffold.p();
        FastSneak fastSneak = (FastSneak)ModuleInvoker.isEnable(ModuleRegistry.FASTSNEAK);
        return !fastSneak.x() && wj_0.a(PlayerInvoker.j(this.mc.player));
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x6162;
        if (L[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])M.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                M.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_Z", exception);
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

    @EventTarget
    public void a(MotionUpdateEvent motionUpdateEvent) {
    }

    public boolean c() {
        return auk_2.a((Boolean)Ba.b(this.H));
    }

    @Override
    public void o() {
        this.a(auk_2.a((Boolean)Ba.b(this.I)) ? ah8_0.c : ah8_0.d);
    }

    private void b() {
    }

    @EventTarget
    public void a(PlayerUpdateEvent playerUpdateEvent) {
        Scaffold.p();
        FastSneak fastSneak = (FastSneak)ModuleInvoker.isEnable(ModuleRegistry.FASTSNEAK);
        Scaffold cfr_ignored_0 = (Scaffold)ModuleInvoker.isEnable(ModuleRegistry.SCAFFOLD);
        if (fastSneak.x() || !wj_0.a(PlayerInvoker.j(this.mc.player))) {
            PlayerInvoker.c(this.mc.player, (wj_0.c(PlayerInvoker.j(this.mc.player)) > 0.0f || auk_2.a((Boolean)Ba.b(this.I)) && PlayerInvoker.q(this.mc.player)) && !this.mc.player.g);
            if (auk_2.a((Boolean)Ba.b(this.I)) && this.mc.player.b > 1 && wj_0.c(PlayerInvoker.j(this.mc.player)) <= 0.0f && PlayerInvoker.q(this.mc.player)) {
                PlayerInvoker.e(this.mc.player, 1.1915);
            }
        }
    }

    public Sprint(@NonNull ModuleManager moduleManager, long l4, byte by, EnumModuleType enumModuleType, String string) {
        long l5 = (l4 << 8 | (long)by << 56 >>> 56) ^ J;
        long l6 = l5 ^ 0x50016097568AL;
        int n = (int)(l6 >>> 56);
        long l7 = l6 << 8 >>> 8;
        super((byte)n, moduleManager, l7, enumModuleType, string);
        this.I = asp_2.a(auk_2.b(false));
        this.H = asp_2.c();
        ManagerInvoker.put(new Setting((String)((Object)Sprint.b("g", (int)2629, (long)(0x2C0B2FA8BEC09A98L ^ l5))), (String)((Object)Sprint.b("g", (int)30300, (long)(0x4168CBA247C06680L ^ l5))), SettingType.CHECKBOX, (AbstractModule)this, this.I));
        ManagerInvoker.put(new Setting((String)((Object)Sprint.b("g", (int)15504, (long)(0x7E55B2CD2DAAAC4FL ^ l5))), (String)((Object)Sprint.b("g", (int)31081, (long)(0x14ADA61E35C169B7L ^ l5))), SettingType.CHECKBOX, (AbstractModule)this, this.H));
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
        String string2 = Sprint.b(n, l4);
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
            throw new RuntimeException("net/a_Z" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Sprint.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


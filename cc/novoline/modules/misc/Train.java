/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.misc;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.PlayerUpdateEvent;
import cc.novoline.events.events.Render3DEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;

import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.configurations.annotation.Property;
import cc.novoline.modules.visual.HUD;
import deobf.*;
import net.minecraft.client.Minecraft;
import net.B3;
import net.BP;
import net.ModuleManager;
import net.P8;
import net.StringProperty;
import net.a1c;
import net.a3i_0;
import net.a6w_0;
import net.ad3_0;
import net.aol_1;
import net.asp_2;
import net.auk_2;
import net.ayj_0;
import net.dz_0;
import net.eu_0;
import net.km_0;
import net.v0_0;
import org.checkerframework.checker.nullness.qual.NonNull;

public class Train
extends AbstractModule {
    private List<km_0> H;
    private static String[] M;
    private static String[] L;
    @Property(value="color-mode")
    private StringProperty I;
    private static Map N;
    private static long K;
    @Property(value="color")
    private eu_0 J;

    private static boolean lambda$removeByEntity$1(EntityPlayer entityPlayer, km_0 km_02) {
        return km_02.b() == entityPlayer;
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x44E5;
        if (M[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])N.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                N.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/aCk", exception);
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

    static Minecraft f(Train train) {
        return train.mc;
    }

    private km_0 b(EntityPlayer entityPlayer) {
        km_0 km_02;
        HUD.j();
        Iterator iterator = ListInvoker.iterator(this.H);
        if (dz_0.c(iterator) && km_0.b(km_02 = (km_0)dz_0.b(iterator)) == entityPlayer) {
            return km_02;
        }
        return null;
    }

    static Minecraft c(Train train) {
        return train.mc;
    }

    static eu_0 g(Train train) {
        return train.J;
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
        K = a1c.a(7921852520593519968L, -7327796228462627324L, MethodHandles.lookup().lookupClass()).a(145415280237421L);
        N = new HashMap(13);
        long l4 = K ^ 0x4A364E4EB244L;
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

    static StringProperty e(Train train) {
        return train.I;
    }

    static Minecraft d(Train train) {
        return train.mc;
    }

    private void a(EntityPlayer entityPlayer) {
        ListInvoker.removeIf(this.H, arg_0 -> Train.lambda$removeByEntity$1(entityPlayer, arg_0));
    }

    @EventTarget
    public void a(PlayerUpdateEvent playerUpdateEvent) {
        HUD.j();
        Iterator iterator = ListInvoker.iterator(this.H);
        if (dz_0.c(iterator)) {
            km_0 km_02 = (km_0)dz_0.b(iterator);
            if (!ListInvoker.contains(BlockInvoker.s(this.mc.world), km_02.b())) {
                ListInvoker.clear(km_02.a());
                ListInvoker.remove(this.H, km_02);
            }
        }
    }

    static Minecraft a(Train train) {
        return train.mc;
    }

    @EventTarget
    public void a(BP bP) {
        HUD.j();
        if (v0_0.b(bP) == ad3_0.PRE && v0_0.f(bP) instanceof EntityPlayer) {
            if (!this.d((EntityPlayer)v0_0.f(bP)) && !ayj_0.L(v0_0.f(bP))) {
                ListInvoker.add(this.H, new km_0(this, (EntityPlayer)v0_0.f(bP)));
            }
            km_0 km_02 = this.b((EntityPlayer)v0_0.f(bP));
            ListInvoker.add(km_02.a(), new B3(km_0.b(km_02), v0_0.d(bP) + MCInvoker.j((Minecraft)MCInvoker.f()).s, v0_0.a(bP) + MCInvoker.j((Minecraft)MCInvoker.f()).h, v0_0.e(bP) + MCInvoker.j((Minecraft)MCInvoker.f()).m));
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/aCk" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private boolean c(EntityPlayer entityPlayer) {
        HUD.j();
        return !entityPlayer.isDead && !a6w_0.i(entityPlayer);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = Train.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private Boolean lambda$new$0() {
        return auk_2.b(StringPropertyInvoker.isMode(this.I, a3i_0.a));
    }

    static Minecraft b(Train train) {
        return train.mc;
    }

    private boolean d(EntityPlayer entityPlayer) {
        km_0 km_02;
        HUD.j();
        Iterator iterator = ListInvoker.iterator(this.H);
        return dz_0.c(iterator) && (km_02 = (km_0)dz_0.b(iterator)).b() == entityPlayer;
    }

    @EventTarget
    public void a(Render3DEvent render3DEvent) {
        HUD.t();
        HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        if (!this.d((EntityPlayer)MCInvoker.v(this.mc))) {
            ListInvoker.add(this.H, new km_0(this, (EntityPlayer)MCInvoker.v(this.mc)));
        }
        ListInvoker.add(km_0.a(this.b((EntityPlayer)MCInvoker.v(this.mc))), new B3((EntityPlayer)MCInvoker.v(this.mc), MCInvoker.j((Minecraft)MCInvoker.f()).s, MCInvoker.j((Minecraft)MCInvoker.f()).h, MCInvoker.j((Minecraft)MCInvoker.f()).m));
        Iterator iterator = ListInvoker.iterator(this.H);
        if (dz_0.c(iterator)) {
            km_0 km_02 = (km_0)dz_0.b(iterator);
            km_02.a(hUD);
        }
    }

    public Train(@NonNull char c, ModuleManager moduleManager, EnumModuleType enumModuleType, char c2, String string, int n) {
        long l4 = ((long)c << 48 | (long)c2 << 48 >>> 16 | (long)n << 32 >>> 32) ^ K;
        long l5 = l4 ^ 0x211BFDA371E1L;
        int n2 = (int)(l5 >>> 56);
        long l6 = l5 << 8 >>> 8;
        super((byte)n2, moduleManager, l6, enumModuleType, string);
        this.H = new CopyOnWriteArrayList<km_0>();
        this.I = StringPropertyInvoker.b(asp_2.a((String)((Object)Train.b("n", (int)4222, (long)(0x2EE701EAA6F5024AL ^ l4)))), new String[]{Train.b("n", (int)2672, (long)(0x624AD36CA40D9841L ^ l4)), Train.b("n", (int)31998, (long)(0x2047C5B5357EECEL ^ l4))});
        this.J = asp_2.b(P8.d(aol_1.b(new Color(200, 200, 200))));
        ManagerInvoker.put(new Setting((String)((Object)Train.b("n", (int)18432, (long)(0x261631F80DB8DA32L ^ l4))), (String)((Object)Train.b("n", (int)5472, (long)(0x2F05996E9E138753L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.I));
        ManagerInvoker.put(new Setting((String)((Object)Train.b("n", (int)25173, (long)(0x1A1AB6ECF1707060L ^ l4))), (String)((Object)Train.b("n", (int)25822, (long)(0xAA3E16FD730F6E9L ^ l4))), SettingType.COLOR_PICKER, (AbstractModule)this, this.J, null, this::lambda$new$0));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Train.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


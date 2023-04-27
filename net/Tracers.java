/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.Render3DEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.EntityRendererInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.modules.AbstractModule;
import deobf.EntityPlayer;
import cc.novoline.modules.EnumModuleType;
import deobf.EnumPlayerType;
import cc.novoline.modules.visual.HUD;
import deobf.MCInvoker;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.Minecraft;
import org.checkerframework.checker.nullness.qual.NonNull;

public class Tracers
extends AbstractModule {
    private static String[] J;
    @Property(value="only-tar")
    BooleanProperty H;
    private static String[] K;
    private static long I;
    private static Map L;

    static {
        I = a1c.a(5906153757304746501L, -6923469672864923783L, MethodHandles.lookup().lookupClass()).a(186173325719385L);
        L = new HashMap(13);
        long l4 = I ^ 0x4E2EE434791CL;
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
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x6A95;
        if (K[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])L.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                L.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/aCo", exception);
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

    @EventTarget
    public void a(Render3DEvent render3DEvent) {
        EntityPlayer entityPlayer;
        HUD.t();
        Iterator iterator = ListInvoker.iterator((List)aMF.a(aMF.b(ListInvoker.stream(BlockInvoker.s(this.mc.world)), this::lambda$on3DRender$0), aB0.a()));
        if (dz_0.c(iterator) && a6w_0.c(entityPlayer = (EntityPlayer)dz_0.b(iterator)) && entityPlayer != this.mc.player && !a6w_0.i(entityPlayer)) {
            double[] dArray;
            double d = entityPlayer.lastTickPosX + (entityPlayer.posX - entityPlayer.lastTickPosX) * (double)a1j.a(render3DEvent) - MCInvoker.j((Minecraft)this.mc).s;
            double d2 = entityPlayer.lastTickPosY + (entityPlayer.posY - entityPlayer.lastTickPosY) * (double)a1j.a(render3DEvent) - MCInvoker.j((Minecraft)this.mc).h;
            double d3 = entityPlayer.lastTickPosZ + (entityPlayer.posZ - entityPlayer.lastTickPosZ) * (double)a1j.a(render3DEvent) - MCInvoker.j((Minecraft)this.mc).m;
            boolean bl = this.mc.gameSettings.aR;
            a1V.g();
            this.mc.gameSettings.aR = false;
            EntityRendererInvoker.a(this.mc.entityRenderer, this.mc.timer.renderPartialTicks, 2);
            this.mc.gameSettings.aR = bl;
            boolean bl2 = a8F.a(NovolineInvoker.A(this.novoline), entityPlayer.getName(), EnumPlayerType.TARGET);
            if (bl2) {
                double[] dArray2 = new double[3];
                dArray2[0] = 1.0;
                dArray2[1] = 0.0;
                dArray = dArray2;
                dArray2[2] = 0.0;
            } else {
                double[] dArray3 = new double[3];
                dArray3[0] = 1.0;
                dArray3[1] = 1.0;
                dArray = dArray3;
                dArray3[2] = 1.0;
            }
            double[] dArray4 = dArray;
            a1V.a(entityPlayer, dArray4, d, d2 + (double)a6w_0.q(entityPlayer), d3);
            a1V.h();
        }
    }

    private boolean lambda$on3DRender$0(EntityPlayer entityPlayer) {
        HUD.j();
        return !auk_2.a((Boolean)Ba.b(this.H)) || a8F.a(NovolineInvoker.A(this.novoline), entityPlayer.getName(), EnumPlayerType.TARGET);
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
        String string2 = Tracers.b(n, l4);
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
            throw new RuntimeException("net/aCo" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    public Tracers(@NonNull ModuleManager moduleManager, int n, EnumModuleType enumModuleType, int n2, String string, byte by) {
        long l4 = ((long)n << 32 | (long)n2 << 40 >>> 32 | (long)by << 56 >>> 56) ^ I;
        long l5 = l4 ^ 0x1F8058F7D9BAL;
        int n3 = (int)(l5 >>> 56);
        long l6 = l5 << 8 >>> 8;
        super((byte)n3, moduleManager, l6, enumModuleType, string);
        this.H = asp_2.c();
        ManagerInvoker.put(new Setting((String)((Object)Tracers.b("c", (int)15879, (long)(0x5A64DB09E68E2A1DL ^ l4))), (String)((Object)Tracers.b("c", (int)14294, (long)(0x361CA5096BAEA3CDL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.H));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Tracers.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


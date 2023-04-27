/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.block;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.Render3DEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.ObjectMouseOverInvoker;
import cc.novoline.invoke.PlayerControllerInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.visual.HUD;
import deobf.MCInvoker;
import net.*;
import net.minecraft.util.MovingObjectPosition;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import deobf.Vec3;
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
import net.minecraft.client.Minecraft;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.lwjgl.opengl.GL11;

public class BlockOverlay
extends AbstractModule {
    private static Map O;
    private static String[] M;
    private static String[] N;
    @Property(value="mode")
    private StringProperty J;
    private static long L;
    @Property(value="color")
    private eu_0 H;
    @Property(value="color-mode")
    private StringProperty K;
    @Property(value="vector")
    private BooleanProperty I;

    @EventTarget
    public void a(Render3DEvent render3DEvent) {
        HUD.j();
        if (this.b() != null && this.b() != null && this.b().typeOfHit == net.I.BLOCK) {
            BlockPos blockPos = ObjectMouseOverInvoker.getBlockPos(this.b());
            if (StringPropertyInvoker.isMode(this.J, IO.c)) {
                this.a(blockPos);
            }
            a1V.e();
            a1V.a(aol_1.b(this.a()));
            double d = (double)amv_2.j(blockPos) - MCInvoker.j((Minecraft)this.mc).s;
            double d2 = (double)amv_2.h(blockPos) - MCInvoker.j((Minecraft)this.mc).h;
            double d3 = (double)amv_2.i(blockPos) - MCInvoker.j((Minecraft)this.mc).m;
            double d4 = BlocksInvoker.C(BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, blockPos))) - BlocksInvoker.j(BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, blockPos)));
            GL11.glLineWidth((float)1.0f);
            GL11.glBegin((int)3);
            GL11.glVertex3d((double)d, (double)d2, (double)d3);
            GL11.glVertex3d((double)d, (double)(d2 + d4), (double)d3);
            GL11.glEnd();
            GL11.glBegin((int)3);
            GL11.glVertex3d((double)(d + 1.0), (double)d2, (double)d3);
            GL11.glVertex3d((double)(d + 1.0), (double)(d2 + d4), (double)d3);
            GL11.glEnd();
            GL11.glBegin((int)3);
            GL11.glVertex3d((double)(d + 1.0), (double)d2, (double)(d3 + 1.0));
            GL11.glVertex3d((double)(d + 1.0), (double)(d2 + d4), (double)(d3 + 1.0));
            GL11.glEnd();
            GL11.glBegin((int)3);
            GL11.glVertex3d((double)d, (double)d2, (double)(d3 + 1.0));
            GL11.glVertex3d((double)d, (double)(d2 + d4), (double)(d3 + 1.0));
            GL11.glEnd();
            GL11.glBegin((int)3);
            GL11.glVertex3d((double)d, (double)d2, (double)d3);
            GL11.glVertex3d((double)(d + 1.0), (double)d2, (double)d3);
            GL11.glEnd();
            GL11.glBegin((int)3);
            GL11.glVertex3d((double)d, (double)(d2 + d4), (double)d3);
            GL11.glVertex3d((double)(d + 1.0), (double)(d2 + d4), (double)d3);
            GL11.glEnd();
            GL11.glBegin((int)3);
            GL11.glVertex3d((double)d, (double)d2, (double)d3);
            GL11.glVertex3d((double)d, (double)d2, (double)(d3 + 1.0));
            GL11.glEnd();
            GL11.glBegin((int)3);
            GL11.glVertex3d((double)d, (double)(d2 + d4), (double)d3);
            GL11.glVertex3d((double)d, (double)(d2 + d4), (double)(d3 + 1.0));
            GL11.glEnd();
            GL11.glBegin((int)3);
            GL11.glVertex3d((double)(d + 1.0), (double)d2, (double)(d3 + 1.0));
            GL11.glVertex3d((double)(d + 1.0), (double)d2, (double)(d3 + 1.0));
            GL11.glEnd();
            GL11.glBegin((int)3);
            GL11.glVertex3d((double)(d + 1.0), (double)(d2 + d4), (double)(d3 + 1.0));
            GL11.glVertex3d((double)(d + 1.0), (double)(d2 + d4), (double)(d3 + 1.0));
            GL11.glEnd();
            GL11.glBegin((int)3);
            GL11.glVertex3d((double)(d + 1.0), (double)d2, (double)(d3 + 1.0));
            GL11.glVertex3d((double)(d + 1.0), (double)d2, (double)d3);
            GL11.glEnd();
            GL11.glBegin((int)3);
            GL11.glVertex3d((double)(d + 1.0), (double)(d2 + d4), (double)(d3 + 1.0));
            GL11.glVertex3d((double)(d + 1.0), (double)(d2 + d4), (double)d3);
            GL11.glEnd();
            GL11.glBegin((int)3);
            GL11.glVertex3d((double)d, (double)d2, (double)(d3 + 1.0));
            GL11.glVertex3d((double)(d + 1.0), (double)d2, (double)(d3 + 1.0));
            GL11.glEnd();
            GL11.glBegin((int)3);
            GL11.glVertex3d((double)d, (double)(d2 + d4), (double)(d3 + 1.0));
            GL11.glVertex3d((double)(d + 1.0), (double)(d2 + d4), (double)(d3 + 1.0));
            GL11.glEnd();
            a1V.b();
        }
    }

    public MovingObjectPosition b() {
        HUD.t();
        PlayerInvoker.b(this.mc.player);
        float f = auk_2.a((Boolean)Ba.b(this.I)) ? 250.0f : PlayerControllerInvoker.b(this.mc.playerController);
        Vec3 vec3 = ae4_0.a();
        Vec3 vec32 = ae4_0.a(this.mc.player.rotationPitch, this.mc.player.rotationYaw);
        Vec3 vec33 = aNE.a(vec3, vec32.xCoord * (double)f, vec32.yCoord * (double)f, vec32.zCoord * (double)f);
        return BlockInvoker.a(this.mc.world, vec3, vec33, false, false, false);
    }

    public BlockOverlay(@NonNull int n, ModuleManager moduleManager, EnumModuleType enumModuleType, int n2, String string, byte by, String string2) {
        long l4 = ((long)n << 32 | (long)n2 << 40 >>> 32 | (long)by << 56 >>> 56) ^ L;
        long l5 = l4 ^ 0x2F219E2ABFC9L;
        int n3 = (int)(l5 >>> 48);
        int n4 = (int)(l5 << 16 >>> 48);
        int n5 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n3, enumModuleType, string, (char)n4, n5, string2);
        this.K = StringPropertyInvoker.b(asp_2.a((String)((Object)BlockOverlay.b("d", (int)27166, (long)(0x371E1C5E0AA75503L ^ l4)))), new String[]{BlockOverlay.b("d", (int)6162, (long)(0x8AAB6A1133AA70DL ^ l4)), BlockOverlay.b("d", (int)16481, (long)(0x6DD80950A296FF79L ^ l4))});
        this.H = asp_2.b(P8.d(aol_1.b(new Color(200, 200, 200))));
        this.J = StringPropertyInvoker.b(asp_2.a((String)((Object)BlockOverlay.b("d", (int)14007, (long)(0x7704F79E928209A7L ^ l4)))), new String[]{BlockOverlay.b("d", (int)25511, (long)(0x204804D5EFE2DCB2L ^ l4)), BlockOverlay.b("d", (int)3525, (long)(0x28526A9BEDEFB2D9L ^ l4))});
        this.I = asp_2.c();
        ManagerInvoker.put(new Setting((String)((Object)BlockOverlay.b("d", (int)6098, (long)(0x77FA9BFE6EE5A8C3L ^ l4))), (String)((Object)BlockOverlay.b("d", (int)25046, (long)(0x8D4BA4F5850DEC1L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.K));
        ManagerInvoker.put(new Setting((String)((Object)BlockOverlay.b("d", (int)10517, (long)(0x27DBFC7BA1AD160CL ^ l4))), (String)((Object)BlockOverlay.b("d", (int)7071, (long)(0x72D50B232D132484L ^ l4))), SettingType.COLOR_PICKER, (AbstractModule)this, this.H, null, this::lambda$new$0));
        ManagerInvoker.put(new Setting((String)((Object)BlockOverlay.b("d", (int)25142, (long)(0x2623CC8054BE5D28L ^ l4))), (String)((Object)BlockOverlay.b("d", (int)32007, (long)(0x3C34CCE312134213L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.J));
        ManagerInvoker.put(new Setting((String)((Object)BlockOverlay.b("d", (int)7682, (long)(0x677CF381A612114L ^ l4))), (String)((Object)BlockOverlay.b("d", (int)1368, (long)(0x1BC4523C1A4D3A42L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.I));
    }

    private Color a() {
        HUD.t();
        return StringPropertyInvoker.isMode(this.K, IO.b) ? aUL.c(this.H) : new Color(hb_2.a(0L));
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x5084;
        if (N[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])O.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                O.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_C", exception);
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

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_C" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = BlockOverlay.b(n, l4);
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

    private Boolean lambda$new$0() {
        return auk_2.b(StringPropertyInvoker.isMode(this.K, IO.a));
    }

    static {
        L = a1c.a(-5358347994435582760L, -6859524756021386530L, MethodHandles.lookup().lookupClass()).a(58681691087746L);
        O = new HashMap(13);
        long l4 = L ^ 0x12768D473C1FL;
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

    private void a(BlockPos blockPos) {
        a1V.e();
        a1V.a(new Color(aol_1.c(this.a()), aol_1.g(this.a()), aol_1.f(this.a()), 100));
        double d = (double)amv_2.j(blockPos) - MCInvoker.j((Minecraft)this.mc).s;
        double d2 = (double)amv_2.h(blockPos) - MCInvoker.j((Minecraft)this.mc).h;
        double d3 = (double)amv_2.i(blockPos) - MCInvoker.j((Minecraft)this.mc).m;
        double d4 = BlocksInvoker.C(BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, blockPos))) - BlocksInvoker.j(BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, blockPos)));
        double d5 = BlocksInvoker.B(BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, blockPos)));
        double d6 = BlocksInvoker.a(BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, blockPos)));
        double d7 = BlocksInvoker.u(BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, blockPos)));
        double d8 = BlocksInvoker.h(BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, blockPos)));
        GL11.glLineWidth((float)1.0f);
        GL11.glPolygonMode((int)1032, (int)6914);
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)(d + d5), (double)(d2 + d4), (double)(d3 + d7));
        GL11.glVertex3d((double)(d + d5), (double)(d2 + d4), (double)(d3 + d8));
        GL11.glVertex3d((double)(d + d6), (double)(d2 + d4), (double)(d3 + d8));
        GL11.glVertex3d((double)(d + d6), (double)(d2 + d4), (double)(d3 + d7));
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)(d + d6), (double)(d2 + d4), (double)(d3 + d7));
        GL11.glVertex3d((double)(d + d6), (double)(d2 + d4), (double)(d3 + d8));
        GL11.glVertex3d((double)(d + d6), (double)d2, (double)(d3 + d8));
        GL11.glVertex3d((double)(d + d6), (double)d2, (double)(d3 + d7));
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)(d + d5), (double)(d2 + d4), (double)(d3 + d7));
        GL11.glVertex3d((double)(d + d6), (double)(d2 + d4), (double)(d3 + d7));
        GL11.glVertex3d((double)(d + d6), (double)d2, (double)(d3 + d7));
        GL11.glVertex3d((double)(d + d5), (double)d2, (double)(d3 + d7));
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)(d + d5), (double)(d2 + d4), (double)(d3 + d8));
        GL11.glVertex3d((double)(d + d5), (double)(d2 + d4), (double)(d3 + d7));
        GL11.glVertex3d((double)(d + d5), (double)d2, (double)(d3 + d7));
        GL11.glVertex3d((double)(d + d5), (double)d2, (double)(d3 + d8));
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)(d + d6), (double)(d2 + d4), (double)(d3 + d8));
        GL11.glVertex3d((double)(d + d5), (double)(d2 + d4), (double)(d3 + d8));
        GL11.glVertex3d((double)(d + d5), (double)d2, (double)(d3 + d8));
        GL11.glVertex3d((double)(d + d6), (double)d2, (double)(d3 + d8));
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)(d + d6), (double)d2, (double)(d3 + d8));
        GL11.glVertex3d((double)(d + d5), (double)d2, (double)(d3 + d8));
        GL11.glVertex3d((double)(d + d5), (double)d2, (double)(d3 + d7));
        GL11.glVertex3d((double)(d + d6), (double)d2, (double)(d3 + d7));
        GL11.glEnd();
        a1V.b();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(BlockOverlay.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


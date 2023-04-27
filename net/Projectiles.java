/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.Render3DEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.EntityRendererInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ObjectMouseOverInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import deobf.Entity;
import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.visual.HUD;
import deobf.MCInvoker;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.Minecraft;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.lwjgl.opengl.GL11;

public class Projectiles
extends AbstractModule {
    private static long J = a1c.a(-946844159290935277L, 8505280675125377870L, MethodHandles.lookup().lookupClass()).a(86644015369147L);
    private static Map M = new HashMap(13);
    private static String[] L;
    private static String[] K;
    @Property(value="color-mode")
    private StringProperty H;
    @Property(value="color")
    private eu_0 I;

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x3656;
        if (L[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])M.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                M.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/aC7", exception);
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

    private Color a() {
        HUD.j();
        return StringPropertyInvoker.isMode(this.H, sb_1.a) ? aUL.c(this.I) : new Color(hb_2.a(0L));
    }

    static {
        long l4 = J ^ 0x55420511A756L;
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
    public void a(Render3DEvent render3DEvent) {
        HUD.t();
        Item item = act_2.k(PlayerInvoker.h(this.mc.player));
        if (PlayerInvoker.ag(this.mc.player) && item instanceof ItemBow || item instanceof L_ || item instanceof LL || item instanceof lo_0 || item instanceof ItemFishingRod) {
            Entity entity;
            int n;
            float f = 1.5f;
            float f2 = 0.99f;
            float f3 = 0.05f;
            float f4 = 0.3f;
            if (item instanceof ItemFishingRod) {
                f3 = 0.04f;
                f4 = 0.25f;
                f2 = 0.92f;
            }
            if (item instanceof ItemBow) {
                n = 72000 - PlayerInvoker.R(this.mc.player);
                float f5 = (float)n / 20.0f;
                f = MathInvoker.a(3.0f, f5 * 2.0f);
            }
            if (item instanceof L_ || item instanceof LL || item instanceof lo_0) {
                f3 = 0.03f;
                f4 = 0.25f;
            }
            n = 0;
            double d = this.mc.player.prevPosX + (this.mc.player.posX - this.mc.player.prevPosX) * (double)a1j.a(render3DEvent);
            double d2 = this.mc.player.prevPosY + (this.mc.player.posY - this.mc.player.prevPosY) * (double)a1j.a(render3DEvent) + (double)PlayerInvoker.X(this.mc.player);
            double d3 = this.mc.player.prevPosZ + (this.mc.player.posZ - this.mc.player.prevPosZ) * (double)a1j.a(render3DEvent);
            float f6 = this.mc.player.prevRotationYaw + (this.mc.player.rotationYaw - this.mc.player.prevRotationYaw) * a1j.a(render3DEvent);
            float f7 = this.mc.player.prevRotationPitch + (this.mc.player.rotationPitch - this.mc.player.prevRotationPitch) * a1j.a(render3DEvent);
            double d4 = -MathHelper.sin(f6 / 180.0f * (float)Math.PI) * MathHelper.cos(f7 / 180.0f * (float)Math.PI);
            double d5 = MathHelper.cos(f6 / 180.0f * (float)Math.PI) * MathHelper.cos(f7 / 180.0f * (float)Math.PI);
            double d6 = -MathHelper.sin(f7 / 180.0f * (float)Math.PI);
            double d7 = d4;
            double d8 = d6;
            double d9 = d5;
            float f8 = MathHelper.e(d7 * d7 + d8 * d8 + d9 * d9);
            d7 /= (double)f8;
            d8 /= (double)f8;
            d9 /= (double)f8;
            d4 = d7 *= (double)f;
            d6 = d8 *= (double)f;
            d5 = d9 *= (double)f;
            ArrayList arrayList = new ArrayList();
            double d10 = -MathInvoker.i(MathInvoker.o(this.mc.player.rotationYaw + 90.0f)) * 2.0;
            double d11 = MathInvoker.m(MathInvoker.o(this.mc.player.rotationYaw + 90.0f)) * 2.0;
            ListInvoker.add(arrayList, new Vec3(d + d10, d2 - 1.0, d3 + d11));
            Color color = new Color(255, 255, 255, 170);
            int n2 = 0;
            Object object = new Vec3(d, d2, d3);
            Vec3 vec3 = new Vec3(d + d4, d2 + d6, d3 + d5);
            MovingObjectPosition movingObjectPosition = BlockInvoker.a(this.mc.world, (Vec3)object, vec3, false, true, false);
            object = new Vec3(d, d2, d3);
            vec3 = new Vec3(d + d4, d2 + d6, d3 + d5);
            if (movingObjectPosition != null) {
                vec3 = new Vec3(movingObjectPosition.b.xCoord, movingObjectPosition.b.yCoord, movingObjectPosition.b.zCoord);
                a1V.b(ObjectMouseOverInvoker.getBlockPos(movingObjectPosition), aol_1.b(this.a()));
                n = 1;
            }
            Entity entity2 = null;
            List list = BlockInvoker.a(this.mc.world, (Entity)this.mc.player, h__0.d(h__0.a(new rm_2(d - (double)f4, d2 - (double)f4, d3 - (double)f4, d + (double)f4, d2 + (double)f4, d3 + (double)f4), d4, d6, d5), 1.0, 1.0, 1.0));
            double d12 = 0.0;
            Iterator iterator = ListInvoker.iterator(list);
            if (dz_0.c(iterator) && ayj_0.z(entity = (Entity)dz_0.b(iterator))) {
                float f9 = 0.3f;
                rm_2 rm_22 = h__0.d(ayj_0.u(entity), f9, f9, f9);
                MovingObjectPosition movingObjectPosition2 = h__0.a(rm_22, (Vec3)object, vec3);
                double d13 = aNE.e((Vec3)object, movingObjectPosition2.b);
                if (!(d13 < d12)) {
                    double d14 = d12 - 0.0;
                    int cfr_ignored_1 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                }
                entity2 = entity;
                d12 = d13;
            }
            if (entity2 != null) {
                movingObjectPosition = new MovingObjectPosition(entity2);
                if (!(entity2 instanceof ov_1)) {
                    a1V.b(entity2, aol_1.b(this.a()));
                }
                n = 1;
                color = new Color(0, 255, 3, 255);
            }
            d += d4;
            d2 += d6;
            d3 += d5;
            f6 = (float)(MathHelper.c(d4, d5) * 180.0 / Math.PI);
            d4 *= (double)f2;
            d6 *= (double)f2;
            d5 *= (double)f2;
            d6 -= (double)f3;
            ListInvoker.add(arrayList, new Vec3(d, d2, d3));
            ++n2;
            n2 = this.mc.gameSettings.aR ? 1 : 0;
            this.mc.gameSettings.aR = false;
            EntityRendererInvoker.a(this.mc.entityRenderer, this.mc.timer.renderPartialTicks, 2);
            this.mc.gameSettings.aR = n2;
            a1V.e();
            GL11.glLineWidth((float)2.0f);
            a1V.a(color);
            GL11.glBegin((int)3);
            object = ListInvoker.iterator(arrayList);
            if (dz_0.c((Iterator)object)) {
                vec3 = (Vec3)dz_0.b((Iterator)object);
                double d15 = aNE.e(vec3) - MCInvoker.j((Minecraft)this.mc).s;
                double d16 = aNE.a(vec3) - MCInvoker.j((Minecraft)this.mc).h;
                double d17 = aNE.d(vec3) - MCInvoker.j((Minecraft)this.mc).m;
                GL11.glVertex3d((double)d15, (double)d16, (double)d17);
            }
            GL11.glEnd();
            a1V.b();
        }
    }

    private Boolean lambda$new$0() {
        return auk_2.b(StringPropertyInvoker.isMode(this.H, sb_1.b));
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = Projectiles.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    public Projectiles(@NonNull char c, ModuleManager moduleManager, EnumModuleType enumModuleType, String string, long l4) {
        long l5 = ((long)c << 48 | l4 << 16 >>> 16) ^ J;
        long l6 = l5 ^ 0x3A6122CAB884L;
        int n = (int)(l6 >>> 56);
        long l7 = l6 << 8 >>> 8;
        super((byte)n, moduleManager, l7, enumModuleType, string);
        this.H = StringPropertyInvoker.b(asp_2.a((String)((Object)Projectiles.b("s", (int)10830, (long)(0x3412740C708803A9L ^ l5)))), new String[]{Projectiles.b("s", (int)10918, (long)(0x41B4C36E5DA98340L ^ l5)), Projectiles.b("s", (int)29739, (long)(0x37410070D70CDDCEL ^ l5))});
        this.I = asp_2.b(P8.d(aol_1.b(new Color(200, 200, 200))));
        ManagerInvoker.put(new Setting((String)((Object)Projectiles.b("s", (int)15470, (long)(0x2E53C825573B158DL ^ l5))), (String)((Object)Projectiles.b("s", (int)2051, (long)(0xB38F0114D3C21E2L ^ l5))), SettingType.COMBOBOX, (AbstractModule)this, this.H));
        ManagerInvoker.put(new Setting((String)((Object)Projectiles.b("s", (int)24954, (long)(0x749EE36B389B489EL ^ l5))), (String)((Object)Projectiles.b("s", (int)32526, (long)(0x19D99373C38056ECL ^ l5))), SettingType.COLOR_PICKER, (AbstractModule)this, this.I, null, this::lambda$new$0));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/aC7" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Projectiles.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


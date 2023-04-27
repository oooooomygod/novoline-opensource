/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Vector3d
 *  javax.vecmath.Vector4d
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.lwjgl.opengl.GL11
 */
package cc.novoline.modules.visual;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.Render2DEvent;
import cc.novoline.events.events.Render3DEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.DisplayInvoker;
import cc.novoline.invoke.EntityRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.NBTInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.vecmath.Vector3d;
import javax.vecmath.Vector4d;

import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.*;
import net.minecraft.client.Minecraft;
import net.Ba;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.BooleanProperty;
import net.ModuleManager;
import net.N4;
import net.P8;
import net.RenderManager;
import net.ScaledResolution;
import net.StringProperty;
import net.a1V;
import net.a1c;
import net.a6O;
import net.a6R;
import net.a7r_0;
import net.aB0;
import net.aHB;
import net.aMF;
import net.aUL;
import net.afs_2;
import net.amv_2;
import net.aol_1;
import net.apl_1;
import net.asp_2;
import net.auk_2;
import net.dm_2;
import net.dz_0;
import net.eu_0;
import net.hb_2;
import net.l__0;
import net.ne_0;
import net.rm_2;
import net.ua_2;
import net.uc_0;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.lwjgl.opengl.GL11;

public class ChestESP
extends AbstractModule {
    private IntBuffer H;
    @Property(value="color")
    private eu_0 J;
    @Property(value="color-ender")
    private eu_0 K;
    private static String[] V;
    @Property(value="color-visible")
    private eu_0 O;
    private static Map W;
    @Property(value="color-hidden")
    private eu_0 R;
    private FloatBuffer P;
    private static String[] U;
    private FloatBuffer M;
    @Property(value="mode")
    private StringProperty S;
    @Property(value="bordered")
    private BooleanProperty I;
    @Property(value="color-box")
    private StringProperty Q;
    private int N;
    private FloatBuffer L;
    private static long T;

    public void a(Framebuffer framebuffer) {
        l__0.b(framebuffer.f);
        int n = l__0.b();
        l__0.b(36161, n);
        l__0.b(36161, 34041, MCInvoker.f().displayWidth, MCInvoker.f().displayHeight);
        l__0.a(36160, 36128, 36161, n);
        l__0.a(36160, 36096, 36161, n);
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x5CF7;
        if (V[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])W.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                W.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_b", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return V[n2];
    }

    public eu_0 i() {
        return this.O;
    }

    private Boolean lambda$new$5() {
        return auk_2.b(StringPropertyInvoker.isMode(this.S, dm_2.m));
    }

    private Boolean lambda$new$2() {
        HUD.j();
        return auk_2.b(!StringPropertyInvoker.isMode(this.S, dm_2.k) && (!StringPropertyInvoker.isMode(this.S, dm_2.c) || StringPropertyInvoker.isMode(this.Q, dm_2.l)));
    }

    public ChestESP(@NonNull long l4, ModuleManager moduleManager, EnumModuleType enumModuleType, int n, String string, String string2) {
        long l5 = (l4 << 32 | (long)n << 32 >>> 32) ^ T;
        long l6 = l5 ^ 0x93EF92090FAL;
        int n2 = (int)(l6 >>> 48);
        int n3 = (int)(l6 << 16 >>> 48);
        int n4 = (int)(l6 << 32 >>> 32);
        super(moduleManager, (char)n2, enumModuleType, string, (char)n3, n4, string2);
        this.J = asp_2.b(P8.d(-65339));
        this.K = asp_2.b(P8.d(-65339));
        this.S = StringPropertyInvoker.b(asp_2.a((String)((Object)ChestESP.b("c", (int)25928, (long)(0x42A0030AF753F918L ^ l5)))), new String[]{ChestESP.b("c", (int)20312, (long)(0x1C1C4DB7DDBFD30FL ^ l5)), ChestESP.b("c", (int)19506, (long)(0x79C2BAC7641D060L ^ l5)), ChestESP.b("c", (int)14277, (long)(0x3CD536090B622B9CL ^ l5)), ChestESP.b("c", (int)3275, (long)(0x3591264F59989084L ^ l5))});
        this.O = asp_2.b(P8.d(aol_1.b(new Color(255, 101, 101))));
        this.R = asp_2.b(P8.d(aol_1.b(new Color(165, 163, 165))));
        this.Q = StringPropertyInvoker.b(asp_2.a((String)((Object)ChestESP.b("c", (int)22771, (long)(0x3C9AF557968244BEL ^ l5)))), new String[]{ChestESP.b("c", (int)4647, (long)(0x15C1621A207A0E71L ^ l5)), ChestESP.b("c", (int)11847, (long)(0x85DED58AB97B21AL ^ l5))});
        this.I = asp_2.d();
        this.H = N4.a(16);
        this.L = N4.d(16);
        this.M = N4.d(16);
        this.P = N4.d(4);
        ManagerInvoker.put(new Setting((String)((Object)ChestESP.b("c", (int)5400, (long)(0x1CE9D42480AF094CL ^ l5))), (String)((Object)ChestESP.b("c", (int)3321, (long)(0x575A097CBEB10A1L ^ l5))), SettingType.COMBOBOX, (AbstractModule)this, this.S));
        ManagerInvoker.put(new Setting((String)((Object)ChestESP.b("c", (int)19702, (long)(0x4E4B8872213A50A7L ^ l5))), (String)((Object)ChestESP.b("c", (int)22381, (long)(0x3DAC1EAC2E0D4B31L ^ l5))), SettingType.COMBOBOX, (AbstractModule)this, this.Q, this::lambda$new$0));
        ManagerInvoker.put(new Setting((String)((Object)ChestESP.b("c", (int)23225, (long)(0x6FAF05858AACC6E6L ^ l5))), (String)((Object)ChestESP.b("c", (int)10406, (long)(0x79BC1CD7147F34FCL ^ l5))), SettingType.COLOR_PICKER, (AbstractModule)this, this.J, null, this::lambda$new$1));
        ManagerInvoker.put(new Setting((String)((Object)ChestESP.b("c", (int)18898, (long)(0x63E55B95C7B85589L ^ l5))), (String)((Object)ChestESP.b("c", (int)26396, (long)(0x39DDADF94063FB4FL ^ l5))), SettingType.COLOR_PICKER, (AbstractModule)this, this.K, null, this::lambda$new$2));
        ManagerInvoker.put(new Setting((String)((Object)ChestESP.b("c", (int)26461, (long)(0x5323304A87ED7B08L ^ l5))), (String)((Object)ChestESP.b("c", (int)4438, (long)(0x202913D91EB30D08L ^ l5))), SettingType.CHECKBOX, (AbstractModule)this, this.I, this::lambda$new$3));
        ManagerInvoker.put(new Setting((String)((Object)ChestESP.b("c", (int)12077, (long)(0x73B82F2A4E673363L ^ l5))), (String)((Object)ChestESP.b("c", (int)25815, (long)(0x19093FEDDDBFF89BL ^ l5))), SettingType.COLOR_PICKER, (AbstractModule)this, this.O, null, this::lambda$new$4));
        ManagerInvoker.put(new Setting((String)((Object)ChestESP.b("c", (int)12077, (long)(0x73B82F2A4E673363L ^ l5))), (String)((Object)ChestESP.b("c", (int)1501, (long)(0x201ECC7A871E1995L ^ l5))), SettingType.COLOR_PICKER, (AbstractModule)this, this.R, null, this::lambda$new$5));
    }

    private static boolean lambda$tileEntityList$6(TileEntity tileEntity) {
        HUD.j();
        return tileEntity instanceof a6O || tileEntity instanceof a6R;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_b" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private void a(@NonNull TileEntity tileEntity, Color color) {
        double d = amv_2.j(NBTInvoker.g(tileEntity));
        double d2 = amv_2.h(NBTInvoker.g(tileEntity));
        double d3 = amv_2.i(NBTInvoker.g(tileEntity));
        rm_2 rm_22 = null;
        Block block = BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, new BlockPos(d, d2, d3)));
        HUD.t();
        Block block2 = BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, new BlockPos(d + 1.0, d2, d3)));
        Block block3 = BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, new BlockPos(d - 1.0, d2, d3)));
        Block block4 = BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, new BlockPos(d, d2, d3 + 1.0)));
        Block block5 = BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, new BlockPos(d, d2, d3 - 1.0)));
        if (block2 == block) {
            rm_22 = this.c(d, d2, d3);
        } else if (block5 == block) {
            rm_22 = this.a(d, d2, d3);
        } else if (block3 != block && block4 != block) {
            rm_22 = this.b(d, d2, d3);
        }
        GlStateManagerInvoker.C();
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.b(770, 771);
        GlStateManagerInvoker.disableTexture2D();
        GlStateManagerInvoker.disableDepth();
        GL11.glEnable((int)2848);
        float[] fArray = this.a(color);
        ne_0.a(rm_22, 1.0f, this.a(fArray[0] / 255.0f, fArray[1] / 255.0f, fArray[2] / 255.0f, 0.2f));
        GL11.glDisable((int)2848);
        GlStateManagerInvoker.enableDepth();
        GlStateManagerInvoker.enableTexture2D();
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.enableAlpha();
    }

    public StringProperty e() {
        return this.S;
    }

    public void k() {
        this.m();
        GL11.glPushAttrib((int)1048575);
        GL11.glDisable((int)3008);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2896);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)3.0f);
        GL11.glEnable((int)2848);
        GL11.glEnable((int)2960);
        GL11.glClear((int)1024);
        GL11.glClearStencil((int)15);
        GL11.glStencilFunc((int)512, (int)1, (int)15);
        GL11.glStencilOp((int)7681, (int)7681, (int)7681);
        GL11.glPolygonMode((int)1032, (int)6913);
    }

    public eu_0 n() {
        return this.K;
    }

    private Vector3d a(ScaledResolution scaledResolution, double d, double d2, double d3) {
        GL11.glGetFloat((int)2982, (FloatBuffer)this.L);
        GL11.glGetFloat((int)2983, (FloatBuffer)this.M);
        GL11.glGetInteger((int)2978, (IntBuffer)this.H);
        if (afs_2.a((float)d, (float)d2, (float)d3, this.L, this.M, this.H, this.P)) {
            return new Vector3d((double)(aHB.b(this.P, 0) / (float)ScaledResolutionInvoker.getScaleFactor(scaledResolution)), (double)(((float)DisplayInvoker.getHeight() - aHB.b(this.P, 1)) / (float)ScaledResolutionInvoker.getScaleFactor(scaledResolution)), (double)aHB.b(this.P, 2));
        }
        return null;
    }

    public void c(int n) {
        float f = (float)(n >> 24 & 0xFF) / 255.0f;
        float f2 = (float)(n >> 16 & 0xFF) / 255.0f;
        HUD.t();
        float f3 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n & 0xFF) / 255.0f;
        if (f == 0.0f) {
            f = 1.0f;
        }
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
    }

    public void b() {
        GL11.glStencilFunc((int)514, (int)1, (int)15);
        GL11.glStencilOp((int)7680, (int)7680, (int)7680);
        GL11.glPolygonMode((int)1032, (int)6913);
    }

    private @NonNull rm_2 b(double d, double d2, double d3) {
        RenderManager renderManager = MCInvoker.j(this.mc);
        return new rm_2(d + (double)0.05f - renderManager.s, d2 - renderManager.h, d3 + (double)0.05f - renderManager.m, d + (double)0.95f - renderManager.s, d2 + (double)0.9f - renderManager.h, d3 + (double)0.95f - renderManager.m);
    }

    private @NonNull rm_2 a(double d, double d2, double d3) {
        RenderManager renderManager = MCInvoker.j(this.mc);
        return new rm_2(d + (double)0.05f - renderManager.s, d2 - renderManager.h, d3 + (double)0.05f - renderManager.m - 1.0, d + (double)0.95f - renderManager.s, d2 + (double)0.9f - renderManager.h, d3 + (double)0.95f - renderManager.m);
    }

    public float[] a(Color color) {
        return new float[]{aol_1.c(color), aol_1.g(color), aol_1.f(color), 200.0f};
    }

    private @NonNull rm_2 c(double d, double d2, double d3) {
        RenderManager renderManager = MCInvoker.j(this.mc);
        return new rm_2(d + (double)0.05f - renderManager.s, d2 - renderManager.h, d3 + (double)0.05f - renderManager.m, d + (double)1.95f - renderManager.s, d2 + (double)0.9f - renderManager.h, d3 + (double)0.95f - renderManager.m);
    }

    private Boolean lambda$new$3() {
        return auk_2.b(StringPropertyInvoker.isMode(this.S, dm_2.h));
    }

    private Boolean lambda$new$1() {
        HUD.j();
        return auk_2.b(!StringPropertyInvoker.isMode(this.S, dm_2.f) && (!StringPropertyInvoker.isMode(this.S, dm_2.i) || StringPropertyInvoker.isMode(this.Q, dm_2.e)));
    }

    public eu_0 g() {
        return this.J;
    }

    @EventTarget
    public void a(Render2DEvent render2DEvent) {
        HUD.j();
        if (StringPropertyInvoker.isMode(this.S, dm_2.g)) {
            long l4 = 0L;
            Iterator iterator = ListInvoker.iterator(this.d());
            if (dz_0.c(iterator)) {
                TileEntity tileEntity = (TileEntity)dz_0.b(iterator);
                BlockPos blockPos = NBTInvoker.g(tileEntity);
                rm_2 rm_22 = new rm_2((double)amv_2.j(blockPos) + 0.1, amv_2.h(blockPos), (double)amv_2.i(blockPos) + 0.1, (double)amv_2.j(blockPos) + 0.9, (double)amv_2.h(blockPos) + 0.8, (double)amv_2.i(blockPos) + 0.9);
                List list = a7r_0.a(new Vector3d[]{new Vector3d(rm_22.e, rm_22.a, rm_22.f), new Vector3d(rm_22.e, rm_22.c, rm_22.f), new Vector3d(rm_22.b, rm_22.a, rm_22.f), new Vector3d(rm_22.b, rm_22.c, rm_22.f), new Vector3d(rm_22.e, rm_22.a, rm_22.d), new Vector3d(rm_22.e, rm_22.c, rm_22.d), new Vector3d(rm_22.b, rm_22.a, rm_22.d), new Vector3d(rm_22.b, rm_22.c, rm_22.d)});
                EntityRendererInvoker.a(this.mc.entityRenderer, uc_0.b(render2DEvent), 0);
                Vector4d vector4d = null;
                Iterator iterator2 = ListInvoker.iterator(list);
                if (dz_0.c(iterator2)) {
                    Vector3d vector3d = (Vector3d)dz_0.b(iterator2);
                    vector3d = this.a(uc_0.a(render2DEvent), vector3d.x - MCInvoker.j((Minecraft)this.mc).k, vector3d.y - MCInvoker.j((Minecraft)this.mc).n, vector3d.z - MCInvoker.j((Minecraft)this.mc).j);
                    if (vector3d != null && vector3d.z >= 0.0 && vector3d.z < 1.0) {
                        if (vector4d == null) {
                            vector4d = new Vector4d(vector3d.x, vector3d.y, vector3d.z, 0.0);
                        }
                        vector4d.x = MathInvoker.a(vector3d.x, vector4d.x);
                        vector4d.y = MathInvoker.a(vector3d.y, vector4d.y);
                        vector4d.z = MathInvoker.d(vector3d.x, vector4d.z);
                        vector4d.w = MathInvoker.d(vector3d.y, vector4d.w);
                    }
                }
                EntityRendererInvoker.b(this.mc.entityRenderer);
                if (vector4d != null) {
                    double d = vector4d.x;
                    double d2 = vector4d.y;
                    double d3 = vector4d.z;
                    double d4 = vector4d.w;
                    if (StringPropertyInvoker.isMode(this.S, dm_2.d)) {
                        double d5 = ua_2.a(true);
                        double d6 = d * (1.0 / d5);
                        double d7 = d2 * (1.0 / d5);
                        double d8 = d3 * (1.0 / d5);
                        double d9 = d4 * (1.0 / d5);
                        if (StringPropertyInvoker.isMode(this.Q, dm_2.a)) {
                            a1V.a((float)d6, (float)d7, (float)d8, (float)d9, new Color(hb_2.a(l4)), auk_2.a((Boolean)Ba.b(this.I)));
                            l4 -= 240L;
                        }
                        if (tileEntity instanceof a6R) {
                            a1V.a((float)d6, (float)d7, (float)d8, (float)d9, aUL.c(this.K), auk_2.a((Boolean)Ba.b(this.I)));
                        }
                        a1V.a((float)d6, (float)d7, (float)d8, (float)d9, aUL.c(this.J), auk_2.a((Boolean)Ba.b(this.I)));
                        GL11.glScaled((double)(1.0 / d5), (double)(1.0 / d5), (double)(1.0 / d5));
                    }
                }
            }
        }
    }

    public void f() {
        GL11.glStencilFunc((int)512, (int)0, (int)15);
        GL11.glStencilOp((int)7681, (int)7681, (int)7681);
        GL11.glPolygonMode((int)1032, (int)6914);
    }

    public eu_0 l() {
        return this.R;
    }

    public void a(int n) {
        this.c(n);
        GL11.glDepthMask((boolean)false);
        GL11.glDisable((int)2929);
        GL11.glEnable((int)10754);
        GL11.glPolygonOffset((float)1.0f, (float)-2000000.0f);
        OpenGlHelper.a(apl_1.ab, 240.0f, 240.0f);
    }

    public void j() {
        GL11.glPolygonOffset((float)1.0f, (float)2000000.0f);
        GL11.glDisable((int)10754);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)2960);
        GL11.glDisable((int)2848);
        GL11.glHint((int)3154, (int)4352);
        GL11.glEnable((int)3042);
        GL11.glEnable((int)2896);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)3008);
        GL11.glPopAttrib();
    }

    public void c() {
        GL11.glStencilFunc((int)512, (int)0, (int)15);
        GL11.glStencilOp((int)7681, (int)7681, (int)7681);
        GL11.glPolygonMode((int)1032, (int)6914);
    }

    private Boolean lambda$new$0() {
        return auk_2.b(StringPropertyInvoker.isMode(this.S, dm_2.b));
    }

    private Boolean lambda$new$4() {
        return auk_2.b(StringPropertyInvoker.isMode(this.S, dm_2.j));
    }

    @EventTarget
    public void a(Render3DEvent render3DEvent) {
        TileEntity tileEntity;
        Iterator iterator;
        HUD.t();
        if (StringPropertyInvoker.isMode(this.S, dm_2.n) && dz_0.c(iterator = ListInvoker.iterator(this.d())) && !NBTInvoker.e(tileEntity = (TileEntity)dz_0.b(iterator)) && BlockInvoker.getMaterial(this.mc.world, NBTInvoker.g(tileEntity)) != null) {
            if (tileEntity instanceof a6R) {
                this.a(tileEntity, aUL.c(this.K));
            }
            this.a(tileEntity, aUL.c(this.J));
        }
    }

    public int a(float f, float f2, float f3, float f4) {
        return ((int)(f4 * 255.0f) & 0xFF) << 24 | ((int)(f * 255.0f) & 0xFF) << 16 | ((int)(f2 * 255.0f) & 0xFF) << 8 | (int)(f3 * 255.0f) & 0xFF;
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

    public void m() {
        HUD.t();
        Framebuffer framebuffer = MCInvoker.c(MCInvoker.f());
        if (framebuffer != null && framebuffer.f > -1) {
            this.a(framebuffer);
            framebuffer.f = -1;
        }
    }

    private List<TileEntity> d() {
        return (List)aMF.a(aMF.b(ListInvoker.stream(BlockInvoker.m(this.mc.world)), ChestESP::lambda$tileEntityList$6), aB0.a());
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = ChestESP.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    static {
        T = a1c.a(-2041560477418653010L, 4894008301311213590L, MethodHandles.lookup().lookupClass()).a(233173437388472L);
        W = new HashMap(13);
        long l4 = T ^ 0x1A9A3B3375A3L;
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

    public void h() {
        GL11.glStencilFunc((int)514, (int)1, (int)15);
        GL11.glStencilOp((int)7680, (int)7680, (int)7680);
        GL11.glPolygonMode((int)1032, (int)6913);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ChestESP.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


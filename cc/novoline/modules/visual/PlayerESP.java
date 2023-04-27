/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Vector3d
 *  javax.vecmath.Vector4d
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.GL11
 */
package cc.novoline.modules.visual;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.Render2DEvent;
import cc.novoline.events.events.Render3DEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.EntityRendererInvoker;
import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.MouseInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.StringInvoker;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.vecmath.Vector3d;
import javax.vecmath.Vector4d;

import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.*;
import net.minecraft.client.Minecraft;
import net.Bf;
import net.BooleanProperty;
import net.Chams;
import net.DU;
import net.DoubleProperty;
import net.HA;
import net.ListProperty;
import net.MD;
import net.ModuleManager;
import net.N4;
import net.P8;
import net.ScaledResolution;
import net.StringProperty;
import net.a1V;
import net.a1c;
import net.a1j;
import net.a6w_0;
import net.a7l_0;
import net.a7r_0;
import net.a8F;
import net.aB0;
import net.aCM;
import net.aHB;
import net.aL0;
import net.aMF;
import net.aS0;
import net.aUL;
import net.abb_2;
import net.adj_1;
import net.adt_2;
import net.afs_2;
import net.aol_1;
import net.arn_1;
import net.asg_0;
import net.asp_2;
import net.auk_2;
import net.ava_0;
import net.awu_1;
import net.axf_0;
import net.ayj_0;
import net.db_0;
import net.dz_0;
import net.eu_0;
import net.hb_2;
import net.ku_0;
import net.minecraft.item.ItemStack;
import net.ne_0;
import net.ob_0;
import net.pl_1;
import net.rm_2;
import net.rv_0;
import net.ua_2;
import net.uc_0;
import net.uo_1;
import net.xi_2;
import net.yi_2;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

public class PlayerESP
extends AbstractModule {
    @Property(value="pESP-hurtTime")
    private BooleanProperty P;
    @Property(value="bg-transparency")
    private IntProperty ad;
    private Color N;
    private static String[] cb;
    private int X;
    private boolean ac;
    @Property(value="pESP-nameColor")
    private eu_0 H;
    @Property(value="pESP-health-color-mode")
    private StringProperty ah;
    @Property(value="hat-size")
    private DoubleProperty T;
    private TimerUtil ai;
    private FloatBuffer af;
    @Property(value="pESP-box-color-state")
    private StringProperty M;
    @Property(value="font")
    private StringProperty R;
    private static String[] eb;
    @Property(value="pESP-onlyTargets")
    private BooleanProperty Q;
    private WeakHashMap<EntityPlayer, float[][]> K;
    @Property(value="pESP-filter")
    private ListProperty<String> ab;
    private Color J;
    private static long bb;
    private static Map ib;
    private double ak;
    @Property(value="pESP-hColor-1")
    private eu_0 W;
    private FloatBuffer Y;
    @Property(value="pESP-box_mode")
    private StringProperty V;
    @Property(value="pESP-health-mode")
    private StringProperty O;
    @Property(value="pESP-box_color_mode")
    private StringProperty I;
    private IntBuffer ae;
    @Property(value="pESP-hColor-2")
    private eu_0 aj;
    @Property(value="pESP-box_style")
    private StringProperty Z;
    private FloatBuffer L;
    @Property(value="pESP-boxColor")
    private eu_0 aa;
    private List<String> S;
    @Property(value="pESP-name-color-type")
    private StringProperty ag;
    @Property(value="hat-alpha")
    private IntProperty U;

    private void a(double[] dArray, float f, EntityPlayer entityPlayer) {
        HUD.t();
        if (entityPlayer.inventory.d[0] != null || entityPlayer.inventory.d[1] != null || entityPlayer.inventory.d[2] != null || entityPlayer.inventory.d[3] != null) {
            float f2 = 0.0f;
            if (this.mc.world != null) {
                ne_0.f();
            }
            ArrayList arrayList = new ArrayList();
            int n = 0;
            Object object = entityPlayer.inventory.d;
            int n2 = ((ItemStack[])object).length;
            if (n < n2) {
                ItemStack itemStack = object[n];
                ListInvoker.add(arrayList, itemStack);
                ++n;
            }
            asg_0.e(arrayList);
            GlStateManagerInvoker.C();
            GlStateManagerInvoker.clear(256);
            GlStateManagerInvoker.enableBlend();
            MCInvoker.A((Minecraft)this.mc).e = -150.0f;
            GL11.glScalef((float)(0.5f * f), (float)(0.5f * f), (float)(0.5f * f));
            object = ListInvoker.iterator(arrayList);
            if (dz_0.c((Iterator)object)) {
                ItemStack itemStack = (ItemStack)dz_0.b((Iterator)object);
                DU.b(MCInvoker.A(this.mc), itemStack, (float)dArray[2] + 2.0f, (float)dArray[1] + f2 - PlayerInvoker.b(this.mc.player, entityPlayer) * 0.053f);
                f2 = (float)((double)f2 + MathInvoker.a(dArray[3] - dArray[1]) / 4.0);
            }
            GlStateManagerInvoker.disableDepth();
            GlStateManagerInvoker.disableLighting();
            GlStateManagerInvoker.enableDepth();
            GlStateManagerInvoker.c(1.0f / (0.5f * f), 1.0f / (0.5f * f), 1.0f / (0.5f * f));
            MCInvoker.A((Minecraft)this.mc).e = 0.0f;
            GlStateManagerInvoker.enableBlend();
            GlStateManagerInvoker.enableAlpha();
        }
    }

    /*
     * Exception decompiling
     */
    private void a(float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, EntityPlayer var6_6) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$TooOptimisticMatchException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.getString(SwitchStringRewriter.java:404)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.access$600(SwitchStringRewriter.java:53)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$SwitchStringMatchResultCollector.collectMatches(SwitchStringRewriter.java:368)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.KleeneN.match(KleeneN.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.MatchSequence.match(MatchSequence.java:26)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:23)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewriteComplex(SwitchStringRewriter.java:201)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewrite(SwitchStringRewriter.java:73)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:881)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private Boolean lambda$new$10() {
        HUD.t();
        return auk_2.b(ListInvoker.contains((List)ava_0.a(this.ab), yi_2.a) && StringPropertyInvoker.isMode(this.I, yi_2.h));
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x61A4;
        if (eb[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])ib.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                ib.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/aCx", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return eb[n2];
    }

    public eu_0 d() {
        return this.aa;
    }

    private Boolean lambda$new$8() {
        return auk_2.b(ListInvoker.contains((List)ava_0.a(this.ab), yi_2.S));
    }

    private Vector3d a(ScaledResolution scaledResolution, double d, double d2, double d3) {
        GL11.glGetFloat((int)2982, (FloatBuffer)this.Y);
        GL11.glGetFloat((int)2983, (FloatBuffer)this.L);
        GL11.glGetInteger((int)2978, (IntBuffer)this.ae);
        if (afs_2.a((float)d, (float)d2, (float)d3, this.Y, this.L, this.ae, this.af)) {
            return new Vector3d((double)(aHB.b(this.af, 0) / (float)ScaledResolutionInvoker.getScaleFactor(scaledResolution)), (double)(((float)Display.getHeight() - aHB.b(this.af, 1)) / (float)ScaledResolutionInvoker.getScaleFactor(scaledResolution)), (double)aHB.b(this.af, 2));
        }
        return null;
    }

    private void b(Render3DEvent render3DEvent) {
        HUD cfr_ignored_0 = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        HUD.t();
        Chams chams = (Chams)ModuleInvoker.isEnable(ModuleRegistry.CHAMS);
        aol_1.b(aUL.c(net.X.c(chams)));
        Iterator iterator = ListInvoker.iterator(this.c());
        while (dz_0.c(iterator)) {
            EntityPlayer entityPlayer = (EntityPlayer)dz_0.b(iterator);
            a1V.e();
            if (awu_1.f(this.mc.gameSettings) == 0 && entityPlayer == this.mc.player) continue;
            GL11.glEnable((int)2929);
            GlStateManagerInvoker.A();
            GL11.glDisable((int)3553);
            GL11.glShadeModel((int)7425);
            GL11.glTranslated((double)(-MCInvoker.j((Minecraft)this.mc).s), (double)(-MCInvoker.j((Minecraft)this.mc).h), (double)(-MCInvoker.j((Minecraft)this.mc).m));
            double d = arn_1.a(entityPlayer.posX, entityPlayer.lastTickPosX, (double)a1j.a(render3DEvent));
            double d2 = arn_1.a(entityPlayer.posY, entityPlayer.lastTickPosY, (double)a1j.a(render3DEvent)) + (double)entityPlayer.n + (double)0.1f - (a6w_0.N(entityPlayer) ? 0.2 : 0.0);
            double d3 = arn_1.a(entityPlayer.posZ, entityPlayer.lastTickPosZ, (double)a1j.a(render3DEvent));
            float f = entityPlayer.rotationPitch;
            GL11.glTranslated((double)d, (double)d2, (double)d3);
            GL11.glRotatef((float)a6w_0.x(entityPlayer), (float)0.0f, (float)-1.0f, (float)0.0f);
            GL11.glRotatef((float)(f / 3.0f), (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslated((double)0.0, (double)0.0, (double)(f / 270.0f));
            GL11.glEnable((int)2848);
            GL11.glLineWidth((float)1.0f);
            GL11.glBegin((int)2);
            long l4 = 0L;
            int n = 1;
            int n2 = 0;
            Color color = new Color(hb_2.a(l4));
            a1V.a(new Color(aol_1.c(color), aol_1.g(color), aol_1.f(color), 255));
            double d4 = db_0.b((Double)MD.b(this.T)) * MathInvoker.m((double)n2 * Math.PI / 180.0);
            double d5 = db_0.b((Double)MD.b(this.T)) * MathInvoker.i((double)n2 * Math.PI / 180.0);
            GL11.glVertex3d((double)d4, (double)0.0, (double)d5);
            n2 += n;
            GL11.glEnd();
            GL11.glDisable((int)2848);
            GL11.glBegin((int)5);
            n2 = 0;
            color = new Color(hb_2.a(l4));
            a1V.a(new Color(aol_1.c(color), aol_1.g(color), aol_1.f(color), P8.b((Integer)adt_2.a(this.U))));
            d4 = db_0.b((Double)MD.b(this.T)) * MathInvoker.m((double)n2 * Math.PI / 180.0);
            d5 = db_0.b((Double)MD.b(this.T)) * MathInvoker.i((double)n2 * Math.PI / 180.0);
            GL11.glVertex3d((double)d4, (double)0.0, (double)d5);
            GL11.glVertex3d((double)0.0, (double)0.3f, (double)0.0);
            l4 -= 20L;
            n2 += n;
            GL11.glEnd();
            GL11.glTranslated((double)MCInvoker.j((Minecraft)this.mc).s, (double)MCInvoker.j((Minecraft)this.mc).h, (double)MCInvoker.j((Minecraft)this.mc).m);
            GL11.glShadeModel((int)7424);
            GlStateManagerInvoker.b();
            GL11.glDisable((int)2929);
            a1V.b();
            break;
        }
    }

    private Boolean lambda$new$6() {
        HUD.j();
        return auk_2.b(ListInvoker.contains((List)ava_0.a(this.ab), yi_2.l) && ((String)StringPropertyInvoker.b(this.ah)).equals(yi_2.p));
    }

    @EventTarget
    public void a(Render2DEvent render2DEvent) {
        HUD.t();
        GL11.glPushMatrix();
        long l4 = 0L;
        Iterator iterator = ListInvoker.iterator(this.c());
        if (dz_0.c(iterator)) {
            EntityPlayer entityPlayer = (EntityPlayer)dz_0.b(iterator);
            double d = arn_1.a(entityPlayer.posX, entityPlayer.lastTickPosX, (double)uc_0.b(render2DEvent));
            double d2 = arn_1.a(entityPlayer.posY, entityPlayer.lastTickPosY, (double)uc_0.b(render2DEvent));
            double d3 = arn_1.a(entityPlayer.posZ, entityPlayer.lastTickPosZ, (double)uc_0.b(render2DEvent));
            double d4 = entityPlayer.width / 1.5f;
            double d5 = (double)entityPlayer.n + 0.3;
            rm_2 rm_22 = new rm_2(d - d4, d2, d3 - d4, d + d4, d2 + d5, d3 + d4);
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
            float f = (float)vector4d.x;
            float f2 = (float)vector4d.y;
            float f3 = (float)vector4d.z;
            float f4 = (float)vector4d.w;
            float f5 = MathInvoker.b(f4 - f2);
            float cfr_ignored_0 = (float)((double)(f2 - f4) + 0.5);
            float f6 = 1.0f;
            switch (this.mc.gameSettings.z) {
                case 0: {
                    f6 = 0.5f;
                }
                case 1: {
                    f6 = 2.0f;
                }
                case 3: {
                    f6 = 0.6666667f;
                }
            }
            double[] dArray = ua_2.a(f, (double)f2);
            double[] dArray2 = ua_2.a(f3, (double)f4);
            double[] dArray3 = new double[]{dArray[0] * 2.0, dArray[1] * 2.0, dArray2[0] * 2.0, dArray2[1] * 2.0};
            if (ava_0.b(this.ab, yi_2.ag)) {
                this.a(f6, dArray3, entityPlayer, l4);
            }
            if (ava_0.b(this.ab, yi_2.x)) {
                if (StringPropertyInvoker.isMode(this.I, yi_2.V)) {
                    if (StringPropertyInvoker.isMode(this.Z, yi_2.C)) {
                        a1V.a((double)f, (double)f2, (double)f3, (double)f4, 2.0f, true, StringPropertyInvoker.isMode(this.V, yi_2.c), P8.b(aUL.f(this.aa)));
                    }
                    this.a(f, f2, f3, f4, aUL.c(this.aa), StringPropertyInvoker.isMode(this.V, yi_2.aa));
                }
                if (StringPropertyInvoker.isMode(this.I, yi_2.ab)) {
                    a1V.a((double)f, (double)f2, (double)f3, (double)f4, 2.0f, StringPropertyInvoker.isMode(this.Z, yi_2.an), StringPropertyInvoker.isMode(this.V, yi_2.T), aol_1.b(pl_1.a(entityPlayer)));
                }
                if (StringPropertyInvoker.isMode(this.I, yi_2.F)) {
                    if (StringPropertyInvoker.isMode(this.M, yi_2.f)) {
                        a1V.a((double)f, (double)f2, (double)f3, (double)f4, 2.0f, StringPropertyInvoker.isMode(this.Z, yi_2.B), StringPropertyInvoker.isMode(this.V, yi_2.ai), hb_2.a(l4));
                    }
                    a1V.a((double)f, (double)f2, (double)f3, (double)f4, 2.0f, StringPropertyInvoker.isMode(this.Z, yi_2.am), StringPropertyInvoker.isMode(this.V, yi_2.ac));
                }
            }
            if (ava_0.b(this.ab, yi_2.D)) {
                this.a(f, f2, f4, f5, f6, entityPlayer);
            }
            if (ava_0.b(this.ab, yi_2.k)) {
                this.a(dArray3, f6, entityPlayer);
            }
            if (ava_0.b(this.ab, yi_2.Q)) {
                this.b(dArray3, f6, entityPlayer);
            }
            l4 -= 360L;
        }
        this.ak = awu_1.f(this.mc.gameSettings);
        GL11.glPopMatrix();
    }

    private static boolean lambda$getPlayersList$17(Entity entity) {
        HUD.j();
        return !ayj_0.L(entity);
    }

    private Boolean lambda$new$15() {
        HUD.j();
        return auk_2.b(ListInvoker.contains((List)ava_0.a(this.ab), yi_2.b) && ((String)StringPropertyInvoker.b(this.ag)).equals(yi_2.Y));
    }

    private void a(float f, float f2, float f3, float f4, Color color, boolean bl) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        ku_0.a(ku_0.a(), f, f2, f5, f6, 0.0, 0.0, 4.0, new Color(0, 0, 0, 0), new Color(0, 0, 0, aol_1.e(color)), true);
        ku_0.a(ku_0.a(), f + 0.5f, f2 + 0.5f, f5 - 1.0f, f6 - 1.0f, 0.0, 0.0, 2.0, new Color(0, 0, 0, 0), color, true);
    }

    private boolean a(EntityPlayer entityPlayer) {
        HUD.j();
        return !entityPlayer.isDead && !a6w_0.i(entityPlayer);
    }

    private void c(boolean bl) {
        HUD.t();
        if (bl) {
            GL11.glDisable((int)2848);
            GL11.glDisable((int)2929);
            GL11.glDisable((int)3553);
        }
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        boolean bl2 = !bl;
        GL11.glDepthMask((boolean)false);
    }

    private void a(float f, double[] dArray, EntityPlayer entityPlayer, long l4) {
        double d;
        double d2;
        double d3;
        double d4;
        float f2;
        float f3;
        StringBuilder stringBuilder;
        int n;
        float f4;
        block12: {
            block13: {
                String string;
                String[] stringArray;
                Iterator iterator;
                f4 = 0.5f * f;
                GL11.glScalef((float)f4, (float)f4, (float)f4);
                HUD.t();
                double d5 = MathInvoker.a(dArray[2] - dArray[0]);
                n = aol_1.b(this.J);
                if (a8F.a(NovolineInvoker.A(this.novoline), StringInvoker.i(entityPlayer.getName()), EnumPlayerType.TARGET)) {
                    n = aol_1.b(this.u);
                }
                if (a8F.a(NovolineInvoker.A(this.novoline), StringInvoker.i(entityPlayer.getName()), EnumPlayerType.FRIEND)) {
                    n = aol_1.b(this.A);
                }
                if (StringPropertyInvoker.isMode(this.ag, yi_2.e)) {
                    n = aol_1.b(pl_1.a(entityPlayer));
                }
                if (StringPropertyInvoker.isMode(this.ag, yi_2.P)) {
                    n = aol_1.b(aUL.c(this.H));
                }
                if (StringPropertyInvoker.isMode(this.ag, yi_2.O)) {
                    n = hb_2.a(l4);
                }
                stringBuilder = new StringBuilder(entityPlayer.getName());
                if (NovolineInvoker.h(NovolineInvoker.getInstance()) && dz_0.c(iterator = ListInvoker.iterator(this.S)) && (stringArray = StringInvoker.g(string = (String)dz_0.b(iterator), yi_2.ae)).length > 1) {
                    String string2 = stringArray[0];
                    String string3 = stringArray[1];
                    if (entityPlayer.getName().equals(string3)) {
                        aL0.a(aL0.a(aL0.a(stringBuilder, yi_2.af), string2), yi_2.j);
                    }
                }
                f3 = (float)(this.b() * 2) - (float)(this.b() / 2);
                f2 = (float)(dArray[0] + d5 / 2.0 - (double)(this.a(stringBuilder.toString()) / 2));
                d4 = f2 - 2.0f;
                d3 = (float)dArray[1] - f3 - 2.0f;
                d2 = f2 + (float)this.a(stringBuilder.toString()) + 1.0f;
                d = dArray[1] - (double)f3 + (double)this.b() + 1.0;
                int n2 = this.mc.displayWidth / 2;
                int n3 = this.mc.displayHeight / 2;
                if (this.mc.gameSettings.z == 3 && !MCInvoker.u(this.mc)) {
                    n2 = (int)((double)n2 * 1.5);
                    n3 = (int)((double)n3 * 1.5);
                }
                if (!aCM.a(abb_2.UHC) || !(dArray[0] < (double)n2) || !(dArray[2] > (double)n2) || !(dArray[1] < (double)n3) || !(dArray[3] > (double)n3)) break block12;
                String string4 = yi_2.d;
                int n4 = this.a(string4);
                int n5 = this.a(stringBuilder.toString());
                this.a(aL0.a(aL0.a(new StringBuilder(), string4), yi_2.G).toString(), (double)(f2 + (float)((n5 - n4) / 2)), (double)((float)(dArray[1] - (double)f3 - 12.0)), 0xFFFFFF);
                if (!MouseInvoker.c(2)) break block13;
                if (this.ac) break block12;
                PlayerInvoker.b(this.mc.player, aL0.a(aL0.a(new StringBuilder(), yi_2.m), entityPlayer.getName()).toString());
                this.ac = true;
            }
            this.ac = false;
        }
        if (P8.b((Integer)adt_2.a(this.ad)) < 255) {
            a1V.b(d4, d3, d2, d, aol_1.b(new Color(0, 0, 0, 255 - P8.b((Integer)adt_2.a(this.ad)))));
        }
        this.a(stringBuilder.toString(), (double)f2, (double)((float)dArray[1] - f3), n);
        GL11.glScaled((double)(1.0f / f4), (double)(1.0f / f4), (double)(1.0f / f4));
    }

    private static boolean lambda$getPlayersList$16(Entity entity) {
        return entity instanceof EntityPlayer;
    }

    private Boolean lambda$new$3() {
        return auk_2.b(ListInvoker.contains((List)ava_0.a(this.ab), yi_2.I));
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = PlayerESP.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    @EventTarget
    public void a(xi_2 xi_22) {
        if (ListInvoker.contains((List)ava_0.a(this.ab), yi_2.g)) {
            rv_0 rv_02 = axf_0.a(xi_22);
            uo_1.a(this.K, (EntityPlayer)axf_0.b(xi_22), new float[][]{{rv_02.r.t, rv_02.r.m, rv_02.r.n}, {rv_02.h.t, rv_02.h.m, rv_02.h.n}, {rv_02.j.t, rv_02.j.m, rv_02.j.n}, {rv_02.l.t, rv_02.l.m, rv_02.l.n}, {rv_02.o.t, rv_02.o.m, rv_02.o.n}});
        }
    }

    private Boolean lambda$new$12() {
        return auk_2.b(ListInvoker.contains((List)ava_0.a(this.ab), yi_2.Z));
    }

    private Boolean lambda$new$13() {
        return auk_2.b(ListInvoker.contains((List)ava_0.a(this.ab), yi_2.W));
    }

    private Boolean lambda$new$0() {
        HUD.j();
        return auk_2.b(ava_0.b(this.ab, yi_2.ap) || ava_0.b(this.ab, yi_2.H));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/aCx" + " : " + string + " : " + methodType.toString(), exception);
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

    private void a(String string, double d, double d2, int n) {
        HUD.j();
        if (StringPropertyInvoker.isMode(this.R, yi_2.ao)) {
            a7l_0.a(adj_1.a(ob_0.a, 25), (CharSequence)string, d, d2, n, 1.5f);
        }
        FontRendererInvoker.a(this.mc.fontRendererCrack, string, (float)d, (float)d2, n, true);
    }

    @EventTarget
    public void a(Bf bf) {
        HUD.j();
        if (ava_0.b(this.ab, yi_2.ah) && HA.b(bf) instanceof EntityPlayer) {
            HA.a(bf, true);
        }
    }

    private void b(double[] dArray, float f, EntityPlayer entityPlayer) {
        if (a6w_0.d(entityPlayer) != null) {
            float f2 = 0.5f * f;
            GL11.glScalef((float)f2, (float)f2, (float)f2);
            float f3 = (float)(this.b() * 2) - (float)(this.b() / 2);
            double d = MathInvoker.a(dArray[2] - dArray[0]);
            a1V.b((double)((float)(dArray[0] + d / 2.0 - (double)(this.a(a6w_0.d(entityPlayer).r()) / 2)) - 2.0f), (double)((float)dArray[3] + f3 / 3.0f - 2.0f), (double)((float)(dArray[0] + d / 2.0 - (double)(this.a(a6w_0.d(entityPlayer).r()) / 2)) + (float)this.a(a6w_0.d(entityPlayer).r()) + 1.0f), dArray[3] + (double)(f3 / 3.0f) + (double)this.b() + 1.0, aol_1.b(new Color(0, 0, 0, 255 - P8.b((Integer)adt_2.a(this.ad)))));
            this.a(a6w_0.d(entityPlayer).r(), (double)((float)(dArray[0] + d / 2.0 - (double)(this.a(a6w_0.d(entityPlayer).r()) / 2))), (double)((float)dArray[3] + f3 / 3.0f), -1);
            GL11.glScalef((float)(1.0f / f2), (float)(1.0f / f2), (float)(1.0f / f2));
        }
    }

    private int a(String string) {
        HUD.t();
        return StringPropertyInvoker.isMode(this.R, yi_2.z) ? a7l_0.a(adj_1.a(ob_0.a, 25), string) : FontRendererInvoker.a(this.mc.fontRendererCrack, string);
    }

    public ListProperty<String> a() {
        return this.ab;
    }

    static {
        bb = a1c.a(-8216971410653703306L, -4051600244326354947L, MethodHandles.lookup().lookupClass()).a(128462141183473L);
        ib = new HashMap(13);
        long l4 = bb ^ 0x3CDA042CD847L;
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

    public static double a(double d, double d2, double d3) {
        return d2 + (d - d2) * d3;
    }

    private boolean b(EntityPlayer entityPlayer) {
        HUD.j();
        return !ListInvoker.contains(BlockInvoker.s(this.mc.world), entityPlayer);
    }

    private Boolean lambda$new$11() {
        HUD.j();
        return auk_2.b(ListInvoker.contains((List)ava_0.a(this.ab), yi_2.ad) && !StringPropertyInvoker.isMode(this.I, yi_2.M));
    }

    private Boolean lambda$new$2() {
        return auk_2.b(ava_0.b(this.ab, yi_2.t));
    }

    private Boolean lambda$new$9() {
        return auk_2.b(ListInvoker.contains((List)ava_0.a(this.ab), yi_2.A));
    }

    private List<EntityPlayer> c() {
        ArrayList<EntityPlayer> arrayList = new ArrayList<EntityPlayer>();
        HUD.t();
        List list = (List)aMF.a(aMF.b(aMF.b(ListInvoker.stream(BlockInvoker.e(this.mc.world)), PlayerESP::lambda$getPlayersList$16), PlayerESP::lambda$getPlayersList$17), aB0.a());
        Iterator iterator = ListInvoker.iterator(list);
        if (dz_0.c(iterator)) {
            Entity entity = (Entity)dz_0.b(iterator);
            EntityPlayer entityPlayer = (EntityPlayer)entity;
            if (!entity.equals(this.mc.player)) {
                ListInvoker.add(arrayList, entityPlayer);
            }
        }
        return arrayList;
    }

    public PlayerESP(@NonNull long l4, ModuleManager moduleManager, EnumModuleType enumModuleType, String string, String string2) {
        long l5 = (l4 = bb ^ l4) ^ 0x680E40AB0EE6L;
        int n = (int)(l5 >>> 48);
        int n2 = (int)(l5 << 16 >>> 48);
        int n3 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n, enumModuleType, string, (char)n2, n3, string2);
        this.J = new Color(255, 255, 255);
        this.N = new Color(0, 0, 0, 100);
        this.X = 0;
        this.ai = new TimerUtil();
        this.K = new WeakHashMap();
        this.ae = N4.a(16);
        this.Y = N4.d(16);
        this.L = N4.d(16);
        this.af = N4.d(4);
        this.ab = ava_0.a(asp_2.a(PlayerESP.b("g", (int)24578, (long)(0x5D0457F76BCD5F32L ^ l4))), new String[]{PlayerESP.b("g", (int)8823, (long)(0x405DC55D5CA11D49L ^ l4)), PlayerESP.b("g", (int)3701, (long)(0x6B08E9D50408B15BL ^ l4)), PlayerESP.b("g", (int)17755, (long)(0x2D57ADADC8447A47L ^ l4)), PlayerESP.b("g", (int)7676, (long)(0x130B0B5A2ABFA2E2L ^ l4)), PlayerESP.b("g", (int)17114, (long)(0x79A04D526F957DFAL ^ l4)), PlayerESP.b("g", (int)16735, (long)(0x2C1DEE9A74CFFE7BL ^ l4)), PlayerESP.b("g", (int)2551, (long)(0x40741BEDBF6AB6F0L ^ l4))});
        this.P = asp_2.c();
        this.aa = asp_2.b(P8.d(-7697665));
        this.H = asp_2.b(P8.d(aol_1.b(new Color(245, 255, 94))));
        this.W = asp_2.b(P8.d(aol_1.b(new Color(18, 255, 93))));
        this.aj = asp_2.b(P8.d(aol_1.b(new Color(241, 42, 42))));
        this.V = StringPropertyInvoker.b(asp_2.a((String)((Object)PlayerESP.b("g", (int)16410, (long)(0x762086FEBB37FF12L ^ l4)))), new String[]{PlayerESP.b("g", (int)23461, (long)(0x170910CD1C86E491L ^ l4)), PlayerESP.b("g", (int)2896, (long)(0x5743529512FA3454L ^ l4))});
        this.I = StringPropertyInvoker.b(asp_2.a((String)((Object)PlayerESP.b("g", (int)22166, (long)(0x3A540209F1E2699BL ^ l4)))), new String[]{PlayerESP.b("g", (int)3646, (long)(0x2EA7950750EEB12CL ^ l4)), PlayerESP.b("g", (int)15138, (long)(0x72B857B8D0D78405L ^ l4)), PlayerESP.b("g", (int)11148, (long)(0xC6067E72F3F94B5L ^ l4))});
        HUD.j();
        this.M = StringPropertyInvoker.b(asp_2.a((String)((Object)PlayerESP.b("g", (int)15138, (long)(0x72B857B8D0D78405L ^ l4)))), new String[]{PlayerESP.b("g", (int)15138, (long)(0x72B857B8D0D78405L ^ l4)), PlayerESP.b("g", (int)4553, (long)(0x64D78AF499E72ED8L ^ l4))});
        this.Z = StringPropertyInvoker.b(asp_2.a((String)((Object)PlayerESP.b("g", (int)9743, (long)(0x1626055EA29B990EL ^ l4)))), new String[]{PlayerESP.b("g", (int)5386, (long)(0x6F0F83D9F5722A12L ^ l4)), PlayerESP.b("g", (int)5280, (long)(0x651E309FD4CEABAFL ^ l4))});
        this.O = StringPropertyInvoker.b(asp_2.a((String)((Object)PlayerESP.b("g", (int)2508, (long)(0x61D16B752D3036C2L ^ l4)))), new String[]{PlayerESP.b("g", (int)15448, (long)(0x79FBBEE0B800037AL ^ l4)), PlayerESP.b("g", (int)21924, (long)(0x57586C5EBB8EAB4L ^ l4)), PlayerESP.b("g", (int)8097, (long)(0x3FD3DCD1D5D2A088L ^ l4))});
        this.ah = StringPropertyInvoker.b(asp_2.a((String)((Object)PlayerESP.b("g", (int)28714, (long)(0x31E3F40AE0B5CF39L ^ l4)))), new String[]{PlayerESP.b("g", (int)25347, (long)(0x24B3C0F88B1CDC26L ^ l4)), PlayerESP.b("g", (int)23462, (long)(0x7F5685F8EC1E6495L ^ l4))});
        this.ag = StringPropertyInvoker.b(asp_2.a((String)((Object)PlayerESP.b("g", (int)18295, (long)(0xDA0C19D8DCF86AL ^ l4)))), new String[]{PlayerESP.b("g", (int)18295, (long)(0xDA0C19D8DCF86AL ^ l4)), PlayerESP.b("g", (int)15138, (long)(0x72B857B8D0D78405L ^ l4)), PlayerESP.b("g", (int)640, (long)(0x4FCDAE90434F3DB5L ^ l4))});
        this.Q = asp_2.c();
        this.ad = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(100)), P8.d(0)), P8.d(255));
        this.U = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(150)), P8.d(50)), P8.d(255));
        this.T = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(0.6)), db_0.a(0.6)), db_0.a(2.0));
        this.R = StringPropertyInvoker.b(asp_2.a((String)((Object)PlayerESP.b("g", (int)29706, (long)(0x58F62E6E9877CB09L ^ l4)))), new String[]{PlayerESP.b("g", (int)20898, (long)(0x6EB23202566A6E98L ^ l4)), PlayerESP.b("g", (int)17514, (long)(0x2092B64D917F7B5DL ^ l4))});
        this.ak = awu_1.f(this.mc.gameSettings);
        ManagerInvoker.put(new Setting((String)((Object)PlayerESP.b("g", (int)8702, (long)(0x8E1385C5EF99EE5L ^ l4))), (String)((Object)PlayerESP.b("g", (int)17154, (long)(0x70013AF2444C7C3EL ^ l4))), SettingType.SELECTBOX, (AbstractModule)this, this.ab));
        ManagerInvoker.put(new Setting((String)((Object)PlayerESP.b("g", (int)8956, (long)(0x534EAC9531739DC3L ^ l4))), (String)((Object)PlayerESP.b("g", (int)25222, (long)(0x64EFB5D56F76DDB0L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.R, this::lambda$new$0));
        ManagerInvoker.put(new Setting((String)((Object)PlayerESP.b("g", (int)18435, (long)(0x46F3C172AE6FF70FL ^ l4))), (String)((Object)PlayerESP.b("g", (int)16009, (long)(0x242B2A1CF7881A8L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.U, 5.0, this::lambda$new$1));
        ManagerInvoker.put(new Setting((String)((Object)PlayerESP.b("g", (int)5749, (long)(0x3E03C9218F3E295EL ^ l4))), (String)((Object)PlayerESP.b("g", (int)4228, (long)(0x7040A3AFAACD2F86L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.T, 0.1, this::lambda$new$2));
        ManagerInvoker.put(new Setting((String)((Object)PlayerESP.b("g", (int)25087, (long)(0x2D702E43D1045EEAL ^ l4))), (String)((Object)PlayerESP.b("g", (int)8823, (long)(0x405DC55D5CA11D49L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.O, this::lambda$new$3));
        ManagerInvoker.put(new Setting((String)((Object)PlayerESP.b("g", (int)11929, (long)(0x662189EB5F5091A2L ^ l4))), (String)((Object)PlayerESP.b("g", (int)5332, (long)(0x74595613F478ABD4L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.ah, this::lambda$new$4));
        ManagerInvoker.put(new Setting((String)((Object)PlayerESP.b("g", (int)31125, (long)(0x46C670D168CC46B6L ^ l4))), (String)((Object)PlayerESP.b("g", (int)17217, (long)(0x379CEEEF52EA7C6BL ^ l4))), SettingType.COLOR_PICKER, (AbstractModule)this, this.W, null, this::lambda$new$5));
        ManagerInvoker.put(new Setting((String)((Object)PlayerESP.b("g", (int)10608, (long)(0x730831EF89DC1664L ^ l4))), (String)((Object)PlayerESP.b("g", (int)20855, (long)(0x1DE741A57E3B6E71L ^ l4))), SettingType.COLOR_PICKER, (AbstractModule)this, this.aj, null, this::lambda$new$6));
        ManagerInvoker.put(new Setting((String)((Object)PlayerESP.b("g", (int)11929, (long)(0x662189EB5F5091A2L ^ l4))), (String)((Object)PlayerESP.b("g", (int)3732, (long)(0x5E52D596F961B1B8L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.V, this::lambda$new$7));
        ManagerInvoker.put(new Setting((String)((Object)PlayerESP.b("g", (int)11929, (long)(0x662189EB5F5091A2L ^ l4))), (String)((Object)PlayerESP.b("g", (int)6513, (long)(0x53CB89312063A640L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.Z, this::lambda$new$8));
        ManagerInvoker.put(new Setting((String)((Object)PlayerESP.b("g", (int)32565, (long)(0x4F0F42775E37402AL ^ l4))), (String)((Object)PlayerESP.b("g", (int)29419, (long)(0x4990FC16A1984DF2L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.I, this::lambda$new$9));
        ManagerInvoker.put(new Setting((String)((Object)PlayerESP.b("g", (int)31460, (long)(0x632B1879944945EFL ^ l4))), (String)((Object)PlayerESP.b("g", (int)18415, (long)(0x6AA67C7E3CFC78D7L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.M, this::lambda$new$10));
        ManagerInvoker.put(new Setting((String)((Object)PlayerESP.b("g", (int)13070, (long)(0x67E4AC2A83C68C18L ^ l4))), (String)((Object)PlayerESP.b("g", (int)23262, (long)(0x64F294ED0B6465D4L ^ l4))), SettingType.COLOR_PICKER, (AbstractModule)this, this.aa, null, this::lambda$new$11));
        ManagerInvoker.put(new Setting((String)((Object)PlayerESP.b("g", (int)8222, (long)(0x6261899992009F33L ^ l4))), (String)((Object)PlayerESP.b("g", (int)22407, (long)(0x6EBFE3A582F6E8BAL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.Q));
        ManagerInvoker.put(new Setting((String)((Object)PlayerESP.b("g", (int)15736, (long)(0x360C63F41F2C0257L ^ l4))), (String)((Object)PlayerESP.b("g", (int)14665, (long)(0x7B98ACA0BF398653L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.P, this::lambda$new$12));
        ManagerInvoker.put(new Setting((String)((Object)PlayerESP.b("g", (int)21256, (long)(0x6CF16BDAA4636C0DL ^ l4))), (String)((Object)PlayerESP.b("g", (int)20601, (long)(0x4B69F50262ADEF51L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.ad, 5.0, this::lambda$new$13));
        ManagerInvoker.put(new Setting((String)((Object)PlayerESP.b("g", (int)3893, (long)(0x334543FF717B007L ^ l4))), (String)((Object)PlayerESP.b("g", (int)11474, (long)(0x4938B141CE8993DBL ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.ag, this::lambda$new$14));
        ManagerInvoker.put(new Setting((String)((Object)PlayerESP.b("g", (int)12180, (long)(0x4413C02CCDBE10B2L ^ l4))), (String)((Object)PlayerESP.b("g", (int)350, (long)(0x7621C33711D83E49L ^ l4))), SettingType.COLOR_PICKER, (AbstractModule)this, this.H, null, this::lambda$new$15));
        ListInvoker.b(new ListInvoker[2]);
    }

    private Boolean lambda$new$5() {
        HUD.j();
        return auk_2.b(ListInvoker.contains((List)ava_0.a(this.ab), yi_2.al) && ((String)StringPropertyInvoker.b(this.ah)).equals(yi_2.R));
    }

    @EventTarget
    public void a(Render3DEvent render3DEvent) {
        HUD.j();
        GL11.glPushMatrix();
        if (ava_0.b(this.ab, yi_2.ak)) {
            this.b(render3DEvent);
        }
        if (ListInvoker.contains((List)ava_0.a(this.ab), yi_2.L)) {
            this.c(true);
            GL11.glEnable((int)2903);
            GL11.glDisable((int)2848);
            aS0.a(uo_1.a(this.K), this::b);
            WeakHashMap<EntityPlayer, float[][]> weakHashMap = this.K;
            BlockInvoker.s(this.mc.world);
            Object[] objectArray = aS0.a(MapInvoker.c(weakHashMap));
            int cfr_ignored_0 = objectArray.length;
            Object[] objectArray2 = objectArray;
            int n = objectArray2.length;
            int n2 = 0;
            if (n2 < n) {
                Object object = objectArray2[n2];
                EntityPlayer entityPlayer = (EntityPlayer)object;
                float[][] cfr_ignored_1 = (float[][])MapInvoker.c(weakHashMap, entityPlayer);
                if (a6w_0.r(entityPlayer) != -1488 && a6w_0.c(entityPlayer) && a1V.a((Entity)entityPlayer) && !entityPlayer.isDead && entityPlayer != this.mc.player && !a6w_0.v(entityPlayer)) {
                    if (a6w_0.i(entityPlayer)) {
                        // empty if block
                    }
                    GL11.glPushMatrix();
                    float[][] fArray = (float[][])MapInvoker.c(weakHashMap, entityPlayer);
                    GL11.glLineWidth((float)1.2f);
                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                    double d = PlayerESP.a(entityPlayer.posX, entityPlayer.lastTickPosX, a1j.a(render3DEvent)) - MCInvoker.j((Minecraft)this.mc).s;
                    double d2 = PlayerESP.a(entityPlayer.posY, entityPlayer.lastTickPosY, a1j.a(render3DEvent)) - MCInvoker.j((Minecraft)this.mc).h;
                    double d3 = PlayerESP.a(entityPlayer.posZ, entityPlayer.lastTickPosZ, a1j.a(render3DEvent)) - MCInvoker.j((Minecraft)this.mc).m;
                    GL11.glTranslated((double)d, (double)d2, (double)d3);
                    float f = entityPlayer.ay + (entityPlayer.aD - entityPlayer.ay) * this.mc.timer.renderPartialTicks;
                    GL11.glRotatef((float)(-f), (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glTranslated((double)0.0, (double)0.0, (double)(a6w_0.N(entityPlayer) ? -0.235 : 0.0));
                    float f2 = a6w_0.N(entityPlayer) ? 0.6f : 0.75f;
                    GL11.glPushMatrix();
                    GL11.glTranslated((double)-0.125, (double)f2, (double)0.0);
                    if (fArray[3][0] != 0.0f) {
                        GL11.glRotatef((float)(fArray[3][0] * 57.29578f), (float)1.0f, (float)0.0f, (float)0.0f);
                    }
                    if (fArray[3][1] != 0.0f) {
                        GL11.glRotatef((float)(fArray[3][1] * 57.29578f), (float)0.0f, (float)1.0f, (float)0.0f);
                    }
                    if (fArray[3][2] != 0.0f) {
                        GL11.glRotatef((float)(fArray[3][2] * 57.29578f), (float)0.0f, (float)0.0f, (float)1.0f);
                    }
                    GL11.glBegin((int)3);
                    GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                    GL11.glVertex3d((double)0.0, (double)(-f2), (double)0.0);
                    GL11.glEnd();
                    GL11.glPopMatrix();
                    GL11.glPushMatrix();
                    GL11.glTranslated((double)0.125, (double)f2, (double)0.0);
                    if (fArray[4][0] != 0.0f) {
                        GL11.glRotatef((float)(fArray[4][0] * 57.29578f), (float)1.0f, (float)0.0f, (float)0.0f);
                    }
                    if (fArray[4][1] != 0.0f) {
                        GL11.glRotatef((float)(fArray[4][1] * 57.29578f), (float)0.0f, (float)1.0f, (float)0.0f);
                    }
                    if (fArray[4][2] != 0.0f) {
                        GL11.glRotatef((float)(fArray[4][2] * 57.29578f), (float)0.0f, (float)0.0f, (float)1.0f);
                    }
                    GL11.glBegin((int)3);
                    GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                    GL11.glVertex3d((double)0.0, (double)(-f2), (double)0.0);
                    GL11.glEnd();
                    GL11.glPopMatrix();
                    GL11.glTranslated((double)0.0, (double)0.0, (double)(a6w_0.N(entityPlayer) ? 0.25 : 0.0));
                    GL11.glPushMatrix();
                    GL11.glTranslated((double)0.0, (double)(a6w_0.N(entityPlayer) ? -0.05 : 0.0), (double)(a6w_0.N(entityPlayer) ? -0.01725 : 0.0));
                    GL11.glPushMatrix();
                    GL11.glTranslated((double)-0.375, (double)((double)f2 + 0.55), (double)0.0);
                    if (fArray[1][0] != 0.0f) {
                        GL11.glRotatef((float)(fArray[1][0] * 57.29578f), (float)1.0f, (float)0.0f, (float)0.0f);
                    }
                    if (fArray[1][1] != 0.0f) {
                        GL11.glRotatef((float)(fArray[1][1] * 57.29578f), (float)0.0f, (float)1.0f, (float)0.0f);
                    }
                    if (fArray[1][2] != 0.0f) {
                        GL11.glRotatef((float)(-fArray[1][2] * 57.29578f), (float)0.0f, (float)0.0f, (float)1.0f);
                    }
                    GL11.glBegin((int)3);
                    GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                    GL11.glVertex3d((double)0.0, (double)-0.5, (double)0.0);
                    GL11.glEnd();
                    GL11.glPopMatrix();
                    GL11.glPushMatrix();
                    GL11.glTranslated((double)0.375, (double)((double)f2 + 0.55), (double)0.0);
                    if (fArray[2][0] != 0.0f) {
                        GL11.glRotatef((float)(fArray[2][0] * 57.29578f), (float)1.0f, (float)0.0f, (float)0.0f);
                    }
                    if (fArray[2][1] != 0.0f) {
                        GL11.glRotatef((float)(fArray[2][1] * 57.29578f), (float)0.0f, (float)1.0f, (float)0.0f);
                    }
                    if (fArray[2][2] != 0.0f) {
                        GL11.glRotatef((float)(-fArray[2][2] * 57.29578f), (float)0.0f, (float)0.0f, (float)1.0f);
                    }
                    GL11.glBegin((int)3);
                    GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                    GL11.glVertex3d((double)0.0, (double)-0.5, (double)0.0);
                    GL11.glEnd();
                    GL11.glPopMatrix();
                    GL11.glRotatef((float)(f - entityPlayer.aP), (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glPushMatrix();
                    GL11.glTranslated((double)0.0, (double)((double)f2 + 0.55), (double)0.0);
                    if (fArray[0][0] != 0.0f) {
                        GL11.glRotatef((float)(fArray[0][0] * 57.29578f), (float)1.0f, (float)0.0f, (float)0.0f);
                    }
                    GL11.glBegin((int)3);
                    GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                    GL11.glVertex3d((double)0.0, (double)0.3, (double)0.0);
                    GL11.glEnd();
                    GL11.glPopMatrix();
                    GL11.glPopMatrix();
                    GL11.glRotatef((float)(a6w_0.N(entityPlayer) ? 25.0f : 0.0f), (float)1.0f, (float)0.0f, (float)0.0f);
                    GL11.glTranslated((double)0.0, (double)(a6w_0.N(entityPlayer) ? -0.16175 : 0.0), (double)(a6w_0.N(entityPlayer) ? -0.48025 : 0.0));
                    GL11.glPushMatrix();
                    GL11.glTranslated((double)0.0, (double)f2, (double)0.0);
                    GL11.glBegin((int)3);
                    GL11.glVertex3d((double)-0.125, (double)0.0, (double)0.0);
                    GL11.glVertex3d((double)0.125, (double)0.0, (double)0.0);
                    GL11.glEnd();
                    GL11.glPopMatrix();
                    GL11.glPushMatrix();
                    GL11.glTranslated((double)0.0, (double)f2, (double)0.0);
                    GL11.glBegin((int)3);
                    GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                    GL11.glVertex3d((double)0.0, (double)0.55, (double)0.0);
                    GL11.glEnd();
                    GL11.glPopMatrix();
                    GL11.glPushMatrix();
                    GL11.glTranslated((double)0.0, (double)((double)f2 + 0.55), (double)0.0);
                    GL11.glBegin((int)3);
                    GL11.glVertex3d((double)-0.375, (double)0.0, (double)0.0);
                    GL11.glVertex3d((double)0.375, (double)0.0, (double)0.0);
                    GL11.glEnd();
                    GL11.glPopMatrix();
                    GL11.glPopMatrix();
                }
                ++n2;
            }
            this.c(false);
        }
        GL11.glPopMatrix();
    }

    private Boolean lambda$new$1() {
        return auk_2.b(ava_0.b(this.ab, yi_2.K));
    }

    private int b() {
        HUD.j();
        return StringPropertyInvoker.isMode(this.R, yi_2.u) ? adj_1.a(ob_0.a, 25).b() : this.mc.fontRendererCrack.h();
    }

    private Boolean lambda$new$14() {
        return auk_2.b(ListInvoker.contains((List)ava_0.a(this.ab), yi_2.E));
    }

    private Boolean lambda$new$4() {
        return auk_2.b(ListInvoker.contains((List)ava_0.a(this.ab), yi_2.X));
    }

    private Boolean lambda$new$7() {
        return auk_2.b(ListInvoker.contains((List)ava_0.a(this.ab), yi_2.r));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(PlayerESP.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


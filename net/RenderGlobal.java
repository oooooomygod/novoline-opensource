/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonSyntaxException
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.vector.Matrix4f
 *  org.lwjgl.util.vector.Vector3f
 *  org.lwjgl.util.vector.Vector4f
 */
package net;

import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.EntityRendererInvoker;
import cc.novoline.invoke.FramebufferInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.KeyboardInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.NBTInvoker;
import cc.novoline.invoke.ObjectMouseOverInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.ProfilerInvoker;
import cc.novoline.invoke.SoundHandlerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import com.google.gson.JsonSyntaxException;
import deobf.*;
import deobf.BlockRendererDispatcher;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Chunk;
import net.minecraft.crash.CrashReportCategory;
import deobf.DefaultVertexFormats;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.EntityPlayerSP;
import deobf.FontRenderer;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.renderer.chunk.RenderChunk;
import net.minecraft.util.ReportedException;
import deobf.Tessellator;
import net.minecraft.renderer.texture.TextureMap;
import deobf.TileEntity;
import deobf.Vec3;
import net.minecraft.multiplayer.WorldClient;
import net.minecraft.renderer.WorldRenderer;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;


public class RenderGlobal
implements IWorldAccess,
IResourceManagerReloadListener {
    public s_0 av;
    public Set<RenderChunk> f;
    private double ab;
    private WorldClient x;
    private List<_y_0> ah;
    private int b;
    private KM[] c;
    private static ResourceLocation W;
    public Set<RenderChunk> k;
    private static Logger am;
    private Deque<_y_0> au;
    public static String[] Y;
    private VertexFormat R;
    public Map<Integer, aaa_2> as;
    public Entity j;
    private List<_y_0> E;
    private aH5 H;
    private List<_y_0> ai;
    private int B;
    private aza_2 e;
    private int g = -1;
    private int ao = -1;
    private static ResourceLocation L;
    private List<_y_0> ag;
    public static boolean y;
    public boolean F = true;
    private int ae = 0;
    private EU J;
    private Framebuffer m;
    private TextureManager v;
    private int N;
    private int C;
    private static ResourceLocation I;
    private int T;
    private int S = -1;
    private l p;
    private List<_y_0> z;
    private int P = 2;
    private int i = 0;
    private double ar;
    private static Set<EnumFacing> ak;
    private double at;
    private double u;
    private pa_0 t;
    private static ResourceLocation aa;
    private int aj = -1;
    private double d;
    private aH5 o;
    private RenderManager r;
    private double Z;
    private List<_y_0> l;
    private Set ap;
    private Vector4f[] ad;
    private List<_y_0> al;
    private List<_y_0> D;
    public Minecraft q;
    private boolean U = false;
    private List<_y_0> Q;
    private Map<BlockPos, akm_0> af;
    private double ac;
    a2J M;
    private boolean O;
    private static ResourceLocation G;
    private qr_2 s;
    private double n;
    private double h;
    private double a;
    private Set<RenderChunk> w = axe_2.b();
    private int V;
    private aGC K;
    private double aq;
    private int A;
    private int an;
    private aH5 X;

    private void g() {
        GlStateManagerInvoker.C();
        GlStateManagerInvoker.a(0.0f, 0.0f);
        GlStateManagerInvoker.r();
        GlStateManagerInvoker.enableAlpha();
        GlStateManagerInvoker.c(true);
        GlStateManagerInvoker.popMatrix();
        if (ys_2.aC()) {
            axw_2.g();
        }
    }

    @Override
    public void a(Entity entity) {
        if (ys_2.I()) {
            xh_1.b(entity, this);
        }
    }

    public void b(float f, int n) {
        if (ayy_0.d(ail_0.cR)) {
            a9K a9K2 = this.q.world.d;
            Object object = aDb.f(a9K2, ail_0.cR, new Object[0]);
            aDb.b(object, ail_0.cu, new Object[]{axx_1.a(f), this.x, this.q});
            return;
        }
        if (qq_2.j(this.q.world.d) == 1) {
            this.v();
        } else if (qq_2.d(this.q.world.d)) {
            float f2;
            GlStateManagerInvoker.disableTexture2D();
            boolean bl = ys_2.aC();
            a3c_0.b();
            Vec3 vec3 = BlockInvoker.a(this.x, MCInvoker.v(this.q), f);
            vec3 = ajT.a(vec3, (IBlockAccess)this.q.world, MCInvoker.v((Minecraft)this.q).posX, MCInvoker.v((Minecraft)this.q).posY + 1.0, MCInvoker.v((Minecraft)this.q).posZ);
            a3c_0.a(vec3);
            float f3 = (float)vec3.xCoord;
            float f4 = (float)vec3.yCoord;
            float f5 = (float)vec3.zCoord;
            if (n != 2) {
                float f6 = (f3 * 30.0f + f4 * 59.0f + f5 * 11.0f) / 100.0f;
                float f7 = (f3 * 30.0f + f4 * 70.0f) / 100.0f;
                float f8 = (f3 * 30.0f + f5 * 70.0f) / 100.0f;
                f3 = f6;
                f4 = f7;
                f5 = f8;
            }
            GlStateManagerInvoker.b(f3, f4, f5);
            Tessellator tessellator = TessellatorInvoker.getInstance();
            WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
            GlStateManagerInvoker.c(false);
            GlStateManagerInvoker.z();
            a3c_0.i();
            GlStateManagerInvoker.b(f3, f4, f5);
            a3c_0.C();
            if (ys_2.Z()) {
                if (this.O) {
                    dg_1.a(this.H);
                    GL11.glEnableClientState((int)32884);
                    GL11.glVertexPointer((int)3, (int)5126, (int)12, (long)0L);
                    dg_1.a(this.H, 7);
                    dg_1.c(this.H);
                    GL11.glDisableClientState((int)32884);
                } else {
                    GlStateManagerInvoker.i(this.S);
                }
            }
            GlStateManagerInvoker.disableFog();
            a3c_0.aa();
            GlStateManagerInvoker.C();
            GlStateManagerInvoker.enableBlend();
            GlStateManagerInvoker.b(770, 771, 1, 0);
            ne_0.e();
            float[] fArray = qq_2.b(this.x.d, BlockInvoker.d(this.x, f), f);
            if (ys_2.aS()) {
                float f9;
                float f10;
                GlStateManagerInvoker.disableTexture2D();
                a3c_0.b();
                GlStateManagerInvoker.shadeModel(7425);
                GlStateManagerInvoker.pushMatrix();
                GlStateManagerInvoker.b(90.0f, 1.0f, 0.0f, 0.0f);
                GlStateManagerInvoker.b(MathHelper.sin(BlockInvoker.a(this.x, f)) < 0.0f ? 180.0f : 0.0f, 0.0f, 0.0f, 1.0f);
                GlStateManagerInvoker.b(90.0f, 0.0f, 0.0f, 1.0f);
                float f11 = fArray[0];
                float f12 = fArray[1];
                float f13 = fArray[2];
                if (n != 2) {
                    float f14 = (f11 * 30.0f + f12 * 59.0f + f13 * 11.0f) / 100.0f;
                    f10 = (f11 * 30.0f + f12 * 70.0f) / 100.0f;
                    f9 = (f11 * 30.0f + f13 * 70.0f) / 100.0f;
                    f11 = f14;
                    f12 = f10;
                    f13 = f9;
                }
                WorldRendererInvoker.begin(worldRenderer, 6, DefaultVertexFormats.d);
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, 0.0, 100.0, 0.0), f11, f12, f13, fArray[3]));
                int n2 = 0;
                while (true) {
                    f10 = (float)n2 * (float)Math.PI * 2.0f / 16.0f;
                    f9 = MathHelper.sin(f10);
                    float f15 = MathHelper.cos(f10);
                    WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, f9 * 120.0f, f15 * 120.0f, -f15 * 40.0f * fArray[3]), fArray[0], fArray[1], fArray[2], 0.0f));
                    ++n2;
                }
            }
            GlStateManagerInvoker.enableTexture2D();
            a3c_0.Z();
            GlStateManagerInvoker.b(770, 1, 1, 0);
            GlStateManagerInvoker.pushMatrix();
            float f16 = 1.0f - BlockInvoker.i(this.x, f);
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, f16);
            GlStateManagerInvoker.b(-90.0f, 0.0f, 1.0f, 0.0f);
            kt_1.a(this.x, this.v, BlockInvoker.d(this.x, f), f16);
            a3c_0.H();
            GlStateManagerInvoker.b(BlockInvoker.d(this.x, f) * 360.0f, 1.0f, 0.0f, 0.0f);
            a3c_0.s();
            float f17 = 30.0f;
            if (ys_2.A()) {
                TextureManagerInvoker.bindTexture(this.v, I);
                WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
                WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, -f17, 100.0, -f17), 0.0, 0.0));
                WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f17, 100.0, -f17), 1.0, 0.0));
                WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f17, 100.0, f17), 1.0, 1.0));
                WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, -f17, 100.0, f17), 0.0, 1.0));
                TessellatorInvoker.draw(tessellator);
            }
            f17 = 20.0f;
            if (ys_2.as()) {
                TextureManagerInvoker.bindTexture(this.v, W);
                int n3 = BlockInvoker.g(this.x);
                int n4 = n3 % 4;
                int n5 = n3 / 4 % 2;
                f2 = (float)n4 / 4.0f;
                float f18 = (float)n5 / 2.0f;
                float f19 = (float)(n4 + 1) / 4.0f;
                float f20 = (float)(n5 + 1) / 2.0f;
                WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
                WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, -f17, -100.0, f17), f19, f20));
                WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f17, -100.0, f17), f2, f20));
                WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f17, -100.0, -f17), f2, f18));
                WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, -f17, -100.0, -f17), f19, f18));
                TessellatorInvoker.draw(tessellator);
            }
            GlStateManagerInvoker.disableTexture2D();
            a3c_0.b();
            float f21 = BlockInvoker.b(this.x, f) * f16;
            if (f21 > 0.0f && ys_2.X() && !kt_1.a(this.x)) {
                GlStateManagerInvoker.color(f21, f21, f21, f21);
                if (this.O) {
                    dg_1.a(this.X);
                    GL11.glEnableClientState((int)32884);
                    GL11.glVertexPointer((int)3, (int)5126, (int)12, (long)0L);
                    dg_1.a(this.X, 7);
                    dg_1.c(this.X);
                    GL11.glDisableClientState((int)32884);
                } else {
                    GlStateManagerInvoker.i(this.g);
                }
            }
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManagerInvoker.disableBlend();
            GlStateManagerInvoker.enableAlpha();
            GlStateManagerInvoker.z();
            a3c_0.i();
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.disableTexture2D();
            a3c_0.b();
            GlStateManagerInvoker.b(0.0f, 0.0f, 0.0f);
            double d = PlayerInvoker.e((EntityPlayerSP)this.q.player, (float)f).yCoord - BlockInvoker.u(this.x);
            if (d < 0.0) {
                GlStateManagerInvoker.pushMatrix();
                GlStateManagerInvoker.translate(0.0f, 12.0f, 0.0f);
                if (this.O) {
                    dg_1.a(this.o);
                    GL11.glEnableClientState((int)32884);
                    GL11.glVertexPointer((int)3, (int)5126, (int)12, (long)0L);
                    dg_1.a(this.o, 7);
                    dg_1.c(this.o);
                    GL11.glDisableClientState((int)32884);
                } else {
                    GlStateManagerInvoker.i(this.ao);
                }
                GlStateManagerInvoker.popMatrix();
                f2 = -((float)(d + 65.0));
                WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.d);
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, -1.0, f2, 1.0), 0, 0, 0, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, 1.0, f2, 1.0), 0, 0, 0, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, 1.0, -1.0, 1.0), 0, 0, 0, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, -1.0, -1.0, 1.0), 0, 0, 0, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, -1.0, -1.0, -1.0), 0, 0, 0, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, 1.0, -1.0, -1.0), 0, 0, 0, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, 1.0, f2, -1.0), 0, 0, 0, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, -1.0, f2, -1.0), 0, 0, 0, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, 1.0, -1.0, -1.0), 0, 0, 0, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, 1.0, -1.0, 1.0), 0, 0, 0, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, 1.0, f2, 1.0), 0, 0, 0, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, 1.0, f2, -1.0), 0, 0, 0, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, -1.0, f2, -1.0), 0, 0, 0, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, -1.0, f2, 1.0), 0, 0, 0, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, -1.0, -1.0, 1.0), 0, 0, 0, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, -1.0, -1.0, -1.0), 0, 0, 0, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, -1.0, -1.0, -1.0), 0, 0, 0, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, -1.0, -1.0, 1.0), 0, 0, 0, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, 1.0, -1.0, 1.0), 0, 0, 0, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, 1.0, -1.0, -1.0), 0, 0, 0, 255));
                TessellatorInvoker.draw(tessellator);
            }
            if (qq_2.k(this.x.d)) {
                GlStateManagerInvoker.b(f3 * 0.2f + 0.04f, f4 * 0.2f + 0.04f, f5 * 0.6f + 0.1f);
            } else {
                GlStateManagerInvoker.b(f3, f4, f5);
            }
            if (this.q.gameSettings.bp <= 4) {
                GlStateManagerInvoker.b(this.q.entityRenderer.ai, this.q.entityRenderer.ad, this.q.entityRenderer.P);
            }
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.translate(0.0f, -((float)(d - 16.0)), 0.0f);
            if (ys_2.Z()) {
                GlStateManagerInvoker.i(this.ao);
            }
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.enableTexture2D();
            a3c_0.Z();
            GlStateManagerInvoker.c(true);
        }
    }

    @Override
    public void a(BlockPos blockPos) {
        int n = amv_2.j(blockPos);
        int n2 = amv_2.h(blockPos);
        int n3 = amv_2.i(blockPos);
        this.b(n - 1, n2 - 1, n3 - 1, n + 1, n2 + 1, n3 + 1);
    }

    private RenderChunk a(BlockPos blockPos, RenderChunk renderChunk, EnumFacing enumFacing) {
        BlockPos blockPos2 = afq_2.b(renderChunk, enumFacing);
        if (amv_2.h(blockPos2) >= 0 && amv_2.h(blockPos2) < 256) {
            int n;
            int n2 = MathHelper.a(amv_2.j(blockPos) - amv_2.j(blockPos2));
            int n3 = MathHelper.a(amv_2.i(blockPos) - amv_2.i(blockPos2));
            if (ys_2.aH() ? n2 > this.ae || n3 > this.ae : (n = n2 * n2 + n3 * n3) > this.i) {
                return null;
            }
            return this.av.a(blockPos2);
        }
        return null;
    }

    @Override
    public void a(String string, double d, double d2, double d3, float f, float f2) {
    }

    protected boolean j() {
        return false;
    }

    public int s() {
        return this.T;
    }

    private mi_1 a(int n, boolean bl, double d, double d2, double d3, double d4, double d5, double d6, int ... nArray) {
        if (this.q != null && MCInvoker.v(this.q) != null && this.q.effectRenderer != null) {
            int n2 = this.q.gameSettings.br;
            if (n2 == 1 && a5_0.a(this.x.o, 3) == 0) {
                n2 = 2;
            }
            double cfr_ignored_0 = MCInvoker.v((Minecraft)this.q).posX - d;
            double cfr_ignored_1 = MCInvoker.v((Minecraft)this.q).posY - d2;
            double cfr_ignored_2 = MCInvoker.v((Minecraft)this.q).posZ - d3;
            if (n == aYK.d(B7.EXPLOSION_HUGE) && !ys_2.aw()) {
                return null;
            }
            if (n == aYK.d(B7.EXPLOSION_LARGE) && !ys_2.aw()) {
                return null;
            }
            if (n == aYK.d(B7.EXPLOSION_NORMAL) && !ys_2.aw()) {
                return null;
            }
            if (n == aYK.d(B7.SUSPENDED) && !ys_2.ao()) {
                return null;
            }
            if (n == aYK.d(B7.SUSPENDED_DEPTH) && !ys_2.aD()) {
                return null;
            }
            if (n == aYK.d(B7.SMOKE_NORMAL) && !ys_2.o()) {
                return null;
            }
            if (n == aYK.d(B7.SMOKE_LARGE) && !ys_2.o()) {
                return null;
            }
            if (n == aYK.d(B7.SPELL_MOB) && !ys_2.aa()) {
                return null;
            }
            if (n == aYK.d(B7.SPELL_MOB_AMBIENT) && !ys_2.aa()) {
                return null;
            }
            if (n == aYK.d(B7.SPELL) && !ys_2.aa()) {
                return null;
            }
            if (n == aYK.d(B7.SPELL_INSTANT) && !ys_2.aa()) {
                return null;
            }
            if (n == aYK.d(B7.SPELL_WITCH) && !ys_2.aa()) {
                return null;
            }
            if (n == aYK.d(B7.PORTAL) && !ys_2.D()) {
                return null;
            }
            if (n == aYK.d(B7.FLAME) && !ys_2.aG()) {
                return null;
            }
            if (n == aYK.d(B7.REDSTONE) && !ys_2.E()) {
                return null;
            }
            if (n == aYK.d(B7.DRIP_WATER) && !ys_2.ak()) {
                return null;
            }
            if (n == aYK.d(B7.DRIP_LAVA) && !ys_2.ak()) {
                return null;
            }
            if (n == aYK.d(B7.FIREWORKS_SPARK) && !ys_2.ay()) {
                return null;
            }
            return ayx_2.a(this.q.effectRenderer, n, d, d2, d3, d4, d5, d6, nArray);
        }
        return null;
    }

    public void a(WorldClient worldClient) {
        if (this.x != null) {
            BlockInvoker.a(this.x, this);
        }
        this.ar = Double.MIN_VALUE;
        this.u = Double.MIN_VALUE;
        this.d = Double.MIN_VALUE;
        this.N = Integer.MIN_VALUE;
        this.an = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
        FT.a(this.r, worldClient);
        this.x = worldClient;
        if (ys_2.I()) {
            xh_1.b();
        }
        BlockInvoker.b(worldClient, this);
        this.n();
    }

    public void p() {
        this.F = true;
    }

    public int b() {
        return ListInvoker.size(this.al);
    }

    public void i() {
        c9.d(this.e);
    }

    private void f() {
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        if (this.X != null) {
            dg_1.b(this.X);
        }
        if (this.g >= 0) {
            N4.c(this.g);
            this.g = -1;
        }
        if (this.O) {
            this.X = new aH5(this.R);
            this.a(worldRenderer);
            WorldRendererInvoker.a(worldRenderer);
            WorldRendererInvoker.b(worldRenderer);
            dg_1.a(this.X, WorldRendererInvoker.l(worldRenderer));
        } else {
            this.g = N4.b(1);
            GlStateManagerInvoker.pushMatrix();
            GL11.glNewList((int)this.g, (int)4864);
            this.a(worldRenderer);
            TessellatorInvoker.draw(tessellator);
            GL11.glEndList();
            GlStateManagerInvoker.popMatrix();
        }
    }

    protected void w() {
        aS0.e(this.w);
        this.p.b();
    }

    private void a(WorldRenderer worldRenderer, float f, boolean bl) {
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.k);
        int n = -384;
        int n2 = -384;
        while (true) {
            float f2 = n;
            float f3 = n + 64;
            f3 = n;
            f2 = n + 64;
            WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, f2, f, n2));
            WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, f3, f, n2));
            WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, f3, f, n2 + 64));
            WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, f2, f, n2 + 64));
            n2 += 64;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void n() {
        if (this.x != null) {
            this.F = true;
            aa1_0.a(Blocks.bP, ys_2.al());
            aa1_0.a(Blocks.bM, ys_2.al());
            mq_1.a();
            if (ys_2.I()) {
                xh_1.b();
            }
            this.aj = this.q.gameSettings.bp;
            this.ae = this.aj * 16;
            this.i = this.ae * this.ae;
            boolean bl = this.O;
            this.O = OpenGlHelper.f();
            if (!this.O) {
                this.J = new E4();
                this.M = new ack_1();
            } else if (this.O) {
                this.J = new E5();
                this.M = new aoy_0();
            }
            if (bl != this.O) {
                this.f();
                this.m();
                this.t();
            }
            if (this.av != null) {
                uk_2.a(this.av);
            }
            this.w();
            Object object = this.ap;
            synchronized (object) {
                aS0.e(this.ap);
            }
            this.av = new s_0(this.x, this.q.gameSettings.bp, this, this.M);
            if (this.x != null) {
                object = MCInvoker.v(this.q);
                uk_2.a(this.av, ((Entity)object).posX, ((Entity)object).posZ);
            }
            this.P = 2;
        }
    }

    public boolean a(double d, double d2, double d3, float f) {
        return false;
    }

    private void a(a5w_0 a5w_02) {
        EntityRendererInvoker.j(this.q.entityRenderer);
        if (OpenGlHelper.f()) {
            GL11.glEnableClientState((int)32884);
            OpenGlHelper.g(apl_1.S);
            GL11.glEnableClientState((int)32888);
            OpenGlHelper.g(apl_1.ab);
            GL11.glEnableClientState((int)32888);
            OpenGlHelper.g(apl_1.S);
            GL11.glEnableClientState((int)32886);
        }
        if (ys_2.aC()) {
            axw_2.a(a5w_02);
        }
        aE4.a(this.J, a5w_02);
        if (ys_2.aC()) {
            axw_2.b(a5w_02);
        }
        if (OpenGlHelper.f()) {
            Iterator iterator = ListInvoker.iterator(zv_2.g(DefaultVertexFormats.g));
            while (dz_0.c(iterator)) {
                VertexFormatElement asw_02 = (VertexFormatElement)dz_0.b(iterator);
                aPX aPX2 = ev_0.b(asw_02);
                int n = ev_0.a(asw_02);
                switch (aZH.a[aPX2.ordinal()]) {
                    case 1: {
                        GL11.glDisableClientState((int)32884);
                        break;
                    }
                    case 2: {
                        OpenGlHelper.g(apl_1.S + n);
                        GL11.glDisableClientState((int)32888);
                        OpenGlHelper.g(apl_1.S);
                        break;
                    }
                    case 3: {
                        GL11.glDisableClientState((int)32886);
                        GlStateManagerInvoker.e();
                    }
                }
            }
        }
        EntityRendererInvoker.i(this.q.entityRenderer);
    }

    @Override
    public void b(aI_ aI_2) {
        this.l();
    }

    private void l() {
        TextureMap textureMap = MCInvoker.f(this.q);
        for (int i = 0; i < this.c.length; ++i) {
            this.c[i] = h9.b(textureMap, aL0.c(aL0.a(new StringBuilder(), ani_1.e), i).toString());
        }
    }

    private void v() {
        if (ys_2.Z()) {
            GlStateManagerInvoker.disableFog();
            GlStateManagerInvoker.C();
            GlStateManagerInvoker.enableBlend();
            GlStateManagerInvoker.b(770, 771, 1, 0);
            ne_0.e();
            GlStateManagerInvoker.c(false);
            TextureManagerInvoker.bindTexture(this.v, G);
            Tessellator tessellator = TessellatorInvoker.getInstance();
            WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
            int n = 0;
            while (true) {
                GlStateManagerInvoker.pushMatrix();
                WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.POSITION_TEX_COLOR);
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, -100.0, -100.0, -100.0), 0.0, 0.0), 40, 40, 40, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, -100.0, -100.0, 100.0), 0.0, 16.0), 40, 40, 40, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 100.0, -100.0, 100.0), 16.0, 16.0), 40, 40, 40, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 100.0, -100.0, -100.0), 16.0, 0.0), 40, 40, 40, 255));
                TessellatorInvoker.draw(tessellator);
                GlStateManagerInvoker.popMatrix();
                ++n;
            }
        }
    }

    private void b(int n, int n2, int n3, int n4, int n5, int n6) {
        this.av.a(n, n2, n3, n4, n5, n6);
    }

    public static void a(rm_2 rm_22, int n, int n2, int n3, int n4) {
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 3, DefaultVertexFormats.d);
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.f), n, n2, n3, n4));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.f), n, n2, n3, n4));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.d), n, n2, n3, n4));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.d), n, n2, n3, n4));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.f), n, n2, n3, n4));
        TessellatorInvoker.draw(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 3, DefaultVertexFormats.d);
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.f), n, n2, n3, n4));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.f), n, n2, n3, n4));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.d), n, n2, n3, n4));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.d), n, n2, n3, n4));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.f), n, n2, n3, n4));
        TessellatorInvoker.draw(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 1, DefaultVertexFormats.d);
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.f), n, n2, n3, n4));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.f), n, n2, n3, n4));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.f), n, n2, n3, n4));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.f), n, n2, n3, n4));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.d), n, n2, n3, n4));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.d), n, n2, n3, n4));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.d), n, n2, n3, n4));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.d), n, n2, n3, n4));
        TessellatorInvoker.draw(tessellator);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    @Override
    public void a(int n, BlockPos blockPos, int n2) {
        switch (n) {
            case 1013: 
            case 1018: {
                if (MCInvoker.v(this.q) == null) break;
                double d = (double)amv_2.j(blockPos) - MCInvoker.v((Minecraft)this.q).posX;
                double d2 = (double)amv_2.h(blockPos) - MCInvoker.v((Minecraft)this.q).posY;
                double d3 = (double)amv_2.i(blockPos) - MCInvoker.v((Minecraft)this.q).posZ;
                double d4 = MathInvoker.d(d * d + d2 * d2 + d3 * d3);
                double d5 = MCInvoker.v((Minecraft)this.q).posX;
                double d6 = MCInvoker.v((Minecraft)this.q).posY;
                double d7 = MCInvoker.v((Minecraft)this.q).posZ;
                if (d4 > 0.0) {
                    d5 += d / d4 * 2.0;
                    d6 += d2 / d4 * 2.0;
                    d7 += d3 / d4 * 2.0;
                }
                if (n == 1013) {
                    BlockInvoker.a(this.x, d5, d6, d7, ani_1.X, 1.0f, 1.0f, false);
                    break;
                }
                BlockInvoker.a(this.x, d5, d6, d7, ani_1.R, 5.0f, 1.0f, false);
            }
        }
    }

    @Override
    public void a(int n, int n2, int n3, int n4, int n5, int n6) {
        this.b(n - 1, n2 - 1, n3 - 1, n4 + 1, n5 + 1, n6 + 1);
    }

    static {
        am = LogManagerInvoker.c();
        W = new ResourceLocation(ani_1.c);
        I = new ResourceLocation(ani_1.h);
        aa = new ResourceLocation(ani_1.P);
        G = new ResourceLocation(ani_1.Y);
        L = new ResourceLocation(ani_1.b);
        Y = new String[2];
        ak = asg_0.a(new HashSet(a7r_0.a(EnumFacing.VALUES)));
    }

    public void a(int n, int n2) {
        if (apl_1.u && this.K != null) {
            ada_2.a(this.K, n, n2);
        }
    }

    public void h() {
        if (this.j()) {
            GlStateManagerInvoker.enableBlend();
            GlStateManagerInvoker.b(770, 771, 0, 1);
            FramebufferInvoker.a(this.m, this.q.displayWidth, this.q.displayHeight, false);
            GlStateManagerInvoker.disableBlend();
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive exception aggregation
     */
    public void a(Entity entity, ao7_0 ao7_02, float f) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        int n;
        block27: {
            Object object6;
            boolean bl;
            Object object7;
            int n2;
            n = 0;
            if (ayy_0.d(ail_0.c4)) {
                n = aDb.d(ail_0.c4, new Object[0]);
            }
            if (this.P > 0) {
                return;
            }
            double d = entity.prevPosX + (entity.posX - entity.prevPosX) * (double)f;
            double d2 = entity.prevPosY + (entity.posY - entity.prevPosY) * (double)f;
            double d3 = entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double)f;
            ProfilerInvoker.startSection(this.x.A, ani_1.U);
            aFR.a(hq_0.d, this.x, MCInvoker.E(this.q), this.q.fontRendererObj, MCInvoker.v(this.q), f);
            FT.a(this.r, this.x, this.q.fontRendererObj, MCInvoker.v(this.q), this.q.E, this.q.gameSettings, f);
            this.A = 0;
            this.T = 0;
            this.C = 0;
            this.V = 0;
            Entity entity2 = MCInvoker.v(this.q);
            double d4 = entity2.lastTickPosX + (entity2.posX - entity2.lastTickPosX) * (double)f;
            double d5 = entity2.lastTickPosY + (entity2.posY - entity2.lastTickPosY) * (double)f;
            double d6 = entity2.lastTickPosZ + (entity2.posZ - entity2.lastTickPosZ) * (double)f;
            hq_0.m = d4;
            hq_0.l = d5;
            hq_0.j = d6;
            FT.b(this.r, d4, d5, d6);
            EntityRendererInvoker.j(this.q.entityRenderer);
            ProfilerInvoker.a(this.x.A, ani_1.M);
            List list = BlockInvoker.e(this.x);
            this.A = ListInvoker.size(list);
            if (ys_2.aH() && this.q.entityRenderer.k) {
                GlStateManagerInvoker.disableFog();
            }
            ayy_0.d(ail_0.bj);
            ayy_0.d(ail_0.ct);
            for (n2 = 0; n2 < ListInvoker.size(BlockInvoker.c(this.x)); ++n2) {
                object7 = (Entity)ListInvoker.get(BlockInvoker.c(this.x), n2);
                if (!aDb.e(object7, ail_0.bj, new Object[]{P8.d(n)})) continue;
                ++this.T;
                if (!ayj_0.e((Entity)object7, d, d2, d3)) continue;
                FT.b(this.r, (Entity)object7, f);
            }
            if (this.j()) {
                GlStateManagerInvoker.depthFunc(519);
                GlStateManagerInvoker.disableFog();
                FramebufferInvoker.a(this.m);
                FramebufferInvoker.bindFramebuffer(this.m, false);
                ProfilerInvoker.a(this.x.A, ani_1.g);
                ne_0.e();
                FT.a(this.r, true);
                Iterator iterator = ListInvoker.iterator(list);
                while (dz_0.c(iterator)) {
                    boolean bl2;
                    object7 = (Entity)dz_0.b(iterator);
                    if (!aDb.e(object7, ail_0.bj, new Object[]{P8.d(n)})) continue;
                    bl = MCInvoker.v(this.q) instanceof EntityLivingBase && atn_0.p((EntityLivingBase)MCInvoker.v(this.q));
                    boolean bl3 = bl2 = ayj_0.e((Entity)object7, d, d2, d3) && (((Entity)object7).G || are_0.a(ao7_02, ayj_0.u((Entity)object7)) || ((Entity)object7).h == this.q.player);
                    if (object7 != MCInvoker.v(this.q) || awu_1.f(this.q.gameSettings) == 0) {
                        // empty if block
                    }
                    FT.b(this.r, (Entity)object7, f);
                }
                FT.a(this.r, false);
                ne_0.a();
                GlStateManagerInvoker.c(false);
                ada_2.a(this.K, f);
                GlStateManagerInvoker.D();
                GlStateManagerInvoker.c(true);
                FramebufferInvoker.bindFramebuffer(MCInvoker.c(this.q), false);
                GlStateManagerInvoker.z();
                GlStateManagerInvoker.enableBlend();
                GlStateManagerInvoker.enableColorMaterial();
                GlStateManagerInvoker.depthFunc(515);
                GlStateManagerInvoker.enableDepth();
                GlStateManagerInvoker.enableAlpha();
            }
            ProfilerInvoker.a(this.x.A, ani_1.Q);
            n2 = ys_2.aC() ? 1 : 0;
            a3c_0.L();
            object7 = ListInvoker.iterator(this.ai);
            bl = this.q.gameSettings.a4;
            this.q.gameSettings.a4 = ys_2.m();
            while (dz_0.c((Iterator)object7)) {
                _y_0 _y_02 = (_y_0)dz_0.b((Iterator)object7);
                object6 = BlockInvoker.b(this.x, afq_2.d(_y_02.b));
                object5 = aqp_2.s((Chunk)object6)[amv_2.h(afq_2.d(_y_02.b)) / 16];
                if (((AbstractCollection)object5).isEmpty()) continue;
                object4 = ave_1.a((qx_0)object5);
                while (dz_0.c((Iterator)object4)) {
                    boolean bl4;
                    object3 = (Entity)dz_0.b((Iterator)object4);
                    if (!aDb.e(object3, ail_0.bj, new Object[]{P8.d(n)})) continue;
                    boolean bl5 = bl4 = FT.a(this.r, (Entity)object3, ao7_02, d, d2, d3) || ((Entity)object3).h == this.q.player;
                    if (!(object3 instanceof oe_1)) continue;
                    a3c_0.a((Entity)object3);
                    FT.a(MCInvoker.j(this.q), (Entity)object3, f);
                }
            }
            this.q.gameSettings.a4 = bl;
            FontRenderer fontRenderer = aFR.a(hq_0.d);
            a3c_0.P();
            a3c_0.y();
            ProfilerInvoker.a(this.x.A, ani_1.A);
            ne_0.a();
            if (ayy_0.d(ail_0.bN)) {
                aDb.f(hq_0.d, ail_0.bN, new Object[0]);
            }
            object6 = ListInvoker.iterator(this.E);
            while (dz_0.c((Iterator)object6)) {
                object5 = dz_0.b((Iterator)object6);
                object4 = (_y_0)object5;
                object3 = azb_1.b(afq_2.e(((_y_0)object4).b));
                if (ListInvoker.isEmpty((List)object3)) continue;
                Iterator iterator = ListInvoker.iterator((List)object3);
                while (dz_0.c(iterator)) {
                    object2 = (TileEntity)dz_0.b(iterator);
                    Class<?> clazz = object2.getClass();
                    if (clazz == a6z_0.class && !tf_0.j) {
                        object = this.q.player;
                        double d7 = NBTInvoker.a((TileEntity)object2, ((EntityPlayer)object).posX, ((EntityPlayer)object).posY, ((EntityPlayer)object).posZ);
                        if (d7 > 256.0) {
                            fontRenderer.a = false;
                        }
                    }
                    a3c_0.a((TileEntity)object2);
                    aFR.a(hq_0.d, (TileEntity)object2, f, -1);
                    ++this.V;
                    fontRenderer.a = true;
                }
            }
            object6 = this.ap;
            object5 = this.ap;
            synchronized (object5) {
                object4 = aS0.f(this.ap);
                while (dz_0.c((Iterator)object4)) {
                    Class<?> clazz;
                    object3 = dz_0.b((Iterator)object4);
                    if (!aDb.e(object3, ail_0.ct, new Object[]{P8.d(n)}) || !are_0.a(ao7_02, (rm_2)((Object)(clazz = (rm_2)aDb.f(object3, ail_0.be, new Object[0]))))) continue;
                    clazz = object3.getClass();
                    if (clazz == a6z_0.class && !tf_0.j) {
                        object2 = this.q.player;
                        double d8 = NBTInvoker.a((TileEntity)object3, ((EntityPlayer)object2).posX, ((EntityPlayer)object2).posY, ((EntityPlayer)object2).posZ);
                        if (d8 > 256.0) {
                            fontRenderer.a = false;
                        }
                    }
                    a3c_0.a((TileEntity)object3);
                    aFR.a(hq_0.d, (TileEntity)object3, f, -1);
                    fontRenderer.a = true;
                }
                break block27;
                catch (Throwable throwable) {}
                {
                    throw throwable;
                }
            }
        }
        if (ayy_0.d(ail_0.bg)) {
            aDb.f(hq_0.d, ail_0.bg, new Object[]{P8.d(n)});
        }
        this.q();
        object5 = ms_0.a(this.as.values());
        while (dz_0.c((Iterator)object5)) {
            object4 = (aaa_2)dz_0.b((Iterator)object5);
            object3 = XX.c((aaa_2)object4);
            TileEntity tileEntity = BlockInvoker.e(this.x, (BlockPos)object3);
            if (tileEntity instanceof a6O) {
                object2 = (a6O)tileEntity;
                if (((a6O)object2).l != null) {
                    object3 = amv_2.a((BlockPos)object3, EnumFacing.WEST);
                    tileEntity = BlockInvoker.e(this.x, (BlockPos)object3);
                } else if (((a6O)object2).u != null) {
                    object3 = amv_2.a((BlockPos)object3, EnumFacing.NORTH);
                    tileEntity = BlockInvoker.e(this.x, (BlockPos)object3);
                }
            }
            object2 = BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.x, (BlockPos)object3));
            boolean bl = false;
            if (aDb.e(tileEntity, ail_0.ct, new Object[]{P8.d(n)}) && aDb.e(tileEntity, ail_0.cJ, new Object[0])) {
                object = (rm_2)aDb.f(tileEntity, ail_0.be, new Object[0]);
                bl = are_0.a(ao7_02, (rm_2)object);
            }
            a3c_0.a(tileEntity);
            aFR.a(hq_0.d, tileEntity, f, XX.b((aaa_2)object4));
        }
        this.g();
        EntityRendererInvoker.i(this.q.entityRenderer);
        ProfilerInvoker.endSection(this.q.mcProfiler);
    }

    private void a(float f, int n) {
        float f2;
        float f3;
        float f4;
        c9.a(this.e, true, this.B, f);
        f = 0.0f;
        GlStateManagerInvoker.A();
        float f5 = (float)(MCInvoker.v((Minecraft)this.q).lastTickPosY + (MCInvoker.v((Minecraft)this.q).posY - MCInvoker.v((Minecraft)this.q).lastTickPosY) * (double)f);
        Tessellator tessellator = TessellatorInvoker.getInstance();
        TessellatorInvoker.getWorldRenderer(tessellator);
        double d = (float)this.B + f;
        double d2 = (MCInvoker.v((Minecraft)this.q).prevPosX + (MCInvoker.v((Minecraft)this.q).posX - MCInvoker.v((Minecraft)this.q).prevPosX) * (double)f + d * (double)0.03f) / 12.0;
        double d3 = (MCInvoker.v((Minecraft)this.q).prevPosZ + (MCInvoker.v((Minecraft)this.q).posZ - MCInvoker.v((Minecraft)this.q).prevPosZ) * (double)f) / 12.0 + (double)0.33f;
        float f6 = qq_2.b(this.x.d) - f5 + 0.33f;
        f6 += this.q.gameSettings.bt * 128.0f;
        int n2 = MathHelper.floor_double(d2 / 2048.0);
        int n3 = MathHelper.floor_double(d3 / 2048.0);
        d2 -= (double)(n2 * 2048);
        d3 -= (double)(n3 * 2048);
        TextureManagerInvoker.bindTexture(this.v, aa);
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.b(770, 771, 1, 0);
        Vec3 vec3 = BlockInvoker.e(this.x, f);
        float f7 = (float)vec3.xCoord;
        float f8 = (float)vec3.yCoord;
        float f9 = (float)vec3.zCoord;
        if (n != 2) {
            f4 = (f7 * 30.0f + f8 * 59.0f + f9 * 11.0f) / 100.0f;
            f3 = (f7 * 30.0f + f8 * 70.0f) / 100.0f;
            f2 = (f7 * 30.0f + f9 * 70.0f) / 100.0f;
            f7 = f4;
            f8 = f3;
            f9 = f2;
        }
        f4 = f7 * 0.9f;
        f3 = f8 * 0.9f;
        f2 = f9 * 0.9f;
        float cfr_ignored_0 = f7 * 0.7f;
        float cfr_ignored_1 = f8 * 0.7f;
        float cfr_ignored_2 = f9 * 0.7f;
        float cfr_ignored_3 = f7 * 0.8f;
        float cfr_ignored_4 = f8 * 0.8f;
        float cfr_ignored_5 = f9 * 0.8f;
        float cfr_ignored_6 = (float)MathHelper.floor_double(d2) * 0.00390625f;
        float cfr_ignored_7 = (float)MathHelper.floor_double(d3) * 0.00390625f;
        float cfr_ignored_8 = (float)(d2 - (double)MathHelper.floor_double(d2));
        float cfr_ignored_9 = (float)(d3 - (double)MathHelper.floor_double(d3));
        GlStateManagerInvoker.c(12.0f, 1.0f, 12.0f);
        int n4 = 0;
        while (true) {
            GlStateManagerInvoker.a(false, false, false, false);
            c9.b(this.e);
            ++n4;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(Collection collection, Collection collection2) {
        Set set = this.ap;
        synchronized (set) {
            aS0.b(this.ap, collection);
            aS0.a(this.ap, collection2);
            return;
        }
    }

    public void d() {
    }

    private void m() {
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        if (this.H != null) {
            dg_1.b(this.H);
        }
        if (this.S >= 0) {
            N4.c(this.S);
            this.S = -1;
        }
        if (this.O) {
            this.H = new aH5(this.R);
            this.a(worldRenderer, 16.0f, false);
            WorldRendererInvoker.a(worldRenderer);
            WorldRendererInvoker.b(worldRenderer);
            dg_1.a(this.H, WorldRendererInvoker.l(worldRenderer));
        } else {
            this.S = N4.b(1);
            GL11.glNewList((int)this.S, (int)4864);
            this.a(worldRenderer, 16.0f, false);
            TessellatorInvoker.draw(tessellator);
            GL11.glEndList();
        }
    }

    @Override
    public void b(BlockPos blockPos) {
        int n = amv_2.j(blockPos);
        int n2 = amv_2.h(blockPos);
        int n3 = amv_2.i(blockPos);
        this.b(n - 1, n2 - 1, n3 - 1, n + 1, n2 + 1, n3 + 1);
    }

    private void t() {
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        if (this.o != null) {
            dg_1.b(this.o);
        }
        if (this.ao >= 0) {
            N4.c(this.ao);
            this.ao = -1;
        }
        if (this.O) {
            this.o = new aH5(this.R);
            this.a(worldRenderer, -16.0f, true);
            WorldRendererInvoker.a(worldRenderer);
            WorldRendererInvoker.b(worldRenderer);
            dg_1.a(this.o, WorldRendererInvoker.l(worldRenderer));
        } else {
            this.ao = N4.b(1);
            GL11.glNewList((int)this.ao, (int)4864);
            this.a(worldRenderer, -16.0f, true);
            TessellatorInvoker.draw(tessellator);
            GL11.glEndList();
        }
    }

    public String k() {
        return aL0.a(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), ani_1.H), this.T), ani_1.O), this.A), ani_1.L), this.C), ani_1.J), this.A - this.C - this.T), ani_1.p), ys_2.af()).toString();
    }

    private void a(WorldRenderer worldRenderer) {
        Random random = new Random(10842L);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.k);
        int n = 0;
        while (true) {
            double d = a5_0.e(random) * 2.0f - 1.0f;
            double d2 = a5_0.e(random) * 2.0f - 1.0f;
            double d3 = a5_0.e(random) * 2.0f - 1.0f;
            double d4 = 0.15f + a5_0.e(random) * 0.1f;
            double d5 = d * d + d2 * d2 + d3 * d3;
            if (d5 < 1.0 && d5 > 0.01) {
                d5 = 1.0 / MathInvoker.d(d5);
                double d6 = (d *= d5) * 100.0;
                double d7 = (d2 *= d5) * 100.0;
                double d8 = (d3 *= d5) * 100.0;
                double d9 = MathInvoker.c(d, d3);
                double d10 = MathHelper.h(d9);
                double d11 = MathHelper.b(d9);
                double d12 = MathInvoker.c(MathInvoker.d(d * d + d3 * d3), d2);
                double d13 = MathHelper.h(d12);
                double d14 = MathHelper.b(d12);
                double d15 = a5_0.c(random) * Math.PI * 2.0;
                double d16 = MathHelper.h(d15);
                double d17 = MathHelper.b(d15);
                int n2 = 0;
                while (true) {
                    double d18 = (double)((n2 & 2) - 1) * d4;
                    double d19 = (double)((n2 + 1 & 2) - 1) * d4;
                    double d20 = d18 * d17 - d19 * d16;
                    double d21 = d19 * d17 + d18 * d16;
                    double d22 = d20 * d13 + 0.0 * d14;
                    double d23 = 0.0 * d13 - d20 * d14;
                    double d24 = d23 * d10 - d21 * d11;
                    double d25 = d21 * d10 + d23 * d11;
                    WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d6 + d24, d7 + d22, d8 + d25));
                    ++n2;
                }
            }
            ++n;
        }
    }

    public String e() {
        int n = this.av.c.length;
        int n2 = 0;
        Iterator iterator = ListInvoker.iterator(this.al);
        while (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            _y_0 _y_02 = (_y_0)object;
            amx_0 amx_02 = _y_02.b.m;
            if (amx_02 == amx_0.d || azb_1.c(amx_02)) continue;
            ++n2;
        }
        return StringInvoker.a(ani_1.C, new Object[]{P8.d(n2), P8.d(n), this.q.aC ? ani_1.D : ani_1.T, P8.d(this.aj), aGM.a(this.p)});
    }

    private void a(B7 b7, double d, double d2, double d3, double d4, double d5, double d6, int ... nArray) {
        this.a(aYK.d(b7), aYK.a(b7), d, d2, d3, d4, d5, d6, nArray);
    }

    public RenderGlobal(Minecraft minecraft) {
        this.al = my_0.b(69696);
        this.ap = axe_2.a();
        this.as = MapsInvoker.a();
        this.af = MapsInvoker.a();
        this.c = new KM[10];
        this.ar = Double.MIN_VALUE;
        this.u = Double.MIN_VALUE;
        this.d = Double.MIN_VALUE;
        this.N = Integer.MIN_VALUE;
        this.an = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
        this.a = Double.MIN_VALUE;
        this.at = Double.MIN_VALUE;
        this.aq = Double.MIN_VALUE;
        this.ab = Double.MIN_VALUE;
        this.ac = Double.MIN_VALUE;
        this.p = new l();
        this.ad = new Vector4f[8];
        this.t = new pa_0();
        this.f = new LinkedHashSet<RenderChunk>();
        this.k = new LinkedHashSet<RenderChunk>();
        this.au = new ArrayDeque<_y_0>();
        this.ai = new ArrayList<_y_0>(1024);
        this.E = new ArrayList<_y_0>(1024);
        this.l = new ArrayList<_y_0>(1024);
        this.ah = new ArrayList<_y_0>(1024);
        this.ag = new ArrayList<_y_0>(1024);
        this.D = new ArrayList<_y_0>(1024);
        this.z = new ArrayList<_y_0>(1024);
        this.Q = new ArrayList<_y_0>(1024);
        this.e = new aza_2(minecraft);
        this.q = minecraft;
        this.r = MCInvoker.j(minecraft);
        this.v = MCInvoker.E(minecraft);
        TextureManagerInvoker.bindTexture(this.v, L);
        GL11.glTexParameteri((int)3553, (int)10242, (int)10497);
        GL11.glTexParameteri((int)3553, (int)10243, (int)10497);
        GlStateManagerInvoker.k(0);
        this.l();
        this.O = OpenGlHelper.f();
        if (this.O) {
            this.J = new E5();
            this.M = new aoy_0();
        } else {
            this.J = new E4();
            this.M = new ack_1();
        }
        this.R = new VertexFormat();
        zv_2.a(this.R, new VertexFormatElement(0, ml_2.FLOAT, aPX.POSITION, 3));
        this.f();
        this.m();
        this.t();
    }

    public static void a(rm_2 rm_22) {
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 3, DefaultVertexFormats.k);
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.f));
        TessellatorInvoker.draw(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 3, DefaultVertexFormats.k);
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.f));
        TessellatorInvoker.draw(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 1, DefaultVertexFormats.k);
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.d));
        TessellatorInvoker.draw(tessellator);
    }

    @Override
    public void a(EntityPlayer entityPlayer, String string, double d, double d2, double d3, float f, float f2) {
    }

    public RenderChunk b(BlockPos blockPos) {
        return this.av.a(blockPos);
    }

    public WorldClient o() {
        return this.x;
    }

    public int r() {
        return this.av.c.length;
    }

    public void c(float f, int n) {
        if (!ys_2.aN()) {
            if (ayy_0.d(ail_0.c7)) {
                a9K a9K2 = this.q.world.d;
                Object object = aDb.f(a9K2, ail_0.c7, new Object[0]);
                aDb.b(object, ail_0.cu, new Object[]{axx_1.a(f), this.x, this.q});
                return;
            }
            if (qq_2.d(this.q.world.d)) {
                if (ys_2.aC()) {
                    a3c_0.X();
                }
                if (ys_2.ah()) {
                    this.a(f, n);
                } else {
                    c9.a(this.e, false, this.B, f);
                    f = 0.0f;
                    GlStateManagerInvoker.A();
                    float f2 = (float)(MCInvoker.v((Minecraft)this.q).lastTickPosY + (MCInvoker.v((Minecraft)this.q).posY - MCInvoker.v((Minecraft)this.q).lastTickPosY) * (double)f);
                    Tessellator tessellator = TessellatorInvoker.getInstance();
                    WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
                    TextureManagerInvoker.bindTexture(this.v, aa);
                    GlStateManagerInvoker.enableBlend();
                    GlStateManagerInvoker.b(770, 771, 1, 0);
                    if (c9.e(this.e)) {
                        c9.a(this.e);
                        Vec3 vec3 = BlockInvoker.e(this.x, f);
                        float f3 = (float)vec3.xCoord;
                        float f4 = (float)vec3.yCoord;
                        float f5 = (float)vec3.zCoord;
                        if (n != 2) {
                            float f6 = (f3 * 30.0f + f4 * 59.0f + f5 * 11.0f) / 100.0f;
                            float f7 = (f3 * 30.0f + f4 * 70.0f) / 100.0f;
                            float f8 = (f3 * 30.0f + f5 * 70.0f) / 100.0f;
                            f3 = f6;
                            f4 = f7;
                            f5 = f8;
                        }
                        double d = (float)this.B + f;
                        double d2 = MCInvoker.v((Minecraft)this.q).prevPosX + (MCInvoker.v((Minecraft)this.q).posX - MCInvoker.v((Minecraft)this.q).prevPosX) * (double)f + d * (double)0.03f;
                        double d3 = MCInvoker.v((Minecraft)this.q).prevPosZ + (MCInvoker.v((Minecraft)this.q).posZ - MCInvoker.v((Minecraft)this.q).prevPosZ) * (double)f;
                        int n2 = MathHelper.floor_double(d2 / 2048.0);
                        int n3 = MathHelper.floor_double(d3 / 2048.0);
                        float f9 = qq_2.b(this.x.d) - f2 + 0.33f;
                        f9 += this.q.gameSettings.bt * 128.0f;
                        float f10 = (float)((d2 -= (double)(n2 * 2048)) * 4.8828125E-4);
                        float f11 = (float)((d3 -= (double)(n3 * 2048)) * 4.8828125E-4);
                        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.POSITION_TEX_COLOR);
                        int n4 = -256;
                        int n5 = -256;
                        while (true) {
                            WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n4, f9, n5 + 32), (float)n4 * 4.8828125E-4f + f10, (float)(n5 + 32) * 4.8828125E-4f + f11), f3, f4, f5, 0.8f));
                            WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n4 + 32, f9, n5 + 32), (float)(n4 + 32) * 4.8828125E-4f + f10, (float)(n5 + 32) * 4.8828125E-4f + f11), f3, f4, f5, 0.8f));
                            WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n4 + 32, f9, n5), (float)(n4 + 32) * 4.8828125E-4f + f10, (float)n5 * 4.8828125E-4f + f11), f3, f4, f5, 0.8f));
                            WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n4, f9, n5), (float)n4 * 4.8828125E-4f + f10, (float)n5 * 4.8828125E-4f + f11), f3, f4, f5, 0.8f));
                            n5 += 32;
                        }
                    }
                    c9.b(this.e);
                    GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
                    GlStateManagerInvoker.disableBlend();
                    GlStateManagerInvoker.b();
                }
                if (ys_2.aC()) {
                    a3c_0.n();
                }
            }
        }
    }

    private Set a(BlockPos blockPos) {
        axc_1 axc_12 = new axc_1();
        BlockPos blockPos2 = new BlockPos(amv_2.j(blockPos) >> 4 << 4, amv_2.h(blockPos) >> 4 << 4, amv_2.i(blockPos) >> 4 << 4);
        Chunk chunk = BlockInvoker.b(this.x, blockPos2);
        Iterator iterator = OV.a(amv_2.a(blockPos2, amv_2.a(blockPos2, 15, 15, 15)));
        while (dz_0.c(iterator)) {
            z6_0 z6_02 = (z6_0)dz_0.b(iterator);
            if (!BlocksInvoker.L(aqp_2.d(chunk, z6_02)) || wc_1.g(ModuleInvoker.isEnable(ModuleRegistry.XRAY)) || Freecam.I) continue;
            ayi_0.a(axc_12, z6_02);
        }
        return ayi_0.b(axc_12, blockPos);
    }

    public void a(long l4) {
        RenderChunk renderChunk;
        RenderChunk renderChunk2;
        Iterator iterator;
        l4 = (long)((double)l4 + 1.0E8);
        this.F |= aGM.a(this.p, l4);
        if (!aS0.b(this.k)) {
            iterator = aS0.f(this.k);
            while (dz_0.c(iterator) && aGM.b(this.p, renderChunk2 = (RenderChunk)dz_0.b(iterator))) {
                afq_2.a(renderChunk2, false);
                dz_0.a(iterator);
                aS0.a(this.w, renderChunk2);
                aS0.a(this.f, renderChunk2);
            }
        }
        if (!aS0.b(this.f) && dz_0.c(iterator = aS0.f(this.f)) && aGM.c(this.p, renderChunk2 = (RenderChunk)dz_0.b(iterator))) {
            dz_0.a(iterator);
        }
        int n = 0;
        int n2 = ys_2.ac();
        int n3 = n2 * 2;
        Iterator iterator2 = aS0.f(this.w);
        while (dz_0.c(iterator2) && aGM.b(this.p, renderChunk = (RenderChunk)dz_0.b(iterator2))) {
            afq_2.a(renderChunk, false);
            dz_0.a(iterator2);
            if (azb_1.c(afq_2.e(renderChunk)) && n2 < n3) {
                ++n2;
            }
            if (++n < n2) continue;
            break;
        }
    }

    private void q() {
        GlStateManagerInvoker.b(774, 768, 1, 0);
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 0.5f);
        GlStateManagerInvoker.a(-3.0f, -3.0f);
        GlStateManagerInvoker.u();
        GlStateManagerInvoker.alphaFunc(516, 0.1f);
        GlStateManagerInvoker.enableAlpha();
        GlStateManagerInvoker.pushMatrix();
        if (ys_2.aC()) {
            axw_2.e();
        }
    }

    private void a(Iterator<aaa_2> iterator) {
        while (dz_0.c(iterator)) {
            aaa_2 aaa_22 = (aaa_2)dz_0.b(iterator);
            int n = XX.a(aaa_22);
            if (this.B - n <= 400) continue;
            dz_0.a(iterator);
        }
    }

    public void a(a5w_0 a5w_02, double d, int n, Entity entity) {
        ne_0.e();
        if (a5w_02 == a5w_0.TRANSLUCENT) {
            ProfilerInvoker.startSection(this.q.mcProfiler, ani_1.ad);
            double d2 = entity.posX - this.h;
            double d3 = entity.posY - this.Z;
            double d4 = entity.posZ - this.n;
            if (d2 * d2 + d3 * d3 + d4 * d4 > 1.0) {
                this.h = entity.posX;
                this.Z = entity.posY;
                this.n = entity.posZ;
                int n2 = 0;
                Iterator iterator = ListInvoker.iterator(this.al);
                aS0.e(this.f);
                while (dz_0.c(iterator)) {
                    _y_0 _y_02 = (_y_0)dz_0.b(iterator);
                    if (!azb_1.c(_y_02.b.m, a5w_02)) continue;
                    ++n2;
                    aS0.b(this.f, _y_02.b);
                }
            }
            ProfilerInvoker.endSection(this.q.mcProfiler);
        }
        ProfilerInvoker.startSection(this.q.mcProfiler, ani_1.aa);
        int n3 = 0;
        boolean bl = a5w_02 == a5w_0.TRANSLUCENT;
        int n4 = ListInvoker.size(this.al) - 1;
        int n5 = -1;
        int n6 = -1;
        for (int i = n4; i != n5; i += n6) {
            RenderChunk renderChunk = ((_y_0)ListInvoker.get(this.al, (int)i)).b;
            if (azb_1.a(afq_2.e(renderChunk), a5w_02)) continue;
            ++n3;
            aE4.a(this.J, renderChunk, a5w_02);
        }
        if (ys_2.aH() && this.q.entityRenderer.k) {
            GlStateManagerInvoker.disableFog();
        }
        ProfilerInvoker.a(this.q.mcProfiler, aL0.a(aL0.a(new StringBuilder(), ani_1.j), (Object)a5w_02).toString());
        this.a(a5w_02);
        ProfilerInvoker.endSection(this.q.mcProfiler);
    }

    @Override
    public void a(int n, boolean bl, double d, double d2, double d3, double d4, double d5, double d6, int ... nArray) {
        try {
            this.a(n, bl, d, d2, d3, d4, d5, d6, nArray);
            return;
        }
        catch (Throwable throwable) {
            CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, ani_1.y);
            CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, ani_1.k);
            CrashReportCategoryInvoker.addCrashSection(crashReportCategory, ani_1.t, P8.d(n));
            CrashReportCategoryInvoker.addCrashSection(crashReportCategory, ani_1.W, nArray);
            CrashReportCategoryInvoker.a(crashReportCategory, ani_1.K, () -> RenderGlobal.lambda$spawnParticle$0(d, d2, d3));
            throw new ReportedException(crashReport);
        }
    }

    protected Vector3f a(Entity entity, double d) {
        float f = (float)((double)entity.prevRotationPitch + (double)(entity.rotationPitch - entity.prevRotationPitch) * d);
        float f2 = (float)((double)entity.prevRotationYaw + (double)(entity.rotationYaw - entity.prevRotationYaw) * d);
        if (awu_1.f(MCInvoker.f().gameSettings) == 2) {
            f += 180.0f;
        }
        float f3 = MathHelper.cos(-f2 * ((float)Math.PI / 180) - (float)Math.PI);
        float f4 = MathHelper.sin(-f2 * ((float)Math.PI / 180) - (float)Math.PI);
        float f5 = -MathHelper.cos(-f * ((float)Math.PI / 180));
        float f6 = MathHelper.sin(-f * ((float)Math.PI / 180));
        return new Vector3f(f4 * f5, f6, f3 * f5);
    }

    public RenderChunk a(RenderChunk renderChunk, EnumFacing enumFacing) {
        return null;
    }

    @Override
    public void a(String string, BlockPos blockPos) {
        aCD aCD2 = (aCD)MapInvoker.c(this.af, blockPos);
        SoundHandlerInvoker.a(MCInvoker.l(this.q), aCD2);
        MapInvoker.a(this.af, blockPos);
        li_0 li_02 = awi_0.a(string);
        GW.a(this.q.ingameGUI, awi_0.a(li_02));
        ResourceLocation resourceLocation = null;
        if (ayy_0.d(ail_0.ag)) {
            resourceLocation = (ResourceLocation)aDb.f(li_02, ail_0.ag, new Object[]{string});
        }
        resourceLocation = new ResourceLocation(string);
        akm_0 akm_02 = aih_1.a(resourceLocation, amv_2.j(blockPos), amv_2.h(blockPos), amv_2.i(blockPos));
        MapInvoker.c(this.af, blockPos, akm_02);
        SoundHandlerInvoker.c(MCInvoker.l(this.q), akm_02);
    }

    public void a(EntityPlayer entityPlayer, MovingObjectPosition movingObjectPosition, int n, float f) {
        if (movingObjectPosition.typeOfHit == net.I.BLOCK) {
            GlStateManagerInvoker.enableBlend();
            GlStateManagerInvoker.b(770, 771, 1, 0);
            GlStateManagerInvoker.color(0.0f, 0.0f, 0.0f, 0.4f);
            GL11.glLineWidth((float)2.0f);
            GlStateManagerInvoker.disableTexture2D();
            if (ys_2.aC()) {
                a3c_0.b();
            }
            GlStateManagerInvoker.c(false);
            BlockPos blockPos = ObjectMouseOverInvoker.getBlockPos(movingObjectPosition);
            Block block = BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.x, blockPos));
            if (BlocksInvoker.getBlockState(block) != Material.air && ak9_0.a(BlockInvoker.i(this.x), blockPos)) {
                BlocksInvoker.a(block, (IBlockAccess)this.x, blockPos);
                double d = entityPlayer.lastTickPosX + (entityPlayer.posX - entityPlayer.lastTickPosX) * (double)f;
                double d2 = entityPlayer.lastTickPosY + (entityPlayer.posY - entityPlayer.lastTickPosY) * (double)f;
                double d3 = entityPlayer.lastTickPosZ + (entityPlayer.posZ - entityPlayer.lastTickPosZ) * (double)f;
                RenderGlobal.a(h__0.b(h__0.d(BlocksInvoker.e(block, this.x, blockPos), 0.002f, 0.002f, 0.002f), -d, -d2, -d3));
            }
            GlStateManagerInvoker.c(true);
            GlStateManagerInvoker.enableTexture2D();
            if (ys_2.aC()) {
                a3c_0.Z();
            }
            GlStateManagerInvoker.disableBlend();
        }
    }

    public void a() {
        if (apl_1.u) {
            if (s0_0.b() == null) {
                s0_0.a();
            }
            ResourceLocation resourceLocation = new ResourceLocation(ani_1.N);
            try {
                this.K = new aGC(MCInvoker.E(this.q), MCInvoker.x(this.q), MCInvoker.c(this.q), resourceLocation);
                ada_2.a(this.K, this.q.displayWidth, this.q.displayHeight);
                this.m = ada_2.a(this.K, ani_1.I);
            }
            catch (JsonSyntaxException | IOException throwable) {
                LoggerInvoker.b(am, aL0.a(aL0.a(new StringBuilder(), ani_1.S), resourceLocation).toString(), throwable);
                this.K = null;
                this.m = null;
            }
        } else {
            this.K = null;
            this.m = null;
        }
    }

    public void a(Entity entity, double d, ao7_0 object, int n, boolean bl) {
        Object object2;
        EnumFacing[] enumFacingArray;
        Iterator iterator;
        Deque<_y_0> deque;
        Object object3;
        if (this.q.gameSettings.bp != this.aj) {
            this.n();
        }
        ProfilerInvoker.startSection(this.x.A, ani_1.ae);
        double d2 = entity.posX - this.ar;
        double d3 = entity.posY - this.u;
        double d4 = entity.posZ - this.d;
        if (this.N != entity.V || this.an != entity.M || this.b != entity.s || d2 * d2 + d3 * d3 + d4 * d4 > 16.0) {
            this.ar = entity.posX;
            this.u = entity.posY;
            this.d = entity.posZ;
            this.N = entity.V;
            this.an = entity.M;
            this.b = entity.s;
            uk_2.a(this.av, entity.posX, entity.posZ);
        }
        if (ys_2.I()) {
            xh_1.b(this);
        }
        ProfilerInvoker.a(this.x.A, ani_1.x);
        double d5 = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * d;
        double d6 = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * d;
        double d7 = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * d;
        aE4.a(this.J, d5, d6, d7);
        ProfilerInvoker.a(this.x.A, ani_1.F);
        if (this.s != null) {
            object3 = new aV1(this.s);
            ahz_1.a((aV1)object3, this.t.b, this.t.c, this.t.a);
            object = object3;
        }
        ProfilerInvoker.a(this.q.mcProfiler, ani_1.r);
        object3 = new BlockPos(d5, d6 + (double)ayj_0.n(entity), d7);
        RenderChunk renderChunk = this.av.a((BlockPos)object3);
        BlockPos blockPos = new BlockPos(MathHelper.floor_double(d5 / 16.0) * 16, MathHelper.floor_double(d6 / 16.0) * 16, MathHelper.floor_double(d7 / 16.0) * 16);
        this.F = this.F || !aS0.b(this.w) || entity.posX != this.a || entity.posY != this.at || entity.posZ != this.aq || (double)entity.rotationPitch != this.ab || (double)entity.rotationYaw != this.ac;
        this.a = entity.posX;
        this.at = entity.posY;
        this.aq = entity.posZ;
        this.ab = entity.rotationPitch;
        this.ac = entity.rotationYaw;
        boolean bl2 = this.s != null;
        a16.b(tb_0.n);
        if (aVE.ch) {
            this.al = this.D;
            this.ai = this.z;
            this.E = this.Q;
            if (this.F) {
                ListInvoker.clear(this.al);
                ListInvoker.clear(this.ai);
                ListInvoker.clear(this.E);
                deque = new aQA();
                iterator = acz_1.a(this.x, d, entity, this.aj, this.av);
                while (dz_0.c(iterator)) {
                    enumFacingArray = (RenderChunk)dz_0.b(iterator);
                    lj_2.a(deque, (RenderChunk)enumFacingArray);
                    if (!azb_1.c(enumFacingArray.m) || afq_2.g((RenderChunk)enumFacingArray)) {
                        ListInvoker.add(this.al, lj_2.a(deque));
                    }
                    if (WL.a(BlockInvoker.b(this.x, (BlockPos)(object2 = afq_2.d((RenderChunk)enumFacingArray))))) {
                        ListInvoker.add(this.ai, lj_2.a(deque));
                    }
                    if (ListInvoker.isEmpty(azb_1.b(afq_2.e((RenderChunk)enumFacingArray)))) continue;
                    ListInvoker.add(this.E, lj_2.a(deque));
                }
            }
        } else {
            this.al = this.l;
            this.ai = this.ah;
            this.E = this.ag;
        }
        if (this.F && !aVE.ch) {
            EnumFacing enumFacing;
            Object object4;
            this.F = false;
            ListInvoker.clear(this.al);
            ListInvoker.clear(this.ai);
            ListInvoker.clear(this.E);
            sd_0.b(this.au);
            deque = this.au;
            boolean bl3 = this.q.aC;
            boolean bl4 = false;
            object2 = new _y_0(renderChunk, null, 0, null);
            Object object5 = ak;
            if (aS0.d(object5) == 1) {
                object4 = this.a(entity, d);
                enumFacing = SJ.b(SJ.a(object4.x, object4.y, object4.z));
                aS0.a(object5, enumFacing);
            }
            if (aS0.b(object5)) {
                bl4 = true;
            }
            ListInvoker.add(this.al, object2);
            enumFacingArray = EnumFacing.VALUES;
            int n2 = enumFacingArray.length;
            while (!sd_0.a(deque)) {
                object5 = (_y_0)sd_0.d(deque);
                object4 = ((_y_0)object5).b;
                enumFacing = ((_y_0)object5).c;
                BlockPos blockPos2 = afq_2.d((RenderChunk)object4);
                if (!azb_1.c(object4.m) || afq_2.g((RenderChunk)object4)) {
                    ListInvoker.add(this.al, object5);
                }
                if (WL.a(BlockInvoker.b(this.x, blockPos2))) {
                    ListInvoker.add(this.ai, object5);
                }
                if (!ListInvoker.isEmpty(azb_1.b(afq_2.e((RenderChunk)object4)))) {
                    ListInvoker.add(this.E, object5);
                }
                for (EnumFacing enumFacing2 : enumFacingArray) {
                    RenderChunk renderChunk2;
                    if (aS0.c(((_y_0)object5).d, SJ.b(enumFacing2)) || !azb_1.a(afq_2.e((RenderChunk)object4), SJ.b(enumFacing), enumFacing2) || !afq_2.a(renderChunk2 = this.a((BlockPos)object3, (RenderChunk)object4, enumFacing2), n) || !are_0.a((ao7_0)object, renderChunk2.l)) continue;
                    _y_0 _y_02 = new _y_0(renderChunk2, enumFacing2, ((_y_0)object5).a + 1, null);
                    aS0.a(_y_02.d, ((_y_0)object5).d);
                    aS0.b(_y_02.d, enumFacing2);
                    sd_0.b(deque, _y_02);
                }
            }
        }
        if (this.U) {
            this.a(d5, d6, d7);
            this.U = false;
        }
        a16.a(tb_0.n);
        if (aVE.ch) {
            a3c_0.D();
        } else {
            aGM.c(this.p);
            deque = this.w;
            this.w = axe_2.b();
            iterator = ListInvoker.iterator(this.al);
            a16.b(tb_0.h);
            while (dz_0.c(iterator)) {
                enumFacingArray = (_y_0)dz_0.b(iterator);
                RenderChunk renderChunk3 = enumFacingArray.b;
                if (!afq_2.g(renderChunk3) && !aS0.c(deque, renderChunk3)) continue;
                this.F = true;
                if (this.a(blockPos, enumFacingArray.b)) {
                    if (!afq_2.b(renderChunk3)) {
                        aS0.b(this.k, renderChunk3);
                        continue;
                    }
                    ProfilerInvoker.startSection(this.q.mcProfiler, ani_1.ac);
                    aGM.a(this.p, renderChunk3);
                    afq_2.a(renderChunk3, false);
                    ProfilerInvoker.endSection(this.q.mcProfiler);
                    continue;
                }
                aS0.b(this.w, renderChunk3);
            }
            a16.a(tb_0.h);
            aS0.a(this.w, deque);
            ProfilerInvoker.endSection(this.q.mcProfiler);
        }
    }

    public void a(Entity entity, float f) {
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        agl_1 agl_12 = BlockInvoker.i(this.x);
        double d = this.q.gameSettings.bp * 16;
        if (entity.posX >= ak9_0.p(agl_12) - d || entity.posX <= ak9_0.c(agl_12) + d || entity.posZ >= ak9_0.m(agl_12) - d || entity.posZ <= ak9_0.j(agl_12) + d) {
            float f2;
            double d2;
            double d3;
            float f3;
            double d4 = 1.0 - ak9_0.a(agl_12, entity) / d;
            d4 = MathInvoker.b(d4, 4.0);
            double d5 = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double)f;
            double d6 = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)f;
            double d7 = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double)f;
            GlStateManagerInvoker.enableBlend();
            GlStateManagerInvoker.b(770, 1, 1, 0);
            TextureManagerInvoker.bindTexture(this.v, L);
            GlStateManagerInvoker.c(false);
            GlStateManagerInvoker.pushMatrix();
            int n = Y4.a(ak9_0.a(agl_12));
            float f4 = (float)(n >> 16 & 0xFF) / 255.0f;
            float f5 = (float)(n >> 8 & 0xFF) / 255.0f;
            float f6 = (float)(n & 0xFF) / 255.0f;
            GlStateManagerInvoker.color(f4, f5, f6, (float)d4);
            GlStateManagerInvoker.a(-3.0f, -3.0f);
            GlStateManagerInvoker.u();
            GlStateManagerInvoker.alphaFunc(516, 0.1f);
            GlStateManagerInvoker.enableAlpha();
            GlStateManagerInvoker.A();
            float f7 = (float)(MCInvoker.a() % 3000L) / 3000.0f;
            WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
            WorldRendererInvoker.b(worldRenderer, -d5, -d6, -d7);
            double d8 = MathInvoker.d(MathHelper.floor_double(d7 - d), ak9_0.j(agl_12));
            double d9 = MathInvoker.a((double)MathHelper.i(d7 + d), ak9_0.m(agl_12));
            if (d5 > ak9_0.p(agl_12) - d) {
                f3 = 0.0f;
                d3 = d8;
                while (d3 < d9) {
                    d2 = MathInvoker.a(1.0, d9 - d3);
                    f2 = (float)d2 * 0.5f;
                    WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, ak9_0.p(agl_12), 256.0, d3), f7 + f3, f7 + 0.0f));
                    WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, ak9_0.p(agl_12), 256.0, d3 + d2), f7 + f2 + f3, f7 + 0.0f));
                    WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, ak9_0.p(agl_12), 0.0, d3 + d2), f7 + f2 + f3, f7 + 128.0f));
                    WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, ak9_0.p(agl_12), 0.0, d3), f7 + f3, f7 + 128.0f));
                    d3 += 1.0;
                    f3 += 0.5f;
                }
            }
            if (d5 < ak9_0.c(agl_12) + d) {
                f3 = 0.0f;
                d3 = d8;
                while (d3 < d9) {
                    d2 = MathInvoker.a(1.0, d9 - d3);
                    f2 = (float)d2 * 0.5f;
                    WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, ak9_0.c(agl_12), 256.0, d3), f7 + f3, f7 + 0.0f));
                    WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, ak9_0.c(agl_12), 256.0, d3 + d2), f7 + f2 + f3, f7 + 0.0f));
                    WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, ak9_0.c(agl_12), 0.0, d3 + d2), f7 + f2 + f3, f7 + 128.0f));
                    WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, ak9_0.c(agl_12), 0.0, d3), f7 + f3, f7 + 128.0f));
                    d3 += 1.0;
                    f3 += 0.5f;
                }
            }
            d8 = MathInvoker.d(MathHelper.floor_double(d5 - d), ak9_0.c(agl_12));
            d9 = MathInvoker.a((double)MathHelper.i(d5 + d), ak9_0.p(agl_12));
            if (d7 > ak9_0.m(agl_12) - d) {
                f3 = 0.0f;
                d3 = d8;
                while (d3 < d9) {
                    d2 = MathInvoker.a(1.0, d9 - d3);
                    f2 = (float)d2 * 0.5f;
                    WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d3, 256.0, ak9_0.m(agl_12)), f7 + f3, f7 + 0.0f));
                    WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d3 + d2, 256.0, ak9_0.m(agl_12)), f7 + f2 + f3, f7 + 0.0f));
                    WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d3 + d2, 0.0, ak9_0.m(agl_12)), f7 + f2 + f3, f7 + 128.0f));
                    WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d3, 0.0, ak9_0.m(agl_12)), f7 + f3, f7 + 128.0f));
                    d3 += 1.0;
                    f3 += 0.5f;
                }
            }
            if (d7 < ak9_0.j(agl_12) + d) {
                f3 = 0.0f;
                d3 = d8;
                while (d3 < d9) {
                    d2 = MathInvoker.a(1.0, d9 - d3);
                    f2 = (float)d2 * 0.5f;
                    WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d3, 256.0, ak9_0.j(agl_12)), f7 + f3, f7 + 0.0f));
                    WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d3 + d2, 256.0, ak9_0.j(agl_12)), f7 + f2 + f3, f7 + 0.0f));
                    WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d3 + d2, 0.0, ak9_0.j(agl_12)), f7 + f2 + f3, f7 + 128.0f));
                    WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d3, 0.0, ak9_0.j(agl_12)), f7 + f3, f7 + 128.0f));
                    d3 += 1.0;
                    f3 += 0.5f;
                }
            }
            TessellatorInvoker.draw(tessellator);
            WorldRendererInvoker.b(worldRenderer, 0.0, 0.0, 0.0);
            GlStateManagerInvoker.b();
            GlStateManagerInvoker.C();
            GlStateManagerInvoker.a(0.0f, 0.0f);
            GlStateManagerInvoker.r();
            GlStateManagerInvoker.enableAlpha();
            GlStateManagerInvoker.disableBlend();
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.c(true);
        }
    }

    @Override
    public void a(EntityPlayer entityPlayer, int n, BlockPos blockPos, int n2) {
        Random random = this.x.o;
        switch (n) {
            case 1000: {
                BlockInvoker.a(this.x, blockPos, ani_1.m, 1.0f, 1.0f, false);
                break;
            }
            case 1001: {
                BlockInvoker.a(this.x, blockPos, ani_1.E, 1.0f, 1.2f, false);
                break;
            }
            case 1002: {
                BlockInvoker.a(this.x, blockPos, ani_1.B, 1.0f, 1.2f, false);
                break;
            }
            case 1003: {
                BlockInvoker.a(this.x, blockPos, ani_1.G, 1.0f, a5_0.e(this.x.o) * 0.1f + 0.9f, false);
                break;
            }
            case 1004: {
                BlockInvoker.a(this.x, blockPos, ani_1.w, 0.5f, 2.6f + (a5_0.e(random) - a5_0.e(random)) * 0.8f, false);
                break;
            }
            case 1005: {
                if (px_0.a(n2) instanceof li_0) {
                    BlockInvoker.a(this.x, blockPos, aL0.a(aL0.a(new StringBuilder(), ani_1.s), ((li_0)px_0.a((int)n2)).m).toString());
                    break;
                }
                BlockInvoker.a(this.x, blockPos, null);
                break;
            }
            case 1006: {
                BlockInvoker.a(this.x, blockPos, ani_1.f, 1.0f, a5_0.e(this.x.o) * 0.1f + 0.9f, false);
                break;
            }
            case 1007: {
                BlockInvoker.a(this.x, blockPos, ani_1.a, 10.0f, (a5_0.e(random) - a5_0.e(random)) * 0.2f + 1.0f, false);
                break;
            }
            case 1008: {
                BlockInvoker.a(this.x, blockPos, ani_1.u, 10.0f, (a5_0.e(random) - a5_0.e(random)) * 0.2f + 1.0f, false);
                break;
            }
            case 1009: {
                BlockInvoker.a(this.x, blockPos, ani_1.l, 2.0f, (a5_0.e(random) - a5_0.e(random)) * 0.2f + 1.0f, false);
                break;
            }
            case 1010: {
                BlockInvoker.a(this.x, blockPos, ani_1.q, 2.0f, (a5_0.e(random) - a5_0.e(random)) * 0.2f + 1.0f, false);
                break;
            }
            case 1011: {
                BlockInvoker.a(this.x, blockPos, ani_1.z, 2.0f, (a5_0.e(random) - a5_0.e(random)) * 0.2f + 1.0f, false);
                break;
            }
            case 1012: {
                BlockInvoker.a(this.x, blockPos, ani_1.V, 2.0f, (a5_0.e(random) - a5_0.e(random)) * 0.2f + 1.0f, false);
                break;
            }
            case 1014: {
                BlockInvoker.a(this.x, blockPos, ani_1.o, 2.0f, (a5_0.e(random) - a5_0.e(random)) * 0.2f + 1.0f, false);
                break;
            }
            case 1015: {
                BlockInvoker.a(this.x, blockPos, ani_1.af, 0.05f, (a5_0.e(random) - a5_0.e(random)) * 0.2f + 1.0f, false);
                break;
            }
            case 1016: {
                BlockInvoker.a(this.x, blockPos, ani_1.Z, 2.0f, (a5_0.e(random) - a5_0.e(random)) * 0.2f + 1.0f, false);
                break;
            }
            case 1017: {
                BlockInvoker.a(this.x, blockPos, ani_1.n, 2.0f, (a5_0.e(random) - a5_0.e(random)) * 0.2f + 1.0f, false);
                break;
            }
            case 1020: {
                BlockInvoker.a(this.x, blockPos, ani_1.ab, 1.0f, a5_0.e(this.x.o) * 0.1f + 0.9f, false);
                break;
            }
            case 1021: {
                BlockInvoker.a(this.x, blockPos, ani_1.i, 1.0f, a5_0.e(this.x.o) * 0.1f + 0.9f, false);
                break;
            }
            case 1022: {
                BlockInvoker.a(this.x, blockPos, ani_1.d, 0.3f, a5_0.e(this.x.o) * 0.1f + 0.9f, false);
                break;
            }
            case 2000: {
                int n3 = n2 % 3 - 1;
                int n4 = n2 / 3 % 3 - 1;
                double d = (double)amv_2.j(blockPos) + (double)n3 * 0.6 + 0.5;
                double d2 = (double)amv_2.h(blockPos) + 0.5;
                double d3 = (double)amv_2.i(blockPos) + (double)n4 * 0.6 + 0.5;
                int n5 = 0;
                while (true) {
                    double d4 = a5_0.c(random) * 0.2 + 0.01;
                    double d5 = d + (double)n3 * 0.01 + (a5_0.c(random) - 0.5) * (double)n4 * 0.5;
                    double d6 = d2 + (a5_0.c(random) - 0.5) * 0.5;
                    double d7 = d3 + (double)n4 * 0.01 + (a5_0.c(random) - 0.5) * (double)n3 * 0.5;
                    double d8 = (double)n3 * d4 + a5_0.f(random) * 0.01;
                    double d9 = -0.03 + a5_0.f(random) * 0.01;
                    double d10 = (double)n4 * d4 + a5_0.f(random) * 0.01;
                    this.a(B7.SMOKE_NORMAL, d5, d6, d7, d8, d9, d10, new int[0]);
                    ++n5;
                }
            }
            case 2001: {
                Block block = BlocksInvoker.a(n2 & 0xFFF);
                if (BlocksInvoker.getBlockState(block) != Material.air) {
                    SoundHandlerInvoker.c(MCInvoker.l(this.q), new akm_0(new ResourceLocation(an6_0.e(block.l)), (an6_0.d(block.l) + 1.0f) / 2.0f, an6_0.b(block.l) * 0.8f, (float)amv_2.j(blockPos) + 0.5f, (float)amv_2.h(blockPos) + 0.5f, (float)amv_2.i(blockPos) + 0.5f));
                }
                ayx_2.a(this.q.effectRenderer, blockPos, BlocksInvoker.a(block, n2 >> 12 & 0xFF));
                break;
            }
            case 2002: {
                double d = amv_2.j(blockPos);
                double d11 = amv_2.h(blockPos);
                double d12 = amv_2.i(blockPos);
                int n6 = 0;
                while (true) {
                    this.a(B7.ITEM_CRACK, d, d11, d12, a5_0.f(random) * 0.15, a5_0.c(random) * 0.2, a5_0.f(random) * 0.15, px_0.a(Items.potionitem), n2);
                    ++n6;
                }
            }
            case 2003: {
                double d = (double)amv_2.j(blockPos) + 0.5;
                double d13 = amv_2.h(blockPos);
                double d14 = (double)amv_2.i(blockPos) + 0.5;
                int n7 = 0;
                while (true) {
                    this.a(B7.ITEM_CRACK, d, d13, d14, a5_0.f(random) * 0.15, a5_0.c(random) * 0.2, a5_0.f(random) * 0.15, px_0.a(Items.ender_eye));
                    ++n7;
                }
            }
            case 2004: {
                int n8 = 0;
                while (true) {
                    double d = (double)amv_2.j(blockPos) + 0.5 + ((double)a5_0.e(this.x.o) - 0.5) * 2.0;
                    double d15 = (double)amv_2.h(blockPos) + 0.5 + ((double)a5_0.e(this.x.o) - 0.5) * 2.0;
                    double d16 = (double)amv_2.i(blockPos) + 0.5 + ((double)a5_0.e(this.x.o) - 0.5) * 2.0;
                    this.x.a(B7.SMOKE_NORMAL, d, d15, d16, 0.0, 0.0, 0.0, new int[0]);
                    this.x.a(B7.FLAME, d, d15, d16, 0.0, 0.0, 0.0, new int[0]);
                    ++n8;
                }
            }
            case 2005: {
                KQ.a(this.x, blockPos, n2);
            }
        }
    }

    private static String lambda$spawnParticle$0(double d, double d2, double d3) throws Exception {
        return CrashReportCategoryInvoker.a(d, d2, d3);
    }

    private boolean a(BlockPos blockPos, RenderChunk renderChunk) {
        BlockPos blockPos2 = afq_2.d(renderChunk);
        return MathHelper.a(amv_2.j(blockPos) - amv_2.j(blockPos2)) <= 16 && MathHelper.a(amv_2.h(blockPos) - amv_2.h(blockPos2)) <= 16 && MathHelper.a(amv_2.i(blockPos) - amv_2.i(blockPos2)) <= 16;
    }

    @Override
    public void b(Entity entity) {
        aux__0.a(entity, (World)this.x);
        if (ys_2.I()) {
            xh_1.a(entity, this);
        }
    }

    private void a(double d, double d2, double d3) {
        this.s = new qu_2();
        IP.a((qu_2)this.s);
        si_2 si_22 = new si_2(this.s.e);
        si_22.transpose();
        si_2 si_23 = new si_2(this.s.c);
        si_23.transpose();
        si_2 si_24 = new si_2();
        si_2.mul((Matrix4f)si_23, (Matrix4f)si_22, (Matrix4f)si_24);
        si_24.invert();
        this.t.b = d;
        this.t.c = d2;
        this.t.a = d3;
        this.ad[0] = new Vector4f(-1.0f, -1.0f, -1.0f, 1.0f);
        this.ad[1] = new Vector4f(1.0f, -1.0f, -1.0f, 1.0f);
        this.ad[2] = new Vector4f(1.0f, 1.0f, -1.0f, 1.0f);
        this.ad[3] = new Vector4f(-1.0f, 1.0f, -1.0f, 1.0f);
        this.ad[4] = new Vector4f(-1.0f, -1.0f, 1.0f, 1.0f);
        this.ad[5] = new Vector4f(1.0f, -1.0f, 1.0f, 1.0f);
        this.ad[6] = new Vector4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.ad[7] = new Vector4f(-1.0f, 1.0f, 1.0f, 1.0f);
        int n = 0;
        while (true) {
            si_2.transform((Matrix4f)si_24, (Vector4f)this.ad[n], (Vector4f)this.ad[n]);
            this.ad[n].x /= this.ad[n].w;
            this.ad[n].y /= this.ad[n].w;
            this.ad[n].z /= this.ad[n].w;
            this.ad[n].w = 1.0f;
            ++n;
        }
    }

    public void c() {
        if (ys_2.aC() && KeyboardInvoker.a(61) && KeyboardInvoker.a(19)) {
            a3c_0.M();
            a3c_0.N();
        }
        ++this.B;
        if (this.B % 20 == 0) {
            this.a(ms_0.a(this.as.values()));
        }
    }

    public int u() {
        return this.V;
    }

    @Override
    public void b(int n, BlockPos blockPos, int n2) {
        if (n2 < 10) {
            aaa_2 aaa_22 = (aaa_2)MapInvoker.c(this.as, P8.d(n));
            if (amv_2.j(XX.c(aaa_22)) != amv_2.j(blockPos) || amv_2.h(XX.c(aaa_22)) != amv_2.h(blockPos) || amv_2.i(XX.c(aaa_22)) != amv_2.i(blockPos)) {
                aaa_22 = new aaa_2(n, blockPos);
                MapInvoker.c(this.as, P8.d(n), aaa_22);
            }
            XX.b(aaa_22, n2);
            XX.a(aaa_22, this.B);
        } else {
            MapInvoker.a(this.as, P8.d(n));
        }
    }

    public void a(Tessellator tessellator, WorldRenderer worldRenderer, Entity entity, float f) {
        double d = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double)f;
        double d2 = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)f;
        double d3 = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double)f;
        if (!MapInvoker.e(this.as)) {
            TextureManagerInvoker.bindTexture(this.v, TextureMap.r);
            this.q();
            WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.g);
            WorldRendererInvoker.b(worldRenderer, -d, -d2, -d3);
            WorldRendererInvoker.j(worldRenderer);
            Iterator iterator = ms_0.a(this.as.values());
            while (dz_0.c(iterator)) {
                aaa_2 aaa_22 = (aaa_2)dz_0.b(iterator);
                BlockPos blockPos = XX.c(aaa_22);
                double d4 = (double)amv_2.j(blockPos) - d;
                double d5 = (double)amv_2.h(blockPos) - d2;
                double d6 = (double)amv_2.i(blockPos) - d3;
                Block block = BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.x, blockPos));
                if (ayy_0.d(ail_0.cJ)) {
                    boolean bl = block instanceof fs_1 || block instanceof fc_1 || block instanceof fj_1 || block instanceof g6_0;
                    TileEntity tileEntity = BlockInvoker.e(this.x, blockPos);
                    bl = aDb.e(tileEntity, ail_0.cJ, new Object[0]);
                } else {
                    boolean bl = !(block instanceof fs_1) && !(block instanceof fc_1) && !(block instanceof fj_1) && !(block instanceof g6_0);
                }
                if (d4 * d4 + d5 * d5 + d6 * d6 > 1024.0) {
                    dz_0.a(iterator);
                    continue;
                }
                IBlockState iBlockState = BlockInvoker.getMaterial(this.x, blockPos);
                if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(iBlockState)) == Material.air) continue;
                int n = XX.b(aaa_22);
                KM kM = this.c[n];
                BlockRendererDispatcher blockRendererDispatcher = MCInvoker.Y(this.q);
                xd_0.a(blockRendererDispatcher, iBlockState, blockPos, kM, this.x);
            }
            TessellatorInvoker.draw(tessellator);
            WorldRendererInvoker.b(worldRenderer, 0.0, 0.0, 0.0);
            this.g();
        }
    }
}


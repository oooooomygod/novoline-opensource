/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonSyntaxException
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 */
package deobf;

import cc.novoline.events.events.Render3DEvent;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.DisplayInvoker;
import cc.novoline.invoke.EventManagerInvoker;
import cc.novoline.invoke.FramebufferInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.IntegratedServerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.MouseInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.ObjectMouseOverInvoker;
import cc.novoline.invoke.PlayerControllerInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.ProfilerInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.invoke.SystemInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import com.google.gson.JsonSyntaxException;
import net.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.client.entity.AbstractClientPlayer;
import cc.novoline.modules.visual.Atomsphere;
import net.minecraft.init.Blocks;
import cc.novoline.modules.visual.Camera;
import net.minecraft.crash.CrashReportCategory;
import deobf.DefaultVertexFormats;
import net.minecraft.renderer.texture.DynamicTexture;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.EntityPlayerSP;
import cc.novoline.modules.visual.FullBright;
import net.minecraft.world.GameType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import cc.novoline.modules.combat.Reach;
import net.minecraft.util.ReportedException;
import deobf.Tessellator;
import net.minecraft.renderer.texture.TextureMap;
import deobf.Vec3;
import net.minecraft.multiplayer.WorldClient;
import net.minecraft.renderer.WorldRenderer;
import java.io.IOException;
import java.nio.FloatBuffer;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class EntityRenderer
implements IResourceManagerReloadListener {
    private int t = 0;
    private float U;
    private FloatBuffer J;
    private Random W = new Random();
    public aGC an;
    private long f = 0L;
    private boolean h = false;
    public boolean k = false;
    private float O;
    private int Y = 0;
    private float L = 0.0f;
    private ResourceLocation a;
    private float[] b;
    private aGQ I;
    private float ac;
    private float H;
    private static Logger V;
    private float X;
    private static ResourceLocation am;
    private float aa = 4.0f;
    private double ah = 1.0;
    private Entity Q;
    private float[] D;
    private float e;
    public static int ak;
    private int R = 0;
    private DynamicTexture ag;
    public int p = 0;
    private int B;
    private static String K = "CL_00000947";
    private aQJ ar;
    private float q;
    public static int as;
    private int ap;
    private float at;
    private boolean E = true;
    private float v = 128.0f;
    private float ae;
    private static ResourceLocation[] F;
    private float s;
    private float z = 0.0f;
    private float S = 4.0f;
    private double ao;
    private static ResourceLocation A;
    private float ab;
    private float x;
    public float P;
    private float al;
    private long af;
    private boolean G = true;
    private long r;
    private int[] M;
    private double u;
    private boolean g = false;
    private aGC[] C;
    private int N;
    private boolean o;
    public float ad;
    public ItemRenderer n;
    private boolean d;
    private float w = 1.0f;
    public static boolean c;
    private float i;
    private boolean j = false;
    private aQJ aj = new aQJ();
    private int y = 0;
    private Minecraft T;
    private aI_ aq;
    private long Z = 0L;
    private boolean m = false;
    public float ai;
    private World l = null;

    public void b(float f, long l4) {
        int n;
        ChestStealer chestStealer;
        this.m();
        DisplayInvoker.l();
        if (!(!this.T.gameSettings.O || this.T.gameSettings.Y && MouseInvoker.c(1))) {
            if (MCInvoker.a() - this.af > 500L) {
                MCInvoker.h(this.T);
            }
        } else {
            this.af = MCInvoker.a();
        }
        ProfilerInvoker.startSection(this.T.mcProfiler, IH.e);
        if (Minecraft.R && this.T.ay && !MouseInvoker.b()) {
            MouseInvoker.a(false);
            MouseInvoker.a(DisplayInvoker.getWidth() / 2, DisplayInvoker.getHeight() / 2);
            MouseInvoker.a(true);
        }
        ChestStealer chestStealer2 = chestStealer = NovolineInvoker.b(NovolineInvoker.getInstance()) ? null : (ChestStealer)ModuleInvoker.isEnable(ModuleRegistry.CHESTSTEALER);
        if (this.T.ay || ty_2.b(chestStealer)) {
            aYO.b(this.T.mouseHelper);
            float f2 = this.T.gameSettings.aw * 0.6f + 0.2f;
            float f3 = f2 * f2 * f2 * 8.0f;
            float f4 = (float)this.T.mouseHelper.b * f3;
            float f5 = (float)this.T.mouseHelper.a * f3;
            n = 1;
            if (this.T.gameSettings.l) {
                n = -1;
            }
            if (this.T.gameSettings.X) {
                this.q += f4;
                this.ae += f5;
                float f6 = f - this.O;
                this.O = f;
                f4 = this.x * f6;
                f5 = this.X * f6;
            } else {
                this.q = 0.0f;
                this.ae = 0.0f;
            }
            PlayerInvoker.a(this.T.player, f4, f5 * (float)n);
        }
        ProfilerInvoker.endSection(this.T.mcProfiler);
        if (!this.T.skipRenderWorld) {
            c = this.T.gameSettings.bV;
            ScaledResolution scaledResolution = new ScaledResolution(this.T);
            int n2 = ScaledResolutionInvoker.getScaledWidth(scaledResolution);
            int n3 = ScaledResolutionInvoker.i(scaledResolution);
            int n4 = MouseInvoker.a() * n2 / this.T.displayWidth;
            n = n3 - MouseInvoker.k() * n3 / this.T.displayHeight - 1;
            int n5 = this.T.gameSettings.bI;
            if (this.T.world != null) {
                ProfilerInvoker.startSection(this.T.mcProfiler, IH.aC);
                int n6 = MathInvoker.b(MCInvoker.O(this.T), n5);
                n6 = MathInvoker.max(n6, 60);
                long l5 = SystemInvoker.nanoTime() - l4;
                long l6 = MathInvoker.a((long)(1000000000 / n6 / 4) - l5, 0L);
                this.a(f, SystemInvoker.nanoTime() + l6);
                if (apl_1.u) {
                    jv_0.c(this.T.renderGlobal);
                    if (this.an != null && this.j) {
                        GlStateManagerInvoker.matrixMode(5890);
                        GlStateManagerInvoker.pushMatrix();
                        GlStateManagerInvoker.loadIdentity();
                        ada_2.a(this.an, f);
                        GlStateManagerInvoker.popMatrix();
                    }
                    FramebufferInvoker.bindFramebuffer(MCInvoker.c(this.T), true);
                }
                this.r = SystemInvoker.nanoTime();
                ProfilerInvoker.a(this.T.mcProfiler, IH.h);
                if (!this.T.gameSettings.g || this.T.currentScreen != null) {
                    GlStateManagerInvoker.alphaFunc(516, 0.1f);
                    GW.a(this.T.ingameGUI, f);
                    if (this.T.gameSettings.bR && !this.T.gameSettings.ar) {
                        ys_2.H();
                    }
                    if (this.T.gameSettings.ar) {
                        BY.a(scaledResolution);
                    }
                }
                ProfilerInvoker.endSection(this.T.mcProfiler);
            } else {
                GlStateManagerInvoker.viewport(0, 0, this.T.displayWidth, this.T.displayHeight);
                GlStateManagerInvoker.matrixMode(5889);
                GlStateManagerInvoker.loadIdentity();
                GlStateManagerInvoker.matrixMode(5888);
                GlStateManagerInvoker.loadIdentity();
                this.l();
                this.r = SystemInvoker.nanoTime();
                hq_0.d.i = MCInvoker.E(this.T);
            }
            if (this.T.currentScreen != null) {
                GlStateManagerInvoker.clear(256);
                try {
                    if (ayy_0.d(ail_0.u)) {
                        aDb.c(ail_0.u, new Object[]{this.T.currentScreen, P8.d(n4), P8.d(n), axx_1.a(f)});
                    } else {
                        aLW.a(this.T.currentScreen, n4, n, f);
                    }
                }
                catch (Throwable throwable) {
                    CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, IH.aw);
                    CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, IH.ac);
                    CrashReportCategoryInvoker.a(crashReportCategory, IH.r, new ue_0(this));
                    CrashReportCategoryInvoker.a(crashReportCategory, IH.ab, () -> EntityRenderer.lambda$func_181560_a$0(n4, n));
                    CrashReportCategoryInvoker.a(crashReportCategory, IH.aj, () -> this.lambda$func_181560_a$1(scaledResolution));
                    throw new ReportedException(crashReport);
                }
            }
        }
        this.j();
        this.e();
        BY.a();
        if (this.T.gameSettings.bs) {
            this.T.gameSettings.aJ = true;
        }
    }

    @Override
    public void b(aI_ aI_2) {
        if (this.an != null) {
            ada_2.a(this.an);
        }
        this.an = null;
        if (this.ap != ak) {
            this.a(F[this.ap]);
        } else {
            this.a(MCInvoker.v(this.T));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "]~G\buj-.\u000b,\u000f".toCharArray();
        int n2 = 0;
        int n3 = 21;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0xB));
            n3 = n3;
        }
    }

    public void a(Entity entity) {
        if (apl_1.u) {
            if (this.an != null) {
                ada_2.a(this.an);
            }
            this.an = null;
            if (entity instanceof nd_2) {
                this.a(new ResourceLocation(IH.l));
            } else if (entity instanceof n9_0) {
                this.a(new ResourceLocation(IH.f));
            } else if (entity instanceof nn_0) {
                this.a(new ResourceLocation(IH.am));
            } else if (ayy_0.d(ail_0.bT)) {
                aDb.f(ail_0.bT, new Object[]{entity, this});
            }
        }
    }

    private void b(float f) {
        if (MCInvoker.v(this.T) instanceof EntityPlayer) {
            EntityPlayer entityPlayer = (EntityPlayer)MCInvoker.v(this.T);
            float f2 = entityPlayer.u - entityPlayer.c;
            float f3 = -(entityPlayer.u + f2 * f);
            float f4 = entityPlayer.bn + (entityPlayer.bO - entityPlayer.bn) * f;
            float f5 = entityPlayer.a2 + (entityPlayer.ap - entityPlayer.a2) * f;
            GlStateManagerInvoker.translate(MathHelper.sin(f3 * (float)Math.PI) * f4 * 0.5f, -MathInvoker.b(MathHelper.cos(f3 * (float)Math.PI) * f4), 0.0f);
            GlStateManagerInvoker.b(MathHelper.sin(f3 * (float)Math.PI) * f4 * 3.0f, 0.0f, 0.0f, 1.0f);
            GlStateManagerInvoker.b(MathInvoker.b(MathHelper.cos(f3 * (float)Math.PI - 0.2f) * f4) * 5.0f, 1.0f, 0.0f, 0.0f);
            GlStateManagerInvoker.b(f5, 1.0f, 0.0f, 0.0f);
        }
    }

    private void a(float f, int n) {
        this.a(f, n, true, true, false);
    }

    public void a(int n, int n2) {
        if (apl_1.u) {
            if (this.an != null) {
                ada_2.a(this.an, n, n2);
            }
            jv_0.a(this.T.renderGlobal, n, n2);
        }
    }

    public void g() {
        GlStateManagerInvoker.d(apl_1.ab);
        GlStateManagerInvoker.matrixMode(5890);
        GlStateManagerInvoker.loadIdentity();
        float f = 0.00390625f;
        GlStateManagerInvoker.c(f, f, f);
        GlStateManagerInvoker.translate(8.0f, 8.0f, 8.0f);
        GlStateManagerInvoker.matrixMode(5888);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.T), this.a);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10242, (int)10496);
        GL11.glTexParameteri((int)3553, (int)10243, (int)10496);
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManagerInvoker.enableTexture2D();
        GlStateManagerInvoker.d(apl_1.S);
        if (ys_2.aC()) {
            aVE.k();
        }
    }

    private void d(float f) {
        float f2;
        float f3;
        Object object;
        float f4;
        Object object2;
        WorldClient worldClient = this.T.world;
        Entity entity = MCInvoker.v(this.T);
        float f5 = 0.25f + 0.75f * (float)this.T.gameSettings.bp / 32.0f;
        f5 = 1.0f - (float)MathInvoker.b((double)f5, 0.25);
        Vec3 vec3 = BlockInvoker.a(worldClient, MCInvoker.v(this.T), f);
        vec3 = ajT.a(vec3, (World)worldClient, MCInvoker.v(this.T), f);
        float f6 = (float)vec3.xCoord;
        float f7 = (float)vec3.yCoord;
        float f8 = (float)vec3.zCoord;
        Vec3 vec32 = BlockInvoker.h(worldClient, f);
        vec32 = ajT.a(vec32, worldClient, MCInvoker.v(this.T), f);
        this.ai = (float)vec32.xCoord;
        this.ad = (float)vec32.yCoord;
        this.P = (float)vec32.zCoord;
        if (this.T.gameSettings.bp >= 4) {
            double d = -1.0;
            object2 = MathHelper.sin(BlockInvoker.a(worldClient, f)) > 0.0f ? new Vec3(d, 0.0, 0.0) : new Vec3(1.0, 0.0, 0.0);
            f4 = (float)aNE.c(ayj_0.c(entity, f), (Vec3)object2);
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            if (f4 > 0.0f) {
                object = qq_2.b(worldClient.d, BlockInvoker.d(worldClient, f), f);
                this.ai = this.ai * (1.0f - (f4 *= object[3])) + object[0] * f4;
                this.ad = this.ad * (1.0f - f4) + object[1] * f4;
                this.P = this.P * (1.0f - f4) + object[2] * f4;
            }
        }
        this.ai += (f6 - this.ai) * f5;
        this.ad += (f7 - this.ad) * f5;
        this.P += (f8 - this.P) * f5;
        float f9 = BlockInvoker.i(worldClient, f);
        if (f9 > 0.0f) {
            f3 = 1.0f - f9 * 0.5f;
            float f10 = 1.0f - f9 * 0.4f;
            this.ai *= f3;
            this.ad *= f3;
            this.P *= f10;
        }
        if ((f3 = BlockInvoker.f(worldClient, f)) > 0.0f) {
            float f11 = 1.0f - f3 * 0.5f;
            this.ai *= f11;
            this.ad *= f11;
            this.P *= f11;
        }
        object2 = aIH.a(this.T.world, entity, f);
        if (this.o) {
            Vec3 vec33 = BlockInvoker.e(worldClient, f);
            this.ai = (float)vec33.xCoord;
            this.ad = (float)vec33.yCoord;
            this.P = (float)vec33.zCoord;
        } else if (BlocksInvoker.getBlockState((Block)object2) == Material.M) {
            f4 = (float)alf_0.b(entity) * 0.2f;
            if (entity instanceof EntityLivingBase && atn_0.b((EntityLivingBase)entity, Potion.waterBreathing)) {
                f4 = f4 * 0.3f + 0.6f;
            }
            this.ai = 0.02f + f4;
            this.ad = 0.02f + f4;
            this.P = 0.2f + f4;
            object = ajT.a((IBlockAccess)this.T.world, MCInvoker.v((Minecraft)this.T).posX, MCInvoker.v((Minecraft)this.T).posY + 1.0, MCInvoker.v((Minecraft)this.T).posZ);
            this.ai = (float)object.xCoord;
            this.ad = (float)object.yCoord;
            this.P = (float)object.zCoord;
        } else if (BlocksInvoker.getBlockState((Block)object2) == Material.e) {
            this.ai = 0.6f;
            this.ad = 0.1f;
            this.P = 0.0f;
        }
        float f12 = this.ab + (this.al - this.ab) * f;
        this.ai *= f12;
        this.ad *= f12;
        this.P *= f12;
        double d = qq_2.a(worldClient.d);
        double d2 = (entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)f) * d;
        if (entity instanceof EntityLivingBase && atn_0.b((EntityLivingBase)entity, Potion.blindness)) {
            int n = a3M.c(atn_0.a((EntityLivingBase)entity, Potion.blindness));
            d2 = n < 20 ? (d2 *= (double)(1.0f - (float)n / 20.0f)) : 0.0;
        }
        if (d2 < 1.0) {
            if (d2 < 0.0) {
                d2 = 0.0;
            }
            d2 *= d2;
            this.ai = (float)((double)this.ai * d2);
            this.ad = (float)((double)this.ad * d2);
            this.P = (float)((double)this.P * d2);
        }
        if (this.U > 0.0f) {
            float f13 = this.s + (this.U - this.s) * f;
            this.ai = this.ai * (1.0f - f13) + this.ai * 0.7f * f13;
            this.ad = this.ad * (1.0f - f13) + this.ad * 0.6f * f13;
            this.P = this.P * (1.0f - f13) + this.P * 0.6f * f13;
        }
        if (entity instanceof EntityLivingBase && atn_0.b((EntityLivingBase)entity, Potion.nightVision)) {
            float f14 = this.a((EntityLivingBase)entity, f);
            f2 = 1.0f / this.ai;
            if (f2 > 1.0f / this.ad) {
                f2 = 1.0f / this.ad;
            }
            if (f2 > 1.0f / this.P) {
                f2 = 1.0f / this.P;
            }
            this.ai = this.ai * (1.0f - f14) + this.ai * f2 * f14;
            this.ad = this.ad * (1.0f - f14) + this.ad * f2 * f14;
            this.P = this.P * (1.0f - f14) + this.P * f2 * f14;
        }
        if (this.T.gameSettings.bV) {
            float f15 = (this.ai * 30.0f + this.ad * 59.0f + this.P * 11.0f) / 100.0f;
            f2 = (this.ai * 30.0f + this.ad * 70.0f) / 100.0f;
            float f16 = (this.ai * 30.0f + this.P * 70.0f) / 100.0f;
            this.ai = f15;
            this.ad = f2;
            this.P = f16;
        }
        if (vi_2.a(ail_0.bl)) {
            Object object3 = aDb.b(ail_0.bl, new Object[]{this, entity, object2, axx_1.a(f), axx_1.a(this.ai), axx_1.a(this.ad), axx_1.a(this.P)});
            aDb.a(object3);
            this.ai = aDb.a(object3, ail_0.dw, this.ai);
            this.ad = aDb.a(object3, ail_0.b9, this.ad);
            this.P = aDb.a(object3, ail_0.aw, this.P);
        }
        a3c_0.b(this.ai, this.ad, this.P, 0.0f);
    }

    private void a(GuiMainMenu guiMainMenu) {
        try {
            Calendar calendar = afv_2.a();
            afv_2.a(calendar, new Date());
            int n = afv_2.a(calendar, 5);
            int n2 = afv_2.a(calendar, 2) + 1;
            if (n == 8 && n2 == 4) {
            }
            if (n == 14 && n2 == 8) {
            }
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private String lambda$func_181560_a$1(ScaledResolution scaledResolution) throws Exception {
        return StringInvoker.a(IH.B, new Object[]{P8.d(ScaledResolutionInvoker.getScaledWidth(scaledResolution)), P8.d(ScaledResolutionInvoker.i(scaledResolution)), P8.d(this.T.displayWidth), P8.d(this.T.displayHeight), P8.d(ScaledResolutionInvoker.getScaleFactor(scaledResolution))});
    }

    private void i(float f) {
        if (this.d) {
            ProfilerInvoker.startSection(this.T.mcProfiler, IH.aF);
            WorldClient worldClient = this.T.world;
            if (ys_2.aF() && ajT.a(worldClient, this.ac, this.M, PlayerInvoker.b(this.T.player, Potion.nightVision))) {
                arp_1.a(this.ag);
                this.d = false;
                ProfilerInvoker.endSection(this.T.mcProfiler);
                return;
            }
            float f2 = BlockInvoker.c(worldClient, 1.0f);
            float f3 = f2 * 0.95f + 0.05f;
            int n = 0;
            while (true) {
                float f4;
                float f5;
                float f6 = qq_2.g(worldClient.d)[n / 16] * f3;
                float f7 = qq_2.g(worldClient.d)[n % 16] * (this.ac * 0.1f + 1.5f);
                if (BlockInvoker.r(worldClient) > 0) {
                    f6 = qq_2.g(worldClient.d)[n / 16];
                }
                float f8 = f6 * (f2 * 0.65f + 0.35f);
                float f9 = f6 * (f2 * 0.65f + 0.35f);
                float f10 = f7 * ((f7 * 0.6f + 0.4f) * 0.6f + 0.4f);
                float f11 = f7 * (f7 * f7 * 0.6f + 0.4f);
                float f12 = f8 + f7;
                float f13 = f9 + f10;
                float f14 = f6 + f11;
                f12 = f12 * 0.96f + 0.03f;
                f13 = f13 * 0.96f + 0.03f;
                f14 = f14 * 0.96f + 0.03f;
                if (this.U > 0.0f) {
                    f5 = this.s + (this.U - this.s) * f;
                    f12 = f12 * (1.0f - f5) + f12 * 0.7f * f5;
                    f13 = f13 * (1.0f - f5) + f13 * 0.6f * f5;
                    f14 = f14 * (1.0f - f5) + f14 * 0.6f * f5;
                }
                if (qq_2.j(worldClient.d) == 1) {
                    f12 = 0.22f + f7 * 0.75f;
                    f13 = 0.28f + f10 * 0.75f;
                    f14 = 0.25f + f11 * 0.75f;
                }
                if (PlayerInvoker.b(this.T.player, Potion.nightVision) || bp_0.a((FullBright)ModuleInvoker.isEnable(ModuleRegistry.BRIGHTNESS), IH.a)) {
                    f5 = this.a(this.T.player, f);
                    f4 = 1.0f / f12;
                    if (f4 > 1.0f / f13) {
                        f4 = 1.0f / f13;
                    }
                    if (f4 > 1.0f / f14) {
                        f4 = 1.0f / f14;
                    }
                    f12 = f12 * (1.0f - f5) + f12 * f4 * f5;
                    f13 = f13 * (1.0f - f5) + f13 * f4 * f5;
                    f14 = f14 * (1.0f - f5) + f14 * f4 * f5;
                }
                if (f12 > 1.0f) {
                    f12 = 1.0f;
                }
                if (f13 > 1.0f) {
                    f13 = 1.0f;
                }
                if (f14 > 1.0f) {
                    f14 = 1.0f;
                }
                f5 = wc_1.g(ModuleInvoker.isEnable(ModuleRegistry.XRAY)) || bp_0.a((FullBright)ModuleInvoker.isEnable(ModuleRegistry.BRIGHTNESS), IH.ap) ? 10000.0f : this.T.gameSettings.aE;
                f4 = 1.0f - f12;
                float f15 = 1.0f - f13;
                float f16 = 1.0f - f14;
                f4 = 1.0f - f4 * f4 * f4 * f4;
                f15 = 1.0f - f15 * f15 * f15 * f15;
                f16 = 1.0f - f16 * f16 * f16 * f16;
                f12 = f12 * (1.0f - f5) + f4 * f5;
                f13 = f13 * (1.0f - f5) + f15 * f5;
                f14 = f14 * (1.0f - f5) + f16 * f5;
                f12 = f12 * 0.96f + 0.03f;
                f13 = f13 * 0.96f + 0.03f;
                f14 = f14 * 0.96f + 0.03f;
                if (f12 > 1.0f) {
                    f12 = 1.0f;
                }
                if (f13 > 1.0f) {
                    f13 = 1.0f;
                }
                if (f14 > 1.0f) {
                    f14 = 1.0f;
                }
                if (f12 < 0.0f) {
                    f12 = 0.0f;
                }
                if (f13 < 0.0f) {
                    f13 = 0.0f;
                }
                if (f14 < 0.0f) {
                    f14 = 0.0f;
                }
                int n2 = 255;
                int n3 = (int)(f12 * 255.0f);
                int n4 = (int)(f13 * 255.0f);
                int n5 = (int)(f14 * 255.0f);
                this.M[n] = n2 << 24 | n3 << 16 | n4 << 8 | n5;
                ++n;
            }
        }
    }

    protected void a(float f) {
        if (ayy_0.d(ail_0.aK)) {
            a9K a9K2 = this.T.world.d;
            Object object = aDb.f(a9K2, ail_0.aK, new Object[0]);
            aDb.b(object, ail_0.cu, new Object[]{axx_1.a(f), this.T.world, this.T});
            return;
        }
        float f2 = BlockInvoker.i(this.T.world, f);
        if (f2 > 0.0f) {
            if (ys_2.av()) {
                return;
            }
            this.g();
            Entity entity = MCInvoker.v(this.T);
            WorldClient worldClient = this.T.world;
            int n = MathHelper.floor_double(entity.posX);
            int n2 = MathHelper.floor_double(entity.posY);
            int n3 = MathHelper.floor_double(entity.posZ);
            Tessellator tessellator = TessellatorInvoker.getInstance();
            WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
            GlStateManagerInvoker.A();
            GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
            GlStateManagerInvoker.enableBlend();
            GlStateManagerInvoker.b(770, 771, 1, 0);
            GlStateManagerInvoker.alphaFunc(516, 0.1f);
            double d = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double)f;
            double d2 = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)f;
            double d3 = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double)f;
            int n4 = MathHelper.floor_double(d2);
            int n5 = 5;
            if (ys_2.aU()) {
                n5 = 10;
            }
            int n6 = -1;
            float f3 = (float)this.N + f;
            WorldRendererInvoker.b(worldRenderer, -d, -d2, -d3);
            if (ys_2.aU()) {
                n5 = 10;
            }
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            z6_0 z6_02 = new z6_0();
            for (int i = n3 - n5; i <= n3 + n5; ++i) {
                for (int j = n - n5; j <= n + n5; ++j) {
                    int n7 = (i - n3 + 16) * 32 + j - n + 16;
                    double d4 = (double)this.D[n7] * 0.5;
                    double d5 = (double)this.b[n7] * 0.5;
                    ain_1.a(z6_02, j, 0, i);
                    il_0 il_02 = BlockInvoker.i(worldClient, z6_02);
                    if (!hw_0.c(il_02) && !hw_0.d(il_02)) continue;
                    int n8 = amv_2.h(BlockInvoker.d(worldClient, z6_02));
                    int n9 = n2 - n5;
                    int n10 = n2 + n5;
                    if (n9 < n8) {
                        n9 = n8;
                    }
                    if (n10 < n8) {
                        n10 = n8;
                    }
                    int n11 = MathInvoker.max(n8, n4);
                    if (n9 == n10) continue;
                    a5_0.a(this.W, (long)j * (long)j * 3121L + (long)j * 45238971L ^ (long)i * (long)i * 418711L + (long)i * 13761L);
                    ain_1.a(z6_02, j, n9, i);
                    float f4 = hw_0.c(il_02, z6_02);
                    Atomsphere atomsphere = (Atomsphere)ModuleInvoker.isEnable(ModuleRegistry.ATMOSPHERE);
                    boolean bl = aS7.a(atomsphere) && (StringPropertyInvoker.isMode(aS7.b(atomsphere), IH.p) || StringPropertyInvoker.isMode(aS7.b(atomsphere), IH.ad));
                    if (aqo_0.a(BlockInvoker.a(worldClient), f4, n8) >= 0.15f) {
                        // empty if block
                    }
                    TessellatorInvoker.draw(tessellator);
                    n6 = 1;
                    TextureManagerInvoker.bindTexture(MCInvoker.E(this.T), am);
                    WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.h);
                    double d6 = ((float)(this.N & 0x1FF) + f) / 512.0f;
                    double d7 = a5_0.c(this.W) + (double)f3 * 0.01 * (double)((float)a5_0.f(this.W));
                    double d8 = a5_0.c(this.W) + (double)(f3 * (float)a5_0.f(this.W)) * 0.001;
                    double d9 = (double)((float)j + 0.5f) - entity.posX;
                    double d10 = (double)((float)i + 0.5f) - entity.posZ;
                    float f5 = MathHelper.e(d9 * d9 + d10 * d10) / (float)n5;
                    float f6 = ((1.0f - f5 * f5) * 0.3f + 0.5f) * f2;
                    ain_1.a(z6_02, j, n11, i);
                    int n12 = (BlockInvoker.a(worldClient, (BlockPos)z6_02, 0) * 3 + 0xF000F0) / 4;
                    int n13 = n12 >> 16 & 0xFFFF;
                    int n14 = n12 & 0xFFFF;
                    WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, (double)j - d4 + 0.5, n9, (double)i - d5 + 0.5), 0.0 + d7, (double)n9 * 0.25 + d6 + d8), 1.0f, 1.0f, 1.0f, f6), n13, n14));
                    WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, (double)j + d4 + 0.5, n9, (double)i + d5 + 0.5), 1.0 + d7, (double)n9 * 0.25 + d6 + d8), 1.0f, 1.0f, 1.0f, f6), n13, n14));
                    WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, (double)j + d4 + 0.5, n10, (double)i + d5 + 0.5), 1.0 + d7, (double)n10 * 0.25 + d6 + d8), 1.0f, 1.0f, 1.0f, f6), n13, n14));
                    WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, (double)j - d4 + 0.5, n10, (double)i - d5 + 0.5), 0.0 + d7, (double)n10 * 0.25 + d6 + d8), 1.0f, 1.0f, 1.0f, f6), n13, n14));
                }
            }
            TessellatorInvoker.draw(tessellator);
            WorldRendererInvoker.b(worldRenderer, 0.0, 0.0, 0.0);
            GlStateManagerInvoker.b();
            GlStateManagerInvoker.disableBlend();
            GlStateManagerInvoker.alphaFunc(516, 0.1f);
            this.s();
        }
    }

    public boolean k() {
        return apl_1.u && this.an != null;
    }

    private void a(RenderGlobal renderGlobal, float f, int n) {
        if (this.T.gameSettings.bp >= 4 && !ys_2.aN() && a3c_0.a(this.T.gameSettings)) {
            ProfilerInvoker.a(this.T.mcProfiler, IH.Z);
            GlStateManagerInvoker.matrixMode(5889);
            GlStateManagerInvoker.loadIdentity();
            awt_2.a(this.a(f, true), (float)this.T.displayWidth / (float)this.T.displayHeight, 0.05f, this.v * 4.0f);
            GlStateManagerInvoker.matrixMode(5888);
            GlStateManagerInvoker.pushMatrix();
            this.a(0, f);
            jv_0.b(renderGlobal, f, n);
            GlStateManagerInvoker.disableFog();
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.matrixMode(5889);
            GlStateManagerInvoker.loadIdentity();
            awt_2.a(this.a(f, true), (float)this.T.displayWidth / (float)this.T.displayHeight, 0.05f, this.v);
            GlStateManagerInvoker.matrixMode(5888);
        }
    }

    public EntityRenderer(Minecraft minecraft, aI_ aI_2) {
        this.ar = new aQJ();
        this.af = MCInvoker.a();
        this.D = new float[1024];
        this.b = new float[1024];
        this.J = N4.d(16);
        this.C = new aGC[10];
        this.ap = ak;
        this.T = minecraft;
        this.aq = aI_2;
        this.n = MCInvoker.S(minecraft);
        this.I = new aGQ(MCInvoker.E(minecraft));
        this.ag = new DynamicTexture(16, 16);
        this.a = TextureManagerInvoker.getDynamicTextureLocation(MCInvoker.E(minecraft), IH.o, this.ag);
        this.M = arp_1.b(this.ag);
        this.an = null;
        int n = 0;
        int n2 = 0;
        while (true) {
            float f = n2 - 16;
            float f2 = n - 16;
            float f3 = MathHelper.g(f * f + f2 * f2);
            this.D[n << 5 | n2] = -f2 / f3;
            this.b[n << 5 | n2] = f / f3;
            ++n2;
        }
    }

    public void h() {
        this.j = !this.j;
    }

    private boolean r() {
        boolean bl;
        if (!this.E) {
            return false;
        }
        Entity entity = MCInvoker.v(this.T);
        boolean bl2 = bl = entity instanceof EntityPlayer && !this.T.gameSettings.g;
        if (!aSY.g(((EntityPlayer)entity).abilities)) {
            ItemStack itemStack = a6w_0.n((EntityPlayer)entity);
            if (this.T.objectMouseOver != null && this.T.objectMouseOver.typeOfHit == net.I.BLOCK) {
                BlockPos blockPos = ObjectMouseOverInvoker.getBlockPos(this.T.objectMouseOver);
                IBlockState iBlockState = BlockInvoker.getMaterial(this.T.world, blockPos);
                Block block = BlockStateInvoker.getBlock(iBlockState);
                bl = PlayerControllerInvoker.k(this.T.playerController) == GameType.SPECTATOR ? K3.a(iBlockState) && BlockInvoker.e(this.T.world, blockPos) instanceof rs_1 : act_2.a(itemStack, block) || act_2.d(itemStack, block);
            }
        }
        return bl;
    }

    private void i() {
        this.i = (float)((double)this.i + (MathInvoker.a() - MathInvoker.a()) * MathInvoker.a() * MathInvoker.a());
        this.i = (float)((double)this.i * 0.9);
        this.ac += this.i - this.ac;
        this.d = true;
    }

    public void o() {
        if (apl_1.u && s0_0.b() == null) {
            s0_0.a();
        }
        this.n();
        this.i();
        this.ab = this.al;
        this.S = this.aa;
        if (this.T.gameSettings.X) {
            float f = this.T.gameSettings.aw * 0.6f + 0.2f;
            float f2 = f * f * f * 8.0f;
            this.x = ajc_0.a(this.aj, this.q, 0.05f * f2);
            this.X = ajc_0.a(this.ar, this.ae, 0.05f * f2);
            this.O = 0.0f;
            this.q = 0.0f;
            this.ae = 0.0f;
        } else {
            this.x = 0.0f;
            this.X = 0.0f;
            ajc_0.a(this.aj);
            ajc_0.a(this.ar);
        }
        if (MCInvoker.v(this.T) == null) {
            MCInvoker.a(this.T, this.T.player);
        }
        Entity entity = MCInvoker.v(this.T);
        double d = entity.posX;
        double d2 = entity.posY + (double)ayj_0.n(entity);
        double d3 = entity.posZ;
        float f = BlockInvoker.c(this.T.world, new BlockPos(d, d2, d3));
        float f3 = (float)this.T.gameSettings.bp / 16.0f;
        f3 = MathHelper.b(f3, 0.0f, 1.0f);
        float f4 = f * (1.0f - f3) + f3;
        this.al += (f4 - this.al) * 0.1f;
        ++this.N;
        aq__0.b(this.n);
        this.f();
        this.s = this.U;
        if (ty_1.b) {
            this.U += 0.05f;
            if (this.U > 1.0f) {
                this.U = 1.0f;
            }
            ty_1.b = false;
        } else if (this.U > 0.0f) {
            this.U -= 0.0125f;
        }
    }

    public void e(float f) {
        this.l();
        GW.a(this.T.ingameGUI, new ScaledResolution(this.T));
    }

    private FloatBuffer a(float f, float f2, float f3, float f4) {
        if (ys_2.aC()) {
            a3c_0.a(f, f2, f3);
        }
        aHB.a(this.J);
        aHB.a(aHB.a(aHB.a(aHB.a(this.J, f), f2), f3), f4);
        aHB.b(this.J);
        return this.J;
    }

    public aGC q() {
        return this.an;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void f(float f) {
        Object object;
        double d;
        double d2;
        double d3;
        float f2;
        Camera camera;
        Entity entity;
        block23: {
            entity = MCInvoker.v(this.T);
            camera = (Camera)ModuleInvoker.isEnable(ModuleRegistry.CAMERA);
            f2 = ayj_0.n(entity);
            d3 = entity.prevPosX + (entity.posX - entity.prevPosX) * (double)f;
            d2 = entity.prevPosY + (entity.posY - entity.prevPosY) * (double)f + (double)f2;
            d = entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double)f;
            if (entity instanceof EntityLivingBase && atn_0.p((EntityLivingBase)entity)) {
                f2 = (float)((double)f2 + 1.0);
                GlStateManagerInvoker.translate(0.0f, 0.3f, 0.0f);
                if (!this.T.gameSettings.bW) {
                    object = new BlockPos(entity);
                    IBlockState iBlockState = BlockInvoker.getMaterial(this.T.world, (BlockPos)object);
                    Block block = BlockStateInvoker.getBlock(iBlockState);
                    if (ayy_0.d(ail_0.a_)) {
                        aDb.c(ail_0.a_, new Object[]{this.T.world, object, iBlockState, entity});
                    } else if (block == Blocks.aw) {
                        int n = SJ.j((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, gp_2.P)));
                        GlStateManagerInvoker.b((float)(n * 90), 0.0f, 1.0f, 0.0f);
                    }
                    GlStateManagerInvoker.b(entity.prevRotationYaw + (entity.rotationYaw - entity.prevRotationYaw) * f + 180.0f, 0.0f, -1.0f, 0.0f);
                    GlStateManagerInvoker.b(entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * f, -1.0f, 0.0f, 0.0f);
                }
            } else {
                if (awu_1.f(this.T.gameSettings) > 0) {
                    double d4 = this.S + (this.aa - this.S) * f;
                    if (this.T.gameSettings.bW) {
                        GlStateManagerInvoker.translate(0.0f, 0.0f, (float)(-d4));
                        break block23;
                    } else {
                        float f3 = entity.rotationYaw;
                        float f4 = entity.rotationPitch;
                        if (awu_1.f(this.T.gameSettings) == 2) {
                            f4 += 180.0f;
                        }
                        double d5 = (double)(-MathHelper.sin(f3 / 180.0f * (float)Math.PI) * MathHelper.cos(f4 / 180.0f * (float)Math.PI)) * d4;
                        double d6 = (double)(MathHelper.cos(f3 / 180.0f * (float)Math.PI) * MathHelper.cos(f4 / 180.0f * (float)Math.PI)) * d4;
                        double d7 = (double)(-MathHelper.sin(f4 / 180.0f * (float)Math.PI)) * d4;
                        int n = 0;
                        while (true) {
                            float f5 = (n & 1) * 2 - 1;
                            float f6 = (n >> 1 & 1) * 2 - 1;
                            float f7 = (n >> 2 & 1) * 2 - 1;
                            MovingObjectPosition movingObjectPosition = BlockInvoker.a(this.T.world, new Vec3(d3 + (double)(f5 *= 0.1f), d2 + (double)(f6 *= 0.1f), d + (double)(f7 *= 0.1f)), new Vec3(d3 - d5 + (double)f5 + (double)f7, d2 - d7 + (double)f6, d - d6 + (double)f7));
                            double d8 = aNE.a(movingObjectPosition.b, new Vec3(d3, d2, d));
                            if (!(!(d8 < d4) || alf_2.f(camera) && auk_2.a((Boolean)Ba.b(alf_2.a(camera))))) {
                                d4 = d8;
                            }
                            ++n;
                        }
                    }
                }
                GlStateManagerInvoker.translate(0.0f, 0.0f, -0.1f);
            }
        }
        if (vi_2.a(ail_0.cA)) {
            if (!this.T.gameSettings.bW) {
                float f8 = entity.prevRotationYaw + (entity.rotationYaw - entity.prevRotationYaw) * f + 180.0f;
                float f9 = entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * f;
                float f10 = 0.0f;
                if (entity instanceof n5_0) {
                    n5_0 n5_02 = (n5_0)entity;
                    f8 = n5_02.aR + (n5_02.aP - n5_02.aR) * f + 180.0f;
                }
                Block block = aIH.a(this.T.world, entity, f);
                Object object2 = aDb.b(ail_0.cA, new Object[]{this, entity, block, axx_1.a(f), axx_1.a(f8), axx_1.a(f9), axx_1.a(f10)});
                aDb.a(object2);
                f10 = aDb.a(object2, ail_0.b2, f10);
                f9 = aDb.a(object2, ail_0.cj, f9);
                f8 = aDb.a(object2, ail_0.S, f8);
                GlStateManagerInvoker.b(f10, 0.0f, 0.0f, 1.0f);
                GlStateManagerInvoker.b(f9, 1.0f, 0.0f, 0.0f);
                GlStateManagerInvoker.b(f8, 0.0f, 1.0f, 0.0f);
            }
        } else if (!this.T.gameSettings.bW) {
            if (alf_2.f(camera) && alf_2.d(camera)) {
                GlStateManagerInvoker.b(entity.K, 1.0f, 0.0f, 0.0f);
            } else {
                GlStateManagerInvoker.b(entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * f, 1.0f, 0.0f, 0.0f);
            }
            if (entity instanceof n5_0) {
                object = (n5_0)entity;
                GlStateManagerInvoker.b(((n5_0)object).aR + (((n5_0)object).aP - ((n5_0)object).aR) * f + 180.0f, 0.0f, 1.0f, 0.0f);
            } else if (alf_2.f(camera) && alf_2.d(camera)) {
                GlStateManagerInvoker.b(entity.ad + 180.0f, 0.0f, 1.0f, 0.0f);
            } else {
                GlStateManagerInvoker.b(entity.prevRotationYaw + (entity.rotationYaw - entity.prevRotationYaw) * f + 180.0f, 0.0f, 1.0f, 0.0f);
            }
        }
        GlStateManagerInvoker.translate(0.0f, -f2, 0.0f);
        d3 = entity.prevPosX + (entity.posX - entity.prevPosX) * (double)f;
        d2 = entity.prevPosY + (entity.posY - entity.prevPosY) * (double)f + (double)f2;
        d = entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double)f;
        this.o = jv_0.a(this.T.renderGlobal, d3, d2, d, f);
    }

    private void f() {
        float f = BlockInvoker.i(this.T.world, 1.0f);
        if (!ys_2.aU()) {
            f /= 2.0f;
        }
        if (f != 0.0f && ys_2.au()) {
            Atomsphere atomsphere = (Atomsphere)ModuleInvoker.isEnable(ModuleRegistry.ATMOSPHERE);
            if (aS7.a(atomsphere) && (StringPropertyInvoker.isMode(aS7.b(atomsphere), IH.j) || StringPropertyInvoker.isMode(aS7.b(atomsphere), IH.at))) {
                return;
            }
            a5_0.a(this.W, (long)this.N * 312987231L);
            Entity entity = MCInvoker.v(this.T);
            WorldClient worldClient = this.T.world;
            BlockPos blockPos = new BlockPos(entity);
            int n = 10;
            double d = 0.0;
            double d2 = 0.0;
            double d3 = 0.0;
            int n2 = 0;
            int n3 = (int)(100.0f * f * f);
            if (this.T.gameSettings.br == 1) {
                n3 >>= 1;
            } else if (this.T.gameSettings.br == 2) {
                n3 = 0;
            }
            for (int i = 0; i < n3; ++i) {
                BlockPos blockPos2 = BlockInvoker.d(worldClient, amv_2.a(blockPos, a5_0.a(this.W, n) - a5_0.a(this.W, n), 0, a5_0.a(this.W, n) - a5_0.a(this.W, n)));
                il_0 il_02 = BlockInvoker.i(worldClient, blockPos2);
                BlockPos blockPos3 = amv_2.g(blockPos2);
                Block block = BlockStateInvoker.getBlock(BlockInvoker.getMaterial(worldClient, blockPos3));
                if (amv_2.h(blockPos2) > amv_2.h(blockPos) + n || amv_2.h(blockPos2) < amv_2.h(blockPos) - n || !hw_0.c(il_02) || !(hw_0.c(il_02, blockPos2) >= 0.15f)) continue;
                double d4 = a5_0.c(this.W);
                double d5 = a5_0.c(this.W);
                if (BlocksInvoker.getBlockState(block) == Material.e) {
                    BlockInvoker.a(this.T.world, B7.SMOKE_NORMAL, (double)amv_2.j(blockPos2) + d4, (double)((float)amv_2.h(blockPos2) + 0.1f) - BlocksInvoker.j(block), (double)amv_2.i(blockPos2) + d5, 0.0, 0.0, 0.0, new int[0]);
                    continue;
                }
                if (BlocksInvoker.getBlockState(block) == Material.air) continue;
                BlocksInvoker.a(block, (IBlockAccess)worldClient, blockPos3);
                if (a5_0.a(this.W, ++n2) == 0) {
                    d = (double)amv_2.j(blockPos3) + d4;
                    d2 = (double)((float)amv_2.h(blockPos3) + 0.1f) + BlocksInvoker.C(block) - 1.0;
                    d3 = (double)amv_2.i(blockPos3) + d5;
                }
                BlockInvoker.a(this.T.world, B7.WATER_DROP, (double)amv_2.j(blockPos3) + d4, (double)((float)amv_2.h(blockPos3) + 0.1f) + BlocksInvoker.C(block), (double)amv_2.i(blockPos3) + d5, 0.0, 0.0, 0.0, new int[0]);
            }
            if (a5_0.a(this.W, 3) < this.B++) {
                this.B = 0;
                if (d2 > (double)(amv_2.h(blockPos) + 1) && amv_2.h(BlockInvoker.d(worldClient, blockPos)) > MathHelper.f(amv_2.h(blockPos))) {
                    BlockInvoker.a(this.T.world, d, d2, d3, IH.ar, 0.1f, 0.5f, false);
                } else {
                    BlockInvoker.a(this.T.world, d, d2, d3, IH.N, 0.2f, 1.0f, false);
                }
            }
        }
    }

    public MovingObjectPosition a(double d, float f) {
        MovingObjectPosition movingObjectPosition = null;
        Entity entity = MCInvoker.v(this.T);
        if (this.T.world != null) {
            Entity entity2 = null;
            double d2 = d;
            movingObjectPosition = ayj_0.a(entity, d2, f);
            double d3 = d2;
            Vec3 vec3 = ayj_0.d(entity, f);
            d2 = d;
            d3 = d;
            d3 = aNE.a(movingObjectPosition.b, vec3);
            Vec3 vec32 = ayj_0.c(entity, f);
            Vec3 vec33 = aNE.a(vec3, vec32.xCoord * d2, vec32.yCoord * d2, vec32.zCoord * d2);
            entity2 = null;
            Vec3 vec34 = null;
            float f2 = 1.0f;
            List list = BlockInvoker.a(this.T.world, entity, h__0.d(h__0.a(ayj_0.u(entity), vec32.xCoord * d2, vec32.yCoord * d2, vec32.zCoord * d2), f2, f2, f2), an7_0.a(od_2.d, new ch_0(this)));
            double d4 = d3;
            Iterator iterator = ListInvoker.iterator(list);
            while (dz_0.c(iterator)) {
                Object object = dz_0.b(iterator);
                Entity entity3 = (Entity)object;
                float f3 = ayj_0.F(entity3);
                rm_2 rm_22 = h__0.d(ayj_0.u(entity3), f3, f3, f3);
                MovingObjectPosition movingObjectPosition2 = h__0.a(rm_22, vec3, vec33);
                if (h__0.a(rm_22, vec3)) {
                    if (!(d4 >= 0.0)) continue;
                    entity2 = entity3;
                    vec34 = vec3;
                    d4 = 0.0;
                    continue;
                }
                double d5 = aNE.a(vec3, movingObjectPosition2.b);
                if (!(d5 < d4) && d4 != 0.0) continue;
                if (ayy_0.d(ail_0.aI)) {
                    aDb.e(entity3, ail_0.aI, new Object[0]);
                }
                if (entity3 == entity.r) {
                    if (d4 != 0.0) continue;
                    entity2 = entity3;
                    vec34 = movingObjectPosition2.b;
                    continue;
                }
                entity2 = entity3;
                vec34 = movingObjectPosition2.b;
                d4 = d5;
            }
            if (aNE.a(vec3, vec34) > 3.0) {
                entity2 = null;
                movingObjectPosition = new MovingObjectPosition(net.I.MISS, vec34, null, new BlockPos(vec34));
            }
            if (!(d4 < d3)) {
                // empty if block
            }
            movingObjectPosition = new MovingObjectPosition(entity2, vec34);
        }
        return movingObjectPosition;
    }

    private void g(float f) {
        if (this.T.gameSettings.ar && !this.T.gameSettings.g && !PlayerInvoker.J(this.T.player) && !this.T.gameSettings.az) {
            Entity entity = MCInvoker.v(this.T);
            GlStateManagerInvoker.enableBlend();
            GlStateManagerInvoker.b(770, 771, 1, 0);
            GL11.glLineWidth((float)1.0f);
            GlStateManagerInvoker.disableTexture2D();
            GlStateManagerInvoker.c(false);
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.matrixMode(5888);
            GlStateManagerInvoker.loadIdentity();
            this.f(f);
            GlStateManagerInvoker.translate(0.0f, ayj_0.n(entity), 0.0f);
            jv_0.a(new rm_2(0.0, 0.0, 0.0, 0.005, 1.0E-4, 1.0E-4), 255, 0, 0, 255);
            jv_0.a(new rm_2(0.0, 0.0, 0.0, 1.0E-4, 1.0E-4, 0.005), 0, 0, 255, 255);
            jv_0.a(new rm_2(0.0, 0.0, 0.0, 1.0E-4, 0.0033, 1.0E-4), 0, 255, 0, 255);
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.c(true);
            GlStateManagerInvoker.enableTexture2D();
            GlStateManagerInvoker.disableBlend();
        }
    }

    public void s() {
        GlStateManagerInvoker.d(apl_1.ab);
        GlStateManagerInvoker.disableTexture2D();
        GlStateManagerInvoker.d(apl_1.S);
        if (ys_2.aC()) {
            aVE.c();
        }
    }

    private void a(int n, float f) {
        float f2;
        Entity entity = MCInvoker.v(this.T);
        this.k = false;
        GL11.glFog((int)2918, (FloatBuffer)this.a(this.ai, this.ad, this.P, 1.0f));
        GL11.glNormal3f((float)0.0f, (float)-1.0f, (float)0.0f);
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        Block block = aIH.a(this.T.world, entity, f);
        float f3 = -1.0f;
        if (ayy_0.d(ail_0.k)) {
            f3 = aDb.a(ail_0.k, new Object[]{this, entity, block, axx_1.a(f), axx_1.a(0.1f)});
        }
        int cfr_ignored_1 = (f2 = f3 - 0.0f) == 0.0f ? 0 : (f2 > 0.0f ? 1 : -1);
        if (entity instanceof EntityLivingBase && atn_0.b((EntityLivingBase)entity, Potion.blindness)) {
            float f4 = 5.0f;
            int n2 = a3M.c(atn_0.a((EntityLivingBase)entity, Potion.blindness));
            if (n2 < 20) {
                f4 = 5.0f + (this.at - 5.0f) * (1.0f - (float)n2 / 20.0f);
            }
            if (ys_2.aC()) {
                a3c_0.b(9729);
            } else {
                GlStateManagerInvoker.b(9729);
            }
            if (n == -1) {
                GlStateManagerInvoker.c(0.0f);
                GlStateManagerInvoker.a(f4 * 0.8f);
            } else {
                GlStateManagerInvoker.c(f4 * 0.25f);
                GlStateManagerInvoker.a(f4);
            }
            if (aXQ.a().GL_NV_fog_distance && ys_2.aj()) {
                GL11.glFogi((int)34138, (int)34139);
            }
        } else if (this.o) {
            if (ys_2.aC()) {
                a3c_0.b(2048);
            } else {
                GlStateManagerInvoker.b(2048);
            }
            GlStateManagerInvoker.b(0.1f);
        } else if (BlocksInvoker.getBlockState(block) == Material.M) {
            if (ys_2.aC()) {
                a3c_0.b(2048);
            } else {
                GlStateManagerInvoker.b(2048);
            }
            if (entity instanceof EntityLivingBase && atn_0.b((EntityLivingBase)entity, Potion.waterBreathing)) {
                GlStateManagerInvoker.b(0.01f);
            } else {
                GlStateManagerInvoker.b(0.1f - (float)alf_0.b(entity) * 0.03f);
            }
            if (ys_2.ae()) {
                GlStateManagerInvoker.b(0.02f);
            }
        } else if (BlocksInvoker.getBlockState(block) == Material.e) {
            if (ys_2.aC()) {
                a3c_0.b(2048);
            } else {
                GlStateManagerInvoker.b(2048);
            }
            GlStateManagerInvoker.b(2.0f);
        } else {
            float f5 = this.at;
            this.k = true;
            if (ys_2.aC()) {
                a3c_0.b(9729);
            } else {
                GlStateManagerInvoker.b(9729);
            }
            if (n == -1) {
                GlStateManagerInvoker.c(0.0f);
                GlStateManagerInvoker.a(f5);
            } else {
                GlStateManagerInvoker.c(f5 * ys_2.P());
                GlStateManagerInvoker.a(f5);
            }
            if (aXQ.a().GL_NV_fog_distance) {
                if (ys_2.aj()) {
                    GL11.glFogi((int)34138, (int)34139);
                }
                if (ys_2.T()) {
                    GL11.glFogi((int)34138, (int)34140);
                }
            }
            if (qq_2.a(this.T.world.d, (int)entity.posX, (int)entity.posZ)) {
                GlStateManagerInvoker.c(f5 * 0.05f);
                GlStateManagerInvoker.a(f5);
            }
            if (ayy_0.d(ail_0.c)) {
                aDb.c(ail_0.c, new Object[]{this, entity, block, axx_1.a(f), P8.d(n), axx_1.a(f5)});
            }
        }
        GlStateManagerInvoker.enableColorMaterial();
        GlStateManagerInvoker.z();
        GlStateManagerInvoker.a(1028, 4608);
    }

    public void p() {
        ScaledResolution scaledResolution = new ScaledResolution(this.T);
        GlStateManagerInvoker.clear(256);
        GlStateManagerInvoker.matrixMode(5889);
        GlStateManagerInvoker.loadIdentity();
        GlStateManagerInvoker.ortho(0.0, ScaledResolutionInvoker.f(scaledResolution), ScaledResolutionInvoker.c(scaledResolution), 0.0, 1000.0, 3000.0);
        GlStateManagerInvoker.matrixMode(5888);
        GlStateManagerInvoker.loadIdentity();
        GlStateManagerInvoker.translate(0.0f, 0.0f, -2000.0f);
    }

    public void l() {
        ScaledResolution scaledResolution = new ScaledResolution(this.T);
        GlStateManagerInvoker.clear(256);
        GlStateManagerInvoker.matrixMode(5889);
        GlStateManagerInvoker.loadIdentity();
        GlStateManagerInvoker.ortho(0.0, ScaledResolutionInvoker.e(scaledResolution), ScaledResolutionInvoker.d(scaledResolution), 0.0, 1000.0, 3000.0);
        GlStateManagerInvoker.matrixMode(5888);
        GlStateManagerInvoker.loadIdentity();
        GlStateManagerInvoker.translate(0.0f, 0.0f, -2000.0f);
    }

    public aGQ b() {
        return this.I;
    }

    public void b(float f, int n) {
        float f2;
        this.at = this.T.gameSettings.bp * 16;
        if (ys_2.aj()) {
            this.at *= 0.95f;
        }
        if (ys_2.T()) {
            this.at *= 0.83f;
        }
        GlStateManagerInvoker.matrixMode(5889);
        GlStateManagerInvoker.loadIdentity();
        float f3 = 0.07f;
        if (this.T.gameSettings.bV) {
            GlStateManagerInvoker.translate((float)(-(n * 2 - 1)) * f3, 0.0f, 0.0f);
        }
        this.v = this.at * 2.0f;
        if (this.v < 173.0f) {
            this.v = 173.0f;
        }
        if (qq_2.j(this.T.world.d) == 1) {
            this.v = 256.0f;
        }
        if (this.ah != 1.0) {
            GlStateManagerInvoker.translate((float)this.ao, (float)(-this.u), 0.0f);
            GlStateManagerInvoker.b(this.ah, this.ah, 1.0);
        }
        awt_2.a(this.a(f, true), (float)this.T.displayWidth / (float)this.T.displayHeight, 0.05f, this.v);
        GlStateManagerInvoker.matrixMode(5888);
        GlStateManagerInvoker.loadIdentity();
        if (this.T.gameSettings.bV) {
            GlStateManagerInvoker.translate((float)(n * 2 - 1) * 0.1f, 0.0f, 0.0f);
        }
        this.c(f);
        if (this.T.gameSettings.aR) {
            this.b(f);
        }
        if ((f2 = this.T.player.prevTimeInPortal + (this.T.player.timeInPortal - this.T.player.prevTimeInPortal) * f) > 0.0f) {
            int n2 = 20;
            if (PlayerInvoker.b(this.T.player, Potion.confusion)) {
                n2 = 7;
            }
            float f4 = 5.0f / (f2 * f2 + 5.0f) - f2 * 0.04f;
            f4 *= f4;
            GlStateManagerInvoker.b(((float)this.N + f) * (float)n2, 0.0f, 1.0f, 1.0f);
            GlStateManagerInvoker.c(1.0f / f4, 1.0f, 1.0f);
            GlStateManagerInvoker.b(-((float)this.N + f) * (float)n2, 0.0f, 1.0f, 1.0f);
        }
        this.f(f);
        if (this.m) {
            switch (this.Y) {
                case 0: {
                    GlStateManagerInvoker.b(90.0f, 0.0f, 1.0f, 0.0f);
                    break;
                }
                case 1: {
                    GlStateManagerInvoker.b(180.0f, 0.0f, 1.0f, 0.0f);
                    break;
                }
                case 2: {
                    GlStateManagerInvoker.b(-90.0f, 0.0f, 1.0f, 0.0f);
                    break;
                }
                case 3: {
                    GlStateManagerInvoker.b(90.0f, 1.0f, 0.0f, 0.0f);
                    break;
                }
                case 4: {
                    GlStateManagerInvoker.b(-90.0f, 1.0f, 0.0f, 0.0f);
                }
            }
        }
    }

    private void m() {
        if (!this.h) {
            aH3.b();
            if (ys_2.aL() == 64 && ys_2.aE() == 32) {
                ys_2.a(true);
            }
            this.h = true;
        }
        ys_2.aB();
        WorldClient worldClient = this.T.world;
        if (ys_2.j()) {
            ys_2.a(false);
            ChatComponentText chatComponentText = new ChatComponentText(I18n.format(IH.v, new Object[0]));
            kp_1.a(GW.f(this.T.ingameGUI), chatComponentText);
        }
        if (this.T.currentScreen instanceof GuiMainMenu) {
            this.a((GuiMainMenu)this.T.currentScreen);
        }
        if (this.l != worldClient) {
            aux__0.a(this.l, (World)worldClient);
            ys_2.aA();
            this.f = 0L;
            this.R = 0;
            this.l = worldClient;
        }
        if (!this.a(aVE.c1)) {
            aVE.c1 = 0;
        }
    }

    public void c() {
        if (this.an != null) {
            ada_2.a(this.an);
        }
        this.an = null;
        this.ap = ak;
    }

    private void n() {
        float f = 1.0f;
        if (MCInvoker.v(this.T) instanceof AbstractClientPlayer) {
            AbstractClientPlayer abstractClientPlayer = (AbstractClientPlayer)MCInvoker.v(this.T);
            f = aUi.r(abstractClientPlayer);
        }
        this.e = this.H;
        this.H += (f - this.H) * 0.5f;
        if (this.H > 1.5f) {
            this.H = 1.5f;
        }
        if (this.H < 0.1f) {
            this.H = 0.1f;
        }
    }

    public void d() throws IOException {
        if (OpenGlHelper.g()) {
            this.an = new agw_0(MCInvoker.E(this.T), this.aq, MCInvoker.c(this.T), new ResourceLocation(IH.aA, IH.ak));
            ada_2.a(this.an, this.T.displayWidth, this.T.displayHeight);
            this.j = true;
        }
    }

    private static String lambda$func_181560_a$0(int n, int n2) throws Exception {
        return StringInvoker.a(IH.u, new Object[]{P8.d(n), P8.d(n2), P8.d(MouseInvoker.a()), P8.d(MouseInvoker.k())});
    }

    public void a(float f, int n, boolean bl, boolean bl2, boolean bl3) {
        if (!this.m) {
            GlStateManagerInvoker.matrixMode(5889);
            GlStateManagerInvoker.loadIdentity();
            float f2 = 0.07f;
            if (this.T.gameSettings.bV) {
                GlStateManagerInvoker.translate((float)(-(n * 2 - 1)) * f2, 0.0f, 0.0f);
            }
            if (ys_2.aC()) {
                a3c_0.o();
            }
            awt_2.a(this.a(f, false), (float)this.T.displayWidth / (float)this.T.displayHeight, 0.05f, this.at * 2.0f);
            GlStateManagerInvoker.matrixMode(5888);
            GlStateManagerInvoker.loadIdentity();
            if (this.T.gameSettings.bV) {
                GlStateManagerInvoker.translate((float)(n * 2 - 1) * 0.1f, 0.0f, 0.0f);
            }
            GlStateManagerInvoker.pushMatrix();
            this.c(f);
            if (this.T.gameSettings.aR) {
                this.b(f);
            }
            boolean bl4 = MCInvoker.v(this.T) instanceof EntityLivingBase && atn_0.p((EntityLivingBase)MCInvoker.v(this.T));
            boolean bl5 = !K3.a(this.T.renderGlobal, f, n);
            if (awu_1.f(this.T.gameSettings) == 0 && !this.T.gameSettings.g && !PlayerControllerInvoker.a(this.T.playerController)) {
                this.g();
                if (ys_2.aC()) {
                    axw_2.a(this.n, f, bl3);
                } else {
                    aq__0.a(this.n, f);
                }
                this.s();
            }
            GlStateManagerInvoker.popMatrix();
            return;
        }
    }

    private void a(int n, float f, long l4) {
        EntityPlayer entityPlayer;
        ys_2.aC();
        a3c_0.a(n, f, l4);
        RenderGlobal renderGlobal = this.T.renderGlobal;
        EffectRenderer effectRenderer = this.T.effectRenderer;
        this.r();
        GlStateManagerInvoker.b();
        ProfilerInvoker.a(this.T.mcProfiler, IH.ae);
        a3c_0.a(0, 0, this.T.displayWidth, this.T.displayHeight);
        this.d(f);
        GlStateManagerInvoker.clear(16640);
        a3c_0.j();
        ProfilerInvoker.a(this.T.mcProfiler, IH.A);
        this.b(f, n);
        a3c_0.b(f);
        aIH.a(this.T.player, awu_1.f(this.T.gameSettings) == 2);
        ProfilerInvoker.a(this.T.mcProfiler, IH.ai);
        IP.a();
        ProfilerInvoker.a(this.T.mcProfiler, IH.w);
        aV1 aV12 = new aV1();
        Entity entity = MCInvoker.v(this.T);
        double d = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double)f;
        double d2 = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)f;
        double d3 = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double)f;
        axw_2.a(aV12, d, d2, d3);
        if ((ys_2.Z() || ys_2.aS() || ys_2.X()) && !aVE.ch) {
            this.a(-1, f);
            ProfilerInvoker.a(this.T.mcProfiler, IH.au);
            GlStateManagerInvoker.matrixMode(5889);
            GlStateManagerInvoker.loadIdentity();
            awt_2.a(this.a(f, true), (float)this.T.displayWidth / (float)this.T.displayHeight, 0.05f, this.v);
            GlStateManagerInvoker.matrixMode(5888);
            a3c_0.A();
            jv_0.a(renderGlobal, f, n);
            a3c_0.a();
            GlStateManagerInvoker.matrixMode(5889);
            GlStateManagerInvoker.loadIdentity();
            awt_2.a(this.a(f, true), (float)this.T.displayWidth / (float)this.T.displayHeight, 0.05f, this.v);
            GlStateManagerInvoker.matrixMode(5888);
        } else {
            GlStateManagerInvoker.disableBlend();
        }
        this.a(0, f);
        GlStateManagerInvoker.shadeModel(7425);
        if (entity.posY + (double)ayj_0.n(entity) < 128.0 + (double)(this.T.gameSettings.bt * 128.0f)) {
            this.a(renderGlobal, f, n);
        }
        ProfilerInvoker.a(this.T.mcProfiler, IH.c);
        this.a(0, f);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.T), TextureMap.r);
        ne_0.e();
        ProfilerInvoker.a(this.T.mcProfiler, IH.E);
        axw_2.a(renderGlobal, entity, f, aV12, this.p++, PlayerInvoker.B(this.T.player));
        if (n == 2) {
            ProfilerInvoker.a(this.T.mcProfiler, IH.an);
            a16.b(tb_0.a);
            jv_0.a(this.T.renderGlobal, l4);
            a16.a(tb_0.a);
        }
        ProfilerInvoker.a(this.T.mcProfiler, IH.q);
        a16.b(tb_0.C);
        if (this.T.gameSettings.bU) {
            ProfilerInvoker.a(this.T.mcProfiler, IH.z);
            GL11.glFinish();
            ProfilerInvoker.a(this.T.mcProfiler, IH.aB);
        }
        GlStateManagerInvoker.matrixMode(5888);
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.C();
        axw_2.d();
        jv_0.a(renderGlobal, a5w_0.SOLID, (double)f, n, entity);
        GlStateManagerInvoker.enableAlpha();
        axw_2.c();
        jv_0.a(renderGlobal, a5w_0.CUTOUT_MIPPED, (double)f, n, entity);
        u3_0.a(TextureManagerInvoker.b(MCInvoker.E(this.T), TextureMap.r), false, false);
        axw_2.b();
        jv_0.a(renderGlobal, a5w_0.CUTOUT, (double)f, n, entity);
        u3_0.b(TextureManagerInvoker.b(MCInvoker.E(this.T), TextureMap.r));
        axw_2.h();
        a16.a(tb_0.C);
        GlStateManagerInvoker.shadeModel(7424);
        GlStateManagerInvoker.alphaFunc(516, 0.1f);
        if (!this.m) {
            GlStateManagerInvoker.matrixMode(5888);
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.pushMatrix();
            ne_0.a();
            ProfilerInvoker.a(this.T.mcProfiler, IH.n);
            if (ayy_0.d(ail_0.bF)) {
                aDb.c(ail_0.bF, new Object[]{P8.d(0)});
            }
            jv_0.a(renderGlobal, entity, aV12, f);
            if (ayy_0.d(ail_0.bF)) {
                aDb.c(ail_0.bF, new Object[]{P8.d(-1)});
            }
            ne_0.e();
            this.s();
            GlStateManagerInvoker.matrixMode(5888);
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.pushMatrix();
            if (this.T.objectMouseOver != null && ayj_0.a(entity, Material.M)) {
                entityPlayer = (EntityPlayer)entity;
                GlStateManagerInvoker.C();
                ProfilerInvoker.a(this.T.mcProfiler, IH.Y);
                if (!(ayy_0.d(ail_0.G) && aDb.b(ail_0.G, new Object[]{renderGlobal, entityPlayer, this.T.objectMouseOver, P8.d(0), a6w_0.d(entityPlayer), axx_1.a(f)}) || this.T.gameSettings.g)) {
                    jv_0.a(renderGlobal, entityPlayer, this.T.objectMouseOver, 0, f);
                }
                GlStateManagerInvoker.enableAlpha();
            }
        }
        GlStateManagerInvoker.matrixMode(5888);
        GlStateManagerInvoker.popMatrix();
        if (this.T.objectMouseOver != null && !ayj_0.a(entity, Material.M)) {
            entityPlayer = (EntityPlayer)entity;
            GlStateManagerInvoker.C();
            ProfilerInvoker.a(this.T.mcProfiler, IH.U);
            if (!(ayy_0.d(ail_0.G) && aDb.b(ail_0.G, new Object[]{renderGlobal, entityPlayer, this.T.objectMouseOver, P8.d(0), a6w_0.d(entityPlayer), axx_1.a(f)}) || this.T.gameSettings.g)) {
                jv_0.a(renderGlobal, entityPlayer, this.T.objectMouseOver, 0, f);
            }
            GlStateManagerInvoker.enableAlpha();
        }
        if (!MapInvoker.e(renderGlobal.as)) {
            ProfilerInvoker.a(this.T.mcProfiler, IH.ah);
            GlStateManagerInvoker.enableBlend();
            GlStateManagerInvoker.b(770, 1, 1, 0);
            u3_0.a(TextureManagerInvoker.b(MCInvoker.E(this.T), TextureMap.r), false, false);
            jv_0.a(renderGlobal, TessellatorInvoker.getInstance(), TessellatorInvoker.getWorldRenderer(TessellatorInvoker.getInstance()), entity, f);
            u3_0.b(TextureManagerInvoker.b(MCInvoker.E(this.T), TextureMap.r));
            GlStateManagerInvoker.disableBlend();
        }
        GlStateManagerInvoker.b(770, 771, 1, 0);
        GlStateManagerInvoker.disableBlend();
        if (!this.m) {
            this.g();
            ProfilerInvoker.a(this.T.mcProfiler, IH.L);
            a3c_0.ab();
            ayx_2.a(effectRenderer, entity, f);
            ne_0.e();
            this.a(0, f);
            ProfilerInvoker.a(this.T.mcProfiler, IH.X);
            a3c_0.B();
            ayx_2.b(effectRenderer, entity, f);
            a3c_0.h();
            this.s();
        }
        GlStateManagerInvoker.c(false);
        GlStateManagerInvoker.b();
        ProfilerInvoker.a(this.T.mcProfiler, IH.d);
        a3c_0.c();
        this.a(f);
        a3c_0.U();
        GlStateManagerInvoker.c(true);
        jv_0.a(renderGlobal, entity, f);
        axw_2.a(this, f, n);
        a3c_0.e();
        GlStateManagerInvoker.disableBlend();
        GlStateManagerInvoker.b();
        GlStateManagerInvoker.b(770, 771, 1, 0);
        GlStateManagerInvoker.alphaFunc(516, 0.1f);
        this.a(0, f);
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.c(false);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.T), TextureMap.r);
        GlStateManagerInvoker.shadeModel(7425);
        ProfilerInvoker.a(this.T.mcProfiler, IH.m);
        a3c_0.u();
        jv_0.a(renderGlobal, a5w_0.TRANSLUCENT, (double)f, n, entity);
        a3c_0.l();
        if (ayy_0.d(ail_0.bF) && !this.m) {
            ne_0.a();
            ProfilerInvoker.a(this.T.mcProfiler, IH.aD);
            aDb.c(ail_0.bF, new Object[]{P8.d(1)});
            jv_0.a(this.T.renderGlobal, entity, aV12, f);
            GlStateManagerInvoker.b(770, 771, 1, 0);
            aDb.c(ail_0.bF, new Object[]{P8.d(-1)});
            ne_0.e();
        }
        GlStateManagerInvoker.shadeModel(7424);
        GlStateManagerInvoker.c(true);
        GlStateManagerInvoker.b();
        GlStateManagerInvoker.disableBlend();
        GlStateManagerInvoker.disableFog();
        if (entity.posY + (double)ayj_0.n(entity) >= 128.0 + (double)(this.T.gameSettings.bt * 128.0f)) {
            ProfilerInvoker.a(this.T.mcProfiler, IH.y);
            this.a(renderGlobal, f, n);
        }
        if (ayy_0.d(ail_0.bL)) {
            ProfilerInvoker.a(this.T.mcProfiler, IH.I);
            aDb.c(ail_0.bL, new Object[]{renderGlobal, axx_1.a(f)});
        }
        GL11.glPushMatrix();
        EventManagerInvoker.call(new Render3DEvent(f));
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPopMatrix();
        ProfilerInvoker.a(this.T.mcProfiler, IH.aa);
        boolean bl = K3.a(this.T.renderGlobal, f, n);
        if (this.G && !aVE.ch) {
            axw_2.c(this, f, n);
            a3c_0.I();
            GlStateManagerInvoker.clear(256);
            axw_2.b(this, f, n);
            this.g(f);
        }
        a3c_0.T();
    }

    public void a(float f, long l4) {
        this.i(f);
        if (MCInvoker.v(this.T) == null) {
            MCInvoker.a(this.T, this.T.player);
        }
        this.h(f);
        if (ys_2.aC()) {
            a3c_0.a(this.T, f, l4);
        }
        GlStateManagerInvoker.enableDepth();
        GlStateManagerInvoker.enableAlpha();
        GlStateManagerInvoker.alphaFunc(516, 0.1f);
        ProfilerInvoker.startSection(this.T.mcProfiler, IH.S);
        if (this.T.gameSettings.bV) {
            as = 0;
            GlStateManagerInvoker.a(false, true, true, false);
            this.a(0, f, l4);
            as = 1;
            GlStateManagerInvoker.a(true, false, false, false);
            this.a(1, f, l4);
            GlStateManagerInvoker.a(true, true, true, false);
        } else {
            this.a(2, f, l4);
        }
        ProfilerInvoker.endSection(this.T.mcProfiler);
    }

    private float a(float f, boolean bl) {
        Object object;
        if (this.m) {
            return 90.0f;
        }
        Entity entity = MCInvoker.v(this.T);
        float f2 = 70.0f;
        f2 = this.T.gameSettings.aD;
        if (ys_2.N()) {
            f2 *= this.e + (this.H - this.e) * f;
        }
        Camera camera = (Camera)ModuleInvoker.isEnable(ModuleRegistry.CAMERA);
        if (this.T.currentScreen == null) {
            object = this.T.gameSettings;
            awu_1.a(this.T.gameSettings.J);
        }
        if (!tf_0.j) {
            tf_0.j = true;
            this.T.gameSettings.X = true;
        }
        if (tf_0.j) {
            if (alf_2.e(camera)) {
                if (this.w < 4.0f) {
                    this.w = (float)((double)this.w + 0.01);
                }
                f2 /= this.w;
            } else {
                f2 /= 4.0f;
            }
        }
        if (entity instanceof EntityLivingBase && atn_0.c((EntityLivingBase)entity) <= 0.0f) {
            float f3 = (float)((EntityLivingBase)entity).aS + f;
            f2 /= (1.0f - 500.0f / (f3 + 500.0f)) * 2.0f + 1.0f;
        }
        if (BlocksInvoker.getBlockState((Block)(object = aIH.a(this.T.world, entity, f))) == Material.M) {
            f2 = f2 * 60.0f / 70.0f;
        }
        return f2;
    }

    private void c(float f) {
        if (MCInvoker.v(this.T) instanceof EntityLivingBase) {
            float f2;
            Camera camera = (Camera)ModuleInvoker.isEnable(ModuleRegistry.CAMERA);
            if (alf_2.f(camera) && auk_2.a((Boolean)Ba.b(alf_2.c(camera)))) {
                return;
            }
            EntityLivingBase entityLivingBase = (EntityLivingBase)MCInvoker.v(this.T);
            float f3 = (float)entityLivingBase.a8 - f;
            if (atn_0.c(entityLivingBase) <= 0.0f) {
                f2 = (float)entityLivingBase.aS + f;
                GlStateManagerInvoker.b(40.0f - 8000.0f / (f2 + 200.0f), 0.0f, 0.0f, 1.0f);
            }
            if (f3 < 0.0f) {
                return;
            }
            f3 /= (float)entityLivingBase.aB;
            f3 = MathHelper.sin(f3 * f3 * f3 * f3 * (float)Math.PI);
            f2 = entityLivingBase.aJ;
            GlStateManagerInvoker.b(-f2, 0.0f, 1.0f, 0.0f);
            GlStateManagerInvoker.b(-f3 * 14.0f, 0.0f, 0.0f, 1.0f);
            GlStateManagerInvoker.b(f2, 0.0f, 1.0f, 0.0f);
        }
    }

    public boolean a(int n) {
        if (!OpenGlHelper.g()) {
            return false;
        }
        if (this.an != null && this.an != this.C[2] && this.an != this.C[4]) {
            return true;
        }
        if (n != 2 && n != 4) {
            if (this.an != null) {
                ada_2.a(this.an);
                this.an = null;
            }
            return true;
        }
        if (this.an != null && this.an == this.C[n]) {
            return true;
        }
        if (this.T.world == null) {
            return true;
        }
        this.a(new ResourceLocation(aL0.a(aL0.c(aL0.a(new StringBuilder(), IH.M), n), IH.aE).toString()));
        this.C[n] = this.an;
        return this.j;
    }

    public float a(EntityLivingBase entityLivingBase, float f) {
        if (entityLivingBase instanceof EntityPlayerSP && bp_0.a((FullBright)ModuleInvoker.isEnable(ModuleRegistry.BRIGHTNESS), IH.D)) {
            return 1.0f;
        }
        int n = a3M.c(atn_0.a(entityLivingBase, Potion.nightVision));
        return n > 200 ? 1.0f : 0.7f + MathHelper.sin(((float)n - f) * (float)Math.PI * 0.2f) * 0.3f;
    }

    public void a() {
        if (apl_1.u && MCInvoker.v(this.T) instanceof EntityPlayer) {
            if (this.an != null) {
                ada_2.a(this.an);
            }
            this.ap = (this.ap + 1) % (F.length + 1);
            if (this.ap != ak) {
                this.a(F[this.ap]);
            } else {
                this.an = null;
            }
        }
    }

    private void j() {
        long l4;
        if (this.T.world != null && (l4 = SystemInvoker.f()) > this.Z + 10000L) {
            this.Z = l4;
            GL11.glGetError();
        }
    }

    private void e() {
        this.y = 0;
        if (ys_2.Q() && ys_2.n()) {
            if (MCInvoker.B(this.T)) {
                IntegratedServer integratedServer = MCInvoker.q(this.T);
                MCInvoker.G(this.T);
                if (!(this.T.currentScreen instanceof Rc)) {
                    if (this.t > 0) {
                        a16.b(tb_0.q);
                        ys_2.a((long)this.t);
                        a16.a(tb_0.q);
                        this.y = this.t;
                    }
                    long l4 = SystemInvoker.nanoTime() / 1000000L;
                    if (this.f != 0L && this.R != 0) {
                        long l5 = l4 - this.f;
                        if (l5 < 0L) {
                            this.f = l4;
                            l5 = 0L;
                        }
                        if (l5 >= 50L) {
                            this.f = l4;
                            int n = IntegratedServerInvoker.d(integratedServer);
                            int n2 = n - this.R;
                            this.R = n;
                            n2 = 0;
                            if (this.t < 100) {
                                this.t += 2;
                            }
                            this.R = n;
                        }
                    } else {
                        this.f = l4;
                        this.R = IntegratedServerInvoker.d(integratedServer);
                        this.z = 1.0f;
                        this.L = 50.0f;
                    }
                } else {
                    if (this.T.currentScreen instanceof Rc) {
                        ys_2.a(20L);
                    }
                    this.f = 0L;
                    this.R = 0;
                }
            }
        } else {
            this.f = 0L;
            this.R = 0;
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public void a(ResourceLocation resourceLocation) {
        if (OpenGlHelper.g()) {
            try {
                this.an = new aGC(MCInvoker.E(this.T), this.aq, MCInvoker.c(this.T), resourceLocation);
                ada_2.a(this.an, this.T.displayWidth, this.T.displayHeight);
                this.j = true;
            }
            catch (JsonSyntaxException | IOException throwable) {
                LoggerInvoker.b(V, aL0.a(aL0.a(new StringBuilder(), IH.H), resourceLocation).toString(), throwable);
                this.ap = ak;
                this.j = false;
            }
        }
    }

    public void h(float f) {
        Entity entity = MCInvoker.v(this.T);
        if (this.T.world != null) {
            ProfilerInvoker.startSection(this.T.mcProfiler, IH.F);
            this.T.E = null;
            double d = PlayerControllerInvoker.b(this.T.playerController);
            this.T.objectMouseOver = ayj_0.a(entity, d, f);
            double d2 = d;
            Vec3 vec3 = ayj_0.d(entity, f);
            Reach reach = (Reach)ModuleInvoker.isEnable(ModuleRegistry.REACH);
            if (aW4.b(reach)) {
                d2 = d;
            } else if (PlayerControllerInvoker.e(this.T.playerController)) {
                d = 6.0;
                d2 = 6.0;
            } else if (d > 3.0) {
                // empty if block
            }
            if (this.T.objectMouseOver != null) {
                d2 = aNE.a(this.T.objectMouseOver.b, vec3);
            }
            Vec3 vec32 = ayj_0.c(entity, f);
            Vec3 vec33 = aNE.a(vec3, vec32.xCoord * d, vec32.yCoord * d, vec32.zCoord * d);
            this.Q = null;
            Vec3 vec34 = null;
            float f2 = 1.0f;
            List list = BlockInvoker.a(this.T.world, entity, h__0.d(h__0.a(ayj_0.u(entity), vec32.xCoord * d, vec32.yCoord * d, vec32.zCoord * d), f2, f2, f2), an7_0.a(od_2.d, new ch_0(this)));
            double d3 = d2;
            Iterator iterator = ListInvoker.iterator(list);
            while (dz_0.c(iterator)) {
                Object object = dz_0.b(iterator);
                Entity entity2 = (Entity)object;
                float f3 = ayj_0.F(entity2);
                rm_2 rm_22 = h__0.d(ayj_0.u(entity2), f3, f3, f3);
                MovingObjectPosition movingObjectPosition = h__0.a(rm_22, vec3, vec33);
                if (h__0.a(rm_22, vec3)) {
                    if (!(d3 >= 0.0)) continue;
                    this.Q = entity2;
                    vec34 = vec3;
                    d3 = 0.0;
                    continue;
                }
                double d4 = aNE.a(vec3, movingObjectPosition.b);
                if (!(d4 < d3) && d3 != 0.0) continue;
                if (ayy_0.d(ail_0.aI)) {
                    aDb.e(entity2, ail_0.aI, new Object[0]);
                }
                if (entity2 == entity.r) {
                    if (d3 != 0.0) continue;
                    this.Q = entity2;
                    vec34 = movingObjectPosition.b;
                    continue;
                }
                this.Q = entity2;
                vec34 = movingObjectPosition.b;
                d3 = d4;
            }
            if (this.Q != null && aNE.a(vec3, vec34) > 3.0) {
                this.Q = null;
                this.T.objectMouseOver = new MovingObjectPosition(net.I.MISS, vec34, null, new BlockPos(vec34));
            }
            if (this.Q != null && (d3 < d2 || this.T.objectMouseOver == null)) {
                this.T.objectMouseOver = new MovingObjectPosition(this.Q, vec34);
                if (this.Q instanceof EntityLivingBase || this.Q instanceof no_2) {
                    this.T.E = this.Q;
                }
            }
            ProfilerInvoker.endSection(this.T.mcProfiler);
        }
    }
}


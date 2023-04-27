/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.crash.CrashReportCategory;
import deobf.DefaultVertexFormats;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.FontRenderer;
import deobf.GameSettings;
import net.minecraft.renderer.entity.RenderItem;
import net.minecraft.util.ReportedException;
import deobf.Tessellator;
import deobf.Vec3;
import net.minecraft.renderer.WorldRenderer;
import java.util.Map;

public class RenderManager {
    public double m;
    private boolean d = true;
    public Map i = MapsInvoker.a();
    public float l;
    private boolean a = false;
    public GameSettings u;
    public double h;
    public kj_2 c;
    private Map f = MapsInvoker.a();
    public double n;
    public Entity r;
    private FontRenderer g;
    public TextureManager e;
    public float b;
    public double k;
    public double s;
    private static String q = "CL_00000991";
    public Entity p;
    public World o;
    private boolean t = false;
    public double j;

    public FontRenderer d() {
        return this.g;
    }

    public void a(Map map) {
        this.i = map;
    }

    public boolean a(Entity entity, ao7_0 ao7_02, double d, double d2, double d3) {
        j7_0<?> j7_02 = this.a(entity);
        return j7_02.a(entity, ao7_02, d, d2, d3);
    }

    public void a(boolean bl) {
        this.d = bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(Entity entity, double d, double d2, double d3, float f, float f2, boolean bl) {
        j7_0<?> j7_02 = null;
        try {
            j7_02 = this.a(entity);
            if (this.e == null) return;
        }
        catch (Throwable throwable) {
            CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, MC.b);
            CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, MC.g);
            ayj_0.a(entity, crashReportCategory);
            CrashReportCategory crashReportCategory2 = CrashInvoker.a(crashReport, MC.l);
            CrashReportCategoryInvoker.addCrashSection(crashReportCategory2, MC.j, j7_02);
            CrashReportCategoryInvoker.addCrashSection(crashReportCategory2, MC.d, CrashReportCategoryInvoker.a(d, d2, d3));
            CrashReportCategoryInvoker.addCrashSection(crashReportCategory2, MC.k, axx_1.a(f));
            CrashReportCategoryInvoker.addCrashSection(crashReportCategory2, MC.f, axx_1.a(f2));
            throw new ReportedException(crashReport);
        }
        if (j7_02 instanceof jg_1) {
            ((jg_1)j7_02).a(this.a);
        }
        try {
            CP.a(j7_02, entity, d, d2, d3, f, f2);
        }
        catch (Throwable throwable) {
            throw new ReportedException(CrashInvoker.makeCrashReport(throwable, MC.a));
        }
        try {
            if (!this.a) {
                CP.b(j7_02, entity, d, d2, d3, f, f2);
            }
        }
        catch (Throwable throwable) {
            throw new ReportedException(CrashInvoker.makeCrashReport(throwable, MC.e));
        }
        if (!this.t || ayj_0.L(entity)) return;
        try {
            this.a(entity, d, d2, d3, f, f2);
            return;
        }
        catch (Throwable throwable) {
            throw new ReportedException(CrashInvoker.makeCrashReport(throwable, MC.i));
        }
    }

    public void a(Entity entity, float f) {
        double d = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double)f;
        double d2 = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)f;
        double d3 = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double)f;
        j7_0<?> j7_02 = this.a(entity);
        if (this.e != null) {
            int n = ayj_0.b(entity, f);
            int n2 = n % 65536;
            int n3 = n / 65536;
            OpenGlHelper.a(apl_1.ab, n2, (float)n3);
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            j7_02.a(entity, d - this.s, d2 - this.h, d3 - this.m);
        }
    }

    public void a(World world) {
        this.o = world;
    }

    public boolean e() {
        return this.t;
    }

    public double b(double d, double d2, double d3) {
        double d4 = d - this.k;
        double d5 = d2 - this.n;
        double d6 = d3 - this.j;
        return d4 * d4 + d5 * d5 + d6 * d6;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "eFnKc\u0003A\u00163\bJ".toCharArray();
        int n2 = 0;
        int n3 = 69;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x63));
            n3 = n3;
        }
    }

    public RenderManager(TextureManager textureManager, RenderItem renderItem) {
        this.e = textureManager;
        MapInvoker.c(this.i, nh_0.class, new j1_0(this));
        MapInvoker.c(this.i, n9_0.class, new jb_2(this));
        MapInvoker.c(this.i, nh_1.class, new j__0(this, new ro_1(), 0.7f));
        MapInvoker.c(this.i, ne_1.class, new jw_2(this, new rf_1(), 0.7f));
        MapInvoker.c(this.i, na_2.class, new jz_2(this, new re_1(), 0.7f));
        MapInvoker.c(this.i, nr_1.class, new jm_2(this, new re_1(), 0.7f));
        MapInvoker.c(this.i, nf_1.class, new k6_0(this, new rs_0(), 0.5f));
        MapInvoker.c(this.i, nd_1.class, new je_2(this, new rn_2(), 0.3f));
        MapInvoker.c(this.i, nb_1.class, new j0_0(this, new rh_1(), 0.4f));
        MapInvoker.c(this.i, ng_1.class, new jc_1(this, new rz_1(), 0.3f));
        MapInvoker.c(this.i, ns_1.class, new js_2(this));
        MapInvoker.c(this.i, ni_2.class, new ji_2(this));
        MapInvoker.c(this.i, nd_2.class, new jt_2(this));
        MapInvoker.c(this.i, nn_0.class, new jn_0(this));
        MapInvoker.c(this.i, nq_2.class, new jk_0(this));
        MapInvoker.c(this.i, nM.class, new jp_1(this));
        MapInvoker.c(this.i, nm_0.class, new kl_2(this));
        MapInvoker.c(this.i, nt_2.class, new jq_2(this));
        MapInvoker.c(this.i, n__0.class, new jz_1(this));
        MapInvoker.c(this.i, n0_0.class, new jf_2(this));
        MapInvoker.c(this.i, ny_1.class, new jy_1(this, new rz_2(16), 0.25f));
        MapInvoker.c(this.i, nk_1.class, new jh_0(this));
        MapInvoker.c(this.i, n8_0.class, new jx_1(this, new ru_1(), 0.5f, 6.0f));
        MapInvoker.c(this.i, nw_1.class, new j8_0(this));
        MapInvoker.c(this.i, nJ.class, new jt_1(this, new rn_1(), 0.7f));
        MapInvoker.c(this.i, nz_0.class, new jj_1(this));
        MapInvoker.c(this.i, nf_2.class, new j9_0(this));
        MapInvoker.c(this.i, n1_0.class, new jb_1(this));
        MapInvoker.c(this.i, nx_1.class, new js_1(this));
        MapInvoker.c(this.i, ns_2.class, new jd_1(this));
        MapInvoker.c(this.i, ox_2.class, new kw_0(this));
        MapInvoker.c(this.i, nz_1.class, new ky_1(this));
        MapInvoker.c(this.i, Entity.class, new jg_2(this));
        MapInvoker.c(this.i, nk_2.class, new jd_0(this));
        MapInvoker.c(this.i, no_2.class, new kv_2(this, renderItem));
        MapInvoker.c(this.i, nn_1.class, new j2(this));
        MapInvoker.c(this.i, EntityArrow.class, new jq_1(this));
        MapInvoker.c(this.i, oq_2.class, new ja_2(this, Items.snowball, renderItem));
        MapInvoker.c(this.i, of_1.class, new ja_2(this, Items.ender_pearl, renderItem));
        MapInvoker.c(this.i, o7_0.class, new ja_2(this, Items.ender_eye, renderItem));
        MapInvoker.c(this.i, op_1.class, new ja_2(this, Items.egg, renderItem));
        MapInvoker.c(this.i, of_2.class, new jr_1(this, renderItem));
        MapInvoker.c(this.i, oz_1.class, new ja_2(this, Items.experience_bottle, renderItem));
        MapInvoker.c(this.i, oi_1.class, new ja_2(this, Items.fireworks, renderItem));
        MapInvoker.c(this.i, oh_2.class, new jo_1(this, 2.0f));
        MapInvoker.c(this.i, oG.class, new jo_1(this, 0.5f));
        MapInvoker.c(this.i, oe_1.class, new kv_1(this));
        MapInvoker.c(this.i, og_0.class, new jc_2(this, renderItem));
        MapInvoker.c(this.i, oa_2.class, new jh_1(this));
        MapInvoker.c(this.i, od_1.class, new ja_1(this));
        MapInvoker.c(this.i, oq_1.class, new jn_1(this));
        MapInvoker.c(this.i, ol_2.class, new je_1(this));
        MapInvoker.c(this.i, o5_0.class, new j5_0(this));
        MapInvoker.c(this.i, oo_2.class, new j4_0(this));
        MapInvoker.c(this.i, EntityMinecart.class, new ju_1(this));
        MapInvoker.c(this.i, EntityBoat.class, new ji_1(this));
        MapInvoker.c(this.i, oo_1.class, new jk_1(this));
        MapInvoker.c(this.i, na_1.class, new jm_1(this, new r5_0(), 0.75f));
        MapInvoker.c(this.i, ou_2.class, new jl_1(this));
        this.c = new kj_2(this);
        MapInvoker.c(this.f, MC.c, this.c);
        MapInvoker.c(this.f, MC.h, new kj_2(this, true));
        aQD.a(this.f);
        if (ayy_0.d(ail_0.bf)) {
            aDb.f(ail_0.bf, new Object[]{this.i});
        }
    }

    public void b(Entity entity, double d, double d2, double d3, float f, float f2) {
        this.a(entity, d, d2, d3, f, f2, false);
    }

    public boolean a() {
        return this.d;
    }

    public Map c() {
        return this.i;
    }

    public void a(double d, double d2, double d3) {
        this.s = d;
        this.h = d2;
        this.m = d3;
    }

    public j7_0 a(Class clazz) {
        j7_0 j7_02 = (j7_0)MapInvoker.c(this.i, clazz);
        if (clazz != Entity.class) {
            j7_02 = this.a(ara_2.a(clazz));
            MapInvoker.c(this.i, clazz, j7_02);
        }
        return j7_02;
    }

    public j7_0<?> a(Entity entity) {
        if (entity instanceof AbstractClientPlayer) {
            String string = aUi.n((AbstractClientPlayer)entity);
            kj_2 kj_22 = (kj_2)MapInvoker.c(this.f, string);
            return kj_22;
        }
        return this.a(entity.getClass());
    }

    public void b(Entity entity, float f) {
        this.a(entity, f, false);
    }

    public void c(boolean bl) {
        this.a = bl;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public Map<String, kj_2> b() {
        return asg_0.a(this.f);
    }

    public void a(float f) {
        this.l = f;
    }

    public void b(boolean bl) {
        this.t = bl;
    }

    private void a(Entity entity, double d, double d2, double d3, float f, float f2) {
        GlStateManagerInvoker.c(false);
        GlStateManagerInvoker.disableTexture2D();
        GlStateManagerInvoker.disableLighting();
        GlStateManagerInvoker.A();
        GlStateManagerInvoker.disableBlend();
        float f3 = entity.width / 2.0f;
        rm_2 rm_22 = ayj_0.u(entity);
        rm_2 rm_23 = new rm_2(rm_22.e - entity.posX + d, rm_22.a - entity.posY + d2, rm_22.f - entity.posZ + d3, rm_22.b - entity.posX + d, rm_22.c - entity.posY + d2, rm_22.d - entity.posZ + d3);
        jv_0.a(rm_23, 255, 255, 255, 255);
        if (entity instanceof EntityLivingBase) {
            float f4 = 0.01f;
            jv_0.a(new rm_2(d - (double)f3, d2 + (double)ayj_0.n(entity) - (double)0.01f, d3 - (double)f3, d + (double)f3, d2 + (double)ayj_0.n(entity) + (double)0.01f, d3 + (double)f3), 255, 0, 0, 255);
        }
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        Vec3 vec3 = ayj_0.c(entity, f2);
        WorldRendererInvoker.begin(worldRenderer, 3, DefaultVertexFormats.d);
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, d, d2 + (double)ayj_0.n(entity), d3), 0, 0, 255, 255));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, d + vec3.xCoord * 2.0, d2 + (double)ayj_0.n(entity) + vec3.yCoord * 2.0, d3 + vec3.zCoord * 2.0), 0, 0, 255, 255));
        TessellatorInvoker.draw(tessellator);
        GlStateManagerInvoker.enableTexture2D();
        GlStateManagerInvoker.D();
        GlStateManagerInvoker.b();
        GlStateManagerInvoker.disableBlend();
        GlStateManagerInvoker.c(true);
    }

    public void a(World world, FontRenderer fontRenderer, Entity entity, Entity entity2, GameSettings gameSettings, float f) {
        this.o = world;
        this.u = gameSettings;
        this.r = entity;
        this.p = entity2;
        this.g = fontRenderer;
        if (entity instanceof EntityLivingBase && atn_0.p((EntityLivingBase)entity)) {
            IBlockState iBlockState = aV8.q(world, new BlockPos(entity));
            Block block = BlockStateInvoker.getBlock(iBlockState);
            if (aDb.b(ail_0.ba, new Object[]{world, new BlockPos(entity), entity})) {
                EnumFacing enumFacing = (EnumFacing)aDb.f(block, ail_0.aF, new Object[]{world, new BlockPos(entity)});
                int n = SJ.j(enumFacing);
                this.l = n * 90 + 180;
                this.b = 0.0f;
            } else if (block == Blocks.aw) {
                int n = SJ.j((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, gp_2.P)));
                this.l = n * 90 + 180;
                this.b = 0.0f;
            }
        } else {
            this.l = entity.prevRotationYaw + (entity.rotationYaw - entity.prevRotationYaw) * f;
            this.b = entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * f;
        }
        if (awu_1.f(gameSettings) == 2) {
            this.l += 180.0f;
        }
        this.k = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double)f;
        this.n = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)f;
        this.j = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double)f;
    }

    public void a(Entity entity, float f, boolean bl) {
        if (entity.ticksExisted == 0) {
            entity.lastTickPosX = entity.posX;
            entity.lastTickPosY = entity.posY;
            entity.lastTickPosZ = entity.posZ;
        }
        double d = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double)f;
        double d2 = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)f;
        double d3 = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double)f;
        float f2 = entity.prevRotationYaw + (entity.rotationYaw - entity.prevRotationYaw) * f;
        int n = ayj_0.b(entity, f);
        if (ayj_0.v(entity)) {
            n = 0xF000F0;
        }
        int n2 = n % 65536;
        int n3 = n / 65536;
        OpenGlHelper.a(apl_1.ab, n2, (float)n3);
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.a(entity, d - this.s, d2 - this.h, d3 - this.m, f2, f, bl);
    }
}


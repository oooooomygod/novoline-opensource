/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import net.minecraft.crash.CrashReportCategory;
import deobf.DefaultVertexFormats;
import deobf.Entity;
import deobf.IBlockAccess;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.ReportedException;
import deobf.Tessellator;
import net.minecraft.renderer.WorldRenderer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public class EffectRenderer {
    private static String b = "CL_00000915";
    private List[][] a = new CopyOnWriteArrayList[4][];
    protected World h;
    private Random d;
    private TextureManager c;
    private static ResourceLocation g;
    private List<np_2> f = new CopyOnWriteArrayList<np_2>();
    private Map e;

    public void a(Entity entity, float f) {
        float f2 = MathHelper.cos(entity.rotationYaw * ((float)Math.PI / 180));
        float f3 = MathHelper.sin(entity.rotationYaw * ((float)Math.PI / 180));
        float f4 = -f3 * MathHelper.sin(entity.rotationPitch * ((float)Math.PI / 180));
        float f5 = f2 * MathHelper.sin(entity.rotationPitch * ((float)Math.PI / 180));
        float f6 = MathHelper.cos(entity.rotationPitch * ((float)Math.PI / 180));
        int n = 0;
        while (true) {
            List list;
            if (!ListInvoker.isEmpty(list = this.a[3][n])) {
                Tessellator tessellator = TessellatorInvoker.getInstance();
                WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
                for (int i = 0; i < ListInvoker.size(list); ++i) {
                    mi_1 mi_12 = (mi_1)ListInvoker.get(list, i);
                    lz_2.a(mi_12, worldRenderer, entity, f, f2, f6, f3, f4, f5);
                }
            }
            ++n;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "`^\u000fR-t\u0015\u0013+aW".toCharArray();
        int n2 = 0;
        int n3 = 115;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x50));
            n3 = n3;
        }
    }

    public void b(Entity entity, float f) {
        int n;
        float f2 = aIH.a();
        float f3 = aIH.c();
        float f4 = aIH.b();
        float f5 = aIH.e();
        float f6 = aIH.d();
        mi_1.aj = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double)f;
        mi_1.ap = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)f;
        mi_1.aw = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double)f;
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.b(770, 771);
        GlStateManagerInvoker.alphaFunc(516, 0.003921569f);
        int n2 = n = 0;
        int n3 = 0;
        while (true) {
            if (!ListInvoker.isEmpty(this.a[n2][n3])) {
                GlStateManagerInvoker.c(false);
                TextureManagerInvoker.bindTexture(this.c, g);
                GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
                Tessellator tessellator = TessellatorInvoker.getInstance();
                WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
                WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.h);
                for (int i = 0; i < ListInvoker.size(this.a[n2][n3]); ++i) {
                    mi_1 mi_12 = (mi_1)ListInvoker.get(this.a[n2][n3], i);
                    try {
                        lz_2.a(mi_12, worldRenderer, entity, f, f2, f6, f3, f4, f5);
                        continue;
                    }
                    catch (Throwable throwable) {
                        CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, EC.j);
                        CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, EC.i);
                        CrashReportCategoryInvoker.a(crashReportCategory, EC.r, mi_12::toString);
                        CrashReportCategoryInvoker.a(crashReportCategory, EC.l, () -> EffectRenderer.lambda$renderParticles$1(n2));
                        throw new ReportedException(crashReport);
                    }
                }
                TessellatorInvoker.draw(tessellator);
            }
            ++n3;
        }
    }

    private static String lambda$tickParticle$0(int n) throws Exception {
        return EC.p;
    }

    public void a(mi_1 mi_12) {
        this.a(mi_12, 0, 1);
    }

    public String c() {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        while (true) {
            n += ListInvoker.size(this.a[n2][n3]);
            ++n3;
        }
    }

    private boolean a(mi_1 mi_12, List<mi_1> list) {
        Iterator iterator = ListInvoker.iterator(list);
        while (dz_0.c(iterator)) {
            mi_1 mi_13 = (mi_1)dz_0.b(iterator);
            if (!(mi_13 instanceof m8_0) || mi_12.posX != mi_13.posX || mi_12.posY != mi_13.posY || mi_12.posZ != mi_13.posZ) continue;
            mi_13.ay = 0;
            return true;
        }
        return false;
    }

    public void a(int n, a9z_0 a9z_02) {
        MapInvoker.c(this.e, P8.d(n), a9z_02);
    }

    public void a(Entity entity, B7 b7) {
        ListInvoker.add(this.f, new np_2(this.h, entity, b7));
    }

    public void a(BlockPos blockPos, MovingObjectPosition movingObjectPosition) {
        Block block = BlockStateInvoker.getBlock(aV8.q(this.h, blockPos));
        aDb.e(block, ail_0.cL, new Object[]{this.h, movingObjectPosition, this});
        this.a(blockPos, movingObjectPosition.facing);
    }

    public void d(mi_1 mi_12) {
        this.a(mi_12, 1, 0);
    }

    private void a(mi_1 mi_12, int n, int n2) {
        int n3 = 0;
        while (true) {
            if (ListInvoker.contains(this.a[n3][n], mi_12)) {
                ListInvoker.remove(this.a[n3][n], mi_12);
                ListInvoker.add(this.a[n3][n2], mi_12);
            }
            ++n3;
        }
    }

    public EffectRenderer(World world, TextureManager textureManager) {
        this.d = new Random();
        this.e = new HashMap();
        this.h = world;
        this.c = textureManager;
        int n = 0;
        this.a[n] = new CopyOnWriteArrayList[2];
        int n2 = 0;
        while (true) {
            this.a[n][n2] = new CopyOnWriteArrayList();
            ++n2;
        }
    }

    public void b() {
        int n = 0;
        while (true) {
            this.a(n);
            ++n;
        }
    }

    private static String lambda$renderParticles$1(int n) throws Exception {
        return EC.h;
    }

    public void b(mi_1 mi_12) {
        if (!(mi_12 instanceof my_1) || ys_2.ay()) {
            int n;
            int n2 = lz_2.e(mi_12);
            int n3 = n = lz_2.a(mi_12) != 1.0f ? 0 : 1;
            if (ListInvoker.size(this.a[n2][n]) >= 4000) {
                ListInvoker.remove(this.a[n2][n], 0);
            }
            if (!(mi_12 instanceof m8_0) || !this.a(mi_12, this.a[n2][n])) {
                ListInvoker.add(this.a[n2][n], mi_12);
            }
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private void a(int n) {
        int n2 = 0;
        while (true) {
            this.a(this.a[n][n2]);
            ++n2;
        }
    }

    public mi_1 a(int n, double d, double d2, double d3, double d4, double d5, double d6, int ... nArray) {
        a9z_0 a9z_02 = (a9z_0)MapInvoker.c(this.e, P8.d(n));
        mi_1 mi_12 = avc_1.a(a9z_02, n, this.h, d, d2, d3, d4, d5, d6, nArray);
        this.b(mi_12);
        return mi_12;
    }

    private void c(mi_1 mi_12) {
        try {
            lz_2.f(mi_12);
            return;
        }
        catch (Throwable throwable) {
            CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, EC.d);
            CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, EC.e);
            int n = lz_2.e(mi_12);
            CrashReportCategoryInvoker.a(crashReportCategory, EC.f, mi_12::toString);
            CrashReportCategoryInvoker.a(crashReportCategory, EC.o, () -> EffectRenderer.lambda$tickParticle$0(n));
            throw new ReportedException(crashReport);
        }
    }

    public void a(BlockPos blockPos, EnumFacing enumFacing) {
        IBlockState iBlockState = aV8.q(this.h, blockPos);
        Block block = BlockStateInvoker.getBlock(iBlockState);
        if (BlocksInvoker.y(block) != -1) {
            int n = amv_2.j(blockPos);
            int n2 = amv_2.h(blockPos);
            int n3 = amv_2.i(blockPos);
            float f = 0.1f;
            double d = (double)n + a5_0.c(this.d) * (BlocksInvoker.a(block) - BlocksInvoker.B(block) - (double)(f * 2.0f)) + (double)f + BlocksInvoker.B(block);
            double d2 = (double)n2 + a5_0.c(this.d) * (BlocksInvoker.C(block) - BlocksInvoker.j(block) - (double)(f * 2.0f)) + (double)f + BlocksInvoker.j(block);
            double d3 = (double)n3 + a5_0.c(this.d) * (BlocksInvoker.h(block) - BlocksInvoker.u(block) - (double)(f * 2.0f)) + (double)f + BlocksInvoker.u(block);
            if (enumFacing == EnumFacing.DOWN) {
                d2 = (double)n2 + BlocksInvoker.j(block) - (double)f;
            }
            if (enumFacing == EnumFacing.UP) {
                d2 = (double)n2 + BlocksInvoker.C(block) + (double)f;
            }
            if (enumFacing == EnumFacing.NORTH) {
                d3 = (double)n3 + BlocksInvoker.u(block) - (double)f;
            }
            if (enumFacing == EnumFacing.SOUTH) {
                d3 = (double)n3 + BlocksInvoker.h(block) + (double)f;
            }
            if (enumFacing == EnumFacing.WEST) {
                d = (double)n + BlocksInvoker.B(block) - (double)f;
            }
            if (enumFacing == EnumFacing.EAST) {
                d = (double)n + BlocksInvoker.a(block) + (double)f;
            }
            this.b(lz_2.a(aOT.a(aOT.a(new mm_2(this.h, d, d2, d3, 0.0, 0.0, 0.0, iBlockState), blockPos), 0.2f), 0.6f));
        }
    }

    private void a() {
        this.a(aYK.d(B7.EXPLOSION_NORMAL), new wi_0());
        this.a(aYK.d(B7.WATER_BUBBLE), new VP());
        this.a(aYK.d(B7.WATER_SPLASH), new aa0_0());
        this.a(aYK.d(B7.WATER_WAKE), new avl_0());
        this.a(aYK.d(B7.WATER_DROP), new aPG());
        this.a(aYK.d(B7.SUSPENDED), new aBB());
        this.a(aYK.d(B7.SUSPENDED_DEPTH), new ts_0());
        this.a(aYK.d(B7.CRIT), new tc_1());
        this.a(aYK.d(B7.CRIT_MAGIC), new aS9());
        this.a(aYK.d(B7.SMOKE_NORMAL), new ge_0());
        this.a(aYK.d(B7.SMOKE_LARGE), new EO());
        this.a(aYK.d(B7.SPELL), new HQ());
        this.a(aYK.d(B7.SPELL_INSTANT), new ag7_0());
        this.a(aYK.d(B7.SPELL_MOB), new afz_2());
        this.a(aYK.d(B7.SPELL_MOB_AMBIENT), new x3_0());
        this.a(aYK.d(B7.SPELL_WITCH), new afu_0());
        this.a(aYK.d(B7.DRIP_WATER), new ard_1());
        this.a(aYK.d(B7.DRIP_LAVA), new a4G());
        this.a(aYK.d(B7.VILLAGER_ANGRY), new an1_0());
        this.a(aYK.d(B7.VILLAGER_HAPPY), new za_1());
        this.a(aYK.d(B7.TOWN_AURA), new ts_0());
        this.a(aYK.d(B7.NOTE), new IF());
        this.a(aYK.d(B7.PORTAL), new IY());
        this.a(aYK.d(B7.ENCHANTMENT_TABLE), new akb_2());
        this.a(aYK.d(B7.FLAME), new c2_0());
        this.a(aYK.d(B7.LAVA), new ub_2());
        this.a(aYK.d(B7.FOOTSTEP), new YW());
        this.a(aYK.d(B7.CLOUD), new a6N());
        this.a(aYK.d(B7.REDSTONE), new aP6());
        this.a(aYK.d(B7.SNOWBALL), new atE());
        this.a(aYK.d(B7.SNOW_SHOVEL), new uv_0());
        this.a(aYK.d(B7.SLIME), new GF());
        this.a(aYK.d(B7.HEART), new sw_1());
        this.a(aYK.d(B7.BARRIER), new a81());
        this.a(aYK.d(B7.ITEM_CRACK), new a6V());
        this.a(aYK.d(B7.BLOCK_CRACK), new asv_2());
        this.a(aYK.d(B7.BLOCK_DUST), new aFK());
        this.a(aYK.d(B7.EXPLOSION_HUGE), new a5U());
        this.a(aYK.d(B7.EXPLOSION_LARGE), new a7j_0());
        this.a(aYK.d(B7.FIREWORKS_SPARK), new aoq_1());
        this.a(aYK.d(B7.MOB_APPEARANCE), new afd_2());
    }

    public void a(World world) {
        this.h = world;
        int n = 0;
        int n2 = 0;
        while (true) {
            ListInvoker.clear(this.a[n][n2]);
            ++n2;
        }
    }

    public void a(BlockPos blockPos, IBlockState iBlockState) {
        if (ayy_0.d(ail_0.at) && ayy_0.d(ail_0.v)) {
            Block block = BlockStateInvoker.getBlock(iBlockState);
            aDb.e(block, ail_0.v, new Object[]{this.h, blockPos});
            boolean bl = !aDb.e(block, ail_0.v, new Object[]{this.h, blockPos}) && !aDb.e(block, ail_0.at, new Object[]{this.h, blockPos, this});
        } else {
            boolean bl = BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(iBlockState)) != Material.air;
        }
        iBlockState = BlocksInvoker.a(BlockStateInvoker.getBlock(iBlockState), iBlockState, (IBlockAccess)this.h, blockPos);
        int n = 4;
        boolean bl = false;
        boolean bl2 = false;
        int n2 = 0;
        while (true) {
            double d = (double)amv_2.j(blockPos) + ((double)bl + 0.5) / (double)n;
            double d2 = (double)amv_2.h(blockPos) + ((double)bl2 + 0.5) / (double)n;
            double d3 = (double)amv_2.i(blockPos) + ((double)n2 + 0.5) / (double)n;
            this.b(aOT.a(new mm_2(this.h, d, d2, d3, d - (double)amv_2.j(blockPos) - 0.5, d2 - (double)amv_2.h(blockPos) - 0.5, d3 - (double)amv_2.i(blockPos) - 0.5, iBlockState), blockPos));
            ++n2;
        }
    }

    private void a(List list) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (int i = 0; i < ListInvoker.size(list); ++i) {
            mi_1 mi_12 = (mi_1)ListInvoker.get(list, i);
            this.c(mi_12);
            if (!mi_12.isDead) continue;
            ListInvoker.add(copyOnWriteArrayList, mi_12);
        }
        ListInvoker.removeAll(list, copyOnWriteArrayList);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import cc.novoline.events.events.SpawnCheckEvent;
import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.EventManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.NBTInvoker;
import cc.novoline.invoke.ProfilerInvoker;
import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.common.base.Predicate;
import deobf.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Chunk;
import net.minecraft.crash.CrashReportCategory;
import deobf.Entity;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.profiler.Profiler;
import net.minecraft.util.ReportedException;
import deobf.TileEntity;
import deobf.Vec3;
import net.minecraft.world.WorldSettings;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;


public abstract class World
implements IBlockAccess {
    private List<TileEntity> j;
    protected boolean J;
    private int c;
    public Random o;
    private agl_1 L;
    private List<EntityPlayer> m;
    public boolean isRemote;
    private List<Entity> u = my_0.c();
    private int i;
    protected za_2 v;
    protected float f;
    protected List<Entity> k;
    protected boolean g = true;
    protected List<IWorldAccess> B;
    private List<Entity> r;
    protected ads_1 K;
    protected wf_1 n;
    protected float s;
    private List<TileEntity> E;
    protected IntHashMap<Entity> H;
    protected int C;
    private boolean t;
    protected em_1 a;
    protected ISaveHandler w;
    int[] F;
    public Profiler A;
    protected float h;
    private long G = 0xFFFFFFL;
    protected float p;
    protected boolean x;
    private List<TileEntity> N;
    protected Set<ChunkCoordIntPair> b;
    private int M = 63;
    protected WorldInfo z;
    private List<TileEntity> q;
    protected boolean y = true;
    private int e;
    protected int I = 1013904223;
    public a9K d;
    private Calendar D;

    public void e(BlockPos blockPos, Block block) {
        Iterator iterator = abw_2.b(cs_1.HORIZONTAL);
        while (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            BlockPos blockPos2 = amv_2.a(blockPos, (EnumFacing)object);
            if (!this.i(blockPos2)) continue;
            IBlockState iBlockState = this.b(blockPos2);
            if (ey_0.a(Blocks.bR, BlockStateInvoker.getBlock(iBlockState))) {
                BlocksInvoker.a(BlockStateInvoker.getBlock(iBlockState), this, blockPos2, iBlockState, block);
                continue;
            }
            if (!BlocksInvoker.x(BlockStateInvoker.getBlock(iBlockState)) || !ey_0.a(Blocks.bR, BlockStateInvoker.getBlock(iBlockState = this.b(blockPos2 = amv_2.a(blockPos2, (EnumFacing)object))))) continue;
            BlocksInvoker.a(BlockStateInvoker.getBlock(iBlockState), this, blockPos2, iBlockState, block);
        }
    }

    public void c(int n) {
        this.e = n;
    }

    public wf_1 p() {
        return this.n;
    }

    public void b(Collection<Entity> collection) {
        ListInvoker.addAll(this.V(), collection);
        Iterator iterator = ms_0.a(collection);
        while (dz_0.c(iterator)) {
            Entity entity = (Entity)dz_0.b(iterator);
            this.e(entity);
        }
    }

    public boolean b(double d, double d2, double d3, double d4) {
        for (int i = 0; i < ListInvoker.size(this.e()); ++i) {
            EntityPlayer entityPlayer = (EntityPlayer)ListInvoker.get(this.e(), i);
            if (!aqv_2.a(od_2.d, entityPlayer)) continue;
            double d5 = a6w_0.b(entityPlayer, d, d2, d3);
            if (!(d4 < 0.0) && !(d5 < d4 * d4)) continue;
            return true;
        }
        return false;
    }

    public EntityPlayer a(double d, double d2, double d3, double d4) {
        double d5 = -1.0;
        EntityPlayer entityPlayer = null;
        for (int i = 0; i < ListInvoker.size(this.e()); ++i) {
            EntityPlayer entityPlayer2 = (EntityPlayer)ListInvoker.get(this.e(), i);
            if (!aqv_2.a(od_2.d, entityPlayer2)) continue;
            double d6 = a6w_0.b(entityPlayer2, d, d2, d3);
            if (!(d4 < 0.0) && !(d6 < d4 * d4)) continue;
            double d7 = d5 - -1.0;
            int cfr_ignored_1 = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
            d5 = d6;
            entityPlayer = entityPlayer2;
        }
        return entityPlayer;
    }

    public void a(boolean bl) {
    }

    public MovingObjectPosition a(Vec3 vec3, Vec3 vec32, boolean bl) {
        return this.a(vec3, vec32, bl, false, false);
    }

    public boolean n(BlockPos blockPos) {
        IBlockState iBlockState = this.b(blockPos);
        rm_2 rm_22 = BlocksInvoker.a(BlockStateInvoker.getBlock(iBlockState), this, blockPos, iBlockState);
        return h__0.b(rm_22) >= 1.0;
    }

    public void c(BlockPos blockPos, Block block, int n, int n2) {
    }

    public float g(BlockPos blockPos) {
        return qq_2.g(this.d)[this.x(blockPos)];
    }

    public int v() {
        return this.M;
    }

    public int c() {
        return this.c;
    }

    public boolean a(BlockPos blockPos, int n, boolean bl) {
        return this.a(amv_2.j(blockPos) - n, amv_2.h(blockPos) - n, amv_2.i(blockPos) - n, amv_2.j(blockPos) + n, amv_2.h(blockPos) + n, amv_2.i(blockPos) + n, bl);
    }

    public boolean a(EntityPlayer entityPlayer, BlockPos blockPos) {
        return true;
    }

    public void a(Entity entity, boolean bl) {
        int n;
        int n2;
        int n3 = MathHelper.floor_double(entity.posX);
        if (this.a(n3 - (n2 = 32), 0, (n = MathHelper.floor_double(entity.posZ)) - n2, n3 + n2, 0, n + n2, true)) {
            entity.lastTickPosX = entity.posX;
            entity.lastTickPosY = entity.posY;
            entity.lastTickPosZ = entity.posZ;
            entity.prevRotationYaw = entity.rotationYaw;
            entity.prevRotationPitch = entity.rotationPitch;
            if (entity.a) {
                ++entity.ticksExisted;
                if (entity.r != null) {
                    ayj_0.i(entity);
                } else {
                    ayj_0.Q(entity);
                }
            }
            ProfilerInvoker.startSection(this.A, aql_1.C);
            if (db_0.f(entity.posX) || db_0.e(entity.posX)) {
                entity.posX = entity.lastTickPosX;
            }
            if (db_0.f(entity.posY) || db_0.e(entity.posY)) {
                entity.posY = entity.lastTickPosY;
            }
            if (db_0.f(entity.posZ) || db_0.e(entity.posZ)) {
                entity.posZ = entity.lastTickPosZ;
            }
            if (db_0.f(entity.rotationPitch) || db_0.e(entity.rotationPitch)) {
                entity.rotationPitch = entity.prevRotationPitch;
            }
            if (db_0.f(entity.rotationYaw) || db_0.e(entity.rotationYaw)) {
                entity.rotationYaw = entity.prevRotationYaw;
            }
            int n4 = MathHelper.floor_double(entity.posX / 16.0);
            int n5 = MathHelper.floor_double(entity.posY / 16.0);
            int n6 = MathHelper.floor_double(entity.posZ / 16.0);
            if (!entity.a || entity.V != n4 || entity.M != n5 || entity.s != n6) {
                if (entity.a && this.a(entity.V, entity.s, true)) {
                    aqp_2.a(this.c(entity.V, entity.s), entity, entity.M);
                }
                if (this.a(n4, n6, true)) {
                    entity.a = true;
                    aqp_2.a(this.c(n4, n6), entity);
                } else {
                    entity.a = false;
                }
            }
            ProfilerInvoker.endSection(this.A);
            if (entity.a && entity.h != null) {
                if (!entity.h.isDead && entity.h.r == entity) {
                    this.f(entity.h);
                } else {
                    entity.h.r = null;
                    entity.h = null;
                }
            }
        }
    }

    public Vec3 k(float f) {
        float f2;
        float f3;
        float f4 = this.g(f);
        float f5 = MathHelper.cos(f4 * (float)Math.PI * 2.0f) * 2.0f + 0.5f;
        f5 = MathHelper.b(f5, 0.0f, 1.0f);
        float f6 = (float)(this.G >> 16 & 0xFFL) / 255.0f;
        float f7 = (float)(this.G >> 8 & 0xFFL) / 255.0f;
        float f8 = (float)(this.G & 0xFFL) / 255.0f;
        float f9 = this.f(f);
        if (f9 > 0.0f) {
            f3 = (f6 * 0.3f + f7 * 0.59f + f8 * 0.11f) * 0.6f;
            f2 = 1.0f - f9 * 0.95f;
            f6 = f6 * f2 + f3 * (1.0f - f2);
            f7 = f7 * f2 + f3 * (1.0f - f2);
            f8 = f8 * f2 + f3 * (1.0f - f2);
        }
        f6 *= f5 * 0.9f + 0.1f;
        f7 *= f5 * 0.9f + 0.1f;
        f8 *= f5 * 0.85f + 0.15f;
        f3 = this.a(f);
        if (f3 > 0.0f) {
            f2 = (f6 * 0.3f + f7 * 0.59f + f8 * 0.11f) * 0.2f;
            float f10 = 1.0f - f3 * 0.95f;
            f6 = f6 * f10 + f2 * (1.0f - f10);
            f7 = f7 * f10 + f2 * (1.0f - f10);
            f8 = f8 * f10 + f2 * (1.0f - f10);
        }
        return new Vec3(f6, f7, f8);
    }

    public List<Entity> a(Entity entity, rm_2 rm_22) {
        return this.a(entity, rm_22, od_2.d);
    }

    public boolean c(BlockPos blockPos, boolean bl) {
        IBlockState iBlockState;
        Block block;
        il_0 il_02 = this.d(blockPos);
        float f = hw_0.c(il_02, blockPos);
        return !(f > 0.15f || amv_2.h(blockPos) < 0 || amv_2.h(blockPos) >= 256 || this.b(YG.BLOCK, blockPos) >= 10 || (block = BlockStateInvoker.getBlock(iBlockState = this.b(blockPos))) != Blocks.water && block != Blocks.flowing_water || P8.b((Integer)BlockStateInvoker.b(iBlockState, BlockLiquid.P)) != 0);
    }

    public List<rm_2> a(rm_2 rm_22) {
        ArrayList arrayList = my_0.c();
        int n = MathHelper.floor_double(rm_22.e);
        int n2 = MathHelper.floor_double(rm_22.b + 1.0);
        int n3 = MathHelper.floor_double(rm_22.a);
        int n4 = MathHelper.floor_double(rm_22.c + 1.0);
        int n5 = MathHelper.floor_double(rm_22.f);
        int n6 = MathHelper.floor_double(rm_22.d + 1.0);
        z6_0 z6_02 = new z6_0();
        for (int i = n; i < n2; ++i) {
            for (int j = n5; j < n6; ++j) {
                if (!this.i(ain_1.a(z6_02, i, 64, j))) continue;
                for (int k = n3 - 1; k < n4; ++k) {
                    ain_1.a(z6_02, i, k, j);
                    IBlockState iBlockState = i >= -30000000 && i < 30000000 && j >= -30000000 && j < 30000000 ? this.b(z6_02) : BlocksInvoker.t(Blocks.bedrock);
                    BlocksInvoker.a(BlockStateInvoker.getBlock(iBlockState), this, z6_02, iBlockState, rm_22, arrayList, null);
                }
            }
        }
        return arrayList;
    }

    public void a(double d, double d2, double d3, double d4, double d5, double d6, NBTTagCompound nBTTagCompound) {
    }

    public float f(float f) {
        return this.p + (this.s - this.p) * f;
    }

    public void a(B7 b7, double d, double d2, double d3, double d4, double d5, double d6, int ... nArray) {
        this.a(aYK.d(b7), aYK.a(b7), d, d2, d3, d4, d5, d6, nArray);
    }

    public boolean A(BlockPos blockPos) {
        boolean bl = false;
        if (!qq_2.e(this.d)) {
            bl |= this.a(YG.SKY, blockPos);
        }
        return bl |= this.a(YG.BLOCK, blockPos);
    }

    public void a(boolean bl, boolean bl2) {
        this.g = bl;
        this.y = bl2;
    }

    public int b() {
        return 256;
    }

    public int u(BlockPos blockPos) {
        int n = 0;
        for (EnumFacing enumFacing : EnumFacing.values()) {
            int n2 = this.b(amv_2.a(blockPos, enumFacing), enumFacing);
            if (n2 >= 15) {
                return 15;
            }
            if (n2 <= n) continue;
            n = n2;
        }
        return n;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(EntityPlayer entityPlayer, int n, BlockPos blockPos, int n2) {
        int n3 = 0;
        try {
            while (true) {
                if (n3 >= ListInvoker.size(this.B)) {
                    return;
                }
                nd_0.a((IWorldAccess)ListInvoker.get(this.B, n3), entityPlayer, n, blockPos, n2);
                ++n3;
            }
        }
        catch (Throwable throwable) {
            CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, aql_1.J);
            CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, aql_1.t);
            CrashReportCategoryInvoker.addCrashSection(crashReportCategory, aql_1.q, CrashReportCategoryInvoker.a(blockPos));
            CrashReportCategoryInvoker.addCrashSection(crashReportCategory, aql_1.W, entityPlayer);
            CrashReportCategoryInvoker.addCrashSection(crashReportCategory, aql_1.P, P8.d(n));
            CrashReportCategoryInvoker.addCrashSection(crashReportCategory, aql_1.n, P8.d(n2));
            throw new ReportedException(crashReport);
        }
    }

    public List<Entity> V() {
        return this.u;
    }

    public float i(float f) {
        float f2 = this.g(f);
        float f3 = 1.0f - (MathHelper.cos(f2 * (float)Math.PI * 2.0f) * 2.0f + 0.25f);
        f3 = MathHelper.b(f3, 0.0f, 1.0f);
        return f3 * f3 * 0.5f;
    }

    private String lambda$addWorldInfoToCrashReport$3() throws Exception {
        return aL0.a(aL0.a(aL0.c(new StringBuilder(), ListInvoker.size(this.e())), aql_1.S), this.e().toString()).toString();
    }

    public int c(YG yG, BlockPos blockPos) {
        if (qq_2.e(this.d) && yG == YG.SKY) {
            return 0;
        }
        if (amv_2.h(blockPos) < 0) {
            blockPos = new BlockPos(amv_2.j(blockPos), 0, amv_2.i(blockPos));
        }
        if (!this.b(blockPos)) {
            return yG.defaultLightValue;
        }
        if (!this.i(blockPos)) {
            return yG.defaultLightValue;
        }
        if (BlocksInvoker.i(BlockStateInvoker.getBlock(this.b(blockPos)))) {
            int n = this.b(yG, amv_2.e(blockPos));
            int n2 = this.b(yG, amv_2.f(blockPos));
            int n3 = this.b(yG, amv_2.d(blockPos));
            int n4 = this.b(yG, amv_2.b(blockPos));
            int n5 = this.b(yG, amv_2.a(blockPos));
            if (n2 > n) {
                n = n2;
            }
            if (n3 > n) {
                n = n3;
            }
            if (n4 > n) {
                n = n4;
            }
            if (n5 > n) {
                n = n5;
            }
            return n;
        }
        Chunk chunk = this.f(blockPos);
        return chunk.a(yG, blockPos);
    }

    public Chunk c(int n, int n2) {
        return sf_0.a(this.a, n, n2);
    }

    public boolean d(rm_2 rm_22) {
        int n = MathHelper.floor_double(rm_22.e);
        int n2 = MathHelper.floor_double(rm_22.b);
        int n3 = MathHelper.floor_double(rm_22.a);
        int n4 = MathHelper.floor_double(rm_22.c);
        int n5 = MathHelper.floor_double(rm_22.f);
        int n6 = MathHelper.floor_double(rm_22.d);
        z6_0 z6_02 = new z6_0();
        for (int i = n; i <= n2; ++i) {
            for (int j = n3; j <= n4; ++j) {
                for (int k = n5; k <= n6; ++k) {
                    Block block = BlockStateInvoker.getBlock(this.b(ain_1.a(z6_02, i, j, k)));
                    if (!akm_1.f(BlocksInvoker.getBlockState(block))) continue;
                    return true;
                }
            }
        }
        return false;
    }

    public void a(B7 b7, boolean bl, double d, double d2, double d3, double d4, double d5, double d6, int ... nArray) {
        this.a(aYK.d(b7), aYK.a(b7) | bl, d, d2, d3, d4, d5, d6, nArray);
    }

    public boolean b(BlockPos blockPos, boolean bl) {
        il_0 il_02 = this.d(blockPos);
        float f = hw_0.c(il_02, blockPos);
        return !(f > 0.15f);
    }

    public boolean d(BlockPos blockPos, boolean bl) {
        return this.b(blockPos) && this.a(amv_2.j(blockPos) >> 4, amv_2.i(blockPos) >> 4, bl);
    }

    public boolean b(HF hF, boolean bl) {
        return this.a(hF.f, hF.c, hF.b, hF.d, hF.a, hF.e, bl);
    }

    public boolean w(BlockPos blockPos) {
        if (!this.h()) {
            return false;
        }
        if (!this.B(blockPos)) {
            return false;
        }
        if (amv_2.h(this.t(blockPos)) > amv_2.h(blockPos)) {
            return false;
        }
        il_0 il_02 = this.d(blockPos);
        return !hw_0.d(il_02) && !this.b(blockPos, false) && hw_0.c(il_02);
    }

    public boolean a(rm_2 rm_22, Entity entity) {
        List<Entity> list = this.a((Entity)null, rm_22);
        for (int i = 0; i < ListInvoker.size(list); ++i) {
            Entity entity2 = (Entity)ListInvoker.get(list, i);
            if (entity2.isDead || !entity2.P || entity2 == entity || entity.r == entity2 || entity.h == entity2) continue;
            return false;
        }
        return true;
    }

    public double d() {
        return uv_2.r(this.z) == WorldType.e ? 0.0 : 63.0;
    }

    public List<Entity> a(Entity entity, rm_2 rm_22, Predicate<? super Entity> predicate) {
        ArrayList arrayList = my_0.c();
        int n = MathHelper.floor_double((rm_22.e - 2.0) / 16.0);
        int n2 = MathHelper.floor_double((rm_22.b + 2.0) / 16.0);
        int n3 = MathHelper.floor_double((rm_22.f - 2.0) / 16.0);
        int n4 = MathHelper.floor_double((rm_22.d + 2.0) / 16.0);
        for (int i = n; i <= n2; ++i) {
            for (int j = n3; j <= n4; ++j) {
                if (!this.a(i, j, true)) continue;
                aqp_2.a(this.c(i, j), entity, rm_22, (List)arrayList, predicate);
            }
        }
        return arrayList;
    }

    public boolean c(rm_2 rm_22) {
        int n;
        int n2 = MathHelper.floor_double(rm_22.e);
        int n3 = MathHelper.floor_double(rm_22.b + 1.0);
        int n4 = MathHelper.floor_double(rm_22.a);
        int n5 = MathHelper.floor_double(rm_22.c + 1.0);
        int n6 = MathHelper.floor_double(rm_22.f);
        if (this.a(n2, n4, n6, n3, n5, n = MathHelper.floor_double(rm_22.d + 1.0), true)) {
            z6_0 z6_02 = new z6_0();
            for (int i = n2; i < n3; ++i) {
                for (int j = n4; j < n5; ++j) {
                    for (int k = n6; k < n; ++k) {
                        Block block = BlockStateInvoker.getBlock(this.b(ain_1.a(z6_02, i, j, k)));
                        if (block != Blocks.c && block != Blocks.flowing_lava && block != Blocks.lava) continue;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void a(long l4) {
        this.z.c(l4);
    }

    public void a(BlockPos blockPos, Block block, EnumFacing enumFacing) {
        if (enumFacing != EnumFacing.WEST) {
            this.c(amv_2.d(blockPos), block);
        }
        if (enumFacing != EnumFacing.EAST) {
            this.c(amv_2.f(blockPos), block);
        }
        if (enumFacing != EnumFacing.DOWN) {
            this.c(amv_2.g(blockPos), block);
        }
        if (enumFacing != EnumFacing.UP) {
            this.c(amv_2.e(blockPos), block);
        }
        if (enumFacing != EnumFacing.NORTH) {
            this.c(amv_2.a(blockPos), block);
        }
        if (enumFacing != EnumFacing.SOUTH) {
            this.c(amv_2.b(blockPos), block);
        }
    }

    public WorldInfo w() {
        return this.z;
    }

    public int z(BlockPos blockPos) {
        if (amv_2.h(blockPos) < 0) {
            return 0;
        }
        if (amv_2.h(blockPos) >= 256) {
            blockPos = new BlockPos(amv_2.j(blockPos), 255, amv_2.i(blockPos));
        }
        return aqp_2.a(this.f(blockPos), blockPos, 0);
    }

    public void a(Block block, BlockPos blockPos, Random random) {
        this.J = true;
        BlocksInvoker.c(block, this, blockPos, this.b(blockPos), random);
        this.J = false;
    }

    private boolean C(BlockPos blockPos) {
        return BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(this.b(blockPos))) == Material.M;
    }

    public void a(EntityPlayer entityPlayer, String string, float f, float f2) {
        for (int i = 0; i < ListInvoker.size(this.B); ++i) {
            nd_0.a((IWorldAccess)ListInvoker.get(this.B, i), entityPlayer, string, entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ, f, f2);
        }
    }

    public void b(long l4) {
        uv_2.b(this.z, l4);
    }

    public void a(Collection<Entity> collection) {
        ListInvoker.addAll(this.k, collection);
    }

    public int c(float f) {
        float f2 = this.g(f);
        float f3 = 1.0f - (MathHelper.cos(f2 * (float)Math.PI * 2.0f) * 2.0f + 0.5f);
        f3 = MathHelper.b(f3, 0.0f, 1.0f);
        f3 = 1.0f - f3;
        f3 = (float)((double)f3 * (1.0 - (double)(this.f(f) * 5.0f) / 16.0));
        f3 = (float)((double)f3 * (1.0 - (double)(this.a(f) * 5.0f) / 16.0));
        f3 = 1.0f - f3;
        return (int)(f3 * 11.0f);
    }

    public int e(BlockPos blockPos, boolean bl) {
        if (amv_2.j(blockPos) >= -30000000 && amv_2.i(blockPos) >= -30000000 && amv_2.j(blockPos) < 30000000 && amv_2.i(blockPos) < 30000000) {
            if (BlocksInvoker.i(BlockStateInvoker.getBlock(this.b(blockPos)))) {
                int n = this.e(amv_2.e(blockPos), false);
                int n2 = this.e(amv_2.f(blockPos), false);
                int n3 = this.e(amv_2.d(blockPos), false);
                int n4 = this.e(amv_2.b(blockPos), false);
                int n5 = this.e(amv_2.a(blockPos), false);
                if (n2 > n) {
                    n = n2;
                }
                if (n3 > n) {
                    n = n3;
                }
                if (n4 > n) {
                    n = n4;
                }
                if (n5 > n) {
                    n = n5;
                }
                return n;
            }
            if (amv_2.h(blockPos) < 0) {
                return 0;
            }
            if (amv_2.h(blockPos) >= 256) {
                blockPos = new BlockPos(amv_2.j(blockPos), 255, amv_2.i(blockPos));
            }
            Chunk chunk = this.f(blockPos);
            return aqp_2.a(chunk, blockPos, this.e);
        }
        return 15;
    }

    public float d(float f) {
        float f2 = this.g(f);
        return f2 * (float)Math.PI * 2.0f;
    }

    protected void C() {
        this.a();
    }

    public boolean v(BlockPos blockPos) {
        if (amv_2.h(blockPos) >= this.v()) {
            return this.B(blockPos);
        }
        BlockPos blockPos2 = new BlockPos(amv_2.j(blockPos), this.v(), amv_2.i(blockPos));
        if (!this.B(blockPos2)) {
            return false;
        }
        blockPos2 = amv_2.g(blockPos2);
        while (amv_2.h(blockPos2) > amv_2.h(blockPos)) {
            Block block = BlockStateInvoker.getBlock(this.b(blockPos2));
            if (BlocksInvoker.b(block) > 0 && !akm_1.f(BlocksInvoker.getBlockState(block))) {
                return false;
            }
            blockPos2 = amv_2.g(blockPos2);
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public float a(Vec3 vec3, rm_2 rm_22) {
        double d = 1.0 / ((rm_22.b - rm_22.e) * 2.0 + 1.0);
        double d2 = 1.0 / ((rm_22.c - rm_22.a) * 2.0 + 1.0);
        double d3 = 1.0 / ((rm_22.d - rm_22.f) * 2.0 + 1.0);
        double d4 = (1.0 - MathInvoker.n(1.0 / d) * d) / 2.0;
        double d5 = (1.0 - MathInvoker.n(1.0 / d3) * d3) / 2.0;
        if (d >= 0.0 && d2 >= 0.0 && d3 >= 0.0) {
            float f = 0.0f;
            float f2 = f - 1.0f;
            int cfr_ignored_3 = f2 == 0.0f ? 0 : (f2 < 0.0f ? -1 : 1);
            float f3 = 0.0f;
            float f4 = f3 - 1.0f;
            int cfr_ignored_4 = f4 == 0.0f ? 0 : (f4 < 0.0f ? -1 : 1);
            float f5 = 0.0f;
            while (true) {
                void var14_12;
                float f6;
                int cfr_ignored_5 = (f6 = f5 - 1.0f) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
                double d6 = rm_22.e + (rm_22.b - rm_22.e) * (double)f;
                double d7 = rm_22.a + (rm_22.c - rm_22.a) * (double)f3;
                double d8 = rm_22.f + (rm_22.d - rm_22.f) * (double)f5;
                if (this.a(new Vec3(d6 + d4, d7, d8 + d5), vec3) == null) {
                    void var13_11;
                    ++var13_11;
                }
                ++var14_12;
                f5 = (float)((double)f5 + d3);
            }
        }
        return 0.0f;
    }

    public EnumDifficulty H() {
        return this.w().G();
    }

    public boolean P() {
        return this.e < 4;
    }

    public Vec3 a(Entity entity, float f) {
        float f2;
        float f3;
        float f4 = this.g(f);
        float f5 = MathHelper.cos(f4 * (float)Math.PI * 2.0f) * 2.0f + 0.5f;
        f5 = MathHelper.b(f5, 0.0f, 1.0f);
        int n = MathHelper.floor_double(entity.posX);
        int n2 = MathHelper.floor_double(entity.posY);
        int n3 = MathHelper.floor_double(entity.posZ);
        BlockPos blockPos = new BlockPos(n, n2, n3);
        il_0 il_02 = this.d(blockPos);
        float f6 = hw_0.c(il_02, blockPos);
        int n4 = hw_0.a(il_02, f6);
        float f7 = (float)(n4 >> 16 & 0xFF) / 255.0f;
        float f8 = (float)(n4 >> 8 & 0xFF) / 255.0f;
        float f9 = (float)(n4 & 0xFF) / 255.0f;
        f7 *= f5;
        f8 *= f5;
        f9 *= f5;
        float f10 = this.f(f);
        if (f10 > 0.0f) {
            f3 = (f7 * 0.3f + f8 * 0.59f + f9 * 0.11f) * 0.6f;
            f2 = 1.0f - f10 * 0.75f;
            f7 = f7 * f2 + f3 * (1.0f - f2);
            f8 = f8 * f2 + f3 * (1.0f - f2);
            f9 = f9 * f2 + f3 * (1.0f - f2);
        }
        if ((f3 = this.a(f)) > 0.0f) {
            f2 = (f7 * 0.3f + f8 * 0.59f + f9 * 0.11f) * 0.2f;
            float f11 = 1.0f - f3 * 0.75f;
            f7 = f7 * f11 + f2 * (1.0f - f11);
            f8 = f8 * f11 + f2 * (1.0f - f11);
            f9 = f9 * f11 + f2 * (1.0f - f11);
        }
        if (this.c > 0) {
            f2 = (float)this.c - f;
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            f7 = f7 * (1.0f - (f2 *= 0.45f)) + 0.8f * f2;
            f8 = f8 * (1.0f - f2) + 0.8f * f2;
            f9 = f9 * (1.0f - f2) + f2;
        }
        return new Vec3(f7, f8, f9);
    }

    protected void e(Entity entity) {
        for (int i = 0; i < ListInvoker.size(this.B); ++i) {
            ((IWorldAccess)ListInvoker.get(this.B, i)).b(entity);
        }
        EventManagerInvoker.call(new SpawnCheckEvent(entity, yd_2.ADD));
    }

    public wo_0 a(Class<? extends wo_0> clazz, String string) {
        return P7.a(this.K, clazz, string);
    }

    @Override
    public int a(BlockPos blockPos, EnumFacing enumFacing) {
        IBlockState iBlockState = this.b(blockPos);
        return BlocksInvoker.a(BlockStateInvoker.getBlock(iBlockState), (IBlockAccess)this, blockPos, iBlockState, enumFacing);
    }

    public void a(Entity entity, String string, float f, float f2) {
        for (int i = 0; i < ListInvoker.size(this.B); ++i) {
            nd_0.a((IWorldAccess)ListInvoker.get(this.B, i), string, entity.posX, entity.posY, entity.posZ, f, f2);
        }
    }

    public int a(String string) {
        return this.K.a(string);
    }

    public boolean I() {
        return this.x;
    }

    public <T extends Entity> List<T> a(Class<? extends T> clazz, Predicate<? super T> predicate) {
        ArrayList arrayList = my_0.c();
        Iterator iterator = ListInvoker.iterator(this.e());
        while (dz_0.c(iterator)) {
            Entity entity = (Entity)dz_0.b(iterator);
            if (!ara_2.a(clazz, entity.getClass()) || !aqv_2.a(predicate, entity)) continue;
            ListInvoker.add(arrayList, entity);
        }
        return arrayList;
    }

    public boolean b(BlockPos blockPos, BlockPos blockPos2) {
        return this.a(blockPos, blockPos2, true);
    }

    public int b(BlockPos blockPos, EnumFacing enumFacing) {
        IBlockState iBlockState = this.b(blockPos);
        Block block = BlockStateInvoker.getBlock(iBlockState);
        return BlocksInvoker.x(block) ? this.d(blockPos) : BlocksInvoker.b(block, (IBlockAccess)this, blockPos, iBlockState, enumFacing);
    }

    public int x(BlockPos blockPos) {
        return this.e(blockPos, true);
    }

    public <T extends Entity> List<T> a(Class<? extends T> clazz, rm_2 rm_22, Predicate<? super T> predicate) {
        int n = MathHelper.floor_double((rm_22.e - 2.0) / 16.0);
        int n2 = MathHelper.floor_double((rm_22.b + 2.0) / 16.0);
        int n3 = MathHelper.floor_double((rm_22.f - 2.0) / 16.0);
        int n4 = MathHelper.floor_double((rm_22.d + 2.0) / 16.0);
        ArrayList arrayList = my_0.c();
        for (int i = n; i <= n2; ++i) {
            for (int j = n3; j <= n4; ++j) {
                if (!this.a(i, j, true)) continue;
                aqp_2.a(this.c(i, j), clazz, rm_22, (List)arrayList, predicate);
            }
        }
        return arrayList;
    }

    public List<a5D> a(HF hF, boolean bl) {
        return null;
    }

    public boolean a(rm_2 rm_22, Material material) {
        int n = MathHelper.floor_double(rm_22.e);
        int n2 = MathHelper.floor_double(rm_22.b + 1.0);
        int n3 = MathHelper.floor_double(rm_22.a);
        int n4 = MathHelper.floor_double(rm_22.c + 1.0);
        int n5 = MathHelper.floor_double(rm_22.f);
        int n6 = MathHelper.floor_double(rm_22.d + 1.0);
        z6_0 z6_02 = new z6_0();
        for (int i = n; i < n2; ++i) {
            for (int j = n3; j < n4; ++j) {
                for (int k = n5; k < n6; ++k) {
                    if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(this.b(ain_1.a(z6_02, i, j, k)))) != material) continue;
                    return true;
                }
            }
        }
        return false;
    }

    public agl_1 R() {
        return this.L;
    }

    public boolean g(Entity entity) {
        ListInvoker.add(this.f(), entity);
        return true;
    }

    public int a(Class<?> clazz) {
        int n = 0;
        Iterator iterator = ListInvoker.iterator(this.V());
        while (dz_0.c(iterator)) {
            Entity entity = (Entity)dz_0.b(iterator);
            if (entity instanceof nl_1 && CG.D((nl_1)entity) || !ara_2.a(clazz, entity.getClass())) continue;
            ++n;
        }
        return n;
    }

    public IBlockState a(double d, double d2, double d3) {
        BlockPos blockPos = new BlockPos(d, d2, d3);
        if (!this.b(blockPos)) {
            return BlocksInvoker.t(Blocks.air);
        }
        Chunk chunk = this.f(blockPos);
        return chunk.d(blockPos);
    }

    public void d(int n) {
        this.c = n;
    }

    public void c(Collection<TileEntity> collection) {
        if (this.t) {
            ListInvoker.addAll(this.q, collection);
        } else {
            Iterator iterator = ms_0.a(collection);
            while (dz_0.c(iterator)) {
                TileEntity tileEntity = (TileEntity)dz_0.b(iterator);
                ListInvoker.add(this.x(), tileEntity);
                if (!(tileEntity instanceof ITickable)) continue;
                ListInvoker.add(this.k(), tileEntity);
            }
        }
    }

    public void a(Entity entity, byte by) {
    }

    public float a(float f) {
        return (this.h + (this.f - this.h) * f) * this.f(f);
    }

    public <T extends Entity> List<T> b(Class<? extends T> clazz, Predicate<? super T> predicate) {
        ArrayList arrayList = my_0.c();
        Iterator iterator = ListInvoker.iterator(this.V());
        while (dz_0.c(iterator)) {
            Entity entity = (Entity)dz_0.b(iterator);
            if (!ara_2.a(clazz, entity.getClass()) || !aqv_2.a(predicate, entity)) continue;
            ListInvoker.add(arrayList, entity);
        }
        return arrayList;
    }

    public void a(int n, int n2, int n3, int n4) {
        int n5;
        if (n3 > n4) {
            n5 = n4;
            n4 = n3;
            n3 = n5;
        }
        if (!qq_2.e(this.d)) {
            for (n5 = n3; n5 <= n4; ++n5) {
                this.a(YG.SKY, new BlockPos(n, n5, n2));
            }
        }
        this.a(n, n3, n2, n, n4, n2);
    }

    public void b(BlockPos blockPos, Block block, int n, int n2) {
    }

    public void c(Entity entity) {
        if (entity.h != null) {
            ayj_0.b(entity.h, null);
        }
        if (entity.r != null) {
            ayj_0.b(entity, null);
        }
        ayj_0.D(entity);
        if (entity instanceof EntityPlayer) {
            ListInvoker.remove(this.e(), entity);
            this.s();
            this.h(entity);
        }
    }

    public w__0 K() {
        return uv_2.s(this.z);
    }

    public void a(int n) {
        this.M = n;
    }

    public boolean i(BlockPos blockPos) {
        return this.d(blockPos, true);
    }

    protected void a() {
        int n;
        int n2;
        int n3;
        EntityPlayer entityPlayer;
        int n4;
        aS0.e(this.b);
        ProfilerInvoker.startSection(this.A, aql_1.e);
        for (n4 = 0; n4 < ListInvoker.size(this.e()); ++n4) {
            entityPlayer = (EntityPlayer)ListInvoker.get(this.e(), n4);
            n3 = MathHelper.floor_double(entityPlayer.posX / 16.0);
            n2 = MathHelper.floor_double(entityPlayer.posZ / 16.0);
            n = this.L();
            for (int i = -n; i <= n; ++i) {
                for (int j = -n; j <= n; ++j) {
                    aS0.b(this.b, new ChunkCoordIntPair(i + n3, j + n2));
                }
            }
        }
        ProfilerInvoker.endSection(this.A);
        if (this.i > 0) {
            --this.i;
        }
        ProfilerInvoker.startSection(this.A, aql_1.H);
        if (!aLF.f() && !ListInvoker.isEmpty(this.e())) {
            n4 = a5_0.a(this.o, ListInvoker.size(this.e()));
            entityPlayer = (EntityPlayer)ListInvoker.get(this.e(), n4);
            n3 = MathHelper.floor_double(entityPlayer.posX) + a5_0.a(this.o, 11) - 5;
            n2 = MathHelper.floor_double(entityPlayer.posY) + a5_0.a(this.o, 11) - 5;
            n = MathHelper.floor_double(entityPlayer.posZ) + a5_0.a(this.o, 11) - 5;
            this.A(new BlockPos(n3, n2, n));
        }
        ProfilerInvoker.endSection(this.A);
    }

    public void G() {
        this.c(new BlockPos(8, 64, 8));
    }

    public void s() {
    }

    @Override
    public int a(BlockPos blockPos, int n) {
        int n2 = this.c(YG.SKY, blockPos);
        int n3 = this.c(YG.BLOCK, blockPos);
        if (n3 < n) {
            n3 = n;
        }
        return n2 << 20 | n3 << 4;
    }

    public boolean y(BlockPos blockPos) {
        il_0 il_02 = this.d(blockPos);
        return hw_0.h(il_02);
    }

    public boolean b(rm_2 rm_22, Material material) {
        int n = MathHelper.floor_double(rm_22.e);
        int n2 = MathHelper.floor_double(rm_22.b + 1.0);
        int n3 = MathHelper.floor_double(rm_22.a);
        int n4 = MathHelper.floor_double(rm_22.c + 1.0);
        int n5 = MathHelper.floor_double(rm_22.f);
        int n6 = MathHelper.floor_double(rm_22.d + 1.0);
        z6_0 z6_02 = new z6_0();
        for (int i = n; i < n2; ++i) {
            for (int j = n3; j < n4; ++j) {
                for (int k = n5; k < n6; ++k) {
                    IBlockState iBlockState = this.b(ain_1.a(z6_02, i, j, k));
                    Block block = BlockStateInvoker.getBlock(iBlockState);
                    if (BlocksInvoker.getBlockState(block) != material) continue;
                    int n7 = P8.b((Integer)BlockStateInvoker.b(iBlockState, BlockLiquid.P));
                    double d = j + 1;
                    if (n7 < 8) {
                        d = (double)(j + 1) - (double)n7 / 8.0;
                    }
                    if (!(d >= rm_22.a)) continue;
                    return true;
                }
            }
        }
        return false;
    }

    protected boolean a(int n, int n2, boolean bl) {
        return sf_0.b(this.a, n, n2) && !aqp_2.o(sf_0.a(this.a, n, n2));
    }

    public void a(double d, double d2, double d3, String string, float f, float f2, boolean bl) {
    }

    @Override
    public boolean d() {
        return false;
    }

    private static String lambda$notifyBlockOfStateChange$1(Block block) throws Exception {
        try {
            return StringInvoker.a(aql_1.r, new Object[]{P8.d(BlocksInvoker.v(block)), BlocksInvoker.o(block), ara_2.k(block.getClass())});
        }
        catch (Throwable throwable) {
            return aL0.c(aL0.a(new StringBuilder(), aql_1.h), BlocksInvoker.v(block)).toString();
        }
    }

    private boolean b(BlockPos blockPos) {
        return amv_2.j(blockPos) >= -30000000 && amv_2.i(blockPos) >= -30000000 && amv_2.j(blockPos) < 30000000 && amv_2.i(blockPos) < 30000000 && amv_2.h(blockPos) >= 0 && amv_2.h(blockPos) < 256;
    }

    public EntityPlayer c(String string) {
        for (int i = 0; i < ListInvoker.size(this.e()); ++i) {
            EntityPlayer entityPlayer = (EntityPlayer)ListInvoker.get(this.e(), i);
            if (!string.equals(a6w_0.C(entityPlayer))) continue;
            return entityPlayer;
        }
        return null;
    }

    protected abstract int L();

    public EntityPlayer b(String string) {
        for (int i = 0; i < ListInvoker.size(this.e()); ++i) {
            EntityPlayer entityPlayer = (EntityPlayer)ListInvoker.get(this.e(), i);
            if (!StringInvoker.d(string, a6w_0.C(entityPlayer))) continue;
            return entityPlayer;
        }
        return null;
    }

    public boolean a(BlockPos blockPos, BlockPos blockPos2, boolean bl) {
        return this.a(amv_2.j(blockPos), amv_2.h(blockPos), amv_2.i(blockPos), amv_2.j(blockPos2), amv_2.h(blockPos2), amv_2.i(blockPos2), bl);
    }

    public boolean a(HF hF) {
        return this.b(hF, true);
    }

    public void O() {
    }

    public void b(IWorldAccess iWorldAccess) {
        ListInvoker.remove(this.B, iWorldAccess);
    }

    public boolean c(BlockPos blockPos, EnumFacing enumFacing) {
        return this.b(blockPos, enumFacing) > 0;
    }

    public em_1 o() {
        return this.a;
    }

    public void A() {
        int n = this.c(1.0f);
        if (n != this.e) {
            this.e = n;
        }
    }

    public <T extends Entity> List<T> a(Class<? extends T> clazz, rm_2 rm_22) {
        return this.a(clazz, rm_22, (T)od_2.d);
    }

    public void d(Entity entity) {
        int n = MathHelper.floor_double(entity.posX / 16.0);
        int n2 = MathHelper.floor_double(entity.posZ / 16.0);
        int n3 = 2;
        for (int i = n - n3; i <= n + n3; ++i) {
            for (int j = n2 - n3; j <= n2 + n3; ++j) {
                this.c(i, j);
            }
        }
        if (!ListInvoker.contains(this.V(), entity)) {
            ListInvoker.add(this.V(), entity);
        }
    }

    public long E() {
        return this.z.e();
    }

    public void a(YG yG, BlockPos blockPos, int n) {
        if (this.b(blockPos) && this.i(blockPos)) {
            Chunk chunk = this.f(blockPos);
            chunk.a(yG, blockPos, n);
            this.l(blockPos);
        }
    }

    private int a(BlockPos blockPos, YG yG) {
        if (yG == YG.SKY && this.B(blockPos)) {
            return 15;
        }
        Block block = BlockStateInvoker.getBlock(this.b(blockPos));
        int n = yG == YG.SKY ? 0 : BlocksInvoker.G(block);
        int n2 = BlocksInvoker.b(block);
        if (n2 >= 15 && BlocksInvoker.G(block) > 0) {
            n2 = 1;
        }
        if (n2 < 1) {
            n2 = 1;
        }
        if (n2 >= 15) {
            return 0;
        }
        if (n >= 14) {
            return n;
        }
        for (EnumFacing enumFacing : EnumFacing.values()) {
            BlockPos blockPos2 = amv_2.a(blockPos, enumFacing);
            int n3 = this.b(yG, blockPos2) - n2;
            if (n3 > n) {
                n = n3;
            }
            if (n < 14) continue;
            return n;
        }
        return n;
    }

    public void d(BlockPos blockPos, Block block) {
        if (uv_2.r(this.z) != WorldType.l) {
            this.a(blockPos, block);
        }
    }

    public MovingObjectPosition a(Vec3 vec3, Vec3 vec32, boolean bl, boolean bl2, boolean bl3) {
        if (!(db_0.f(vec3.xCoord) || db_0.f(vec3.yCoord) || db_0.f(vec3.zCoord))) {
            if (!(db_0.f(vec32.xCoord) || db_0.f(vec32.yCoord) || db_0.f(vec32.zCoord))) {
                int n;
                int n2;
                int n3 = MathHelper.floor_double(vec32.xCoord);
                int n4 = MathHelper.floor_double(vec32.yCoord);
                int n5 = MathHelper.floor_double(vec32.zCoord);
                int n6 = MathHelper.floor_double(vec3.xCoord);
                BlockPos blockPos = new BlockPos(n6, n2 = MathHelper.floor_double(vec3.yCoord), n = MathHelper.floor_double(vec3.zCoord));
                IBlockState iBlockState = this.b(blockPos);
                Block block = BlockStateInvoker.getBlock(iBlockState);
                if (BlocksInvoker.a(block, this, blockPos, iBlockState) != null && BlocksInvoker.a(block, iBlockState, bl)) {
                    MovingObjectPosition movingObjectPosition = BlocksInvoker.a(block, this, blockPos, vec3, vec32);
                    return movingObjectPosition;
                }
                MovingObjectPosition movingObjectPosition = null;
                int n7 = 200;
                while (true) {
                    IBlockState iBlockState2;
                    Block block2;
                    EnumFacing enumFacing;
                    --n7;
                    if (db_0.f(vec3.xCoord) || db_0.f(vec3.yCoord) || db_0.f(vec3.zCoord)) {
                        return null;
                    }
                    if (n6 == n3 && n2 == n4 && n == n5) {
                        return movingObjectPosition;
                    }
                    double d = 999.0;
                    double d2 = 999.0;
                    double d3 = 999.0;
                    if (n3 > n6) {
                        d = (double)n6 + 1.0;
                    } else if (n3 < n6) {
                        d = (double)n6 + 0.0;
                    }
                    if (n4 > n2) {
                        d2 = (double)n2 + 1.0;
                    } else if (n4 < n2) {
                        d2 = (double)n2 + 0.0;
                    }
                    if (n5 > n) {
                        d3 = (double)n + 1.0;
                    } else if (n5 < n) {
                        d3 = (double)n + 0.0;
                    }
                    double d4 = 999.0;
                    double d5 = 999.0;
                    double d6 = 999.0;
                    double d7 = vec32.xCoord - vec3.xCoord;
                    double d8 = vec32.yCoord - vec3.yCoord;
                    double d9 = vec32.zCoord - vec3.zCoord;
                    d4 = (d - vec3.xCoord) / d7;
                    d5 = (d2 - vec3.yCoord) / d8;
                    d6 = (d3 - vec3.zCoord) / d9;
                    if (d4 == -0.0) {
                        d4 = -1.0E-4;
                    }
                    if (d5 == -0.0) {
                        d5 = -1.0E-4;
                    }
                    if (d6 == -0.0) {
                        d6 = -1.0E-4;
                    }
                    if (d4 < d5 && d4 < d6) {
                        enumFacing = n3 > n6 ? EnumFacing.WEST : EnumFacing.EAST;
                        vec3 = new Vec3(d, vec3.yCoord + d8 * d4, vec3.zCoord + d9 * d4);
                    } else if (d5 < d6) {
                        enumFacing = n4 > n2 ? EnumFacing.DOWN : EnumFacing.UP;
                        vec3 = new Vec3(vec3.xCoord + d7 * d5, d2, vec3.zCoord + d9 * d5);
                    } else {
                        enumFacing = n5 > n ? EnumFacing.NORTH : EnumFacing.SOUTH;
                        vec3 = new Vec3(vec3.xCoord + d7 * d6, vec3.yCoord + d8 * d6, d3);
                    }
                    if (BlocksInvoker.a(block2 = BlockStateInvoker.getBlock(iBlockState2 = this.b(blockPos = new BlockPos(n6 = MathHelper.floor_double(vec3.xCoord) - (enumFacing == EnumFacing.EAST ? 1 : 0), n2 = MathHelper.floor_double(vec3.yCoord) - (enumFacing == EnumFacing.UP ? 1 : 0), n = MathHelper.floor_double(vec3.zCoord) - (enumFacing == EnumFacing.SOUTH ? 1 : 0)))), this, blockPos, iBlockState2) == null) continue;
                    if (BlocksInvoker.a(block2, iBlockState2, bl)) {
                        MovingObjectPosition movingObjectPosition2 = BlocksInvoker.a(block2, this, blockPos, vec3, vec32);
                        return movingObjectPosition2;
                    }
                    movingObjectPosition = new MovingObjectPosition(net.I.MISS, vec3, enumFacing, blockPos);
                }
            }
            return null;
        }
        return null;
    }

    public void b(int n, BlockPos blockPos, int n2) {
        Iterator iterator = ListInvoker.iterator(this.B);
        while (dz_0.c(iterator)) {
            IWorldAccess iWorldAccess = (IWorldAccess)dz_0.b(iterator);
            iWorldAccess.b(n, blockPos, n2);
        }
    }

    public int l() {
        return this.e;
    }

    @Override
    public boolean a(BlockPos blockPos) {
        return BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(this.b(blockPos))) == Material.air;
    }

    public List<rm_2> b(Entity entity, rm_2 rm_22) {
        ArrayList arrayList = my_0.c();
        int n = MathHelper.floor_double(rm_22.e);
        int n2 = MathHelper.floor_double(rm_22.b + 1.0);
        int n3 = MathHelper.floor_double(rm_22.a);
        int n4 = MathHelper.floor_double(rm_22.c + 1.0);
        int n5 = MathHelper.floor_double(rm_22.f);
        int n6 = MathHelper.floor_double(rm_22.d + 1.0);
        agl_1 agl_12 = this.R();
        ayj_0.o(entity);
        this.a(agl_12, entity);
        IBlockState iBlockState = BlocksInvoker.t(Blocks.stone);
        z6_0 z6_02 = new z6_0();
        for (int i = n; i < n2; ++i) {
            for (int j = n5; j < n6; ++j) {
                if (!this.i(ain_1.a(z6_02, i, 64, j))) continue;
                for (int k = n3 - 1; k < n4; ++k) {
                    ain_1.a(z6_02, i, k, j);
                    ayj_0.a(entity, false);
                    IBlockState iBlockState2 = iBlockState;
                    if (!ak9_0.a(agl_12, z6_02)) {
                        // empty if block
                    }
                    iBlockState2 = this.b(z6_02);
                    BlocksInvoker.a(BlockStateInvoker.getBlock(iBlockState2), this, z6_02, iBlockState2, rm_22, arrayList, entity);
                }
            }
        }
        double d = 0.25;
        List<Entity> list = this.a(entity, h__0.d(rm_22, d, d, d));
        for (int i = 0; i < ListInvoker.size(list); ++i) {
            if (entity.h == list || entity.r == list) continue;
            rm_2 rm_23 = ayj_0.c((Entity)ListInvoker.get(list, i));
            if (h__0.b(rm_23, rm_22)) {
                ListInvoker.add(arrayList, rm_23);
            }
            if (!h__0.b(rm_23 = ayj_0.c(entity, (Entity)ListInvoker.get(list, i)), rm_22)) continue;
            ListInvoker.add(arrayList, rm_23);
        }
        return arrayList;
    }

    public MovingObjectPosition a(Vec3 vec3, Vec3 vec32) {
        return this.a(vec3, vec32, false, false, false);
    }

    public int d(BlockPos blockPos) {
        int n = 0;
        if ((n = MathInvoker.max(n, this.a(amv_2.g(blockPos), EnumFacing.DOWN))) >= 15) {
            return n;
        }
        if ((n = MathInvoker.max(n, this.a(amv_2.e(blockPos), EnumFacing.UP))) >= 15) {
            return n;
        }
        if ((n = MathInvoker.max(n, this.a(amv_2.a(blockPos), EnumFacing.NORTH))) >= 15) {
            return n;
        }
        if ((n = MathInvoker.max(n, this.a(amv_2.b(blockPos), EnumFacing.SOUTH))) >= 15) {
            return n;
        }
        if ((n = MathInvoker.max(n, this.a(amv_2.d(blockPos), EnumFacing.WEST))) >= 15) {
            return n;
        }
        return (n = MathInvoker.max(n, this.a(amv_2.f(blockPos), EnumFacing.EAST))) >= 15 ? n : n;
    }

    public void a(double d, double d2, double d3, String string, float f, float f2) {
        ListInvoker.forEach(this.B, arg_0 -> World.lambda$playSoundEffect$2(string, d, d2, d3, f, f2, arg_0));
    }

    public int b(YG yG, BlockPos blockPos) {
        if (amv_2.h(blockPos) < 0) {
            blockPos = new BlockPos(amv_2.j(blockPos), 0, amv_2.i(blockPos));
        }
        if (!this.b(blockPos)) {
            return yG.defaultLightValue;
        }
        if (!this.i(blockPos)) {
            return yG.defaultLightValue;
        }
        Chunk chunk = this.f(blockPos);
        return chunk.a(yG, blockPos);
    }

    public boolean a(Block block, BlockPos blockPos, boolean bl, EnumFacing enumFacing, Entity entity, ItemStack itemStack) {
        Block block2 = BlockStateInvoker.getBlock(this.b(blockPos));
        rm_2 rm_22 = null;
        return this.a(rm_22, entity) && (BlocksInvoker.getBlockState(block2) == Material.I && block == Blocks.J || akm_1.e(BlocksInvoker.getBlockState(block2)) && BlocksInvoker.a(block, this, blockPos, enumFacing, itemStack));
    }

    public void c(int n, BlockPos blockPos, int n2) {
        this.a(null, n, blockPos, n2);
    }

    public List<TileEntity> x() {
        return this.j;
    }

    public void a(Entity entity, double d, double d2, double d3, float f, boolean bl) {
        this.a(entity, d, d2, d3, f, false, bl);
    }

    public EntityPlayer a(Entity entity, double d) {
        return this.a(entity.posX, entity.posY, entity.posZ, d);
    }

    public void a(IWorldAccess iWorldAccess) {
        ListInvoker.add(this.B, iWorldAccess);
    }

    public long F() {
        return this.z.g();
    }

    public void c(BlockPos blockPos) {
        uv_2.a(this.z, blockPos);
    }

    public CrashReportCategory a(CrashReport crashReport) {
        CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, aql_1.O, 1);
        CrashReportCategoryInvoker.addCrashSection(crashReportCategory, aql_1.k, this.z == null ? aql_1.R : uv_2.z(this.z));
        CrashReportCategoryInvoker.a(crashReportCategory, aql_1.s, this::lambda$addWorldInfoToCrashReport$3);
        CrashReportCategoryInvoker.a(crashReportCategory, aql_1.U, this::lambda$addWorldInfoToCrashReport$4);
        try {
            uv_2.a(this.z, crashReportCategory);
        }
        catch (Throwable throwable) {
            CrashReportCategoryInvoker.a(crashReportCategory, aql_1.A, throwable);
        }
        return crashReportCategory;
    }

    public void e(float f) {
        this.p = f;
        this.s = f;
    }

    private void a(int n, boolean bl, double d, double d2, double d3, double d4, double d5, double d6, int ... nArray) {
        for (int i = 0; i < ListInvoker.size(this.B); ++i) {
            ((IWorldAccess)ListInvoker.get(this.B, i)).a(n, bl, d, d2, d3, d4, d5, d6, nArray);
        }
    }

    public boolean h() {
        return (double)this.f(1.0f) > 0.2;
    }

    private String lambda$addWorldInfoToCrashReport$4() throws Exception {
        return sf_0.b(this.a);
    }

    public long B() {
        return uv_2.f(this.z);
    }

    public BlockPos a(String string, BlockPos blockPos) {
        return sf_0.a(this.o(), this, string, blockPos);
    }

    public void a(int n, BlockPos blockPos, int n2) {
        for (int i = 0; i < ListInvoker.size(this.B); ++i) {
            nd_0.a((IWorldAccess)ListInvoker.get(this.B, i), n, blockPos, n2);
        }
    }

    public List<EntityPlayer> e() {
        return this.m;
    }

    public BlockPos t(BlockPos blockPos) {
        return this.f(blockPos).a(blockPos);
    }

    public BlockPos h(BlockPos blockPos) {
        int n = amv_2.j(blockPos) >= -30000000 && amv_2.i(blockPos) >= -30000000 && amv_2.j(blockPos) < 30000000 && amv_2.i(blockPos) < 30000000 ? (this.a(amv_2.j(blockPos) >> 4, amv_2.i(blockPos) >> 4, true) ? aqp_2.b(this.c(amv_2.j(blockPos) >> 4, amv_2.i(blockPos) >> 4), amv_2.j(blockPos) & 0xF, amv_2.i(blockPos) & 0xF) : 0) : this.v() + 1;
        return new BlockPos(amv_2.j(blockPos), n, amv_2.i(blockPos));
    }

    public int N() {
        return qq_2.a(this.d, this.z.e());
    }

    public boolean a(BlockPos blockPos, boolean bl) {
        if (!this.b(blockPos)) {
            return bl;
        }
        Chunk chunk = sf_0.a(this.a, blockPos);
        if (aqp_2.o(chunk)) {
            return bl;
        }
        Block block = BlockStateInvoker.getBlock(this.b(blockPos));
        return akm_1.g(BlocksInvoker.getBlockState(block)) && BlocksInvoker.p(block);
    }

    public Entity b(int n) {
        return (Entity)a8a_0.c(this.H, n);
    }

    protected void M() {
        if (this.z.t()) {
            this.s = 1.0f;
            if (this.z.J()) {
                this.f = 1.0f;
            }
        }
    }

    public void a(String string, wo_0 wo_02) {
        P7.a(this.K, string, wo_02);
    }

    private boolean a(int n, int n2, int n3, int n4, int n5, int n6, boolean bl) {
        if (n2 < 256) {
            n3 >>= 4;
            n4 >>= 4;
            n6 >>= 4;
            for (int i = n >>= 4; i <= n4; ++i) {
                for (int j = n3; j <= n6; ++j) {
                    if (this.a(i, j, bl)) continue;
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    protected void a(int n, int n2, Chunk chunk) {
        ProfilerInvoker.a(this.A, aql_1.V);
        if (this.i == 0 && !this.isRemote) {
            EntityPlayer entityPlayer;
            this.C = this.C * 3 + 1013904223;
            int n3 = this.C >> 2;
            int n4 = n3 & 0xF;
            int n5 = n3 >> 8 & 0xF;
            int n6 = n3 >> 16 & 0xFF;
            BlockPos blockPos = new BlockPos(n4, n6, n5);
            Block block = aqp_2.d(chunk, blockPos);
            n4 += n;
            n5 += n2;
            if (BlocksInvoker.getBlockState(block) == Material.air && this.z(blockPos) <= a5_0.a(this.o, 8) && this.b(YG.SKY, blockPos) <= 0 && a6w_0.b(entityPlayer = this.a((double)n4 + 0.5, (double)n6 + 0.5, (double)n5 + 0.5, 8.0), (double)n4 + 0.5, (double)n6 + 0.5, (double)n5 + 0.5) > 4.0) {
                this.a((double)n4 + 0.5, (double)n6 + 0.5, (double)n5 + 0.5, aql_1.M, 0.7f, 0.8f + a5_0.e(this.o) * 0.2f);
                this.i = a5_0.a(this.o, 12000) + 6000;
            }
        }
        ProfilerInvoker.a(this.A, aql_1.m);
        aqp_2.j(chunk);
    }

    protected void h(Entity entity) {
        for (int i = 0; i < ListInvoker.size(this.B); ++i) {
            ((IWorldAccess)ListInvoker.get(this.B, i)).a(entity);
        }
        EventManagerInvoker.call(new SpawnCheckEvent(entity, yd_2.REMOVE));
    }

    public boolean b(int n, int n2) {
        BlockPos blockPos = this.r();
        int n3 = n * 16 + 8 - amv_2.j(blockPos);
        int n4 = n2 * 16 + 8 - amv_2.i(blockPos);
        int n5 = 128;
        return n3 >= -n5 && n3 <= n5 && n4 >= -n5 && n4 <= n5;
    }

    public boolean a(Entity entity) {
        int n = MathHelper.floor_double(entity.posX / 16.0);
        int n2 = MathHelper.floor_double(entity.posZ / 16.0);
        boolean cfr_ignored_0 = entity.ah;
        if (entity instanceof EntityPlayer) {
            // empty if block
        }
        if (!this.a(n, n2, true)) {
            return false;
        }
        if (entity instanceof EntityPlayer) {
            EntityPlayer entityPlayer = (EntityPlayer)entity;
            ListInvoker.add(this.e(), entityPlayer);
            this.s();
        }
        aqp_2.a(this.c(n, n2), entity);
        ListInvoker.add(this.V(), entity);
        this.e(entity);
        return true;
    }

    public Calendar j() {
        if (this.B() % 600L == 0L) {
            afv_2.a(this.D, ServerInvoker.c());
        }
        return this.D;
    }

    public static boolean a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        IBlockState iBlockState = iBlockAccess.b(blockPos);
        Block block = BlockStateInvoker.getBlock(iBlockState);
        return akm_1.g(BlocksInvoker.getBlockState(block)) && BlocksInvoker.p(block) || (block instanceof hn_2 ? BlockStateInvoker.b(iBlockState, hn_2.U) == JA.TOP : (block instanceof hj_2 ? BlockStateInvoker.b(iBlockState, hj_2.P) == wj_2.TOP : block instanceof fy_1 || block instanceof hq_1 && P8.b((Integer)BlockStateInvoker.b(iBlockState, hq_1.P)) == 7));
    }

    public boolean D() {
        return (double)this.a(1.0f) > 0.9;
    }

    public EntityPlayer a(UUID uUID) {
        for (int i = 0; i < ListInvoker.size(this.e()); ++i) {
            EntityPlayer entityPlayer = (EntityPlayer)ListInvoker.get(this.e(), i);
            if (!uUID.equals(a6w_0.g(entityPlayer))) continue;
            return entityPlayer;
        }
        return null;
    }

    public boolean a(rm_2 rm_22, Material material, Entity entity) {
        int n;
        int n2 = MathHelper.floor_double(rm_22.e);
        int n3 = MathHelper.floor_double(rm_22.b + 1.0);
        int n4 = MathHelper.floor_double(rm_22.a);
        int n5 = MathHelper.floor_double(rm_22.c + 1.0);
        int n6 = MathHelper.floor_double(rm_22.f);
        if (!this.a(n2, n4, n6, n3, n5, n = MathHelper.floor_double(rm_22.d + 1.0), true)) {
            return false;
        }
        boolean bl = false;
        Vec3 vec3 = new Vec3(0.0, 0.0, 0.0);
        z6_0 z6_02 = new z6_0();
        for (int i = n2; i < n3; ++i) {
            for (int j = n4; j < n5; ++j) {
                for (int k = n6; k < n; ++k) {
                    double d;
                    ain_1.a(z6_02, i, j, k);
                    IBlockState iBlockState = this.b(z6_02);
                    Block block = BlockStateInvoker.getBlock(iBlockState);
                    if (BlocksInvoker.getBlockState(block) != material || !((double)n5 >= (d = (double)((float)(j + 1) - mu_1.a(P8.b((Integer)BlockStateInvoker.b(iBlockState, BlockLiquid.P))))))) continue;
                    bl = true;
                    vec3 = BlocksInvoker.a(block, this, (BlockPos)z6_02, entity, vec3);
                }
            }
        }
        if (aNE.c(vec3) > 0.0 && ayj_0.f(entity)) {
            vec3 = aNE.b(vec3);
            double d = 0.014;
            entity.motionX += vec3.xCoord * d;
            entity.motionY += vec3.yCoord * d;
            entity.motionZ += vec3.zCoord * d;
        }
        return bl;
    }

    public boolean a(agl_1 agl_12, Entity entity) {
        double d = ak9_0.c(agl_12);
        double d2 = ak9_0.j(agl_12);
        double d3 = ak9_0.p(agl_12);
        double d4 = ak9_0.m(agl_12);
        if (ayj_0.o(entity)) {
            d += 1.0;
            d2 += 1.0;
            d3 -= 1.0;
            d4 -= 1.0;
        } else {
            d -= 1.0;
            d2 -= 1.0;
            d3 += 1.0;
            d4 += 1.0;
        }
        return entity.posX > d && entity.posX < d3 && entity.posZ > d2 && entity.posZ < d4;
    }

    public boolean j(BlockPos blockPos) {
        return this.c(blockPos, false);
    }

    public float T() {
        return a9K.i[qq_2.a(this.d, this.z.e())];
    }

    public Vec3 h(float f) {
        float f2 = this.g(f);
        return qq_2.a(this.d, f2, f);
    }

    public String u() {
        return sf_0.b(this.a);
    }

    public boolean a(BlockPos blockPos, IBlockState iBlockState, int n) {
        if (!this.b(blockPos)) {
            return false;
        }
        if (!this.isRemote && uv_2.r(this.z) == WorldType.l) {
            return false;
        }
        Chunk chunk = this.f(blockPos);
        BlockStateInvoker.getBlock(iBlockState);
        aqp_2.a(chunk, blockPos, iBlockState);
        return false;
    }

    public void c(BlockPos blockPos, Block block) {
        if (!this.isRemote) {
            IBlockState iBlockState = this.b(blockPos);
            try {
                BlocksInvoker.a(BlockStateInvoker.getBlock(iBlockState), this, blockPos, iBlockState, block);
            }
            catch (Throwable throwable) {
                CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, aql_1.c);
                CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, aql_1.y);
                CrashReportCategoryInvoker.a(crashReportCategory, aql_1.i, () -> World.lambda$notifyBlockOfStateChange$1(block));
                CrashReportCategoryInvoker.a(crashReportCategory, blockPos, iBlockState);
                throw new ReportedException(crashReport);
            }
        }
    }

    public void l(BlockPos blockPos) {
        for (int i = 0; i < ListInvoker.size(this.B); ++i) {
            ((IWorldAccess)ListInvoker.get(this.B, i)).b(blockPos);
        }
    }

    private static void lambda$playSoundEffect$2(String string, double d, double d2, double d3, float f, float f2, IWorldAccess iWorldAccess) {
        nd_0.a(iWorldAccess, string, d, d2, d3, f, f2);
    }

    public void a(BlockPos blockPos, TileEntity tileEntity) {
        if (this.i(blockPos)) {
            aqp_2.t(this.f(blockPos));
        }
    }

    public Block b(double d, double d2, double d3) {
        return this.a((int)d, (int)d2, (int)d3);
    }

    public Block r(BlockPos blockPos) {
        BlockPos blockPos2 = new BlockPos(amv_2.j(blockPos), this.v(), amv_2.i(blockPos));
        while (!this.a(amv_2.e(blockPos2))) {
            blockPos2 = amv_2.e(blockPos2);
        }
        return BlockStateInvoker.getBlock(this.b(blockPos2));
    }

    public void b(TileEntity tileEntity) {
        ListInvoker.add(this.x(), tileEntity);
        if (tileEntity instanceof ITickable) {
            ListInvoker.add(this.k(), tileEntity);
        }
    }

    public void a(TileEntity tileEntity) {
        ListInvoker.add(this.N, tileEntity);
    }

    public void a(BlockPos blockPos, Block block, int n) {
    }

    protected abstract em_1 n();

    public za_2 m() {
        return this.v;
    }

    public void o(BlockPos blockPos) {
        for (int i = 0; i < ListInvoker.size(this.B); ++i) {
            ((IWorldAccess)ListInvoker.get(this.B, i)).a(blockPos);
        }
    }

    public int a(int n, int n2) {
        if (n >= -30000000 && n2 >= -30000000 && n < 30000000 && n2 < 30000000) {
            if (!this.a(n >> 4, n2 >> 4, true)) {
                return 0;
            }
            Chunk chunk = this.c(n >> 4, n2 >> 4);
            return aqp_2.q(chunk);
        }
        return this.v() + 1;
    }

    public void i() {
        this.y();
    }

    public void a(int n, int n2, int n3, int n4, int n5, int n6) {
        for (int i = 0; i < ListInvoker.size(this.B); ++i) {
            ((IWorldAccess)ListInvoker.get(this.B, i)).a(n, n2, n3, n4, n5, n6);
        }
    }

    protected void y() {
        if (!qq_2.e(this.d) && !this.isRemote) {
            int n = uv_2.h(this.z);
            uv_2.i(this.z, --n);
            uv_2.b(this.z, this.z.J() ? 1 : 2);
            uv_2.h(this.z, this.z.t() ? 1 : 2);
            uv_2.y(this.z);
            if (this.z.J()) {
                uv_2.b(this.z, a5_0.a(this.o, 12000) + 3600);
            } else {
                uv_2.b(this.z, a5_0.a(this.o, 168000) + 12000);
            }
            this.h = this.f;
            this.f = this.z.J() ? (float)((double)this.f + 0.01) : (float)((double)this.f - 0.01);
            this.f = MathHelper.b(this.f, 0.0f, 1.0f);
            uv_2.o(this.z);
            if (this.z.t()) {
                uv_2.h(this.z, a5_0.a(this.o, 12000) + 12000);
            } else {
                uv_2.h(this.z, a5_0.a(this.o, 168000) + 12000);
            }
            this.p = this.s;
            this.s = this.z.t() ? (float)((double)this.s + 0.01) : (float)((double)this.s - 0.01);
            this.s = MathHelper.b(this.s, 0.0f, 1.0f);
        }
    }

    public boolean b(rm_2 rm_22) {
        int n = MathHelper.floor_double(rm_22.e);
        int n2 = MathHelper.floor_double(rm_22.b);
        int n3 = MathHelper.floor_double(rm_22.a);
        int n4 = MathHelper.floor_double(rm_22.c);
        int n5 = MathHelper.floor_double(rm_22.f);
        int n6 = MathHelper.floor_double(rm_22.d);
        z6_0 z6_02 = new z6_0();
        for (int i = n; i <= n2; ++i) {
            for (int j = n3; j <= n4; ++j) {
                for (int k = n5; k <= n6; ++k) {
                    Block block = BlockStateInvoker.getBlock(this.b(ain_1.a(z6_02, i, j, k)));
                    if (BlocksInvoker.getBlockState(block) == Material.air) continue;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean e(BlockPos blockPos) {
        return this.b(amv_2.g(blockPos), EnumFacing.DOWN) > 0 || this.b(amv_2.e(blockPos), EnumFacing.UP) > 0 || this.b(amv_2.a(blockPos), EnumFacing.NORTH) > 0 || this.b(amv_2.b(blockPos), EnumFacing.SOUTH) > 0 || this.b(amv_2.d(blockPos), EnumFacing.WEST) > 0 || this.b(amv_2.f(blockPos), EnumFacing.EAST) > 0;
    }

    public boolean a(BlockPos blockPos, IBlockState iBlockState) {
        return this.a(blockPos, iBlockState, 3);
    }

    public boolean a(EntityPlayer entityPlayer, BlockPos blockPos, EnumFacing enumFacing) {
        if (BlockStateInvoker.getBlock(this.b(blockPos = amv_2.a(blockPos, enumFacing))) == Blocks.c) {
            this.a(entityPlayer, 1004, blockPos, 0);
            this.p(blockPos);
            return true;
        }
        return false;
    }

    @Override
    public WorldType e() {
        return uv_2.r(this.z);
    }

    @Override
    public TileEntity c(BlockPos blockPos) {
        TileEntity tileEntity;
        int n;
        if (!this.b(blockPos)) {
            return null;
        }
        TileEntity tileEntity2 = null;
        if (this.t) {
            for (n = 0; n < ListInvoker.size(this.q); ++n) {
                tileEntity = (TileEntity)ListInvoker.get(this.q, n);
                if (NBTInvoker.e(tileEntity) || !NBTInvoker.g(tileEntity).equals(blockPos)) continue;
                tileEntity2 = tileEntity;
                break;
            }
        }
        tileEntity2 = aqp_2.a(this.f(blockPos), blockPos, EnumCreateEntityType.IMMEDIATE);
        for (n = 0; n < ListInvoker.size(this.q); ++n) {
            tileEntity = (TileEntity)ListInvoker.get(this.q, n);
            if (NBTInvoker.e(tileEntity) || !NBTInvoker.g(tileEntity).equals(blockPos)) continue;
            tileEntity2 = tileEntity;
            break;
        }
        return tileEntity2;
    }

    public void a(BlockPos blockPos, Block block, int n, int n2) {
        BlocksInvoker.a(block, this, blockPos, this.b(blockPos), n, n2);
    }

    public void a(BlockPos blockPos, Block block) {
        this.c(amv_2.d(blockPos), block);
        this.c(amv_2.f(blockPos), block);
        this.c(amv_2.g(blockPos), block);
        this.c(amv_2.e(blockPos), block);
        this.c(amv_2.a(blockPos), block);
        this.c(amv_2.b(blockPos), block);
    }

    public float j(float f) {
        float f2 = this.g(f);
        float f3 = 1.0f - (MathHelper.cos(f2 * (float)Math.PI * 2.0f) * 2.0f + 0.2f);
        f3 = MathHelper.b(f3, 0.0f, 1.0f);
        f3 = 1.0f - f3;
        f3 = (float)((double)f3 * (1.0 - (double)(this.f(f) * 5.0f) / 16.0));
        f3 = (float)((double)f3 * (1.0 - (double)(this.a(f) * 5.0f) / 16.0));
        return f3 * 0.8f + 0.2f;
    }

    public boolean B(BlockPos blockPos) {
        return this.f(blockPos).g(blockPos);
    }

    public boolean p(BlockPos blockPos) {
        return this.a(blockPos, BlocksInvoker.t(Blocks.air), 3);
    }

    public String t() {
        return aL0.c(aL0.a(new StringBuilder(), aql_1.I), ListInvoker.size(this.V())).toString();
    }

    public boolean e(rm_2 rm_22) {
        return this.a(rm_22, (Entity)null);
    }

    public ct_2 S() {
        return this.d.q();
    }

    public ads_1 g() {
        return this.K;
    }

    public boolean a(YG yG, BlockPos blockPos) {
        if (!this.a(blockPos, 17, false)) {
            return false;
        }
        int n = 0;
        int n2 = 0;
        ProfilerInvoker.startSection(this.A, aql_1.o);
        int n3 = this.b(yG, blockPos);
        int n4 = this.a(blockPos, yG);
        int n5 = amv_2.j(blockPos);
        int n6 = amv_2.h(blockPos);
        int n7 = amv_2.i(blockPos);
        if (n4 > n3) {
            this.F[n2++] = 133152;
        } else if (n4 < n3) {
            this.F[n2++] = 0x20820 | n3 << 18;
            while (n < n2) {
                int n8;
                int n9;
                int n10 = this.F[n++];
                int n11 = (n10 & 0x3F) - 32 + n5;
                int n12 = (n10 >> 6 & 0x3F) - 32 + n6;
                int n13 = (n10 >> 12 & 0x3F) - 32 + n7;
                int n14 = n10 >> 18 & 0xF;
                BlockPos blockPos2 = new BlockPos(n11, n12, n13);
                int n15 = this.b(yG, blockPos2);
                if (n15 != n14) continue;
                this.a(yG, blockPos2, 0);
                int n16 = MathHelper.a(n11 - n5);
                if (n16 + (n9 = MathHelper.a(n12 - n6)) + (n8 = MathHelper.a(n13 - n7)) >= 17) continue;
                z6_0 z6_02 = new z6_0();
                for (EnumFacing enumFacing : EnumFacing.values()) {
                    int n17 = n11 + SJ.k(enumFacing);
                    int n18 = n12 + SJ.f(enumFacing);
                    int n19 = n13 + SJ.a(enumFacing);
                    ain_1.a(z6_02, n17, n18, n19);
                    int n20 = MathInvoker.max(1, BlocksInvoker.b(BlockStateInvoker.getBlock(this.b(z6_02))));
                    n15 = this.b(yG, (BlockPos)z6_02);
                    if (n15 != n14 - n20 || n2 >= this.F.length) continue;
                    this.F[n2++] = n17 - n5 + 32 | n18 - n6 + 32 << 6 | n19 - n7 + 32 << 12 | n14 - n20 << 18;
                }
            }
            n = 0;
        }
        ProfilerInvoker.endSection(this.A);
        ProfilerInvoker.startSection(this.A, aql_1.Q);
        ProfilerInvoker.endSection(this.A);
        return true;
    }

    @Override
    public il_0 d(BlockPos blockPos) {
        if (this.i(blockPos)) {
            Chunk chunk = this.f(blockPos);
            try {
                return aqp_2.a(chunk, blockPos, this.d.q());
            }
            catch (Throwable throwable) {
                CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, aql_1.w);
                CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, aql_1.B);
                CrashReportCategoryInvoker.a(crashReportCategory, aql_1.z, () -> World.lambda$getBiomeGenForCoords$0(blockPos));
                throw new ReportedException(crashReport);
            }
        }
        return aqo_0.a(this.d.q(), blockPos, il_0.G);
    }

    public boolean a(BlockPos blockPos, int n) {
        return this.a(blockPos, n, true);
    }

    public void U() throws cd_1 {
        this.w.b();
    }

    public List<TileEntity> k() {
        return this.E;
    }

    public void a(WorldSettings worldSettings) {
        uv_2.a(this.z, true);
    }

    public boolean m(BlockPos blockPos) {
        return this.c(blockPos, true);
    }

    public ach_0 k(BlockPos blockPos) {
        long l4 = 0L;
        float f = 0.0f;
        if (this.i(blockPos)) {
            f = this.T();
            l4 = aqp_2.e(this.f(blockPos));
        }
        return new ach_0(this.H(), this.E(), l4, f);
    }

    public Block a(int n, int n2, int n3) {
        if (n >= -30000000 && n3 >= -30000000 && n < 30000000 && n3 < 30000000 && n2 < 256) {
            Chunk chunk = null;
            try {
                chunk = this.c(n >> 4, n3 >> 4);
                return aqp_2.a(chunk, n & 0xF, n2, n3 & 0xF);
            }
            catch (Throwable throwable) {
                CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, aql_1.v);
                CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, aql_1.F);
                CrashReportCategoryInvoker.addCrashSection(crashReportCategory, aql_1.l, auk_2.b(true));
                throw new ReportedException(crashReport);
            }
        }
        return Blocks.air;
    }

    public void a(BlockPos blockPos, String string) {
        for (int i = 0; i < ListInvoker.size(this.B); ++i) {
            nd_0.a((IWorldAccess)ListInvoker.get(this.B, i), string, blockPos);
        }
    }

    public BlockPos r() {
        BlockPos blockPos = new BlockPos(uv_2.v(this.z), uv_2.d(this.z), uv_2.q(this.z));
        if (!ak9_0.a(this.R(), blockPos)) {
            blockPos = this.h(new BlockPos(ak9_0.g(this.R()), 0.0, ak9_0.o(this.R())));
        }
        return blockPos;
    }

    public void b(float f) {
        this.h = f;
        this.f = f;
    }

    public List<a5D> a(Chunk chunk, boolean bl) {
        return null;
    }

    public BlockPos q(BlockPos blockPos) {
        BlockPos blockPos2;
        Material material;
        Chunk chunk = this.f(blockPos);
        BlockPos blockPos3 = new BlockPos(amv_2.j(blockPos), aqp_2.k(chunk) + 16, amv_2.i(blockPos));
        while (!(amv_2.h(blockPos3) < 0 || akm_1.d(material = BlocksInvoker.getBlockState(aqp_2.d(chunk, blockPos2 = amv_2.g(blockPos3)))) && material != Material.z)) {
            blockPos3 = blockPos2;
        }
        return blockPos3;
    }

    public void J() {
        int n;
        int n2;
        Object object;
        int n3;
        ProfilerInvoker.startSection(this.A, aql_1.G);
        ProfilerInvoker.startSection(this.A, aql_1.D);
        for (n3 = 0; n3 < ListInvoker.size(this.f()); ++n3) {
            object = (Entity)ListInvoker.get(this.f(), n3);
            try {
                ++((Entity)object).ticksExisted;
                ayj_0.Q((Entity)object);
            }
            catch (Throwable throwable) {
                CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, aql_1.d);
                CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, aql_1.E);
                CrashReportCategoryInvoker.addCrashSection(crashReportCategory, aql_1.X, aql_1.f);
                throw new ReportedException(crashReport);
            }
            if (!((Entity)object).isDead) continue;
            ListInvoker.remove(this.f(), n3--);
        }
        ProfilerInvoker.a(this.A, aql_1.N);
        ListInvoker.removeAll(this.V(), this.k);
        for (n3 = 0; n3 < ListInvoker.size(this.k); ++n3) {
            object = (Entity)ListInvoker.get(this.k, n3);
            n2 = ((Entity)object).V;
            n = ((Entity)object).s;
            if (!((Entity)object).a || !this.a(n2, n, true)) continue;
            this.c(n2, n).b((Entity)object);
        }
        for (n3 = 0; n3 < ListInvoker.size(this.k); ++n3) {
            this.h((Entity)ListInvoker.get(this.k, n3));
        }
        ListInvoker.clear(this.k);
        ProfilerInvoker.a(this.A, aql_1.u);
        for (n3 = 0; n3 < ListInvoker.size(this.V()); ++n3) {
            object = (Entity)ListInvoker.get(this.V(), n3);
            if (((Entity)object).r != null) {
                if (!((Entity)object).r.isDead && ((Entity)object).r.h == object) continue;
                ((Entity)object).r.h = null;
                ((Entity)object).r = null;
            }
            ProfilerInvoker.startSection(this.A, aql_1.b);
            if (!((Entity)object).isDead) {
                try {
                    this.f((Entity)object);
                }
                catch (Throwable throwable) {
                    CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, aql_1.T);
                    CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, aql_1.L);
                    ayj_0.a((Entity)object, crashReportCategory);
                    throw new ReportedException(crashReport);
                }
            }
            ProfilerInvoker.endSection(this.A);
            ProfilerInvoker.startSection(this.A, aql_1.g);
            if (((Entity)object).isDead) {
                n2 = ((Entity)object).V;
                n = ((Entity)object).s;
                if (((Entity)object).a && this.a(n2, n, true)) {
                    this.c(n2, n).b((Entity)object);
                }
                ListInvoker.remove(this.V(), n3--);
                this.h((Entity)object);
            }
            ProfilerInvoker.endSection(this.A);
        }
        ProfilerInvoker.a(this.A, aql_1.x);
        this.t = true;
        Iterator iterator = ListInvoker.iterator(this.k());
        while (dz_0.c(iterator)) {
            BlockPos blockPos;
            object = (TileEntity)dz_0.b(iterator);
            if (!NBTInvoker.e((TileEntity)object) && NBTInvoker.b((TileEntity)object) && this.i(blockPos = NBTInvoker.g((TileEntity)object)) && ak9_0.a(this.L, blockPos)) {
                try {
                    a9y_0.a((ITickable)object);
                }
                catch (Throwable throwable) {
                    CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, aql_1.p);
                    CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, aql_1.a);
                    NBTInvoker.a((TileEntity)object, crashReportCategory);
                    throw new ReportedException(crashReport);
                }
            }
            if (!NBTInvoker.e((TileEntity)object)) continue;
            dz_0.a(iterator);
            ListInvoker.remove(this.x(), object);
            if (!this.i(NBTInvoker.g((TileEntity)object))) continue;
            this.f(NBTInvoker.g((TileEntity)object)).b(NBTInvoker.g((TileEntity)object));
        }
        this.t = false;
        if (!ListInvoker.isEmpty(this.N)) {
            ListInvoker.removeAll(this.k(), this.N);
            ListInvoker.removeAll(this.x(), this.N);
            ListInvoker.clear(this.N);
        }
        ProfilerInvoker.a(this.A, aql_1.j);
        if (!ListInvoker.isEmpty(this.q)) {
            for (int i = 0; i < ListInvoker.size(this.q); ++i) {
                TileEntity tileEntity = (TileEntity)ListInvoker.get(this.q, i);
                if (NBTInvoker.e(tileEntity)) continue;
                if (!ListInvoker.contains(this.x(), tileEntity)) {
                    this.b(tileEntity);
                }
                if (this.i(NBTInvoker.g(tileEntity))) {
                    aqp_2.a(this.f(NBTInvoker.g(tileEntity)), NBTInvoker.g(tileEntity), tileEntity);
                }
                this.o(NBTInvoker.g(tileEntity));
            }
            ListInvoker.clear(this.q);
        }
        ProfilerInvoker.endSection(this.A);
        ProfilerInvoker.endSection(this.A);
    }

    public <T extends Entity> T a(Class<? extends T> clazz, rm_2 rm_22, T t) {
        List<? extends T> list = this.a(clazz, rm_22);
        Entity entity = null;
        double d = Double.MAX_VALUE;
        for (int i = 0; i < ListInvoker.size(list); ++i) {
            double d2;
            Entity entity2 = (Entity)ListInvoker.get(list, i);
            if (entity2 == t || !aqv_2.a(od_2.d, entity2) || !((d2 = ayj_0.a(t, entity2)) <= d)) continue;
            entity = entity2;
            d = d2;
        }
        return (T)entity;
    }

    public List<Entity> f() {
        return this.r;
    }

    public void a(Entity entity, double d, double d2, double d3, float f, boolean bl, boolean bl2) {
        aw0_0 aw0_02 = new aw0_0(this, entity, d, d2, d3, f, bl, bl2);
        aI9.e(aw0_02);
        aI9.a(aw0_02, true);
    }

    public Chunk f(BlockPos blockPos) {
        return this.c(amv_2.j(blockPos) >> 4, amv_2.i(blockPos) >> 4);
    }

    public boolean b(BlockPos blockPos, Block block) {
        return false;
    }

    private static Throwable b(Throwable throwable) {
        return throwable;
    }

    public ISaveHandler q() {
        return this.w;
    }

    protected World(ISaveHandler iSaveHandler, WorldInfo worldInfo, a9K a9K2, Profiler profiler, boolean bl) {
        this.j = my_0.c();
        this.E = my_0.c();
        this.m = my_0.c();
        this.r = my_0.c();
        this.k = my_0.c();
        this.q = my_0.c();
        this.N = my_0.c();
        this.H = new IntHashMap();
        this.C = a5_0.d(new Random());
        this.o = new Random();
        this.B = my_0.c();
        this.D = afv_2.a();
        this.v = new za_2();
        this.b = axe_2.a();
        this.i = a5_0.a(this.o, 12000);
        this.F = new int[32768];
        this.w = iSaveHandler;
        this.A = profiler;
        this.z = worldInfo;
        this.d = a9K2;
        this.isRemote = bl;
        this.L = a9K2.p();
    }

    public int z() {
        return qq_2.e(this.d) ? 128 : 256;
    }

    public Random b(int n, int n2, int n3) {
        long l4 = (long)n * 341873128712L + (long)n2 * 132897987541L + this.w().g() + (long)n3;
        a5_0.a(this.o, l4);
        return this.o;
    }

    public void s(BlockPos blockPos) {
        TileEntity tileEntity = this.c(blockPos);
        if (this.t) {
            NBTInvoker.a(tileEntity);
            ListInvoker.remove(this.q, tileEntity);
        } else {
            ListInvoker.remove(this.q, tileEntity);
            ListInvoker.remove(this.x(), tileEntity);
            ListInvoker.remove(this.k(), tileEntity);
            this.f(blockPos).b(blockPos);
        }
    }

    public void b(Entity entity) {
        ayj_0.D(entity);
        if (entity instanceof EntityPlayer) {
            ListInvoker.remove(this.e(), entity);
            this.s();
        }
        int n = entity.V;
        int n2 = entity.s;
        if (entity.a && this.a(n, n2, true)) {
            this.c(n, n2).b(entity);
        }
        ListInvoker.remove(this.V(), entity);
        this.h(entity);
    }

    @Override
    public IBlockState b(BlockPos blockPos) {
        if (!this.b(blockPos)) {
            return BlocksInvoker.t(Blocks.air);
        }
        Chunk chunk = this.f(blockPos);
        return chunk.d(blockPos);
    }

    public void a(BlockPos blockPos, BlockPos blockPos2) {
        this.a(amv_2.j(blockPos), amv_2.h(blockPos), amv_2.i(blockPos), amv_2.j(blockPos2), amv_2.h(blockPos2), amv_2.i(blockPos2));
    }

    public void f(Entity entity) {
        this.a(entity, true);
    }

    public boolean f(BlockPos blockPos, boolean bl) {
        return a44.a(this, blockPos, bl);
    }

    public void b(BlockPos blockPos, TileEntity tileEntity) {
        if (!NBTInvoker.e(tileEntity)) {
            if (this.t) {
                NBTInvoker.a(tileEntity, blockPos);
                Iterator iterator = ListInvoker.iterator(this.q);
                while (dz_0.c(iterator)) {
                    TileEntity tileEntity2 = (TileEntity)dz_0.b(iterator);
                    if (!NBTInvoker.g(tileEntity2).equals(blockPos)) continue;
                    NBTInvoker.a(tileEntity2);
                    dz_0.a(iterator);
                }
                ListInvoker.add(this.q, tileEntity);
            } else {
                this.b(tileEntity);
                aqp_2.a(this.f(blockPos), blockPos, tileEntity);
            }
        }
    }

    public float g(float f) {
        return qq_2.a(this.d, this.z.e(), f);
    }

    private static String lambda$getBiomeGenForCoords$0(BlockPos blockPos) throws Exception {
        return CrashReportCategoryInvoker.a(blockPos);
    }

    public World Q() {
        return this;
    }
}


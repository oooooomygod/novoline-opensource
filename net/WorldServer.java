/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.EntityPlayerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.NBTInvoker;
import cc.novoline.invoke.ProfilerInvoker;
import cc.novoline.invoke.SaveHandlerInvoker;
import cc.novoline.invoke.ServerInvoker;
import com.google.common.util.concurrent.ListenableFuture;
import deobf.EntityPlayerMP;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Chunk;
import net.minecraft.crash.CrashReportCategory;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.EnumDifficulty;
import net.minecraft.world.GameType;
import deobf.ISaveHandler;
import deobf.MinecraftServer;
import net.minecraft.profiler.Profiler;
import net.minecraft.util.ReportedException;
import deobf.TileEntity;
import deobf.Vec3;
import net.minecraft.world.WorldSettings;
import net.minecraft.network.packts.S19PacketEntityStatus;
import net.minecraft.network.packts.S24PacketBlockAction;
import net.minecraft.network.packts.S27PacketExplosion;
import net.minecraft.network.packts.S2APacketParticles;
import net.minecraft.network.packts.S2BPacketChangeGameState;
import net.minecraft.network.packts.S2CPacketSpawnGlobalEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;

import org.apache.logging.log4j.Logger;


public class WorldServer
extends World
implements IThreadListener {
    protected KI V;
    private Set<a5D> ac = axe_2.a();
    private boolean W;
    private List<a5D> U;
    private int T;
    private MinecraftServer af;
    private VD ab;
    private TreeSet<a5D> aa = new TreeSet();
    public boolean P;
    private pn_0[] X;
    private avV ae;
    private int S;
    private aQT Y;
    private static Logger ad = LogManagerInvoker.c();
    public aet_2 Z;
    private avp_1 O;
    private static List<C6> R = my_0.a(new C6[]{new C6(Items.stick, 0, 1, 3, 10), new C6(px_0.a(Blocks.planks), 0, 1, 3, 10), new C6(px_0.a(Blocks.b2), 0, 1, 3, 10), new C6(Items.stone_axe, 0, 1, 1, 3), new C6(Items.wooden_axe, 0, 1, 1, 5), new C6(Items.stone_pickaxe, 0, 1, 1, 3), new C6(Items.wooden_pickaxe, 0, 1, 1, 5), new C6(Items.apple, 0, 2, 3, 5), new C6(Items.bread, 0, 2, 3, 3), new C6(px_0.a(Blocks.bO), 0, 1, 3, 10)});
    private Map<UUID, Entity> Q = MapsInvoker.a();

    public boolean g() {
        if (this.W && !this.isRemote) {
            Iterator iterator = ListInvoker.iterator(this.e());
            while (dz_0.c(iterator)) {
                EntityPlayer entityPlayer = (EntityPlayer)dz_0.b(iterator);
                if (!a6w_0.l(entityPlayer) && a6w_0.s(entityPlayer)) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean b() {
        return this.af.b();
    }

    private void b(WorldSettings worldSettings) {
        if (!qq_2.l(this.d)) {
            uv_2.a(this.z, amv_2.c(BlockPos.m, qq_2.m(this.d)));
        } else if (uv_2.r(this.z) == WorldType.l) {
            uv_2.a(this.z, amv_2.e(BlockPos.m));
        } else {
            this.x = true;
            ct_2 ct_22 = this.d.q();
            List list = aqo_0.a(ct_22);
            Random random = new Random(this.F());
            BlockPos blockPos = aqo_0.a(ct_22, 0, 0, 256, list, random);
            int n = 0;
            int n2 = qq_2.m(this.d);
            int n3 = 0;
            n = amv_2.j(blockPos);
            n3 = amv_2.i(blockPos);
            int n4 = 0;
            while (!qq_2.b(this.d, n, n3)) {
                n += a5_0.a(random, 64) - a5_0.a(random, 64);
                n3 += a5_0.a(random, 64) - a5_0.a(random, 64);
                if (++n4 != 1000) continue;
            }
            uv_2.a(this.z, new BlockPos(n, n2, n3));
            this.x = false;
            if (add_1.d(worldSettings)) {
                this.j();
            }
        }
    }

    private boolean k() {
        return ServerInvoker.f(this.af);
    }

    public MinecraftServer e() {
        return this.af;
    }

    @Override
    public void J() {
        if (ListInvoker.isEmpty(this.e())) {
            if (this.T++ >= 1200) {
                return;
            }
        } else {
            this.p();
        }
        super.J();
    }

    public void a(B7 b7, double d, double d2, double d3, int n, double d4, double d5, double d6, double d7, int ... nArray) {
        this.a(b7, false, d, d2, d3, n, d4, d5, d6, d7, nArray);
    }

    public List<TileEntity> a(int n, int n2, int n3, int n4, int n5, int n6) {
        ArrayList arrayList = my_0.c();
        Iterator iterator = ListInvoker.iterator(this.x());
        while (dz_0.c(iterator)) {
            TileEntity tileEntity = (TileEntity)dz_0.b(iterator);
            TileEntity tileEntity2 = tileEntity;
            BlockPos blockPos = NBTInvoker.g(tileEntity2);
            if (amv_2.j(blockPos) < n || amv_2.h(blockPos) < n2 || amv_2.i(blockPos) < n3 || amv_2.j(blockPos) >= n4 || amv_2.h(blockPos) >= n5 || amv_2.i(blockPos) >= n6) continue;
            ListInvoker.add(arrayList, tileEntity2);
        }
        return arrayList;
    }

    @Override
    public ListenableFuture<Object> addScheduledTask(Runnable runnable) {
        return this.af.addScheduledTask(runnable);
    }

    private boolean r() {
        return ServerInvoker.w(this.af);
    }

    @Override
    public World Q() {
        this.K = new ads_1(this.w);
        String string = EX.a(this.d);
        wf_1 cfr_ignored_0 = (wf_1)P7.a(this.K, wf_1.class, string);
        this.n = new wf_1(this);
        P7.a(this.K, string, this.n);
        this.v = new zr_1(this.af);
        wb_1 wb_12 = (wb_1)P7.a(this.K, wb_1.class, et_0.s);
        wb_12 = new wb_1();
        P7.a(this.K, et_0.r, wb_12);
        aaa_1.a(wb_12, this.v);
        axd_0.a((zr_1)this.v, wb_12);
        ak9_0.b(this.R(), uv_2.l(this.z), uv_2.k(this.z));
        ak9_0.a(this.R(), uv_2.D(this.z));
        ak9_0.c(this.R(), uv_2.G(this.z));
        ak9_0.a(this.R(), uv_2.x(this.z));
        ak9_0.c(this.R(), uv_2.F(this.z));
        if (uv_2.B(this.z) > 0L) {
            ak9_0.a(this.R(), uv_2.u(this.z), uv_2.a(this.z), uv_2.B(this.z));
        } else {
            ak9_0.b(this.R(), uv_2.u(this.z));
        }
        return this;
    }

    @Override
    public List<a5D> a(Chunk chunk, boolean bl) {
        ChunkCoordIntPair chunkCoordIntPair = aqp_2.v(chunk);
        int n = (chunkCoordIntPair.b << 4) - 2;
        int n2 = n + 16 + 2;
        int n3 = (chunkCoordIntPair.a << 4) - 2;
        int n4 = n3 + 16 + 2;
        return this.a(new HF(n, 0, n3, n2, 256, n4), bl);
    }

    public cp_0 a(a40 a402, BlockPos blockPos) {
        List list = sf_0.a(this.o(), a402, blockPos);
        return !ListInvoker.isEmpty(list) ? (cp_0)mp_1.a(this.o, list) : null;
    }

    public void m() {
        if (sf_0.a(this.a)) {
            sf_0.e(this.a);
        }
    }

    @Override
    public void a(Entity entity, byte by) {
        a7Y.a(this.h(), entity, new S19PacketEntityStatus(entity, by));
    }

    public WorldServer(MinecraftServer minecraftServer, ISaveHandler iSaveHandler, WorldInfo worldInfo, int n, Profiler profiler) {
        super(iSaveHandler, worldInfo, qq_2.a(n), profiler, false);
        this.ab = new VD();
        this.V = new KI(this);
        this.X = new pn_0[]{new pn_0(null), new pn_0(null)};
        this.U = my_0.c();
        this.af = minecraftServer;
        this.Y = new aQT(this);
        this.O = new avp_1(this);
        qq_2.a(this.d, this);
        this.a = this.n();
        this.ae = new avV(this);
        this.A();
        this.M();
        ak9_0.b(this.R(), ServerInvoker.o(minecraftServer));
    }

    @Override
    public boolean g(Entity entity) {
        if (super.g(entity)) {
            aek_1.a(ServerInvoker.R(this.af), entity.posX, entity.posY, entity.posZ, 512.0, qq_2.j(this.d), new S2CPacketSpawnGlobalEntity(entity));
            return true;
        }
        return false;
    }

    public Entity a(UUID uUID) {
        return (Entity)MapInvoker.c(this.Q, uUID);
    }

    public void a(B7 b7, boolean bl, double d, double d2, double d3, int n, double d4, double d5, double d6, double d7, int ... nArray) {
        S2APacketParticles s2APacketParticles = new S2APacketParticles(b7, bl, (float)d, (float)d2, (float)d3, (float)d4, (float)d5, (float)d6, (float)d7, n, nArray);
        Iterator iterator = ListInvoker.iterator(this.e());
        while (dz_0.c(iterator)) {
            EntityPlayer entityPlayer = (EntityPlayer)dz_0.b(iterator);
            EntityPlayerMP entityPlayerMP = (EntityPlayerMP)entityPlayer;
            BlockPos blockPos = EntityPlayerInvoker.x(entityPlayerMP);
            double d8 = amv_2.c(blockPos, d, d2, d3);
            if (!(d8 <= 256.0) && !(d8 <= 65536.0)) continue;
            qv_0.a(entityPlayerMP.playerNetServerHandler, s2APacketParticles);
        }
    }

    @Override
    public boolean b(BlockPos blockPos, Block block) {
        a5D a5D2 = new a5D(blockPos, block);
        return ListInvoker.contains(this.U, a5D2);
    }

    protected void n() throws cd_1 {
        this.U();
        uv_2.a(this.z, ak9_0.e(this.R()));
        uv_2.f(this.z, ak9_0.g(this.R()));
        uv_2.c(this.z, ak9_0.o(this.R()));
        uv_2.d(this.z, ak9_0.b(this.R()));
        uv_2.e(this.z, ak9_0.d(this.R()));
        uv_2.f(this.z, ak9_0.k(this.R()));
        uv_2.c(this.z, ak9_0.f(this.R()));
        uv_2.b(this.z, ak9_0.i(this.R()));
        uv_2.a(this.z, ak9_0.n(this.R()));
        SaveHandlerInvoker.a(this.w, this.z, aek_1.j(ServerInvoker.R(this.af)));
        P7.a(this.K);
    }

    protected void j() {
        ic_1 ic_12 = new ic_1(R, 10);
        int n = 0;
        int n2;
        int n3;
        BlockPos blockPos;
        while (!qf_1.a(ic_12, this, this.o, blockPos = amv_2.e(this.q(new BlockPos(n3 = uv_2.v(this.z) + a5_0.a(this.o, 6) - a5_0.a(this.o, 6), 0, n2 = uv_2.q(this.z) + a5_0.a(this.o, 6) - a5_0.a(this.o, 6)))))) {
            ++n;
        }
        return;
    }

    @Override
    public void a(boolean bl) {
        if (uv_2.r(this.z) != WorldType.l) {
            a5D a5D2;
            int n = asw_2.b(this.aa);
            if (n != aS0.d(this.ac)) {
                throw new IllegalStateException(et_0.l);
            }
            if (n > 1000) {
                n = 1000;
            }
            ProfilerInvoker.startSection(this.A, et_0.g);
            for (int i = 0; i < n; ++i) {
                a5D2 = (a5D)asw_2.a(this.aa);
                if (a5D2.a > uv_2.f(this.z)) break;
                asw_2.b(this.aa, a5D2);
                aS0.a(this.ac, a5D2);
                ListInvoker.add(this.U, a5D2);
            }
            ProfilerInvoker.endSection(this.A);
            ProfilerInvoker.startSection(this.A, et_0.C);
            Iterator iterator = ListInvoker.iterator(this.U);
            while (dz_0.c(iterator)) {
                a5D2 = (a5D)dz_0.b(iterator);
                dz_0.a(iterator);
                if (this.b(amv_2.a(a5D2.b, 0, 0, 0), amv_2.a(a5D2.b, 0, 0, 0))) {
                    IBlockState iBlockState = this.b(a5D2.b);
                    if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(iBlockState)) == Material.air || !BlocksInvoker.a(BlockStateInvoker.getBlock(iBlockState), aqj_1.a(a5D2))) continue;
                    try {
                        BlocksInvoker.c(BlockStateInvoker.getBlock(iBlockState), this, a5D2.b, iBlockState, this.o);
                        continue;
                    }
                    catch (Throwable throwable) {
                        CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, et_0.d);
                        CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, et_0.c);
                        CrashReportCategoryInvoker.a(crashReportCategory, a5D2.b, iBlockState);
                        throw new ReportedException(crashReport);
                    }
                }
                this.a(a5D2.b, aqj_1.a(a5D2), 0);
            }
            ProfilerInvoker.endSection(this.A);
            ListInvoker.clear(this.U);
        }
    }

    private void b() {
        uv_2.h(this.z, 0);
        uv_2.d(this.z, false);
        uv_2.b(this.z, 0);
        uv_2.e(this.z, false);
    }

    @Override
    protected void e(Entity entity) {
        Entity[] entityArray;
        super.e(entity);
        a8a_0.a(this.H, ayj_0.B(entity), entity);
        MapInvoker.c(this.Q, ayj_0.R(entity), entity);
        for (Entity entity2 : entityArray = ayj_0.E(entity)) {
            a8a_0.a(this.H, ayj_0.B(entity2), entity2);
        }
    }

    @Override
    protected void C() {
        super.C();
        if (uv_2.r(this.z) == WorldType.l) {
            Iterator iterator = aS0.f(this.b);
            while (dz_0.c(iterator)) {
                ChunkCoordIntPair chunkCoordIntPair = (ChunkCoordIntPair)dz_0.b(iterator);
                aqp_2.c(this.c(chunkCoordIntPair.b, chunkCoordIntPair.a), false);
            }
        } else {
            int n = 0;
            int n2 = 0;
            Iterator iterator = aS0.f(this.b);
            while (dz_0.c(iterator)) {
                int n3;
                ChunkCoordIntPair chunkCoordIntPair = (ChunkCoordIntPair)dz_0.b(iterator);
                int n4 = chunkCoordIntPair.b * 16;
                int n5 = chunkCoordIntPair.a * 16;
                ProfilerInvoker.startSection(this.A, et_0.u);
                Chunk chunk = this.c(chunkCoordIntPair.b, chunkCoordIntPair.a);
                this.a(n4, n5, chunk);
                ProfilerInvoker.a(this.A, et_0.k);
                aqp_2.c(chunk, false);
                ProfilerInvoker.a(this.A, et_0.t);
                if (a5_0.a(this.o, 100000) == 0 && this.h() && this.D()) {
                    this.C = this.C * 3 + 1013904223;
                    n3 = this.C >> 2;
                    BlockPos blockPos = this.a(new BlockPos(n4 + (n3 & 0xF), 0, n5 + (n3 >> 8 & 0xF)));
                    if (this.w(blockPos)) {
                        this.g(new ou_2(this, amv_2.j(blockPos), amv_2.h(blockPos), amv_2.i(blockPos)));
                    }
                }
                ProfilerInvoker.a(this.A, et_0.j);
                if (a5_0.a(this.o, 16) == 0) {
                    this.C = this.C * 3 + 1013904223;
                    n3 = this.C >> 2;
                    BlockPos blockPos = this.t(new BlockPos(n4 + (n3 & 0xF), 0, n5 + (n3 >> 8 & 0xF)));
                    BlockPos blockPos2 = amv_2.g(blockPos);
                    if (this.m(blockPos2)) {
                        this.a(blockPos2, BlocksInvoker.t(Blocks.I));
                    }
                    if (this.h() && this.b(blockPos, true)) {
                        this.a(blockPos, BlocksInvoker.t(Blocks.cm));
                    }
                    if (this.h() && hw_0.c(this.d(blockPos2))) {
                        BlocksInvoker.a(BlockStateInvoker.getBlock(this.b(blockPos2)), (World)this, blockPos2);
                    }
                }
                ProfilerInvoker.a(this.A, et_0.a);
                n3 = J9.d(this.K(), et_0.A);
                for (ano_2 ano_22 : aqp_2.m(chunk)) {
                    if (!a4f_0.a(ano_22)) continue;
                    for (int i = 0; i < n3; ++i) {
                        this.C = this.C * 3 + 1013904223;
                        int n6 = this.C >> 2;
                        int n7 = n6 & 0xF;
                        int n8 = n6 >> 8 & 0xF;
                        int n9 = n6 >> 16 & 0xF;
                        ++n2;
                        IBlockState iBlockState = a4f_0.a(ano_22, n7, n9, n8);
                        Block block = BlockStateInvoker.getBlock(iBlockState);
                        if (!BlocksInvoker.J(block)) continue;
                        ++n;
                        BlocksInvoker.a(block, (World)this, new BlockPos(n7 + n4, n9 + a4f_0.e(ano_22), n8 + n5), iBlockState, this.o);
                    }
                }
                ProfilerInvoker.endSection(this.A);
            }
        }
    }

    @Override
    protected void h(Entity entity) {
        Entity[] entityArray;
        super.h(entity);
        a8a_0.b(this.H, ayj_0.B(entity));
        MapInvoker.a(this.Q, ayj_0.R(entity));
        for (Entity entity2 : entityArray = ayj_0.E(entity)) {
            a8a_0.b(this.H, ayj_0.B(entity2));
        }
    }

    protected BlockPos a(BlockPos blockPos) {
        BlockPos blockPos2 = this.t(blockPos);
        rm_2 rm_22 = h__0.d(new rm_2(blockPos2, new BlockPos(amv_2.j(blockPos2), this.b(), amv_2.i(blockPos2))), 3.0, 3.0, 3.0);
        vd_1 vd_12 = this.a(EntityLivingBase.class, rm_22, new vd_1(this));
        return !ListInvoker.isEmpty((List)((Object)vd_12)) ? atn_0.K((EntityLivingBase)ListInvoker.get((List)((Object)vd_12), a5_0.a(this.o, ListInvoker.size((List)((Object)vd_12))))) : blockPos2;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    @Override
    public void i() {
        super.i();
        if (uv_2.t(this.w()) && this.H() != EnumDifficulty.HARD) {
            uv_2.a(this.w(), EnumDifficulty.HARD);
        }
        aqo_0.b(this.d.q());
        if (this.g()) {
            if (J9.c(this.K(), et_0.B)) {
                long l4 = this.z.e() + 24000L;
                this.z.c(l4 - l4 % 24000L);
            }
            this.f();
        }
        ProfilerInvoker.startSection(this.A, et_0.i);
        if (J9.c(this.K(), et_0.q) && uv_2.r(this.z) != WorldType.l) {
            yj_1.a(this.ab, this, this.g, this.y, uv_2.f(this.z) % 400L == 0L);
        }
        ProfilerInvoker.a(this.A, et_0.f);
        sf_0.c(this.a);
        int n = this.c(1.0f);
        if (n != this.l()) {
            this.c(n);
        }
        uv_2.b(this.z, uv_2.f(this.z) + 1L);
        if (J9.c(this.K(), et_0.m)) {
            this.z.c(this.z.e() + 1L);
        }
        ProfilerInvoker.a(this.A, et_0.e);
        this.a(false);
        ProfilerInvoker.a(this.A, et_0.v);
        this.C();
        ProfilerInvoker.a(this.A, et_0.o);
        aoc_0.b(this.O);
        ProfilerInvoker.a(this.A, et_0.w);
        this.n.b();
        this.V.b();
        ProfilerInvoker.a(this.A, et_0.y);
        uy_1.a(this.ae, this.B());
        ProfilerInvoker.endSection(this.A);
        this.o();
    }

    protected void f() {
        this.W = false;
        Iterator iterator = ListInvoker.iterator(this.e());
        while (dz_0.c(iterator)) {
            EntityPlayer entityPlayer = (EntityPlayer)dz_0.b(iterator);
            if (!a6w_0.v(entityPlayer)) continue;
            a6w_0.a(entityPlayer, false, false, true);
        }
        this.b();
    }

    @Override
    public void s() {
        this.W = false;
        if (!ListInvoker.isEmpty(this.e())) {
            int n = 0;
            int n2 = 0;
            Iterator iterator = ListInvoker.iterator(this.e());
            while (dz_0.c(iterator)) {
                EntityPlayer entityPlayer = (EntityPlayer)dz_0.b(iterator);
                if (a6w_0.l(entityPlayer)) {
                    ++n;
                    continue;
                }
                if (!a6w_0.v(entityPlayer)) continue;
                ++n2;
            }
            this.W = n2 >= ListInvoker.size(this.e()) - n;
        }
    }

    public void q() {
        this.w.d();
    }

    public void p() {
        this.T = 0;
    }

    @Override
    public void a(Entity entity, boolean bl) {
        if (!this.k() && (entity instanceof n5_0 || entity instanceof nt_1)) {
            ayj_0.D(entity);
        }
        if (!this.r() && entity instanceof aHI) {
            ayj_0.D(entity);
        }
        super.a(entity, bl);
    }

    private void o() {
        while (!this.X[this.S].isEmpty()) {
            int n = this.S;
            this.S ^= 1;
            Iterator iterator = this.X[n].iterator();
            while (dz_0.c(iterator)) {
                adc_0 adc_02 = (adc_0)dz_0.b(iterator);
                if (!this.a(adc_02)) continue;
                aek_1.a(ServerInvoker.R(this.af), amv_2.j(yo_1.b(adc_02)), amv_2.h(yo_1.b(adc_02)), amv_2.i(yo_1.b(adc_02)), 64.0, qq_2.j(this.d), new S24PacketBlockAction(yo_1.b(adc_02), yo_1.c(adc_02), yo_1.a(adc_02), yo_1.d(adc_02)));
            }
            this.X[n].clear();
        }
    }

    public aQT h() {
        return this.Y;
    }

    @Override
    public void c(BlockPos blockPos, Block block, int n, int n2) {
        a5D a5D2 = new a5D(blockPos, block);
        int n3 = 0;
        if (this.J && BlocksInvoker.getBlockState(block) != Material.air) {
            if (BlocksInvoker.z(block)) {
                IBlockState iBlockState;
                n3 = 8;
                if (this.b(amv_2.a(a5D2.b, -n3, -n3, -n3), amv_2.a(a5D2.b, n3, n3, n3)) && BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(iBlockState = this.b(a5D2.b))) != Material.air && BlockStateInvoker.getBlock(iBlockState) == aqj_1.a(a5D2)) {
                    BlocksInvoker.c(BlockStateInvoker.getBlock(iBlockState), this, a5D2.b, iBlockState, this.o);
                }
                return;
            }
            n = 1;
        }
        if (this.b(amv_2.a(blockPos, -n3, -n3, -n3), amv_2.a(blockPos, n3, n3, n3))) {
            if (BlocksInvoker.getBlockState(block) != Material.air) {
                aqj_1.a(a5D2, (long)n + uv_2.f(this.z));
                aqj_1.a(a5D2, n2);
            }
            if (!aS0.c(this.ac, a5D2)) {
                aS0.b(this.ac, a5D2);
                asw_2.a(this.aa, a5D2);
            }
        }
    }

    @Override
    public void b(BlockPos blockPos, Block block, int n, int n2) {
        a5D a5D2 = new a5D(blockPos, block);
        aqj_1.a(a5D2, n2);
        if (BlocksInvoker.getBlockState(block) != Material.air) {
            aqj_1.a(a5D2, (long)n + uv_2.f(this.z));
        }
        if (!aS0.c(this.ac, a5D2)) {
            aS0.b(this.ac, a5D2);
            asw_2.a(this.aa, a5D2);
        }
    }

    private void d() {
        uv_2.c(this.z, false);
        uv_2.b(this.z, true);
        uv_2.d(this.z, false);
        uv_2.e(this.z, false);
        uv_2.i(this.z, 1000000000);
        this.z.c(6000L);
        uv_2.a(this.z, GameType.SPECTATOR);
        uv_2.f(this.z, false);
        uv_2.a(this.z, EnumDifficulty.PEACEFUL);
        uv_2.g(this.z, true);
        J9.a(this.K(), et_0.n, et_0.h);
    }

    @Override
    public List<a5D> a(HF hF, boolean bl) {
        ArrayList arrayList = null;
        int n = 0;
        while (true) {
            Iterator iterator = asw_2.c(this.aa);
            while (dz_0.c(iterator)) {
                a5D a5D2 = (a5D)dz_0.b(iterator);
                BlockPos blockPos = a5D2.b;
                if (amv_2.j(blockPos) < hF.f || amv_2.j(blockPos) >= hF.d || amv_2.i(blockPos) < hF.b || amv_2.i(blockPos) >= hF.e) continue;
                aS0.a(this.ac, a5D2);
                dz_0.a(iterator);
                arrayList = my_0.c();
                ListInvoker.add(arrayList, a5D2);
            }
            ++n;
        }
    }

    private boolean a(adc_0 adc_02) {
        IBlockState iBlockState = this.b(yo_1.b(adc_02));
        return BlockStateInvoker.getBlock(iBlockState) == yo_1.c(adc_02) && BlocksInvoker.a(BlockStateInvoker.getBlock(iBlockState), (World)this, yo_1.b(adc_02), iBlockState, yo_1.a(adc_02), yo_1.d(adc_02));
    }

    @Override
    protected em_1 n() {
        ku_1 ku_12 = SaveHandlerInvoker.a(this.w, this.d);
        this.Z = new aet_2(this, ku_12, qq_2.h(this.d));
        return this.Z;
    }

    public avV c() {
        return this.ae;
    }

    @Override
    public boolean a(EntityPlayer entityPlayer, BlockPos blockPos) {
        return !ServerInvoker.a(this.af, this, blockPos, entityPlayer) && ak9_0.a(this.R(), blockPos);
    }

    public boolean a(a40 a402, cp_0 cp_02, BlockPos blockPos) {
        List list = sf_0.a(this.o(), a402, blockPos);
        return !ListInvoker.isEmpty(list) && ListInvoker.contains(list, cp_02);
    }

    @Override
    public void G() {
        if (uv_2.d(this.z) <= 0) {
            uv_2.g(this.z, this.v() + 1);
        }
        int n = uv_2.v(this.z);
        int n2 = uv_2.q(this.z);
        int n3 = 0;
        while (BlocksInvoker.getBlockState(this.r(new BlockPos(n, 0, n2))) == Material.air) {
            n += a5_0.a(this.o, 8) - a5_0.a(this.o, 8);
            n2 += a5_0.a(this.o, 8) - a5_0.a(this.o, 8);
            if (++n3 != 10000) continue;
        }
        uv_2.a(this.z, n);
        uv_2.d(this.z, n2);
    }

    @Override
    public void a(BlockPos blockPos, Block block, int n, int n2) {
        adc_0 adc_02 = new adc_0(blockPos, block, n, n2);
        Iterator iterator = this.X[this.S].iterator();
        while (dz_0.c(iterator)) {
            adc_0 adc_03 = (adc_0)dz_0.b(iterator);
            if (!adc_03.equals(adc_02)) continue;
            return;
        }
        this.X[this.S].add(adc_02);
    }

    public void a(boolean bl, IProgressUpdate iProgressUpdate) throws cd_1 {
        if (sf_0.a(this.a)) {
            aip_2.c(iProgressUpdate, et_0.z);
            this.n();
            aip_2.b(iProgressUpdate, et_0.p);
            sf_0.a(this.a, bl, iProgressUpdate);
            Iterator iterator = akr_1.a(my_0.a((Iterable)rh_0.a(this.Z)));
            while (dz_0.c(iterator)) {
                Chunk chunk = (Chunk)dz_0.b(iterator);
                if (aoc_0.a(this.O, chunk.f, chunk.v)) continue;
                rh_0.b(this.Z, chunk.f, chunk.v);
            }
        }
    }

    @Override
    protected int L() {
        return aek_1.e(ServerInvoker.R(this.af));
    }

    @Override
    protected void y() {
        boolean bl = this.h();
        super.y();
        if (this.p != this.s) {
            aek_1.a(ServerInvoker.R(this.af), new S2BPacketChangeGameState(7, this.s), qq_2.j(this.d));
        }
        if (this.h != this.f) {
            aek_1.a(ServerInvoker.R(this.af), new S2BPacketChangeGameState(8, this.f), qq_2.j(this.d));
        }
        if (bl != this.h()) {
            aek_1.a(ServerInvoker.R(this.af), new S2BPacketChangeGameState(2, 0.0f));
            aek_1.a(ServerInvoker.R(this.af), new S2BPacketChangeGameState(7, this.s));
            aek_1.a(ServerInvoker.R(this.af), new S2BPacketChangeGameState(8, this.f));
        }
    }

    public BlockPos i() {
        return this.d.b();
    }

    public avp_1 l() {
        return this.O;
    }

    @Override
    public void a(Entity entity, double d, double d2, double d3, float f, boolean bl, boolean bl2) {
        aw0_0 aw0_02 = new aw0_0(this, entity, d, d2, d3, f, bl, bl2);
        aI9.e(aw0_02);
        aI9.a(aw0_02, false);
        aI9.d(aw0_02);
        Iterator iterator = ListInvoker.iterator(this.e());
        while (dz_0.c(iterator)) {
            EntityPlayer entityPlayer = (EntityPlayer)dz_0.b(iterator);
            if (!(a6w_0.b(entityPlayer, d, d2, d3) < 4096.0)) continue;
            qv_0.a(((EntityPlayerMP)entityPlayer).playerNetServerHandler, new S27PacketExplosion(d, d2, d3, f, aI9.c(aw0_02), (Vec3)MapInvoker.c(aI9.b(aw0_02), entityPlayer)));
        }
    }

    @Override
    public void a(BlockPos blockPos, Block block, int n) {
        this.c(blockPos, block, n, 0);
    }

    @Override
    public void a(WorldSettings worldSettings) {
        if (!uv_2.i(this.z)) {
            block6: {
                try {
                    this.b(worldSettings);
                    if (uv_2.r(this.z) != WorldType.l) break block6;
                    this.d();
                }
                catch (Throwable throwable) {
                    CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, et_0.b);
                    try {
                        this.a(crashReport);
                    }
                    catch (Throwable throwable2) {}
                    throw new ReportedException(crashReport);
                }
            }
            super.a(worldSettings);
            uv_2.a(this.z, true);
        }
    }
}


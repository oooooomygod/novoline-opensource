/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.multiplayer;

import cc.novoline.events.events.IRCMessageEvent;
import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.EventManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.NetworkManagerInvoker;
import cc.novoline.invoke.PlayerControllerInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.ProfilerInvoker;
import cc.novoline.invoke.SoundHandlerInvoker;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import deobf.*;
import net.minecraft.client.Minecraft;
import net.B7;
import net.minecraft.block.BlockPos;
import net.ChatComponentText;
import net.ChunkCoordIntPair;
import net.CrashReport;
import net.H3;
import net.IBlockState;
import net.J9;
import net.NBTTagCompound;
import net.PV;
import net.ResourceLocation;
import net.TW;
import net.World;
import net.WorldInfo;
import net.a3o_0;
import net.a5_0;
import net.a8a_0;
import net.aDM;
import net.aDP;
import net.aDb;
import net.aS0;
import net.act_2;
import net.adh_1;
import net.adm_1;
import net.ail_0;
import net.akm_0;
import net.amj_1;
import net.amv_2;
import net.anh_1;
import net.anm_2;
import net.apz_2;
import net.aut_1;
import net.av__0;
import net.axe_2;
import net.ayj_0;
import net.ayx_2;
import net.dz_0;
import net.em_1;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.profiler.Profiler;
import net.minecraft.world.GameType;
import net.minecraft.world.WorldSettings;
import net.mk_1;
import net.qq_2;
import net.uv_2;
import net.xk_1;
import net.ys_2;
import net.za_2;
import net.zw_1;


public class WorldClient
extends World {
    private boolean Q = false;
    private TW T;
    private Minecraft P;
    private static String O = "CL_00000882";
    private NetHandlerPlayClient V;
    private Set S;
    public static boolean U;
    private zw_1 W;
    private Set R;
    private Set X = axe_2.a();

    @Override
    public CrashReportCategory a(CrashReport crashReport) {
        CrashReportCategory crashReportCategory = super.a(crashReport);
        CrashReportCategoryInvoker.a(crashReportCategory, a3o_0.i, new amj_1(this));
        CrashReportCategoryInvoker.a(crashReportCategory, a3o_0.b, new PV(this));
        CrashReportCategoryInvoker.a(crashReportCategory, a3o_0.e, new av__0(this));
        CrashReportCategoryInvoker.a(crashReportCategory, a3o_0.c, new H3(this));
        return crashReportCategory;
    }

    public void a(BlockPos blockPos, String string, float f, float f2, boolean bl) {
        this.a((double)amv_2.j(blockPos) + 0.5, (double)amv_2.h(blockPos) + 0.5, (double)amv_2.i(blockPos) + 0.5, string, f, f2, bl);
    }

    public boolean b() {
        return this.Q;
    }

    @Override
    public void a(double d, double d2, double d3, String string, float f, float f2, boolean bl) {
        double d4 = ayj_0.a(MCInvoker.v(this.P), d, d2, d3);
        akm_0 akm_02 = new akm_0(new ResourceLocation(string), f, f2, (float)d, (float)d2, (float)d3);
        if (d4 > 100.0) {
            double d5 = MathInvoker.d(d4) / 40.0;
            SoundHandlerInvoker.a(MCInvoker.l(this.P), akm_02, (int)(d5 * 20.0));
        } else {
            SoundHandlerInvoker.c(MCInvoker.l(this.P), akm_02);
        }
    }

    @Override
    protected int L() {
        return this.P.gameSettings.bp;
    }

    @Override
    public void O() {
        NetworkManagerInvoker.a(aDM.a(this.V), new ChatComponentText(a3o_0.n));
        EventManagerInvoker.call(new IRCMessageEvent());
    }

    @Override
    public void a(long l4) {
        if (l4 < 0L) {
            l4 = -l4;
            J9.a(this.K(), a3o_0.f, a3o_0.j);
        } else {
            J9.a(this.K(), a3o_0.m, a3o_0.g);
        }
        super.a(l4);
    }

    static Minecraft c(WorldClient worldClient) {
        return worldClient.P;
    }

    @Override
    protected void e(Entity entity) {
        super.e(entity);
        aS0.a(this.R, entity);
    }

    @Override
    public boolean a(Entity entity) {
        boolean bl = super.a(entity);
        aS0.b(this.X, entity);
        aS0.b(this.R, entity);
        return bl;
    }

    @Override
    public void a(double d, double d2, double d3, double d4, double d5, double d6, NBTTagCompound nBTTagCompound) {
        ayx_2.a(this.P.effectRenderer, new mk_1(this, d, d2, d3, d4, d5, d6, this.P.effectRenderer, nBTTagCompound));
    }

    @Override
    public boolean a(BlockPos blockPos, IBlockState iBlockState, int n) {
        this.Q = this.e();
        boolean bl = super.a(blockPos, iBlockState, n);
        this.Q = false;
        return bl;
    }

    private boolean e() {
        if (this.P.playerController instanceof anm_2) {
            anm_2 anm_22 = (anm_2)this.P.playerController;
            return xk_1.a(anm_22);
        }
        return false;
    }

    public void a(int n, Entity entity) {
        Entity entity2 = this.b(n);
        this.c(entity2);
        aS0.b(this.X, entity);
        ayj_0.c(entity, n);
        if (!this.a(entity)) {
            aS0.b(this.R, entity);
        }
        a8a_0.a(this.H, n, entity);
    }

    @Override
    protected void h(Entity entity) {
        super.h(entity);
        if (aS0.c(this.X, entity)) {
            if (ayj_0.a(entity)) {
                aS0.b(this.R, entity);
            } else {
                aS0.a(this.X, entity);
            }
        }
    }

    public void a(za_2 za_22) {
        this.v = za_22;
    }

    public void b(int n, int n2, int n3, int n4, int n5, int n6) {
    }

    @Override
    public Entity b(int n) {
        return n == PlayerInvoker.O(this.P.player) ? this.P.player : super.b(n);
    }

    public void f() {
        int n;
        int n2;
        Entity entity;
        ListInvoker.removeAll(this.V(), this.k);
        Iterator iterator = ListInvoker.iterator(this.k);
        while (dz_0.c(iterator)) {
            entity = (Entity)dz_0.b(iterator);
            n2 = entity.V;
            n = entity.s;
            if (!entity.a || !this.a(n2, n, true)) continue;
            this.c(n2, n).b(entity);
        }
        iterator = ListInvoker.iterator(this.k);
        while (dz_0.c(iterator)) {
            entity = (Entity)dz_0.b(iterator);
            this.h(entity);
        }
        ListInvoker.clear(this.k);
        for (int i = 0; i < ListInvoker.size(this.V()); ++i) {
            entity = (Entity)ListInvoker.get(this.V(), i);
            if (entity.r != null) {
                if (!entity.r.isDead && entity.r.h == entity) continue;
                entity.r.h = null;
                entity.r = null;
            }
            if (!entity.isDead) continue;
            n2 = entity.V;
            n = entity.s;
            if (entity.a && this.a(n2, n, true)) {
                this.c(n2, n).b(entity);
            }
            ListInvoker.remove(this.V(), i--);
            this.h(entity);
        }
    }

    @Override
    protected void y() {
    }

    static Set b(WorldClient worldClient) {
        return worldClient.X;
    }

    @Override
    protected em_1 n() {
        this.T = new TW(this);
        return this.T;
    }

    static Set a(WorldClient worldClient) {
        return worldClient.R;
    }

    @Override
    public int a(BlockPos blockPos, int n) {
        int n2 = super.a(blockPos, n);
        if (ys_2.I()) {
            n2 = aDP.a(blockPos, n2);
        }
        return n2;
    }

    public void a(int n, int n2, boolean bl) {
        apz_2.b(this.T, n, n2);
        this.a(n * 16, 0, n2 * 16, n * 16 + 15, 256, n2 * 16 + 15);
    }

    @Override
    public void i() {
        super.i();
        this.b(this.B() + 1L);
        if (J9.c(this.K(), a3o_0.k)) {
            this.a(this.E() + 1L);
        }
        ProfilerInvoker.startSection(this.A, a3o_0.a);
        int n = 0;
        while (!aS0.b(this.R)) {
            Entity entity = (Entity)dz_0.b(aS0.f(this.R));
            aS0.a(this.R, entity);
            if (!ListInvoker.contains(this.V(), entity)) {
                this.a(entity);
            }
            ++n;
        }
        ProfilerInvoker.a(this.A, a3o_0.l);
        apz_2.a(this.T);
        ProfilerInvoker.a(this.A, a3o_0.o);
        this.C();
        ProfilerInvoker.endSection(this.A);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "i*Q*\u001dlI\u001a^6(".toCharArray();
        int n2 = 0;
        int n3 = 91;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x71));
            n3 = n3;
        }
    }

    public void a(BlockPos blockPos, IBlockState iBlockState) {
        int n = amv_2.j(blockPos);
        int n2 = amv_2.h(blockPos);
        int n3 = amv_2.i(blockPos);
        this.b(n, n2, n3, n, n2, n3);
        super.a(blockPos, iBlockState, 3);
    }

    public WorldClient(NetHandlerPlayClient netHandlerPlayClient, WorldSettings worldSettings, int n, EnumDifficulty enumDifficulty, Profiler profiler) {
        super(new adh_1(), new WorldInfo(worldSettings, a3o_0.h), qq_2.a(n), profiler, true);
        this.R = axe_2.a();
        this.P = MCInvoker.f();
        this.S = axe_2.a();
        this.W = new zw_1(0, 0, 0, 3);
        this.V = netHandlerPlayClient;
        uv_2.a(this.w(), enumDifficulty);
        qq_2.a(this.d, this);
        this.c(new BlockPos(8, 64, 8));
        this.a = this.n();
        this.K = new adm_1();
        this.A();
        this.M();
        aDb.a(ail_0.bR, new Object[]{this});
        if (this.P.playerController != null && this.P.playerController.getClass() == anh_1.class) {
            this.P.playerController = new anm_2(this.P, netHandlerPlayClient);
        }
    }

    @Override
    public void c(Entity entity) {
        super.c(entity);
        aS0.a(this.X, entity);
    }

    @Override
    protected void C() {
        super.C();
        aS0.c(this.S, this.b);
        if (aS0.d(this.S) == aS0.d(this.b)) {
            aS0.e(this.S);
        }
        int n = 0;
        Iterator iterator = aS0.f(this.b);
        while (dz_0.c(iterator)) {
            ChunkCoordIntPair chunkCoordIntPair = (ChunkCoordIntPair)dz_0.b(iterator);
            if (aS0.c(this.S, chunkCoordIntPair)) continue;
            int n2 = chunkCoordIntPair.b * 16;
            int n3 = chunkCoordIntPair.a * 16;
            ProfilerInvoker.startSection(this.A, a3o_0.d);
            Chunk chunk = this.c(chunkCoordIntPair.b, chunkCoordIntPair.a);
            this.a(n2, n3, chunk);
            ProfilerInvoker.endSection(this.A);
            aS0.b(this.S, chunkCoordIntPair);
            if (++n < 10) continue;
            return;
        }
    }

    public void b(int n) {
        Entity entity = (Entity)a8a_0.b(this.H, n);
        aS0.a(this.X, entity);
        this.c(entity);
    }

    public void a(int n, int n2, int n3) {
        int n4 = 16;
        Random random = new Random();
        ItemStack itemStack = PlayerInvoker.h(this.P.player);
        boolean bl = PlayerControllerInvoker.k(this.P.playerController) == GameType.CREATIVE && BlocksInvoker.a(act_2.k(itemStack)) == Blocks.ao;
        zw_1 zw_12 = this.W;
        int n5 = 0;
        while (true) {
            int n6 = n + a5_0.a(this.o, n4) - a5_0.a(this.o, n4);
            int n7 = n2 + a5_0.a(this.o, n4) - a5_0.a(this.o, n4);
            int n8 = n3 + a5_0.a(this.o, n4) - a5_0.a(this.o, n4);
            aut_1.a(zw_12, n6, n7, n8);
            IBlockState iBlockState = this.b(zw_12);
            BlocksInvoker.b(BlockStateInvoker.getBlock(iBlockState), this, (BlockPos)zw_12, iBlockState, random);
            if (BlockStateInvoker.getBlock(iBlockState) == Blocks.ao) {
                this.a(B7.BARRIER, (float)n6 + 0.5f, (double)((float)n7 + 0.5f), (double)((float)n8 + 0.5f), 0.0, 0.0, 0.0, new int[0]);
            }
            ++n5;
        }
    }
}


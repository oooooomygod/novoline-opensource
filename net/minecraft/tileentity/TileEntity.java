/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.tileentity;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.StringInvoker;
import net.minecraft.init.Blocks;

import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.IBlockState;
import net.NBTTagCompound;
import net.P8;
import net.World;
import net.a62;
import net.a64;
import net.a65;
import net.a6A;
import net.a6B;
import net.a6D;
import net.a6E;
import net.a6F;
import net.a6G;
import net.a6L;
import net.a6O;
import net.a6P;
import net.a6R;
import net.a6U;
import net.a6Z;
import net.a6a_0;
import net.a6e_0;
import net.a6f_0;
import net.a6q_0;
import net.a6t_0;
import net.a6z_0;
import net.aEc;
import net.aL0;
import net.aV8;
import net.amv_2;
import net.ara_2;
import net.ch_2;
import net.tn_0;
import org.apache.logging.log4j.Logger;

public abstract class TileEntity {
    protected boolean f;
    protected BlockPos g = BlockPos.m;
    protected World e;
    protected Block a;
    private int c = -1;
    private static Map<String, Class<? extends TileEntity>> b;
    private static Map<Class<? extends TileEntity>, String> d;
    private static Logger h;

    private String lambda$addInfoToCrashReport$2() throws Exception {
        IBlockState iBlockState = aV8.q(this.e, this.g);
        int n = BlocksInvoker.c(BlockStateInvoker.getBlock(iBlockState), iBlockState);
        return aL0.a(aL0.c(aL0.a(new StringBuilder(), aEc.E), n), aEc.F).toString();
    }

    public boolean n() {
        return this.e != null;
    }

    public double a(double d, double d2, double d3) {
        double d4 = (double)amv_2.j(this.g) + 0.5 - d;
        double d5 = (double)amv_2.h(this.g) + 0.5 - d2;
        double d6 = (double)amv_2.i(this.g) + 0.5 - d3;
        return d4 * d4 + d5 * d5 + d6 * d6;
    }

    public double f() {
        return 4096.0;
    }

    public void d() {
        if (this.e != null) {
            IBlockState iBlockState = aV8.q(this.e, this.g);
            this.c = BlocksInvoker.c(BlockStateInvoker.getBlock(iBlockState), iBlockState);
            aV8.a(this.e, this.g, this);
            if (this.k() != Blocks.air) {
                aV8.d(this.e, this.g, this.k());
            }
        }
    }

    static {
        h = LogManagerInvoker.c();
        b = MapsInvoker.a();
        d = MapsInvoker.a();
        TileEntity.a(a6Z.class, aEc.K);
        TileEntity.a(a6O.class, aEc.f);
        TileEntity.a(a6R.class, aEc.N);
        TileEntity.a(a62.class, aEc.y);
        TileEntity.a(a6B.class, aEc.w);
        TileEntity.a(a6F.class, aEc.L);
        TileEntity.a(a6z_0.class, aEc.r);
        TileEntity.a(a6f_0.class, aEc.C);
        TileEntity.a(a6q_0.class, aEc.m);
        TileEntity.a(a6e_0.class, aEc.u);
        TileEntity.a(a6E.class, aEc.R);
        TileEntity.a(a6D.class, aEc.n);
        TileEntity.a(a6a_0.class, aEc.I);
        TileEntity.a(a6U.class, aEc.z);
        TileEntity.a(a6G.class, aEc.J);
        TileEntity.a(a6t_0.class, aEc.M);
        TileEntity.a(a65.class, aEc.o);
        TileEntity.a(a6P.class, aEc.l);
        TileEntity.a(a64.class, aEc.q);
        TileEntity.a(a6A.class, aEc.j);
        TileEntity.a(a6L.class, aEc.O);
    }

    public Packet g() {
        return null;
    }

    public void c(NBTTagCompound nBTTagCompound) {
        String cfr_ignored_0 = (String)MapInvoker.c(d, this.getClass());
        throw new RuntimeException(aL0.a(aL0.a(new StringBuilder(), this.getClass()), aEc.x).toString());
    }

    public static TileEntity b(NBTTagCompound nBTTagCompound) {
        TileEntity tileEntity = null;
        try {
            Class clazz = (Class)MapInvoker.c(b, tn_0.m(nBTTagCompound, aEc.Q));
            tileEntity = (TileEntity)ara_2.q(clazz);
        }
        catch (Exception exception) {
            ch_2.a(exception);
        }
        tileEntity.a(nBTTagCompound);
        return tileEntity;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public boolean a(int n, int n2) {
        return false;
    }

    private String lambda$addInfoToCrashReport$1() throws Exception {
        int n = BlocksInvoker.v(BlockStateInvoker.getBlock(aV8.q(this.e, this.g)));
        try {
            return StringInvoker.a(aEc.g, new Object[]{P8.d(n), BlocksInvoker.o(BlocksInvoker.a(n)), ara_2.k(BlocksInvoker.a(n).getClass())});
        }
        catch (Throwable throwable) {
            return aL0.c(aL0.a(new StringBuilder(), aEc.B), n).toString();
        }
    }

    public void a(NBTTagCompound nBTTagCompound) {
        this.g = new BlockPos(tn_0.g(nBTTagCompound, aEc.a), tn_0.g(nBTTagCompound, aEc.D), tn_0.g(nBTTagCompound, aEc.t));
    }

    public void a(BlockPos blockPos) {
        this.g = blockPos;
    }

    public BlockPos i() {
        return this.g;
    }

    public void l() {
        this.f = false;
    }

    public void j() {
        this.a = null;
        this.c = -1;
    }

    public boolean c() {
        return this.f;
    }

    private String lambda$addInfoToCrashReport$0() throws Exception {
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), (String)MapInvoker.c(d, this.getClass())), aEc.i), ara_2.k(this.getClass())).toString();
    }

    public void a(CrashReportCategory crashReportCategory) {
        CrashReportCategoryInvoker.a(crashReportCategory, aEc.e, this::lambda$addInfoToCrashReport$0);
        if (this.e != null) {
            CrashReportCategoryInvoker.a(crashReportCategory, this.g, this.k(), this.m());
            CrashReportCategoryInvoker.a(crashReportCategory, aEc.p, this::lambda$addInfoToCrashReport$1);
            CrashReportCategoryInvoker.a(crashReportCategory, aEc.A, this::lambda$addInfoToCrashReport$2);
        }
    }

    public World b() {
        return this.e;
    }

    public void a(World world) {
        this.e = world;
    }

    public Block k() {
        if (this.a == null) {
            this.a = BlockStateInvoker.getBlock(aV8.q(this.e, this.g));
        }
        return this.a;
    }

    public int m() {
        if (this.c == -1) {
            IBlockState iBlockState = aV8.q(this.e, this.g);
            this.c = BlocksInvoker.c(BlockStateInvoker.getBlock(iBlockState), iBlockState);
        }
        return this.c;
    }

    public void e() {
        this.f = true;
    }

    private static void a(Class<? extends TileEntity> clazz, String string) {
        if (MapInvoker.b(b, string)) {
            throw new IllegalArgumentException(aL0.a(aL0.a(new StringBuilder(), aEc.S), string).toString());
        }
        MapInvoker.c(b, string, clazz);
        MapInvoker.c(d, clazz, string);
    }

    public boolean h() {
        return false;
    }
}


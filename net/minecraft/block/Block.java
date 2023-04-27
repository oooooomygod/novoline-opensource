/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.UnmodifiableIterator
 */
package net.minecraft.block;

import cc.novoline.events.events.CollideWithBlockEvent;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.EventManagerInvoker;
import cc.novoline.invoke.ItemBlockInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.PlayerInvoker;
import com.google.common.collect.UnmodifiableIterator;
import deobf.EnumFacing;
import net.*;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.IBlockAccess;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import deobf.ModuleRegistry;
import net.minecraft.util.MovingObjectPosition;
import deobf.TileEntity;
import deobf.Vec3;
import cc.novoline.modules.visual.XRay;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;

public class Block {
    protected float K;
    protected double w;
    protected boolean M;
    protected double b;
    protected boolean a;
    private static ResourceLocation v;
    protected int r;
    protected boolean F;
    public static aum_1 A;
    public aum_1 l = p;
    public static aum_1 h;
    protected Material o;
    private CreativeTabs C;
    private String e;
    private IBlockState f;
    protected double t;
    public static aum_1 i;
    protected a42 D;
    protected int J;
    protected double d;
    public static aum_1 x;
    protected boolean g = true;
    public static aum_1 E;
    protected double n;
    protected boolean I;
    public static aum_1 u;
    public static aum_1 p;
    protected MapColor c;
    protected float s;
    public static aum_1 y;
    public static zk_2<ResourceLocation, Block> m;
    public static aum_1 q;
    public static aum_1 L;
    public static aum_1 B;
    public float O = 1.0f;
    protected boolean j;
    protected double N;
    public static aum_1 k;
    public static q7_0 H;
    public float z = 0.6f;
    public static aum_1 G;

    public String toString() {
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), yt_2.fs), a82.b(m, this)), yt_2.bc).toString();
    }

    protected a42 s() {
        return new a42(this, new a4_0[0]);
    }

    public double k() {
        return this.n;
    }

    public double g() {
        return this.d;
    }

    public static EnumFacing a(BlockPos blockPos) {
        Minecraft minecraft = MCInvoker.f();
        if (!BlockStateInvoker.getBlock(BlockInvoker.getMaterial(minecraft.world, amv_2.a(blockPos, 0, 1, 0))).j()) {
        }
        MovingObjectPosition movingObjectPosition = BlockInvoker.a(minecraft.world, new Vec3(minecraft.player.posX, minecraft.player.posY + (double)PlayerInvoker.X(minecraft.player), minecraft.player.posZ), new Vec3((double)amv_2.j(blockPos) + 0.5, amv_2.h(blockPos), (double)amv_2.i(blockPos) + 0.5));
        return movingObjectPosition.facing;
    }

    public void a(World world, BlockPos blockPos, aw0_0 aw0_02) {
    }

    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Entity entity) {
    }

    public boolean e(World world, BlockPos blockPos) {
        return akm_1.e(BlockStateInvoker.getBlock((IBlockState)aV8.q((World)world, (BlockPos)blockPos)).o);
    }

    public void c(World world, BlockPos blockPos) {
    }

    public boolean Q() {
        return this.I;
    }

    public void a(World world, BlockPos blockPos, EntityPlayer entityPlayer) {
    }

    public int r() {
        return 0xFFFFFF;
    }

    public Item a(IBlockState iBlockState, Random random, int n) {
        return px_0.a(this);
    }

    public boolean A() {
        return true;
    }

    public boolean y() {
        return !akm_1.i(this.o) && !akm_1.f(this.o);
    }

    public IBlockState a(World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, int n, EntityLivingBase entityLivingBase) {
        return this.c(n);
    }

    public void a(World world, Entity entity) {
        entity.motionY = 0.0;
    }

    public int a(IBlockAccess iBlockAccess, BlockPos blockPos, IBlockState iBlockState, EnumFacing enumFacing) {
        return 0;
    }

    public rm_2 f(World world, BlockPos blockPos) {
        return new rm_2((double)amv_2.j(blockPos) + this.t, (double)amv_2.h(blockPos) + this.N, (double)amv_2.i(blockPos) + this.w, (double)amv_2.j(blockPos) + this.d, (double)amv_2.h(blockPos) + this.b, (double)amv_2.i(blockPos) + this.n);
    }

    public void a(World world, EntityPlayer entityPlayer, BlockPos blockPos, IBlockState iBlockState, TileEntity tileEntity) {
        a6w_0.a(entityPlayer, aop_1.v[Block.a(this)]);
        a6w_0.d(entityPlayer, 0.025f);
        if (this.c() && alf_0.d(entityPlayer)) {
            ItemStack itemStack = this.b(iBlockState);
            Block.a(world, blockPos, itemStack);
        } else {
            int n = alf_0.i(entityPlayer);
            this.a(world, blockPos, iBlockState, n);
        }
    }

    public qn_2 O() {
        return qn_2.NONE;
    }

    public boolean f() {
        return true;
    }

    public Vec3 a(World world, BlockPos blockPos, Entity entity, Vec3 vec3) {
        return vec3;
    }

    public a42 d() {
        return this.D;
    }

    public void a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer) {
    }

    protected void a(World world, BlockPos blockPos, int n) {
        if (!world.isRemote) {
            while (true) {
                int n2 = TC.a(n);
                n -= n2;
                aV8.b(world, new oa_2(world, (double)amv_2.j(blockPos) + 0.5, (double)amv_2.h(blockPos) + 0.5, (double)amv_2.i(blockPos) + 0.5, n2));
            }
        }
    }

    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
    }

    public float a(Entity entity) {
        return this.s / 5.0f;
    }

    private static void registerBlock(int n, String string, Block block) {
        Block.a(n, new ResourceLocation(string), block);
    }

    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
    }

    public boolean B() {
        return this.M;
    }

    private boolean a(Vec3 vec3) {
        return vec3.xCoord >= this.t && vec3.xCoord <= this.d && vec3.yCoord >= this.N && vec3.yCoord <= this.b;
    }

    public int d(IBlockState iBlockState) {
        if (!ms_0.c(BlockStateInvoker.a(iBlockState))) {
            throw new IllegalArgumentException(aL0.a(aL0.a(aL0.a(new StringBuilder(), yt_2.aR), iBlockState), yt_2.ap).toString());
        }
        return 0;
    }

    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        ListInvoker.add(list, new ItemStack(item, 1, 0));
    }

    public void a(World world, BlockPos blockPos, IBlockState iBlockState, rm_2 rm_22, List<rm_2> list, Entity entity) {
        rm_2 rm_23 = this.b(world, blockPos, iBlockState);
        if (entity == MCInvoker.f().player) {
            CollideWithBlockEvent collideWithBlockEvent = new CollideWithBlockEvent(this, blockPos, rm_23);
            EventManagerInvoker.call(collideWithBlockEvent);
            if (A_.b(collideWithBlockEvent)) {
                return;
            }
            rm_23 = A_.c(collideWithBlockEvent);
        }
        if (h__0.b(rm_22, rm_23)) {
            ListInvoker.add(list, rm_23);
        }
    }

    public boolean a(IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        return enumFacing == EnumFacing.DOWN && this.N > 0.0 || enumFacing == EnumFacing.UP && this.b < 1.0 || enumFacing == EnumFacing.NORTH && this.w > 0.0 || enumFacing == EnumFacing.SOUTH && this.n < 1.0 || enumFacing == EnumFacing.WEST && this.t > 0.0 || enumFacing == EnumFacing.EAST && this.d < 1.0 || !BlockStateInvoker.getBlock(aG3.c(iBlockAccess, blockPos)).f();
    }

    public void a(World world, BlockPos blockPos, Entity entity, float f) {
        ayj_0.a(entity, f, 1.0f);
    }

    public IBlockState c(int n) {
        return this.m();
    }

    public static int c(IBlockState iBlockState) {
        Block block = BlockStateInvoker.getBlock(iBlockState);
        return Block.a(block) + (block.d(iBlockState) << 12);
    }

    public int a(World world) {
        return 10;
    }

    public int b(IBlockAccess iBlockAccess, BlockPos blockPos) {
        Block block = BlockStateInvoker.getBlock(aG3.c(iBlockAccess, blockPos));
        int n = aG3.a(iBlockAccess, blockPos, block.N());
        if (block instanceof hj_2) {
            blockPos = amv_2.g(blockPos);
            block = BlockStateInvoker.getBlock(aG3.c(iBlockAccess, blockPos));
            return aG3.a(iBlockAccess, blockPos, block.N());
        }
        return n;
    }

    protected void f(IBlockState iBlockState) {
        this.f = iBlockState;
    }

    public void o() {
    }

    public int a(World world, BlockPos blockPos) {
        return 0;
    }

    public Block a(CreativeTabs creativeTabs) {
        this.C = creativeTabs;
        return this;
    }

    public float M() {
        return this.L() ? (wc_1.g(ModuleInvoker.isEnable(ModuleRegistry.XRAY)) ? 1.0f : 0.2f) : 1.0f;
    }

    public Block(Material material, MapColor mapColor) {
        this.o = material;
        this.c = mapColor;
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        this.F = this.f();
        this.J = this.f() ? 255 : 0;
        this.M = !akm_1.h(material);
        this.D = this.s();
        this.f(aXF.c(this.D));
    }

    public boolean D() {
        return akm_1.g(this.o) && this.v() && !this.b();
    }

    public IBlockState a(IBlockState iBlockState, IBlockAccess iBlockAccess, BlockPos blockPos) {
        return iBlockState;
    }

    public void a(World world, BlockPos blockPos, IBlockState iBlockState, float f, int n) {
        if (!world.isRemote) {
            int n2 = this.a(n, world.o);
            for (int i = 0; i < n2; ++i) {
                if (!(a5_0.e(world.o) <= f)) continue;
                Item item = this.a(iBlockState, world.o, n);
                Block.a(world, blockPos, new ItemStack(item, 1, this.h(iBlockState)));
            }
        }
    }

    protected Block setHardness(float f) {
        this.K = f;
        if (this.s < f * 5.0f) {
            this.s = f * 5.0f;
        }
        return this;
    }

    public int a(int n, Random random) {
        return this.a(random);
    }

    protected Block(Material material) {
        this(material, akm_1.j(material));
    }

    protected boolean c() {
        return this.v() && !this.a;
    }

    public static Block a(String string) {
        ResourceLocation resourceLocation = new ResourceLocation(string);
        if (a82.d(m, resourceLocation)) {
            return (Block)a82.a(m, resourceLocation);
        }
        try {
            return (Block)a82.a(m, P8.a(string));
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    public int g(World world, BlockPos blockPos) {
        return this.h(aV8.q(world, blockPos));
    }

    public boolean b(World world, BlockPos blockPos) {
        return false;
    }

    protected Block a(aum_1 aum_12) {
        this.l = aum_12;
        return this;
    }

    private boolean b(Vec3 vec3) {
        return vec3.yCoord >= this.N && vec3.yCoord <= this.b && vec3.zCoord >= this.w && vec3.zCoord <= this.n;
    }

    public void a(World world, BlockPos blockPos, Entity entity) {
    }

    static {
        H = new q7_0();
        p = new aum_1(yt_2.e1, 1.0f, 1.0f);
        u = new aum_1(yt_2.aD, 1.0f, 1.0f);
        L = new aum_1(yt_2.aY, 1.0f, 1.0f);
        x = new aum_1(yt_2.aj, 1.0f, 1.0f);
        h = new aum_1(yt_2.bF, 1.0f, 1.0f);
        G = new aum_1(yt_2.ah, 1.0f, 1.5f);
        q = new au9_0(yt_2.v, 1.0f, 1.0f);
        k = new aum_1(yt_2.fa, 1.0f, 1.0f);
        i = new aum_1(yt_2.a9, 1.0f, 1.0f);
        E = new aum_1(yt_2.cO, 1.0f, 1.0f);
        y = new auh_1(yt_2.bn, 1.0f, 1.0f);
        A = new aum_2(yt_2.eI, 0.3f, 1.0f);
        B = new au0_0(yt_2.J, 1.0f, 1.0f);
        v = new ResourceLocation(yt_2.eS);
        m = new zk_2(v);
    }

    public double n() {
        return this.b;
    }

    private boolean c(Vec3 vec3) {
        return vec3.xCoord >= this.t && vec3.xCoord <= this.d && vec3.zCoord >= this.w && vec3.zCoord <= this.n;
    }

    public int N() {
        return this.r;
    }

    public static int a(Block block) {
        return a82.c(m, block);
    }

    public boolean z() {
        return this.F;
    }

    public int e(IBlockState iBlockState) {
        return 0xFFFFFF;
    }

    public void d(World world, BlockPos blockPos, IBlockState iBlockState) {
    }

    public IBlockState a(IBlockState iBlockState) {
        return iBlockState;
    }

    public void a(World world, BlockPos blockPos, IBlockState iBlockState, EntityLivingBase entityLivingBase, ItemStack itemStack) {
    }

    public boolean i() {
        return false;
    }

    protected Block a(int n) {
        this.J = n;
        return this;
    }

    public void a(World world, BlockPos blockPos, IBlockState iBlockState, int n) {
        this.a(world, blockPos, iBlockState, 1.0f, n);
    }

    public boolean u() {
        return this.a;
    }

    public CreativeTabs t() {
        return this.C;
    }

    public float a(EntityPlayer entityPlayer, World world, BlockPos blockPos) {
        float f = this.h(world, blockPos);
        return f < 0.0f ? 0.0f : (a6w_0.a(entityPlayer, this) ? a6w_0.b(entityPlayer, this) / f / 30.0f : a6w_0.b(entityPlayer, this) / f / 100.0f);
    }

    public boolean b(Block block) {
        return this == block;
    }

    public IBlockState m() {
        return this.f;
    }

    public Block b(String string) {
        this.e = string;
        return this;
    }

    public boolean c(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return !akm_1.d(this.o);
    }

    public boolean e() {
        return false;
    }

    public int a(IBlockAccess iBlockAccess, BlockPos blockPos, int n) {
        return 0xFFFFFF;
    }

    protected Block R() {
        this.g = false;
        return this;
    }

    public boolean b(IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        XRay xRay;
        if (wc_1.g(ModuleInvoker.isEnable(ModuleRegistry.XRAY)) && ListInvoker.contains(pc_1.d(xRay = (XRay)ModuleInvoker.isEnable(ModuleRegistry.XRAY)), P8.d(Block.a(this)))) {
            EnumFacing[] enumFacingArray = EnumFacing.VALUES;
            int n = 0;
            do {
                EnumFacing enumFacing2;
                if (!this.a(iBlockAccess, amv_2.a(blockPos, enumFacing2 = enumFacingArray[n]), enumFacing2)) continue;
                return true;
            } while (++n < enumFacingArray.length);
        }
        return this.a(iBlockAccess, blockPos, enumFacing);
    }

    public static void registerBlocks() {
        int n;
        Block block;
        Block.a(0, v, new BlockAir().b(yt_2.aU));
        Block.registerBlock(1, yt_2.g, new BlockStone().setHardness(1.5f).a(10.0f).a(h).b(yt_2.bO));
        Block.registerBlock(2, yt_2.a4, new BlockGrass().setHardness(0.6f).a(x).b(yt_2.L));
        Block.registerBlock(3, yt_2.df, new BlockDirt().setHardness(0.5f).a(L).b(yt_2.aZ));
        Block block2 = new Block(Material.y).setHardness(2.0f).a(10.0f).a(h).b(yt_2.b4).a(CreativeTabs.m);
        Block.registerBlock(4, yt_2.ar, block2);
        Block block3 = new BlockPlanks().setHardness(2.0f).a(5.0f).a(u).b(yt_2.c);
        Block.registerBlock(5, yt_2.H, block3);
        Block.registerBlock(6, yt_2.be, new BlockSapling().setHardness(0.0f).a(x).b(yt_2.t));
        Block.registerBlock(7, yt_2.eO, new Block(Material.y).h().a(6000000.0f).a(h).b(yt_2.d_).R().a(CreativeTabs.m));
        Block.registerBlock(8, yt_2.ds, new BlockDynamicLiquid(Material.M).setHardness(100.0f).a(3).b(yt_2.fK).R());
        Block.registerBlock(9, yt_2.dN, new BlockStaticLiquid(Material.M).setHardness(100.0f).a(3).b(yt_2.dh).R());
        Block.registerBlock(10, yt_2.c7, new BlockDynamicLiquid(Material.e).setHardness(100.0f).c(1.0f).b(yt_2.bS).R());
        Block.registerBlock(11, yt_2.F, new BlockStaticLiquid(Material.e).setHardness(100.0f).c(1.0f).b(yt_2.fc).R());
        Block.registerBlock(12, yt_2.aX, new BlockSand().setHardness(0.5f).a(i).b(yt_2.fh));
        Block.registerBlock(13, yt_2.a0, new gn_2().setHardness(0.6f).a(L).b(yt_2.e8));
        Block.registerBlock(14, yt_2.c6, new gz_2().setHardness(3.0f).a(5.0f).a(h).b(yt_2.cL));
        Block.registerBlock(15, yt_2.bx, new gz_2().setHardness(3.0f).a(5.0f).a(h).b(yt_2.eP));
        Block.registerBlock(16, yt_2.eA, new gz_2().setHardness(3.0f).a(5.0f).a(h).b(yt_2.E));
        Block.registerBlock(17, yt_2.b2, new gj_0().b(yt_2.cj));
        Block.registerBlock(18, yt_2.B, new gg_1().b(yt_2.el));
        Block.registerBlock(19, yt_2.b_, new hc_2().setHardness(0.6f).a(x).b(yt_2.eX));
        Block.registerBlock(20, yt_2.dp, new fx_2(Material.w, false).setHardness(0.3f).a(q).b(yt_2.fi));
        Block.registerBlock(21, yt_2.aF, new gz_2().setHardness(3.0f).a(5.0f).a(h).b(yt_2.al));
        Block.registerBlock(22, yt_2.fr, new Block(Material.t, MapColor.D).setHardness(3.0f).a(5.0f).a(h).b(yt_2.eM).a(CreativeTabs.m));
        Block.registerBlock(23, yt_2.cW, new BlockDispenser().setHardness(3.5f).a(h).b(yt_2.bb));
        Block block4 = new hl_2().a(h).setHardness(0.8f).b(yt_2.dt);
        Block.registerBlock(24, yt_2.X, block4);
        Block.registerBlock(25, yt_2.bX, new f1().setHardness(0.8f).b(yt_2.eQ));
        Block.registerBlock(26, yt_2.eg, new gp_2().a(u).setHardness(0.2f).b(yt_2.cs).R());
        Block.registerBlock(27, yt_2.as, new g0_0().setHardness(0.7f).a(G).b(yt_2.aE));
        Block.registerBlock(28, yt_2.ex, new gm_2().setHardness(0.7f).a(G).b(yt_2.dl));
        Block.registerBlock(29, yt_2.fw, new gi_2(true).b(yt_2.da));
        Block.registerBlock(30, yt_2.ev, new ha_1().a(1).setHardness(4.0f).b(yt_2.ci));
        Block.registerBlock(31, yt_2.dc, new fg_1().setHardness(0.0f).a(x).b(yt_2.bz));
        Block.registerBlock(32, yt_2.bU, new f2_0().setHardness(0.0f).a(x).b(yt_2.dL));
        Block.registerBlock(33, yt_2.b3, new gi_2(false).b(yt_2.e));
        Block.registerBlock(34, yt_2.a, new g8_0().b(yt_2.eo));
        Block.registerBlock(35, yt_2.an, new fe_1(Material.q).setHardness(0.8f).a(k).b(yt_2.eU));
        Block.registerBlock(36, yt_2.en, new ft_1());
        Block.registerBlock(37, yt_2.fx, new f5_0().setHardness(0.0f).a(x).b(yt_2.ca));
        Block.registerBlock(38, yt_2.eK, new f4_0().setHardness(0.0f).a(x).b(yt_2.dx));
        Block block5 = new fa_1().setHardness(0.0f).a(x).c(0.125f).b(yt_2.fy);
        Block.registerBlock(39, yt_2.fe, block5);
        Block block6 = new fa_1().setHardness(0.0f).a(x).b(yt_2.ad);
        Block.registerBlock(40, yt_2.af, block6);
        Block.registerBlock(41, yt_2.V, new Block(Material.t, MapColor.n).setHardness(3.0f).a(10.0f).a(G).b(yt_2.cz).a(CreativeTabs.m));
        Block.registerBlock(42, yt_2.cX, new Block(Material.t, MapColor.m).setHardness(5.0f).a(10.0f).a(G).b(yt_2.cw).a(CreativeTabs.m));
        Block.registerBlock(43, yt_2.k, new hw_1().setHardness(2.0f).a(10.0f).a(h).b(yt_2.d4));
        Block.registerBlock(44, yt_2.e9, new hv_1().setHardness(2.0f).a(10.0f).a(h).b(yt_2.aN));
        Block block7 = new Block(Material.y, MapColor.h).setHardness(2.0f).a(10.0f).a(h).b(yt_2.ej).a(CreativeTabs.m);
        Block.registerBlock(45, yt_2.cP, block7);
        Block.registerBlock(46, yt_2.fD, new h2_0().setHardness(0.0f).a(x).b(yt_2.am));
        Block.registerBlock(47, yt_2.aa, new fu_1().setHardness(1.5f).a(u).b(yt_2.ae));
        Block.registerBlock(48, yt_2.aP, new Block(Material.y).setHardness(2.0f).a(10.0f).a(h).b(yt_2.bQ).a(CreativeTabs.m));
        Block.registerBlock(49, yt_2.p, new ge_2().setHardness(50.0f).a(2000.0f).a(h).b(yt_2.eH));
        Block.registerBlock(50, yt_2.cn, new hl_1().setHardness(0.0f).c(0.9375f).a(u).b(yt_2.a7));
        Block.registerBlock(51, yt_2.d6, new gl_1().setHardness(0.0f).c(1.0f).a(k).b(yt_2.aT).R());
        Block.registerBlock(52, yt_2.bs, new fb_2().setHardness(5.0f).a(G).b(yt_2.bP).R());
        Block.registerBlock(53, yt_2.cD, new hn_2(BlockStateInvoker.a(block3.m(), BlockPlanks.P, (Comparable)((Object)F3.OAK))).b(yt_2.cG));
        Block.registerBlock(54, yt_2.d1, new fs_1(0).setHardness(2.5f).a(u).b(yt_2.ba));
        Block.registerBlock(55, yt_2.eE, new gs_1().setHardness(0.0f).a(p).b(yt_2.fn).R());
        Block.registerBlock(56, yt_2.di, new gz_2().setHardness(3.0f).a(5.0f).a(h).b(yt_2.dq));
        Block.registerBlock(57, yt_2.a3, new Block(Material.t, MapColor.v).setHardness(5.0f).a(10.0f).a(G).b(yt_2.x).a(CreativeTabs.m));
        Block.registerBlock(58, yt_2.W, new hh_0().setHardness(2.5f).a(u).b(yt_2.dg));
        Block.registerBlock(59, yt_2.fA, new fn_1().b(yt_2.cp));
        Block block8 = new gk_2().setHardness(0.6f).a(L).b(yt_2.i);
        Block.registerBlock(60, yt_2.d, block8);
        Block.registerBlock(61, yt_2.c9, new fs_2(false).setHardness(3.5f).a(h).b(yt_2.ch).a(CreativeTabs.l));
        Block.registerBlock(62, yt_2.fo, new fs_2(true).setHardness(3.5f).a(h).c(0.875f).b(yt_2.bW));
        Block.registerBlock(63, yt_2.b0, new gl_2().setHardness(1.0f).a(u).b(yt_2.bo).R());
        Block.registerBlock(64, yt_2.bB, new g7_0(Material.wood).setHardness(3.0f).a(u).b(yt_2.b8).R());
        Block.registerBlock(65, yt_2.m, new ga_0().setHardness(0.4f).a(y).b(yt_2.aQ));
        Block.registerBlock(66, yt_2.bl, new gh_1().setHardness(0.7f).a(G).b(yt_2.dB));
        Block.registerBlock(67, yt_2.eT, new hn_2(block2.m()).b(yt_2.bu));
        Block.registerBlock(68, yt_2.fO, new gy_2().setHardness(1.0f).a(u).b(yt_2.a8).R());
        Block.registerBlock(69, yt_2.dJ, new ge_1().setHardness(0.5f).a(u).b(yt_2.dV));
        Block.registerBlock(70, yt_2.fQ, new fv_1(Material.y, afs_1.MOBS).setHardness(0.5f).a(h).b(yt_2.d5));
        Block.registerBlock(71, yt_2.bY, new g7_0(Material.t).setHardness(5.0f).a(G).b(yt_2.dj).R());
        Block.registerBlock(72, yt_2.dH, new fv_1(Material.wood, afs_1.EVERYTHING).setHardness(0.5f).a(u).b(yt_2.aH));
        Block.registerBlock(73, yt_2.bI, new gw_2(false).setHardness(3.0f).a(5.0f).a(h).b(yt_2.P).a(CreativeTabs.m));
        Block.registerBlock(74, yt_2.bw, new gw_2(true).c(0.625f).setHardness(3.0f).a(5.0f).a(h).b(yt_2.cH));
        Block.registerBlock(75, yt_2.fE, new hu_1(false).setHardness(0.0f).a(u).b(yt_2.cU));
        Block.registerBlock(76, yt_2.cq, new hu_1(true).setHardness(0.0f).c(0.5f).a(u).b(yt_2.bh).a(CreativeTabs.j));
        Block.registerBlock(77, yt_2.eY, new fo_1().setHardness(0.5f).a(h).b(yt_2.eR));
        Block.registerBlock(78, yt_2.r, new hq_1().setHardness(0.1f).a(E).b(yt_2.cd).a(0));
        Block.registerBlock(79, yt_2.dC, new f7_0().setHardness(0.5f).a(3).a(q).b(yt_2.b9));
        Block.registerBlock(80, yt_2.fb, new hi_1().setHardness(0.2f).a(E).b(yt_2.eF));
        Block.registerBlock(81, yt_2.bL, new ff_1().setHardness(0.4f).a(k).b(yt_2.bk));
        Block.registerBlock(82, yt_2.d3, new fq_2().setHardness(0.6f).a(L).b(yt_2.dY));
        Block.registerBlock(83, yt_2.bE, new gy_1().setHardness(0.0f).a(x).b(yt_2.az).R());
        Block.registerBlock(84, yt_2.bT, new fk_1().setHardness(2.0f).a(10.0f).a(h).b(yt_2.c1));
        Block.registerBlock(85, yt_2.aC, new g2_0(Material.wood, aER.a(F3.OAK)).setHardness(2.0f).a(5.0f).a(u).b(yt_2.ef));
        Block block9 = new gv_1().setHardness(1.0f).a(u).b(yt_2.fl);
        Block.registerBlock(86, yt_2.a_, block9);
        Block.registerBlock(87, yt_2.de, new gq_2().setHardness(0.4f).a(h).b(yt_2.cx));
        Block.registerBlock(88, yt_2.a5, new hg_2().setHardness(0.5f).a(i).b(yt_2.ay));
        Block.registerBlock(89, yt_2.l, new gu_1(Material.w).setHardness(0.3f).a(q).c(1.0f).b(yt_2.dK));
        Block.registerBlock(90, yt_2.c4, new fq_1().setHardness(-1.0f).a(q).c(0.75f).b(yt_2.dr));
        Block.registerBlock(91, yt_2.ax, new gv_1().setHardness(1.0f).a(u).c(1.0f).b(yt_2.a2));
        Block.registerBlock(92, yt_2.fN, new fz_1().setHardness(0.5f).a(k).b(yt_2.b7).R());
        Block.registerBlock(93, yt_2.aq, new g3_0(false).setHardness(0.0f).a(u).b(yt_2.aS).R());
        Block.registerBlock(94, yt_2.b, new g3_0(true).setHardness(0.0f).a(u).b(yt_2.cB).R());
        Block.registerBlock(95, yt_2.ao, new fg_2(Material.w).setHardness(0.3f).a(q).b(yt_2.bM));
        Block.registerBlock(96, yt_2.eJ, new h4_0(Material.wood).setHardness(3.0f).a(u).b(yt_2.bJ).R());
        Block.registerBlock(97, yt_2.dQ, new h6_0().setHardness(0.75f).b(yt_2.e6));
        Block block10 = new hk_1().setHardness(1.5f).a(10.0f).a(h).b(yt_2.ag);
        Block.registerBlock(98, yt_2.fG, block10);
        Block.registerBlock(99, yt_2.A, new gd_1(Material.wood, MapColor.d, block5).setHardness(0.2f).a(u).b(yt_2.eu));
        Block.registerBlock(100, yt_2.eZ, new gd_1(Material.wood, MapColor.h, block6).setHardness(0.2f).a(u).b(yt_2.ep));
        Block.registerBlock(101, yt_2.cM, new gd_2(Material.t, true).setHardness(5.0f).a(10.0f).a(G).b(yt_2.cJ));
        Block.registerBlock(102, yt_2.dd, new gd_2(Material.w, false).setHardness(0.3f).a(q).b(yt_2.cf));
        Block block11 = new gz_1().setHardness(1.0f).a(u).b(yt_2.ce);
        Block.registerBlock(103, yt_2.a1, block11);
        Block.registerBlock(104, yt_2.I, new fh_1(block9).setHardness(0.0f).a(u).b(yt_2.dI));
        Block.registerBlock(105, yt_2.cT, new fh_1(block11).setHardness(0.0f).a(u).b(yt_2.fP));
        Block.registerBlock(106, yt_2.aJ, new ha_2().setHardness(0.2f).a(x).b(yt_2.ee));
        Block.registerBlock(107, yt_2.cF, new gv_2(F3.OAK).setHardness(2.0f).a(5.0f).a(u).b(yt_2.fB));
        Block.registerBlock(108, yt_2.ff, new hn_2(block7.m()).b(yt_2.z));
        Block.registerBlock(109, yt_2.cv, new hn_2(BlockStateInvoker.a(block10.m(), hk_1.P, (Comparable)((Object)aCq.DEFAULT))).b(yt_2.eL));
        Block.registerBlock(110, yt_2.cg, new gp_1().setHardness(0.6f).a(x).b(yt_2.c3));
        Block.registerBlock(111, yt_2.cI, new fd_1().setHardness(0.0f).a(x).b(yt_2.db));
        Block block12 = new gf_0().setHardness(2.0f).a(10.0f).a(h).b(yt_2.dE).a(CreativeTabs.m);
        Block.registerBlock(112, yt_2.dv, block12);
        Block.registerBlock(113, yt_2.R, new g2_0(Material.y, MapColor.w).setHardness(2.0f).a(10.0f).a(h).b(yt_2.ai));
        Block.registerBlock(114, yt_2.b1, new hn_2(block12.m()).b(yt_2.bN));
        Block.registerBlock(115, yt_2.f, new fr_1().b(yt_2.cy));
        Block.registerBlock(116, yt_2.c2, new f0_0().setHardness(5.0f).a(2000.0f).b(yt_2.ek));
        Block.registerBlock(117, yt_2.ec, new fx_1().setHardness(0.5f).c(0.125f).b(yt_2.K));
        Block.registerBlock(118, yt_2.e2, new ff_2().setHardness(2.0f).b(yt_2.cC));
        Block.registerBlock(119, yt_2.cY, new f__0(Material.m).setHardness(-1.0f).a(6000000.0f));
        Block.registerBlock(120, yt_2.s, new gi_1().a(q).c(0.125f).setHardness(-1.0f).b(yt_2.dn).a(6000000.0f).a(CreativeTabs.l));
        Block.registerBlock(121, yt_2.c_, new Block(Material.y, MapColor.z).setHardness(3.0f).a(15.0f).a(h).b(yt_2.ac).a(CreativeTabs.m));
        Block.registerBlock(122, yt_2.c0, new gq_1().setHardness(3.0f).a(15.0f).a(h).c(0.125f).b(yt_2.T));
        Block.registerBlock(123, yt_2.O, new gc_1(false).setHardness(0.3f).a(q).b(yt_2.d9).a(CreativeTabs.j));
        Block.registerBlock(124, yt_2.dO, new gc_1(true).setHardness(0.3f).a(q).b(yt_2.cc));
        Block.registerBlock(125, yt_2.aI, new hx_2().setHardness(2.0f).a(5.0f).a(u).b(yt_2.G));
        Block.registerBlock(126, yt_2.dF, new h7_0().setHardness(2.0f).a(5.0f).a(u).b(yt_2.bf));
        Block.registerBlock(127, yt_2.ey, new gw_1().setHardness(0.2f).a(5.0f).a(u).b(yt_2.fp));
        Block.registerBlock(128, yt_2.aV, new hn_2(BlockStateInvoker.a(block4.m(), hl_2.P, (Comparable)((Object)aeo_1.SMOOTH))).b(yt_2.bi));
        Block.registerBlock(129, yt_2.aA, new gz_2().setHardness(3.0f).a(5.0f).a(h).b(yt_2.cN));
        Block.registerBlock(130, yt_2.fg, new fc_1().setHardness(22.5f).a(1000.0f).a(h).b(yt_2.aO).c(0.5f));
        Block.registerBlock(131, yt_2.ed, new hd_1().b(yt_2.eb));
        Block.registerBlock(132, yt_2.d2, new h5_0().b(yt_2.cb));
        Block.registerBlock(133, yt_2.fF, new Block(Material.t, MapColor.l).setHardness(5.0f).a(10.0f).a(G).b(yt_2.ck).a(CreativeTabs.m));
        Block.registerBlock(134, yt_2.e_, new hn_2(BlockStateInvoker.a(block3.m(), BlockPlanks.P, (Comparable)((Object)F3.SPRUCE))).b(yt_2.fv));
        Block.registerBlock(135, yt_2.cm, new hn_2(BlockStateInvoker.a(block3.m(), BlockPlanks.P, (Comparable)((Object)F3.BIRCH))).b(yt_2.d8));
        Block.registerBlock(136, yt_2.cr, new hn_2(BlockStateInvoker.a(block3.m(), BlockPlanks.P, (Comparable)((Object)F3.JUNGLE))).b(yt_2.e7));
        Block.registerBlock(137, yt_2.e3, new fm_1().h().a(6000000.0f).b(yt_2.du));
        Block.registerBlock(138, yt_2.e0, new f8_0().b(yt_2.Q).c(1.0f));
        Block.registerBlock(139, yt_2.bV, new hr_0(block2).b(yt_2.aM));
        Block.registerBlock(140, yt_2.fu, new fw_2().setHardness(0.0f).a(p).b(yt_2.fC));
        Block.registerBlock(141, yt_2.bA, new fo_2().b(yt_2.j));
        Block.registerBlock(142, yt_2.es, new fk_2().b(yt_2.fR));
        Block.registerBlock(143, yt_2.fq, new fb_1().setHardness(0.5f).a(u).b(yt_2.eV));
        Block.registerBlock(144, yt_2.bC, new g6_0().setHardness(1.0f).a(h).b(yt_2.dm));
        Block.registerBlock(145, yt_2.ct, new gc_2().setHardness(5.0f).a(A).a(2000.0f).b(yt_2.cA));
        Block.registerBlock(146, yt_2.dM, new fs_1(1).setHardness(2.5f).a(u).b(yt_2.fd));
        Block.registerBlock(147, yt_2.dw, new fr_2(Material.t, 15, MapColor.n).setHardness(0.5f).a(u).b(yt_2.eB));
        Block.registerBlock(148, yt_2.o, new fr_2(Material.t, 150).setHardness(0.5f).a(u).b(yt_2.cE));
        Block.registerBlock(149, yt_2.bv, new gu_2(false).setHardness(0.0f).a(u).b(yt_2.bR).R());
        Block.registerBlock(150, yt_2.ei, new gu_2(true).setHardness(0.0f).c(0.625f).a(u).b(yt_2.fj).R());
        Block.registerBlock(151, yt_2.em, new f9_0(false));
        Block.registerBlock(152, yt_2.cR, new fz_2(Material.t, MapColor.G).setHardness(5.0f).a(10.0f).a(G).b(yt_2.cQ).a(CreativeTabs.j));
        Block.registerBlock(153, yt_2.w, new gz_2(MapColor.w).setHardness(3.0f).a(5.0f).a(h).b(yt_2.N));
        Block.registerBlock(154, yt_2.ew, new fy_1().setHardness(3.0f).a(8.0f).a(G).b(yt_2.h));
        Block block13 = new gm_1().a(h).setHardness(0.8f).b(yt_2.d0);
        Block.registerBlock(155, yt_2.fL, block13);
        Block.registerBlock(156, yt_2.D, new hn_2(BlockStateInvoker.a(block13.m(), gm_1.P, (Comparable)((Object)MQ.DEFAULT))).b(yt_2.eq));
        Block.registerBlock(157, yt_2.aK, new g0_0().setHardness(0.7f).a(G).b(yt_2.bt));
        Block.registerBlock(158, yt_2.y, new fm_2().setHardness(3.5f).a(h).b(yt_2.dP));
        Block.registerBlock(159, yt_2.aG, new fe_1(Material.y).setHardness(1.25f).a(7.0f).a(h).b(yt_2.ez));
        Block.registerBlock(160, yt_2.ft, new gn_1().setHardness(0.3f).a(q).b(yt_2.dS));
        Block.registerBlock(161, yt_2.bj, new gh_2().b(yt_2.cS));
        Block.registerBlock(162, yt_2.cl, new gt_1().b(yt_2.aw));
        Block.registerBlock(163, yt_2.e5, new hn_2(BlockStateInvoker.a(block3.m(), BlockPlanks.P, (Comparable)((Object)F3.ACACIA))).b(yt_2.u));
        Block.registerBlock(164, yt_2.av, new hn_2(BlockStateInvoker.a(block3.m(), BlockPlanks.P, (Comparable)((Object)F3.DARK_OAK))).b(yt_2.eN));
        Block.registerBlock(165, yt_2.br, new fi_1().b(yt_2.b5).a(B));
        Block.registerBlock(166, yt_2.eW, new fw_1().b(yt_2.a6));
        Block.registerBlock(167, yt_2.cu, new h4_0(Material.t).setHardness(5.0f).a(G).b(yt_2.q).R());
        Block.registerBlock(168, yt_2.aB, new gs_0().setHardness(1.5f).a(10.0f).a(h).b(yt_2.dU));
        Block.registerBlock(169, yt_2.bG, new hy_2(Material.w).setHardness(0.3f).a(q).c(1.0f).b(yt_2.ab));
        Block.registerBlock(170, yt_2.dR, new gb_1().setHardness(0.5f).a(x).b(yt_2.bK).a(CreativeTabs.m));
        Block.registerBlock(171, yt_2.fz, new fp_1().setHardness(0.1f).a(k).b(yt_2.bH).a(0));
        Block.registerBlock(172, yt_2.bq, new g5_0().setHardness(1.25f).a(7.0f).a(h).b(yt_2.fm));
        Block.registerBlock(173, yt_2.dG, new Block(Material.y, MapColor.o).setHardness(5.0f).a(10.0f).a(h).b(yt_2.c8).a(CreativeTabs.m));
        Block.registerBlock(174, yt_2.et, new gt_2().setHardness(0.5f).a(q).b(yt_2.c5));
        Block.registerBlock(175, yt_2.eD, new fl_1());
        Block.registerBlock(176, yt_2.dz, new fi_2().setHardness(1.0f).a(u).b(yt_2.e4).R());
        Block.registerBlock(177, yt_2.b6, new fn_0().setHardness(1.0f).a(u).b(yt_2.d7).R());
        Block.registerBlock(178, yt_2.dk, new f9_0(true));
        Block block14 = new g__0().a(h).setHardness(0.8f).b(yt_2.C);
        Block.registerBlock(179, yt_2.Z, block14);
        Block.registerBlock(180, yt_2.Y, new hn_2(BlockStateInvoker.a(block14.m(), g__0.P, (Comparable)((Object)akv_1.SMOOTH))).b(yt_2.fI));
        Block.registerBlock(181, yt_2.n, new hr_1().setHardness(2.0f).a(10.0f).a(h).b(yt_2.dW));
        Block.registerBlock(182, yt_2.at, new hu_2().setHardness(2.0f).a(10.0f).a(h).b(yt_2.aW));
        Block.registerBlock(183, yt_2.S, new gv_2(F3.SPRUCE).setHardness(2.0f).a(5.0f).a(u).b(yt_2.M));
        Block.registerBlock(184, yt_2.bp, new gv_2(F3.BIRCH).setHardness(2.0f).a(5.0f).a(u).b(yt_2.fH));
        Block.registerBlock(185, yt_2.ak, new gv_2(F3.JUNGLE).setHardness(2.0f).a(5.0f).a(u).b(yt_2.fS));
        Block.registerBlock(186, yt_2.fJ, new gv_2(F3.DARK_OAK).setHardness(2.0f).a(5.0f).a(u).b(yt_2.dZ));
        Block.registerBlock(187, yt_2.bm, new gv_2(F3.ACACIA).setHardness(2.0f).a(5.0f).a(u).b(yt_2.ea));
        Block.registerBlock(188, yt_2.cK, new g2_0(Material.wood, aER.a(F3.SPRUCE)).setHardness(2.0f).a(5.0f).a(u).b(yt_2.au));
        Block.registerBlock(189, yt_2.bD, new g2_0(Material.wood, aER.a(F3.BIRCH)).setHardness(2.0f).a(5.0f).a(u).b(yt_2.dy));
        Block.registerBlock(190, yt_2.dA, new g2_0(Material.wood, aER.a(F3.JUNGLE)).setHardness(2.0f).a(5.0f).a(u).b(yt_2.eh));
        Block.registerBlock(191, yt_2.fM, new g2_0(Material.wood, aER.a(F3.DARK_OAK)).setHardness(2.0f).a(5.0f).a(u).b(yt_2.aL));
        Block.registerBlock(192, yt_2.cV, new g2_0(Material.wood, aER.a(F3.ACACIA)).setHardness(2.0f).a(5.0f).a(u).b(yt_2.fk));
        Block.registerBlock(193, yt_2.eG, new g7_0(Material.wood).setHardness(3.0f).a(u).b(yt_2.dD).R());
        Block.registerBlock(194, yt_2.U, new g7_0(Material.wood).setHardness(3.0f).a(u).b(yt_2.cZ).R());
        Block.registerBlock(195, yt_2.co, new g7_0(Material.wood).setHardness(3.0f).a(u).b(yt_2.by).R());
        Block.registerBlock(196, yt_2.dT, new g7_0(Material.wood).setHardness(3.0f).a(u).b(yt_2.dX).R());
        Block.registerBlock(197, yt_2.bg, new g7_0(Material.wood).setHardness(3.0f).a(u).b(yt_2.eC).R());
        a82.b(m);
        Iterator iterator = a82.a(m);
        while (dz_0.c(iterator)) {
            block = (Block)dz_0.b(iterator);
            if (block.o == Material.air) {
                block.j = false;
                continue;
            }
            boolean bl = false;
            boolean bl2 = block instanceof hn_2;
            n = block instanceof hj_2;
            boolean bl3 = block == block8;
            boolean cfr_ignored_0 = block.M;
            boolean bl4 = block.J == 0;
            block.j = bl = true;
        }
        iterator = a82.a(m);
        while (dz_0.c(iterator)) {
            block = (Block)dz_0.b(iterator);
            UnmodifiableIterator unmodifiableIterator = a7c_0.a(aXF.a(block.d()));
            while (dz_0.c((Iterator)unmodifiableIterator)) {
                IBlockState iBlockState = (IBlockState)dz_0.b((Iterator)unmodifiableIterator);
                n = a82.c(m, block) << 4 | block.d(iBlockState);
                aZv.a(H, iBlockState, n);
            }
        }
    }

    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
    }

    public boolean L() {
        return akm_1.d(this.o) && this.v();
    }

    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, int n, int n2) {
        return false;
    }

    public void c(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        this.a(world, blockPos, iBlockState, random);
    }

    public Item d(World world, BlockPos blockPos) {
        return px_0.a(this);
    }

    public int b(IBlockAccess iBlockAccess, BlockPos blockPos, IBlockState iBlockState, EnumFacing enumFacing) {
        return 0;
    }

    protected void a(float f, float f2, float f3, float f4, float f5, float f6) {
        this.t = f;
        this.N = f2;
        this.w = f3;
        this.d = f4;
        this.b = f5;
        this.n = f6;
    }

    public String J() {
        return aL0.a(aL0.a(new StringBuilder(), yt_2.bd), this.e).toString();
    }

    public int F() {
        return akm_1.b(this.o);
    }

    public double I() {
        return this.t;
    }

    public boolean b() {
        return false;
    }

    protected ItemStack b(IBlockState iBlockState) {
        int n = 0;
        Item item = px_0.a(this);
        if (px_0.l(item)) {
            n = this.d(iBlockState);
        }
        return new ItemStack(item, 1, n);
    }

    public boolean S() {
        return this.j;
    }

    public a5w_0 K() {
        XRay xRay = (XRay)ModuleInvoker.isEnable(ModuleRegistry.XRAY);
        return pc_1.g(xRay) ? (ListInvoker.contains(pc_1.d(xRay), P8.d(Block.a(this))) ? a5w_0.SOLID : a5w_0.TRANSLUCENT) : a5w_0.SOLID;
    }

    public double P() {
        return this.b - this.N;
    }

    public int q() {
        return 3;
    }

    public boolean a(World world, BlockPos blockPos, EnumFacing enumFacing, ItemStack itemStack) {
        return this.a(world, blockPos, enumFacing);
    }

    public int h(IBlockState iBlockState) {
        return 0;
    }

    public float h(World world, BlockPos blockPos) {
        return this.K;
    }

    public boolean a(World world, BlockPos blockPos, EnumFacing enumFacing) {
        return this.e(world, blockPos);
    }

    public boolean a(aw0_0 aw0_02) {
        return true;
    }

    public MovingObjectPosition a(World world, BlockPos blockPos, Vec3 vec3, Vec3 vec32) {
        this.a((IBlockAccess)world, blockPos);
        vec3 = aNE.a(vec3, -amv_2.j(blockPos), -amv_2.h(blockPos), -amv_2.i(blockPos));
        vec32 = aNE.a(vec32, -amv_2.j(blockPos), -amv_2.h(blockPos), -amv_2.i(blockPos));
        Vec3 vec33 = aNE.c(vec3, vec32, this.t);
        Vec3 vec34 = aNE.c(vec3, vec32, this.d);
        Vec3 vec35 = aNE.a(vec3, vec32, this.N);
        Vec3 vec36 = aNE.a(vec3, vec32, this.b);
        Vec3 vec37 = aNE.b(vec3, vec32, this.w);
        Vec3 vec38 = aNE.b(vec3, vec32, this.n);
        if (!this.b(vec33)) {
            vec33 = null;
        }
        if (!this.b(vec34)) {
            vec34 = null;
        }
        if (!this.c(vec35)) {
            vec35 = null;
        }
        if (!this.c(vec36)) {
            vec36 = null;
        }
        if (!this.a(vec37)) {
            vec37 = null;
        }
        if (!this.a(vec38)) {
            vec38 = null;
        }
        Vec3 vec39 = null;
        if (aNE.e(vec3, vec33) < aNE.e(vec3, vec39)) {
            vec39 = vec33;
        }
        if (aNE.e(vec3, vec34) < aNE.e(vec3, vec39)) {
            vec39 = vec34;
        }
        if (aNE.e(vec3, vec35) < aNE.e(vec3, vec39)) {
            vec39 = vec35;
        }
        if (aNE.e(vec3, vec36) < aNE.e(vec3, vec39)) {
            vec39 = vec36;
        }
        if (aNE.e(vec3, vec37) < aNE.e(vec3, vec39)) {
            vec39 = vec37;
        }
        if (aNE.e(vec3, vec38) < aNE.e(vec3, vec39)) {
            vec39 = vec38;
        }
        return null;
    }

    public static IBlockState d(int n) {
        int n2 = n & 0xFFF;
        int n3 = n >> 12 & 0xF;
        return Block.b(n2).c(n3);
    }

    public void c(World world, BlockPos blockPos, IBlockState iBlockState) {
    }

    public MapColor g(IBlockState iBlockState) {
        return this.c;
    }

    public String C() {
        return ahq_0.b(aL0.a(aL0.a(new StringBuilder(), this.J()), yt_2.bZ).toString());
    }

    public static void a(World world, BlockPos blockPos, ItemStack itemStack) {
        if (!world.isRemote && J9.c(aV8.k(world), yt_2.er)) {
            double d = (double)(a5_0.e(world.o) * 0.5f) + 0.25;
            double d2 = (double)(a5_0.e(world.o) * 0.5f) + 0.25;
            double d3 = (double)(a5_0.e(world.o) * 0.5f) + 0.25;
            og_0 og_02 = new og_0(world, (double)amv_2.j(blockPos) + d, (double)amv_2.h(blockPos) + d2, (double)amv_2.i(blockPos) + d3, itemStack);
            aec_0.b(og_02);
            aV8.b(world, og_02);
        }
    }

    public boolean a(IBlockState iBlockState, boolean bl) {
        return this.A();
    }

    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        return new rm_2((double)amv_2.j(blockPos) + this.t, (double)amv_2.h(blockPos) + this.N, (double)amv_2.i(blockPos) + this.w, (double)amv_2.j(blockPos) + this.d, (double)amv_2.h(blockPos) + this.b, (double)amv_2.i(blockPos) + this.n);
    }

    public void b(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
    }

    public boolean E() {
        return true;
    }

    public Material w() {
        return this.o;
    }

    public void a(World world, BlockPos blockPos, IBlockState iBlockState) {
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    public boolean G() {
        return this.g;
    }

    private static void a(int n, ResourceLocation resourceLocation, Block block) {
        a82.a(m, n, resourceLocation, block);
    }

    public static Block b(int n) {
        return (Block)a82.a(m, n);
    }

    protected Block h() {
        this.setHardness(-1.0f);
        return this;
    }

    public static Block a(Item item) {
        return item instanceof ItemBlock ? ItemBlockInvoker.a((ItemBlock)item) : null;
    }

    public boolean a() {
        return akm_1.d(this.o) && this.v();
    }

    protected Block a(float f) {
        this.s = f * 3.0f;
        return this;
    }

    public static boolean a(Block block, Block block2) {
        return block == block2 || block.b(block2);
    }

    public int a(Random random) {
        return 1;
    }

    public boolean v() {
        return true;
    }

    public boolean j() {
        return akm_1.d(this.o) && this.v();
    }

    public int H() {
        return this.J;
    }

    public double p() {
        return this.N;
    }

    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        return false;
    }

    protected Block a(boolean bl) {
        this.I = bl;
        return this;
    }

    protected Block c(float f) {
        this.r = (int)(15.0f * f);
        return this;
    }

    public double x() {
        return this.w;
    }

    public int d(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return this.a(iBlockAccess, blockPos, 0);
    }

    public boolean c(IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        return akm_1.i(BlockStateInvoker.getBlock(aG3.c(iBlockAccess, blockPos)).w());
    }
}


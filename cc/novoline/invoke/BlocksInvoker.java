/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.IBlockAccess;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import deobf.TileEntity;
import deobf.Vec3;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.CreativeTabs;
import deobf.EnumFacing;
import net.IBlockState;
import net.Item;
import net.MapColor;
import net.Material;
import net.World;
import net.a42;
import net.a5w_0;
import net.aw0_0;
import net.qn_2;
import net.rm_2;

public class BlocksInvoker {
    private static int[] b;

    public static int n(Block block) {
        return block.F();
    }

    public static void a(Block block, World world, BlockPos blockPos, Entity entity) {
        block.a(world, blockPos, entity);
    }

    public static void b(Block block, World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        block.b(world, blockPos, iBlockState, random);
    }

    public static double j(Block block) {
        return block.p();
    }

    static {
        if (BlocksInvoker.b() == null) {
            BlocksInvoker.b(new int[5]);
        }
    }

    public static void a(Block block, World world, BlockPos blockPos) {
        block.c(world, blockPos);
    }

    public static void a(Block block, World world, BlockPos blockPos, IBlockState iBlockState, Entity entity) {
        block.a(world, blockPos, iBlockState, entity);
    }

    public static double u(Block block) {
        return block.x();
    }

    public static boolean r(Block block) {
        return block.y();
    }

    public static void c(Block block, World world, BlockPos blockPos, IBlockState iBlockState) {
        block.d(world, blockPos, iBlockState);
    }

    public static void a(Block block, World world, Entity entity) {
        block.a(world, entity);
    }

    public static IBlockState d(Block block, IBlockState iBlockState) {
        return block.a(iBlockState);
    }

    public static void a(Block block, World world, BlockPos blockPos, Entity entity, float f) {
        block.a(world, blockPos, entity, f);
    }

    public static void a(Block block, Item item, CreativeTabs creativeTabs, List list) {
        block.a(item, creativeTabs, list);
    }

    public static boolean a(Block block, IBlockState iBlockState, boolean bl) {
        return block.a(iBlockState, bl);
    }

    public static MovingObjectPosition a(Block block, World world, BlockPos blockPos, Vec3 vec3, Vec3 vec32) {
        return block.a(world, blockPos, vec3, vec32);
    }

    public static boolean g(Block block, World world, BlockPos blockPos) {
        return block.e(world, blockPos);
    }

    public static IBlockState t(Block block) {
        return block.m();
    }

    public static void a(Block block, World world, BlockPos blockPos, IBlockState iBlockState, rm_2 rm_22, List list, Entity entity) {
        block.a(world, blockPos, iBlockState, rm_22, list, entity);
    }

    public static int a(Block block, IBlockAccess iBlockAccess, BlockPos blockPos, IBlockState iBlockState, EnumFacing enumFacing) {
        return block.b(iBlockAccess, blockPos, iBlockState, enumFacing);
    }

    public static IBlockState a(Block block, int n) {
        return block.c(n);
    }

    public static int a(Block block, IBlockState iBlockState) {
        return block.h(iBlockState);
    }

    public static a5w_0 m(Block block) {
        return block.K();
    }

    public static rm_2 e(Block block, World world, BlockPos blockPos) {
        return block.f(world, blockPos);
    }

    public static int v(Block block) {
        return Block.a(block);
    }

    public static boolean s(Block block) {
        return block.j();
    }

    public static double B(Block block) {
        return block.I();
    }

    public static Material getBlockState(Block block) {
        return block.w();
    }

    public static IBlockState b(int n) {
        return Block.d(n);
    }

    public static boolean a(Block block, aw0_0 aw0_02) {
        return block.a(aw0_02);
    }

    public static void a(World world, BlockPos blockPos, ItemStack itemStack) {
        Block.a(world, blockPos, itemStack);
    }

    public static CreativeTabs H(Block block) {
        return block.t();
    }

    public static void a(Block block, World world, BlockPos blockPos, IBlockState iBlockState, Block block2) {
        block.a(world, blockPos, iBlockState, block2);
    }

    public static int G(Block block) {
        return block.N();
    }

    public static boolean a(Block block, IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        return block.b(iBlockAccess, blockPos, enumFacing);
    }

    public static double a(Block block) {
        return block.g();
    }

    public static boolean F(Block block) {
        return block.B();
    }

    public static MapColor b(Block block, IBlockState iBlockState) {
        return block.g(iBlockState);
    }

    public static Block a(String string) {
        return Block.a(string);
    }

    public static IBlockState a(Block block, World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, int n, EntityLivingBase entityLivingBase) {
        BlocksInvoker.b();
        IBlockState iBlockState = block.a(world, blockPos, enumFacing, f, f2, f3, n, entityLivingBase);
        ListInvoker.b(new ListInvoker[3]);
        return iBlockState;
    }

    public static int c(Block block, IBlockAccess iBlockAccess, BlockPos blockPos) {
        return block.b(iBlockAccess, blockPos);
    }

    public static void a(Block block, World world, BlockPos blockPos, aw0_0 aw0_02) {
        block.a(world, blockPos, aw0_02);
    }

    public static double h(Block block) {
        return block.k();
    }

    public static int y(Block block) {
        return block.q();
    }

    public static int[] b() {
        return b;
    }

    public static qn_2 f(Block block) {
        return block.O();
    }

    public static int f(Block block, World world, BlockPos blockPos) {
        return block.g(world, blockPos);
    }

    public static void a(Block block, IBlockAccess iBlockAccess, BlockPos blockPos) {
        block.a(iBlockAccess, blockPos);
    }

    public static int e(Block block, IBlockState iBlockState) {
        return block.e(iBlockState);
    }

    public static void a(Block block, World world, BlockPos blockPos, IBlockState iBlockState, int n) {
        block.a(world, blockPos, iBlockState, n);
    }

    public static boolean g(Block block) {
        return block.z();
    }

    public static boolean a(Block block, World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        BlocksInvoker.b();
        boolean bl = block.a(world, blockPos, iBlockState, entityPlayer, enumFacing, f, f2, f3);
        if (ListInvoker.b() != null) {
            BlocksInvoker.b(new int[5]);
        }
        return bl;
    }

    public static String K(Block block) {
        return block.C();
    }

    public static boolean a(Block block, Block block2) {
        return Block.a(block, block2);
    }

    public static float a(Block block, Entity entity) {
        return block.a(entity);
    }

    public static boolean z(Block block) {
        return block.E();
    }

    public static Item c(Block block, World world, BlockPos blockPos) {
        return block.d(world, blockPos);
    }

    public static float b(Block block, World world, BlockPos blockPos) {
        return block.h(world, blockPos);
    }

    public static boolean d(Block block, World world, BlockPos blockPos) {
        return block.b(world, blockPos);
    }

    public static rm_2 a(Block block, World world, BlockPos blockPos, IBlockState iBlockState) {
        return block.b(world, blockPos, iBlockState);
    }

    public static int b(Block block, IBlockAccess iBlockAccess, BlockPos blockPos, IBlockState iBlockState, EnumFacing enumFacing) {
        return block.a(iBlockAccess, blockPos, iBlockState, enumFacing);
    }

    public static boolean w(Block block) {
        return block.G();
    }

    public static EnumFacing a(BlockPos blockPos) {
        return Block.a(blockPos);
    }

    public static float D(Block block) {
        return block.M();
    }

    public static a42 E(Block block) {
        return block.d();
    }

    public static boolean b(Block block, IBlockAccess iBlockAccess, BlockPos blockPos) {
        return block.c(iBlockAccess, blockPos);
    }

    public static boolean k(Block block) {
        return block.e();
    }

    public static int a(Block block, IBlockAccess iBlockAccess, BlockPos blockPos, int n) {
        return block.a(iBlockAccess, blockPos, n);
    }

    public static void a(Block block, World world, EntityPlayer entityPlayer, BlockPos blockPos, IBlockState iBlockState, TileEntity tileEntity) {
        block.a(world, entityPlayer, blockPos, iBlockState, tileEntity);
    }

    public static void a(Block block, World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer) {
        block.a(world, blockPos, iBlockState, entityPlayer);
    }

    public static void c() {
        Block.registerBlocks();
    }

    public static boolean i(Block block) {
        return block.S();
    }

    public static boolean p(Block block) {
        return block.v();
    }

    public static void d(Block block, World world, BlockPos blockPos, IBlockState iBlockState) {
        block.c(world, blockPos, iBlockState);
    }

    public static void b(Block block, World world, BlockPos blockPos, IBlockState iBlockState) {
        block.a(world, blockPos, iBlockState);
    }

    public static boolean a(Block block, World world, BlockPos blockPos, EnumFacing enumFacing) {
        return block.a(world, blockPos, enumFacing);
    }

    public static boolean c(Block block) {
        return block.u();
    }

    public static void q(Block block) {
        block.o();
    }

    public static IBlockState a(Block block, IBlockState iBlockState, IBlockAccess iBlockAccess, BlockPos blockPos) {
        return block.a(iBlockState, iBlockAccess, blockPos);
    }

    public static boolean x(Block block) {
        return block.D();
    }

    public static double I(Block block) {
        return block.P();
    }

    public static int a(IBlockState iBlockState) {
        return Block.c(iBlockState);
    }

    public static float a(Block block, EntityPlayer entityPlayer, World world, BlockPos blockPos) {
        return block.a(entityPlayer, world, blockPos);
    }

    public static void c(Block block, World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        block.a(world, blockPos, iBlockState, random);
    }

    public static double C(Block block) {
        return block.n();
    }

    public static void a(Block block, World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        block.c(world, blockPos, iBlockState, random);
    }

    public static void a(Block block, World world, BlockPos blockPos, EntityPlayer entityPlayer) {
        block.a(world, blockPos, entityPlayer);
    }

    public static String o(Block block) {
        return block.J();
    }

    public static boolean d(Block block) {
        return block.a();
    }

    public static int d(Block block, IBlockAccess iBlockAccess, BlockPos blockPos) {
        return block.d(iBlockAccess, blockPos);
    }

    public static Vec3 a(Block block, World world, BlockPos blockPos, Entity entity, Vec3 vec3) {
        return block.a(world, blockPos, entity, vec3);
    }

    public static boolean l(Block block) {
        return block.A();
    }

    public static Block a(Item item) {
        return Block.a(item);
    }

    public static int c(Block block, IBlockState iBlockState) {
        return block.d(iBlockState);
    }

    public static boolean a(Block block, World world, BlockPos blockPos, IBlockState iBlockState, int n, int n2) {
        return block.a(world, blockPos, iBlockState, n, n2);
    }

    public static boolean L(Block block) {
        return block.f();
    }

    public static void a(Block block, World world, BlockPos blockPos, IBlockState iBlockState, EntityLivingBase entityLivingBase, ItemStack itemStack) {
        block.a(world, blockPos, iBlockState, entityLivingBase, itemStack);
    }

    public static boolean a(Block block, World world, BlockPos blockPos, EnumFacing enumFacing, ItemStack itemStack) {
        return block.a(world, blockPos, enumFacing, itemStack);
    }

    public static void a(Block block, World world, BlockPos blockPos, IBlockState iBlockState, float f, int n) {
        block.a(world, blockPos, iBlockState, f, n);
    }

    public static int b(Block block) {
        return block.H();
    }

    public static Block a(int n) {
        return Block.b(n);
    }

    public static boolean e(Block block) {
        return block.i();
    }

    public static boolean J(Block block) {
        return block.Q();
    }

    public static void b(int[] nArray) {
        b = nArray;
    }
}


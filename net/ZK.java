/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Chunk;
import deobf.Entity;
import deobf.EntityPlayer;
import net.minecraft.util.MovingObjectPosition;
import deobf.TileEntity;
import deobf.Vec3;
import java.util.List;


public class ZK
extends World {
    private static int[] O;

    @Override
    public MovingObjectPosition a(Vec3 vec3, Vec3 vec32) {
        return null;
    }

    @Override
    protected void y() {
    }

    public int a(Class clazz) {
        return 0;
    }

    @Override
    public String t() {
        return awy_2.a;
    }

    @Override
    public void h(Entity entity) {
    }

    static {
        if (ZK.b() != null) {
            ZK.b(new int[5]);
        }
    }

    @Override
    public void a(double d, double d2, double d3, double d4, double d5, double d6, NBTTagCompound nBTTagCompound) {
    }

    @Override
    public boolean a(rm_2 rm_22, Entity entity) {
        return true;
    }

    @Override
    public int z() {
        return 256;
    }

    @Override
    public BlockPos r() {
        return new BlockPos(0, 64, 0);
    }

    @Override
    public float g(BlockPos blockPos) {
        return 14.0f;
    }

    @Override
    public void a(int n, int n2, int n3, int n4, int n5, int n6) {
    }

    @Override
    public boolean e(rm_2 rm_22) {
        return true;
    }

    @Override
    public long F() {
        return 1L;
    }

    @Override
    public void a(Entity entity, byte by) {
    }

    @Override
    protected boolean a(int n, int n2, boolean bl) {
        return true;
    }

    @Override
    public long B() {
        return 1L;
    }

    @Override
    public boolean g(Entity entity) {
        return false;
    }

    @Override
    public void a(Entity entity, boolean bl) {
    }

    @Override
    public void e(float f) {
    }

    @Override
    public void a(int n, int n2, int n3, int n4) {
    }

    public static int[] b() {
        return O;
    }

    @Override
    public void a(boolean bl) {
    }

    @Override
    public boolean b(rm_2 rm_22) {
        return false;
    }

    @Override
    public boolean P() {
        return true;
    }

    @Override
    public boolean h() {
        return false;
    }

    @Override
    public boolean a(rm_2 rm_22, Material material) {
        return false;
    }

    public Entity a(Class clazz, rm_2 rm_22, Entity entity) {
        return null;
    }

    @Override
    public int c(float f) {
        return 6;
    }

    @Override
    public float f(float f) {
        return 0.0f;
    }

    @Override
    public void b(TileEntity tileEntity) {
    }

    @Override
    public void a(double d, double d2, double d3, String string, float f, float f2, boolean bl) {
    }

    @Override
    public void a(EntityPlayer entityPlayer, String string, float f, float f2) {
    }

    @Override
    public void a(long l4) {
    }

    @Override
    public MovingObjectPosition a(Vec3 vec3, Vec3 vec32, boolean bl) {
        return null;
    }

    @Override
    public void i() {
    }

    public List a(Chunk chunk, boolean bl) {
        return null;
    }

    @Override
    public int b() {
        return 256;
    }

    @Override
    public MovingObjectPosition a(Vec3 vec3, Vec3 vec32, boolean bl, boolean bl2, boolean bl3) {
        return null;
    }

    @Override
    public Entity b(int n) {
        return ub_1.a(n, (World)this);
    }

    @Override
    public void b(IWorldAccess iWorldAccess) {
    }

    @Override
    public void a(Entity entity, String string, float f, float f2) {
    }

    @Override
    public Chunk c(int n, int n2) {
        return null;
    }

    @Override
    public boolean a(Entity entity) {
        return false;
    }

    @Override
    protected em_1 n() {
        return new hn_0();
    }

    @Override
    public long E() {
        return 1L;
    }

    @Override
    public void a(String string, wo_0 wo_02) {
    }

    @Override
    public Block a(int n, int n2, int n3) {
        return n2 > 63 ? Blocks.air : Blocks.grass;
    }

    public static void b(int[] nArray) {
        O = nArray;
    }

    @Override
    public void c(Entity entity) {
    }

    @Override
    public void a(double d, double d2, double d3, String string, float f, float f2) {
    }

    @Override
    public void d(Entity entity) {
    }

    @Override
    public void a(TileEntity tileEntity) {
    }

    @Override
    public void s() {
    }

    @Override
    public void U() {
    }

    @Override
    public boolean b(rm_2 rm_22, Material material) {
        return false;
    }

    public ZK() {
        super(new cc_0(), new WorldInfo(new NBTTagCompound()), new a9b_0(), null, false);
    }

    @Override
    public void e(Entity entity) {
    }

    @Override
    protected int L() {
        return 0;
    }

    @Override
    public boolean d(rm_2 rm_22) {
        return false;
    }

    @Override
    public void b(float f) {
    }

    @Override
    public boolean a(rm_2 rm_22, Material material, Entity entity) {
        return false;
    }

    @Override
    public String u() {
        return awy_2.b;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public void J() {
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public void f(Entity entity) {
    }

    @Override
    public void b(Entity entity) {
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.NBTTagList;
import java.util.Iterator;
import java.util.List;

import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.wF
 */
public class wf_1
extends wo_0 {
    private List<BlockPos> f = my_0.c();
    private int c;
    private List<aym_1> d;
    private List<aY6> e = my_0.c();
    private World g;

    @Override
    public void a(NBTTagCompound nBTTagCompound) {
        this.c = tn_0.g(nBTTagCompound, afd_0.e);
        NBTTagList nBTTagList = tn_0.c(nBTTagCompound, afd_0.c, 10);
        for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
            NBTTagCompound nBTTagCompound2 = kv_0.g(nBTTagList, i);
            aym_1 aym_12 = new aym_1();
            xx_2.a(aym_12, nBTTagCompound2);
            ListInvoker.add(this.d, aym_12);
        }
    }

    private boolean f(BlockPos blockPos) {
        Block block = BlockStateInvoker.getBlock(aV8.q(this.g, blockPos));
        return block instanceof g7_0 && BlocksInvoker.getBlockState(block) == Material.wood;
    }

    public List<aym_1> e() {
        return this.d;
    }

    private void d(BlockPos blockPos) {
        int n;
        EnumFacing enumFacing = af4_0.a(this.g, blockPos);
        EnumFacing enumFacing2 = SJ.b(enumFacing);
        int n2 = this.a(blockPos, enumFacing, 5);
        if (n2 != (n = this.a(blockPos, enumFacing2, n2 + 1))) {
            ListInvoker.add(this.e, new aY6(blockPos, n2 < n ? enumFacing : enumFacing2, this.c));
        }
    }

    private void c(BlockPos blockPos) {
        int n = 16;
        int n2 = 4;
        int n3 = 16;
        int n4 = -n;
        int n5 = -n2;
        int n6 = -n3;
        while (true) {
            BlockPos blockPos2;
            if (this.f(blockPos2 = amv_2.a(blockPos, n4, n5, n6))) {
                this.a(blockPos2);
                this.d(blockPos2);
            }
            ++n6;
        }
    }

    public void b() {
        ++this.c;
        Iterator iterator = ListInvoker.iterator(this.d);
        while (dz_0.c(iterator)) {
            aym_1 aym_12 = (aym_1)dz_0.b(iterator);
            xx_2.b(aym_12, this.c);
        }
        this.f();
        this.d();
        this.c();
        if (this.c % 400 == 0) {
            this.a();
        }
    }

    private void f() {
        Iterator iterator = ListInvoker.iterator(this.d);
        while (dz_0.c(iterator)) {
            aym_1 aym_12 = (aym_1)dz_0.b(iterator);
            if (!xx_2.h(aym_12)) continue;
            dz_0.a(iterator);
            this.a();
        }
    }

    public wf_1(World world) {
        super(wf_1.a(world.d));
        this.d = my_0.c();
        this.g = world;
        this.a();
    }

    private void d() {
        if (!ListInvoker.isEmpty(this.f)) {
            this.c((BlockPos)ListInvoker.remove(this.f, 0));
        }
    }

    public void b(BlockPos blockPos) {
        if (ListInvoker.size(this.f) <= 64 && !this.e(blockPos)) {
            ListInvoker.add(this.f, blockPos);
        }
    }

    public wf_1(String string) {
        super(string);
        this.d = my_0.c();
    }

    public aym_1 a(BlockPos blockPos, int n) {
        aym_1 aym_12 = null;
        double d = 3.4028234663852886E38;
        Iterator iterator = ListInvoker.iterator(this.d);
        while (dz_0.c(iterator)) {
            float f;
            aym_1 aym_13 = (aym_1)dz_0.b(iterator);
            double d2 = amv_2.c(xx_2.c(aym_13), blockPos);
            if (!(d2 < d) || !(d2 <= (double)((f = (float)(n + xx_2.f(aym_13))) * f))) continue;
            aym_12 = aym_13;
            d = d2;
        }
        return aym_12;
    }

    private aY6 a(BlockPos blockPos) {
        Object object;
        Iterator iterator = ListInvoker.iterator(this.e);
        while (dz_0.c(iterator)) {
            object = (aY6)dz_0.b(iterator);
            if (amv_2.j(hH.g((aY6)object)) != amv_2.j(blockPos) || amv_2.i(hH.g((aY6)object)) != amv_2.i(blockPos) || MathInvoker.a(amv_2.h(hH.g((aY6)object)) - amv_2.h(blockPos)) > 1) continue;
            return object;
        }
        iterator = ListInvoker.iterator(this.d);
        if (dz_0.c(iterator)) {
            object = (aym_1)dz_0.b(iterator);
            aY6 aY62 = xx_2.b((aym_1)object, blockPos);
            return aY62;
        }
        return null;
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        tn_0.b(nBTTagCompound, afd_0.d, this.c);
        NBTTagList nBTTagList = new NBTTagList();
        Iterator iterator = ListInvoker.iterator(this.d);
        while (dz_0.c(iterator)) {
            aym_1 aym_12 = (aym_1)dz_0.b(iterator);
            NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
            xx_2.b(aym_12, nBTTagCompound2);
            kv_0.a(nBTTagList, nBTTagCompound2);
        }
        tn_0.a(nBTTagCompound, afd_0.a, nBTTagList);
    }

    private int a(BlockPos blockPos, EnumFacing enumFacing, int n) {
        int n2 = 0;
        int n3 = 1;
        while (!aV8.w(this.g, amv_2.a(blockPos, enumFacing, n3)) || ++n2 < n) {
            ++n3;
        }
        return n2;
    }

    private void c() {
        Iterator iterator = ListInvoker.iterator(this.e);
        while (dz_0.c(iterator)) {
            aY6 aY62;
            aY6 aY63 = aY62 = (aY6)dz_0.b(iterator);
            aym_1 aym_12 = this.a(hH.g(aY63), 32);
            aym_12 = new aym_1(this.g);
            ListInvoker.add(this.d, aym_12);
            this.a();
            xx_2.a(aym_12, aY63);
        }
        ListInvoker.clear(this.e);
    }

    public static String a(a9K a9K2) {
        return aL0.a(aL0.a(new StringBuilder(), afd_0.b), qq_2.c(a9K2)).toString();
    }

    private boolean e(BlockPos blockPos) {
        Iterator iterator = ListInvoker.iterator(this.f);
        while (dz_0.c(iterator)) {
            BlockPos blockPos2 = (BlockPos)dz_0.b(iterator);
            if (!blockPos2.equals(blockPos)) continue;
            return true;
        }
        return false;
    }

    public void a(World world) {
        this.g = world;
        Iterator iterator = ListInvoker.iterator(this.d);
        while (dz_0.c(iterator)) {
            aym_1 aym_12 = (aym_1)dz_0.b(iterator);
            xx_2.a(aym_12, world);
        }
    }
}


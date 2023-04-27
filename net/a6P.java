/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.inventory.Container;
import deobf.Entity;
import deobf.EntityPlayer;
import deobf.ITickable;
import net.minecraft.item.ItemStack;
import deobf.NBTTagList;
import java.util.List;


public class a6P
extends a6h_0
implements amb_0,
ITickable {
    private ItemStack[] l = new ItemStack[5];
    private int k = -1;
    private String j;

    @Override
    public void a(int n, int n2) {
    }

    private static boolean c(rs_1 rs_12, ItemStack itemStack, int n, EnumFacing enumFacing) {
        return !(rs_12 instanceof aej_2) || apv_0.a((aej_2)rs_12, n, itemStack, enumFacing);
    }

    public static List<og_0> b(World world, double d, double d2, double d3) {
        return aV8.a(world, og_0.class, new rm_2(d - 0.5, d2 - 0.5, d3 - 0.5, d + 0.5, d2 + 0.5, d3 + 0.5), od_2.b);
    }

    public void a(int n) {
        this.k = n;
    }

    @Override
    public boolean e() {
        return this.j != null && !this.j.isEmpty();
    }

    @Override
    public ItemStack b(int n) {
        if (this.l[n] != null) {
            ItemStack itemStack = this.l[n];
            this.l[n] = null;
            return itemStack;
        }
        return null;
    }

    public void a(String string) {
        this.j = string;
    }

    @Override
    public void c(EntityPlayer entityPlayer) {
    }

    @Override
    public String b() {
        return D_.k;
    }

    @Override
    public int c(int n) {
        return 0;
    }

    @Override
    public double e() {
        return (double)amv_2.h(this.g) + 0.5;
    }

    @Override
    public void b() {
        if (this.e != null && !this.e.isRemote) {
            --this.k;
            if (!this.l()) {
                this.a(0);
                this.f();
            }
        }
    }

    @Override
    public String getName() {
        return this.e() ? this.j : D_.h;
    }

    private static boolean b(rs_1 rs_12, EnumFacing enumFacing) {
        if (rs_12 instanceof aej_2) {
            int[] nArray;
            aej_2 aej_22 = (aej_2)rs_12;
            for (int n : nArray = apv_0.a(aej_22, enumFacing)) {
                if (aej_22.a(n) == null) continue;
                return false;
            }
        } else {
            int n = rs_12.e();
            for (int i = 0; i < n; ++i) {
                if (rs_12.a(i) == null) continue;
                return false;
            }
        }
        return true;
    }

    private boolean m() {
        this.g();
        return false;
    }

    @Override
    public void d() {
        super.d();
    }

    private static boolean a(amb_0 amb_02, rs_1 rs_12, int n, EnumFacing enumFacing) {
        ItemStack itemStack = rs_12.a(n);
        if (a6P.c(rs_12, itemStack, n, enumFacing)) {
            ItemStack itemStack2 = act_2.C(itemStack);
            ItemStack itemStack3 = a6P.a(amb_02, rs_12.b(n, 1), null);
            if (itemStack3.a == 0) {
                rs_12.d();
                return true;
            }
            rs_12.b(n, itemStack2);
        }
        return false;
    }

    private boolean a(rs_1 rs_12, EnumFacing enumFacing) {
        if (rs_12 instanceof aej_2) {
            int[] nArray;
            aej_2 aej_22 = (aej_2)rs_12;
            for (int n : nArray = apv_0.a(aej_22, enumFacing)) {
                ItemStack itemStack = aej_22.a(n);
                if (itemStack.a == act_2.f(itemStack)) continue;
                return false;
            }
        } else {
            int n = rs_12.e();
            for (int i = 0; i < n; ++i) {
                ItemStack itemStack = rs_12.a(i);
                if (itemStack.a == act_2.f(itemStack)) continue;
                return false;
            }
        }
        return true;
    }

    @Override
    public double c() {
        return (double)amv_2.j(this.g) + 0.5;
    }

    @Override
    public void c(NBTTagCompound nBTTagCompound) {
        super.c(nBTTagCompound);
        NBTTagList nBTTagList = new NBTTagList();
        for (int i = 0; i < this.l.length; ++i) {
            if (this.l[i] == null) continue;
            NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
            tn_0.a(nBTTagCompound2, D_.g, (byte)i);
            act_2.a(this.l[i], nBTTagCompound2);
            kv_0.a(nBTTagList, nBTTagCompound2);
        }
        tn_0.a(nBTTagCompound, D_.a, nBTTagList);
        tn_0.b(nBTTagCompound, D_.d, this.k);
        if (this.e()) {
            tn_0.a(nBTTagCompound, D_.e, this.j);
        }
    }

    private boolean i() {
        for (ItemStack itemStack : this.l) {
            if (itemStack.a == act_2.f(itemStack)) continue;
            return false;
        }
        return true;
    }

    private boolean k() {
        int n = 0;
        ItemStack[] itemStackArray = this.l;
        int n2 = itemStackArray.length;
        if (n < n2) {
            ItemStack cfr_ignored_0 = itemStackArray[n];
            return false;
        }
        return true;
    }

    public static ItemStack a(rs_1 rs_12, ItemStack itemStack, EnumFacing enumFacing) {
        if (rs_12 instanceof aej_2) {
            aej_2 aej_22 = (aej_2)rs_12;
            int[] nArray = apv_0.a(aej_22, enumFacing);
            for (int i = 0; i < nArray.length && itemStack.a > 0; ++i) {
                itemStack = a6P.a(rs_12, itemStack, nArray[i], enumFacing);
            }
        } else {
            int n = rs_12.e();
            for (int i = 0; i < n && itemStack.a > 0; ++i) {
                itemStack = a6P.a(rs_12, itemStack, i, enumFacing);
            }
        }
        if (itemStack.a == 0) {
            itemStack = null;
        }
        return itemStack;
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        return aV8.z(this.e, this.g) == this && entityPlayer.d((double)amv_2.j(this.g) + 0.5, (double)amv_2.h(this.g) + 0.5, (double)amv_2.i(this.g) + 0.5) <= 64.0;
    }

    private rs_1 g() {
        EnumFacing enumFacing = aos_0.a(this.m());
        return a6P.a(this.b(), amv_2.j(this.g) + SJ.k(enumFacing), (double)(amv_2.h(this.g) + SJ.f(enumFacing)), amv_2.i(this.g) + SJ.a(enumFacing));
    }

    public boolean j() {
        return this.k <= 1;
    }

    private static boolean a(ItemStack itemStack, ItemStack itemStack2) {
        return act_2.k(itemStack) == act_2.k(itemStack2) && act_2.c(itemStack) == act_2.c(itemStack2) && itemStack.a <= act_2.f(itemStack) && act_2.c(itemStack, itemStack2);
    }

    @Override
    public int b() {
        return 64;
    }

    @Override
    public void b(EntityPlayer entityPlayer) {
    }

    public boolean f() {
        if (this.e != null && !this.e.isRemote && !this.l() && aos_0.b(this.m())) {
            if (!this.k()) {
                this.m();
            }
            if (this.i() || !a6P.b(this)) {
                // empty if block
            }
            this.a(8);
            this.d();
            return true;
        }
        return false;
    }

    private static boolean b(rs_1 rs_12, ItemStack itemStack, int n, EnumFacing enumFacing) {
        return rs_12.a(n, itemStack) && (!(rs_12 instanceof aej_2) || apv_0.b((aej_2)rs_12, n, itemStack, enumFacing));
    }

    @Override
    public int e() {
        return this.l.length;
    }

    public boolean l() {
        return this.k > 0;
    }

    public static rs_1 a(World world, double d, double d2, double d3) {
        Object object;
        int n;
        int n2;
        rs_1 rs_12 = null;
        int n3 = MathHelper.floor_double(d);
        BlockPos blockPos = new BlockPos(n3, n2 = MathHelper.floor_double(d2), n = MathHelper.floor_double(d3));
        Block block = BlockStateInvoker.getBlock(aV8.q(world, blockPos));
        if (BlocksInvoker.c(block) && (object = aV8.z(world, blockPos)) instanceof rs_1 && (rs_12 = (rs_1)object) instanceof a6O && block instanceof fs_1) {
            rs_12 = vz_1.a((fs_1)block, world, blockPos);
        }
        if (!(object = aV8.a(world, (Entity)null, new rm_2(d - 0.5, d2 - 0.5, d3 - 0.5, d + 0.5, d2 + 0.5, d3 + 0.5), od_2.a)).isEmpty()) {
            rs_12 = (rs_1)ListInvoker.get((List)object, a5_0.a(world.o, ListInvoker.size((List)object)));
        }
        return rs_12;
    }

    @Override
    public int c() {
        return 0;
    }

    @Override
    public double d() {
        return (double)amv_2.i(this.g) + 0.5;
    }

    @Override
    public ItemStack b(int n, int n2) {
        if (this.l[n] != null) {
            if (this.l[n].a <= n2) {
                ItemStack itemStack = this.l[n];
                this.l[n] = null;
                return itemStack;
            }
            ItemStack itemStack = act_2.b(this.l[n], n2);
            if (this.l[n].a == 0) {
                this.l[n] = null;
            }
            return itemStack;
        }
        return null;
    }

    private static ItemStack a(rs_1 rs_12, ItemStack itemStack, int n, EnumFacing enumFacing) {
        rs_12.a(n);
        if (a6P.b(rs_12, itemStack, n, enumFacing)) {
            rs_12.b(n, itemStack);
            itemStack = null;
            if (rs_12 instanceof a6P) {
                a6P a6P2 = (a6P)rs_12;
                if (a6P2.j()) {
                    a6P2.a(8);
                }
                rs_12.d();
            }
            rs_12.d();
        }
        return itemStack;
    }

    public static boolean a(rs_1 rs_12, og_0 og_02) {
        return false;
    }

    @Override
    public void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        NBTTagList nBTTagList = tn_0.c(nBTTagCompound, D_.b, 10);
        this.l = new ItemStack[this.e()];
        if (tn_0.a(nBTTagCompound, D_.c, 8)) {
            this.j = tn_0.m(nBTTagCompound, D_.i);
        }
        this.k = tn_0.g(nBTTagCompound, D_.j);
        for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
            NBTTagCompound nBTTagCompound2 = kv_0.g(nBTTagList, i);
            byte by = tn_0.e(nBTTagCompound2, D_.f);
            if (by >= this.l.length) continue;
            this.l[by] = act_2.a(nBTTagCompound2);
        }
    }

    @Override
    public Container a(aSK aSK2, EntityPlayer entityPlayer) {
        return new aai_2(aSK2, this, entityPlayer);
    }

    public static rs_1 a(amb_0 amb_02) {
        return a6P.a(amb_02.b(), amb_02.c(), amb_02.e() + 1.0, amb_02.d());
    }

    @Override
    public void a() {
        a7r_0.b(this.l, null);
    }

    @Override
    public boolean a(int n, ItemStack itemStack) {
        return true;
    }

    @Override
    public void b(int n, ItemStack itemStack) {
        this.l[n] = itemStack;
        if (itemStack.a > this.b()) {
            itemStack.a = this.b();
        }
    }

    public static boolean b(amb_0 amb_02) {
        EnumFacing enumFacing;
        rs_1 rs_12 = a6P.a(amb_02);
        if (a6P.b(rs_12, enumFacing = EnumFacing.DOWN)) {
            return false;
        }
        if (rs_12 instanceof aej_2) {
            int[] nArray;
            aej_2 aej_22 = (aej_2)rs_12;
            for (int n : nArray = apv_0.a(aej_22, enumFacing)) {
                if (!a6P.a(amb_02, rs_12, n, enumFacing)) continue;
                return true;
            }
        } else {
            int n = rs_12.e();
            for (int i = 0; i < n; ++i) {
                if (!a6P.a(amb_02, rs_12, i, enumFacing)) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public ItemStack a(int n) {
        return this.l[n];
    }
}


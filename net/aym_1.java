/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ServerInvoker;
import com.mojang.authlib.GameProfile;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.IBlockAccess;
import deobf.NBTBase;
import deobf.NBTTagList;
import deobf.PlayerProfileCache;
import deobf.Vec3;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.aym
 */
public class aym_1 {
    private TreeMap<String, Integer> b;
    private int e;
    private BlockPos k;
    private int c;
    private BlockPos d;
    private World f;
    private List<adi_2> a;
    private int j;
    private List<aY6> i = my_0.c();
    private int l;
    private int g;
    private int h;

    public void b(EntityLivingBase entityLivingBase) {
        Iterator iterator = ListInvoker.iterator(this.a);
        while (dz_0.c(iterator)) {
            adi_2 adi_22 = (adi_2)dz_0.b(iterator);
            if (adi_22.c != entityLivingBase) continue;
            adi_22.b = this.j;
            return;
        }
        ListInvoker.add(this.a, new adi_2(this, entityLivingBase, this.j));
    }

    private void l() {
        List list = aV8.a(this.f, nz_0.class, new rm_2(amv_2.j(this.k) - this.h, amv_2.h(this.k) - 4, amv_2.i(this.k) - this.h, amv_2.j(this.k) + this.h, amv_2.h(this.k) + 4, amv_2.i(this.k) + this.h));
        this.e = ListInvoker.size(list);
        if (this.e == 0) {
            atj_0.b(this.b);
        }
    }

    private Vec3 a(BlockPos blockPos, int n, int n2, int n3) {
        int n4 = 0;
        BlockPos blockPos2;
        while (!this.e(blockPos2 = amv_2.a(blockPos, a5_0.a(this.f.o, 16) - 8, a5_0.a(this.f.o, 6) - 3, a5_0.a(this.f.o, 16) - 8)) || !this.a(new BlockPos(n, n2, n3), blockPos2)) {
            ++n4;
        }
        return new Vec3(amv_2.j(blockPos2), amv_2.h(blockPos2), amv_2.i(blockPos2));
    }

    public void b(NBTTagCompound nBTTagCompound) {
        Object object;
        this.e = tn_0.g(nBTTagCompound, x4_0.r);
        this.h = tn_0.g(nBTTagCompound, x4_0.M);
        this.l = tn_0.g(nBTTagCompound, x4_0.N);
        this.g = tn_0.g(nBTTagCompound, x4_0.q);
        this.j = tn_0.g(nBTTagCompound, x4_0.v);
        this.c = tn_0.g(nBTTagCompound, x4_0.G);
        this.k = new BlockPos(tn_0.g(nBTTagCompound, x4_0.P), tn_0.g(nBTTagCompound, x4_0.x), tn_0.g(nBTTagCompound, x4_0.C));
        this.d = new BlockPos(tn_0.g(nBTTagCompound, x4_0.E), tn_0.g(nBTTagCompound, x4_0.T), tn_0.g(nBTTagCompound, x4_0.L));
        NBTTagList nBTTagList = tn_0.c(nBTTagCompound, x4_0.f, 10);
        for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
            NBTTagCompound nBTTagCompound2 = kv_0.g(nBTTagList, i);
            object = new aY6(new BlockPos(tn_0.g(nBTTagCompound2, x4_0.t), tn_0.g(nBTTagCompound2, x4_0.a), tn_0.g(nBTTagCompound2, x4_0.l)), tn_0.g(nBTTagCompound2, x4_0.I), tn_0.g(nBTTagCompound2, x4_0.J), tn_0.g(nBTTagCompound2, x4_0.S));
            ListInvoker.add(this.i, object);
        }
        NBTTagList nBTTagList2 = tn_0.c(nBTTagCompound, x4_0.b, 10);
        for (int i = 0; i < kv_0.c(nBTTagList2); ++i) {
            object = kv_0.g(nBTTagList2, i);
            if (tn_0.b((NBTTagCompound)object, x4_0.K)) {
                PlayerProfileCache playerProfileCache = ServerInvoker.L(ServerInvoker.d());
                GameProfile gameProfile = aUu.a(playerProfileCache, awc_1.a(tn_0.m((NBTTagCompound)object, x4_0.o)));
                atj_0.a(this.b, a4Z.d(gameProfile), P8.d(tn_0.g((NBTTagCompound)object, x4_0.e)));
                continue;
            }
            atj_0.a(this.b, tn_0.m((NBTTagCompound)object, x4_0.c), P8.d(tn_0.g((NBTTagCompound)object, x4_0.y)));
        }
    }

    public int h() {
        return this.h;
    }

    public aym_1() {
        this.d = BlockPos.m;
        this.k = BlockPos.m;
        this.b = new TreeMap();
        this.a = my_0.c();
    }

    public EntityLivingBase c(EntityLivingBase entityLivingBase) {
        double d = Double.MAX_VALUE;
        adi_2 adi_22 = null;
        Iterator iterator = ListInvoker.iterator(this.a);
        while (dz_0.c(iterator)) {
            adi_2 adi_23;
            adi_2 adi_24 = adi_23 = (adi_2)dz_0.b(iterator);
            double d2 = atn_0.b(adi_24.c, entityLivingBase);
            if (!(d2 <= d)) continue;
            adi_22 = adi_24;
            d = d2;
        }
        return adi_22.c;
    }

    public void e() {
        this.c = this.j;
    }

    public aY6 d(BlockPos blockPos) {
        if (amv_2.c(this.k, blockPos) > (double)(this.h * this.h)) {
            return null;
        }
        Iterator iterator = ListInvoker.iterator(this.i);
        while (dz_0.c(iterator)) {
            aY6 aY62 = (aY6)dz_0.b(iterator);
            if (amv_2.j(hH.g(aY62)) != amv_2.j(blockPos) || amv_2.i(hH.g(aY62)) != amv_2.i(blockPos) || MathInvoker.a(amv_2.h(hH.g(aY62)) - amv_2.h(blockPos)) > 1) continue;
            return aY62;
        }
        return null;
    }

    private boolean a(BlockPos blockPos, BlockPos blockPos2) {
        if (!aV8.a((IBlockAccess)this.f, amv_2.g(blockPos2))) {
            return false;
        }
        int n = amv_2.j(blockPos2) - amv_2.j(blockPos) / 2;
        int n2 = amv_2.i(blockPos2) - amv_2.i(blockPos) / 2;
        for (int i = n; i < n + amv_2.j(blockPos); ++i) {
            for (int j = amv_2.h(blockPos2); j < amv_2.h(blockPos2) + amv_2.h(blockPos); ++j) {
                for (int k = n2; k < n2 + amv_2.i(blockPos); ++k) {
                    if (!BlocksInvoker.x(BlockStateInvoker.getBlock(aV8.q(this.f, new BlockPos(i, j, k))))) continue;
                    return false;
                }
            }
        }
        return true;
    }

    public int b(String string) {
        Integer n = (Integer)atj_0.b(this.b, string);
        return P8.b(n);
    }

    private void j() {
        ListInvoker.size(this.i);
        this.k = new BlockPos(0, 0, 0);
        this.h = 0;
    }

    public void b(int n) {
        Iterator iterator = aS0.f(atj_0.a(this.b));
        while (dz_0.c(iterator)) {
            String string = (String)dz_0.b(iterator);
            this.a(string, n);
        }
    }

    public boolean n() {
        return ListInvoker.isEmpty(this.i);
    }

    public int k() {
        return this.e;
    }

    public int f() {
        return ListInvoker.size(this.i);
    }

    public aY6 b(BlockPos blockPos) {
        aY6 aY62 = null;
        int n = Integer.MAX_VALUE;
        Iterator iterator = ListInvoker.iterator(this.i);
        while (dz_0.c(iterator)) {
            aY6 aY63 = (aY6)dz_0.b(iterator);
            int n2 = hH.c(aY63, blockPos);
            if (n2 >= n) continue;
            aY62 = aY63;
            n = n2;
        }
        return aY62;
    }

    public void a(aY6 aY62) {
        ListInvoker.add(this.i, aY62);
        this.d = amv_2.a(this.d, (zl_2)hH.g(aY62));
        this.j();
        this.g = hH.c(aY62);
    }

    public boolean a(String string) {
        return this.b(string) <= -15;
    }

    public BlockPos m() {
        return this.k;
    }

    public void a(NBTTagCompound nBTTagCompound) {
        Object object;
        Object object2;
        tn_0.b(nBTTagCompound, x4_0.j, this.e);
        tn_0.b(nBTTagCompound, x4_0.B, this.h);
        tn_0.b(nBTTagCompound, x4_0.i, this.l);
        tn_0.b(nBTTagCompound, x4_0.H, this.g);
        tn_0.b(nBTTagCompound, x4_0.w, this.j);
        tn_0.b(nBTTagCompound, x4_0.D, this.c);
        tn_0.b(nBTTagCompound, x4_0.d, amv_2.j(this.k));
        tn_0.b(nBTTagCompound, x4_0.u, amv_2.h(this.k));
        tn_0.b(nBTTagCompound, x4_0.z, amv_2.i(this.k));
        tn_0.b(nBTTagCompound, x4_0.A, amv_2.j(this.d));
        tn_0.b(nBTTagCompound, x4_0.p, amv_2.h(this.d));
        tn_0.b(nBTTagCompound, x4_0.R, amv_2.i(this.d));
        NBTTagList nBTTagList = new NBTTagList();
        Object object3 = ListInvoker.iterator(this.i);
        while (dz_0.c((Iterator)object3)) {
            object2 = (aY6)dz_0.b((Iterator)object3);
            object = new NBTTagCompound();
            tn_0.b((NBTTagCompound)object, x4_0.Q, amv_2.j(hH.g((aY6)object2)));
            tn_0.b((NBTTagCompound)object, x4_0.s, amv_2.h(hH.g((aY6)object2)));
            tn_0.b((NBTTagCompound)object, x4_0.k, amv_2.i(hH.g((aY6)object2)));
            tn_0.b((NBTTagCompound)object, x4_0.n, hH.f((aY6)object2));
            tn_0.b((NBTTagCompound)object, x4_0.U, hH.b((aY6)object2));
            tn_0.b((NBTTagCompound)object, x4_0.m, hH.c((aY6)object2));
            kv_0.a(nBTTagList, (NBTBase)object);
        }
        tn_0.a(nBTTagCompound, x4_0.O, nBTTagList);
        object3 = new NBTTagList();
        object2 = aS0.f(atj_0.a(this.b));
        while (dz_0.c((Iterator)object2)) {
            object = (String)dz_0.b((Iterator)object2);
            NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
            PlayerProfileCache playerProfileCache = ServerInvoker.L(ServerInvoker.d());
            GameProfile gameProfile = aUu.a(playerProfileCache, (String)object);
            tn_0.a(nBTTagCompound2, x4_0.F, a4Z.a(gameProfile).toString());
            tn_0.b(nBTTagCompound2, x4_0.g, P8.b((Integer)atj_0.b(this.b, object)));
            kv_0.a((NBTTagList)object3, nBTTagCompound2);
        }
        tn_0.a(nBTTagCompound, x4_0.h, (NBTBase)object3);
    }

    private void d() {
        boolean bl = a5_0.a(this.f.o, 50) == 0;
        Iterator iterator = ListInvoker.iterator(this.i);
        while (dz_0.c(iterator)) {
            aY6 aY62 = (aY6)dz_0.b(iterator);
            hH.e(aY62);
            if (this.c(hH.g(aY62)) && MathInvoker.a(this.j - hH.c(aY62)) <= 1200) continue;
            this.d = amv_2.b(this.d, (zl_2)hH.g(aY62));
            hH.a(aY62, true);
            dz_0.a(iterator);
        }
        this.j();
    }

    private void g() {
        Iterator iterator = ListInvoker.iterator(this.a);
        while (dz_0.c(iterator)) {
            adi_2 adi_22 = (adi_2)dz_0.b(iterator);
            if (atn_0.J(adi_22.c) && MathInvoker.a(this.j - adi_22.b) <= 300) continue;
            dz_0.a(iterator);
        }
    }

    public aym_1(World world) {
        this.d = BlockPos.m;
        this.k = BlockPos.m;
        this.b = new TreeMap();
        this.a = my_0.c();
        this.f = world;
    }

    public boolean e(BlockPos blockPos) {
        return amv_2.c(this.k, blockPos) < (double)(this.h * this.h);
    }

    public List<aY6> a() {
        return this.i;
    }

    public aY6 a(BlockPos blockPos) {
        aY6 aY62 = null;
        int n = Integer.MAX_VALUE;
        Iterator iterator = ListInvoker.iterator(this.i);
        while (dz_0.c(iterator)) {
            aY6 aY63 = (aY6)dz_0.b(iterator);
            int n2 = hH.c(aY63, blockPos);
            n2 = n2 > 256 ? (n2 *= 1000) : hH.a(aY63);
            if (n2 >= n) continue;
            aY62 = aY63;
            n = n2;
        }
        return aY62;
    }

    public EntityPlayer a(EntityLivingBase entityLivingBase) {
        double d = Double.MAX_VALUE;
        EntityPlayer entityPlayer = null;
        Iterator iterator = aS0.f(atj_0.a(this.b));
        while (dz_0.c(iterator)) {
            EntityPlayer entityPlayer2;
            double d2;
            String string = (String)dz_0.b(iterator);
            if (!this.a(string) || !((d2 = a6w_0.b(entityPlayer2 = aV8.b(this.f, string), entityLivingBase)) <= d)) continue;
            entityPlayer = entityPlayer2;
            d = d2;
        }
        return entityPlayer;
    }

    public int a(String string, int n) {
        int n2 = this.b(string);
        int n3 = MathHelper.a(n2 + n, -30, 10);
        atj_0.a(this.b, string, P8.d(n3));
        return n3;
    }

    public boolean c() {
        return this.c == 0 || this.j - this.c >= 3600;
    }

    public void a(int n) {
        int n2;
        this.j = n;
        this.d();
        this.g();
        if (n % 20 == 0) {
            this.l();
        }
        if (n % 30 == 0) {
            this.b();
        }
        if (this.l < (n2 = this.e / 10) && ListInvoker.size(this.i) > 20 && a5_0.a(this.f.o, 7000) == 0) {
            Vec3 vec3 = this.a(this.k, 2, 4, 2);
            nf_2 nf_22 = new nf_2(this.f);
            avp_0.a(nf_22, vec3.xCoord, vec3.yCoord, vec3.zCoord);
            aV8.b(this.f, nf_22);
            ++this.l;
        }
    }

    public int i() {
        return this.j - this.g;
    }

    private boolean c(BlockPos blockPos) {
        Block block = BlockStateInvoker.getBlock(aV8.q(this.f, blockPos));
        return block instanceof g7_0 && BlocksInvoker.getBlockState(block) == Material.wood;
    }

    private void b() {
        List list = aV8.a(this.f, nf_2.class, new rm_2(amv_2.j(this.k) - this.h, amv_2.h(this.k) - 4, amv_2.i(this.k) - this.h, amv_2.j(this.k) + this.h, amv_2.h(this.k) + 4, amv_2.i(this.k) + this.h));
        this.l = ListInvoker.size(list);
    }

    public void a(World world) {
        this.f = world;
    }
}


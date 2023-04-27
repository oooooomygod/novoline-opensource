/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.NBTBase;
import deobf.NBTTagList;
import java.util.Iterator;
import java.util.List;

import net.minecraft.block.BlockPos;

public abstract class OP {
    private double b;
    private Entity d;
    private double c;
    private int j = 4;
    private int a = 4;
    private int e = 20;
    private List<cy_0> i;
    private int h = 200;
    private int f = 800;
    private String g = avb_0.o;
    private int k = 6;
    private cy_0 l;
    private int m = 16;

    public Entity a(World world) {
        if (this.d == null) {
            Entity entity = ub_1.a(this.f(), world);
            this.d = entity = this.a(entity, false);
        }
        return this.d;
    }

    public void a(NBTTagCompound nBTTagCompound) {
        String string = this.f();
        if (!aod_2.a(string)) {
            tn_0.a(nBTTagCompound, avb_0.E, string);
            tn_0.a(nBTTagCompound, avb_0.k, (short)this.e);
            tn_0.a(nBTTagCompound, avb_0.p, (short)this.h);
            tn_0.a(nBTTagCompound, avb_0.m, (short)this.f);
            tn_0.a(nBTTagCompound, avb_0.D, (short)this.j);
            tn_0.a(nBTTagCompound, avb_0.d, (short)this.k);
            tn_0.a(nBTTagCompound, avb_0.u, (short)this.m);
            tn_0.a(nBTTagCompound, avb_0.z, (short)this.a);
            if (this.i() != null) {
                tn_0.a(nBTTagCompound, avb_0.s, tn_0.a(cy_0.b(this.i())));
            }
            if (this.i() != null || !ListInvoker.isEmpty(this.i)) {
                NBTTagList nBTTagList = new NBTTagList();
                if (!ListInvoker.isEmpty(this.i)) {
                    Iterator iterator = ListInvoker.iterator(this.i);
                    while (dz_0.c(iterator)) {
                        cy_0 cy_02 = (cy_0)dz_0.b(iterator);
                        kv_0.a(nBTTagList, kn_2.a(cy_02));
                    }
                } else {
                    kv_0.a(nBTTagList, kn_2.a(this.i()));
                }
                tn_0.a(nBTTagCompound, avb_0.i, nBTTagList);
            }
        }
    }

    public double h() {
        return this.c;
    }

    public void e() {
        if (this.b()) {
            BlockPos blockPos = this.d();
            if (this.c().isRemote) {
                double d = (float)amv_2.j(blockPos) + a5_0.e(this.c().o);
                double d2 = (float)amv_2.h(blockPos) + a5_0.e(this.c().o);
                double d3 = (float)amv_2.i(blockPos) + a5_0.e(this.c().o);
                aV8.a(this.c(), B7.SMOKE_NORMAL, d, d2, d3, 0.0, 0.0, 0.0, new int[0]);
                aV8.a(this.c(), B7.FLAME, d, d2, d3, 0.0, 0.0, 0.0, new int[0]);
                if (this.e > 0) {
                    --this.e;
                }
                this.c = this.b;
                this.b = (this.b + (double)(1000.0f / ((float)this.e + 200.0f))) % 360.0;
            } else {
                if (this.e == -1) {
                    this.g();
                }
                if (this.e > 0) {
                    --this.e;
                    return;
                }
                boolean bl = false;
                int n = 0;
                if (n < this.j) {
                    Entity entity = ub_1.a(this.f(), this.c());
                    return;
                }
                this.g();
            }
        }
    }

    public void a(String string) {
        this.g = string;
    }

    public void a(cy_0 cy_02) {
        this.l = cy_02;
    }

    private void g() {
        if (this.f <= this.h) {
            this.e = this.h;
        } else {
            int n = this.f - this.h;
            this.e = this.h + a5_0.a(this.c().o, n);
        }
        if (!ListInvoker.isEmpty(this.i)) {
            this.a((cy_0)mp_1.a(this.c().o, this.i));
        }
        this.a(1);
    }

    public void b(NBTTagCompound nBTTagCompound) {
        this.g = tn_0.m(nBTTagCompound, avb_0.y);
        this.e = tn_0.o(nBTTagCompound, avb_0.v);
        ListInvoker.clear(this.i);
        if (tn_0.a(nBTTagCompound, avb_0.C, 9)) {
            NBTTagList nBTTagList = tn_0.c(nBTTagCompound, avb_0.l, 10);
            for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
                ListInvoker.add(this.i, new cy_0(this, kv_0.g(nBTTagList, i)));
            }
        }
        if (tn_0.a(nBTTagCompound, avb_0.h, 10)) {
            this.a(new cy_0(this, tn_0.d(nBTTagCompound, avb_0.B), this.g));
        } else {
            this.a((cy_0)null);
        }
        if (tn_0.a(nBTTagCompound, avb_0.q, 99)) {
            this.h = tn_0.o(nBTTagCompound, avb_0.x);
            this.f = tn_0.o(nBTTagCompound, avb_0.t);
            this.j = tn_0.o(nBTTagCompound, avb_0.j);
        }
        if (tn_0.a(nBTTagCompound, avb_0.a, 99)) {
            this.k = tn_0.o(nBTTagCompound, avb_0.r);
            this.m = tn_0.o(nBTTagCompound, avb_0.g);
        }
        if (tn_0.a(nBTTagCompound, avb_0.f, 99)) {
            this.a = tn_0.o(nBTTagCompound, avb_0.b);
        }
        if (this.c() != null) {
            this.d = null;
        }
    }

    public abstract BlockPos d();

    private String f() {
        if (this.i() == null) {
            if (this.g != null && this.g.equals(avb_0.c)) {
                this.g = avb_0.A;
            }
            return this.g;
        }
        return cy_0.a(this.i());
    }

    private cy_0 i() {
        return this.l;
    }

    public boolean b(int n) {
        if (n == 1 && this.c().isRemote) {
            this.e = this.h;
            return true;
        }
        return false;
    }

    public abstract void a(int var1);

    private boolean b() {
        BlockPos blockPos = this.d();
        return aV8.a(this.c(), (double)amv_2.j(blockPos) + 0.5, (double)amv_2.h(blockPos) + 0.5, (double)amv_2.i(blockPos) + 0.5, (double)this.m);
    }

    public abstract World c();

    public OP() {
        this.i = my_0.c();
    }

    public double a() {
        return this.b;
    }

    private Entity a(Entity entity, boolean bl) {
        if (this.i() != null) {
            Object object;
            Object object2;
            Object object3 = new NBTTagCompound();
            ayj_0.d(entity, (NBTTagCompound)object3);
            Object object4 = aS0.f(tn_0.c(cy_0.b(this.i())));
            while (dz_0.c((Iterator)object4)) {
                object2 = (String)dz_0.b((Iterator)object4);
                object = tn_0.h(cy_0.b(this.i()), (String)object2);
                tn_0.a((NBTTagCompound)object3, (String)object2, a5N.a((NBTBase)object));
            }
            entity.e((NBTTagCompound)object3);
            if (entity.worldObj != null) {
                aV8.b(entity.worldObj, entity);
            }
            object2 = entity;
            while (tn_0.a((NBTTagCompound)object3, avb_0.e, 10)) {
                object4 = tn_0.d((NBTTagCompound)object3, avb_0.w);
                object = ub_1.a(tn_0.m((NBTTagCompound)object4, avb_0.n), entity.worldObj);
                NBTTagCompound nBTTagCompound = new NBTTagCompound();
                ayj_0.d((Entity)object, nBTTagCompound);
                Iterator iterator = aS0.f(tn_0.c((NBTTagCompound)object4));
                while (dz_0.c(iterator)) {
                    String string = (String)dz_0.b(iterator);
                    NBTBase nBTBase = tn_0.h((NBTTagCompound)object4, string);
                    tn_0.a(nBTTagCompound, string, a5N.a(nBTBase));
                }
                ((Entity)object).e(nBTTagCompound);
                ayj_0.b((Entity)object, ((Entity)object2).posX, ((Entity)object2).posY, ((Entity)object2).posZ, ((Entity)object2).rotationYaw, ((Entity)object2).rotationPitch);
                if (entity.worldObj != null) {
                    aV8.b(entity.worldObj, (Entity)object);
                }
                ayj_0.b((Entity)object2, (Entity)object);
                object2 = object;
                object3 = object4;
            }
        } else if (entity instanceof EntityLivingBase && entity.worldObj != null) {
            if (entity instanceof nl_1) {
                CG.a((nl_1)entity, aV8.b(entity.worldObj, new BlockPos(entity)), null);
            }
            aV8.b(entity.worldObj, entity);
        }
        return entity;
    }
}


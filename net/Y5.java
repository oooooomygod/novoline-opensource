/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.IChatComponent;
import net.minecraft.item.ItemStack;
import java.util.Iterator;
import java.util.List;

public class Y5 {
    private int g;
    private List<aAJ> f = my_0.c();
    private boolean b;
    private int c;
    private boolean d;
    private int h;
    private String a;
    private EntityLivingBase e;

    public void c() {
        this.d();
        if (atn_0.E(this.e)) {
            Block block = BlockStateInvoker.getBlock(aV8.q(this.e.worldObj, new BlockPos(this.e.posX, atn_0.i((EntityLivingBase)this.e).a, this.e.posZ)));
            if (block == Blocks.bm) {
                this.a = aj1.a;
            } else if (block == Blocks.as) {
                this.a = aj1.h;
            }
        } else if (atn_0.x(this.e)) {
            this.a = aj1.k;
        }
    }

    private void d() {
        this.a = null;
    }

    public int h() {
        return this.d ? this.e.ticksExisted - this.h : this.c - this.h;
    }

    public EntityLivingBase f() {
        return this.e;
    }

    public void b() {
        int n;
        int n2 = n = this.d ? 300 : 100;
        if (this.b && (!atn_0.J(this.e) || this.e.ticksExisted - this.g > n)) {
            this.b = false;
            this.d = false;
            this.c = this.e.ticksExisted;
            atn_0.I(this.e);
            ListInvoker.clear(this.f);
        }
    }

    private String a(aAJ aAJ2) {
        return zu_2.f(aAJ2) == null ? aj1.e : zu_2.f(aAJ2);
    }

    public IChatComponent a() {
        IChatComponent iChatComponent;
        if (ListInvoker.isEmpty(this.f)) {
            return new aoz_1(aj1.i, atn_0.C(this.e));
        }
        aAJ aAJ2 = this.g();
        aAJ aAJ3 = (aAJ)ListInvoker.get(this.f, ListInvoker.size(this.f) - 1);
        IChatComponent iChatComponent2 = zu_2.b(aAJ3);
        Entity entity = aDJ.d(zu_2.a(aAJ3));
        if (zu_2.a(aAJ3) == DamageSource.n) {
            IChatComponent iChatComponent3 = zu_2.b(aAJ2);
            if (zu_2.a(aAJ2) != DamageSource.n && zu_2.a(aAJ2) != DamageSource.m) {
                if (!iChatComponent3.equals(iChatComponent2)) {
                    ItemStack itemStack;
                    Entity entity2 = aDJ.d(zu_2.a(aAJ2));
                    ItemStack itemStack2 = itemStack = entity2 instanceof EntityLivingBase ? atn_0.z((EntityLivingBase)entity2) : null;
                    iChatComponent = act_2.g(itemStack) ? new aoz_1(aj1.j, atn_0.C(this.e), iChatComponent3, act_2.B(itemStack)) : new aoz_1(aj1.c, atn_0.C(this.e), iChatComponent3);
                } else {
                    ItemStack itemStack;
                    ItemStack itemStack3 = itemStack = entity instanceof EntityLivingBase ? atn_0.z((EntityLivingBase)entity) : null;
                    iChatComponent = act_2.g(itemStack) ? new aoz_1(aj1.b, atn_0.C(this.e), iChatComponent2, act_2.B(itemStack)) : new aoz_1(aj1.d, atn_0.C(this.e), iChatComponent2);
                }
            } else {
                iChatComponent = new aoz_1(aL0.a(aL0.a(new StringBuilder(), aj1.g), this.a(aAJ2)).toString(), atn_0.C(this.e));
            }
        } else {
            iChatComponent = aDJ.a(zu_2.a(aAJ3), this.e);
        }
        return iChatComponent;
    }

    public Y5(EntityLivingBase entityLivingBase) {
        this.e = entityLivingBase;
    }

    public EntityLivingBase e() {
        EntityPlayer entityPlayer = null;
        float f = 0.0f;
        float f2 = 0.0f;
        Iterator iterator = ListInvoker.iterator(this.f);
        while (dz_0.c(iterator)) {
            aAJ aAJ2 = (aAJ)dz_0.b(iterator);
            if (aDJ.d(zu_2.a(aAJ2)) instanceof EntityPlayer && zu_2.d(aAJ2) > f2) {
                f2 = zu_2.d(aAJ2);
                entityPlayer = (EntityPlayer)aDJ.d(zu_2.a(aAJ2));
            }
            if (!(aDJ.d(zu_2.a(aAJ2)) instanceof EntityLivingBase) || !(zu_2.d(aAJ2) > f)) continue;
            f = zu_2.d(aAJ2);
            EntityLivingBase cfr_ignored_1 = (EntityLivingBase)aDJ.d(zu_2.a(aAJ2));
        }
        float f3 = f2 - f / 3.0f;
        int cfr_ignored_2 = f3 == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1);
        return entityPlayer;
    }

    private aAJ g() {
        boolean bl = false;
        float f = 0.0f;
        for (int i = 0; i < ListInvoker.size(this.f); ++i) {
            aAJ aAJ2 = (aAJ)ListInvoker.get(this.f, i);
            aAJ aAJ3 = (aAJ)ListInvoker.get(this.f, i - 1);
            if ((zu_2.a(aAJ2) == DamageSource.n || zu_2.a(aAJ2) == DamageSource.m) && zu_2.c(aAJ2) > 0.0f && zu_2.c(aAJ2) > f) {
                f = zu_2.c(aAJ2);
            }
            if (zu_2.f(aAJ2) != null && !(zu_2.d(aAJ2) > (float)bl)) continue;
        }
        float f2 = f - 5.0f;
        int cfr_ignored_1 = f2 == 0.0f ? 0 : (f2 > 0.0f ? 1 : -1);
        return null;
    }

    public void a(DamageSource damageSource, float f, float f2) {
        this.b();
        this.c();
        aAJ aAJ2 = new aAJ(damageSource, this.e.ticksExisted, f, f2, this.a, this.e.fallDistance);
        ListInvoker.add(this.f, aAJ2);
        this.g = this.e.ticksExisted;
        this.b = true;
        if (zu_2.e(aAJ2) && !this.d && atn_0.J(this.e)) {
            this.d = true;
            this.c = this.h = this.e.ticksExisted;
            atn_0.H(this.e);
        }
    }
}


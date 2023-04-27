/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityLivingBase;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.yW
 */
public class yw_1
extends yl_2 {
    public int G;
    private static String[] H = new String[]{dh_1.b, dh_1.a, dh_1.c};
    private static int[] J = new int[]{1, 5, 5};
    private static int[] K;
    private static int[] I;

    @Override
    public int a(int n) {
        return J[this.G] + (n - 1) * I[this.G];
    }

    @Override
    public void b(EntityLivingBase entityLivingBase, Entity entity, int n) {
        if (entity instanceof EntityLivingBase) {
            EntityLivingBase entityLivingBase2 = (EntityLivingBase)entity;
            if (this.G == 2 && atn_0.A(entityLivingBase2) == aH2.ARTHROPOD) {
                int n2 = 20 + a5_0.a(atn_0.v(entityLivingBase), 10 * n);
                atn_0.a(entityLivingBase2, new a2l_0(ari_0.f(Potion.moveSlowdown), n2, 3));
            }
        }
    }

    @Override
    public float a(int n, aH2 aH22) {
        return this.G == 0 ? (float)n * 1.25f : (this.G == 1 && aH22 == aH2.UNDEAD ? (float)n * 2.5f : (this.G == 2 && aH22 == aH2.ARTHROPOD ? (float)n * 2.5f : 0.0f));
    }

    @Override
    public int d(int n) {
        return this.a(n) + K[this.G];
    }

    public yw_1(int n, ResourceLocation resourceLocation, int n2, int n3) {
        super(n, resourceLocation, n2, b_0.WEAPON);
        this.G = n3;
    }

    @Override
    public boolean a(ItemStack itemStack) {
        return act_2.k(itemStack) instanceof ls_0 || super.a(itemStack);
    }

    @Override
    public int c() {
        return 5;
    }

    static {
        I = new int[]{11, 8, 8};
        K = new int[]{20, 20, 20};
    }

    @Override
    public boolean a(yl_2 yl_22) {
        return !(yl_22 instanceof yw_1);
    }

    @Override
    public String d() {
        return aL0.a(aL0.a(new StringBuilder(), dh_1.d), H[this.G]).toString();
    }
}


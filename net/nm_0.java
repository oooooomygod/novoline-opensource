/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/*
 * Renamed from net.nm
 */
public class nm_0
extends ne_2
implements a1l {
    private static UUID bH = awc_1.a(TV.b);
    private static AttributeModifier bK = ow_0.a(new AttributeModifier(bH, TV.a, -0.25, 0), false);
    private static Item[] bJ = new Item[]{Items.glowstone_dust, Items.sugar, Items.redstone, Items.spider_eye, Items.glass_bottle, Items.gunpowder, Items.stick, Items.stick};
    private int bI;

    @Override
    protected String ac() {
        return null;
    }

    @Override
    public void a(EntityLivingBase entityLivingBase, float f) {
        if (!this.u()) {
            of_2 of_22 = new of_2(this.worldObj, (EntityLivingBase)this, 32732);
            double d = entityLivingBase.posY + (double)entityLivingBase.w() - (double)1.1f;
            of_22.rotationPitch -= -20.0f;
            double d2 = entityLivingBase.posX + entityLivingBase.motionX - this.posX;
            double d3 = d - this.posY;
            double d4 = entityLivingBase.posZ + entityLivingBase.motionZ - this.posZ;
            float f2 = MathHelper.e(d2 * d2 + d4 * d4);
            if (f2 >= 8.0f && !entityLivingBase.isPotionActive(Potion.moveSlowdown)) {
                yd_0.a(of_22, 32698);
            } else if (entityLivingBase.a() >= 8.0f && !entityLivingBase.isPotionActive(Potion.poison)) {
                yd_0.a(of_22, 32660);
            } else if (f2 <= 3.0f && !entityLivingBase.isPotionActive(Potion.weakness) && a5_0.e(this.Q) < 0.25f) {
                yd_0.a(of_22, 32696);
            }
            yd_0.a(of_22, d2, d3 + (double)(f2 * 0.2f), d4, 0.75f, 8.0f);
            aV8.b(this.worldObj, of_22);
        }
    }

    @Override
    protected String d() {
        return null;
    }

    public nm_0(World world) {
        super(world);
        this.c(0.6f, 1.95f);
        aMS.a(this.bx, 1, new _X(this));
        aMS.a(this.bx, 2, new _V(this, 1.0, 60, 10.0f));
        aMS.a(this.bx, 2, new _J(this, 1.0));
        aMS.a(this.bx, 3, new aly_2(this, EntityPlayer.class, 8.0f));
        aMS.a(this.bx, 3, new _A(this));
        aMS.a(this.bv, 1, new _9((nu_1)this, false, new Class[0]));
        aMS.a(this.bv, 2, new _m_0<EntityPlayer>((nu_1)this, EntityPlayer.class, true));
    }

    @Override
    protected void g() {
        super.g();
        aom_0.a(this.t(), 21, axt_2.a((byte)0));
    }

    @Override
    protected void H() {
        super.H();
        Ma.a(this.a(abb_0.b), 26.0);
        Ma.a(this.a(abb_0.e), 0.25);
    }

    public void k(boolean bl) {
        aom_0.b(this.t(), 21, axt_2.a((byte)1));
    }

    @Override
    protected String C() {
        return null;
    }

    @Override
    protected void b(boolean bl, int n) {
        int n2 = a5_0.a(this.Q, 3) + 1;
        for (int i = 0; i < n2; ++i) {
            int n3 = a5_0.a(this.Q, 3);
            Item item = bJ[a5_0.a(this.Q, bJ.length)];
            n3 += a5_0.a(this.Q, n + 1);
            for (int j = 0; j < n3; ++j) {
                this.a(item, 1);
            }
        }
    }

    public boolean u() {
        return aom_0.g(this.t(), 21) == 1;
    }

    @Override
    public void onLivingUpdate() {
        if (!this.worldObj.isRemote) {
            if (this.u()) {
                if (this.bI-- <= 0) {
                    this.k(false);
                    ItemStack itemStack = this.ah();
                    this.c(0, null);
                    if (act_2.k(itemStack) == Items.potionitem) {
                        List list = en_2.a(Items.potionitem, itemStack);
                        Iterator iterator = ListInvoker.iterator(list);
                        while (dz_0.c(iterator)) {
                            a2l_0 a2l_02 = (a2l_0)dz_0.b(iterator);
                            this.a(new a2l_0(a2l_02));
                        }
                    }
                    Ma.b(this.a(abb_0.e), bK);
                }
            } else {
                int n = -1;
                if (a5_0.e(this.Q) < 0.15f && this.isInsideOfMaterial(Material.M) && !this.isPotionActive(Potion.waterBreathing)) {
                    n = 8237;
                } else if (a5_0.e(this.Q) < 0.15f && this.ag() && !this.isPotionActive(Potion.fireResistance)) {
                    n = 16307;
                } else if (a5_0.e(this.Q) < 0.05f && this.a() < this.b()) {
                    n = 16341;
                } else if (a5_0.e(this.Q) < 0.25f && this.ak() != null && !this.isPotionActive(Potion.moveSpeed) && this.ak().g(this) > 121.0) {
                    n = 16274;
                } else if (a5_0.e(this.Q) < 0.25f && this.ak() != null && !this.isPotionActive(Potion.moveSpeed) && this.ak().g(this) > 121.0) {
                    n = 16274;
                }
            }
            if (a5_0.e(this.Q) < 7.5E-4f) {
                aV8.a(this.worldObj, (Entity)this, (byte)15);
            }
        }
        super.onLivingUpdate();
    }

    @Override
    public void a(byte by) {
        if (by == 15) {
            for (int i = 0; i < a5_0.a(this.Q, 35) + 10; ++i) {
                aV8.a(this.worldObj, B7.SPELL_WITCH, this.posX + a5_0.f(this.Q) * (double)0.13f, this.getEntityBoundingBox().c + 0.5 + a5_0.f(this.Q) * (double)0.13f, this.posZ + a5_0.f(this.Q) * (double)0.13f, 0.0, 0.0, 0.0, new int[0]);
            }
        } else {
            super.a(by);
        }
    }

    @Override
    protected float a(DamageSource damageSource, float f) {
        f = super.a(damageSource, f);
        if (aDJ.d(damageSource) == this) {
            f = 0.0f;
        }
        if (aDJ.b(damageSource)) {
            f = (float)((double)f * 0.15);
        }
        return f;
    }

    @Override
    public float w() {
        return 1.62f;
    }
}


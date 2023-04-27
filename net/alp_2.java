/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;

/*
 * Renamed from net.alp
 */
public class alp_2
extends alj_2 {
    private int h;
    private nz_0 i;

    @Override
    public void d() {
        super.d();
        if (this.h > 0) {
            wu_0 wu_02;
            int n;
            --this.h;
            if (this.h == 0 && (n = 0) < ajs_0.a(wu_02 = ayh_1.b(this.i))) {
                ItemStack itemStack = ajs_0.a(wu_02, n);
                ItemStack itemStack2 = null;
                Item item = act_2.k(itemStack);
                if ((item == Items.bread || item == Items.potato || item == Items.carrot) && itemStack.a > 3) {
                    int n2 = itemStack.a / 2;
                    itemStack.a -= n2;
                    itemStack2 = new ItemStack(item, n2, act_2.c(itemStack));
                } else if (item == Items.wheat && itemStack.a > 5) {
                    int n3 = itemStack.a / 2 / 3 * 3;
                    int n4 = n3 / 3;
                    itemStack.a -= n3;
                    itemStack2 = new ItemStack(Items.bread, n4, 0);
                }
                if (itemStack.a <= 0) {
                    ajs_0.a(wu_02, n, null);
                }
                double d = this.i.posY - (double)0.3f + (double)ayh_1.i(this.i);
                og_0 og_02 = new og_0(this.i.worldObj, this.i.posX, d, this.i.posZ, itemStack2);
                float f = 0.3f;
                float f2 = this.i.aP;
                float f3 = this.i.rotationPitch;
                og_02.motionX = -MathHelper.sin(f2 / 180.0f * (float)Math.PI) * MathHelper.cos(f3 / 180.0f * (float)Math.PI) * f;
                og_02.motionZ = MathHelper.cos(f2 / 180.0f * (float)Math.PI) * MathHelper.cos(f3 / 180.0f * (float)Math.PI) * f;
                og_02.motionY = -MathHelper.sin(f3 / 180.0f * (float)Math.PI) * f + 0.1f;
                aec_0.b(og_02);
                aV8.b(this.i.worldObj, og_02);
            }
        }
    }

    public alp_2(nz_0 nz_02) {
        super(nz_02, nz_0.class, 3.0f, 0.02f);
        this.i = nz_02;
    }

    @Override
    public void b() {
        super.b();
        this.h = ayh_1.f(this.i) && this.d instanceof nz_0 && ayh_1.g((nz_0)this.d) ? 10 : 0;
    }
}


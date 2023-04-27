/*
 * Decompiled with CFR 0.152.
 */
package deobf;

import deobf.EntityLivingBase;
import net.Potion;
import net.ResourceLocation;
import net.VO;
import net.atn_0;

public class PotionAbsorption
extends Potion {
    protected PotionAbsorption(int n, ResourceLocation resourceLocation, boolean bl, int n2) {
        super(n, resourceLocation, bl, n2);
    }

    @Override
    public void b(EntityLivingBase entityLivingBase, VO vO, int n) {
        atn_0.c(entityLivingBase, atn_0.j(entityLivingBase) - (float)(4 * (n + 1)));
        super.b(entityLivingBase, vO, n);
    }

    @Override
    public void a(EntityLivingBase entityLivingBase, VO vO, int n) {
        atn_0.c(entityLivingBase, atn_0.j(entityLivingBase) + (float)(4 * (n + 1)));
        super.a(entityLivingBase, vO, n);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityLivingBase;
import net.a5Y;
import net.au_1;
import net.ne_1;
import net.rg_1;
import net.up_0;

/*
 * Renamed from net.rF
 */
public class rf_1
extends rg_1 {
    private float p;

    public rf_1() {
        super(12, 0.0f);
        this.m = new a5Y(this, 0, 0);
        up_0.a(this.m, -3.0f, -4.0f, -6.0f, 6, 6, 8, 0.0f);
        up_0.a(this.m, 0.0f, 6.0f, -8.0f);
        this.k = new a5Y(this, 28, 8);
        up_0.a(this.k, -4.0f, -10.0f, -7.0f, 8, 16, 6, 0.0f);
        up_0.a(this.k, 0.0f, 5.0f, 2.0f);
    }

    @Override
    public void a(EntityLivingBase entityLivingBase, float f, float f2, float f3) {
        super.a(entityLivingBase, f, f2, f3);
        this.m.o = 6.0f + au_1.a((ne_1)entityLivingBase, f3) * 9.0f;
        this.p = au_1.b((ne_1)entityLivingBase, f3);
    }

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, Entity entity) {
        super.a(f, f2, f3, f4, f5, f6, entity);
        this.m.t = this.p;
    }
}


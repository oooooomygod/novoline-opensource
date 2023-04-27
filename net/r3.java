/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityLivingBase;
import net.a5Y;
import net.nM;
import net.ru_1;
import net.st_1;
import net.up_0;

public class r3
extends ru_1 {
    @Override
    public void a(EntityLivingBase entityLivingBase, float f, float f2, float f3) {
        this.i = st_1.a((nM)entityLivingBase) == 1;
        super.a(entityLivingBase, f, f2, f3);
    }

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, Entity entity) {
        super.a(f, f2, f3, f4, f5, f6, entity);
    }

    public r3(float f, boolean bl) {
        super(f, 0.0f, 64, 32);
        this.h = new a5Y(this, 40, 16);
        up_0.a(this.h, -1.0f, -2.0f, -1.0f, 2, 12, 2, f);
        up_0.a(this.h, -5.0f, 2.0f, 0.0f);
        this.j = new a5Y(this, 40, 16);
        this.j.x = true;
        up_0.a(this.j, -1.0f, -2.0f, -1.0f, 2, 12, 2, f);
        up_0.a(this.j, 5.0f, 2.0f, 0.0f);
        this.l = new a5Y(this, 0, 16);
        up_0.a(this.l, -1.0f, 0.0f, -1.0f, 2, 12, 2, f);
        up_0.a(this.l, -2.0f, 12.0f, 0.0f);
        this.o = new a5Y(this, 0, 16);
        this.o.x = true;
        up_0.a(this.o, -1.0f, 0.0f, -1.0f, 2, 12, 2, f);
        up_0.a(this.o, 2.0f, 12.0f, 0.0f);
    }

    public r3() {
        this(0.0f, false);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.init.Blocks;
import deobf.EntityPlayer;
import deobf.ITickable;
import deobf.TileEntity;

public class a6R
extends TileEntity
implements ITickable {
    public int i;
    private int l;
    public float j;
    public float k;

    @Override
    public void e() {
        this.j();
        super.e();
    }

    public void c() {
        --this.i;
        aV8.b(this.e, this.g, Blocks.g, 1, this.i);
    }

    public void a() {
        ++this.i;
        aV8.b(this.e, this.g, Blocks.g, 1, this.i);
    }

    public boolean a(EntityPlayer entityPlayer) {
        return aV8.z(this.e, this.g) == this && entityPlayer.d((double)amv_2.j(this.g) + 0.5, (double)amv_2.h(this.g) + 0.5, (double)amv_2.i(this.g) + 0.5) <= 64.0;
    }

    @Override
    public void b() {
        double d;
        if (++this.l % 20 * 4 == 0) {
            aV8.b(this.e, this.g, Blocks.g, 1, this.i);
        }
        this.k = this.j;
        int n = amv_2.j(this.g);
        int n2 = amv_2.h(this.g);
        int n3 = amv_2.i(this.g);
        float f = 0.1f;
        if (this.i > 0 && this.j == 0.0f) {
            double d2 = (double)n + 0.5;
            d = (double)n3 + 0.5;
            aV8.a(this.e, d2, (double)n2 + 0.5, d, aep_2.b, 0.5f, a5_0.e(this.e.o) * 0.1f + 0.9f);
        }
        if (this.i == 0 && this.j > 0.0f || this.i > 0 && this.j < 1.0f) {
            float f2;
            float f3 = this.j;
            this.j = this.i > 0 ? (this.j += f) : (this.j -= f);
            if (this.j > 1.0f) {
                this.j = 1.0f;
            }
            if (this.j < (f2 = 0.5f) && f3 >= f2) {
                d = (double)n + 0.5;
                double d3 = (double)n3 + 0.5;
                aV8.a(this.e, d, (double)n2 + 0.5, d3, aep_2.a, 0.5f, a5_0.e(this.e.o) * 0.1f + 0.9f);
            }
            if (this.j < 0.0f) {
                this.j = 0.0f;
            }
        }
    }

    @Override
    public boolean a(int n, int n2) {
        if (n == 1) {
            this.i = n2;
            return true;
        }
        return super.a(n, n2);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.client.Minecraft;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.aiJ
 */
public abstract class aij_1
extends aiy_1 {
    public abstract avh_2 a(int var1);

    @Override
    protected void a(int n, int n2, int n3) {
        FI.a(this.a(n), n, n2, n3);
    }

    public boolean a(int n, int n2, int n3) {
        if (this.d(n2)) {
            int n4 = this.d(n, n2);
            int n5 = this.i + this.r / 2 - this.d() / 2 + 2;
            int n6 = this.l + 4 - this.k() + n4 * this.m + this.u;
            int n7 = n - n5;
            int n8 = n2 - n6;
            if (FI.a(this.a(n4), n4, n, n2, n3, n7, n8)) {
                this.b(false);
                return true;
            }
        }
        return false;
    }

    @Override
    protected void a(int n, boolean bl, int n2, int n3) {
    }

    public aij_1(Minecraft minecraft, int n, int n2, int n3, int n4, int n5) {
        super(minecraft, n, n2, n3, n4, n5);
    }

    @Override
    protected void a() {
    }

    @Override
    protected void a(int n, int n2, int n3, int n4, int n5, int n6) {
        FI.a(this.a(n), n, n2, n3, this.d(), n4, n5, n6, this.d(n5, n6) == n);
    }

    public boolean b(int n, int n2, int n3) {
        for (int i = 0; i < this.f(); ++i) {
            int n4 = this.i + this.r / 2 - this.d() / 2 + 2;
            int n5 = this.l + 4 - this.k() + i * this.m + this.u;
            int n6 = n - n4;
            int n7 = n2 - n5;
            FI.b(this.a(i), i, n, n2, n3, n6, n7);
        }
        this.b(true);
        return false;
    }

    @Override
    protected boolean c(int n) {
        return false;
    }
}


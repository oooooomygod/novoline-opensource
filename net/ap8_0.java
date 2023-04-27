/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.IBlockAccess;
import net.IntHashMap;
import net.MathHelper;
import net.a8a_0;
import net.aQP;
import net.axw_0;

/*
 * Renamed from net.ap8
 */
public abstract class ap8_0 {
    protected IBlockAccess d;
    protected int b;
    protected int c;
    protected IntHashMap<aQP> e = new IntHashMap();
    protected int a;

    public abstract int a(aQP[] var1, Entity var2, aQP var3, aQP var4, float var5);

    protected aQP a(int n, int n2, int n3) {
        int n4 = axw_0.a(n, n2, n3);
        aQP aQP2 = (aQP)a8a_0.c(this.e, n4);
        aQP2 = new aQP(n, n2, n3);
        a8a_0.a(this.e, n4, aQP2);
        return aQP2;
    }

    public void a() {
    }

    public abstract aQP a(Entity var1);

    public void a(IBlockAccess iBlockAccess, Entity entity) {
        this.d = iBlockAccess;
        a8a_0.a(this.e);
        this.b = MathHelper.f(entity.width + 1.0f);
        this.c = MathHelper.f(entity.n + 1.0f);
        this.a = MathHelper.f(entity.width + 1.0f);
    }

    public abstract aQP a(Entity var1, double var2, double var4, double var6);
}


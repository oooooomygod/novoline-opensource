/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import deobf.EntityLivingBase;
import net.NBTTagCompound;
import net.Potion;
import net.aL0;
import net.ame_2;
import net.ari_0;
import net.tn_0;
import org.apache.logging.log4j.Logger;

/*
 * Renamed from net.a2l
 */
public class a2l_0 {
    private boolean b;
    public double g;
    private int c;
    private static Logger l = LogManagerInvoker.c();
    private boolean e;
    private int j;
    public double i;
    public double a;
    private boolean h;
    private boolean k;
    private int d;
    public double f;

    public static a2l_0 a(NBTTagCompound nBTTagCompound) {
        byte by = tn_0.e(nBTTagCompound, ame_2.h);
        if (by < Potion.potionTypes.length && Potion.potionTypes[by] != null) {
            byte by2 = tn_0.e(nBTTagCompound, ame_2.b);
            int n = tn_0.g(nBTTagCompound, ame_2.t);
            boolean bl = tn_0.c(nBTTagCompound, ame_2.k);
            boolean bl2 = true;
            if (tn_0.a(nBTTagCompound, ame_2.m, 1)) {
                bl2 = tn_0.c(nBTTagCompound, ame_2.e);
            }
            return new a2l_0(by, n, by2, bl, bl2);
        }
        return null;
    }

    public void b(boolean bl) {
        this.k = bl;
    }

    public boolean equals(Object object) {
        if (!(object instanceof a2l_0)) {
            return false;
        }
        a2l_0 a2l_02 = (a2l_0)object;
        return this.d == a2l_02.d && this.j == a2l_02.j && this.c == a2l_02.c && this.h == a2l_02.h && this.b == a2l_02.b;
    }

    public void c(boolean bl) {
        this.e = bl;
    }

    public int f() {
        return this.d;
    }

    public boolean a(EntityLivingBase entityLivingBase) {
        if (this.c > 0) {
            if (ari_0.a(Potion.potionTypes[this.d], this.c, this.j)) {
                this.b(entityLivingBase);
            }
            this.a();
        }
        return this.c > 0;
    }

    public boolean e() {
        return this.e;
    }

    private void a() {
        --this.c;
    }

    public a2l_0(int n, int n2, int n3, boolean bl, boolean bl2) {
        this.d = n;
        this.c = n2;
        this.j = n3;
        this.b = bl;
        this.k = bl2;
    }

    public void a(boolean bl) {
        this.h = bl;
    }

    public int hashCode() {
        return this.d;
    }

    public a2l_0(int n, int n2) {
        this(n, n2, 0);
    }

    public String c() {
        return ari_0.d(Potion.potionTypes[this.d]);
    }

    public boolean g() {
        return this.b;
    }

    public int b() {
        return this.j;
    }

    public String toString() {
        String string = ame_2.r;
        string = this.b() > 0 ? aL0.c(aL0.a(aL0.c(aL0.a(aL0.a(new StringBuilder(), this.c()), ame_2.d), this.b() + 1), ame_2.j), this.d()).toString() : aL0.c(aL0.a(aL0.a(new StringBuilder(), this.c()), ame_2.o), this.d()).toString();
        if (this.h) {
            string = aL0.a(aL0.a(new StringBuilder(), string), ame_2.g).toString();
        }
        if (!this.k) {
            string = aL0.a(aL0.a(new StringBuilder(), string), ame_2.s).toString();
        }
        return ari_0.g(Potion.potionTypes[this.d]) ? aL0.a(aL0.a(aL0.a(new StringBuilder(), ame_2.q), string), ame_2.a).toString() : string;
    }

    public a2l_0(a2l_0 a2l_02) {
        this.d = a2l_02.d;
        this.c = a2l_02.c;
        this.j = a2l_02.j;
        this.b = a2l_02.b;
        this.k = a2l_02.k;
    }

    public void a(a2l_0 a2l_02) {
        if (this.d != a2l_02.d) {
            LoggerInvoker.warn(l, ame_2.p);
        }
        if (a2l_02.j > this.j) {
            this.j = a2l_02.j;
            this.c = a2l_02.c;
        } else if (a2l_02.j == this.j && this.c < a2l_02.c) {
            this.c = a2l_02.c;
        } else if (!a2l_02.b && this.b) {
            this.b = a2l_02.b;
        }
        this.k = a2l_02.k;
    }

    public int d() {
        return this.c;
    }

    public NBTTagCompound b(NBTTagCompound nBTTagCompound) {
        tn_0.a(nBTTagCompound, ame_2.l, (byte)this.f());
        tn_0.a(nBTTagCompound, ame_2.c, (byte)this.b());
        tn_0.b(nBTTagCompound, ame_2.f, this.d());
        tn_0.a(nBTTagCompound, ame_2.n, this.g());
        tn_0.a(nBTTagCompound, ame_2.i, this.h());
        return nBTTagCompound;
    }

    public void b(EntityLivingBase entityLivingBase) {
        if (this.c > 0) {
            ari_0.a(Potion.potionTypes[this.d], entityLivingBase, this.j);
        }
    }

    public a2l_0(int n, int n2, int n3) {
        this(n, n2, n3, false, true);
    }

    public boolean h() {
        return this.k;
    }
}


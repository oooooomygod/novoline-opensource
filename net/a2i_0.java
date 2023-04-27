/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package net;

import net.P8;
import net.UY;
import net.a1V;
import net.a2N;
import net.aL0;
import net.ac8_0;
import net.acb_2;
import net.agc_2;
import net.ant_0;
import net.asl_0;
import net.v6_0;
import org.checkerframework.checker.nullness.qual.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.a2i
 */
public abstract class a2i_0
extends a2N
implements acb_2 {
    protected @Nullable agc_2 g;

    @Override
    public void a(int n, int n2) {
        ant_0.b();
        if (this.a) {
            int n3 = !this.a(n, n2) ? 210 : 125;
            a1V.a((float)this.b, (float)this.c, (float)this.f, (float)this.e, 15.0f, 0x303136 | n3 << 24);
            if (this.g != null) {
                this.g.b(n, n2);
            }
        }
    }

    @Override
    public boolean equals(Object object) {
        ant_0.b();
        if (this == object) {
            return true;
        }
        if (!(object instanceof a2i_0)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        a2i_0 a2i_02 = (a2i_0)object;
        return UY.a((Object)this.g, a2i_02.g);
    }

    @Override
    public void a(@Nullable agc_2 agc_22) {
        ant_0.b();
        this.g = agc_22;
        this.a();
    }

    @Override
    public @Nullable agc_2 a() {
        return this.g;
    }

    private static NullPointerException a(NullPointerException nullPointerException) {
        return nullPointerException;
    }

    @Override
    public int hashCode() {
        return UY.a(new Object[]{P8.d(super.hashCode()), this.g});
    }

    @Override
    public String toString() {
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), ac8_0.b), this.g), '}').toString();
    }

    public a2i_0(@Nullable agc_2 agc_22, int n, int n2, int n3, int n4) {
        super(n, n2, n3, n4);
        this.a(agc_22);
    }

    public a2i_0(@Nullable agc_2 agc_22, int n, int n2) {
        super(n, n2, 200, 20);
        this.a(agc_22);
    }

    public void a() throws NullPointerException {
        asl_0.a(this.g, ac8_0.a);
        int n = (int)((float)this.b + (float)(this.f - this.g.i()) / 2.0f);
        int n2 = (int)((float)this.c + (float)(this.e - v6_0.a(this.g).b()) / 2.0f);
        v6_0.a(this.g, n, n2);
    }
}


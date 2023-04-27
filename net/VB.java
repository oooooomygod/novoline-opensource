/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import deobf.IAttribute;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net.GD;
import net.MM;
import net.Ma;
import net.S_;
import net.VO;
import net.aHx;
import net.aS0;
import net.ada_1;
import net.ahw_2;
import net.axe_2;
import net.dc_0;
import net.dz_0;
import net.ms_0;

public class VB
extends VO {
    protected Map<String, ahw_2> d;
    private Set<ahw_2> e = axe_2.a();

    public Set<ahw_2> a() {
        return this.e;
    }

    public Collection<ahw_2> b() {
        HashSet hashSet = axe_2.a();
        Iterator iterator = ms_0.a(this.a());
        while (dz_0.c(iterator)) {
            ahw_2 ahw_22 = (ahw_2)dz_0.b(iterator);
            if (!dc_0.a(Ma.c(ahw_22))) continue;
            aS0.b((Set)hashSet, ahw_22);
        }
        return hashSet;
    }

    @Override
    protected ahw_2 c(IAttribute iAttribute) {
        return new ada_1(this, iAttribute);
    }

    public VB() {
        this.d = new GD<ahw_2>();
    }

    @Override
    public void a(ahw_2 ahw_22) {
        if (dc_0.a(Ma.c(ahw_22))) {
            aS0.b(this.e, ahw_22);
        }
        Iterator iterator = ms_0.a(MM.a(this.c, Ma.c(ahw_22)));
        while (dz_0.c(iterator)) {
            IAttribute iAttribute = (IAttribute)dz_0.b(iterator);
            ada_1 ada_12 = this.a(iAttribute);
            ada_12.b();
        }
    }

    @Override
    public ada_1 a(IAttribute iAttribute) {
        return (ada_1)super.a(iAttribute);
    }

    @Override
    public ada_1 a(String string) {
        ahw_2 ahw_22 = super.a(string);
        ahw_22 = (ahw_2)MapInvoker.c(this.d, string);
        return (ada_1)ahw_22;
    }

    @Override
    public ahw_2 b(IAttribute iAttribute) {
        ahw_2 ahw_22 = super.b(iAttribute);
        if (iAttribute instanceof S_ && aHx.a((S_)iAttribute) != null) {
            MapInvoker.c(this.d, aHx.a((S_)iAttribute), ahw_22);
        }
        return ahw_22;
    }
}


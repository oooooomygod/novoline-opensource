/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import deobf.IAttribute;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import net.AttributeModifier;
import net.P8;
import net.VO;
import net.aS0;
import net.ahw_2;
import net.akr_1;
import net.axe_2;
import net.dc_0;
import net.dz_0;
import net.ht_0;
import net.ms_0;
import net.my_0;
import net.ow_0;
import net.pb_0;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.adA
 */
public class ada_1
implements ahw_2 {
    private Map<Integer, Set<AttributeModifier>> e = MapsInvoker.a();
    private double g;
    private Map<UUID, AttributeModifier> c;
    private double d;
    private VO f;
    private Map<String, Set<AttributeModifier>> a = MapsInvoker.a();
    private boolean b = true;
    private IAttribute h;

    @Override
    public void c(AttributeModifier attributeModifier) {
        if (this.a(ow_0.a(attributeModifier)) != null) {
            throw new IllegalArgumentException(pb_0.a);
        }
        Set set = (Set)MapInvoker.c(this.a, ow_0.e(attributeModifier));
        set = axe_2.a();
        MapInvoker.c(this.a, ow_0.e(attributeModifier), set);
        aS0.b((Set)MapInvoker.c(this.e, P8.d(ow_0.b(attributeModifier))), attributeModifier);
        aS0.b(set, attributeModifier);
        MapInvoker.c(this.c, ow_0.a(attributeModifier), attributeModifier);
        this.b();
    }

    private double a() {
        AttributeModifier attributeModifier;
        double d = this.c();
        Iterator iterator = ms_0.a(this.b(0));
        while (dz_0.c(iterator)) {
            AttributeModifier attributeModifier2 = (AttributeModifier)dz_0.b(iterator);
            d += ow_0.d(attributeModifier2);
        }
        double d2 = d;
        Iterator iterator2 = ms_0.a(this.b(1));
        while (dz_0.c(iterator2)) {
            attributeModifier = (AttributeModifier)dz_0.b(iterator2);
            d2 += d * ow_0.d(attributeModifier);
        }
        iterator2 = ms_0.a(this.b(2));
        while (dz_0.c(iterator2)) {
            attributeModifier = (AttributeModifier)dz_0.b(iterator2);
            d2 *= 1.0 + ow_0.d(attributeModifier);
        }
        return dc_0.a(this.h, d2);
    }

    @Override
    public IAttribute e() {
        return this.h;
    }

    @Override
    public AttributeModifier a(UUID uUID) {
        return (AttributeModifier)MapInvoker.c(this.c, uUID);
    }

    private Collection<AttributeModifier> b(int n) {
        HashSet hashSet = axe_2.b(this.a(n));
        IAttribute iAttribute = dc_0.b(this.h);
        while (true) {
            ahw_2 ahw_22 = ht_0.a(this.f, iAttribute);
            aS0.a((Set)hashSet, ahw_22.a(n));
            iAttribute = dc_0.b(iAttribute);
        }
    }

    @Override
    public boolean b(AttributeModifier attributeModifier) {
        return MapInvoker.c(this.c, ow_0.a(attributeModifier)) != null;
    }

    @Override
    public double d() {
        if (this.b) {
            this.d = this.a();
            this.b = false;
        }
        return this.d;
    }

    @Override
    public void a() {
        Collection<AttributeModifier> collection = this.b();
        Iterator iterator = akr_1.a(my_0.a(collection));
        while (dz_0.c(iterator)) {
            AttributeModifier attributeModifier = (AttributeModifier)dz_0.b(iterator);
            this.a(attributeModifier);
        }
    }

    protected void b() {
        this.b = true;
        ht_0.a(this.f, this);
    }

    public ada_1(VO vO, IAttribute iAttribute) {
        this.c = MapsInvoker.a();
        this.f = vO;
        this.h = iAttribute;
        this.g = dc_0.d(iAttribute);
        int n = 0;
        while (true) {
            MapInvoker.c(this.e, P8.d(n), axe_2.a());
            ++n;
        }
    }

    @Override
    public Collection<AttributeModifier> b() {
        HashSet hashSet = axe_2.a();
        int n = 0;
        while (true) {
            aS0.a((Set)hashSet, this.a(n));
            ++n;
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    @Override
    public void a(double d) {
        if (d != this.c()) {
            this.g = d;
            this.b();
        }
    }

    @Override
    public void a(AttributeModifier attributeModifier) {
        int n = 0;
        while (true) {
            Set set = (Set)MapInvoker.c(this.e, P8.d(n));
            aS0.a(set, attributeModifier);
            ++n;
        }
    }

    @Override
    public Collection<AttributeModifier> a(int n) {
        return (Collection)MapInvoker.c(this.e, P8.d(n));
    }

    @Override
    public double c() {
        return this.g;
    }
}


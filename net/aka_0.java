/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.BS;
import net.NBTTagCompound;
import net.World;
import net.Y_;
import net.a5_0;
import net.aKU;
import net.aPJ;
import net.aV8;
import net.aky_1;
import net.any_2;
import net.dz_0;
import net.qs_1;
import net.tn_0;
import net.zm_0;
import net.zw_0;

/*
 * Renamed from net.aKa
 */
public class aka_0
extends aKU {
    private boolean e;

    @Override
    public void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        this.e = tn_0.c(nBTTagCompound, qs_1.a);
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        tn_0.a(nBTTagCompound, qs_1.b, this.e);
    }

    public aka_0() {
    }

    public aka_0(World world, Random random, int n, int n2, int n3) {
        super(n, n2);
        Object object;
        int n4;
        List list = BS.a(random, n3);
        zw_0 zw_02 = new zw_0(aV8.q(world), 0, random, (n << 4) + 2, (n2 << 4) + 2, list, n3);
        aky_1.a(this.c, zw_02);
        aPJ.a(zw_02, zw_02, this.c, random);
        List<Y_> list2 = zw_02.l;
        List<Y_> list3 = zw_02.i;
        while (!ListInvoker.isEmpty(list2) || !ListInvoker.isEmpty(list3)) {
            if (ListInvoker.isEmpty(list2)) {
                n4 = a5_0.a(random, ListInvoker.size(list3));
                object = (Y_)ListInvoker.remove(list3, n4);
                any_2.a((Y_)object, zw_02, this.c, random);
                continue;
            }
            n4 = a5_0.a(random, ListInvoker.size(list2));
            object = (Y_)ListInvoker.remove(list2, n4);
            any_2.a((Y_)object, zw_02, this.c, random);
        }
        this.b();
        n4 = 0;
        object = aky_1.f(this.c);
        while (dz_0.c((Iterator)object)) {
            Y_ y_ = (Y_)dz_0.b((Iterator)object);
            if (y_ instanceof zm_0) continue;
            ++n4;
        }
        this.e = false;
    }

    @Override
    public boolean f() {
        return this.e;
    }
}


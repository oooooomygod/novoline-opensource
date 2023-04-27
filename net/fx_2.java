/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import net.CreativeTabs;
import net.Material;
import net.a5w_0;
import net.f3_0;

/*
 * Renamed from net.fx
 */
public class fx_2
extends f3_0 {
    @Override
    public boolean v() {
        return false;
    }

    @Override
    public a5w_0 K() {
        return a5w_0.CUTOUT;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    protected boolean c() {
        return true;
    }

    public fx_2(Material material, boolean bl) {
        super(material, bl);
        this.a(CreativeTabs.m);
    }
}


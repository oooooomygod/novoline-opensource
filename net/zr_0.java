/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.List;
import java.util.Random;
import net.NBTTagCompound;
import net.Y_;
import net.ZV;
import net.a7v_0;
import net.aga_0;
import net.my_0;

/*
 * Renamed from net.Zr
 */
public class zr_0
extends ZV {
    public List<aga_0> h;
    public List<Y_> e = my_0.c();
    public aga_0 g;
    public List<aga_0> f;

    public zr_0() {
    }

    public zr_0(Random random, int n, int n2) {
        super(random, n, n2);
        this.f = my_0.c();
        for (aga_0 aga_02 : a7v_0.c()) {
            aga_02.e = 0;
            ListInvoker.add(this.f, aga_02);
        }
        this.h = my_0.c();
        for (aga_0 aga_02 : a7v_0.a()) {
            aga_02.e = 0;
            ListInvoker.add(this.h, aga_02);
        }
    }

    @Override
    protected void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.List;
import net.KB;
import net.MathHelper;
import net.RenderManager;
import net.ResourceLocation;
import net.aKN;
import net.aO9;
import net.ado_1;
import net.ayn_0;
import net.ayo_0;
import net.jf_1;
import net.mr_1;
import net.my_0;
import net.n0_0;
import net.ru_1;
import net.rx_1;
import net.ry_1;

/*
 * Renamed from net.jf
 */
public class jf_2
extends jf_1<n0_0> {
    private ry_1 q;
    private List<KB<n0_0>> s;
    private static ResourceLocation t = new ResourceLocation(aO9.b);
    private static ResourceLocation r = new ResourceLocation(aO9.a);
    private List<KB<n0_0>> u;
    private rx_1 p;

    private void b(n0_0 n0_02) {
        if (aKN.b(n0_02)) {
            this.h = this.p;
            this.g = this.u;
        } else {
            this.h = this.q;
            this.g = this.s;
        }
        this.o = (ry_1)this.h;
    }

    public jf_2(RenderManager renderManager) {
        super(renderManager, new ru_1(), 0.5f, 1.0f);
        KB kB = (KB)ListInvoker.get(this.g, 0);
        this.q = this.o;
        this.p = new rx_1();
        this.b(new mr_1(this));
        ayn_0 ayn_02 = new ayn_0(this, this);
        this.b(ayn_02);
        this.s = my_0.a((Iterable)this.g);
        if (kB instanceof ado_1) {
            this.a(kB);
            this.b(new ado_1(this.p.r));
        }
        this.a(ayn_02);
        this.b(new ayo_0(this));
        this.u = my_0.a((Iterable)this.g);
    }

    @Override
    protected ResourceLocation a(n0_0 n0_02) {
        return aKN.b(n0_02) ? r : t;
    }

    @Override
    public void a(n0_0 n0_02, double d, double d2, double d3, float f, float f2) {
        this.b(n0_02);
        super.b(n0_02, d, d2, d3, f, f2);
    }

    @Override
    protected void a(n0_0 n0_02, float f, float f2, float f3) {
        if (aKN.a(n0_02)) {
            f2 += (float)((double)MathHelper.b((double)n0_02.ticksExisted * 3.25) * Math.PI * 0.25);
        }
        super.a(n0_02, f, f2, f3);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MouseInvoker;
import cc.novoline.invoke.SoundHandlerInvoker;
import cc.novoline.invoke.StringInvoker;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import deobf.StatBase;
import deobf.Tessellator;
import java.util.Comparator;
import java.util.List;
import net.minecraft.client.Minecraft;


abstract class a87
extends aiy_1 {
    protected int y;
    R8 x;
    protected int A;
    protected List<aH_> z;
    protected Comparator<aH_> B;
    protected int C;

    protected void a(StatBase statBase, int n, int n2, boolean bl) {
        String string = NW.a(statBase, aQC.a(R8.k(this.x), statBase));
        anj_1.a(this.x, R8.r(this.x), string, n - FontRendererInvoker.a(R8.h(this.x), string), n2 + 5, 0xFFFFFF);
    }

    @Override
    protected void b(int n, int n2) {
        if (n2 >= this.l && n2 <= this.t) {
            int n3 = this.d(n, n2);
            int n4 = this.r / 2 - 92 - 16;
            if (n < n4 + 40 || n > n4 + 40 + 20) {
                return;
            }
            aH_ aH_2 = this.d(n3);
            this.a(aH_2, n, n2);
        }
    }

    @Override
    protected boolean c(int n) {
        return false;
    }

    @Override
    protected void a(int n, boolean bl, int n2, int n3) {
    }

    @Override
    protected void a(int n, int n2, Tessellator tessellator) {
        if (!MouseInvoker.c(0)) {
            this.A = -1;
        }
        if (this.A == 0) {
            R8.a(this.x, n + 115 - 18, n2 + 1, 0, 0);
        } else {
            R8.a(this.x, n + 115 - 18, n2 + 1, 0, 18);
        }
        if (this.A == 1) {
            R8.a(this.x, n + 165 - 18, n2 + 1, 0, 0);
        } else {
            R8.a(this.x, n + 165 - 18, n2 + 1, 0, 18);
        }
        if (this.A == 2) {
            R8.a(this.x, n + 215 - 18, n2 + 1, 0, 0);
        } else {
            R8.a(this.x, n + 215 - 18, n2 + 1, 0, 18);
        }
        if (this.C != -1) {
            int n3 = 79;
            int n4 = 18;
            if (this.C == 1) {
                n3 = 129;
            } else if (this.C == 2) {
                n3 = 179;
            }
            if (this.y == 1) {
                n4 = 36;
            }
            R8.a(this.x, n + n3, n2 + 1, n4, 0);
        }
    }

    protected void c(int n) {
        if (n != this.C) {
            this.C = n;
            this.y = -1;
        } else if (this.y == -1) {
            this.y = 1;
        } else {
            this.C = -1;
            this.y = 0;
        }
        asg_0.a(this.z, this.B);
    }

    protected abstract String a(int var1);

    @Override
    protected void a() {
        anj_1.a(this.x);
    }

    @Override
    protected void a(int n, int n2) {
        this.A = -1;
        if (n >= 79 && n < 115) {
            this.A = 0;
        } else if (n >= 129 && n < 165) {
            this.A = 1;
        } else if (n >= 179 && n < 215) {
            this.A = 2;
        }
        if (this.A >= 0) {
            this.c(this.A);
            SoundHandlerInvoker.c(MCInvoker.l(this.n), aih_1.a(new ResourceLocation(uj_2.e), 1.0f));
        }
    }

    protected void a(aH_ aH_2, int n, int n2) {
        Item item = alp_1.a(aH_2);
        ItemStack itemStack = new ItemStack(item);
        String string = act_2.l(itemStack);
        String string2 = StringInvoker.h(aL0.a(aL0.a(new StringBuilder(), uj_2.c), I18n.format(aL0.a(aL0.a(new StringBuilder(), string), uj_2.f).toString(), new Object[0])).toString());
        if (!StringInvoker.g(string2)) {
            int n3 = n + 12;
            int n4 = n2 - 12;
            int n5 = FontRendererInvoker.a(R8.j(this.x), string2);
            R8.a(this.x, n3 - 3, n4 - 3, n3 + n5 + 3, n4 + 8 + 3, -1073741824, -1073741824);
            FontRendererInvoker.drawStringWithShadow(R8.m(this.x), string2, n3, n4, -1);
        }
    }

    protected a87(R8 r8, Minecraft minecraft) {
        this.x = r8;
        super(minecraft, r8.n, r8.f, 32, r8.f - 64, 20);
        this.A = -1;
        this.C = -1;
        this.a(false);
        this.a(true, 20);
    }

    protected aH_ d(int n) {
        return (aH_)ListInvoker.get(this.z, n);
    }

    @Override
    protected int f() {
        return ListInvoker.size(this.z);
    }
}


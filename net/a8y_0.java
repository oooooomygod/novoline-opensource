/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.List;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.a8y
 */
public class a8y_0
extends aij_1 {
    private List<uw_1> x = my_0.c();

    @Override
    public uw_1 a(int n) {
        return (uw_1)ListInvoker.get(this.x, n);
    }

    private QG a(Minecraft minecraft, int n, int n2, aj2 aj22) {
        return null;
    }

    public a8y_0(Minecraft minecraft, int n, int n2, int n3, int n4, int n5, aj2 ... aj2Array) {
        super(minecraft, n, n2, n3, n4, n5);
        this.f = false;
        for (int i = 0; i < aj2Array.length; i += 2) {
            aj2 aj22 = aj2Array[i];
            aj2 aj23 = i < aj2Array.length - 1 ? aj2Array[i + 1] : null;
            QG qG = this.a(minecraft, n / 2 - 155, 0, aj22);
            QG qG2 = this.a(minecraft, n / 2 - 155 + 160, 0, aj23);
            ListInvoker.add(this.x, new uw_1(qG, qG2));
        }
    }

    @Override
    public int d() {
        return 400;
    }

    @Override
    protected int f() {
        return ListInvoker.size(this.x);
    }

    @Override
    protected int h() {
        return super.h() + 32;
    }
}


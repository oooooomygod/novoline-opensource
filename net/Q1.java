/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.SystemInvoker;
import deobf.GuiScreen;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.awt.Color;
import java.util.Collection;
import java.util.List;
import net.KU;
import net.a2d_0;
import net.aB0;
import net.aMF;
import net.aXE;
import net.agx_2;
import net.aol_1;
import net.ara_2;
import net.atW;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

public abstract class Q1
extends GuiScreen {
    private long v;
    private @NonNull List<KU> w = new ObjectArrayList();

    public Q1() {
        this(null);
    }

    protected void a(@NonNull KU kU) {
        ListInvoker.add(this.w, kU);
    }

    @Override
    public void l() {
        ListInvoker.clear(this.w);
        this.a();
        super.l();
    }

    protected void a() {
    }

    public Q1(@Nullable Collection<KU> collection) {
    }

    protected void b() {
    }

    @Override
    public void a(int n, int n2, float f) {
        a2d_0.b();
        this.b(0, 0, this.n, this.f, aol_1.b(new Color(100, 200, 200)), aol_1.b(new Color(100, 100, 200)));
        int n3 = 0;
        if (n3 < ListInvoker.size(this.w)) {
            aXE.a((KU)ListInvoker.get(this.w, n3), n, n2);
            ++n3;
            ListInvoker.b(new ListInvoker[4]);
        }
        if (SystemInvoker.f() - this.v >= 1000L) {
            LoggerInvoker.e(NovolineInvoker.getLogger(), atW.a, new Object[]{aMF.a(aMF.a(ListInvoker.stream(this.w), Q1::lambda$drawScreen$0), aB0.a(agx_2.a(), aB0.d()))});
            this.v = SystemInvoker.f();
        }
        super.a(n, n2, f);
    }

    private static String lambda$drawScreen$0(KU kU) {
        return ara_2.p(kU.getClass());
    }

    @Override
    public void i() {
        this.b();
        super.i();
    }
}


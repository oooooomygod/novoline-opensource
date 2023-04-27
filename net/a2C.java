/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.utils.fonts.api.FontRenderer;
import net.UY;
import net.a2d_0;
import net.a7l_0;
import net.aL0;
import net.agc_2;
import net.bx_0;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;


public abstract class a2C
extends a2d_0
implements agc_2 {
    private static int e;
    protected @Nullable String h;
    protected @NonNull FontRenderer f;
    protected int g;

    public static void i(int n) {
        e = n;
    }

    @Override
    public boolean equals(Object object) {
        a2C.j();
        if (this == object) {
            return true;
        }
        if (!(object instanceof a2C)) {
            return false;
        }
        a2C a2C2 = (a2C)object;
        return UY.a((Object)this.h, (Object)a2C2.h) && this.f.equals(a2C2.f);
    }

    @Override
    public void a(@Nullable String string) {
        this.h = string;
    }

    @Override
    public @NonNull FontRenderer a() {
        return this.f;
    }

    @Override
    public void a(int n, int n2) {
        a7l_0.a(this.f, (CharSequence)this.h, this.b, this.c, this.g);
    }

    @Override
    public void h(int n) {
        this.g = n;
    }

    @Override
    public int g() {
        return this.g;
    }

    @Override
    public int hashCode() {
        return UY.a(new Object[]{this.h, this.f});
    }

    public static int j() {
        a2C.h();
        return 123;
    }

    public static int h() {
        return e;
    }

    @Override
    public String toString() {
        a2C.h();
        String string = aL0.a(aL0.a(aL0.a(aL0.c(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), bx_0.b), this.h), '\''), bx_0.a), this.g), bx_0.c), this.f), '}').toString();
        ListInvoker.b(new ListInvoker[1]);
        return string;
    }

    public a2C(@Nullable String string, int n, @NonNull FontRenderer fontRenderer, int n2, int n3) {
        int n4 = a2C.j();
        super(n2, n3);
        this.h = string;
        int n5 = n4;
        this.g = n;
        this.f = fontRenderer;
        if (ListInvoker.b() != null) {
            a2C.i(++n5);
        }
    }

    @Override
    public void a(@NonNull FontRenderer fontRenderer) {
        this.f = fontRenderer;
    }

    static {
        if (a2C.h() == 0) {
            a2C.i(120);
        }
    }

    public a2C(@Nullable String string, int n, @NonNull FontRenderer fontRenderer) {
        this(string, n, fontRenderer, 0, 0);
    }

    @Override
    public @Nullable String h() {
        return this.h;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package net;

import deobf.IntProperty;
import net.AbstractNumberProperty;
import net.lx_2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class E3
extends AbstractNumberProperty<E3, Long> {
    @NotNull
    public static E3 e(@Nullable Long l4) {
        return new E3(l4);
    }

    @Override
    protected boolean b(@Nullable Long l4) {
        IntProperty.c();
        if (l4 == null) {
            return false;
        }
        if (this.a == null) {
            return true;
        }
        return lx_2.a((Long)this.a) < lx_2.a(l4);
    }

    @Override
    protected void c(@Nullable Long l4) {
        E3 e3 = this;
        e3.a = lx_2.b(lx_2.a((Long)e3.a) - lx_2.a(l4));
    }

    public E3() {
        this(lx_2.b(0L));
    }

    @Override
    protected void a(@Nullable Long l4) {
        E3 e3 = this;
        e3.a = lx_2.b(lx_2.a((Long)e3.a) + lx_2.a(l4));
    }

    public E3(@Nullable Long l4) {
        super(l4);
    }

    @NotNull
    public static E3 a() {
        return new E3();
    }

    @Override
    protected boolean d(@Nullable Long l4) {
        IntProperty.c();
        if (l4 == null) {
            return this.a != null;
        }
        if (this.a == null) {
            return true;
        }
        return lx_2.a((Long)this.a) > lx_2.a(l4);
    }

    @Override
    protected E3 b() {
        return this;
    }

    protected boolean f(@NotNull Long l4) {
        IntProperty.c();
        return !(this.e != null && lx_2.a(l4) < lx_2.a((Long)this.e) || this.f != null && lx_2.a(l4) > lx_2.a((Long)this.f));
    }
}


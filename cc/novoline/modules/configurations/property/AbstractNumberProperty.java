/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package cc.novoline.modules.configurations.property;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.modules.configurations.property.AbstractProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractNumberProperty<Self extends AbstractNumberProperty<Self, Type>, Type extends Number>
extends AbstractProperty<Type> {
    protected Type f;
    protected Type e;
    private static String[] d;

    public static void a(String[] stringArray) {
        d = stringArray;
    }

    private static wh_0 a(wh_0 wh_02) {
        return wh_02;
    }

    public Type a() {
        return this.f;
    }

    protected boolean d(Type Type2) {
        AbstractProperty.b();
        if (this.a(Type2)) {
            return true;
        }
        if (Type2 == null && this.a == null) {
            return false;
        }
        return UY.a(Type2, this.a);
    }

    public static String[] d() {
        return d;
    }

    protected abstract void f(Type var1);

    public void e(@Nullable Type Type2) {
        AbstractProperty.b();
        if (this.g(Type2)) {
            super.a(Type2);
            ListInvoker.b(new ListInvoker[1]);
        }
        if (acU.d(Type2) > acU.d(this.a())) {
            super.a(this.a());
        }
        if (acU.d(Type2) < acU.d(this.e())) {
            super.a(this.e());
        }
        throw new wh_0(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), ahm_1.g), Type2), ahm_1.d), this.e), ahm_1.f), this.f), ahm_1.a).toString(), this);
    }

    protected abstract boolean g(@NotNull Type var1);

    static {
        if (AbstractNumberProperty.d() == null) {
            AbstractNumberProperty.a(new String[5]);
        }
    }

    public Self h(@Nullable Type Type2) {
        if (this.a != null && this.a(Type2)) {
            throw new IllegalArgumentException(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), ahm_1.b), this.a), ahm_1.c), Type2).toString());
        }
        this.f = Type2;
        return this.b();
    }

    protected abstract boolean a(Type var1);

    protected abstract void i(Type var1);

    protected AbstractNumberProperty(Type Type2) {
        super(Type2);
    }

    protected abstract boolean j(Type var1);

    protected AbstractNumberProperty() {
    }

    public Self c(@Nullable Type Type2) {
        if (this.a != null && this.j(Type2)) {
            throw new IllegalArgumentException(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), ahm_1.h), this.a), ahm_1.e), Type2).toString());
        }
        this.e = Type2;
        return this.b();
    }

    protected boolean b(Type Type2) {
        AbstractProperty.b();
        if (this.j(Type2)) {
            return true;
        }
        if (Type2 == null) {
            return false;
        }
        return UY.a(Type2, this.a);
    }

    protected abstract Self b();

    public Type e() {
        return this.e;
    }
}


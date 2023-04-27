/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package cc.novoline.modules.configurations.property.object;

import net.AbstractNumberProperty;
import net.P8;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class IntProperty
extends AbstractNumberProperty<IntProperty, Integer> {
    private static String[] c;

    public boolean f(@Nullable Integer n) {
        IntProperty.c();
        if (n == null) {
            return false;
        }
        if (this.a == null) {
            return true;
        }
        return P8.b((Integer)this.a) < P8.b(n);
    }

    @Override
    protected IntProperty b() {
        return this;
    }

    static {
        if (IntProperty.c() != null) {
            IntProperty.c(new String[2]);
        }
    }

    @Override
    public void c(@Nullable Integer n) {
        IntProperty.c();
        if (this.a == null) {
            this.a = n;
        }
        this.e(P8.d(P8.b((Integer)this.a) + P8.b(n)));
    }

    public static void c(String[] stringArray) {
        c = stringArray;
    }

    @NotNull
    public static IntProperty a() {
        return new IntProperty();
    }

    public IntProperty(@Nullable Integer n) {
        super(n);
    }

    protected boolean e(@NotNull Integer n) {
        IntProperty.c();
        return !(this.e != null && P8.b(n) < P8.b((Integer)this.e) || this.f != null && P8.b(n) > P8.b((Integer)this.f));
    }

    @NotNull
    public static IntProperty b(@Nullable Integer n) {
        return new IntProperty(n);
    }

    public IntProperty() {
        this(P8.d(0));
    }

    public static String[] c() {
        return c;
    }

    @Override
    public boolean a(@Nullable Integer n) {
        IntProperty.c();
        if (n == null) {
            return this.a != null;
        }
        if (this.a == null) {
            return true;
        }
        return P8.b((Integer)this.a) > P8.b(n);
    }

    public void d(@Nullable Integer n) {
        IntProperty.c();
        if (this.a == null) {
            this.a = n;
        }
        this.e(P8.d(P8.b((Integer)this.a) - P8.b(n)));
    }
}


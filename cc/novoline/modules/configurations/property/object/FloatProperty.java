/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package cc.novoline.modules.configurations.property.object;

import deobf.IntProperty;
import net.AbstractNumberProperty;
import net.axx_1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FloatProperty
extends AbstractNumberProperty<FloatProperty, Float> {
    @NotNull
    public static FloatProperty a() {
        return new FloatProperty();
    }

    @Override
    protected boolean b(@Nullable Float f) {
        IntProperty.c();
        if (f == null) {
            return this.a != null;
        }
        if (this.a == null) {
            return true;
        }
        return axx_1.a((Float)this.a) > axx_1.a(f);
    }

    public FloatProperty(@Nullable Float f) {
        super(f);
    }

    protected boolean f(@Nullable Float f) {
        IntProperty.c();
        if (f == null) {
            return false;
        }
        if (this.a == null) {
            return true;
        }
        return axx_1.a((Float)this.a) < axx_1.a(f);
    }

    @Override
    protected boolean d(@NotNull Float f) {
        IntProperty.c();
        return (this.e == null || axx_1.a(f) >= axx_1.a((Float)this.e)) && (this.f == null || axx_1.a(f) <= axx_1.a((Float)this.f));
    }

    @Override
    protected FloatProperty b() {
        return this;
    }

    @NotNull
    public static FloatProperty a(@Nullable Float f) {
        return new FloatProperty(f);
    }

    @Override
    protected void c(@Nullable Float f) {
        FloatProperty floatProperty = this;
        floatProperty.a = axx_1.a(axx_1.a((Float)floatProperty.a) - axx_1.a(f));
    }

    @Override
    protected void e(@Nullable Float f) {
        FloatProperty floatProperty = this;
        floatProperty.a = axx_1.a(axx_1.a((Float)floatProperty.a) + axx_1.a(f));
    }

    public FloatProperty() {
        this(axx_1.a(0.0f));
    }
}


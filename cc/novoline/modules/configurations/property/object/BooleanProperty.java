/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package cc.novoline.modules.configurations.property.object;

import cc.novoline.modules.configurations.property.AbstractProperty;
import deobf.IntProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BooleanProperty
extends AbstractProperty<Boolean> {
    private static qf_2<BooleanProperty> c;
    private static qf_2<BooleanProperty> d;

    public void f() {
        IntProperty.c();
        this.a = auk_2.b(this.a == null || !auk_2.a((Boolean)this.a));
    }

    static {
        d = ui_0.a(BooleanProperty::lambda$static$0);
        c = ui_0.a(BooleanProperty::lambda$static$1);
    }

    public BooleanProperty(@Nullable Boolean bl) {
        super(auk_2.b(auk_2.a(bl)));
    }

    public void e() {
        this.a(auk_2.b(false));
    }

    public static BooleanProperty b() {
        return d.get();
    }

    @NotNull
    public static BooleanProperty a(@Nullable Boolean bl) {
        return new BooleanProperty(bl);
    }

    public static BooleanProperty a() {
        return c.get();
    }

    @NotNull
    public static BooleanProperty c() {
        return new BooleanProperty();
    }

    private static BooleanProperty lambda$static$1() {
        return new E7(auk_2.b(false), null);
    }

    public void d() {
        this.a(auk_2.b(true));
    }

    public BooleanProperty() {
        this(auk_2.b(false));
    }

    private static BooleanProperty lambda$static$0() {
        return new E7(auk_2.b(true), null);
    }
}


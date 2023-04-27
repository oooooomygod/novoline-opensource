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
import net.db_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DoubleProperty
extends AbstractNumberProperty<DoubleProperty, Double> {
    private static boolean c;

    @Override
    protected void c(@Nullable Double d) {
        DoubleProperty doubleProperty = this;
        doubleProperty.a = db_0.a(db_0.b((Double)doubleProperty.a) - db_0.b(d));
    }

    protected boolean e(@Nullable Double d) {
        IntProperty.c();
        if (d == null) {
            return this.a != null;
        }
        if (this.a == null) {
            return true;
        }
        return db_0.b((Double)this.a) > db_0.b(d);
    }

    protected boolean f(@NotNull Double d) {
        IntProperty.c();
        return (this.e == null || db_0.b(d) >= db_0.b((Double)this.e)) && (this.f == null || db_0.b(d) <= db_0.b((Double)this.f));
    }

    public static boolean e() {
        DoubleProperty.c();
        return true;
    }

    public DoubleProperty(@Nullable Double d) {
        super(d);
    }

    @Override
    protected DoubleProperty a() {
        return this;
    }

    @NotNull
    public static DoubleProperty d(@Nullable Double d) {
        return new DoubleProperty(d);
    }

    @NotNull
    public static DoubleProperty b() {
        return new DoubleProperty();
    }

    public static boolean c() {
        return c;
    }

    public DoubleProperty() {
        super(db_0.a(0.0));
    }

    static {
        if (!DoubleProperty.e()) {
            DoubleProperty.b(true);
        }
    }

    @Override
    protected boolean a(@Nullable Double d) {
        IntProperty.c();
        if (d == null) {
            return false;
        }
        if (this.a == null) {
            return true;
        }
        return db_0.b((Double)this.a) < db_0.b(d);
    }

    protected void b(@Nullable Double d) {
        DoubleProperty doubleProperty = this;
        doubleProperty.a = db_0.a(db_0.b((Double)doubleProperty.a) + db_0.b(d));
    }

    public static void b(boolean bl) {
        c = bl;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package cc.novoline.modules.configurations.property;

import net.awk_0;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractProperty<Type>
implements Property<Type> {
    protected Type a;
    private static String[] b;

    @Override
    public void a(@Nullable Type Type2) {
        this.a = Type2;
    }

    static {
        if (AbstractProperty.b() == null) {
            AbstractProperty.b(new String[4]);
        }
    }

    protected AbstractProperty() {
        this(null);
    }

    @Override
    public Type get() {
        return this.a;
    }

    protected AbstractProperty(@Nullable Type Type2) {
        this.a(Type2);
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public String toString() {
        AbstractProperty.b();
        return this.a != null ? this.a.toString() : awk_0.a;
    }

    public static String[] b() {
        return b;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package cc.novoline.modules.configurations.property.object;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.modules.configurations.property.AbstractProperty;
import deobf.IntProperty;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Collection;
import java.util.List;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class StringProperty
extends AbstractProperty<String> {
    private List<String> c;

    public void d(@Nullable String string) {
        IntProperty.c();
        if (this.e(string)) {
            super.a(string);
        }
        throw new wm_1(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), abr_1.b), string), abr_1.a), string).toString(), this);
    }

    public StringProperty() {
        this("");
    }

    public StringProperty a(@NotNull Collection<String> collection) {
        this.c = new ObjectArrayList(collection);
        return this;
    }

    public boolean b(@Nullable String string) {
        IntProperty.c();
        if (string == null) {
            return this.a == null;
        }
        return string.equals(this.a);
    }

    @NotNull
    public static StringProperty c(@Nullable String string) {
        return new StringProperty(string);
    }

    public List<String> b() {
        return this.c;
    }

    private static wm_1 a(wm_1 wm_12) {
        return wm_12;
    }

    public StringProperty(@Nullable String string) {
        super(string);
    }

    public StringProperty a(@Nullable Object object) {
        this.d(aL0.a(aL0.a(new StringBuilder(), (String)this.get()), object).toString());
        return this;
    }

    public StringProperty a(String ... stringArray) {
        this.c = new ObjectArrayList((Object[])stringArray);
        return this;
    }

    public boolean b(String ... stringArray) {
        IntProperty.c();
        if (stringArray == null) {
            return this.a == null;
        }
        return aMF.c(a7r_0.e(stringArray), this::lambda$equals$0);
    }

    private boolean e(@NotNull String string) {
        IntProperty.c();
        if (this.c == null || ListInvoker.isEmpty(this.c)) {
            return true;
        }
        return ListInvoker.contains(this.c, string);
    }

    private boolean lambda$equals$0(String string) {
        return string.equals(this.a);
    }

    @NotNull
    public static StringProperty a() {
        return new StringProperty();
    }

    public boolean a(@Nullable String string) {
        IntProperty.c();
        if (string == null) {
            return this.a == null;
        }
        return string.equalsIgnoreCase((String)this.a);
    }
}


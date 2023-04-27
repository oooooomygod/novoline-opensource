/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Range
 */
package cc.novoline.modules.configurations.property.object;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.modules.configurations.property.AbstractProperty;
import deobf.IntProperty;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

public class ListProperty<Type>
extends AbstractProperty<List<Type>> {
    protected List<Type> c;

    public ListProperty(@Nullable Type Type2, @Nullable Type Type3, @Nullable Type Type4) {
        IntProperty.c();
        this((List<Type>)new ObjectArrayList((Collection)a7r_0.a(new Object[]{Type2, Type3, Type4})));
        ListInvoker.b(new ListInvoker[5]);
    }

    public boolean d(@Nullable Type Type2) {
        IntProperty.c();
        return this.a != null && ((List)this.a).remove(Type2);
    }

    public ListProperty<Type> a(@NotNull Collection<Type> collection) {
        this.c = new ObjectArrayList(collection);
        return this;
    }

    public Type a(@Range(from=0L, to=0x7FFFFFFFL) int n) {
        IntProperty.c();
        return this.a != null ? (Type)((List)this.a).get(n) : null;
    }

    @SafeVarargs
    @NotNull
    public static <Type> ListProperty<Type> a(Type ... TypeArray) {
        return new ListProperty<Type>(TypeArray);
    }

    @SafeVarargs
    public ListProperty<Type> b(Type ... TypeArray) {
        this.c = new ObjectArrayList((Object[])TypeArray);
        return this;
    }

    public boolean a(Type Type2) {
        IntProperty.c();
        return this.a != null && ((List)this.a).contains(Type2);
    }

    public ListProperty(@Nullable Type Type2) {
        this((List<Type>)new ObjectArrayList((Collection)asg_0.b(Type2)));
    }

    private static wm_1 a(wm_1 wm_12) {
        return wm_12;
    }

    @NotNull
    public static <Type> ListProperty<Type> a(@NotNull List<Type> list) {
        return new ListProperty<Type>(list);
    }

    @NotNull
    public static <Type> ListProperty<Type> a(@Nullable Type Type2, @Nullable Type Type3) {
        return new ListProperty<Type>(Type2, Type3);
    }

    @NotNull
    public static <Type> ListProperty<Type> c(@Nullable Type Type2) {
        return new ListProperty<Type>(Type2);
    }

    public ListProperty() {
        this((List<Type>)new ObjectArrayList());
    }

    private boolean lambda$set$0(Object object) {
        IntProperty.c();
        return !this.c.contains(object);
    }

    @NotNull
    public static <Type> ListProperty<Type> a(@Nullable Type Type2, @Nullable Type Type3, @Nullable Type Type4) {
        return new ListProperty<Type>(Type2, Type3, Type4);
    }

    public boolean b(@Nullable Type Type2) {
        IntProperty.c();
        if (this.c != null && !this.c.contains(Type2)) {
            return false;
        }
        if (this.a == null) {
            this.b((List<Type>)new ObjectArrayList());
        }
        return ((List)this.a).add(Type2);
    }

    public boolean a() {
        IntProperty.c();
        return this.a == null || ((List)this.a).isEmpty();
    }

    public ListProperty(@NotNull Collection<Type> collection) {
        this((List<Type>)new ObjectArrayList(collection));
    }

    @NotNull
    public static <Type> ListProperty<Type> b() {
        return new ListProperty<Type>();
    }

    public ListProperty(@Nullable Type Type2, @Nullable Type Type3) {
        IntProperty.c();
        this((List<Type>)new ObjectArrayList((Collection)a7r_0.a(new Object[]{Type2, Type3})));
        if (ListInvoker.b() != null) {
            IntProperty.c(new String[1]);
        }
    }

    public List<Type> d() {
        return this.c;
    }

    @SafeVarargs
    public ListProperty(Type ... TypeArray) {
        this((List<Type>)new ObjectArrayList((Object[])TypeArray));
    }

    public ListProperty(@NotNull List<Type> list) {
        super(list);
    }

    private boolean c(@NotNull List<Type> list) {
        Object object;
        IntProperty.c();
        if (this.c == null || list.isEmpty() || this.c.isEmpty()) {
            return true;
        }
        Iterator iterator = ListInvoker.iterator(list);
        return !dz_0.c(iterator) || this.c.contains(object = dz_0.b(iterator));
    }

    public void b(@Nullable List<Type> list) {
        IntProperty.c();
        if (this.c(list)) {
            super.a(list);
        }
        ea_1.a(System.out, aL0.a(aL0.a(new StringBuilder(), jy_2.b), this.d()).toString());
        throw new wm_1(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), jy_2.c), list), jy_2.a), aG1.a(list, this::lambda$set$0)).toString(), this);
    }

    @NotNull
    public static <Type> ListProperty<Type> b(@NotNull Collection<Type> collection) {
        return new ListProperty<Type>(new ObjectArrayList(collection));
    }

    public int c() {
        IntProperty.c();
        return this.a != null ? ((List)this.a).size() : 0;
    }
}


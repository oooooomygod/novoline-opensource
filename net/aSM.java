/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package net;

import cc.novoline.modules.configurations.property.Property;
import cc.novoline.invoke.ListInvoker;
import deobf.IntProperty;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

public class aSM
extends aSS {
    private Property<?> a(@NonNull Field field, @NonNull Object object) throws IllegalAccessException {
        return (Property)avx_0.a(field, object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected void a(Object object, ad__0 ad__02, GE<?> gE) throws a68 {
        Property<?> property;
        block7: {
            Object object2;
            a9p_0.b();
            try {
                if (ki_0.m(ad__02) == aS1.LIST) {
                    property = this.a(this.a, object);
                    object2 = (List)ki_0.e(ad__02);
                    ObjectArrayList objectArrayList = new ObjectArrayList((Collection)object2);
                    this.a(property, (Object)objectArrayList);
                    ListInvoker.b(new ListInvoker[2]);
                }
                Property<?> property2 = property = ki_0.p(ad__02) ? null : WB.a(gE, this.c, ad__02);
                if (property != null) break block7;
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new a68(aL0.a(aL0.a(new StringBuilder(), aVB.b), avx_0.a(this.a)).toString(), illegalAccessException);
            }
            object2 = avx_0.a(this.a, object);
            this.a(object, ad__02);
        }
        this.a(object, this.a, property);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private void b(@NonNull Property property, @NonNull Object object) throws Throwable {
        a9p_0.b();
        if (property instanceof IntProperty) {
            this.a(property, (Object)P8.d(acU.e((Number)object)));
        }
        if (property instanceof DoubleProperty) {
            this.a(property, (Object)db_0.a(acU.d((Number)object)));
        }
        if (property instanceof FloatProperty) {
            this.a(property, (Object)axx_1.a(acU.b((Number)object)));
        }
        if (property instanceof E3) {
            this.a(property, (Object)lx_2.b(acU.c((Number)object)));
        }
        if (property instanceof StringProperty) {
            this.a(property, (Object)object.toString());
        }
        if (property instanceof ListProperty) {
            this.a(property, (Object)new ObjectArrayList(new Object[]{object}));
        }
        if (property instanceof BooleanProperty) {
            if (object instanceof Number) {
                this.a(property, (Object)auk_2.b(acU.a((Number)object) > 0));
                return;
            }
            throw new a68();
        }
    }

    private void a(@NonNull Property property, @Nullable Object object) {
        arr_1.a(property, object);
    }

    public aSM(Field field, String string) {
        super(field, string);
    }

    private void a(@NonNull Object object, @NonNull Field field, Object object2) throws a68, IllegalAccessException {
        Property<?> property = this.a(field, object);
        Object object3 = arr_1.a((Property)object2);
        try {
            this.a(property, object3);
        }
        catch (ClassCastException classCastException) {
            try {
                this.b(property, UY.b(object3));
            }
            catch (Throwable throwable) {
                throw new a68(aVB.c, throwable);
            }
        }
        catch (Throwable throwable) {
            throw new a68(aVB.a, throwable);
        }
    }
}


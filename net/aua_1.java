/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.reflect.TypeToken
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package net;

import com.google.common.reflect.TypeToken;
import deobf.TypeSerializerCollection;
import net.AJ;
import net.GE;
import net.a68;
import net.a7V;
import net.aCN;
import net.aL0;
import net.aVH;
import net.ad__0;
import net.aht_2;
import net.ake_0;
import net.anx_0;
import net.ara_2;
import net.at6;
import net.ki_0;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

/*
 * Renamed from net.auA
 */
class aua_1
implements GE<Object> {
    private static Exception a(Exception exception) {
        return exception;
    }

    aua_1(at6 at62) {
        this();
    }

    @Override
    public Object a(@NonNull TypeToken<?> typeToken, @NonNull ad__0 ad__02) throws a68 {
        Class<?> clazz = this.a(typeToken, ki_0.o(ki_0.a(ad__02, new Object[]{a7V.a})));
        return anx_0.a(aht_2.a(aCN.a(aVH.d(ki_0.j(ad__02)), clazz)), ad__02);
    }

    @Override
    public void a(@NonNull TypeToken<?> typeToken, @Nullable Object object, @NonNull ad__0 ad__02) throws a68 {
        TypeSerializerCollection.b();
        ki_0.a(ad__02, null);
    }

    private aua_1() {
    }

    private Class<?> a(TypeToken<?> typeToken, String string) throws a68 {
        Class clazz;
        block5: {
            block4: {
                TypeSerializerCollection.b();
                if (!ara_2.d(ake_0.b(typeToken)) && !AJ.b(ara_2.m(ake_0.b(typeToken)))) break block4;
                if (string == null) {
                    throw new a68(aL0.a(aL0.a(new StringBuilder(), a7V.d), typeToken).toString());
                }
                try {
                    clazz = ara_2.a(string);
                }
                catch (ClassNotFoundException classNotFoundException) {
                    throw new a68(aL0.a(aL0.a(new StringBuilder(), a7V.f), string).toString(), classNotFoundException);
                }
                if (!ara_2.a(ake_0.b(typeToken), clazz)) {
                    throw new a68(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), a7V.b), string), a7V.c), ara_2.k(ake_0.b(typeToken))).toString());
                }
                break block5;
            }
            clazz = ake_0.b(typeToken);
        }
        return clazz;
    }
}


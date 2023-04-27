/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.reflect.TypeToken
 */
package net;

import com.google.common.reflect.TypeToken;
import deobf.TypeSerializerCollection;
import java.util.function.Predicate;
import net.GE;

/*
 * Renamed from net.aSq
 */
public class asq_0 {
    private static String[] b;

    public static String[] b() {
        return b;
    }

    public static TypeSerializerCollection a(TypeSerializerCollection typeSerializerCollection, TypeSerializerCollection typeSerializerCollection2) {
        return typeSerializerCollection.a(typeSerializerCollection2);
    }

    public static TypeSerializerCollection a(TypeSerializerCollection typeSerializerCollection, TypeToken typeToken, GE gE) {
        return typeSerializerCollection.a(typeToken, gE);
    }

    static {
        if (asq_0.b() != null) {
            asq_0.b(new String[2]);
        }
    }

    public static GE a(TypeSerializerCollection typeSerializerCollection, TypeToken typeToken) {
        return typeSerializerCollection.a(typeToken);
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static TypeSerializerCollection a(TypeSerializerCollection typeSerializerCollection, Predicate predicate, GE gE) {
        return typeSerializerCollection.a(predicate, gE);
    }

    public static TypeSerializerCollection a(TypeSerializerCollection typeSerializerCollection) {
        return typeSerializerCollection.a();
    }
}


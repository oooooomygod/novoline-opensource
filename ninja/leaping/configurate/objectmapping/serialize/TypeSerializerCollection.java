/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.reflect.TypeToken
 */
package ninja.leaping.configurate.objectmapping.serialize;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import com.google.common.reflect.TypeToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import net.GE;
import net.UY;
import net.aOQ;
import net.adk_1;
import net.ake_0;
import net.asl_0;
import net.ath_0;
import net.wq_1;

public class TypeSerializerCollection {
    private wq_1 c = new wq_1(null);
    private Map<TypeToken<?>, GE<?>> e = new ConcurrentHashMap();
    private static String b = "emGJib";
    private TypeSerializerCollection d;

    static {
        if (TypeSerializerCollection.b() == null) {
            TypeSerializerCollection.b("emGJib");
        }
    }

    public <T> GE<T> a(TypeToken<T> typeToken) {
        TypeSerializerCollection.b();
        typeToken = ake_0.c((TypeToken)UY.b(typeToken));
        GE<T> gE = (GE<T>)MapInvoker.a(this.e, (Object)typeToken, this.c);
        if (gE == null && this.d != null) {
            gE = this.d.a(typeToken);
        }
        return gE;
    }

    public <T> TypeSerializerCollection a(Predicate<TypeToken<T>> predicate, GE<? super T> gE) {
        this.c.add(new adk_1((Predicate)UY.a(predicate, ath_0.b), (GE)UY.a(gE, ath_0.d), null));
        MapInvoker.d(this.e);
        return this;
    }

    public TypeSerializerCollection a(TypeSerializerCollection typeSerializerCollection) {
        TypeSerializerCollection.b();
        asl_0.a(typeSerializerCollection, ath_0.a);
        TypeSerializerCollection typeSerializerCollection2 = aOQ.b();
        typeSerializerCollection2.c.addAllAbsent(typeSerializerCollection.c);
        typeSerializerCollection2.c.addAllAbsent(this.c);
        if (ListInvoker.b() != null) {
            TypeSerializerCollection.b("MHsd3");
        }
        return typeSerializerCollection2;
    }

    public static void b(String string) {
        b = string;
    }

    TypeSerializerCollection(TypeSerializerCollection typeSerializerCollection) {
        this.d = typeSerializerCollection;
    }

    public TypeSerializerCollection a() {
        return new TypeSerializerCollection(this);
    }

    public static String b() {
        return b;
    }

    public <T> TypeSerializerCollection a(TypeToken<T> typeToken, GE<? super T> gE) {
        this.c.add(new adk_1((TypeToken)UY.a(typeToken, ath_0.c), (GE)UY.b(gE), null));
        MapInvoker.d(this.e);
        return this;
    }
}


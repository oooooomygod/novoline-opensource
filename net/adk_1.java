/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.reflect.TypeToken
 */
package net;

import com.google.common.reflect.TypeToken;
import java.util.function.Predicate;
import net.GE;
import net.abo_0;
import net.aso_2;

/*
 * Renamed from net.adK
 */
class adk_1 {
    private Predicate<TypeToken<?>> a;
    private GE<?> b;

    private adk_1(Predicate<TypeToken<?>> predicate, GE<?> gE) {
        this.a = predicate;
        this.b = gE;
    }

    adk_1(Predicate predicate, GE gE, abo_0 abo_02) {
        this(predicate, gE);
    }

    static Predicate a(adk_1 adk_12) {
        return adk_12.a;
    }

    static GE b(adk_1 adk_12) {
        return adk_12.b;
    }

    private adk_1(TypeToken<?> typeToken, GE<?> gE) {
        this(new aso_2(typeToken), gE);
    }

    adk_1(TypeToken typeToken, GE gE, abo_0 abo_02) {
        this(typeToken, gE);
    }
}


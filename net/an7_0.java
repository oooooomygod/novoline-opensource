/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 */
package net;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

/*
 * Renamed from net.an7
 */
public class an7_0 {
    public static Predicate a(Object object) {
        return Predicates.equalTo((Object)object);
    }

    public static Predicate a(Predicate predicate, Predicate predicate2) {
        return Predicates.and((Predicate)predicate, (Predicate)predicate2);
    }

    public static Predicate a(Predicate[] predicateArray) {
        return Predicates.and((Predicate[])predicateArray);
    }

    public static Predicate a() {
        return Predicates.alwaysTrue();
    }

    public static Predicate a(Iterable iterable) {
        return Predicates.and((Iterable)iterable);
    }

    public static Predicate b() {
        return Predicates.notNull();
    }
}


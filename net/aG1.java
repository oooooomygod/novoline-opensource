/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Collections2
 */
package net;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import java.util.Collection;

public class aG1 {
    public static Collection a(Collection collection, Predicate predicate) {
        return Collections2.filter((Collection)collection, (Predicate)predicate);
    }

    public static Collection a(Collection collection, Function function) {
        return Collections2.transform((Collection)collection, (Function)function);
    }
}


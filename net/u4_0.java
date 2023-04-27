/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import java.util.Iterator;
import net.a8Z;
import net.ad__0;
import net.ql_1;
import net.u2_0;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.u4
 */
class u4_0
extends u2_0 {
    @Override
    public <T extends ad__0> @NonNull Iterator<a8Z<T>> b(@NonNull T t) {
        return new ql_1<T>(t);
    }

    u4_0() {
    }
}


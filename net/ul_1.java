/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import java.util.Iterator;
import net.a8Z;
import net.aDX;
import net.ad__0;
import net.u2_0;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.uL
 */
class ul_1
extends u2_0 {
    @Override
    public <T extends ad__0> @NonNull Iterator<a8Z<T>> b(@NonNull T t) {
        return new aDX<T>(t);
    }

    ul_1() {
    }
}


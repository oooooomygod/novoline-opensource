/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import java.lang.ref.WeakReference;
import net.abh_1;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.acX
 */
public class acx_0 {
    private static @NonNull WeakReference<?> a = new WeakReference<Object>(null);

    public static <T> WeakReference<T> a() {
        return a;
    }

    private acx_0() {
        throw new UnsupportedOperationException(abh_1.a);
    }
}


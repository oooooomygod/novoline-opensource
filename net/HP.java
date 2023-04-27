/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import java.util.function.Function;
import net.HZ;
import org.checkerframework.checker.nullness.qual.NonNull;

public class HP<T>
extends HZ<T> {
    static <T> @NonNull HP<T> a(@NonNull Function<T, String> function) {
        return new HP<T>(function);
    }

    protected HP(@NonNull Function<T, String> function) {
        super(function);
    }
}


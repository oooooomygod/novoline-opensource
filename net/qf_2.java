/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package net;

import java.util.function.Supplier;
import net.ED;
import net.a4K;
import net.am2_0;
import net.api_0;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.qf
 */
public interface qf_2<T>
extends Supplier<T> {
    @Override
    public T get();

    public boolean a();

    public static <T> qf_2<T> d(@NotNull Supplier<T> supplier) {
        return new ED<T>(supplier);
    }

    public static <T> qf_2<T> b(@NotNull Supplier<T> supplier) {
        return new am2_0<T>(supplier);
    }

    public static <T> qf_2<T> a(@NotNull Supplier<T> supplier) {
        return new a4K<T>(supplier);
    }

    public static <T> qf_2<T> c(@NotNull Supplier<T> supplier) {
        return new api_0<T>(supplier);
    }
}


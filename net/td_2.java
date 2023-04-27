/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import net.ko_0;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.td
 */
public class td_2
implements ko_0<Object> {
    private @NonNull String a;

    @Override
    public String a(Object object) {
        return this.a;
    }

    private td_2(@NonNull String string) {
        this.a = string;
    }

    static @NonNull td_2 a(@NonNull String string) {
        return new td_2(string);
    }
}


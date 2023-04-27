/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package net;

import java.util.function.Consumer;
import net.P8;
import net.a2i_0;
import net.aan_1;
import net.agc_2;
import net.ant_0;
import org.checkerframework.checker.nullness.qual.Nullable;

public class a28
extends a2i_0 {
    private @Nullable Consumer<Integer> h;

    public a28(@Nullable agc_2 agc_22, int n, int n2, @Nullable Consumer<Integer> consumer) {
        super(agc_22, n, n2);
        this.h = consumer;
    }

    public a28(@Nullable agc_2 agc_22, int n, int n2) {
        this(agc_22, n, n2, null);
    }

    public a28(@Nullable agc_2 agc_22, int n, int n2, int n3, int n4, @Nullable Consumer<Integer> consumer) {
        super(agc_22, n, n2, n3, n4);
        this.h = consumer;
    }

    @Override
    public void e(int n) {
        ant_0.b();
        if (this.h != null) {
            aan_1.a(this.h, P8.d(n));
        }
    }

    public a28(@Nullable agc_2 agc_22, int n, int n2, int n3, int n4) {
        this(agc_22, n, n2, n3, n4, null);
    }
}


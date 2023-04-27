/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package net.skidunion;

import java.util.function.Consumer;
import kotlin.Metadata;
import net.a4Y;
import net.kt_2;
import net.skidunion.Q;
import net.skidunion.aP;
import net.skidunion.ap_0;
import net.skidunion.g_0;
import net.yc_1;
import net.zx_2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J(\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0003"}, d2={"Lnet/net.skidunion/N;", "Lnet/net.skidunion/g;", "", "b", "Lnet/net.skidunion/aP;", "a", "Lnet/net.skidunion/ap;", "(Lnet/net.skidunion/aP;Lnet/net.skidunion/ap;)V", "a", "()Lnet/net.skidunion/aP;", "a", "", "successCallback", "Ljava/util/function/Consumer;", "failureCallback", ""})
public class N
implements g_0<Object> {
    private ap_0 a;
    @NotNull
    private aP b;

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    @NotNull
    public aP a() {
        return this.b;
    }

    @Override
    public void a(@Nullable Consumer<Object> consumer) {
        a4Y.a(this, consumer);
    }

    @Override
    public void a(@Nullable Consumer<Object> consumer, @Nullable Consumer<Throwable> consumer2) throws IllegalStateException {
        Q.b();
        if (consumer != null || consumer2 != null) {
            throw (Throwable)new IllegalStateException(kt_2.c);
        }
        yc_1.a(this.b, this.a);
    }

    public N(@NotNull aP aP10, @NotNull ap_0 ap_02) {
        zx_2.b((Object)aP10, kt_2.a);
        zx_2.b(ap_02, kt_2.b);
        this.b = aP10;
        this.a = ap_02;
    }

    @Override
    public void a() {
        a4Y.a(this);
    }
}


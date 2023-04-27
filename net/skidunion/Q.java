/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package net.skidunion;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.SystemInvoker;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import kotlin.Metadata;
import net.HU;
import net.a4Y;
import net.ahj_0;
import net.anp_0;
import net.av9_0;
import net.lx_2;
import net.skidunion.H;
import net.skidunion.M;
import net.skidunion.aP;
import net.skidunion.aj;
import net.skidunion.ap_0;
import net.skidunion.c_0;
import net.skidunion.g_0;
import net.skidunion.m_0;
import net.yc_1;
import net.zx_2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0016\u0010!\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0002J\r\u0010%\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u0014J(\u0010&\u001a\u00020\"2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010(2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010(H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0004\u0018\u00018\u0000X\u0080\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006\u0003"}, d2={"Lnet/net.skidunion/Q;", "T", "Lnet/net.skidunion/g;", "f", "Lnet/net.skidunion/aP;", "d", "Lnet/net.skidunion/ap;", "b", "Lnet/net.skidunion/aj;", "(Lnet/net.skidunion/aP;Lnet/net.skidunion/ap;Lnet/net.skidunion/aj;)V", "c", "", "a", "()Ljava/lang/Throwable;", "a", "(Ljava/lang/Throwable;)V", "i", "Lnet/net.skidunion/m;", "h", "d", "()Ljava/lang/Object;", "a", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "a", "", "Ljava/lang/Long;", "e", "Ljava/util/concurrent/CountDownLatch;", "e", "()Ljava/util/concurrent/CountDownLatch;", "a", "(Ljava/util/concurrent/CountDownLatch;)V", "a", "", "request", "Lnet/net.skidunion/c;", "c", "a", "successCallback", "Ljava/util/function/Consumer;", "failureCallback"})
public class Q<T>
implements g_0<T> {
    @Nullable
    private T h;
    private aj b;
    @NotNull
    public CountDownLatch e;
    private ap_0 d;
    @NotNull
    public Throwable c;
    private m_0 i;
    private Long a;
    private aP f;
    private static String[] g;

    public void a(@NotNull CountDownLatch countDownLatch) {
        zx_2.b(countDownLatch, ahj_0.f);
        this.e = countDownLatch;
    }

    @Override
    public void a() {
        a4Y.a(this);
    }

    private static Throwable b(Throwable throwable) {
        return throwable;
    }

    @Override
    public void a(@Nullable Consumer<T> consumer, @Nullable Consumer<Throwable> consumer2) {
        Q.b();
        if (yc_1.h(this.f) || anp_0.a(this.d) == M.LOGIN) {
            c_0<T> c_02 = new c_0<T>(consumer, consumer2, this.d, this.b);
            this.a(c_02);
            yc_1.a(this.f, this.d);
        }
        throw (Throwable)this.i;
    }

    @NotNull
    public Throwable a() {
        Throwable throwable = this.c;
        if (throwable == null) {
            zx_2.a(ahj_0.i);
        }
        return throwable;
    }

    public static void b(String[] stringArray) {
        g = stringArray;
    }

    public void a(@NotNull Throwable throwable) {
        zx_2.b(throwable, ahj_0.c);
        this.c = throwable;
    }

    @NotNull
    public CountDownLatch e() {
        CountDownLatch countDownLatch = this.e;
        if (countDownLatch == null) {
            zx_2.a(ahj_0.d);
        }
        return countDownLatch;
    }

    @Nullable
    public T d() {
        return this.h;
    }

    public void a(@Nullable T t) {
        this.h = t;
    }

    @Override
    public void a(@Nullable Consumer<T> consumer) {
        a4Y.a(this, consumer);
    }

    public static String[] b() {
        return g;
    }

    public Q(@NotNull aP aP10, @NotNull ap_0 ap_02, @NotNull aj aj10) {
        zx_2.b((Object)aP10, ahj_0.e);
        Q.b();
        zx_2.b(ap_02, ahj_0.a);
        zx_2.b(aj10, ahj_0.h);
        this.f = aP10;
        this.d = ap_02;
        this.b = aj10;
        this.i = new m_0();
        this.a = lx_2.b(SystemInvoker.nanoTime());
        anp_0.a(this.d, this.a);
        if (ListInvoker.b() != null) {
            Q.b(new String[1]);
        }
    }

    @Nullable
    public T c() throws H {
        Q.b();
        if (yc_1.h(this.f) || anp_0.a(this.d) == M.LOGIN) {
            c_0 c_02 = new c_0(this.d, this.b, this);
            this.a(c_02);
            yc_1.a(this.f, this.d);
            CountDownLatch countDownLatch = this.e = new CountDownLatch(1);
            if (countDownLatch == null) {
                zx_2.a(ahj_0.b);
            }
            av9_0.a(countDownLatch, 5L, TimeUnit.SECONDS);
            if (this.c != null) {
                Throwable throwable = this.c;
                if (throwable == null) {
                    zx_2.a(ahj_0.g);
                }
                throw throwable;
            }
            ListInvoker.b(new ListInvoker[4]);
            return this.h;
        }
        throw (Throwable)this.i;
    }

    static {
        if (Q.b() == null) {
            Q.b(new String[5]);
        }
    }

    @Override
    private void a(c_0<T> c_02) {
        HU.a(yc_1.f(this.f), c_02);
    }
}


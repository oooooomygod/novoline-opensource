/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package net.skidunion;

import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.aL0;
import net.ez_0;
import net.skidunion.Q;
import net.skidunion.aj;
import net.skidunion.ap_0;
import net.zx_2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from net.net.skidunion.c
 */
@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b\u00a2\u0006\u0002\u0010\tB9\b\u0016\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u000eBS\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b\u00a2\u0006\u0002\u0010\u0011J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bH\u00c6\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010!\u001a\u00020\u0010H\u00c6\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\bH\u00c6\u0003Je\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\bH\u00c6\u0001J\u0013\u0010$\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010&\u001a\u00020'H\u00d6\u0001J\t\u0010(\u001a\u00020)H\u00d6\u0001R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017\u00a8\u0006*"}, d2={"Lnet/net.skidunion/c;", "T", "", "h", "Lnet/net.skidunion/ap;", "e", "Lnet/net.skidunion/aj;", "d", "Lnet/net.skidunion/Q;", "(Lnet/net.skidunion/ap;Lnet/net.skidunion/aj;Lnet/net.skidunion/Q;)V", "c", "Ljava/util/function/Consumer;", "f", "", "(Ljava/util/function/Consumer;Ljava/util/function/Consumer;Lnet/net.skidunion/ap;Lnet/net.skidunion/aj;)V", "g", "", "(Ljava/util/function/Consumer;Ljava/util/function/Consumer;Lnet/net.skidunion/ap;Lnet/net.skidunion/aj;ZLnet/net.skidunion/Q;)V", "i", "()Lnet/net.skidunion/Q;", "f", "()Z", "l", "()Ljava/util/function/Consumer;", "e", "()Lnet/net.skidunion/aj;", "g", "()Lnet/net.skidunion/ap;", "h", "d", "j", "c", "n", "o", "m", "a", "equals", "other", "hashCode", "", "toString", "", "client"})
public class c_0<T> {
    @Nullable
    private Consumer<Throwable> f;
    @Nullable
    private Consumer<T> c;
    @Nullable
    private aj e;
    private static boolean b;
    @NotNull
    private ap_0 h;
    private boolean g;
    @Nullable
    private Q<T> d;

    @NotNull
    public ap_0 c() {
        return this.h;
    }

    public static boolean k() {
        c_0.b();
        return true;
    }

    @Nullable
    public Consumer<T> d() {
        return this.c;
    }

    public static boolean b() {
        return b;
    }

    @Nullable
    public Consumer<Throwable> j() {
        return this.f;
    }

    public boolean f() {
        return this.g;
    }

    public int hashCode() {
        c_0.b();
        Consumer<T> consumer = this.c;
        Consumer<Throwable> consumer2 = this.f;
        ap_0 ap_02 = this.h;
        aj aj10 = this.e;
        int n = ((((consumer != null ? consumer.hashCode() : 0) * 31 + (consumer2 != null ? consumer2.hashCode() : 0)) * 31 + (ap_02 != null ? ap_02.hashCode() : 0)) * 31 + (aj10 != null ? aj10.hashCode() : 0)) * 31;
        int n2 = this.g ? 1 : 0;
        if (n2 != 0) {
            n2 = 1;
        }
        Q<T> q = this.d;
        return (n + n2) * 31 + (q != null ? q.hashCode() : 0);
    }

    @Nullable
    public aj e() {
        return this.e;
    }

    @Nullable
    public aj n() {
        return this.e;
    }

    @Nullable
    public Q<T> i() {
        return this.d;
    }

    public boolean o() {
        return this.g;
    }

    public boolean equals(@Nullable Object object) {
        block3: {
            block2: {
                c_0.b();
                if (this == object) break block2;
                if (!(object instanceof c_0)) break block3;
                c_0 c_02 = (c_0)object;
                if (!zx_2.a(this.c, c_02.c) || !zx_2.a(this.f, c_02.f) || !zx_2.a((Object)this.h, c_02.h) || !zx_2.a((Object)this.e, c_02.e) || this.g != c_02.g || !zx_2.a(this.d, c_02.d)) break block3;
            }
            return true;
        }
        return false;
    }

    @NotNull
    public c_0<T> a(@Nullable Consumer<T> consumer, @Nullable Consumer<Throwable> consumer2, @NotNull ap_0 ap_02, @Nullable aj aj10, boolean bl, @Nullable Q<T> q) {
        zx_2.b(ap_02, ez_0.k);
        return new c_0<T>(consumer, consumer2, ap_02, aj10, bl, q);
    }

    @NotNull
    public ap_0 g() {
        return this.h;
    }

    @Nullable
    public Consumer<T> h() {
        return this.c;
    }

    public c_0(@Nullable Consumer<T> consumer, @Nullable Consumer<Throwable> consumer2, @NotNull ap_0 ap_02, @Nullable aj aj10) {
        zx_2.b(ap_02, ez_0.c);
        this(consumer, consumer2, ap_02, aj10, true, null, 32, null);
    }

    static {
        if (c_0.k()) {
            c_0.b(true);
        }
    }

    public static void b(boolean bl) {
        b = bl;
    }

    @NotNull
    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), ez_0.e), this.c), ez_0.f), this.f), ez_0.d), this.h), ez_0.b), this.e), ez_0.i), this.g), ez_0.g), this.d), ez_0.j).toString();
    }

    @Nullable
    public Consumer<Throwable> l() {
        return this.f;
    }

    public c_0(@Nullable Consumer<T> consumer, @Nullable Consumer<Throwable> consumer2, @NotNull ap_0 ap_02, @Nullable aj aj10, boolean bl, @Nullable Q<T> q) {
        zx_2.b(ap_02, ez_0.h);
        this.c = consumer;
        this.f = consumer2;
        this.h = ap_02;
        this.e = aj10;
        this.g = bl;
        this.d = q;
    }

    @Nullable
    public Q<T> m() {
        return this.d;
    }

    public /* synthetic */ c_0(Consumer consumer, Consumer consumer2, ap_0 ap_02, aj aj10, boolean bl, Q q, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x10) != 0) {
            bl = true;
        }
        if ((n & 0x20) != 0) {
            q = null;
        }
        this(consumer, consumer2, ap_02, aj10, bl, q);
    }

    public static /* synthetic */ c_0 a(c_0 c_02, Consumer consumer, Consumer consumer2, ap_0 ap_02, aj aj10, boolean bl, Q q, int n, Object object) {
        c_0.b();
        if ((n & 1) != 0) {
            consumer = c_02.c;
        }
        if ((n & 2) != 0) {
            consumer2 = c_02.f;
        }
        if ((n & 4) != 0) {
            ap_02 = c_02.h;
        }
        if ((n & 8) != 0) {
            aj10 = c_02.e;
        }
        if ((n & 0x10) != 0) {
            bl = c_02.g;
        }
        if ((n & 0x20) != 0) {
            q = c_02.d;
        }
        return c_02.a(consumer, consumer2, ap_02, aj10, bl, q);
    }

    public c_0(@NotNull ap_0 ap_02, @Nullable aj aj10, @Nullable Q<T> q) {
        zx_2.b(ap_02, ez_0.a);
        this(null, null, ap_02, aj10, false, q);
    }
}


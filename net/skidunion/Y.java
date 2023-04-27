/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package net.skidunion;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import net.aL0;
import net.mu_2;
import net.skidunion.K;
import net.skidunion.V;
import net.zx_2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J)\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001b"}, d2={"Lnet/net.skidunion/Y;", "", "c", "", "h", "Lnet/net.skidunion/V;", "a", "Lnet/net.skidunion/K;", "(Ljava/lang/String;Lnet/net.skidunion/V;Lnet/net.skidunion/K;)V", "h", "()Lnet/net.skidunion/V;", "e", "()Lnet/net.skidunion/K;", "a", "(Lnet/net.skidunion/K;)V", "c", "()Ljava/lang/String;", "f", "a", "d", "a", "equals", "", "other", "hashCode", "", "toString", "client"})
public class Y {
    private static int d;
    @SerializedName(value="username")
    @NotNull
    private String c;
    @SerializedName(value="rank")
    @NotNull
    private V b;
    @SerializedName(value="serverData")
    @Nullable
    private K a;

    public void a(@Nullable K k) {
        this.a = k;
    }

    public int hashCode() {
        Y.h();
        String string = this.c;
        V v = this.b;
        K k = this.a;
        return ((string != null ? string.hashCode() : 0) * 31 + (v != null ? ((Object)v).hashCode() : 0)) * 31 + (k != null ? ((Object)k).hashCode() : 0);
    }

    public static int h() {
        Y.g();
        return 108;
    }

    public static /* synthetic */ Y a(Y y, String string, V v, K k, int n, Object object) {
        Y.h();
        if ((n & 1) != 0) {
            string = y.c;
        }
        if ((n & 2) != 0) {
            v = y.b;
        }
        if ((n & 4) != 0) {
            k = y.a;
        }
        return y.a(string, v, k);
    }

    public Y(@NotNull String string, @NotNull V v, @Nullable K k) {
        zx_2.b(string, mu_2.f);
        zx_2.b(v, mu_2.g);
        this.c = string;
        this.b = v;
        this.a = k;
    }

    @NotNull
    public V a() {
        return this.b;
    }

    @Nullable
    public K e() {
        return this.a;
    }

    public static int g() {
        return d;
    }

    static {
        if (Y.h() != 0) {
            Y.b(117);
        }
    }

    @NotNull
    public String f() {
        return this.c;
    }

    @Nullable
    public K d() {
        return this.a;
    }

    public boolean equals(@Nullable Object object) {
        block3: {
            block2: {
                Y.h();
                if (this == object) break block2;
                if (!(object instanceof Y)) break block3;
                Y y = (Y)object;
                if (!zx_2.a((Object)this.c, (Object)y.c) || !zx_2.a((Object)this.b, y.b) || !zx_2.a((Object)this.a, y.a)) break block3;
            }
            return true;
        }
        return false;
    }

    @NotNull
    public String c() {
        return this.c;
    }

    @NotNull
    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), mu_2.e), this.c), mu_2.a), this.b), mu_2.h), this.a), mu_2.c).toString();
    }

    @NotNull
    public Y a(@NotNull String string, @NotNull V v, @Nullable K k) {
        zx_2.b(string, mu_2.b);
        zx_2.b(v, mu_2.d);
        return new Y(string, v, k);
    }

    public static void b(int n) {
        d = n;
    }

    @NotNull
    public V b() {
        return this.b;
    }
}


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
import net.P8;
import net.aL0;
import net.auj_1;
import net.skidunion.Y;
import net.zx_2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2={"Lnet/net.skidunion/V;", "", "a", "", "b", "", "(Ljava/lang/String;I)V", "a", "()Ljava/lang/String;", "d", "()I", "b", "c", "a", "equals", "", "other", "hashCode", "toString", "client"})
public class V {
    @SerializedName(value="name")
    @NotNull
    private String a;
    private transient int b;

    public int c() {
        return this.b;
    }

    public V(@NotNull String string, int n) {
        zx_2.b(string, auj_1.d);
        this.a = string;
        this.b = n;
    }

    @NotNull
    public String toString() {
        return aL0.a(aL0.c(aL0.a(aL0.a(aL0.a(new StringBuilder(), auj_1.a), this.a), auj_1.c), this.b), auj_1.b).toString();
    }

    public boolean equals(@Nullable Object object) {
        block3: {
            block2: {
                Y.h();
                if (this == object) break block2;
                if (!(object instanceof V)) break block3;
                V v = (V)object;
                if (!zx_2.a((Object)this.a, (Object)v.a) || this.b != v.b) break block3;
            }
            return true;
        }
        return false;
    }

    @NotNull
    public String b() {
        return this.a;
    }

    @NotNull
    public String a() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public int hashCode() {
        String string = this.a;
        return (string != null ? string.hashCode() : 0) * 31 + P8.c(this.b);
    }

    @NotNull
    public V a(@NotNull String string, int n) {
        zx_2.b(string, auj_1.e);
        return new V(string, n);
    }

    public static /* synthetic */ V a(V v, String string, int n, int n2, Object object) {
        Y.h();
        if ((n2 & 1) != 0) {
            string = v.a;
        }
        if ((n2 & 2) != 0) {
            n = v.b;
        }
        return v.a(string, n);
    }
}


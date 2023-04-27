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
import net.J3;
import net.aL0;
import net.skidunion.Y;
import net.skidunion.k_0;
import net.zx_2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2={"Lnet/net.skidunion/K;", "", "b", "", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "b", "()Ljava/lang/String;", "a", "d", "e", "a", "equals", "", "other", "hashCode", "", "toString", "c", "client"})
public class K {
    @SerializedName(value="serverIp")
    @Nullable
    private String a;
    private static K d;
    public static k_0 c;
    @SerializedName(value="inGameName")
    @Nullable
    private String b;

    @NotNull
    public K a(@Nullable String string, @Nullable String string2) {
        return new K(string, string2);
    }

    public static K c() {
        return d;
    }

    public int hashCode() {
        Y.h();
        String string = this.b;
        String string2 = this.a;
        return (string != null ? string.hashCode() : 0) * 31 + (string2 != null ? string2.hashCode() : 0);
    }

    public static K a(K k, String string, String string2, int n, Object object) {
        Y.g();
        if ((n & 1) != 0) {
            string = k.b;
        }
        if ((n & 2) != 0) {
            string2 = k.a;
        }
        return k.a(string, string2);
    }

    static {
        c = new k_0(null);
        d = new K(null, null);
    }

    public K(@Nullable String string, @Nullable String string2) {
        this.b = string;
        this.a = string2;
    }

    @Nullable
    public String b() {
        return this.b;
    }

    public boolean equals(@Nullable Object object) {
        block3: {
            block2: {
                Y.g();
                if (this == object) break block2;
                if (!(object instanceof K)) break block3;
                K k = (K)object;
                if (!zx_2.a((Object)this.b, (Object)k.b) || !zx_2.a((Object)this.a, (Object)k.a)) break block3;
            }
            return true;
        }
        return false;
    }

    @NotNull
    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), J3.b), this.b), J3.c), this.a), J3.a).toString();
    }

    @Nullable
    public String e() {
        return this.a;
    }

    @Nullable
    public String a() {
        return this.a;
    }

    @Nullable
    public String d() {
        return this.b;
    }
}


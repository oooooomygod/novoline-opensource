/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package net.skidunion;

import kotlin.Metadata;
import net.aL0;
import net.agd_0;
import net.ape_0;
import net.axr_2;
import net.skidunion.Y;
import net.skidunion.aP;
import net.yc_1;
import net.zx_2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from net.net.skidunion.b
 */
@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u0015\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u000f\u001a\u00020\tH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2={"Lnet/net.skidunion/b;", "", "username", "", "a", "ircClient", "Lnet/net.skidunion/aP;", "(Ljava/lang/String;Ljava/lang/String;Lnet/net.skidunion/aP;)V", "b", "Lnet/net.skidunion/Y;", "(Lnet/net.skidunion/Y;Ljava/lang/String;)V", "b", "()Lnet/net.skidunion/Y;", "d", "()Ljava/lang/String;", "a", "c", "a", "equals", "", "other", "hashCode", "", "toString", "client"})
public class b_0 {
    @NotNull
    private Y b;
    @NotNull
    private String a;

    @NotNull
    public b_0 a(@NotNull Y y, @NotNull String string) {
        zx_2.b(y, axr_2.g);
        zx_2.b(string, axr_2.c);
        return new b_0(y, string);
    }

    @NotNull
    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), axr_2.e), this.b), axr_2.k), this.a), axr_2.h).toString();
    }

    public b_0(@NotNull Y y, @NotNull String string) {
        zx_2.b(y, axr_2.j);
        zx_2.b(string, axr_2.f);
        this.b = y;
        this.a = string;
    }

    @NotNull
    public Y b() {
        return this.b;
    }

    public boolean equals(@Nullable Object object) {
        block3: {
            block2: {
                Y.h();
                if (this == object) break block2;
                if (!(object instanceof b_0)) break block3;
                b_0 b_02 = (b_0)object;
                if (!zx_2.a((Object)this.b, b_02.b) || !zx_2.a((Object)this.a, (Object)b_02.a)) break block3;
            }
            return true;
        }
        return false;
    }

    @NotNull
    public String c() {
        return this.a;
    }

    public b_0(@NotNull String string, @NotNull String string2, @NotNull aP aP10) {
        zx_2.b(string, axr_2.i);
        zx_2.b(string2, axr_2.a);
        zx_2.b((Object)aP10, axr_2.b);
        Object object = ape_0.b(agd_0.b(yc_1.d(aP10)), string);
        if (object == null) {
            zx_2.c();
        }
        zx_2.a(object, axr_2.d);
        this((Y)object, string2);
    }

    @NotNull
    public String d() {
        return this.a;
    }

    public int hashCode() {
        Y.h();
        Y y = this.b;
        String string = this.a;
        return (y != null ? ((Object)y).hashCode() : 0) * 31 + (string != null ? string.hashCode() : 0);
    }

    @NotNull
    public Y a() {
        return this.b;
    }

    public static /* synthetic */ b_0 a(b_0 b_02, Y y, String string, int n, Object object) {
        Y.h();
        if ((n & 1) != 0) {
            y = b_02.b;
        }
        if ((n & 2) != 0) {
            string = b_02.a;
        }
        return b_02.a(y, string);
    }
}


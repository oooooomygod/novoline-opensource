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

import cc.novoline.invoke.ListInvoker;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import net.aL0;
import net.aow_1;
import net.skidunion.Y;
import net.skidunion.e_0;
import net.zx_2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from net.net.skidunion.af
 */
@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0017\u001a\u00020\bH\u00c6\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f\u00a8\u0006\u001f"}, d2={"Lnet/net.skidunion/af;", "", "d", "", "e", "b", "Lnet/net.skidunion/Y;", "c", "Lnet/net.skidunion/e;", "a", "(Ljava/lang/String;Ljava/lang/String;Lnet/net.skidunion/Y;Lnet/net.skidunion/e;Lnet/net.skidunion/e;)V", "g", "()Lnet/net.skidunion/e;", "j", "()Ljava/lang/String;", "a", "d", "()Lnet/net.skidunion/Y;", "i", "b", "e", "f", "h", "c", "a", "equals", "", "other", "hashCode", "", "toString", "client"})
public class af_0 {
    @SerializedName(value="name")
    @NotNull
    private String d;
    @SerializedName(value="data")
    @NotNull
    private String e;
    @SerializedName(value="updateDate")
    @NotNull
    private e_0 a;
    @SerializedName(value="owner")
    @NotNull
    private Y b;
    @SerializedName(value="creationDate")
    @NotNull
    private e_0 c;

    @NotNull
    public e_0 i() {
        return this.a;
    }

    @NotNull
    public e_0 h() {
        return this.c;
    }

    public int hashCode() {
        Y.g();
        String string = this.d;
        String string2 = this.e;
        Y y = this.b;
        e_0 e_02 = this.c;
        e_0 e_03 = this.a;
        int n = ((((string != null ? string.hashCode() : 0) * 31 + (string2 != null ? string2.hashCode() : 0)) * 31 + (y != null ? ((Object)y).hashCode() : 0)) * 31 + (e_02 != null ? ((Object)e_02).hashCode() : 0)) * 31 + (e_03 != null ? ((Object)e_03).hashCode() : 0);
        ListInvoker.b(new ListInvoker[3]);
        return n;
    }

    @NotNull
    public e_0 c() {
        return this.a;
    }

    @NotNull
    public af_0 a(@NotNull String string, @NotNull String string2, @NotNull Y y, @NotNull e_0 e_02, @NotNull e_0 e_03) {
        zx_2.b(string, aow_1.i);
        zx_2.b(string2, aow_1.g);
        zx_2.b(y, aow_1.j);
        zx_2.b(e_02, aow_1.a);
        zx_2.b(e_03, aow_1.o);
        return new af_0(string, string2, y, e_02, e_03);
    }

    @NotNull
    public Y d() {
        return this.b;
    }

    @NotNull
    public String j() {
        return this.e;
    }

    public static /* synthetic */ af_0 a(af_0 af_02, String string, String string2, Y y, e_0 e_02, e_0 e_03, int n, Object object) {
        Y.g();
        if ((n & 1) != 0) {
            string = af_02.d;
        }
        if ((n & 2) != 0) {
            string2 = af_02.e;
        }
        if ((n & 4) != 0) {
            y = af_02.b;
        }
        if ((n & 8) != 0) {
            e_02 = af_02.c;
        }
        if ((n & 0x10) != 0) {
            e_03 = af_02.a;
        }
        return af_02.a(string, string2, y, e_02, e_03);
    }

    @NotNull
    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aow_1.h), this.d), aow_1.p), this.e), aow_1.b), this.b), aow_1.f), this.c), aow_1.l), this.a), aow_1.d).toString();
    }

    public af_0(@NotNull String string, @NotNull String string2, @NotNull Y y, @NotNull e_0 e_02, @NotNull e_0 e_03) {
        zx_2.b(string, aow_1.c);
        zx_2.b(string2, aow_1.k);
        zx_2.b(y, aow_1.e);
        zx_2.b(e_02, aow_1.n);
        zx_2.b(e_03, aow_1.m);
        int n = Y.h();
        this.d = string;
        int n2 = n;
        this.e = string2;
        this.b = y;
        this.c = e_02;
        this.a = e_03;
        if (ListInvoker.b() != null) {
            Y.b(++n2);
        }
    }

    @NotNull
    public String b() {
        return this.d;
    }

    public boolean equals(@Nullable Object object) {
        block3: {
            block2: {
                Y.h();
                if (this == object) break block2;
                if (!(object instanceof af_0)) break block3;
                af_0 af_02 = (af_0)object;
                if (!zx_2.a((Object)this.d, (Object)af_02.d) || !zx_2.a((Object)this.e, (Object)af_02.e) || !zx_2.a((Object)this.b, af_02.b) || !zx_2.a((Object)this.c, af_02.c) || !zx_2.a((Object)this.a, af_02.a)) break block3;
            }
            return true;
        }
        return false;
    }

    @NotNull
    public Y f() {
        return this.b;
    }

    @NotNull
    public String e() {
        return this.e;
    }

    @NotNull
    public String a() {
        return this.d;
    }

    @NotNull
    public e_0 g() {
        return this.c;
    }
}


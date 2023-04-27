/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package net.skidunion;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import net.U5;
import net.aL0;
import net.lx_2;
import net.skidunion.S;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from net.net.skidunion.e
 */
@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u001d"}, d2={"Lnet/net.skidunion/e;", "", "a", "", "(J)V", "d", "()J", "a", "a", "equals", "", "other", "", "hashCode", "", "i", "", "f", "", "h", "", "b", "", "g", "c", "e", "", "toString", "", "client"})
public class e_0
extends Number {
    @Expose
    @SerializedName(value="$numberLong")
    private long a;

    public float b() {
        return this.a;
    }

    public long a() {
        return this.a;
    }

    public short e() {
        return (short)this.a;
    }

    public char f() {
        return (char)this.a;
    }

    @NotNull
    public e_0 a(long l4) {
        return new e_0(l4);
    }

    @NotNull
    public String toString() {
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), U5.b), this.a), U5.a).toString();
    }

    public e_0(long l4) {
        this.a = l4;
    }

    public double h() {
        return this.a;
    }

    public int hashCode() {
        return lx_2.a(this.a);
    }

    public long d() {
        return this.a;
    }

    public long c() {
        return this.a;
    }

    public int g() {
        return (int)this.a;
    }

    public boolean equals(@Nullable Object object) {
        block3: {
            block2: {
                S.b();
                if (this == object) break block2;
                if (!(object instanceof e_0)) break block3;
                e_0 e_02 = (e_0)object;
                if (this.a != e_02.a) break block3;
            }
            return true;
        }
        return false;
    }

    public byte i() {
        return (byte)this.a;
    }

    public static /* synthetic */ e_0 a(e_0 e_02, long l4, int n, Object object) {
        if ((n & 1) != 0) {
            l4 = e_02.a;
        }
        return e_02.a(l4);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 */
package net.skidunion;

import java.util.List;
import kotlin.Metadata;
import net.aPR;
import net.skidunion.af_0;
import net.skidunion.q_0;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.net.skidunion.x
 */
@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2={"Lnet/net.skidunion/x;", "Lnet/net.skidunion/q;", "b", "", "Lnet/net.skidunion/af;", "(Ljava/util/List;)V", "b", "()Ljava/util/List;", "client"})
public class x_0
extends q_0 {
    private static String[] d;
    @NotNull
    private List<af_0> a;

    public static String[] b() {
        return d;
    }

    public x_0(@NotNull List<af_0> list) {
        zx_2.b(list, aPR.a);
        this.a = list;
    }

    public static void b(String[] stringArray) {
        d = stringArray;
    }

    static {
        if (x_0.b() == null) {
            x_0.b(new String[3]);
        }
    }

    @NotNull
    public List<af_0> a() {
        return this.a;
    }
}


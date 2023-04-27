/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 */
package net.skidunion;

import cc.novoline.invoke.ListInvoker;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import net.HU;
import net.OV;
import net.dh_0;
import net.dz_0;
import net.he_1;
import net.skidunion.O;
import net.skidunion.q_0;
import net.uh_2;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2={"Lnet/net.skidunion/aG;", "", "()V", "a", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lnet/net.skidunion/O;", "a", "", "event", "Lnet/net.skidunion/q;", "b", "listener", "a", "client"})
public class aG {
    private CopyOnWriteArrayList<O> a = new CopyOnWriteArrayList();

    public void a(@NotNull q_0 q_02) {
        zx_2.b(q_02, he_1.c);
        q_0.d();
        Iterable iterable = this.a;
        Iterator iterator = OV.a(iterable);
        if (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            O o = (O)object;
            uh_2.a(o, q_02);
            if (dh_0.a(q_02)) {
                return;
            }
            ListInvoker.b(new ListInvoker[1]);
        }
    }

    public void b(@NotNull O o) {
        zx_2.b(o, he_1.b);
        HU.a(this.a, o);
    }

    public void a(@NotNull O o) {
        zx_2.b(o, he_1.a);
        HU.b(this.a, o);
    }
}


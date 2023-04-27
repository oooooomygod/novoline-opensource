/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package net.skidunion;

import cc.novoline.invoke.MapInvoker;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import net.OV;
import net.a2E;
import net.aB1;
import net.alh_0;
import net.ape_0;
import net.dz_0;
import net.skidunion.K;
import net.skidunion.Y;
import net.skidunion.aP;
import net.th_1;
import net.yc_1;
import net.zx_2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\u0007R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\n\u00a8\u0006\u0016"}, d2={"Lnet/net.skidunion/aZ;", "", "c", "Lnet/net.skidunion/aP;", "(Lnet/net.skidunion/aP;)V", "b", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lnet/net.skidunion/Y;", "c", "()Ljava/util/concurrent/ConcurrentHashMap;", "d", "()Lnet/net.skidunion/aP;", "d", "a", "()Ljava/lang/String;", "a", "(Ljava/lang/String;)V", "a", "b", "b", "nickname", "client"})
public class aZ {
    @NotNull
    public String d;
    @NotNull
    private ConcurrentHashMap<String, Y> a;
    @NotNull
    private ConcurrentHashMap<String, Y> b;
    @NotNull
    private aP c;

    @NotNull
    public String a() {
        aP.g();
        String string = this.d;
        if (string == null) {
            zx_2.a(aB1.c);
        }
        return string;
    }

    @NotNull
    public aP d() {
        return this.c;
    }

    @NotNull
    public ConcurrentHashMap<String, Y> b() {
        return this.a;
    }

    public void a(@NotNull String string) {
        zx_2.b(string, aB1.a);
        this.d = string;
    }

    @NotNull
    public ConcurrentHashMap<String, Y> c() {
        return this.b;
    }

    @Nullable
    public Y b(@NotNull String string) {
        aP.g();
        zx_2.b(string, aB1.d);
        Object object = (Y)ape_0.b(this.b, string);
        if (object == null) {
            Object object2;
            Object object3;
            Object object4;
            block4: {
                Collection<Y> collection = this.a.values();
                zx_2.a(collection, aB1.f);
                object4 = collection;
                Iterator iterator = OV.a((Iterable)object4);
                while (dz_0.c(iterator)) {
                    object3 = dz_0.b(iterator);
                    Y y = (Y)object3;
                    K k = alh_0.b(y);
                    if (!zx_2.a((Object)th_1.a(yc_1.c(this.c), string), (Object)(k != null ? a2E.a(k) : null))) continue;
                    object2 = object3;
                    break block4;
                }
                object2 = null;
            }
            Y y = (Y)object2;
            if (y != null) {
                object4 = y;
                boolean bl = false;
                object3 = object4;
                boolean bl2 = false;
                Map map = this.b;
                Object object5 = object3;
                zx_2.a(object5, aB1.e);
                MapInvoker.c(map, string, object5);
                object = object4;
            } else {
                object = null;
            }
        }
        return object;
    }

    public aZ(@NotNull aP aP10) {
        zx_2.b((Object)aP10, aB1.b);
        this.c = aP10;
        this.a = new ConcurrentHashMap();
        this.b = new ConcurrentHashMap();
    }
}


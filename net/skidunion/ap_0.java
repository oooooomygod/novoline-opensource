/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  kotlin.Metadata
 *  kotlin.Pair
 *  org.jetbrains.annotations.NotNull
 */
package net.skidunion;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import net.FG;
import net.M0;
import net.P8;
import net.a4W;
import net.a7r_0;
import net.aS0;
import net.aXX;
import net.acU;
import net.dz_0;
import net.lx_2;
import net.skidunion.M;
import net.skidunion.aj;
import net.tt_1;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.net.skidunion.ap
 */
@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B5\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001c\u0010\u0005\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fB-\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001c\u0010\u0005\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00070\u0006\u00a2\u0006\u0002\u0010\rB-\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000fB%\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007\u00a2\u0006\u0002\u0010\u0010B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u0011J\b\u0010\u0013\u001a\u00020\bH\u0016R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2={"Lnet/net.skidunion/ap;", "Lnet/net.skidunion/aj;", "opcode", "", "(I)V", "g", "", "Lkotlin/Pair;", "", "", "packetType", "Lnet/net.skidunion/M;", "(I[Lkotlin/Pair;Lnet/net.skidunion/M;)V", "(I[Lkotlin/Pair;)V", "arg", "(ILkotlin/Pair;Lnet/net.skidunion/M;)V", "(ILkotlin/Pair;)V", "(ILnet/net.skidunion/M;)V", "", "toString", "client"})
public class ap_0
extends aj {
    private Map<String, ? extends Object> g;
    private static int h;

    public ap_0(int n, @NotNull Pair<String, ? extends Object>[] pairArray) {
        zx_2.b(pairArray, tt_1.h);
        this(n, pairArray, M.PLAY);
    }

    public ap_0(int n, @NotNull Pair<String, ? extends Object>[] pairArray, @NotNull M m3) {
        zx_2.b(pairArray, tt_1.e);
        zx_2.b((Object)m3, tt_1.b);
        this(n, m3);
        this.g = aXX.a((Pair[])a7r_0.a((Object[])pairArray, pairArray.length));
    }

    public ap_0(int n, @NotNull Pair<String, ? extends Object> pair, @NotNull M m3) {
        zx_2.b(pair, tt_1.c);
        zx_2.b((Object)m3, tt_1.i);
        this(n, m3);
        this.g = aXX.a(pair);
    }

    public static int b() {
        ap_0.a();
        return 23;
    }

    public ap_0(int n, @NotNull M m3) {
        zx_2.b((Object)m3, tt_1.a);
        super(n, m3);
    }

    static {
        if (ap_0.a() != 0) {
            ap_0.c(17);
        }
    }

    public static void c(int n) {
        h = n;
    }

    public ap_0(int n) {
        this(n, M.PLAY);
    }

    public static int a() {
        return h;
    }

    public ap_0(int n, @NotNull Pair<String, ? extends Object> pair) {
        zx_2.b(pair, tt_1.g);
        this(n, pair, M.PLAY);
    }

    @NotNull
    public String toString() {
        Object object;
        aj.d();
        JsonObject jsonObject = new JsonObject();
        Long l4 = this.e();
        if (l4 != null) {
            object = l4;
            boolean bl = false;
            long l5 = acU.c((Number)object);
            boolean bl2 = false;
            M0.a(jsonObject, tt_1.d, lx_2.b(l5));
        }
        M0.a(jsonObject, tt_1.f, P8.d(this.c()));
        Map<String, ? extends Object> map = this.g;
        if (map != null) {
            Object object2 = object = map;
            boolean bl = false;
            Iterator iterator = aS0.f(MapInvoker.b((Map)object2));
            if (dz_0.c(iterator)) {
                Map.Entry entry;
                Map.Entry entry2;
                Map.Entry entry3 = entry2 = (entry = (Map.Entry)dz_0.b(iterator));
                String string = (String)FG.b(entry3);
                entry3 = entry2;
                Object object3 = FG.a(entry3);
                M0.a(jsonObject, string, a4W.b(this.a(), object3));
            }
        }
        String string = a4W.a(this.a(), (JsonElement)jsonObject);
        zx_2.a((Object)string, tt_1.j);
        if (ListInvoker.b() != null) {
            aj.b(new ListInvoker[5]);
        }
        return string;
    }
}


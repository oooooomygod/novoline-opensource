/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonObject
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  org.apache.logging.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package net.skidunion;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.ash_1;
import net.skidunion.M;
import net.skidunion.aP;
import net.zx_2;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006 "}, d2={"Lnet/net.skidunion/aj;", "", "d", "", "c", "Lnet/net.skidunion/M;", "(ILnet/net.skidunion/M;)V", "f", "Lcom/google/gson/Gson;", "a", "()Lcom/google/gson/Gson;", "a", "Lorg/apache/logging/log4j/Logger;", "b", "()Lorg/apache/logging/log4j/Logger;", "c", "()I", "a", "(I)V", "b", "", "e", "()Ljava/lang/Long;", "a", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "f", "()Lnet/net.skidunion/M;", "a", "(Lnet/net.skidunion/M;)V", "a", "", "client", "Lnet/net.skidunion/aP;", "args", "Lcom/google/gson/JsonObject;"})
public abstract class aj {
    private static ListInvoker[] e;
    @NotNull
    private M c;
    @NotNull
    private Logger a;
    @NotNull
    private Gson f;
    private int d;
    @Nullable
    private Long b;

    public void a(@NotNull M m3) {
        zx_2.b((Object)m3, ash_1.d);
        this.c = m3;
    }

    public static void b(ListInvoker[] listInvokerArray) {
        e = listInvokerArray;
    }

    public aj(int n, @NotNull M m3) {
        zx_2.b((Object)m3, ash_1.b);
        this.d = n;
        this.c = m3;
        Logger logger = LogManagerInvoker.a(this.getClass());
        zx_2.a((Object)logger, ash_1.a);
        this.a = logger;
        this.f = new Gson();
    }

    public void a(@NotNull aP aP10, @NotNull JsonObject jsonObject) {
        zx_2.b((Object)aP10, ash_1.e);
        zx_2.b(jsonObject, ash_1.c);
    }

    public /* synthetic */ aj(int n, M m3, int n2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n2 & 2) != 0) {
            m3 = M.SERVERBOUND;
        }
        this(n, m3);
    }

    public void a(int n) {
        this.d = n;
    }

    static {
        if (aj.d() != null) {
            aj.b(new ListInvoker[4]);
        }
    }

    @Nullable
    public Long e() {
        return this.b;
    }

    @NotNull
    protected Gson a() {
        return this.f;
    }

    public int c() {
        return this.d;
    }

    public void a(@Nullable Long l4) {
        this.b = l4;
    }

    public static ListInvoker[] d() {
        return e;
    }

    @NotNull
    protected Logger b() {
        return this.a;
    }

    @NotNull
    public M f() {
        return this.c;
    }
}


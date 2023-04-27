/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.modules.configurations.property.Property;
import cc.novoline.invoke.ListInvoker;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.wM
 */
public class wm_0
extends RuntimeException {
    private static ListInvoker[] b;
    private @NonNull Property<?> a;

    private static wm_0 a(wm_0 wm_02) {
        return wm_02;
    }

    public wm_0(String string, @NonNull Property<?> property) {
        super(string);
        this.a = property;
    }

    public wm_0(Throwable throwable, @NonNull Property<?> property) {
        wm_0.b();
        super(throwable);
        this.a = property;
        if (ListInvoker.b() != null) {
            wm_0.b(new ListInvoker[5]);
        }
    }

    public wm_0(String string, Throwable throwable, @NonNull Property<?> property) {
        wm_0.b();
        super(string, throwable);
        this.a = property;
        ListInvoker.b(new ListInvoker[1]);
    }

    static {
        if (wm_0.b() == null) {
            wm_0.b(new ListInvoker[1]);
        }
    }

    public @NonNull Property<?> a() {
        return this.a;
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public wm_0(@NonNull Property<?> property) {
        this.a = property;
    }

    public static ListInvoker[] b() {
        return b;
    }
}


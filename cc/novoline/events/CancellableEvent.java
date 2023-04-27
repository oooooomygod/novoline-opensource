/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.events;

import net.skidunion.annotations;

public abstract class CancellableEvent
implements Event,
Cancellable {
    private static int b;
    private boolean a;

    @Override
    @annotations
    public void setCancelled(boolean bl) {
        this.a = bl;
    }

    public static int a() {
        CancellableEvent.b();
        return 31;
    }

    static {
        if (CancellableEvent.b() != 0) {
            CancellableEvent.b(111);
        }
    }

    public static void b(int n) {
        b = n;
    }

    @Override
    @annotations
    public boolean isCancelled() {
        return this.a;
    }

    public static int b() {
        return b;
    }

    protected CancellableEvent() {
    }
}


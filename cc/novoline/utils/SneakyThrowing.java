/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.utils;

import net.aqm_2;

public class SneakyThrowing {
    private SneakyThrowing() {
        throw new UnsupportedOperationException(aqm_2.a);
    }

    private static <T extends Throwable> T b(Throwable throwable) throws T {
        throw throwable;
    }

    public static RuntimeException a(Throwable throwable) {
        return (RuntimeException)SneakyThrowing.b(throwable);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.IChatComponent;
import net.aAn;
import net.aoz_1;

public enum Pd {
    NO_FBO(new aoz_1(aAn.x, new Object[0])),
    LIBRARY_ARCH_MISMATCH(new aoz_1(aAn.p, new Object[0])),
    LIBRARY_FAILURE(new aoz_1(aAn.k, new Object[0]), new aoz_1(aAn.f, new Object[0])),
    UNSUPPORTED_OS_WINDOWS(new aoz_1(aAn.i, new Object[0])),
    UNSUPPORTED_OS_MAC(new aoz_1(aAn.A, new Object[0]), new aoz_1(aAn.r, new Object[0])),
    UNSUPPORTED_OS_OTHER(new aoz_1(aAn.c, new Object[0])),
    ACCOUNT_NOT_MIGRATED(new aoz_1(aAn.D, new Object[0]), new aoz_1(aAn.E, new Object[0])),
    ACCOUNT_NOT_BOUND(new aoz_1(aAn.C, new Object[0]), new aoz_1(aAn.g, new Object[0])),
    FAILED_TWITCH_AUTH(new aoz_1(aAn.b, new Object[0]), new aoz_1(aAn.l, new Object[0])),
    FAILED_TWITCH_AUTH_ERROR(new aoz_1(aAn.w, new Object[0])),
    INITIALIZATION_FAILURE(new aoz_1(aAn.v, new Object[0]), new aoz_1(aAn.u, new Object[0])),
    UNKNOWN(new aoz_1(aAn.t, new Object[0]), new aoz_1(aAn.o, new Object[0]));

    private IChatComponent a;
    private IChatComponent b;

    private Pd(IChatComponent iChatComponent) {
        this(iChatComponent, null);
    }

    private Pd(IChatComponent iChatComponent, IChatComponent iChatComponent2) {
        this.b = iChatComponent;
        this.a = iChatComponent2;
    }

    public IChatComponent a() {
        return this.a;
    }

    public IChatComponent b() {
        return this.b;
    }
}


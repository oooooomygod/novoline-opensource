/*
 * Decompiled with CFR 0.152.
 */
package net;

enum aY0 {
    LOCKED(0, 146),
    LOCKED_HOVER(0, 166),
    LOCKED_DISABLED(0, 186),
    UNLOCKED(20, 146),
    UNLOCKED_HOVER(20, 166),
    UNLOCKED_DISABLED(20, 186);

    private int b;
    private int a;

    private aY0(int n2, int n3) {
        this.b = n2;
        this.a = n3;
    }

    public int b() {
        return this.b;
    }

    public int a() {
        return this.a;
    }
}


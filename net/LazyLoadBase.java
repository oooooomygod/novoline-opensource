/*
 * Decompiled with CFR 0.152.
 */
package net;

public abstract class LazyLoadBase<T> {
    private T a;
    private boolean b = false;

    protected abstract T a();

    public T b() {
        if (!this.b) {
            this.b = true;
            this.a = this.a();
        }
        return this.a;
    }
}


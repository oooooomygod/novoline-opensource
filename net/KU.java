/*
 * Decompiled with CFR 0.152.
 */
package net;

public interface KU {
    public boolean b();

    public void a(int var1);

    public int c();

    public void a(int var1, int var2);

    public void b(int var1);

    public void a(boolean var1);

    default public void c(int n, int n2) {
        this.b(n);
        this.a(n2);
    }

    public void b(int var1, int var2);

    public int a();
}


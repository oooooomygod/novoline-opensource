/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aET;

public class Ti {
    private aET e = aET.FILE;
    private float a = 1.0f;
    private String c;
    private boolean d = false;
    private int f = 1;
    private float b = 1.0f;

    public void a(int n) {
        this.f = n;
    }

    public int a() {
        return this.f;
    }

    public aET b() {
        return this.e;
    }

    public float f() {
        return this.a;
    }

    public void a(boolean bl) {
        this.d = bl;
    }

    public void b(float f) {
        this.a = f;
    }

    public void a(String string) {
        this.c = string;
    }

    public String d() {
        return this.c;
    }

    public void a(aET aET2) {
        this.e = aET2;
    }

    public void a(float f) {
        this.b = f;
    }

    public boolean c() {
        return this.d;
    }

    public float e() {
        return this.b;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Collection;
import java.util.Set;
import net.Team;
import net.VM;
import net.aFJ;
import net.aL0;
import net.abn_1;
import net.anw_0;
import net.axe_2;
import net.za_2;


public class a35
extends Team {
    private String e;
    private String d;
    private boolean g = true;
    private anw_0 f;
    private String b;
    private Set<String> i = axe_2.a();
    private boolean k = true;
    private String h = abn_1.d;
    private aFJ c;
    private za_2 a;
    private aFJ j;

    public a35(za_2 za_22, String string) {
        this.b = abn_1.c;
        this.j = aFJ.ALWAYS;
        this.c = aFJ.ALWAYS;
        this.f = anw_0.RESET;
        this.a = za_22;
        this.e = string;
        this.d = string;
    }

    @Override
    public aFJ b() {
        return this.c;
    }

    public static String a(Team team, String string) {
        return string;
    }

    public void a(String string) {
        this.b = string;
        VM.a(this.a, this);
    }

    @Override
    public String a(String string) {
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), this.e()), string), this.b()).toString();
    }

    public String e() {
        return this.h;
    }

    public String a() {
        return this.d;
    }

    public void a(anw_0 anw_02) {
        this.f = anw_02;
    }

    @Override
    public boolean e() {
        return this.k;
    }

    public void b(aFJ aFJ2) {
        this.c = aFJ2;
        VM.a(this.a, this);
    }

    @Override
    public String d() {
        return this.e;
    }

    public void c(String string) {
        throw new IllegalArgumentException(abn_1.a);
    }

    public String b() {
        return this.b;
    }

    public void a(boolean bl) {
        this.g = bl;
        VM.a(this.a, this);
    }

    public void b(String string) {
        throw new IllegalArgumentException(abn_1.b);
    }

    @Override
    public Collection<String> c() {
        return this.i;
    }

    @Override
    public boolean f() {
        return this.g;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public anw_0 c() {
        return this.f;
    }

    public void a(aFJ aFJ2) {
        this.j = aFJ2;
        VM.a(this.a, this);
    }

    public int f() {
        int n = 0;
        if (this.f()) {
            n |= 1;
        }
        if (this.e()) {
            n |= 2;
        }
        return n;
    }

    public void b(boolean bl) {
        this.k = bl;
        VM.a(this.a, this);
    }

    @Override
    public aFJ a() {
        return this.j;
    }

    public void a(int n) {
        this.a((n & 1) > 0);
        this.b((n & 2) > 0);
    }
}


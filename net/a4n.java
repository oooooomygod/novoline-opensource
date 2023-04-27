/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.List;
import net.a4_0;
import net.a6n_0;
import net.asg_0;
import net.my_0;

public class a4n {
    private List<a4_0<?>> b = my_0.c();
    private String c;
    private a4_0<?> a;

    public a6n_0 a() {
        return new a6n_0(this.a, this.c, this.b, null);
    }

    public a4n a(a4_0<?> ... a4_0Array) {
        asg_0.a(this.b, a4_0Array);
        return this;
    }

    public a4n a(String string) {
        this.c = string;
        return this;
    }

    public a4n a(a4_0<?> a4_02) {
        this.a = a4_02;
        return this;
    }
}


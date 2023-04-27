/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package net;

import com.google.gson.JsonObject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import net.M0;
import net.WN;
import net.a8d_0;
import net.aZ2;
import net.aqk_2;
import net.uh_0;


public abstract class a8N<T>
extends a8d_0<T> {
    public static SimpleDateFormat d = new SimpleDateFormat(uh_0.p);
    protected String c;
    protected Date f;
    protected Date e;
    protected String b;

    public a8N(T t, Date date, String string, Date date2, String string2) {
        super(t);
        this.f = new Date();
        this.b = uh_0.d;
        this.e = date2;
        this.c = uh_0.f;
    }

    @Override
    protected void a(JsonObject jsonObject) {
        M0.a(jsonObject, uh_0.j, aZ2.a(d, this.f));
        M0.a(jsonObject, uh_0.g, this.b);
        M0.a(jsonObject, uh_0.o, this.e == null ? uh_0.c : aZ2.a(d, this.e));
        M0.a(jsonObject, uh_0.a, this.c);
    }

    private static ParseException a(ParseException parseException) {
        return parseException;
    }

    @Override
    boolean a() {
        return this.e != null && aqk_2.a(this.e, new Date());
    }

    @Override
    public String b() {
        return this.c;
    }

    public Date a() {
        return this.e;
    }

    protected a8N(T t, JsonObject jsonObject) {
        super(t, jsonObject);
        Date date;
        Date date2;
        try {
            date2 = M0.c(jsonObject, uh_0.r) ? aZ2.a(d, WN.f(M0.d(jsonObject, uh_0.h))) : new Date();
        }
        catch (ParseException parseException) {
            date2 = new Date();
        }
        this.f = date2;
        this.b = M0.c(jsonObject, uh_0.n) ? WN.f(M0.d(jsonObject, uh_0.k)) : uh_0.b;
        try {
            date = M0.c(jsonObject, uh_0.m) ? aZ2.a(d, WN.f(M0.d(jsonObject, uh_0.i))) : null;
        }
        catch (ParseException parseException) {
            date = null;
        }
        this.e = date;
        this.c = M0.c(jsonObject, uh_0.e) ? WN.f(M0.d(jsonObject, uh_0.l)) : uh_0.q;
    }
}


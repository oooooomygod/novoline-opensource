/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import java.util.LinkedHashMap;
import java.util.Map;

public class FA {
    private String a = null;
    private int c = 0;
    private Map<String, String> d = new LinkedHashMap<String, String>();
    private byte[] b = null;

    public String a(String string) {
        return (String)MapInvoker.c(this.d, string);
    }

    public FA(int n, String string, Map map, byte[] byArray) {
        this.c = n;
        this.a = string;
        this.d = map;
        this.b = byArray;
    }

    public int d() {
        return this.c;
    }

    public byte[] b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public Map a() {
        return this.d;
    }
}


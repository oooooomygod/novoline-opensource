/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Map;
import net.NY;
import net.a3m_0;
import net.qs_2;

/*
 * Renamed from net.eS
 */
public class es_1
extends Thread {
    private Map c;
    private String a;
    private byte[] d;
    private NY b;

    @Override
    public void run() {
        try {
            qs_2.a(this.a, this.c, this.d);
            a3m_0.a(this.b, this.a, this.d, null);
        }
        catch (Exception exception) {
            a3m_0.a(this.b, this.a, this.d, exception);
        }
    }

    public NY b() {
        return this.b;
    }

    public byte[] c() {
        return this.d;
    }

    public String a() {
        return this.a;
    }

    public es_1(String string, Map map, byte[] byArray, NY nY) {
        this.a = string;
        this.c = map;
        this.d = byArray;
        this.b = nY;
    }
}


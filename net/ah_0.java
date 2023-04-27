/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.ArrayList;
import net.aP2;

/*
 * Renamed from net.Ah
 */
public class ah_0 {
    private ArrayList d = null;
    private float c = 1.0f;
    private int b = 0;
    private int a = 0;

    public boolean b(Object object) {
        ++this.b;
        return this.d.add(object);
    }

    public Object a(int n, Object object) {
        aP2.b();
        Object object2 = this.d.set(n, object);
        if (object != object2) {
            if (object2 == null) {
                ++this.b;
            }
            if (object == null) {
                --this.b;
            }
        }
        return object2;
    }

    public ah_0(int n) {
        this(n, 0.75f);
    }

    public void a() {
        float f;
        aP2.b();
        if (this.b <= 0 && this.d.size() <= 0) {
            this.e();
        }
        if (this.d.size() > this.a && (f = (float)this.b * 1.0f / (float)this.d.size()) <= this.c) {
            int n = 0;
            int n2 = 0;
            if (n2 < this.d.size()) {
                Object e = this.d.get(n2);
                if (e != null) {
                    ++n;
                }
                ++n2;
            }
            if ((n2 = this.d.size() - 1) >= n) {
                this.d.remove(n2);
                --n2;
            }
        }
    }

    public int b() {
        return this.b;
    }

    public Object a(int n) {
        aP2.b();
        Object e = this.d.remove(n);
        if (e != null) {
            --this.b;
        }
        return e;
    }

    public ah_0() {
        this(10, 0.75f);
    }

    public int c() {
        return this.d.size();
    }

    public boolean a(Object object) {
        return this.d.contains(object);
    }

    public void b(int n, Object object) {
        aP2.b();
        ++this.b;
        this.d.add(n, object);
    }

    public void e() {
        this.d.clear();
        this.b = 0;
    }

    public ah_0(int n, float f) {
        this.d = new ArrayList(n);
        this.a = n;
        this.c = f;
    }

    public Object b(int n) {
        return this.d.get(n);
    }

    public boolean d() {
        return this.d.isEmpty();
    }
}


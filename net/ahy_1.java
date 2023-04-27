/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.lang.reflect.Field;
import net.a30;
import net.aDb;
import net.aM1;
import net.abk_2;
import net.afj_0;
import net.ai6_0;
import net.arc_0;
import net.avx_0;

/*
 * Renamed from net.ahY
 */
public class ahy_1 {
    private a30 b = null;
    private boolean c = false;
    private Field a = null;

    public void a(Object object, Object object2) {
        aDb.a(object, this, object2);
    }

    public ahy_1(Field field) {
        this(new aM1(field));
    }

    public ahy_1(a30 a302) {
        this.b = a302;
        this.c();
    }

    public Object b() {
        return aDb.a(null, this);
    }

    public void a(Object object) {
        aDb.a(null, this, object);
    }

    public ahy_1(arc_0 arc_02, Class clazz) {
        this(arc_02, clazz, 0);
    }

    public ahy_1(arc_0 arc_02, Class clazz, int n) {
        this(new afj_0(arc_02, clazz, n));
    }

    public ahy_1(arc_0 arc_02, String string) {
        this(new abk_2(arc_02, string));
    }

    public boolean a() {
        return this.c() != null;
    }

    public Field c() {
        if (this.c) {
            return this.a;
        }
        this.c = true;
        this.a = ai6_0.a(this.b);
        if (this.a != null) {
            avx_0.a(this.a, true);
        }
        return this.a;
    }
}


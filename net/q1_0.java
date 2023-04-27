/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import deobf.Entity;
import deobf.EntityLivingBase;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.a5Y;
import net.a5_0;
import net.azn_1;
import net.my_0;

/*
 * Renamed from net.q1
 */
public abstract class q1_0 {
    public float f;
    public int b = 64;
    public boolean g = true;
    private Map<String, azn_1> c;
    public boolean d;
    public List<a5Y> a = my_0.c();
    public int e = 32;

    public void a(float f, float f2, float f3, float f4, float f5, float f6, Entity entity) {
    }

    public void a(Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
    }

    public azn_1 a(String string) {
        return (azn_1)MapInvoker.c(this.c, string);
    }

    public void a(EntityLivingBase entityLivingBase, float f, float f2, float f3) {
    }

    public static void a(a5Y a5Y2, a5Y a5Y3) {
        a5Y3.t = a5Y2.t;
        a5Y3.m = a5Y2.m;
        a5Y3.n = a5Y2.n;
        a5Y3.g = a5Y2.g;
        a5Y3.o = a5Y2.o;
        a5Y3.z = a5Y2.z;
    }

    public a5Y a(Random random) {
        return (a5Y)ListInvoker.get(this.a, a5_0.a(random, ListInvoker.size(this.a)));
    }

    public void a(q1_0 q1_02) {
        this.f = q1_02.f;
        this.d = q1_02.d;
        this.g = q1_02.g;
    }

    protected void a(String string, int n, int n2) {
        MapInvoker.c(this.c, string, new azn_1(n, n2));
    }

    public q1_0() {
        this.c = MapsInvoker.a();
    }
}


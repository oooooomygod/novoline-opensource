/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.MaterialEx;
import deobf.MaterialLogic;
import deobf.MaterialTransparent;
import net.MapColor;
import net.MaterialLiquid;
import net.MaterialPortal;

public class Material {
    public static Material M;
    public static Material m;
    public static Material N;
    public static Material I;
    public static Material G;
    public static Material w;
    public static Material t;
    public static Material z;
    public static Material f;
    private boolean k;
    public static Material x;
    public static Material ground;
    public static Material i;
    private int l;
    public static Material C;
    public static Material D;
    public static Material v;
    public static Material r;
    public static Material q;
    public static Material c;
    public static Material A;
    public static Material s;
    private boolean E;
    private boolean P;
    public static Material wood;
    public static Material u;
    public static Material e;
    public static Material n;
    private boolean H = true;
    private MapColor o;
    public static Material air;
    public static Material K;
    public static Material B;
    public static Material d;
    public static Material J;
    public static Material grass;
    public static Material a;
    private boolean L;
    public static Material b;
    public static Material h;
    public static Material y;
    public static Material F;

    public boolean p() {
        return this.k;
    }

    protected Material g() {
        this.H = false;
        return this;
    }

    public boolean f() {
        return this.H;
    }

    public boolean k() {
        return !this.P && this.q();
    }

    public Material i() {
        this.L = true;
        return this;
    }

    public boolean c() {
        return true;
    }

    public int o() {
        return this.l;
    }

    private Material a() {
        this.P = true;
        return this;
    }

    public Material(MapColor mapColor) {
        this.o = mapColor;
    }

    protected Material d() {
        this.l = 1;
        return this;
    }

    public boolean m() {
        return this.L;
    }

    public boolean h() {
        return true;
    }

    public boolean q() {
        return true;
    }

    protected Material b() {
        this.E = true;
        return this;
    }

    protected Material n() {
        this.l = 2;
        return this;
    }

    static {
        air = new MaterialTransparent(MapColor.q);
        grass = new Material(MapColor.r);
        ground = new Material(MapColor.d);
        wood = new Material(MapColor.t).j();
        y = new Material(MapColor.e).g();
        t = new Material(MapColor.m).g();
        x = new Material(MapColor.m).g().n();
        M = new MaterialLiquid(MapColor.b).d();
        e = new MaterialLiquid(MapColor.G).d();
        z = new Material(MapColor.B).j().a().d();
        F = new MaterialLogic(MapColor.B).d();
        f = new MaterialLogic(MapColor.B).j().d().i();
        r = new Material(MapColor.c);
        q = new Material(MapColor.M).j();
        b = new MaterialTransparent(MapColor.q).d();
        a = new Material(MapColor.z);
        I = new MaterialLogic(MapColor.q).d();
        D = new MaterialLogic(MapColor.M).j();
        w = new Material(MapColor.q).a().b();
        B = new Material(MapColor.q).b();
        s = new Material(MapColor.G).j().a();
        J = new Material(MapColor.B).d();
        v = new Material(MapColor.C).a().b();
        K = new Material(MapColor.C).b();
        G = new MaterialLogic(MapColor.x).i().a().g().d();
        c = new Material(MapColor.x).g();
        A = new Material(MapColor.B).a().d();
        N = new Material(MapColor.y);
        h = new Material(MapColor.B).d();
        i = new Material(MapColor.B).d();
        m = new MaterialPortal(MapColor.q).n();
        C = new Material(MapColor.q).d();
        n = new MaterialEx(MapColor.M).g().d();
        d = new Material(MapColor.e).n();
        u = new Material(MapColor.q).g().n();
    }

    public MapColor e() {
        return this.o;
    }

    protected Material j() {
        this.k = true;
        return this;
    }

    public boolean l() {
        return false;
    }
}


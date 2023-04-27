/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.vector.Vector3f
 */
package net;

import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.MCInvoker;
import java.util.List;
import net.aV8;
import net.aiv_1;
import net.ayj_0;
import net.h__0;
import net.q1_0;
import org.lwjgl.util.vector.Vector3f;

public class atT {
    private static String m;
    public int o;
    public float j;
    public float i;
    public float g;
    public float b;
    public boolean p;
    public Vector3f d = new Vector3f();
    public String n;
    public float k;
    public Vector3f a = new Vector3f();
    public Vector3f f;
    public float h;
    public q1_0 r;
    public float c;
    public boolean q;
    public boolean e;
    public float l;

    public void j() {
        this.h = 0.0f;
    }

    public static void b(String string) {
        m = string;
    }

    public void h() {
        this.l = 0.0f;
    }

    public boolean b() {
        return this.e;
    }

    public void e() {
        this.b = 0.0f;
    }

    public EntityLivingBase d() {
        atT.f();
        if (BlockInvoker.b(MCInvoker.f().world, this.o) instanceof EntityLivingBase) {
            return (EntityLivingBase)BlockInvoker.b(MCInvoker.f().world, this.o);
        }
        return null;
    }

    public atT(int n) {
        atT.f();
        this.f = new Vector3f();
        this.i = 0.0f;
        this.g = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.p = false;
        this.l = 0.0f;
        this.b = 0.0f;
        this.h = 0.0f;
        this.c = 0.0f;
        this.q = false;
        this.o = n;
        if (BlockInvoker.b(MCInvoker.f().world, n) != null) {
            this.n = ayj_0.x(BlockInvoker.b(MCInvoker.f().world, n));
        }
        this.n = aiv_1.a;
        this.r = null;
        if (ListInvoker.b() != null) {
            atT.b("wq9Beb");
        }
    }

    public static String f() {
        return m;
    }

    public boolean g() {
        atT.f();
        Entity entity = BlockInvoker.b(MCInvoker.f().world, this.o);
        if (entity == null) {
            return false;
        }
        ayj_0.u(entity);
        List list = aV8.b(entity.worldObj, entity, h__0.a(ayj_0.u(entity), this.f.x, 0.0, this.f.z));
        int n = 0;
        return n < ListInvoker.size(list);
    }

    public boolean i() {
        atT.f();
        Entity entity = BlockInvoker.b(MCInvoker.f().world, this.o);
        if (entity == null) {
            return false;
        }
        ayj_0.u(entity);
        double cfr_ignored_0 = this.d.y + this.f.y;
        List list = aV8.b(entity.worldObj, entity, h__0.a(ayj_0.u(entity), 0.0, -0.001f, 0.0));
        int n = 0;
        return n < ListInvoker.size(list);
    }

    public void a(float f) {
        block10: {
            block9: {
                atT.f();
                if (this.d() == null) {
                    return;
                }
                this.g = (float)MCInvoker.f().player.ticksExisted + f - this.i;
                this.i = (float)MCInvoker.f().player.ticksExisted + f;
                this.p = false;
                if (this.i() & !this.e) {
                    this.e();
                    this.e = true;
                }
                if (!this.i() & this.e | (this.a.y <= 0.0f && this.f.y - this.a.y > 0.4f && this.l > 2.0f)) {
                    this.h();
                    this.e = false;
                }
                if (!(this.d().aQ > 0.0f)) break block9;
                if (this.q) break block10;
                this.j();
                this.q = true;
            }
            this.q = false;
        }
        if (this.a.y <= 0.0f && this.f.y > 0.0f) {
            this.a();
        }
        if (!this.b()) {
            this.l += this.g;
        }
        if (this.b()) {
            this.b += this.g;
        }
        this.h += this.g;
        this.c += this.g;
    }

    static {
        if (atT.f() != null) {
            atT.b("XfhdMb");
        }
    }

    public boolean c() {
        atT.f();
        return !this.p;
    }

    public void a() {
        this.c = 0.0f;
    }
}


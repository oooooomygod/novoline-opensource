/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.IChatComponent;
import deobf.EntityArrow;
import net.aI9;
import net.aL0;
import net.aSY;
import net.aba_2;
import net.aea_2;
import net.aed_1;
import net.ahq_0;
import net.alk_0;
import net.aoz_1;
import net.atn_0;
import net.aw0_0;
import net.oa_1;

public class DamageSource {
    private boolean g;
    private float h = 0.3f;
    public static DamageSource v;
    private boolean q;
    private boolean i;
    public static DamageSource r;
    private boolean o;
    public static DamageSource b;
    public static DamageSource f;
    public String t;
    public static DamageSource e;
    public static DamageSource j;
    public static DamageSource d;
    public static DamageSource s;
    public static DamageSource a;
    public static DamageSource k;
    private boolean p;
    public static DamageSource u;
    public static DamageSource c;
    private boolean x;
    public static DamageSource y;
    private boolean w;
    private boolean l;
    public static DamageSource m;
    public static DamageSource n;

    public boolean q() {
        return this.o;
    }

    public static DamageSource a(EntityArrow entityArrow, Entity entity) {
        return new aea_2(aba_2.n, entityArrow, entity).c();
    }

    public boolean i() {
        return this.p;
    }

    public String f() {
        return this.t;
    }

    protected DamageSource a() {
        this.x = true;
        this.h = 0.0f;
        return this;
    }

    protected DamageSource(String string) {
        this.t = string;
    }

    public static DamageSource a(Entity entity) {
        return alk_0.a(new aed_1(aba_2.q, entity)).k();
    }

    public Entity h() {
        return null;
    }

    public DamageSource s() {
        this.p = true;
        return this;
    }

    public DamageSource m() {
        this.q = true;
        return this;
    }

    public boolean j() {
        return this.g;
    }

    public boolean l() {
        return this.l;
    }

    public static DamageSource b(Entity entity, Entity entity2) {
        return new aea_2(aba_2.a, entity, entity2).c();
    }

    public IChatComponent a(EntityLivingBase entityLivingBase) {
        EntityLivingBase entityLivingBase2 = atn_0.F(entityLivingBase);
        String string = aL0.a(aL0.a(new StringBuilder(), aba_2.z), this.t).toString();
        String string2 = aL0.a(aL0.a(new StringBuilder(), string), aba_2.r).toString();
        return ahq_0.a(string2) ? new aoz_1(string2, atn_0.C(entityLivingBase), atn_0.C(entityLivingBase2)) : new aoz_1(string, atn_0.C(entityLivingBase));
    }

    public float t() {
        return this.h;
    }

    protected DamageSource r() {
        this.o = true;
        this.h = 0.0f;
        return this;
    }

    protected DamageSource n() {
        this.w = true;
        return this;
    }

    public boolean p() {
        return this.q;
    }

    public boolean d() {
        return this.x;
    }

    public static DamageSource b(EntityLivingBase entityLivingBase) {
        return new aed_1(aba_2.e, entityLivingBase);
    }

    public static DamageSource a(aw0_0 aw0_02) {
        return aI9.a(aw0_02) != null ? new aed_1(aba_2.t, aI9.a(aw0_02)).m().s() : new DamageSource(aba_2.v).m().s();
    }

    public boolean b() {
        Entity entity = this.h();
        return entity instanceof EntityPlayer && aSY.a(((EntityPlayer)entity).abilities);
    }

    public boolean e() {
        return this.w;
    }

    public DamageSource c() {
        this.i = true;
        return this;
    }

    public boolean g() {
        return this.i;
    }

    static {
        b = new DamageSource(aba_2.i).n();
        v = new DamageSource(aba_2.f);
        d = new DamageSource(aba_2.b).r().n();
        k = new DamageSource(aba_2.k).n();
        c = new DamageSource(aba_2.h).r();
        f = new DamageSource(aba_2.w).r();
        e = new DamageSource(aba_2.g).r().a();
        a = new DamageSource(aba_2.y);
        n = new DamageSource(aba_2.l).r();
        m = new DamageSource(aba_2.x).r().u();
        r = new DamageSource(aba_2.m).r();
        s = new DamageSource(aba_2.u).r().k();
        j = new DamageSource(aba_2.j).r();
        u = new DamageSource(aba_2.s);
        y = new DamageSource(aba_2.o);
    }

    public static DamageSource a(Entity entity, Entity entity2) {
        return new aea_2(aba_2.c, entity, entity2).r().k();
    }

    protected DamageSource u() {
        this.g = true;
        return this;
    }

    public Entity o() {
        return this.h();
    }

    public static DamageSource a(EntityPlayer entityPlayer) {
        return new aed_1(aba_2.p, entityPlayer);
    }

    public static DamageSource a(oa_1 oa_12, Entity entity) {
        return new aea_2(aba_2.A, oa_12, oa_12).n().c();
    }

    public DamageSource k() {
        this.l = true;
        return this;
    }
}


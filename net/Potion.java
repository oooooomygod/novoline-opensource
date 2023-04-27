/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.MathInvoker;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.IAttribute;
import deobf.PotionAbsorption;
import deobf.PotionHealth;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Potion {
    public static Potion regeneration;
    private String s;
    private int J;
    public static Potion b;
    public static Potion saturation;
    public static Potion L;
    public static Potion digSpeed;
    public static Potion resistance;
    public static Potion jump;
    public static Potion absorption;
    private boolean m;
    public static Potion moveSpeed;
    public static Potion damageBoost;
    public static Potion fireResistance;
    public static Potion N;
    public static Potion x;
    public static Potion f;
    public static Potion H;
    private static Map<ResourceLocation, Potion> A;
    private double B;
    public static Potion o;
    private Map<IAttribute, AttributeModifier> n = MapsInvoker.a();
    public static Potion blindness;
    private int z;
    public static Potion digSlowdown;
    public static Potion nightVision;
    public static Potion heal;
    public static Potion waterBreathing;
    public static Potion harm;
    private boolean r;
    public static Potion d;
    public static Potion moveSlowdown;
    public static Potion weakness;
    public static Potion[] potionTypes;
    public static Potion I;
    public static Potion poison;
    public static Potion hunger;
    public static Potion confusion;
    public static Potion invisibility;
    public static Potion healthBoost;
    public static Potion wither;
    private int u = -1;

    public Map<IAttribute, AttributeModifier> i() {
        return this.n;
    }

    static {
        potionTypes = new Potion[32];
        A = MapsInvoker.a();
        H = null;
        moveSpeed = new Potion(1, new ResourceLocation(ao_1.w), false, 8171462).a(ao_1.l).a(0, 0).a(abb_0.e, ao_1.Q, 0.2f, 2);
        moveSlowdown = new Potion(2, new ResourceLocation(ao_1.C), true, 5926017).a(ao_1.D).a(1, 0).a(abb_0.e, ao_1.N, -0.15f, 2);
        digSpeed = new Potion(3, new ResourceLocation(ao_1.W), false, 14270531).a(ao_1.t).a(2, 0).a(1.5);
        digSlowdown = new Potion(4, new ResourceLocation(ao_1.R), true, 4866583).a(ao_1.i).a(3, 0);
        damageBoost = new PotionAttackDamage(5, new ResourceLocation(ao_1.aa), false, 9643043).a(ao_1.v).a(4, 0).a(abb_0.f, ao_1.V, 2.5, 2);
        heal = new PotionHealth(6, new ResourceLocation(ao_1.ab), false, 16262179).a(ao_1.U);
        harm = new PotionHealth(7, new ResourceLocation(ao_1.e), true, 4393481).a(ao_1.n);
        jump = new Potion(8, new ResourceLocation(ao_1.T), false, 2293580).a(ao_1.J).a(2, 1);
        confusion = new Potion(9, new ResourceLocation(ao_1.p), true, 5578058).a(ao_1.s).a(3, 1).a(0.25);
        regeneration = new Potion(10, new ResourceLocation(ao_1.K), false, 13458603).a(ao_1.u).a(7, 0).a(0.25);
        resistance = new Potion(11, new ResourceLocation(ao_1.S), false, 10044730).a(ao_1.h).a(6, 1);
        fireResistance = new Potion(12, new ResourceLocation(ao_1.j), false, 14981690).a(ao_1.q).a(7, 1);
        waterBreathing = new Potion(13, new ResourceLocation(ao_1.E), false, 3035801).a(ao_1.z).a(0, 2);
        invisibility = new Potion(14, new ResourceLocation(ao_1.L), false, 8356754).a(ao_1.P).a(0, 1);
        blindness = new Potion(15, new ResourceLocation(ao_1.B), true, 2039587).a(ao_1.M).a(5, 1).a(0.25);
        nightVision = new Potion(16, new ResourceLocation(ao_1.y), false, 0x1F1FA1).a(ao_1.b).a(4, 1);
        hunger = new Potion(17, new ResourceLocation(ao_1.Z), true, 5797459).a(ao_1.x).a(1, 1);
        weakness = new PotionAttackDamage(18, new ResourceLocation(ao_1.g), true, 0x484D48).a(ao_1.d).a(5, 0).a(abb_0.f, ao_1.o, 2.0, 0);
        poison = new Potion(19, new ResourceLocation(ao_1.A), true, 5149489).a(ao_1.a).a(6, 0).a(0.25);
        wither = new Potion(20, new ResourceLocation(ao_1.f), true, 3484199).a(ao_1.k).a(1, 2).a(0.25);
        healthBoost = new PotionHealthBoost(21, new ResourceLocation(ao_1.I), false, 16284963).a(ao_1.Y).a(2, 2).a(abb_0.b, ao_1.m, 4.0, 0);
        absorption = new PotionAbsorption(22, new ResourceLocation(ao_1.O), false, 0x2552A5).a(ao_1.G).a(2, 2);
        saturation = new PotionHealth(23, new ResourceLocation(ao_1.r), false, 16262179).a(ao_1.X);
        d = null;
        N = null;
        o = null;
        x = null;
        L = null;
        b = null;
        f = null;
        I = null;
    }

    public static Set<ResourceLocation> f() {
        return MapInvoker.c(A);
    }

    public boolean b(int n, int n2) {
        if (this.J == Potion.regeneration.J) {
            int n3 = 50 >> n2;
            return n % n3 == 0;
        }
        if (this.J == Potion.poison.J) {
            int n4 = 25 >> n2;
            return n % n4 == 0;
        }
        if (this.J == Potion.wither.J) {
            int n5 = 40 >> n2;
            return n % n5 == 0;
        }
        return this.J == Potion.hunger.J;
    }

    public static Potion b(String string) {
        return (Potion)MapInvoker.c(A, new ResourceLocation(string));
    }

    public boolean b() {
        return this.m;
    }

    public int a() {
        return this.J;
    }

    public void a(EntityLivingBase entityLivingBase, int n) {
        if (this.J == Potion.regeneration.J) {
            if (atn_0.c(entityLivingBase) < atn_0.y(entityLivingBase)) {
                atn_0.b(entityLivingBase, 1.0f);
            }
        } else if (this.J == Potion.poison.J) {
            if (atn_0.c(entityLivingBase) > 1.0f) {
                atn_0.a(entityLivingBase, DamageSource.s, 1.0f);
            }
        } else if (this.J == Potion.wither.J) {
            atn_0.a(entityLivingBase, DamageSource.j, 1.0f);
        } else if (this.J == Potion.hunger.J && entityLivingBase instanceof EntityPlayer) {
            a6w_0.d((EntityPlayer)entityLivingBase, 0.025f * (float)(n + 1));
        } else if (this.J == Potion.saturation.J && entityLivingBase instanceof EntityPlayer) {
            if (!entityLivingBase.worldObj.isRemote) {
                K.a(a6w_0.u((EntityPlayer)entityLivingBase), n + 1, 1.0f);
            }
        } else if (!(this.J == Potion.heal.J && !atn_0.B(entityLivingBase) || this.J == Potion.harm.J && atn_0.B(entityLivingBase))) {
            if (this.J == Potion.harm.J && !atn_0.B(entityLivingBase) || this.J == Potion.heal.J && atn_0.B(entityLivingBase)) {
                atn_0.a(entityLivingBase, DamageSource.s, 6 << n);
            }
        } else {
            atn_0.b(entityLivingBase, (float)MathInvoker.max(4 << n, 0));
        }
    }

    public double g() {
        return this.B;
    }

    public static String a(a2l_0 a2l_02) {
        if (a3M.f(a2l_02)) {
            return ao_1.H;
        }
        int n = a3M.c(a2l_02);
        return aod_2.a(n);
    }

    public Potion a(String string) {
        this.s = string;
        return this;
    }

    protected Potion a(int n, int n2) {
        this.u = n + n2 * 8;
        return this;
    }

    public double a(int n, AttributeModifier attributeModifier) {
        return ow_0.d(attributeModifier) * (double)(n + 1);
    }

    public boolean j() {
        return this.r;
    }

    protected Potion a(double d) {
        this.B = d;
        return this;
    }

    public int d() {
        return this.u;
    }

    public boolean c() {
        return false;
    }

    public void a(Entity entity, Entity entity2, EntityLivingBase entityLivingBase, int n, double d) {
        if (!(this.J == Potion.heal.J && !atn_0.B(entityLivingBase) || this.J == Potion.harm.J && atn_0.B(entityLivingBase))) {
            if (this.J == Potion.harm.J && !atn_0.B(entityLivingBase) || this.J == Potion.heal.J && atn_0.B(entityLivingBase)) {
                int n2 = (int)(d * (double)(6 << n) + 0.5);
                atn_0.a(entityLivingBase, DamageSource.s, n2);
            }
        } else {
            int n3 = (int)(d * (double)(4 << n) + 0.5);
            atn_0.b(entityLivingBase, (float)n3);
        }
    }

    public Potion a(IAttribute iAttribute, String string, double d, int n) {
        AttributeModifier attributeModifier = new AttributeModifier(awc_1.a(string), this.h(), d, n);
        MapInvoker.c(this.n, iAttribute, attributeModifier);
        return this;
    }

    public int e() {
        return this.z;
    }

    public void a(EntityLivingBase entityLivingBase, VO vO, int n) {
        Iterator iterator = aS0.f(MapInvoker.b(this.n));
        while (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            ahw_2 ahw_22 = ht_0.a(vO, (IAttribute)FG.b(entry));
            AttributeModifier attributeModifier = (AttributeModifier)FG.a(entry);
            Ma.b(ahw_22, attributeModifier);
            Ma.a(ahw_22, new AttributeModifier(ow_0.a(attributeModifier), aL0.c(aL0.a(aL0.a(new StringBuilder(), this.h()), ao_1.c), n).toString(), this.a(n, attributeModifier), ow_0.b(attributeModifier)));
        }
    }

    protected Potion(int n, ResourceLocation resourceLocation, boolean bl, int n2) {
        this.s = ao_1.F;
        this.J = n;
        Potion.potionTypes[n] = this;
        MapInvoker.c(A, resourceLocation, this);
        this.r = bl;
        this.B = 0.5;
        this.z = n2;
    }

    public void b(EntityLivingBase entityLivingBase, VO vO, int n) {
        Iterator iterator = aS0.f(MapInvoker.b(this.n));
        while (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            ahw_2 ahw_22 = ht_0.a(vO, (IAttribute)FG.b(entry));
            Ma.b(ahw_22, (AttributeModifier)FG.a(entry));
        }
    }

    public String h() {
        return this.s;
    }

    public boolean k() {
        return this.u >= 0;
    }
}


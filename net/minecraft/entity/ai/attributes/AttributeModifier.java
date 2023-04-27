/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai.attributes;

import java.util.Random;
import java.util.UUID;
import net.A6;
import net.MathHelper;
import net.aL0;
import net.aex_0;
import net.ag4_0;

public class AttributeModifier {
    private boolean a = true;
    private int b;
    private String d;
    private UUID e;
    private double c;

    public AttributeModifier(UUID uUID, String string, double d, int n) {
        this.e = uUID;
        this.d = string;
        this.c = d;
        this.b = n;
        ag4_0.a(string, aex_0.f, new Object[0]);
        ag4_0.a(0L, 2L, n, aex_0.a);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (this.getClass() == object.getClass()) {
            AttributeModifier attributeModifier = (AttributeModifier)object;
            if (this.e != null) {
                return this.e.equals(attributeModifier.e);
            }
            return attributeModifier.e == null;
        }
        return false;
    }

    public UUID d() {
        return this.e;
    }

    public String c() {
        return this.d;
    }

    public double a() {
        return this.c;
    }

    public AttributeModifier a(boolean bl) {
        this.a = bl;
        return this;
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.c(aL0.a(aL0.a(aL0.a(new StringBuilder(), aex_0.b), this.c), aex_0.e), this.b), aex_0.c), this.d), '\''), aex_0.g), this.e), aex_0.d), this.a), '}').toString();
    }

    public int hashCode() {
        return this.e != null ? this.e.hashCode() : 0;
    }

    public boolean b() {
        return this.a;
    }

    public AttributeModifier(String string, double d, int n) {
        this(MathHelper.a((Random)A6.a()), string, d, n);
    }

    public int e() {
        return this.b;
    }
}


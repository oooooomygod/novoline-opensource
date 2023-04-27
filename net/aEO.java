/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Set;
import deobf.EnumFacing;

public class aEO {
    private static int b = EnumFacing.values().length;
    private BitSet a = new BitSet(b * b);

    public void a(boolean bl) {
        aM_.a(this.a, 0, aM_.b(this.a), bl);
    }

    public boolean a(EnumFacing enumFacing, EnumFacing enumFacing2) {
        return aM_.a(this.a, enumFacing.ordinal() + enumFacing2.ordinal() * b);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        aL0.a(stringBuilder, ' ');
        for (EnumFacing enumFacing : EnumFacing.values()) {
            aL0.a(aL0.a(stringBuilder, ' '), StringInvoker.b(StringInvoker.a(enumFacing.toString()), 0));
        }
        aL0.a(stringBuilder, '\n');
        for (EnumFacing enumFacing : EnumFacing.values()) {
            aL0.a(stringBuilder, StringInvoker.b(StringInvoker.a(enumFacing.toString()), 0));
            for (EnumFacing enumFacing2 : EnumFacing.values()) {
                if (enumFacing == enumFacing2) {
                    aL0.a(stringBuilder, adp_1.a);
                    continue;
                }
                this.a(enumFacing, enumFacing2);
                aL0.a(aL0.a(stringBuilder, ' '), 'Y');
            }
            aL0.a(stringBuilder, '\n');
        }
        return stringBuilder.toString();
    }

    public void a(Set<EnumFacing> set) {
        Iterator iterator = aS0.f(set);
        while (dz_0.c(iterator)) {
            EnumFacing enumFacing = (EnumFacing)dz_0.b(iterator);
            Iterator iterator2 = aS0.f(set);
            while (dz_0.c(iterator2)) {
                EnumFacing enumFacing2 = (EnumFacing)dz_0.b(iterator2);
                this.a(enumFacing, enumFacing2, true);
            }
        }
    }

    public void a(EnumFacing enumFacing, EnumFacing enumFacing2, boolean bl) {
        aM_.a(this.a, enumFacing.ordinal() + enumFacing2.ordinal() * b, bl);
        aM_.a(this.a, enumFacing2.ordinal() + enumFacing.ordinal() * b, bl);
    }
}


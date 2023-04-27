/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import java.util.Iterator;
import java.util.Random;
import deobf.EnumFacing;

/*
 * Renamed from net.cS
 */
public enum cs_1 implements Predicate,
Iterable
{
    HORIZONTAL(ach_1.c, 0),
    VERTICAL(ach_1.d, 1);


    public boolean apply(Object object) {
        return this.a((EnumFacing)object);
    }

    private cs_1(String string2, int n2) {
    }

    public boolean a(EnumFacing enumFacing) {
        return eh_0.a(SJ.h(enumFacing)) == this;
    }

    public Iterator iterator() {
        return anz_0.a(this.a());
    }

    public EnumFacing a(Random random) {
        EnumFacing[] enumFacingArray = this.a();
        return enumFacingArray[a5_0.a(random, enumFacingArray.length)];
    }

    public EnumFacing[] a() {
        switch (aLE.a[this.ordinal()]) {
            case 1: {
                return new EnumFacing[]{EnumFacing.NORTH, EnumFacing.EAST, EnumFacing.SOUTH, EnumFacing.WEST};
            }
            case 2: {
                return new EnumFacing[]{EnumFacing.UP, EnumFacing.DOWN};
            }
        }
        throw new Error(ach_1.a);
    }
}


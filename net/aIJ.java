/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import java.util.Comparator;
import net.P8;
import net.af3_0;
import net.ci_0;

class aIJ
implements Comparator<Object[]> {
    public int a(Object[] objectArray, Object[] objectArray2) {
        af3_0.b();
        int n = 0;
        if (n < MathInvoker.b(objectArray.length, objectArray2.length)) {
            if (objectArray[n] == af3_0.a || objectArray2[n] == af3_0.a) {
                if (objectArray[n] != af3_0.a || objectArray2[n] != af3_0.a) {
                    return objectArray[n] == af3_0.a ? 1 : -1;
                }
            } else {
                if (objectArray[n] instanceof Comparable) {
                    int n2 = ci_0.a((Comparable)objectArray[n], objectArray2[n]);
                    switch (n2) {
                        default: 
                    }
                    return n2;
                }
                return objectArray[n].equals(objectArray2[n]) ? 0 : P8.a(objectArray[n].hashCode(), objectArray2[n].hashCode());
            }
            ++n;
        }
        return P8.a(objectArray2.length, objectArray.length);
    }

    aIJ() {
    }
}


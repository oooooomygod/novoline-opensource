/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
 * Renamed from net.akD
 */
public class akd_0 {
    public static BigDecimal a(BigDecimal bigDecimal, int n, RoundingMode roundingMode) {
        return bigDecimal.setScale(n, roundingMode);
    }

    public static double a(BigDecimal bigDecimal) {
        return bigDecimal.doubleValue();
    }
}


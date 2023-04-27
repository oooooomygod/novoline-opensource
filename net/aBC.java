/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class aBC {
    public static void a(DecimalFormat decimalFormat, int n) {
        decimalFormat.setGroupingSize(n);
    }

    public static String a(DecimalFormat decimalFormat, double d) {
        return decimalFormat.format(d);
    }

    public static void a(DecimalFormat decimalFormat, RoundingMode roundingMode) {
        decimalFormat.setRoundingMode(roundingMode);
    }
}


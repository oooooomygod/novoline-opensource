/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.text.NumberFormat;
import java.util.Locale;

/*
 * Renamed from net.asR
 */
public class asr_1 {
    public static String a(NumberFormat numberFormat, long l4) {
        return numberFormat.format(l4);
    }

    public static NumberFormat a(Locale locale) {
        return NumberFormat.getIntegerInstance(locale);
    }
}


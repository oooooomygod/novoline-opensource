/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import net.aF2;
import net.auo_0;
import net.ov_0;

/*
 * Renamed from net.Gb
 */
public class gb_0 {
    public static ov_0 a(aF2 aF22) {
        return aF22.d();
    }

    public static aF2 a(aF2 aF22, String[] stringArray) {
        return aF22.a(stringArray);
    }

    public static aF2 a() {
        return aF2.a();
    }

    public static aF2 a(aF2 aF22, char c, Predicate predicate) {
        return aF22.a(c, (Predicate<auo_0>)predicate);
    }
}


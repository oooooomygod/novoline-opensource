/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects$ToStringHelper
 */
package net;

import com.google.common.base.Objects;

/*
 * Renamed from net.mg
 */
public class mg_2 {
    public static Objects.ToStringHelper a(Objects.ToStringHelper toStringHelper, String string, int n) {
        return toStringHelper.add(string, n);
    }

    public static Objects.ToStringHelper a(Objects.ToStringHelper toStringHelper, String string, Object object) {
        return toStringHelper.add(string, object);
    }
}


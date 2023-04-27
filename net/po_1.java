/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.properties.Property
 */
package net;

import com.mojang.authlib.properties.Property;

/*
 * Renamed from net.pO
 */
public class po_1 {
    public static String c(Property property) {
        return property.getName();
    }

    public static String b(Property property) {
        return property.getValue();
    }

    public static String d(Property property) {
        return property.getSignature();
    }

    public static boolean a(Property property) {
        return property.hasSignature();
    }
}


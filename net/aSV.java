/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Marker
 *  org.apache.logging.log4j.MarkerManager
 */
package net;

import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class aSV {
    public static Marker a(String string, Marker marker) {
        return MarkerManager.getMarker((String)string, (Marker)marker);
    }

    public static Marker a(String string) {
        return MarkerManager.getMarker((String)string);
    }
}


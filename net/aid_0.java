/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javafx.beans.property.ReadOnlyStringProperty
 *  javafx.scene.web.WebEngine
 */
package net;

import javafx.beans.property.ReadOnlyStringProperty;
import javafx.scene.web.WebEngine;

/*
 * Renamed from net.aId
 */
public class aid_0 {
    public static void a(WebEngine webEngine, String string) {
        webEngine.load(string);
    }

    public static void b(WebEngine webEngine, String string) {
        webEngine.setUserAgent(string);
    }

    public static ReadOnlyStringProperty a(WebEngine webEngine) {
        return webEngine.locationProperty();
    }
}


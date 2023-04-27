/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javafx.beans.property.ReadOnlyStringProperty
 *  javafx.beans.value.ChangeListener
 */
package net;

import javafx.beans.property.ReadOnlyStringProperty;
import javafx.beans.value.ChangeListener;

/*
 * Renamed from net.ke
 */
public class ke_2 {
    private static String b = "wS12pb";

    public static String b() {
        return b;
    }

    public static void a(ReadOnlyStringProperty readOnlyStringProperty, ChangeListener changeListener) {
        readOnlyStringProperty.addListener(changeListener);
    }

    static {
        if (ke_2.b() == null) {
            ke_2.b("wS12pb");
        }
    }

    public static void b(String string) {
        b = string;
    }
}


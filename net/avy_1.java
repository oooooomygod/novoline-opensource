/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.typesafe.config.ConfigValue
 *  com.typesafe.config.ConfigValueFactory
 */
package net;

import com.typesafe.config.ConfigValue;
import com.typesafe.config.ConfigValueFactory;

/*
 * Renamed from net.avY
 */
public class avy_1 {
    public static ConfigValue a(Object object, String string) {
        return ConfigValueFactory.fromAnyRef((Object)object, (String)string);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.reflect.TypeToken
 */
package net;

import cc.novoline.modules.configurations.property.Property;
import com.google.common.reflect.TypeToken;
import cc.novoline.modules.configurations.ConfigManager;

class a09
extends TypeToken<Property<?>> {
    ConfigManager a;

    a09(ConfigManager configManager) {
        this.a = configManager;
    }
}


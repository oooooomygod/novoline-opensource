/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.typesafe.config.Config
 *  com.typesafe.config.ConfigObject
 */
package net;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigObject;

/*
 * Renamed from net.xj
 */
public class xj_1 {
    public static Config a(Config config) {
        return config.resolve();
    }

    public static ConfigObject b(Config config) {
        return config.root();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.typesafe.config.ConfigOrigin
 *  com.typesafe.config.ConfigOriginFactory
 */
package net;

import com.typesafe.config.ConfigOrigin;
import com.typesafe.config.ConfigOriginFactory;

public class A0 {
    public static ConfigOrigin a(String string) {
        return ConfigOriginFactory.newSimple((String)string);
    }
}


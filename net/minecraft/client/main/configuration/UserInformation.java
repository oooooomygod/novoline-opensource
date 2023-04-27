/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.properties.PropertyMap
 */
package net.minecraft.client.main.configuration;

import com.mojang.authlib.properties.PropertyMap;
import java.net.Proxy;
import net.Session;

public class UserInformation {
    public PropertyMap d;
    public Proxy c;
    public Session b;
    public PropertyMap a;

    public UserInformation(Session session, PropertyMap propertyMap, PropertyMap propertyMap2, Proxy proxy) {
        this.b = session;
        this.a = propertyMap;
        this.d = propertyMap2;
        this.c = proxy;
    }
}


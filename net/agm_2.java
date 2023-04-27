/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.typesafe.config.ConfigOrigin
 */
package net;

import com.typesafe.config.ConfigOrigin;
import java.util.List;

/*
 * Renamed from net.agm
 */
public class agm_2 {
    public static List a(ConfigOrigin configOrigin) {
        return configOrigin.comments();
    }

    public static ConfigOrigin a(ConfigOrigin configOrigin, List list) {
        return configOrigin.withComments(list);
    }
}


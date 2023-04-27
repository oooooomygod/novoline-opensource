/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.typesafe.config.Config
 *  com.typesafe.config.ConfigFactory
 *  com.typesafe.config.ConfigParseOptions
 */
package net;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import com.typesafe.config.ConfigParseOptions;
import java.io.Reader;

/*
 * Renamed from net.a3b
 */
public class a3b_0 {
    public static Config a(Reader reader, ConfigParseOptions configParseOptions) {
        return ConfigFactory.parseReader((Reader)reader, (ConfigParseOptions)configParseOptions);
    }
}


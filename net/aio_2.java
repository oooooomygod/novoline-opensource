/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.typesafe.config.ConfigParseOptions
 *  com.typesafe.config.ConfigRenderOptions
 */
package net;

import com.typesafe.config.ConfigParseOptions;
import com.typesafe.config.ConfigRenderOptions;
import java.nio.file.Path;
import java.util.concurrent.Callable;
import net.ConfigurationOptions;
import net.H8;
import net.ake_1;
import net.hi_0;

/*
 * Renamed from net.aio
 */
public class aio_2 {
    public static ake_1 c(H8 h8) {
        return h8.c();
    }

    public static ConfigRenderOptions a(H8 h8) {
        return h8.e();
    }

    public static hi_0 a(H8 h8, Callable callable) {
        return h8.a(callable);
    }

    public static hi_0 a(H8 h8, Path path) {
        return h8.a(path);
    }

    public static hi_0 a(H8 h8, ConfigurationOptions configurationOptions) {
        return h8.a(configurationOptions);
    }

    public static ConfigParseOptions b(H8 h8) {
        return h8.d();
    }
}


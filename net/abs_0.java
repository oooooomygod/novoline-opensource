/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.configuration.AbstractViaConfig
 */
package net;

import com.viaversion.viaversion.configuration.AbstractViaConfig;
import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.Map;
import net.a7r_0;
import net.aly_1;
import net.ara_2;
import net.uo_0;

/*
 * Renamed from net.aBs
 */
public class abs_0
extends AbstractViaConfig {
    private static List<String> a = a7r_0.a(new String[]{aly_1.j, aly_1.l, aly_1.b, aly_1.h, aly_1.n, aly_1.g, aly_1.c, aly_1.i, aly_1.e, aly_1.f, aly_1.d, aly_1.k});

    public boolean isNMSPlayerTicking() {
        return false;
    }

    public boolean is1_14HitboxFix() {
        return false;
    }

    public String getBlockConnectionMethod() {
        return aly_1.a;
    }

    protected void handleConfig(Map<String, Object> map) {
    }

    public abs_0(File file) {
        super(file);
        this.reloadConfig();
    }

    public List<String> getUnsupportedOptions() {
        return a;
    }

    public boolean is1_9HitboxFix() {
        return false;
    }

    public boolean isAntiXRay() {
        return false;
    }

    public boolean is1_12QuickMoveActionFix() {
        return false;
    }

    public URL getDefaultConfigURL() {
        return uo_0.a(ara_2.s(((Object)((Object)this)).getClass()), aly_1.m);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.platform.ViaInjector
 *  com.viaversion.viaversion.libs.gson.JsonObject
 */
package net;

import com.viaversion.viaversion.api.platform.ViaInjector;
import com.viaversion.viaversion.libs.gson.JsonObject;
import net.afh_1;

/*
 * Renamed from net.sK
 */
public class sk_1
implements ViaInjector {
    public JsonObject getDump() {
        return new JsonObject();
    }

    public void uninject() {
    }

    public String getDecoderName() {
        return afh_1.a;
    }

    public int getServerProtocolVersion() {
        return 47;
    }

    public void inject() {
    }

    public String getEncoderName() {
        return afh_1.b;
    }
}


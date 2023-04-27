/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package net;

import com.google.gson.JsonObject;
import deobf.MCInvoker;
import net.ChatComponentText;
import net.GW;
import net.M0;
import net.WN;
import net.aZN;
import net.ay5_0;
import net.kp_1;

/*
 * Renamed from net.aZi
 */
public class azi_0
extends aZN {
    private String a;

    public azi_0() {
    }

    @Override
    public aZN a(JsonObject jsonObject) {
        return new azi_0(WN.f(M0.d(jsonObject, ay5_0.a)));
    }

    @Override
    public JsonObject a() {
        return null;
    }

    @Override
    public void b() {
        kp_1.a(GW.f(MCInvoker.f().ingameGUI), new ChatComponentText(this.a));
    }

    public azi_0(String string) {
        this.a = string;
    }
}


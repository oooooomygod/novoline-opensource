/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.protocols.base.BaseVersionProvider
 */
package net;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.protocols.base.BaseVersionProvider;
import net.a6S;
import net.aX2;
import net.fo_0;

/*
 * Renamed from net.aqg
 */
class aqg_2
extends BaseVersionProvider {
    a6S a;

    public int getClosestServerProtocol(UserConnection userConnection) throws Exception {
        a6S.b();
        if (aX2.d(userConnection)) {
            return fo_0.a(fo_0.a());
        }
        return super.getClosestServerProtocol(userConnection);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    aqg_2(a6S a6S2) {
        this.a = a6S2;
    }
}


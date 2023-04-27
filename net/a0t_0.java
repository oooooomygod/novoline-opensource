/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package net;

import cc.novoline.invoke.StringInvoker;
import com.google.gson.JsonObject;
import java.io.File;
import java.net.SocketAddress;
import net.a0z_0;
import net.a8d_0;
import net.a8i_0;
import net.acs_0;

/*
 * Renamed from net.a0t
 */
public class a0t_0
extends a0z_0<String, a8i_0> {
    @Override
    protected a8d_0<String> a(JsonObject jsonObject) {
        return new a8i_0(jsonObject);
    }

    public a8i_0 a(SocketAddress socketAddress) {
        String string = this.c(socketAddress);
        return (a8i_0)this.c(string);
    }

    public a0t_0(File file) {
        super(file);
    }

    public boolean b(SocketAddress socketAddress) {
        String string = this.c(socketAddress);
        return this.a(string);
    }

    @Override
    private String c(SocketAddress socketAddress) {
        String string = socketAddress.toString();
        if (StringInvoker.a(string, (CharSequence)acs_0.a)) {
            string = StringInvoker.a(string, StringInvoker.d(string, 47) + 1);
        }
        if (StringInvoker.a(string, (CharSequence)acs_0.b)) {
            string = StringInvoker.b(string, 0, StringInvoker.d(string, 58));
        }
        return string;
    }
}


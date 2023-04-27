/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package net;

import com.google.gson.JsonObject;
import java.util.Date;
import net.M0;
import net.WN;
import net.XV;
import net.a8N;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.a8i
 */
public class a8i_0
extends a8N<String> {
    public a8i_0(JsonObject jsonObject) {
        super(a8i_0.a(jsonObject), jsonObject);
    }

    public a8i_0(String string, Date date, String string2, Date date2, String string3) {
        super(string, date, string2, date2, string3);
    }

    private static String a(JsonObject jsonObject) {
        return M0.c(jsonObject, XV.c) ? WN.f(M0.d(jsonObject, XV.a)) : null;
    }

    @Override
    protected void a(JsonObject jsonObject) {
        if (this.b() != null) {
            M0.a(jsonObject, XV.b, (String)this.b());
            super.a(jsonObject);
        }
    }

    public a8i_0(String string) {
        this(string, (Date)null, (String)null, (Date)null, (String)null);
    }
}


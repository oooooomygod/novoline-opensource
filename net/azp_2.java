/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 */
package net;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.amv_2;

/*
 * Renamed from net.azp
 */
class azp_2 {
    @Expose
    @SerializedName(value="name")
    private String b;
    @Expose
    @SerializedName(value="changedToAt")
    private long a;

    public String a() {
        return this.b;
    }

    public boolean c() {
        amv_2.b();
        return this.a == 0L;
    }

    public azp_2(String string, long l4) {
        this.b = string;
        this.a = l4;
    }

    public long b() {
        return this.a;
    }
}


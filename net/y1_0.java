/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 */
package net;

import cc.novoline.invoke.IOUtilsInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import deobf.IMetadataSerializer;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Map;
import net.IMetadataSection;
import net.ResourceLocation;
import net.WN;
import net.YM;
import net.a1r;
import net.abh_2;

/*
 * Renamed from net.y1
 */
public class y1_0
implements abh_2 {
    private ResourceLocation b;
    private InputStream e;
    private String a;
    private IMetadataSerializer h;
    private Map<String, IMetadataSection> f = MapsInvoker.a();
    private JsonObject g;
    private InputStream c;
    private boolean d;

    @Override
    public InputStream a() {
        return this.c;
    }

    public int hashCode() {
        int n = this.a != null ? this.a.hashCode() : 0;
        n = 31 * n + (this.b != null ? this.b.hashCode() : 0);
        return n;
    }

    @Override
    public String c() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof y1_0)) {
            return false;
        }
        y1_0 y1_02 = (y1_0)object;
        if (this.b != null ? !this.b.equals(y1_02.b) : y1_02.b != null) {
            return false;
        }
        if (this.a != null) {
            return this.a.equals(y1_02.a);
        }
        return y1_02.a == null;
    }

    public y1_0(String string, ResourceLocation resourceLocation, InputStream inputStream, InputStream inputStream2, IMetadataSerializer iMetadataSerializer) {
        this.a = string;
        this.b = resourceLocation;
        this.c = inputStream;
        this.e = inputStream2;
        this.h = iMetadataSerializer;
    }

    @Override
    public <T extends IMetadataSection> T a(String string) {
        Object object;
        if (!this.b()) {
            return (T)((IMetadataSection)null);
        }
        if (this.g == null && !this.d) {
            this.d = true;
            object = null;
            try {
                object = new BufferedReader(new InputStreamReader(this.e));
                this.g = WN.c(a1r.a(new JsonParser(), (Reader)object));
            }
            finally {
                IOUtilsInvoker.b((Reader)object);
            }
        }
        object = (IMetadataSection)MapInvoker.c(this.f, string);
        object = YM.a(this.h, string, this.g);
        return (T)object;
    }

    @Override
    public ResourceLocation d() {
        return this.b;
    }

    @Override
    public boolean b() {
        return this.e != null;
    }
}


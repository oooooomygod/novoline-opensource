/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonObject
 */
package deobf;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import deobf.IChatComponent;
import net.ChatStyle;
import net.DF;
import net.H1;
import net.IMetadataSection;
import net.NZ;
import net.V4;
import net.aB4;
import net.aB9;
import net.alb_0;
import net.axp_0;
import net.pz_1;
import net.tp_0;
import net.zg_2;

public class IMetadataSerializer {
    private GsonBuilder c;
    private Gson a;
    private NZ<String, H1<? extends IMetadataSection>> b = new zg_2<String, H1<? extends IMetadataSection>>();

    public <T extends IMetadataSection> T a(String string, JsonObject jsonObject) {
        throw new IllegalArgumentException(tp_0.b);
    }

    private Gson a() {
        if (this.a == null) {
            this.a = aB9.b(this.c);
        }
        return this.a;
    }

    public <T extends IMetadataSection> void a(DF<T> dF, Class<T> clazz) {
        axp_0.a(this.b, pz_1.a(dF), new H1(this, dF, clazz, null));
        aB9.a(this.c, clazz, dF);
        this.a = null;
    }

    public IMetadataSerializer() {
        this.c = new GsonBuilder();
        aB9.a(this.c, IChatComponent.class, (Object)new V4());
        aB9.a(this.c, ChatStyle.class, (Object)new aB4());
        aB9.a(this.c, new alb_0());
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}


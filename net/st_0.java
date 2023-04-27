/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  org.lwjgl.util.vector.Vector3f
 */
package net;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import net.Ei;
import net.M0;
import net.MathHelper;
import net.WN;
import net.aL0;
import net.aSZ;
import net.ady_2;
import net.aem;
import net.k7_0;
import org.lwjgl.util.vector.Vector3f;

/*
 * Renamed from net.St
 */
class st_0
implements JsonDeserializer<aSZ> {
    private static Vector3f a;
    private static Vector3f b;
    private static Vector3f c;

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    public aSZ a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = WN.c(jsonElement);
        Vector3f vector3f = this.a(jsonObject, k7_0.a, c);
        Vector3f vector3f2 = this.a(jsonObject, k7_0.d, b);
        ady_2.a(vector3f2, 0.0625f);
        vector3f2.x = MathHelper.b(vector3f2.x, -1.5f, 1.5f);
        vector3f2.y = MathHelper.b(vector3f2.y, -1.5f, 1.5f);
        vector3f2.z = MathHelper.b(vector3f2.z, -1.5f, 1.5f);
        Vector3f vector3f3 = this.a(jsonObject, k7_0.f, a);
        vector3f3.x = MathHelper.b(vector3f3.x, -4.0f, 4.0f);
        vector3f3.y = MathHelper.b(vector3f3.y, -4.0f, 4.0f);
        vector3f3.z = MathHelper.b(vector3f3.z, -4.0f, 4.0f);
        return new aSZ(vector3f, vector3f2, vector3f3);
    }

    st_0() {
    }

    static {
        c = new Vector3f(0.0f, 0.0f, 0.0f);
        b = new Vector3f(0.0f, 0.0f, 0.0f);
        a = new Vector3f(1.0f, 1.0f, 1.0f);
    }

    private Vector3f a(JsonObject jsonObject, String string, Vector3f vector3f) {
        if (!M0.c(jsonObject, string)) {
            return vector3f;
        }
        JsonArray jsonArray = Ei.b(jsonObject, string);
        if (aem.a(jsonArray) != 3) {
            throw new JsonParseException(aL0.c(aL0.a(aL0.a(aL0.a(new StringBuilder(), k7_0.g), string), k7_0.c), aem.a(jsonArray)).toString());
        }
        float[] fArray = new float[3];
        int n = 0;
        while (true) {
            int cfr_ignored_0 = fArray.length;
            fArray[n] = Ei.b(aem.a(jsonArray, n), aL0.a(aL0.c(aL0.a(aL0.a(new StringBuilder(), string), k7_0.e), n), k7_0.b).toString());
            ++n;
        }
    }
}


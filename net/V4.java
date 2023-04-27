/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import deobf.ChatComponentStyle;
import deobf.IChatComponent;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Map;
import net.A;
import net.AT;
import net.ChatComponentText;
import net.ChatStyle;
import net.ET;
import net.Ei;
import net.FG;
import net.HX;
import net.M0;
import net.WN;
import net.a4H;
import net.a4W;
import net.aB4;
import net.aB9;
import net.aBO;
import net.aIW;
import net.aL0;
import net.aN0;
import net.aS0;
import net.aem;
import net.alb_0;
import net.aob_1;
import net.aoo_1;
import net.aoz_1;
import net.axq_2;
import net.dz_0;

public class V4
implements JsonDeserializer<IChatComponent>,
JsonSerializer<IChatComponent> {
    private static Gson a;

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    private void a(ChatStyle chatStyle, JsonObject jsonObject, JsonSerializationContext jsonSerializationContext) {
        JsonElement jsonElement = a4H.a(jsonSerializationContext, chatStyle);
        if (WN.h(jsonElement)) {
            JsonObject jsonObject2 = (JsonObject)jsonElement;
            Iterator iterator = aS0.f(M0.a(jsonObject2));
            while (dz_0.c(iterator)) {
                Map.Entry entry = (Map.Entry)dz_0.b(iterator);
                M0.a(jsonObject, (String)FG.b(entry), (JsonElement)FG.a(entry));
            }
        }
    }

    public static String a(IChatComponent iChatComponent) {
        return a4W.a(a, iChatComponent);
    }

    public static IChatComponent a(String string) {
        return (IChatComponent)a4W.a(a, string, IChatComponent.class);
    }

    public IChatComponent a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        String string;
        ChatComponentStyle chatComponentStyle;
        if (WN.k(jsonElement)) {
            return new ChatComponentText(WN.f(jsonElement));
        }
        if (!WN.h(jsonElement)) {
            if (WN.a(jsonElement)) {
                JsonArray jsonArray = WN.g(jsonElement);
                IChatComponent iChatComponent = null;
                Iterator iterator = aem.b(jsonArray);
                while (dz_0.c(iterator)) {
                    IChatComponent iChatComponent2;
                    JsonElement jsonElement2 = (JsonElement)dz_0.b(iterator);
                    iChatComponent = iChatComponent2 = this.a(jsonElement2, jsonElement2.getClass(), jsonDeserializationContext);
                }
                return iChatComponent;
            }
            throw new JsonParseException(aL0.a(aL0.a(aL0.a(new StringBuilder(), A.v), jsonElement.toString()), A.C).toString());
        }
        JsonObject jsonObject = WN.c(jsonElement);
        if (M0.c(jsonObject, A.j)) {
            chatComponentStyle = new ChatComponentText(WN.f(M0.d(jsonObject, A.i)));
        } else if (M0.c(jsonObject, A.p)) {
            string = WN.f(M0.d(jsonObject, A.f));
            if (M0.c(jsonObject, A.D)) {
                JsonArray jsonArray = M0.a(jsonObject, A.x);
                Object[] objectArray = new Object[aem.a(jsonArray)];
                for (int i = 0; i < objectArray.length; ++i) {
                    ChatComponentText chatComponentText;
                    objectArray[i] = this.a(aem.a(jsonArray, i), type, jsonDeserializationContext);
                    if (!(objectArray[i] instanceof ChatComponentText) || !HX.d(axq_2.b(chatComponentText = (ChatComponentText)objectArray[i])) || !ListInvoker.isEmpty(axq_2.c(chatComponentText))) continue;
                    objectArray[i] = axq_2.a(chatComponentText);
                }
                chatComponentStyle = new aoz_1(string, objectArray);
            } else {
                chatComponentStyle = new aoz_1(string, new Object[0]);
            }
        } else if (M0.c(jsonObject, A.w)) {
            string = M0.b(jsonObject, A.B);
            if (!M0.c((JsonObject)string, A.k) || !M0.c((JsonObject)string, A.y)) {
                throw new JsonParseException(A.z);
            }
            chatComponentStyle = new aoo_1(Ei.f((JsonObject)string, A.m), Ei.f((JsonObject)string, A.G));
            if (M0.c((JsonObject)string, A.b)) {
                ET.a((aoo_1)chatComponentStyle, Ei.f((JsonObject)string, A.t));
            }
        } else {
            if (!M0.c(jsonObject, A.d)) {
                throw new JsonParseException(aL0.a(aL0.a(aL0.a(new StringBuilder(), A.A), jsonElement.toString()), A.F).toString());
            }
            chatComponentStyle = new aob_1(Ei.f(jsonObject, A.I));
        }
        if (M0.c(jsonObject, A.u)) {
            string = M0.a(jsonObject, A.s);
            if (aem.a((JsonArray)string) <= 0) {
                throw new JsonParseException(A.l);
            }
            for (int i = 0; i < aem.a((JsonArray)string); ++i) {
                aBO.a((IChatComponent)chatComponentStyle, this.a(aem.a((JsonArray)string, i), type, jsonDeserializationContext));
            }
        }
        aBO.a((IChatComponent)chatComponentStyle, (ChatStyle)aN0.a(jsonDeserializationContext, jsonElement, ChatStyle.class));
        return chatComponentStyle;
    }

    public JsonElement a(IChatComponent iChatComponent, Type type, JsonSerializationContext jsonSerializationContext) {
        Iterator iterator;
        Object object;
        if (iChatComponent instanceof ChatComponentText && HX.d(aBO.f(iChatComponent)) && ListInvoker.isEmpty(aBO.b(iChatComponent))) {
            return new JsonPrimitive(axq_2.a((ChatComponentText)iChatComponent));
        }
        JsonObject jsonObject = new JsonObject();
        if (!HX.d(aBO.f(iChatComponent))) {
            this.a(aBO.f(iChatComponent), jsonObject, jsonSerializationContext);
        }
        if (!ListInvoker.isEmpty(aBO.b(iChatComponent))) {
            object = new JsonArray();
            iterator = ListInvoker.iterator(aBO.b(iChatComponent));
            while (dz_0.c(iterator)) {
                Object[] objectArray = (Object[])dz_0.b(iterator);
                aem.a(object, this.a((IChatComponent)objectArray, objectArray.getClass(), jsonSerializationContext));
            }
            M0.a(jsonObject, A.e, (JsonElement)object);
        }
        if (iChatComponent instanceof ChatComponentText) {
            M0.a(jsonObject, A.r, axq_2.a((ChatComponentText)iChatComponent));
        } else if (iChatComponent instanceof aoz_1) {
            object = (aoz_1)iChatComponent;
            M0.a(jsonObject, A.n, aIW.e((aoz_1)object));
            if (aIW.d((aoz_1)object) != null && aIW.d((aoz_1)object).length > 0) {
                iterator = new JsonArray();
                for (Object object2 : aIW.d((aoz_1)object)) {
                    if (object2 instanceof IChatComponent) {
                        aem.a((JsonArray)iterator, this.a((IChatComponent)object2, object2.getClass(), jsonSerializationContext));
                        continue;
                    }
                    aem.a((JsonArray)iterator, (JsonElement)new JsonPrimitive(StringInvoker.a(object2)));
                }
                M0.a(jsonObject, A.o, (JsonElement)iterator);
            }
        } else if (iChatComponent instanceof aoo_1) {
            object = (aoo_1)iChatComponent;
            iterator = new JsonObject();
            M0.a((JsonObject)iterator, A.a, ET.c((aoo_1)object));
            M0.a((JsonObject)iterator, A.H, ET.a((aoo_1)object));
            M0.a((JsonObject)iterator, A.g, ET.b((aoo_1)object));
            M0.a(jsonObject, A.E, (JsonElement)iterator);
        } else {
            if (!(iChatComponent instanceof aob_1)) {
                throw new IllegalArgumentException(aL0.a(aL0.a(aL0.a(new StringBuilder(), A.c), iChatComponent), A.q).toString());
            }
            object = (aob_1)iChatComponent;
            M0.a(jsonObject, A.h, AT.a((aob_1)object));
        }
        return jsonObject;
    }

    static {
        GsonBuilder gsonBuilder = new GsonBuilder();
        aB9.a(gsonBuilder, IChatComponent.class, (Object)new V4());
        aB9.a(gsonBuilder, ChatStyle.class, (Object)new aB4());
        aB9.a(gsonBuilder, new alb_0());
        a = aB9.b(gsonBuilder);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.IChatComponent;
import java.util.List;
import net.ChatComponentText;
import net.ChatStyle;

/*
 * Renamed from net.axq
 */
public class axq_2 {
    public static List c(ChatComponentText chatComponentText) {
        return chatComponentText.a();
    }

    public static ChatStyle b(ChatComponentText chatComponentText) {
        return chatComponentText.d();
    }

    public static IChatComponent a(ChatComponentText chatComponentText, ChatStyle chatStyle) {
        return chatComponentText.a(chatStyle);
    }

    public static IChatComponent a(ChatComponentText chatComponentText, String string) {
        return chatComponentText.a(string);
    }

    public static String a(ChatComponentText chatComponentText) {
        return chatComponentText.d();
    }

    public static IChatComponent a(ChatComponentText chatComponentText, IChatComponent iChatComponent) {
        return chatComponentText.a(iChatComponent);
    }
}


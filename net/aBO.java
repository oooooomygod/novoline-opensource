/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.IChatComponent;
import java.util.List;
import net.ChatStyle;

public class aBO {
    private static ListInvoker[] b;

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static ChatStyle f(IChatComponent iChatComponent) {
        return iChatComponent.d();
    }

    public static IChatComponent a(IChatComponent iChatComponent, String string) {
        return iChatComponent.a(string);
    }

    static {
        if (aBO.b() != null) {
            aBO.b(new ListInvoker[1]);
        }
    }

    public static String d(IChatComponent iChatComponent) {
        return iChatComponent.getUnformattedText();
    }

    public static IChatComponent a(IChatComponent iChatComponent, ChatStyle chatStyle) {
        return iChatComponent.a(chatStyle);
    }

    public static String a(IChatComponent iChatComponent) {
        return iChatComponent.getFormattedText();
    }

    public static IChatComponent c(IChatComponent iChatComponent) {
        return iChatComponent.b();
    }

    public static List b(IChatComponent iChatComponent) {
        return iChatComponent.a();
    }

    public static String e(IChatComponent iChatComponent) {
        return iChatComponent.c();
    }

    public static IChatComponent a(IChatComponent iChatComponent, IChatComponent iChatComponent2) {
        return iChatComponent.a(iChatComponent2);
    }

    public static ListInvoker[] b() {
        return b;
    }
}


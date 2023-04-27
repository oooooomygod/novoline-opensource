/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.utils.fonts.api.FontRenderer;
import deobf.IChatComponent;
import deobf.MCInvoker;
import java.util.ArrayList;
import java.util.List;
import net.ChatComponentText;
import net.HX;
import net.a7l_0;
import net.aBO;
import net.aL0;
import net.axq_2;
import net.my_0;
import net.sf_1;
import net.tc_0;

/*
 * Renamed from net.aGs
 */
public class ags_0 {
    public static List<IChatComponent> a(IChatComponent iChatComponent, int n, FontRenderer fontRenderer, boolean bl, boolean bl2) {
        int n2 = 0;
        ChatComponentText chatComponentText = new ChatComponentText(sf_1.b);
        ArrayList arrayList = my_0.c();
        ArrayList arrayList2 = my_0.a(iChatComponent);
        for (int i = 0; i < ListInvoker.size(arrayList2); ++i) {
            String string;
            String string2;
            IChatComponent iChatComponent2 = (IChatComponent)ListInvoker.get(arrayList2, i);
            String string3 = aBO.e(iChatComponent2);
            if (StringInvoker.a(string3, (CharSequence)sf_1.c)) {
                int n3 = StringInvoker.d(string3, 10);
                string2 = StringInvoker.a(string3, n3 + 1);
                string3 = StringInvoker.b(string3, 0, n3 + 1);
                ChatComponentText chatComponentText2 = new ChatComponentText(string2);
                axq_2.a(chatComponentText2, HX.c(aBO.f(iChatComponent2)));
                ListInvoker.add(arrayList2, i + 1, chatComponentText2);
            }
            string2 = StringInvoker.c(string = ags_0.a(aL0.a(aL0.a(new StringBuilder(), HX.g(aBO.f(iChatComponent2))), string3).toString(), bl2), sf_1.f) ? StringInvoker.b(string, 0, StringInvoker.c(string) - 1) : string;
            int n4 = a7l_0.a(fontRenderer, string2);
            ChatComponentText chatComponentText3 = new ChatComponentText(string2);
            axq_2.a(chatComponentText3, HX.c(aBO.f(iChatComponent2)));
            if (n2 + n4 > n) {
                String string4;
                String string5 = a7l_0.a(fontRenderer, string, n - n2, false);
                String string6 = string4 = StringInvoker.c(string5) < StringInvoker.c(string) ? StringInvoker.a(string, StringInvoker.c(string5)) : null;
                if (!StringInvoker.g(string4)) {
                    int n5 = StringInvoker.j(string5, sf_1.j);
                    if (a7l_0.a(fontRenderer, StringInvoker.b(string, 0, n5)) > 0) {
                        string5 = StringInvoker.b(string, 0, n5);
                        string4 = StringInvoker.a(string, ++n5);
                    } else if (!StringInvoker.a(string, (CharSequence)sf_1.i)) {
                        string5 = sf_1.m;
                        string4 = string;
                    }
                    ChatComponentText chatComponentText4 = new ChatComponentText(string4);
                    axq_2.a(chatComponentText4, HX.c(aBO.f(iChatComponent2)));
                    ListInvoker.add(arrayList2, i + 1, chatComponentText4);
                }
                n4 = a7l_0.a(fontRenderer, string5);
                chatComponentText3 = new ChatComponentText(string5);
                axq_2.a(chatComponentText3, HX.c(aBO.f(iChatComponent2)));
            }
            if (n2 + n4 <= n) {
                n2 += n4;
                aBO.a((IChatComponent)chatComponentText, chatComponentText3);
            }
            ListInvoker.add(arrayList, chatComponentText);
            n2 = 0;
            chatComponentText = new ChatComponentText(sf_1.a);
        }
        ListInvoker.add(arrayList, chatComponentText);
        return arrayList;
    }

    public static String a(String string, boolean bl) {
        return !MCInvoker.f().gameSettings.ax ? tc_0.b(string) : string;
    }

    public static List<IChatComponent> a(IChatComponent iChatComponent, int n, deobf.FontRenderer fontRenderer, boolean bl, boolean bl2) {
        int n2 = 0;
        ChatComponentText chatComponentText = new ChatComponentText(sf_1.n);
        ArrayList arrayList = my_0.c();
        ArrayList arrayList2 = my_0.a(iChatComponent);
        for (int i = 0; i < ListInvoker.size(arrayList2); ++i) {
            String string;
            String string2;
            IChatComponent iChatComponent2 = (IChatComponent)ListInvoker.get(arrayList2, i);
            String string3 = aBO.e(iChatComponent2);
            if (StringInvoker.a(string3, (CharSequence)sf_1.h)) {
                int n3 = StringInvoker.d(string3, 10);
                string2 = StringInvoker.a(string3, n3 + 1);
                string3 = StringInvoker.b(string3, 0, n3 + 1);
                ChatComponentText chatComponentText2 = new ChatComponentText(string2);
                axq_2.a(chatComponentText2, HX.c(aBO.f(iChatComponent2)));
                ListInvoker.add(arrayList2, i + 1, chatComponentText2);
            }
            string2 = StringInvoker.c(string = ags_0.a(aL0.a(aL0.a(new StringBuilder(), HX.g(aBO.f(iChatComponent2))), string3).toString(), bl2), sf_1.e) ? StringInvoker.b(string, 0, StringInvoker.c(string) - 1) : string;
            int n4 = FontRendererInvoker.a(fontRenderer, string2);
            ChatComponentText chatComponentText3 = new ChatComponentText(string2);
            axq_2.a(chatComponentText3, HX.c(aBO.f(iChatComponent2)));
            if (n2 + n4 > n) {
                String string4;
                String string5 = FontRendererInvoker.a(fontRenderer, string, n - n2, false);
                String string6 = string4 = StringInvoker.c(string5) < StringInvoker.c(string) ? StringInvoker.a(string, StringInvoker.c(string5)) : null;
                if (!StringInvoker.g(string4)) {
                    int n5 = StringInvoker.j(string5, sf_1.l);
                    if (FontRendererInvoker.a(fontRenderer, StringInvoker.b(string, 0, n5)) > 0) {
                        string5 = StringInvoker.b(string, 0, n5);
                        string4 = StringInvoker.a(string, ++n5);
                    } else if (!StringInvoker.a(string, (CharSequence)sf_1.k)) {
                        string5 = sf_1.g;
                        string4 = string;
                    }
                    ChatComponentText chatComponentText4 = new ChatComponentText(string4);
                    axq_2.a(chatComponentText4, HX.c(aBO.f(iChatComponent2)));
                    ListInvoker.add(arrayList2, i + 1, chatComponentText4);
                }
                n4 = FontRendererInvoker.a(fontRenderer, string5);
                chatComponentText3 = new ChatComponentText(string5);
                axq_2.a(chatComponentText3, HX.c(aBO.f(iChatComponent2)));
            }
            if (n2 + n4 <= n) {
                n2 += n4;
                aBO.a((IChatComponent)chatComponentText, chatComponentText3);
            }
            ListInvoker.add(arrayList, chatComponentText);
            n2 = 0;
            chatComponentText = new ChatComponentText(sf_1.d);
        }
        ListInvoker.add(arrayList, chatComponentText);
        return arrayList;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import deobf.ChatComponentStyle;
import deobf.IChatComponent;
import java.util.Iterator;
import net.HX;
import net.aL0;
import net.dz_0;
import net.vf_1;

public class ChatComponentText
extends ChatComponentStyle {
    private String c;

    @Override
    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), vf_1.b), this.c), '\''), vf_1.a), this.a), vf_1.c), this.d()), '}').toString();
    }

    @Override
    public ChatComponentText b() {
        ChatComponentText chatComponentText = new ChatComponentText(this.c);
        chatComponentText.a(HX.c(this.d()));
        Iterator<IChatComponent> iterator = this.a().iterator();
        while (dz_0.c(iterator)) {
            IChatComponent iChatComponent = (IChatComponent)dz_0.b(iterator);
            chatComponentText.a(iChatComponent.b());
        }
        return chatComponentText;
    }

    public ChatComponentText(String string) {
        this.c = string;
    }

    @Override
    public String c() {
        return this.c;
    }

    public void a(String string) {
        this.c = string;
    }

    public String a() {
        return this.c;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ChatComponentText)) {
            return false;
        }
        ChatComponentText chatComponentText = (ChatComponentText)object;
        return this.c.equals(chatComponentText.d()) && super.equals(object);
    }

    public String d() {
        return this.c;
    }
}


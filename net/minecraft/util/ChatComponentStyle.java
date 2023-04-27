/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import cc.novoline.invoke.ListInvoker;
import deobf.IChatComponent;
import java.util.Iterator;
import java.util.List;
import net.ChatComponentText;
import net.ChatStyle;
import net.HX;
import net.aBO;
import net.aL0;
import net.anw_0;
import net.anz_0;
import net.aq_2;
import net.dz_0;
import net.my_0;

public abstract class ChatComponentStyle
implements IChatComponent {
    protected List<IChatComponent> a = my_0.c();
    private ChatStyle b;

    public static Iterator<IChatComponent> a(Iterable<IChatComponent> iterable) {
        Iterator iterator = anz_0.b(anz_0.a(iterable.iterator(), Iterable::iterator));
        return anz_0.a(iterator, ChatComponentStyle::lambda$createDeepCopyIterator$0);
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aq_2.b), this.b), aq_2.a), this.a), '}').toString();
    }

    public int hashCode() {
        return 31 * this.b.hashCode() + this.a.hashCode();
    }

    @Override
    public Iterator<IChatComponent> iterator() {
        return anz_0.a((Iterator)anz_0.a(new ChatComponentStyle[]{this}), ChatComponentStyle.a(this.a));
    }

    @Override
    public String getUnformattedText() {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<IChatComponent> iterator = this.iterator();
        while (dz_0.c(iterator)) {
            IChatComponent iChatComponent = (IChatComponent)dz_0.b(iterator);
            aL0.a(stringBuilder, aBO.e(iChatComponent));
        }
        return stringBuilder.toString();
    }

    @Override
    public IChatComponent a(IChatComponent iChatComponent) {
        HX.a(iChatComponent.d(), this.d());
        ListInvoker.add(this.a, iChatComponent);
        return this;
    }

    @Override
    public ChatStyle d() {
        if (this.b == null) {
            this.b = new ChatStyle();
            Iterator<IChatComponent> iterator = this.a.iterator();
            while (dz_0.c(iterator)) {
                IChatComponent iChatComponent = (IChatComponent)dz_0.b(iterator);
                HX.a(iChatComponent.d(), this.b);
            }
        }
        return this.b;
    }

    public IChatComponent a(anw_0 anw_02) {
        if (this.b == null) {
            this.a(new ChatStyle(anw_02));
        } else {
            this.a(HX.a(HX.a(this.b), anw_02));
        }
        return this;
    }

    @Override
    public String getFormattedText() {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<IChatComponent> iterator = this.iterator();
        while (dz_0.c(iterator)) {
            IChatComponent iChatComponent = (IChatComponent)dz_0.b(iterator);
            aL0.a(stringBuilder, HX.g(iChatComponent.d()));
            aL0.a(stringBuilder, aBO.e(iChatComponent));
            aL0.a(stringBuilder, (Object)anw_0.RESET);
        }
        return stringBuilder.toString();
    }

    private static IChatComponent lambda$createDeepCopyIterator$0(IChatComponent iChatComponent) {
        IChatComponent iChatComponent2 = aBO.c(iChatComponent);
        return iChatComponent2.a(HX.a(iChatComponent2.d()));
    }

    @Override
    public IChatComponent a(ChatStyle chatStyle) {
        this.b = chatStyle;
        Iterator<IChatComponent> iterator = this.a.iterator();
        while (dz_0.c(iterator)) {
            IChatComponent iChatComponent = (IChatComponent)dz_0.b(iterator);
            HX.a(iChatComponent.d(), this.d());
        }
        return this;
    }

    @Override
    public List<IChatComponent> a() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ChatComponentStyle)) {
            return false;
        }
        ChatComponentStyle chatComponentStyle = (ChatComponentStyle)object;
        return this.a.equals(chatComponentStyle.a) && this.d().equals(chatComponentStyle.d());
    }

    @Override
    public IChatComponent a(String string) {
        return this.a(new ChatComponentText(string));
    }
}


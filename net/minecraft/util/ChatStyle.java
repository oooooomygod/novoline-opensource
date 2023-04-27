/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import net.aL0;
import net.amn_0;
import net.anw_0;
import net.auk_2;
import net.awv_1;
import net.oy_0;
import net.xo_1;

public class ChatStyle {
    private Boolean a;
    private Boolean d;
    private Boolean k;
    private String h;
    private awv_1 i;
    private ChatStyle g;
    private static ChatStyle f = new xo_1();
    private Boolean j;
    private anw_0 c;
    private amn_0 b;
    private Boolean e;

    static anw_0 b(ChatStyle chatStyle) {
        return chatStyle.c;
    }

    static Boolean a(ChatStyle chatStyle, Boolean bl) {
        chatStyle.j = bl;
        return chatStyle.j;
    }

    public boolean a() {
        return this.k == null && this.e == null && this.j == null && this.a == null && this.d == null && this.c == null && this.i == null && this.b == null;
    }

    public int hashCode() {
        int n = this.c.hashCode();
        n = 31 * n + this.k.hashCode();
        n = 31 * n + this.e.hashCode();
        n = 31 * n + this.a.hashCode();
        n = 31 * n + this.j.hashCode();
        n = 31 * n + this.d.hashCode();
        n = 31 * n + this.i.hashCode();
        n = 31 * n + this.b.hashCode();
        n = 31 * n + this.h.hashCode();
        return n;
    }

    public anw_0 l() {
        return this.c == null ? this.g().l() : this.c;
    }

    static Boolean i(ChatStyle chatStyle) {
        return chatStyle.e;
    }

    private ChatStyle g() {
        return this.g == null ? f : this.g;
    }

    static Boolean e(ChatStyle chatStyle, Boolean bl) {
        chatStyle.a = bl;
        return chatStyle.a;
    }

    public boolean j() {
        return this.k == null ? this.g().j() : auk_2.a(this.k);
    }

    static String h(ChatStyle chatStyle) {
        return chatStyle.h;
    }

    static anw_0 a(ChatStyle chatStyle, anw_0 anw_02) {
        chatStyle.c = anw_02;
        return chatStyle.c;
    }

    public String f() {
        if (this.a()) {
            return this.g != null ? this.g.f() : oy_0.j;
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (this.l() != null) {
            aL0.a(stringBuilder, (Object)this.l());
        }
        if (this.j()) {
            aL0.a(stringBuilder, (Object)anw_0.BOLD);
        }
        if (this.k()) {
            aL0.a(stringBuilder, (Object)anw_0.ITALIC);
        }
        if (this.e()) {
            aL0.a(stringBuilder, (Object)anw_0.UNDERLINE);
        }
        if (this.i()) {
            aL0.a(stringBuilder, (Object)anw_0.OBFUSCATED);
        }
        if (this.b()) {
            aL0.a(stringBuilder, (Object)anw_0.STRIKETHROUGH);
        }
        return stringBuilder.toString();
    }

    static Boolean d(ChatStyle chatStyle, Boolean bl) {
        chatStyle.k = bl;
        return chatStyle.k;
    }

    public String n() {
        return this.h == null ? this.g().n() : this.h;
    }

    static Boolean e(ChatStyle chatStyle) {
        return chatStyle.d;
    }

    static String a(ChatStyle chatStyle, String string) {
        chatStyle.h = string;
        return chatStyle.h;
    }

    public ChatStyle e(Boolean bl) {
        this.j = bl;
        return this;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ChatStyle)) {
            return false;
        }
        ChatStyle chatStyle = (ChatStyle)object;
        if (this.j() != chatStyle.j() || this.l() != chatStyle.l() || this.k() != chatStyle.k() || this.i() != chatStyle.i() || this.b() != chatStyle.b() || this.e() != chatStyle.e() || (this.d() == null ? chatStyle.d() != null : !this.d().equals(chatStyle.d())) || (this.h() == null ? chatStyle.h() != null : !this.h().equals(chatStyle.h())) || !(this.n() != null ? this.n().equals(chatStyle.n()) : chatStyle.n() == null)) {
            boolean bl = false;
            return bl;
        }
        boolean bl = true;
        return bl;
    }

    public boolean i() {
        return this.d == null ? this.g().i() : auk_2.a(this.d);
    }

    static Boolean c(ChatStyle chatStyle) {
        return chatStyle.j;
    }

    static awv_1 g(ChatStyle chatStyle) {
        return chatStyle.i;
    }

    public awv_1 d() {
        return this.i == null ? this.g().d() : this.i;
    }

    static Boolean d(ChatStyle chatStyle) {
        return chatStyle.a;
    }

    public ChatStyle d(Boolean bl) {
        this.a = bl;
        return this;
    }

    static Boolean c(ChatStyle chatStyle, Boolean bl) {
        chatStyle.d = bl;
        return chatStyle.d;
    }

    public boolean b() {
        return this.j == null ? this.g().b() : auk_2.a(this.j);
    }

    static awv_1 a(ChatStyle chatStyle, awv_1 awv_12) {
        chatStyle.i = awv_12;
        return chatStyle.i;
    }

    static Boolean j(ChatStyle chatStyle) {
        return chatStyle.k;
    }

    static amn_0 a(ChatStyle chatStyle, amn_0 amn_02) {
        chatStyle.b = amn_02;
        return chatStyle.b;
    }

    public ChatStyle a(awv_1 awv_12) {
        this.i = awv_12;
        return this;
    }

    public boolean e() {
        return this.a == null ? this.g().e() : auk_2.a(this.a);
    }

    public ChatStyle c() {
        ChatStyle chatStyle = new ChatStyle();
        chatStyle.c(auk_2.b(this.j()));
        chatStyle.b(auk_2.b(this.k()));
        chatStyle.e(auk_2.b(this.b()));
        chatStyle.d(auk_2.b(this.e()));
        chatStyle.a(auk_2.b(this.i()));
        chatStyle.a(this.l());
        chatStyle.a(this.d());
        chatStyle.a(this.h());
        chatStyle.a(this.n());
        return chatStyle;
    }

    public ChatStyle f(ChatStyle chatStyle) {
        this.g = chatStyle;
        return this;
    }

    public ChatStyle c(Boolean bl) {
        this.k = bl;
        return this;
    }

    public ChatStyle() {
    }

    public ChatStyle b(Boolean bl) {
        this.e = bl;
        return this;
    }

    public boolean k() {
        return this.e == null ? this.g().k() : auk_2.a(this.e);
    }

    static Boolean b(ChatStyle chatStyle, Boolean bl) {
        chatStyle.e = bl;
        return chatStyle.e;
    }

    public ChatStyle a(anw_0 anw_02) {
        this.c = anw_02;
        return this;
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), oy_0.i), this.g != null), oy_0.b), (Object)this.c), oy_0.e), this.k), oy_0.d), this.e), oy_0.c), this.a), oy_0.g), this.d), oy_0.f), this.d()), oy_0.h), this.h()), oy_0.a), this.n()), '}').toString();
    }

    public ChatStyle a(String string) {
        this.h = string;
        return this;
    }

    public ChatStyle a(Boolean bl) {
        this.d = bl;
        return this;
    }

    public ChatStyle(anw_0 anw_02) {
        this.c = anw_02;
    }

    public amn_0 h() {
        return this.b == null ? this.g().h() : this.b;
    }

    public ChatStyle a(amn_0 amn_02) {
        this.b = amn_02;
        return this;
    }

    public ChatStyle m() {
        ChatStyle chatStyle = new ChatStyle();
        chatStyle.k = this.k;
        chatStyle.e = this.e;
        chatStyle.j = this.j;
        chatStyle.a = this.a;
        chatStyle.d = this.d;
        chatStyle.c = this.c;
        chatStyle.i = this.i;
        chatStyle.b = this.b;
        chatStyle.g = this.g;
        chatStyle.h = this.h;
        return chatStyle;
    }

    static amn_0 a(ChatStyle chatStyle) {
        return chatStyle.b;
    }
}


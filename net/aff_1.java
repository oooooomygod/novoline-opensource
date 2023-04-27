/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.MCInvoker;
import net.ChatComponentText;
import net.aL0;
import net.af8_0;
import net.aml_0;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.afF
 */
public class aff_1 {
    private ChatComponentText a;

    aff_1(ChatComponentText chatComponentText, aml_0 aml_02) {
        this(chatComponentText);
    }

    public void b() {
        PlayerInvoker.a(MCInvoker.f().player, this.a);
    }

    static ChatComponentText a(aff_1 aff_12) {
        return aff_12.a();
    }

    public static @NonNull String a(@NonNull String string, String string2) {
        return StringInvoker.a(string, aL0.a(aL0.a(aL0.a(new StringBuilder(), af8_0.a), string2), af8_0.b).toString(), af8_0.c);
    }

    private aff_1(ChatComponentText chatComponentText) {
        this.a = chatComponentText;
    }

    private ChatComponentText a() {
        return this.a;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.ChatComponentStyle;
import deobf.IChatComponent;
import java.util.Iterator;
import net.ChatStyle;
import net.HX;
import net.anw_0;
import net.aou_1;
import net.dz_0;
import net.tm_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.ao5
 */
public class ao5_0
extends aou_1 {
    private static String e = "JjLU6b";
    private static ChatStyle d = HX.a(new ChatStyle(), anw_0.RESET);
    private StringBuilder f;

    public ao5_0 c() {
        aou_1.b();
        IChatComponent iChatComponent = ao5_0.a(this.f.toString());
        ((ChatComponentStyle)iChatComponent).a(HX.c(this.d()));
        Iterator<IChatComponent> iterator = this.a().iterator();
        if (dz_0.c(iterator)) {
            IChatComponent iChatComponent2 = (IChatComponent)dz_0.b(iterator);
            ((ao5_0)iChatComponent).b(iChatComponent2.b());
            ListInvoker.b(new ListInvoker[2]);
        }
        return iChatComponent;
    }

    public ao5_0 c(@Nullable String string) {
        this.a(string, anw_0.RESET);
        return this;
    }

    protected ao5_0(@Nullable String string) {
        this(string, null);
    }

    static {
        ao5_0.b("JjLU6b");
    }

    @Override
    public ao5_0 a(@Nullable IChatComponent iChatComponent) {
        ListInvoker.add(this.a, iChatComponent);
        return this;
    }

    public ao5_0 a(@Nullable String string, @Nullable anw_0 anw_02) {
        this.b(ao5_0.b(string, anw_02));
        return this;
    }

    protected ao5_0(@Nullable String string, @Nullable anw_0 anw_02) {
        this.f = new StringBuilder(string);
        this.a(HX.a(new ChatStyle(), anw_02));
    }

    @Override
    public String c() {
        return this.f.toString();
    }

    @NotNull
    public static ao5_0 b(@Nullable String string, @Nullable anw_0 anw_02) {
        return new ao5_0(string, anw_02);
    }

    public static String b() {
        return e;
    }

    public ao5_0 d(@Nullable String string) {
        this.c(string);
        return this;
    }

    @NotNull
    public static ao5_0 a(@Nullable String string) {
        return new ao5_0(string);
    }

    public ao5_0 a(@Nullable ao5_0 ao5_02) {
        aou_1.b();
        return ao5_02 != null ? ao5_02.c().b(this) : this;
    }

    public ao5_0 c(IChatComponent iChatComponent) {
        this.b(iChatComponent);
        return this;
    }

    public static void b(String string) {
        e = string;
    }

    public ao5_0 a() {
        this.d(tm_0.a);
        return this;
    }

    public ao5_0 b(IChatComponent iChatComponent) {
        super.a(iChatComponent);
        return this;
    }
}


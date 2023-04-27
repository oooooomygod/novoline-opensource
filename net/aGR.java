/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.List;
import java.util.function.Consumer;

import net.skidunion.IRCClient;

public class aGR {
    private static ListInvoker[] b;

    public static void a(IRCClient iRCClient, String string) {
        iRCClient.a(string);
    }

    public static IRCClient a(IRCClient iRCClient, Consumer consumer) {
        return iRCClient.a(consumer);
    }

    public static void a(IRCClient iRCClient, List list) {
        iRCClient.a(list);
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static ListInvoker[] b() {
        return b;
    }

    static {
        if (aGR.b() != null) {
            aGR.b(new ListInvoker[3]);
        }
    }

    public static void a(IRCClient iRCClient, aZN aZN2) {
        iRCClient.a(aZN2);
    }

    public static List a(IRCClient iRCClient) {
        return iRCClient.d();
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.commands.NovoCommandHandler;

public class aGW {
    private static int b;

    static {
        if (aGW.c() == 0) {
            aGW.b(5);
        }
    }

    public static int b() {
        return b;
    }

    public static int c() {
        aGW.b();
        return 18;
    }

    public static int a(NovoCommandHandler novoCommandHandler, ICommandSender iCommandSender, String string) {
        return novoCommandHandler.a(iCommandSender, string);
    }

    public static void a(NovoCommandHandler novoCommandHandler, ICommand iCommand) {
        novoCommandHandler.a(iCommand);
    }

    public static void b(int n) {
        b = n;
    }
}


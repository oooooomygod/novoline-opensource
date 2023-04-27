/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.Novoline;
import cc.novoline.invoke.IntegratedServerInvoker;
import cc.novoline.invoke.NetworkManagerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import cc.novoline.modules.visual.ClickGui;
import deobf.MCInvoker;
import deobf.TimerUtil;
import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.q_
 */
public class q__0 {
    private static Minecraft a;
    private static boolean f;
    private static Novoline e;
    private static boolean d;
    private static int b;
    private static ClickGui c;

    public static void a(int n) {
        b = n;
    }

    public static void a(boolean bl) {
        f = bl;
    }

    public static boolean a(Q2 q2) {
        return z4_0.f(c).equals((Object)q2);
    }

    static {
        e = NovolineInvoker.getInstance();
        a = MCInvoker.f();
        c = (ClickGui)aen_2.a(NovolineInvoker.l(e), ClickGui.class);
    }

    public static int d() {
        return b;
    }

    public static boolean b() {
        TimerUtil.e();
        return !MCInvoker.k(a) && StringInvoker.a(StringInvoker.i(MCInvoker.W((Minecraft)q__0.a).k), (CharSequence)azo_2.a);
    }

    public static boolean a(String string) {
        TimerUtil.e();
        Path path = da_0.a(aL0.a(aL0.a(new StringBuilder(), SystemInvoker.d(azo_2.e)), azo_2.d).toString(), new String[0]);
        if (aev_1.d(path, new LinkOption[0])) {
            return false;
        }
        try {
            return aMF.c(aev_1.d(path), arg_0 -> q__0.lambda$hostModified$0(string, arg_0));
        }
        catch (IOException iOException) {
            NetworkManagerInvoker.a(aDM.a(MCInvoker.aa(a)), new ChatComponentText(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.RED), azo_2.c).toString()));
            return true;
        }
    }

    public static boolean a() {
        TimerUtil.e();
        return d && !MCInvoker.k(a) || MCInvoker.k(a) && IntegratedServerInvoker.c(MCInvoker.q(a)).equals(azo_2.b);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public static void a(ServerData serverData) {
        TimerUtil.e();
        if (StringInvoker.a(StringInvoker.i(serverData.k), (CharSequence)azo_2.g) && !q__0.a(azo_2.f) && !f) {
            d = true;
        }
        d = false;
        z4_0.a(c, abb_2.NONE);
    }

    public static boolean c() {
        return f;
    }

    private static boolean lambda$hostModified$0(String string, String string2) {
        return StringInvoker.a(StringInvoker.i(string2), (CharSequence)string);
    }

    public static boolean a(abb_2 abb_22) {
        TimerUtil.e();
        if (!MCInvoker.k(a) && z4_0.m(c) != null) {
            return z4_0.m(c).equals((Object)abb_22);
        }
        return false;
    }
}


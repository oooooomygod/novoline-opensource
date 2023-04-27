/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package cc.novoline.invoke;

import cc.novoline.Novoline;
import cc.novoline.gui.screen.ClickGUI;
import cc.novoline.gui.alt.AltList;
import deobf.FontManager;
import deobf.GuiLogin;
import cc.novoline.utils.notifications.NotificationManager;
import cc.novoline.commands.NovoCommandHandler;
import deobf.TaskManager;
import java.nio.file.Path;
import net.minecraft.client.Minecraft;
import net.AltRepositoryGUI;
import net.DiscordGUI;
import net.IRCThread;
import net.ModuleManager;
import net.PlayerManager;
import net.ScriptManager;
import net.ServerData;
import org.apache.logging.log4j.Logger;
import net.skidunion.IRCClient;
import net.skidunion.Protection;

public class NovolineInvoker {
    private static int[] b;

    public static FontManager o(Novoline novoline) {
        return novoline.e();
    }

    public static ScriptManager r(Novoline novoline) {
        return novoline.B();
    }

    public static void a(Novoline novoline, boolean bl) {
        novoline.a(bl);
    }

    public static void a(Novoline novoline, IRCThread iRCThread) {
        novoline.a(iRCThread);
    }

    public static boolean b(Novoline novoline) {
        return novoline.C();
    }

    public static ServerData k(Novoline novoline) {
        return novoline.m();
    }

    public static IRCThread a(Novoline novoline) {
        return novoline.x();
    }

    public static boolean q(Novoline novoline) {
        return novoline.a();
    }

    static {
        if (NovolineInvoker.b() == null) {
            NovolineInvoker.b(new int[4]);
        }
    }

    public static AltRepositoryGUI z(Novoline novoline) {
        return novoline.w();
    }

    public static Novoline getInstance() {
        return Novoline.init();
    }

    public static ClickGUI e(Novoline novoline) {
        return novoline.n();
    }

    public static void a(Novoline novoline, PlayerManager playerManager) {
        novoline.a(playerManager);
    }

    public static GuiLogin g(Novoline novoline) {
        return novoline.u();
    }

    public static void onStart(Novoline novoline) {
        novoline.c();
    }

    public static void onLoaded(Novoline novoline) {
        novoline.H();
    }

    public static Path c(Novoline novoline) {
        return novoline.F();
    }

    public static void a(Novoline novoline, NotificationManager notificationManager) {
        novoline.a(notificationManager);
    }

    public static String getVersion(Novoline novoline) {
        return novoline.getVersion();
    }

    public static void a(Novoline novoline, AltList altList) {
        novoline.a(altList);
    }

    public static NotificationManager getNotificationManager(Novoline novoline) {
        return novoline.k();
    }

    public static boolean h(Novoline novoline) {
        return novoline.b();
    }

    public static NovoCommandHandler s(Novoline novoline) {
        return novoline.y();
    }

    public static PlayerManager A(Novoline novoline) {
        return novoline.p();
    }

    public static void setModuleManager(Novoline novoline, ModuleManager moduleManager) {
        novoline.setModuleManager(moduleManager);
    }

    public static DiscordGUI u(Novoline novoline) {
        return novoline.r();
    }

    public static AltList f(Novoline novoline) {
        return novoline.t();
    }

    public static void a(Novoline novoline, DiscordGUI discordGUI) {
        novoline.a(discordGUI);
    }

    public static void a(Novoline novoline, Protection protection) {
        novoline.a(protection);
    }

    public static TaskManager i(Novoline novoline) {
        return novoline.s();
    }

    public static Logger getLogger() {
        return Novoline.f();
    }

    public static void j(Novoline novoline) {
        novoline.g();
    }

    public static void a(Novoline novoline, IRCClient iRCClient) {
        novoline.a(iRCClient);
    }

    public static void a(Novoline novoline, ScriptManager scriptManager) {
        novoline.a(scriptManager);
    }

    public static void a(Novoline novoline, ServerData serverData) {
        novoline.a(serverData);
    }

    public static String t(Novoline novoline) {
        return novoline.D();
    }

    public static void a(Novoline novoline, TaskManager taskManager) {
        novoline.a(taskManager);
    }

    public static void a(Novoline novoline, AltRepositoryGUI altRepositoryGUI) {
        novoline.a(altRepositoryGUI);
    }

    public static ModuleManager l(Novoline novoline) {
        return novoline.getModuleManager();
    }

    public static int[] b() {
        return b;
    }

    public static IRCClient n(Novoline novoline) {
        return novoline.l();
    }

    public static Protection v(Novoline novoline) {
        return novoline.getProtection();
    }

    public static void a(Novoline novoline, ClickGUI clickGUI) {
        novoline.a(clickGUI);
    }

    public static void a(Novoline novoline, NovoCommandHandler novoCommandHandler) {
        novoline.a(novoCommandHandler);
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static void a(Novoline novoline, GuiLogin guiLogin) {
        novoline.a(guiLogin);
    }

    public static boolean w(Novoline novoline) {
        return novoline.A();
    }

    public static Minecraft d(Novoline novoline) {
        return novoline.getMC();
    }
}


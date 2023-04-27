/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.thealtening.api.response.Account
 *  com.thealtening.api.retriever.AsynchronousDataRetriever
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
package cc.novoline;

import cc.novoline.gui.screen.ClickGUI;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.SimpleFontManagerInvoker;
import cc.novoline.string.StringPool3;
import com.thealtening.api.response.Account;
import com.thealtening.api.retriever.AsynchronousDataRetriever;
import cc.novoline.gui.alt.AltList;
import deobf.MCInvoker;
import cc.novoline.utils.notifications.NotificationManager;
import cc.novoline.commands.NovoCommandHandler;
import java.io.IOException;
import java.nio.file.Path;
import net.minecraft.client.Minecraft;
import net.AltRepositoryGUI;
import net.DiscordGUI;
import net.IRCThread;
import net.ModuleManager;
import net.PlayerManager;
import net.ScriptManager;
import net.ServerData;
import net.a4E;
import net.a68;
import net.aHE;
import net.aL0;
import net.aRN;
import net.aen_2;
import net.ah__0;
import net.ara_2;
import net.atz_0;
import net.da_0;
import net.zq_2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import net.skidunion.IRCClient;
import net.skidunion.Protection;

public class Novoline {
    private ScriptManager scriptManager;
    private Initializer initializer;
    private ModuleManager moduleManager;
    private static String version = "u8SKfc";
    private static Novoline instance;
    private DiscordGUI discordGUI;
    private IRCClient irc;
    private ClickGUI clickgui;
    private PlayerManager playerManager;
    private FontManager fontManager;
    private boolean m;
    private GuiLogin loginScreen;
    private boolean o = false;
    private TaskManager taskManager;
    private static Logger LOGGER;
    private NotificationManager notificationManager;
    private AltRepositoryGUI altRepositoryGUI;
    private IRCThread ircThread;
    private String l = StringPool3.e;
    private Protection protection;
    private Minecraft mc = MCInvoker.f();
    private Path Path;
    private NovoCommandHandler novoCommandHandler;
    private String y;
    private AltList altList;
    private boolean s = false;
    private ServerData lastConnectedServer;
    private AsynchronousDataRetriever dataRetriever;

    public static void b(String string) {
        version = string;
    }

    public AsynchronousDataRetriever o() {
        return this.dataRetriever;
    }

    public IRCThread x() {
        return this.ircThread;
    }

    public ServerData m() {
        return this.lastConnectedServer;
    }

    public void a(Protection protection) {
        this.protection = protection;
    }

    public void c() {
    }

    public Path F() {
        return this.Path;
    }

    public CompletableFuture<Account> z() {
        return aRN.a(this.dataRetriever);
    }

    public String h() {
        return this.y;
    }

    public TaskManager s() {
        return this.taskManager;
    }

    public boolean C() {
        Novoline.j();
        return this.moduleManager == null || this.playerManager == null || this.notificationManager == null;
    }

    public NovoCommandHandler y() {
        return this.novoCommandHandler;
    }

    public Protection getProtection() {
        return this.protection;
    }

    public ScriptManager B() {
        return this.scriptManager;
    }

    public void a(@NotNull ServerData serverData) {
        this.lastConnectedServer = serverData;
    }

    public void a(DiscordGUI discordGUI) {
        this.discordGUI = discordGUI;
    }

    public void a(TaskManager taskManager) {
        this.taskManager = taskManager;
    }

    public Novoline() {
        this.initializer = atz_0.a();
        this.novoCommandHandler = new NovoCommandHandler(this);
        this.dataRetriever = new AsynchronousDataRetriever(null);
        this.fontManager = SimpleFontManagerInvoker.create();
        this.Path = ah__0.a(da_0.a(zq_2.j(this.mc.mcDataDir), new String[0]), StringPool3.f);
        if (instance != null) {
            throw new IllegalStateException(aL0.a(aL0.a(aL0.a(new StringBuilder(), StringPool3.j), ara_2.k(this.getClass())), StringPool3.d).toString());
        }
    }

    public FontManager e() {
        return this.fontManager;
    }

    public DiscordGUI r() {
        return this.discordGUI;
    }

    public boolean b() {
        return this.m;
    }

    public IRCClient l() {
        return this.irc;
    }

    public ModuleManager getModuleManager() {
        return this.moduleManager;
    }

    public void a(AltRepositoryGUI altRepositoryGUI) {
        this.altRepositoryGUI = altRepositoryGUI;
    }

    public static String j() {
        return version;
    }

    public void a(GuiLogin guiLogin) {
        this.loginScreen = guiLogin;
    }

    public void b(boolean bl) {
        this.m = bl;
    }

    public void a(ClickGUI clickGUI) {
        this.clickgui = clickGUI;
    }

    public boolean a() {
        return false;
    }

    public void setModuleManager(ModuleManager moduleManager) {
        this.moduleManager = moduleManager;
    }

    public String getVersion() {
        return StringPool3.h;
    }

    public ClickGUI n() {
        return this.clickgui;
    }

    public PlayerManager p() {
        return this.playerManager;
    }

    public void a(NotificationManager notificationManager) {
        this.notificationManager = notificationManager;
    }

    public NotificationManager k() {
        return this.notificationManager;
    }

    public boolean A() {
        return this.s;
    }

    public void a(boolean bl) {
        this.s = bl;
    }

    public Minecraft getMC() {
        return this.mc;
    }

    public void a(AltList altList) {
        this.altList = altList;
    }

    public static Logger f() {
        return LOGGER;
    }

    public void a(String string) {
        this.y = string;
    }

    public String D() {
        return aL0.a(aL0.a(new StringBuilder(), zq_2.j(this.mc.mcDataDir)), StringPool3.a).toString();
    }

    public static Novoline init() {
        try {
            if (instance == null) {
                instance = new Novoline();
            }
            return instance;
        }
        catch (Throwable throwable) {
            LoggerInvoker.b(LOGGER, throwable);
            throw throwable;
        }
    }

    public AltRepositoryGUI w() {
        return this.altRepositoryGUI;
    }

    public void a(PlayerManager playerManager) {
        this.playerManager = playerManager;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    static {
        LOGGER = LogManager.getLogger();
        Novoline.b("u8SKfc");
    }

    public void H() {
    }

    public void g() {
        try {
            aHE.b(aen_2.b(this.getModuleManager()), StringPool3.i);
        }
        catch (IOException iOException) {
            LoggerInvoker.b(Novoline.f(), aL0.a(aL0.a(aL0.a(new StringBuilder(), StringPool3.g), a4E.a(iOException)), StringPool3.c).toString(), iOException);
        }
        catch (a68 a682) {
            LoggerInvoker.b(Novoline.f(), StringPool3.b, a682);
        }
    }

    public Initializer v() {
        return this.initializer;
    }

    public void a(IRCThread iRCThread) {
        this.ircThread = iRCThread;
    }

    public GuiLogin u() {
        return this.loginScreen;
    }

    public void a(ScriptManager scriptManager) {
        this.scriptManager = scriptManager;
    }

    public void a(NovoCommandHandler novoCommandHandler) {
        this.novoCommandHandler = novoCommandHandler;
    }

    public void a(IRCClient iRCClient) {
        this.irc = iRCClient;
    }

    public AltList t() {
        return this.altList;
    }
}


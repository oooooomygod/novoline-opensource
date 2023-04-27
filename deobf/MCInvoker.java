/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.authlib.properties.PropertyMap
 *  org.apache.logging.log4j.Logger
 */
package deobf;

import cc.novoline.Novoline;
import com.google.common.util.concurrent.ListenableFuture;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.properties.PropertyMap;

import java.net.Proxy;
import java.util.Map;
import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;
import net.CrashReport;
import net.FrameTimer;
import net.ISaveFormat;
import net.IntegratedServer;
import net.MusicTicker;
import net.PlayerUsageSnooper;
import net.RenderManager;
import net.ServerData;
import net.Session;
import net.SoundHandler;
import net.TextureManager;
import net.a5f_0;
import net.aI_;
import net.if_0;
import net.minecraft.multiplayer.WorldClient;
import net.minecraft.renderer.entity.RenderItem;
import net.minecraft.renderer.texture.TextureMap;
import net.minecraft.resources.ResourcePackRepository;
import net.minecraft.world.WorldSettings;
import org.apache.logging.log4j.Logger;

public class MCInvoker {
    private static int[] b;

    public static Entity v(Minecraft minecraft) {
        return minecraft.aw();
    }

    public static boolean c() {
        return Minecraft.w();
    }

    public static IntegratedServer q(Minecraft minecraft) {
        return minecraft.ar();
    }

    public static void w(Minecraft minecraft) {
        minecraft.refreshResources();
    }

    public static MusicTicker U(Minecraft minecraft) {
        return minecraft.ab();
    }

    public static boolean k(Minecraft minecraft) {
        return minecraft.at();
    }

    public static MinecraftSessionService T(Minecraft minecraft) {
        return minecraft.getSessionService();
    }

    public static PropertyMap F(Minecraft minecraft) {
        return minecraft.ay();
    }

    public static PropertyMap I(Minecraft minecraft) {
        return minecraft.R();
    }

    public static void a(Minecraft minecraft, String string, String string2, WorldSettings worldSettings) {
        minecraft.launchIntegratedServer(string, string2, worldSettings);
    }

    public static void r(Minecraft minecraft) {
        minecraft.av();
    }

    public static void e(Minecraft minecraft) {
        minecraft.shutdown();
    }

    public static if_0 Q(Minecraft minecraft) {
        return minecraft.al();
    }

    public static PropertyMap m(Minecraft minecraft) {
        return minecraft.S();
    }

    public static void b(Minecraft minecraft) {
        minecraft.updateDisplay();
    }

    public static ItemRenderer S(Minecraft minecraft) {
        return minecraft.O();
    }

    public static ISaveFormat P(Minecraft minecraft) {
        return minecraft.getSaveLoader();
    }

    public static long a() {
        return Minecraft.getSystemTime();
    }

    public static RenderItem A(Minecraft minecraft) {
        return minecraft.C();
    }

    public static Map d() {
        return Minecraft.getSessionInfo();
    }

    public static int O(Minecraft minecraft) {
        return minecraft.aa();
    }

    public static aI_ x(Minecraft minecraft) {
        return minecraft.p();
    }

    public static void a(Minecraft minecraft, WorldClient worldClient) {
        minecraft.a(worldClient);
    }

    public static boolean X(Minecraft minecraft) {
        return minecraft.b();
    }

    public static Framebuffer c(Minecraft minecraft) {
        return minecraft.getFrameBuffer();
    }

    public static void g(Minecraft minecraft) {
        minecraft.D();
    }

    public static ListenableFuture a(Minecraft minecraft, Runnable runnable) {
        return minecraft.addScheduledTask(runnable);
    }

    public static ResourcePackRepository D(Minecraft minecraft) {
        return minecraft.G();
    }

    public static int[] e() {
        return b;
    }

    public static String C(Minecraft minecraft) {
        return minecraft.H();
    }

    public static boolean J(Minecraft minecraft) {
        return minecraft.T();
    }

    public static Novoline z(Minecraft minecraft) {
        return minecraft.Y();
    }

    public static boolean B(Minecraft minecraft) {
        return minecraft.q();
    }

    public static TextureMap f(Minecraft minecraft) {
        return minecraft.W();
    }

    public static LanguageManager i(Minecraft minecraft) {
        return minecraft.i();
    }

    public static Session y(Minecraft minecraft) {
        return minecraft.getSession();
    }

    public static void M(Minecraft minecraft) {
        minecraft.u();
    }

    public static boolean u(Minecraft minecraft) {
        return minecraft.aD();
    }

    public static boolean t(Minecraft minecraft) {
        return minecraft.l();
    }

    public static void a(Minecraft minecraft, boolean bl) {
        minecraft.b(bl);
    }

    public static void p(Minecraft minecraft) {
        minecraft.dispatchKeypresses();
    }

    public static void s(Minecraft minecraft) {
        minecraft.clickMouse();
    }

    public static int h() {
        return Minecraft.s();
    }

    public static void Z(Minecraft minecraft) {
        minecraft.toggleFullscreen();
    }

    public static void a(Minecraft minecraft, ServerData serverData) {
        minecraft.a(serverData);
    }

    public static void h(Minecraft minecraft) {
        minecraft.B();
    }

    public static SoundHandler l(Minecraft minecraft) {
        return minecraft.A();
    }

    public static Minecraft f() {
        return Minecraft.getInstance();
    }

    public static RenderManager j(Minecraft minecraft) {
        return minecraft.as();
    }

    public static TextureManager E(Minecraft minecraft) {
        return minecraft.af();
    }

    public static ServerData W(Minecraft minecraft) {
        return minecraft.ag();
    }

    public static PropertyMap a(Minecraft minecraft, GameProfile gameProfile) {
        return minecraft.a(gameProfile);
    }

    public static NetHandlerPlayClient aa(Minecraft minecraft) {
        return minecraft.e();
    }

    static {
        if (MCInvoker.e() == null) {
            MCInvoker.b(new int[2]);
        }
    }

    public static void b(Minecraft minecraft, CrashReport crashReport) {
        minecraft.a(crashReport);
    }

    public static FrameTimer K(Minecraft minecraft) {
        return minecraft.g();
    }

    public static CrashReport a(Minecraft minecraft, CrashReport crashReport) {
        return minecraft.b(crashReport);
    }

    public static void a(Minecraft minecraft, Entity entity) {
        minecraft.a(entity);
    }

    public static ListenableFuture a(Minecraft minecraft, Callable callable) {
        return minecraft.a(callable);
    }

    public static BlockRendererDispatcher Y(Minecraft minecraft) {
        return minecraft.z();
    }

    public static void L(Minecraft minecraft) {
        minecraft.run();
    }

    public static Proxy R(Minecraft minecraft) {
        return minecraft.getProxy();
    }

    public static void displayGuiScreen(Minecraft minecraft, GuiScreen guiScreen) {
        minecraft.displayGuiScreen(guiScreen);
    }

    public static void g() {
        Minecraft.f();
    }

    public static boolean b() {
        return Minecraft.au();
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static void a(Minecraft minecraft, int n) {
        minecraft.b(n);
    }

    public static boolean G(Minecraft minecraft) {
        return minecraft.isGamePaused();
    }

    public static SkinManager N(Minecraft minecraft) {
        return minecraft.Q();
    }

    public static a5f_0 a(Minecraft minecraft) {
        return minecraft.getTwitchStream();
    }

    public static boolean n(Minecraft minecraft) {
        return minecraft.isUnicode();
    }

    public static PlayerUsageSnooper d(Minecraft minecraft) {
        return minecraft.ak();
    }

    public static ListenableFuture o(Minecraft minecraft) {
        return minecraft.addScheduledTask();
    }

    public static Logger H(Minecraft minecraft) {
        return minecraft.getLogger();
    }

    public static boolean V(Minecraft minecraft) {
        return minecraft.k();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.google.common.util.concurrent.ListenableFutureTask
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.authlib.properties.Property
 *  com.mojang.authlib.properties.PropertyMap
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.LWJGLException
 *  org.lwjgl.Sys
 *  org.lwjgl.opengl.ContextCapabilities
 *  org.lwjgl.opengl.DisplayMode
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.OpenGLException
 *  org.lwjgl.opengl.PixelFormat
 */
package net.minecraft.client;

import cc.novoline.Novoline;
import cc.novoline.events.events.KeyPressEvent;
import cc.novoline.events.events.LoadWorldEvent;
import cc.novoline.events.events.TickUpdateEvent;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.BootstrapInvoker;
import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.DisplayInvoker;
import cc.novoline.invoke.EntityRendererInvoker;
import cc.novoline.invoke.EventManagerInvoker;
import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.FramebufferInvoker;
import cc.novoline.invoke.FutureTaskInvoker;
import cc.novoline.invoke.GameSettingsInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.GuiAchievementInvoker;
import cc.novoline.invoke.IOUtilsInvoker;
import cc.novoline.invoke.IStreamInvoker;
import cc.novoline.invoke.IntegratedServerInvoker;
import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.Invoker1;
import cc.novoline.invoke.KeyboardInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LoadingScreenInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModelManagerInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.MouseInvoker;
import cc.novoline.invoke.NBTInvoker;
import cc.novoline.invoke.NetworkManagerInvoker;
import cc.novoline.invoke.NotificationManagerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.ObjectMouseOverInvoker;
import cc.novoline.invoke.PlayerControllerInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.ProfilerInvoker;
import cc.novoline.invoke.RPacketManagerInvoker;
import cc.novoline.invoke.ResourceManagerInvoker;
import cc.novoline.invoke.SaveHandlerInvoker;
import cc.novoline.invoke.SaveLoaderInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.SessionInvoker;
import cc.novoline.invoke.SnooperInvoker;
import cc.novoline.invoke.SoundHandlerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.invoke.SysInvoker;
import cc.novoline.invoke.SystemInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import cc.novoline.invoke.ThreadInvoker;
import cc.novoline.invoke.TimerInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.player.Scaffold;
import cc.novoline.string.StringPool1;
import com.google.common.collect.Multimap;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import deobf.BlockRendererDispatcher;
import net.minecraft.crash.CrashReportCategory;
import deobf.DefaultVertexFormats;
import net.minecraft.renderer.texture.DynamicTexture;
import deobf.Entity;
import deobf.EntityPlayer;
import deobf.EntityPlayerSP;
import deobf.EnumConnectionState;
import deobf.EnumDifficulty;
import deobf.FoliageColorReloadListener;
import deobf.FontRenderer;
import deobf.Framebuffer;
import net.minecraft.client.main.GameConfiguration;
import deobf.GameSettings;
import net.minecraft.resources.GrassColorReloadListener;
import deobf.GuiAchievement;
import deobf.GuiConnecting;
import deobf.GuiControls;
import deobf.GuiLogin;
import deobf.GuiScreen;
import cc.novoline.invoke.ListArrayInvoker;
import cc.novoline.modules.visual.HUD;
import deobf.IMetadataSerializer;
import deobf.IPlayerUsage;
import deobf.IReloadableResourceManager;
import deobf.IResourcePack;
import deobf.ISaveHandler;
import net.minecraft.item.ItemBlock;
import deobf.ItemRenderer;
import net.minecraft.item.ItemStack;
import deobf.LanguageManager;
import deobf.LoadingScreenRenderer;
import deobf.ModuleHolder;
import deobf.ModuleRegistry;
import net.minecraft.util.MouseHelper;
import net.minecraft.util.MovingObjectPosition;
import deobf.NBTBase;
import deobf.NBTTagList;
import deobf.NetHandlerPlayClient;
import deobf.NetworkManager;
import cc.novoline.utils.notifications.NotificationManager;
import deobf.OpenGlHelper;
import net.minecraft.profiler.Profiler;
import net.minecraft.renderer.chunk.RenderChunk;
import net.minecraft.renderer.entity.RenderItem;
import net.minecraft.util.ReportedException;
import net.minecraft.resources.ResourcePackRepository;
import deobf.Result;
import deobf.ScreenShotHelper;
import deobf.SimpleReloadableResourceManager;
import deobf.SkinManager;
import deobf.Tessellator;
import net.minecraft.renderer.texture.TextureMap;
import deobf.TileEntity;
import net.minecraft.multiplayer.WorldClient;
import net.minecraft.renderer.WorldRenderer;
import net.minecraft.world.WorldSettings;
import net.minecraft.network.packts.C00PacketLoginStart;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import net.AnvilSaveConverter;
import net.Ba;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.ChatComponentText;
import net.CrashReport;
import net.DZ;
import net.DefaultResourcePack;
import net.EffectRenderer;
import deobf.EntityRenderer;
import net.FT;
import net.FastPlace;
import net.FrameTimer;
import net.FutureTask;
import net.GW;
import net.GuiIngame;
import net.GuiMainMenu;
import net.GuiSleepMP;
import net.GuiYesNo;
import net.I18n;
import net.ISaveFormat;
import net.IThreadListener;
import net.IntegratedServer;
import net.Item;
import net.Items;
import net.JP;
import net.K6;
import net.MT;
import net.Material;
import net.MathHelper;
import net.ModelManager;
import net.MusicTicker;
import net.NBTTagCompound;
import net.NBTTagString;
import net.NetHandlerLoginClient;
import net.Notification;
import net.NotificationType;
import net.P8;
import net.PlayerUsageSnooper;
import net.R2;
import net.RenderGlobal;
import net.RenderManager;
import net.ResourceLocation;
import net.ScaledResolution;
import net.ServerData;
import net.Session;
import net.SoundHandler;
import net.StatFileWriter;
import net.StringProperty;
import net.T7;
import net.TextureManager;
import net.Timer;
import net.Util;
import net.VZ;
import net.WorldInfo;
import net.X9;
import net.YM;
import net.a21;
import net.a3C;
import net.a3F;
import net.a3K;
import net.a3Y;
import net.a3s;
import net.a3t_0;
import net.a3w_0;
import net.a4Z;
import net.a5f_0;
import net.a8q_0;
import net.a91;
import net.a9T;
import net.aBC;
import net.aDM;
import net.aDY;
import net.aI8;
import net.aI_;
import net.aKZ;
import net.aKp;
import net.aL0;
import net.aLW;
import net.aMF;
import net.aP9;
import net.aQ4;
import net.aQE;
import net.aQI;
import net.aRt;
import net.aSI;
import net.aSN;
import net.aSY;
import net.aXQ;
import net.aYO;
import net.aZ2;
import net.aci_0;
import net.act_2;
import net.ad2_0;
import net.ad6_0;
import net.adn_0;
import net.adt_2;
import net.ae6_0;
import net.aen_2;
import net.afs_2;
import net.ag3_0;
import net.ag4_0;
import net.age_2;
import net.agl_0;
import net.ah__0;
import net.ahp_1;
import net.aj2;
import net.ResourcePackRepositoryEntry;
import net.akh_0;
import net.akk_0;
import net.als_2;
import net.amm_0;
import net.anh_1;
import net.anr_1;
import net.aoc_1;
import net.aoj_1;
import net.aom_0;
import net.apf_0;
import net.apl_1;
import net.apx_2;
import net.aq__0;
import net.aqd_0;
import net.aqo_2;
import net.ara_2;
import net.ard_0;
import net.arm_0;
import net.asg_0;
import net.aud_0;
import net.auh_2;
import net.auk_2;
import net.avm_0;
import net.awc_1;
import net.awd_0;
import net.awu_1;
import net.axk_1;
import net.ayw_0;
import net.ayx_2;
import net.bc_0;
import net.ch_2;
import net.cw_2;
import net.de_0;
import net.dz_0;
import net.h9;
import net.if_0;
import net.jj_0;
import net.jv_0;
import net.kp_1;
import net.kv_0;
import net.lx_2;
import net.ma_1;
import net.mf_1;
import net.my_0;
import net.nc_0;
import net.pm_1;
import net.rk_0;
import net.tn_0;
import net.ty_1;
import net.ua_2;
import net.uw_0;
import net.wc_1;
import net.xf_0;
import net.xi_1;
import net.zq_2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.OpenGLException;
import org.lwjgl.opengl.PixelFormat;

public class Minecraft
implements IThreadListener,
IPlayerUsage {
    private String[] w;
    private TextureMap textureMapBlocks;
    private SkinManager skinManager;
    private MinecraftSessionService sessionService;
    int fpsCounter;
    private String launchedVersion;
    public int displayHeight;
    private RenderManager renderManager;
    public GameSettings gameSettings;
    private long r = -1L;
    public WorldClient world;
    public EntityPlayerSP player;
    private File fileResourcepacks;
    public boolean skipRenderWorld;
    public int displayWidth;
    private PropertyMap field_181038_N;
    private static ResourceLocation locationMojangPng;
    public boolean ay;
    public GuiScreen currentScreen;
    private Thread k;
    private IReloadableResourceManager mcResourceManager;
    private String serverName;
    public boolean ah = false;
    public Timer timer;
    private ServerData x;
    private boolean fullscreen;
    private BlockRendererDispatcher blockRenderDispatcher;
    long ap;
    public String ar = StringPool1.aN;
    public FontRenderer fontRendererObj;
    private PropertyMap twitchDetails;
    public anh_1 playerController;
    private int tempDisplayHeight;
    private IMetadataSerializer metadataSerializer_;
    private DefaultResourcePack mcDefaultResourcePack;
    private long as = 0L;
    long am;
    public arm_0 J;
    private SoundHandler mcSoundHandler;
    private boolean integratedServerIsRunning;
    private IntegratedServer theIntegratedServer;
    public MovingObjectPosition objectMouseOver;
    public EffectRenderer effectRenderer;
    public LoadingScreenRenderer loadingScreen;
    private int ae;
    private static int debugFPS;
    private boolean isDemo;
    private MusicTicker mcMusicTicker;
    public EntityRenderer entityRenderer;
    private a5f_0 g;
    public GuiIngame ingameGUI;
    private int q;
    private NetworkManager myNetworkManager;
    private CrashReport ac;
    private Entity ai;
    private LanguageManager mcLanguageManager;
    long aa = -1L;
    private ItemRenderer itemRenderer;
    private List<IResourcePack> defaultResourcePacks;
    public Session session;
    private boolean T;
    public static byte[] aV;
    public int leftClickCounter;
    public GuiAchievement guiAchievement;
    private static Minecraft theMinecraft;
    public boolean ak = false;
    public FontRenderer standardGalacticFontRenderer;
    public String debug;
    public FontRenderer fontRendererCrack;
    private boolean isGamePaused;
    private boolean u = false;
    private File fileAssets;
    public RenderGlobal renderGlobal;
    public boolean aC = true;
    private String i;
    private Novoline novoline;
    volatile boolean Q = true;
    private boolean n = true;
    private TextureManager renderEngine;
    private RenderItem renderItem;
    private int tempDisplayWidth;
    public static boolean R;
    private ResourcePackRepository mcResourcePackRepository;
    public ScheduledExecutorService az;
    private Logger I = LogManager.getLogger();
    private Framebuffer framebufferMc;
    private PlayerUsageSnooper usageSnooper;
    public boolean c = false;
    private Queue<java.util.concurrent.FutureTask<?>> scheduledTasks;
    long debugUpdateTime;
    public FrameTimer field_181542_y;
    private Proxy proxy;
    private int rightClickDelayTimer;
    public Profiler mcProfiler;
    private ModelManager modelManager;
    public File mcDataDir;
    public ScheduledExecutorService f;
    public MouseHelper mouseHelper;
    private ISaveFormat saveLoader;
    private boolean aq;
    public Minecraft Z;
    private static List<DisplayMode> A;
    private boolean jvm64bit;
    private ResourceLocation mojangLogo;
    public Entity E;
    public GuiScreen al;

    public Minecraft(GameConfiguration gameConfiguration) {
        this.w = new String[]{StringPool1.aQ, StringPool1.i, StringPool1.bR, StringPool1.ai, StringPool1.b_, StringPool1.dl};
        this.field_181542_y = new FrameTimer();
        this.mcProfiler = new Profiler();
        this.usageSnooper = new PlayerUsageSnooper(StringPool1.bN, this, ServerInvoker.c());
        this.metadataSerializer_ = new IMetadataSerializer();
        this.defaultResourcePacks = my_0.c();
        this.scheduledTasks = ard_0.a();
        this.k = ThreadInvoker.a();
        this.timer = new Timer(20.0f);
        this.debug = StringPool1.aO;
        this.ap = Minecraft.getSystemTime();
        this.am = SystemInvoker.nanoTime();
        this.debugUpdateTime = Minecraft.getSystemTime();
        this.i = StringPool1.c9;
        theMinecraft = this;
        this.mcDataDir = gameConfiguration.a.b;
        this.fileAssets = gameConfiguration.a.d;
        this.fileResourcepacks = gameConfiguration.a.c;
        this.launchedVersion = gameConfiguration.b.a;
        this.twitchDetails = gameConfiguration.c.a;
        this.field_181038_N = gameConfiguration.c.d;
        this.mcDefaultResourcePack = new DefaultResourcePack(aud_0.a(new xf_0(gameConfiguration.a.d, gameConfiguration.a.a)));
        this.proxy = gameConfiguration.c.c == null ? Proxy.NO_PROXY : gameConfiguration.c.c;
        this.sessionService = akh_0.a(new YggdrasilAuthenticationService(gameConfiguration.c.c, awc_1.a().toString()));
        this.session = gameConfiguration.c.b;
        LoggerInvoker.info(this.getLogger(), aL0.a(aL0.a(new StringBuilder(), StringPool1.bq), SessionInvoker.getUsername(this.session)).toString());
        LoggerInvoker.info(this.getLogger(), aL0.a(aL0.a(aL0.a(new StringBuilder(), StringPool1.bU), SessionInvoker.d(this.session)), StringPool1.bh).toString());
        this.isDemo = gameConfiguration.b.b;
        this.displayWidth = gameConfiguration.e.d > 0 ? gameConfiguration.e.d : 1;
        this.displayHeight = gameConfiguration.e.c > 0 ? gameConfiguration.e.c : 1;
        this.tempDisplayWidth = gameConfiguration.e.d;
        this.tempDisplayHeight = gameConfiguration.e.c;
        this.fullscreen = gameConfiguration.e.a;
        this.jvm64bit = Minecraft.isJvm64bit();
        this.theIntegratedServer = new IntegratedServer(this);
        if (gameConfiguration.d.b != null) {
            this.serverName = gameConfiguration.d.b;
            this.q = gameConfiguration.d.a;
        }
        aI8.a(false);
        BootstrapInvoker.register();
    }

    @Override
    public boolean b() {
        return ThreadInvoker.a() == this.k;
    }

    private void lambda$runTick$2(FutureTask futureTask) {
        if (X9.d(futureTask)) {
            X9.b(futureTask);
            ListInvoker.remove(aci_0.a(NovolineInvoker.i(this.novoline)), futureTask);
            EventManagerInvoker.b(futureTask);
        } else {
            futureTask.b();
        }
    }

    public void dispatchKeypresses() {
        int n;
        int n2 = n = KeyboardInvoker.b() == 0 ? KeyboardInvoker.getEventCharacter() : KeyboardInvoker.b();
        if (!KeyboardInvoker.c()) {
            if (!(this.currentScreen instanceof GuiControls) || ((GuiControls)this.currentScreen).v <= Minecraft.getSystemTime() - 20L) {
                if (KeyboardInvoker.getEventKey()) {
                    if (n == GameSettingsInvoker.getKeyCode(this.gameSettings.keyBindStreamStartStop)) {
                        if (IStreamInvoker.d(this.getTwitchStream())) {
                            IStreamInvoker.s(this.getTwitchStream());
                        } else if (IStreamInvoker.v(this.getTwitchStream())) {
                            this.displayGuiScreen(new GuiYesNo(this::lambda$dispatchKeypresses$13, I18n.format(StringPool1.cw, new Object[0]), StringPool1.F, 0));
                        } else if (IStreamInvoker.k(this.getTwitchStream()) && IStreamInvoker.r(this.getTwitchStream())) {
                            if (this.world != null) {
                                kp_1.a(GW.f(this.ingameGUI), new ChatComponentText(StringPool1.c7));
                            }
                        } else {
                            ListArrayInvoker.a(this.currentScreen);
                        }
                    } else if (n == GameSettingsInvoker.getKeyCode(this.gameSettings.T) && IStreamInvoker.d(this.getTwitchStream())) {
                        if (IStreamInvoker.e(this.getTwitchStream())) {
                            IStreamInvoker.i(this.getTwitchStream());
                        } else {
                            IStreamInvoker.b(this.getTwitchStream());
                        }
                    }
                } else if (n == GameSettingsInvoker.getKeyCode(this.gameSettings.bQ)) {
                    if (IStreamInvoker.d(this.getTwitchStream())) {
                        IStreamInvoker.n(this.getTwitchStream());
                    }
                } else if (n == GameSettingsInvoker.getKeyCode(this.gameSettings.bj)) {
                    IStreamInvoker.a(this.g, true);
                } else if (n == GameSettingsInvoker.getKeyCode(this.gameSettings.c)) {
                    this.toggleFullscreen();
                } else if (n == GameSettingsInvoker.getKeyCode(this.gameSettings.n)) {
                    ScreenShotHelper.a(this.mcDataDir, this.displayWidth, this.displayHeight, this.framebufferMc);
                    NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(this.novoline), StringPool1.de, 500, NotificationType.SUCCESS);
                }
            } else if (n == GameSettingsInvoker.getKeyCode(this.gameSettings.bj)) {
                IStreamInvoker.a(this.g, false);
            }
        }
    }

    public ResourcePackRepository G() {
        return this.mcResourcePackRepository;
    }

    private String lambda$addGraphicsAndWorldToCrashReport$11() throws Exception {
        return ad2_0.d(this.mcLanguageManager).toString();
    }

    public IntegratedServer ar() {
        return this.theIntegratedServer;
    }

    private String ac() {
        return this.theIntegratedServer != null ? (IntegratedServerInvoker.m(this.theIntegratedServer) ? StringPool1.dX : StringPool1.z) : (this.x != null ? (aKZ.e(this.x) ? StringPool1.s : StringPool1.aB) : StringPool1.m);
    }

    public NetHandlerPlayClient e() {
        return this.player != null ? this.player.connection : null;
    }

    public void displayGuiScreen(GuiScreen guiScreen) {
        if (this.currentScreen != null) {
            aLW.c(this.currentScreen);
        }
        if (this.world == null) {
            guiScreen = new GuiMainMenu();
        } else if (PlayerInvoker.aa(this.player) <= 0.0f) {
            guiScreen = new rk_0();
        }
        this.al = this.currentScreen;
        this.currentScreen = guiScreen;
        this.L();
        ScaledResolution scaledResolution = new ScaledResolution(this);
        int n = ScaledResolutionInvoker.getScaledWidth(scaledResolution);
        int n2 = ScaledResolutionInvoker.i(scaledResolution);
        aLW.b(guiScreen, this, n, n2);
        this.skipRenderWorld = false;
    }

    public a5f_0 getTwitchStream() {
        return this.g;
    }

    public boolean T() {
        return this.jvm64bit;
    }

    private void aq() throws LWJGLException {
        DisplayMode displayMode = DisplayInvoker.g();
        DisplayInvoker.a(displayMode);
        this.displayWidth = aSN.c(displayMode);
        this.displayHeight = aSN.b(displayMode);
    }

    public BlockRendererDispatcher z() {
        return this.blockRenderDispatcher;
    }

    private ByteBuffer a(InputStream inputStream) throws IOException {
        BufferedImage bufferedImage = aI8.a(inputStream);
        int[] nArray = jj_0.a(bufferedImage, 0, 0, jj_0.f(bufferedImage), jj_0.d(bufferedImage), null, 0, jj_0.f(bufferedImage));
        ByteBuffer byteBuffer = a8q_0.b(4 * nArray.length);
        for (int n : nArray) {
            a8q_0.a(byteBuffer, n << 8 | n >> 24 & 0xFF);
        }
        a8q_0.f(byteBuffer);
        return byteBuffer;
    }

    private static boolean isJvm64bit() {
        String[] stringArray;
        for (String string : stringArray = new String[]{StringPool1.d9, StringPool1.bl, StringPool1.ds}) {
            String string2 = SystemInvoker.c(string);
            if (!StringInvoker.a(string2, (CharSequence)StringPool1.aP)) continue;
            return true;
        }
        return false;
    }

    private String lambda$runTick$3() throws Exception {
        return ara_2.k(this.currentScreen.getClass());
    }

    public Session getSession() {
        return this.session;
    }

    public void func_181536_a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(TessellatorInvoker.getInstance());
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.POSITION_TEX_COLOR);
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n, n2 + n6, 0.0), (float)n3 * 0.00390625f, (float)(n4 + n6) * 0.00390625f), n7, n8, n9, n10));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n + n5, n2 + n6, 0.0), (float)(n3 + n5) * 0.00390625f, (float)(n4 + n6) * 0.00390625f), n7, n8, n9, n10));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n + n5, n2, 0.0), (float)(n3 + n5) * 0.00390625f, (float)n4 * 0.00390625f), n7, n8, n9, n10));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n, n2, 0.0), (float)n3 * 0.00390625f, (float)n4 * 0.00390625f), n7, n8, n9, n10));
        TessellatorInvoker.draw(TessellatorInvoker.getInstance());
    }

    private void displayDebugInfo(long l4) {
        if (this.mcProfiler.g) {
            List list = ProfilerInvoker.b(this.mcProfiler, this.i);
            Result result = (Result)ListInvoker.remove(list, 0);
            GlStateManagerInvoker.clear(256);
            GlStateManagerInvoker.matrixMode(5889);
            GlStateManagerInvoker.enableColorMaterial();
            GlStateManagerInvoker.loadIdentity();
            GlStateManagerInvoker.ortho(0.0, this.displayWidth, this.displayHeight, 0.0, 1000.0, 3000.0);
            GlStateManagerInvoker.matrixMode(5888);
            GlStateManagerInvoker.loadIdentity();
            GlStateManagerInvoker.translate(0.0f, 0.0f, -2000.0f);
            GL11.glLineWidth((float)1.0f);
            GlStateManagerInvoker.disableTexture2D();
            Tessellator tessellator = TessellatorInvoker.getInstance();
            WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
            int n = this.displayWidth - 160 - 10;
            int n2 = this.displayHeight - 320;
            GlStateManagerInvoker.enableBlend();
            WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.d);
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, (float)n - 176.0f, (float)n2 - 96.0f - 16.0f, 0.0), 200, 0, 0, 0));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, (float)n - 176.0f, n2 + 320, 0.0), 200, 0, 0, 0));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, (float)n + 176.0f, n2 + 320, 0.0), 200, 0, 0, 0));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, (float)n + 176.0f, (float)n2 - 96.0f - 16.0f, 0.0), 200, 0, 0, 0));
            TessellatorInvoker.draw(tessellator);
            GlStateManagerInvoker.disableBlend();
            double d = 0.0;
            Object object = ListInvoker.iterator(list);
            if (dz_0.c((Iterator)object)) {
                Result result2 = (Result)dz_0.b((Iterator)object);
                int n3 = MathHelper.floor_double(result2.field_76332_a / 4.0) + 1;
                WorldRendererInvoker.begin(worldRenderer, 6, DefaultVertexFormats.d);
                int n4 = de_0.a(result2);
                int n5 = n4 >> 16 & 0xFF;
                int n6 = n4 >> 8 & 0xFF;
                int n7 = n4 & 0xFF;
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, n, n2, 0.0), n5, n6, n7, 255));
                int n8 = n3;
                while (true) {
                    float f = (float)((d + result2.field_76332_a * (double)n8 / (double)n3) * Math.PI * 2.0 / 100.0);
                    float f2 = MathHelper.sin(f) * 160.0f;
                    float f3 = MathHelper.cos(f) * 160.0f * 0.5f;
                    WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, (float)n + f2, (float)n2 - f3, 0.0), n5, n6, n7, 255));
                    --n8;
                }
            }
            object = new DecimalFormat(StringPool1.aJ);
            GlStateManagerInvoker.enableTexture2D();
            String string = StringPool1.cT;
            if (!result.c.equals(StringPool1.cH)) {
                string = aL0.a(aL0.a(new StringBuilder(), string), StringPool1.by).toString();
            }
            string = StringInvoker.g(result.c) ? aL0.a(aL0.a(new StringBuilder(), string), StringPool1.b).toString() : aL0.a(aL0.a(aL0.a(new StringBuilder(), string), result.c), StringPool1.cN).toString();
            int n9 = 0xFFFFFF;
            FontRendererInvoker.drawStringWithShadow(this.fontRendererObj, string, n - 160, n2 - 80 - 16, 0xFFFFFF);
            string = aL0.a(aL0.a(new StringBuilder(), aBC.a((DecimalFormat)object, result.a)), StringPool1.c).toString();
            FontRendererInvoker.drawStringWithShadow(this.fontRendererObj, string, n + 160 - FontRendererInvoker.a(this.fontRendererObj, string), n2 - 80 - 16, 0xFFFFFF);
            for (int i = 0; i < ListInvoker.size(list); ++i) {
                Result result3 = (Result)ListInvoker.get(list, i);
                String string2 = StringPool1.ba;
                string2 = result3.c.equals(StringPool1.dt) ? aL0.a(aL0.a(new StringBuilder(), string2), StringPool1.db).toString() : aL0.a(aL0.c(aL0.a(aL0.a(new StringBuilder(), string2), StringPool1.cv), i + 1), StringPool1.ap).toString();
                string2 = aL0.a(aL0.a(new StringBuilder(), string2), result3.c).toString();
                FontRendererInvoker.drawStringWithShadow(this.fontRendererObj, string2, n - 160, n2 + 80 + i * 8 + 20, de_0.a(result3));
                string2 = aL0.a(aL0.a(new StringBuilder(), aBC.a((DecimalFormat)object, result3.field_76332_a)), StringPool1.dg).toString();
                FontRendererInvoker.drawStringWithShadow(this.fontRendererObj, string2, n + 160 - 50 - FontRendererInvoker.a(this.fontRendererObj, string2), n2 + 80 + i * 8 + 20, de_0.a(result3));
                string2 = aL0.a(aL0.a(new StringBuilder(), aBC.a((DecimalFormat)object, result3.a)), StringPool1.cA).toString();
                FontRendererInvoker.drawStringWithShadow(this.fontRendererObj, string2, n + 160 - FontRendererInvoker.a(this.fontRendererObj, string2), n2 + 80 + i * 8 + 20, de_0.a(result3));
            }
        }
    }

    public void launchIntegratedServer(String string, String string2, WorldSettings worldSettings) {
        Object object;
        this.a((WorldClient)null);
        ISaveHandler iSaveHandler = SaveLoaderInvoker.getSaveLoader(this.saveLoader, string, false);
        WorldInfo worldInfo = SaveHandlerInvoker.b(iSaveHandler);
        worldInfo = new WorldInfo(worldSettings, string);
        SaveHandlerInvoker.a(iSaveHandler, worldInfo);
        worldSettings = new WorldSettings(worldInfo);
        try {
            this.theIntegratedServer = new IntegratedServer(this, string, string2, worldSettings);
            IntegratedServerInvoker.startServerThread(this.theIntegratedServer);
            this.integratedServerIsRunning = true;
        }
        catch (Throwable throwable) {
            CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, StringPool1.ct);
            CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, StringPool1.ae);
            CrashReportCategoryInvoker.addCrashSection(crashReportCategory, StringPool1.dM, string);
            CrashReportCategoryInvoker.addCrashSection(crashReportCategory, StringPool1.cs, string2);
            throw new ReportedException(crashReport);
        }
        LoadingScreenInvoker.displaySavingString(this.loadingScreen, I18n.format(StringPool1.d, new Object[0]));
        while (!IntegratedServerInvoker.b(this.theIntegratedServer)) {
            object = IntegratedServerInvoker.n(this.theIntegratedServer);
            LoadingScreenInvoker.displayLoadingString(this.loadingScreen, I18n.format((String)object, new Object[0]));
            try {
                ThreadInvoker.sleep(200L);
            }
            catch (InterruptedException interruptedException) {}
        }
        this.displayGuiScreen(null);
        object = JP.b(IntegratedServerInvoker.f(this.theIntegratedServer));
        NetworkManager networkManager = NetworkManagerInvoker.provideLocalClient((SocketAddress)object);
        NetworkManagerInvoker.setNetHandler(networkManager, new NetHandlerLoginClient(networkManager, this, null));
        NetworkManagerInvoker.sendPacket(networkManager, new aQ4(47, object.toString(), 0, EnumConnectionState.LOGIN));
        NetworkManagerInvoker.sendPacket(networkManager, new C00PacketLoginStart(SessionInvoker.a(this.getSession())));
        this.myNetworkManager = networkManager;
    }

    private void setInitialDisplayMode() throws LWJGLException {
        if (this.fullscreen) {
            DisplayInvoker.b(true);
            DisplayMode displayMode = DisplayInvoker.e();
            this.displayWidth = MathInvoker.max(1, aSN.c(displayMode));
            this.displayHeight = MathInvoker.max(1, aSN.b(displayMode));
        } else {
            DisplayInvoker.a(new DisplayMode(this.displayWidth, this.displayHeight));
        }
    }

    public static int s() {
        int n = 16384;
        GL11.glTexImage2D((int)32868, (int)0, (int)6408, (int)n, (int)n, (int)0, (int)6408, (int)5121, (ByteBuffer)null);
        GL11.glGetTexLevelParameteri((int)32868, (int)0, (int)4096);
        return n;
    }

    public if_0 al() {
        return this.player != null ? (this.player.worldObj.d instanceof a9T ? if_0.NETHER : (this.player.worldObj.d instanceof a91 ? (ty_1.a != null && ty_1.c > 0 ? if_0.END_BOSS : if_0.END) : (aSY.a(this.player.abilities) && aSY.f(this.player.abilities) ? if_0.CREATIVE : if_0.GAME))) : if_0.MENU;
    }

    public String X() {
        return StringInvoker.a(MathInvoker.max(1, debugFPS));
    }

    public boolean isFramerateLimitBelowMax() {
        return (float)this.U() < aDY.a(aj2.FRAMERATE_LIMIT);
    }

    public void b(int n) {
        BlockInvoker.t(this.world);
        BlockInvoker.p(this.world);
        int n2 = 0;
        String string = null;
        if (this.player != null) {
            n2 = PlayerInvoker.O(this.player);
            BlockInvoker.b(this.world, this.player);
            string = PlayerInvoker.y(this.player);
        }
        this.ai = null;
        EntityPlayerSP entityPlayerSP = this.player;
        this.player = PlayerControllerInvoker.a(this.playerController, this.world, this.player == null ? new StatFileWriter() : PlayerInvoker.s(this.player));
        aom_0.a(PlayerInvoker.i(this.player), aom_0.c(PlayerInvoker.i(entityPlayerSP)));
        this.player.dimension = n;
        this.ai = this.player;
        PlayerInvoker.A(this.player);
        PlayerInvoker.a(this.player, string);
        BlockInvoker.a(this.world, this.player);
        PlayerControllerInvoker.a(this.playerController, this.player);
        PlayerInvoker.a(this.player, new MT(this.gameSettings));
        PlayerInvoker.g(this.player, n2);
        PlayerControllerInvoker.c(this.playerController, this.player);
        PlayerInvoker.e(this.player, PlayerInvoker.J(entityPlayerSP));
        if (this.currentScreen instanceof rk_0) {
            this.displayGuiScreen(null);
        }
    }

    @Override
    public void a(PlayerUsageSnooper playerUsageSnooper) {
        SnooperInvoker.a(playerUsageSnooper, StringPool1.cY, P8.d(debugFPS));
        SnooperInvoker.a(playerUsageSnooper, StringPool1.bk, auk_2.b(this.gameSettings.x));
        SnooperInvoker.a(playerUsageSnooper, StringPool1.as, P8.d(aSN.d(DisplayInvoker.e())));
        SnooperInvoker.a(playerUsageSnooper, StringPool1.bQ, this.fullscreen ? StringPool1.ay : StringPool1.ce);
        SnooperInvoker.a(playerUsageSnooper, StringPool1.ao, lx_2.b((ServerInvoker.c() - SnooperInvoker.g(playerUsageSnooper)) / 60L * 1000L));
        SnooperInvoker.a(playerUsageSnooper, StringPool1.d0, this.ac());
        String string = adn_0.a() == ByteOrder.LITTLE_ENDIAN ? StringPool1.bd : StringPool1.aC;
        SnooperInvoker.a(playerUsageSnooper, StringPool1.dx, string);
        SnooperInvoker.a(playerUsageSnooper, StringPool1.cl, P8.d(ListInvoker.size(mf_1.f(this.mcResourcePackRepository))));
        int n = 0;
        Iterator iterator = ListInvoker.iterator(mf_1.f(this.mcResourcePackRepository));
        while (dz_0.c(iterator)) {
            ResourcePackRepositoryEntry resourcePackRepositoryEntry2 = (ResourcePackRepositoryEntry)dz_0.b(iterator);
            SnooperInvoker.a(playerUsageSnooper, aL0.a(aL0.c(aL0.a(new StringBuilder(), StringPool1.cF), n++), StringPool1.dN).toString(), ad6_0.e(resourcePackRepositoryEntry2));
        }
        if (this.theIntegratedServer != null && this.theIntegratedServer.r() != null) {
            SnooperInvoker.a(playerUsageSnooper, StringPool1.c2, SnooperInvoker.f(this.theIntegratedServer.r()));
        }
    }

    public PlayerUsageSnooper ak() {
        return this.usageSnooper;
    }

    private String lambda$runTick$4() throws Exception {
        return ara_2.k(this.currentScreen.getClass());
    }

    /*
     * Loose catch block
     */
    private void drawSplashScreen(TextureManager textureManager) {
        Framebuffer framebuffer;
        int n;
        ScaledResolution scaledResolution;
        block5: {
            scaledResolution = new ScaledResolution(this);
            n = ScaledResolutionInvoker.getScaleFactor(scaledResolution);
            framebuffer = new Framebuffer(ScaledResolutionInvoker.getScaledWidth(scaledResolution) * n, ScaledResolutionInvoker.i(scaledResolution) * n, true);
            FramebufferInvoker.bindFramebuffer(framebuffer, false);
            GlStateManagerInvoker.matrixMode(5889);
            GlStateManagerInvoker.loadIdentity();
            GlStateManagerInvoker.ortho(0.0, ScaledResolutionInvoker.getScaledWidth(scaledResolution), ScaledResolutionInvoker.i(scaledResolution), 0.0, 1000.0, 3000.0);
            GlStateManagerInvoker.matrixMode(5888);
            GlStateManagerInvoker.loadIdentity();
            GlStateManagerInvoker.translate(0.0f, 0.0f, -2000.0f);
            GlStateManagerInvoker.disableLighting();
            GlStateManagerInvoker.disableFog();
            GlStateManagerInvoker.disableDepth();
            GlStateManagerInvoker.enableTexture2D();
            InputStream inputStream = null;
            inputStream = RPacketManagerInvoker.getInputStream(this.mcDefaultResourcePack, locationMojangPng);
            this.mojangLogo = TextureManagerInvoker.getDynamicTextureLocation(textureManager, StringPool1.dK, new DynamicTexture(aI8.a(inputStream)));
            TextureManagerInvoker.bindTexture(textureManager, this.mojangLogo);
            IOUtilsInvoker.closeQuietly(inputStream);
            break block5;
            {
                catch (IOException iOException) {
                    try {
                        LoggerInvoker.a(this.getLogger(), aL0.a(aL0.a(new StringBuilder(), StringPool1.bG), locationMojangPng).toString(), iOException);
                    }
                    catch (Throwable throwable) {
                        IOUtilsInvoker.closeQuietly(inputStream);
                        throw throwable;
                    }
                    IOUtilsInvoker.closeQuietly(inputStream);
                }
            }
        }
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.POSITION_TEX_COLOR);
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.0, this.displayHeight, 0.0), 0.0, 0.0), 255, 255, 255, 255));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, this.displayWidth, this.displayHeight, 0.0), 0.0, 0.0), 255, 255, 255, 255));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, this.displayWidth, 0.0, 0.0), 0.0, 0.0), 255, 255, 255, 255));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.0, 0.0, 0.0), 0.0, 0.0), 255, 255, 255, 255));
        TessellatorInvoker.draw(tessellator);
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.func_181536_a((ScaledResolutionInvoker.getScaledWidth(scaledResolution) - 256) / 2, (ScaledResolutionInvoker.i(scaledResolution) - 256) / 2, 0, 0, 256, 256, 255, 255, 255, 255);
        GlStateManagerInvoker.disableLighting();
        GlStateManagerInvoker.disableFog();
        FramebufferInvoker.unbindFramebuffer(framebuffer);
        FramebufferInvoker.framebufferRender(framebuffer, ScaledResolutionInvoker.getScaledWidth(scaledResolution) * n, ScaledResolutionInvoker.i(scaledResolution) * n);
        GlStateManagerInvoker.enableAlpha();
        GlStateManagerInvoker.alphaFunc(516, 0.1f);
        this.updateDisplay();
    }

    public static long getSystemTime() {
        return SysInvoker.b() * 1000L / SysInvoker.a();
    }

    public Minecraft a(Logger logger) {
        this.I = logger;
        return this;
    }

    public void aj() {
        try {
            if (wc_1.g(ModuleInvoker.isEnable(ModuleRegistry.XRAY))) {
                wc_1.k(ModuleInvoker.isEnable(ModuleRegistry.XRAY));
            }
            NovolineInvoker.j(this.novoline);
            IStreamInvoker.u(this.g);
            LoggerInvoker.info(this.getLogger(), StringPool1.dE);
            try {
                this.a((WorldClient)null);
            }
            catch (Throwable throwable) {}
            SoundHandlerInvoker.b(this.mcSoundHandler);
        }
        finally {
            DisplayInvoker.h();
            if (!this.T) {
                SystemInvoker.a(0);
            }
        }
    }

    public void u() {
        if (this.fullscreen) {
            this.toggleFullscreen();
        }
    }

    public void updateDisplay() {
        ProfilerInvoker.startSection(this.mcProfiler, StringPool1.W);
        DisplayInvoker.m();
        ProfilerInvoker.endSection(this.mcProfiler);
        this.checkWindowResize();
    }

    public void av() {
        if (DisplayInvoker.l() && !this.ay) {
            this.ay = true;
            aYO.a(this.mouseHelper);
            this.displayGuiScreen(null);
            this.leftClickCounter = 10000;
        }
    }

    static {
        R = Util.a() == a3t_0.OSX;
        locationMojangPng = new ResourceLocation(StringPool1.bc);
        A = my_0.a(new DisplayMode[]{new DisplayMode(2560, 1600), new DisplayMode(2880, 1800)});
        aV = new byte[0xA00000];
    }

    public static boolean w() {
        return theMinecraft == null || !Minecraft.theMinecraft.gameSettings.g;
    }

    public void c(CrashReport crashReport) {
        File file = new File(Minecraft.getInstance().mcDataDir, StringPool1.cO);
        File file2 = new File(file, aL0.a(aL0.a(aL0.a(new StringBuilder(), StringPool1.dq), aZ2.a(new SimpleDateFormat(StringPool1.c8), new Date())), StringPool1.v).toString());
        BootstrapInvoker.a(CrashInvoker.b(crashReport));
        if (!NovolineInvoker.b(NovolineInvoker.getInstance()) && wc_1.g(ModuleInvoker.isEnable(ModuleRegistry.XRAY))) {
            wc_1.k(ModuleInvoker.isEnable(ModuleRegistry.XRAY));
        }
        NovolineInvoker.j(this.novoline);
        if (CrashInvoker.d(crashReport) != null) {
            BootstrapInvoker.a(aL0.a(aL0.a(new StringBuilder(), StringPool1.Y), CrashInvoker.d(crashReport)).toString());
            SystemInvoker.a(-1);
        } else if (CrashInvoker.a(crashReport, file2)) {
            BootstrapInvoker.a(aL0.a(aL0.a(new StringBuilder(), StringPool1.dH), zq_2.j(file2)).toString());
            SystemInvoker.a(-1);
        } else {
            BootstrapInvoker.a(StringPool1.bt);
            SystemInvoker.a(-2);
        }
    }

    @Override
    public boolean a() {
        return this.gameSettings.b0;
    }

    public ServerData ag() {
        return this.x;
    }

    public void shutdown() {
        awu_1.c(this.gameSettings);
        this.Q = false;
    }

    public void a(boolean bl) {
        this.aq = bl;
    }

    private void a(int n) {
        List list = ProfilerInvoker.b(this.mcProfiler, this.i);
        if (!ListInvoker.isEmpty(list)) {
            Result result = (Result)ListInvoker.remove(list, 0);
            if (!StringInvoker.g(result.c)) {
                int n2 = StringInvoker.j(this.i, StringPool1.aU);
                this.i = StringInvoker.b(this.i, 0, n2);
            }
        }
    }

    private static String lambda$addGraphicsAndWorldToCrashReport$8() throws Exception {
        String string = pm_1.a();
        return !string.equals(StringPool1.cd) ? aL0.a(aL0.a(aL0.a(new StringBuilder(), StringPool1.dj), string), StringPool1.co).toString() : (ara_2.o(Minecraft.class) == null ? StringPool1.bB : StringPool1.b2);
    }

    /*
     * Exception decompiling
     */
    public void run() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [14[UNCONDITIONALDOLOOP]], but top level block is 1[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public void B() {
        if (this.currentScreen == null) {
            this.displayGuiScreen(new R2());
            if (this.at() && !IntegratedServerInvoker.m(this.theIntegratedServer)) {
                SoundHandlerInvoker.e(this.mcSoundHandler);
            }
        }
    }

    private void checkGLError(String string) {
        int n = GL11.glGetError();
        String string2 = afs_2.a(n);
        LoggerInvoker.f(this.getLogger(), StringPool1.aM);
        LoggerInvoker.f(this.getLogger(), aL0.a(aL0.a(new StringBuilder(), StringPool1.M), string).toString());
        LoggerInvoker.f(this.getLogger(), aL0.a(aL0.a(aL0.c(new StringBuilder(), n), StringPool1.E), string2).toString());
    }

    public TextureMap W() {
        return this.textureMapBlocks;
    }

    public void a(WorldClient worldClient, String string) {
        EventManagerInvoker.call(new LoadWorldEvent());
        NetHandlerPlayClient netHandlerPlayClient = this.e();
        aDM.c(netHandlerPlayClient);
        if (this.theIntegratedServer != null && IntegratedServerInvoker.j(this.theIntegratedServer)) {
            IntegratedServerInvoker.l(this.theIntegratedServer);
            IntegratedServerInvoker.g(this.theIntegratedServer);
        }
        this.theIntegratedServer = null;
        GuiAchievementInvoker.b(this.guiAchievement);
        apx_2.a(EntityRendererInvoker.a(this.entityRenderer));
        this.ai = null;
        this.myNetworkManager = null;
        if (ThreadInvoker.a() == this.k && this.loadingScreen != null) {
            LoadingScreenInvoker.b(this.loadingScreen, string);
            LoadingScreenInvoker.displayLoadingString(this.loadingScreen, StringPool1.bZ);
        }
        if (this.world != null) {
            mf_1.c(this.mcResourcePackRepository);
            GW.g(this.ingameGUI);
            this.a((ServerData)null);
            this.integratedServerIsRunning = false;
        }
        SoundHandlerInvoker.c(this.mcSoundHandler);
        this.world = worldClient;
        if (this.renderGlobal != null) {
            jv_0.a(this.renderGlobal, worldClient);
        }
        if (this.effectRenderer != null) {
            ayx_2.a(this.effectRenderer, worldClient);
        }
        if (this.player == null) {
            this.player = PlayerControllerInvoker.a(this.playerController, worldClient, new StatFileWriter());
            PlayerControllerInvoker.a(this.playerController, this.player);
        }
        PlayerInvoker.A(this.player);
        BlockInvoker.a(worldClient, this.player);
        PlayerInvoker.a(this.player, new MT(this.gameSettings));
        PlayerControllerInvoker.c(this.playerController, this.player);
        this.ai = this.player;
        this.ap = 0L;
    }

    public void a(CrashReport crashReport) {
        this.T = true;
        this.ac = crashReport;
    }

    public SoundHandler A() {
        return this.mcSoundHandler;
    }

    public static boolean j() {
        return theMinecraft != null && Minecraft.theMinecraft.gameSettings.a4;
    }

    public void c(boolean bl) {
        this.leftClickCounter = 0;
        if (this.player != null && this.leftClickCounter <= 0 && !PlayerInvoker.ag(this.player)) {
            if (this.objectMouseOver != null && this.objectMouseOver.typeOfHit == net.I.BLOCK) {
                BlockPos blockPos = ObjectMouseOverInvoker.getBlockPos(this.objectMouseOver);
                if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.world, blockPos))) != Material.air && PlayerControllerInvoker.c(this.playerController, blockPos, this.objectMouseOver.facing)) {
                    ayx_2.a(this.effectRenderer, blockPos, this.objectMouseOver.facing);
                    PlayerInvoker.V(this.player);
                }
            } else {
                PlayerControllerInvoker.l(this.playerController);
            }
        }
    }

    public void az() {
        try {
            aV = new byte[0];
            jv_0.a(this.renderGlobal);
        }
        catch (Throwable throwable) {}
        try {
            this.a((WorldClient)null);
        }
        catch (Throwable throwable) {}
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public Logger getLogger() {
        return this.I;
    }

    public void L() {
        if (this.ay) {
            GameSettingsInvoker.b();
            this.ay = false;
            aYO.c(this.mouseHelper);
        }
    }

    public boolean q() {
        return this.integratedServerIsRunning;
    }

    private void registerMetadataSerializers() {
        YM.a(this.metadataSerializer_, new a3K(), avm_0.class);
        YM.a(this.metadataSerializer_, new a3w_0(), T7.class);
        YM.a(this.metadataSerializer_, new a3C(), bc_0.class);
        YM.a(this.metadataSerializer_, new a3Y(), aqd_0.class);
        YM.a(this.metadataSerializer_, new a3s(), aoj_1.class);
    }

    private String lambda$addGraphicsAndWorldToCrashReport$5() throws Exception {
        return this.launchedVersion;
    }

    private void startTimerHackThread() {
        amm_0 amm_02 = new amm_0(this, StringPool1.dv);
        ThreadInvoker.a((Thread)amm_02, true);
        ThreadInvoker.e(amm_02);
    }

    public static boolean au() {
        return theMinecraft != null && Minecraft.theMinecraft.gameSettings.k != 0;
    }

    public boolean k() {
        return this.isDemo;
    }

    private void initStream() {
        try {
            this.g = new xi_1(this, (Property)DZ.a((Iterable)ayw_0.b(this.twitchDetails, StringPool1.al), null));
        }
        catch (Throwable throwable) {
            this.g = new agl_0(throwable);
            LoggerInvoker.f(this.getLogger(), StringPool1.bA);
        }
    }

    private void J() {
        FramebufferInvoker.a(this.framebufferMc, this.displayWidth, this.displayHeight);
        if (this.entityRenderer != null) {
            EntityRendererInvoker.a(this.entityRenderer, this.displayWidth, this.displayHeight);
        }
    }

    private String lambda$startGame$0(String string) {
        try {
            return StringInvoker.a(string, new Object[]{awu_1.a(GameSettingsInvoker.getKeyCode(this.gameSettings.a0))});
        }
        catch (Exception exception) {
            return aL0.a(aL0.a(new StringBuilder(), StringPool1.ee), ch_2.c(exception)).toString();
        }
    }

    private void createDisplay() throws LWJGLException {
        DisplayInvoker.a(true);
        DisplayInvoker.a(StringPool1.a8);
        try {
            DisplayInvoker.a(a3F.a(new PixelFormat(), 24));
        }
        catch (LWJGLException lWJGLException) {
            LoggerInvoker.a(this.getLogger(), StringPool1.bj, lWJGLException);
            try {
                ThreadInvoker.sleep(1000L);
            }
            catch (InterruptedException interruptedException) {}
            if (this.fullscreen) {
                this.aq();
            }
            DisplayInvoker.k();
        }
    }

    public Novoline Y() {
        return this.novoline;
    }

    private String lambda$addGraphicsAndWorldToCrashReport$10() throws Exception {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterator = ListInvoker.iterator(this.gameSettings.bg);
        while (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            if (aL0.a(stringBuilder) > 0) {
                aL0.a(stringBuilder, StringPool1.a2);
            }
            aL0.a(stringBuilder, object);
            if (!ListInvoker.contains(this.gameSettings.bY, object)) continue;
            aL0.a(stringBuilder, StringPool1.R);
        }
        return stringBuilder.toString();
    }

    public CrashReport b(CrashReport crashReport) {
        CrashReportCategoryInvoker.a(CrashInvoker.c(crashReport), StringPool1.ac, this::lambda$addGraphicsAndWorldToCrashReport$5);
        CrashReportCategoryInvoker.a(CrashInvoker.c(crashReport), StringPool1.f, Sys::getVersion);
        CrashReportCategoryInvoker.a(CrashInvoker.c(crashReport), StringPool1.a0, Minecraft::lambda$addGraphicsAndWorldToCrashReport$6);
        CrashReportCategoryInvoker.a(CrashInvoker.c(crashReport), StringPool1.a1, apl_1::b);
        CrashReportCategoryInvoker.a(CrashInvoker.c(crashReport), StringPool1.b7, this::lambda$addGraphicsAndWorldToCrashReport$7);
        CrashReportCategoryInvoker.a(CrashInvoker.c(crashReport), StringPool1.bu, Minecraft::lambda$addGraphicsAndWorldToCrashReport$8);
        CrashReportCategoryInvoker.a(CrashInvoker.c(crashReport), StringPool1.aA, Minecraft::lambda$addGraphicsAndWorldToCrashReport$9);
        CrashReportCategoryInvoker.a(CrashInvoker.c(crashReport), StringPool1.a9, this::lambda$addGraphicsAndWorldToCrashReport$10);
        CrashReportCategoryInvoker.a(CrashInvoker.c(crashReport), StringPool1.dW, this::lambda$addGraphicsAndWorldToCrashReport$11);
        CrashReportCategoryInvoker.a(CrashInvoker.c(crashReport), StringPool1.X, this::lambda$addGraphicsAndWorldToCrashReport$12);
        CrashReportCategoryInvoker.a(CrashInvoker.c(crashReport), StringPool1.eb, apl_1::d);
        if (this.world != null) {
            BlockInvoker.a(this.world, crashReport);
        }
        return crashReport;
    }

    private String lambda$addGraphicsAndWorldToCrashReport$12() throws Exception {
        return this.mcProfiler.g ? ProfilerInvoker.c(this.mcProfiler) : StringPool1.J;
    }

    private void r() {
        if (this.objectMouseOver != null) {
            aSY.a(this.player.abilities);
            if (this.objectMouseOver.typeOfHit == net.I.BLOCK) {
                BlockPos blockPos = ObjectMouseOverInvoker.getBlockPos(this.objectMouseOver);
                Block block = BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.world, blockPos));
                if (BlocksInvoker.getBlockState(block) == Material.air) {
                    return;
                }
                BlocksInvoker.c(block, this.world, blockPos);
                return;
            }
            if (this.objectMouseOver.typeOfHit != net.I.ENTITY || this.objectMouseOver.entityHit != null) {
                // empty if block
            }
            return;
        }
    }

    private static boolean lambda$runTick$1(FutureTask futureTask) {
        return X9.c(futureTask) == ag3_0.TICK;
    }

    public boolean isUnicode() {
        return ad2_0.b(this.mcLanguageManager) || this.gameSettings.bN;
    }

    public PropertyMap a(GameProfile gameProfile) {
        ayw_0.c(this.field_181038_N);
        GameProfile gameProfile2 = aSI.b(this.getSessionService(), gameProfile, false);
        ayw_0.a(this.field_181038_N, (Multimap)a4Z.c(gameProfile2));
        return this.field_181038_N;
    }

    public SkinManager Q() {
        return this.skinManager;
    }

    public void b(boolean bl) {
        this.u = bl;
    }

    public PropertyMap R() {
        if (ayw_0.b(this.field_181038_N)) {
            GameProfile gameProfile = aSI.b(this.getSessionService(), SessionInvoker.a(this.session), false);
            ayw_0.a(this.field_181038_N, (Multimap)a4Z.c(gameProfile));
        }
        return this.field_181038_N;
    }

    public int U() {
        return this.world == null && this.currentScreen != null ? 240 : this.gameSettings.bI;
    }

    /*
     * Loose catch block
     * Enabled aggressive exception aggregation
     */
    private void setWindowIcon() {
        block7: {
            a3t_0 a3t_02 = Util.a();
            if (a3t_02 != a3t_0.OSX) {
                InputStream inputStream = null;
                InputStream inputStream2 = null;
                inputStream = RPacketManagerInvoker.c(this.mcDefaultResourcePack, new ResourceLocation(StringPool1.du));
                inputStream2 = RPacketManagerInvoker.c(this.mcDefaultResourcePack, new ResourceLocation(StringPool1.cM));
                ByteBuffer[] byteBufferArray = new ByteBuffer[2];
                byteBufferArray[0] = this.a(inputStream);
                byteBufferArray[1] = this.a(inputStream2);
                DisplayInvoker.a(byteBufferArray);
                IOUtilsInvoker.closeQuietly(inputStream);
                IOUtilsInvoker.closeQuietly(inputStream2);
                break block7;
                {
                    catch (IOException iOException) {
                        try {
                            LoggerInvoker.a(this.getLogger(), StringPool1.k, iOException);
                        }
                        catch (Throwable throwable) {
                            IOUtilsInvoker.closeQuietly(inputStream);
                            IOUtilsInvoker.closeQuietly(inputStream2);
                            throw throwable;
                        }
                        IOUtilsInvoker.closeQuietly(inputStream);
                        IOUtilsInvoker.closeQuietly(inputStream2);
                    }
                }
            }
        }
    }

    public void a(WorldClient worldClient) {
        this.a(worldClient, StringPool1.cZ);
    }

    private static String lambda$addGraphicsAndWorldToCrashReport$9() throws Exception {
        return StringPool1.cy;
    }

    public PropertyMap ay() {
        return this.twitchDetails;
    }

    private static String lambda$addGraphicsAndWorldToCrashReport$6() throws Exception {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), GL11.glGetString((int)7937)), StringPool1.bm), GL11.glGetString((int)7938)), StringPool1.P), GL11.glGetString((int)7936)).toString();
    }

    private void resize(int n, int n2) {
        this.displayWidth = MathInvoker.max(1, n);
        this.displayHeight = MathInvoker.max(1, n2);
        if (this.currentScreen != null) {
            ScaledResolution scaledResolution = new ScaledResolution(this);
            aLW.a(this.currentScreen, this, ScaledResolutionInvoker.getScaledWidth(scaledResolution), ScaledResolutionInvoker.i(scaledResolution));
        }
        this.loadingScreen = new LoadingScreenRenderer(this);
        this.J();
    }

    public void refreshResources() {
        ArrayList arrayList = my_0.a(this.defaultResourcePacks);
        Iterator iterator = ListInvoker.iterator(mf_1.f(this.mcResourcePackRepository));
        while (dz_0.c(iterator)) {
            ResourcePackRepositoryEntry resourcePackRepositoryEntry2 = (ResourcePackRepositoryEntry)dz_0.b(iterator);
            ListInvoker.add(arrayList, ad6_0.a(resourcePackRepositoryEntry2));
        }
        if (mf_1.e(this.mcResourcePackRepository) != null) {
            ListInvoker.add(arrayList, mf_1.e(this.mcResourcePackRepository));
        }
        try {
            ResourceManagerInvoker.a(this.mcResourceManager, arrayList);
        }
        catch (RuntimeException runtimeException) {
            LoggerInvoker.f(this.getLogger(), StringPool1.dc, runtimeException);
            ListInvoker.clear(arrayList);
            ListInvoker.addAll(arrayList, this.defaultResourcePacks);
            mf_1.a(this.mcResourcePackRepository, asg_0.e());
            ResourceManagerInvoker.a(this.mcResourceManager, arrayList);
            ListInvoker.clear(this.gameSettings.bg);
            ListInvoker.clear(this.gameSettings.bY);
            awu_1.c(this.gameSettings);
        }
        ad2_0.a(this.mcLanguageManager, arrayList);
        if (this.renderGlobal != null) {
            jv_0.m(this.renderGlobal);
        }
    }

    private void lambda$dispatchKeypresses$13(boolean bl, int n) {
        IStreamInvoker.h(this.getTwitchStream());
        this.displayGuiScreen(null);
    }

    public TextureManager af() {
        return this.renderEngine;
    }

    public RenderItem C() {
        return this.renderItem;
    }

    protected void checkWindowResize() {
        if (!this.fullscreen && DisplayInvoker.wasResized()) {
            int n = this.displayWidth;
            int n2 = this.displayHeight;
            this.displayWidth = DisplayInvoker.getWidth();
            this.displayHeight = DisplayInvoker.getHeight();
            if (this.displayWidth != n || this.displayHeight != n2) {
                if (this.displayWidth <= 0) {
                    this.displayWidth = 1;
                }
                if (this.displayHeight <= 0) {
                    this.displayHeight = 1;
                }
                this.resize(this.displayWidth, this.displayHeight);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void runGameLoop() throws IOException {
        long l4 = SystemInvoker.nanoTime();
        ProfilerInvoker.startSection(this.mcProfiler, StringPool1.D);
        if (DisplayInvoker.i() && DisplayInvoker.c()) {
            this.shutdown();
        }
        if (this.isGamePaused && this.world != null) {
            float f = this.timer.renderPartialTicks;
            if (StringInvoker.c(DisplayInvoker.b(), StringPool1.ab) || this.currentScreen instanceof GuiLogin) {
                TimerInvoker.a(this.timer);
            } else {
                TimerInvoker.a(this.timer, 0.1f);
            }
            this.timer.renderPartialTicks = f;
        } else if (StringInvoker.c(DisplayInvoker.b(), StringPool1.d2) || this.currentScreen instanceof GuiLogin) {
            TimerInvoker.a(this.timer);
        } else {
            TimerInvoker.a(this.timer, 0.1f);
        }
        ProfilerInvoker.startSection(this.mcProfiler, StringPool1.d_);
        Queue<java.util.concurrent.FutureTask<?>> queue = this.scheduledTasks;
        synchronized (queue) {
            while (!FutureTaskInvoker.c(this.scheduledTasks)) {
                Util.a((java.util.concurrent.FutureTask)FutureTaskInvoker.d(this.scheduledTasks), this.getLogger());
            }
        }
        ProfilerInvoker.endSection(this.mcProfiler);
        long l5 = SystemInvoker.nanoTime();
        ProfilerInvoker.startSection(this.mcProfiler, StringPool1.aY);
        for (int i = 0; i < this.timer.e; ++i) {
            this.runTick();
        }
        ProfilerInvoker.a(this.mcProfiler, StringPool1.aX);
        long l6 = SystemInvoker.nanoTime() - l5;
        this.checkGLError(StringPool1.da);
        ProfilerInvoker.a(this.mcProfiler, StringPool1.cX);
        SoundHandlerInvoker.a(this.mcSoundHandler, this.player, this.timer.renderPartialTicks);
        ProfilerInvoker.endSection(this.mcProfiler);
        ProfilerInvoker.startSection(this.mcProfiler, StringPool1.d6);
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.clear(16640);
        FramebufferInvoker.bindFramebuffer(this.framebufferMc, true);
        ProfilerInvoker.startSection(this.mcProfiler, StringPool1.T);
        GlStateManagerInvoker.enableTexture2D();
        if (this.player != null && PlayerInvoker.am(this.player)) {
            awu_1.a(this.gameSettings, 0);
        }
        ProfilerInvoker.endSection(this.mcProfiler);
        if (!this.skipRenderWorld) {
            ProfilerInvoker.a(this.mcProfiler, StringPool1.I);
            EntityRendererInvoker.a(this.entityRenderer, this.timer.renderPartialTicks, l4);
            if (!NovolineInvoker.b(this.novoline)) {
                NotificationManager notificationManager = NovolineInvoker.getNotificationManager(this.novoline);
                HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
                double d = ua_2.a(true);
                StringProperty stringProperty = cw_2.s(hUD);
                if (StringPropertyInvoker.isMode(stringProperty, StringPool1.cG)) {
                    ListInvoker.forEach(NotificationManagerInvoker.a(notificationManager), Notification::b);
                } else if (StringPropertyInvoker.isMode(stringProperty, StringPool1.bP)) {
                    ListInvoker.forEach(NotificationManagerInvoker.a(notificationManager), Notification::j);
                } else if (StringPropertyInvoker.isMode(stringProperty, StringPool1.dm)) {
                    ListInvoker.forEach(NotificationManagerInvoker.a(notificationManager), Notification::e);
                }
                ua_2.a(d);
            }
            ProfilerInvoker.endSection(this.mcProfiler);
        }
        ProfilerInvoker.endSection(this.mcProfiler);
        if (this.gameSettings.ar && this.gameSettings.aJ && !this.gameSettings.g) {
            if (!this.mcProfiler.g) {
                ProfilerInvoker.b(this.mcProfiler);
            }
            this.mcProfiler.g = true;
            this.displayDebugInfo(l6);
        } else {
            this.mcProfiler.g = false;
            this.aa = SystemInvoker.nanoTime();
        }
        GuiAchievementInvoker.a(this.guiAchievement);
        FramebufferInvoker.unbindFramebuffer(this.framebufferMc);
        GlStateManagerInvoker.popMatrix();
        GlStateManagerInvoker.pushMatrix();
        FramebufferInvoker.framebufferRender(this.framebufferMc, this.displayWidth, this.displayHeight);
        GlStateManagerInvoker.popMatrix();
        GlStateManagerInvoker.pushMatrix();
        EntityRendererInvoker.renderStreamIndicator(this.entityRenderer, this.timer.renderPartialTicks);
        GlStateManagerInvoker.popMatrix();
        ProfilerInvoker.startSection(this.mcProfiler, StringPool1.a5);
        this.updateDisplay();
        ThreadInvoker.yield();
        ProfilerInvoker.startSection(this.mcProfiler, StringPool1.aE);
        ProfilerInvoker.startSection(this.mcProfiler, StringPool1.bT);
        IStreamInvoker.p(this.g);
        ProfilerInvoker.a(this.mcProfiler, StringPool1.bp);
        IStreamInvoker.l(this.g);
        ProfilerInvoker.endSection(this.mcProfiler);
        ProfilerInvoker.endSection(this.mcProfiler);
        this.checkGLError(StringPool1.ar);
        ++this.fpsCounter;
        this.isGamePaused = false;
        long l7 = SystemInvoker.nanoTime();
        anr_1.a(this.field_181542_y, l7 - this.am);
        this.am = l7;
        if (Minecraft.getSystemTime() >= this.debugUpdateTime + 1000L) {
            debugFPS = this.fpsCounter;
            Object[] objectArray = new Object[8];
            objectArray[0] = P8.d(debugFPS);
            objectArray[1] = P8.d(RenderChunk.renderChunksUpdated);
            objectArray[2] = RenderChunk.renderChunksUpdated != 1 ? StringPool1.L : StringPool1.dV;
            objectArray[3] = (float)this.gameSettings.bI == aDY.a(aj2.FRAMERATE_LIMIT) ? StringPool1.aj : P8.d(this.gameSettings.bI);
            objectArray[4] = this.gameSettings.x ? StringPool1.dY : StringPool1.cm;
            Object object = objectArray[5] = this.gameSettings.a4 ? StringPool1.bW : StringPool1.a;
            objectArray[6] = this.gameSettings.by == 0 ? StringPool1.dk : (this.gameSettings.by == 1 ? StringPool1.cJ : StringPool1.cn);
            objectArray[7] = OpenGlHelper.f() ? StringPool1.h : StringPool1.ca;
            this.debug = StringInvoker.a(StringPool1.dS, objectArray);
            RenderChunk.renderChunksUpdated = 0;
            this.debugUpdateTime += 1000L;
            this.fpsCounter = 0;
            SnooperInvoker.addMemoryStatsToSnooper(this.usageSnooper);
            if (!SnooperInvoker.isSnooperRunning(this.usageSnooper)) {
                SnooperInvoker.startSnooper(this.usageSnooper);
            }
        }
        if (this.isFramerateLimitBelowMax()) {
            ProfilerInvoker.startSection(this.mcProfiler, StringPool1.cb);
            DisplayInvoker.a(this.U());
            ProfilerInvoker.endSection(this.mcProfiler);
        }
        ProfilerInvoker.endSection(this.mcProfiler);
    }

    public boolean isGamePaused() {
        return this.isGamePaused;
    }

    public void clickMouse() {
        Scaffold scaffold = (Scaffold)ModuleInvoker.isEnable(ModuleRegistry.SCAFFOLD);
        if (ma_1.c(scaffold)) {
            return;
        }
        if (this.leftClickCounter <= 0) {
            Invoker1.a(this.objectMouseOver);
            if (this.objectMouseOver == null) {
                LoggerInvoker.f(this.getLogger(), StringPool1.cx);
                if (PlayerControllerInvoker.isNotCreative(this.playerController)) {
                    this.leftClickCounter = 10;
                }
            } else {
                switch (this.objectMouseOver.typeOfHit) {
                    case ENTITY: {
                        Invoker1.attackEntity(this.player, this.objectMouseOver.entityHit);
                        break;
                    }
                    case BLOCK: {
                        BlockPos blockPos = ObjectMouseOverInvoker.getBlockPos(this.objectMouseOver);
                        if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.world, blockPos))) != Material.air) {
                            PlayerControllerInvoker.clickBlock(this.playerController, blockPos, this.objectMouseOver.facing);
                            break;
                        }
                    }
                    default: {
                        if (!PlayerControllerInvoker.isNotCreative(this.playerController)) break;
                        this.leftClickCounter = 10;
                    }
                }
            }
        }
    }

    public GuiScreen N() {
        return this.al;
    }

    public String H() {
        return this.launchedVersion;
    }

    public Framebuffer getFrameBuffer() {
        return this.framebufferMc;
    }

    public static Map<String, String> getSessionInfo() {
        HashMap hashMap = MapsInvoker.a();
        MapInvoker.c(hashMap, StringPool1.a4, SessionInvoker.getUsername(Minecraft.getInstance().getSession()));
        MapInvoker.c(hashMap, StringPool1.bi, SessionInvoker.getPlayerID(Minecraft.getInstance().getSession()));
        MapInvoker.c(hashMap, StringPool1.bo, StringPool1.dO);
        return hashMap;
    }

    @Override
    public void addServerTypeToSnooper(PlayerUsageSnooper playerUsageSnooper) {
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.bs, GL11.glGetString((int)7938));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.d7, GL11.glGetString((int)7936));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.dU, pm_1.a());
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.cS, this.launchedVersion);
        ContextCapabilities contextCapabilities = aXQ.a();
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.cg, auk_2.b(contextCapabilities.GL_ARB_arrays_of_arrays));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.bn, auk_2.b(contextCapabilities.GL_ARB_base_instance));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.aL, auk_2.b(contextCapabilities.GL_ARB_blend_func_extended));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.dR, auk_2.b(contextCapabilities.GL_ARB_clear_buffer_object));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.b0, auk_2.b(contextCapabilities.GL_ARB_color_buffer_float));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.aR, auk_2.b(contextCapabilities.GL_ARB_compatibility));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.cr, auk_2.b(contextCapabilities.GL_ARB_compressed_texture_pixel_storage));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.e, auk_2.b(contextCapabilities.GL_ARB_compute_shader));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.bD, auk_2.b(contextCapabilities.GL_ARB_copy_buffer));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.di, auk_2.b(contextCapabilities.GL_ARB_copy_image));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.dp, auk_2.b(contextCapabilities.GL_ARB_depth_buffer_float));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.x, auk_2.b(contextCapabilities.GL_ARB_compute_shader));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.af, auk_2.b(contextCapabilities.GL_ARB_copy_buffer));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.cC, auk_2.b(contextCapabilities.GL_ARB_copy_image));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.dT, auk_2.b(contextCapabilities.GL_ARB_depth_buffer_float));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.aV, auk_2.b(contextCapabilities.GL_ARB_depth_clamp));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.c0, auk_2.b(contextCapabilities.GL_ARB_depth_texture));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.bJ, auk_2.b(contextCapabilities.GL_ARB_draw_buffers));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.a3, auk_2.b(contextCapabilities.GL_ARB_draw_buffers_blend));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.q, auk_2.b(contextCapabilities.GL_ARB_draw_elements_base_vertex));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.S, auk_2.b(contextCapabilities.GL_ARB_draw_indirect));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.dn, auk_2.b(contextCapabilities.GL_ARB_draw_instanced));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.br, auk_2.b(contextCapabilities.GL_ARB_explicit_attrib_location));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.df, auk_2.b(contextCapabilities.GL_ARB_explicit_uniform_location));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.dG, auk_2.b(contextCapabilities.GL_ARB_fragment_layer_viewport));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.d3, auk_2.b(contextCapabilities.GL_ARB_fragment_program));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.w, auk_2.b(contextCapabilities.GL_ARB_fragment_shader));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.dw, auk_2.b(contextCapabilities.GL_ARB_fragment_program_shadow));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.dQ, auk_2.b(contextCapabilities.GL_ARB_framebuffer_object));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.bF, auk_2.b(contextCapabilities.GL_ARB_framebuffer_sRGB));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.aK, auk_2.b(contextCapabilities.GL_ARB_geometry_shader4));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.ak, auk_2.b(contextCapabilities.GL_ARB_gpu_shader5));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.aa, auk_2.b(contextCapabilities.GL_ARB_half_float_pixel));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.bb, auk_2.b(contextCapabilities.GL_ARB_half_float_vertex));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.aq, auk_2.b(contextCapabilities.GL_ARB_instanced_arrays));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.bw, auk_2.b(contextCapabilities.GL_ARB_map_buffer_alignment));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.dr, auk_2.b(contextCapabilities.GL_ARB_map_buffer_range));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.ah, auk_2.b(contextCapabilities.GL_ARB_multisample));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.b9, auk_2.b(contextCapabilities.GL_ARB_multitexture));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.az, auk_2.b(contextCapabilities.GL_ARB_occlusion_query2));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.C, auk_2.b(contextCapabilities.GL_ARB_pixel_buffer_object));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.cQ, auk_2.b(contextCapabilities.GL_ARB_seamless_cube_map));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.a7, auk_2.b(contextCapabilities.GL_ARB_shader_objects));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.bE, auk_2.b(contextCapabilities.GL_ARB_shader_stencil_export));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.bx, auk_2.b(contextCapabilities.GL_ARB_shader_texture_lod));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.bS, auk_2.b(contextCapabilities.GL_ARB_shadow));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.dy, auk_2.b(contextCapabilities.GL_ARB_shadow_ambient));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.aS, auk_2.b(contextCapabilities.GL_ARB_stencil_texturing));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.aW, auk_2.b(contextCapabilities.GL_ARB_sync));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.dP, auk_2.b(contextCapabilities.GL_ARB_tessellation_shader));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.cW, auk_2.b(contextCapabilities.GL_ARB_texture_border_clamp));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.ed, auk_2.b(contextCapabilities.GL_ARB_texture_buffer_object));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.cq, auk_2.b(contextCapabilities.GL_ARB_texture_cube_map));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.bf, auk_2.b(contextCapabilities.GL_ARB_texture_cube_map_array));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.aw, auk_2.b(contextCapabilities.GL_ARB_texture_non_power_of_two));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.cz, auk_2.b(contextCapabilities.GL_ARB_uniform_buffer_object));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.cc, auk_2.b(contextCapabilities.GL_ARB_vertex_blend));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.j, auk_2.b(contextCapabilities.GL_ARB_vertex_buffer_object));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.c6, auk_2.b(contextCapabilities.GL_ARB_vertex_program));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.bg, auk_2.b(contextCapabilities.GL_ARB_vertex_shader));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.bI, auk_2.b(contextCapabilities.GL_EXT_bindable_uniform));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.cB, auk_2.b(contextCapabilities.GL_EXT_blend_equation_separate));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.cj, auk_2.b(contextCapabilities.GL_EXT_blend_func_separate));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.l, auk_2.b(contextCapabilities.GL_EXT_blend_minmax));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.bV, auk_2.b(contextCapabilities.GL_EXT_blend_subtract));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.p, auk_2.b(contextCapabilities.GL_EXT_draw_instanced));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.bz, auk_2.b(contextCapabilities.GL_EXT_framebuffer_multisample));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.ch, auk_2.b(contextCapabilities.GL_EXT_framebuffer_object));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.ad, auk_2.b(contextCapabilities.GL_EXT_framebuffer_sRGB));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.b1, auk_2.b(contextCapabilities.GL_EXT_geometry_shader4));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.bv, auk_2.b(contextCapabilities.GL_EXT_gpu_program_parameters));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.dh, auk_2.b(contextCapabilities.GL_EXT_gpu_shader4));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.b3, auk_2.b(contextCapabilities.GL_EXT_multi_draw_arrays));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.cK, auk_2.b(contextCapabilities.GL_EXT_packed_depth_stencil));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.cE, auk_2.b(contextCapabilities.GL_EXT_paletted_texture));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.bL, auk_2.b(contextCapabilities.GL_EXT_rescale_normal));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.ax, auk_2.b(contextCapabilities.GL_EXT_separate_shader_objects));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.dF, auk_2.b(contextCapabilities.GL_EXT_shader_image_load_store));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.a_, auk_2.b(contextCapabilities.GL_EXT_shadow_funcs));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.be, auk_2.b(contextCapabilities.GL_EXT_shared_texture_palette));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.at, auk_2.b(contextCapabilities.GL_EXT_stencil_clear_tag));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.Q, auk_2.b(contextCapabilities.GL_EXT_stencil_two_side));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.bC, auk_2.b(contextCapabilities.GL_EXT_stencil_wrap));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.ck, auk_2.b(contextCapabilities.GL_EXT_texture_3d));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.ec, auk_2.b(contextCapabilities.GL_EXT_texture_array));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.bY, auk_2.b(contextCapabilities.GL_EXT_texture_buffer_object));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.n, auk_2.b(contextCapabilities.GL_EXT_texture_integer));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.dd, auk_2.b(contextCapabilities.GL_EXT_texture_lod_bias));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.dA, auk_2.b(contextCapabilities.GL_EXT_texture_sRGB));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.O, auk_2.b(contextCapabilities.GL_EXT_vertex_shader));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.d5, auk_2.b(contextCapabilities.GL_EXT_vertex_weighting));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.cU, P8.d(GL11.glGetInteger((int)35658)));
        GL11.glGetError();
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.c_, P8.d(GL11.glGetInteger((int)35657)));
        GL11.glGetError();
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.d8, P8.d(GL11.glGetInteger((int)34921)));
        GL11.glGetError();
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.cf, P8.d(GL11.glGetInteger((int)35660)));
        GL11.glGetError();
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.av, P8.d(GL11.glGetInteger((int)34930)));
        GL11.glGetError();
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.b4, P8.d(GL11.glGetInteger((int)35071)));
        GL11.glGetError();
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, StringPool1.cL, P8.d(Minecraft.s()));
    }

    public LanguageManager i() {
        return this.mcLanguageManager;
    }

    public static Minecraft getInstance() {
        return theMinecraft;
    }

    public boolean l() {
        return this.u;
    }

    public RenderManager as() {
        return this.renderManager;
    }

    public PropertyMap S() {
        ayw_0.c(this.field_181038_N);
        GameProfile gameProfile = aSI.b(this.getSessionService(), SessionInvoker.a(this.session), false);
        ayw_0.a(this.field_181038_N, (Multimap)a4Z.c(gameProfile));
        return this.field_181038_N;
    }

    public void a(Entity entity) {
        this.ai = entity;
        EntityRendererInvoker.a(this.entityRenderer, entity);
    }

    public Proxy getProxy() {
        return this.proxy;
    }

    public MinecraftSessionService getSessionService() {
        return this.sessionService;
    }

    public ListenableFuture<Object> addScheduledTask() {
        return this.addScheduledTask(this::refreshResources);
    }

    private ItemStack func_181036_a(Item item, int n, TileEntity tileEntity) {
        ItemStack itemStack = new ItemStack(item, 1, n);
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        NBTInvoker.a(tileEntity, nBTTagCompound);
        if (item == Items.skull && tn_0.b(nBTTagCompound, StringPool1.g)) {
            NBTTagCompound nBTTagCompound2 = tn_0.d(nBTTagCompound, StringPool1.dZ);
            NBTTagCompound nBTTagCompound3 = new NBTTagCompound();
            tn_0.a(nBTTagCompound3, StringPool1.dJ, (NBTBase)nBTTagCompound2);
            act_2.b(itemStack, nBTTagCompound3);
        } else {
            act_2.a(itemStack, StringPool1.am, nBTTagCompound);
            NBTTagCompound nBTTagCompound4 = new NBTTagCompound();
            NBTTagList nBTTagList = new NBTTagList();
            kv_0.a(nBTTagList, new NBTTagString(StringPool1.H));
            tn_0.a(nBTTagCompound4, StringPool1.K, nBTTagList);
            act_2.a(itemStack, StringPool1.cR, nBTTagCompound4);
        }
        return itemStack;
    }

    private String lambda$addGraphicsAndWorldToCrashReport$7() throws Exception {
        return this.gameSettings.aQ ? StringPool1.aT : StringPool1.u;
    }

    public ISaveFormat getSaveLoader() {
        return this.saveLoader;
    }

    public void runTick() throws IOException {
        EventManagerInvoker.call(new TickUpdateEvent());
        if (!NovolineInvoker.b(this.novoline)) {
            aMF.a(aMF.b(ListInvoker.stream(aci_0.a(NovolineInvoker.i(this.novoline))), Minecraft::lambda$runTick$1), this::lambda$runTick$2);
        }
        if (this.rightClickDelayTimer > 0) {
            --this.rightClickDelayTimer;
        }
        ProfilerInvoker.startSection(this.mcProfiler, StringPool1.dD);
        if (!this.isGamePaused) {
            GW.c(this.ingameGUI);
        }
        ProfilerInvoker.endSection(this.mcProfiler);
        EntityRendererInvoker.a(this.entityRenderer, 1.0f);
        ProfilerInvoker.startSection(this.mcProfiler, StringPool1.cP);
        if (!this.isGamePaused && this.world != null) {
            PlayerControllerInvoker.n(this.playerController);
        }
        ProfilerInvoker.a(this.mcProfiler, StringPool1.cu);
        if (!this.isGamePaused) {
            TextureManagerInvoker.b(this.renderEngine);
        }
        if (this.currentScreen == null && this.player != null) {
            if (PlayerInvoker.aa(this.player) <= 0.0f) {
                this.displayGuiScreen(null);
            } else if (PlayerInvoker.C(this.player) && this.world != null) {
                this.displayGuiScreen(new GuiSleepMP());
            }
        } else if (this.currentScreen != null && this.currentScreen instanceof GuiSleepMP && !PlayerInvoker.C(this.player)) {
            this.displayGuiScreen(null);
        }
        if (this.currentScreen != null) {
            this.leftClickCounter = 10000;
        }
        if (this.currentScreen != null) {
            try {
                aLW.a(this.currentScreen);
            }
            catch (Throwable throwable) {
                CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, StringPool1.N);
                CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, StringPool1.ci);
                CrashReportCategoryInvoker.a(crashReportCategory, StringPool1.ag, this::lambda$runTick$3);
                throw new ReportedException(crashReport);
            }
            if (this.currentScreen != null) {
                try {
                    aLW.e(this.currentScreen);
                }
                catch (Throwable throwable) {
                    CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, StringPool1.dL);
                    CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, StringPool1.b6);
                    CrashReportCategoryInvoker.a(crashReportCategory, StringPool1.aZ, this::lambda$runTick$4);
                    throw new ReportedException(crashReport);
                }
            }
        }
        if (this.currentScreen == null || this.currentScreen.allowUserInput) {
            Object object;
            int n;
            ProfilerInvoker.a(this.mcProfiler, StringPool1.dz);
            while (MouseInvoker.j()) {
                long l4;
                n = MouseInvoker.c();
                GameSettingsInvoker.a(n - 100, MouseInvoker.i());
                if (n != -1) {
                    ObjectIterator objectIterator = uw_0.b(aen_2.c(NovolineInvoker.l(this.novoline)).values());
                    while (dz_0.c((Iterator)objectIterator)) {
                        aRt aRt2;
                        object = (ModuleHolder)dz_0.b((Iterator)objectIterator);
                        AbstractModule abstractModule = akk_0.b((ModuleHolder)object);
                        ae6_0 ae6_02 = (ae6_0)aoc_1.a(wc_1.h(abstractModule));
                        if (!(ae6_02 instanceof aRt) || VZ.b(aRt2 = (aRt)ae6_02) != n || !VZ.a(aRt2)) continue;
                        wc_1.k(abstractModule);
                    }
                }
                if (MouseInvoker.i()) {
                    if (PlayerInvoker.B(this.player) && n == 2) {
                        ahp_1.b(GW.b(this.ingameGUI));
                    } else {
                        GameSettingsInvoker.a(n - 100);
                        EventManagerInvoker.call(new aKp(n));
                    }
                }
                if ((l4 = Minecraft.getSystemTime() - this.ap) > 200L) continue;
                int n2 = MouseInvoker.h();
                if (PlayerInvoker.B(this.player)) {
                    n2 = -1;
                    if (ahp_1.a(GW.b(this.ingameGUI))) {
                        ahp_1.b(GW.b(this.ingameGUI), -n2);
                    } else {
                        float f = MathHelper.b(aSY.e(this.player.abilities) + (float)n2 * 0.005f, 0.0f, 0.2f);
                        aSY.b(this.player.abilities, f);
                    }
                } else {
                    InventoryInvoker.d(this.player.inventory, n2);
                }
                if (this.currentScreen != null) {
                    try {
                        aLW.f(this.currentScreen);
                        continue;
                    }
                    catch (Throwable throwable) {
                        throw new ReportedException(CrashInvoker.makeCrashReport(throwable, StringPool1.B));
                    }
                }
                if (this.ay || !MouseInvoker.i()) continue;
                this.av();
            }
            if (this.leftClickCounter > 0) {
                --this.leftClickCounter;
            }
            ProfilerInvoker.a(this.mcProfiler, StringPool1.r);
            while (KeyboardInvoker.d()) {
                n = KeyboardInvoker.b() == 0 ? KeyboardInvoker.getEventCharacter() + 256 : KeyboardInvoker.b();
                GameSettingsInvoker.a(n, KeyboardInvoker.getEventKey());
                if (KeyboardInvoker.getEventKey()) {
                    GameSettingsInvoker.a(n);
                }
                if (this.r > 0L) {
                    if (Minecraft.getSystemTime() - this.r >= 6000L) {
                        throw new ReportedException(new CrashReport(StringPool1.cp, new Throwable()));
                    }
                    if (!KeyboardInvoker.a(46) || !KeyboardInvoker.a(61)) {
                        this.r = -1L;
                    }
                } else if (KeyboardInvoker.a(46) && KeyboardInvoker.a(61)) {
                    this.r = Minecraft.getSystemTime();
                }
                this.dispatchKeypresses();
                if (!KeyboardInvoker.getEventKey()) continue;
                if (n == 62 && this.entityRenderer != null) {
                    EntityRendererInvoker.d(this.entityRenderer);
                }
                if (this.currentScreen != null) {
                    aLW.g(this.currentScreen);
                } else {
                    EventManagerInvoker.call(new KeyPressEvent(n));
                    if (n == 1) {
                        this.B();
                    }
                    Object object2 = uw_0.b(aen_2.c(NovolineInvoker.l(this.novoline)).values());
                    while (dz_0.c((Iterator)object2)) {
                        object = (ModuleHolder)dz_0.b((Iterator)object2);
                        AbstractModule abstractModule = akk_0.b((ModuleHolder)object);
                        int n3 = age_2.a((ae6_0)aoc_1.a(wc_1.h(abstractModule)));
                        if (!(aoc_1.a(wc_1.h(abstractModule)) instanceof auh_2) || n3 != n) continue;
                        wc_1.k(abstractModule);
                    }
                    if (n == 32 && KeyboardInvoker.a(61) && this.ingameGUI != null) {
                        kp_1.c(GW.f(this.ingameGUI));
                    }
                    if (n == 31 && KeyboardInvoker.a(61)) {
                        this.refreshResources();
                    }
                    if (n == 17) {
                        KeyboardInvoker.a(61);
                    }
                    if (n == 18) {
                        KeyboardInvoker.a(61);
                    }
                    if (n == 47) {
                        KeyboardInvoker.a(61);
                    }
                    if (n == 38) {
                        KeyboardInvoker.a(61);
                    }
                    if (n == 22) {
                        KeyboardInvoker.a(61);
                    }
                    if (n == 49 && KeyboardInvoker.a(61)) {
                        object2 = ah__0.a(NovolineInvoker.c(this.novoline));
                        object = object2.toString();
                        String string = null;
                        if (Util.a() == a3t_0.OSX) {
                            string = StringPool1.cV;
                        } else if (Util.a() == a3t_0.WINDOWS) {
                            string = StringPool1.G;
                        } else {
                            LoggerInvoker.info(this.I, StringPool1.aF);
                        }
                        try {
                            als_2.a(als_2.a(), StringInvoker.a(string, new Object[]{object}));
                            return;
                        }
                        catch (IOException iOException) {
                            LoggerInvoker.a(this.I, StringPool1.bM, iOException);
                        }
                    }
                    if (n == 20 && KeyboardInvoker.a(61)) {
                        this.refreshResources();
                    }
                    if (n == 33 && KeyboardInvoker.a(61)) {
                        awu_1.a(this.gameSettings, aj2.RENDER_DISTANCE, aLW.b() ? -1 : 1);
                    }
                    if (n == 30 && KeyboardInvoker.a(61)) {
                        jv_0.m(this.renderGlobal);
                    }
                    if (n == 35 && KeyboardInvoker.a(61)) {
                        this.gameSettings.bm = !this.gameSettings.bm;
                        awu_1.c(this.gameSettings);
                    }
                    if (n == 48 && KeyboardInvoker.a(61)) {
                        FT.c(this.renderManager, !FT.c(this.renderManager));
                    }
                    if (n == 25 && KeyboardInvoker.a(61)) {
                        this.gameSettings.O = !this.gameSettings.O;
                        awu_1.c(this.gameSettings);
                    }
                    if (n == 59) {
                        boolean bl = this.gameSettings.g = !this.gameSettings.g;
                    }
                    if (n == 61) {
                        this.gameSettings.ar = !this.gameSettings.ar;
                        this.gameSettings.aJ = aLW.b();
                        this.gameSettings.S = aLW.a();
                    }
                    if (GameSettingsInvoker.d(this.gameSettings.a_)) {
                        awu_1.a(this.gameSettings, awu_1.f(this.gameSettings) + 1);
                        if (awu_1.f(this.gameSettings) > 2) {
                            awu_1.a(this.gameSettings, 0);
                        }
                        if (awu_1.f(this.gameSettings) == 0) {
                            EntityRendererInvoker.a(this.entityRenderer, this.aw());
                        } else if (awu_1.f(this.gameSettings) == 1) {
                            EntityRendererInvoker.a(this.entityRenderer, null);
                        }
                        jv_0.g(this.renderGlobal);
                    }
                    if (GameSettingsInvoker.d(this.gameSettings.m)) {
                        boolean bl = this.gameSettings.X = !this.gameSettings.X;
                    }
                }
                if (!this.gameSettings.ar || !this.gameSettings.aJ) continue;
                if (n == 11) {
                    this.a(0);
                }
                int n4 = 0;
                while (true) {
                    if (n == 2 + n4) {
                        this.a(n4 + 1);
                    }
                    ++n4;
                }
            }
            n = 0;
            while (true) {
                if (GameSettingsInvoker.d(this.gameSettings.E[n])) {
                    if (PlayerInvoker.B(this.player)) {
                        ahp_1.a(GW.b(this.ingameGUI), n);
                    } else {
                        this.player.inventory.a = n;
                    }
                }
                ++n;
            }
        }
        if (this.world != null) {
            if (this.player != null) {
                ++this.ae;
                if (this.ae == 30) {
                    this.ae = 0;
                    BlockInvoker.d(this.world, this.player);
                }
            }
            ProfilerInvoker.a(this.mcProfiler, StringPool1.bX);
            if (!this.isGamePaused) {
                EntityRendererInvoker.c(this.entityRenderer);
            }
            ProfilerInvoker.a(this.mcProfiler, StringPool1.U);
            if (!this.isGamePaused) {
                jv_0.b(this.renderGlobal);
            }
            ProfilerInvoker.a(this.mcProfiler, StringPool1.cI);
            if (!this.isGamePaused) {
                if (BlockInvoker.r(this.world) > 0) {
                    BlockInvoker.a(this.world, BlockInvoker.r(this.world) - 1);
                }
                BlockInvoker.b(this.world);
            }
        } else if (EntityRendererInvoker.f(this.entityRenderer)) {
            EntityRendererInvoker.h(this.entityRenderer);
        }
        if (!this.isGamePaused) {
            aP9.b(this.mcMusicTicker);
            SoundHandlerInvoker.a(this.mcSoundHandler);
        }
        if (this.world != null) {
            if (!this.isGamePaused) {
                BlockInvoker.a(this.world, BlockInvoker.d(this.world) != EnumDifficulty.PEACEFUL, true);
                try {
                    BlockInvoker.j(this.world);
                }
                catch (Throwable throwable) {
                    CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, StringPool1.c1);
                    if (this.world == null) {
                        CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, StringPool1.dB);
                        CrashReportCategoryInvoker.addCrashSection(crashReportCategory, StringPool1.d4, StringPool1.c4);
                    } else {
                        BlockInvoker.a(this.world, crashReport);
                    }
                    throw new ReportedException(crashReport);
                }
            }
            ProfilerInvoker.a(this.mcProfiler, StringPool1.c3);
            if (!this.isGamePaused && this.world != null) {
                BlockInvoker.b(this.world, MathHelper.floor_double(this.player.posX), MathHelper.floor_double(this.player.posY), MathHelper.floor_double(this.player.posZ));
            }
            ProfilerInvoker.a(this.mcProfiler, StringPool1.b5);
            if (!this.isGamePaused) {
                ayx_2.a(this.effectRenderer);
            }
        } else if (this.myNetworkManager != null) {
            ProfilerInvoker.a(this.mcProfiler, StringPool1.y);
            NetworkManagerInvoker.h(this.myNetworkManager);
        }
        ProfilerInvoker.endSection(this.mcProfiler);
        this.ap = Minecraft.getSystemTime();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void D() {
        block15: {
            Object object;
            block14: {
                block16: {
                    block17: {
                        Scaffold scaffold = (Scaffold)ModuleInvoker.isEnable(ModuleRegistry.SCAFFOLD);
                        if (ma_1.c(scaffold)) {
                            return;
                        }
                        if (PlayerControllerInvoker.m(this.playerController)) break block15;
                        FastPlace fastPlace = (FastPlace)ModuleInvoker.isEnable(ModuleRegistry.FASTPLACE);
                        if (!nc_0.a(fastPlace)) break block16;
                        if (this.world == null) break block17;
                        if (auk_2.a((Boolean)Ba.b(fastPlace.H))) {
                            try {
                                if (act_2.k(PlayerInvoker.h(this.player)) != null) {
                                    this.rightClickDelayTimer = act_2.k(PlayerInvoker.h(this.player)) instanceof ItemBlock ? P8.b((Integer)adt_2.a(fastPlace.I)) : 4;
                                    break block14;
                                }
                                this.rightClickDelayTimer = 4;
                            }
                            catch (NullPointerException nullPointerException) {
                                this.rightClickDelayTimer = 4;
                            }
                            break block14;
                        } else {
                            this.rightClickDelayTimer = P8.b((Integer)adt_2.a(fastPlace.I));
                        }
                        break block14;
                    }
                    this.rightClickDelayTimer = 4;
                    break block14;
                }
                this.rightClickDelayTimer = 4;
            }
            ItemStack itemStack = InventoryInvoker.g(this.player.inventory);
            if (this.objectMouseOver == null) {
                LoggerInvoker.warn(this.getLogger(), StringPool1.d1);
            } else {
                switch (this.objectMouseOver.typeOfHit) {
                    case ENTITY: {
                        if (PlayerControllerInvoker.a(this.playerController, (EntityPlayer)this.player, this.objectMouseOver.entityHit, this.objectMouseOver) || !PlayerControllerInvoker.b(this.playerController, this.player, this.objectMouseOver.entityHit)) break;
                        break;
                    }
                    case BLOCK: {
                        object = ObjectMouseOverInvoker.getBlockPos(this.objectMouseOver);
                        if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.world, (BlockPos)object))) == Material.air) break;
                        int cfr_ignored_0 = itemStack.a;
                        if (PlayerControllerInvoker.a(this.playerController, this.player, this.world, itemStack, (BlockPos)object, this.objectMouseOver.facing, this.objectMouseOver.b)) {
                            PlayerInvoker.V(this.player);
                        }
                        return;
                    }
                }
            }
            object = InventoryInvoker.g(this.player.inventory);
            if (PlayerControllerInvoker.a(this.playerController, (EntityPlayer)this.player, this.world, (ItemStack)object)) {
                aq__0.a(this.entityRenderer.n);
            }
        }
    }

    public boolean at() {
        return this.integratedServerIsRunning && this.theIntegratedServer != null;
    }

    public static void f() {
        if (theMinecraft != null) {
            IntegratedServer integratedServer = theMinecraft.ar();
            IntegratedServerInvoker.e(integratedServer);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public <V> ListenableFuture<V> a(Callable<V> callable) {
        ag4_0.a(callable);
        if (!this.b()) {
            ListenableFutureTask listenableFutureTask = axk_1.a(callable);
            Queue<java.util.concurrent.FutureTask<?>> queue = this.scheduledTasks;
            synchronized (queue) {
                FutureTaskInvoker.a(this.scheduledTasks, listenableFutureTask);
                return listenableFutureTask;
            }
        }
        try {
            return aqo_2.a(a21.a(callable));
        }
        catch (Exception exception) {
            return aqo_2.a(exception);
        }
    }

    public boolean aD() {
        return this.fullscreen;
    }

    public MusicTicker ab() {
        return this.mcMusicTicker;
    }

    public void a(ServerData serverData) {
        this.x = serverData;
    }

    @Override
    public ListenableFuture<Object> addScheduledTask(Runnable runnable) {
        ag4_0.a(runnable);
        return this.a(awd_0.a(runnable));
    }

    /*
     * Unable to fully structure code
     */
    public void toggleFullscreen() {
        block7: {
            block8: {
                this.gameSettings.bB = this.fullscreen = this.fullscreen == false;
                if (!this.fullscreen) break block8;
                this.aq();
                this.displayWidth = aSN.c(DisplayInvoker.e());
                this.displayHeight = aSN.b(DisplayInvoker.e());
                ** GOTO lbl13
            }
            DisplayInvoker.a(new DisplayMode(this.tempDisplayWidth, this.tempDisplayHeight));
            this.displayWidth = this.tempDisplayWidth;
            this.displayHeight = this.tempDisplayHeight;
lbl13:
            // 2 sources

            if (this.displayWidth <= 0) {
                this.displayWidth = 1;
            }
            if (this.displayHeight <= 0) {
                this.displayHeight = 1;
            }
            if (this.currentScreen == null) break block7;
            this.resize(this.displayWidth, this.displayHeight);
            ** GOTO lbl24
        }
        try {
            this.J();
lbl24:
            // 2 sources

            DisplayInvoker.b(this.fullscreen);
            DisplayInvoker.setVSyncEnabled(this.gameSettings.x);
            this.updateDisplay();
        }
        catch (LWJGLException var1_1) {
            aQI.a(var1_1);
        }
    }

    private void startGame() throws LWJGLException {
        this.gameSettings = new GameSettings(this, this.mcDataDir);
        ListInvoker.add(this.defaultResourcePacks, this.mcDefaultResourcePack);
        this.startTimerHackThread();
        if (this.gameSettings.overrideHeight > 0 && this.gameSettings.b > 0) {
            this.displayWidth = this.gameSettings.b;
            this.displayHeight = this.gameSettings.overrideHeight;
        }
        LoggerInvoker.info(this.getLogger(), aL0.a(aL0.a(new StringBuilder(), StringPool1.ea), Sys.getVersion()).toString());
        this.setWindowIcon();
        this.setInitialDisplayMode();
        this.createDisplay();
        OpenGlHelper.initializeTextures();
        this.framebufferMc = new Framebuffer(this.displayWidth, this.displayHeight, true);
        FramebufferInvoker.setFramebufferColor(this.framebufferMc, 0.0f, 0.0f, 0.0f, 0.0f);
        this.registerMetadataSerializers();
        this.mcResourcePackRepository = new ResourcePackRepository(this.fileResourcepacks, new File(this.mcDataDir, StringPool1.a6), this.mcDefaultResourcePack, this.metadataSerializer_, this.gameSettings);
        this.mcResourceManager = new SimpleReloadableResourceManager(this.metadataSerializer_);
        this.mcLanguageManager = new LanguageManager(this.metadataSerializer_, this.gameSettings.gameSettings);
        ResourceManagerInvoker.registerReloadListener(this.mcResourceManager, this.mcLanguageManager);
        this.refreshResources();
        this.renderEngine = new TextureManager(this.mcResourceManager);
        ResourceManagerInvoker.registerReloadListener(this.mcResourceManager, this.renderEngine);
        this.drawSplashScreen(this.renderEngine);
        this.initStream();
        this.skinManager = new SkinManager(this.renderEngine, new File(this.fileAssets, StringPool1.aI), this.sessionService);
        this.saveLoader = new AnvilSaveConverter(new File(this.mcDataDir, StringPool1.Z));
        this.mcSoundHandler = new SoundHandler(this.mcResourceManager, this.gameSettings);
        ResourceManagerInvoker.registerReloadListener(this.mcResourceManager, this.mcSoundHandler);
        this.mcMusicTicker = new MusicTicker(this);
        this.fontRendererObj = new FontRenderer(this.gameSettings, new ResourceLocation(StringPool1.an), this.renderEngine, false);
        this.fontRendererCrack = new FontRenderer(this.gameSettings, new ResourceLocation(StringPool1.bH), this.renderEngine, false);
        if (this.gameSettings.gameSettings != null) {
            FontRendererInvoker.setUnicodeFlag(this.fontRendererObj, this.isUnicode());
            FontRendererInvoker.setBidiFlag(this.fontRendererObj, ad2_0.isCurrentLanguageBidirectional(this.mcLanguageManager));
            FontRendererInvoker.setUnicodeFlag(this.fontRendererCrack, this.isUnicode());
            FontRendererInvoker.setBidiFlag(this.fontRendererCrack, ad2_0.isCurrentLanguageBidirectional(this.mcLanguageManager));
        }
        this.standardGalacticFontRenderer = new FontRenderer(this.gameSettings, new ResourceLocation(StringPool1.dI), this.renderEngine, false);
        ResourceManagerInvoker.registerReloadListener(this.mcResourceManager, this.fontRendererObj);
        ResourceManagerInvoker.registerReloadListener(this.mcResourceManager, this.fontRendererCrack);
        ResourceManagerInvoker.registerReloadListener(this.mcResourceManager, this.standardGalacticFontRenderer);
        ResourceManagerInvoker.registerReloadListener(this.mcResourceManager, new GrassColorReloadListener());
        ResourceManagerInvoker.registerReloadListener(this.mcResourceManager, new FoliageColorReloadListener());
        K6.a(apf_0.m, this::lambda$startGame$0);
        this.mouseHelper = new MouseHelper();
        this.checkGLError(StringPool1.aD);
        GlStateManagerInvoker.enableTexture2D();
        GlStateManagerInvoker.shadeModel(7425);
        GlStateManagerInvoker.clearDepth(1.0);
        GlStateManagerInvoker.enableDepth();
        GlStateManagerInvoker.depthFunc(515);
        GlStateManagerInvoker.enableAlpha();
        GlStateManagerInvoker.alphaFunc(516, 0.1f);
        GlStateManagerInvoker.cullFace(1029);
        GlStateManagerInvoker.matrixMode(5889);
        GlStateManagerInvoker.loadIdentity();
        GlStateManagerInvoker.matrixMode(5888);
        this.checkGLError(StringPool1.bK);
        this.textureMapBlocks = new TextureMap(StringPool1.dC);
        h9.a(this.textureMapBlocks, this.gameSettings.F);
        TextureManagerInvoker.a(this.renderEngine, TextureMap.r, this.textureMapBlocks);
        TextureManagerInvoker.bindTexture(this.renderEngine, TextureMap.r);
        h9.a(this.textureMapBlocks, false, this.gameSettings.F > 0);
        this.modelManager = new ModelManager(this.textureMapBlocks);
        ResourceManagerInvoker.registerReloadListener(this.mcResourceManager, this.modelManager);
        this.renderItem = new RenderItem(this.renderEngine, this.modelManager);
        this.renderManager = new RenderManager(this.renderEngine, this.renderItem);
        this.itemRenderer = new ItemRenderer(this);
        ResourceManagerInvoker.registerReloadListener(this.mcResourceManager, this.renderItem);
        this.entityRenderer = new EntityRenderer(this, this.mcResourceManager);
        ResourceManagerInvoker.registerReloadListener(this.mcResourceManager, this.entityRenderer);
        this.blockRenderDispatcher = new BlockRendererDispatcher(ModelManagerInvoker.getBlockModelShapes(this.modelManager), this.gameSettings);
        ResourceManagerInvoker.registerReloadListener(this.mcResourceManager, this.blockRenderDispatcher);
        this.renderGlobal = new RenderGlobal(this);
        ResourceManagerInvoker.registerReloadListener(this.mcResourceManager, this.renderGlobal);
        this.guiAchievement = new GuiAchievement(this);
        GlStateManagerInvoker.viewport(0, 0, this.displayWidth, this.displayHeight);
        this.effectRenderer = new EffectRenderer(this.world, this.renderEngine);
        this.checkGLError(StringPool1.aG);
        this.ingameGUI = new GuiIngame(this);
        this.novoline = NovolineInvoker.getInstance();
        NovolineInvoker.onStart(this.novoline);
        if (this.serverName != null) {
            this.displayGuiScreen(new GuiConnecting(new GuiMainMenu(), this, this.serverName, this.q));
        } else {
            GuiMainMenu guiMainMenu = new GuiMainMenu();
            GuiLogin guiLogin = new GuiLogin(this);
            NovolineInvoker.a(this.novoline, guiLogin);
            this.displayGuiScreen(guiMainMenu);
            aQE.a(guiMainMenu, 0, 0, 0.0f);
            this.displayGuiScreen(guiLogin);
        }
        TextureManagerInvoker.a(this.renderEngine, this.mojangLogo);
        this.mojangLogo = null;
        this.loadingScreen = new LoadingScreenRenderer(this);
        if (this.gameSettings.bB && !this.fullscreen) {
            this.toggleFullscreen();
        }
        try {
            DisplayInvoker.setVSyncEnabled(this.gameSettings.x);
        }
        catch (OpenGLException openGLException) {
            this.gameSettings.x = false;
            awu_1.c(this.gameSettings);
        }
        jv_0.d(this.renderGlobal);
        NovolineInvoker.onLoaded(this.novoline);
    }

    public int aa() {
        return MathInvoker.max(1, debugFPS);
    }

    public aI_ p() {
        return this.mcResourceManager;
    }

    public ItemRenderer O() {
        return this.itemRenderer;
    }

    public Entity aw() {
        return this.ai;
    }

    public FrameTimer g() {
        return this.field_181542_y;
    }
}


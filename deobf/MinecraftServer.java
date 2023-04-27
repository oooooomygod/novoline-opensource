/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.google.common.util.concurrent.ListenableFutureTask
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.GameProfileRepository
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufOutputStream
 *  org.apache.logging.log4j.Logger
 */
package deobf;

import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.EntityPlayerInvoker;
import cc.novoline.invoke.FutureTaskInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.ProfilerInvoker;
import cc.novoline.invoke.SaveHandlerInvoker;
import cc.novoline.invoke.SaveLoaderInvoker;
import cc.novoline.invoke.SnooperInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import cc.novoline.invoke.ThreadInvoker;
import com.google.common.base.Charsets;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import net.minecraft.profiler.Profiler;
import net.minecraft.server.management.ServerConfigurationManager;
import net.minecraft.util.ReportedException;
import net.minecraft.world.GameType;
import net.minecraft.world.WorldSettings;
import net.minecraft.network.packts.S03PacketTimeUpdate;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufOutputStream;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Proxy;
import java.security.KeyPair;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import net.AnvilSaveConverter;
import net.minecraft.block.BlockPos;
import net.ChatComponentText;
import net.CrashReport;
import net.FH;
import net.HK;
import net.ICommandSender;
import net.ISaveFormat;
import net.IThreadListener;
import net.J9;
import net.JP;
import net.MathHelper;
import net.OE;
import net.P8;
import net.PlayerUsageSnooper;
import net.Util;
import net.World;
import net.WorldInfo;
import net.WorldServer;
import net.WorldType;
import net.ZJ;
import net.a21;
import net.a3V;
import net.a7Y;
import net.a7r_0;
import net.a8K;
import net.a9N;
import net.a9y_0;
import net.aBO;
import net.aEW;
import net.aI8;
import net.aL0;
import net.aMQ;
import net.aQ7;
import net.aV8;
import net.aX_;
import net.aZ2;
import net.add_1;
import net.aek_1;
import net.ag4_0;
import net.akh_0;
import net.amv_2;
import net.apx_0;
import net.aqY;
import net.aqo_2;
import net.ard_0;
import net.asg_0;
import net.auk_2;
import net.avd_0;
import net.aw4_0;
import net.awc_1;
import net.awd_0;
import net.awm_0;
import net.axk_1;
import net.ays_0;
import net.cd_1;
import net.dz_0;
import net.fk_0;
import net.jj_0;
import net.lx_2;
import net.my_0;
import net.qq_2;
import net.rh_0;
import net.sf_0;
import net.sz_0;
import net.t6_0;
import net.uv_2;
import net.w7_0;
import net.yh_1;
import net.zq_2;
import org.apache.logging.log4j.Logger;


public abstract class MinecraftServer
implements Runnable,
ICommandSender,
IThreadListener,
IPlayerUsage {
    private boolean W;
    protected Queue<FutureTask<?>> t;
    private int p;
    public Profiler m;
    private String K;
    private PlayerProfileCache profileCache;
    private boolean E;
    private Thread U;
    private boolean C;
    private boolean D;
    private String q;
    private boolean w;
    private MinecraftSessionService sessionService;
    private long I;
    private boolean P;
    private GameProfileRepository profileRepo;
    private boolean g;
    private long a;
    private ServerStatusResponse v;
    public long[] J;
    private String y;
    protected Proxy x;
    private String A;
    private boolean s;
    private static MinecraftServer j;
    private List<ITickable> f;
    private boolean k;
    private boolean Y;
    public static File M;
    private static Logger b;
    private YggdrasilAuthenticationService authService;
    private NetworkSystem networkSystem;
    private int X;
    private int z;
    public int i;
    private boolean c;
    private String n;
    private Random R;
    private int V = -1;
    public String e;
    private String Q;
    public long[][] B;
    private PlayerUsageSnooper o;
    private String l;
    private boolean S;
    protected ICommandManager commandManager;
    private File anvilFile;
    private boolean L;
    private ServerConfigurationManager aa;
    public WorldServer[] r;
    private ISaveFormat anvilConverterForAnvilFile;
    private long O;
    private KeyPair u;

    public int ar() {
        return this.aa.o();
    }

    protected void a(String string, ISaveHandler iSaveHandler) {
        File file = new File(SaveHandlerInvoker.c(iSaveHandler), aX_.aK);
        if (zq_2.d(file)) {
            this.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aX_.aU), string), aX_.ax), file.getName()).toString(), aX_.aC);
        }
    }

    public String V() {
        return this.l;
    }

    public abstract int O();

    public boolean at() {
        return this.s;
    }

    @Override
    public ListenableFuture<Object> addScheduledTask(Runnable runnable) {
        ag4_0.a(runnable);
        return this.a(awd_0.a(runnable));
    }

    public void p() {
        this.C = false;
    }

    public boolean J() {
        return this.Y;
    }

    public NetworkSystem al() {
        return this.networkSystem;
    }

    public KeyPair ag() {
        return this.u;
    }

    public void aq() {
        this.c = true;
    }

    public boolean H() {
        return this.y != null;
    }

    protected void G() {
        this.e = null;
        this.i = 0;
    }

    public void a(String string, String string2) {
        this.K = string;
        this.n = string2;
    }

    public boolean w() {
        return this.w;
    }

    public int Q() {
        return this.X;
    }

    protected void a(String string) {
        if (SaveLoaderInvoker.b(this.I(), string)) {
            LoggerInvoker.info(b, aX_.R);
            this.g(aX_.q);
            SaveLoaderInvoker.a(this.I(), string, new aw4_0(this));
        }
    }

    public void b(String string) {
        this.Q = string;
    }

    public void a(boolean bl) {
        this.L = bl;
    }

    static ServerConfigurationManager a(MinecraftServer minecraftServer) {
        return minecraftServer.aa;
    }

    public void c(String string) {
        LoggerInvoker.warn(b, string);
    }

    public synchronized String b() {
        return this.A;
    }

    @Override
    public Entity a() {
        return null;
    }

    public List<String> a(ICommandSender iCommandSender, String string, BlockPos blockPos) {
        ArrayList arrayList = my_0.c();
        if (StringInvoker.e(string, aX_.aO)) {
            this.a(iCommandSender, string, blockPos, arrayList, this.commandManager, aX_.z);
        } else if (StringInvoker.e(string, aX_.Q)) {
            this.a(iCommandSender, string, blockPos, arrayList, NovolineInvoker.s(NovolineInvoker.getInstance()), aX_.as);
        } else {
            String[] stringArray = StringInvoker.a(string, aX_.D, -1);
            String string2 = stringArray[stringArray.length - 1];
            for (String string3 : this.aa.r()) {
                if (!ays_0.a(string2, string3)) continue;
                ListInvoker.add(arrayList, string3);
            }
        }
        return arrayList;
    }

    public abstract String a(GameType var1, boolean var2);

    public MinecraftSessionService ac() {
        return this.sessionService;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public <V> ListenableFuture<V> a(Callable<V> callable) {
        ag4_0.a(callable);
        if (!this.b() && !this.at()) {
            ListenableFutureTask listenableFutureTask = axk_1.a(callable);
            Queue<FutureTask<?>> queue = this.t;
            synchronized (queue) {
                FutureTaskInvoker.a(this.t, listenableFutureTask);
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

    public ISaveFormat I() {
        return this.anvilConverterForAnvilFile;
    }

    @Override
    public void a(PlayerUsageSnooper playerUsageSnooper) {
        SnooperInvoker.a(playerUsageSnooper, aX_.M, Boolean.FALSE);
        SnooperInvoker.a(playerUsageSnooper, aX_.J, P8.d(0));
        if (this.aa != null) {
            SnooperInvoker.a(playerUsageSnooper, aX_.aE, P8.d(this.ar()));
            SnooperInvoker.a(playerUsageSnooper, aX_.Z, P8.d(this.as()));
            SnooperInvoker.a(playerUsageSnooper, aX_.ai, P8.d(aek_1.d(this.aa).length));
        }
        SnooperInvoker.a(playerUsageSnooper, aX_.x, auk_2.b(this.P));
        SnooperInvoker.a(playerUsageSnooper, aX_.aa, this.A() ? aX_.G : aX_.b);
        SnooperInvoker.a(playerUsageSnooper, aX_.B, lx_2.b((MinecraftServer.ae() - SnooperInvoker.g(playerUsageSnooper)) / 60L * 1000L));
        SnooperInvoker.a(playerUsageSnooper, aX_.I, P8.d((int)(MathHelper.a(this.J) * 1.0E-6)));
        int n = 0;
        if (this.r != null) {
            WorldServer[] worldServerArray = this.r;
            int n2 = worldServerArray.length;
            for (int i = 0; i < n2; ++i) {
                WorldServer worldServer;
                WorldServer worldServer2 = worldServer = worldServerArray[i];
                WorldInfo worldInfo = a3V.d(worldServer2);
                SnooperInvoker.a(playerUsageSnooper, aL0.a(aL0.c(aL0.a(new StringBuilder(), aX_.j), n), aX_.ae).toString(), P8.d(qq_2.j(worldServer2.d)));
                SnooperInvoker.a(playerUsageSnooper, aL0.a(aL0.c(aL0.a(new StringBuilder(), aX_.aQ), n), aX_.aA).toString(), (Object)worldInfo.s());
                SnooperInvoker.a(playerUsageSnooper, aL0.a(aL0.c(aL0.a(new StringBuilder(), aX_.s), n), aX_.t).toString(), (Object)worldServer2.H());
                SnooperInvoker.a(playerUsageSnooper, aL0.a(aL0.c(aL0.a(new StringBuilder(), aX_.ay), n), aX_.u).toString(), auk_2.b(uv_2.t(worldInfo)));
                SnooperInvoker.a(playerUsageSnooper, aL0.a(aL0.c(aL0.a(new StringBuilder(), aX_.a1), n), aX_.k).toString(), fk_0.f(uv_2.r(worldInfo)));
                SnooperInvoker.a(playerUsageSnooper, aL0.a(aL0.c(aL0.a(new StringBuilder(), aX_.v), n), aX_.E).toString(), P8.d(fk_0.g(uv_2.r(worldInfo))));
                SnooperInvoker.a(playerUsageSnooper, aL0.a(aL0.c(aL0.a(new StringBuilder(), aX_.aS), n), aX_.c).toString(), P8.d(this.p));
                SnooperInvoker.a(playerUsageSnooper, aL0.a(aL0.c(aL0.a(new StringBuilder(), aX_.ah), n), aX_.n).toString(), P8.d(sf_0.d(a3V.g(worldServer2))));
                ++n;
            }
        }
        SnooperInvoker.a(playerUsageSnooper, aX_.P, P8.d(n));
    }

    @Override
    public boolean b() {
        return ThreadInvoker.a() == this.U;
    }

    public Entity a(UUID uUID) {
        int n = 0;
        WorldServer[] worldServerArray = this.r;
        int n2 = worldServerArray.length;
        if (n < n2) {
            WorldServer worldServer = worldServerArray[n];
            Entity entity = worldServer.a(uUID);
            return entity;
        }
        return null;
    }

    protected void h(boolean bl) {
        if (!this.W) {
            for (WorldServer worldServer : this.r) {
                LoggerInvoker.info(b, aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aX_.ag), a3V.d(worldServer).l()), aX_.l), qq_2.f(worldServer.d)).toString());
                try {
                    a3V.a(worldServer, true, null);
                }
                catch (cd_1 cd_12) {
                    LoggerInvoker.warn(b, cd_12.getMessage());
                }
            }
        }
    }

    public static long ae() {
        return SystemInvoker.f();
    }

    public WorldServer c(int n) {
        return n == -1 ? this.r[1] : (n == 1 ? this.r[2] : this.r[0]);
    }

    public boolean ak() {
        return this.L;
    }

    public MinecraftServer(File file, Proxy proxy, File file2) {
        this.o = new PlayerUsageSnooper(aX_.h, this, MinecraftServer.ae());
        this.f = my_0.c();
        this.m = new Profiler();
        this.v = new ServerStatusResponse();
        this.R = new Random();
        this.V = -1;
        this.C = true;
        this.z = 0;
        this.J = new long[100];
        this.K = aX_.aG;
        this.n = aX_.U;
        this.I = 0L;
        this.t = ard_0.a();
        this.O = MinecraftServer.ae();
        this.x = proxy;
        j = this;
        this.anvilFile = file;
        this.networkSystem = new NetworkSystem(this);
        this.profileCache = new PlayerProfileCache(this, file2);
        this.commandManager = this.createNewCommandManager();
        this.anvilConverterForAnvilFile = new AnvilSaveConverter(file);
        this.authService = new YggdrasilAuthenticationService(proxy, awc_1.a().toString());
        this.sessionService = akh_0.a(this.authService);
        this.profileRepo = akh_0.b(this.authService);
    }

    public String h() {
        return this.K;
    }

    public boolean R() {
        return this.P;
    }

    public PlayerUsageSnooper r() {
        return this.o;
    }

    public void setFolderName(String string) {
        this.l = string;
    }

    public void a(int n) {
        this.p = n;
    }

    public boolean ao() {
        return this.E;
    }

    public abstract boolean t();

    public int as() {
        return this.aa.a();
    }

    public boolean N() {
        return true;
    }

    public boolean av() {
        return true;
    }

    public void a(KeyPair keyPair) {
        this.u = keyPair;
    }

    public void g(boolean bl) {
        this.D = bl;
    }

    public abstract boolean L();

    public ICommandManager c() {
        return this.commandManager;
    }

    public void F() {
        this.I = 0L;
    }

    protected void P() {
    }

    public void B() {
        this.U = new Thread((Runnable)this, aX_.av);
        ThreadInvoker.e(this.U);
    }

    public void a(ServerConfigurationManager serverConfigurationManager) {
        this.aa = serverConfigurationManager;
    }

    public abstract EnumDifficulty ai();

    static Logger v() {
        return b;
    }

    protected void b(CrashReport crashReport) {
    }

    public void a(EnumDifficulty enumDifficulty) {
        for (WorldServer worldServer : this.r) {
            if (uv_2.t(aV8.s(worldServer))) {
                uv_2.a(aV8.s(worldServer), EnumDifficulty.HARD);
                aV8.a((World)worldServer, true, true);
                continue;
            }
            if (this.H()) {
                uv_2.a(aV8.s(worldServer), enumDifficulty);
                aV8.a((World)worldServer, worldServer.H() != EnumDifficulty.PEACEFUL, true);
                continue;
            }
            uv_2.a(aV8.s(worldServer), enumDifficulty);
            aV8.a((World)worldServer, this.i(), this.E);
        }
    }

    public void x() {
        this.W = true;
        SaveLoaderInvoker.a(this.I());
        for (WorldServer worldServer : this.r) {
            a3V.v(worldServer);
        }
        SaveLoaderInvoker.d(this.I(), SaveHandlerInvoker.a(a3V.h(this.r[0])));
        this.p();
    }

    public String U() {
        return this.n;
    }

    public int ab() {
        return this.z;
    }

    public abstract boolean o();

    protected boolean i() {
        return true;
    }

    public boolean a(World world, BlockPos blockPos, EntityPlayer entityPlayer) {
        return false;
    }

    public int l() {
        return 256;
    }

    private void a(ServerStatusResponse serverStatusResponse) {
        File file = this.h(aX_.aM);
        if (zq_2.d(file)) {
            ByteBuf byteBuf = FH.d();
            try {
                BufferedImage bufferedImage = aI8.a(file);
                ag4_0.b(jj_0.f(bufferedImage) == 64, aX_.aY, new Object[0]);
                boolean bl = jj_0.d(bufferedImage) == 64;
                try {
                    ag4_0.b(bl, aX_.aR, new Object[0]);
                    aI8.a((RenderedImage)bufferedImage, aX_.aZ, (OutputStream)new ByteBufOutputStream(byteBuf));
                    ByteBuf byteBuf2 = aQ7.b(byteBuf);
                    a8K.a(serverStatusResponse, aL0.a(aL0.a(new StringBuilder(), aX_.e), awm_0.a(byteBuf2, Charsets.UTF_8)).toString());
                }
                catch (Exception exception) {
                    LoggerInvoker.a(b, aX_.aT, exception);
                }
            }
            finally {
                awm_0.k(byteBuf);
            }
        }
    }

    protected void a(String string, String string2, long l4, WorldType worldType, String string3) {
        WorldSettings worldSettings;
        this.a(string);
        this.g(aX_.aw);
        this.r = new WorldServer[3];
        this.B = new long[this.r.length][100];
        ISaveHandler iSaveHandler = SaveLoaderInvoker.getSaveLoader(this.anvilConverterForAnvilFile, string, true);
        this.a(this.V(), iSaveHandler);
        WorldInfo worldInfo = SaveHandlerInvoker.b(iSaveHandler);
        if (this.am()) {
            worldSettings = ZJ.ah;
        } else {
            worldSettings = new WorldSettings(l4, this.g(), this.Y(), this.t(), worldType);
            add_1.a(worldSettings, string3);
            if (this.k) {
                add_1.f(worldSettings);
            }
        }
        worldInfo = new WorldInfo(worldSettings, string2);
        for (int i = 0; i < this.r.length; ++i) {
            int n = 0;
            this.r[i] = this.am() ? (WorldServer)avd_0.a(new ZJ(this, iSaveHandler, worldInfo, n, this.m)) : (WorldServer)a3V.o(new WorldServer(this, iSaveHandler, worldInfo, n, this.m));
            a3V.a(this.r[i], worldSettings);
            a3V.a(this.r[i], new HK(this, this.r[i]));
            if (this.H()) continue;
            a3V.d(this.r[i]).a(this.g());
        }
        aek_1.a(this.aa, this.r);
        this.a(this.ai());
        this.aa();
    }

    @Override
    public void addServerTypeToSnooper(PlayerUsageSnooper playerUsageSnooper) {
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, aX_.m, auk_2.b(this.H()));
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, aX_.au, this.e());
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, aX_.am, sz_0.a() ? aX_.aP : aX_.N);
        SnooperInvoker.addStatToSnooper(playerUsageSnooper, aX_.L, auk_2.b(this.af()));
    }

    @Override
    public boolean a(int n, String string) {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a() {
        ProfilerInvoker.startSection(this.m, aX_.ar);
        Queue<FutureTask<?>> queue = this.t;
        synchronized (queue) {
            while (!FutureTaskInvoker.c(this.t)) {
                Util.a((FutureTask)FutureTaskInvoker.d(this.t), b);
            }
        }
        ProfilerInvoker.a(this.m, aX_.V);
        for (int i = 0; i < this.r.length; ++i) {
            long l4 = SystemInvoker.nanoTime();
            if (this.av()) {
                WorldServer worldServer = this.r[i];
                ProfilerInvoker.startSection(this.m, a3V.d(worldServer).l());
                if (this.X % 20 == 0) {
                    ProfilerInvoker.startSection(this.m, aX_.F);
                    aek_1.a(this.aa, new S03PacketTimeUpdate(a3V.k(worldServer), a3V.y(worldServer), J9.c(a3V.z(worldServer), aX_.az)), qq_2.j(worldServer.d));
                    ProfilerInvoker.endSection(this.m);
                }
                ProfilerInvoker.startSection(this.m, aX_.aj);
                try {
                    worldServer.i();
                }
                catch (Throwable throwable) {
                    CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, aX_.H);
                    a3V.a(worldServer, crashReport);
                    throw new ReportedException(crashReport);
                }
                try {
                    a3V.s(worldServer);
                }
                catch (Throwable throwable) {
                    CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, aX_.w);
                    a3V.a(worldServer, crashReport);
                    throw new ReportedException(crashReport);
                }
                ProfilerInvoker.endSection(this.m);
                ProfilerInvoker.startSection(this.m, aX_.at);
                a7Y.a(a3V.a(worldServer));
                ProfilerInvoker.endSection(this.m);
                ProfilerInvoker.endSection(this.m);
            }
            this.B[i][this.X % 100] = SystemInvoker.nanoTime() - l4;
        }
        ProfilerInvoker.a(this.m, aX_.O);
        JP.a(this.al());
        ProfilerInvoker.a(this.m, aX_.aI);
        aek_1.c(this.aa);
        ProfilerInvoker.a(this.m, aX_.aq);
        Iterator iterator = ListInvoker.iterator(this.f);
        while (true) {
            if (!dz_0.c(iterator)) {
                ProfilerInvoker.endSection(this.m);
                return;
            }
            ITickable iTickable = (ITickable)dz_0.b(iterator);
            a9y_0.a(iTickable);
        }
    }

    public void e(String string) {
        this.q = string;
    }

    public File h(String string) {
        return new File(this.T(), string);
    }

    protected void aa() {
        int n = 0;
        this.g(aX_.X);
        LoggerInvoker.info(b, aX_.p);
        WorldServer worldServer = this.r[0];
        BlockPos blockPos = a3V.c(worldServer);
        long l4 = MinecraftServer.ae();
        int n2 = -192;
        while (this.n()) {
            int n3 = -192;
            while (this.n()) {
                long l5 = MinecraftServer.ae();
                if (l5 - l4 > 1000L) {
                    this.a(aX_.aN, n * 100 / 625);
                    l4 = l5;
                }
                ++n;
                rh_0.a(worldServer.Z, amv_2.j(blockPos) + n2 >> 4, amv_2.i(blockPos) + n3 >> 4);
                n3 += 16;
            }
            n2 += 16;
        }
        this.G();
    }

    public abstract boolean Y();

    public abstract boolean s();

    @Override
    public BlockPos e() {
        return BlockPos.m;
    }

    public ServerStatusResponse M() {
        return this.v;
    }

    public String E() {
        return this.q;
    }

    public boolean W() {
        return this.S;
    }

    public void setServerOwner(String string) {
        this.y = string;
    }

    public String S() {
        return aX_.a;
    }

    public Proxy D() {
        return this.x;
    }

    @Override
    public boolean c() {
        return J9.c(a3V.z(MinecraftServer.ah().r[0]), aX_.i);
    }

    protected aqY createNewCommandManager() {
        return new aqY(aX_.a2);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public boolean am() {
        return this.g;
    }

    public boolean A() {
        return false;
    }

    public void a(GameType gameType) {
        for (int i = 0; i < this.r.length; ++i) {
            a3V.d(MinecraftServer.ah().r[i]).a(gameType);
        }
    }

    public GameProfile[] ap() {
        return aek_1.g(this.aa);
    }

    @Override
    public String getName() {
        return aX_.an;
    }

    private void a(ICommandSender iCommandSender, String string, BlockPos blockPos, List<String> list, ICommandManager iCommandManager, String string2) {
        boolean bl = !StringInvoker.a(string = StringInvoker.a(string, 1), (CharSequence)aX_.A);
        List list2 = yh_1.a(iCommandManager, iCommandSender, string, blockPos);
        Iterator iterator = ListInvoker.iterator(list2);
        while (dz_0.c(iterator)) {
            String string3 = (String)dz_0.b(iterator);
            ListInvoker.add(list, aL0.a(aL0.a(new StringBuilder(), string2), string3).toString());
        }
    }

    @Override
    public void a(a9N a9N2, int n) {
    }

    public File T() {
        return new File(aX_.aV);
    }

    public abstract boolean af();

    @Override
    public IChatComponent getDisplayName() {
        return new ChatComponentText(this.getName());
    }

    public MinecraftServer(Proxy proxy, File file) {
        this.o = new PlayerUsageSnooper(aX_.Y, this, MinecraftServer.ae());
        this.f = my_0.c();
        this.m = new Profiler();
        this.v = new ServerStatusResponse();
        this.R = new Random();
        this.V = -1;
        this.C = true;
        this.z = 0;
        this.J = new long[100];
        this.K = aX_.aH;
        this.n = aX_.aJ;
        this.I = 0L;
        this.t = ard_0.a();
        this.O = MinecraftServer.ae();
        this.x = proxy;
        j = this;
        this.anvilFile = null;
        this.networkSystem = null;
        this.profileCache = new PlayerProfileCache(this, file);
        this.commandManager = null;
        this.anvilConverterForAnvilFile = null;
        this.authService = new YggdrasilAuthenticationService(proxy, awc_1.a().toString());
        this.sessionService = akh_0.a(this.authService);
        this.profileRepo = akh_0.b(this.authService);
    }

    @Override
    public World d() {
        return this.r[0];
    }

    public int k() {
        return 16;
    }

    public boolean m() {
        return this.anvilFile != null;
    }

    public static MinecraftServer ah() {
        return j;
    }

    public String[] C() {
        return this.aa.r();
    }

    public int y() {
        return this.p;
    }

    protected synchronized void g(String string) {
        this.A = string;
    }

    public void c(boolean bl) {
        this.E = bl;
    }

    @Override
    public void addChatComponentMessage(IChatComponent iChatComponent) {
        LoggerInvoker.info(b, aBO.d(iChatComponent));
    }

    public void X() {
        if (!this.W) {
            LoggerInvoker.info(b, aX_.f);
            if (this.al() != null) {
                JP.c(this.al());
            }
            if (this.aa != null) {
                LoggerInvoker.info(b, aX_.y);
                aek_1.m(this.aa);
                aek_1.a(this.aa);
            }
            if (this.r != null) {
                LoggerInvoker.info(b, aX_.aX);
                this.h(false);
                for (WorldServer worldServer : this.r) {
                    a3V.v(worldServer);
                }
            }
            if (SnooperInvoker.isSnooperRunning(this.o)) {
                SnooperInvoker.c(this.o);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        block29: {
            long l4;
            block28: {
                try {
                    if (this.u()) {
                        this.O = MinecraftServer.ae();
                        l4 = 0L;
                        a8K.a(this.v, new ChatComponentText(this.q));
                        a8K.a(this.v, new aEW(aX_.ac, 47));
                        this.a(this.v);
                        break block28;
                    }
                    this.b((CrashReport)null);
                    break block29;
                }
                catch (Throwable throwable) {
                    try {
                        LoggerInvoker.a(b, aX_.a0, throwable);
                        CrashReport crashReport = null;
                        crashReport = throwable instanceof ReportedException ? this.a(apx_0.a((ReportedException)throwable)) : this.a(new CrashReport(aX_.aD, throwable));
                        File file = new File(new File(this.T(), aX_.af), aL0.a(aL0.a(aL0.a(new StringBuilder(), aX_.a3), aZ2.a(new SimpleDateFormat(aX_.aB), new Date())), aX_.ad).toString());
                        if (CrashInvoker.a(crashReport, file)) {
                            LoggerInvoker.f(b, aL0.a(aL0.a(new StringBuilder(), aX_.T), zq_2.j(file)).toString());
                        } else {
                            LoggerInvoker.f(b, aX_.aL);
                        }
                        this.b(crashReport);
                    }
                    catch (Throwable throwable2) {
                        try {
                            this.s = true;
                            this.X();
                            throw throwable2;
                        }
                        catch (Throwable throwable3) {
                            LoggerInvoker.a(b, aX_.ao, throwable3);
                            throw throwable2;
                        }
                        finally {
                            this.P();
                        }
                    }
                    try {
                        this.s = true;
                        this.X();
                        return;
                    }
                    catch (Throwable throwable4) {
                        LoggerInvoker.a(b, aX_.aW, throwable4);
                        return;
                    }
                    finally {
                        this.P();
                    }
                }
            }
            while (this.C) {
                long l5 = MinecraftServer.ae();
                long l6 = l5 - this.O;
                if (l6 > 2000L && this.O - this.a >= 15000L) {
                    LoggerInvoker.b(b, aX_.d, new Object[]{lx_2.b(l6), lx_2.b(l6 / 50L)});
                    l6 = 2000L;
                    this.a = this.O;
                }
                if (l6 < 0L) {
                    LoggerInvoker.warn(b, aX_.K);
                    l6 = 0L;
                }
                l4 += l6;
                this.O = l5;
                if (a3V.j(this.r[0])) {
                    this.ad();
                    l4 = 0L;
                } else {
                    while (l4 > 50L) {
                        l4 -= 50L;
                        this.ad();
                    }
                }
                ThreadInvoker.sleep(MathInvoker.a(1L, 50L - l4));
                this.S = true;
            }
        }
        try {
            this.s = true;
            this.X();
            return;
        }
        catch (Throwable throwable) {
            LoggerInvoker.a(b, aX_.C, throwable);
            return;
        }
        finally {
            this.P();
        }
    }

    public void b(boolean bl) {
        this.g = bl;
    }

    public void d(boolean bl) {
        this.Y = bl;
    }

    static {
        b = LogManagerInvoker.c();
        M = new File(aX_.g);
    }

    @Override
    public Vec3 b() {
        return new Vec3(0.0, 0.0, 0.0);
    }

    public String e() {
        return aX_.ak;
    }

    protected void q() {
        j = this;
    }

    public GameProfileRepository d() {
        return this.profileRepo;
    }

    protected abstract boolean u() throws IOException;

    public void b(int n) {
        this.z = n;
    }

    public void ad() {
        long l4 = SystemInvoker.nanoTime();
        ++this.X;
        if (this.c) {
            this.c = false;
            this.m.g = true;
            ProfilerInvoker.b(this.m);
        }
        ProfilerInvoker.startSection(this.m, aX_.al);
        this.a();
        if (l4 - this.I >= 5000000000L) {
            this.I = l4;
            a8K.a(this.v, new t6_0(this.as(), this.ar()));
            Object[] objectArray = new GameProfile[MathInvoker.b(this.ar(), 12)];
            int n = MathHelper.a(this.R, 0, this.ar() - objectArray.length);
            for (int i = 0; i < objectArray.length; ++i) {
                objectArray[i] = EntityPlayerInvoker.I((EntityPlayerMP)ListInvoker.get(aek_1.l(this.aa), n + i));
            }
            asg_0.a(a7r_0.a(objectArray));
            aMQ.a(a8K.d(this.v), (GameProfile[])objectArray);
        }
        if (this.X % 900 == 0) {
            ProfilerInvoker.startSection(this.m, aX_.aF);
            aek_1.m(this.aa);
            this.h(true);
            ProfilerInvoker.endSection(this.m);
        }
        ProfilerInvoker.startSection(this.m, aX_.W);
        this.J[this.X % 100] = SystemInvoker.nanoTime() - l4;
        ProfilerInvoker.endSection(this.m);
        ProfilerInvoker.startSection(this.m, aX_.o);
        if (!SnooperInvoker.isSnooperRunning(this.o) && this.X > 100) {
            SnooperInvoker.startSnooper(this.o);
        }
        if (this.X % 6000 == 0) {
            SnooperInvoker.addMemoryStatsToSnooper(this.o);
        }
        ProfilerInvoker.endSection(this.m);
        ProfilerInvoker.endSection(this.m);
    }

    public abstract GameType g();

    public void e(boolean bl) {
        this.k = bl;
    }

    public String f() {
        return this.Q;
    }

    public void f(boolean bl) {
        this.P = bl;
    }

    public boolean n() {
        return this.C;
    }

    public int z() {
        return 29999984;
    }

    public ServerConfigurationManager an() {
        return this.aa;
    }

    protected void a(String string, int n) {
        this.e = string;
        this.i = n;
        LoggerInvoker.info(b, aL0.a(aL0.c(aL0.a(aL0.a(new StringBuilder(), string), aX_.S), n), aX_.ap).toString());
    }

    @Override
    public boolean a() {
        return true;
    }

    public String au() {
        return this.y;
    }

    public PlayerProfileCache Z() {
        return this.profileCache;
    }

    public boolean j() {
        return this.D;
    }

    public abstract boolean K();

    public CrashReport a(CrashReport crashReport) {
        CrashReportCategoryInvoker.a(CrashInvoker.c(crashReport), aX_.r, new w7_0(this));
        if (this.aa != null) {
            CrashReportCategoryInvoker.a(CrashInvoker.c(crashReport), aX_.ab, new OE(this));
        }
        return crashReport;
    }
}


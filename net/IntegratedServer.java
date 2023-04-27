/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.FutureTaskInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.SaveHandlerInvoker;
import cc.novoline.invoke.SaveLoaderInvoker;
import cc.novoline.invoke.SessionInvoker;
import cc.novoline.invoke.SnooperInvoker;
import deobf.EnumDifficulty;
import net.minecraft.world.GameType;
import deobf.ISaveHandler;
import deobf.MCInvoker;
import deobf.MinecraftServer;
import net.minecraft.world.WorldSettings;
import java.io.File;
import java.io.IOException;
import java.util.Queue;
import java.util.concurrent.FutureTask;
import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.Logger;

public class IntegratedServer
extends MinecraftServer {
    private boolean ag;
    private Minecraft mc;
    private WorldSettings theWorldSettings;
    private static Logger ae = LogManagerInvoker.c();
    private boolean ac;
    private ThreadLanServerPing ab;

    @Override
    protected void b(CrashReport crashReport) {
        MCInvoker.b(this.mc, crashReport);
    }

    public void b() {
        this.q();
    }

    @Override
    public boolean s() {
        return true;
    }

    @Override
    public boolean K() {
        return false;
    }

    @Override
    public void p() {
        aqo_2.a(this.addScheduledTask(new aBH(this)));
        super.p();
        if (this.ab != null) {
            aKQ.a(this.ab);
            this.ab = null;
        }
    }

    @Override
    public void a(PlayerUsageSnooper playerUsageSnooper) {
        super.a(playerUsageSnooper);
        SnooperInvoker.a(playerUsageSnooper, aqh_2.e, SnooperInvoker.f(this.mc.ak()));
    }

    @Override
    public String a(GameType gameType, boolean bl) {
        int n = -1;
        try {
            try {
                n = p1_0.a();
            }
            catch (IOException iOException) {}
            n = 25564;
            JP.a(this.al(), null, n);
            LoggerInvoker.info(ae, aL0.c(aL0.a(new StringBuilder(), aqh_2.a), n).toString());
            this.ag = true;
            this.ab = new ThreadLanServerPing(this.E(), aL0.a(aL0.c(new StringBuilder(), n), aqh_2.k).toString());
            this.ab.start();
            this.an().a(gameType);
            aek_1.c(this.an(), bl);
            return aL0.a(aL0.c(new StringBuilder(), n), aqh_2.j).toString();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public boolean a() {
        return MCInvoker.f().a();
    }

    public boolean d() {
        return this.ag;
    }

    @Override
    public File T() {
        return this.mc.mcDataDir;
    }

    @Override
    protected boolean u() {
        Object object;
        LoggerInvoker.info(ae, aqh_2.c);
        this.f(true);
        this.c(true);
        this.d(true);
        this.g(true);
        this.a(true);
        LoggerInvoker.info(ae, aqh_2.f);
        this.a(rk_1.b());
        if (ayy_0.d(ail_0.e)) {
            object = aDb.f(ail_0.bC, new Object[0]);
            if (!aDb.e(object, ail_0.e, new Object[]{this})) {
                return false;
            }
        }
        this.a(this.V(), this.f(), add_1.b(this.theWorldSettings), add_1.c(this.theWorldSettings), this.theWorldSettings.h());
        this.e(aL0.a(aL0.a(aL0.a(new StringBuilder(), this.au()), aqh_2.h), a3V.d(this.r[0]).l()).toString());
        if (ayy_0.d(ail_0.au)) {
            object = aDb.f(ail_0.bC, new Object[0]);
            if (ayy_0.c(ail_0.au) == Boolean.TYPE) {
                return aDb.e(object, ail_0.au, new Object[]{this});
            }
            aDb.b(object, ail_0.au, new Object[]{this});
        }
        return true;
    }

    @Override
    public void a(EnumDifficulty enumDifficulty) {
        super.a(enumDifficulty);
        if (this.mc.world != null) {
            uv_2.a(BlockInvoker.q(this.mc.world), enumDifficulty);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void ad() {
        boolean bl = this.ac = MCInvoker.aa(MCInvoker.f()) != null && MCInvoker.G(MCInvoker.f());
        if (this.ac) {
            LoggerInvoker.info(ae, aqh_2.b);
            aek_1.m(this.an());
            this.h(false);
        }
        if (this.ac) {
            Queue queue = this.t;
            Queue queue2 = this.t;
            synchronized (queue2) {
                while (!FutureTaskInvoker.c(this.t)) {
                    Util.a((FutureTask)FutureTaskInvoker.d(this.t), ae);
                }
                return;
            }
        }
        super.ad();
        if (this.mc.gameSettings.bp != aek_1.e(this.an())) {
            LoggerInvoker.e(ae, aqh_2.i, new Object[]{P8.d(this.mc.gameSettings.bp), P8.d(aek_1.e(this.an()))});
            aek_1.a(this.an(), this.mc.gameSettings.bp);
        }
        if (this.mc.world == null) return;
        WorldInfo worldInfo = a3V.d(this.r[0]);
        WorldInfo worldInfo2 = BlockInvoker.q(this.mc.world);
        if (!uv_2.c(worldInfo) && worldInfo2.G() != worldInfo.G()) {
            LoggerInvoker.e(ae, aqh_2.d, new Object[]{worldInfo2.G(), worldInfo.G()});
            this.a(worldInfo2.G());
            return;
        }
        if (!uv_2.c(worldInfo2)) return;
        if (uv_2.c(worldInfo)) return;
        LoggerInvoker.e(ae, aqh_2.l, new Object[]{worldInfo2.G()});
        WorldServer[] worldServerArray = this.r;
        int n = worldServerArray.length;
        int n2 = 0;
        while (n2 < n) {
            WorldServer worldServer = worldServerArray[n2];
            uv_2.g(a3V.d(worldServer), true);
            ++n2;
        }
    }

    @Override
    public CrashReport a(CrashReport crashReport) {
        crashReport = super.a(crashReport);
        CrashReportCategoryInvoker.a(CrashInvoker.c(crashReport), aqh_2.m, new arc_1(this));
        CrashReportCategoryInvoker.a(CrashInvoker.c(crashReport), aqh_2.n, new aU2(this));
        return crashReport;
    }

    public IntegratedServer(Minecraft minecraft) {
        super(MCInvoker.R(minecraft), new File(minecraft.mcDataDir, M.getName()));
        this.mc = minecraft;
        this.theWorldSettings = null;
    }

    @Override
    public boolean o() {
        return true;
    }

    @Override
    protected void a(String string, String string2, long l4, WorldType worldType, String string3) {
        this.a(string);
        ISaveHandler iSaveHandler = SaveLoaderInvoker.getSaveLoader(this.I(), string, true);
        this.a(this.V(), iSaveHandler);
        WorldInfo worldInfo = SaveHandlerInvoker.b(iSaveHandler);
        if (aC8.b(ail_0.dk)) {
            WorldServer worldServer = this.am() ? (WorldServer)avd_0.a(new ZJ(this, iSaveHandler, worldInfo, 0, this.m)) : (WorldServer)ago_1.a(new _l_0(this, iSaveHandler, worldInfo, 0, this.m));
            a3V.a(worldServer, this.theWorldSettings);
            Integer[] integerArray = (Integer[])aDb.f(ail_0.aZ, new Object[0]);
            int n = integerArray.length;
            for (int i = 0; i < n; ++i) {
                P8.b(integerArray[i]);
                WorldServer worldServer2 = worldServer;
                a3V.a(worldServer2, new HK(this, worldServer2));
                if (!this.H()) {
                    a3V.d(worldServer2).a(this.g());
                }
                if (!aC8.b(ail_0.cU)) continue;
                aDb.a(ail_0.bR, new Object[]{worldServer2});
            }
            aek_1.a(this.an(), new WorldServer[]{worldServer});
            if (a3V.d(worldServer).G() == null) {
                this.a(this.mc.gameSettings.aG);
            }
        } else {
            this.r = new WorldServer[3];
            this.B = new long[this.r.length][100];
            this.a(this.V(), iSaveHandler);
            worldInfo = new WorldInfo(this.theWorldSettings, string2);
            for (int i = 0; i < this.r.length; ++i) {
                int n = 0;
                this.r[i] = this.am() ? (WorldServer)avd_0.a(new ZJ(this, iSaveHandler, worldInfo, n, this.m)) : (WorldServer)ago_1.a(new _l_0(this, iSaveHandler, worldInfo, n, this.m));
                a3V.a(this.r[i], this.theWorldSettings);
                a3V.a(this.r[i], new HK(this, this.r[i]));
            }
            aek_1.a(this.an(), this.r);
            if (a3V.d(this.r[0]).G() == null) {
                this.a(this.mc.gameSettings.aG);
            }
        }
        this.aa();
    }

    @Override
    public void a(GameType gameType) {
        this.an().a(gameType);
    }

    public IntegratedServer(Minecraft minecraft, String string, String string2, WorldSettings worldSettings) {
        super(new File(minecraft.mcDataDir, aqh_2.g), MCInvoker.R(minecraft), new File(minecraft.mcDataDir, M.getName()));
        this.setServerOwner(SessionInvoker.getUsername(MCInvoker.y(minecraft)));
        this.setFolderName(string);
        this.b(string2);
        this.b(minecraft.k());
        this.e(add_1.d(worldSettings));
        this.a(256);
        this.a(new aPw(this));
        this.mc = minecraft;
        this.theWorldSettings = this.am() ? ZJ.ah : worldSettings;
    }

    @Override
    public boolean af() {
        return false;
    }

    @Override
    public int O() {
        return 4;
    }

    @Override
    public void X() {
        super.X();
        if (this.ab != null) {
            aKQ.a(this.ab);
            this.ab = null;
        }
    }

    @Override
    public EnumDifficulty ai() {
        return this.mc.world == null ? this.mc.gameSettings.aG : BlockInvoker.q(this.mc.world).G();
    }

    @Override
    public boolean t() {
        return add_1.e(this.theWorldSettings);
    }

    @Override
    public boolean L() {
        return true;
    }

    @Override
    public GameType g() {
        return this.theWorldSettings.e();
    }

    @Override
    public boolean Y() {
        return false;
    }

    @Override
    protected aqY createNewCommandManager() {
        return new aqk_1();
    }
}


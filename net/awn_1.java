/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package net;

import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.ServerInvoker;
import net.minecraft.crash.CrashReportCategory;
import deobf.EntityPlayer;
import deobf.IChatComponent;
import deobf.ICommandManager;
import deobf.MinecraftServer;
import net.minecraft.util.ReportedException;
import io.netty.buffer.ByteBuf;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Renamed from net.awN
 */
public abstract class awn_1
implements ICommandSender {
    private boolean c = true;
    private IChatComponent g = null;
    private static SimpleDateFormat a = new SimpleDateFormat(NF.m);
    private String f = NF.f;
    private ab1_0 d;
    private String b = NF.o;
    private int e;

    public void b(IChatComponent iChatComponent) {
        this.g = iChatComponent;
    }

    public boolean d() {
        return this.c;
    }

    @Override
    public void addChatComponentMessage(IChatComponent iChatComponent) {
        if (this.c && awo_0.a(this) != null && !awo_0.a((awn_1)this).isRemote) {
            this.g = axq_2.a(new ChatComponentText(aL0.a(aL0.a(aL0.a(new StringBuilder(), NF.t), aZ2.a(a, new Date())), NF.u).toString()), iChatComponent);
            this.b();
        }
    }

    public ab1_0 f() {
        return this.d;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    @Override
    public void a(a9N a9N2, int n) {
        aqj_0.a(this.d, this, a9N2, n);
    }

    public int g() {
        return this.e;
    }

    public awn_1() {
        this.d = new ab1_0();
    }

    public abstract void a(ByteBuf var1);

    @Override
    public boolean a(int n, String string) {
        return n <= 2;
    }

    public abstract int a();

    @Override
    public IChatComponent getDisplayName() {
        return new ChatComponentText(this.getName());
    }

    public boolean a(EntityPlayer entityPlayer) {
        if (!aSY.a(entityPlayer.abilities)) {
            return false;
        }
        if (a6w_0.M((EntityPlayer)entityPlayer).isRemote) {
            a6w_0.a(entityPlayer, this);
        }
        return true;
    }

    public void a(World world) {
        MinecraftServer minecraftServer;
        if (world.isRemote) {
            this.e = 0;
        }
        if (ServerInvoker.B(minecraftServer = ServerInvoker.d()) && ServerInvoker.g(minecraftServer)) {
            ICommandManager iCommandManager = ServerInvoker.k(minecraftServer);
            try {
                this.g = null;
                this.e = yh_1.a(iCommandManager, this, this.f);
            }
            catch (Throwable throwable) {
                CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, NF.b);
                CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, NF.c);
                CrashReportCategoryInvoker.a(crashReportCategory, NF.p, new aqu_1(this));
                CrashReportCategoryInvoker.a(crashReportCategory, NF.v, new mm_0(this));
                throw new ReportedException(crashReport);
            }
        } else {
            this.e = 0;
        }
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    @Override
    public String getName() {
        return this.b;
    }

    public String h() {
        return this.f;
    }

    @Override
    public boolean c() {
        MinecraftServer minecraftServer = ServerInvoker.d();
        return !ServerInvoker.B(minecraftServer) || J9.c(a3V.z(minecraftServer.r[0]), NF.l);
    }

    public abstract void b();

    public IChatComponent e() {
        return this.g;
    }

    public void a(NBTTagCompound nBTTagCompound) {
        this.f = tn_0.m(nBTTagCompound, NF.k);
        this.e = tn_0.g(nBTTagCompound, NF.w);
        if (tn_0.a(nBTTagCompound, NF.a, 8)) {
            this.b = tn_0.m(nBTTagCompound, NF.i);
        }
        if (tn_0.a(nBTTagCompound, NF.g, 1)) {
            this.c = tn_0.c(nBTTagCompound, NF.j);
        }
        if (tn_0.a(nBTTagCompound, NF.s, 8) && this.c) {
            this.g = aGU.a(tn_0.m(nBTTagCompound, NF.n));
        }
        aqj_0.a(this.d, nBTTagCompound);
    }

    public void b(String string) {
        this.b = string;
    }

    public void a(String string) {
        this.f = string;
        this.e = 0;
    }

    public void b(NBTTagCompound nBTTagCompound) {
        tn_0.a(nBTTagCompound, NF.q, this.f);
        tn_0.b(nBTTagCompound, NF.r, this.e);
        tn_0.a(nBTTagCompound, NF.h, this.b);
        tn_0.a(nBTTagCompound, NF.d, this.c);
        if (this.g != null && this.c) {
            tn_0.a(nBTTagCompound, NF.e, aGU.a(this.g));
        }
        aqj_0.b(this.d, nBTTagCompound);
    }
}


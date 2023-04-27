/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ServerInvoker;
import deobf.MinecraftServer;
import deobf.Packet;
import net.minecraft.network.packts.S3BPacketScoreboardObjective;
import net.minecraft.network.packts.S3CPacketUpdateScore;
import net.minecraft.network.packts.S3DPacketDisplayScoreboard;
import net.minecraft.network.packts.S3EPacketTeams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import deobf.EntityPlayerMP;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.zR
 */
public class zr_1
extends za_2 {
    private Set<acl_0> i = axe_2.a();
    private wb_1 h;
    private MinecraftServer j;

    @Override
    public void b(String string, acl_0 acl_02) {
        super.b(string, acl_02);
        aek_1.a(ServerInvoker.R(this.j), new S3CPacketUpdateScore(string, acl_02));
        this.a();
    }

    /*
     * WARNING - void declaration
     */
    public int d(acl_0 acl_02) {
        int n = 0;
        while (true) {
            if (this.a(n) == acl_02) {
                void var2_3;
                ++var2_3;
            }
            ++n;
        }
    }

    @Override
    public void b(a35 a352) {
        super.b(a352);
        aek_1.a(ServerInvoker.R(this.j), new S3EPacketTeams(a352, 1));
        this.a();
    }

    public List<Packet> a(acl_0 acl_02) {
        ArrayList arrayList = my_0.c();
        ListInvoker.add(arrayList, new S3BPacketScoreboardObjective(acl_02, 1));
        int n = 0;
        while (true) {
            if (this.a(n) == acl_02) {
                ListInvoker.add(arrayList, new S3DPacketDisplayScoreboard(n, acl_02));
            }
            ++n;
        }
    }

    @Override
    public void e(acl_0 acl_02) {
        super.e(acl_02);
        this.a();
    }

    @Override
    public void a(String string, a35 a352) {
        super.a(string, a352);
        aek_1.a(ServerInvoker.R(this.j), new S3EPacketTeams(a352, a7r_0.a(new String[]{string}), 4));
        this.a();
    }

    @Override
    public boolean a(String string, String string2) {
        if (super.a(string, string2)) {
            a35 a352 = this.f(string2);
            aek_1.a(ServerInvoker.R(this.j), new S3EPacketTeams(a352, a7r_0.a(new String[]{string}), 3));
            this.a();
            return true;
        }
        return false;
    }

    public void c(acl_0 acl_02) {
        List<Packet> list = this.a(acl_02);
        Iterator iterator = ListInvoker.iterator(aek_1.l(ServerInvoker.R(this.j)));
        while (dz_0.c(iterator)) {
            EntityPlayerMP entityPlayerMP = (EntityPlayerMP)dz_0.b(iterator);
            Iterator iterator2 = ListInvoker.iterator(list);
            while (dz_0.c(iterator2)) {
                Packet packet = (Packet)dz_0.b(iterator2);
                qv_0.a(entityPlayerMP.playerNetServerHandler, packet);
            }
        }
        aS0.a(this.i, acl_02);
    }

    @Override
    public void b(acl_0 acl_02) {
        super.b(acl_02);
        if (aS0.c(this.i, acl_02)) {
            aek_1.a(ServerInvoker.R(this.j), new S3BPacketScoreboardObjective(acl_02, 2));
        }
        this.a();
    }

    public void a(wb_1 wb_12) {
        this.h = wb_12;
    }

    @Override
    public void a(int n, acl_0 acl_02) {
        acl_0 acl_03 = this.a(n);
        super.a(n, acl_02);
        if (acl_03 != acl_02) {
            if (this.d(acl_03) > 0) {
                aek_1.a(ServerInvoker.R(this.j), new S3DPacketDisplayScoreboard(n, acl_02));
            } else {
                this.c(acl_03);
            }
        }
        if (aS0.c(this.i, acl_02)) {
            aek_1.a(ServerInvoker.R(this.j), new S3DPacketDisplayScoreboard(n, acl_02));
        } else {
            this.f(acl_02);
        }
        this.a();
    }

    @Override
    public void d(acl_0 acl_02) {
        super.d(acl_02);
        if (aS0.c(this.i, acl_02)) {
            this.c(acl_02);
        }
        this.a();
    }

    @Override
    public void a(a35 a352) {
        super.a(a352);
        aek_1.a(ServerInvoker.R(this.j), new S3EPacketTeams(a352, 0));
        this.a();
    }

    protected void a() {
        if (this.h != null) {
            aaa_1.a(this.h);
        }
    }

    public List<Packet> b(acl_0 acl_02) {
        ArrayList arrayList = my_0.c();
        ListInvoker.add(arrayList, new S3BPacketScoreboardObjective(acl_02, 0));
        int n = 0;
        while (true) {
            if (this.a(n) == acl_02) {
                ListInvoker.add(arrayList, new S3DPacketDisplayScoreboard(n, acl_02));
            }
            ++n;
        }
    }

    @Override
    public void d(a35 a352) {
        super.d(a352);
        aek_1.a(ServerInvoker.R(this.j), new S3EPacketTeams(a352, 2));
        this.a();
    }

    @Override
    public void h(String string) {
        super.h(string);
        aek_1.a(ServerInvoker.R(this.j), new S3CPacketUpdateScore(string));
        this.a();
    }

    public zr_1(MinecraftServer minecraftServer) {
        this.j = minecraftServer;
    }

    @Override
    public void a(QU qU) {
        super.a(qU);
        if (aS0.c(this.i, hs_0.e(qU))) {
            aek_1.a(ServerInvoker.R(this.j), new S3CPacketUpdateScore(qU));
        }
        this.a();
    }

    public void f(acl_0 acl_02) {
        List<Packet> list = this.b(acl_02);
        Iterator iterator = ListInvoker.iterator(aek_1.l(ServerInvoker.R(this.j)));
        while (dz_0.c(iterator)) {
            EntityPlayerMP entityPlayerMP = (EntityPlayerMP)dz_0.b(iterator);
            Iterator iterator2 = ListInvoker.iterator(list);
            while (dz_0.c(iterator2)) {
                Packet packet = (Packet)dz_0.b(iterator2);
                qv_0.a(entityPlayerMP.playerNetServerHandler, packet);
            }
        }
        aS0.b(this.i, acl_02);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ServerInvoker;
import deobf.CommandHandler;
import deobf.EntityPlayer;
import deobf.MinecraftServer;
import java.util.Iterator;
import net.ChatStyle;
import net.HX;
import net.ICommand;
import net.ICommandSender;
import net.J9;
import net.XO;
import net.a3V;
import net.a6w_0;
import net.a8H;
import net.aBO;
import net.aek_1;
import net.alj_1;
import net.anw_0;
import net.aoz_1;
import net.awn_1;
import net.awo_0;
import net.ays_0;
import net.b0_0;
import net.b1_0;
import net.b2_0;
import net.b4_0;
import net.b5_0;
import net.b8_0;
import net.b9_0;
import net.bB;
import net.bE;
import net.bO;
import net.bR;
import net.b__0;
import net.ba_0;
import net.ba_1;
import net.bb_0;
import net.bc_1;
import net.bd_1;
import net.bd_2;
import net.be_0;
import net.bf_0;
import net.bf_1;
import net.bg_0;
import net.bh_0;
import net.bh_1;
import net.bi_2;
import net.bj_1;
import net.bk_1;
import net.bk_2;
import net.bl_1;
import net.bm_1;
import net.bm_2;
import net.bn_1;
import net.bn_2;
import net.bo_0;
import net.bp_1;
import net.bq_2;
import net.bs_1;
import net.bs_2;
import net.bt_1;
import net.bt_2;
import net.bu_0;
import net.bw_2;
import net.bx_1;
import net.by_1;
import net.bz_0;
import net.bz_1;
import net.c3_0;
import net.c6_0;
import net.c7_0;
import net.cj_2;
import net.cl_1;
import net.cp_2;
import net.cr_0;
import net.cu_2;
import net.cv_1;
import net.cv_2;
import net.cw_1;
import net.cx_1;
import net.cy_2;
import net.dz_0;
import net.pj_1;
import net.sh_0;
import org.jetbrains.annotations.NotNull;

public class aqY
extends CommandHandler
implements a8H {
    public aqY(@NotNull String string) {
        super(string);
        this.a(new bn_1());
        this.a(new ba_0());
        this.a(new bu_0());
        this.a(new bh_1());
        this.a(new bB());
        this.a(new b8_0());
        this.a(new bs_1());
        this.a(new b9_0());
        this.a(new cu_2());
        this.a(new bE());
        this.a(new bp_1());
        this.a(new bd_2());
        this.a(new b4_0());
        this.a(new b5_0());
        this.a(new bf_0());
        this.a(new bw_2());
        this.a(new bz_1());
        this.a(new bO());
        this.a(new bl_1());
        this.a(new bk_1());
        this.a(new b__0());
        this.a(new be_0());
        this.a(new cv_2());
        this.a(new bg_0());
        this.a(new bo_0());
        this.a(new c3_0());
        this.a(new bt_2());
        this.a(new bz_0());
        this.a(new cp_2());
        this.a(new ba_1());
        this.a(new bx_1());
        this.a(new bh_0());
        this.a(new cr_0());
        this.a(new cw_1());
        this.a(new bR());
        this.a(new bk_2());
        this.a(new b2_0());
        this.a(new bn_2());
        this.a(new cx_1());
        this.a(new bb_0());
        this.a(new bm_1());
        this.a(new bi_2());
        this.a(new bd_1());
        if (ServerInvoker.i(ServerInvoker.d())) {
            this.a(new b1_0());
            this.a(new bc_1());
            this.a(new cv_1());
            this.a(new cy_2());
            this.a(new c6_0());
            this.a(new cj_2());
            this.a(new bm_2());
            this.a(new bt_1());
            this.a(new b0_0());
            this.a(new bs_2());
            this.a(new bj_1());
            this.a(new bf_1());
            this.a(new by_1());
            this.a(new c7_0());
            this.a(new bq_2());
        } else {
            this.a(new cl_1());
        }
        ays_0.a(this);
    }

    @Override
    public void a(ICommandSender iCommandSender, ICommand iCommand, int n, String string, Object ... objectArray) {
        MinecraftServer minecraftServer = ServerInvoker.d();
        if (!alj_1.b(iCommandSender)) {
            // empty if block
        }
        aoz_1 aoz_12 = new aoz_1(sh_0.a, alj_1.g(iCommandSender), new aoz_1(string, objectArray));
        ChatStyle chatStyle = aBO.f(aoz_12);
        HX.a(chatStyle, anw_0.GRAY);
        HX.a(chatStyle, Boolean.TRUE);
        Iterator iterator = ListInvoker.iterator(aek_1.l(ServerInvoker.R(minecraftServer)));
        while (dz_0.c(iterator)) {
            EntityPlayer entityPlayer = (EntityPlayer)dz_0.b(iterator);
            if (entityPlayer == iCommandSender || !aek_1.a(ServerInvoker.R(minecraftServer), a6w_0.G(entityPlayer)) || !XO.a(iCommand, iCommandSender)) continue;
            boolean bl = iCommandSender instanceof MinecraftServer && ServerInvoker.q(ServerInvoker.d());
            boolean bl2 = iCommandSender instanceof pj_1 && ServerInvoker.N(ServerInvoker.d());
            if (iCommandSender instanceof pj_1 || iCommandSender instanceof MinecraftServer) continue;
            a6w_0.a(entityPlayer, aoz_12);
        }
        if (iCommandSender != minecraftServer && J9.c(a3V.z(minecraftServer.r[0]), sh_0.c)) {
            ServerInvoker.a(minecraftServer, aoz_12);
        }
        boolean bl = J9.c(a3V.z(minecraftServer.r[0]), sh_0.b);
        if (iCommandSender instanceof awn_1) {
            bl = awo_0.g((awn_1)iCommandSender);
        }
        if ((n & 1) != 1) {
            // empty if block
        }
        if (iCommandSender instanceof MinecraftServer) {
            alj_1.a(iCommandSender, new aoz_1(string, objectArray));
        }
    }
}


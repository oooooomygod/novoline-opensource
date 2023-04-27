/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package net;

import cc.novoline.Novoline;
import cc.novoline.events.EventTarget;
import cc.novoline.events.events.LoadWorldEvent;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.events.MoveEvent;
import cc.novoline.events.events.PacketEvent;
import cc.novoline.events.type.State;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.EventManagerInvoker;
import cc.novoline.invoke.GameSettingsInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MoveInoker;
import cc.novoline.invoke.NotificationManagerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.EntityPlayer;
import deobf.EntityPlayerSP;
import deobf.TimerUtil;
import net.minecraft.multiplayer.WorldClient;
import net.minecraft.network.packts.C03PacketPlayer;
import net.minecraft.network.packts.C06PacketPlayerPosLook;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.bQ
 */
public class bq_1
extends a0_0 {
    private double k;
    private double n;
    private int o;
    private N2 l = N2.WAIT;
    private String m;
    private TimerUtil p;
    private double q;

    @EventTarget
    public void a(MoveEvent moveEvent) {
        MoveInoker.setSpeed(moveEvent, 0.0);
        MoveInoker.setY(moveEvent, 0.0);
    }

    @EventTarget
    public void a(MotionUpdateEvent motionUpdateEvent) {
        amv_2.b();
        if (EventInvoker.getState(motionUpdateEvent) == State.PRE) {
            EntityPlayerSP entityPlayerSP = ((Minecraft)ui_0.a((qf_2)this.b)).player;
            if (this.l == N2.WAIT) {
                PlayerInvoker.b(entityPlayerSP, aPf.v);
                this.l = N2.RECONNECT;
            }
            if (this.l == N2.RECONNECT && entityPlayerSP.ticksExisted == 1) {
                PlayerInvoker.b(entityPlayerSP, aPf.m);
                this.l = N2.TP;
                qh_1.b(this.p);
            }
            if (this.l == N2.TP && aCM.a(abb_2.UHC)) {
                if (this.o != 0) {
                    qh_1.b(this.p);
                }
                if (qh_1.c(this.p, 800L)) {
                    jv_0.m(((Minecraft)ui_0.a((qf_2)this.b)).renderGlobal);
                    EventManagerInvoker.b(this);
                }
                WorldClient worldClient = ((Minecraft)ui_0.a((qf_2)this.b)).world;
                if (this.m != null && BlockInvoker.a(worldClient, this.m) != null) {
                    EntityPlayer entityPlayer = BlockInvoker.a(worldClient, this.m);
                    this.n = entityPlayer.posX;
                    this.q = entityPlayer.posZ;
                }
                if (entityPlayerSP.ticksExisted == 1) {
                    this.a(new C06PacketPlayerPosLook(this.n, this.k, this.q, entityPlayerSP.rotationYaw, entityPlayerSP.rotationPitch, false));
                    this.a(new C03PacketPlayer(false));
                }
                EventInvoker.a(motionUpdateEvent, true);
                if (GameSettingsInvoker.e(((Minecraft)ui_0.a((qf_2)this.b)).gameSettings.aj)) {
                    EventManagerInvoker.b(this);
                }
            }
            entityPlayerSP.ap = 0.0f;
            entityPlayerSP.bO = 0.0f;
            this.o = 0;
        }
    }

    public bq_1(@NotNull Novoline novoline, String string, String string2, String string3) {
        super(novoline, string, string2, string3);
    }

    /*
     * Exception decompiling
     */
    @EventTarget
    public void a(PacketEvent var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$TooOptimisticMatchException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.getString(SwitchStringRewriter.java:404)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.access$600(SwitchStringRewriter.java:53)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$SwitchStringMatchResultCollector.collectMatches(SwitchStringRewriter.java:368)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.KleeneN.match(KleeneN.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.MatchSequence.match(MatchSequence.java:26)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:23)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewriteComplex(SwitchStringRewriter.java:201)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewrite(SwitchStringRewriter.java:73)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:881)
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

    @EventTarget
    public void a(LoadWorldEvent loadWorldEvent) {
    }

    @Override
    public void a(String[] stringArray, int n, int n2) {
        int n3;
        block17: {
            block18: {
                block16: {
                    ListInvoker[] listInvokerArray;
                    block15: {
                        block13: {
                            block14: {
                                block12: {
                                    listInvokerArray = amv_2.b();
                                    if (stringArray.length < 1) break block12;
                                    n3 = stringArray.length;
                                    if (listInvokerArray != null) break block13;
                                    if (n3 <= 3) break block14;
                                }
                                this.a(aPf.h, aPf.f, azo_1.a(aPf.l, aPf.p));
                                return;
                            }
                            n3 = aCM.d() ? 1 : 0;
                        }
                        if (listInvokerArray != null) break block15;
                        if (n3 == 0) break block16;
                        n3 = aCM.a(abb_2.UHC) ? 1 : 0;
                    }
                    if (listInvokerArray != null) break block17;
                    if (n3 != 0) break block18;
                }
                NotificationManagerInvoker.a(NovolineInvoker.getNotificationManager(this.g), aPf.s, aPf.o, 3500, NotificationType.ERROR);
                return;
            }
            this.m = null;
            n3 = stringArray.length;
        }
        switch (n3) {
            case 1: {
                EntityPlayer entityPlayer = BlockInvoker.a(((Minecraft)ui_0.a((qf_2)this.b)).world, stringArray[0]);
                if (entityPlayer == null || entityPlayer == ((Minecraft)ui_0.a((qf_2)this.b)).player) {
                    NotificationManagerInvoker.a(NovolineInvoker.getNotificationManager(this.g), aPf.i, aL0.a(aL0.a(aL0.a(new StringBuilder(), aPf.j), stringArray[0]), aPf.u).toString(), 2500, NotificationType.ERROR);
                    return;
                }
                this.m = a6w_0.C(entityPlayer);
                this.n = entityPlayer.posX;
                this.q = entityPlayer.posZ;
                this.k = 100.0;
            }
            case 2: {
                this.n = stringArray[0].equals(aPf.r) ? ((Minecraft)ui_0.a((qf_2)this.b)).player.posX : Double.parseDouble(stringArray[0]);
                this.k = 100.0;
                this.q = stringArray[1].equals(aPf.t) ? ((Minecraft)ui_0.a((qf_2)this.b)).player.posZ : Double.parseDouble(stringArray[1]);
            }
            case 3: {
                this.n = stringArray[0].equals(aPf.k) ? ((Minecraft)ui_0.a((qf_2)this.b)).player.posX : Double.parseDouble(stringArray[0]);
                this.k = stringArray[1].equals(aPf.n) ? ((Minecraft)ui_0.a((qf_2)this.b)).player.posY : Double.parseDouble(stringArray[1]);
                this.q = stringArray[2].equals(aPf.g) ? ((Minecraft)ui_0.a((qf_2)this.b)).player.posZ : Double.parseDouble(stringArray[2]);
            }
        }
        NotificationManagerInvoker.a(NovolineInvoker.getNotificationManager(this.g), aPf.c, StringInvoker.a(aPf.q, new Object[]{db_0.a(this.n), db_0.a(this.k), db_0.a(this.q)}), 6500, NotificationType.INFO);
        EventManagerInvoker.a(this);
        this.p = new TimerUtil();
        this.l = N2.WAIT;
    }
}


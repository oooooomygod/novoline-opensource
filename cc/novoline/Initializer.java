/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
package cc.novoline;

import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.visual.SessionInfo;
import cc.novoline.modules.player.Scaffold;
import cc.novoline.modules.visual.Animations;
import cc.novoline.modules.combat.AntiBot;
import cc.novoline.modules.player.AntiVoid;
import cc.novoline.modules.visual.Atomsphere;
import cc.novoline.modules.player.AutoArmor;
import cc.novoline.modules.combat.AutoGApple;
import cc.novoline.modules.misc.AutoHypixel;
import cc.novoline.modules.misc.AutoTool;
import cc.novoline.modules.exploits.Blink;
import cc.novoline.modules.visual.Camera;
import cc.novoline.modules.misc.ChatFutures;
import cc.novoline.modules.visual.ChestESP;
import cc.novoline.modules.visual.ClickGui;
import cc.novoline.modules.combat.Criticals;
import cc.novoline.modules.visual.CustomHit;
import cc.novoline.modules.exploits.Disabler;
import cc.novoline.modules.move.FastSneak;
import cc.novoline.modules.move.Fly;
import cc.novoline.modules.visual.FullBright;
import cc.novoline.modules.visual.Glint;
import cc.novoline.modules.move.GuiMove;
import cc.novoline.modules.visual.HUD;
import cc.novoline.modules.visual.HypixelStats;
import cc.novoline.modules.player.InvManager;
import deobf.ItemESP;
import deobf.ItemPhysic;
import cc.novoline.modules.visual.JumpCircle;
import deobf.LightingTracker;
import deobf.NameTags;
import cc.novoline.modules.exploits.NoFall;
import cc.novoline.modules.player.NoRotate;
import cc.novoline.modules.visual.NoTitle;
import cc.novoline.modules.visual.PlayerESP;
import deobf.PlayersFinder;
import cc.novoline.modules.combat.Reach;
import cc.novoline.modules.move.SafeWalk;
import cc.novoline.modules.move.Speed;
import cc.novoline.modules.move.Sprint;
import cc.novoline.modules.move.Step;
import cc.novoline.modules.combat.TargetHUD;
import cc.novoline.modules.misc.Train;
import cc.novoline.modules.move.WaterWalk;
import cc.novoline.modules.visual.Wings;
import cc.novoline.modules.visual.XRay;
import java.util.function.Consumer;
import net.minecraft.client.Minecraft;
import cc.novoline.modules.visual.Scoreboard;
import net.AimAssist;
import net.AntiAlts;
import net.AntiObbyTrap;
import net.Arrows;
import net.AutoClicker;
import net.AutoHead;
import net.AutoPot;
import net.BedBreaker;
import net.minecraft.block.BlockOverlay;
import net.BreadCrumbs;
import net.Chams;
import net.ChestStealer;
import net.ClickTeleport;
import net.Crosshair;
import net.DMGParticles;
import net.FastPlace;
import net.Freecam;
import net.GameSpeed;
import net.Glow;
import net.HClip;
import net.HitBox;
import net.KillAura;
import net.LongJump;
import net.MCF;
import net.ModuleManager;
import net.MoreBends;
import net.NoEffects;
import net.NoJumpDelay;
import net.NoSlow;
import net.Optimization;
import net.Phase;
import net.Projectiles;
import net.Radar;
import net.Respawn;
import net.SimsESP;
import net.SpeedMine;
import net.StaffAnalyzer;
import net.TabGui;
import net.TargetStrafe;
import net.Tracers;
import net.UhcCrafts;
import net.Velocity;
import net.Waypoints;
import net.a0T;
import net.a_7;
import net.a_U;
import net.aoz_2;
import net.atu;
import novoline0.Loader;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class Initializer {
    private static Logger g;
    private Minecraft b;
    public Runnable d;
    private static long h;
    public Runnable a;
    public String e = aoz_2.a;
    public int c = 69;
    private boolean f = false;

    private static native AutoGApple lambda$create$88(ModuleManager var0);

    private static native Fly lambda$create$62(ModuleManager var0);

    private static native ClickGui lambda$create$4(ModuleManager var0);

    private static native AimAssist lambda$create$47(ModuleManager var0);

    private static native Speed lambda$create$19(ModuleManager var0);

    private static native LightingTracker lambda$create$57(ModuleManager var0);

    private static native ChatFutures lambda$create$84(ModuleManager var0);

    private static native Radar lambda$create$6(ModuleManager var0);

    private static native SafeWalk lambda$create$89(ModuleManager var0);

    private static native a0T lambda$create$12(ModuleManager var0);

    private static native Blink lambda$create$41(ModuleManager var0);

    private static native AutoArmor lambda$create$28(ModuleManager var0);

    private static native LongJump lambda$create$64(ModuleManager var0);

    private static native AutoHead lambda$create$76(ModuleManager var0);

    private static native NameTags lambda$create$24(ModuleManager var0);

    private static native Train lambda$create$74(ModuleManager var0);

    private static native AntiVoid lambda$create$63(ModuleManager var0);

    private static native DMGParticles lambda$create$38(ModuleManager var0);

    private static native NoJumpDelay lambda$create$87(ModuleManager var0);

    private native void lambda$create$1();

    private static native GuiMove lambda$create$32(ModuleManager var0);

    public native void a(String var1);

    private static native JumpCircle lambda$create$71(ModuleManager var0);

    private static native Atomsphere lambda$create$50(ModuleManager var0);

    private static native CustomHit lambda$create$72(ModuleManager var0);

    private static native BedBreaker lambda$create$61(ModuleManager var0);

    private static native NoEffects lambda$create$42(ModuleManager var0);

    private static native Reach lambda$create$15(ModuleManager var0);

    private static native PlayersFinder lambda$create$49(ModuleManager var0);

    private native void a(Object ... var1);

    private static native a_U lambda$create$86(ModuleManager var0);

    private static native Throwable a(Throwable var0);

    private static native WaterWalk lambda$create$17(ModuleManager var0);

    private static native void lambda$create$94(Novoline var0, String var1, Void var2);

    private static native a_7 lambda$create$93(ModuleManager var0);

    private static native ItemESP lambda$create$45(ModuleManager var0);

    private static native AntiAlts lambda$create$65(ModuleManager var0);

    private static native Step lambda$create$16(ModuleManager var0);

    private native <Module extends AbstractModule> void a(@NotNull String var1, @NotNull atu<Module> var2);

    public native String a(Object var1, String var2);

    private static native GameSpeed lambda$create$67(ModuleManager var0);

    private static native HUD lambda$create$3(ModuleManager var0);

    private static native Phase lambda$create$33(ModuleManager var0);

    private static native NoRotate lambda$create$68(ModuleManager var0);

    private static native BreadCrumbs lambda$create$82(ModuleManager var0);

    static {
        Loader.registerNativesForClass(0);
        Initializer.native_special_clinit46();
    }

    public static native Initializer a();

    private static native Optimization lambda$create$79(ModuleManager var0);

    private static native Camera lambda$create$58(ModuleManager var0);

    public native boolean d();

    public native String b(String var1);

    private static native FullBright lambda$create$43(ModuleManager var0);

    private native void lambda$create$0();

    private static native Projectiles lambda$create$80(ModuleManager var0);

    private static native TargetHUD lambda$create$13(ModuleManager var0);

    private static native Sprint lambda$create$2(ModuleManager var0);

    private static native NoSlow lambda$create$18(ModuleManager var0);

    private static native ItemPhysic lambda$create$44(ModuleManager var0);

    private static native SpeedMine lambda$create$9(ModuleManager var0);

    private static native ChestStealer lambda$create$27(ModuleManager var0);

    private static native HClip lambda$create$83(ModuleManager var0);

    private static native AutoPot lambda$create$10(ModuleManager var0);

    public native boolean b();

    private static native KillAura lambda$create$11(ModuleManager var0);

    private static native TabGui lambda$create$56(ModuleManager var0);

    private static native SessionInfo lambda$create$5(ModuleManager var0);

    private static native Freecam lambda$create$55(ModuleManager var0);

    private static native Arrows lambda$create$60(ModuleManager var0);

    private static native NoFall lambda$create$25(ModuleManager var0);

    private static native UhcCrafts lambda$create$92(ModuleManager var0);

    private static native FastPlace lambda$create$48(ModuleManager var0);

    private static native AntiBot lambda$create$8(ModuleManager var0);

    private static native Tracers lambda$create$39(ModuleManager var0);

    private static native Chams lambda$create$22(ModuleManager var0);

    private static native XRay lambda$create$26(ModuleManager var0);

    public native void c();

    private static native Scoreboard lambda$create$7(ModuleManager var0);

    private static native AntiObbyTrap lambda$create$54(ModuleManager var0);

    private static native Scaffold lambda$create$30(ModuleManager var0);

    private static native TargetStrafe lambda$create$85(ModuleManager var0);

    private static native ClickTeleport lambda$create$70(ModuleManager var0);

    private static native BlockOverlay lambda$create$66(ModuleManager var0);

    private static native Wings lambda$create$77(ModuleManager var0);

    private static native StaffAnalyzer lambda$create$73(ModuleManager var0);

    private static native HypixelStats lambda$create$90(ModuleManager var0);

    private static native Glint lambda$create$36(ModuleManager var0);

    private static native InvManager lambda$create$29(ModuleManager var0);

    private static native PlayerESP lambda$create$51(ModuleManager var0);

    private static native FastSneak lambda$create$59(ModuleManager var0);

    private static native MCF lambda$create$37(ModuleManager var0);

    private static native SimsESP lambda$create$81(ModuleManager var0);

    private static native Criticals lambda$create$14(ModuleManager var0);

    private static native AutoTool lambda$create$34(ModuleManager var0);

    private static native MoreBends lambda$create$78(ModuleManager var0);

    private static native Animations lambda$create$35(ModuleManager var0);

    private static native NoTitle lambda$create$69(ModuleManager var0);

    private static native Velocity lambda$create$20(ModuleManager var0);

    private static native AutoClicker lambda$create$46(ModuleManager var0);

    private static native Waypoints lambda$create$53(ModuleManager var0);

    private static native ChestESP lambda$create$23(ModuleManager var0);

    private static native HitBox lambda$create$52(ModuleManager var0);

    private static native AutoHypixel lambda$create$31(ModuleManager var0);

    private static native Respawn lambda$create$40(ModuleManager var0);

    private static native Glow lambda$create$21(ModuleManager var0);

    private static native Crosshair lambda$create$91(ModuleManager var0);

    private static native Disabler lambda$create$75(ModuleManager var0);

    private static native /* synthetic */ void native_special_clinit46();

    private static /* synthetic */ atu invokedynamic$a$90() {
        return Initializer::lambda$create$90;
    }

    private static /* synthetic */ atu invokedynamic$a$10() {
        return Initializer::lambda$create$10;
    }

    private static /* synthetic */ atu invokedynamic$a$54() {
        return Initializer::lambda$create$54;
    }

    private static /* synthetic */ atu invokedynamic$a$53() {
        return Initializer::lambda$create$53;
    }

    private static /* synthetic */ atu invokedynamic$a$52() {
        return Initializer::lambda$create$52;
    }

    private static /* synthetic */ atu invokedynamic$a$51() {
        return Initializer::lambda$create$51;
    }

    private static /* synthetic */ atu invokedynamic$a$50() {
        return Initializer::lambda$create$50;
    }

    private static /* synthetic */ Consumer invokedynamic$a$94(Novoline novoline, String string) {
        return arg_0 -> Initializer.lambda$create$94(novoline, string, arg_0);
    }

    private static /* synthetic */ atu invokedynamic$a$93() {
        return Initializer::lambda$create$93;
    }

    private static /* synthetic */ atu invokedynamic$a$92() {
        return Initializer::lambda$create$92;
    }

    private static /* synthetic */ atu invokedynamic$a$91() {
        return Initializer::lambda$create$91;
    }

    private static /* synthetic */ atu invokedynamic$a$49() {
        return Initializer::lambda$create$49;
    }

    private static /* synthetic */ atu invokedynamic$a$48() {
        return Initializer::lambda$create$48;
    }

    private static /* synthetic */ atu invokedynamic$a$47() {
        return Initializer::lambda$create$47;
    }

    private static /* synthetic */ atu invokedynamic$a$46() {
        return Initializer::lambda$create$46;
    }

    private static /* synthetic */ atu invokedynamic$a$45() {
        return Initializer::lambda$create$45;
    }

    private static /* synthetic */ atu invokedynamic$a$89() {
        return Initializer::lambda$create$89;
    }

    private static /* synthetic */ atu invokedynamic$a$44() {
        return Initializer::lambda$create$44;
    }

    private static /* synthetic */ atu invokedynamic$a$88() {
        return Initializer::lambda$create$88;
    }

    private static /* synthetic */ atu invokedynamic$a$9() {
        return Initializer::lambda$create$9;
    }

    private static /* synthetic */ atu invokedynamic$a$8() {
        return Initializer::lambda$create$8;
    }

    private static /* synthetic */ atu invokedynamic$a$7() {
        return Initializer::lambda$create$7;
    }

    private static /* synthetic */ atu invokedynamic$a$43() {
        return Initializer::lambda$create$43;
    }

    private static /* synthetic */ atu invokedynamic$a$87() {
        return Initializer::lambda$create$87;
    }

    private static /* synthetic */ atu invokedynamic$a$6() {
        return Initializer::lambda$create$6;
    }

    private static /* synthetic */ atu invokedynamic$a$42() {
        return Initializer::lambda$create$42;
    }

    private static /* synthetic */ atu invokedynamic$a$86() {
        return Initializer::lambda$create$86;
    }

    private static /* synthetic */ atu invokedynamic$a$5() {
        return Initializer::lambda$create$5;
    }

    private static /* synthetic */ atu invokedynamic$a$41() {
        return Initializer::lambda$create$41;
    }

    private static /* synthetic */ atu invokedynamic$a$85() {
        return Initializer::lambda$create$85;
    }

    private static /* synthetic */ atu invokedynamic$a$4() {
        return Initializer::lambda$create$4;
    }

    private static /* synthetic */ atu invokedynamic$a$40() {
        return Initializer::lambda$create$40;
    }

    private static /* synthetic */ atu invokedynamic$a$84() {
        return Initializer::lambda$create$84;
    }

    private static /* synthetic */ atu invokedynamic$a$3() {
        return Initializer::lambda$create$3;
    }

    private static /* synthetic */ atu invokedynamic$a$83() {
        return Initializer::lambda$create$83;
    }

    private static /* synthetic */ atu invokedynamic$a$2() {
        return Initializer::lambda$create$2;
    }

    private static /* synthetic */ atu invokedynamic$a$82() {
        return Initializer::lambda$create$82;
    }

    private static /* synthetic */ Runnable invokedynamic$a$1(Initializer initializer) {
        return initializer::lambda$create$1;
    }

    private static /* synthetic */ atu invokedynamic$a$81() {
        return Initializer::lambda$create$81;
    }

    private static /* synthetic */ Runnable invokedynamic$a$0(Initializer initializer) {
        return initializer::lambda$create$0;
    }

    private static /* synthetic */ atu invokedynamic$a$80() {
        return Initializer::lambda$create$80;
    }

    private static /* synthetic */ atu invokedynamic$a$39() {
        return Initializer::lambda$create$39;
    }

    private static /* synthetic */ atu invokedynamic$a$38() {
        return Initializer::lambda$create$38;
    }

    private static /* synthetic */ atu invokedynamic$a$37() {
        return Initializer::lambda$create$37;
    }

    private static /* synthetic */ atu invokedynamic$a$36() {
        return Initializer::lambda$create$36;
    }

    private static /* synthetic */ atu invokedynamic$a$35() {
        return Initializer::lambda$create$35;
    }

    private static /* synthetic */ atu invokedynamic$a$79() {
        return Initializer::lambda$create$79;
    }

    private static /* synthetic */ atu invokedynamic$a$34() {
        return Initializer::lambda$create$34;
    }

    private static /* synthetic */ atu invokedynamic$a$78() {
        return Initializer::lambda$create$78;
    }

    private static /* synthetic */ atu invokedynamic$a$33() {
        return Initializer::lambda$create$33;
    }

    private static /* synthetic */ atu invokedynamic$a$77() {
        return Initializer::lambda$create$77;
    }

    private static /* synthetic */ atu invokedynamic$a$32() {
        return Initializer::lambda$create$32;
    }

    private static /* synthetic */ atu invokedynamic$a$76() {
        return Initializer::lambda$create$76;
    }

    private static /* synthetic */ atu invokedynamic$a$31() {
        return Initializer::lambda$create$31;
    }

    private static /* synthetic */ atu invokedynamic$a$75() {
        return Initializer::lambda$create$75;
    }

    private static /* synthetic */ atu invokedynamic$a$30() {
        return Initializer::lambda$create$30;
    }

    private static /* synthetic */ atu invokedynamic$a$74() {
        return Initializer::lambda$create$74;
    }

    private static /* synthetic */ atu invokedynamic$a$73() {
        return Initializer::lambda$create$73;
    }

    private static /* synthetic */ atu invokedynamic$a$72() {
        return Initializer::lambda$create$72;
    }

    private static /* synthetic */ atu invokedynamic$a$71() {
        return Initializer::lambda$create$71;
    }

    private static /* synthetic */ atu invokedynamic$a$70() {
        return Initializer::lambda$create$70;
    }

    private static /* synthetic */ atu invokedynamic$a$29() {
        return Initializer::lambda$create$29;
    }

    private static /* synthetic */ atu invokedynamic$a$28() {
        return Initializer::lambda$create$28;
    }

    private static /* synthetic */ atu invokedynamic$a$27() {
        return Initializer::lambda$create$27;
    }

    private static /* synthetic */ atu invokedynamic$a$26() {
        return Initializer::lambda$create$26;
    }

    private static /* synthetic */ atu invokedynamic$a$25() {
        return Initializer::lambda$create$25;
    }

    private static /* synthetic */ atu invokedynamic$a$69() {
        return Initializer::lambda$create$69;
    }

    private static /* synthetic */ atu invokedynamic$a$24() {
        return Initializer::lambda$create$24;
    }

    private static /* synthetic */ atu invokedynamic$a$68() {
        return Initializer::lambda$create$68;
    }

    private static /* synthetic */ atu invokedynamic$a$23() {
        return Initializer::lambda$create$23;
    }

    private static /* synthetic */ atu invokedynamic$a$67() {
        return Initializer::lambda$create$67;
    }

    private static /* synthetic */ atu invokedynamic$a$22() {
        return Initializer::lambda$create$22;
    }

    private static /* synthetic */ atu invokedynamic$a$66() {
        return Initializer::lambda$create$66;
    }

    private static /* synthetic */ atu invokedynamic$a$21() {
        return Initializer::lambda$create$21;
    }

    private static /* synthetic */ atu invokedynamic$a$65() {
        return Initializer::lambda$create$65;
    }

    private static /* synthetic */ atu invokedynamic$a$20() {
        return Initializer::lambda$create$20;
    }

    private static /* synthetic */ atu invokedynamic$a$64() {
        return Initializer::lambda$create$64;
    }

    private static /* synthetic */ atu invokedynamic$a$63() {
        return Initializer::lambda$create$63;
    }

    private static /* synthetic */ atu invokedynamic$a$62() {
        return Initializer::lambda$create$62;
    }

    private static /* synthetic */ atu invokedynamic$a$61() {
        return Initializer::lambda$create$61;
    }

    private static /* synthetic */ atu invokedynamic$a$60() {
        return Initializer::lambda$create$60;
    }

    private static /* synthetic */ atu invokedynamic$a$18() {
        return Initializer::lambda$create$18;
    }

    private static /* synthetic */ atu invokedynamic$a$17() {
        return Initializer::lambda$create$17;
    }

    private static /* synthetic */ atu invokedynamic$a$16() {
        return Initializer::lambda$create$16;
    }

    private static /* synthetic */ atu invokedynamic$a$15() {
        return Initializer::lambda$create$15;
    }

    private static /* synthetic */ atu invokedynamic$a$59() {
        return Initializer::lambda$create$59;
    }

    private static /* synthetic */ atu invokedynamic$a$14() {
        return Initializer::lambda$create$14;
    }

    private static /* synthetic */ atu invokedynamic$a$58() {
        return Initializer::lambda$create$58;
    }

    private static /* synthetic */ atu invokedynamic$a$13() {
        return Initializer::lambda$create$13;
    }

    private static /* synthetic */ atu invokedynamic$a$57() {
        return Initializer::lambda$create$57;
    }

    private static /* synthetic */ atu invokedynamic$a$12() {
        return Initializer::lambda$create$12;
    }

    private static /* synthetic */ atu invokedynamic$a$56() {
        return Initializer::lambda$create$56;
    }

    private static /* synthetic */ atu invokedynamic$a$11() {
        return Initializer::lambda$create$11;
    }

    private static /* synthetic */ atu invokedynamic$a$55() {
        return Initializer::lambda$create$55;
    }

    private static /* synthetic */ atu invokedynamic$a$19() {
        return Initializer::lambda$create$19;
    }
}


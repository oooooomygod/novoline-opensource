/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package deobf;

import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.exploits.NoFall;
import cc.novoline.modules.player.*;
import cc.novoline.modules.visual.SessionInfo;
import cc.novoline.modules.combat.*;
import cc.novoline.modules.exploits.Blink;
import cc.novoline.modules.exploits.Disabler;
import cc.novoline.modules.misc.AutoHypixel;
import cc.novoline.modules.misc.AutoTool;
import cc.novoline.modules.misc.ChatFutures;
import cc.novoline.modules.misc.Train;
import cc.novoline.modules.move.*;
import cc.novoline.modules.visual.*;
import deobf.NameTags;
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
import net.aen_2;
import net.jc_0;
import org.jetbrains.annotations.NotNull;

public class ModuleRegistry
extends Enum<ModuleRegistry> {
    public static /* enum */ ModuleRegistry NOTITLE;
    public static /* enum */ ModuleRegistry INVMANAGER;
    public static /* enum */ ModuleRegistry RESPAWN;
    public static /* enum */ ModuleRegistry REACH;
    public static /* enum */ ModuleRegistry ATMOSPHERE;
    public static /* enum */ ModuleRegistry AUTOTOOL;
    public static /* enum */ ModuleRegistry FREECAM;
    public static /* enum */ ModuleRegistry FASTPLACE;
    private AbstractModule b;
    public static /* enum */ ModuleRegistry AUTOCLICKER;
    public static /* enum */ ModuleRegistry HUD;
    public static /* enum */ ModuleRegistry NAMETAGS;
    public static /* enum */ ModuleRegistry CHATFUTURES;
    public static /* enum */ ModuleRegistry NOSLOWDOWN;
    public static /* enum */ ModuleRegistry SCAFFOLD;
    public static /* enum */ ModuleRegistry GAMESPEED;
    public static /* enum */ ModuleRegistry BLINK;
    public static /* enum */ ModuleRegistry OPTIMIZATIONS;
    public static /* enum */ ModuleRegistry AIMASSIST;
    public static /* enum */ ModuleRegistry TARGETSTRAFE;
    public static /* enum */ ModuleRegistry RADAR;
    public static /* enum */ ModuleRegistry NOJUMPDELAY;
    public static /* enum */ ModuleRegistry DMGPARTICLES;
    public static /* enum */ ModuleRegistry CHESTSTEALER;
    public static /* enum */ ModuleRegistry BEDBREAKER;
    public static /* enum */ ModuleRegistry ITEMPHYSIC;
    public static /* enum */ ModuleRegistry SAFEWALK;
    public static /* enum */ ModuleRegistry CLICKGUI;
    public static /* enum */ ModuleRegistry PHASE;
    public static /* enum */ ModuleRegistry GLOW;
    public static /* enum */ ModuleRegistry UHCCRAFTS;
    public static /* enum */ ModuleRegistry AUTOARMOR;
    public static /* enum */ ModuleRegistry STEP;
    public static /* enum */ ModuleRegistry GLINTCOLORIZE;
    public static /* enum */ ModuleRegistry AUTOGAPPLE;
    public static /* enum */ ModuleRegistry ARROWS;
    private static int[] c;
    public static /* enum */ ModuleRegistry SESSION;
    public static /* enum */ ModuleRegistry PLAYERSFINDER;
    public static /* enum */ ModuleRegistry HCLIP;
    public static /* enum */ ModuleRegistry CUSTOMHITGLINT;
    public static /* enum */ ModuleRegistry SPEEDMINE;
    public static /* enum */ ModuleRegistry MIDDLECLICK;
    public static /* enum */ ModuleRegistry LIGHTNINGTRECKER;
    public static /* enum */ ModuleRegistry ANIMATIONS;
    public static /* enum */ ModuleRegistry JUMPCIRCLE;
    public static /* enum */ ModuleRegistry ANTIALTS;
    public static /* enum */ ModuleRegistry TRACERS;
    public static /* enum */ ModuleRegistry AUTOPOT;
    public static /* enum */ ModuleRegistry ANTIOBBYTRAP;
    public static /* enum */ ModuleRegistry ANTIBOT;
    public static /* enum */ ModuleRegistry MOBENDS;
    public static /* enum */ ModuleRegistry VELOCITY;
    public static /* enum */ ModuleRegistry SIMSESP;
    public static /* enum */ ModuleRegistry CHESTESP;
    public static /* enum */ ModuleRegistry DISABLER;
    public static /* enum */ ModuleRegistry BREADCRUMBS;
    public static /* enum */ ModuleRegistry CAMERA;
    public static /* enum */ ModuleRegistry TRAIN;
    public static /* enum */ ModuleRegistry FLY;
    public static /* enum */ ModuleRegistry PROJECTILES;
    public static /* enum */ ModuleRegistry PLAYERESP;
    public static /* enum */ ModuleRegistry ITEMESP;
    public static /* enum */ ModuleRegistry HYPIXELSTATS;
    public static /* enum */ ModuleRegistry CROSSHAIR;
    public static /* enum */ ModuleRegistry SPEED;
    public static /* enum */ ModuleRegistry CHAMS;
    public static /* enum */ ModuleRegistry WAYPOINTS;
    public static /* enum */ ModuleRegistry CRITICALS;
    public static /* enum */ ModuleRegistry NOEFFECTS;
    public static /* enum */ ModuleRegistry BRIGHTNESS;
    public static /* enum */ ModuleRegistry TARGETHUD;
    public static /* enum */ ModuleRegistry BLOCKSOVERLAY;
    public static /* enum */ ModuleRegistry CLICKTELEPORT;
    public static /* enum */ ModuleRegistry GUIMOVE;
    public static /* enum */ ModuleRegistry FASTSNEAK;
    public static /* enum */ ModuleRegistry HITBOX;
    public static /* enum */ ModuleRegistry KILLAURA;
    public static /* enum */ ModuleRegistry ANTIVOID;
    public static /* enum */ ModuleRegistry NOFALL;
    public static /* enum */ ModuleRegistry LONGJUMP;
    public static /* enum */ ModuleRegistry SCOREBOARD;
    public static /* enum */ ModuleRegistry NOROTATE;
    public static /* enum */ ModuleRegistry TABGUI;
    public static /* enum */ ModuleRegistry SPRINT;
    public static /* enum */ ModuleRegistry XRAY;
    private static /* synthetic */ ModuleRegistry[] a;
    public static /* enum */ ModuleRegistry AUTOHEAD;
    public static /* enum */ ModuleRegistry STAFFANALYZER;
    public static /* enum */ ModuleRegistry WINGS;
    public static /* enum */ ModuleRegistry AUTOHYPIXEL;
    public static /* enum */ ModuleRegistry WATERWALK;

    public static void b(int[] nArray) {
        c = nArray;
    }

    public static int[] b() {
        return c;
    }

    private ModuleRegistry(Class<? extends AbstractModule> clazz) {
        this.b = aen_2.a(NovolineInvoker.l(NovolineInvoker.getInstance()), clazz);
    }

    @NotNull
    public <Module extends AbstractModule> Module a() {
        return (Module)this.b;
    }

    static {
        HUD = new ModuleRegistry(HUD.class);
        SPRINT = new ModuleRegistry(Sprint.class);
        CLICKGUI = new ModuleRegistry(ClickGui.class);
        SESSION = new ModuleRegistry(SessionInfo.class);
        RADAR = new ModuleRegistry(Radar.class);
        SCOREBOARD = new ModuleRegistry(Scoreboard.class);
        ANTIBOT = new ModuleRegistry(AntiBot.class);
        SPEEDMINE = new ModuleRegistry(SpeedMine.class);
        AUTOPOT = new ModuleRegistry(AutoPot.class);
        KILLAURA = new ModuleRegistry(KillAura.class);
        CRITICALS = new ModuleRegistry(Criticals.class);
        REACH = new ModuleRegistry(Reach.class);
        STEP = new ModuleRegistry(Step.class);
        WATERWALK = new ModuleRegistry(WaterWalk.class);
        NOSLOWDOWN = new ModuleRegistry(NoSlow.class);
        SPEED = new ModuleRegistry(Speed.class);
        VELOCITY = new ModuleRegistry(Velocity.class);
        GLOW = new ModuleRegistry(Glow.class);
        CHAMS = new ModuleRegistry(Chams.class);
        CHESTESP = new ModuleRegistry(ChestESP.class);
        NAMETAGS = new ModuleRegistry(NameTags.class);
        NOFALL = new ModuleRegistry(NoFall.class);
        XRAY = new ModuleRegistry(XRay.class);
        CHESTSTEALER = new ModuleRegistry(ChestStealer.class);
        SCAFFOLD = new ModuleRegistry(Scaffold.class);
        AUTOARMOR = new ModuleRegistry(AutoArmor.class);
        INVMANAGER = new ModuleRegistry(InvManager.class);
        AUTOHYPIXEL = new ModuleRegistry(AutoHypixel.class);
        GUIMOVE = new ModuleRegistry(GuiMove.class);
        PHASE = new ModuleRegistry(Phase.class);
        AUTOTOOL = new ModuleRegistry(AutoTool.class);
        ANIMATIONS = new ModuleRegistry(Animations.class);
        GLINTCOLORIZE = new ModuleRegistry(Glint.class);
        MIDDLECLICK = new ModuleRegistry(MCF.class);
        DMGPARTICLES = new ModuleRegistry(DMGParticles.class);
        TRACERS = new ModuleRegistry(Tracers.class);
        RESPAWN = new ModuleRegistry(Respawn.class);
        BLINK = new ModuleRegistry(Blink.class);
        NOEFFECTS = new ModuleRegistry(NoEffects.class);
        BRIGHTNESS = new ModuleRegistry(FullBright.class);
        ITEMPHYSIC = new ModuleRegistry(ItemPhysic.class);
        ITEMESP = new ModuleRegistry(ItemESP.class);
        AUTOCLICKER = new ModuleRegistry(AutoClicker.class);
        AIMASSIST = new ModuleRegistry(AimAssist.class);
        FASTPLACE = new ModuleRegistry(FastPlace.class);
        PLAYERSFINDER = new ModuleRegistry(PlayersFinder.class);
        ATMOSPHERE = new ModuleRegistry(Atomsphere.class);
        PLAYERESP = new ModuleRegistry(PlayerESP.class);
        ModuleRegistry.b(new int[4]);
        HITBOX = new ModuleRegistry(HitBox.class);
        WAYPOINTS = new ModuleRegistry(Waypoints.class);
        ANTIOBBYTRAP = new ModuleRegistry(AntiObbyTrap.class);
        FREECAM = new ModuleRegistry(Freecam.class);
        TABGUI = new ModuleRegistry(TabGui.class);
        LIGHTNINGTRECKER = new ModuleRegistry(LightingTracker.class);
        CAMERA = new ModuleRegistry(Camera.class);
        FASTSNEAK = new ModuleRegistry(FastSneak.class);
        ARROWS = new ModuleRegistry(Arrows.class);
        BEDBREAKER = new ModuleRegistry(BedBreaker.class);
        FLY = new ModuleRegistry(Fly.class);
        ANTIVOID = new ModuleRegistry(AntiVoid.class);
        LONGJUMP = new ModuleRegistry(LongJump.class);
        ANTIALTS = new ModuleRegistry(AntiAlts.class);
        BLOCKSOVERLAY = new ModuleRegistry(BlockOverlay.class);
        GAMESPEED = new ModuleRegistry(GameSpeed.class);
        NOROTATE = new ModuleRegistry(NoRotate.class);
        NOTITLE = new ModuleRegistry(NoTitle.class);
        CLICKTELEPORT = new ModuleRegistry(ClickTeleport.class);
        JUMPCIRCLE = new ModuleRegistry(JumpCircle.class);
        CUSTOMHITGLINT = new ModuleRegistry(CustomHit.class);
        STAFFANALYZER = new ModuleRegistry(StaffAnalyzer.class);
        TRAIN = new ModuleRegistry(Train.class);
        DISABLER = new ModuleRegistry(Disabler.class);
        AUTOHEAD = new ModuleRegistry(AutoHead.class);
        WINGS = new ModuleRegistry(Wings.class);
        MOBENDS = new ModuleRegistry(MoreBends.class);
        OPTIMIZATIONS = new ModuleRegistry(Optimization.class);
        PROJECTILES = new ModuleRegistry(Projectiles.class);
        SIMSESP = new ModuleRegistry(SimsESP.class);
        BREADCRUMBS = new ModuleRegistry(BreadCrumbs.class);
        HCLIP = new ModuleRegistry(HClip.class);
        CHATFUTURES = new ModuleRegistry(ChatFutures.class);
        TARGETSTRAFE = new ModuleRegistry(TargetStrafe.class);
        TARGETHUD = new ModuleRegistry(TargetHUD.class);
        NOJUMPDELAY = new ModuleRegistry(NoJumpDelay.class);
        SAFEWALK = new ModuleRegistry(SafeWalk.class);
        AUTOGAPPLE = new ModuleRegistry(AutoGApple.class);
        HYPIXELSTATS = new ModuleRegistry(HypixelStats.class);
        CROSSHAIR = new ModuleRegistry(Crosshair.class);
        UHCCRAFTS = new ModuleRegistry(UhcCrafts.class);
        a = new ModuleRegistry[]{HUD, SPRINT, CLICKGUI, SESSION, RADAR, SCOREBOARD, ANTIBOT, SPEEDMINE, AUTOPOT, KILLAURA, CRITICALS, REACH, STEP, WATERWALK, NOSLOWDOWN, SPEED, VELOCITY, GLOW, CHAMS, CHESTESP, NAMETAGS, NOFALL, XRAY, CHESTSTEALER, SCAFFOLD, AUTOARMOR, INVMANAGER, AUTOHYPIXEL, GUIMOVE, PHASE, AUTOTOOL, ANIMATIONS, GLINTCOLORIZE, MIDDLECLICK, DMGPARTICLES, TRACERS, RESPAWN, BLINK, NOEFFECTS, BRIGHTNESS, ITEMPHYSIC, ITEMESP, AUTOCLICKER, AIMASSIST, FASTPLACE, PLAYERSFINDER, ATMOSPHERE, PLAYERESP, HITBOX, WAYPOINTS, ANTIOBBYTRAP, FREECAM, TABGUI, LIGHTNINGTRECKER, CAMERA, FASTSNEAK, ARROWS, BEDBREAKER, FLY, ANTIVOID, LONGJUMP, ANTIALTS, BLOCKSOVERLAY, GAMESPEED, NOROTATE, NOTITLE, CLICKTELEPORT, JUMPCIRCLE, CUSTOMHITGLINT, STAFFANALYZER, TRAIN, DISABLER, AUTOHEAD, WINGS, MOBENDS, OPTIMIZATIONS, PROJECTILES, SIMSESP, BREADCRUMBS, HCLIP, CHATFUTURES, TARGETSTRAFE, TARGETHUD, NOJUMPDELAY, SAFEWALK, AUTOGAPPLE, HYPIXELSTATS, CROSSHAIR, UHCCRAFTS};
    }

    public static ModuleRegistry[] values() {
        return (ModuleRegistry[])a.clone();
    }

    public static ModuleRegistry valueOf(String string) {
        return (ModuleRegistry)jc_0.a(ModuleRegistry.class, string);
    }
}


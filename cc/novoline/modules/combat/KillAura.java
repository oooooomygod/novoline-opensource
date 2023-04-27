/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectListIterator
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.combat;

import cc.novoline.events.EventTarget;
import cc.novoline.events.State;
import cc.novoline.events.events.LoadWorldEvent;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.events.PacketEvent;
import cc.novoline.events.events.Render3DEvent;
import cc.novoline.events.events.SettingEvent;
import cc.novoline.events.events.SlowdownEvent;
import cc.novoline.events.events.TickUpdateEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.C08PacketPlayerBlockPlacementInvoker;
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.GameSettingsInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.PacketEventInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.exploits.Blink;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import cc.novoline.modules.EnumModuleType;
import deobf.EnumPlayerType;
import deobf.IntProperty;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import deobf.ModuleRegistry;
import net.minecraft.util.MovingObjectPosition;
import deobf.Packet;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import cc.novoline.modules.move.Speed;
import cc.novoline.modules.move.Sprint;
import deobf.TimerUtil;
import deobf.Vec3;
import net.minecraft.network.packts.C02PacketUseEntity;
import net.minecraft.network.packts.C02PacketUseEntity$Action;
import net.minecraft.network.packts.C07PacketPlayerDigging;
import net.minecraft.network.packts.C07PacketPlayerDigging$Action;
import net.minecraft.network.packts.C08PacketPlayerBlockPlacement;
import net.minecraft.network.packts.C0APacketAnimation;
import net.minecraft.network.packts.S45PacketTitle;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;

import org.checkerframework.checker.nullness.qual.NonNull;


public class KillAura
extends AbstractModule {
    @Property(value="show-target-settings")
    private BooleanProperty aB;
    private boolean aD;
    @Property(value="show-combat-settings")
    private BooleanProperty av;
    @Property(value="esp-color-type")
    private StringProperty M;
    @Property(value="targets")
    private ListProperty<String> ai;
    @Property(value="esp-color")
    private eu_0 ax;
    @Property(value="auto-block-mode")
    private StringProperty aq;
    private float ao;
    @Property(value="auto-disable")
    private BooleanProperty N;
    private static String[] eb;
    @Property(value="assistance")
    private BooleanProperty at;
    @Property(value="show-rotations-settings")
    private BooleanProperty W;
    private float az;
    @Property(value="ticks-existed")
    private IntProperty J;
    private static long bb;
    private static String[] cb;
    private float S;
    private int aE;
    @Property(value="no-swing")
    private BooleanProperty T;
    private long aw;
    @Property(value="rotations-mode")
    private StringProperty ar;
    @Property(value="aura-sort")
    private StringProperty U;
    @Property(value="enchant-particles")
    private BooleanProperty Z;
    @Property(value="prediction")
    private BooleanProperty R;
    @Property(value="range")
    private DoubleProperty ag;
    @Property(value="max-targets")
    private IntProperty aG;
    @Property(value="ray-trace")
    private BooleanProperty ak;
    private List<Entity> ay;
    @Property(value="auto-block")
    private BooleanProperty aH;
    @Property(value="block-range")
    private DoubleProperty as;
    private TimerUtil aC;
    private TimerUtil aA;
    @Property(value="fov-check")
    private IntProperty V;
    private float H;
    private agm_1 ab;
    @Property(value="min-aps")
    private IntProperty al;
    @Property(value="target-esp")
    private BooleanProperty X;
    private float Q;
    @Property(value="max-aps")
    private IntProperty ah;
    @Property(value="show-assistance-settings")
    private BooleanProperty ad;
    @Property(value="wall-range")
    private DoubleProperty aj;
    @Property(value="show-render-settings")
    private BooleanProperty au;
    @Property(value="critical-particles")
    private BooleanProperty am;
    private static int[] af;
    @Property(value="attack-method")
    private StringProperty K;
    private float L;
    @Property(value="filters")
    private ListProperty<String> Y;
    @Property(value="rotations")
    private BooleanProperty aF;
    @Property(value="server-lag-check")
    private BooleanProperty ae;
    @Property(value="show-autoblock-settings")
    private BooleanProperty ac;
    private Entity P;
    @Property(value="show-features-settings")
    private BooleanProperty O;
    private TimerUtil aa;
    @Property(value="max-angle")
    private IntProperty an;
    @Property(value="switch-delay")
    private IntProperty I;
    @Property(value="mode")
    private StringProperty ap;
    private static Map ib;

    private void lambda$sendAttack$16(Entity entity) {
        KillAura.w();
        if (auk_2.a((Boolean)Ba.b(this.am))) {
            PlayerInvoker.a(this.mc.player, entity);
        }
        if (auk_2.a((Boolean)Ba.b(this.Z))) {
            PlayerInvoker.c(this.mc.player, entity);
        }
    }

    private Boolean lambda$new$0() {
        return auk_2.b(StringPropertyInvoker.isMode(this.ap, KZ.L));
    }

    public float u() {
        return this.Q;
    }

    private boolean J() {
        KillAura.w();
        return PlayerInvoker.h(this.mc.player) != null && act_2.k(PlayerInvoker.h(this.mc.player)) instanceof ItemBow && GameSettingsInvoker.e(this.mc.gameSettings.aj);
    }

    @EventTarget
    public void a(SlowdownEvent slowdownEvent) {
        if (this.n()) {
            all_1.a(slowdownEvent, true);
        }
    }

    private static Float lambda$getEntityList$20(Entity entity) {
        return axx_1.a(atn_0.c((EntityLivingBase)entity));
    }

    private boolean lambda$getTargetsFromRange$22(Entity entity) {
        KillAura.w();
        return (double)PlayerInvoker.b(this.mc.player, entity) <= this.a();
    }

    public static void b(int[] nArray) {
        af = nArray;
    }

    @EventTarget
    public void a(PacketEvent packetEvent) {
        block8: {
            Packet<INetHandlerPlayServer> packet;
            block7: {
                KillAura.w();
                if (PacketEventInvoker.getState(packetEvent) != State.OUTGOING) break block7;
                if (PacketEventInvoker.c(packetEvent) instanceof C07PacketPlayerDigging) {
                    packet = (C07PacketPlayerDigging)PacketEventInvoker.c(packetEvent);
                    if (this.n() && atq_0.b(packet) == C07PacketPlayerDigging$Action.RELEASE_USE_ITEM) {
                        PacketEventInvoker.setCancelled(packetEvent, true);
                    }
                }
                if (!(PacketEventInvoker.c(packetEvent) instanceof C08PacketPlayerBlockPlacement)) break block8;
                packet = (C08PacketPlayerBlockPlacement)PacketEventInvoker.c(packetEvent);
                if (this.n() && C08PacketPlayerBlockPlacementInvoker.b((C08PacketPlayerBlockPlacement)packet) == 255 && C08PacketPlayerBlockPlacementInvoker.e((C08PacketPlayerBlockPlacement)packet) != null && act_2.k(C08PacketPlayerBlockPlacementInvoker.e((C08PacketPlayerBlockPlacement)packet)) instanceof LC) {
                    PacketEventInvoker.setCancelled(packetEvent, true);
                }
            }
            qh_1.b(this.aa);
            if (PacketEventInvoker.c(packetEvent) instanceof S45PacketTitle && aBO.a(avj_1.e((S45PacketTitle)(packet = (S45PacketTitle)PacketEventInvoker.c(packetEvent)))).equals(KZ.al)) {
                this.a(this.r(), KZ.B, 2000, NotificationType.WARNING);
                this.d();
            }
        }
    }

    @EventTarget
    public void b(MotionUpdateEvent motionUpdateEvent) {
        KillAura.w();
        if (EventInvoker.getState(motionUpdateEvent) == cc.novoline.events.type.State.PRE) {
            if (this.r() > 0) {
                this.ay = this.H();
            }
            this.ay = this.a((String)StringPropertyInvoker.b(this.U));
            if (this.P != null && !ayj_0.a(this.P)) {
                this.P = null;
            }
            if (this.ay == null) {
                return;
            }
            if (StringPropertyInvoker.isMode(this.ap, KZ.m)) {
                this.P = (Entity)ListInvoker.get(this.ay, 0);
                return;
            }
            if (qh_1.c(this.aA, P8.b((Integer)adt_2.a(this.I)))) {
                this.t();
            }
            if (!this.a(this.B().equals(KZ.am))) {
                if (this.P != null) {
                    if ((double)PlayerInvoker.b(this.mc.player, this.P) > this.a() && this.r() > 0) {
                        this.P = this.v();
                    }
                    if ((double)PlayerInvoker.b(this.mc.player, this.P) > this.U()) {
                        this.P = null;
                        this.t();
                    }
                    if (!ayj_0.a(this.P) && atn_0.c((EntityLivingBase)this.P) <= 0.0f) {
                        this.P = null;
                        this.t();
                    }
                    if (this.B().equals(KZ.T)) {
                        this.P = (Entity)ListInvoker.get(this.ay, this.aE);
                    }
                    return;
                }
                this.P = (Entity)ListInvoker.get(this.ay, this.B().equals(KZ.z) ? this.aE : 0);
                return;
            }
            Iterator iterator = ListInvoker.iterator(this.ay);
            if (dz_0.c(iterator)) {
                Entity entity = (Entity)dz_0.b(iterator);
                if (a8F.a(NovolineInvoker.A(this.novoline), entity.getName(), EnumPlayerType.TARGET)) {
                    this.P = entity;
                }
            }
        }
    }

    private Float lambda$getEntityList$18(Entity entity) {
        return axx_1.a(ayj_0.d(entity, this.mc.player));
    }

    private Boolean lambda$new$12() {
        KillAura.w();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.at)) && auk_2.a((Boolean)Ba.b(this.ad)));
    }

    private double b(Entity entity) {
        KillAura.w();
        float[] fArray = this.d(entity);
        float f = (int)fArray[0];
        return this.mc.player.rotationYaw > f ? (double)(this.mc.player.rotationYaw - f) : (double)(f - this.mc.player.rotationYaw);
    }

    public StringProperty o() {
        return this.U;
    }

    private int r() {
        Entity entity;
        KillAura.w();
        int n = 0;
        if (ListInvoker.isEmpty(this.a((String)StringPropertyInvoker.b(this.U)))) {
            return 0;
        }
        Iterator iterator = ListInvoker.iterator(this.a((String)StringPropertyInvoker.b(this.U)));
        if (dz_0.c(iterator) && (double)PlayerInvoker.b(this.mc.player, entity = (Entity)dz_0.b(iterator)) <= this.a()) {
            ++n;
        }
        return n;
    }

    private void lambda$sendAttack$14(Entity entity) {
        this.a(new C02PacketUseEntity(entity, C02PacketUseEntity$Action.ATTACK));
    }

    private void h() {
        KillAura.w();
        if (auk_2.a((Boolean)Ba.b(this.T))) {
            this.a(new C0APacketAnimation());
        }
        this.mc.player.Z();
    }

    private boolean F() {
        KillAura.w();
        return auk_2.a((Boolean)Ba.b(this.ae)) && qh_1.c(this.aa, 100L);
    }

    private boolean lambda$getTargetsFromBlockRange$23(double d, Entity entity) {
        KillAura.w();
        return (double)PlayerInvoker.b(this.mc.player, entity) <= d;
    }

    private double a() {
        return db_0.b((Double)MD.b(this.ag));
    }

    private float a(float f) {
        return 0.0f;
    }

    private boolean a(Entity entity) {
        KillAura.w();
        return (double)PlayerInvoker.b(this.mc.player, entity) <= (PlayerInvoker.e(this.mc.player, entity) ? MathInvoker.d(this.a(), this.U()) : this.E());
    }

    private void t() {
        this.aE = (this.aE + 1) % ListInvoker.size(this.ay);
        qh_1.b(this.aA);
    }

    private int a(Entity entity, int n) {
        KillAura.w();
        if (StringPropertyInvoker.isMode(this.M, KZ.ab)) {
            return hb_2.a((long)n);
        }
        if (StringPropertyInvoker.isMode(this.M, KZ.G)) {
            return P8.b(aUL.f(this.ax));
        }
        if (entity instanceof EntityPlayer) {
            EntityPlayer entityPlayer = (EntityPlayer)entity;
            return aol_1.b(pl_1.a(entityPlayer));
        }
        return hb_2.a(asx_1.WHITE);
    }

    public ListProperty<String> K() {
        return this.Y;
    }

    private boolean lambda$isContainsTarget$17(Entity entity) {
        KillAura.w();
        return (double)PlayerInvoker.b(this.mc.player, entity) < this.a();
    }

    public StringProperty j() {
        return this.aq;
    }

    @EventTarget
    public void a(LoadWorldEvent loadWorldEvent) {
        KillAura.w();
        if (auk_2.a((Boolean)Ba.b(this.N))) {
            this.a(this.r(), KZ.h, 3000, NotificationType.WARNING);
            this.d();
        }
    }

    private Boolean lambda$new$11() {
        KillAura.w();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.at)) && auk_2.a((Boolean)Ba.b(this.ad)));
    }

    private float[] d(Entity entity) {
        return null;
    }

    public boolean c(@NonNull Entity entity) {
        KillAura.w();
        if (ayj_0.a(entity) && (!ayj_0.L(entity) || ava_0.b(this.ai, KZ.P))) {
            if (entity instanceof ne_2 || entity instanceof ny_1 || entity instanceof np_1) {
                return ava_0.b(this.ai, KZ.V);
            }
            if (entity instanceof n5_0 || entity instanceof nz_0) {
                return ava_0.b(this.ai, KZ.j);
            }
            if (entity instanceof EntityPlayer) {
                return !(!ava_0.b(this.ai, KZ.aa) || entity == this.mc.player || a8F.a(NovolineInvoker.A(this.novoline), entity.getName(), EnumPlayerType.FRIEND) || ava_0.b(this.Y, KZ.i) && !this.a((EntityPlayer)entity) || ava_0.b(this.Y, KZ.k) && pl_1.b(entity));
            }
        }
        return false;
    }

    private boolean a(BlockPos blockPos) {
        KillAura.w();
        Block block = BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, blockPos));
        return block == Blocks.ab || block == Blocks.aq || block == Blocks.R || block == Blocks.g || block == Blocks.aA || block == Blocks.ag || block == Blocks.t || block == Blocks.aB;
    }

    public IntProperty x() {
        return this.al;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(String ... stringArray) {
        KillAura.w();
        Blink blink = (Blink)ModuleInvoker.isEnable(ModuleRegistry.BLINK);
        boolean bl = blink.x() && StringPropertyInvoker.isMode(blink.b(), KZ.Y);
        if (!this.x()) return false;
        if (!StringPropertyInvoker.a(this.aq, stringArray)) return false;
        if (this.a(ModuleRegistry.SCAFFOLD)) return false;
        if (!auk_2.a((Boolean)Ba.b(this.aH))) return false;
        if (this.P == null) return false;
        if (!ayj_0.a(this.P)) return false;
        if (!this.e()) return false;
        if (!this.y()) return false;
        if (PlayerInvoker.h(this.mc.player) == null) return false;
        if (!(act_2.k(PlayerInvoker.h(this.mc.player)) instanceof LC)) return false;
        double d = PlayerInvoker.b(this.mc.player, this.P);
        double d2 = PlayerInvoker.e(this.mc.player, this.P) ? this.U() : this.E();
        if (!(d <= d2)) return false;
        return true;
    }

    public StringProperty N() {
        return this.ap;
    }

    private Boolean lambda$new$10() {
        KillAura.w();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.X)) && auk_2.a((Boolean)Ba.b(this.au)) && StringPropertyInvoker.isMode(this.M, KZ.d));
    }

    private boolean a(@NonNull EntityPlayer entityPlayer) {
        KillAura.w();
        return entityPlayer.inventory.d[0] != null || entityPlayer.inventory.d[1] != null || entityPlayer.inventory.d[2] != null || entityPlayer.inventory.d[3] != null;
    }

    public Entity C() {
        return this.P;
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x6D4A;
        if (eb[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])ib.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                ib.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a01", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return eb[n2];
    }

    public BooleanProperty S() {
        return this.aH;
    }

    private static String b(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    public IntProperty P() {
        return this.V;
    }

    private static boolean lambda$sendAttack$15(Entity entity) {
        return entity instanceof EntityPlayer;
    }

    public void f(Entity entity) {
        this.P = entity;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a01" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private boolean y() {
        KillAura.w();
        if (this.P != null) {
            float[] fArray = akv_0.b(this.P);
            int n = (int)fArray[1];
            int n2 = (int)fArray[0];
            int n3 = (int)this.mc.player.rotationYaw;
            int n4 = (int)this.mc.player.rotationPitch;
            int n5 = MathInvoker.a(n3 - n2);
            int n6 = MathInvoker.a(n4 - n);
            TargetStrafe targetStrafe = (TargetStrafe)ModuleInvoker.isEnable(ModuleRegistry.TARGETSTRAFE);
            return n5 <= P8.b((Integer)adt_2.a(this.V)) && n6 <= P8.b((Integer)adt_2.a(this.V)) || azd_2.a(targetStrafe, false) && this.a(ModuleRegistry.FLY);
        }
        return false;
    }

    private Boolean lambda$new$9() {
        KillAura.w();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.X)) && auk_2.a((Boolean)Ba.b(this.au)));
    }

    private void a(List<Entity> list) {
        KillAura.w();
        if (fo_0.a(fo_0.a()) > 47) {
            ListInvoker.forEach(list, this::lambda$sendAttack$13);
            this.h();
        }
        this.h();
        ListInvoker.forEach(list, this::lambda$sendAttack$14);
        if (aMF.c(ListInvoker.stream(this.H()), KillAura::lambda$sendAttack$15)) {
            this.a((Sprint)ModuleInvoker.isEnable(ModuleRegistry.SPRINT));
        }
        ListInvoker.forEach(this.H(), this::lambda$sendAttack$16);
    }

    private void a(Sprint sprint) {
        KillAura.w();
        if (!sprint.x() || !adk_0.b(sprint)) {
            this.mc.player.motionX *= 0.6;
            this.mc.player.motionZ *= 0.6;
            PlayerInvoker.c(this.mc.player, false);
        }
    }

    private static Integer lambda$getEntityList$21(Entity entity) {
        return P8.d(entity.hurtResistantTime);
    }

    private Float lambda$getEntityList$19(Entity entity) {
        return axx_1.a(entity instanceof EntityPlayer ? this.a(((EntityPlayer)entity).inventory.d) : 99999.0f);
    }

    private float a(ItemStack[] itemStackArray) {
        KillAura.w();
        float f = 0.0f;
        ItemStack[] itemStackArray2 = itemStackArray;
        int n = itemStackArray2.length;
        int n2 = 0;
        if (n2 < n) {
            ItemStack itemStack = itemStackArray2[n2];
            if (act_2.k(itemStack) instanceof ItemArmor) {
                ItemArmor itemArmor = (ItemArmor)act_2.k(itemStack);
                f = (float)((double)f + ((double)itemArmor.o + (double)((100 - itemArmor.o) * alf_0.a(yl_2.x.c, itemStack)) * 0.0075));
                f = (float)((double)f + (double)alf_0.a(yl_2.D.c, itemStack) / 100.0);
                f = (float)((double)f + (double)alf_0.a(yl_2.o.c, itemStack) / 100.0);
                f = (float)((double)f + (double)alf_0.a(yl_2.h.c, itemStack) / 100.0);
                f = (float)((double)f + (double)alf_0.a(yl_2.k.c, itemStack) / 50.0);
                f = (float)((double)f + (double)alf_0.a(yl_2.v.c, itemStack) / 100.0);
            }
            ++n2;
        }
        return f;
    }

    public float L() {
        return this.S;
    }

    public void g() {
        KillAura.w();
        if (qh_1.c(this.aC, this.aw)) {
            if (StringPropertyInvoker.isMode(this.ap, KZ.I)) {
                this.a(this.H());
            }
            this.e(this.P);
            this.aw = 1000L / (long)anf_2.a(anf_2.c(), P8.b((Integer)adt_2.a(this.al)), P8.b((Integer)adt_2.a(this.ah)) + 1);
            qh_1.b(this.aC);
        }
    }

    static {
        bb = a1c.a(1858331834723637349L, 3433198638404865893L, MethodHandles.lookup().lookupClass()).a(80003483594322L);
        ib = new HashMap(13);
        long l4 = bb ^ 0x7FB778FE16E1L;
        KillAura.b(null);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        int n = 2;
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l4 >>> 56);
        int n2 = 1;
        while (true) {
            byArray2 = byArray2;
            byArray2[n2] = (byte)(l4 << n2 * 8 >>> 56);
            ++n2;
        }
    }

    public List<Entity> H() {
        return (List)aMF.a(aMF.b(ListInvoker.stream(this.a((String)StringPropertyInvoker.b(this.U))), this::lambda$getTargetsFromRange$22), aB0.a());
    }

    private void lambda$sendAttack$13(Entity entity) {
        this.a(new C02PacketUseEntity(entity, C02PacketUseEntity$Action.ATTACK));
    }

    public List<Entity> G() {
        KillAura.w();
        double d = this.n() ? this.U() : this.a();
        return (List)aMF.a(aMF.b(ListInvoker.stream(this.a((String)StringPropertyInvoker.b(this.U))), arg_0 -> this.lambda$getTargetsFromBlockRange$23(d, arg_0)), aB0.a());
    }

    private Boolean lambda$new$1() {
        return auk_2.b(StringPropertyInvoker.isMode(this.ap, KZ.F));
    }

    private boolean q() {
        KillAura.w();
        TargetStrafe targetStrafe = (TargetStrafe)ModuleInvoker.isEnable(ModuleRegistry.TARGETSTRAFE);
        return !auk_2.a((Boolean)Ba.b(this.aF)) || StringPropertyInvoker.isMode(this.ap, KZ.E) || !auk_2.a((Boolean)Ba.b(this.ak)) || this.R() != null || a8F.a(NovolineInvoker.A(this.novoline), this.P.getName(), EnumPlayerType.TARGET) || azd_2.a(targetStrafe, false) && this.a(ModuleRegistry.FLY);
    }

    public IntProperty T() {
        return this.I;
    }

    @Override
    public void o() {
        this.a((String)StringPropertyInvoker.b(this.ap));
        this.az = this.mc.player.rotationYaw;
        this.Q = this.mc.player.prevRotationYaw;
        this.H = this.mc.player.rotationPitch;
        this.S = this.mc.player.prevRotationPitch;
        this.ab = new agm_1(this.az);
        this.aw = 1000L / (long)anf_2.a(anf_2.c(), P8.b((Integer)adt_2.a(this.al)), P8.b((Integer)adt_2.a(this.ah)) + 1);
    }

    private double E() {
        return db_0.b((Double)MD.b(this.aj));
    }

    private void e(Entity entity) {
        KillAura.w();
        if (fo_0.a(fo_0.a()) > 47) {
            this.a(new C02PacketUseEntity(entity, C02PacketUseEntity$Action.ATTACK));
            this.h();
        }
        this.h();
        this.a(new C02PacketUseEntity(entity, C02PacketUseEntity$Action.ATTACK));
        if (entity instanceof EntityPlayer) {
            this.a((Sprint)ModuleInvoker.isEnable(ModuleRegistry.SPRINT));
        }
        if (auk_2.a((Boolean)Ba.b(this.am))) {
            PlayerInvoker.a(this.mc.player, entity);
        }
        if (auk_2.a((Boolean)Ba.b(this.Z))) {
            PlayerInvoker.c(this.mc.player, entity);
        }
    }

    @EventTarget
    public void a(MotionUpdateEvent motionUpdateEvent) {
        block9: {
            block10: {
                KillAura.w();
                if (EventInvoker.getState(motionUpdateEvent) == cc.novoline.events.type.State.PRE && this.l()) {
                    float[] fArray = akv_0.b(this.P);
                    float f = amt_2.a(this.ab, fArray[0], this.an);
                    float f2 = fArray[1];
                    if (StringPropertyInvoker.isMode(this.ar, KZ.p)) {
                        f = ae4_0.a(f);
                        f2 = ae4_0.c(f2);
                    }
                    this.Q = this.az;
                    this.S = this.H;
                    this.az = f;
                    EventInvoker.a(motionUpdateEvent, this.az);
                    this.H = f2;
                    EventInvoker.b(motionUpdateEvent, this.H);
                }
                if (EventInvoker.getState(motionUpdateEvent) != cc.novoline.events.type.State.PRE) break block9;
                if (!this.a(KZ.H, KZ.C)) break block10;
                this.aD = true;
                if (StringPropertyInvoker.isMode(this.aq, KZ.W)) {
                    this.b(new C08PacketPlayerBlockPlacement(PlayerInvoker.h(this.mc.player)));
                }
                if (!StringPropertyInvoker.isMode(this.aq, KZ.O)) break block9;
                this.b(new C07PacketPlayerDigging(C07PacketPlayerDigging$Action.RELEASE_USE_ITEM));
            }
            if (this.aD) {
                this.b(new C07PacketPlayerDigging(C07PacketPlayerDigging$Action.RELEASE_USE_ITEM));
                this.aD = false;
            }
        }
        if (EventInvoker.getState(motionUpdateEvent) == (StringPropertyInvoker.isMode(this.K, KZ.a) ? cc.novoline.events.type.State.PRE : cc.novoline.events.type.State.POST) && this.f() && this.D()) {
            this.g();
        }
        if (EventInvoker.getState(motionUpdateEvent) == cc.novoline.events.type.State.POST && this.b(KZ.x)) {
            this.b(new C08PacketPlayerBlockPlacement(PlayerInvoker.h(this.mc.player)));
        }
    }

    public List<Entity> O() {
        return this.ay;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(String string) {
        KillAura.w();
        Blink blink = (Blink)ModuleInvoker.isEnable(ModuleRegistry.BLINK);
        boolean bl = blink.x() && StringPropertyInvoker.isMode(blink.b(), KZ.ak);
        if (!this.x()) return false;
        if (!StringPropertyInvoker.isMode(this.aq, string)) return false;
        if (this.a(ModuleRegistry.SCAFFOLD)) return false;
        if (!auk_2.a((Boolean)Ba.b(this.aH))) return false;
        if (this.P == null) return false;
        if (!ayj_0.a(this.P)) return false;
        if (!this.e()) return false;
        if (!this.y()) return false;
        if (PlayerInvoker.h(this.mc.player) == null) return false;
        if (!(act_2.k(PlayerInvoker.h(this.mc.player)) instanceof LC)) return false;
        double d = PlayerInvoker.b(this.mc.player, this.P);
        double d2 = PlayerInvoker.e(this.mc.player, this.P) ? this.U() : this.E();
        if (!(d <= d2)) return false;
        return true;
    }

    public void b(SettingEvent settingEvent) {
        KillAura.w();
        if (settingEvent == null || afm_0.b(settingEvent).equals(KZ.v) || afm_0.b(settingEvent).equals(KZ.M)) {
            if (P8.b((Integer)adt_2.a(this.ah)) < P8.b((Integer)adt_2.a(this.al))) {
                adt_2.b(this.al, (Number)adt_2.a(this.ah));
            }
            if (P8.b((Integer)adt_2.a(this.al)) > P8.b((Integer)adt_2.a(this.ah))) {
                adt_2.b(this.ah, (Number)adt_2.a(this.al));
            }
        }
        if ((settingEvent == null || afm_0.b(settingEvent).equals(KZ.ag)) && StringPropertyInvoker.isMode(this.K, KZ.s)) {
            this.a(this.r(), KZ.c, 3500, NotificationType.WARNING);
            StringPropertyInvoker.b(this.K, KZ.K);
        }
        if (settingEvent == null || afm_0.b(settingEvent).equals(KZ.q) || afm_0.b(settingEvent).equals(KZ.D) || afm_0.b(settingEvent).equals(KZ.u)) {
            if (db_0.b((Double)MD.b(this.ag)) < db_0.b((Double)MD.b(this.aj))) {
                MD.b(this.aj, (Number)MD.b(this.ag));
            }
            if (db_0.b((Double)MD.b(this.aj)) > db_0.b((Double)MD.b(this.ag))) {
                MD.b(this.ag, (Number)MD.b(this.aj));
            }
            if (auk_2.a((Boolean)Ba.b(this.aH))) {
                if (db_0.b((Double)MD.b(this.as)) < db_0.b((Double)MD.b(this.ag))) {
                    MD.b(this.ag, (Number)MD.b(this.as));
                }
                if (db_0.b((Double)MD.b(this.ag)) > db_0.b((Double)MD.b(this.as))) {
                    MD.b(this.as, (Number)MD.b(this.ag));
                }
            }
        }
        if ((settingEvent == null || afm_0.b(settingEvent).equals(KZ.g)) && auk_2.a((Boolean)Ba.b(this.aH))) {
            if (db_0.b((Double)MD.b(this.as)) < db_0.b((Double)MD.b(this.ag))) {
                MD.b(this.ag, (Number)MD.b(this.as));
            }
            if (db_0.b((Double)MD.b(this.ag)) > db_0.b((Double)MD.b(this.as))) {
                MD.b(this.as, (Number)MD.b(this.ag));
            }
        }
        if (!(settingEvent != null && !afm_0.b(settingEvent).equals(KZ.b) || StringPropertyInvoker.isMode(this.aq, KZ.r) || StringPropertyInvoker.isMode(this.aq, KZ.ac))) {
            this.a(this.r(), aL0.a(aL0.a(aL0.a(new StringBuilder(), KZ.e), StringInvoker.a((String)StringPropertyInvoker.b(this.aq))), KZ.l).toString(), 4000, NotificationType.WARNING);
            StringPropertyInvoker.b(this.aq, KZ.R);
        }
        if ((settingEvent == null || afm_0.b(settingEvent).equals(KZ.ae)) && !auk_2.a((Boolean)Ba.b(this.aF))) {
            this.a(this.r(), KZ.X, 2500, NotificationType.WARNING);
            Ba.a(this.aF, auk_2.b(true));
        }
    }

    @EventTarget
    public void a(Render3DEvent render3DEvent) {
        KillAura.w();
        if (auk_2.a((Boolean)Ba.b(this.X)) && (this.n() || this.D())) {
            if (StringPropertyInvoker.isMode(this.ap, KZ.t)) {
                int n = 0;
                Iterator iterator = ListInvoker.iterator(this.H());
                if (dz_0.c(iterator)) {
                    Entity entity = (Entity)dz_0.b(iterator);
                    a1V.b(entity, this.a(this.P, n));
                    n -= 600;
                }
            }
            a1V.b(this.P, this.a(this.P, 0));
        }
    }

    public EntityPlayer M() {
        KillAura.w();
        return this.P instanceof EntityPlayer ? (EntityPlayer)this.P : null;
    }

    private Boolean lambda$new$4() {
        KillAura.w();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.W)) && auk_2.a((Boolean)Ba.b(this.aF)));
    }

    public static int[] w() {
        return af;
    }

    private Boolean lambda$new$2() {
        return auk_2.b(StringPropertyInvoker.isMode(this.ap, KZ.y));
    }

    public String B() {
        KillAura.w();
        TargetStrafe targetStrafe = (TargetStrafe)ModuleInvoker.isEnable(ModuleRegistry.TARGETSTRAFE);
        return azd_2.d(targetStrafe) ? KZ.o : (String)StringPropertyInvoker.b(this.ap);
    }

    public MovingObjectPosition R() {
        float f = ayj_0.F(this.P);
        Vec3 vec3 = ae4_0.a();
        Vec3 vec32 = ae4_0.a(this.H, this.az);
        Vec3 vec33 = aNE.a(vec3, vec32.xCoord * this.a(), vec32.yCoord * this.a(), vec32.zCoord * this.a());
        return h__0.a(h__0.d(ayj_0.u(this.P), f, f, f), vec3, vec33);
    }

    public KillAura(@NonNull long l4, ModuleManager moduleManager, EnumModuleType enumModuleType, String string) {
        long l5 = (l4 = bb ^ l4) ^ 0x5ACD2224C963L;
        int n = (int)(l5 >>> 56);
        long l6 = l5 << 8 >>> 8;
        super((byte)n, moduleManager, l6, enumModuleType, string);
        this.ay = new ArrayList<Entity>();
        KillAura.w();
        this.aC = new TimerUtil();
        this.aA = new TimerUtil();
        this.aa = new TimerUtil();
        this.ap = StringPropertyInvoker.b(asp_2.a((String)((Object)KillAura.b("l", (int)20759, (long)(0x1623E7EE7DA2D236L ^ l4)))), new String[]{KillAura.b("l", (int)26372, (long)(0xF0F9597AA86645AL ^ l4)), KillAura.b("l", (int)30735, (long)(0x49E55B35C61D7B54L ^ l4)), KillAura.b("l", (int)16322, (long)(0x126C3A0A1502BCE9L ^ l4))});
        this.aG = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(1)), P8.d(1)), P8.d(20));
        this.U = StringPropertyInvoker.b(asp_2.a((String)((Object)KillAura.b("l", (int)8736, (long)(0x3689241D5E07212FL ^ l4)))), new String[]{KillAura.b("l", (int)16416, (long)(0x645C06967BC4C321L ^ l4)), KillAura.b("l", (int)31296, (long)(0x62325D3AE870F910L ^ l4)), KillAura.b("l", (int)21086, (long)(0x3653236F47675150L ^ l4)), KillAura.b("l", (int)4275, (long)(0x25AD53ACD72993ADL ^ l4)), KillAura.b("l", (int)28689, (long)(0x645AD87551AE7337L ^ l4))});
        this.I = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(400)), P8.d(50)), P8.d(1000));
        this.K = StringPropertyInvoker.b(asp_2.a((String)((Object)KillAura.b("l", (int)4459, (long)(0x35B3DE4F77629243L ^ l4)))), new String[]{KillAura.b("l", (int)22639, (long)(0x120383E470535B54L ^ l4)), KillAura.b("l", (int)18288, (long)(0x7204E727CE27C437L ^ l4))});
        this.al = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(5)), P8.d(1)), P8.d(20));
        this.ah = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(5)), P8.d(1)), P8.d(20));
        this.ag = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(3.5)), db_0.a(3.0)), db_0.a(7.0));
        this.aj = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(3.5)), db_0.a(3.0)), db_0.a(7.0));
        this.T = asp_2.c();
        this.ai = ava_0.a(asp_2.a(KillAura.b("l", (int)3606, (long)(0xA79512A4FEF0D1DL ^ l4))), new String[]{KillAura.b("l", (int)16052, (long)(0x19745719C5B63DADL ^ l4)), KillAura.b("l", (int)10105, (long)(0x56F3F2EA85882461L ^ l4)), KillAura.b("l", (int)5177, (long)(0x657FC08860D71772L ^ l4)), KillAura.b("l", (int)1689, (long)(0x4AED5C07E91305C1L ^ l4))});
        this.Y = ava_0.a(asp_2.a(KillAura.b("l", (int)10430, (long)(0x7459AE5D8ACDABFAL ^ l4))), new String[]{KillAura.b("l", (int)27231, (long)(0x4E01ACE80F8DE905L ^ l4)), KillAura.b("l", (int)25413, (long)(0x61312872C2B2E067L ^ l4))});
        this.V = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(180)), P8.d(30)), P8.d(180));
        this.J = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(50)), P8.d(0)), P8.d(100));
        this.aF = asp_2.a(auk_2.b(false));
        this.ar = StringPropertyInvoker.b(asp_2.a((String)((Object)KillAura.b("l", (int)21012, (long)(0x45EE9C92F490D10EL ^ l4)))), new String[]{KillAura.b("l", (int)1132, (long)(0x5361FE88D00C072EL ^ l4)), KillAura.b("l", (int)26831, (long)(0x1EFC6CCD106DEBBBL ^ l4))});
        this.R = asp_2.a(auk_2.b(false));
        this.ak = asp_2.c();
        this.an = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(30)), P8.d(5)), P8.d(90));
        this.aH = asp_2.c();
        this.aq = StringPropertyInvoker.b(asp_2.a((String)((Object)KillAura.b("l", (int)12373, (long)(0x4CDCE3E4A8E2B315L ^ l4)))), new String[]{KillAura.b("l", (int)22639, (long)(0x120383E470535B54L ^ l4)), KillAura.b("l", (int)12373, (long)(0x4CDCE3E4A8E2B315L ^ l4)), KillAura.b("l", (int)13746, (long)(0x7206D692F091B6CAL ^ l4)), KillAura.b("l", (int)25421, (long)(0xBD1DF56C8AC601CL ^ l4)), KillAura.b("l", (int)8618, (long)(0x2C5884C60065A2F9L ^ l4))});
        this.as = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(3.5)), db_0.a(3.0)), db_0.a(7.0));
        this.at = asp_2.c();
        this.ae = asp_2.c();
        this.N = asp_2.d();
        this.X = asp_2.d();
        this.am = asp_2.d();
        this.Z = asp_2.d();
        this.M = StringPropertyInvoker.b(asp_2.a((String)((Object)KillAura.b("l", (int)11338, (long)(0x16EE87586C582F75L ^ l4)))), new String[]{KillAura.b("l", (int)31494, (long)(0x1381598744237821L ^ l4)), KillAura.b("l", (int)21577, (long)(0x449B3723A685D77EL ^ l4)), KillAura.b("l", (int)22526, (long)(0x6F13507654E2D4ECL ^ l4))});
        this.ax = asp_2.b(P8.d(aol_1.b(Color.WHITE)));
        this.aB = asp_2.d();
        this.av = asp_2.d();
        this.O = asp_2.d();
        this.W = asp_2.d();
        this.ac = asp_2.d();
        this.au = asp_2.d();
        this.ad = asp_2.d();
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)31919, (long)(0x2CD5F310FDB5FFB4L ^ l4))), (String)((Object)KillAura.b("l", (int)3230, (long)(0x44E9613BB06A8F9AL ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.ap));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)27691, (long)(0x31F640B9F17D6F6EL ^ l4))), (String)((Object)KillAura.b("l", (int)1698, (long)(0x9F45A7943F0059BL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.aG, 1.0, this::lambda$new$0));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)16459, (long)(0x40B2D575CB95C336L ^ l4))), (String)((Object)KillAura.b("l", (int)15130, (long)(0x189EED530935B855L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.U, this::lambda$new$1));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)14951, (long)(0x4451EDEBDD1EB935L ^ l4))), (String)((Object)KillAura.b("l", (int)22232, (long)(0x41FD3F378BC155DAL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.I, 50.0, this::lambda$new$2));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)21367, (long)(0x147F6CDA8076D03AL ^ l4))), (String)((Object)KillAura.b("l", (int)11630, (long)(0x7EFDE438C9572E38L ^ l4))), SettingType.SEPARATOR, (AbstractModule)this, this.aB));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)14350, (long)(0x67A3A31279BDBB5AL ^ l4))), (String)((Object)KillAura.b("l", (int)25818, (long)(0x7B031D66DC1B67CCL ^ l4))), SettingType.SELECTBOX, (AbstractModule)this, this.ai, this.aB::get));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)26009, (long)(0x202A9B195CB4E68EL ^ l4))), (String)((Object)KillAura.b("l", (int)23425, (long)(0x779B32698DDD884L ^ l4))), SettingType.SELECTBOX, (AbstractModule)this, this.Y, this.aB::get));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)30159, (long)(0x7632FB6690D8F6C6L ^ l4))), (String)((Object)KillAura.b("l", (int)5895, (long)(0x4140F559536A9434L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.J, 5.0, this.aB::get));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)29468, (long)(0x4406C0E2EDACF001L ^ l4))), (String)((Object)KillAura.b("l", (int)27351, (long)(0x36FF9A68D22AE9FEL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.V, 5.0, this.aB::get));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)18507, (long)(0x7E80ABAD4AEDCB71L ^ l4))), (String)((Object)KillAura.b("l", (int)13613, (long)(0x3293D4FA6B91B601L ^ l4))), SettingType.SEPARATOR, (AbstractModule)this, this.av));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)22911, (long)(0x53B9C7A430915A4FL ^ l4))), (String)((Object)KillAura.b("l", (int)27035, (long)(0x7C497C7DBB0AEA8BL ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.K, this.av::get));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)7791, (long)(0x7CA6F5CAA2F01D67L ^ l4))), (String)((Object)KillAura.b("l", (int)28392, (long)(0x4727D9F915DEDC8L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.al, 1.0, this.av::get));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)16236, (long)(0x62228E4920103C51L ^ l4))), (String)((Object)KillAura.b("l", (int)21899, (long)(0x17DD26DE6CD256DCL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.ah, 1.0, this.av::get));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)11541, (long)(0x7A5849EA62E9AE4AL ^ l4))), (String)((Object)KillAura.b("l", (int)31653, (long)(0xD7BC5F3D1E9F881L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.ag, 0.1, this.av::get));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)21284, (long)(0x4EEE87F7B4F65031L ^ l4))), (String)((Object)KillAura.b("l", (int)32387, (long)(0x13B8C2A1DB09FDC2L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.aj, 0.1, this.av::get));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)28010, (long)(0x68678B77F27C6E23L ^ l4))), (String)((Object)KillAura.b("l", (int)13347, (long)(0x2BEDBF6D9AAA377FL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.T, this.av::get));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)4307, (long)(0x34F0B826DF59395L ^ l4))), (String)((Object)KillAura.b("l", (int)5303, (long)(0x34181D3DC4DF17BAL ^ l4))), SettingType.SEPARATOR, (AbstractModule)this, this.O));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)3361, (long)(0x305A319669BA8E35L ^ l4))), (String)((Object)KillAura.b("l", (int)17467, (long)(0x5286A974B85EC72AL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.aF, this.O::get));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)1264, (long)(0x3337F0A6C44B07A5L ^ l4))), (String)((Object)KillAura.b("l", (int)10338, (long)(0x420BE5CFECE2B21L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.aH, this.O::get));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)1964, (long)(0x20D4215E16580498L ^ l4))), (String)((Object)KillAura.b("l", (int)10712, (long)(0x50FB1B2600422AADL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.at, this.O::get));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)10936, (long)(0x682434608071A9C3L ^ l4))), (String)((Object)KillAura.b("l", (int)17042, (long)(0x5940F8FB159E41A7L ^ l4))), SettingType.SEPARATOR, (AbstractModule)this, this.W, this.aF::get));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)30441, (long)(0x5A0DCA868F54F5C3L ^ l4))), (String)((Object)KillAura.b("l", (int)1320, (long)(0x2023FCF0CCAD0622L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.ar, this::lambda$new$3));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)10227, (long)(0x4967FD8EB70BA4ECL ^ l4))), (String)((Object)KillAura.b("l", (int)4625, (long)(0x20FDBE17B95C1123L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.ak, this::lambda$new$4));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)24815, (long)(0x1A29B7DA77AE63D9L ^ l4))), (String)((Object)KillAura.b("l", (int)26333, (long)(0x76EEAA71C386E595L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.R, this::lambda$new$5));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)25888, (long)(0xC820B64F5036659L ^ l4))), (String)((Object)KillAura.b("l", (int)29617, (long)(0x51A3916CFDB27094L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.an, 5.0, this::lambda$new$6));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)20281, (long)(0x3F7F48E96E394C77L ^ l4))), (String)((Object)KillAura.b("l", (int)10901, (long)(0x6E914FBB38652986L ^ l4))), SettingType.SEPARATOR, (AbstractModule)this, this.ac, this.aH::get));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)20625, (long)(0x2858507E6020D3EDL ^ l4))), (String)((Object)KillAura.b("l", (int)24325, (long)(0x50936A777D80DC02L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.aq, this::lambda$new$7));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)32611, (long)(0x416758F34574FC3AL ^ l4))), (String)((Object)KillAura.b("l", (int)83, (long)(0x601DF04F85C1037DL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.as, 0.1, this::lambda$new$8));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)15123, (long)(0x649DDD31294FB83CL ^ l4))), (String)((Object)KillAura.b("l", (int)4358, (long)(0x20B61F6EF97B924AL ^ l4))), SettingType.SEPARATOR, (AbstractModule)this, this.au));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)1636, (long)(0x3440222A6E360578L ^ l4))), (String)((Object)KillAura.b("l", (int)20210, (long)(0x6268A84E9A9C4DB8L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.am, this.au::get));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)20892, (long)(0x85B0D971729D2BFL ^ l4))), (String)((Object)KillAura.b("l", (int)3615, (long)(0x765F5C2E8240D13L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.Z, this.au::get));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)23857, (long)(0x5D418E4F2C5E00L ^ l4))), (String)((Object)KillAura.b("l", (int)235, (long)(0x61252D26781783D7L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.X, this.au::get));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)17815, (long)(0x63BA2F57BD7D4691L ^ l4))), (String)((Object)KillAura.b("l", (int)6002, (long)(0x125903C7B9C2940CL ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.M, this::lambda$new$9));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)21599, (long)(0xE74E60982BA5767L ^ l4))), (String)((Object)KillAura.b("l", (int)2485, (long)(0x1AC29D3BEDCE8AB6L ^ l4))), SettingType.COLOR_PICKER, (AbstractModule)this, this.ax, null, this::lambda$new$10));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)25163, (long)(0x7DF0B6089E19E116L ^ l4))), (String)((Object)KillAura.b("l", (int)9061, (long)(0x76954B86F92E201AL ^ l4))), SettingType.SEPARATOR, (AbstractModule)this, this.ad, this.at::get));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)28951, (long)(0x284F2FFD9C1FF23AL ^ l4))), (String)((Object)KillAura.b("l", (int)13846, (long)(0x552F240E93D9B528L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.ae, this::lambda$new$11));
        ManagerInvoker.put(new Setting((String)((Object)KillAura.b("l", (int)12176, (long)(0xA82EC2A255EACEAL ^ l4))), (String)((Object)KillAura.b("l", (int)19807, (long)(0x760DD8109ADDCE5FL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.N, this::lambda$new$12));
        ListInvoker.b(new ListInvoker[1]);
    }

    private Boolean lambda$new$6() {
        KillAura.w();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.W)) && auk_2.a((Boolean)Ba.b(this.aF)));
    }

    public DoubleProperty b() {
        return this.as;
    }

    public DoubleProperty p() {
        return this.ag;
    }

    @Override
    public void w() {
        this.az = this.mc.player.rotationYaw;
        KillAura.w();
        this.H = this.mc.player.rotationPitch;
        this.P = null;
        ListInvoker.clear(this.ay);
        if (this.aD) {
            this.b(new C07PacketPlayerDigging(C07PacketPlayerDigging$Action.RELEASE_USE_ITEM));
            this.aD = false;
        }
    }

    public IntProperty V() {
        return this.ah;
    }

    @EventTarget
    public void a(TickUpdateEvent tickUpdateEvent) {
        this.a((String)StringPropertyInvoker.b(this.ap));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean n() {
        KillAura.w();
        Blink blink = (Blink)ModuleInvoker.isEnable(ModuleRegistry.BLINK);
        boolean bl = blink.x() && StringPropertyInvoker.isMode(blink.b(), KZ.A);
        if (!this.x()) return false;
        if (this.a(ModuleRegistry.SCAFFOLD)) return false;
        if (!auk_2.a((Boolean)Ba.b(this.aH))) return false;
        if (this.P == null) return false;
        if (!ayj_0.a(this.P)) return false;
        if (!this.e()) return false;
        if (!this.y()) return false;
        if (PlayerInvoker.h(this.mc.player) == null) return false;
        if (!(act_2.k(PlayerInvoker.h(this.mc.player)) instanceof LC)) return false;
        double d = PlayerInvoker.b(this.mc.player, this.P);
        double d2 = PlayerInvoker.e(this.mc.player, this.P) ? this.U() : this.E();
        if (!(d <= d2)) return false;
        return true;
    }

    public float i() {
        return this.H;
    }

    /*
     * Exception decompiling
     */
    private List<Entity> a(String var1_1) {
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

    private Boolean lambda$new$5() {
        KillAura.w();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.W)) && auk_2.a((Boolean)Ba.b(this.aF)));
    }

    private boolean e() {
        KillAura.w();
        return this.mc.player.ticksExisted < P8.b((Integer)adt_2.a(this.J)) || this.P.ticksExisted > P8.b((Integer)adt_2.a(this.J));
    }

    public ListProperty<String> s() {
        return this.ai;
    }

    private Boolean lambda$new$7() {
        KillAura.w();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.ac)) && auk_2.a((Boolean)Ba.b(this.aH)));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean D() {
        KillAura.w();
        Blink blink = (Blink)ModuleInvoker.isEnable(ModuleRegistry.BLINK);
        boolean bl = blink.x() && StringPropertyInvoker.isMode(blink.b(), KZ.w);
        if (!this.x()) return false;
        if (this.a(ModuleRegistry.SCAFFOLD)) return false;
        if (this.F()) return false;
        if (this.J()) return false;
        if (this.P == null) return false;
        if (!ayj_0.a(this.P)) return false;
        if (!this.e()) return false;
        if (!this.y()) return false;
        if (!this.q()) return false;
        double d = PlayerInvoker.b(this.mc.player, this.P);
        double d2 = PlayerInvoker.e(this.mc.player, this.P) ? this.a() : this.E();
        if (!(d <= d2)) return false;
        return true;
    }

    private double U() {
        return db_0.b((Double)MD.b(this.as));
    }

    private Entity v() {
        Entity entity;
        KillAura.w();
        Iterator iterator = ListInvoker.iterator(this.a((String)StringPropertyInvoker.b(this.U)));
        if (dz_0.c(iterator) && (double)PlayerInvoker.b(this.mc.player, entity = (Entity)dz_0.b(iterator)) <= this.a()) {
            return entity;
        }
        return null;
    }

    private boolean f() {
        KillAura.w();
        Speed speed = (Speed)ModuleInvoker.isEnable(ModuleRegistry.SPEED);
        NoSlow noSlow = (NoSlow)ModuleInvoker.isEnable(ModuleRegistry.NOSLOWDOWN);
        return !WW.a(speed) && !this.a(KZ.Q, KZ.J) && !aAE.a(noSlow, KZ.Z);
    }

    private Boolean lambda$new$8() {
        KillAura.w();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.ac)) && auk_2.a((Boolean)Ba.b(this.aH)));
    }

    public float Q() {
        return this.az;
    }

    public BooleanProperty I() {
        return this.aF;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = KillAura.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private Boolean lambda$new$3() {
        KillAura.w();
        return auk_2.b(auk_2.a((Boolean)Ba.b(this.W)) && auk_2.a((Boolean)Ba.b(this.aF)));
    }

    public DoubleProperty c() {
        return this.aj;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean l() {
        KillAura.w();
        Blink blink = (Blink)ModuleInvoker.isEnable(ModuleRegistry.BLINK);
        boolean bl = blink.x() && StringPropertyInvoker.isMode(blink.b(), KZ.ah);
        if (!this.x()) return false;
        if (this.a(ModuleRegistry.SCAFFOLD)) return false;
        if (!auk_2.a((Boolean)Ba.b(this.aF))) return false;
        if (this.J()) return false;
        if (this.P == null) return false;
        if (!ayj_0.a(this.P)) return false;
        if (!this.e()) return false;
        if (!this.y()) return false;
        double d = PlayerInvoker.b(this.mc.player, this.P);
        double d2 = PlayerInvoker.e(this.mc.player, this.P) ? this.a() : this.E();
        if (!(d <= d2)) return false;
        return true;
    }

    @EventTarget
    public void a(SettingEvent settingEvent) {
        KillAura.w();
        if (afm_0.b(settingEvent).equals(KZ.ai) && ava_0.b(this.Y, KZ.aj) && this.P != null) {
            this.P = null;
        }
    }

    private boolean a(boolean bl) {
        KillAura.w();
        ObjectListIterator objectListIterator = akq_2.a((ObjectArrayList)aMF.a(aMF.b(ListInvoker.stream(this.a((String)StringPropertyInvoker.b(this.U))), this::lambda$isContainsTarget$17), aB0.a(ObjectArrayList::new)));
        if (dz_0.c((Iterator)objectListIterator)) {
            Entity entity = (Entity)dz_0.b((Iterator)objectListIterator);
            if (a8F.a(NovolineInvoker.A(this.novoline), entity.getName(), EnumPlayerType.TARGET)) {
                return true;
            }
        }
        return false;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(KillAura.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


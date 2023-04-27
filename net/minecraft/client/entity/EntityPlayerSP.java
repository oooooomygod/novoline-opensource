/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.entity;

import cc.novoline.events.events.JumpEvent;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.events.MoveEvent;
import cc.novoline.events.events.PlayerUpdateEvent;
import cc.novoline.events.events.SlowdownEvent;
import cc.novoline.events.type.State;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.DisplayInvoker;
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.EventManagerInvoker;
import cc.novoline.invoke.GameSettingsInvoker;
import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.ItemBlockInvoker;
import cc.novoline.invoke.ItemStackInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.MoveInoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.PlayerControllerInvoker;
import cc.novoline.invoke.SoundHandlerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.combat.Criticals;
import cc.novoline.modules.move.GuiMove;
import net.minecraft.network.packts.C01PacketChatMessage;
import net.minecraft.network.packts.C05PacketPlayerLook;
import net.minecraft.network.packts.C06PacketPlayerPosLook;
import net.minecraft.network.packts.C07PacketPlayerDigging;
import net.minecraft.network.packts.C07PacketPlayerDigging$Action;
import net.minecraft.network.packts.C0APacketAnimation;
import net.minecraft.network.packts.C0BPacketEntityAction;
import net.minecraft.network.packts.C0BPacketEntityAction$Action;
import net.minecraft.network.packts.C0CPacketInput;
import net.minecraft.network.packts.C0DPacketCloseWindow;
import net.minecraft.network.packts.C13PacketPlayerAbilities;
import net.minecraft.network.packts.C16PacketClientStatus;
import net.minecraft.network.packts.C16PacketClientStatus$EnumState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.minecraft.block.BlockAir;
import net.minecraft.client.Minecraft;
import net.B7;
import net.BZ;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import deobf.EntityMinecart;
import deobf.EnumFacing;
import net.FutureTask;
import net.GW;
import net.GuiCrafting;
import net.GuiRepair;
import net.Item;
import net.ItemBow;
import net.Items;
import net.LC;
import net.Material;
import net.MathHelper;
import net.MovementInput;
import net.Potion;
import net.R0;
import net.R9;
import net.RA;
import net.RM;
import net.RT;
import net.GuiChat;
import net.RY;
import net.R_;
import net.ResourceLocation;
import net.Rs;
import net.Ru;
import net.SU;
import net.Slot;
import net.StatFileWriter;
import net.World;
import net.X9;
import net.a3M;
import net.a5_0;
import net.a6z_0;
import net.a7K;
import net.aB0;
import net.aDM;
import net.aGW;
import net.aKH;
import net.aL0;
import net.aLW;
import net.aMF;
import net.aN_;
import net.aQl;
import net.aSY;
import net.aV8;
import net.aci_0;
import net.act_2;
import net.afy_2;
import net.ag3_0;
import net.aih_1;
import net.aip_1;
import net.akm_1;
import net.alf_0;
import net.all_1;
import net.alo_2;
import net.amv_2;
import net.aug_0;
import net.avq_0;
import net.awn_1;
import net.ayp_1;
import net.ayx_2;
import net.db_0;
import net.dv_1;
import net.dy_0;
import net.dz_0;
import net.fg_2;
import net.fx_2;
import net.minecraft.block.BlockLiquid;
import net.h__0;
import net.kp_1;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.na_1;
import net.og_0;
import net.px_0;
import net.rm_0;
import net.rm_2;
import net.rs_1;
import net.rw_0;
import net.wj_0;


public class EntityPlayerSP
extends AbstractClientPlayer {
    public float renderArmPitch;
    public float lastReportedYaw;
    private String clientBrand;
    private float cf;
    public float lastReportedPitchlastReportedPitch;
    protected int sprintToggleTimer;
    private int horseJumpPowerCounter;
    private double lastReportedPosZ;
    public int positionUpdateTicks;
    private double lastReportedPosY;
    private boolean serverSneakState;
    private StatFileWriter statWriter;
    protected Minecraft mc;
    private double lastReportedPosX;
    private MovementInput bZ;
    private boolean cj;
    private String[] coomands = new String[]{aug_0.D, aug_0.c, aug_0.n, aug_0.al, aug_0.F, aug_0.O, aug_0.d, aug_0.b, aug_0.i, aug_0.aF, aug_0.y, aug_0.an, aug_0.X, aug_0.q, aug_0.J, aug_0.ai, aug_0.C, aug_0.ag, aug_0.Q, aug_0.Y, aug_0.as, aug_0.ap, aug_0.aw, aug_0.az, aug_0.V, aug_0.ar, aug_0.ad, aug_0.at, aug_0.g, aug_0.aj, aug_0.au, aug_0.ah, aug_0.e, aug_0.aD, aug_0.v, aug_0.r, aug_0.ac, aug_0.k, aug_0.u, aug_0.U, aug_0.ax, aug_0.af, aug_0.aC, aug_0.L, aug_0.x, aug_0.aH, aug_0.aB, aug_0.R, aug_0.I, aug_0.S, aug_0.ae, aug_0.H, aug_0.W, aug_0.aq, aug_0.t, aug_0.P, aug_0.K, aug_0.f, aug_0.j, aug_0.ao, aug_0.ab, aug_0.aG, aug_0.ak, aug_0.p, aug_0.l, aug_0.m, aug_0.am, aug_0.T, aug_0.N};
    public float prevRenderArmYaw;
    private boolean serverSprintState;
    public float timeInPortal;
    private float b6;
    private float horseJumpPower;
    private int sprintingTicksLeft;
    public int fuck;
    public float renderArmYaw;
    public NetHandlerPlayClient connection;
    public float prevRenderArmPitch;
    public float prevTimeInPortal;

    @Override
    public BlockPos e() {
        return new BlockPos(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5);
    }

    public String[] i() {
        return this.coomands;
    }

    @Override
    public void a(String string, float f, float f2) {
        aV8.a(this.worldObj, this.posX, this.posY, this.posZ, string, f, f2, false);
    }

    public void c(IChatComponent iChatComponent) {
        kp_1.a(GW.f(this.mc.ingameGUI), iChatComponent);
    }

    public double e() {
        return MathInvoker.d(this.motionX * this.motionX + this.motionZ * this.motionZ);
    }

    public double h(double d) {
        double d2 = this.j();
        if (this.isPotionActive(Potion.moveSpeed)) {
            int n = this.b(Potion.moveSpeed) - this.b(Potion.moveSlowdown);
            d2 *= 1.0 + d * (double)n;
        }
        return d2;
    }

    @Override
    public void a(awn_1 awn_12) {
        MCInvoker.displayGuiScreen(this.mc, new Ru(awn_12));
    }

    @Override
    public boolean ad() {
        return true;
    }

    public void sendHorseJump() {
        aDM.a(this.connection, new C0BPacketEntityAction(this, C0BPacketEntityAction$Action.RIDING_JUMP, (int)(this.getHorseJumpPower() * 100.0f)));
    }

    public void sendFakeAbilities() {
        aDM.a(this.connection, new C13PacketPlayerAbilities(aSY.e(this.abilities), aSY.c(this.abilities), true, true, aSY.a(this.abilities), aSY.b(this.abilities)));
    }

    private void lambda$onUpdate$1(FutureTask futureTask) {
        if (X9.d(futureTask)) {
            X9.b(futureTask);
            ListInvoker.remove(aci_0.a(NovolineInvoker.i(MCInvoker.z(this.mc))), futureTask);
            EventManagerInvoker.b(futureTask);
        } else {
            X9.a(futureTask);
        }
    }

    public void q(int n) {
        PlayerControllerInvoker.b(this.mc.playerController, this.bp.f, n, 0, 1, this);
    }

    public boolean d(double d) {
        return !ListInvoker.isEmpty(BlockInvoker.b(this.mc.world, this, h__0.b(this.getEntityBoundingBox(), 0.0, -d, 0.0)));
    }

    @Override
    public void i(boolean bl) {
        C07PacketPlayerDigging$Action c07PacketPlayerDigging$Action = C07PacketPlayerDigging$Action.DROP_ALL_ITEMS;
        aDM.a(this.connection, new C07PacketPlayerDigging(c07PacketPlayerDigging$Action, BlockPos.m, EnumFacing.DOWN));
    }

    public void a(int n, int n2, boolean bl) {
        PlayerControllerInvoker.b(this.mc.playerController, n, n2, 1, 4, this);
    }

    public boolean b(MotionUpdateEvent motionUpdateEvent) {
        double d;
        double d2;
        double d3 = EventInvoker.h(motionUpdateEvent) - this.lastReportedPosX;
        return d3 * d3 + (d2 = EventInvoker.e(motionUpdateEvent) - this.lastReportedPosY) * d2 + (d = EventInvoker.c(motionUpdateEvent) - this.lastReportedPosZ) * d > 9.0E-4;
    }

    @Override
    public void onLivingUpdate() {
        boolean bl;
        if (this.sprintingTicksLeft > 0) {
            --this.sprintingTicksLeft;
            if (this.sprintingTicksLeft == 0) {
                this.setSprinting(false);
            }
        }
        if (this.sprintToggleTimer > 0) {
            --this.sprintToggleTimer;
        }
        this.prevTimeInPortal = this.timeInPortal;
        if (this.inPortal) {
            if (this.mc.currentScreen != null && !aLW.d(this.mc.currentScreen)) {
                MCInvoker.displayGuiScreen(this.mc, null);
            }
            if (this.timeInPortal == 0.0f) {
                SoundHandlerInvoker.c(MCInvoker.l(this.mc), aih_1.a(new ResourceLocation(aug_0.M), a5_0.e(this.Q) * 0.4f + 0.8f));
            }
            this.timeInPortal += 0.0125f;
            if (this.timeInPortal >= 1.0f) {
                this.timeInPortal = 1.0f;
            }
            this.inPortal = false;
        } else if (this.isPotionActive(Potion.confusion) && a3M.c(this.getActivePotionEffect(Potion.confusion)) > 60) {
            this.timeInPortal += 0.006666667f;
            if (this.timeInPortal > 1.0f) {
                this.timeInPortal = 1.0f;
            }
        } else {
            if (this.timeInPortal > 0.0f) {
                this.timeInPortal -= 0.05f;
            }
            if (this.timeInPortal < 0.0f) {
                this.timeInPortal = 0.0f;
            }
        }
        if (this.timeUntilPortal > 0) {
            --this.timeUntilPortal;
        }
        wj_0.d(this.movementInput());
        wj_0.a(this.movementInput());
        boolean bl2 = wj_0.c(this.movementInput()) >= 0.8f;
        GuiMove guiMove = (GuiMove)ModuleInvoker.isEnable(ModuleRegistry.GUIMOVE);
        if (aQl.a(guiMove) && !(this.mc.currentScreen instanceof GuiChat)) {
            aQl.b(guiMove);
        } else {
            wj_0.e(this.movementInput());
        }
        if (this.isUsingItem() && !this.isRiding()) {
            SlowdownEvent slowdownEvent = new SlowdownEvent();
            EventManagerInvoker.call(slowdownEvent);
            if (!all_1.a(slowdownEvent)) {
                wj_0.a(this.movementInput(), wj_0.b(this.movementInput()) * 0.2f);
                wj_0.b(this.movementInput(), wj_0.c(this.movementInput()) * 0.2f);
                this.sprintToggleTimer = 0;
            }
        }
        this.pushOutOfBlocks(this.posX - (double)this.width * 0.35, this.getEntityBoundingBox().a + 0.5, this.posZ + (double)this.width * 0.35);
        this.pushOutOfBlocks(this.posX - (double)this.width * 0.35, this.getEntityBoundingBox().a + 0.5, this.posZ - (double)this.width * 0.35);
        this.pushOutOfBlocks(this.posX + (double)this.width * 0.35, this.getEntityBoundingBox().a + 0.5, this.posZ - (double)this.width * 0.35);
        this.pushOutOfBlocks(this.posX + (double)this.width * 0.35, this.getEntityBoundingBox().a + 0.5, this.posZ + (double)this.width * 0.35);
        boolean bl3 = bl = (float)net.K.b(this.O()) > 6.0f || aSY.f(this.abilities);
        if (this.onGround && wj_0.c(this.movementInput()) >= 0.8f && !this.isSprinting() && !this.isUsingItem() && !this.isPotionActive(Potion.blindness)) {
            if (this.sprintToggleTimer <= 0 && !GameSettingsInvoker.e(this.mc.gameSettings.bD)) {
                this.sprintToggleTimer = 7;
            } else {
                this.setSprinting(true);
            }
        }
        if (!this.isSprinting() && wj_0.c(this.movementInput()) >= 0.8f && !this.isUsingItem() && !this.isPotionActive(Potion.blindness) && GameSettingsInvoker.e(this.mc.gameSettings.bD)) {
            this.setSprinting(true);
        }
        if (this.isSprinting()) {
            if (wj_0.c(this.movementInput()) < 0.8f || !this.g) {
                // empty if block
            }
            this.setSprinting(false);
        }
        if (aSY.f(this.abilities)) {
            if (PlayerControllerInvoker.h(this.mc.playerController)) {
                if (!aSY.d(this.abilities)) {
                    aSY.e(this.abilities, true);
                    this.sendPlayerAbilities();
                }
            } else if (wj_0.d(this.movementInput())) {
                if (this.flyToggleTimer == 0) {
                    this.flyToggleTimer = 7;
                } else {
                    aSY.e(this.abilities, !aSY.d(this.abilities));
                    this.sendPlayerAbilities();
                    this.flyToggleTimer = 0;
                }
            }
        }
        if (aSY.d(this.abilities) && this.isCurrentViewEntity()) {
            if (wj_0.a(this.movementInput())) {
                this.motionY -= (double)(aSY.e(this.abilities) * 3.0f);
            }
            if (wj_0.d(this.movementInput())) {
                this.motionY += (double)(aSY.e(this.abilities) * 3.0f);
            }
        }
        if (this.isRidingHorse()) {
            if (this.horseJumpPowerCounter < 0) {
                ++this.horseJumpPowerCounter;
                if (this.horseJumpPowerCounter == 0) {
                    this.horseJumpPower = 0.0f;
                }
            }
            if (!wj_0.d(this.movementInput())) {
                this.horseJumpPowerCounter = -10;
                this.sendHorseJump();
            } else if (wj_0.d(this.movementInput())) {
                this.horseJumpPowerCounter = 0;
                this.horseJumpPower = 0.0f;
            } else {
                ++this.horseJumpPowerCounter;
                this.horseJumpPower = this.horseJumpPowerCounter < 10 ? (float)this.horseJumpPowerCounter * 0.1f : 0.8f + 2.0f / (float)(this.horseJumpPowerCounter - 9) * 0.1f;
            }
        } else {
            this.horseJumpPower = 0.0f;
        }
        super.onLivingUpdate();
        if (this.onGround && aSY.d(this.abilities) && !PlayerControllerInvoker.h(this.mc.playerController)) {
            aSY.e(this.abilities, false);
            this.sendPlayerAbilities();
        }
    }

    public boolean a(Block block) {
        for (int i = MathHelper.floor_double(this.getEntityBoundingBox().e); i < MathHelper.floor_double(this.getEntityBoundingBox().b) + 1; ++i) {
            for (int j = MathHelper.floor_double(this.getEntityBoundingBox().a); j < MathHelper.floor_double(this.getEntityBoundingBox().c) + 1; ++j) {
                for (int k = MathHelper.floor_double(this.getEntityBoundingBox().f); k < MathHelper.floor_double(this.getEntityBoundingBox().d) + 1; ++k) {
                    rm_2 rm_22;
                    Block block2 = BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, new BlockPos(i, j, k)));
                    if (block2 != block || block2 instanceof BlockAir || (rm_22 = BlocksInvoker.a(block2, (World)this.mc.world, new BlockPos(i, j, k), BlockInvoker.getMaterial(this.mc.world, new BlockPos(i, j, k)))) == null || !h__0.b(this.getEntityBoundingBox(), rm_22)) continue;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void addChatComponentMessage(IChatComponent iChatComponent) {
        kp_1.a(GW.f(this.mc.ingameGUI), iChatComponent);
    }

    public void a(int n, int n2) {
        PlayerControllerInvoker.b(this.mc.playerController, this.bp.f, n, n2, 2, this);
    }

    public void X() {
        super.Z();
    }

    public String getClientBrand() {
        return this.clientBrand;
    }

    @Override
    public float getToolDigEfficiency(Block block) {
        float f = InventoryInvoker.a(this.inventory, block);
        if (f > 1.0f) {
            int n = alf_0.getEfficiencyModifier(this);
            InventoryInvoker.g(this.inventory);
            f += (float)(n * n + 1);
        }
        if (this.isPotionActive(Potion.digSpeed)) {
            f *= 1.0f + (float)(a3M.g(this.getActivePotionEffect(Potion.digSpeed)) + 1) * 0.2f;
        }
        if (this.isPotionActive(Potion.digSlowdown)) {
            float f2 = 1.0f;
            switch (a3M.g(this.getActivePotionEffect(Potion.digSlowdown))) {
                case 0: {
                    f2 = 0.3f;
                    break;
                }
                case 1: {
                    f2 = 0.09f;
                    break;
                }
                case 2: {
                    f2 = 0.0027f;
                    break;
                }
                default: {
                    f2 = 8.1E-4f;
                }
            }
            f *= f2;
        }
        if (this.isInsideOfMaterial(Material.M) && !alf_0.c(this)) {
            f /= 5.0f;
        }
        if (!this.onGround) {
            f /= 5.0f;
        }
        return f;
    }

    public void b(String string) {
        for (String string2 : this.coomands) {
            if (!StringInvoker.e(StringInvoker.i(string), string2)) continue;
            String[] stringArray = StringInvoker.g(string, aug_0.E);
            String string3 = aL0.a(aL0.a(new StringBuilder(), StringInvoker.i(stringArray[0])), StringInvoker.a(string, (CharSequence)stringArray[0], (CharSequence)aug_0.aE)).toString();
            aGW.a(NovolineInvoker.s(MCInvoker.z(this.mc)), this, string3);
            return;
        }
        aDM.a(this.connection, new C01PacketChatMessage(string));
    }

    @Override
    public void a(na_1 na_12, rs_1 rs_12) {
        MCInvoker.displayGuiScreen(this.mc, new RY(this.inventory, rs_12, na_12));
    }

    public int c(Item item) {
        for (int i = 0; i < ListInvoker.size(this.bp.b); ++i) {
            Slot slot = (Slot)ListInvoker.get(this.bp.b, i);
            if (!ItemStackInvoker.e(slot) || !ItemStackInvoker.a(slot, item)) continue;
            return i + 1;
        }
        return -1;
    }

    @Override
    public void l(Entity entity) {
        ayx_2.a(this.mc.effectRenderer, entity, B7.CRIT_MAGIC);
    }

    @Override
    public void moveEntity(double d, double d2, double d3) {
        MoveEvent moveEvent = new MoveEvent(d, d2, d3);
        EventManagerInvoker.call(moveEvent);
        super.moveEntity(MoveInoker.getX(moveEvent), MoveInoker.getY(moveEvent), MoveInoker.setZ(moveEvent));
    }

    public Slot p(int n) {
        return afy_2.a(this.bp, n);
    }

    public StatFileWriter k() {
        return this.statWriter;
    }

    public float as() {
        float f = MathHelper.a(this.mc.player.rotationYaw);
        MovementInput movementInput = this.mc.player.movementInput();
        float f2 = wj_0.b(movementInput);
        float f3 = wj_0.c(movementInput);
        if (f3 != 0.0f) {
            if (f2 < 0.0f) {
                f += f3 < 0.0f ? 135.0f : 45.0f;
            } else if (f2 > 0.0f) {
                f -= f3 < 0.0f ? 135.0f : 45.0f;
            } else if (f2 == 0.0f && f3 < 0.0f) {
                f -= 180.0f;
            }
        } else if (f2 < 0.0f) {
            f += 90.0f;
        } else if (f2 > 0.0f) {
            f -= 90.0f;
        }
        return MathHelper.a(f);
    }

    public double a(boolean bl, double d) {
        double d2 = this.l(bl);
        if (this.isPotionActive(Potion.moveSpeed)) {
            int n = this.b(Potion.moveSpeed) - this.b(Potion.moveSlowdown);
            d2 *= 1.0 + d * (double)n;
        }
        return d2;
    }

    public boolean ay() {
        return this.A;
    }

    @Override
    public void a(a6z_0 a6z_02) {
        MCInvoker.displayGuiScreen(this.mc, new RT(a6z_02));
    }

    @Override
    public void updateEntityActionState() {
        super.updateEntityActionState();
        if (this.isCurrentViewEntity()) {
            this.moveStrafing = wj_0.b(this.movementInput());
            this.moveForward = wj_0.c(this.movementInput());
            this.isJumping = wj_0.d(this.movementInput());
            this.prevRenderArmYaw = this.renderArmYaw;
            this.prevRenderArmPitch = this.renderArmPitch;
            this.renderArmPitch = (float)((double)this.renderArmPitch + (double)(this.rotationPitch - this.renderArmPitch) * 0.5);
            this.renderArmYaw = (float)((double)this.renderArmYaw + (double)(this.rotationYaw - this.renderArmYaw) * 0.5);
        }
    }

    public int d() {
        int n = 0;
        ItemStack itemStack;
        while (!(act_2.k(itemStack = InventoryInvoker.c(this.inventory, n)) instanceof ItemBow)) {
            ++n;
        }
        return n;
    }

    public float c(float f) {
        float f2 = MathHelper.a(this.mc.player.rotationYaw);
        MovementInput movementInput = this.mc.player.movementInput();
        float f3 = wj_0.b(movementInput);
        float f4 = wj_0.c(movementInput);
        if (f4 != 0.0f) {
            if (f3 < 0.0f) {
                f2 += f4 < 0.0f ? 135.0f : 45.0f;
            } else if (f3 > 0.0f) {
                f2 -= f4 < 0.0f ? 135.0f : 45.0f;
            } else if (f3 == 0.0f && f4 < 0.0f) {
                f2 -= 180.0f;
            }
        } else if (f3 < 0.0f) {
            f2 += 90.0f;
        } else if (f3 > 0.0f) {
            f2 -= 90.0f;
        }
        return MathHelper.a(f2 + f);
    }

    public void g(double d, double d2, double d3) {
        double[] dArray = this.a(0.0f);
        double d4 = dArray[0];
        double d5 = dArray[1];
        this.moveEntity(d4 * d, d2, d5 * d3);
    }

    public void a(GuiScreen guiScreen) {
        InventoryInvoker.c(this.inventory, null);
        super.N();
        MCInvoker.displayGuiScreen(this.mc, guiScreen);
    }

    @Override
    public void addStat(StatBase statBase, int n) {
        if (statBase.j) {
            super.addStat(statBase, n);
        }
    }

    public float getHorseJumpPower() {
        return this.horseJumpPower;
    }

    public boolean f(double d) {
        return d % 1.0 == 0.015625 || d % 1.0 == 0.0625 || d % 0.125 == 0.0;
    }

    public void a(int n, int n2, int n3, boolean bl) {
        PlayerControllerInvoker.b(this.mc.playerController, n, n2, n3, 2, this);
    }

    public double al() {
        double d = this.j();
        if (this.isPotionActive(Potion.moveSpeed)) {
            int n = this.b(Potion.moveSpeed) - this.b(Potion.moveSlowdown);
            d *= 1.0 + 0.2 * (double)n;
        }
        return d;
    }

    public float aB() {
        return this.cf;
    }

    @Override
    public void sendPlayerAbilities() {
        aDM.a(this.connection, new C13PacketPlayerAbilities(this.abilities));
    }

    public double g() {
        return wj_0.a(this.movementInput()) ? 0.02940000465343299 : 0.09799999956493638;
    }

    public boolean isMoving() {
        return this.moveForward != 0.0f || this.moveStrafing != 0.0f;
    }

    public void a(GuiScreen guiScreen, int n) {
        aDM.b(this.connection, new C0DPacketCloseWindow(n));
        this.a(guiScreen);
    }

    @Override
    public void N() {
        aDM.a(this.connection, new C0DPacketCloseWindow(this.bI.f));
        this.az();
    }

    public boolean a(MotionUpdateEvent motionUpdateEvent) {
        double d = EventInvoker.b(motionUpdateEvent) - this.lastReportedYaw;
        double d2 = EventInvoker.i(motionUpdateEvent) - this.lastReportedPitchlastReportedPitch;
        return d != 0.0 || d2 != 0.0;
    }

    @Override
    public void setSprinting(boolean bl) {
        super.setSprinting(bl);
        this.sprintingTicksLeft = 600;
    }

    public EntityPlayerSP(Minecraft minecraft, World world, NetHandlerPlayClient netHandlerPlayClient, StatFileWriter statFileWriter) {
        super(world, netHandlerPlayClient.a());
        this.connection = netHandlerPlayClient;
        this.statWriter = statFileWriter;
        this.mc = minecraft;
        this.dimension = 0;
    }

    @Override
    public void C() {
        aDM.a(this.connection, new C16PacketClientStatus(C16PacketClientStatus$EnumState.PERFORM_RESPAWN));
    }

    public MovementInput movementInput() {
        return this.bZ;
    }

    @Override
    public void mountEntity(Entity entity) {
        super.mountEntity(entity);
        if (entity instanceof EntityMinecart) {
            SoundHandlerInvoker.c(MCInvoker.l(this.mc), new aKH(this, (EntityMinecart)entity));
        }
    }

    private static boolean lambda$onUpdate$0(FutureTask futureTask) {
        return X9.c(futureTask) == ag3_0.UPDATE;
    }

    public int a(Item[] itemArray, Item item) {
        int n = 0;
        for (Item item2 : itemArray) {
            if (item2 != item) continue;
            ++n;
        }
        return n;
    }

    public void a(float f, int n, int n2) {
        this.bS = f;
        this.bi = n;
        this.bL = n2;
    }

    public void setMotionSpeed(double d) {
        this.motionX *= d;
        this.motionZ *= d;
    }

    public double getBaseMoveSpeed(double d, double d2) {
        if (this.isPotionActive(Potion.moveSpeed)) {
            int n = this.b(Potion.moveSpeed) - this.b(Potion.moveSlowdown);
            d *= 1.0 + d2 * (double)n;
        }
        return d;
    }

    @Override
    public boolean a(int n, String string) {
        return true;
    }

    public double aA() {
        if (this.aq()) {
            for (double d = this.posY; d > 0.0; d -= 0.5) {
                BlockPos blockPos = new BlockPos(this.posX, d, this.posZ);
                Block block = BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, blockPos));
                if (!akm_1.i(BlocksInvoker.getBlockState(block))) continue;
                return this.a((double)amv_2.h(blockPos)) - BlocksInvoker.I(block);
            }
        }
        return 999.0;
    }

    public void c(double d, double d2) {
        this.mc.player.motionX = (double)(-MathHelper.h(d2)) * d;
        this.mc.player.motionZ = (double)MathHelper.b(d2) * d;
    }

    public void az() {
        InventoryInvoker.c(this.inventory, null);
        super.N();
        MCInvoker.displayGuiScreen(this.mc, null);
    }

    public BlockPos at() {
        int n = MathHelper.floor_double(this.posX);
        int n2 = MathHelper.floor_double(this.posY);
        int n3 = MathHelper.floor_double(this.posZ);
        ArrayList arrayList = new ArrayList();
        for (int i = n - 5; i <= n + 5; ++i) {
            for (int j = n3 - 5; j <= n3 + 5; ++j) {
                for (int k = n2 - 3; k <= n2 + 3; ++k) {
                    BlockPos blockPos = new BlockPos(i, k, j);
                    Block block = BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, blockPos));
                    if (block == Blocks.air || akm_1.f(BlocksInvoker.getBlockState(block))) continue;
                    ListInvoker.add(arrayList, blockPos);
                }
            }
        }
        if (ListInvoker.isEmpty(arrayList)) {
            return null;
        }
        return (BlockPos)ListInvoker.get((List)aMF.a(aMF.a(ListInvoker.stream(arrayList), aN_.a(this::lambda$getNearestBlock$2)), aB0.a()), 0);
    }

    public int ak() {
        int n = 0;
        InventoryInvoker.c(this.inventory, n);
        return n;
    }

    @Override
    public void a(ItemStack itemStack) {
        Item item = act_2.k(itemStack);
        if (item == Items.writable_book) {
            MCInvoker.displayGuiScreen(this.mc, new RA(this, itemStack, true));
        }
    }

    public double j() {
        return this.isSprinting() ? 0.28630206268501246 : 0.2202643217126144;
    }

    public int h() {
        int n = 36;
        Block block;
        ItemStack itemStack;
        while (!(act_2.k(itemStack = ItemStackInvoker.a(afy_2.a(this.mc.player.bp, n))) instanceof ItemBlock) || itemStack.a <= 0 || !BlocksInvoker.g(block = ItemBlockInvoker.a((ItemBlock)act_2.k(itemStack))) && !(block instanceof fx_2) && !(block instanceof fg_2)) {
            ++n;
        }
        return n - 36;
    }

    public int a(Item item) {
        int n = 0;
        Iterator iterator = ListInvoker.iterator(this.bp.b);
        while (dz_0.c(iterator)) {
            Slot slot = (Slot)dz_0.b(iterator);
            if (!ItemStackInvoker.e(slot) || !ItemStackInvoker.a(slot, item)) continue;
            n += ItemStackInvoker.a((Slot)slot).a;
        }
        return n;
    }

    public boolean U() {
        double d = this.posY + 0.01;
        for (int i = MathHelper.floor_double(this.posX); i < MathHelper.i(this.posX); ++i) {
            for (int j = MathHelper.floor_double(this.posZ); j < MathHelper.i(this.posZ); ++j) {
                BlockPos blockPos = new BlockPos(i, (int)d, j);
                if (!(BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, blockPos)) instanceof BlockLiquid)) continue;
                return true;
            }
        }
        return false;
    }

    public boolean aj() {
        double d = this.posY - 0.01;
        for (int i = MathHelper.floor_double(this.posX); i < MathHelper.i(this.posX); ++i) {
            for (int j = MathHelper.floor_double(this.posZ); j < MathHelper.i(this.posZ); ++j) {
                BlockPos blockPos = new BlockPos(i, MathHelper.floor_double(d), j);
                if (!(BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, blockPos)) instanceof BlockLiquid)) continue;
                return true;
            }
        }
        return false;
    }

    public void b(int n, int n2, boolean bl) {
        PlayerControllerInvoker.b(this.mc.playerController, n, n2, 0, 1, this);
    }

    @Override
    public void l() {
        JumpEvent jumpEvent = new JumpEvent(this.getJumpMotion());
        EventManagerInvoker.call(jumpEvent);
        if (!SU.a(jumpEvent)) {
            super.a(SU.b(jumpEvent));
        }
    }

    public Block ar() {
        double d = this.posY - 0.01;
        for (int i = MathHelper.floor_double(this.posX); i < MathHelper.i(this.posX); ++i) {
            int n = MathHelper.floor_double(this.posZ);
            if (n >= MathHelper.i(this.posZ)) continue;
            return BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, new BlockPos(i, MathHelper.floor_double(d), n)));
        }
        return null;
    }

    public void k(float f) {
        if (this.cj) {
            float f2 = this.a() - f;
            if (f2 <= 0.0f) {
                this.i(f);
                if (f2 < 0.0f) {
                    this.hurtResistantTime = this.ba / 2;
                }
            } else {
                this.an = f2;
                this.i(this.a());
                this.hurtResistantTime = this.ba;
                this.c(DamageSource.r, f2);
                this.aB = 10;
                this.a8 = 10;
            }
        } else {
            this.i(f);
            this.cj = true;
        }
    }

    public int c() {
        int n = 0;
        ItemStack itemStack;
        while (!(act_2.k(itemStack = InventoryInvoker.c(this.inventory, n)) instanceof LC)) {
            ++n;
        }
        return n;
    }

    public Block[] aw() {
        Block block = BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, new BlockPos(this.mc.player.posX, this.mc.player.getEntityBoundingBox().c, this.mc.player.posZ)));
        Block block2 = BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, new BlockPos(this.mc.player.posX, this.mc.player.getEntityBoundingBox().a, this.mc.player.posZ)));
        return new Block[]{block, block2};
    }

    @Override
    public void a(rs_1 rs_12) {
        String string;
        String string2 = string = rs_12 instanceof dv_1 ? dy_0.a((dv_1)((Object)rs_12)) : aug_0.aA;
        if (string.equals(aug_0.z)) {
            MCInvoker.displayGuiScreen(this.mc, new R_(this.inventory, rs_12));
        } else if (string.equals(aug_0.av)) {
            MCInvoker.displayGuiScreen(this.mc, new RM(this.inventory, rs_12));
        } else if (string.equals(aug_0.aa)) {
            MCInvoker.displayGuiScreen(this.mc, new Rs(this.inventory, rs_12));
        } else if (string.equals(aug_0.ay)) {
            MCInvoker.displayGuiScreen(this.mc, new R0(this.inventory, rs_12));
        } else if (string.equals(aug_0.Z)) {
            MCInvoker.displayGuiScreen(this.mc, new rm_0(this.inventory, rs_12));
        } else if (!string.equals(aug_0.a) && !string.equals(aug_0.w)) {
            MCInvoker.displayGuiScreen(this.mc, new R_(this.inventory, rs_12));
        } else {
            MCInvoker.displayGuiScreen(this.mc, new rw_0(this.inventory, rs_12));
        }
        EventManagerInvoker.call(new ayp_1(string));
    }

    @Override
    protected void a(og_0 og_02) {
    }

    public double a() {
        return 0.09158124432567855;
    }

    protected boolean isCurrentViewEntity() {
        return MCInvoker.v(this.mc) == this;
    }

    private boolean a(BlockPos blockPos) {
        return !BlocksInvoker.x(BlockStateInvoker.getBlock(aV8.q(this.worldObj, blockPos))) && !BlocksInvoker.x(BlockStateInvoker.getBlock(aV8.q(this.worldObj, amv_2.e(blockPos))));
    }

    @Override
    public void a(a7K a7K2) {
        MCInvoker.displayGuiScreen(this.mc, new R9(this.inventory, a7K2, this.worldObj));
    }

    @Override
    public boolean a(DamageSource damageSource, float f) {
        return false;
    }

    public void c(String string) {
        this.clientBrand = string;
    }

    @Override
    public void a(double d) {
        JumpEvent jumpEvent = new JumpEvent(this.getJumpMotion());
        EventManagerInvoker.call(jumpEvent);
        if (!SU.a(jumpEvent)) {
            super.a(d);
        }
    }

    @Override
    public void d(float f) {
    }

    public void setSpeed(double d) {
        double d2 = this.mc.player.as();
        this.mc.player.motionX = (double)(-MathHelper.h(MathInvoker.o(d2))) * d;
        this.mc.player.motionZ = (double)MathHelper.b(MathInvoker.o(d2)) * d;
    }

    @Override
    public void displayGui(dv_1 dv_12) {
        String string = dy_0.a(dv_12);
        if (aug_0.A.equals(string)) {
            MCInvoker.displayGuiScreen(this.mc, new GuiCrafting(this.inventory, this.worldObj));
        } else if (aug_0.o.equals(string)) {
            MCInvoker.displayGuiScreen(this.mc, new GuiEnchantment(this.inventory, this.worldObj, dv_12));
        } else if (aug_0.h.equals(string)) {
            MCInvoker.displayGuiScreen(this.mc, new GuiRepair(this.inventory, this.worldObj));
        }
    }

    public double getJumpMotion() {
        return (double)0.42f + 0.1 * (double)this.b(Potion.jump);
    }

    public double e(double d) {
        return d + 0.1 * (double)this.b(Potion.jump);
    }

    public double s(int n) {
        return MathHelper.a(this.getLastTickDistance() * 20.0, n);
    }

    @Override
    protected void c(DamageSource damageSource, float f) {
        if (!this.a(damageSource)) {
            this.i(this.a() - f);
        }
    }

    public float an() {
        return this.b6;
    }

    public boolean isRidingHorse() {
        return this.r != null && this.r instanceof na_1 && avq_0.b((na_1)this.r);
    }

    public void onUpdateWalkingPlayer() {
        boolean bl;
        boolean bl2 = this.isSprinting();
        if (bl2 != this.serverSprintState) {
            aDM.a(this.connection, new C0BPacketEntityAction(this, C0BPacketEntityAction$Action.START_SPRINTING));
            this.serverSprintState = bl2;
        }
        if ((bl = this.isSneaking()) != this.serverSneakState) {
            aDM.a(this.connection, new C0BPacketEntityAction(this, C0BPacketEntityAction$Action.START_SNEAKING));
            this.serverSneakState = bl;
        }
        if (this.isCurrentViewEntity()) {
            MotionUpdateEvent motionUpdateEvent = new MotionUpdateEvent(this, this.posX, this.getEntityBoundingBox().a, this.posZ, this.rotationYaw, this.rotationPitch, this.onGround, State.PRE);
            EventManagerInvoker.call(motionUpdateEvent);
            if (EventInvoker.a(motionUpdateEvent)) {
                EventManagerInvoker.call(new MotionUpdateEvent(this, State.POST));
                return;
            }
            double d = EventInvoker.h(motionUpdateEvent) - this.lastReportedPosX;
            double d2 = EventInvoker.e(motionUpdateEvent) - this.lastReportedPosY;
            double d3 = EventInvoker.c(motionUpdateEvent) - this.lastReportedPosZ;
            double d4 = EventInvoker.b(motionUpdateEvent) - this.lastReportedYaw;
            double d5 = EventInvoker.i(motionUpdateEvent) - this.lastReportedPitchlastReportedPitch;
            Criticals criticals = (Criticals)ModuleInvoker.isEnable(ModuleRegistry.CRITICALS);
            boolean bl3 = aip_1.a(criticals) && (StringPropertyInvoker.isMode(aip_1.b(criticals), aug_0.G) || StringPropertyInvoker.isMode(aip_1.b(criticals), aug_0.B));
            if (d * d + d2 * d2 + d3 * d3 > 9.0E-4 || this.positionUpdateTicks < 20) {
                // empty if block
            }
            boolean bl4 = d4 != 0.0 || d5 != 0.0;
            if (this.r == null && StringInvoker.c(DisplayInvoker.b(), aug_0.s)) {
                aDM.a(this.connection, new C06PacketPlayerPosLook(EventInvoker.h(motionUpdateEvent), EventInvoker.e(motionUpdateEvent), EventInvoker.c(motionUpdateEvent), EventInvoker.b(motionUpdateEvent), EventInvoker.i(motionUpdateEvent), EventInvoker.g(motionUpdateEvent)));
            } else {
                aDM.a(this.connection, new C06PacketPlayerPosLook(this.motionX, -999.0, this.motionZ, EventInvoker.b(motionUpdateEvent), EventInvoker.i(motionUpdateEvent), EventInvoker.g(motionUpdateEvent)));
            }
            ++this.positionUpdateTicks;
            this.lastReportedPosX = EventInvoker.h(motionUpdateEvent);
            this.lastReportedPosY = EventInvoker.e(motionUpdateEvent);
            this.lastReportedPosZ = EventInvoker.c(motionUpdateEvent);
            this.positionUpdateTicks = 0;
            this.lastReportedYaw = EventInvoker.b(motionUpdateEvent);
            this.lastReportedPitchlastReportedPitch = EventInvoker.i(motionUpdateEvent);
            EventManagerInvoker.call(new MotionUpdateEvent(this, State.POST));
        }
    }

    public double a(double d, int n) {
        double d2 = this.j();
        if (this.isPotionActive(Potion.moveSpeed)) {
            d2 *= 1.0 + d * (double)n;
        }
        return d2;
    }

    public int b(Item item) {
        int n = 0;
        ItemStack itemStack;
        while (act_2.k(itemStack = InventoryInvoker.c(this.inventory, n)) != item) {
            ++n;
        }
        return n;
    }

    @Override
    public void onUpdate() {
        if (aV8.isBlockLoaded(this.worldObj, new BlockPos(this.posX, 0.0, this.posZ))) {
            EventManagerInvoker.call(new PlayerUpdateEvent());
            if (this.fuck > 0) {
                --this.fuck;
            }
            if (!NovolineInvoker.b(MCInvoker.z(this.mc))) {
                aMF.a(aMF.b(ListInvoker.stream(aci_0.a(NovolineInvoker.i(MCInvoker.z(this.mc)))), EntityPlayerSP::lambda$onUpdate$0), this::lambda$onUpdate$1);
            }
            super.onUpdate();
            if (this.isRiding()) {
                aDM.a(this.connection, new C05PacketPlayerLook(this.rotationYaw, this.rotationPitch, this.onGround));
                aDM.a(this.connection, new C0CPacketInput(this.moveStrafing, this.moveForward, wj_0.d(this.movementInput()), wj_0.a(this.movementInput())));
            } else {
                this.onUpdateWalkingPlayer();
            }
        }
    }

    public void r(int n) {
        PlayerControllerInvoker.b(this.mc.playerController, this.bp.f, n, 1, 4, this);
    }

    public int a(int n) {
        int n2 = 0;
        Iterator iterator = ListInvoker.iterator(this.bp.b);
        while (dz_0.c(iterator)) {
            Slot slot = (Slot)dz_0.b(iterator);
            if (!ItemStackInvoker.e(slot) || px_0.a(act_2.k(ItemStackInvoker.a(slot))) != n) continue;
            n2 += ItemStackInvoker.a((Slot)slot).a;
        }
        return n2;
    }

    public void b(BlockPos blockPos) {
        Block block = BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, blockPos));
        float f = 1.0f;
        int n = 0;
        while (true) {
            ItemStack itemStack;
            if (act_2.c(itemStack = InventoryInvoker.c(this.inventory, n), block) > f) {
                f = act_2.c(itemStack, block);
            }
            ++n;
        }
    }

    private Double lambda$getNearestBlock$2(BlockPos blockPos) {
        return db_0.a(this.mc.player.b(blockPos));
    }

    public void a(double d, float f) {
        this.mc.player.motionX = (double)(-MathHelper.h(MathInvoker.o(f))) * d;
        this.mc.player.motionZ = (double)MathHelper.b(MathInvoker.o(f)) * d;
    }

    public float c(double d) {
        return (float)MathInvoker.a(0.099999994, (double)((float)(0.099999994 / this.l(true) * d)));
    }

    public int b(Item item, int n) {
        int n2 = 0;
        Iterator iterator = ListInvoker.iterator(this.bp.b);
        while (dz_0.c(iterator)) {
            Slot slot = (Slot)dz_0.b(iterator);
            if (!ItemStackInvoker.e(slot) || !ItemStackInvoker.a(slot, item) || act_2.c(ItemStackInvoker.a(slot)) != n) continue;
            n2 += ItemStackInvoker.a((Slot)slot).a;
        }
        return n2;
    }

    public boolean av() {
        for (int i = MathHelper.floor_double(this.getEntityBoundingBox().e); i < MathHelper.floor_double(this.getEntityBoundingBox().b) + 1; ++i) {
            for (int j = MathHelper.floor_double(this.getEntityBoundingBox().a); j < MathHelper.floor_double(this.getEntityBoundingBox().c) + 1; ++j) {
                for (int k = MathHelper.floor_double(this.getEntityBoundingBox().f); k < MathHelper.floor_double(this.getEntityBoundingBox().d) + 1; ++k) {
                    rm_2 rm_22;
                    Block block = BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, new BlockPos(i, j, k)));
                    if (block instanceof BlockAir || (rm_22 = BlocksInvoker.a(block, (World)this.mc.world, new BlockPos(i, j, k), BlockInvoker.getMaterial(this.mc.world, new BlockPos(i, j, k)))) == null || !h__0.b(this.getEntityBoundingBox(), rm_22)) continue;
                    return true;
                }
            }
        }
        return false;
    }

    public int a(Item item, int n) {
        for (int i = 0; i < ListInvoker.size(this.bp.b); ++i) {
            Slot slot = (Slot)ListInvoker.get(this.bp.b, i);
            if (!ItemStackInvoker.e(slot) || !ItemStackInvoker.a(slot, item) || act_2.c(ItemStackInvoker.a(slot)) != n) continue;
            return i + 1;
        }
        return -1;
    }

    @Override
    public void h(Entity entity) {
        ayx_2.a(this.mc.effectRenderer, entity, B7.CRIT);
    }

    public void m(float f) {
        this.cf = f;
    }

    public double blocksInSecond() {
        return this.getLastTickDistance() * 20.0;
    }

    @Override
    public boolean isSneaking() {
        boolean bl = this.movementInput() != null && wj_0.a(this.movementInput());
        return !this.sleeping;
    }

    public boolean u() {
        double d = this.posY - 0.01;
        for (int i = MathHelper.floor_double(this.posX); i < MathHelper.i(this.posX); ++i) {
            for (int j = MathHelper.floor_double(this.posZ); j < MathHelper.i(this.posZ); ++j) {
                BlockPos blockPos = new BlockPos(i, MathHelper.floor_double(d), j);
                if (!(BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, blockPos)) instanceof BlockLiquid) || BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, blockPos))) != Material.M) continue;
                return true;
            }
        }
        return false;
    }

    public void a(MovementInput movementInput) {
        this.bZ = movementInput;
    }

    @Override
    public void Z() {
        super.Z();
        aDM.a(this.connection, new C0APacketAnimation());
    }

    public double m(boolean bl) {
        double d = this.l(bl);
        if (this.isPotionActive(Potion.moveSpeed)) {
            int n = this.b(Potion.moveSpeed) - this.b(Potion.moveSlowdown);
            d *= 1.0 + 0.2 * (double)n;
        }
        return d;
    }

    public double l(boolean bl) {
        return 0.28630206268501246;
    }

    @Override
    protected boolean pushOutOfBlocks(double d, double d2, double d3) {
        BZ bZ = new BZ();
        EventManagerInvoker.call(bZ);
        if (!this.H && !alo_2.a(bZ)) {
            BlockPos blockPos = new BlockPos(d, d2, d3);
            double d4 = d - (double)amv_2.j(blockPos);
            double d5 = d3 - (double)amv_2.i(blockPos);
            if (!this.a(blockPos)) {
                int n = -1;
                double d6 = 9999.0;
                if (this.a(amv_2.d(blockPos)) && d4 < d6) {
                    d6 = d4;
                    n = 0;
                }
                if (this.a(amv_2.f(blockPos)) && 1.0 - d4 < d6) {
                    d6 = 1.0 - d4;
                    n = 1;
                }
                if (this.a(amv_2.a(blockPos)) && d5 < d6) {
                    d6 = d5;
                    n = 4;
                }
                if (this.a(amv_2.b(blockPos)) && 1.0 - d5 < d6) {
                    n = 5;
                }
                double d7 = 0.1f;
                this.motionX = -d7;
            }
        }
        return false;
    }

    public void y() {
        aDM.a(this.connection, new C0BPacketEntityAction(this, C0BPacketEntityAction$Action.OPEN_INVENTORY));
    }

    public boolean Y() {
        return this.serverSprintState;
    }

    public double[] a(float f) {
        float f2 = this.rotationYaw + f;
        if (this.moveForward < 0.0f) {
            f2 += 180.0f;
        }
        if (this.moveStrafing > 0.0f) {
            f2 -= 90.0f * (this.moveForward < 0.0f ? -0.5f : (this.moveForward > 0.0f ? 0.5f : 1.0f));
        }
        if (this.moveStrafing < 0.0f) {
            f2 += 90.0f * (this.moveForward < 0.0f ? -0.5f : (this.moveForward > 0.0f ? 0.5f : 1.0f));
        }
        float f3 = MathHelper.b((double)(f2 + 90.0f) * Math.PI / 180.0);
        float f4 = MathHelper.h((double)(f2 + 90.0f) * Math.PI / 180.0);
        return new double[]{f3, f4};
    }

    public boolean B() {
        return this.rotationYaw - this.lastReportedYaw != 0.0f || this.rotationPitch - this.lastReportedPitchlastReportedPitch != 0.0f;
    }

    public float v() {
        return (float)(0.099999994 / this.l(true) * this.getLastTickDistance());
    }

    public double V() {
        return this.getLastTickDistance() * 20.0;
    }

    public void l(float f) {
        this.b6 = f;
    }

    public void k(boolean bl) {
        this.serverSprintState = bl;
    }

    public void o(int n) {
        aDM.a(this.connection, new C0DPacketCloseWindow(n));
        this.az();
    }
}


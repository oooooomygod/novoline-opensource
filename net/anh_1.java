/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.events.EventState;
import cc.novoline.events.events.ClickWindowEvent;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.EventManagerInvoker;
import cc.novoline.invoke.GameSettingsInvoker;
import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.ItemBlockInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.MouseInvoker;
import cc.novoline.invoke.NetworkManagerInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.SoundHandlerInvoker;
import deobf.Entity;
import deobf.EntityPlayer;
import deobf.EntityPlayerSP;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.world.GameType;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import deobf.ModuleRegistry;
import net.minecraft.util.MovingObjectPosition;
import deobf.NetHandlerPlayClient;
import cc.novoline.modules.combat.Reach;
import deobf.Vec3;
import net.minecraft.multiplayer.WorldClient;
import net.minecraft.network.packts.C02PacketUseEntity;
import net.minecraft.network.packts.C02PacketUseEntity$Action;
import net.minecraft.network.packts.C07PacketPlayerDigging;
import net.minecraft.network.packts.C07PacketPlayerDigging$Action;
import net.minecraft.network.packts.C08PacketPlayerBlockPlacement;
import net.minecraft.network.packts.C09PacketHeldItemChange;
import net.minecraft.network.packts.C0EPacketClickWindow;
import net.minecraft.network.packts.C10PacketCreativeInventoryAction;
import net.minecraft.network.packts.C11PacketEnchantItem;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.anH
 */
public class anh_1 {
    private int a;
    private BlockPos g = new BlockPos(-1, -1, -1);
    private ItemStack f;
    private float b;
    private GameType i = GameType.SURVIVAL;
    private boolean j;
    public int d;
    private Minecraft h;
    private NetHandlerPlayClient e;
    public float c;

    public boolean a(EntityPlayer entityPlayer, Entity entity, MovingObjectPosition movingObjectPosition) {
        this.o();
        Vec3 vec3 = new Vec3(movingObjectPosition.b.xCoord - entity.posX, movingObjectPosition.b.yCoord - entity.posY, movingObjectPosition.b.zCoord - entity.posZ);
        aDM.a(this.e, new C02PacketUseEntity(entity, vec3));
        return this.i != GameType.SPECTATOR && ayj_0.a(entity, entityPlayer, vec3);
    }

    public boolean a(EntityPlayer entityPlayer, Entity entity) {
        this.o();
        aDM.a(this.e, new C02PacketUseEntity(entity, C02PacketUseEntity$Action.INTERACT));
        return this.i != GameType.SPECTATOR && a6w_0.c(entityPlayer, entity);
    }

    public boolean k() {
        return this.i == GameType.SPECTATOR;
    }

    public void b(EntityPlayer entityPlayer) {
        ar3_0.a(this.i, entityPlayer.abilities);
    }

    public boolean e() {
        return !ar3_0.e(this.i);
    }

    public static void a(Minecraft minecraft, anh_1 anh_12, BlockPos blockPos, EnumFacing enumFacing) {
        if (!BlockInvoker.a(minecraft.world, minecraft.player, blockPos, enumFacing)) {
            anh_12.c(blockPos, enumFacing);
        }
    }

    public void c(EntityPlayer entityPlayer) {
        this.o();
        aDM.a(this.e, new C07PacketPlayerDigging(C07PacketPlayerDigging$Action.RELEASE_USE_ITEM, BlockPos.m, EnumFacing.DOWN));
        a6w_0.e(entityPlayer);
    }

    public boolean b() {
        return this.j;
    }

    public void a(ItemStack itemStack) {
        if (ar3_0.e(this.i)) {
            aDM.a(this.e, new C10PacketCreativeInventoryAction(-1, itemStack));
        }
    }

    public void c() {
        if (this.j) {
            aDM.a(this.e, new C07PacketPlayerDigging(C07PacketPlayerDigging$Action.ABORT_DESTROY_BLOCK, this.g, EnumFacing.DOWN));
            this.j = false;
            this.c = 0.0f;
            BlockInvoker.b(this.h.world, PlayerInvoker.O(this.h.player), this.g, -1);
        }
    }

    public boolean a(EntityPlayer entityPlayer, World world, ItemStack itemStack) {
        if (this.i == GameType.SPECTATOR) {
            return false;
        }
        this.o();
        aDM.a(this.e, new C08PacketPlayerBlockPlacement(InventoryInvoker.g(entityPlayer.inventory)));
        int n = itemStack.a;
        ItemStack itemStack2 = act_2.a(itemStack, world, entityPlayer);
        if (itemStack2 != itemStack || itemStack2.a != n) {
            entityPlayer.inventory.b[entityPlayer.inventory.a] = itemStack2;
            if (itemStack2.a == 0) {
                entityPlayer.inventory.b[entityPlayer.inventory.a] = null;
            }
            return true;
        }
        return false;
    }

    private boolean a(BlockPos blockPos) {
        ItemStack itemStack = PlayerInvoker.h(this.h.player);
        boolean bl = this.f == null;
        if (this.f != null) {
            boolean bl2 = act_2.k(itemStack) == act_2.k(this.f) && act_2.c(itemStack, this.f) && (act_2.y(itemStack) || act_2.c(itemStack) == act_2.c(this.f));
        }
        return blockPos.equals(this.g);
    }

    public boolean f() {
        return ar3_0.e(this.i);
    }

    private boolean d(int n, int n2) {
        return n2 == 1;
    }

    public void o() {
        int n = this.h.player.inventory.a;
        if (n != this.a) {
            this.a = n;
            aDM.a(this.e, new C09PacketHeldItemChange(this.a));
        }
    }

    private boolean a(int n) {
        return n == 2;
    }

    public void b(int n, int n2, int n3, int n4, EntityPlayer entityPlayer) {
        short s = afy_2.c(entityPlayer.bI);
        ItemStack itemStack = afy_2.a(entityPlayer.bI, n2, n3, n4, entityPlayer);
        aDM.a(this.e, new C0EPacketClickWindow(n, n2, n3, n4, itemStack, s));
    }

    public void c(int n, int n2) {
        aDM.a(this.e, new C11PacketEnchantItem(n, n2));
    }

    public boolean n() {
        return this.i == GameType.SPECTATOR;
    }

    public boolean i() {
        return ar3_0.d(this.i);
    }

    public EntityPlayerSP a(World world, StatFileWriter statFileWriter) {
        return new EntityPlayerSP(this.h, world, this.e, statFileWriter);
    }

    public void a(EntityPlayer entityPlayer) {
        entityPlayer.rotationYaw = -180.0f;
    }

    public boolean a(BlockPos blockPos, EnumFacing enumFacing) {
        if (ar3_0.c(this.i)) {
            if (this.i == GameType.SPECTATOR) {
                return false;
            }
            if (!PlayerInvoker.ao(this.h.player)) {
                Block block = BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.h.world, blockPos));
                PlayerInvoker.W(this.h.player);
                return false;
            }
        }
        if (!ak9_0.a(BlockInvoker.i(this.h.world), blockPos)) {
            return false;
        }
        if (ar3_0.e(this.i)) {
            aDM.a(this.e, new C07PacketPlayerDigging(C07PacketPlayerDigging$Action.START_DESTROY_BLOCK, blockPos, enumFacing));
            anh_1.a(this.h, this, blockPos, enumFacing);
            this.d = 5;
        } else if (!this.j || !this.a(blockPos)) {
            if (this.j) {
                aDM.a(this.e, new C07PacketPlayerDigging(C07PacketPlayerDigging$Action.ABORT_DESTROY_BLOCK, this.g, enumFacing));
            }
            aDM.a(this.e, new C07PacketPlayerDigging(C07PacketPlayerDigging$Action.START_DESTROY_BLOCK, blockPos, enumFacing));
            Block block = BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.h.world, blockPos));
            boolean bl = BlocksInvoker.getBlockState(block) != Material.air;
            if (this.c == 0.0f) {
                BlocksInvoker.a(block, (World)this.h.world, blockPos, this.h.player);
            }
            if (BlocksInvoker.a(block, this.h.player, this.h.player.worldObj, blockPos) >= 1.0f) {
                this.c(blockPos, enumFacing);
            } else {
                this.j = true;
                this.g = blockPos;
                this.f = PlayerInvoker.h(this.h.player);
                this.c = 0.0f;
                this.b = 0.0f;
                BlockInvoker.b(this.h.world, PlayerInvoker.O(this.h.player), this.g, (int)(this.c * 10.0f) - 1);
            }
        }
        return true;
    }

    public void b(EntityPlayer entityPlayer, Entity entity) {
        this.o();
        aDM.a(this.e, new C02PacketUseEntity(entity, C02PacketUseEntity$Action.ATTACK));
        if (this.i != GameType.SPECTATOR) {
            a6w_0.d(entityPlayer, entity);
        }
    }

    private boolean a(int n, int n2) {
        if (n != 1) {
            // empty if block
        }
        return n2 == 4;
    }

    public void h() {
        this.o();
        if (NetworkManagerInvoker.d(aDM.a(this.e))) {
            NetworkManagerInvoker.h(aDM.a(this.e));
        } else {
            NetworkManagerInvoker.a(aDM.a(this.e));
        }
    }

    public boolean b(BlockPos blockPos, EnumFacing enumFacing) {
        this.o();
        if (this.d > 0) {
            --this.d;
            return true;
        }
        if (ar3_0.e(this.i) && ak9_0.a(BlockInvoker.i(this.h.world), blockPos)) {
            this.d = 5;
            aDM.a(this.e, new C07PacketPlayerDigging(C07PacketPlayerDigging$Action.START_DESTROY_BLOCK, blockPos, enumFacing));
            anh_1.a(this.h, this, blockPos, enumFacing);
            return true;
        }
        if (this.a(blockPos)) {
            Block block = BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.h.world, blockPos));
            if (BlocksInvoker.getBlockState(block) == Material.air) {
                this.j = false;
                return false;
            }
            this.c += BlocksInvoker.a(block, this.h.player, this.h.player.worldObj, blockPos);
            if (this.b % 4.0f == 0.0f) {
                SoundHandlerInvoker.c(MCInvoker.l(this.h), new akm_0(new ResourceLocation(an6_0.c(block.l)), (an6_0.d(block.l) + 1.0f) / 8.0f, an6_0.b(block.l) * 0.5f, (float)amv_2.j(blockPos) + 0.5f, (float)amv_2.h(blockPos) + 0.5f, (float)amv_2.i(blockPos) + 0.5f));
            }
            this.b += 1.0f;
            if (this.c >= 1.0f) {
                this.j = false;
                aDM.a(this.e, new C07PacketPlayerDigging(C07PacketPlayerDigging$Action.STOP_DESTROY_BLOCK, blockPos, enumFacing));
                this.c(blockPos, enumFacing);
                this.c = 0.0f;
                this.b = 0.0f;
                this.d = 5;
            }
            BlockInvoker.b(this.h.world, PlayerInvoker.O(this.h.player), this.g, (int)(this.c * 10.0f) - 1);
            return true;
        }
        return this.a(blockPos, enumFacing);
    }

    public void a(ItemStack itemStack, int n) {
        if (ar3_0.e(this.i)) {
            aDM.a(this.e, new C10PacketCreativeInventoryAction(n, itemStack));
        }
    }

    public void c(BlockPos blockPos, EnumFacing enumFacing) {
        WorldClient worldClient;
        IBlockState iBlockState;
        Block block;
        if (ar3_0.c(this.i)) {
            if (this.i == GameType.SPECTATOR) {
                return;
            }
            if (!PlayerInvoker.ao(this.h.player)) {
                Block block2 = BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.h.world, blockPos));
                ItemStack itemStack = PlayerInvoker.W(this.h.player);
                return;
            }
        }
        if (!(ar3_0.e(this.i) && PlayerInvoker.h(this.h.player) != null && act_2.k(PlayerInvoker.h(this.h.player)) instanceof LC || BlocksInvoker.getBlockState(block = BlockStateInvoker.getBlock(iBlockState = aV8.q(worldClient = this.h.world, blockPos))) == Material.air)) {
            aV8.c(worldClient, 2001, blockPos, BlocksInvoker.a(iBlockState));
            aV8.j(worldClient, blockPos);
            BlocksInvoker.c(block, worldClient, blockPos, iBlockState);
            this.g = new BlockPos(amv_2.j(this.g), -1, amv_2.i(this.g));
            if (!ar3_0.e(this.i)) {
                ItemStack itemStack = PlayerInvoker.W(this.h.player);
                act_2.a(itemStack, (World)worldClient, block, blockPos, this.h.player);
                if (itemStack.a == 0) {
                    PlayerInvoker.Y(this.h.player);
                }
            }
        }
    }

    public GameType g() {
        return this.i;
    }

    public boolean j() {
        return ar3_0.d(this.i);
    }

    public boolean a() {
        return ar3_0.e(this.i);
    }

    public void a(GameType gameType) {
        this.i = gameType;
        ar3_0.a(this.i, this.h.player.abilities);
    }

    public anh_1(Minecraft minecraft, NetHandlerPlayClient netHandlerPlayClient) {
        this.h = minecraft;
        this.e = netHandlerPlayClient;
    }

    private boolean b(int n, int n2) {
        return n == 2 && n2 == 3;
    }

    public boolean d() {
        return PlayerInvoker.U(this.h.player) && this.h.player.r instanceof na_1;
    }

    public void a(int n, int n2, int n3, int n4, EntityPlayer entityPlayer) {
        if (aCM.d() && aCM.a(abb_2.LOBBY) || MCInvoker.k(this.h)) {
            this.b(n, n2, n3, n4, entityPlayer);
        } else {
            short s = afy_2.c(entityPlayer.bI);
            C0EPacketClickWindow c0EPacketClickWindow = new C0EPacketClickWindow(n, n2, n3, n4, null, s);
            ClickWindowEvent clickWindowEvent = new ClickWindowEvent(c0EPacketClickWindow, EventState.PRE);
            EventManagerInvoker.call(clickWindowEvent);
            if (!aD_.c(clickWindowEvent)) {
                ItemStack itemStack = afy_2.a(entityPlayer.bI, n2, n3, n4, entityPlayer);
                aVZ.a(c0EPacketClickWindow, itemStack);
                aDM.a(this.e, aD_.a(clickWindowEvent));
                ClickWindowEvent clickWindowEvent2 = new ClickWindowEvent(c0EPacketClickWindow, EventState.POST);
                EventManagerInvoker.call(clickWindowEvent2);
            }
        }
    }

    public boolean m() {
        return GameSettingsInvoker.e(this.h.gameSettings.G) && this.h.objectMouseOver.typeOfHit.equals((Object)I.BLOCK);
    }

    public boolean b(EntityPlayerSP entityPlayerSP, WorldClient worldClient, ItemStack itemStack, BlockPos blockPos, EnumFacing enumFacing, Vec3 vec3) {
        float f = (float)(vec3.xCoord - (double)amv_2.j(blockPos));
        float f2 = (float)(vec3.yCoord - (double)amv_2.h(blockPos));
        float f3 = (float)(vec3.zCoord - (double)amv_2.i(blockPos));
        this.o();
        MCF mCF = (MCF)ModuleInvoker.isEnable(ModuleRegistry.MIDDLECLICK);
        if (akx_0.a(mCF) && MouseInvoker.c(2)) {
            enumFacing = EnumFacing.DOWN;
        }
        if (!ak9_0.a(BlockInvoker.i(this.h.world), blockPos)) {
            return false;
        }
        if (this.i != GameType.SPECTATOR) {
            ItemBlock itemBlock;
            IBlockState iBlockState = BlockInvoker.getMaterial(worldClient, blockPos);
            if (PlayerInvoker.w(entityPlayerSP) && PlayerInvoker.h(entityPlayerSP) != null || BlocksInvoker.a(BlockStateInvoker.getBlock(iBlockState), (World)worldClient, blockPos, iBlockState, entityPlayerSP, enumFacing, f, f2, f3)) {
                // empty if block
            }
            if (act_2.k(itemStack) instanceof ItemBlock && !ItemBlockInvoker.a(itemBlock = (ItemBlock)act_2.k(itemStack), worldClient, blockPos, enumFacing, entityPlayerSP, itemStack)) {
                return false;
            }
        }
        aDM.a(this.e, new C08PacketPlayerBlockPlacement(blockPos, SJ.i(enumFacing), itemStack, f, f2, f3));
        return this.i == GameType.SPECTATOR;
    }

    public float l() {
        Reach reach = (Reach)ModuleInvoker.isEnable(ModuleRegistry.REACH);
        if (aW4.b(reach)) {
            return aW4.a(reach) + 1.0f;
        }
        return ar3_0.e(this.i) ? 5.0f : 4.0f;
    }

    public boolean a(EntityPlayerSP entityPlayerSP, WorldClient worldClient, ItemStack itemStack, BlockPos blockPos, EnumFacing enumFacing, Vec3 vec3) {
        this.o();
        float f = (float)(vec3.xCoord - (double)amv_2.j(blockPos));
        float f2 = (float)(vec3.yCoord - (double)amv_2.h(blockPos));
        float f3 = (float)(vec3.zCoord - (double)amv_2.i(blockPos));
        if (!ak9_0.a(BlockInvoker.i(this.h.world), blockPos)) {
            return false;
        }
        if (this.i != GameType.SPECTATOR) {
            ItemBlock itemBlock;
            IBlockState iBlockState = BlockInvoker.getMaterial(worldClient, blockPos);
            if (PlayerInvoker.w(entityPlayerSP) && PlayerInvoker.h(entityPlayerSP) != null || BlocksInvoker.a(BlockStateInvoker.getBlock(iBlockState), (World)worldClient, blockPos, iBlockState, entityPlayerSP, enumFacing, f, f2, f3)) {
                // empty if block
            }
            if (act_2.k(itemStack) instanceof ItemBlock && !ItemBlockInvoker.a(itemBlock = (ItemBlock)act_2.k(itemStack), worldClient, blockPos, enumFacing, entityPlayerSP, itemStack)) {
                return false;
            }
        }
        aDM.b(this.e, new C08PacketPlayerBlockPlacement(blockPos, SJ.i(enumFacing), itemStack, f, f2, f3));
        return this.i == GameType.SPECTATOR;
    }
}


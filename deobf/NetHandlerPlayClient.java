/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  org.apache.logging.log4j.Logger
 */
package deobf;

import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.EntityRendererInvoker;
import cc.novoline.invoke.GameSettingsInvoker;
import cc.novoline.invoke.GuiAchievementInvoker;
import cc.novoline.invoke.IStreamInvoker;
import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.ItemStackInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.NBTInvoker;
import cc.novoline.invoke.NetworkManagerInvoker;
import cc.novoline.invoke.PacketBufferInvoker;
import cc.novoline.invoke.PacketThreadUtilInvoker;
import cc.novoline.invoke.PlayerControllerInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.S1BPacketEntityAttachInvoker;
import cc.novoline.invoke.S29PacketSoundEffectInvoker;
import cc.novoline.invoke.SoundHandlerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import cc.novoline.modules.player.NoRotate;
import com.mojang.authlib.GameProfile;
import net.minecraft.network.packts.C00PacketKeepAlive;
import net.minecraft.network.packts.C06PacketPlayerPosLook;
import net.minecraft.network.packts.C0FPacketConfirmTransaction;
import net.minecraft.network.packts.C17PacketCustomPayload;
import net.minecraft.network.packts.C19PacketResourcePackStatus;
import net.minecraft.network.packts.C19PacketResourcePackStatus$Action;
import net.minecraft.network.packts.CPacketVehicleMove;
import net.minecraft.network.packts.S00PacketKeepAlive;
import net.minecraft.network.packts.S01PacketJoinGame;
import net.minecraft.network.packts.S02PacketChat;
import net.minecraft.network.packts.S03PacketTimeUpdate;
import net.minecraft.network.packts.S04PacketEntityEquipment;
import net.minecraft.network.packts.S05PacketSpawnPosition;
import net.minecraft.network.packts.S06PacketUpdateHealth;
import net.minecraft.network.packts.S07PacketRespawn;
import net.minecraft.network.packts.S08PacketPlayerPosLook;
import net.minecraft.network.packts.S09PacketHeldItemChange;
import net.minecraft.network.packts.S0APacketUseBed;
import net.minecraft.network.packts.S0BPacketAnimation;
import net.minecraft.network.packts.S0CPacketSpawnPlayer;
import net.minecraft.network.packts.S0DPacketCollectItem;
import net.minecraft.network.packts.S0EPacketSpawnObject;
import net.minecraft.network.packts.S0FPacketSpawnMob;
import net.minecraft.network.packts.S10PacketSpawnPainting;
import net.minecraft.network.packts.S11PacketSpawnExperienceOrb;
import net.minecraft.network.packts.S12PacketEntityVelocity;
import net.minecraft.network.packts.S13PacketDestroyEntities;
import net.minecraft.network.packts.S14PacketEntity;
import net.minecraft.network.packts.S18PacketEntityTeleport;
import net.minecraft.network.packts.S19PacketEntityHeadLook;
import net.minecraft.network.packts.S19PacketEntityStatus;
import net.minecraft.network.packts.S1BPacketEntityAttach;
import net.minecraft.network.packts.S1CPacketEntityMetadata;
import net.minecraft.network.packts.S1DPacketEntityEffect;
import net.minecraft.network.packts.S1EPacketRemoveEntityEffect;
import net.minecraft.network.packts.S1FPacketSetExperience;
import net.minecraft.network.packts.S20PacketEntityProperties;
import net.minecraft.network.packts.S21PacketChunkData;
import net.minecraft.network.packts.S22PacketMultiBlockChange;
import net.minecraft.network.packts.S23PacketBlockChange;
import net.minecraft.network.packts.S24PacketBlockAction;
import net.minecraft.network.packts.S25PacketBlockBreakAnim;
import net.minecraft.network.packts.S26PacketMapChunkBulk;
import net.minecraft.network.packts.S27PacketExplosion;
import net.minecraft.network.packts.S28PacketEffect;
import net.minecraft.network.packts.S29PacketSoundEffect;
import net.minecraft.network.packts.S2APacketParticles;
import net.minecraft.network.packts.S2BPacketChangeGameState;
import net.minecraft.network.packts.S2CPacketSpawnGlobalEntity;
import net.minecraft.network.packts.S2DPacketOpenWindow;
import net.minecraft.network.packts.S2EPacketCloseWindow;
import net.minecraft.network.packts.S2FPacketSetSlot;
import net.minecraft.network.packts.S30PacketWindowItems;
import net.minecraft.network.packts.S31PacketWindowProperty;
import net.minecraft.network.packts.S32PacketConfirmTransaction;
import net.minecraft.network.packts.S33PacketUpdateSign;
import net.minecraft.network.packts.S34PacketMaps;
import net.minecraft.network.packts.S35PacketUpdateTileEntity;
import net.minecraft.network.packts.S36PacketSignEditorOpen;
import net.minecraft.network.packts.S37PacketStatistics;
import net.minecraft.network.packts.S38PacketPlayerListItem;
import net.minecraft.network.packts.S39PacketPlayerAbilities;
import net.minecraft.network.packts.S3APacketTabComplete;
import net.minecraft.network.packts.S3BPacketScoreboardObjective;
import net.minecraft.network.packts.S3CPacketUpdateScore;
import net.minecraft.network.packts.S3DPacketDisplayScoreboard;
import net.minecraft.network.packts.S3EPacketTeams;
import net.minecraft.network.packts.S3FPacketCustomPayload;
import net.minecraft.network.packts.S40PacketDisconnect;
import net.minecraft.network.packts.S41PacketServerDifficulty;
import net.minecraft.network.packts.S42PacketCombatEvent;
import net.minecraft.network.packts.S43PacketCamera;
import net.minecraft.network.packts.S44PacketWorldBorder;
import net.minecraft.network.packts.S45PacketTitle;
import net.minecraft.network.packts.S46PacketSetCompressionLevel;
import net.minecraft.network.packts.S47PacketPlayerListHeaderFooter;
import net.minecraft.network.packts.S49PacketUpdateEntityNBT;
import net.minecraft.network.packts.SPacketMoveVehicle;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.AttributeModifier;
import net.B7;
import net.BQ;
import net.minecraft.block.BlockPos;
import net.CG;
import net.ChatComponentText;
import net.CreativeTabs;
import net.EM;
import net.F8;
import net.FG;
import net.FH;
import net.GK;
import net.GU;
import net.GW;
import net.GuiMainMenu;
import net.GuiYesNo;
import net.I18n;
import net.Items;
import net.JK;
import net.K;
import net.Ma;
import net.MathHelper;
import net.NB;
import net.NV;
import net.NW;
import net.NetworkPlayerInfo;
import net.P8;
import net.PQ;
import net.PacketBuffer;
import net.QU;
import net.Qc;
import net.R5;
import net.R9;
import net.RA;
import net.RG;
import net.RO;
import net.GuiChat;
import net.Rc;
import net.S48PacketResourcePackSend;
import net.S9;
import net.SJ;
import net.SM;
import net.S_;
import net.ServerResourceMode;
import net.VM;
import net.VO;
import net.W_;
import net.World;
import net.a2l_0;
import net.a35;
import net.a3A;
import net.a3M;
import net.a4Z;
import net.a4i_0;
import net.a56;
import net.a5B;
import net.a5_0;
import net.a66;
import net.a6A;
import net.a6G;
import net.a6L;
import net.a6U;
import net.a6f_0;
import net.a6t_0;
import net.a6w_0;
import net.a6z_0;
import net.a7K;
import net.a8L;
import net.a9E;
import net.a9J;
import net.aBO;
import net.aFJ;
import net.aG4;
import net.aH7;
import net.aI9;
import net.aIC;
import net.aIE;
import net.aKM;
import net.aKZ;
import net.aL0;
import net.aLU;
import net.aMD;
import net.aN7;
import net.aNC;
import net.aNL;
import net.aOA;
import net.aPK;
import net.aQC;
import net.aRV;
import net.aS0;
import net.aSY;
import net.aV4;
import net.aVG;
import net.aWK;
import net.aYL;
import net.aZW;
import net.abd_0;
import net.acl_0;
import net.act_2;
import net.ad8_0;
import net.adf_0;
import net.adg_0;
import net.adg_1;
import net.adp_2;
import net.adv_1;
import net.adw_1;
import net.afh_0;
import net.afi_0;
import net.afi_1;
import net.afw_1;
import net.afy_2;
import net.ag9_0;
import net.agi_1;
import net.agr_2;
import net.agt_0;
import net.ahf_0;
import net.ahw_2;
import net.ahx_0;
import net.ai4_0;
import net.air_0;
import net.aja_0;
import net.ajw_0;
import net.ak4_0;
import net.alp_0;
import net.amf_2;
import net.amv_2;
import net.anh_1;
import net.aod_2;
import net.aom_0;
import net.aoz_1;
import net.apf_0;
import net.apg_2;
import net.apl_0;
import net.app_0;
import net.apx_2;
import net.aq_1;
import net.aqo_2;
import net.aqp_2;
import net.ar3_0;
import net.arf_1;
import net.arj_1;
import net.aro_0;
import net.arr_0;
import net.as0_0;
import net.aso_0;
import net.atn_0;
import net.aux__1;
import net.avj_1;
import net.avq_0;
import net.aw0_0;
import net.aw3_0;
import net.aw7_0;
import net.awd_2;
import net.awu_1;
import net.aww_1;
import net.ax3_0;
import net.ay0_0;
import net.ayb_1;
import net.ayc_2;
import net.ayj_0;
import net.ayx_2;
import net.azg_0;
import net.c4_0;
import net.ct_1;
import net.cw_0;
import net.d0_0;
import net.dz_0;
import net.h8_0;
import net.hs_0;
import net.ht_0;
import net.hz_0;
import net.it_0;
import net.iv_1;
import net.kp_1;
import net.l6_0;
import net.li_2;
import net.lz_1;
import net.mf_1;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.multiplayer.WorldClient;
import net.minecraft.stats.Achievement;
import net.minecraft.world.WorldSettings;
import net.mo_0;
import net.ms_0;
import net.na_1;
import net.nk_2;
import net.nl_1;
import net.nn_1;
import net.no_2;
import net.nq_0;
import net.nw_0;
import net.nx_1;
import net.o7_0;
import net.oG;
import net.oa_2;
import net.od_1;
import net.oe_1;
import net.of_1;
import net.of_2;
import net.og_0;
import net.oh_2;
import net.oi_1;
import net.ol_0;
import net.ol_2;
import net.oo_1;
import net.op_1;
import net.oq_1;
import net.oq_2;
import net.ou_2;
import net.ox_2;
import net.oz_1;
import net.pf_1;
import net.pk_2;
import net.pm_1;
import net.pt_1;
import net.qb_0;
import net.rb_0;
import net.rg_0;
import net.rz_0;
import net.sd_1;
import net.sg_2;
import net.tc_0;
import net.to_1;
import net.ub_1;
import net.ue_2;
import net.uv_2;
import net.vp_0;
import net.w4_0;
import net.w5_0;
import net.wp_1;
import net.wu_0;
import net.xx_1;
import net.xz_0;
import net.y__0;
import net.yk_2;
import net.yq_2;
import net.yw_2;
import net.za_2;
import net.ze_1;
import net.zq_2;
import net.zx_1;
import org.apache.logging.log4j.Logger;

public class NetHandlerPlayClient
implements INetHandlerPlayClient {
    private boolean e = false;
    public static Map<UUID, NetworkPlayerInfo> a;
    public int i = 20;
    private Random g = new Random();
    private GuiScreen h;
    public WorldClient d;
    public boolean c;
    private NetworkManager j;
    private Minecraft gameController;
    private static Logger f;
    private GameProfile k;

    @Override
    public void a(S1BPacketEntityAttach s1BPacketEntityAttach) {
        PacketThreadUtilInvoker.a(s1BPacketEntityAttach, this, this.gameController);
        Entity entity = BlockInvoker.b(this.d, S1BPacketEntityAttachInvoker.a(s1BPacketEntityAttach));
        Entity entity2 = BlockInvoker.b(this.d, S1BPacketEntityAttachInvoker.c(s1BPacketEntityAttach));
        if (S1BPacketEntityAttachInvoker.b(s1BPacketEntityAttach) == 0) {
            if (S1BPacketEntityAttachInvoker.a(s1BPacketEntityAttach) == PlayerInvoker.O(this.gameController.player)) {
                entity = this.gameController.player;
                if (entity2 instanceof EntityBoat) {
                    qb_0.a((EntityBoat)entity2, false);
                }
                boolean bl = entity.r == null;
            } else if (entity2 instanceof EntityBoat) {
                qb_0.a((EntityBoat)entity2, true);
            }
            return;
        }
        if (S1BPacketEntityAttachInvoker.b(s1BPacketEntityAttach) == 1 && entity instanceof nl_1) {
            CG.a((nl_1)entity, entity2, false);
        }
    }

    @Override
    public void a(S26PacketMapChunkBulk s26PacketMapChunkBulk) {
        PacketThreadUtilInvoker.a(s26PacketMapChunkBulk, this, this.gameController);
        for (int i = 0; i < vp_0.a(s26PacketMapChunkBulk); ++i) {
            int n = vp_0.c(s26PacketMapChunkBulk, i);
            int n2 = vp_0.a(s26PacketMapChunkBulk, i);
            BlockInvoker.a(this.d, n, n2, true);
            BlockInvoker.b(this.d, n << 4, 0, n2 << 4, (n << 4) + 15, 256, (n2 << 4) + 15);
            Chunk chunk = BlockInvoker.a(this.d, n, n2);
            aqp_2.a(chunk, vp_0.b(s26PacketMapChunkBulk, i), vp_0.d(s26PacketMapChunkBulk, i), true);
            BlockInvoker.a(this.d, n << 4, 0, n2 << 4, (n << 4) + 15, 256, (n2 << 4) + 15);
            if (this.d.d instanceof a9J) continue;
            aqp_2.p(chunk);
        }
    }

    public static NetworkPlayerInfo a(UUID uUID) {
        return (NetworkPlayerInfo)MapInvoker.c(a, uUID);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(S3FPacketCustomPayload s3FPacketCustomPayload) {
        PacketThreadUtilInvoker.a(s3FPacketCustomPayload, this, this.gameController);
        if (c4_0.t.equals(h8_0.b(s3FPacketCustomPayload))) {
            PacketBuffer packetBuffer = h8_0.a(s3FPacketCustomPayload);
            try {
                int n = PacketBufferInvoker.p(packetBuffer);
                GuiScreen guiScreen = this.gameController.currentScreen;
                if (!(guiScreen instanceof R9) || n != this.gameController.player.bI.f) return;
                try {
                    a7K a7K2 = ct_1.a((R9)guiScreen);
                    F8 f8 = aG4.a(packetBuffer);
                    ze_1.a(a7K2, f8);
                    return;
                }
                catch (IOException iOException) {
                    LoggerInvoker.a(f, c4_0.x, iOException);
                }
                return;
            }
            finally {
                PacketBufferInvoker.t(packetBuffer);
            }
        } else if (c4_0.p.equals(h8_0.b(s3FPacketCustomPayload))) {
            PlayerInvoker.a(this.gameController.player, PacketBufferInvoker.d(h8_0.a(s3FPacketCustomPayload), Short.MAX_VALUE));
            return;
        } else {
            ItemStack itemStack;
            if (!c4_0.F.equals(h8_0.b(s3FPacketCustomPayload)) || act_2.k(itemStack = PlayerInvoker.W(this.gameController.player)) != Items.written_book) return;
            MCInvoker.displayGuiScreen(this.gameController, new RA(this.gameController.player, itemStack, false));
        }
    }

    @Override
    public void a(S38PacketPlayerListItem s38PacketPlayerListItem) {
        PacketThreadUtilInvoker.a(s38PacketPlayerListItem, this, this.gameController);
        Iterator iterator = ListInvoker.iterator(yq_2.b(s38PacketPlayerListItem));
        while (dz_0.c(iterator)) {
            ayb_1 ayb_12 = (ayb_1)dz_0.b(iterator);
            if (yq_2.a(s38PacketPlayerListItem) == aux__1.REMOVE_PLAYER) {
                MapInvoker.a(a, a4Z.a(aH7.d(ayb_12)));
                continue;
            }
            NetworkPlayerInfo networkPlayerInfo = (NetworkPlayerInfo)MapInvoker.c(a, a4Z.a(aH7.d(ayb_12)));
            if (yq_2.a(s38PacketPlayerListItem) == aux__1.ADD_PLAYER) {
                networkPlayerInfo = new NetworkPlayerInfo(ayb_12);
                MapInvoker.c(a, a4Z.a(networkPlayerInfo.l()), networkPlayerInfo);
            }
            switch (yq_2.a(s38PacketPlayerListItem)) {
                case ADD_PLAYER: {
                    networkPlayerInfo.a(aH7.b(ayb_12));
                    networkPlayerInfo.a(aH7.c(ayb_12));
                    break;
                }
                case UPDATE_GAME_MODE: {
                    networkPlayerInfo.a(aH7.b(ayb_12));
                    break;
                }
                case UPDATE_LATENCY: {
                    networkPlayerInfo.a(aH7.c(ayb_12));
                    break;
                }
                case UPDATE_DISPLAY_NAME: {
                    aNL.a(networkPlayerInfo, aH7.a(ayb_12));
                }
            }
        }
    }

    public NetworkManager d() {
        return this.j;
    }

    @Override
    public void a(S3BPacketScoreboardObjective s3BPacketScoreboardObjective) {
        PacketThreadUtilInvoker.a(s3BPacketScoreboardObjective, this, this.gameController);
        za_2 za_22 = BlockInvoker.o(this.d);
        if (ai4_0.b(s3BPacketScoreboardObjective) == 0) {
            acl_0 acl_02 = VM.a(za_22, ai4_0.c(s3BPacketScoreboardObjective), aOA.g);
            afi_1.a(acl_02, ai4_0.d(s3BPacketScoreboardObjective));
            afi_1.a(acl_02, ai4_0.a(s3BPacketScoreboardObjective));
        } else {
            acl_0 acl_03 = VM.a(za_22, ai4_0.c(s3BPacketScoreboardObjective));
            if (ai4_0.b(s3BPacketScoreboardObjective) == 1) {
                VM.c(za_22, acl_03);
            } else if (ai4_0.b(s3BPacketScoreboardObjective) == 2) {
                afi_1.a(acl_03, ai4_0.d(s3BPacketScoreboardObjective));
                afi_1.a(acl_03, ai4_0.a(s3BPacketScoreboardObjective));
            }
        }
    }

    public GameProfile a() {
        return this.k;
    }

    public Collection<NetworkPlayerInfo> b() {
        return a.values();
    }

    @Override
    public void a(S22PacketMultiBlockChange s22PacketMultiBlockChange) {
        PacketThreadUtilInvoker.a(s22PacketMultiBlockChange, this, this.gameController);
        for (apg_2 apg_22 : JK.a(s22PacketMultiBlockChange)) {
            BlockInvoker.a(this.d, SM.c(apg_22), SM.a(apg_22));
        }
    }

    @Override
    public void a(S36PacketSignEditorOpen s36PacketSignEditorOpen) {
        PacketThreadUtilInvoker.a(s36PacketSignEditorOpen, this, this.gameController);
        TileEntity tileEntity = BlockInvoker.e(this.d, l6_0.a(s36PacketSignEditorOpen));
        if (!(tileEntity instanceof a6z_0)) {
            tileEntity = new a6z_0();
            NBTInvoker.a(tileEntity, this.d);
            NBTInvoker.a(tileEntity, l6_0.a(s36PacketSignEditorOpen));
        }
        PlayerInvoker.a(this.gameController.player, (a6z_0)tileEntity);
    }

    @Override
    public void a(S20PacketEntityProperties s20PacketEntityProperties) {
        PacketThreadUtilInvoker.a(s20PacketEntityProperties, this, this.gameController);
        Entity entity = BlockInvoker.b(this.d, pf_1.b(s20PacketEntityProperties));
        if (!(entity instanceof EntityLivingBase)) {
            throw new IllegalStateException(aL0.a(aL0.a(aL0.a(new StringBuilder(), c4_0.B), entity), c4_0.h).toString());
        }
        VO vO = atn_0.l((EntityLivingBase)entity);
        Iterator iterator = ListInvoker.iterator(pf_1.a(s20PacketEntityProperties));
        while (dz_0.c(iterator)) {
            a66 a662 = (a66)dz_0.b(iterator);
            ahw_2 ahw_22 = ht_0.a(vO, aZW.a(a662));
            ahw_22 = ht_0.b(vO, new S_(null, aZW.a(a662), 0.0, Double.MIN_NORMAL, Double.MAX_VALUE));
            Ma.a(ahw_22, aZW.c(a662));
            Ma.e(ahw_22);
            Iterator iterator2 = ms_0.a(aZW.b(a662));
            while (dz_0.c(iterator2)) {
                AttributeModifier attributeModifier = (AttributeModifier)dz_0.b(iterator2);
                Ma.a(ahw_22, attributeModifier);
            }
        }
    }

    @Override
    public void a(S0CPacketSpawnPlayer s0CPacketSpawnPlayer) {
        PacketThreadUtilInvoker.a(s0CPacketSpawnPlayer, this, this.gameController);
        double cfr_ignored_0 = (double)mo_0.b(s0CPacketSpawnPlayer) / 32.0;
        double cfr_ignored_1 = (double)mo_0.g(s0CPacketSpawnPlayer) / 32.0;
        double cfr_ignored_2 = (double)mo_0.d(s0CPacketSpawnPlayer) / 32.0;
        float cfr_ignored_3 = (float)(mo_0.h(s0CPacketSpawnPlayer) * 360) / 256.0f;
        float cfr_ignored_4 = (float)(mo_0.f(s0CPacketSpawnPlayer) * 360) / 256.0f;
        NetHandlerPlayClient.a(mo_0.i(s0CPacketSpawnPlayer));
    }

    @Override
    public void a(S35PacketUpdateTileEntity s35PacketUpdateTileEntity) {
        PacketThreadUtilInvoker.a(s35PacketUpdateTileEntity, this, this.gameController);
        if (BlockInvoker.g(this.gameController.world, aja_0.c(s35PacketUpdateTileEntity))) {
            TileEntity tileEntity = BlockInvoker.e(this.gameController.world, aja_0.c(s35PacketUpdateTileEntity));
            int n = aja_0.a(s35PacketUpdateTileEntity);
            if (n == 1 && tileEntity instanceof a6f_0 || n == 2 && tileEntity instanceof a6U || n == 3 && tileEntity instanceof a6G || n == 4 && tileEntity instanceof a6t_0 || n == 5 && tileEntity instanceof a6A || n == 6 && tileEntity instanceof a6L) {
                NBTInvoker.b(tileEntity, aja_0.b(s35PacketUpdateTileEntity));
            }
        }
    }

    @Override
    public void a(S40PacketDisconnect s40PacketDisconnect) {
        NetworkManagerInvoker.a(this.j, aro_0.a(s40PacketDisconnect));
    }

    @Override
    public void a(S0BPacketAnimation s0BPacketAnimation) {
        PacketThreadUtilInvoker.a(s0BPacketAnimation, this, this.gameController);
        Entity entity = BlockInvoker.b(this.d, ahx_0.a(s0BPacketAnimation));
        if (ahx_0.b(s0BPacketAnimation) == 0) {
            EntityLivingBase entityLivingBase = (EntityLivingBase)entity;
            atn_0.b(entityLivingBase);
        } else if (ahx_0.b(s0BPacketAnimation) == 1) {
            ayj_0.m(entity);
        } else if (ahx_0.b(s0BPacketAnimation) == 2) {
            EntityPlayer entityPlayer = (EntityPlayer)entity;
            a6w_0.a(entityPlayer, false, false, false);
        } else if (ahx_0.b(s0BPacketAnimation) == 4) {
            ayx_2.a(this.gameController.effectRenderer, entity, B7.CRIT);
        } else if (ahx_0.b(s0BPacketAnimation) == 5) {
            ayx_2.a(this.gameController.effectRenderer, entity, B7.CRIT_MAGIC);
        }
    }

    @Override
    public void a(S48PacketResourcePackSend s48PacketResourcePackSend) {
        String string = aq_1.b(s48PacketResourcePackSend);
        String string2 = aq_1.a(s48PacketResourcePackSend);
        if (StringInvoker.e(string, c4_0.s)) {
            File file = new File(this.gameController.mcDataDir, c4_0.A);
            String string3 = StringInvoker.a(string, StringInvoker.c(c4_0.g));
            File file2 = new File(file, string3);
            if (zq_2.d(file2)) {
                this.j.sendPacket(new C19PacketResourcePackStatus(string2, C19PacketResourcePackStatus$Action.ACCEPTED));
                aqo_2.a(mf_1.a(MCInvoker.D(this.gameController), file2), new aNC(this, string2));
            } else {
                this.j.sendPacket(new C19PacketResourcePackStatus(string2, C19PacketResourcePackStatus$Action.FAILED_DOWNLOAD));
            }
        } else if (MCInvoker.W(this.gameController) != null && aKZ.a(MCInvoker.W(this.gameController)) == ServerResourceMode.ENABLED) {
            this.j.sendPacket(new C19PacketResourcePackStatus(string2, C19PacketResourcePackStatus$Action.ACCEPTED));
            aqo_2.a(mf_1.a(MCInvoker.D(this.gameController), string, string2), new ay0_0(this, string2));
        } else if (MCInvoker.W(this.gameController) != null && aKZ.a(MCInvoker.W(this.gameController)) != ServerResourceMode.PROMPT) {
            this.j.sendPacket(new C19PacketResourcePackStatus(string2, C19PacketResourcePackStatus$Action.DECLINED));
        } else {
            MCInvoker.a(this.gameController, () -> this.lambda$handleResourcePack$1(string2, string));
        }
    }

    @Override
    public void a(S0DPacketCollectItem s0DPacketCollectItem) {
        PacketThreadUtilInvoker.a(s0DPacketCollectItem, this, this.gameController);
        Entity entity = BlockInvoker.b(this.d, amf_2.a(s0DPacketCollectItem));
        EntityLivingBase entityLivingBase = (EntityLivingBase)BlockInvoker.b(this.d, amf_2.b(s0DPacketCollectItem));
        entityLivingBase = this.gameController.player;
        if (entity instanceof oa_2) {
            BlockInvoker.a(this.d, entity, c4_0.e, 0.2f, ((a5_0.e(this.g) - a5_0.e(this.g)) * 0.7f + 1.0f) * 2.0f);
        } else {
            BlockInvoker.a(this.d, entity, c4_0.v, 0.2f, ((a5_0.e(this.g) - a5_0.e(this.g)) * 0.7f + 1.0f) * 2.0f);
        }
        ayx_2.a(this.gameController.effectRenderer, new nw_0((World)this.d, entity, entityLivingBase, 0.5f));
        BlockInvoker.c(this.d, amf_2.a(s0DPacketCollectItem));
    }

    @Override
    public void a(S0FPacketSpawnMob s0FPacketSpawnMob) {
        PacketThreadUtilInvoker.a(s0FPacketSpawnMob, this, this.gameController);
        double d = (double)ak4_0.e(s0FPacketSpawnMob) / 32.0;
        double d2 = (double)ak4_0.c(s0FPacketSpawnMob) / 32.0;
        double d3 = (double)ak4_0.d(s0FPacketSpawnMob) / 32.0;
        float f = (float)(ak4_0.k(s0FPacketSpawnMob) * 360) / 256.0f;
        float f2 = (float)(ak4_0.f(s0FPacketSpawnMob) * 360) / 256.0f;
        EntityLivingBase entityLivingBase = (EntityLivingBase)ub_1.a(ak4_0.g(s0FPacketSpawnMob), (World)this.gameController.world);
        entityLivingBase.ai = ak4_0.e(s0FPacketSpawnMob);
        entityLivingBase.o = ak4_0.c(s0FPacketSpawnMob);
        entityLivingBase.y = ak4_0.d(s0FPacketSpawnMob);
        entityLivingBase.aD = entityLivingBase.aP = (float)(ak4_0.i(s0FPacketSpawnMob) * 360) / 256.0f;
        Entity[] entityArray = atn_0.o(entityLivingBase);
        int n = ak4_0.a(s0FPacketSpawnMob) - atn_0.h(entityLivingBase);
        for (Entity entity : entityArray) {
            ayj_0.c(entity, ayj_0.B(entity) + n);
        }
        atn_0.a(entityLivingBase, ak4_0.a(s0FPacketSpawnMob));
        atn_0.a(entityLivingBase, d, d2, d3, f, f2);
        entityLivingBase.motionX = (float)ak4_0.j(s0FPacketSpawnMob) / 8000.0f;
        entityLivingBase.motionY = (float)ak4_0.l(s0FPacketSpawnMob) / 8000.0f;
        entityLivingBase.motionZ = (float)ak4_0.b(s0FPacketSpawnMob) / 8000.0f;
        BlockInvoker.a(this.d, ak4_0.a(s0FPacketSpawnMob), entityLivingBase);
        List list = ak4_0.h(s0FPacketSpawnMob);
        aom_0.a(atn_0.r(entityLivingBase), list);
    }

    public NetHandlerPlayClient(Minecraft minecraft, GuiScreen guiScreen, NetworkManager networkManager, GameProfile gameProfile) {
        this.gameController = minecraft;
        this.h = guiScreen;
        this.j = networkManager;
        this.k = gameProfile;
    }

    static NetworkManager a(NetHandlerPlayClient netHandlerPlayClient) {
        return netHandlerPlayClient.j;
    }

    @Override
    public void a(S14PacketEntity s14PacketEntity) {
        PacketThreadUtilInvoker.a(s14PacketEntity, this, this.gameController);
        Entity entity = ayc_2.a(s14PacketEntity, this.d);
        entity.ai += ayc_2.f(s14PacketEntity);
        entity.o += ayc_2.a(s14PacketEntity);
        entity.y += ayc_2.c(s14PacketEntity);
        double d = (double)entity.ai / 32.0;
        double d2 = (double)entity.o / 32.0;
        double d3 = (double)entity.y / 32.0;
        float f = ayc_2.b(s14PacketEntity) ? (float)(ayc_2.g(s14PacketEntity) * 360) / 256.0f : entity.rotationYaw;
        float f2 = ayc_2.b(s14PacketEntity) ? (float)(ayc_2.d(s14PacketEntity) * 360) / 256.0f : entity.rotationPitch;
        ayj_0.a(entity, d, d2, d3, f, f2, 3, false);
        entity.onGround = ayc_2.e(s14PacketEntity);
    }

    @Override
    public void a(S13PacketDestroyEntities s13PacketDestroyEntities) {
        PacketThreadUtilInvoker.a(s13PacketDestroyEntities, this, this.gameController);
        for (int i = 0; i < NV.a(s13PacketDestroyEntities).length; ++i) {
            BlockInvoker.c(this.d, NV.a(s13PacketDestroyEntities)[i]);
        }
    }

    @Override
    public void a(S45PacketTitle s45PacketTitle) {
        PacketThreadUtilInvoker.a(s45PacketTitle, this, this.gameController);
        xz_0 xz_02 = avj_1.d(s45PacketTitle);
        String string = null;
        String string2 = null;
        String string3 = avj_1.e(s45PacketTitle) != null ? aBO.a(avj_1.e(s45PacketTitle)) : c4_0.f;
        switch (xz_02) {
            case TITLE: {
                string = string3;
                break;
            }
            case SUBTITLE: {
                string2 = string3;
                break;
            }
            case RESET: {
                GW.a(this.gameController.ingameGUI, c4_0.q, c4_0.G, -1, -1, -1);
                GW.h(this.gameController.ingameGUI);
                return;
            }
        }
        GW.a(this.gameController.ingameGUI, string, string2, avj_1.a(s45PacketTitle), avj_1.b(s45PacketTitle), avj_1.c(s45PacketTitle));
    }

    @Override
    public void a(S30PacketWindowItems s30PacketWindowItems) {
        PacketThreadUtilInvoker.a(s30PacketWindowItems, this, this.gameController);
        EntityPlayerSP entityPlayerSP = this.gameController.player;
        if (agi_1.b(s30PacketWindowItems) == 0) {
            afy_2.a(entityPlayerSP.bp, agi_1.a(s30PacketWindowItems));
        } else if (agi_1.b(s30PacketWindowItems) == entityPlayerSP.bI.f) {
            afy_2.a(entityPlayerSP.bI, agi_1.a(s30PacketWindowItems));
        }
    }

    @Override
    public void a(S42PacketCombatEvent s42PacketCombatEvent) {
        Entity entity;
        EntityLivingBase entityLivingBase;
        PacketThreadUtilInvoker.a(s42PacketCombatEvent, this, this.gameController);
        Entity entity2 = BlockInvoker.b(this.d, s42PacketCombatEvent.a);
        EntityLivingBase entityLivingBase2 = entityLivingBase = entity2 instanceof EntityLivingBase ? (EntityLivingBase)entity2 : null;
        if (s42PacketCombatEvent.e == adf_0.END_COMBAT) {
            long l4 = 1000L * (long)s42PacketCombatEvent.b / 20L;
            adw_1 adw_12 = new adw_1(this.gameController.player, entityLivingBase);
            IStreamInvoker.a(MCInvoker.a(this.gameController), adw_12, -l4, 0L);
        } else if (s42PacketCombatEvent.e == adf_0.ENTITY_DIED && (entity = BlockInvoker.b(this.d, s42PacketCombatEvent.c)) instanceof EntityPlayer) {
            adv_1 adv_12 = new adv_1((EntityPlayer)entity, entityLivingBase);
            ag9_0.a(adv_12, s42PacketCombatEvent.d);
            IStreamInvoker.a(MCInvoker.a(this.gameController), adv_12, 0L);
        }
    }

    @Override
    public void a(S2FPacketSetSlot s2FPacketSetSlot) {
        PacketThreadUtilInvoker.a(s2FPacketSetSlot, this, this.gameController);
        EntityPlayerSP entityPlayerSP = this.gameController.player;
        if (W_.b(s2FPacketSetSlot) == -1) {
            InventoryInvoker.c(entityPlayerSP.inventory, W_.a(s2FPacketSetSlot));
        } else {
            Object object;
            if (this.gameController.currentScreen instanceof rb_0) {
                object = (rb_0)this.gameController.currentScreen;
                boolean bl = GK.a((rb_0)object) != aw3_0.d(CreativeTabs.o);
            }
            if (W_.b(s2FPacketSetSlot) == 0 && W_.c(s2FPacketSetSlot) >= 36 && W_.c(s2FPacketSetSlot) < 45) {
                object = ItemStackInvoker.a(afy_2.a(entityPlayerSP.bp, W_.c(s2FPacketSetSlot)));
                if (W_.a(s2FPacketSetSlot) != null && ((ItemStack)object).a < W_.a((S2FPacketSetSlot)s2FPacketSetSlot).a) {
                    W_.a((S2FPacketSetSlot)s2FPacketSetSlot).g = 5;
                }
                afy_2.a(entityPlayerSP.bp, W_.c(s2FPacketSetSlot), W_.a(s2FPacketSetSlot));
            } else if (W_.b(s2FPacketSetSlot) == entityPlayerSP.bI.f) {
                if (W_.b(s2FPacketSetSlot) == 0) {
                    // empty if block
                }
                afy_2.a(entityPlayerSP.bI, W_.c(s2FPacketSetSlot), W_.a(s2FPacketSetSlot));
            }
        }
    }

    @Override
    public void a(S31PacketWindowProperty s31PacketWindowProperty) {
        PacketThreadUtilInvoker.a(s31PacketWindowProperty, this, this.gameController);
        EntityPlayerSP entityPlayerSP = this.gameController.player;
        if (entityPlayerSP.bI != null && entityPlayerSP.bI.f == it_0.b(s31PacketWindowProperty)) {
            afy_2.a(entityPlayerSP.bI, it_0.a(s31PacketWindowProperty), it_0.c(s31PacketWindowProperty));
        }
    }

    @Override
    public void a(S3DPacketDisplayScoreboard s3DPacketDisplayScoreboard) {
        PacketThreadUtilInvoker.a(s3DPacketDisplayScoreboard, this, this.gameController);
        za_2 za_22 = BlockInvoker.o(this.d);
        if (StringInvoker.g(ad8_0.b(s3DPacketDisplayScoreboard))) {
            VM.a(za_22, ad8_0.a(s3DPacketDisplayScoreboard), null);
        } else {
            acl_0 acl_02 = VM.a(za_22, ad8_0.b(s3DPacketDisplayScoreboard));
            VM.a(za_22, ad8_0.a(s3DPacketDisplayScoreboard), acl_02);
        }
    }

    private void lambda$handleResourcePack$1(String string, String string2) {
        MCInvoker.displayGuiScreen(this.gameController, new GuiYesNo((arg_0, arg_1) -> this.lambda$null$0(string, string2, arg_0, arg_1), I18n.format(c4_0.o, new Object[0]), I18n.format(c4_0.c, new Object[0]), 0));
    }

    static {
        f = LogManagerInvoker.c();
        a = MapsInvoker.a();
    }

    @Override
    public void a(S18PacketEntityTeleport s18PacketEntityTeleport) {
        PacketThreadUtilInvoker.a(s18PacketEntityTeleport, this, this.gameController);
        Entity entity = BlockInvoker.b(this.d, Qc.e(s18PacketEntityTeleport));
        entity.ai = Qc.a(s18PacketEntityTeleport);
        entity.o = Qc.b(s18PacketEntityTeleport);
        entity.y = Qc.c(s18PacketEntityTeleport);
        double d = (double)entity.ai / 32.0;
        double d2 = (double)entity.o / 32.0;
        double d3 = (double)entity.y / 32.0;
        float f = (float)(Qc.d(s18PacketEntityTeleport) * 360) / 256.0f;
        float f2 = (float)(Qc.f(s18PacketEntityTeleport) * 360) / 256.0f;
        if (MathInvoker.a(entity.posX - d) < 0.03125 && MathInvoker.a(entity.posY - d2) < 0.015625 && MathInvoker.a(entity.posZ - d3) < 0.03125) {
            ayj_0.a(entity, entity.posX, entity.posY, entity.posZ, f, f2, 3, true);
        } else {
            ayj_0.a(entity, d, d2, d3, f, f2, 3, true);
        }
        entity.onGround = Qc.g(s18PacketEntityTeleport);
    }

    @Override
    public void a(S34PacketMaps s34PacketMaps) {
        PacketThreadUtilInvoker.a(s34PacketMaps, this, this.gameController);
        wp_1 wp_12 = pt_1.a(a56.a(s34PacketMaps), this.gameController.world);
        a56.a(s34PacketMaps, wp_12);
        apx_2.a(EntityRendererInvoker.a(this.gameController.entityRenderer), wp_12);
    }

    @Override
    public void a(S11PacketSpawnExperienceOrb s11PacketSpawnExperienceOrb) {
        PacketThreadUtilInvoker.a(s11PacketSpawnExperienceOrb, this, this.gameController);
        oa_2 oa_22 = new oa_2(this.d, (double)aso_0.b(s11PacketSpawnExperienceOrb) / 32.0, (double)aso_0.a(s11PacketSpawnExperienceOrb) / 32.0, (double)aso_0.d(s11PacketSpawnExperienceOrb) / 32.0, aso_0.c(s11PacketSpawnExperienceOrb));
        oa_22.ai = aso_0.b(s11PacketSpawnExperienceOrb);
        oa_22.o = aso_0.a(s11PacketSpawnExperienceOrb);
        oa_22.y = aso_0.d(s11PacketSpawnExperienceOrb);
        oa_22.rotationYaw = 0.0f;
        oa_22.rotationPitch = 0.0f;
        ayj_0.c((Entity)oa_22, aso_0.e(s11PacketSpawnExperienceOrb));
        BlockInvoker.a(this.d, aso_0.e(s11PacketSpawnExperienceOrb), oa_22);
    }

    @Override
    public void a(S44PacketWorldBorder s44PacketWorldBorder) {
        PacketThreadUtilInvoker.a(s44PacketWorldBorder, this, this.gameController);
        aw7_0.a(s44PacketWorldBorder, BlockInvoker.i(this.d));
    }

    @Override
    public void a(S43PacketCamera s43PacketCamera) {
        PacketThreadUtilInvoker.a(s43PacketCamera, this, this.gameController);
        Entity entity = aLU.a(s43PacketCamera, this.d);
        MCInvoker.a(this.gameController, entity);
    }

    @Override
    public void a(S0APacketUseBed s0APacketUseBed) {
        PacketThreadUtilInvoker.a(s0APacketUseBed, this, this.gameController);
        a6w_0.a(aN7.a(s0APacketUseBed, this.d), aN7.a(s0APacketUseBed));
    }

    @Override
    public void a(S04PacketEntityEquipment s04PacketEntityEquipment) {
        PacketThreadUtilInvoker.a(s04PacketEntityEquipment, this, this.gameController);
        Entity entity = BlockInvoker.b(this.d, a8L.b(s04PacketEntityEquipment));
        ayj_0.a(entity, a8L.c(s04PacketEntityEquipment), a8L.a(s04PacketEntityEquipment));
    }

    @Override
    public void a(S03PacketTimeUpdate s03PacketTimeUpdate) {
        PacketThreadUtilInvoker.a(s03PacketTimeUpdate, this, this.gameController);
        BlockInvoker.b(this.gameController.world, agt_0.b(s03PacketTimeUpdate));
        BlockInvoker.a(this.gameController.world, agt_0.a(s03PacketTimeUpdate));
    }

    @Override
    public void a(S1DPacketEntityEffect s1DPacketEntityEffect) {
        PacketThreadUtilInvoker.a(s1DPacketEntityEffect, this, this.gameController);
        Entity entity = BlockInvoker.b(this.d, azg_0.c(s1DPacketEntityEffect));
        if (entity instanceof EntityLivingBase) {
            a2l_0 a2l_02 = new a2l_0(azg_0.f(s1DPacketEntityEffect), azg_0.d(s1DPacketEntityEffect), azg_0.a(s1DPacketEntityEffect), false, azg_0.e(s1DPacketEntityEffect));
            a3M.b(a2l_02, azg_0.b(s1DPacketEntityEffect));
            atn_0.a((EntityLivingBase)entity, a2l_02);
        }
    }

    @Override
    public void a(S28PacketEffect s28PacketEffect) {
        PacketThreadUtilInvoker.a(s28PacketEffect, this, this.gameController);
        if (app_0.a(s28PacketEffect)) {
            BlockInvoker.c(this.gameController.world, app_0.b(s28PacketEffect), app_0.c(s28PacketEffect), app_0.d(s28PacketEffect));
        } else {
            BlockInvoker.a(this.gameController.world, app_0.b(s28PacketEffect), app_0.c(s28PacketEffect), app_0.d(s28PacketEffect));
        }
    }

    @Override
    public void a(S10PacketSpawnPainting s10PacketSpawnPainting) {
        PacketThreadUtilInvoker.a(s10PacketSpawnPainting, this, this.gameController);
        nk_2 nk_22 = new nk_2(this.d, as0_0.c(s10PacketSpawnPainting), as0_0.a(s10PacketSpawnPainting), as0_0.d(s10PacketSpawnPainting));
        BlockInvoker.a(this.d, as0_0.b(s10PacketSpawnPainting), nk_22);
    }

    @Override
    public void a(S08PacketPlayerPosLook s08PacketPlayerPosLook) {
        NoRotate noRotate;
        PacketThreadUtilInvoker.a(s08PacketPlayerPosLook, this, this.gameController);
        EntityPlayerSP entityPlayerSP = this.gameController.player;
        double d = alp_0.b(s08PacketPlayerPosLook);
        double d2 = alp_0.e(s08PacketPlayerPosLook);
        double d3 = alp_0.a(s08PacketPlayerPosLook);
        float f = alp_0.f(s08PacketPlayerPosLook);
        float f2 = alp_0.d(s08PacketPlayerPosLook);
        if (aS0.c(alp_0.c(s08PacketPlayerPosLook), (Object)adg_0.X)) {
            d += entityPlayerSP.posX;
        } else {
            entityPlayerSP.motionX = 0.0;
        }
        if (aS0.c(alp_0.c(s08PacketPlayerPosLook), (Object)adg_0.Y)) {
            d2 += entityPlayerSP.posY;
        } else {
            entityPlayerSP.motionY = 0.0;
        }
        if (aS0.c(alp_0.c(s08PacketPlayerPosLook), (Object)adg_0.Z)) {
            d3 += entityPlayerSP.posZ;
        } else {
            entityPlayerSP.motionZ = 0.0;
        }
        if (aS0.c(alp_0.c(s08PacketPlayerPosLook), (Object)adg_0.X_ROT)) {
            f2 += entityPlayerSP.rotationPitch;
        }
        if (aS0.c(alp_0.c(s08PacketPlayerPosLook), (Object)adg_0.Y_ROT)) {
            f += entityPlayerSP.rotationYaw;
        }
        if (aRV.a(noRotate = (NoRotate)ModuleInvoker.isEnable(ModuleRegistry.NOROTATE))) {
            a6w_0.a((EntityPlayer)entityPlayerSP, d, d2, d3);
        } else {
            a6w_0.a(entityPlayerSP, d, d2, d3, f, f2);
        }
        this.j.sendPacket(new C06PacketPlayerPosLook(d, d2, d3, f, f2, false));
        if (!this.c) {
            this.gameController.player.prevPosX = this.gameController.player.posX;
            this.gameController.player.prevPosY = this.gameController.player.posY;
            this.gameController.player.prevPosZ = this.gameController.player.posZ;
            MCInvoker.displayGuiScreen(this.gameController, null);
            this.c = true;
        }
    }

    @Override
    public void a(S41PacketServerDifficulty s41PacketServerDifficulty) {
        PacketThreadUtilInvoker.a(s41PacketServerDifficulty, this, this.gameController);
        uv_2.a(BlockInvoker.q(this.gameController.world), afi_0.a(s41PacketServerDifficulty));
        uv_2.g(BlockInvoker.q(this.gameController.world), afi_0.b(s41PacketServerDifficulty));
    }

    @Override
    public void a(S02PacketChat s02PacketChat) {
        PacketThreadUtilInvoker.a(s02PacketChat, this, this.gameController);
        if (ue_2.a(s02PacketChat) == 2) {
            GW.a(this.gameController.ingameGUI, ue_2.c(s02PacketChat), false);
        } else {
            kp_1.a(GW.f(this.gameController.ingameGUI), ue_2.c(s02PacketChat));
        }
    }

    @Override
    public void a(S12PacketEntityVelocity s12PacketEntityVelocity) {
        PacketThreadUtilInvoker.a(s12PacketEntityVelocity, this, this.gameController);
        BlockInvoker.b(this.d, aYL.d(s12PacketEntityVelocity));
    }

    @Override
    public void a(S2EPacketCloseWindow s2EPacketCloseWindow) {
        PacketThreadUtilInvoker.a(s2EPacketCloseWindow, this, this.gameController);
        PlayerInvoker.an(this.gameController.player);
    }

    public void c() {
        this.d = null;
    }

    @Override
    public void a(S3EPacketTeams s3EPacketTeams) {
        String string;
        Object object;
        PacketThreadUtilInvoker.a(s3EPacketTeams, this, this.gameController);
        za_2 za_22 = BlockInvoker.o(this.d);
        a35 a352 = ajw_0.b(s3EPacketTeams) == 0 ? VM.f(za_22, ajw_0.i(s3EPacketTeams)) : VM.e(za_22, ajw_0.i(s3EPacketTeams));
        if (ajw_0.b(s3EPacketTeams) == 0 || ajw_0.b(s3EPacketTeams) == 2) {
            sd_1.b(a352, ajw_0.g(s3EPacketTeams));
            sd_1.c(a352, ajw_0.a(s3EPacketTeams));
            sd_1.a(a352, ajw_0.h(s3EPacketTeams));
            sd_1.a(a352, tc_0.a(ajw_0.e(s3EPacketTeams)));
            sd_1.a(a352, ajw_0.d(s3EPacketTeams));
            object = to_1.a(ajw_0.f(s3EPacketTeams));
            sd_1.a(a352, (aFJ)((Object)object));
        }
        if (ajw_0.b(s3EPacketTeams) == 0 || ajw_0.b(s3EPacketTeams) == 3) {
            object = ms_0.a(ajw_0.c(s3EPacketTeams));
            while (dz_0.c(object)) {
                string = (String)dz_0.b(object);
                VM.a(za_22, string, ajw_0.i(s3EPacketTeams));
            }
        }
        if (ajw_0.b(s3EPacketTeams) == 4) {
            object = ms_0.a(ajw_0.c(s3EPacketTeams));
            while (dz_0.c(object)) {
                string = (String)dz_0.b(object);
                VM.a(za_22, string, a352);
            }
        }
        if (ajw_0.b(s3EPacketTeams) == 1) {
            VM.b(za_22, a352);
        }
    }

    @Override
    public void a(S1FPacketSetExperience s1FPacketSetExperience) {
        PacketThreadUtilInvoker.a(s1FPacketSetExperience, this, this.gameController);
        PlayerInvoker.a(this.gameController.player, ol_0.b(s1FPacketSetExperience), ol_0.a(s1FPacketSetExperience), ol_0.c(s1FPacketSetExperience));
    }

    @Override
    public void a(S27PacketExplosion s27PacketExplosion) {
        PacketThreadUtilInvoker.a(s27PacketExplosion, this, this.gameController);
        aw0_0 aw0_02 = new aw0_0(this.gameController.world, null, aWK.c(s27PacketExplosion), aWK.d(s27PacketExplosion), aWK.a(s27PacketExplosion), aWK.f(s27PacketExplosion), aWK.b(s27PacketExplosion));
        aI9.a(aw0_02, true);
        this.gameController.player.motionX += (double)aWK.h(s27PacketExplosion);
        this.gameController.player.motionY += (double)aWK.g(s27PacketExplosion);
        this.gameController.player.motionZ += (double)aWK.e(s27PacketExplosion);
    }

    @Override
    public void a(S06PacketUpdateHealth s06PacketUpdateHealth) {
        PacketThreadUtilInvoker.a(s06PacketUpdateHealth, this, this.gameController);
        PlayerInvoker.a(this.gameController.player, ax3_0.c(s06PacketUpdateHealth));
        K.a(PlayerInvoker.a(this.gameController.player), ax3_0.a(s06PacketUpdateHealth));
        K.a(PlayerInvoker.a(this.gameController.player), ax3_0.b(s06PacketUpdateHealth));
    }

    @Override
    public void a(S39PacketPlayerAbilities s39PacketPlayerAbilities) {
        PacketThreadUtilInvoker.a(s39PacketPlayerAbilities, this, this.gameController);
        EntityPlayerSP entityPlayerSP = this.gameController.player;
        aSY.e(entityPlayerSP.abilities, aIC.e(s39PacketPlayerAbilities));
        aSY.a(entityPlayerSP.abilities, aIC.f(s39PacketPlayerAbilities));
        aSY.d(entityPlayerSP.abilities, aIC.c(s39PacketPlayerAbilities));
        aSY.b(entityPlayerSP.abilities, aIC.b(s39PacketPlayerAbilities));
        aSY.b(entityPlayerSP.abilities, aIC.a(s39PacketPlayerAbilities));
        aSY.a(entityPlayerSP.abilities, aIC.d(s39PacketPlayerAbilities));
    }

    @Override
    public void a(S0EPacketSpawnObject s0EPacketSpawnObject) {
        Entity[] entityArray;
        PacketThreadUtilInvoker.a(s0EPacketSpawnObject, this, this.gameController);
        double d = (double)nq_0.g(s0EPacketSpawnObject) / 32.0;
        double d2 = (double)nq_0.a(s0EPacketSpawnObject) / 32.0;
        double d3 = (double)nq_0.c(s0EPacketSpawnObject) / 32.0;
        Entity entity = null;
        if (nq_0.b(s0EPacketSpawnObject) == 10) {
            entity = yw_2.a(this.d, d, d2, d3, afh_0.a(nq_0.h(s0EPacketSpawnObject)));
        } else if (nq_0.b(s0EPacketSpawnObject) == 90) {
            entityArray = BlockInvoker.b(this.d, nq_0.h(s0EPacketSpawnObject));
            if (entityArray instanceof EntityPlayer) {
                entity = new oo_1(this.d, d, d2, d3, (EntityPlayer)entityArray);
            }
            nq_0.d(s0EPacketSpawnObject, 0);
        } else if (nq_0.b(s0EPacketSpawnObject) == 60) {
            entity = new EntityArrow(this.d, d, d2, d3);
        } else if (nq_0.b(s0EPacketSpawnObject) == 61) {
            entity = new oq_2(this.d, d, d2, d3);
        } else if (nq_0.b(s0EPacketSpawnObject) == 71) {
            entity = new no_2(this.d, new BlockPos(MathHelper.floor_double(d), MathHelper.floor_double(d2), MathHelper.floor_double(d3)), SJ.b(nq_0.h(s0EPacketSpawnObject)));
            nq_0.d(s0EPacketSpawnObject, 0);
        } else if (nq_0.b(s0EPacketSpawnObject) == 77) {
            entity = new nn_1(this.d, new BlockPos(MathHelper.floor_double(d), MathHelper.floor_double(d2), MathHelper.floor_double(d3)));
            nq_0.d(s0EPacketSpawnObject, 0);
        } else if (nq_0.b(s0EPacketSpawnObject) == 65) {
            entity = new of_1(this.d, d, d2, d3);
        } else if (nq_0.b(s0EPacketSpawnObject) == 72) {
            entity = new o7_0(this.d, d, d2, d3);
        } else if (nq_0.b(s0EPacketSpawnObject) == 76) {
            entity = new oi_1(this.d, d, d2, d3, null);
        } else if (nq_0.b(s0EPacketSpawnObject) == 63) {
            entity = new oh_2(this.d, d, d2, d3, (double)nq_0.i(s0EPacketSpawnObject) / 8000.0, (double)nq_0.f(s0EPacketSpawnObject) / 8000.0, (double)nq_0.d(s0EPacketSpawnObject) / 8000.0);
            nq_0.d(s0EPacketSpawnObject, 0);
        } else if (nq_0.b(s0EPacketSpawnObject) == 64) {
            entity = new oG(this.d, d, d2, d3, (double)nq_0.i(s0EPacketSpawnObject) / 8000.0, (double)nq_0.f(s0EPacketSpawnObject) / 8000.0, (double)nq_0.d(s0EPacketSpawnObject) / 8000.0);
            nq_0.d(s0EPacketSpawnObject, 0);
        } else if (nq_0.b(s0EPacketSpawnObject) == 66) {
            entity = new oe_1(this.d, d, d2, d3, (double)nq_0.i(s0EPacketSpawnObject) / 8000.0, (double)nq_0.f(s0EPacketSpawnObject) / 8000.0, (double)nq_0.d(s0EPacketSpawnObject) / 8000.0);
            nq_0.d(s0EPacketSpawnObject, 0);
        } else if (nq_0.b(s0EPacketSpawnObject) == 62) {
            entity = new op_1(this.d, d, d2, d3);
        } else if (nq_0.b(s0EPacketSpawnObject) == 73) {
            entity = new of_2((World)this.d, d, d2, d3, nq_0.h(s0EPacketSpawnObject));
            nq_0.d(s0EPacketSpawnObject, 0);
        } else if (nq_0.b(s0EPacketSpawnObject) == 75) {
            entity = new oz_1(this.d, d, d2, d3);
            nq_0.d(s0EPacketSpawnObject, 0);
        } else if (nq_0.b(s0EPacketSpawnObject) == 1) {
            entity = new EntityBoat(this.d, d, d2, d3);
        } else if (nq_0.b(s0EPacketSpawnObject) == 50) {
            entity = new od_1(this.d, d, d2, d3, null);
        } else if (nq_0.b(s0EPacketSpawnObject) == 78) {
            entity = new ol_2(this.d, d, d2, d3);
        } else if (nq_0.b(s0EPacketSpawnObject) == 51) {
            entity = new ox_2(this.d, d, d2, d3);
        } else if (nq_0.b(s0EPacketSpawnObject) == 2) {
            entity = new og_0(this.d, d, d2, d3);
        } else if (nq_0.b(s0EPacketSpawnObject) == 70) {
            entity = new oq_1(this.d, d, d2, d3, BlocksInvoker.b(nq_0.h(s0EPacketSpawnObject) & 0xFFFF));
            nq_0.d(s0EPacketSpawnObject, 0);
        }
        entity.ai = nq_0.g(s0EPacketSpawnObject);
        entity.o = nq_0.a(s0EPacketSpawnObject);
        entity.y = nq_0.c(s0EPacketSpawnObject);
        entity.rotationPitch = (float)(nq_0.e(s0EPacketSpawnObject) * 360) / 256.0f;
        entity.rotationYaw = (float)(nq_0.k(s0EPacketSpawnObject) * 360) / 256.0f;
        entityArray = ayj_0.E(entity);
        int n = nq_0.j(s0EPacketSpawnObject) - ayj_0.B(entity);
        for (Entity entity2 : entityArray) {
            ayj_0.c(entity2, ayj_0.B(entity2) + n);
        }
        ayj_0.c(entity, nq_0.j(s0EPacketSpawnObject));
        BlockInvoker.a(this.d, nq_0.j(s0EPacketSpawnObject), entity);
        if (nq_0.h(s0EPacketSpawnObject) > 0) {
            Entity entity3;
            if (nq_0.b(s0EPacketSpawnObject) == 60 && (entity3 = BlockInvoker.b(this.d, nq_0.h(s0EPacketSpawnObject))) instanceof EntityLivingBase && entity instanceof EntityArrow) {
                ((EntityArrow)entity).ak = entity3;
            }
            ayj_0.f(entity, (double)nq_0.i(s0EPacketSpawnObject) / 8000.0, (double)nq_0.f(s0EPacketSpawnObject) / 8000.0, (double)nq_0.d(s0EPacketSpawnObject) / 8000.0);
        }
    }

    @Override
    public void a(S1EPacketRemoveEntityEffect s1EPacketRemoveEntityEffect) {
        PacketThreadUtilInvoker.a(s1EPacketRemoveEntityEffect, this, this.gameController);
        Entity entity = BlockInvoker.b(this.d, hz_0.b(s1EPacketRemoveEntityEffect));
        if (entity instanceof EntityLivingBase) {
            atn_0.c((EntityLivingBase)entity, hz_0.a(s1EPacketRemoveEntityEffect));
        }
    }

    @Override
    public void a(S07PacketRespawn s07PacketRespawn) {
        PacketThreadUtilInvoker.a(s07PacketRespawn, this, this.gameController);
        if (lz_1.a(s07PacketRespawn) != this.gameController.player.dimension) {
            this.c = false;
            za_2 za_22 = BlockInvoker.o(this.d);
            this.d = new WorldClient(this, new WorldSettings(0L, lz_1.d(s07PacketRespawn), false, uv_2.t(BlockInvoker.q(this.gameController.world)), lz_1.b(s07PacketRespawn)), lz_1.a(s07PacketRespawn), lz_1.c(s07PacketRespawn), this.gameController.mcProfiler);
            BlockInvoker.a(this.d, za_22);
            MCInvoker.a(this.gameController, this.d);
            this.gameController.player.dimension = lz_1.a(s07PacketRespawn);
            MCInvoker.displayGuiScreen(this.gameController, new Rc(this));
        }
        MCInvoker.a(this.gameController, lz_1.a(s07PacketRespawn));
        PlayerControllerInvoker.a(this.gameController.playerController, lz_1.d(s07PacketRespawn));
    }

    @Override
    public void a(S2BPacketChangeGameState s2BPacketChangeGameState) {
        PacketThreadUtilInvoker.a(s2BPacketChangeGameState, this, this.gameController);
        EntityPlayerSP entityPlayerSP = this.gameController.player;
        int n = adg_1.a(s2BPacketChangeGameState);
        float f = adg_1.b(s2BPacketChangeGameState);
        int n2 = MathHelper.f(f + 0.5f);
        if (n < S2BPacketChangeGameState.b.length && S2BPacketChangeGameState.b[n] != null) {
            a6w_0.a((EntityPlayer)entityPlayerSP, new aoz_1(S2BPacketChangeGameState.b[n], new Object[0]));
        }
        if (n == 1) {
            uv_2.d(BlockInvoker.q(this.d), true);
            BlockInvoker.g(this.d, 0.0f);
        } else if (n == 2) {
            uv_2.d(BlockInvoker.q(this.d), false);
            BlockInvoker.g(this.d, 1.0f);
        } else if (n == 3) {
            PlayerControllerInvoker.a(this.gameController.playerController, ar3_0.a(n2));
        } else if (n == 4) {
            MCInvoker.displayGuiScreen(this.gameController, new rz_0());
        } else if (n == 5) {
            GameSettings gameSettings = this.gameController.gameSettings;
            if (f == 0.0f) {
                MCInvoker.displayGuiScreen(this.gameController, new RG());
            } else if (f == 101.0f) {
                kp_1.a(GW.f(this.gameController.ingameGUI), new aoz_1(c4_0.b, awu_1.a(GameSettingsInvoker.getKeyCode(gameSettings.cd)), awu_1.a(GameSettingsInvoker.getKeyCode(gameSettings.ac)), awu_1.a(GameSettingsInvoker.getKeyCode(gameSettings.L)), awu_1.a(GameSettingsInvoker.getKeyCode(gameSettings.ab))));
            } else if (f == 102.0f) {
                kp_1.a(GW.f(this.gameController.ingameGUI), new aoz_1(c4_0.m, awu_1.a(GameSettingsInvoker.getKeyCode(gameSettings.bo))));
            } else if (f == 103.0f) {
                kp_1.a(GW.f(this.gameController.ingameGUI), new aoz_1(c4_0.j, awu_1.a(GameSettingsInvoker.getKeyCode(gameSettings.a0))));
            }
        } else if (n == 6) {
            BlockInvoker.a(this.d, entityPlayerSP.posX, entityPlayerSP.posY + (double)a6w_0.q(entityPlayerSP), entityPlayerSP.posZ, c4_0.a, 0.18f, 0.45f, false);
        } else if (n == 7) {
            BlockInvoker.g(this.d, f);
        } else if (n == 8) {
            BlockInvoker.j(this.d, f);
        } else if (n == 10) {
            BlockInvoker.a(this.d, B7.MOB_APPEARANCE, entityPlayerSP.posX, entityPlayerSP.posY, entityPlayerSP.posZ, 0.0, 0.0, 0.0, new int[0]);
            BlockInvoker.a(this.d, entityPlayerSP.posX, entityPlayerSP.posY, entityPlayerSP.posZ, c4_0.w, 1.0f, 1.0f, false);
        }
    }

    @Override
    public void a(S32PacketConfirmTransaction s32PacketConfirmTransaction) {
        PacketThreadUtilInvoker.a(s32PacketConfirmTransaction, this, this.gameController);
        EntityPlayerSP entityPlayerSP = this.gameController.player;
        if (NB.c(s32PacketConfirmTransaction) == 0) {
            Container cfr_ignored_0 = entityPlayerSP.bp;
        } else if (NB.c(s32PacketConfirmTransaction) == entityPlayerSP.bI.f) {
            Container cfr_ignored_1 = entityPlayerSP.bI;
        }
        if (!NB.b(s32PacketConfirmTransaction)) {
            this.b(new C0FPacketConfirmTransaction(NB.c(s32PacketConfirmTransaction), NB.a(s32PacketConfirmTransaction), true));
        }
    }

    @Override
    public void a(S33PacketUpdateSign s33PacketUpdateSign) {
        a6z_0 a6z_02;
        TileEntity tileEntity;
        PacketThreadUtilInvoker.a(s33PacketUpdateSign, this, this.gameController);
        if (BlockInvoker.g(this.gameController.world, arj_1.b(s33PacketUpdateSign)) && (tileEntity = BlockInvoker.e(this.gameController.world, arj_1.b(s33PacketUpdateSign))) instanceof a6z_0 && aIE.f(a6z_02 = (a6z_0)tileEntity)) {
            SystemInvoker.a(arj_1.a(s33PacketUpdateSign), 0, a6z_02.i, 0, 4);
            aIE.e(a6z_02);
        }
        if (this.gameController.player != null) {
            PlayerInvoker.a(this.gameController.player, new ChatComponentText(aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), c4_0.k), amv_2.j(arj_1.b(s33PacketUpdateSign))), c4_0.D), amv_2.h(arj_1.b(s33PacketUpdateSign))), c4_0.H), amv_2.i(arj_1.b(s33PacketUpdateSign))).toString()));
        }
    }

    @Override
    public void a(S19PacketEntityHeadLook s19PacketEntityHeadLook) {
        PacketThreadUtilInvoker.a(s19PacketEntityHeadLook, this, this.gameController);
        Entity entity = d0_0.a(s19PacketEntityHeadLook, this.d);
        float f = (float)(d0_0.a(s19PacketEntityHeadLook) * 360) / 256.0f;
        ayj_0.a(entity, f);
    }

    @Override
    public void a(S1CPacketEntityMetadata s1CPacketEntityMetadata) {
        PacketThreadUtilInvoker.a(s1CPacketEntityMetadata, this, this.gameController);
        Entity entity = BlockInvoker.b(this.d, ahf_0.b(s1CPacketEntityMetadata));
        if (ahf_0.a(s1CPacketEntityMetadata) != null) {
            aom_0.a(ayj_0.N(entity), ahf_0.a(s1CPacketEntityMetadata));
        }
    }

    @Override
    public void a(S46PacketSetCompressionLevel s46PacketSetCompressionLevel) {
        if (!NetworkManagerInvoker.g(this.j)) {
            NetworkManagerInvoker.a(this.j, abd_0.a(s46PacketSetCompressionLevel));
        }
    }

    @Override
    public void a(S25PacketBlockBreakAnim s25PacketBlockBreakAnim) {
        PacketThreadUtilInvoker.a(s25PacketBlockBreakAnim, this, this.gameController);
        BlockInvoker.b(this.gameController.world, aV4.a(s25PacketBlockBreakAnim), aV4.c(s25PacketBlockBreakAnim), aV4.b(s25PacketBlockBreakAnim));
    }

    @Override
    public void a(S37PacketStatistics s37PacketStatistics) {
        PacketThreadUtilInvoker.a(s37PacketStatistics, this, this.gameController);
        Iterator iterator = aS0.f(MapInvoker.b(aww_1.a(s37PacketStatistics)));
        while (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            StatBase statBase = (StatBase)FG.b(entry);
            int n = P8.b((Integer)FG.a(entry));
            if (NW.d(statBase) && this.e && aQC.a(PlayerInvoker.s(this.gameController.player), statBase) == 0) {
                Achievement achievement = (Achievement)statBase;
                GuiAchievementInvoker.a(this.gameController.guiAchievement, achievement);
                IStreamInvoker.a(MCInvoker.a(this.gameController), new adp_2(achievement), 0L);
                if (statBase == apf_0.m) {
                    this.gameController.gameSettings.b9 = false;
                    awu_1.c(this.gameController.gameSettings);
                }
            }
            aQC.a(PlayerInvoker.s(this.gameController.player), this.gameController.player, statBase, n);
        }
        if (!this.e && this.gameController.gameSettings.b9) {
            GuiAchievementInvoker.b(this.gameController.guiAchievement, apf_0.m);
        }
        this.e = true;
        if (this.gameController.currentScreen instanceof a4i_0) {
            EM.a((a4i_0)((Object)this.gameController.currentScreen));
        }
    }

    @Override
    public void a(S47PacketPlayerListHeaderFooter s47PacketPlayerListHeaderFooter) {
        a9E.b(GW.e(this.gameController.ingameGUI), StringInvoker.g(aBO.a(y__0.b(s47PacketPlayerListHeaderFooter))) ? null : y__0.b(s47PacketPlayerListHeaderFooter));
        a9E.a(GW.e(this.gameController.ingameGUI), StringInvoker.g(aBO.a(y__0.a(s47PacketPlayerListHeaderFooter))) ? null : y__0.a(s47PacketPlayerListHeaderFooter));
    }

    @Override
    public void a(S00PacketKeepAlive s00PacketKeepAlive) {
        this.b(new C00PacketKeepAlive(xx_1.a(s00PacketKeepAlive)));
    }

    private void lambda$null$0(String string, String string2, boolean bl, int n) {
        this.gameController = MCInvoker.f();
        if (MCInvoker.W(this.gameController) != null) {
            aKZ.a(MCInvoker.W(this.gameController), ServerResourceMode.ENABLED);
        }
        this.j.sendPacket(new C19PacketResourcePackStatus(string, C19PacketResourcePackStatus$Action.ACCEPTED));
        aqo_2.a(mf_1.a(MCInvoker.D(this.gameController), string2, string), new PQ(this, string));
        a3A.a(MCInvoker.W(this.gameController));
        MCInvoker.displayGuiScreen(this.gameController, null);
    }

    @Override
    public void a(S09PacketHeldItemChange s09PacketHeldItemChange) {
        PacketThreadUtilInvoker.a(s09PacketHeldItemChange, this, this.gameController);
        if (sg_2.a(s09PacketHeldItemChange) >= 0 && sg_2.a(s09PacketHeldItemChange) < InventoryInvoker.a()) {
            this.gameController.player.inventory.a = sg_2.a(s09PacketHeldItemChange);
        }
    }

    @Override
    public void a(S2CPacketSpawnGlobalEntity s2CPacketSpawnGlobalEntity) {
        PacketThreadUtilInvoker.a(s2CPacketSpawnGlobalEntity, this, this.gameController);
        double d = (double)apl_0.b(s2CPacketSpawnGlobalEntity) / 32.0;
        double d2 = (double)apl_0.d(s2CPacketSpawnGlobalEntity) / 32.0;
        double d3 = (double)apl_0.e(s2CPacketSpawnGlobalEntity) / 32.0;
        ou_2 ou_22 = null;
        if (apl_0.a(s2CPacketSpawnGlobalEntity) == 1) {
            ou_22 = new ou_2(this.d, d, d2, d3);
        }
        ou_22.ai = apl_0.b(s2CPacketSpawnGlobalEntity);
        ou_22.o = apl_0.d(s2CPacketSpawnGlobalEntity);
        ou_22.y = apl_0.e(s2CPacketSpawnGlobalEntity);
        ou_22.rotationYaw = 0.0f;
        ou_22.rotationPitch = 0.0f;
        ayj_0.c((Entity)ou_22, apl_0.c(s2CPacketSpawnGlobalEntity));
        BlockInvoker.c(this.d, ou_22);
    }

    @Override
    public void a(S29PacketSoundEffect s29PacketSoundEffect) {
        PacketThreadUtilInvoker.a(s29PacketSoundEffect, this, this.gameController);
        BlockInvoker.a(this.gameController.world, S29PacketSoundEffectInvoker.e(s29PacketSoundEffect), S29PacketSoundEffectInvoker.b(s29PacketSoundEffect), S29PacketSoundEffectInvoker.d(s29PacketSoundEffect), S29PacketSoundEffectInvoker.c(s29PacketSoundEffect), S29PacketSoundEffectInvoker.a(s29PacketSoundEffect), S29PacketSoundEffectInvoker.f(s29PacketSoundEffect), false);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void a(IChatComponent iChatComponent) {
        MCInvoker.a(this.gameController, null);
        if (this.h != null) {
            if (this.h instanceof RO) {
                MCInvoker.displayGuiScreen(this.gameController, air_0.a(new yk_2(zx_1.b((RO)this.h), c4_0.C, iChatComponent)));
            } else {
                MCInvoker.displayGuiScreen(this.gameController, new rg_0(this.h, c4_0.z, iChatComponent));
            }
        } else {
            MCInvoker.displayGuiScreen(this.gameController, new rg_0(new R5(new GuiMainMenu()), c4_0.l, iChatComponent));
        }
    }

    @Override
    public void a(SPacketMoveVehicle sPacketMoveVehicle) {
        PacketThreadUtilInvoker.a(sPacketMoveVehicle, this, this.gameController);
        Entity entity = this.gameController.player.r;
        if (entity != this.gameController.player && avq_0.b((na_1)entity)) {
            ayj_0.a(entity, aPK.e(sPacketMoveVehicle), aPK.d(sPacketMoveVehicle), aPK.b(sPacketMoveVehicle), aPK.a(sPacketMoveVehicle), aPK.c(sPacketMoveVehicle));
            this.j.sendPacket(new CPacketVehicleMove(entity));
        }
    }

    @Override
    public void a(S24PacketBlockAction s24PacketBlockAction) {
        PacketThreadUtilInvoker.a(s24PacketBlockAction, this, this.gameController);
        BlockInvoker.a(this.gameController.world, afw_1.c(s24PacketBlockAction), afw_1.a(s24PacketBlockAction), afw_1.d(s24PacketBlockAction), afw_1.b(s24PacketBlockAction));
    }

    @Override
    public void a(S2DPacketOpenWindow s2DPacketOpenWindow) {
        PacketThreadUtilInvoker.a(s2DPacketOpenWindow, this, this.gameController);
        EntityPlayerSP entityPlayerSP = this.gameController.player;
        if (c4_0.i.equals(li_2.d(s2DPacketOpenWindow))) {
            PlayerInvoker.a(entityPlayerSP, new wu_0(li_2.f(s2DPacketOpenWindow), li_2.a(s2DPacketOpenWindow)));
            entityPlayerSP.bI.f = li_2.e(s2DPacketOpenWindow);
        } else if (c4_0.d.equals(li_2.d(s2DPacketOpenWindow))) {
            PlayerInvoker.a(entityPlayerSP, new cw_0(entityPlayerSP, li_2.f(s2DPacketOpenWindow)));
            entityPlayerSP.bI.f = li_2.e(s2DPacketOpenWindow);
        } else if (c4_0.r.equals(li_2.d(s2DPacketOpenWindow))) {
            Entity entity = BlockInvoker.b(this.d, li_2.c(s2DPacketOpenWindow));
            if (entity instanceof na_1) {
                PlayerInvoker.a(entityPlayerSP, (na_1)entity, new w5_0(li_2.f(s2DPacketOpenWindow), li_2.a(s2DPacketOpenWindow)));
                entityPlayerSP.bI.f = li_2.e(s2DPacketOpenWindow);
            }
        } else if (!li_2.b(s2DPacketOpenWindow)) {
            PlayerInvoker.a(entityPlayerSP, new a5B(li_2.d(s2DPacketOpenWindow), li_2.f(s2DPacketOpenWindow)));
            entityPlayerSP.bI.f = li_2.e(s2DPacketOpenWindow);
        } else {
            w4_0 w4_02 = new w4_0(li_2.d(s2DPacketOpenWindow), li_2.f(s2DPacketOpenWindow), li_2.a(s2DPacketOpenWindow));
            PlayerInvoker.a(entityPlayerSP, w4_02);
            entityPlayerSP.bI.f = li_2.e(s2DPacketOpenWindow);
        }
    }

    @Override
    public void a(S3APacketTabComplete s3APacketTabComplete) {
        PacketThreadUtilInvoker.a(s3APacketTabComplete, this, this.gameController);
        String[] stringArray = pk_2.a(s3APacketTabComplete);
        if (this.gameController.currentScreen instanceof GuiChat) {
            GuiChat rV = (GuiChat)this.gameController.currentScreen;
            BQ.a(rV, stringArray);
        }
    }

    @Override
    public void a(S21PacketChunkData s21PacketChunkData) {
        PacketThreadUtilInvoker.a(s21PacketChunkData, this, this.gameController);
        if (arf_1.e(s21PacketChunkData)) {
            if (arf_1.a(s21PacketChunkData) == 0) {
                BlockInvoker.a(this.d, arf_1.b(s21PacketChunkData), arf_1.c(s21PacketChunkData), false);
                return;
            }
            BlockInvoker.a(this.d, arf_1.b(s21PacketChunkData), arf_1.c(s21PacketChunkData), true);
        }
        BlockInvoker.b(this.d, arf_1.b(s21PacketChunkData) << 4, 0, arf_1.c(s21PacketChunkData) << 4, (arf_1.b(s21PacketChunkData) << 4) + 15, 256, (arf_1.c(s21PacketChunkData) << 4) + 15);
        Chunk chunk = BlockInvoker.a(this.d, arf_1.b(s21PacketChunkData), arf_1.c(s21PacketChunkData));
        aqp_2.a(chunk, arf_1.d(s21PacketChunkData), arf_1.a(s21PacketChunkData), arf_1.e(s21PacketChunkData));
        BlockInvoker.a(this.d, arf_1.b(s21PacketChunkData) << 4, 0, arf_1.c(s21PacketChunkData) << 4, (arf_1.b(s21PacketChunkData) << 4) + 15, 256, (arf_1.c(s21PacketChunkData) << 4) + 15);
        if (!arf_1.e(s21PacketChunkData) || !(this.d.d instanceof a9J)) {
            aqp_2.p(chunk);
        }
    }

    public void b(Packet packet) {
        this.j.sendPacket(packet);
    }

    @Override
    public void a(S49PacketUpdateEntityNBT s49PacketUpdateEntityNBT) {
        PacketThreadUtilInvoker.a(s49PacketUpdateEntityNBT, this, this.gameController);
        Entity entity = GU.a(s49PacketUpdateEntityNBT, this.d);
        ayj_0.a(entity, GU.a(s49PacketUpdateEntityNBT));
    }

    public NetworkPlayerInfo a(String string) {
        Iterator iterator = ms_0.a(a.values());
        while (dz_0.c(iterator)) {
            NetworkPlayerInfo networkPlayerInfo = (NetworkPlayerInfo)dz_0.b(iterator);
            if (!a4Z.d(networkPlayerInfo.l()).equals(string)) continue;
            return networkPlayerInfo;
        }
        return null;
    }

    @Override
    public void a(S19PacketEntityStatus s19PacketEntityStatus) {
        PacketThreadUtilInvoker.a(s19PacketEntityStatus, this, this.gameController);
        Entity entity = iv_1.a(s19PacketEntityStatus, this.d);
        if (iv_1.a(s19PacketEntityStatus) == 21) {
            SoundHandlerInvoker.c(MCInvoker.l(this.gameController), new aKM((nx_1)entity));
        } else {
            ayj_0.a(entity, iv_1.a(s19PacketEntityStatus));
        }
    }

    @Override
    public void a(S2APacketParticles s2APacketParticles) {
        PacketThreadUtilInvoker.a(s2APacketParticles, this, this.gameController);
        if (aMD.d(s2APacketParticles) == 0) {
            double d = aMD.c(s2APacketParticles) * aMD.f(s2APacketParticles);
            double d2 = aMD.c(s2APacketParticles) * aMD.i(s2APacketParticles);
            double d3 = aMD.c(s2APacketParticles) * aMD.j(s2APacketParticles);
            try {
                BlockInvoker.a(this.d, aMD.b(s2APacketParticles), aMD.h(s2APacketParticles), aMD.g(s2APacketParticles), aMD.e(s2APacketParticles), aMD.k(s2APacketParticles), d, d2, d3, aMD.a(s2APacketParticles));
            }
            catch (Throwable throwable) {
                LoggerInvoker.warn(f, aL0.a(aL0.a(new StringBuilder(), c4_0.n), (Object)aMD.b(s2APacketParticles)).toString());
            }
        } else {
            for (int i = 0; i < aMD.d(s2APacketParticles); ++i) {
                double d = a5_0.f(this.g) * (double)aMD.f(s2APacketParticles);
                double d4 = a5_0.f(this.g) * (double)aMD.i(s2APacketParticles);
                double d5 = a5_0.f(this.g) * (double)aMD.j(s2APacketParticles);
                double d6 = a5_0.f(this.g) * (double)aMD.c(s2APacketParticles);
                double d7 = a5_0.f(this.g) * (double)aMD.c(s2APacketParticles);
                double d8 = a5_0.f(this.g) * (double)aMD.c(s2APacketParticles);
                try {
                    BlockInvoker.a(this.d, aMD.b(s2APacketParticles), aMD.h(s2APacketParticles), aMD.g(s2APacketParticles) + d, aMD.e(s2APacketParticles) + d4, aMD.k(s2APacketParticles) + d5, d6, d7, d8, aMD.a(s2APacketParticles));
                    continue;
                }
                catch (Throwable throwable) {
                    LoggerInvoker.warn(f, aL0.a(aL0.a(new StringBuilder(), c4_0.y), (Object)aMD.b(s2APacketParticles)).toString());
                    return;
                }
            }
        }
    }

    @Override
    public void a(S3CPacketUpdateScore s3CPacketUpdateScore) {
        PacketThreadUtilInvoker.a(s3CPacketUpdateScore, this, this.gameController);
        za_2 za_22 = BlockInvoker.o(this.d);
        acl_0 acl_02 = VM.a(za_22, arr_0.a(s3CPacketUpdateScore));
        if (arr_0.d(s3CPacketUpdateScore) == agr_2.CHANGE) {
            QU qU = VM.c(za_22, arr_0.b(s3CPacketUpdateScore), acl_02);
            hs_0.a(qU, arr_0.c(s3CPacketUpdateScore));
        } else if (arr_0.d(s3CPacketUpdateScore) == agr_2.REMOVE) {
            if (aod_2.a(arr_0.a(s3CPacketUpdateScore))) {
                VM.b(za_22, arr_0.b(s3CPacketUpdateScore), null);
            } else {
                VM.b(za_22, arr_0.b(s3CPacketUpdateScore), acl_02);
            }
        }
    }

    @Override
    public void a(S01PacketJoinGame s01PacketJoinGame) {
        PacketThreadUtilInvoker.a(s01PacketJoinGame, this, this.gameController);
        this.gameController.playerController = new anh_1(this.gameController, this);
        this.d = new WorldClient(this, new WorldSettings(0L, awd_2.e(s01PacketJoinGame), false, awd_2.a(s01PacketJoinGame), awd_2.g(s01PacketJoinGame)), awd_2.c(s01PacketJoinGame), awd_2.d(s01PacketJoinGame), this.gameController.mcProfiler);
        this.gameController.gameSettings.aG = awd_2.d(s01PacketJoinGame);
        MCInvoker.a(this.gameController, this.d);
        this.gameController.player.dimension = awd_2.c(s01PacketJoinGame);
        MCInvoker.displayGuiScreen(this.gameController, new Rc(this));
        PlayerInvoker.g(this.gameController.player, awd_2.h(s01PacketJoinGame));
        this.i = awd_2.f(s01PacketJoinGame);
        PlayerInvoker.e(this.gameController.player, awd_2.b(s01PacketJoinGame));
        PlayerControllerInvoker.a(this.gameController.playerController, awd_2.e(s01PacketJoinGame));
        awu_1.g(this.gameController.gameSettings);
        this.j.sendPacket(new C17PacketCustomPayload(c4_0.E, PacketBufferInvoker.a(new PacketBuffer(FH.d()), pm_1.a())));
    }

    public void a(Packet packet) {
        this.j.b(packet);
    }

    @Override
    public void a(S05PacketSpawnPosition s05PacketSpawnPosition) {
        PacketThreadUtilInvoker.a(s05PacketSpawnPosition, this, this.gameController);
        PlayerInvoker.a(this.gameController.player, S9.a(s05PacketSpawnPosition), true);
        uv_2.a(BlockInvoker.q(this.gameController.world), S9.a(s05PacketSpawnPosition));
    }

    @Override
    public void a(S23PacketBlockChange s23PacketBlockChange) {
        PacketThreadUtilInvoker.a(s23PacketBlockChange, this, this.gameController);
        BlockInvoker.a(this.d, aVG.b(s23PacketBlockChange), aVG.a(s23PacketBlockChange));
    }
}


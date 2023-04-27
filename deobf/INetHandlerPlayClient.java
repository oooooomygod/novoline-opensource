/*
 * Decompiled with CFR 0.152.
 */
package deobf;

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
import net.INetHandler;
import net.S48PacketResourcePackSend;

public interface INetHandlerPlayClient
extends INetHandler {
    public void a(S0BPacketAnimation var1);

    public void a(S21PacketChunkData var1);

    public void a(S26PacketMapChunkBulk var1);

    public void a(S0FPacketSpawnMob var1);

    public void a(S0APacketUseBed var1);

    public void a(S18PacketEntityTeleport var1);

    public void a(S1FPacketSetExperience var1);

    public void a(S42PacketCombatEvent var1);

    public void a(S3DPacketDisplayScoreboard var1);

    public void a(S2BPacketChangeGameState var1);

    public void a(S02PacketChat var1);

    public void a(S2CPacketSpawnGlobalEntity var1);

    public void a(S33PacketUpdateSign var1);

    public void a(S41PacketServerDifficulty var1);

    public void a(S44PacketWorldBorder var1);

    public void a(S0EPacketSpawnObject var1);

    public void a(S2EPacketCloseWindow var1);

    public void a(S40PacketDisconnect var1);

    public void a(S29PacketSoundEffect var1);

    public void a(S1CPacketEntityMetadata var1);

    public void a(S0DPacketCollectItem var1);

    public void a(S22PacketMultiBlockChange var1);

    public void a(S20PacketEntityProperties var1);

    public void a(SPacketMoveVehicle var1);

    public void a(S05PacketSpawnPosition var1);

    public void a(S31PacketWindowProperty var1);

    public void a(S03PacketTimeUpdate var1);

    public void a(S46PacketSetCompressionLevel var1);

    public void a(S2FPacketSetSlot var1);

    public void a(S2APacketParticles var1);

    public void a(S49PacketUpdateEntityNBT var1);

    public void a(S47PacketPlayerListHeaderFooter var1);

    public void a(S36PacketSignEditorOpen var1);

    public void a(S1BPacketEntityAttach var1);

    public void a(S1DPacketEntityEffect var1);

    public void a(S3APacketTabComplete var1);

    public void a(S3CPacketUpdateScore var1);

    public void a(S37PacketStatistics var1);

    public void a(S12PacketEntityVelocity var1);

    public void a(S24PacketBlockAction var1);

    public void a(S39PacketPlayerAbilities var1);

    public void a(S04PacketEntityEquipment var1);

    public void a(S1EPacketRemoveEntityEffect var1);

    public void a(S27PacketExplosion var1);

    public void a(S43PacketCamera var1);

    public void a(S19PacketEntityStatus var1);

    public void a(S14PacketEntity var1);

    public void a(S00PacketKeepAlive var1);

    public void a(S2DPacketOpenWindow var1);

    public void a(S3FPacketCustomPayload var1);

    public void a(S32PacketConfirmTransaction var1);

    public void a(S07PacketRespawn var1);

    public void a(S3EPacketTeams var1);

    public void a(S48PacketResourcePackSend var1);

    public void a(S10PacketSpawnPainting var1);

    public void a(S45PacketTitle var1);

    public void a(S30PacketWindowItems var1);

    public void a(S01PacketJoinGame var1);

    public void a(S25PacketBlockBreakAnim var1);

    public void a(S08PacketPlayerPosLook var1);

    public void a(S28PacketEffect var1);

    public void a(S23PacketBlockChange var1);

    public void a(S09PacketHeldItemChange var1);

    public void a(S35PacketUpdateTileEntity var1);

    public void a(S0CPacketSpawnPlayer var1);

    public void a(S34PacketMaps var1);

    public void a(S11PacketSpawnExperienceOrb var1);

    public void a(S19PacketEntityHeadLook var1);

    public void a(S3BPacketScoreboardObjective var1);

    public void a(S38PacketPlayerListItem var1);

    public void a(S06PacketUpdateHealth var1);

    public void a(S13PacketDestroyEntities var1);
}


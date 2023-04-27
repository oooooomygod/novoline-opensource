/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.INetHandlerPlayClient;
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

public class VG {
    private static String b = "ZeHwLb";

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, SPacketMoveVehicle sPacketMoveVehicle) {
        iNetHandlerPlayClient.a(sPacketMoveVehicle);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S03PacketTimeUpdate s03PacketTimeUpdate) {
        iNetHandlerPlayClient.a(s03PacketTimeUpdate);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S21PacketChunkData s21PacketChunkData) {
        iNetHandlerPlayClient.a(s21PacketChunkData);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S34PacketMaps s34PacketMaps) {
        iNetHandlerPlayClient.a(s34PacketMaps);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S3CPacketUpdateScore s3CPacketUpdateScore) {
        iNetHandlerPlayClient.a(s3CPacketUpdateScore);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S30PacketWindowItems s30PacketWindowItems) {
        iNetHandlerPlayClient.a(s30PacketWindowItems);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S36PacketSignEditorOpen s36PacketSignEditorOpen) {
        iNetHandlerPlayClient.a(s36PacketSignEditorOpen);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S28PacketEffect s28PacketEffect) {
        iNetHandlerPlayClient.a(s28PacketEffect);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S1BPacketEntityAttach s1BPacketEntityAttach) {
        iNetHandlerPlayClient.a(s1BPacketEntityAttach);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S0BPacketAnimation s0BPacketAnimation) {
        iNetHandlerPlayClient.a(s0BPacketAnimation);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S3EPacketTeams s3EPacketTeams) {
        iNetHandlerPlayClient.a(s3EPacketTeams);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S44PacketWorldBorder s44PacketWorldBorder) {
        iNetHandlerPlayClient.a(s44PacketWorldBorder);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S01PacketJoinGame s01PacketJoinGame) {
        iNetHandlerPlayClient.a(s01PacketJoinGame);
    }

    public static String b() {
        return b;
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S22PacketMultiBlockChange s22PacketMultiBlockChange) {
        iNetHandlerPlayClient.a(s22PacketMultiBlockChange);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S11PacketSpawnExperienceOrb s11PacketSpawnExperienceOrb) {
        iNetHandlerPlayClient.a(s11PacketSpawnExperienceOrb);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S35PacketUpdateTileEntity s35PacketUpdateTileEntity) {
        iNetHandlerPlayClient.a(s35PacketUpdateTileEntity);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S25PacketBlockBreakAnim s25PacketBlockBreakAnim) {
        iNetHandlerPlayClient.a(s25PacketBlockBreakAnim);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S41PacketServerDifficulty s41PacketServerDifficulty) {
        iNetHandlerPlayClient.a(s41PacketServerDifficulty);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S37PacketStatistics s37PacketStatistics) {
        iNetHandlerPlayClient.a(s37PacketStatistics);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S32PacketConfirmTransaction s32PacketConfirmTransaction) {
        iNetHandlerPlayClient.a(s32PacketConfirmTransaction);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S3BPacketScoreboardObjective s3BPacketScoreboardObjective) {
        iNetHandlerPlayClient.a(s3BPacketScoreboardObjective);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S1FPacketSetExperience s1FPacketSetExperience) {
        iNetHandlerPlayClient.a(s1FPacketSetExperience);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S0DPacketCollectItem s0DPacketCollectItem) {
        iNetHandlerPlayClient.a(s0DPacketCollectItem);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S0APacketUseBed s0APacketUseBed) {
        iNetHandlerPlayClient.a(s0APacketUseBed);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S00PacketKeepAlive s00PacketKeepAlive) {
        iNetHandlerPlayClient.a(s00PacketKeepAlive);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S09PacketHeldItemChange s09PacketHeldItemChange) {
        iNetHandlerPlayClient.a(s09PacketHeldItemChange);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S49PacketUpdateEntityNBT s49PacketUpdateEntityNBT) {
        iNetHandlerPlayClient.a(s49PacketUpdateEntityNBT);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S20PacketEntityProperties s20PacketEntityProperties) {
        iNetHandlerPlayClient.a(s20PacketEntityProperties);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S1DPacketEntityEffect s1DPacketEntityEffect) {
        iNetHandlerPlayClient.a(s1DPacketEntityEffect);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S2CPacketSpawnGlobalEntity s2CPacketSpawnGlobalEntity) {
        iNetHandlerPlayClient.a(s2CPacketSpawnGlobalEntity);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S33PacketUpdateSign s33PacketUpdateSign) {
        iNetHandlerPlayClient.a(s33PacketUpdateSign);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S05PacketSpawnPosition s05PacketSpawnPosition) {
        iNetHandlerPlayClient.a(s05PacketSpawnPosition);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S19PacketEntityStatus s19PacketEntityStatus) {
        iNetHandlerPlayClient.a(s19PacketEntityStatus);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S46PacketSetCompressionLevel s46PacketSetCompressionLevel) {
        iNetHandlerPlayClient.a(s46PacketSetCompressionLevel);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S39PacketPlayerAbilities s39PacketPlayerAbilities) {
        iNetHandlerPlayClient.a(s39PacketPlayerAbilities);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S3APacketTabComplete s3APacketTabComplete) {
        iNetHandlerPlayClient.a(s3APacketTabComplete);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S2BPacketChangeGameState s2BPacketChangeGameState) {
        iNetHandlerPlayClient.a(s2BPacketChangeGameState);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S23PacketBlockChange s23PacketBlockChange) {
        iNetHandlerPlayClient.a(s23PacketBlockChange);
    }

    static {
        if (VG.b() == null) {
            VG.b("ZeHwLb");
        }
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S27PacketExplosion s27PacketExplosion) {
        iNetHandlerPlayClient.a(s27PacketExplosion);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S3DPacketDisplayScoreboard s3DPacketDisplayScoreboard) {
        iNetHandlerPlayClient.a(s3DPacketDisplayScoreboard);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S12PacketEntityVelocity s12PacketEntityVelocity) {
        iNetHandlerPlayClient.a(s12PacketEntityVelocity);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S2DPacketOpenWindow s2DPacketOpenWindow) {
        iNetHandlerPlayClient.a(s2DPacketOpenWindow);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S19PacketEntityHeadLook s19PacketEntityHeadLook) {
        iNetHandlerPlayClient.a(s19PacketEntityHeadLook);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S2APacketParticles s2APacketParticles) {
        iNetHandlerPlayClient.a(s2APacketParticles);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S0CPacketSpawnPlayer s0CPacketSpawnPlayer) {
        iNetHandlerPlayClient.a(s0CPacketSpawnPlayer);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S13PacketDestroyEntities s13PacketDestroyEntities) {
        iNetHandlerPlayClient.a(s13PacketDestroyEntities);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S47PacketPlayerListHeaderFooter s47PacketPlayerListHeaderFooter) {
        iNetHandlerPlayClient.a(s47PacketPlayerListHeaderFooter);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S40PacketDisconnect s40PacketDisconnect) {
        iNetHandlerPlayClient.a(s40PacketDisconnect);
    }

    public static void b(String string) {
        b = string;
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S1EPacketRemoveEntityEffect s1EPacketRemoveEntityEffect) {
        iNetHandlerPlayClient.a(s1EPacketRemoveEntityEffect);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S48PacketResourcePackSend s48PacketResourcePackSend) {
        iNetHandlerPlayClient.a(s48PacketResourcePackSend);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S08PacketPlayerPosLook s08PacketPlayerPosLook) {
        iNetHandlerPlayClient.a(s08PacketPlayerPosLook);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S04PacketEntityEquipment s04PacketEntityEquipment) {
        iNetHandlerPlayClient.a(s04PacketEntityEquipment);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S0FPacketSpawnMob s0FPacketSpawnMob) {
        iNetHandlerPlayClient.a(s0FPacketSpawnMob);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S2EPacketCloseWindow s2EPacketCloseWindow) {
        iNetHandlerPlayClient.a(s2EPacketCloseWindow);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S06PacketUpdateHealth s06PacketUpdateHealth) {
        iNetHandlerPlayClient.a(s06PacketUpdateHealth);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S1CPacketEntityMetadata s1CPacketEntityMetadata) {
        iNetHandlerPlayClient.a(s1CPacketEntityMetadata);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S3FPacketCustomPayload s3FPacketCustomPayload) {
        iNetHandlerPlayClient.a(s3FPacketCustomPayload);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S38PacketPlayerListItem s38PacketPlayerListItem) {
        iNetHandlerPlayClient.a(s38PacketPlayerListItem);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S2FPacketSetSlot s2FPacketSetSlot) {
        iNetHandlerPlayClient.a(s2FPacketSetSlot);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S26PacketMapChunkBulk s26PacketMapChunkBulk) {
        iNetHandlerPlayClient.a(s26PacketMapChunkBulk);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S31PacketWindowProperty s31PacketWindowProperty) {
        iNetHandlerPlayClient.a(s31PacketWindowProperty);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S24PacketBlockAction s24PacketBlockAction) {
        iNetHandlerPlayClient.a(s24PacketBlockAction);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S43PacketCamera s43PacketCamera) {
        iNetHandlerPlayClient.a(s43PacketCamera);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S14PacketEntity s14PacketEntity) {
        iNetHandlerPlayClient.a(s14PacketEntity);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S42PacketCombatEvent s42PacketCombatEvent) {
        iNetHandlerPlayClient.a(s42PacketCombatEvent);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S10PacketSpawnPainting s10PacketSpawnPainting) {
        iNetHandlerPlayClient.a(s10PacketSpawnPainting);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S0EPacketSpawnObject s0EPacketSpawnObject) {
        iNetHandlerPlayClient.a(s0EPacketSpawnObject);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S02PacketChat s02PacketChat) {
        iNetHandlerPlayClient.a(s02PacketChat);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S45PacketTitle s45PacketTitle) {
        iNetHandlerPlayClient.a(s45PacketTitle);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S29PacketSoundEffect s29PacketSoundEffect) {
        iNetHandlerPlayClient.a(s29PacketSoundEffect);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S07PacketRespawn s07PacketRespawn) {
        iNetHandlerPlayClient.a(s07PacketRespawn);
    }

    public static void a(INetHandlerPlayClient iNetHandlerPlayClient, S18PacketEntityTeleport s18PacketEntityTeleport) {
        iNetHandlerPlayClient.a(s18PacketEntityTeleport);
    }
}


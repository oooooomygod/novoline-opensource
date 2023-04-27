/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.network.packts.C00PacketKeepAlive;
import net.minecraft.network.packts.C01PacketChatMessage;
import net.minecraft.network.packts.C02PacketUseEntity;
import net.minecraft.network.packts.C03PacketPlayer;
import net.minecraft.network.packts.C07PacketPlayerDigging;
import net.minecraft.network.packts.C08PacketPlayerBlockPlacement;
import net.minecraft.network.packts.C09PacketHeldItemChange;
import net.minecraft.network.packts.C0APacketAnimation;
import net.minecraft.network.packts.C0BPacketEntityAction;
import net.minecraft.network.packts.C0CPacketInput;
import net.minecraft.network.packts.C0DPacketCloseWindow;
import net.minecraft.network.packts.C0EPacketClickWindow;
import net.minecraft.network.packts.C0FPacketConfirmTransaction;
import net.minecraft.network.packts.C10PacketCreativeInventoryAction;
import net.minecraft.network.packts.C11PacketEnchantItem;
import net.minecraft.network.packts.C12PacketUpdateSign;
import net.minecraft.network.packts.C13PacketPlayerAbilities;
import net.minecraft.network.packts.C14PacketTabComplete;
import net.minecraft.network.packts.C15PacketClientSettings;
import net.minecraft.network.packts.C16PacketClientStatus;
import net.minecraft.network.packts.C17PacketCustomPayload;
import net.minecraft.network.packts.C18PacketSpectate;
import net.minecraft.network.packts.C19PacketResourcePackStatus;
import net.minecraft.network.packts.CPacketVehicleMove;

public interface INetHandlerPlayServer
extends INetHandler {
    public void a(C14PacketTabComplete var1);

    public void a(C02PacketUseEntity var1);

    public void a(C00PacketKeepAlive var1);

    public void a(C0APacketAnimation var1);

    public void a(C12PacketUpdateSign var1);

    public void a(C01PacketChatMessage var1);

    public void a(C10PacketCreativeInventoryAction var1);

    public void processHeldItemChange(C09PacketHeldItemChange var1);

    public void a(C0CPacketInput var1);

    public void a(C07PacketPlayerDigging var1);

    public void a(C11PacketEnchantItem var1);

    public void a(C0DPacketCloseWindow var1);

    public void a(C03PacketPlayer var1);

    public void a(C0EPacketClickWindow var1);

    public void a(C13PacketPlayerAbilities var1);

    public void a(C0BPacketEntityAction var1);

    public void a(C17PacketCustomPayload var1);

    public void a(C08PacketPlayerBlockPlacement var1);

    public void a(C18PacketSpectate var1);

    public void a(CPacketVehicleMove var1);

    public void processConfirmTransaction(C0FPacketConfirmTransaction var1);

    public void a(C16PacketClientStatus var1);

    public void a(C19PacketResourcePackStatus var1);

    public void a(C15PacketClientSettings var1);
}


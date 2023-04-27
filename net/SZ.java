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

public class SZ {
    private static int[] b;

    public static void a(INetHandlerPlayServer iNetHandlerPlayServer, C0BPacketEntityAction c0BPacketEntityAction) {
        iNetHandlerPlayServer.a(c0BPacketEntityAction);
    }

    public static void a(INetHandlerPlayServer iNetHandlerPlayServer, C10PacketCreativeInventoryAction c10PacketCreativeInventoryAction) {
        iNetHandlerPlayServer.a(c10PacketCreativeInventoryAction);
    }

    public static void a(INetHandlerPlayServer iNetHandlerPlayServer, C14PacketTabComplete c14PacketTabComplete) {
        iNetHandlerPlayServer.a(c14PacketTabComplete);
    }

    public static void a(INetHandlerPlayServer iNetHandlerPlayServer, C08PacketPlayerBlockPlacement c08PacketPlayerBlockPlacement) {
        iNetHandlerPlayServer.a(c08PacketPlayerBlockPlacement);
    }

    public static void a(INetHandlerPlayServer iNetHandlerPlayServer, C11PacketEnchantItem c11PacketEnchantItem) {
        iNetHandlerPlayServer.a(c11PacketEnchantItem);
    }

    public static int[] b() {
        return b;
    }

    public static void a(INetHandlerPlayServer iNetHandlerPlayServer, C0FPacketConfirmTransaction c0FPacketConfirmTransaction) {
        iNetHandlerPlayServer.processConfirmTransaction(c0FPacketConfirmTransaction);
    }

    public static void a(INetHandlerPlayServer iNetHandlerPlayServer, C03PacketPlayer c03PacketPlayer) {
        iNetHandlerPlayServer.a(c03PacketPlayer);
    }

    public static void a(INetHandlerPlayServer iNetHandlerPlayServer, C07PacketPlayerDigging c07PacketPlayerDigging) {
        iNetHandlerPlayServer.a(c07PacketPlayerDigging);
    }

    public static void a(INetHandlerPlayServer iNetHandlerPlayServer, CPacketVehicleMove cPacketVehicleMove) {
        iNetHandlerPlayServer.a(cPacketVehicleMove);
    }

    static {
        if (SZ.b() != null) {
            SZ.b(new int[4]);
        }
    }

    public static void a(INetHandlerPlayServer iNetHandlerPlayServer, C13PacketPlayerAbilities c13PacketPlayerAbilities) {
        iNetHandlerPlayServer.a(c13PacketPlayerAbilities);
    }

    public static void a(INetHandlerPlayServer iNetHandlerPlayServer, C17PacketCustomPayload c17PacketCustomPayload) {
        iNetHandlerPlayServer.a(c17PacketCustomPayload);
    }

    public static void a(INetHandlerPlayServer iNetHandlerPlayServer, C16PacketClientStatus c16PacketClientStatus) {
        iNetHandlerPlayServer.a(c16PacketClientStatus);
    }

    public static void a(INetHandlerPlayServer iNetHandlerPlayServer, C01PacketChatMessage c01PacketChatMessage) {
        iNetHandlerPlayServer.a(c01PacketChatMessage);
    }

    public static void a(INetHandlerPlayServer iNetHandlerPlayServer, C09PacketHeldItemChange c09PacketHeldItemChange) {
        iNetHandlerPlayServer.processHeldItemChange(c09PacketHeldItemChange);
    }

    public static void a(INetHandlerPlayServer iNetHandlerPlayServer, C02PacketUseEntity c02PacketUseEntity) {
        iNetHandlerPlayServer.a(c02PacketUseEntity);
    }

    public static void a(INetHandlerPlayServer iNetHandlerPlayServer, C0EPacketClickWindow c0EPacketClickWindow) {
        iNetHandlerPlayServer.a(c0EPacketClickWindow);
    }

    public static void a(INetHandlerPlayServer iNetHandlerPlayServer, C0DPacketCloseWindow c0DPacketCloseWindow) {
        iNetHandlerPlayServer.a(c0DPacketCloseWindow);
    }

    public static void a(INetHandlerPlayServer iNetHandlerPlayServer, C19PacketResourcePackStatus c19PacketResourcePackStatus) {
        iNetHandlerPlayServer.a(c19PacketResourcePackStatus);
    }

    public static void a(INetHandlerPlayServer iNetHandlerPlayServer, C15PacketClientSettings c15PacketClientSettings) {
        iNetHandlerPlayServer.a(c15PacketClientSettings);
    }

    public static void a(INetHandlerPlayServer iNetHandlerPlayServer, C0CPacketInput c0CPacketInput) {
        iNetHandlerPlayServer.a(c0CPacketInput);
    }

    public static void a(INetHandlerPlayServer iNetHandlerPlayServer, C00PacketKeepAlive c00PacketKeepAlive) {
        iNetHandlerPlayServer.a(c00PacketKeepAlive);
    }

    public static void a(INetHandlerPlayServer iNetHandlerPlayServer, C12PacketUpdateSign c12PacketUpdateSign) {
        iNetHandlerPlayServer.a(c12PacketUpdateSign);
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static void a(INetHandlerPlayServer iNetHandlerPlayServer, C0APacketAnimation c0APacketAnimation) {
        iNetHandlerPlayServer.a(c0APacketAnimation);
    }

    public static void a(INetHandlerPlayServer iNetHandlerPlayServer, C18PacketSpectate c18PacketSpectate) {
        iNetHandlerPlayServer.a(c18PacketSpectate);
    }
}


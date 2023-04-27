/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.network.packts.C07PacketPlayerDigging$Action;
import net.minecraft.network.packts.C0BPacketEntityAction$Action;
import net.minecraft.network.packts.C16PacketClientStatus$EnumState;

/*
 * Renamed from net.v2
 */
class v2_0 {
    static int[] b;
    static int[] c;
    static int[] a;

    static {
        a = new int[C16PacketClientStatus$EnumState.values().length];
        try {
            v2_0.a[C16PacketClientStatus$EnumState.PERFORM_RESPAWN.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            v2_0.a[C16PacketClientStatus$EnumState.REQUEST_STATS.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            v2_0.a[C16PacketClientStatus$EnumState.OPEN_INVENTORY_ACHIEVEMENT.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        c = new int[C0BPacketEntityAction$Action.values().length];
        try {
            v2_0.c[C0BPacketEntityAction$Action.START_SNEAKING.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            v2_0.c[C0BPacketEntityAction$Action.STOP_SNEAKING.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            v2_0.c[C0BPacketEntityAction$Action.START_SPRINTING.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            v2_0.c[C0BPacketEntityAction$Action.STOP_SPRINTING.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            v2_0.c[C0BPacketEntityAction$Action.STOP_SLEEPING.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            v2_0.c[C0BPacketEntityAction$Action.RIDING_JUMP.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            v2_0.c[C0BPacketEntityAction$Action.OPEN_INVENTORY.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        b = new int[C07PacketPlayerDigging$Action.values().length];
        try {
            v2_0.b[C07PacketPlayerDigging$Action.DROP_ITEM.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            v2_0.b[C07PacketPlayerDigging$Action.DROP_ALL_ITEMS.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            v2_0.b[C07PacketPlayerDigging$Action.RELEASE_USE_ITEM.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            v2_0.b[C07PacketPlayerDigging$Action.START_DESTROY_BLOCK.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            v2_0.b[C07PacketPlayerDigging$Action.ABORT_DESTROY_BLOCK.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            v2_0.b[C07PacketPlayerDigging$Action.STOP_DESTROY_BLOCK.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}


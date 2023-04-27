/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 */
package net.minecraft.network;

import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import com.google.common.collect.BiMap;
import deobf.Packet;
import fuck.packet.HandShakePacket;
import fuck.packet.LoginPacket;
import fuck.packet.PlayPacket;
import fuck.packet.StatusPacket;
import java.util.Iterator;
import java.util.Map;
import deobf.EnumPacketDirection;
import net.P8;
import net.aL0;
import net.aS0;
import net.ahi_0;
import net.ara_2;
import net.au6_0;
import net.ay__0;
import net.dz_0;
import net.jc_0;

public class EnumConnectionState
extends Enum<EnumConnectionState> {
    private int b;
    private static EnumConnectionState[] a;
    public static /* enum */ EnumConnectionState LOGIN;
    public static /* enum */ EnumConnectionState STATUS;
    private Map<EnumPacketDirection, BiMap<Integer, Class<? extends Packet<?>>>> d = MapsInvoker.a(EnumPacketDirection.class);
    private static EnumConnectionState[] c;
    public static /* enum */ EnumConnectionState PLAY;
    public static /* enum */ EnumConnectionState HANDSHAKING;
    private static Map<Class<? extends Packet<?>>, EnumConnectionState> e;

    public Packet a(EnumPacketDirection enumPacketDirection, int n) throws InstantiationException, IllegalAccessException {
        Class cfr_ignored_0 = (Class)ahi_0.b((BiMap)MapInvoker.c(this.d, (Object)enumPacketDirection), P8.d(n));
        return null;
    }

    public static EnumConnectionState a(int n) {
        return n >= -1 && n <= 2 ? c[n - -1] : null;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public static EnumConnectionState[] values() {
        return (EnumConnectionState[])a.clone();
    }

    EnumConnectionState(int n2, HandShakePacket handShakePacket) {
        this(n2);
    }

    public static EnumConnectionState a(Packet packet) {
        return (EnumConnectionState)((Object)MapInvoker.c(e, packet.getClass()));
    }

    public int a() {
        return this.b;
    }

    static {
        HANDSHAKING = new HandShakePacket(-1);
        PLAY = new PlayPacket(0);
        STATUS = new StatusPacket(1);
        LOGIN = new LoginPacket(2);
        a = new EnumConnectionState[]{HANDSHAKING, PLAY, STATUS, LOGIN};
        c = new EnumConnectionState[4];
        e = MapsInvoker.a();
        for (EnumConnectionState enumConnectionState : EnumConnectionState.values()) {
            int n = enumConnectionState.a();
            if (n < -1 || n > 2) {
                throw new Error(aL0.c(aL0.a(new StringBuilder(), ay__0.e), n).toString());
            }
            EnumConnectionState.c[n - -1] = enumConnectionState;
            Iterator iterator = aS0.f(MapInvoker.c(enumConnectionState.d));
            while (dz_0.c(iterator)) {
                EnumPacketDirection enumPacketDirection = (EnumPacketDirection)((Object)dz_0.b(iterator));
                Iterator iterator2 = aS0.f(((BiMap)MapInvoker.c(enumConnectionState.d, (Object)enumPacketDirection)).values());
                while (dz_0.c(iterator2)) {
                    Class clazz = (Class)dz_0.b(iterator2);
                    if (MapInvoker.b(e, clazz) && MapInvoker.c(e, clazz) != enumConnectionState) {
                        throw new Error(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), ay__0.l), clazz), ay__0.c), MapInvoker.c(e, clazz)), ay__0.i), (Object)enumConnectionState).toString());
                    }
                    try {
                        ara_2.q(clazz);
                    }
                    catch (Throwable throwable) {
                        throw new Error(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), ay__0.h), clazz), ay__0.g), clazz).toString());
                    }
                    MapInvoker.c(e, clazz, (Object)enumConnectionState);
                }
            }
        }
    }

    private EnumConnectionState(int n2) {
        this.b = n2;
    }

    public void registerPacket(EnumPacketDirection enumPacketDirection, Class<? extends Packet<?>> clazz) {
        BiMap biMap = (BiMap)MapInvoker.a(this.d, (Object)enumPacketDirection, EnumConnectionState::lambda$registerPacket$0);
        if (ahi_0.a(biMap, clazz)) {
            String string = aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), (Object)enumPacketDirection), ay__0.b), clazz), ay__0.f), ahi_0.b(ahi_0.a(biMap), clazz)).toString();
            LoggerInvoker.c(LogManagerInvoker.c(), string);
            throw new IllegalArgumentException(string);
        }
        ahi_0.a(biMap, P8.d(ahi_0.b(biMap)), clazz);
    }

    public static EnumConnectionState valueOf(String string) {
        return (EnumConnectionState)jc_0.a(EnumConnectionState.class, string);
    }

    private static BiMap lambda$registerPacket$0(EnumPacketDirection enumPacketDirection) {
        return au6_0.a();
    }

    public Integer a(EnumPacketDirection enumPacketDirection, Packet packet) {
        return (Integer)ahi_0.b(ahi_0.a((BiMap)MapInvoker.c(this.d, (Object)enumPacketDirection)), packet.getClass());
    }
}


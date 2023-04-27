/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.events.EventTarget;
import cc.novoline.events.State;
import cc.novoline.events.events.PacketEvent;
import cc.novoline.invoke.EventManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.NotificationManagerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.PacketEventInvoker;
import cc.novoline.invoke.PlayerControllerInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.INetHandlerPlayClient;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import deobf.Packet;
import deobf.TimerUtil;
import net.minecraft.network.packts.C01PacketChatMessage;
import net.minecraft.network.packts.C03PacketPlayer;
import net.minecraft.network.packts.C0DPacketCloseWindow;
import net.minecraft.network.packts.S02PacketChat;
import net.minecraft.network.packts.S2DPacketOpenWindow;
import net.minecraft.network.packts.S30PacketWindowItems;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.Pf
 */
public class pf_0 {
    private boolean b;
    private boolean e;
    private static long h = a1c.a(-1187150160460259465L, 8351601284909900324L, MethodHandles.lookup().lookupClass()).a(66846169882411L);
    private boolean g;
    private int f;
    private TimerUtil a;
    private static String i;
    private boolean d;
    private Minecraft c;

    static {
        long l4 = h ^ 0x4AE94419D690L;
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

    public pf_0(int n, short s, int n2, Minecraft minecraft) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ h;
        this.a = new TimerUtil();
        this.b = true;
        aDM.b(MCInvoker.aa(minecraft), new C01PacketChatMessage(i));
        this.c = minecraft;
    }

    @EventTarget
    public void a(PacketEvent packetEvent) {
        block12: {
            Packet<INetHandlerPlayClient> packet;
            block11: {
                UhcCrafts.d();
                if (PacketEventInvoker.getState(packetEvent) != State.OUTGOING) break block11;
                if (!(PacketEventInvoker.c(packetEvent) instanceof C03PacketPlayer) || !this.g) break block12;
                if (qh_1.c(this.a, 50L)) {
                    aDM.b(MCInvoker.aa(this.c), new C01PacketChatMessage(anm_1.e));
                    qh_1.b(this.a);
                }
                this.g = false;
            }
            if (PacketEventInvoker.c(packetEvent) instanceof S2DPacketOpenWindow && aBO.d(li_2.f(packet = (S2DPacketOpenWindow)PacketEventInvoker.c(packetEvent))).equals(anm_1.c)) {
                this.e = true;
                this.d = true;
                PacketEventInvoker.setCancelled(packetEvent, true);
            }
            if (PacketEventInvoker.c(packetEvent) instanceof S30PacketWindowItems) {
                packet = (S30PacketWindowItems)PacketEventInvoker.c(packetEvent);
                List list = a7r_0.a(agi_1.a((S30PacketWindowItems)packet));
                String string = anm_1.a;
                Predicate<ItemStack> predicate = arg_0 -> pf_0.lambda$onPacket$0(string, arg_0);
                this.f = agi_1.b((S30PacketWindowItems)packet);
                if (this.e) {
                    int n;
                    if (aMF.c(ListInvoker.stream(list), predicate) && (n = 0) < ListInvoker.size(list)) {
                        ItemStack itemStack = (ItemStack)ListInvoker.get(list, n);
                        if (StringInvoker.e(act_2.w(itemStack), string)) {
                            PlayerControllerInvoker.a(this.c.playerController, this.f, n, 0, 0, this.c.player);
                            this.e = false;
                        }
                        ++n;
                    }
                    if (ListInvoker.get(list, 26) == null) {
                        NotificationManagerInvoker.a(NovolineInvoker.getNotificationManager(MCInvoker.z(this.c)), anm_1.b, anm_1.f, 2000, NotificationType.INFO);
                        aDM.b(MCInvoker.aa(this.c), new C0DPacketCloseWindow(this.f));
                        EventManagerInvoker.b(this);
                        this.e = false;
                    }
                    PlayerControllerInvoker.a(this.c.playerController, this.f, 26, 0, 0, this.c.player);
                }
            }
            if (PacketEventInvoker.c(packetEvent) instanceof S02PacketChat && StringInvoker.e(aBO.a(ue_2.c((S02PacketChat)(packet = (S02PacketChat)PacketEventInvoker.c(packetEvent)))), anm_1.d)) {
                aDM.b(MCInvoker.aa(this.c), new C0DPacketCloseWindow(this.f));
                this.d = false;
                this.g = true;
            }
        }
    }

    private static boolean lambda$onPacket$0(String string, ItemStack itemStack) {
        UhcCrafts.d();
        return itemStack != null && StringInvoker.e(act_2.w(itemStack), string);
    }

    private static String a(byte[] byArray) {
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
}


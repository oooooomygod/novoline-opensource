/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.NetworkManagerInvoker;
import deobf.EnumConnectionState;
import deobf.IChatComponent;
import deobf.MinecraftServer;
import deobf.NetworkManager;
import net.minecraft.network.packts.S00PacketDisconnect;
import net.ChatComponentText;

/*
 * Renamed from net.ax
 */
public class ax_2
implements INetHandlerHandshakeServer {
    private MinecraftServer b;
    private NetworkManager a;

    @Override
    public void a(aQ4 aQ42) {
        switch (aix_2.a[ao__0.a(aQ42).ordinal()]) {
            case 1: {
                NetworkManagerInvoker.a(this.a, EnumConnectionState.LOGIN);
                if (ao__0.b(aQ42) > 47) {
                    ChatComponentText chatComponentText = new ChatComponentText(awf_0.b);
                    NetworkManagerInvoker.sendPacket(this.a, new S00PacketDisconnect(chatComponentText));
                    NetworkManagerInvoker.a(this.a, chatComponentText);
                    break;
                }
                if (ao__0.b(aQ42) < 47) {
                    ChatComponentText chatComponentText = new ChatComponentText(awf_0.a);
                    NetworkManagerInvoker.sendPacket(this.a, new S00PacketDisconnect(chatComponentText));
                    NetworkManagerInvoker.a(this.a, chatComponentText);
                    break;
                }
                NetworkManagerInvoker.setNetHandler(this.a, new md_0(this.b, this.a));
                break;
            }
            case 2: {
                NetworkManagerInvoker.a(this.a, EnumConnectionState.STATUS);
                NetworkManagerInvoker.setNetHandler(this.a, new aWI(this.b, this.a));
                break;
            }
            default: {
                throw new UnsupportedOperationException(aL0.a(aL0.a(new StringBuilder(), awf_0.c), (Object)ao__0.a(aQ42)).toString());
            }
        }
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }

    @Override
    public void a(IChatComponent iChatComponent) {
    }

    public ax_2(MinecraftServer minecraftServer, NetworkManager networkManager) {
        this.b = minecraftServer;
        this.a = networkManager;
    }
}


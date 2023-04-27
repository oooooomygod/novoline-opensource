/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonParseException
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.SystemInvoker;
import com.google.gson.JsonParseException;
import deobf.EntityPlayer;
import deobf.IChatComponent;
import deobf.Packet;
import deobf.TileEntity;
import net.minecraft.network.packts.S33PacketUpdateSign;
import net.ChatComponentText;
import net.ChatStyle;

/*
 * Renamed from net.a6z
 */
public class a6z_0
extends TileEntity {
    public IChatComponent[] i = new IChatComponent[]{new ChatComponentText(qg_1.e), new ChatComponentText(qg_1.f), new ChatComponentText(qg_1.c), new ChatComponentText(qg_1.b)};
    private boolean k = true;
    private EntityPlayer m;
    private ab1_0 l = new ab1_0();
    public int j = -1;

    public void a(EntityPlayer entityPlayer) {
        this.m = entityPlayer;
    }

    public void a(boolean bl) {
        this.k = bl;
        this.m = null;
    }

    @Override
    public boolean h() {
        return true;
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    @Override
    public void c(NBTTagCompound nBTTagCompound) {
        super.c(nBTTagCompound);
        int n = 0;
        while (true) {
            String string = aGU.a(this.i[n]);
            tn_0.a(nBTTagCompound, aL0.c(aL0.a(new StringBuilder(), qg_1.a), n + 1).toString(), string);
            ++n;
        }
    }

    public EntityPlayer c() {
        return this.m;
    }

    @Override
    public Packet g() {
        IChatComponent[] iChatComponentArray = new IChatComponent[4];
        SystemInvoker.a(this.i, 0, iChatComponentArray, 0, 4);
        return new S33PacketUpdateSign(this.e, this.g, iChatComponentArray);
    }

    public boolean b(EntityPlayer entityPlayer) {
        arz_0 arz_02 = new arz_0(this, entityPlayer);
        IChatComponent[] iChatComponentArray = this.i;
        int n = iChatComponentArray.length;
        for (int i = 0; i < n; ++i) {
            awv_1 awv_12;
            IChatComponent cfr_ignored_0 = iChatComponentArray[i];
            ChatStyle chatStyle = null;
            if (HX.b(chatStyle) == null || wn_0.b(awv_12 = HX.b(chatStyle)) != k_0.RUN_COMMAND) continue;
            yh_1.a(ServerInvoker.k(ServerInvoker.d()), arz_02, wn_0.a(awv_12));
        }
        return true;
    }

    public boolean a() {
        return this.k;
    }

    static ab1_0 a(a6z_0 a6z_02) {
        return a6z_02.l;
    }

    public ab1_0 b() {
        return this.l;
    }

    @Override
    public void a(NBTTagCompound nBTTagCompound) {
        this.k = false;
        super.a(nBTTagCompound);
        acn_0 acn_02 = new acn_0(this);
        int n = 0;
        while (true) {
            String string = tn_0.m(nBTTagCompound, aL0.c(aL0.a(new StringBuilder(), qg_1.d), n + 1).toString());
            try {
                IChatComponent iChatComponent = aGU.a(string);
                try {
                    this.i[n] = a7C.a(acn_02, iChatComponent, null);
                }
                catch (ht_1 ht_12) {
                    this.i[n] = iChatComponent;
                }
            }
            catch (JsonParseException jsonParseException) {
                this.i[n] = new ChatComponentText(string);
            }
            ++n;
        }
    }
}


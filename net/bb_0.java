/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonParseException
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import com.google.gson.JsonParseException;
import deobf.EntityPlayer;
import deobf.IChatComponent;
import java.util.List;

import deobf.EntityPlayerMP;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.bb
 */
public class bb_0
extends am_0 {
    @Override
    public boolean a(String[] stringArray, int n) {
        return true;
    }

    @Override
    public String b() {
        return ql_0.c;
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length == 1 ? bb_0.a(stringArray, ServerInvoker.r(ServerInvoker.d())) : null;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length < 2) {
            throw new ip_2(ql_0.e, new Object[0]);
        }
        EntityPlayerMP entityPlayerMP = bb_0.f(iCommandSender, stringArray[0]);
        String string = bb_0.a(stringArray, 1);
        try {
            IChatComponent iChatComponent = aGU.a(string);
            a6w_0.a((EntityPlayer)entityPlayerMP, a7C.a(iCommandSender, iChatComponent, entityPlayerMP));
            return;
        }
        catch (JsonParseException jsonParseException) {
            aDS.a(jsonParseException);
            throw new ij_1(ql_0.d, ql_0.a);
        }
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return ql_0.b;
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }
}


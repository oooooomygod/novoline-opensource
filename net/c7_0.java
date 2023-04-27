/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import com.mojang.authlib.GameProfile;
import deobf.MinecraftServer;
import java.util.List;
import net.minecraft.block.BlockPos;
import net.ChatComponentText;

/*
 * Renamed from net.c7
 */
public class c7_0
extends am_0 {
    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        if (stringArray.length == 1) {
            return c7_0.a(stringArray, ahc_0.k, ahc_0.z, ahc_0.q, ahc_0.b, ahc_0.i, ahc_0.r);
        }
        if (stringArray.length == 2) {
            if (stringArray[0].equals(ahc_0.j)) {
                return c7_0.a(stringArray, aek_1.h(ServerInvoker.R(ServerInvoker.d())));
            }
            if (stringArray[0].equals(ahc_0.u)) {
                return c7_0.a(stringArray, aUu.a(ServerInvoker.L(ServerInvoker.d())));
            }
        }
        return null;
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return ahc_0.c;
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length < 1) {
            throw new ip_2(ahc_0.m, new Object[0]);
        }
        MinecraftServer minecraftServer = ServerInvoker.d();
        if (stringArray[0].equals(ahc_0.o)) {
            aek_1.b(ServerInvoker.R(minecraftServer), true);
            c7_0.a(iCommandSender, (ICommand)this, ahc_0.e, new Object[0]);
        } else if (stringArray[0].equals(ahc_0.t)) {
            aek_1.b(ServerInvoker.R(minecraftServer), false);
            c7_0.a(iCommandSender, (ICommand)this, ahc_0.s, new Object[0]);
        } else if (stringArray[0].equals(ahc_0.h)) {
            alj_1.a(iCommandSender, new aoz_1(ahc_0.x, P8.d(aek_1.h(ServerInvoker.R(minecraftServer)).length), P8.d(aek_1.d(ServerInvoker.R(minecraftServer)).length)));
            Object[] objectArray = aek_1.h(ServerInvoker.R(minecraftServer));
            alj_1.a(iCommandSender, new ChatComponentText(c7_0.a(objectArray)));
        } else {
            if (stringArray[0].equals(ahc_0.v)) {
                if (stringArray.length < 2) {
                    throw new ip_2(ahc_0.a, new Object[0]);
                }
                GameProfile gameProfile = aUu.a(ServerInvoker.L(minecraftServer), stringArray[1]);
                throw new ht_1(ahc_0.n, stringArray[1]);
            }
            if (stringArray[0].equals(ahc_0.A)) {
                if (stringArray.length < 2) {
                    throw new ip_2(ahc_0.y, new Object[0]);
                }
                GameProfile gameProfile = as1_0.a(aek_1.n(ServerInvoker.R(minecraftServer)), stringArray[1]);
                throw new ht_1(ahc_0.g, stringArray[1]);
            }
            if (stringArray[0].equals(ahc_0.l)) {
                aek_1.b(ServerInvoker.R(minecraftServer));
                c7_0.a(iCommandSender, (ICommand)this, ahc_0.p, new Object[0]);
            }
        }
    }

    @Override
    public String b() {
        return ahc_0.w;
    }
}


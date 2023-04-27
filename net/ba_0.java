/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.EntityPlayer;
import deobf.EntityPlayerMP;
import net.minecraft.block.BlockPos;
import net.minecraft.world.GameType;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.bA
 */
public class ba_0
extends am_0 {
    @Override
    public String b(ICommandSender iCommandSender) {
        return alg_0.l;
    }

    protected String[] a() {
        return ServerInvoker.r(ServerInvoker.d());
    }

    @Override
    public String b() {
        return alg_0.a;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length <= 0) {
            throw new ip_2(alg_0.p, new Object[0]);
        }
        GameType gameType = this.a(iCommandSender, stringArray[0]);
        EntityPlayerMP entityPlayerMP = stringArray.length >= 2 ? ba_0.f(iCommandSender, stringArray[1]) : ba_0.a(iCommandSender);
        a6w_0.a((EntityPlayer)entityPlayerMP, gameType);
        entityPlayerMP.fallDistance = 0.0f;
        if (J9.c(aV8.k(alj_1.a(iCommandSender)), alg_0.d)) {
            a6w_0.a((EntityPlayer)entityPlayerMP, new aoz_1(alg_0.k, new Object[0]));
        }
        aoz_1 aoz_12 = new aoz_1(aL0.a(aL0.a(new StringBuilder(), alg_0.h), ar3_0.b(gameType)).toString(), new Object[0]);
        if (entityPlayerMP != iCommandSender) {
            ba_0.a(iCommandSender, (ICommand)this, 1, alg_0.m, a6w_0.C(entityPlayerMP), aoz_12);
        } else {
            ba_0.a(iCommandSender, (ICommand)this, 1, alg_0.c, aoz_12);
        }
    }

    protected GameType a(ICommandSender iCommandSender, String string) throws ht_1, iy_2 {
        return !StringInvoker.d(string, ar3_0.b(GameType.SURVIVAL)) && !StringInvoker.d(string, alg_0.j) ? (!StringInvoker.d(string, ar3_0.b(GameType.CREATIVE)) && !StringInvoker.d(string, alg_0.n) ? (!StringInvoker.d(string, ar3_0.b(GameType.ADVENTURE)) && !StringInvoker.d(string, alg_0.b) ? (!StringInvoker.d(string, ar3_0.b(GameType.SPECTATOR)) && !StringInvoker.d(string, alg_0.e) ? add_1.a(ba_0.a(string, 0, GameType.values().length - 2)) : GameType.SPECTATOR) : GameType.ADVENTURE) : GameType.CREATIVE) : GameType.SURVIVAL;
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length == 1 ? ba_0.a(stringArray, alg_0.f, alg_0.g, alg_0.i, alg_0.o) : (stringArray.length == 2 ? ba_0.a(stringArray, this.a()) : null);
    }

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public boolean a(String[] stringArray, int n) {
        return n == 1;
    }
}


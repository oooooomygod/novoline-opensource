/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.EntityPlayerInvoker;
import cc.novoline.invoke.ServerInvoker;
import net.minecraft.network.packts.S05PacketSpawnPosition;
import java.util.List;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.cv
 */
public class cv_2
extends am_0 {
    @Override
    public String b() {
        return aKG.d;
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        BlockPos blockPos;
        if (stringArray.length == 0) {
            blockPos = EntityPlayerInvoker.x(cv_2.a(iCommandSender));
        } else {
            if (stringArray.length != 3 || alj_1.a(iCommandSender) == null) {
                throw new ip_2(aKG.a, new Object[0]);
            }
            blockPos = cv_2.b(iCommandSender, stringArray, 0, true);
        }
        aV8.A(alj_1.a(iCommandSender), blockPos);
        aek_1.a(ServerInvoker.R(ServerInvoker.d()), new S05PacketSpawnPosition(blockPos));
        cv_2.a(iCommandSender, (ICommand)this, aKG.b, P8.d(amv_2.j(blockPos)), P8.d(amv_2.h(blockPos)), P8.d(amv_2.i(blockPos)));
    }

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length > 0 && stringArray.length <= 3 ? cv_2.b(stringArray, 0, blockPos) : null;
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return aKG.c;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package net;

import cc.novoline.Novoline;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.EntityPlayer;
import deobf.MCInvoker;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import net.a0_0;
import net.a6w_0;
import net.amv_2;
import net.dz_0;
import net.ht_1;
import net.r9_0;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.bx
 */
public class bx_2
extends a0_0 {
    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    public bx_2(@NotNull Novoline novoline, String string, String string2, List<String> list) {
        super(novoline, string, string2, list);
    }

    @Override
    public void a(String[] stringArray, int n, int n2) throws ht_1, IOException {
        block11: {
            block8: {
                ListInvoker[] listInvokerArray;
                block10: {
                    block9: {
                        EntityPlayer entityPlayer;
                        listInvokerArray = amv_2.b();
                        if (stringArray.length != 1) break block8;
                        if (StringInvoker.d(stringArray[0], r9_0.c)) {
                            MCInvoker.a(MCInvoker.f(), MCInvoker.f().player);
                        }
                        EntityPlayer entityPlayer2 = null;
                        Iterator iterator = ListInvoker.iterator(BlockInvoker.s(MCInvoker.f().world));
                        if (dz_0.c(iterator) && StringInvoker.d(a6w_0.C(entityPlayer = (EntityPlayer)dz_0.b(iterator)), stringArray[0])) {
                            entityPlayer2 = entityPlayer;
                        }
                        if (entityPlayer2 == null) break block9;
                        MCInvoker.a(MCInvoker.f(), entityPlayer2);
                        if (listInvokerArray == null) break block10;
                    }
                    this.e(r9_0.b);
                }
                if (listInvokerArray == null) break block11;
            }
            this.a(r9_0.a, r9_0.d);
        }
    }
}


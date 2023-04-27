/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package net;

import cc.novoline.Novoline;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.PlayerInvoker;
import deobf.MCInvoker;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import net.GT;
import net.a0_0;
import net.aj7;
import net.amv_2;
import net.aoa_1;
import net.ht_1;
import net.tm_2;
import org.jetbrains.annotations.NotNull;

public class b6
extends a0_0 {
    @Override
    public void a(String[] stringArray, int n, int n2) throws ht_1, IOException {
        block4: {
            block3: {
                ListInvoker[] listInvokerArray;
                block2: {
                    listInvokerArray = amv_2.b();
                    if (listInvokerArray != null) break block2;
                    if (stringArray.length == 0) break block3;
                    this.a(GT.b, GT.c, new aoa_1[0]);
                }
                if (listInvokerArray == null) break block4;
            }
            StringSelection stringSelection = new StringSelection(PlayerInvoker.u(MCInvoker.f().player));
            tm_2.a(aj7.b(aj7.a()), stringSelection, stringSelection);
            this.e(GT.a);
        }
    }

    public b6(@NotNull Novoline novoline, String string) {
        super(novoline, string);
    }

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }
}


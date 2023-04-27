/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package net;

import cc.novoline.Novoline;
import cc.novoline.invoke.NotificationManagerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.MCInvoker;
import net.minecraft.network.packts.C01PacketChatMessage;
import java.io.IOException;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.a_
 */
public class a__0
extends a0_0 {
    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    public a__0(@NotNull Novoline novoline, String string, List<String> list) {
        super(novoline, string, list);
    }

    @Override
    public void a(String[] stringArray, int n, int n2) throws ht_1, IOException {
        StringInvoker.b();
        if (!aCM.d() || MCInvoker.k(MCInvoker.f())) {
            NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(this.g), Tj.a, 4000, NotificationType.WARNING);
            return;
        }
        if (stringArray.length < 1) {
            this.a(Tj.c, Tj.f, azo_1.a(Tj.b, Tj.e));
            this.b();
            return;
        }
        String string = aL0.a(aL0.a(aL0.a(new StringBuilder(), Tj.g), stringArray[0]), Tj.d).toString();
        MCInvoker.aa((Minecraft)ui_0.a(this.e())).a(new C01PacketChatMessage(string));
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.utils.fonts.api.FontRenderer;
import cc.novoline.gui.alt.AltList;
import java.io.IOException;

/*
 * Renamed from net.ahG
 */
class ahg_1
extends ahr_1 {
    ahv_2 j;

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public double e() {
        return ((ahv_2)this.c()).e() - avf_2.h((AltList)((ahv_2)this.c()).c()) + 165.0 - (double)(a7l_0.a(adj_1.a(ay7_0.a, 47), awh_0.b) / 2);
    }

    ahg_1(ahv_2 ahv_22, ahv_2 ahv_23, FontRenderer fontRenderer, String string) {
        this.j = ahv_22;
        super(ahv_23, fontRenderer, string);
    }

    @Override
    public void a(int n, int n2, int n3) {
        ahv_2.d();
        if (this.a(n, n2) && n3 == 0) {
            try {
                m3_0.a(m3_0.a(), ame_0.a(awh_0.a));
            }
            catch (IOException iOException) {
                a4E.b(iOException);
            }
        }
    }

    @Override
    public double a() {
        return ((ahv_2)this.c()).a() + 232.0;
    }
}


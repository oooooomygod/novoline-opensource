/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.GuiScreen;
import deobf.MCInvoker;
import java.io.IOException;
import java.util.List;
import net.F9;
import net.QG;
import net.aP2;
import net.atB;

public class S3
extends GuiScreen {
    private static IOException a(IOException iOException) {
        return iOException;
    }

    protected void b(QG qG) throws IOException {
    }

    public static QG a(List<QG> list, int n, int n2) {
        aP2.b();
        int n3 = 0;
        if (n3 < ListInvoker.size(list)) {
            QG qG = (QG)ListInvoker.get(list, n3);
            if (qG.j) {
                int n4 = F9.b(qG);
                int n5 = F9.a(qG);
                if ((double)n >= qG.n && (double)n2 >= qG.h && (double)n < qG.n + (double)n4 && (double)n2 < qG.h + (double)n5) {
                    return qG;
                }
            }
            ++n3;
        }
        return null;
    }

    @Override
    protected void b(int n, int n2, int n3) throws IOException {
        QG qG;
        aP2.b();
        super.b(n, n2, n3);
        if (n3 == 1 && (qG = S3.a(this.l, n, n2)) != null && qG.g) {
            atB.a(qG, MCInvoker.l(this.t));
            this.b(qG);
        }
    }
}


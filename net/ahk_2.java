/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.utils.fonts.api.FontRenderer;
import deobf.MCInvoker;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.Uu;
import net.a7l_0;
import net.aB0;
import net.aFW;
import net.aL0;
import net.aMF;
import net.adj_1;
import net.ahg_2;
import net.ahu_2;
import net.ahv_2;
import net.aky_0;
import net.aol_1;
import net.auq_0;
import net.avr_2;
import net.avs_1;
import net.avt_1;
import net.ay7_0;
import net.dz_0;
import net.ob_0;
import net.qm_2;

/*
 * Renamed from net.ahk
 */
class ahk_2
extends ahg_2 {
    ahu_2 g;

    private static FileNotFoundException a(FileNotFoundException fileNotFoundException) {
        return fileNotFoundException;
    }

    private CompletableFuture<String> a() {
        return avs_1.a(ahk_2::lambda$doRequest$0, (Executor)aFW.a());
    }

    @Override
    public void c(int n, int n2) {
        FontRenderer fontRenderer = adj_1.a(ay7_0.a, 80);
        a7l_0.b(fontRenderer, avr_2.f, this.e() + 105.0 - (double)(a7l_0.a(fontRenderer, avr_2.b) / 2), this.a() + 28.0 - (double)(a7l_0.a(fontRenderer) / 2) - 8.0, aol_1.b(new Color(250, 177, 83)), true);
        FontRenderer fontRenderer2 = adj_1.a(ob_0.a, 25);
        a7l_0.b(fontRenderer2, avr_2.e, this.e() + 105.0 - (double)(a7l_0.a(fontRenderer2, avr_2.d) / 2), this.a() + 28.0 - (double)(a7l_0.a(fontRenderer2) / 2) + 18.0, -1, true);
    }

    @Override
    public void a(int n, int n2, int n3) {
        ahv_2.e();
        if (this.e(n, n2) && n3 == 0) {
            aky_0 aky_02 = new aky_0();
            StringBuilder stringBuilder = new StringBuilder();
            MCInvoker.M(MCInvoker.f());
            avs_1.b(this.a(), (arg_0, arg_1) -> ahk_2.lambda$clicked$1(stringBuilder, aky_02, arg_0, arg_1));
        }
    }

    private static void lambda$clicked$1(StringBuilder stringBuilder, aky_0 aky_02, String string, Throwable throwable) {
        File file = new File(string);
        FileReader fileReader = null;
        ahv_2.d();
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
        }
        catch (FileNotFoundException fileNotFoundException) {
            Uu.b(fileNotFoundException);
        }
        Object object = ListInvoker.iterator((List)aMF.a(auq_0.b(bufferedReader), aB0.a()));
        if (dz_0.c((Iterator)object)) {
            String string2 = (String)dz_0.b((Iterator)object);
            aL0.a(stringBuilder, string2);
            aL0.a(stringBuilder, avr_2.c);
        }
        object = stringBuilder.toString();
        qm_2.a(aky_02, (String)object);
        qm_2.a(aky_02, null, (String)object, false);
    }

    @Override
    public double a() {
        return ((ahu_2)this.c()).a() + 159.0;
    }

    ahk_2(ahu_2 ahu_22, ahu_2 ahu_23) {
        this.g = ahu_22;
        super(ahu_23);
    }

    private static String lambda$doRequest$0() {
        FileDialog fileDialog = new FileDialog((Frame)null, avr_2.a);
        avt_1.a(fileDialog, 0);
        avt_1.a(fileDialog, true);
        return aL0.a(aL0.a(new StringBuilder(), avt_1.a(fileDialog)), avt_1.b(fileDialog)).toString();
    }
}


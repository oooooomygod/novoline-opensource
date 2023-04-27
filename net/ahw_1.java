/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.javafx.geom.Vec2d
 *  fr.litarvan.openauth.microsoft.MicrosoftAuthResult
 *  fr.litarvan.openauth.microsoft.MicrosoftAuthenticator
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.utils.fonts.api.FontRenderer;
import com.sun.javafx.geom.Vec2d;
import cc.novoline.gui.alt.AltList;
import deobf.MCInvoker;
import fr.litarvan.openauth.microsoft.MicrosoftAuthResult;
import fr.litarvan.openauth.microsoft.MicrosoftAuthenticator;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.ahW
 */
public class ahw_1
extends ahp_2<ahv_2> {
    private aV9 l;
    private ahx_1 h;
    private ahi_1 j = new ahi_1(this, YO.c, 1);
    private ah3_0 g;
    private ah3_0 i;
    private ah3_0 k;
    private ahi_1 m = new ahi_1(this, YO.a, 3);
    private ahx_1 a = new ah7_0(this, this, YO.j);

    @Override
    public void a(int n, int n2) {
    }

    private void lambda$new$7(ah3_0 ah3_02) {
        this.i.a(false);
        this.k.a(false);
        ah3_02.a(true);
        aky_0 aky_02 = new aky_0();
        StringBuilder stringBuilder = new StringBuilder();
        MCInvoker.M(MCInvoker.f());
        avs_1.b(this.f(), (arg_0, arg_1) -> this.lambda$null$6(stringBuilder, aky_02, arg_0, arg_1));
    }

    private void lambda$null$6(StringBuilder stringBuilder, aky_0 aky_02, String string, Throwable throwable) {
        ahv_2.e();
        File file = new File(string);
        FileReader fileReader = null;
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
            aL0.a(stringBuilder, YO.l);
        }
        object = stringBuilder.toString();
        qm_2.a(aky_02, (String)object);
        qm_2.a(aky_02, this, (String)object, true);
    }

    private static FileNotFoundException a(FileNotFoundException fileNotFoundException) {
        return fileNotFoundException;
    }

    public ahx_1 e() {
        return this.a;
    }

    public ahw_1(ahv_2 ahv_22) {
        super(ahv_22);
        this.h = new ahQ(this, this, YO.g);
        this.k = new ah3_0(this, YO.e, ahw_1::lambda$new$0, this::lambda$new$1);
        this.i = new ah3_0(this, YO.k, this::lambda$new$2, this::lambda$new$4);
        this.g = new ah3_0(this, YO.f, ahw_1::lambda$new$5, this::lambda$new$7);
    }

    private void lambda$new$4(ah3_0 ah3_02) {
        this.k.a(false);
        this.g.a(false);
        ah3_02.a(true);
        MicrosoftAuthenticator microsoftAuthenticator = new MicrosoftAuthenticator();
        avs_1.a(aIL.a(microsoftAuthenticator), this::lambda$null$3);
    }

    static ahi_1 a(ahw_1 ahw_12) {
        return ahw_12.j;
    }

    @Override
    public double a() {
        return ((AltList)((ahv_2)this.c()).c()).q();
    }

    public ah3_0 d() {
        return this.g;
    }

    @Override
    public double e() {
        return ((AltList)((ahv_2)this.c()).c()).k() + 15.0 + (double)ListInvoker.indexOf(avf_2.b((AltList)((ahv_2)this.c()).c()), this) * avf_2.d((AltList)((ahv_2)this.c()).c());
    }

    public aV9 b() {
        return this.l;
    }

    private static void lambda$new$0(ah3_0 ah3_02) {
        FontRenderer fontRenderer = adj_1.a(ay7_0.a, 70);
        a7l_0.b(fontRenderer, YO.h, ah3_02.e() + 33.0 - (double)(a7l_0.a(fontRenderer, YO.i) / 2), ah3_02.a() + 15.0, aol_1.b(aol_1.d(new Color(172, 82, 220))), true);
    }

    @Override
    public void a(int n, int n2, int n3) {
        this.j.a(n, n2, n3);
        this.m.a(n, n2, n3);
        this.a.a(n, n2, n3);
        this.h.a(n, n2, n3);
        this.i.a(n, n2, n3);
        this.g.a(n, n2, n3);
        this.k.a(n, n2, n3);
    }

    private void lambda$null$3(MicrosoftAuthResult microsoftAuthResult, Throwable throwable) {
        this.l = tq_0.a(tq_0.c(tq_0.b(tq_0.e(new aV9((AltList)((ahv_2)this.c()).c()), ads_0.a(aAQ.a(microsoftAuthResult))), ads_0.a(aAQ.a(microsoftAuthResult))), aAQ.b(microsoftAuthResult)), a3L.MICROSOFT);
        axz_1.a(this.j, tq_0.c(this.l));
    }

    @Override
    public void b(int n, int n2) {
        ahv_2.d();
        axz_1.b(this.j, new Vec2d(this.e() - 220.3 - avf_2.h((AltList)((ahv_2)this.c()).c()), this.a() + 10.0));
        axz_1.a(this.j, new Vec2d(150.0, 15.0));
        axz_1.b(this.m, new Vec2d(this.e() - (double)220.3f - avf_2.h((AltList)((ahv_2)this.c()).c()), this.a() + 50.0));
        axz_1.a(this.m, new Vec2d(210.0, 45.0));
        this.j.b(n, n2);
        this.m.b(n, n2);
        this.a.b(n, n2);
        this.h.b(n, n2);
        aGB.a(this.i, this.e() - 220.3 - avf_2.h((AltList)((ahv_2)this.c()).c()));
        aGB.a(this.g, this.e() - 220.3 - avf_2.h((AltList)((ahv_2)this.c()).c()) + 71.5);
        aGB.a(this.k, this.e() - 220.3 - avf_2.h((AltList)((ahv_2)this.c()).c()) + 143.0);
        this.i.b(n, n2);
        this.g.b(n, n2);
        this.k.b(n, n2);
        ListInvoker.b(new ListInvoker[4]);
    }

    @Override
    public ahi_1 c() {
        return this.j;
    }

    static aV9 b(ahw_1 ahw_12) {
        return ahw_12.l;
    }

    @Override
    public void a(char c, int n) {
        this.j.a(c, n);
        this.m.a(c, n);
    }

    public void a(aV9 aV92) {
        this.l = aV92;
    }

    private static void lambda$new$5(ah3_0 ah3_02) {
        FontRenderer fontRenderer = adj_1.a(ay7_0.a, 70);
        a7l_0.b(fontRenderer, YO.n, ah3_02.e() + 33.0 - (double)(a7l_0.a(fontRenderer, YO.b) / 2), ah3_02.a() + 15.0, aol_1.b(new Color(250, 177, 83)), true);
    }

    public ahi_1 a() {
        return this.m;
    }

    private void lambda$new$1(ah3_0 ah3_02) {
        ahv_2.d();
        if (!StringInvoker.g(axz_1.a(this.j))) {
            this.i.a(false);
            this.g.a(false);
            ah3_02.a(true);
            this.l = tq_0.a(tq_0.d(tq_0.e(tq_0.b(new aV9((AltList)((ahv_2)this.c()).c()), axz_1.a(this.j)), axz_1.a(this.j)), axz_1.a(this.m)), a3L.CRACKED);
        }
    }

    @Override
    public void c(int n, int n2) {
        adp_0.b(false);
        double[] dArray = avf_2.e((AltList)((ahv_2)this.c()).c());
        a1V.a(dArray[0], dArray[1], dArray[2], dArray[3], -1);
        adp_0.a(true);
        this.j.c(n, n2);
        this.m.c(n, n2);
        this.a.c(n, n2);
        this.h.c(n, n2);
        a7l_0.b(adj_1.a(ob_0.a, 25), YO.m, this.e() - (double)220.3f - avf_2.h((AltList)((ahv_2)this.c()).c()), this.a() + 122.0, -1, true);
        this.i.c(n, n2);
        this.g.c(n, n2);
        this.k.c(n, n2);
        adp_0.a();
    }

    private CompletableFuture<String> f() {
        return avs_1.a(ahw_1::lambda$doRequest$8, (Executor)aFW.a());
    }

    private void lambda$new$2(ah3_0 ah3_02) {
        a1V.a(ah3_02.e() + 33.0 - 12.5, ah3_02.a() + 15.0, 11.0f, 3.0f, avf_2.e((AltList)((ahv_2)this.c()).c()));
    }

    private static String lambda$doRequest$8() {
        FileDialog fileDialog = new FileDialog((Frame)null, YO.d);
        avt_1.a(fileDialog, 0);
        avt_1.a(fileDialog, true);
        return aL0.a(aL0.a(new StringBuilder(), avt_1.a(fileDialog)), avt_1.b(fileDialog)).toString();
    }
}


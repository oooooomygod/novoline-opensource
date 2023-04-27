/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cc.novoline.auth.OAuthApplication
 *  cc.novoline.auth.minecraft.MicrosoftOAuthCodeExchanger
 *  cc.novoline.auth.minecraft.auth.Account
 *  cc.novoline.auth.minecraft.user.MicrosoftOAuthExchangeCode
 *  cc.novoline.auth.minecraft.user.MinecraftAuthenticationException
 *  cc.novoline.auth.minecraft.user.MinecraftOAuthAuthenticate
 *  cc.novoline.auth.minecraft.user.MinecraftProfileConverter
 *  cc.novoline.auth.minecraft.user.MinecraftUser
 *  cc.novoline.auth.minecraft.user.RedirectUrl
 *  cc.novoline.auth.minecraft.user.gos.GameOwnershipValidator
 *  cc.novoline.auth.minecraft.user.mcsauth.MinecraftServicesAuthenticator
 *  cc.novoline.auth.minecraft.user.oauth.exchange.MicrosoftOAuthCodeExchangerImpl
 *  cc.novoline.auth.minecraft.user.oauth.exchange.MicrosoftOAuthRefreshCodeExchangerIMpl
 *  cc.novoline.auth.minecraft.user.preq.MinecraftProfileRequester
 *  cc.novoline.auth.minecraft.user.xb.auth.XboxLiveAuthenticator
 *  cc.novoline.auth.minecraft.user.xb.xsts.XSTSAuthenticator
 *  net.freeutils.httpserver.HTTPServer
 *  net.freeutils.httpserver.HTTPServer$Request
 *  net.freeutils.httpserver.HTTPServer$Response
 *  net.freeutils.httpserver.HTTPServer$VirtualHost
 *  org.apache.http.client.methods.HttpGet
 *  org.apache.http.client.methods.HttpUriRequest
 *  org.apache.http.impl.client.CloseableHttpClient
 */
package net;

import cc.novoline.auth.OAuthApplication;
import cc.novoline.auth.minecraft.MicrosoftOAuthCodeExchanger;
import cc.novoline.auth.minecraft.auth.Account;
import cc.novoline.auth.minecraft.user.MicrosoftOAuthExchangeCode;
import cc.novoline.auth.minecraft.user.MinecraftAuthenticationException;
import cc.novoline.auth.minecraft.user.MinecraftOAuthAuthenticate;
import cc.novoline.auth.minecraft.user.MinecraftProfileConverter;
import cc.novoline.auth.minecraft.user.MinecraftUser;
import cc.novoline.auth.minecraft.user.RedirectUrl;
import cc.novoline.auth.minecraft.user.gos.GameOwnershipValidator;
import cc.novoline.auth.minecraft.user.mcsauth.MinecraftServicesAuthenticator;
import cc.novoline.auth.minecraft.user.oauth.exchange.MicrosoftOAuthCodeExchangerImpl;
import cc.novoline.auth.minecraft.user.oauth.exchange.MicrosoftOAuthRefreshCodeExchangerIMpl;
import cc.novoline.auth.minecraft.user.preq.MinecraftProfileRequester;
import cc.novoline.auth.minecraft.user.xb.auth.XboxLiveAuthenticator;
import cc.novoline.auth.minecraft.user.xb.xsts.XSTSAuthenticator;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.gui.alt.AltList;
import deobf.MCInvoker;
import deobf.TimerUtil;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;

import net.freeutils.httpserver.HTTPServer;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;

/*
 * Renamed from net.aKy
 */
public class aky_0 {
    private OAuthApplication c;
    private HTTPServer.VirtualHost d;
    private String b = ajr.S;
    private HTTPServer a;

    private void a(String string, String string2, NotificationType notificationType) {
        aci_0.a(NovolineInvoker.i(NovolineInvoker.getInstance()), new aUY(this, 50, ag3_0.TICK, string, string2, notificationType));
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private int lambda$startServer$0(ahw_1 ahw_12, String string, boolean bl, HTTPServer.Request request, HTTPServer.Response response) throws IOException {
        block7: {
            TimerUtil.e();
            if (MapInvoker.b(a5y_0.a(request), ajr.al)) {
                l4_0.a(ck_0.a(response), ajr.I, ajr.q);
                ck_0.a(response, 500, atw_0.a((String)MapInvoker.c(a5y_0.a(request), ajr.Y)));
                this.a();
                return 0;
            }
            if (!MapInvoker.b(a5y_0.a(request), ajr.X)) {
                l4_0.a(ck_0.a(response), ajr.ac, ajr.aj);
                ck_0.a(response, 400, ajr.B);
                this.a();
                return 0;
            }
            try {
                MicrosoftOAuthExchangeCode microsoftOAuthExchangeCode;
                MicrosoftOAuthCodeExchangerImpl microsoftOAuthCodeExchangerImpl;
                Account account = new Account();
                vk_1.a(account, (String)MapInvoker.c(a5y_0.a(request), ajr.ag));
                vk_1.b(account, ajr.f);
                if (UY.c(vk_1.a(account))) {
                    microsoftOAuthCodeExchangerImpl = new MicrosoftOAuthCodeExchangerImpl(ajr.i, ajr.aa);
                    microsoftOAuthExchangeCode = new MicrosoftOAuthExchangeCode((String)MapInvoker.c(a5y_0.a(request), ajr.a), new RedirectUrl(ajr.j));
                    this.a(ahw_12, (MicrosoftOAuthCodeExchanger)microsoftOAuthCodeExchangerImpl, microsoftOAuthExchangeCode, string, bl);
                }
                if (!ag5_0.a(vk_1.b(account))) break block7;
                microsoftOAuthCodeExchangerImpl = new MicrosoftOAuthRefreshCodeExchangerIMpl(ajr.W, ajr.z);
                microsoftOAuthExchangeCode = new MicrosoftOAuthExchangeCode(ag5_0.b(vk_1.b(account)), new RedirectUrl(ajr.u));
                this.a(ahw_12, (MicrosoftOAuthCodeExchanger)microsoftOAuthCodeExchangerImpl, microsoftOAuthExchangeCode, string, bl);
            }
            catch (Exception exception) {
                l4_0.a(ck_0.a(response), ajr.v, ajr.V);
                ck_0.a(response, 500, aL0.a(aL0.a(new StringBuilder(), ajr.ad), exception).toString());
                ch_2.a(exception);
                this.a();
                return 0;
            }
        }
        l4_0.a(ck_0.a(response), ajr.c, ajr.F);
        ck_0.a(response, 200, aL0.a(aL0.a(aL0.a(new StringBuilder(), ajr.g), (String)MapInvoker.c(a5y_0.a(request), ajr.ai)), ajr.L).toString());
        this.a();
        return 0;
    }

    public void a(ahw_1 ahw_12, String string, boolean bl) {
        EP.a(this.d, ajr.C, (arg_0, arg_1) -> this.lambda$startServer$0(ahw_12, string, bl, arg_0, arg_1), new String[]{ajr.ah});
        try {
            al__0.b(this.a);
        }
        catch (IOException iOException) {
            a4E.b(iOException);
        }
    }

    public void a(String string) {
        ArrayList arrayList = new ArrayList();
        Object object = StringInvoker.g(string, ajr.E);
        int n = ((String[])object).length;
        TimerUtil.e();
        int n2 = 0;
        if (n2 < n) {
            String string2 = object[n2];
            String[] stringArray = StringInvoker.g(string2, ajr.w);
            ListInvoker.add(arrayList, aL0.a(aL0.a(aL0.a(new StringBuilder(), stringArray[5]), ajr.s), stringArray[6]).toString());
            ++n2;
        }
        object = new StringBuilder();
        Iterator iterator = ListInvoker.iterator(arrayList);
        if (dz_0.c(iterator)) {
            String string3 = (String)dz_0.b(iterator);
            aL0.a(aL0.a((StringBuilder)object, string3), ajr.r);
        }
        object = new StringBuilder(StringInvoker.b(StringInvoker.h(((StringBuilder)object).toString()), 0, aL0.a((StringBuilder)object) - 2));
        iterator = CE.c();
        HttpGet httpGet = new HttpGet(ajr.U);
        Y2.a(httpGet, ajr.ab, ajr.ae);
        Y2.a(httpGet, ajr.am, ajr.o);
        Y2.a(httpGet, ajr.af, ajr.b);
        Y2.a(httpGet, ajr.e, ajr.N);
        Y2.a(httpGet, ajr.K, ajr.A);
        Y2.a(httpGet, ajr.y, ((StringBuilder)object).toString());
        Y2.a(httpGet, ajr.J, ajr.ak);
        Y2.a(httpGet, ajr.k, ajr.x);
        Y2.a(httpGet, ajr.D, ajr.H);
        Y2.a(httpGet, ajr.l, ajr.T);
        Y2.a(httpGet, ajr.P, ajr.R);
        Y2.a(httpGet, ajr.Z, ajr.M);
        Y2.a(httpGet, ajr.G, ajr.d);
        Y2.a(httpGet, ajr.t, ajr.n);
        try {
            aXI.a((CloseableHttpClient)iterator, (HttpUriRequest)httpGet);
        }
        catch (IOException iOException) {
            a4E.b(iOException);
        }
    }

    private void a() {
        al__0.a(this.a);
    }

    private void a(ahw_1 ahw_12, MicrosoftOAuthCodeExchanger microsoftOAuthCodeExchanger, MicrosoftOAuthExchangeCode microsoftOAuthExchangeCode, String string, boolean bl) throws IOException, MinecraftAuthenticationException, UnsupportedFlavorException {
        TimerUtil.e();
        XboxLiveAuthenticator xboxLiveAuthenticator = new XboxLiveAuthenticator(this.c);
        MinecraftOAuthAuthenticate minecraftOAuthAuthenticate = new MinecraftOAuthAuthenticate(microsoftOAuthCodeExchanger, xboxLiveAuthenticator, new XSTSAuthenticator(), new MinecraftServicesAuthenticator(), new GameOwnershipValidator(), new MinecraftProfileRequester(), new MinecraftProfileConverter());
        MinecraftUser minecraftUser = CW.a(minecraftOAuthAuthenticate, microsoftOAuthExchangeCode);
        aV9 aV92 = tq_0.a(tq_0.f(tq_0.b(tq_0.e(new aV9((AltList)amx_1.c((ahv_2)a8D.c(ahw_12))), a5q_0.b(minecraftUser)), a5q_0.b(minecraftUser)), string), a3L.COOKIE);
        axz_1.a(a8D.a(ahw_12), tq_0.c(aV92));
        aV92 = tq_0.a(aV92, StringInvoker.a(a5q_0.a(minecraftUser).toString(), (CharSequence)ajr.an, (CharSequence)ajr.h));
        a8D.a(ahw_12, aV92);
        MCInvoker.f().session = new Session(a5q_0.b(minecraftUser), a5q_0.a(minecraftUser).toString(), xp_1.a(a5q_0.c(minecraftUser)), a5q_0.d(minecraftUser));
        this.a(ajr.m, aL0.a(aL0.a(new StringBuilder(), ajr.O), a5q_0.b(minecraftUser)).toString(), NotificationType.INFO);
    }

    public void b() {
        try {
            m3_0.a(m3_0.a(), new URI(ajr.p));
        }
        catch (IOException | URISyntaxException exception) {
            ch_2.a(exception);
        }
    }

    public void b(ahw_1 ahw_12, String string, boolean bl) {
        nl_0 nl_02 = new nl_0(string);
        ae_.a(nl_02, ajr.Q);
        this.a(ahw_12, string, bl);
    }

    public aky_0() {
        this.c = OAuthApplication.NOVOLINE_APP_PARAMETERS;
        this.a = new HTTPServer(28562);
        this.d = al__0.a(this.a, null);
    }
}


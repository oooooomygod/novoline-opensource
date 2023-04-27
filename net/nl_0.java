/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javafx.beans.value.ObservableValue
 *  javafx.embed.swing.JFXPanel
 *  javafx.scene.Parent
 *  javafx.scene.Scene
 *  javafx.scene.web.WebView
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.TimerUtil;
import java.awt.Container;
import java.io.IOException;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javafx.beans.value.ObservableValue;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javax.swing.JFrame;
import net.K2;
import net.a4E;
import net.aL0;
import net.afb_1;
import net.aid_0;
import net.aki_0;
import net.ame_0;
import net.avs_1;
import net.aw_1;
import net.axi_1;
import net.cb_1;
import net.ch_2;
import net.ke_2;

/*
 * Renamed from net.Nl
 */
public class nl_0
extends JFrame {
    private String b;
    private CompletableFuture<String> a;

    private void lambda$start$0(String string) {
        try {
            this.b(string);
        }
        catch (IOException iOException) {
            a4E.b(iOException);
        }
    }

    protected void b(String string) throws IOException {
        WebView webView = new WebView();
        JFXPanel jFXPanel = (JFXPanel)this.getContentPane();
        aw_1.a(jFXPanel, new Scene((Parent)webView, (double)this.getWidth(), (double)this.getHeight()));
        cb_1.a(new CookieManager(null, CookiePolicy.ACCEPT_ALL));
        ke_2.a(aid_0.a(axi_1.a(webView)), this::lambda$init$1);
        aid_0.b(axi_1.a(webView), aki_0.b);
        URI uRI = ame_0.a(string);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            this.a();
        }
        catch (Exception exception) {
            ch_2.a(exception);
        }
        MapInvoker.c(linkedHashMap, aki_0.a, this.a());
        cb_1.a(cb_1.a(), uRI, linkedHashMap);
        aid_0.a(axi_1.a(webView), string);
        this.setVisible(true);
    }

    private void lambda$init$1(ObservableValue observableValue, String string, String string2) {
        TimerUtil.e();
        if (StringInvoker.a(string2, (CharSequence)aki_0.d)) {
            this.setVisible(false);
            avs_1.a(this.a, string2);
        }
    }

    public List<String> a() {
        TimerUtil.e();
        ArrayList<String> arrayList = new ArrayList<String>();
        if (this.b == null || !StringInvoker.a(this.b, (CharSequence)aki_0.e)) {
            return arrayList;
        }
        int n = 0;
        String[] stringArray = StringInvoker.g(this.b, aki_0.f);
        int n2 = stringArray.length;
        if (n < n2) {
            String string = stringArray[n];
            String[] stringArray2 = StringInvoker.g(string, aki_0.g);
            ListInvoker.add(arrayList, aL0.a(aL0.a(aL0.a(new StringBuilder(), stringArray2[5]), aki_0.c), stringArray2[6]).toString());
            ++n;
        }
        return arrayList;
    }

    public nl_0(String string) {
        this.b = string;
        this.setTitle(aki_0.h);
        this.setSize(750, 750);
        this.setLocationRelativeTo(null);
        this.setContentPane((Container)new JFXPanel());
    }

    public CompletableFuture<String> a(String string) {
        TimerUtil.e();
        if (this.a != null) {
            return this.a;
        }
        this.a = new CompletableFuture();
        this.addWindowListener(new K2(this));
        afb_1.a(() -> this.lambda$start$0(string));
        return this.a;
    }
}


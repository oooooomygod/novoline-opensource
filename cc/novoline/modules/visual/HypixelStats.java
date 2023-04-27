/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.http.HttpResponse
 *  org.apache.http.client.methods.CloseableHttpResponse
 *  org.apache.http.client.methods.HttpGet
 *  org.apache.http.client.methods.HttpUriRequest
 *  org.apache.http.impl.client.CloseableHttpClient
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.json.JSONObject
 *  org.lwjgl.opengl.GL11
 */
package cc.novoline.modules.visual;

import cc.novoline.events.EventTarget;
import cc.novoline.events.State;
import cc.novoline.events.events.LoadWorldEvent;
import cc.novoline.events.events.PacketEvent;
import cc.novoline.events.events.Render2DEvent;
import cc.novoline.events.events.RenderGuiEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.IOUtilsInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.PacketEventInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.*;
import net.minecraft.network.packts.S00PacketKeepAlive;
import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import net.CE;
import net.GW;
import net.HN;
import net.MathHelper;
import net.ModuleManager;
import net.NetworkPlayerInfo;
import net.P8;
import net.GuiChat;
import net.V9;
import net.Y2;
import net.a1V;
import net.a1c;
import net.a4E;
import net.a4Z;
import net.a9E;
import net.aCM;
import net.aDM;
import net.aFW;
import net.aL0;
import net.aLB;
import net.aMF;
import net.aNL;
import net.aN_;
import net.aV3;
import net.aXI;
import net.aY2;
import net.aZR;
import net.abb_2;
import net.adp_0;
import net.adt_2;
import net.afq_0;
import net.aj7;
import net.alw_0;
import net.anv_0;
import net.aod_2;
import net.asp_2;
import net.asx_1;
import net.avs_1;
import net.cw_2;
import net.db_0;
import net.dz_0;
import net.hb_2;
import net.ms_0;
import net.oc_1;
import net.pR;
import net.qh_1;
import net.ua_2;
import net.wh_1;
import net.z4_0;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.json.JSONObject;
import org.lwjgl.opengl.GL11;

public class HypixelStats
extends AbstractModule {
    private static String[] eb;
    private Dimension O;
    private String R;
    private double J;
    private List<String> N;
    private TimerUtil P;
    private String V;
    @Property(value="y-position")
    private IntProperty aa;
    private double Z;
    private String af;
    private static long bb;
    private int[] T;
    @Property(value="x-position")
    private IntProperty Q;
    private int ad;
    private String ae;
    private int ag;
    private boolean U;
    private static String[] cb;
    private int ac;
    private List<aY2> Y;
    @Property(value="alpha")
    private IntProperty ab;
    private static Map ib;
    private String W;
    private String H;
    private String K;
    private int S;
    private String L;
    private String ai;
    private String ah;
    private String X;
    private String M;
    @Property(value="smoothness")
    private IntProperty I;

    private void lambda$onPacket$1(JSONObject jSONObject, Throwable throwable) {
        JSONObject jSONObject2;
        HUD.t();
        if (aZR.b(jSONObject, this.L) && !aZR.c(jSONObject, this.X) && !aZR.c(jSONObject2 = aZR.g(jSONObject, this.X), this.V)) {
            JSONObject jSONObject3 = aZR.g(jSONObject2, this.V);
            String string = this.a() ? this.af : (aCM.a(abb_2.SG) ? this.ae : this.W);
            String string2 = aZR.d(jSONObject2, this.ah);
            int n = 0;
            int n2 = 0;
            int n3 = 0;
            int n4 = 0;
            int n5 = 1;
            if (!aZR.c(jSONObject3, string)) {
                JSONObject jSONObject4 = aZR.g(jSONObject3, string);
                n = aZR.c(jSONObject4, this.M) ? 0 : aZR.f(jSONObject4, this.M);
                n2 = aZR.c(jSONObject4, this.R) ? 0 : aZR.f(jSONObject4, this.R);
                n3 = aZR.c(jSONObject4, this.H) ? 0 : aZR.f(jSONObject4, this.H);
                n4 = aZR.c(jSONObject4, this.K) ? 0 : aZR.f(jSONObject4, this.K);
                int n6 = aZR.c(jSONObject4, this.ai) ? 0 : aZR.f(jSONObject4, this.ai);
                n5 = n6 == 0 ? 1 : MathInvoker.b(this.a(n6), 15);
            }
            ListInvoker.add(this.Y, aY2.a(string2, n, n2, n3, n4, n5));
        }
    }

    @EventTarget
    public void a(RenderGuiEvent renderGuiEvent) {
        block5: {
            block7: {
                int n;
                int n2;
                int n3;
                int n4;
                block6: {
                    HUD.t();
                    if (!(HN.d(renderGuiEvent) instanceof GuiChat)) break block5;
                    n4 = ua_2.a(HN.b(renderGuiEvent));
                    n3 = ua_2.b(HN.a(renderGuiEvent));
                    n2 = P8.b((Integer)adt_2.a(this.Q));
                    n = P8.b((Integer)adt_2.a(this.aa));
                    if (HN.c(renderGuiEvent) != alw_0.CLICK) break block6;
                    if (!this.a(n4, n3) || HN.e(renderGuiEvent) != 0) break block5;
                    this.S = n2 - n4;
                    this.ag = n - n3;
                    this.U = true;
                }
                if (HN.c(renderGuiEvent) != alw_0.RENDER) break block7;
                if (this.U) {
                    adt_2.b(this.Q, P8.d(MathHelper.a(this.S + n4, P8.b((Integer)adt_2.b(this.Q)), P8.b((Integer)adt_2.c(this.Q)))));
                    adt_2.b(this.aa, P8.d(MathHelper.a(this.ag + n3, P8.b((Integer)adt_2.b(this.aa)), P8.b((Integer)adt_2.c(this.aa)))));
                }
                if (!this.a(n4, n3)) break block5;
                double d = ua_2.a(true);
                a1V.a((double)(n2 - 2), (double)(n - 22), (double)n2 + this.J + 4.0, (double)n + this.Z + 2.0, 2.5f, hb_2.a(asx_1.WHITE), hb_2.a(hb_2.a(asx_1.BLACK), 100));
                ua_2.a(d);
            }
            if (HN.c(renderGuiEvent) == alw_0.RELEASE) {
                this.U = false;
            }
        }
    }

    private static JSONObject lambda$doRequest$0(String string, String string2) {
        CloseableHttpClient closeableHttpClient = CE.c();
        HttpGet httpGet = new HttpGet(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aLB.i), string), aLB.b), string2).toString());
        Y2.a(httpGet, aLB.f, string);
        Y2.a(httpGet, aLB.n, aLB.h);
        CloseableHttpResponse closeableHttpResponse = null;
        try {
            closeableHttpResponse = aXI.a(closeableHttpClient, (HttpUriRequest)httpGet);
        }
        catch (IOException iOException) {
            a4E.b(iOException);
        }
        String string3 = null;
        try {
            string3 = IOUtilsInvoker.b(pR.a(V9.a((HttpResponse)closeableHttpResponse)), StandardCharsets.UTF_8);
        }
        catch (IOException iOException) {
            a4E.b(iOException);
        }
        return new JSONObject(string3);
    }

    private int lambda$longestPlayerNameWidth$3(aY2 aY22) {
        return this.a(aY2.d(aY22));
    }

    private void b(String string, double d, double d2) {
        HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        cw_2.a(hUD, 19, string, d, d2, 0xFFFFFF);
    }

    private boolean lambda$onRender$2(aY2 aY22) {
        return this.b(aY2.d(aY22));
    }

    private boolean a(int n, int n2) {
        HUD.t();
        return n >= P8.b((Integer)adt_2.a(this.Q)) - 2 && (double)n <= (double)P8.b((Integer)adt_2.a(this.Q)) + this.J + 4.0 && n2 >= P8.b((Integer)adt_2.a(this.aa)) - 22 && (double)n2 <= (double)P8.b((Integer)adt_2.a(this.aa)) + this.Z + 2.0;
    }

    private void a(String string, double d, double d2) {
        HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        cw_2.b(hUD, 19, string, d, d2, 0xFFFFFF);
    }

    private void a(aY2 aY22, double d, double d2, int n, int n2, boolean bl) {
        HUD.t();
        NetworkPlayerInfo networkPlayerInfo = aDM.a(MCInvoker.aa(this.mc), aY2.d(aY22));
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.mc), networkPlayerInfo == null ? afq_0.a : aNL.k(networkPlayerInfo));
        if (bl) {
            adp_0.b(false);
            a1V.c(d + (double)(n / 2), d2 + (double)(n2 / 2), n, hb_2.a(asx_1.BLACK));
            adp_0.a(true);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        }
        wh_1.a(d, d2, 8.0f, 8.0f, 8, 8, (double)n, (double)n2, 64.0f, 64.0f);
        if (bl) {
            adp_0.a();
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/aCW" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    public HypixelStats(@NonNull ModuleManager moduleManager, int n, EnumModuleType enumModuleType, String string, char c, String string2, short s) {
        long l4 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)s << 48 >>> 48) ^ bb;
        long l5 = l4 ^ 0x6AFFDB0996E3L;
        int n2 = (int)(l5 >>> 48);
        int n3 = (int)(l5 << 16 >>> 48);
        int n4 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n2, enumModuleType, string, (char)n3, n4, string2);
        this.O = aj7.a(aj7.a());
        this.ac = (int)(anv_0.a(this.O) / 2.0);
        this.ad = (int)(anv_0.b(this.O) / 2.0);
        this.I = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(8)), P8.d(0)), P8.d(16));
        this.Q = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(200)), P8.d(1)), P8.d(this.ac));
        this.aa = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(300)), P8.d(1)), P8.d(this.ad));
        this.ab = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(150)), P8.d(100)), P8.d(180));
        this.P = new TimerUtil();
        this.T = new int[]{10, 50, 150, 250, 500, 750, 1000, 2500, 5000};
        this.Y = new ArrayList<aY2>();
        this.N = new ArrayList<String>();
        this.L = HypixelStats.b("h", (int)32394, (long)(0xE6547B6638CBBF0L ^ l4));
        this.ah = HypixelStats.b("h", (int)3075, (long)(0x3D22AEC5AD024973L ^ l4));
        this.X = HypixelStats.b("h", (int)6370, (long)(0x5D6F1D75EF325D93L ^ l4));
        this.V = HypixelStats.b("h", (int)19959, (long)(0x12CD8EB011C4888AL ^ l4));
        this.af = HypixelStats.b("h", (int)20753, (long)(0x3B15E749A312946DL ^ l4));
        this.ae = HypixelStats.b("h", (int)25751, (long)(0x1D8FB4262D8521E2L ^ l4));
        this.W = HypixelStats.b("h", (int)31734, (long)(0x73FA87060DDE3E84L ^ l4));
        this.M = HypixelStats.b("h", (int)28457, (long)(0x6836209371FFAA5DL ^ l4));
        this.H = HypixelStats.b("h", (int)1977, (long)(0x6AB369D2ECAF42CEL ^ l4));
        this.R = HypixelStats.b("h", (int)26609, (long)(0x28D44C0F65E82289L ^ l4));
        this.K = HypixelStats.b("h", (int)22908, (long)(0x1D58ABAE30639C03L ^ l4));
        this.ai = HypixelStats.b("h", (int)435, (long)(0x44F92B143BCC4CDL ^ l4));
        ManagerInvoker.put(new Setting((String)((Object)HypixelStats.b("h", (int)269, (long)(0x7803EC077559C476L ^ l4))), (String)((Object)HypixelStats.b("h", (int)4908, (long)(0x507D29BFA1B8565AL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.ab, 5.0));
        ManagerInvoker.put(new Setting((String)((Object)HypixelStats.b("h", (int)19871, (long)(0x1EA3CCC6461888ECL ^ l4))), (String)((Object)HypixelStats.b("h", (int)14582, (long)(0x3185EB89812BFD8FL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.I, 1.0));
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x3CC;
        if (eb[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])ib.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                ib.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/aCW", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return eb[n2];
    }

    @EventTarget
    public void a(PacketEvent packetEvent) {
        NetworkPlayerInfo networkPlayerInfo;
        String string;
        Iterator iterator;
        ClickGui clickGui;
        String string2;
        HUD.t();
        if (PacketEventInvoker.getState(packetEvent) == State.INCOMING && PacketEventInvoker.c(packetEvent) instanceof S00PacketKeepAlive && !StringInvoker.g(string2 = z4_0.h(clickGui = (ClickGui)ModuleInvoker.isEnable(ModuleRegistry.CLICKGUI))) && dz_0.c(iterator = ListInvoker.iterator(a9E.a(GW.e(this.mc.ingameGUI)))) && this.c(string = aNL.a(networkPlayerInfo = (NetworkPlayerInfo)dz_0.b(iterator)).getName()) && !ListInvoker.contains(this.N, string) && qh_1.c(this.P, 50L)) {
            CompletableFuture<JSONObject> completableFuture = this.a(string2, a4Z.a(aNL.a(networkPlayerInfo)).toString());
            avs_1.b(completableFuture, this::lambda$onPacket$1);
            ListInvoker.add(this.N, string);
            qh_1.b(this.P);
        }
    }

    private CompletableFuture<JSONObject> a(String string, String string2) {
        return avs_1.a(() -> HypixelStats.lambda$doRequest$0(string, string2), (Executor)aFW.a());
    }

    private boolean a() {
        HUD.t();
        return aCM.a(abb_2.UHC) || GW.d(this.mc.ingameGUI) != null && StringInvoker.a(aod_2.c(GW.d(this.mc.ingameGUI).e()), (CharSequence)aLB.m);
    }

    private int a(int n) {
        int n2 = 1;
        int[] nArray = this.T;
        HUD.t();
        int n3 = nArray.length;
        int n4 = 0;
        if (n4 < n3) {
            int n5 = nArray[n4];
            if (n < n5) {
                // empty if block
            }
            n -= n5;
            ++n2;
            ++n4;
        }
        return n2 + n / 3000;
    }

    private static String b(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    @EventTarget
    public void a(LoadWorldEvent loadWorldEvent) {
        ListInvoker.clear(this.Y);
        ListInvoker.clear(this.N);
    }

    private int a(String string) {
        HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        return cw_2.a(hUD, 19, string);
    }

    static {
        bb = a1c.a(7504590699801502940L, -8204579907928672480L, MethodHandles.lookup().lookupClass()).a(128428508194817L);
        ib = new HashMap(13);
        long l4 = bb ^ 0xBDDFB8497A8L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        int n = 2;
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l4 >>> 56);
        int n2 = 1;
        while (true) {
            byArray2 = byArray2;
            byArray2[n2] = (byte)(l4 << n2 * 8 >>> 56);
            ++n2;
        }
    }

    private int d() {
        HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        return cw_2.a(hUD, 19);
    }

    private int b() {
        HUD.t();
        return ListInvoker.isEmpty(this.Y) ? this.a(aLB.p) + 4 : this.a(aY2.d((aY2)oc_1.b(aMF.c(ListInvoker.stream(this.Y), aN_.a(this::lambda$longestPlayerNameWidth$3)))));
    }

    @EventTarget
    public void a(Render2DEvent render2DEvent) {
        Iterator iterator;
        HUD.j();
        double d = ua_2.a(true);
        int n = P8.b((Integer)adt_2.a(this.Q));
        int n2 = P8.b((Integer)adt_2.a(this.aa));
        this.J = this.b() + (this.a() ? 125 : 80);
        aV3.a(aV3.a(), (double)(n - 2), (double)(n2 - 22), this.J + 4.0, 20.0 - 0.625 * (double)P8.b((Integer)adt_2.a(this.I)), 0.0, (double)P8.b((Integer)adt_2.a(this.I)), new Color(0, 0, 0, P8.b((Integer)adt_2.a(this.ab)) + 30), true);
        String string = aLB.r;
        this.a(string, (double)(n + 4), (double)n2 - 16.5 - 0.25 * (double)P8.b((Integer)adt_2.a(this.I)));
        String string2 = aLB.j;
        this.b(string2, n + this.b() + 35, (double)n2 - 16.5 - 0.25 * (double)P8.b((Integer)adt_2.a(this.I)));
        String string3 = aLB.u;
        this.b(string3, n + this.b() + 68, (double)n2 - 16.5 - 0.25 * (double)P8.b((Integer)adt_2.a(this.I)));
        if (this.a()) {
            String string4 = aLB.o;
            this.b(string4, n + this.b() + 106, (double)n2 - 16.5 - 0.25 * (double)P8.b((Integer)adt_2.a(this.I)));
        }
        this.Z = ListInvoker.isEmpty(this.Y) ? 20.0 : (double)this.d() * 1.25 * (double)ListInvoker.size(this.Y);
        aV3.a(aV3.a(), (double)(n - 2), (double)(n2 - 2), this.J + 4.0, this.Z + 2.0, 0.0, (double)P8.b((Integer)adt_2.a(this.I)), new Color(0, 0, 0, P8.b((Integer)adt_2.a(this.ab))), true);
        double d2 = n2;
        if (ListInvoker.isEmpty(this.Y)) {
            this.b(aLB.d, (double)n + this.J / 2.0, (double)n2 + this.Z / 2.0 - 6.0);
        }
        if (dz_0.c(iterator = ListInvoker.iterator(this.Y))) {
            aY2 aY22 = (aY2)dz_0.b(iterator);
            this.a(aY2.d(aY22), (double)(n + 11), d2);
            double d3 = aY2.a(aY22) / (double)MathInvoker.max(1, aY2.e(aY22));
            this.a(StringInvoker.a(StringInvoker.a(d3 > 9.0 ? aLB.q : aLB.c, new Object[]{db_0.a(d3)}), (CharSequence)aLB.e, (CharSequence)aLB.s), (double)(n + this.b() + 25), d2);
            double d4 = aY2.f(aY22) / (double)MathInvoker.max(1, aY2.b(aY22));
            this.a(StringInvoker.a(StringInvoker.a(d4 > 9.0 ? aLB.g : aLB.k, new Object[]{db_0.a(d4)}), (CharSequence)aLB.l, (CharSequence)aLB.a), (double)(n + this.b() + 58), d2);
            if (this.a()) {
                this.b(StringInvoker.a(aY2.c(aY22)), n + this.b() + 106, d2);
            }
            this.a(aY22, (double)n + 0.5, d2 - 0.5, 8, 8, false);
            d2 += (double)this.d() * 1.25;
        }
        if (this.mc.player.ticksExisted > 20 && (aCM.a(abb_2.LOBBY) || aCM.c() > 20)) {
            ListInvoker.removeIf(this.Y, this::lambda$onRender$2);
        }
        ua_2.a(d);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = HypixelStats.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private boolean b(String string) {
        NetworkPlayerInfo networkPlayerInfo;
        HUD.j();
        Iterator iterator = ms_0.a(aDM.b(MCInvoker.aa(this.mc)));
        return !dz_0.c(iterator) || !aNL.a(networkPlayerInfo = (NetworkPlayerInfo)dz_0.b(iterator)).getName().equals(string);
    }

    private boolean c(String string) {
        aY2 aY22;
        HUD.t();
        Iterator iterator = ListInvoker.iterator(this.Y);
        return !dz_0.c(iterator) || !aY2.d(aY22 = (aY2)dz_0.b(iterator)).equals(string);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(HypixelStats.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


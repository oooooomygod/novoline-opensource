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
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package cc.novoline.modules.misc;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.LoadWorldEvent;
import cc.novoline.events.events.PlayerUpdateEvent;
import cc.novoline.events.events.RenderGuiEvent;
import cc.novoline.events.events.TickUpdateEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.IOUtilsInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.NotificationManagerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.modules.AbstractModule;
import net.minecraft.init.Blocks;
import cc.novoline.modules.visual.ClickGui;
import cc.novoline.modules.EnumModuleType;
import net.minecraft.item.ItemStack;
import deobf.ModuleRegistry;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import deobf.TimerUtil;
import java.awt.Color;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.Minecraft;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.json.JSONArray;
import org.json.JSONObject;

public class UhcCrafts
extends AbstractModule {
    private static String[] W;
    private String H;
    private List<IZ> K;
    private String N;
    private String S;
    private we_0 J;
    private String R;
    private static String I;
    @Property(value="stop-moving")
    private BooleanProperty U;
    private o0_0 L;
    private boolean Q;
    private boolean O;
    private String T;
    private static long V;
    private static Map Y;
    private TimerUtil P;
    private TimerUtil M;
    private static String[] X;

    static Minecraft g(UhcCrafts uhcCrafts) {
        return uhcCrafts.mc;
    }

    static Minecraft o(UhcCrafts uhcCrafts) {
        return uhcCrafts.mc;
    }

    static Minecraft r(UhcCrafts uhcCrafts) {
        return uhcCrafts.mc;
    }

    static Minecraft b(UhcCrafts uhcCrafts) {
        return uhcCrafts.mc;
    }

    static Minecraft d(UhcCrafts uhcCrafts) {
        return uhcCrafts.mc;
    }

    static void d(UhcCrafts uhcCrafts, String string, String string2, int n, NotificationType notificationType) {
        uhcCrafts.a(string, string2, n, notificationType);
    }

    public UhcCrafts(@NonNull ModuleManager moduleManager, EnumModuleType enumModuleType, String string, char c, char c2, String string2, int n) {
        long l4 = ((long)c << 48 | (long)c2 << 48 >>> 16 | (long)n << 32 >>> 32) ^ V;
        long l5 = l4 ^ 0x1BD5189B48F1L;
        int n2 = (int)(l5 >>> 48);
        int n3 = (int)(l5 << 16 >>> 48);
        int n4 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n2, enumModuleType, string, (char)n3, n4, string2);
        this.K = new ArrayList<IZ>();
        this.L = new o0_0(this, this);
        this.M = new TimerUtil();
        this.P = new TimerUtil();
        this.J = new we_0(this.mc);
        this.T = UhcCrafts.b("e", (int)6634, (long)(0x65A7CCBF461B4C0CL ^ l4));
        this.R = UhcCrafts.b("e", (int)2332, (long)(0x2139C6402B445CFCL ^ l4));
        this.S = UhcCrafts.b("e", (int)20096, (long)(0x3DD0DD4366151B6BL ^ l4));
        this.H = UhcCrafts.b("e", (int)10661, (long)(0x4816FD7DC461FC40L ^ l4));
        this.N = UhcCrafts.b("e", (int)13213, (long)(0x3B089265F2CB667EL ^ l4));
        this.U = asp_2.d();
        ManagerInvoker.put(new Setting((String)((Object)UhcCrafts.b("e", (int)32497, (long)(0x6CC43A59E250AB13L ^ l4))), (String)((Object)UhcCrafts.b("e", (int)18959, (long)(0x2120C52180291FE8L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.U));
        ManagerInvoker.put(new Setting((String)((Object)UhcCrafts.b("e", (int)14462, (long)(0x49D24D1C2B016D9FL ^ l4))), (String)((Object)UhcCrafts.b("e", (int)21921, (long)(0x2DD339F002B60045L ^ l4))), SettingType.BUTTON, (AbstractModule)this, this::lambda$new$0));
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = UhcCrafts.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private IZ lambda$refillCrafts$3(ajn_0 ajn_02) {
        return new IZ(this, this, ajn_02);
    }

    static Minecraft q(UhcCrafts uhcCrafts) {
        return uhcCrafts.mc;
    }

    static void c(UhcCrafts uhcCrafts, String string, String string2, int n, NotificationType notificationType) {
        uhcCrafts.a(string, string2, n, notificationType);
    }

    @EventTarget
    public void a(PlayerUpdateEvent playerUpdateEvent) {
        UhcCrafts.d();
        if (this.O && qh_1.c(this.M, 1200L)) {
            ClickGui clickGui = (ClickGui)ModuleInvoker.isEnable(ModuleRegistry.CLICKGUI);
            String string = z4_0.h(clickGui);
            CompletableFuture<JSONObject> completableFuture = this.a(string);
            avs_1.b(completableFuture, this::lambda$onUpdate$2);
            qh_1.b(this.M);
        }
    }

    public static String d() {
        return I;
    }

    private void lambda$onUpdate$2(JSONObject jSONObject, Throwable throwable) {
        JSONArray jSONArray;
        Iterator iterator;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        UhcCrafts.d();
        if (aZR.b(jSONObject, this.R) && !aZR.c(jSONObject, this.S) && !aZR.c(jSONObject4 = aZR.g(jSONObject, this.S), this.H) && !aZR.c(jSONObject3 = aZR.g(jSONObject4, this.H), this.N) && !aZR.c(jSONObject2 = aZR.g(jSONObject3, this.N), this.T) && dz_0.c(iterator = CS.a(jSONArray = aZR.a(jSONObject2, this.T)))) {
            ajn_0 ajn_02;
            Iterator iterator2;
            Object object = dz_0.b(iterator);
            String string = (String)object;
            if ((string = StringInvoker.a(string, (CharSequence)Wo.a, (CharSequence)Wo.j)).equals(Wo.aO)) {
                string = Wo.aE;
            }
            if (string.equals(Wo.aw)) {
                string = Wo.ac;
            }
            if (string.equals(Wo.aJ)) {
                string = Wo.z;
            }
            if (string.equals(Wo.M)) {
                string = Wo.U;
            }
            if (string.equals(Wo.L)) {
                string = Wo.az;
            }
            if (string.equals(Wo.aF)) {
                string = Wo.ah;
            }
            if (string.equals(Wo.a0)) {
                string = Wo.aT;
            }
            if (string.equals(Wo.o)) {
                string = Wo.ao;
            }
            if (string.equals(Wo.h)) {
                string = Wo.aa;
            }
            if (string.equals(Wo.v)) {
                string = Wo.s;
            }
            if (string.equals(Wo.aL)) {
                string = Wo.n;
            }
            if (string.equals(Wo.E)) {
                string = Wo.ak;
            }
            if (string.equals(Wo.aM)) {
                string = Wo.k;
            }
            if (string.equals(Wo.as)) {
                string = Wo.aH;
            }
            if (string.equals(Wo.u)) {
                string = Wo.ax;
            }
            if (string.equals(Wo.l)) {
                string = Wo.F;
            }
            if (string.equals(Wo.ae)) {
                string = Wo.aI;
            }
            if (string.equals(Wo.H)) {
                string = Wo.aY;
            }
            if (string.equals(Wo.au)) {
                string = Wo.N;
            }
            if (string.equals(Wo.X)) {
                string = Wo.p;
            }
            if (string.equals(Wo.V)) {
                string = Wo.G;
            }
            if (string.equals(Wo.T)) {
                string = Wo.ai;
            }
            if (string.equals(Wo.ay)) {
                string = Wo.d;
            }
            if (string.equals(Wo.aU)) {
                string = Wo.q;
            }
            if (string.equals(Wo.aW)) {
                string = Wo.aD;
            }
            if (string.equals(Wo.y)) {
                string = Wo.D;
            }
            if (string.equals(Wo.ad)) {
                string = Wo.aQ;
            }
            if (string.equals(Wo.aK)) {
                string = Wo.x;
            }
            if (string.equals(Wo.am)) {
                string = Wo.aN;
            }
            if (string.equals(Wo.an)) {
                string = Wo.av;
            }
            if (string.equals(Wo.af)) {
                string = Wo.r;
            }
            if (string.equals(Wo.aB)) {
                string = Wo.R;
            }
            if (string.equals(Wo.aG)) {
                string = Wo.al;
            }
            if (StringInvoker.a(string, (CharSequence)Wo.ag)) {
                if (StringInvoker.a(string, (CharSequence)Wo.A)) {
                    aUT.a(V0.a(this.J, Wo.aS), true);
                }
                if (StringInvoker.a(string, (CharSequence)Wo.c)) {
                    aUT.a(V0.a(this.J, Wo.at), true);
                }
                if (StringInvoker.a(string, (CharSequence)Wo.ap)) {
                    aUT.a(V0.a(this.J, Wo.i), true);
                }
                if (StringInvoker.a(string, (CharSequence)Wo.aV)) {
                    aUT.a(V0.a(this.J, Wo.ab), true);
                }
                if (StringInvoker.a(string, (CharSequence)Wo.b)) {
                    aUT.a(V0.a(this.J, Wo.g), true);
                }
                if (StringInvoker.a(string, (CharSequence)Wo.ar)) {
                    aUT.a(V0.a(this.J, Wo.C), true);
                }
                if (StringInvoker.a(string, (CharSequence)Wo.S)) {
                    aUT.a(V0.a(this.J, Wo.I), true);
                }
                if (StringInvoker.a(string, (CharSequence)Wo.J)) {
                    aUT.a(V0.a(this.J, Wo.aj), true);
                }
                if (StringInvoker.a(string, (CharSequence)Wo.P)) {
                    aUT.a(V0.a(this.J, Wo.Y), true);
                }
                if (StringInvoker.a(string, (CharSequence)Wo.K)) {
                    aUT.a(V0.a(this.J, Wo.O), true);
                }
            }
            if (dz_0.c(iterator2 = ListInvoker.iterator(V0.b(this.J))) && StringInvoker.i((ajn_02 = (ajn_0)dz_0.b(iterator2)).c()).equals(string) && !a0k.f(ajn_02)) {
                a0k.a(ajn_02, true);
            }
            this.O = false;
            qh_1.b(this.P);
            this.Q = true;
        }
    }

    public List<IZ> c() {
        return this.K;
    }

    static {
        V = a1c.a(1011887381167922469L, 8557459409432352111L, MethodHandles.lookup().lookupClass()).a(13889812010101L);
        Y = new HashMap(13);
        long l4 = V ^ 0x2D8E2DCE2247L;
        UhcCrafts.e("ZuLKKb");
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

    static Minecraft i(UhcCrafts uhcCrafts) {
        return uhcCrafts.mc;
    }

    static Minecraft h(UhcCrafts uhcCrafts) {
        return uhcCrafts.mc;
    }

    @EventTarget
    public void a(RenderGuiEvent renderGuiEvent) {
        block21: {
            block30: {
                Object object;
                float f;
                float f2;
                GuiCrafting guiCrafting;
                block22: {
                    IZ iZ;
                    Iterator iterator;
                    block23: {
                        float f3;
                        float f4;
                        block24: {
                            ItemStack itemStack;
                            Item item;
                            int n;
                            double d;
                            int n2;
                            block26: {
                                String string;
                                block29: {
                                    block28: {
                                        block27: {
                                            block25: {
                                                UhcCrafts.d();
                                                if (!(HN.d(renderGuiEvent) instanceof GuiCrafting)) break block21;
                                                guiCrafting = (GuiCrafting)HN.d(renderGuiEvent);
                                                int n3 = (guiCrafting.n - guiCrafting.L) / 2;
                                                n2 = (guiCrafting.f - guiCrafting.Y) / 2;
                                                float f5 = 145.0f;
                                                f2 = guiCrafting.Y - 3;
                                                float f6 = 7.0f;
                                                f4 = (float)n3 - f6 - f5;
                                                f = n2 + 1;
                                                if (HN.c(renderGuiEvent) != alw_0.RENDER) break block22;
                                                if (ListInvoker.isEmpty(this.K)) {
                                                    this.b();
                                                    return;
                                                }
                                                a1V.a(f4, f, f4 + f5, f + f2, aol_1.b(new Color(23, 23, 23)));
                                                object = new double[]{f4, f, f4 + f5, f + f2 - 1.0f};
                                                IR.a(this.L, f4 + f5 - 7.5f, f + 5.0f);
                                                IR.a(this.L, HN.b(renderGuiEvent), HN.a(renderGuiEvent), f2 - 10.0f, (double[])object);
                                                IR.a(this.L, true);
                                                f3 = f + 3.5f;
                                                iterator = ListInvoker.iterator(this.K);
                                                if (!dz_0.c(iterator)) break block23;
                                                iZ = (IZ)dz_0.b(iterator);
                                                if (!aFT.b(iZ, HN.b(renderGuiEvent), HN.a(renderGuiEvent)) || !((float)HN.a(renderGuiEvent) > f) || !((float)HN.a(renderGuiEvent) < f + f2)) break block24;
                                                d = n3;
                                                n = 0;
                                                item = a0k.c(IZ.a(iZ))[n];
                                                itemStack = item == null ? null : aFT.a(iZ, item);
                                                string = IZ.a(iZ).c();
                                                if (!string.equals(Wo.aP)) break block25;
                                                if (item != px_0.a(Blocks.am)) break block26;
                                                act_2.a(itemStack, 1);
                                            }
                                            if (!string.equals(Wo.aX) && !string.equals(Wo.t)) break block27;
                                            if (item != Items.dye) break block26;
                                            act_2.a(itemStack, 15);
                                        }
                                        if (!string.equals(Wo.aq)) break block28;
                                        if (item != Items.dye) break block26;
                                        act_2.a(itemStack, 3);
                                    }
                                    if (!string.equals(Wo.Q)) break block29;
                                    if (item != px_0.a(Blocks.sapling)) break block26;
                                    act_2.a(itemStack, 0);
                                }
                                if (string.equals(Wo.f)) {
                                    if (item == px_0.a(Blocks.b_)) {
                                        // empty if block
                                    }
                                } else if (string.equals(Wo.aA)) {
                                    if (item == Items.skull) {
                                        act_2.a(itemStack, 3);
                                    }
                                    if (item == Items.dye) {
                                        act_2.a(itemStack, 0);
                                    }
                                }
                            }
                            int n4 = 255;
                            int n5 = 0;
                            int n6 = 0;
                            List list = a7r_0.a(a0k.c(IZ.a(iZ)));
                            if (n6 < ListInvoker.size(list)) {
                                Item item2 = (Item)ListInvoker.get(list, n6);
                                if (item2 == item) {
                                    int n7 = PlayerInvoker.b(this.mc.player, item2);
                                    if (n5 > n7 - 1) {
                                        n4 = 50;
                                    }
                                    ++n5;
                                }
                                ++n6;
                            }
                            a1V.a(itemStack, d + 30.0 - 0.0, (double)n2 + 17.5 * 1.0, n4);
                            d += 18.0;
                            ++n;
                        }
                        aFT.a(iZ, f4 + 3.0f, f3 - IR.a(this.L));
                        if ((aFT.a(iZ) > f || aFT.a(iZ) + 22.0f > f) && aFT.a(iZ) < f + f2) {
                            aFT.a(iZ, (double[])object);
                        }
                        f3 += 22.0f + 4.0f;
                    }
                    adp_0.b(false);
                    a1V.a((double)object[0], (double)object[1], (double)object[2], (double)object[3], aol_1.b(new Color(255, 255, 255)));
                    adp_0.a(true);
                    iterator = ListInvoker.iterator(this.K);
                    if (dz_0.c(iterator)) {
                        iZ = (IZ)dz_0.b(iterator);
                        aFT.a(iZ, HN.b(renderGuiEvent), HN.a(renderGuiEvent));
                    }
                    adp_0.a();
                }
                if (HN.c(renderGuiEvent) != alw_0.CLICK) break block30;
                IR.a(this.L, HN.b(renderGuiEvent), HN.a(renderGuiEvent), HN.e(renderGuiEvent), guiCrafting.Y - 3);
                if (!((float)HN.a(renderGuiEvent) > f) || !((float)HN.a(renderGuiEvent) < f + f2)) break block21;
                object = ListInvoker.iterator(this.K);
                if (dz_0.c((Iterator)object)) {
                    IZ iZ = (IZ)dz_0.b((Iterator)object);
                    aFT.a(iZ, HN.b(renderGuiEvent), HN.a(renderGuiEvent), HN.e(renderGuiEvent));
                }
            }
            if (HN.c(renderGuiEvent) == alw_0.RELEASE) {
                IR.b(this.L);
            }
        }
    }

    private void lambda$new$0(String string) {
        NotificationManagerInvoker.a(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), this.r(), Wo.w, 2000, NotificationType.WARNING);
        this.J = new we_0(this.mc);
        qh_1.b(this.M);
        this.O = true;
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x4D43;
        if (X[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])Y.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                Y.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_R", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return X[n2];
    }

    static Minecraft s(UhcCrafts uhcCrafts) {
        return uhcCrafts.mc;
    }

    static Minecraft n(UhcCrafts uhcCrafts) {
        return uhcCrafts.mc;
    }

    static Minecraft f(UhcCrafts uhcCrafts) {
        return uhcCrafts.mc;
    }

    private CompletableFuture<JSONObject> a(String string) {
        return avs_1.a(() -> this.lambda$doRequest$1(string), (Executor)aFW.a());
    }

    private JSONObject lambda$doRequest$1(String string) {
        CloseableHttpClient closeableHttpClient = CE.c();
        HttpGet httpGet = new HttpGet(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), Wo.aC), string), Wo.aR), a4Z.a(PlayerInvoker.f(this.mc.player)).toString()).toString());
        Y2.a(httpGet, Wo.B, string);
        Y2.a(httpGet, Wo.m, Wo.Z);
        CloseableHttpResponse closeableHttpResponse = null;
        try {
            closeableHttpResponse = aXI.a(closeableHttpClient, (HttpUriRequest)httpGet);
        }
        catch (IOException iOException) {
            a4E.b(iOException);
        }
        String string2 = null;
        try {
            string2 = IOUtilsInvoker.b(pR.a(V9.a((HttpResponse)closeableHttpResponse)), StandardCharsets.UTF_8);
        }
        catch (IOException iOException) {
            a4E.b(iOException);
        }
        return new JSONObject(string2);
    }

    static Minecraft l(UhcCrafts uhcCrafts) {
        return uhcCrafts.mc;
    }

    static Minecraft m(UhcCrafts uhcCrafts) {
        return uhcCrafts.mc;
    }

    public static void e(String string) {
        I = string;
    }

    static Minecraft k(UhcCrafts uhcCrafts) {
        return uhcCrafts.mc;
    }

    static Minecraft e(UhcCrafts uhcCrafts) {
        return uhcCrafts.mc;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_R" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    public boolean a() {
        UhcCrafts.d();
        return this.x() && auk_2.a((Boolean)Ba.b(this.U)) && this.mc.currentScreen instanceof GuiCrafting;
    }

    static Minecraft j(UhcCrafts uhcCrafts) {
        return uhcCrafts.mc;
    }

    static void a(UhcCrafts uhcCrafts, String string, String string2, int n, NotificationType notificationType) {
        uhcCrafts.a(string, string2, n, notificationType);
    }

    @EventTarget
    public void a(TickUpdateEvent tickUpdateEvent) {
        UhcCrafts.d();
        if (this.Q && qh_1.c(this.P, 50L)) {
            long l4 = aMF.c(aMF.b(ListInvoker.stream(V0.b(this.J)), ajn_0::f));
            this.a(this.r(), aL0.a(aL0.a(new StringBuilder(), l4), Wo.aZ).toString(), 3000, NotificationType.INFO);
            this.Q = false;
        }
        if (this.mc.currentScreen == null && !ListInvoker.isEmpty(this.K)) {
            ListInvoker.clear(this.K);
        }
    }

    public boolean e() {
        UhcCrafts.d();
        Iterator iterator = ListInvoker.iterator(a9E.a(GW.e(this.mc.ingameGUI)));
        if (dz_0.c(iterator)) {
            NetworkPlayerInfo networkPlayerInfo = (NetworkPlayerInfo)dz_0.b(iterator);
            if (!aCM.a(abb_2.PRE) && !aCM.a(abb_2.LOBBY) && !PlayerInvoker.f(this.mc.player).getName().equals(aNL.a(networkPlayerInfo).getName()) && pl_1.a(a9E.a(GW.e(this.mc.ingameGUI), networkPlayerInfo))) {
                return true;
            }
        }
        return false;
    }

    @EventTarget
    public void a(LoadWorldEvent loadWorldEvent) {
        this.a(this.r(), Wo.e, 2000, NotificationType.WARNING);
        qh_1.b(this.M);
        this.O = true;
    }

    static Minecraft c(UhcCrafts uhcCrafts) {
        return uhcCrafts.mc;
    }

    static Minecraft a(UhcCrafts uhcCrafts) {
        return uhcCrafts.mc;
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

    static Minecraft p(UhcCrafts uhcCrafts) {
        return uhcCrafts.mc;
    }

    static void b(UhcCrafts uhcCrafts, String string, String string2, int n, NotificationType notificationType) {
        uhcCrafts.a(string, string2, n, notificationType);
    }

    public void b() {
        ListInvoker.addAll(this.K, (Collection)aMF.a(aMF.a(ListInvoker.stream(V0.a(this.J)), this::lambda$refillCrafts$3), aB0.a()));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(UhcCrafts.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


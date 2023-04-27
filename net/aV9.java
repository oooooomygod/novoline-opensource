/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 *  fr.litarvan.openauth.microsoft.MicrosoftAuthResult
 *  fr.litarvan.openauth.microsoft.MicrosoftAuthenticationException
 *  fr.litarvan.openauth.microsoft.MicrosoftAuthenticator
 *  org.jetbrains.annotations.NotNull
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.NotificationManagerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.SessionInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import cc.novoline.utils.fonts.api.FontRenderer;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import cc.novoline.gui.alt.AltList;
import deobf.MCInvoker;
import deobf.NBTBase;
import fr.litarvan.openauth.microsoft.MicrosoftAuthResult;
import fr.litarvan.openauth.microsoft.MicrosoftAuthenticationException;
import fr.litarvan.openauth.microsoft.MicrosoftAuthenticator;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

public class aV9 {
    private String f;
    private a3L j;
    private boolean k;
    private String d;
    private long g;
    private static String[] l;
    private String e;
    private String b;
    private String a;
    private float m;
    private op_2 h;
    private String c;
    private AltList i;

    public String g() {
        return this.f;
    }

    public aV9 e(String string) {
        this.f = string;
        return this;
    }

    private void lambda$drawAltStencil$0(double d, double d2, float f) {
        TextureManagerInvoker.bindTexture(MCInvoker.E(MCInvoker.f()), apz_1.d(this.h));
        wh_1.a(d - 2.5, d2 - 4.0, 8.0f, 8.0f, 8, 8, f + 5.0f, f + 5.0f, 64.0f, 64.0f);
    }

    private CompletableFuture<MicrosoftAuthResult> e() {
        return avs_1.a(this::lambda$doRequest$3, (Executor)aFW.a());
    }

    public aV9 b(String string) {
        this.c = string;
        return this;
    }

    private void a(@NotNull op_2 op_22, float f, float f2) {
        MCInvoker.f();
        wh_1.a(f, f2, 8.0f, 8.0f, 8, 8, 23.0, 23.0, 64.0f, 64.0f);
    }

    public aV9 f(String string) {
        this.d = string;
        return this;
    }

    private MicrosoftAuthResult lambda$doRequest$3() {
        MicrosoftAuthenticator microsoftAuthenticator = new MicrosoftAuthenticator();
        MicrosoftAuthResult microsoftAuthResult = null;
        try {
            microsoftAuthResult = aIL.a(microsoftAuthenticator, this.c);
        }
        catch (MicrosoftAuthenticationException microsoftAuthenticationException) {}
        return microsoftAuthResult;
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), abm_1.B), this.b), '\''), abm_1.o), this.d), '\''), abm_1.v), (Object)this.j), abm_1.n), this.f), '\''), abm_1.z), this.c), '\''), '}').toString();
    }

    public String j() {
        return this.d;
    }

    public a3L a() {
        return this.j;
    }

    public void a(float f, float f2, int n, ahv_2 ahv_22) {
        aV9.h();
        if (this.b(f, f2, ahv_22) && n == 0) {
            if (SystemInvoker.f() - this.g < 250L) {
                try {
                    this.c();
                }
                catch (MicrosoftAuthenticationException microsoftAuthenticationException) {
                    O8.a(microsoftAuthenticationException);
                }
            }
            this.k = !this.k;
            this.g = SystemInvoker.f();
        }
    }

    public List<String> a(FontRenderer fontRenderer, String string) {
        aV9.h();
        ArrayList arrayList = new ArrayList();
        StringBuilder stringBuilder = new StringBuilder();
        float f = 0.0f;
        char[] cArray = StringInvoker.f(string);
        int n = cArray.length;
        int n2 = 0;
        if (n2 < n) {
            char c = cArray[n2];
            StringBuilder stringBuilder2 = new StringBuilder();
            if (f + (float)a7l_0.a(fontRenderer, aL0.a(aL0.a(stringBuilder2, c), abm_1.a).toString()) >= 140.0f) {
                ListInvoker.add(arrayList, aL0.a(aL0.a(new StringBuilder(), stringBuilder.toString()), c).toString());
                stringBuilder = new StringBuilder(c);
                f = 0.0f;
            }
            aL0.a(stringBuilder, c);
            f += (float)a7l_0.a(fontRenderer, aL0.a(aL0.a(new StringBuilder(), c), abm_1.m).toString());
            ++n2;
        }
        if (!StringInvoker.g(stringBuilder.toString())) {
            ListInvoker.add(arrayList, stringBuilder.toString());
        }
        return ListInvoker.subList(arrayList, 0, MathInvoker.max(0, ListInvoker.size(arrayList)));
    }

    public static void b(String[] stringArray) {
        l = stringArray;
    }

    public void a(GameProfile gameProfile, ResourceLocation resourceLocation) {
        Minecraft minecraft = MCInvoker.f();
        this.h = new op_2(gameProfile, resourceLocation);
        FT.a(MCInvoker.j(minecraft), this.h.worldObj, minecraft.fontRendererObj, this.h, this.h, minecraft.gameSettings, 0.0f);
    }

    void c() throws MicrosoftAuthenticationException {
        aV9.h();
        Minecraft minecraft = MCInvoker.f();
        switch (a4D.a[this.j.ordinal()]) {
            case 1: {
                minecraft.session = new Session(this.f, awc_1.a().toString(), abm_1.L, abm_1.A);
                this.b();
                NotificationManagerInvoker.a(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), abm_1.t, aL0.a(aL0.a(new StringBuilder(), abm_1.r), minecraft.session.e()).toString(), NotificationType.INFO);
            }
            case 2: {
                avs_1.b(this.e(), (arg_0, arg_1) -> this.lambda$logIn$4(minecraft, arg_0, arg_1));
            }
            case 3: {
                aky_0 aky_02 = new aky_0();
                MCInvoker.M(MCInvoker.f());
                qm_2.a(aky_02, null, this.e, false);
            }
        }
    }

    public String i() {
        return this.b;
    }

    public double a(ahv_2 ahv_22) {
        return avf_2.i((AltList)amx_1.c(ahv_22)) - 200.0 - avf_2.h((AltList)amx_1.c(ahv_22)) - 5.0;
    }

    public aV9 a(a3L a3L2) {
        this.j = a3L2;
        return this;
    }

    static {
        if (aV9.h() == null) {
            aV9.b(new String[5]);
        }
    }

    public float k() {
        if (this.d != null) {
            return 25 + ListInvoker.size(this.a(adj_1.a(ob_0.a, 19), this.d)) * 10;
        }
        return 30.0f;
    }

    public void a(GameProfile gameProfile, boolean bl) {
        aV9.h();
        this.a(gameProfile, null);
        Minecraft minecraft = MCInvoker.f();
        ayw_0.c(a4Z.c(gameProfile));
        if (bl) {
            ayw_0.a(a4Z.c(gameProfile), (Multimap)MCInvoker.m(minecraft));
        }
        ayw_0.a(a4Z.c(gameProfile), (Multimap)MCInvoker.a(minecraft, SessionInvoker.a(new Session(abm_1.k, this.a, abm_1.g, abm_1.H))));
        MinecraftProfileTexture minecraftProfileTexture = (MinecraftProfileTexture)MapInvoker.c(aSI.a(MCInvoker.T(minecraft), gameProfile, false), MinecraftProfileTexture.Type.SKIN);
        MCInvoker.a(minecraft, () -> this.lambda$setGameProfile$2(minecraft, minecraftProfileTexture, gameProfile));
    }

    public static aV9 a(AltList altList, NBTTagCompound nBTTagCompound) {
        aV9.h();
        aV9 aV92 = new aV9(altList);
        if (tn_0.b(nBTTagCompound, abm_1.y)) {
            aV92 = aV92.a(tn_0.m(nBTTagCompound, abm_1.C));
        }
        if (tn_0.b(nBTTagCompound, abm_1.F)) {
            aV92 = aV92.f(tn_0.m(nBTTagCompound, abm_1.J));
        }
        if (tn_0.b(nBTTagCompound, abm_1.K)) {
            aV92 = aV92.d(tn_0.m(nBTTagCompound, abm_1.M));
        }
        if (tn_0.b(nBTTagCompound, abm_1.D)) {
            aV92 = aV92.b(tn_0.m(nBTTagCompound, abm_1.j));
        }
        if (tn_0.b(nBTTagCompound, abm_1.p)) {
            aV92 = aV92.c(tn_0.m(nBTTagCompound, abm_1.N));
        }
        aV92 = aV92.e(tn_0.m(nBTTagCompound, abm_1.d)).a(ack_0.a(tn_0.m(nBTTagCompound, abm_1.w)));
        return aV92;
    }

    public void b(ahv_2 ahv_22) {
        aV9.h();
        a7l_0.b(adj_1.a(ob_0.a, 23), this.b, this.a(ahv_22) + 33.0, this.c(ahv_22) + 3.0, MCInvoker.f().session.e().equals(this.f) ? aol_1.b(new Color(0, 123, 234)) : -1, true);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        double d = this.a(ahv_22) + 3.0;
        double d2 = this.c(ahv_22) + 2.5;
        float f = 25.0f;
        aby_0.a(aby_0.a(), d, d2, (double)f, (double)f, (double)f, 1.5, 1.0f, new float[]{0.0f, 0.0f, 1920.0f, 1080.0f}, () -> this.lambda$drawAltStencil$0(d, d2, f));
        if (this.d != null) {
            double d3 = this.c(ahv_22) + 20.0;
            Iterator iterator = ListInvoker.iterator(this.a(adj_1.a(ob_0.a, 19), this.d));
            if (dz_0.c(iterator)) {
                String string = (String)dz_0.b(iterator);
                a7l_0.b(adj_1.a(ob_0.a, 19), aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.ITALIC), string).toString(), this.a(ahv_22) + 33.0, d3, aol_1.b(new Color(160, 160, 160)), true);
                d3 += 10.0;
                ListInvoker.b(new ListInvoker[2]);
            }
        }
        if (this.j == a3L.COOKIE) {
            a7l_0.b(adj_1.a(ay7_0.a, 35), abm_1.u, this.a(ahv_22) + 173.0, this.c(ahv_22) + 3.5, aol_1.b(new Color(250, 177, 83)), true);
        }
        if (this.j == a3L.CRACKED) {
            a7l_0.b(adj_1.a(ay7_0.a, 40), abm_1.h, this.a(ahv_22) + 189.5, this.c(ahv_22) + 3.5, aol_1.b(aol_1.d(new Color(172, 82, 220))), true);
        }
    }

    public aV9 c(String string) {
        this.a = string;
        this.a(SessionInvoker.a(MCInvoker.f().session), false);
        return this;
    }

    private void lambda$null$1(GameProfile gameProfile, MinecraftProfileTexture.Type type, ResourceLocation resourceLocation, MinecraftProfileTexture minecraftProfileTexture) {
        this.a(gameProfile, resourceLocation);
    }

    public aV9 d(String string) {
        this.e = string;
        return this;
    }

    private boolean b(float f, float f2, ahv_2 ahv_22) {
        aV9.h();
        return (double)f > this.a(ahv_22) && (double)f < this.a(ahv_22) + 205.0 && (double)f2 > this.c(ahv_22) && (double)f2 < this.c(ahv_22) + (double)this.k();
    }

    public NBTBase d() {
        aV9.h();
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        if (this.b != null) {
            tn_0.a(nBTTagCompound, abm_1.l, this.b);
        }
        if (this.d != null) {
            tn_0.a(nBTTagCompound, abm_1.x, this.d);
        }
        if (this.f != null) {
            tn_0.a(nBTTagCompound, abm_1.I, this.f);
        }
        if (this.c != null) {
            tn_0.a(nBTTagCompound, abm_1.e, this.c);
        }
        if (this.e != null) {
            tn_0.a(nBTTagCompound, abm_1.i, this.e);
        }
        if (this.a != null) {
            tn_0.a(nBTTagCompound, abm_1.f, this.a);
        }
        tn_0.a(nBTTagCompound, abm_1.q, this.j.toString());
        return nBTTagCompound;
    }

    private static MicrosoftAuthenticationException a(MicrosoftAuthenticationException microsoftAuthenticationException) {
        return microsoftAuthenticationException;
    }

    public static String[] h() {
        return l;
    }

    public boolean f() {
        return this.k;
    }

    private void lambda$logIn$4(Minecraft minecraft, MicrosoftAuthResult microsoftAuthResult, Throwable throwable) {
        aV9.h();
        minecraft.session = new Session(ads_0.a(aAQ.a(microsoftAuthResult)), ads_0.b(aAQ.a(microsoftAuthResult)), aAQ.c(microsoftAuthResult), abm_1.c);
        NotificationManagerInvoker.a(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), abm_1.s, aL0.a(aL0.a(new StringBuilder(), abm_1.G), ads_0.a(aAQ.a(microsoftAuthResult))).toString(), NotificationType.INFO);
        this.b();
    }

    public aV9(AltList altList) {
        this.i = altList;
        this.h = new op_2(new GameProfile(awc_1.a(), this.f), null);
    }

    public double c(ahv_2 ahv_22) {
        float f = 0.0f;
        aV9.h();
        Iterator iterator = a0I.d(avf_2.a(this.i));
        if (dz_0.c(iterator)) {
            aV9 aV92 = (aV9)dz_0.b(iterator);
            if (aV92 == this) {
                // empty if block
            }
            f += aV92.k() + 5.0f;
        }
        return avf_2.g(this.i) + 12.0 + (double)f - (double)abe_2.a(amx_1.a(ahv_22));
    }

    public void b() {
        Minecraft minecraft = MCInvoker.f();
        this.a = StringInvoker.a(a4Z.a(SessionInvoker.a(minecraft.session)).toString(), (CharSequence)abm_1.b, (CharSequence)abm_1.E);
        this.a(SessionInvoker.a(minecraft.session), true);
        avf_2.c(NovolineInvoker.f(NovolineInvoker.getInstance()));
    }

    public void a(float f, float f2, ahv_2 ahv_22) {
        aV9.h();
        if (this.b(f, f2, ahv_22) || this.k) {
            this.m += (1.0f - this.m) * 0.02f;
        }
        this.m -= this.m * 0.02f;
        aV3.a(aV3.a(), this.a(ahv_22), this.c(ahv_22), 205.0, (double)this.k(), (double)(this.k() / 4.0f), 3.0, new Color(a1V.a(new Color(25, 25, 25), new Color(15, 15, 15), (double)this.m)), amx_1.b(ahv_22), true);
        if (this.j == a3L.MICROSOFT || this.j == a3L.COOKIE) {
            a1V.a(this.a(ahv_22) + 191.0, this.c(ahv_22) + 3.0, 4.0f, 2.0f, amx_1.b(ahv_22));
        }
        if (ListInvoker.b() != null) {
            aV9.b(new String[5]);
        }
    }

    public aV9 a(String string) {
        this.b = string;
        return this;
    }

    private ResourceLocation lambda$setGameProfile$2(Minecraft minecraft, MinecraftProfileTexture minecraftProfileTexture, GameProfile gameProfile) throws Exception {
        return aFZ.a(MCInvoker.N(minecraft), minecraftProfileTexture, MinecraftProfileTexture.Type.SKIN, (arg_0, arg_1, arg_2) -> this.lambda$null$1(gameProfile, arg_0, arg_1, arg_2));
    }
}


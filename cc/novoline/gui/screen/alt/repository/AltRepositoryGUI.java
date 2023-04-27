/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectList
 *  org.apache.logging.log4j.Logger
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.checkerframework.checker.nullness.qual.Nullable
 *  org.lwjgl.opengl.GL11
 */
package cc.novoline.gui.screen.alt.repository;

import cc.novoline.Novoline;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.KeyboardInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.MouseInvoker;
import cc.novoline.invoke.NotificationManagerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import com.mojang.authlib.GameProfile;
import deobf.GuiScreen;
import deobf.MCInvoker;
import deobf.NBTTagList;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import java.awt.Color;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.LinkOption;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.Logger;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.lwjgl.opengl.GL11;


public class AltRepositoryGUI
extends GuiScreen {
    private float G;
    static int B = 36;
    private Logger M;
    private aky_0 z;
    private static int S;
    private sn_0 aa;
    private @NonNull auk_1 U;
    private aAG H;
    private QO K;
    private static DecimalFormat J;
    private static float P = 5.0f;
    private float Y;
    private float X;
    private long I;
    private String y;
    private int F;
    private static int A;
    private @NonNull Novoline O;
    static int T = 320;
    private akn_0 x;
    private qh_0 C;
    private int N;
    private static SimpleDateFormat V;
    private boolean Q;
    static int ac = 30;
    static int v = 1;
    private aNW<aAG, aAG> ab;
    private float w;
    static int D = 22;
    static int E = 157;
    private boolean W;
    static int Z = 25;
    static float R = 3.0f;
    private List<aAG> L;

    void a(@Nullable aAG aAG2, @NonNull aAG aAG3, Integer n) {
        P8.b();
        if (n == null && P8.b(n = P8.d(a0I.a(this.ab, aAG3))) == -1) {
            return;
        }
        if (aAG2 != null) {
            aAG2.c(false);
        }
        aAG3.c(true);
        if (P8.b(n) < this.N) {
            this.b(P8.b(n));
        }
        if (P8.b(n) >= this.N + this.F) {
            this.b(P8.b(n) - this.F + 1);
        }
    }

    private void p() {
        P8.b();
        if (a0I.a(this.ab) - this.N < this.F) {
            this.a(a0I.a(this.ab) - this.F);
        }
        int n = a0I.a(this.ab);
        this.L = a0I.a(this.ab, MathHelper.a(this.N, 0, n), MathHelper.a(this.N + this.F, 0, n));
    }

    private static String lambda$initGui$3(aAG aAG2) {
        return aL0.a(aL0.a(new StringBuilder(), aoh_0.J), apz_1.a(at1.e(aAG2))).toString();
    }

    public AltRepositoryGUI(@NonNull Novoline novoline) {
        block10: {
            Closeable closeable;
            P8.b();
            this.z = new aky_0();
            this.M = LogManagerInvoker.c();
            this.I = SystemInvoker.f();
            this.U = auk_1.DATE;
            this.y = aL0.a(aL0.a(new StringBuilder(), NovolineInvoker.t(NovolineInvoker.getInstance())), aoh_0.R).toString();
            this.ab = new aNW<aAG, aAG>((Collection<aAG>)cb_2.a((ObjectList)new ObjectArrayList()), this::lambda$new$0, this::lambda$new$1);
            this.G = 0.0f;
            this.O = novoline;
            if (!aev_1.b(da_0.a(this.y, new String[0]), new LinkOption[0])) {
                try {
                    closeable = new FileWriter(this.y);
                    l2.a(closeable, (CharSequence)aoh_0.b);
                    l2.a(closeable, (CharSequence)aoh_0.h);
                    l2.a(closeable, (CharSequence)aoh_0.A);
                    l2.a(closeable, (CharSequence)aoh_0.m);
                    l2.a(closeable);
                    this.W = true;
                    break block10;
                }
                catch (IOException iOException) {
                    a4E.b(iOException);
                }
            }
            closeable = null;
            closeable = new Scanner(da_0.a(this.y, new String[0]));
            if (!GL.b((Scanner)closeable)) break block10;
            String string = GL.a((Scanner)closeable);
            ea_1.a(System.out, string);
            if (!StringInvoker.e(string, aoh_0.v)) break block10;
            String string2 = StringInvoker.g(string, aoh_0.H)[1];
            String string3 = aoh_0.a;
            try {
                String string4 = StringInvoker.a(string2, (CharSequence)string3, (CharSequence)aoh_0.Q);
                this.W = auk_2.b(string4);
            }
            catch (IOException iOException) {
                a4E.b(iOException);
            }
        }
        if (this.W) {
            try {
                this.x = new akn_0(aoh_0.e);
            }
            catch (IOException iOException) {
                throw new IllegalStateException(aoh_0.s, iOException);
            }
            this.I = SystemInvoker.f();
        }
        this.q();
    }

    private void lambda$actionPerformed$2(rl_0 rl_02, ais_0 ais_02) {
        alq_0.a(aME.a(rl_02), aL0.a(aL0.a(new StringBuilder(), (Object)asx_1.GREEN), aoh_0.O).toString());
        aib_1.a(new aqx_1(this, ais_02, new ayz_0(this, rl_02)));
    }

    private void b(int n) {
        this.a(n);
        this.p();
    }

    private void c(int n) {
        int n2;
        P8.b();
        int n3 = MouseInvoker.m();
        if (n3 == 0) {
            return;
        }
        if (n3 < 0) {
            n2 = this.N + 1;
        }
        if ((n2 = this.N - 1) >= 0 && n2 <= n - this.F) {
            this.b(n2);
        }
    }

    private aAG lambda$new$0(aAG aAG2) {
        P8.b();
        if (this.aa == null || aw__0.d(es_2.b(this.aa))) {
            return aAG2;
        }
        if (aAG2 == null) {
            return null;
        }
        if (at1.e(aAG2) != null && apz_1.a(at1.e(aAG2)) != null) {
            apz_1.a(at1.e(aAG2));
        }
        if (at1.i(aAG2) != null) {
            aks_1.b(at1.i(aAG2));
        }
        return null;
    }

    public aAG e() {
        return this.H;
    }

    public boolean a(@NonNull ais_0 ais_02) {
        return aMF.c(ms_0.b(a0I.f(this.ab)), arg_0 -> AltRepositoryGUI.lambda$hasAlt$7(ais_02, arg_0));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void q() {
        block5: {
            P8.b();
            a0I.c(this.ab);
            try {
                int n;
                block6: {
                    aAG aAG2;
                    NBTTagCompound nBTTagCompound = aR8.a(new File(NovolineInvoker.t(NovolineInvoker.getInstance()), aoh_0.I));
                    if (nBTTagCompound == null) {
                        return;
                    }
                    n = 0;
                    NBTTagList nBTTagList = tn_0.c(nBTTagCompound, aoh_0.x, 10);
                    if (n >= kv_0.c(nBTTagList)) break block5;
                    try {
                        aAG2 = at1.a(this, kv_0.g(nBTTagList, n));
                    }
                    catch (Throwable throwable) {
                        LoggerInvoker.a(this.M, aL0.a(aL0.a(new StringBuilder(), aoh_0.C), kv_0.g(nBTTagList, n).toString()).toString(), throwable);
                        break block6;
                    }
                    a0I.b(this.ab, aAG2);
                }
                ++n;
            }
            catch (Exception exception) {
                LoggerInvoker.a(this.M, aoh_0.w, exception);
            }
        }
        this.p();
    }

    private int c() {
        float f = (float)(this.f - 25) / 39.0f;
        return MathHelper.f(f);
    }

    private static String lambda$initGui$5(aAG aAG2) {
        return aL0.a(aL0.a(new StringBuilder(), aoh_0.d), at1.b(aAG2)).toString();
    }

    private void o() {
        aAG aAG2 = null;
        P8.b();
        Iterator iterator = a0I.d(this.ab);
        if (dz_0.c(iterator)) {
            aAG aAG3 = (aAG)dz_0.b(iterator);
            if (at1.d(aAG3)) {
                this.b(aAG3);
                if (aAG2 != null) {
                    aAG2.c(true);
                }
                return;
            }
            aAG2 = aAG3;
        }
        this.j();
    }

    @Override
    public void i() {
        KeyboardInvoker.a(false);
        this.j();
    }

    public float d() {
        return this.Y;
    }

    public void a(aAG aAG2) {
        this.H = aAG2;
    }

    private static boolean lambda$getRandomAlt$6(aAG aAG2) {
        P8.b();
        return at1.h(aAG2) == 0L;
    }

    static {
        J = new DecimalFormat(aoh_0.B);
        V = new SimpleDateFormat(aoh_0.L);
        aBC.a(J, 3);
        S = aol_1.b(new Color(0, 0, 0, 50));
        A = aol_1.b(new Color(255, 255, 255, 30));
    }

    public boolean a(QG qG, int n, int n2) {
        P8.b();
        return (double)n > qG.n + (double)atB.b(qG) - 30.0 && (double)n <= qG.n + (double)atB.b(qG) && (double)n2 > qG.h + 1.0 && (double)n2 <= qG.h + (double)atB.c(qG) + 1.0;
    }

    private void a(int n) {
        this.N = MathHelper.a(n, 0, MathInvoker.max(0, a0I.a(this.ab) - this.F));
    }

    static Minecraft a(AltRepositoryGUI altRepositoryGUI) {
        return altRepositoryGUI.t;
    }

    public aAG b(@NonNull ais_0 ais_02) {
        P8.b();
        if (!this.a(ais_02)) {
            String string = aks_1.b(ais_02);
            aAG aAG2 = new aAG(ais_02, new op_2(new GameProfile(awc_1.a(), string), null), this, lx_2.b(0L), aoh_0.F, 1.0);
            a0I.b(this.ab, aAG2);
            this.p();
            at1.a(aAG2);
            return aAG2;
        }
        NotificationManagerInvoker.a(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), aoh_0.t, NotificationType.ERROR);
        return null;
    }

    public float m() {
        return this.X;
    }

    private void a() {
        this.q();
        this.b(0);
    }

    private static boolean lambda$hasAlt$7(ais_0 ais_02, aAG aAG2) {
        return aks_1.a(at1.i(aAG2)).equals(aks_1.a(ais_02));
    }

    private static String lambda$initGui$4(aAG aAG2) {
        return aL0.a(aL0.a(new StringBuilder(), aoh_0.D), aBC.a(J, at1.g(aAG2))).toString();
    }

    public void b(@NonNull aAG aAG2) {
        P8.b();
        if (a0I.c(this.ab, aAG2)) {
            this.p();
        }
    }

    @Override
    protected void b(int n, int n2, int n3) {
        Object object;
        P8.b();
        int n4 = 0;
        if (n4 < ListInvoker.size(this.l)) {
            object = (QG)ListInvoker.get(this.l, n4);
            if (((QG)object).m == 1337 && this.a((QG)object, n, n2)) {
                NotificationManagerInvoker.a(NovolineInvoker.getNotificationManager(this.O), aoh_0.j, aoh_0.G, 4000, NotificationType.INFO);
            }
            if (atB.a((QG)object, this.t, n, n2)) {
                this.m = object;
                atB.a((QG)object, MCInvoker.l(this.t));
                this.a((QG)object);
                return;
            }
            ++n4;
        }
        if ((n4 = 0) < ListInvoker.size(this.L)) {
            object = (aAG)ListInvoker.get(this.L, n4);
            if (((aAG)object).b(this.G, 25.0f + (float)n4 * 39.0f, n, n2)) {
                return;
            }
            ++n4;
        }
        if (n >= 3 && n <= 12 && n2 >= 25 && (float)n2 <= 25.0f + this.w) {
            float f = (this.w - 25.0f) / (float)a0I.a(this.ab);
            boolean bl = (float)n2 >= 25.0f + f * (float)this.N;
            this.b(this.N + MathHelper.i((double)a0I.a(this.ab) / 5.0) * -1);
        }
        this.aa.a(n, n2, n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(int n, int n2, float f) {
        P8.b();
        try {
            Object object;
            int n3;
            if (this.W) {
                GlStateManagerInvoker.A();
                asm_2.a(this.x, this.n * 2, this.f * 2, n, n2, (float)(SystemInvoker.f() - this.I) / 1000.0f);
                GL11.glBegin((int)7);
                GL11.glVertex2f((float)-1.0f, (float)-1.0f);
                GL11.glVertex2f((float)-1.0f, (float)1.0f);
                GL11.glVertex2f((float)1.0f, (float)1.0f);
                GL11.glVertex2f((float)1.0f, (float)-1.0f);
                GL11.glEnd();
                aY_.b(0);
            }
            a1V.c(0.0f, 0.0f, 9999.0f, 9999.0f, aol_1.b(new Color(100, 100, 100)));
            int n4 = a0I.a(this.ab);
            float f2 = this.w / (float)a0I.a(this.ab);
            if (this.Q) {
                int n5 = MathHelper.a(n2 - 25, 0, (int)this.w - 25);
                n3 = (int)((float)n5 / this.w * (float)a0I.a(this.ab));
                this.b(n3);
            }
            a7l_0.a(att_0.a, (CharSequence)aoh_0.p, 22 + a7l_0.a(att_0.a, aoh_0.o), 5.0f, -1);
            a7l_0.a(att_0.a, (CharSequence)aoh_0.r, 22.0f, 5.0f, hb_2.a(0, 180, 255));
            ScaledResolution scaledResolution = new ScaledResolution(this.t);
            a7l_0.a(att_0.a, (CharSequence)aoh_0.q, ScaledResolutionInvoker.getScaledWidth(scaledResolution) - a7l_0.a(att_0.a, aoh_0.z) - 22 + a7l_0.a(att_0.a, aoh_0.y), 5.0f, -1);
            a7l_0.a(att_0.a, (CharSequence)aoh_0.l, ScaledResolutionInvoker.getScaledWidth(scaledResolution) - a7l_0.a(att_0.a, aoh_0.T) - 22, 5.0f, hb_2.a(0, 180, 255));
            es_2.c(this.aa);
            a1V.a(5.0f, 25.0f, 9.0f, this.w, 0.0f, new Color(0, 0, 0, 110));
            a1V.a(6.0f, 25.0f + MathInvoker.a(f2 * (float)this.N, this.w - MathInvoker.a(f2 * (float)this.F, this.w)), 7.0f, MathInvoker.a(f2 * (float)this.F, this.w), 0.0f, new Color(0, 0, 0, 150));
            agg_1.a(this.C, this.t, n, n2);
            if (!a0I.g(this.ab)) {
                if (n4 > this.F) {
                    this.c(n4);
                }
                if ((n3 = 0) < ListInvoker.size(this.L)) {
                    object = (aAG)ListInvoker.get(this.L, n3);
                    at1.a((aAG)object, this.G, (int)(25.0f + (float)n3 * 39.0f), n, n2);
                    ++n3;
                }
                aAG aAG2 = this.b();
                at1.a(aAG2, n, n2);
            }
            super.a(n, n2, f);
            n3 = 0;
            if (n3 >= ListInvoker.size(this.l)) return;
            object = (QG)ListInvoker.get(this.l, n3);
            if (((QG)object).m == 1337) {
                a1V.a(((QG)object).n + 82.0, ((QG)object).h + 5.0, 10);
                if (this.a((QG)object, n, n2)) {
                    adp_0.b(false);
                    a1V.a(((QG)object).n - 1.0, ((QG)object).h + 1.0, (double)(atB.b((QG)object) + 2), (double)atB.c((QG)object), 0.0, hb_2.a(asx_1.BLACK));
                    adp_0.a(true);
                    arn_1.d(((QG)object).n + (double)atB.b((QG)object) - 31.0, ((QG)object).h + 1.0, ((QG)object).n + (double)atB.b((QG)object) + 2.0, ((QG)object).h + (double)atB.c((QG)object) + 1.0, hb_2.a(0, 0, 0, 50));
                    adp_0.a();
                }
                a7l_0.b(adj_1.a(pI.a, 40), aoh_0.f, ((QG)object).n + (double)atB.b((QG)object) - 20.0, ((QG)object).h + 6.0, 0xFFFFFF, true);
            }
            ++n3;
            return;
        }
        catch (Throwable throwable) {
            LoggerInvoker.b(this.M, aL0.c(aL0.a(new StringBuilder(), aoh_0.E), this.N).toString(), throwable);
        }
    }

    public aAG b() {
        return (aAG)oc_1.a(aMF.d(aMF.b(a0I.h(this.ab), aAG::e)), null);
    }

    public void j() {
        Object object;
        NBTTagList nBTTagList;
        block3: {
            P8.b();
            nBTTagList = new NBTTagList();
            object = ms_0.a(a0I.f(this.ab));
            if (!dz_0.c((Iterator)object)) break block3;
            aAG aAG2 = (aAG)dz_0.b((Iterator)object);
            kv_0.a(nBTTagList, at1.c(aAG2));
        }
        try {
            object = new NBTTagCompound();
            tn_0.a((NBTTagCompound)object, aoh_0.N, nBTTagList);
            aR8.a((NBTTagCompound)object, new File(NovolineInvoker.t(NovolineInvoker.getInstance()), aoh_0.K));
        }
        catch (Exception exception) {
            LoggerInvoker.a(this.M, aoh_0.k, exception);
        }
    }

    public @Nullable aAG l() {
        P8.b();
        List list = (List)aMF.a(aMF.b(a0I.h(this.ab), AltRepositoryGUI::lambda$getRandomAlt$6), aB0.a());
        if (ListInvoker.isEmpty(list)) {
            return null;
        }
        aAG aAG2 = (aAG)ListInvoker.get(list, ListInvoker.size(list) == 1 ? 0 : anf_2.a(anf_2.c(), 0, ListInvoker.size(list) - 1));
        at1.a(aAG2);
        return aAG2;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    @Override
    protected void a(int n, int n2, int n3) {
        this.Q = false;
        super.a(n, n2, n3);
    }

    @Override
    protected void a(QG qG) {
        P8.b();
        switch (qG.m) {
            case 0: 
            case 1: 
            case 1337: {
                this.o();
            }
            case 2: {
                MCInvoker.displayGuiScreen(this.t, new rl_0(this, aoh_0.i, aoh_0.P, this::lambda$actionPerformed$2));
            }
            case 3: {
                this.a();
            }
            case 5: {
                auk_1[] auk_1Array = auk_1.values();
                this.U = auk_1Array[(this.U.ordinal() + 1) % auk_1Array.length];
                this.K.k = this.U.b();
                a0I.b(this.ab);
                this.b(0);
            }
        }
    }

    public List<aAG> k() {
        return (List)a0I.f(this.ab);
    }

    private Comparator lambda$new$1() {
        return this.U.a();
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void a(char var1_1, int var2_2) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [11[CASE]], but top level block is 6[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public void l() {
        KeyboardInvoker.a(true);
        sn_0 sn_02 = this.aa;
        P8.b();
        int n = this.n - 320 - 22;
        int n2 = this.f - 25 - 24 - 120;
        this.G = -22 + this.n - 22 - 320 - 22;
        this.X = this.G / 564.0f * 5.0f;
        this.Y = 255.0f / (this.G / 5.0f);
        this.aa = new sn_0(0, this.t.fontRendererObj, this.n - 740, 4, 180, 20, aoh_0.u);
        this.U = auk_1.DATE;
        es_2.a(this.aa, es_2.b(sn_02));
        this.C = new qh_0(n, 25, 320, n2 - 1, this::b);
        agg_1.a(this.C, AltRepositoryGUI::lambda$initGui$3);
        agg_1.a(this.C, AltRepositoryGUI::lambda$initGui$4);
        agg_1.a(this.C, AltRepositoryGUI::lambda$initGui$5);
        this.w = (float)(-25 + this.f) - 5.0f;
        int n3 = this.F;
        this.F = this.c();
        if (n3 < this.F && a0I.a(this.ab) - this.N < this.F) {
            this.b(a0I.a(this.ab) - this.F);
        }
        this.p();
        ListInvoker.add(this.l, new QO(aoh_0.M, 0, n, n2 + 25 + 2, 156, 30, 15, att_0.a));
        ListInvoker.add(this.l, new QO(aoh_0.c, 1, n + 157 + 7, n2 + 25 + 2, 156, 30, 15, att_0.a));
        ListInvoker.add(this.l, new QO(aoh_0.n, 1337, n, n2 + 25 + 30 + 6, 320, 30, 15, att_0.a));
        ListInvoker.add(this.l, new QO(aoh_0.g, 2, n, n2 + 25 - 2 + 72, 320, 30, 15, att_0.a));
        ListInvoker.add(this.l, new QO(aoh_0.S, 3, n, n2 + 25 - 4 + 108, 320, 30, 15, att_0.a));
        this.K = new QO(this.U.b(), 5, this.n - 550, 2, 100, 20, 8, GO.a);
        ListInvoker.add(this.l, this.K);
        ListInvoker.b(new ListInvoker[2]);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package cc.novoline.gui.screen.setting;

import cc.novoline.events.events.SettingEvent;
import cc.novoline.invoke.EventManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.utils.Timer;
import deobf.GuiScreen;
import deobf.IntProperty;
import deobf.SettingType;
import deobf.TimerUtil;
import java.awt.Color;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import net.AbstractNumberProperty;
import net.Ba;
import net.BooleanProperty;
import net.CU;
import net.DiscordGUI;
import net.DoubleProperty;
import net.E3;
import net.EQ;
import net.FK;
import net.FloatProperty;
import net.JM;
import net.ListProperty;
import net.MathHelper;
import net.P8;
import net.StringProperty;
import net.a7r_0;
import net.aB0;
import net.aBC;
import net.aKE;
import net.aMF;
import net.aS0;
import net.aUL;
import net.acU;
import net.ace_2;
import net.aol_1;
import net.asp_2;
import net.auk_2;
import net.ava_0;
import net.aw2_0;
import net.axx_1;
import net.aze_0;
import net.db_0;
import net.eu_0;
import net.lx_2;
import org.checkerframework.checker.nullness.qual.Nullable;

public class Setting {
    private int z;
    private Set<CU> q;
    private static ListInvoker[] y;
    private float l;
    private BooleanProperty v;
    private EQ w;
    private StringProperty t;
    private TimerUtil M;
    private Timer j;
    private eu_0 g;
    private TimerUtil B;
    private String d;
    private String s;
    private double c = 70.0;
    private DecimalFormat K;
    private List<Setting> e;
    private boolean p;
    private boolean A;
    private ListProperty<String> i;
    private float P;
    private float k;
    private boolean N;
    private CU b;
    private TimerUtil O;
    private boolean x;
    private GuiScreen h;
    private Consumer<String> u;
    private Supplier<Boolean> E;
    private StringProperty F;
    private boolean H;
    private int o;
    private int C;
    private double a;
    private String f;
    private long n;
    private String D;
    private Consumer<String> G;
    private int r;
    private SettingType J;
    private AbstractModule m;
    private int I;
    private AbstractNumberProperty L;

    static {
        if (Setting.u() == null) {
            Setting.b(new ListInvoker[4]);
        }
    }

    public void b(float f) {
        this.k = f;
    }

    private boolean lambda$toggleOpened$1(Setting setting) {
        SettingType.b();
        return (setting.J == SettingType.COMBOBOX || setting.J == SettingType.SELECTBOX) && !setting.f.equals(this.f);
    }

    public boolean I() {
        SettingType.b();
        DiscordGUI discordGUI = NovolineInvoker.u(NovolineInvoker.getInstance());
        return this.o <= FK.h(discordGUI) + FK.g(discordGUI) - 10 && this.o >= FK.h(discordGUI) + 23;
    }

    public void c(boolean bl) {
        Ba.a(this.v, auk_2.b(bl));
    }

    public Set<CU> C() {
        return this.q;
    }

    public Setting(String string, String string2, SettingType settingType, AbstractModule abstractModule, BooleanProperty booleanProperty, Supplier<Boolean> supplier) {
        this.j = new Timer();
        this.r = 0;
        this.o = 0;
        this.z = 30;
        this.I = 5;
        this.A = false;
        this.c = 70.0;
        this.O = new TimerUtil();
        this.M = new TimerUtil();
        this.b = CU.HUE;
        this.B = new TimerUtil();
        this.K = new DecimalFormat(aw2_0.e);
        aBC.a(this.K, RoundingMode.CEILING);
        this.f = string;
        this.d = string2;
        this.J = settingType;
        this.m = abstractModule;
        this.v = booleanProperty;
        this.E = supplier;
    }

    public Setting(String string, String string2, SettingType settingType, AbstractModule abstractModule, List<Setting> list, Supplier<Boolean> supplier) {
        this.j = new Timer();
        this.r = 0;
        this.o = 0;
        this.z = 30;
        this.I = 5;
        this.A = false;
        this.c = 70.0;
        this.O = new TimerUtil();
        this.M = new TimerUtil();
        this.b = CU.HUE;
        this.B = new TimerUtil();
        this.K = new DecimalFormat(aw2_0.y);
        aBC.a(this.K, RoundingMode.CEILING);
        this.f = string;
        this.d = string2;
        this.J = settingType;
        this.m = abstractModule;
        this.e = list;
        this.E = supplier;
    }

    public StringProperty p() {
        return this.F;
    }

    public void a(CU cU) {
        this.b = cU;
    }

    public Setting(String string, String string2, SettingType settingType, AbstractModule abstractModule, BooleanProperty booleanProperty) {
        this.j = new Timer();
        this.r = 0;
        this.o = 0;
        this.z = 30;
        this.I = 5;
        this.A = false;
        this.c = 70.0;
        this.O = new TimerUtil();
        this.M = new TimerUtil();
        this.b = CU.HUE;
        this.B = new TimerUtil();
        this.K = new DecimalFormat(aw2_0.v);
        aBC.a(this.K, RoundingMode.CEILING);
        this.f = string;
        this.d = string2;
        this.J = settingType;
        this.m = abstractModule;
        this.v = booleanProperty;
    }

    public boolean n() {
        return this.x;
    }

    public SettingType B() {
        return this.J;
    }

    public Setting(String string, String string2, SettingType settingType, AbstractModule abstractModule, AbstractNumberProperty<?, ?> abstractNumberProperty, double d, String string3, Supplier<Boolean> supplier) {
        this.j = new Timer();
        this.r = 0;
        this.o = 0;
        this.z = 30;
        this.I = 5;
        this.A = false;
        this.c = 70.0;
        this.O = new TimerUtil();
        this.M = new TimerUtil();
        this.b = CU.HUE;
        this.B = new TimerUtil();
        this.K = new DecimalFormat(aw2_0.E);
        aBC.a(this.K, RoundingMode.CEILING);
        this.f = string;
        this.d = string2;
        this.J = settingType;
        this.m = abstractModule;
        this.L = abstractNumberProperty;
        this.a = d;
        this.E = supplier;
        this.s = string3;
    }

    public Setting(String string, String string2, SettingType settingType, AbstractModule abstractModule, AbstractNumberProperty<?, ?> abstractNumberProperty, double d, String string3) {
        this.j = new Timer();
        this.r = 0;
        this.o = 0;
        this.z = 30;
        this.I = 5;
        this.A = false;
        this.c = 70.0;
        this.O = new TimerUtil();
        this.M = new TimerUtil();
        this.b = CU.HUE;
        this.B = new TimerUtil();
        this.K = new DecimalFormat(aw2_0.K);
        aBC.a(this.K, RoundingMode.CEILING);
        this.f = string;
        this.d = string2;
        this.J = settingType;
        this.m = abstractModule;
        this.L = abstractNumberProperty;
        this.a = d;
        this.s = string3;
    }

    public float h() {
        return (float)this.R();
    }

    public Setting(String string, String string2, SettingType settingType, AbstractModule abstractModule, EQ eQ) {
        this.j = new Timer();
        this.r = 0;
        this.o = 0;
        this.z = 30;
        this.I = 5;
        this.A = false;
        this.c = 70.0;
        this.O = new TimerUtil();
        this.M = new TimerUtil();
        this.b = CU.HUE;
        this.B = new TimerUtil();
        this.K = new DecimalFormat(aw2_0.b);
        aBC.a(this.K, RoundingMode.CEILING);
        this.f = string;
        this.d = string2;
        this.J = settingType;
        this.m = abstractModule;
        this.w = eQ;
    }

    public float b() {
        return this.P;
    }

    public List<Setting> T() {
        return this.e;
    }

    public Setting(String string, String string2, SettingType settingType, AbstractModule abstractModule, ListProperty<String> listProperty, Supplier<Boolean> supplier) {
        this.j = new Timer();
        this.r = 0;
        this.o = 0;
        this.z = 30;
        this.I = 5;
        this.A = false;
        this.c = 70.0;
        this.O = new TimerUtil();
        this.M = new TimerUtil();
        this.b = CU.HUE;
        this.B = new TimerUtil();
        this.K = new DecimalFormat(aw2_0.j);
        aBC.a(this.K, RoundingMode.CEILING);
        this.f = string;
        this.d = string2;
        this.J = settingType;
        this.m = abstractModule;
        this.i = listProperty;
        this.E = supplier;
    }

    private boolean c(int n, int n2) {
        SettingType.b();
        if (!this.b(n, n2)) {
            return false;
        }
        if (this.A == !this.A) {
            aMF.a(aMF.b(ListInvoker.stream(ManagerInvoker.a()), this::lambda$toggleOpened$1), Setting::lambda$toggleOpened$2);
        }
        return true;
    }

    public String O() {
        return (String)StringPropertyInvoker.b(this.F);
    }

    public int t() {
        return P8.b(aUL.f(this.g));
    }

    public void a(float f) {
        this.l = f;
    }

    public boolean G() {
        return this.p;
    }

    public void a(double d) {
        this.a(db_0.a(MathHelper.b(d, acU.d(aKE.c(this.L)), acU.d(aKE.a(this.L)))));
    }

    public void a(int n) {
        this.z = n;
    }

    public void a(String string) {
        StringPropertyInvoker.b(this.F, string);
    }

    public Boolean y() {
        return (Boolean)Ba.b(this.v);
    }

    private static boolean lambda$update$0(Setting setting) {
        SettingType.b();
        return setting.s() != null ? auk_2.a((Boolean)JM.a(setting.s())) : true;
    }

    public Setting(String string, String string2, SettingType settingType, AbstractModule abstractModule, Supplier<Boolean> supplier) {
        this.j = new Timer();
        this.r = 0;
        this.o = 0;
        this.z = 30;
        this.I = 5;
        this.A = false;
        this.c = 70.0;
        this.O = new TimerUtil();
        this.M = new TimerUtil();
        this.b = CU.HUE;
        this.B = new TimerUtil();
        this.K = new DecimalFormat(aw2_0.h);
        aBC.a(this.K, RoundingMode.CEILING);
        this.f = string;
        this.d = string2;
        this.J = settingType;
        this.m = abstractModule;
        this.E = supplier;
    }

    public void b(String string) {
        StringPropertyInvoker.b(this.t, string);
    }

    public int L() {
        return this.o;
    }

    public Setting(String string, String string2, SettingType settingType, AbstractModule abstractModule, eu_0 eu_02, @Nullable EnumSet<CU> enumSet) {
        SettingType.b();
        this.j = new Timer();
        this.r = 0;
        this.o = 0;
        this.z = 30;
        this.I = 5;
        this.A = false;
        this.c = 70.0;
        this.O = new TimerUtil();
        this.M = new TimerUtil();
        this.b = CU.HUE;
        this.B = new TimerUtil();
        this.K = new DecimalFormat(aw2_0.s);
        aBC.a(this.K, RoundingMode.CEILING);
        this.f = string;
        this.d = string2;
        this.J = settingType;
        this.m = abstractModule;
        this.g = eu_02;
        this.q = enumSet;
        float[] fArray = aUL.e(eu_02);
        this.l = fArray[0] * 70.0f;
        this.P = fArray[1] * 70.0f;
        this.k = fArray[2] * 70.0f;
        if (ListInvoker.b() != null) {
            SettingType.b(new String[1]);
        }
    }

    public Setting(String string, String string2, SettingType settingType, AbstractModule abstractModule, ListProperty<String> listProperty) {
        this.j = new Timer();
        this.r = 0;
        this.o = 0;
        this.z = 30;
        this.I = 5;
        this.A = false;
        this.c = 70.0;
        this.O = new TimerUtil();
        this.M = new TimerUtil();
        this.b = CU.HUE;
        this.B = new TimerUtil();
        this.K = new DecimalFormat(aw2_0.J);
        aBC.a(this.K, RoundingMode.CEILING);
        this.f = string;
        this.d = string2;
        this.J = settingType;
        this.m = abstractModule;
        this.i = listProperty;
    }

    public Object g() {
        switch (this.J) {
            case CHECKBOX: {
                return this.v;
            }
            case SLIDER: {
                return aBC.a(this.K, this.R());
            }
            case COMBOBOX: {
                return this.t;
            }
            case SELECTBOX: {
                return this.i;
            }
        }
        return null;
    }

    public boolean c() {
        return this.A;
    }

    public Consumer<String> F() {
        return this.G;
    }

    public void c(float f) {
        this.P = f;
    }

    public StringProperty o() {
        return this.t;
    }

    public Setting(String string, String string2, SettingType settingType, AbstractModule abstractModule, StringProperty stringProperty) {
        this.j = new Timer();
        this.r = 0;
        this.o = 0;
        this.z = 30;
        this.I = 5;
        this.A = false;
        this.c = 70.0;
        this.O = new TimerUtil();
        this.M = new TimerUtil();
        this.b = CU.HUE;
        this.B = new TimerUtil();
        this.K = new DecimalFormat(aw2_0.F);
        aBC.a(this.K, RoundingMode.CEILING);
        this.f = string;
        this.d = string2;
        this.J = settingType;
        this.m = abstractModule;
        this.t = stringProperty;
    }

    public int A() {
        return this.z;
    }

    public long f() {
        return (long)this.R();
    }

    public boolean i() {
        return this.H;
    }

    public void b(boolean bl) {
        this.A = bl;
    }

    public StringProperty k() {
        return this.t;
    }

    public boolean a(int n, int n2, int n3) {
        int n4;
        SettingType.b();
        if (n3 == 0) {
            switch (this.J) {
                case COMBOBOX: {
                    if (this.c(n, n2)) {
                        // empty if block
                    }
                    if (!this.A || n < this.I - 70 || n > this.I) break;
                    int n5 = 0;
                    if (n5 < ListInvoker.size(StringPropertyInvoker.a(this.t))) {
                        n4 = this.o + 10 + n5 * 11;
                        if (n2 >= n4 && n2 <= n4 + 11) {
                            StringPropertyInvoker.b(this.t, (String)ListInvoker.get(StringPropertyInvoker.a(this.t), n5));
                            this.A = false;
                            EventManagerInvoker.call(new SettingEvent(this.m, this.J(), this.t));
                            return true;
                        }
                        ++n5;
                    }
                }
                case SELECTBOX: {
                    if (this.c(n, n2) || !this.A || n < this.I - 70 || n > this.I) break;
                    n4 = 0;
                    List list = ava_0.b(this.i);
                    if (n4 < ListInvoker.size(list)) {
                        int n6 = this.o + 10 + n4 * 11;
                        if (n2 >= n6 && n2 <= n6 + 11) {
                            String string = (String)ListInvoker.get(list, n4);
                            if (ava_0.b(this.i, string)) {
                                ava_0.c(this.i, string);
                            }
                            ava_0.a(this.i, (Object)string);
                            EventManagerInvoker.call(new SettingEvent(this.m, this.J(), this.i));
                            return true;
                        }
                        ++n4;
                    }
                }
                case CHECKBOX: {
                    if (!this.b(n, n2)) break;
                    Ba.a(this.v);
                    EventManagerInvoker.call(new SettingEvent(this.m, this.J(), this.P(), this.v));
                }
                case SLIDER: {
                    if (!this.b(n, n2)) break;
                    this.N = true;
                }
                case TEXTBOX: {
                    if (this.b(n, n2)) {
                        boolean bl = this.p = !this.p;
                    }
                    if (!this.p) break;
                    this.p = false;
                }
                case COLOR_PICKER: {
                    if (!this.b(n, n2)) break;
                    this.N = true;
                }
            }
        }
        if (n3 == 1 && this.J == SettingType.COLOR_PICKER && this.b(n, n2)) {
            int n7;
            CU[] cUArray = CU.values();
            n4 = (a7r_0.a((Object[])cUArray, (Object)this.b) + 1) % cUArray.length;
            if (this.q == null) {
                this.b = cUArray[n4];
            }
            if (!aS0.b(this.q) && (n7 = 0) < cUArray.length - 1) {
                CU cU = cUArray[(n4 + n7) % cUArray.length];
                if (!aS0.c(this.q, (Object)cU)) {
                    this.b = cUArray[(n7 + n4) % cUArray.length];
                }
                ++n7;
            }
        }
        return false;
    }

    public Setting(String string, String string2, SettingType settingType, AbstractModule abstractModule, Consumer<String> consumer) {
        this.j = new Timer();
        this.r = 0;
        this.o = 0;
        this.z = 30;
        this.I = 5;
        this.A = false;
        this.c = 70.0;
        this.O = new TimerUtil();
        this.M = new TimerUtil();
        this.b = CU.HUE;
        this.B = new TimerUtil();
        this.K = new DecimalFormat(aw2_0.q);
        aBC.a(this.K, RoundingMode.CEILING);
        this.f = string;
        this.d = string2;
        this.J = settingType;
        this.m = abstractModule;
        this.G = consumer;
    }

    public void a(boolean bl) {
        this.p = bl;
    }

    public void e(boolean bl) {
        this.H = bl;
    }

    public Setting(String string, String string2, SettingType settingType, AbstractModule abstractModule, Integer n, @Nullable EnumSet<CU> enumSet) {
        this.j = new Timer();
        this.r = 0;
        this.o = 0;
        this.z = 30;
        this.I = 5;
        this.A = false;
        this.c = 70.0;
        this.O = new TimerUtil();
        this.M = new TimerUtil();
        this.b = CU.HUE;
        this.B = new TimerUtil();
        this.K = new DecimalFormat(aw2_0.l);
        aBC.a(this.K, RoundingMode.CEILING);
        this.f = string;
        this.d = string2;
        this.J = settingType;
        this.m = abstractModule;
        this.g = asp_2.b(n);
        this.q = enumSet;
    }

    public Setting(String string, String string2, SettingType settingType, AbstractModule abstractModule) {
        this.j = new Timer();
        this.r = 0;
        this.o = 0;
        this.z = 30;
        this.I = 5;
        this.A = false;
        this.c = 70.0;
        this.O = new TimerUtil();
        this.M = new TimerUtil();
        this.b = CU.HUE;
        this.B = new TimerUtil();
        this.K = new DecimalFormat(aw2_0.H);
        aBC.a(this.K, RoundingMode.CEILING);
        this.f = string;
        this.d = string2;
        this.J = settingType;
        this.m = abstractModule;
    }

    public Setting(String string, String string2, SettingType settingType, AbstractModule abstractModule, String string3, StringProperty stringProperty, Supplier<Boolean> supplier) {
        this.j = new Timer();
        this.r = 0;
        this.o = 0;
        this.z = 30;
        this.I = 5;
        this.A = false;
        this.c = 70.0;
        this.O = new TimerUtil();
        this.M = new TimerUtil();
        this.b = CU.HUE;
        this.B = new TimerUtil();
        this.K = new DecimalFormat(aw2_0.z);
        aBC.a(this.K, RoundingMode.CEILING);
        this.f = string;
        this.d = string2;
        this.J = settingType;
        this.m = abstractModule;
        this.D = string3;
        this.F = stringProperty;
        this.E = supplier;
    }

    public ListProperty<String> a() {
        return this.i;
    }

    public EQ q() {
        return this.w;
    }

    public static ListInvoker[] u() {
        return y;
    }

    public Setting(String string, String string2, SettingType settingType, AbstractModule abstractModule, AbstractNumberProperty<?, ?> abstractNumberProperty, double d, Supplier<Boolean> supplier) {
        this.j = new Timer();
        this.r = 0;
        this.o = 0;
        this.z = 30;
        this.I = 5;
        this.A = false;
        this.c = 70.0;
        this.O = new TimerUtil();
        this.M = new TimerUtil();
        this.b = CU.HUE;
        this.B = new TimerUtil();
        this.K = new DecimalFormat(aw2_0.r);
        aBC.a(this.K, RoundingMode.CEILING);
        this.f = string;
        this.d = string2;
        this.J = settingType;
        this.m = abstractModule;
        this.L = abstractNumberProperty;
        this.a = d;
        this.E = supplier;
        this.s = aw2_0.c;
    }

    private static void lambda$toggleOpened$2(Setting setting) {
        setting.A = false;
    }

    public Setting(String string, String string2, AbstractModule abstractModule, BooleanProperty booleanProperty) {
        this.j = new Timer();
        this.r = 0;
        this.o = 0;
        this.z = 30;
        this.I = 5;
        this.A = false;
        this.c = 70.0;
        this.O = new TimerUtil();
        this.M = new TimerUtil();
        this.b = CU.HUE;
        this.B = new TimerUtil();
        this.K = new DecimalFormat(aw2_0.x);
        aBC.a(this.K, RoundingMode.CEILING);
        this.f = string;
        this.d = string2;
        this.J = SettingType.SEPARATOR;
        this.m = abstractModule;
        this.v = booleanProperty;
    }

    public Setting(String string, String string2, SettingType settingType, AbstractModule abstractModule, List<String> list, List<String> list2) {
        this.j = new Timer();
        this.r = 0;
        this.o = 0;
        this.z = 30;
        this.I = 5;
        this.A = false;
        this.c = 70.0;
        this.O = new TimerUtil();
        this.M = new TimerUtil();
        this.b = CU.HUE;
        this.B = new TimerUtil();
        this.K = new DecimalFormat(aw2_0.w);
        aBC.a(this.K, RoundingMode.CEILING);
        this.f = string;
        this.d = string2;
        this.J = settingType;
        this.m = abstractModule;
        this.i = ava_0.a(asp_2.a(list), list2);
    }

    public float K() {
        return this.l;
    }

    public BooleanProperty v() {
        return this.v;
    }

    public Setting(String string, String string2, SettingType settingType, AbstractModule abstractModule, String string3, StringProperty stringProperty) {
        this.j = new Timer();
        this.r = 0;
        this.o = 0;
        this.z = 30;
        this.I = 5;
        this.A = false;
        this.c = 70.0;
        this.O = new TimerUtil();
        this.M = new TimerUtil();
        this.b = CU.HUE;
        this.B = new TimerUtil();
        this.K = new DecimalFormat(aw2_0.g);
        aBC.a(this.K, RoundingMode.CEILING);
        this.f = string;
        this.d = string2;
        this.J = settingType;
        this.m = abstractModule;
        this.D = string3;
        this.F = stringProperty;
    }

    public eu_0 e() {
        return this.g;
    }

    public Setting(String string, String string2, SettingType settingType, AbstractModule abstractModule, List<Setting> list) {
        this.j = new Timer();
        this.r = 0;
        this.o = 0;
        this.z = 30;
        this.I = 5;
        this.A = false;
        this.c = 70.0;
        this.O = new TimerUtil();
        this.M = new TimerUtil();
        this.b = CU.HUE;
        this.B = new TimerUtil();
        this.K = new DecimalFormat(aw2_0.o);
        aBC.a(this.K, RoundingMode.CEILING);
        this.f = string;
        this.d = string2;
        this.J = settingType;
        this.m = abstractModule;
        this.e = list;
    }

    public void a(char c, int n) {
        block6: {
            block5: {
                SettingType.b();
                if (this.J != SettingType.TEXTBOX) break block5;
                if (!this.p) break block6;
                if (n == 1) {
                    this.p = false;
                }
                if (n == 14 || n == 157 || n == 29 || n == 54 || n == 42 || n == 15 || n == 58 || n == 211 || n == 199 || n == 210 || n == 200 || n == 208 || n == 205 || n == 203 || n == 56 || n == 184 || n == 197 || n == 70 || n == 207 || n == 201 || n == 209 || n == 221 || n == 59 || n == 60 || n == 61 || n == 62 || n == 63 || n == 64 || n == 65 || n == 66 || n == 67 || n == 68 || n == 87 || n == 88) break block6;
                StringPropertyInvoker.a(this.F, aze_0.c(c));
            }
            if (n == 1 && (this.J == SettingType.SELECTBOX || this.J == SettingType.COMBOBOX) && this.A) {
                this.A = false;
            }
        }
    }

    public void d() {
        DiscordGUI discordGUI = NovolineInvoker.u(NovolineInvoker.getInstance());
        this.r = FK.a(discordGUI) + 168;
        this.o = FK.h(discordGUI) + this.z + ListInvoker.indexOf((List)aMF.a(aMF.b(ListInvoker.stream(ManagerInvoker.a(this.m)), Setting::lambda$update$0), aB0.a()), this) * 25;
        this.I = FK.a(discordGUI) + 45 + 105 + FK.b(discordGUI) - 18;
    }

    public double R() {
        return (double)MathInvoker.f(acU.d((Number)aKE.b(this.L)) / this.a) * this.a;
    }

    public AbstractNumberProperty N() {
        return this.L;
    }

    public void b(int n, int n2, int n3) {
        this.N = false;
    }

    public Setting(String string, String string2, SettingType settingType, AbstractModule abstractModule, Consumer<String> consumer, Supplier<Boolean> supplier) {
        this.j = new Timer();
        this.r = 0;
        this.o = 0;
        this.z = 30;
        this.I = 5;
        this.A = false;
        this.c = 70.0;
        this.O = new TimerUtil();
        this.M = new TimerUtil();
        this.b = CU.HUE;
        this.B = new TimerUtil();
        this.K = new DecimalFormat(aw2_0.A);
        aBC.a(this.K, RoundingMode.CEILING);
        this.f = string;
        this.d = string2;
        this.J = settingType;
        this.m = abstractModule;
        this.G = consumer;
        this.E = supplier;
    }

    public void b(int n) {
        aUL.a(this.g, P8.d(n));
    }

    public AbstractModule j() {
        return this.m;
    }

    public Timer E() {
        return this.j;
    }

    public void a(Number number) {
        SettingType.b();
        if (this.L instanceof IntProperty) {
            aKE.a(this.L, P8.d(acU.e(number)));
        }
        if (this.L instanceof DoubleProperty) {
            aKE.a(this.L, db_0.a(acU.d(number)));
        }
        if (this.L instanceof FloatProperty) {
            aKE.a(this.L, axx_1.a(acU.b(number)));
        }
        if (this.L instanceof E3) {
            aKE.a(this.L, lx_2.b(acU.c(number)));
        }
    }

    public Setting(String string, String string2, SettingType settingType, AbstractModule abstractModule, AbstractNumberProperty<?, ?> abstractNumberProperty, double d) {
        this.j = new Timer();
        this.r = 0;
        this.o = 0;
        this.z = 30;
        this.I = 5;
        this.A = false;
        this.c = 70.0;
        this.O = new TimerUtil();
        this.M = new TimerUtil();
        this.b = CU.HUE;
        this.B = new TimerUtil();
        this.K = new DecimalFormat(aw2_0.f);
        aBC.a(this.K, RoundingMode.CEILING);
        this.f = string;
        this.d = string2;
        this.J = settingType;
        this.m = abstractModule;
        this.L = abstractNumberProperty;
        this.a = d;
        this.s = aw2_0.n;
    }

    public Setting(String string, String string2, SettingType settingType, AbstractModule abstractModule, GuiScreen guiScreen, Supplier<Boolean> supplier) {
        this.j = new Timer();
        this.r = 0;
        this.o = 0;
        this.z = 30;
        this.I = 5;
        this.A = false;
        this.c = 70.0;
        this.O = new TimerUtil();
        this.M = new TimerUtil();
        this.b = CU.HUE;
        this.B = new TimerUtil();
        this.K = new DecimalFormat(aw2_0.u);
        aBC.a(this.K, RoundingMode.CEILING);
        this.f = string;
        this.d = string2;
        this.J = settingType;
        this.m = abstractModule;
        this.h = guiScreen;
        this.E = supplier;
    }

    public Setting(String string, String string2, SettingType settingType, AbstractModule abstractModule, EQ eQ, Supplier<Boolean> supplier) {
        this.j = new Timer();
        this.r = 0;
        this.o = 0;
        this.z = 30;
        this.I = 5;
        this.A = false;
        this.c = 70.0;
        this.O = new TimerUtil();
        this.M = new TimerUtil();
        this.b = CU.HUE;
        this.B = new TimerUtil();
        this.K = new DecimalFormat(aw2_0.D);
        aBC.a(this.K, RoundingMode.CEILING);
        this.f = string;
        this.d = string2;
        this.J = settingType;
        this.m = abstractModule;
        this.w = eQ;
        this.E = supplier;
    }

    public float z() {
        return this.k;
    }

    public CU x() {
        return this.b;
    }

    public int H() {
        return (int)this.R();
    }

    public GuiScreen Q() {
        return this.h;
    }

    public String S() {
        return this.s;
    }

    public Setting(String string, String string2, SettingType settingType, AbstractModule abstractModule, GuiScreen guiScreen) {
        this.j = new Timer();
        this.r = 0;
        this.o = 0;
        this.z = 30;
        this.I = 5;
        this.A = false;
        this.c = 70.0;
        this.O = new TimerUtil();
        this.M = new TimerUtil();
        this.b = CU.HUE;
        this.B = new TimerUtil();
        this.K = new DecimalFormat(aw2_0.G);
        aBC.a(this.K, RoundingMode.CEILING);
        this.f = string;
        this.d = string2;
        this.J = settingType;
        this.m = abstractModule;
        this.h = guiScreen;
    }

    public Supplier<Boolean> s() {
        return this.E;
    }

    /*
     * Exception decompiling
     */
    public void a(int var1_1, int var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 39[SWITCH]
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

    public Setting(String string, String string2, SettingType settingType, AbstractModule abstractModule, String string3, String string4) {
        this.j = new Timer();
        this.r = 0;
        this.o = 0;
        this.z = 30;
        this.I = 5;
        this.A = false;
        this.c = 70.0;
        this.O = new TimerUtil();
        this.M = new TimerUtil();
        this.b = CU.HUE;
        this.B = new TimerUtil();
        this.K = new DecimalFormat(aw2_0.d);
        aBC.a(this.K, RoundingMode.CEILING);
        this.f = string;
        this.d = string2;
        this.J = settingType;
        this.m = abstractModule;
        this.D = string3;
        this.F = asp_2.a(string4);
    }

    public Setting(String string, String string2, SettingType settingType, AbstractModule abstractModule, StringProperty stringProperty, Supplier<Boolean> supplier) {
        this.j = new Timer();
        this.r = 0;
        this.o = 0;
        this.z = 30;
        this.I = 5;
        this.A = false;
        this.c = 70.0;
        this.O = new TimerUtil();
        this.M = new TimerUtil();
        this.b = CU.HUE;
        this.B = new TimerUtil();
        this.K = new DecimalFormat(aw2_0.C);
        aBC.a(this.K, RoundingMode.CEILING);
        this.f = string;
        this.d = string2;
        this.J = settingType;
        this.m = abstractModule;
        this.t = stringProperty;
        this.E = supplier;
    }

    private boolean b(int n, int n2) {
        SettingType.b();
        switch (this.J) {
            case CHECKBOX: {
                return n >= this.I - 10 && n <= this.I && n2 >= this.o - 2 && n2 <= this.o + 8;
            }
            case COMBOBOX: 
            case SELECTBOX: 
            case TEXTBOX: 
            case COLOR_PICKER: {
                return n >= this.I - 70 && n <= this.I && n2 >= this.o - 2 && n2 <= this.o + 8;
            }
            case SLIDER: {
                return n >= this.I - 70 && (double)n <= (double)(this.I - 70) + this.c && n2 >= this.o + 2 && n2 <= this.o + 8;
            }
        }
        return false;
    }

    public String J() {
        return this.f;
    }

    public Setting(String string, String string2, SettingType settingType, AbstractModule abstractModule, eu_0 eu_02, @Nullable EnumSet<CU> enumSet, Supplier<Boolean> supplier) {
        SettingType.b();
        this.j = new Timer();
        this.r = 0;
        this.o = 0;
        this.z = 30;
        this.I = 5;
        this.A = false;
        this.c = 70.0;
        this.O = new TimerUtil();
        this.M = new TimerUtil();
        this.b = CU.HUE;
        this.B = new TimerUtil();
        this.K = new DecimalFormat(aw2_0.p);
        aBC.a(this.K, RoundingMode.CEILING);
        this.f = string;
        this.d = string2;
        this.J = settingType;
        this.m = abstractModule;
        this.g = eu_02;
        this.q = enumSet;
        if (ace_2.a(enumSet, (Object)CU.HUE)) {
            if (ace_2.a(enumSet, (Object)CU.BRIGHTNESS)) {
                this.b = CU.SATURATION;
                ListInvoker.b(new ListInvoker[2]);
            }
            this.b = CU.BRIGHTNESS;
        }
        this.b = CU.HUE;
        this.b = CU.HUE;
        float[] fArray = aUL.e(eu_02);
        this.l = fArray[0] * 70.0f;
        this.P = fArray[1] * 70.0f;
        this.k = fArray[2] * 70.0f;
        this.E = supplier;
    }

    public Consumer<String> m() {
        return this.u;
    }

    public List<String> r() {
        return (List)ava_0.a(this.i);
    }

    public static void b(ListInvoker[] listInvokerArray) {
        y = listInvokerArray;
    }

    public double l() {
        return this.a;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public Color D() {
        return aUL.c(this.g);
    }

    public String P() {
        return this.d;
    }

    public void d(boolean bl) {
        this.N = bl;
    }

    public float[] U() {
        SettingType.b();
        Integer n = aUL.f(this.g);
        if (n == null) {
            return aol_1.a(0, 0, 0, new float[3]);
        }
        return aol_1.a(P8.b(n) & 0xFF, P8.b(n) >> 8 & 0xFF, P8.b(n) >> 16 & 0xFF, new float[3]);
    }

    public Setting(String string, String string2, AbstractModule abstractModule, BooleanProperty booleanProperty, Supplier<Boolean> supplier) {
        this.j = new Timer();
        this.r = 0;
        this.o = 0;
        this.z = 30;
        this.I = 5;
        this.A = false;
        this.c = 70.0;
        this.O = new TimerUtil();
        this.M = new TimerUtil();
        this.b = CU.HUE;
        this.B = new TimerUtil();
        this.K = new DecimalFormat(aw2_0.t);
        aBC.a(this.K, RoundingMode.CEILING);
        this.f = string;
        this.d = string2;
        this.J = SettingType.SEPARATOR;
        this.m = abstractModule;
        this.v = booleanProperty;
        this.E = supplier;
    }

    public float[] M() {
        return aUL.e(this.g);
    }

    public String w() {
        return (String)StringPropertyInvoker.b(this.t);
    }

    public Setting(String string, String string2, SettingType settingType, AbstractModule abstractModule, boolean bl) {
        this.j = new Timer();
        this.r = 0;
        this.o = 0;
        this.z = 30;
        this.I = 5;
        this.A = false;
        this.c = 70.0;
        this.O = new TimerUtil();
        this.M = new TimerUtil();
        this.b = CU.HUE;
        this.B = new TimerUtil();
        this.K = new DecimalFormat(aw2_0.B);
        aBC.a(this.K, RoundingMode.CEILING);
        this.f = string;
        this.d = string2;
        this.J = settingType;
        this.m = abstractModule;
        this.v = asp_2.a(auk_2.b(bl));
    }
}


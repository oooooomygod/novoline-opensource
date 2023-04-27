/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import deobf.FontRenderer;
import deobf.GameSettings;
import deobf.GuiScreen;
import deobf.MCInvoker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.I18n;
import net.IN;
import net.MZ;
import net.Q0;
import net.QG;
import net.S3;
import net.a0A;
import net.a0D;
import net.a0a_0;
import net.a3c_0;
import net.a6d_0;
import net.a7r_0;
import net.aGN;
import net.aL0;
import net.ayy_2;
import net.dz_0;
import net.mk_0;
import net.ys_2;

/*
 * Renamed from net.Sx
 */
public class sx_0
extends S3 {
    private GameSettings D;
    public static String A = "*";
    private int B;
    private int F;
    private GuiScreen z;
    private long x;
    private boolean E;
    private String w;
    private String y;
    public static String G;
    public static String v;
    protected String C;

    @Override
    protected void b(QG qG) {
        a0D.k();
        if (qG instanceof Q0) {
            Q0 q0 = (Q0)qG;
            a0D a0D2 = ayy_2.b(q0);
            if (sx_0.j()) {
                mk_0.c(a0D2);
            }
            mk_0.f(a0D2);
            this.a();
            this.E = true;
        }
    }

    private String a(a0D a0D2, int n) {
        a0D.k();
        String string = mk_0.k(a0D2);
        if (a0D2 instanceof a0A) {
            a0A a0A2 = (a0A)a0D2;
            return aL0.a(aL0.a(new StringBuilder(), string), aGN.r).toString();
        }
        FontRenderer fontRenderer = ys_2.at().fontRendererObj;
        int n2 = FontRendererInvoker.a(fontRenderer, aL0.a(aL0.a(new StringBuilder(), aGN.n), IN.b()).toString()) + 5;
        if (FontRendererInvoker.a(fontRenderer, string) + n2 >= n && !StringInvoker.g(string)) {
            string = StringInvoker.b(string, 0, StringInvoker.c(string) - 1);
        }
        String string2 = mk_0.h(a0D2) ? mk_0.f(a0D2, mk_0.a(a0D2)) : aGN.d;
        String string3 = mk_0.c(a0D2, mk_0.a(a0D2));
        return aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), string), aGN.k), string2), string3).toString();
    }

    private void a() {
        QG qG;
        a0D.r();
        Iterator iterator = ListInvoker.iterator(this.l);
        if (dz_0.c(iterator) && (qG = (QG)dz_0.b(iterator)) instanceof Q0) {
            Q0 q0 = (Q0)qG;
            a0D a0D2 = ayy_2.b(q0);
            if (a0D2 instanceof a0a_0) {
                a0a_0 a0a_02 = (a0a_0)a0D2;
                a6d_0.a(a0a_02);
            }
            q0.k = this.a(a0D2, ayy_2.a(q0));
        }
    }

    private String[] a(String string) {
        a0D.r();
        if (StringInvoker.c(string) <= 0) {
            return new String[0];
        }
        int n = 0;
        String[] stringArray = StringInvoker.g(string = MZ.a(string, aGN.l), aGN.g);
        if (n < stringArray.length) {
            stringArray[n] = aL0.a(aL0.a(new StringBuilder(), aGN.w), StringInvoker.h(stringArray[n])).toString();
            stringArray[n] = MZ.b(stringArray[n], aGN.q);
            ++n;
        }
        return stringArray;
    }

    @Override
    protected void a(QG qG) {
        a0D.r();
        if (qG.g) {
            a0D[] a0DArray;
            a0D[] a0DArray2;
            if (qG.m < 200 && qG instanceof Q0) {
                a0DArray2 = (a0D[])qG;
                a0DArray = ayy_2.b((Q0)a0DArray2);
                if (a0DArray instanceof a0A) {
                    String string = mk_0.i((a0D)a0DArray);
                    sx_0 sx_02 = new sx_0(this, this.D, string);
                    MCInvoker.displayGuiScreen(this.t, sx_02);
                    return;
                }
                if (sx_0.j()) {
                    mk_0.c((a0D)a0DArray);
                }
                mk_0.l((a0D)a0DArray);
                this.a();
                this.E = true;
            }
            if (qG.m == 201) {
                int n = 0;
                a0DArray2 = a3c_0.a(a3c_0.g());
                a0DArray = a0DArray2;
                int n2 = a0DArray.length;
                if (n < n2) {
                    a0D a0D2 = a0DArray[n];
                    mk_0.c(a0D2);
                    this.E = true;
                    ++n;
                }
                this.a();
            }
            if (qG.m == 200) {
                if (this.E) {
                    a3c_0.m();
                    this.E = false;
                    a3c_0.M();
                }
                MCInvoker.displayGuiScreen(this.t, this.z);
            }
        }
    }

    @Override
    public void i() {
        a0D.r();
        super.i();
        if (this.E) {
            a3c_0.m();
            this.E = false;
            a3c_0.M();
        }
    }

    @Override
    public void a(int n, int n2, float f) {
        a0D.r();
        this.h();
        if (this.w != null) {
            this.b(this.q, this.w, this.n / 2, 15, 0xFFFFFF);
        }
        this.b(this.q, this.C, this.n / 2, 15, 0xFFFFFF);
        super.a(n, n2, f);
        if (MathInvoker.a(n - this.B) <= 5 && MathInvoker.a(n2 - this.F) <= 5) {
            this.a(n, n2, this.l);
        }
        this.B = n;
        this.F = n2;
        this.x = SystemInvoker.f();
    }

    private void a(int n, int n2, List list) {
        a0D.r();
        int n3 = 700;
        if (SystemInvoker.f() >= this.x + (long)n3) {
            int n4 = this.n / 2 - 150;
            int n5 = this.f / 6 - 7;
            if (n2 <= n5 + 98) {
                n5 += 105;
            }
            int n6 = n4 + 150 + 150;
            int cfr_ignored_0 = n5 + 84 + 10;
            QG qG = sx_0.a(list, n, n2);
            if (qG instanceof Q0) {
                Q0 q0 = (Q0)qG;
                a0D a0D2 = ayy_2.b(q0);
                this.b(a0D2, n6 - n4);
                return;
            }
        }
    }

    public sx_0(GuiScreen guiScreen, GameSettings gameSettings, String string) {
        a0D.k();
        this(guiScreen, gameSettings);
        this.y = string;
        this.w = a3c_0.a(aL0.a(aL0.a(new StringBuilder(), aGN.p), string).toString(), string);
    }

    public sx_0(GuiScreen guiScreen, GameSettings gameSettings) {
        this.B = 0;
        this.F = 0;
        this.x = 0L;
        this.y = null;
        this.w = null;
        this.E = false;
        this.C = aGN.j;
        this.z = guiScreen;
        this.D = gameSettings;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\u001d9\r$g}kDw\u0007\u001d,\u0012;um9";
        int n2 = "\u001d9\r$g}kDw\u0007\u001d,\u0012;um9".length();
        int n3 = 9;
        int n4 = -1;
        while (true) {
            char[] cArray;
            block5: {
                int n5;
                char[] cArray2;
                int n6;
                int n7;
                block4: {
                    int n8 = ++n4;
                    char[] cArray3 = string.substring(n8, n8 + n3).toCharArray();
                    int n9 = cArray3.length;
                    n7 = 0;
                    n6 = 121;
                    cArray2 = cArray3;
                    n5 = n9;
                    if (n9 <= 1) break block4;
                    cArray = cArray2;
                    n5 = n5;
                    if (n5 <= n7) break block5;
                }
                do {
                    cArray2 = cArray2;
                    int n10 = n7;
                    int cfr_ignored_0 = n7 % 7;
                    cArray2[n10] = (char)(cArray2[n10] ^ (n6 ^ 0x58));
                    ++n7;
                    n6 = n6;
                    cArray = cArray2;
                    n5 = n5;
                } while (n5 > n7);
            }
            stringArray[n++] = new String(cArray).intern();
            if ((n4 += n3) >= n2) {
                String[] stringArray2 = stringArray;
                G = stringArray2[1];
                v = stringArray2[0];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private String[] a(int n, List<String> list) {
        Iterator iterator;
        String string;
        String string2;
        FontRenderer fontRenderer = ys_2.at().fontRendererObj;
        a0D.k();
        ArrayList arrayList = new ArrayList();
        String[] stringArray = ListInvoker.iterator(list);
        if (dz_0.c((Iterator)stringArray) && (string2 = (string = (String)dz_0.b((Iterator)stringArray))) != null && !StringInvoker.g(string2) && dz_0.c(iterator = ListInvoker.iterator(FontRendererInvoker.b(fontRenderer, string2, n)))) {
            Object object = dz_0.b(iterator);
            ListInvoker.add(arrayList, (String)object);
        }
        stringArray = (String[])ListInvoker.toArray(arrayList, new String[ListInvoker.size(arrayList)]);
        return stringArray;
    }

    @Override
    public void l() {
        int n;
        this.C = I18n.format(aGN.v, new Object[0]);
        int n2 = 100;
        int n3 = 0;
        a0D.r();
        int n4 = 30;
        int n5 = 20;
        int cfr_ignored_0 = this.n - 130;
        int n6 = 120;
        int n7 = 20;
        int n8 = 2;
        a0D[] a0DArray = a3c_0.f(this.y);
        if (a0DArray.length > 18) {
            n8 = a0DArray.length / 9 + 1;
        }
        if ((n = 0) < a0DArray.length) {
            a0D a0D2 = a0DArray[n];
            if (mk_0.e(a0D2)) {
                int n9 = n % n8;
                int n10 = n / n8;
                int n11 = MathInvoker.b(this.n / n8, 200);
                n3 = (this.n - n11 * n8) / 2;
                int n12 = n9 * n11 + 5 + n3;
                int n13 = n4 + n10 * n5;
                int n14 = n11 - 10;
                String string = this.a(a0D2, n14);
                Q0 q0 = new Q0(n2 + n, n12, n13, n14, n7, a0D2, string);
                q0.g = mk_0.n(a0D2);
                ListInvoker.add(this.l, q0);
            }
            ++n;
        }
        ListInvoker.add(this.l, new QG(201, this.n / 2 - n6 - 20, this.f / 6 + 168 + 11, n6, n7, I18n.format(aGN.s, new Object[0])));
        ListInvoker.add(this.l, new QG(200, this.n / 2 + 20, this.f / 6 + 168 + 11, n6, n7, I18n.format(aGN.m, new Object[0])));
    }

    private String[] b(a0D a0D2, int n) {
        Object object;
        a0D.k();
        if (a0D2 instanceof a0a_0) {
            return null;
        }
        String string = mk_0.k(a0D2);
        String string2 = StringInvoker.h(ys_2.b(mk_0.g(a0D2)));
        Object[] objectArray = this.a(string2);
        String string3 = null;
        if (!string.equals(mk_0.i(a0D2)) && this.D.bm) {
            string3 = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aGN.u), IN.a(aGN.o)), aGN.t), mk_0.i(a0D2)).toString();
        }
        String string4 = null;
        if (mk_0.m(a0D2) != null && this.D.bm) {
            string4 = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aGN.a), IN.a(aGN.b)), aGN.h), ys_2.a(mk_0.m(a0D2))).toString();
        }
        String string5 = null;
        if (mk_0.o(a0D2) != null && this.D.bm) {
            object = mk_0.n(a0D2) ? mk_0.c(a0D2, mk_0.o(a0D2)) : IN.a(aGN.c);
            string5 = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aGN.i), IN.c()), aGN.e), (String)object).toString();
        }
        object = new ArrayList();
        ListInvoker.add(object, string);
        ListInvoker.addAll(object, a7r_0.a(objectArray));
        if (string3 != null) {
            ListInvoker.add((List)object, string3);
        }
        if (string4 != null) {
            ListInvoker.add((List)object, string4);
        }
        if (string5 != null) {
            ListInvoker.add((List)object, string5);
        }
        String[] stringArray = this.a(n, (List<String>)object);
        return stringArray;
    }
}


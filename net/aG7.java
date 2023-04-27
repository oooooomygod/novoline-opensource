/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.visual.HUD;
import deobf.ModuleRegistry;
import java.awt.Color;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.LinkOption;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class aG7 {
    private double g;
    private String f;
    private boolean h;
    private double b;
    private rj_0 e;
    private double a;
    private boolean d;
    private double c;

    public aG7(rj_0 rj_02, String string, boolean bl) {
        this.f = string;
        this.d = bl;
        this.e = rj_02;
    }

    public boolean a() {
        return this.d;
    }

    public boolean a(int n, int n2) {
        kr_1.b();
        return (double)n >= this.b && (double)n <= this.b + this.a - 22.0 && (double)n2 >= this.g && (double)n2 <= this.g + 25.0;
    }

    /*
     * Unable to fully structure code
     */
    public void a(int var1_1, int var2_2, int var3_3) {
        block3: {
            kr_1.b();
            if (var1_1 != 0) break block3;
            v0 = var2_2;
            v1 = this.h != false ? 44 : 36;
            if (!(v0 >= this.b + this.a - (double)v1)) ** GOTO lbl-1000
            v2 = var2_2;
            v3 = this.h != false ? 25 : 17;
            if (v2 <= this.b + this.a - (double)v3 && (double)var3_3 >= this.g + 4.0 && (double)var3_3 <= this.g + 21.0) {
                v4 = true;
            } else lbl-1000:
            // 2 sources

            {
                v4 = var5_4 = false;
            }
            if (this.a(var2_2, var3_3)) {
                var6_5 = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
                cw_2.a(var6_5, this.f);
                StringPropertyInvoker.b(cw_2.j(var6_5), KL.i);
                cw_2.z(var6_5);
            }
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public String b() {
        String[] stringArray = StringInvoker.g(this.f, ow_1.a(KL.b));
        return StringInvoker.a(stringArray[stringArray.length - 1], (CharSequence)KL.e, (CharSequence)KL.d);
    }

    public void a(boolean bl) {
        kr_1.b();
        if (aev_1.b(da_0.a(aXR.a(this.e), new String[0]), new LinkOption[0])) {
            Object object;
            block20: {
                String string;
                Iterator iterator;
                CopyOnWriteArrayList copyOnWriteArrayList;
                block18: {
                    block19: {
                        Scanner scanner;
                        if (bl) {
                            block17: {
                                copyOnWriteArrayList = new CopyOnWriteArrayList();
                                scanner = null;
                                try {
                                    scanner = new Scanner(da_0.a(aXR.a(this.e), new String[0]));
                                    if (GL.b(scanner)) {
                                        ListInvoker.add(copyOnWriteArrayList, GL.a(scanner));
                                    }
                                }
                                catch (IOException iOException) {
                                    a4E.b(iOException);
                                }
                                object = null;
                                object = new FileWriter(aXR.a(this.e));
                                iterator = ListInvoker.iterator(copyOnWriteArrayList);
                                if (!dz_0.c(iterator)) break block17;
                                string = (String)dz_0.b(iterator);
                                a4e_0.a(l2.a((FileWriter)object, (CharSequence)string), (CharSequence)KL.a);
                            }
                            try {
                                l2.a((FileWriter)object, (CharSequence)this.f);
                                l2.a((FileWriter)object);
                            }
                            catch (IOException iOException) {
                                a4E.b(iOException);
                            }
                        }
                        ea_1.a(System.out, aL0.a(aL0.a(new StringBuilder(), this.f), KL.h).toString());
                        copyOnWriteArrayList = new CopyOnWriteArrayList();
                        scanner = null;
                        scanner = new Scanner(da_0.a(aXR.a(this.e), new String[0]));
                        if (!GL.b(scanner)) break block18;
                        object = GL.a(scanner);
                        if (((String)object).equals(this.f)) break block19;
                        ListInvoker.add(copyOnWriteArrayList, object);
                    }
                    try {
                        ea_1.a(System.out, aL0.a(aL0.a(new StringBuilder(), KL.k), (String)object).toString());
                    }
                    catch (IOException iOException) {
                        a4E.b(iOException);
                    }
                }
                try {
                    aev_1.b(da_0.a(aXR.a(this.e), new String[0]));
                }
                catch (IOException iOException) {
                    a4E.b(iOException);
                }
                object = null;
                object = new FileWriter(aXR.a(this.e));
                iterator = ListInvoker.iterator(copyOnWriteArrayList);
                if (!dz_0.c(iterator)) break block20;
                string = (String)dz_0.b(iterator);
                ea_1.a(System.out, aL0.a(aL0.a(new StringBuilder(), KL.j), string).toString());
                a4e_0.a(l2.a((FileWriter)object, (CharSequence)string), (CharSequence)KL.l);
            }
            try {
                l2.a((FileWriter)object);
            }
            catch (IOException iOException) {
                a4E.b(iOException);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public void a(int var1_1, int var2_2, double var3_3, double var5_4, double var7_5, double var9_6, boolean var11_7) {
        this.a = var3_3;
        this.c = var5_4;
        var12_8 = kr_1.a();
        this.b = var7_5;
        this.g = var9_6;
        this.h = var11_7;
        a1V.b(var7_5, var9_6, var7_5 + var3_3 - (double)(var11_7 != false ? 22 : 14), var9_6 + 25.0, this.a(var1_1, var2_2) != false ? aol_1.b(new Color(65, 65, 65)) : aol_1.b(new Color(45, 45, 45)));
        a1V.b(var7_5 + 1.0, var9_6 + 1.0, var7_5 + var3_3 - (double)(var11_7 != false ? 23 : 15), var9_6 + 24.0, aol_1.b(new Color(20, 20, 20)));
        var13_9 = StringInvoker.g(this.f, ow_1.a(KL.c));
        a7l_0.b(azo_0.a, StringInvoker.a(var13_9[var13_9.length - 1], (CharSequence)KL.m, (CharSequence)KL.f), var7_5 + 5.0, var9_6 + 9.0, -1, true);
        v0 = var1_1;
        v1 = var11_7 != false ? 44 : 36;
        if (!(v0 >= var7_5 + var3_3 - (double)v1)) ** GOTO lbl-1000
        v2 = var1_1;
        v3 = var11_7 != false ? 25 : 17;
        if (v2 <= var7_5 + var3_3 - (double)v3 && (double)var2_2 >= var9_6 + 4.0 && (double)var2_2 <= var9_6 + 21.0) {
            v4 = true;
        } else lbl-1000:
        // 2 sources

        {
            v4 = false;
        }
        var14_10 = v4;
        var15_11 = new Color(255, 203, 23);
        a7l_0.b(ai3_0.a, KL.g, var7_5 + var3_3 - (double)(var11_7 != false ? 42 : 34), var9_6 + 7.0, this.d != false ? aol_1.b(var15_11) : aol_1.b(new Color(64, 64, 64)), true);
        if (ListInvoker.b() != null) {
            kr_1.b(++var12_8);
        }
    }
}


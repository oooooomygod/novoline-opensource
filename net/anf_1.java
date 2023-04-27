/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 */
package net;

import cc.novoline.invoke.KeyboardInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.modules.AbstractModule;
import deobf.MCInvoker;
import deobf.ModuleHolder;
import deobf.TimerUtil;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.awt.Color;
import java.util.Iterator;
import java.util.regex.Matcher;
import net.ICommandSender;
import net.NetworkPlayerInfo;
import net.aBO;
import net.aL0;
import net.aNL;
import net.ae6_0;
import net.aen_2;
import net.age_2;
import net.akk_0;
import net.alj_1;
import net.aoc_1;
import net.auh_2;
import net.avk_1;
import net.dz_0;
import net.ow_1;
import net.uw_0;
import net.wc_1;
import net.wk_2;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.anF
 */
public class anf_1 {
    private static Color g;
    private static Color c;
    private static Color p;
    private static Color a;
    private static Color l;
    private static Color n;
    private static Color e;
    private static Color q;
    private static Color h;
    private static Color k;
    private static Color i;
    private static Color m;
    private static int r;
    private static Color j;
    private static Color d;
    private static Color b;
    private static Color f;
    private static Color o;

    public static boolean a(@NotNull ICommandSender iCommandSender, NetworkPlayerInfo networkPlayerInfo) {
        TimerUtil.e();
        String string = aL0.a(aL0.a(new StringBuilder(), avk_1.v), anf_1.a(iCommandSender)).toString();
        return StringInvoker.a(aBO.a(alj_1.c(iCommandSender)), (CharSequence)string) && StringInvoker.a(aBO.a(aNL.j(networkPlayerInfo)), (CharSequence)string);
    }

    public static Color c(@NotNull ICommandSender iCommandSender) {
        String string;
        String string2 = string = anf_1.a(iCommandSender);
        TimerUtil.e();
        int n = -1;
        switch (string2.hashCode()) {
            case 48: {
                if (!string2.equals(avk_1.b)) break;
                n = 0;
            }
            case 49: {
                if (!string2.equals(avk_1.i)) break;
                n = 1;
            }
            case 50: {
                if (!string2.equals(avk_1.l)) break;
                n = 2;
            }
            case 51: {
                if (!string2.equals(avk_1.j)) break;
                n = 3;
            }
            case 52: {
                if (!string2.equals(avk_1.e)) break;
                n = 4;
            }
            case 53: {
                if (!string2.equals(avk_1.n)) break;
                n = 5;
            }
            case 54: {
                if (!string2.equals(avk_1.k)) break;
                n = 6;
            }
            case 55: {
                if (!string2.equals(avk_1.t)) break;
                n = 7;
            }
            case 56: {
                if (!string2.equals(avk_1.q)) break;
                n = 8;
            }
            case 57: {
                if (!string2.equals(avk_1.f)) break;
                n = 9;
            }
            case 97: {
                if (!string2.equals(avk_1.d)) break;
                n = 10;
            }
            case 98: {
                if (!string2.equals(avk_1.w)) break;
                n = 11;
            }
            case 99: {
                if (!string2.equals(avk_1.a)) break;
                n = 12;
            }
            case 100: {
                if (!string2.equals(avk_1.p)) break;
                n = 13;
            }
            case 101: {
                if (!string2.equals(avk_1.c)) break;
                n = 14;
            }
            case 102: {
                if (!string2.equals(avk_1.r)) break;
                n = 15;
            }
            case 103: {
                if (!string2.equals(avk_1.o)) break;
                n = 16;
            }
        }
        return new Color(100, 100, 100, 100);
    }

    public static boolean a(@NotNull ICommandSender iCommandSender, @NotNull ICommandSender iCommandSender2) {
        TimerUtil.e();
        String string = aL0.a(aL0.a(new StringBuilder(), avk_1.s), anf_1.a(iCommandSender)).toString();
        return StringInvoker.a(aBO.a(alj_1.c(iCommandSender)), (CharSequence)string) && StringInvoker.a(aBO.a(alj_1.c(iCommandSender2)), (CharSequence)string);
    }

    public static boolean a(NetworkPlayerInfo networkPlayerInfo) {
        TimerUtil.e();
        return MCInvoker.f().player != null && anf_1.a((ICommandSender)MCInvoker.f().player, networkPlayerInfo);
    }

    public static boolean b(@NotNull ICommandSender iCommandSender) {
        TimerUtil.e();
        return MCInvoker.f().player != null && anf_1.a((ICommandSender)MCInvoker.f().player, iCommandSender);
    }

    public static boolean a(String string) {
        TimerUtil.e();
        return MCInvoker.f().player != null && anf_1.a((ICommandSender)MCInvoker.f().player, string);
    }

    public static boolean a(@NotNull ICommandSender iCommandSender, String string) {
        TimerUtil.e();
        String string2 = aL0.a(aL0.a(new StringBuilder(), avk_1.g), anf_1.a(iCommandSender)).toString();
        return StringInvoker.a(aBO.a(alj_1.c(iCommandSender)), (CharSequence)string2) && StringInvoker.a(string, (CharSequence)string2);
    }

    public static void a() {
        TimerUtil.e();
        if (KeyboardInvoker.getEventKey()) {
            ModuleHolder moduleHolder;
            AbstractModule abstractModule;
            int n = KeyboardInvoker.b() == 0 ? KeyboardInvoker.getEventCharacter() + 256 : KeyboardInvoker.b();
            ObjectIterator objectIterator = uw_0.b(aen_2.c(NovolineInvoker.l(NovolineInvoker.getInstance())).values());
            if (dz_0.c((Iterator)objectIterator) && aoc_1.a(wc_1.h(abstractModule = akk_0.b(moduleHolder = (ModuleHolder)dz_0.b((Iterator)objectIterator)))) instanceof auh_2 && age_2.a((ae6_0)aoc_1.a(wc_1.h(abstractModule))) == n) {
                if (KeyboardInvoker.a(n)) {
                    ++r;
                }
                if (r == 1) {
                    wc_1.k(abstractModule);
                }
            }
        }
        r = 0;
    }

    @NotNull
    public static String a(@NotNull ICommandSender iCommandSender) {
        TimerUtil.e();
        Matcher matcher = ow_1.a(ow_1.c(avk_1.h), aBO.a(alj_1.c(iCommandSender)));
        return wk_2.c(matcher) ? wk_2.b(matcher, 1) : avk_1.m;
    }

    @Contract(value="-> fail", pure=true)
    private anf_1() {
        throw new UnsupportedOperationException(avk_1.u);
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }

    static {
        l = new Color(0, 0, 0);
        d = new Color(0, 0, 170);
        e = new Color(0, 170, 0);
        q = new Color(0, 170, 170);
        o = new Color(170, 0, 0);
        f = new Color(170, 0, 170);
        g = new Color(255, 170, 0);
        p = new Color(170, 170, 170);
        i = new Color(85, 85, 85);
        j = new Color(85, 85, 255);
        b = new Color(85, 255, 85);
        c = new Color(85, 255, 255);
        h = new Color(255, 85, 85);
        m = new Color(255, 85, 255);
        n = new Color(255, 255, 85);
        a = new Color(255, 255, 255);
        k = new Color(221, 214, 5);
    }
}


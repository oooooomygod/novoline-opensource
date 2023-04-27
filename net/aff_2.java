/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GameSettingsInvoker;
import cc.novoline.invoke.KeyboardInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.utils.fonts.api.FontRenderer;
import cc.novoline.modules.visual.HUD;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;

/*
 * Renamed from net.aff
 */
public class aff_2 {
    private double h;
    private static String j;
    private double c;
    private double a;
    private double b;
    private List<jr_2> d;
    private aII f;
    private static long i;
    private String e;
    HUD g;

    private void lambda$drawKey$0(jr_2 jr_22) {
        aee_0.a(jr_22, this.h + this.c / 2.0, this.a + this.b / 2.0, hb_2.a(0L));
    }

    private static String a(byte[] byArray) {
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

    private static boolean lambda$drawKey$1(jr_2 jr_22) {
        HUD.j();
        return jr_2.a(jr_22) <= 0;
    }

    public void b() {
        FontRenderer fontRenderer = adj_1.a(HUD.d(this.g), 23);
        this.a(true, new Color(0, 0, 0, P8.b((Integer)adt_2.a(HUD.c(this.g)))));
        a7l_0.b(fontRenderer, this.e, this.h + this.c / 2.0 - (double)(a7l_0.a(fontRenderer, this.e) / 2) - 0.5, this.a + this.b / 2.0 - (double)(a7l_0.a(fontRenderer) / 2), 0xFFFFFF, true);
        adp_0.b(false);
        this.a(false, Color.BLACK);
        adp_0.a(true);
        ListInvoker.forEach(this.d, this::lambda$drawKey$0);
        adp_0.a();
        ListInvoker.removeIf(this.d, aff_2::lambda$drawKey$1);
    }

    public aff_2(short s, HUD hUD, short s3, String string, double d, double d2, double d3, double d4, int n) {
        long cfr_ignored_0 = ((long)s << 48 | (long)s3 << 48 >>> 16 | (long)n << 32 >>> 32) ^ i;
        this.g = hUD;
        this.d = new ArrayList<jr_2>();
        this.h = d;
        this.a = d2;
        this.c = d3;
        this.b = d4;
        this.e = string;
        this.f = this.e.equals(j) ? HUD.a((HUD)hUD).gameSettings.G : HUD.e((HUD)hUD).gameSettings.aj;
    }

    public void a(boolean bl, Color color) {
        HUD.t();
        aV3.a(aV3.a(), this.h, this.a, this.c, this.b, db_0.b((Double)MD.b(HUD.f(this.g))), (double)P8.b((Integer)adt_2.a(HUD.b(this.g))), color, true);
        a1V.a(this.h, this.a, this.c, this.b, db_0.b((Double)MD.b(HUD.f(this.g))) / 2.0, 1.0f, aol_1.b(color), 0);
    }

    public void a() {
        ListInvoker.add(this.d, new jr_2(this, P8.b((Integer)adt_2.a(HUD.c(this.g)))));
    }

    public aff_2(HUD hUD, aII aII2, double d, double d2, double d3, double d4) {
        this.g = hUD;
        this.d = new ArrayList<jr_2>();
        this.f = aII2;
        this.h = d;
        this.a = d2;
        this.c = d3;
        this.b = d4;
        this.e = KeyboardInvoker.b(GameSettingsInvoker.getKeyCode(aII2));
    }

    static {
        i = a1c.a(2172776309967144306L, -2367385844560107050L, MethodHandles.lookup().lookupClass()).a(189045871978089L);
        long l4 = i ^ 0x157DD6529EBFL;
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

    static aII a(aff_2 aff_22) {
        return aff_22.f;
    }

    static List b(aff_2 aff_22) {
        return aff_22.d;
    }
}


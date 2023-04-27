/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import java.util.List;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.yo
 */
public class yo_2 {
    public static int n = 8;
    public static int j = 8;
    public static int a = 8;
    public int c;
    public static int e = 8;
    public static int k = 64;
    public static int l = 64;
    private RO g = new RO(this);
    public static int f = 8;
    public static int b = 8;
    public static int i = 40;
    public int d;
    public static int m = 8;
    protected Minecraft h;

    public void a(int n, int n2, int n3, int n4, int n5, int n6) {
        zx_1.a(this.g, n, n2, n3, n4, n5, n6);
    }

    public RO k() {
        return this.g;
    }

    public void a(String string, int n, int n2) {
        zx_1.a(this.g, string, n, n2);
    }

    public static mf_2 a(int n, int n2, int n3, int n4, int n5, String string) {
        return new mf_2(n, n2, n3, n4, n5, string);
    }

    public List<String> a(String string, int n) {
        return zx_1.a(this.g, string, n);
    }

    public int h() {
        return zx_1.a(this.g);
    }

    public void b(int n, int n2, int n3) {
    }

    public void a(String string, int n, int n2, int n3) {
        zx_1.c(this.g, string, n, n2, n3);
    }

    public static void a(int n, int n2, float f, float f2, int n3, int n4, int n5, int n6, float f3, float f4) {
        wh_1.a(n, n2, f, f2, n3, n4, n5, n6, f3, f4);
    }

    public void e() {
    }

    public void a(ItemStack itemStack, int n, int n2) {
        zx_1.a(this.g, itemStack, n, n2);
    }

    public int n() {
        return this.g.n;
    }

    public void c(String string, int n, int n2, int n3) {
        zx_1.a(this.g, string, n, n2, n3);
    }

    public void c(mf_2 mf_22) {
    }

    public void m() {
    }

    public void j() {
        zx_1.f(this.g);
    }

    public ai0 a(int n, int n2, int n3, int n4, int n5) {
        return new ai0(n, n2, n3, n4, n5);
    }

    public List<mf_2> a() {
        return zx_1.e(this.g);
    }

    public aff_0 l() {
        return new aff_0(MCInvoker.P(MCInvoker.f()));
    }

    public void b(String string, int n, int n2, int n3) {
        zx_1.b(this.g, string, n, n2, n3);
    }

    public void a(Minecraft minecraft, int n, int n2) {
    }

    public static String a(String string, Object ... objectArray) {
        return I18n.format(string, objectArray);
    }

    public int c() {
        return this.g.f;
    }

    public void d() {
    }

    public void a(List<String> list, int n, int n2) {
        zx_1.a(this.g, list, n, n2);
    }

    public static void a(String string, String string2) {
        ResourceLocation resourceLocation = aUi.a(string2);
        resourceLocation = af__0.a(WZ.a(string));
        aUi.a(resourceLocation, string2);
        TextureManagerInvoker.bindTexture(MCInvoker.E(MCInvoker.f()), resourceLocation);
    }

    public int a(String string) {
        return zx_1.a(this.g, string);
    }

    public void b(mf_2 mf_22) {
        zx_1.a(this.g, mf_22);
    }

    public static mf_2 a(int n, int n2, int n3, String string) {
        return new mf_2(n, n2, n3, string);
    }

    public void a(boolean bl, int n) {
    }

    public static String c(String string) {
        return I18n.format(string, new Object[0]);
    }

    public void a(int n, int n2, float f) {
        for (int i = 0; i < ListInvoker.size(zx_1.e(this.g)); ++i) {
            T3.d((mf_2)ListInvoker.get(zx_1.e(this.g), i), n, n2);
        }
    }

    public void a(int n, int n2, int n3) {
    }

    public void b(int n, int n2, int n3, int n4, int n5, int n6) {
        zx_1.b(this.g, n, n2, n3, n4, n5, n6);
    }

    public static void a(int n, int n2, float f, float f2, int n3, int n4, float f3, float f4) {
        wh_1.a(n, n2, f, f2, n3, n4, f3, f4);
    }

    public void a(int n) {
        zx_1.a(this.g, n);
    }

    public void g() {
    }

    public static void b(String string) {
        ResourceLocation resourceLocation = new ResourceLocation(string);
        TextureManagerInvoker.bindTexture(MCInvoker.E(MCInvoker.f()), resourceLocation);
    }

    public void a(int n, int n2, int n3, long l4) {
    }

    public void i() {
    }

    public boolean b() {
        return zx_1.d(this.g);
    }

    public void a(mf_2 mf_22) {
        zx_1.b(this.g, mf_22);
    }

    public void a(char c, int n) {
    }

    public void f() {
        zx_1.c(this.g);
    }
}


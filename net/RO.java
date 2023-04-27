/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.GuiScreen;
import net.minecraft.item.ItemStack;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class RO
extends GuiScreen {
    private yo_2 v;

    @Override
    public void g() {
        dz_1.f(this.v);
        super.g();
    }

    @Override
    public void b(int n, int n2, int n3, int n4, int n5, int n6) {
        super.b(n, n2, n3, n4, n5, n6);
    }

    public void c(String string, int n, int n2, int n3) {
        super.b(this.q, string, n, n2, n3);
    }

    @Override
    public void c(int n, int n2, int n3, int n4, int n5, int n6) {
        dz_1.a(this.v, n, n2, n3, n4, n5, n6);
        super.c(n, n2, n3, n4, n5, n6);
    }

    @Override
    public void a(int n, int n2, int n3, long l4) {
        dz_1.a(this.v, n, n2, n3, l4);
    }

    public int a(String string) {
        return FontRendererInvoker.a(this.q, string);
    }

    public void a(mf_2 mf_22) {
        ListInvoker.remove(this.l, mf_22);
    }

    public void a(String string, int n, int n2, int n3) {
        FontRendererInvoker.drawStringWithShadow(this.q, string, n, n2, n3);
    }

    @Override
    public void a(int n, int n2, float f) {
        dz_1.a(this.v, n, n2, f);
    }

    @Override
    public void c() throws IOException {
        dz_1.d(this.v);
        super.c();
    }

    @Override
    public void l() {
        dz_1.e(this.v);
        super.l();
    }

    @Override
    public void a(int n, int n2, int n3) {
        this.v.b(n, n2, n3);
    }

    public RO(yo_2 yo_22) {
        this.v = yo_22;
        this.l = asg_0.c(my_0.c());
    }

    @Override
    public void a(QG qG) throws IOException {
        dz_1.a(this.v, xc_1.c((QF)qG));
    }

    @Override
    public void a(String string, int n, int n2) {
        super.a(string, n, n2);
    }

    @Override
    public void d(int n) {
        super.d(n);
    }

    public yo_2 a() {
        return this.v;
    }

    @Override
    public void a(ItemStack itemStack, int n, int n2) {
        super.a(itemStack, n, n2);
    }

    @Override
    public boolean d() {
        return super.d();
    }

    public void b() {
        ListInvoker.clear(this.l);
    }

    public List<String> a(String string, int n) {
        return FontRendererInvoker.b(this.q, string, n);
    }

    @Override
    public void i() {
        dz_1.a(this.v);
        super.i();
    }

    public void b(mf_2 mf_22) {
        ListInvoker.add(this.l, T3.b(mf_22));
    }

    public int c() {
        return FontRendererInvoker.d(this.q);
    }

    @Override
    public void h() {
        super.h();
    }

    @Override
    public void b(int n, int n2, int n3) throws IOException {
        this.v.a(n, n2, n3);
        super.b(n, n2, n3);
    }

    @Override
    public void f() throws IOException {
        dz_1.b(this.v);
        super.f();
    }

    @Override
    public void a(List<String> list, int n, int n2) {
        super.a(list, n, n2);
    }

    public void b(String string, int n, int n2, int n3) {
        super.a(this.q, string, n, n2, n3);
    }

    @Override
    public void a(char c, int n) throws IOException {
        dz_1.a(this.v, c, n);
    }

    public List<mf_2> d() {
        ArrayList arrayList = my_0.a(ListInvoker.size(this.l));
        Iterator iterator = ListInvoker.iterator(this.l);
        while (dz_0.c(iterator)) {
            QG qG = (QG)dz_0.b(iterator);
            ListInvoker.add(arrayList, xc_1.c((QF)qG));
        }
        return arrayList;
    }

    @Override
    public void a(boolean bl, int n) {
        dz_1.a(this.v, bl, n);
    }
}


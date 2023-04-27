/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.utils.fonts.api;

public interface FontRenderer {
    public String c();

    default public void a(CharSequence charSequence, double d, double d2, int n, boolean bl, boolean bl2) {
        this.b(charSequence, d - (double)((float)this.a(charSequence) / 2.0f), d2, n, bl, bl2);
    }

    public int b();

    public void a(CharSequence var1, double var2, double var4, int var6, float var7, boolean var8);

    default public void a(CharSequence charSequence, double d, double d2, int n, float f) {
        this.a(charSequence, d - (double)((float)this.a(charSequence) / 2.0f), d2, n, f, false);
    }

    public boolean e();

    public String a(CharSequence var1, int var2, boolean var3);

    public void b(CharSequence var1, double var2, double var4, int var6, float var7);

    default public void a(CharSequence charSequence, float f, float f2, int n, boolean bl) {
        this.b(charSequence, (double)(f - (float)this.a(charSequence) / 2.0f), (double)f2, n, bl, false);
    }

    default public void a(CharSequence charSequence, double d, double d2, int n) {
        this.b(charSequence, d, d2, n, false, false);
    }

    public void b(CharSequence var1, double var2, double var4, int var6, boolean var7, boolean var8);

    default public void a(CharSequence charSequence, float f, float f2, int n, boolean bl, boolean bl2) {
        this.b(charSequence, (double)(f - (float)this.a(charSequence) / 2.0f), (double)f2, n, bl, bl2);
    }

    default public String a(CharSequence charSequence, int n) {
        return this.a(charSequence, n, false);
    }

    default public void a(CharSequence charSequence, double d, double d2, int n, boolean bl) {
        this.b(charSequence, d - (double)((float)this.a(charSequence) / 2.0f), d2, n, bl, false);
    }

    public void b(CharSequence var1, double var2, double var4, int var6, boolean var7);

    default public void b(CharSequence charSequence, double d, double d2, int n, float f, boolean bl) {
        this.a(charSequence, d - (double)((float)this.a(charSequence) / 2.0f), d2, n, f, bl);
    }

    public boolean d();

    default public void a(CharSequence charSequence, float f, float f2, int n) {
        this.b(charSequence, (double)f, (double)f2, n, false, false);
    }

    public double a();

    public double a(char var1);

    public int a(CharSequence var1);
}


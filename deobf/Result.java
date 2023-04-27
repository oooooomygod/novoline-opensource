/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package deobf;

import cc.novoline.invoke.StringInvoker;
import org.jetbrains.annotations.NotNull;

public class Result
implements Comparable {
    public String c;
    public double field_76332_a;
    private static String d;
    public double a;

    public int a() {
        return (this.c.hashCode() & 0xAAAAAA) + 0x444444;
    }

    public Result(String string, double d, double d2) {
        this.c = string;
        this.field_76332_a = d;
        this.a = d2;
    }

    public int compareTo(@NotNull Object object) {
        return this.a((Result)object);
    }

    public int a(Result result) {
        return result.field_76332_a < this.field_76332_a ? -1 : (result.field_76332_a > this.field_76332_a ? 1 : StringInvoker.i(result.c, this.c));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = ")]\u0014MF/t[%rE".toCharArray();
        int n2 = 0;
        int n3 = 39;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x4D));
            n3 = n3;
        }
    }
}


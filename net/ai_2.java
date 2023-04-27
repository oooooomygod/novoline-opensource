/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.ai
 */
public class ai_2 {
    public static String c = " ";
    public static String d = "";
    private static long e = a1c.a(-68707619380593565L, -2628561386063891343L, null).a(126258842793790L);
    private static String f = "the elder scrolls klaatu berata niktu xyzzy bless curse light darkness fire air earth water hot dry cold wet ignite snuff embiggen twist shorten stretch fiddle destroy imbue galvanize enchant free limited range of towards inside sphere cube self other ball mental physical grow shrink demon elemental spirit animal creature beast humanoid undead fresh stale ";
    public static String a = "the elder scrolls klaatu berata niktu xyzzy bless curse light darkness fire air earth water hot dry cold wet ignite snuff embiggen twist shorten stretch fiddle destroy imbue galvanize enchant free limited range of towards inside sphere cube self other ball mental physical grow shrink demon elemental spirit animal creature beast humanoid undead fresh stale ";
    public static String b = " ";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = e ^ 0x6B12E90940AL;
        long l5 = l4 ^ 0x234CFC35A731L;
        long cfr_ignored_0 = l5 >>> 32;
        int cfr_ignored_1 = (int)(l5 << 32 >>> 32);
        char[] cArray = "+zB9\nc\":`\u0007j\f})3~T9\u0004c'>fR9\rj4>fF9\u0001f-+g\u0007a\u0016u<&2Eu\n|5\u007fqRk\u001cjf3{@q\u001b/\">`Lw\n|5\u007ftNk\n/'6`\u0007|\u000e}272Px\u001bj4\u007fzHmOk4&2Dv\u0003kf(wS9\u0006h(6fB9\u001ca39t\u0007|\u0002m/8uBwO{16aS9\u001cg)-fBwO|2-wSz\u0007/ 6vCu\n/\":aSk\u0000vf6\u007fEl\n/!>~Qx\u0001f<:2Bw\fg'1f\u0007\u007f\u001dj#\u007f~Nt\u0006{#;2Ux\u0001h#\u007f}A9\u001b`1>`CjOf(,{C|O|67wU|Ol3=w\u0007j\nc \u007f}Sq\n}f=sKuOb#1fFuO\u007f.&aNz\u000ecf8`HnO|.-{IrOk#2}I9\nc#2wIm\u000ecf,bNk\u0006{f>|Nt\u000ecf<`Bx\u001bz4:2E|\u000e|2\u007fzRt\u000ea)6v\u0007l\u0001k#>v\u0007\u007f\u001dj572Tm\u000ec#\u007f".toCharArray();
        int n = 0;
        int n2 = 93;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 2));
            n2 = n2;
        }
    }

    public static void b(long l4, int n) {
        long cfr_ignored_0 = (l4 << 32 | (long)n << 32 >>> 32) ^ e;
        a = f;
        d = "";
        b = " ";
        c = " ";
    }
}


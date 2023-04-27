/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.avI
 */
public class avi_1 {
    public static String F = "5";
    public static String Y = "potion.prefix.potent";
    public static String p = "potion.prefix.odorless";
    public static String s = "potion.prefix.debonair";
    public static String R = "!0 & 1 & 2 & 3 & 2+6";
    public static String d = "potion.prefix.cordial";
    public static String L = "!0 & 1 & !2 & 3 & 3+6";
    public static String e = "5";
    public static String T = "0 & 1 & !2 & 3 & 3+6";
    private static String[] db;
    public static String E = "potion.prefix.gross";
    public static String o = "!0 & !1 & 2 & !3 & 2+6";
    public static String g = "potion.prefix.thick";
    public static String D = "potion.prefix.awkward";
    public static String a = "potion.prefix.flat";
    public static String l = "potion.prefix.stinky";
    public static String B = "potion.prefix.smooth";
    private static String[] cb;
    public static String K = "0 & !1 & !2 & 3 & 3+6";
    public static String O = "potion.prefix.diffuse";
    public static String b = "5";
    public static String t = "potion.prefix.artless";
    public static String v = "5";
    public static String U = "potion.prefix.suave";
    public static String k = "potion.prefix.bungling";
    public static String M = "5";
    public static String Z = "!0 & 1 & !2 & !3 & 1+6";
    public static String I = "potion.prefix.fancy";
    public static String f = "potion.prefix.charming";
    public static String ab = "potion.prefix.milky";
    public static String m = "potion.prefix.mundane";
    public static String y = "potion.prefix.refined";
    public static String N = "!0 & !1 & !2 & 3 & 3+6";
    public static String i = "potion.prefix.foul";
    public static String S = "potion.prefix.bulky";
    public static String n = "0 & !1 & 2 & 3 & 2+6";
    public static String G = "potion.prefix.harsh";
    public static String c = "potion.prefix.uninteresting";
    public static String W = "potion.prefix.clear";
    public static String X = "0 & 1 & !2 & !3 & 0+6";
    public static String A = "potion.prefix.sparkling";
    public static String aa = "!0 & 1 & 2 & !3 & 2+6";
    public static String V = "potion.prefix.acrid";
    public static String Q = "potion.prefix.buttered";
    public static String q = "5";
    public static String x = "potion.prefix.dashing";
    public static String C = "potion.prefix.thin";
    private static long bb;
    public static String w = "0 & !1 & 2 & !3";
    public static String J = "potion.prefix.rank";
    public static String H = "5";
    public static String P = "5";
    public static String z = "0 & !1 & !2 & !3 & 0+6";
    public static String h = "!0 & !1 & 2 & 3";
    public static String r = "5";
    public static String j = "potion.prefix.elegant";
    public static String u = "potion.prefix.bland";

    public static void b(int n, char c, int n2) {
        long l4 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ bb;
        m = avi_1.a(-666510853, 666513553, (int)l4);
        k = avi_1.a(-666510849, 666490950 + (char)-31750, (int)l4);
        w = avi_1.a(-666510854, -666490950 + -((char)-26389), (int)l4);
        A = avi_1.a(-666510886, 666505770, (int)l4);
        aa = avi_1.a(-666510878, -666490950 + -((char)-25735), (int)l4);
        B = avi_1.a(-666510895, 666514938, (int)l4);
        q = "5";
        z = avi_1.a(-666510873, 666490950 + (char)-27874, (int)l4);
        j = avi_1.a(-666510887, -666490950 + -((char)-24549), (int)l4);
        F = "5";
        f = avi_1.a(-666510867, -666490950 + -((char)-26735), (int)l4);
        J = avi_1.a(-666510881, -666521198, (int)l4);
        h = avi_1.a(-666510889, -666507828, (int)l4);
        R = avi_1.a(-666510896, -666490950 + -((char)-28062), (int)l4);
        x = avi_1.a(-666510858, -666502311, (int)l4);
        Y = avi_1.a(-666510890, -666502552, (int)l4);
        E = avi_1.a(-666510860, 666490950 + (char)-27311, (int)l4);
        U = avi_1.a(-666510866, -666490950 + -((char)-31846), (int)l4);
        s = avi_1.a(-666510868, 666507410, (int)l4);
        S = avi_1.a(-666510891, -666490950 + -((char)-23272), (int)l4);
        P = "5";
        u = avi_1.a(-666510861, -666490950 + -((char)-27368), (int)l4);
        b = "5";
        avi_1.n = avi_1.a(-666510876, -666490950 + -((char)-26027), (int)l4);
        r = "5";
        y = avi_1.a(-666510888, -666490950 + -((char)-28644), (int)l4);
        Z = avi_1.a(-666510871, 666507631, (int)l4);
        i = avi_1.a(-666510869, -666511388, (int)l4);
        g = avi_1.a(-666510863, 666505708, (int)l4);
        L = avi_1.a(-666510879, -666511500, (int)l4);
        d = avi_1.a(-666510872, -666490950 + -((char)-31577), (int)l4);
        p = avi_1.a(-666510892, 666516716, (int)l4);
        N = avi_1.a(-666510855, 666521072, (int)l4);
        a = avi_1.a(-666510852, 666512663, (int)l4);
        M = "5";
        v = "5";
        X = avi_1.a(-666510874, 666510496, (int)l4);
        l = avi_1.a(-666510862, 666513331, (int)l4);
        T = avi_1.a(-666510894, 666504018, (int)l4);
        D = avi_1.a(-666510877, -666490950 + -((char)-30213), (int)l4);
        C = avi_1.a(-666510870, 666501208, (int)l4);
        O = avi_1.a(-666510850, 666490950 + (char)-30840, (int)l4);
        t = avi_1.a(-666510856, 666518242, (int)l4);
        I = avi_1.a(-666510857, 666508160, (int)l4);
        H = "5";
        K = avi_1.a(-666510893, 666503354, (int)l4);
        ab = avi_1.a(-666510851, -666490950 + -((char)-31979), (int)l4);
        e = "5";
        o = avi_1.a(-666510885, 666490950 + (char)-27481, (int)l4);
        Q = avi_1.a(-666510875, -666512263, (int)l4);
        G = avi_1.a(-666510865, 666490950 + (char)-28085, (int)l4);
        avi_1.c = avi_1.a(-666510859, 666521105, (int)l4);
        W = avi_1.a(-666510864, -666490950 + -((char)-25698), (int)l4);
        V = avi_1.a(-666510880, -666509002, (int)l4);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        avi_1.bb = a1c.a(5614068648320004783L, -997685111364652365L, null).a(52169739062141L);
        var8 = avi_1.bb ^ 62482066309486L;
        v0 = var8 ^ 97390982092757L;
        var10_1 = (int)(v0 >>> 32);
        var11_2 = (int)(v0 << 32 >>> 48);
        var12_3 = (int)(v0 << 48 >>> 48);
        var5_4 = new String[45];
        var3_5 = 0;
        var2_6 = "_Ex\u0090\u00ba\u001a\u00c5\u00c9\u00e3\u00bb\u00f5\u00f7N\u00aa\u0085\u0010f^\u00c5\u0014\u00dd\t(\u0019\u00b0+\u0084\u00ef\u00cb\u007f\u00f0o\u00ee\u00b9\u0080j\u00fd\n\u00b0\u00b9\u0013\t~\u00b2\u00f7\u00e3\u00f6\u00eeT\u0086\bY\u0081\u00dbd!\u00cd.l\u00ca\u0013H\u00fc\u009a\u00a7\u00e6\u00fcN\u0015\u0092 \u00db\u0084\u008b\u00c4<\u00ddt\u00e8\u0015\u0013\u00ea\u0083\u00ceHl\u0001\u001f\u00aa\u00b8\u00d7\u009ez#\u001b,+\u00d8\u0098\u00e1\u0015\u00c1\u00d3\u00abB\u00c0@\u008a\u0082\n\u00d2\u00c8\u00da\u00e9\u000fw\u00a9\u00ec\u00c3\u00c9Q$\u001b\u000e\u00fbRG\u00ff\u00e0m\u0096\u00f6PW\u008a\u001a\u0005\u0018\u00e7(\u00e2\u0015\u00b8\u0014\u00e2\u000fxF\u00bb\u00c9\u0013\"v\u00d7\u00f6O\u00d6{P4\u0088\u000f\u0091\u0011fk\u0097\u0010n\u00d3\u0015\u00a6\u00ddG\u0083]x9\u0085|2\u0006\u00c60\u008cE\u00cd\u009f\u00d5\u0011\u001e4\u000f\u00fd\u00d16\u00ed%\u008a\u00bf91n\u00f1\u00bf\u0018\nM\u0016\u00a1\u0098\u0088\u00d05\u00fb\u008d\u0003B\u00fdX\u0089\f]\u00dc\u00b8\u0006\u00b7\u00e4\u0005\u00ad\u009a\u0015\u001c\u0090\u0010*\u00b7Md#\u00d7\u00e6s\\\u009e\u00df\u009c\u00a03\u0097\u00d9B\u00bf\u0016\u00f9\u008f\u00ac\u00c9 1\u0096\u00ac\u0089\u0017\u00b8b\u00e7\u0018\u00b0_\u00cf\u0084\u0016Psp\u0015\u0012\u00a9\u00d1\r\u008f\u00a9c\u00bf7uo.\u001d\u0091\u00e9r*\u00bf\u00ba\f\u00d7\u0013\u0015f1\u00f4\u0093\u0096\u00e0XG\u0089a\u00b1\u00dcb\u00d8\f.}}\u0012\u0082\u0016\u00c3\u00fa\u00cdW+`>\u008eNQ9~o\u008a\u00bf\u0017\u0015\u00ee\u00f2Nf|\u00c4\u001d\u0012\u00f8\u00c0\u0096\u0098\"G\u000b\u00b6\u00de\u00eb\u009c\u00b4\u0084\u0015D-4f\u00a2=n\u00cf\u000b\u00b0\u00b6d\u00f0qP\u00c9\u00e0\u00ee\u00ec\u00f0\u00e1\u0015?\u00c0[\u00dbO\u008a\u00d39\u00bc}R\u00aa:o\u00cf+\u0013\u00b2\u0093{/\u0013\u0083\u00b2\u00e3n\u00c9\u00c5\u00ab2.\u00c4L\u0018yW`\u00a0\u00aa\u00a1-\u0016\u00a9\u0007\u00bc7t\u00d1\u0095Rt\u0010K\u0007\u0019\u00da\u00b9\u008e\u008bqU\u00de\u009b\u0082\u0015ls\u0004\u00b9s\u0011a\u007f-`S~L2\u00c7\u00a1\u0012\u00e3\u00b0Q(\u00160\u00b7\u0095\u00ce\u0007\u00d1r\u00b0\u0015\u0094+\u0012\u0095\u0016\u00fe\u009e\u001c\u00af<_\u0015\u00ea\u0014S\u0018\u00e3\u00d4\u009f\u00ad\u00e8\u00dd\u00db\u00f2\u00ac,\u00b3j+\u00fc\u00f8\u009c0\u00f3\u0012\u00ff\u009el\u00eb8u\u0095$\u00e9\u0006\u00b4@f\\\u0084\u00cd\u00d6\u0084\u0012\u00de\u000eH\u00f9\u00bc7\u0005l\u00fb\u000f\u00f6a.x\u009fN\u00f9\u0011\u0016\u00d9\u001b\u0087\u00a0\u00d4\u00e5\u00a0\u00d4\u00d2\u00c0\u009f\u001d\u0083\u0099\u00ea\u00e6\u00e1|\u0018~2\u00b7\u0015\u00b5\u00bd%\u008f\u0011\u00f9\u00b0\u00b5M4 \u0006\u00f4\u0094\u00d3\u00d4\u009e\u00af\u00a6^\u00c2\u0013\u00a6\u00f7G\u00c6]\u00d09\u0090|\u0090\u0006\u00920\u0006@\u0088\u0086\u00fc\u00a4\u0013\u0090h\u00815\u0085\u00ae\"_\u001fij\u00ad\u00bd\u00e1\u00ea`\u00b8r\u001f\u0016\u0080\u00bb\u0083O\u00c5\u00e1*\u00b6\u001eTJ\n\u00b9\u0015z\u00e3\u00b8\u00b8\u0017`rv\u0016\\\u00fe\u0018\u00e7\u00b6\u00f4D\u0014\u00d3\u0000\u00f3\u0080\u008eD\u009b\u00c4`\u00edl|y\u00e9\u0015\u00a0\r\u009dvP\u00f9\u0011W\u00e4\u00b0Y\u0013[X\u00e3\u00cd\u0096n#\u00e09\u0014\\\u0080\u0002\u00c7\u00b3\u00dey\u0086._3\u0099@\u00dcU*7G\u00c9\u00a9\u0014\u00e2\u008b\u00cfIL!\u001b\u00ae8W\u008ej!\u0019yg\u00c4\u0090N\u00da\u0014\u00edD\u0001K\u0004\u0098\u00ba{\u0091&\u00e5\u00b6\u009a9\u000e\u0096\\\u00d1\u00a4Z\u000f\u00b0=\u00aadqm\u0005\u00d1S\u00a7i\u00d0] #\u0014oG~\u00d0z\u0012\u00dd\u00c8\u00e0\u009b\u0095\u00f3B*\u0016\u0003QT\u009e\u0015\u0013E\u007f;\u00d7\u00d2\u00f2\u00c8\u00d4B\u0018\u00c1\u0083\u00c8$U\u00d8qx\u0096\u0016\u0004P\u00132\u00d7NhCV\u00eaC\u00dd\u0098\u00efR\u00b0>_\t\u0090\u008d\u00f1\u0016X-\u00b7f\u00d2-q\u00d9\u00dd\u00a6\u00b8\u00f0g$vQr\u008aj\u00a3|o\u0017RJ\u00d9q\u008e&CN3K\u00ef\u00e9\ri\u00fctzQIXx\u00dd\u00ee\u0015\u00fc\u00e6\f\u00e44\u0094\u0014\u0018\u00d9\u0081\u00b2\u00b0\u00a6B\u009f\r\u00c6\u00f4PY\r";
        var4_7 = "_Ex\u0090\u00ba\u001a\u00c5\u00c9\u00e3\u00bb\u00f5\u00f7N\u00aa\u0085\u0010f^\u00c5\u0014\u00dd\t(\u0019\u00b0+\u0084\u00ef\u00cb\u007f\u00f0o\u00ee\u00b9\u0080j\u00fd\n\u00b0\u00b9\u0013\t~\u00b2\u00f7\u00e3\u00f6\u00eeT\u0086\bY\u0081\u00dbd!\u00cd.l\u00ca\u0013H\u00fc\u009a\u00a7\u00e6\u00fcN\u0015\u0092 \u00db\u0084\u008b\u00c4<\u00ddt\u00e8\u0015\u0013\u00ea\u0083\u00ceHl\u0001\u001f\u00aa\u00b8\u00d7\u009ez#\u001b,+\u00d8\u0098\u00e1\u0015\u00c1\u00d3\u00abB\u00c0@\u008a\u0082\n\u00d2\u00c8\u00da\u00e9\u000fw\u00a9\u00ec\u00c3\u00c9Q$\u001b\u000e\u00fbRG\u00ff\u00e0m\u0096\u00f6PW\u008a\u001a\u0005\u0018\u00e7(\u00e2\u0015\u00b8\u0014\u00e2\u000fxF\u00bb\u00c9\u0013\"v\u00d7\u00f6O\u00d6{P4\u0088\u000f\u0091\u0011fk\u0097\u0010n\u00d3\u0015\u00a6\u00ddG\u0083]x9\u0085|2\u0006\u00c60\u008cE\u00cd\u009f\u00d5\u0011\u001e4\u000f\u00fd\u00d16\u00ed%\u008a\u00bf91n\u00f1\u00bf\u0018\nM\u0016\u00a1\u0098\u0088\u00d05\u00fb\u008d\u0003B\u00fdX\u0089\f]\u00dc\u00b8\u0006\u00b7\u00e4\u0005\u00ad\u009a\u0015\u001c\u0090\u0010*\u00b7Md#\u00d7\u00e6s\\\u009e\u00df\u009c\u00a03\u0097\u00d9B\u00bf\u0016\u00f9\u008f\u00ac\u00c9 1\u0096\u00ac\u0089\u0017\u00b8b\u00e7\u0018\u00b0_\u00cf\u0084\u0016Psp\u0015\u0012\u00a9\u00d1\r\u008f\u00a9c\u00bf7uo.\u001d\u0091\u00e9r*\u00bf\u00ba\f\u00d7\u0013\u0015f1\u00f4\u0093\u0096\u00e0XG\u0089a\u00b1\u00dcb\u00d8\f.}}\u0012\u0082\u0016\u00c3\u00fa\u00cdW+`>\u008eNQ9~o\u008a\u00bf\u0017\u0015\u00ee\u00f2Nf|\u00c4\u001d\u0012\u00f8\u00c0\u0096\u0098\"G\u000b\u00b6\u00de\u00eb\u009c\u00b4\u0084\u0015D-4f\u00a2=n\u00cf\u000b\u00b0\u00b6d\u00f0qP\u00c9\u00e0\u00ee\u00ec\u00f0\u00e1\u0015?\u00c0[\u00dbO\u008a\u00d39\u00bc}R\u00aa:o\u00cf+\u0013\u00b2\u0093{/\u0013\u0083\u00b2\u00e3n\u00c9\u00c5\u00ab2.\u00c4L\u0018yW`\u00a0\u00aa\u00a1-\u0016\u00a9\u0007\u00bc7t\u00d1\u0095Rt\u0010K\u0007\u0019\u00da\u00b9\u008e\u008bqU\u00de\u009b\u0082\u0015ls\u0004\u00b9s\u0011a\u007f-`S~L2\u00c7\u00a1\u0012\u00e3\u00b0Q(\u00160\u00b7\u0095\u00ce\u0007\u00d1r\u00b0\u0015\u0094+\u0012\u0095\u0016\u00fe\u009e\u001c\u00af<_\u0015\u00ea\u0014S\u0018\u00e3\u00d4\u009f\u00ad\u00e8\u00dd\u00db\u00f2\u00ac,\u00b3j+\u00fc\u00f8\u009c0\u00f3\u0012\u00ff\u009el\u00eb8u\u0095$\u00e9\u0006\u00b4@f\\\u0084\u00cd\u00d6\u0084\u0012\u00de\u000eH\u00f9\u00bc7\u0005l\u00fb\u000f\u00f6a.x\u009fN\u00f9\u0011\u0016\u00d9\u001b\u0087\u00a0\u00d4\u00e5\u00a0\u00d4\u00d2\u00c0\u009f\u001d\u0083\u0099\u00ea\u00e6\u00e1|\u0018~2\u00b7\u0015\u00b5\u00bd%\u008f\u0011\u00f9\u00b0\u00b5M4 \u0006\u00f4\u0094\u00d3\u00d4\u009e\u00af\u00a6^\u00c2\u0013\u00a6\u00f7G\u00c6]\u00d09\u0090|\u0090\u0006\u00920\u0006@\u0088\u0086\u00fc\u00a4\u0013\u0090h\u00815\u0085\u00ae\"_\u001fij\u00ad\u00bd\u00e1\u00ea`\u00b8r\u001f\u0016\u0080\u00bb\u0083O\u00c5\u00e1*\u00b6\u001eTJ\n\u00b9\u0015z\u00e3\u00b8\u00b8\u0017`rv\u0016\\\u00fe\u0018\u00e7\u00b6\u00f4D\u0014\u00d3\u0000\u00f3\u0080\u008eD\u009b\u00c4`\u00edl|y\u00e9\u0015\u00a0\r\u009dvP\u00f9\u0011W\u00e4\u00b0Y\u0013[X\u00e3\u00cd\u0096n#\u00e09\u0014\\\u0080\u0002\u00c7\u00b3\u00dey\u0086._3\u0099@\u00dcU*7G\u00c9\u00a9\u0014\u00e2\u008b\u00cfIL!\u001b\u00ae8W\u008ej!\u0019yg\u00c4\u0090N\u00da\u0014\u00edD\u0001K\u0004\u0098\u00ba{\u0091&\u00e5\u00b6\u009a9\u000e\u0096\\\u00d1\u00a4Z\u000f\u00b0=\u00aadqm\u0005\u00d1S\u00a7i\u00d0] #\u0014oG~\u00d0z\u0012\u00dd\u00c8\u00e0\u009b\u0095\u00f3B*\u0016\u0003QT\u009e\u0015\u0013E\u007f;\u00d7\u00d2\u00f2\u00c8\u00d4B\u0018\u00c1\u0083\u00c8$U\u00d8qx\u0096\u0016\u0004P\u00132\u00d7NhCV\u00eaC\u00dd\u0098\u00efR\u00b0>_\t\u0090\u008d\u00f1\u0016X-\u00b7f\u00d2-q\u00d9\u00dd\u00a6\u00b8\u00f0g$vQr\u008aj\u00a3|o\u0017RJ\u00d9q\u008e&CN3K\u00ef\u00e9\ri\u00fctzQIXx\u00dd\u00ee\u0015\u00fc\u00e6\f\u00e44\u0094\u0014\u0018\u00d9\u0081\u00b2\u00b0\u00a6B\u009f\r\u00c6\u00f4PY\r".length();
        var1_8 = 19;
        var0_9 = -1;
        block0: while (true) {
            block7: {
                v1 = ++var0_9;
                v2 = var2_6.substring(v1, v1 + var1_8).toCharArray();
                v3 = v2.length;
                var7_10 = 0;
                v4 = 40;
                v5 = v2;
                v6 = v3;
                if (v3 > 1) ** GOTO lbl59
                break block7;
                while (true) {
                    var2_6 = "\u00cfl\u009cC\u00d0\u0096~\u00aeb\u00a13B`\u00ea\u00a6\u00e7\u00e1y.\u00da\u00ca\u0012\u009a\u009f6=\u0085Y\u00d4W7\u009e\u0099\u00a55\u0016\f|\u00bc\u008c";
                    var4_7 = "\u00cfl\u009cC\u00d0\u0096~\u00aeb\u00a13B`\u00ea\u00a6\u00e7\u00e1y.\u00da\u00ca\u0012\u009a\u009f6=\u0085Y\u00d4W7\u009e\u0099\u00a55\u0016\f|\u00bc\u008c".length();
                    var1_8 = 21;
                    var0_9 = -1;
lbl33:
                    // 2 sources

                    while (true) {
                        v7 = ++var0_9;
                        v8 = var2_6.substring(v7, v7 + var1_8).toCharArray();
                        v9 = v8.length;
                        var7_10 = 0;
                        v10 = 117;
                        v11 = v8;
                        v12 = v9;
                        if (v9 <= 1) {
                            break block0;
                        }
                        ** GOTO lbl79
                        break;
                    }
                    break;
                }
            }
            do {
                v5 = v5;
                v13 = var7_10;
                var7_10 % 7;
                v5[v13] = (char)(v5[v13] ^ (v4 ^ 124));
                ++var7_10;
                v4 = v4;
lbl59:
                // 2 sources

                v14 = v5;
                v6 = v6;
            } while (v6 > var7_10);
            var5_4[var3_5++] = new String(v14).intern();
            if ((var0_9 += var1_8) >= var4_7) ** continue;
            var1_8 = var2_6.charAt(var0_9);
        }
        do {
            v11 = v11;
            v15 = var7_10;
            var7_10 % 7;
            v11[v15] = (char)(v11[v15] ^ (v10 ^ 124));
            ++var7_10;
            v10 = v10;
lbl79:
            // 2 sources

            v16 = v11;
            v12 = v12;
        } while (v12 > var7_10);
        var5_4[var3_5++] = new String(v16).intern();
        if ((var0_9 += var1_8) >= var4_7) {
            avi_1.cb = var5_4;
            avi_1.db = new String[45];
            avi_1.b(var10_1, (char)var11_2, var12_3);
            return;
        }
        var1_8 = var2_6.charAt(var0_9);
        ** while (true)
    }

    private static String a(int n, int n2, int n3) {
        int n4 = (n ^ n3 ^ 0xFFFF8F48) & 0xFFFF;
        if (db[n4] == null) {
            int n5;
            char[] cArray = cb[n4].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n5 = 101;
                    break;
                }
                case 1: {
                    n5 = 49;
                    break;
                }
                case 2: {
                    n5 = 246;
                    break;
                }
                case 3: {
                    n5 = 162;
                    break;
                }
                case 4: {
                    n5 = 88;
                    break;
                }
                case 5: {
                    n5 = 140;
                    break;
                }
                case 6: {
                    n5 = 27;
                    break;
                }
                case 7: {
                    n5 = 167;
                    break;
                }
                case 8: {
                    n5 = 177;
                    break;
                }
                case 9: {
                    n5 = 77;
                    break;
                }
                case 10: {
                    n5 = 5;
                    break;
                }
                case 11: {
                    n5 = 158;
                    break;
                }
                case 12: {
                    n5 = 41;
                    break;
                }
                case 13: {
                    n5 = 221;
                    break;
                }
                case 14: {
                    n5 = 91;
                    break;
                }
                case 15: {
                    n5 = 249;
                    break;
                }
                case 16: {
                    n5 = 201;
                    break;
                }
                case 17: {
                    n5 = 184;
                    break;
                }
                case 18: {
                    n5 = 203;
                    break;
                }
                case 19: {
                    n5 = 84;
                    break;
                }
                case 20: {
                    n5 = 43;
                    break;
                }
                case 21: {
                    n5 = 104;
                    break;
                }
                case 22: {
                    n5 = 2;
                    break;
                }
                case 23: {
                    n5 = 226;
                    break;
                }
                case 24: {
                    n5 = 72;
                    break;
                }
                case 25: {
                    n5 = 89;
                    break;
                }
                case 26: {
                    n5 = 229;
                    break;
                }
                case 27: {
                    n5 = 1;
                    break;
                }
                case 28: {
                    n5 = 59;
                    break;
                }
                case 29: {
                    n5 = 148;
                    break;
                }
                case 30: {
                    n5 = 20;
                    break;
                }
                case 31: {
                    n5 = 196;
                    break;
                }
                case 32: {
                    n5 = 24;
                    break;
                }
                case 33: {
                    n5 = 113;
                    break;
                }
                case 34: {
                    n5 = 97;
                    break;
                }
                case 35: {
                    n5 = 202;
                    break;
                }
                case 36: {
                    n5 = 213;
                    break;
                }
                case 37: {
                    n5 = 117;
                    break;
                }
                case 38: {
                    n5 = 220;
                    break;
                }
                case 39: {
                    n5 = 192;
                    break;
                }
                case 40: {
                    n5 = 236;
                    break;
                }
                case 41: {
                    n5 = 131;
                    break;
                }
                case 42: {
                    n5 = 146;
                    break;
                }
                case 43: {
                    n5 = 100;
                    break;
                }
                case 44: {
                    n5 = 56;
                    break;
                }
                case 45: {
                    n5 = 222;
                    break;
                }
                case 46: {
                    n5 = 234;
                    break;
                }
                case 47: {
                    n5 = 90;
                    break;
                }
                case 48: {
                    n5 = 8;
                    break;
                }
                case 49: {
                    n5 = 217;
                    break;
                }
                case 50: {
                    n5 = 16;
                    break;
                }
                case 51: {
                    n5 = 45;
                    break;
                }
                case 52: {
                    n5 = 183;
                    break;
                }
                case 53: {
                    n5 = 211;
                    break;
                }
                case 54: {
                    n5 = 244;
                    break;
                }
                case 55: {
                    n5 = 108;
                    break;
                }
                case 56: {
                    n5 = 19;
                    break;
                }
                case 57: {
                    n5 = 212;
                    break;
                }
                case 58: {
                    n5 = 98;
                    break;
                }
                case 59: {
                    n5 = 136;
                    break;
                }
                case 60: {
                    n5 = 50;
                    break;
                }
                case 61: {
                    n5 = 96;
                    break;
                }
                case 62: {
                    n5 = 150;
                    break;
                }
                case 63: {
                    n5 = 157;
                    break;
                }
                case 64: {
                    n5 = 199;
                    break;
                }
                case 65: {
                    n5 = 237;
                    break;
                }
                case 66: {
                    n5 = 242;
                    break;
                }
                case 67: {
                    n5 = 105;
                    break;
                }
                case 68: {
                    n5 = 191;
                    break;
                }
                case 69: {
                    n5 = 26;
                    break;
                }
                case 70: {
                    n5 = 63;
                    break;
                }
                case 71: {
                    n5 = 235;
                    break;
                }
                case 72: {
                    n5 = 33;
                    break;
                }
                case 73: {
                    n5 = 185;
                    break;
                }
                case 74: {
                    n5 = 29;
                    break;
                }
                case 75: {
                    n5 = 223;
                    break;
                }
                case 76: {
                    n5 = 57;
                    break;
                }
                case 77: {
                    n5 = 110;
                    break;
                }
                case 78: {
                    n5 = 154;
                    break;
                }
                case 79: {
                    n5 = 204;
                    break;
                }
                case 80: {
                    n5 = 55;
                    break;
                }
                case 81: {
                    n5 = 25;
                    break;
                }
                case 82: {
                    n5 = 37;
                    break;
                }
                case 83: {
                    n5 = 188;
                    break;
                }
                case 84: {
                    n5 = 159;
                    break;
                }
                case 85: {
                    n5 = 160;
                    break;
                }
                case 86: {
                    n5 = 198;
                    break;
                }
                case 87: {
                    n5 = 141;
                    break;
                }
                case 88: {
                    n5 = 99;
                    break;
                }
                case 89: {
                    n5 = 175;
                    break;
                }
                case 90: {
                    n5 = 128;
                    break;
                }
                case 91: {
                    n5 = 205;
                    break;
                }
                case 92: {
                    n5 = 239;
                    break;
                }
                case 93: {
                    n5 = 42;
                    break;
                }
                case 94: {
                    n5 = 35;
                    break;
                }
                case 95: {
                    n5 = 151;
                    break;
                }
                case 96: {
                    n5 = 9;
                    break;
                }
                case 97: {
                    n5 = 166;
                    break;
                }
                case 98: {
                    n5 = 53;
                    break;
                }
                case 99: {
                    n5 = 112;
                    break;
                }
                case 100: {
                    n5 = 174;
                    break;
                }
                case 101: {
                    n5 = 182;
                    break;
                }
                case 102: {
                    n5 = 116;
                    break;
                }
                case 103: {
                    n5 = 180;
                    break;
                }
                case 104: {
                    n5 = 130;
                    break;
                }
                case 105: {
                    n5 = 73;
                    break;
                }
                case 106: {
                    n5 = 74;
                    break;
                }
                case 107: {
                    n5 = 133;
                    break;
                }
                case 108: {
                    n5 = 34;
                    break;
                }
                case 109: {
                    n5 = 21;
                    break;
                }
                case 110: {
                    n5 = 69;
                    break;
                }
                case 111: {
                    n5 = 48;
                    break;
                }
                case 112: {
                    n5 = 10;
                    break;
                }
                case 113: {
                    n5 = 209;
                    break;
                }
                case 114: {
                    n5 = 118;
                    break;
                }
                case 115: {
                    n5 = 214;
                    break;
                }
                case 116: {
                    n5 = 224;
                    break;
                }
                case 117: {
                    n5 = 156;
                    break;
                }
                case 118: {
                    n5 = 38;
                    break;
                }
                case 119: {
                    n5 = 115;
                    break;
                }
                case 120: {
                    n5 = 144;
                    break;
                }
                case 121: {
                    n5 = 240;
                    break;
                }
                case 122: {
                    n5 = 193;
                    break;
                }
                case 123: {
                    n5 = 94;
                    break;
                }
                case 124: {
                    n5 = 250;
                    break;
                }
                case 125: {
                    n5 = 216;
                    break;
                }
                case 126: {
                    n5 = 137;
                    break;
                }
                case 127: {
                    n5 = 47;
                    break;
                }
                case 128: {
                    n5 = 66;
                    break;
                }
                case 129: {
                    n5 = 143;
                    break;
                }
                case 130: {
                    n5 = 227;
                    break;
                }
                case 131: {
                    n5 = 145;
                    break;
                }
                case 132: {
                    n5 = 187;
                    break;
                }
                case 133: {
                    n5 = 252;
                    break;
                }
                case 134: {
                    n5 = 172;
                    break;
                }
                case 135: {
                    n5 = 102;
                    break;
                }
                case 136: {
                    n5 = 7;
                    break;
                }
                case 137: {
                    n5 = 15;
                    break;
                }
                case 138: {
                    n5 = 233;
                    break;
                }
                case 139: {
                    n5 = 54;
                    break;
                }
                case 140: {
                    n5 = 218;
                    break;
                }
                case 141: {
                    n5 = 40;
                    break;
                }
                case 142: {
                    n5 = 46;
                    break;
                }
                case 143: {
                    n5 = 173;
                    break;
                }
                case 144: {
                    n5 = 36;
                    break;
                }
                case 145: {
                    n5 = 210;
                    break;
                }
                case 146: {
                    n5 = 52;
                    break;
                }
                case 147: {
                    n5 = 70;
                    break;
                }
                case 148: {
                    n5 = 92;
                    break;
                }
                case 149: {
                    n5 = 253;
                    break;
                }
                case 150: {
                    n5 = 14;
                    break;
                }
                case 151: {
                    n5 = 62;
                    break;
                }
                case 152: {
                    n5 = 161;
                    break;
                }
                case 153: {
                    n5 = 169;
                    break;
                }
                case 154: {
                    n5 = 65;
                    break;
                }
                case 155: {
                    n5 = 79;
                    break;
                }
                case 156: {
                    n5 = 121;
                    break;
                }
                case 157: {
                    n5 = 67;
                    break;
                }
                case 158: {
                    n5 = 106;
                    break;
                }
                case 159: {
                    n5 = 11;
                    break;
                }
                case 160: {
                    n5 = 207;
                    break;
                }
                case 161: {
                    n5 = 31;
                    break;
                }
                case 162: {
                    n5 = 147;
                    break;
                }
                case 163: {
                    n5 = 32;
                    break;
                }
                case 164: {
                    n5 = 181;
                    break;
                }
                case 165: {
                    n5 = 255;
                    break;
                }
                case 166: {
                    n5 = 124;
                    break;
                }
                case 167: {
                    n5 = 125;
                    break;
                }
                case 168: {
                    n5 = 76;
                    break;
                }
                case 169: {
                    n5 = 219;
                    break;
                }
                case 170: {
                    n5 = 17;
                    break;
                }
                case 171: {
                    n5 = 132;
                    break;
                }
                case 172: {
                    n5 = 153;
                    break;
                }
                case 173: {
                    n5 = 30;
                    break;
                }
                case 174: {
                    n5 = 171;
                    break;
                }
                case 175: {
                    n5 = 163;
                    break;
                }
                case 176: {
                    n5 = 60;
                    break;
                }
                case 177: {
                    n5 = 39;
                    break;
                }
                case 178: {
                    n5 = 232;
                    break;
                }
                case 179: {
                    n5 = 68;
                    break;
                }
                case 180: {
                    n5 = 129;
                    break;
                }
                case 181: {
                    n5 = 135;
                    break;
                }
                case 182: {
                    n5 = 123;
                    break;
                }
                case 183: {
                    n5 = 155;
                    break;
                }
                case 184: {
                    n5 = 93;
                    break;
                }
                case 185: {
                    n5 = 75;
                    break;
                }
                case 186: {
                    n5 = 58;
                    break;
                }
                case 187: {
                    n5 = 248;
                    break;
                }
                case 188: {
                    n5 = 3;
                    break;
                }
                case 189: {
                    n5 = 4;
                    break;
                }
                case 190: {
                    n5 = 109;
                    break;
                }
                case 191: {
                    n5 = 83;
                    break;
                }
                case 192: {
                    n5 = 114;
                    break;
                }
                case 193: {
                    n5 = 243;
                    break;
                }
                case 194: {
                    n5 = 138;
                    break;
                }
                case 195: {
                    n5 = 241;
                    break;
                }
                case 196: {
                    n5 = 231;
                    break;
                }
                case 197: {
                    n5 = 208;
                    break;
                }
                case 198: {
                    n5 = 111;
                    break;
                }
                case 199: {
                    n5 = 139;
                    break;
                }
                case 200: {
                    n5 = 103;
                    break;
                }
                case 201: {
                    n5 = 107;
                    break;
                }
                case 202: {
                    n5 = 190;
                    break;
                }
                case 203: {
                    n5 = 134;
                    break;
                }
                case 204: {
                    n5 = 186;
                    break;
                }
                case 205: {
                    n5 = 13;
                    break;
                }
                case 206: {
                    n5 = 28;
                    break;
                }
                case 207: {
                    n5 = 87;
                    break;
                }
                case 208: {
                    n5 = 247;
                    break;
                }
                case 209: {
                    n5 = 44;
                    break;
                }
                case 210: {
                    n5 = 51;
                    break;
                }
                case 211: {
                    n5 = 170;
                    break;
                }
                case 212: {
                    n5 = 238;
                    break;
                }
                case 213: {
                    n5 = 86;
                    break;
                }
                case 214: {
                    n5 = 6;
                    break;
                }
                case 215: {
                    n5 = 230;
                    break;
                }
                case 216: {
                    n5 = 251;
                    break;
                }
                case 217: {
                    n5 = 165;
                    break;
                }
                case 218: {
                    n5 = 254;
                    break;
                }
                case 219: {
                    n5 = 197;
                    break;
                }
                case 220: {
                    n5 = 0;
                    break;
                }
                case 221: {
                    n5 = 22;
                    break;
                }
                case 222: {
                    n5 = 189;
                    break;
                }
                case 223: {
                    n5 = 195;
                    break;
                }
                case 224: {
                    n5 = 179;
                    break;
                }
                case 225: {
                    n5 = 23;
                    break;
                }
                case 226: {
                    n5 = 142;
                    break;
                }
                case 227: {
                    n5 = 200;
                    break;
                }
                case 228: {
                    n5 = 178;
                    break;
                }
                case 229: {
                    n5 = 122;
                    break;
                }
                case 230: {
                    n5 = 127;
                    break;
                }
                case 231: {
                    n5 = 149;
                    break;
                }
                case 232: {
                    n5 = 164;
                    break;
                }
                case 233: {
                    n5 = 12;
                    break;
                }
                case 234: {
                    n5 = 78;
                    break;
                }
                case 235: {
                    n5 = 95;
                    break;
                }
                case 236: {
                    n5 = 176;
                    break;
                }
                case 237: {
                    n5 = 228;
                    break;
                }
                case 238: {
                    n5 = 215;
                    break;
                }
                case 239: {
                    n5 = 245;
                    break;
                }
                case 240: {
                    n5 = 81;
                    break;
                }
                case 241: {
                    n5 = 85;
                    break;
                }
                case 242: {
                    n5 = 168;
                    break;
                }
                case 243: {
                    n5 = 206;
                    break;
                }
                case 244: {
                    n5 = 61;
                    break;
                }
                case 245: {
                    n5 = 119;
                    break;
                }
                case 246: {
                    n5 = 194;
                    break;
                }
                case 247: {
                    n5 = 71;
                    break;
                }
                case 248: {
                    n5 = 126;
                    break;
                }
                case 249: {
                    n5 = 64;
                    break;
                }
                case 250: {
                    n5 = 82;
                    break;
                }
                case 251: {
                    n5 = 80;
                    break;
                }
                case 252: {
                    n5 = 225;
                    break;
                }
                case 253: {
                    n5 = 18;
                    break;
                }
                case 254: {
                    n5 = 120;
                    break;
                }
                default: {
                    n5 = 152;
                }
            }
            int n6 = n5;
            int n7 = ((n2 ^= n3) & 0xFF) - n6;
            n7 += 256;
            int cfr_ignored_0 = ((n2 & 0xFFFF) >>> 8) - n6;
            var7_7 += 256;
            int n8 = 0;
            while (n8 < cArray.length) {
                int cfr_ignored_1 = n8 % 2;
                int n9 = n8;
                cArray[n9] = (char)(cArray[n9] ^ n7);
                n7 = ((n7 >>> 3 | n7 << 5) ^ cArray[n8]) & 0xFF;
                ++n8;
            }
            avi_1.db[n4] = new String(cArray).intern();
        }
        return db[n4];
    }
}


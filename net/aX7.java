/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aX7 {
    public static String n = "Block being collided with";
    public static String y = "portal";
    public static String h = "";
    public static String t = "id";
    private static String[] db;
    public static String d = ".name";
    public static String az = "game.neutral.swim";
    public static String af = "PortalCooldown";
    public static String ae = "Entity being saved";
    public static String F = "changeDimension";
    public static String z = "Dimension";
    public static String ad = "%.2f, %.2f, %.2f";
    public static String ag = "Entity being checked for collision";
    public static String ak = "Entity ID";
    public static String at = "id";
    public static String au = "Silent";
    public static String l = "random.fizz";
    public static String N = "Motion";
    public static String av = "Invulnerable";
    public static String Q = "reposition";
    public static String W = "Silent";
    public static String a = "Fire";
    public static String ap = "%.2f, %.2f, %.2f";
    public static String ai = "entityBaseTick";
    public static String L = "UUIDLeast";
    public static String aq = "Entity's Exact location";
    public static String U = "name";
    public static String g = "game.neutral.swim.splash";
    public static String R = "Entity Name";
    public static String B = "rest";
    public static String Z = "UUID";
    public static String I = "Entity's Block location";
    public static String aw = "Saving entity NBT";
    public static String k = "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]";
    public static String x = "Checking entity block collision";
    public static String v = "Entity being loaded";
    public static String O = "UUIDLeast";
    public static String as = "FallDistance";
    public static String M = "OnGround";
    private static long bb;
    public static String c = "Invulnerable";
    public static String ar = "Entity's Vehicle";
    public static String r = "CustomName";
    public static String o = "CustomName";
    public static String ax = "generic";
    public static String e = "CustomNameVisible";
    public static String V = "Pos";
    public static String X = "UUIDMost";
    public static String ab = "Rotation";
    public static String j = "entity.";
    public static String G = ")";
    public static String q = "Entity's Momentum";
    public static String aj = "Pos";
    public static String S = "Loading entity NBT";
    public static String i = "FallDistance";
    public static String an = "Riding";
    public static String Y = "id";
    public static String H = "CustomName";
    public static String w = "UUIDMost";
    public static String ac = "CustomNameVisible";
    public static String f = "Entity's Rider";
    public static String ay = "CustomName";
    public static String aa = "type";
    public static String A = "UUIDLeast";
    public static String T = "OnGround";
    private static String[] cb;
    public static String E = "Dimension";
    public static String C = "Air";
    public static String D = "PortalCooldown";
    public static String u = "move";
    public static String am = "Rotation";
    public static String ah = "Entity Type";
    public static String p = "Air";
    public static String al = "Fire";
    public static String ao = "~NULL~";
    public static String J = "reloading";
    public static String P = "UUID";
    public static String K = "UUIDMost";
    public static String b = " (";
    public static String m = "Colliding entity with block";
    public static String s = "Motion";

    public static void b(int n, short s, int n2) {
        long l4 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ bb;
        J = aX7.a(-360311430 - -((char)-19251), 360311430 - (char)-20949, (int)l4);
        v = aX7.a(-360311430 - -((char)-19216), 360311430 - (char)-25975, (int)l4);
        ao = aX7.a(-360311430 - -((char)-19250), -360280267, (int)l4);
        e = aX7.a(-360311430 - -((char)-19242), 360311430 - (char)-20794, (int)l4);
        c = aX7.a(-360311430 - -((char)-19220), 360311430 - (char)-29345, (int)l4);
        u = aX7.a(-360311430 - -((char)-19254), -360311430 - -((char)-24653), (int)l4);
        B = aX7.a(-360311430 - -((char)-19222), -360279478, (int)l4);
        al = aX7.a(-360311430 - -((char)-19199), -360311430 - -((char)-21474), (int)l4);
        ac = aX7.a(-360311430 - -((char)-19228), -360311430 - -((char)-13477), (int)l4);
        aa = aX7.a(-360311430 - -((char)-19227), -360311430 - -((char)-16907), (int)l4);
        ak = aX7.a(-360311430 - -((char)-19221), 360311430 - (char)-26408, (int)l4);
        k = aX7.a(-360311430 - -((char)-19201), 360311430 - (char)-12889, (int)l4);
        ab = aX7.a(-360311430 - -((char)-19217), 360311430 - (char)-19381, (int)l4);
        a = aX7.a(-360311430 - -((char)-19301), 360311430 - (char)-8750, (int)l4);
        l = aX7.a(-360311430 - -((char)-19210), 360311430 - (char)-5791, (int)l4);
        F = aX7.a(-360311430 - -((char)-19214), 360311430 - (char)-21799, (int)l4);
        N = aX7.a(-360311430 - -((char)-19233), 360311430 - (char)-20020, (int)l4);
        o = aX7.a(-360311430 - -((char)-19207), 360311430 - (char)-12377, (int)l4);
        ag = aX7.a(-360311430 - -((char)-19219), -360311430 - -((char)-23579), (int)l4);
        S = aX7.a(-360311430 - -((char)-19303), 360311430 - (char)-18497, (int)l4);
        ar = aX7.a(-360311430 - -((char)-19195), 360311430 - (char)-6705, (int)l4);
        O = aX7.a(-360311430 - -((char)-19239), 360280417, (int)l4);
        z = aX7.a(-360311430 - -((char)-19223), -360311430 - -((char)-12712), (int)l4);
        m = aX7.a(-360311430 - -((char)-19256), 360311430 - (char)-31763, (int)l4);
        ay = aX7.a(-360311430 - -((char)-19230), -360311430 - -((char)-29186), (int)l4);
        U = aX7.a(-360311430 - -((char)-19300), -360311430 - -((char)-30584), (int)l4);
        ai = aX7.a(-360311430 - -((char)-19197), -360311430 - -((char)-19760), (int)l4);
        T = aX7.a(-360311430 - -((char)-19235), 360311430 - (char)-28525, (int)l4);
        R = aX7.a(-360311430 - -((char)-19258), -360311430 - -((char)-11913), (int)l4);
        af = aX7.a(-360311430 - -((char)-19229), -360311430 - -((char)-11038), (int)l4);
        K = aX7.a(-360311430 - -((char)-19204), 360311430 - (char)-27307, (int)l4);
        q = aX7.a(-360311430 - -((char)-19202), 360311430 - (char)-16759, (int)l4);
        b = aX7.a(-360311430 - -((char)-19209), -360311430 - -((char)-15112), (int)l4);
        i = aX7.a(-360311430 - -((char)-19306), 360281495, (int)l4);
        ax = aX7.a(-360311430 - -((char)-19234), 360311430 - (char)-10241, (int)l4);
        g = aX7.a(-360311430 - -((char)-19299), -360311430 - -((char)-30803), (int)l4);
        Z = aX7.a(-360311430 - -((char)-19244), 360311430 - (char)-10618, (int)l4);
        f = aX7.a(-360311430 - -((char)-19218), -360311430 - -((char)-19777), (int)l4);
        M = aX7.a(-360311430 - -((char)-19252), 360311430 - (char)-16162, (int)l4);
        aw = aX7.a(-360311430 - -((char)-19198), 360311430 - (char)-23033, (int)l4);
        d = aX7.a(-360311430 - -((char)-19215), 360311430 - (char)-16083, (int)l4);
        y = aX7.a(-360311430 - -((char)-19236), 360311430 - (char)-29341, (int)l4);
        h = "";
        V = aX7.a(-360311430 - -((char)-19246), -360311430 - -((char)-9250), (int)l4);
        t = aX7.a(-360311430 - -((char)-19231), 360311430 - (char)-21623, (int)l4);
        H = aX7.a(-360311430 - -((char)-19230), -360311430 - -((char)-29186), (int)l4);
        aq = aX7.a(-360311430 - -((char)-19225), 360311430 - (char)-10584, (int)l4);
        aX7.n = aX7.a(-360311430 - -((char)-19302), -360311430 - -((char)-11077), (int)l4);
        r = aX7.a(-360311430 - -((char)-19230), -360311430 - -((char)-29186), (int)l4);
        ae = aX7.a(-360311430 - -((char)-19206), 360311430 - (char)-24735, (int)l4);
        am = aX7.a(-360311430 - -((char)-19249), -360311430 - -((char)-17168), (int)l4);
        P = aX7.a(-360311430 - -((char)-19212), 360282962, (int)l4);
        an = aX7.a(-360311430 - -((char)-19240), -360311430 - -((char)-32417), (int)l4);
        w = aX7.a(-360311430 - -((char)-19245), -360311430 - -((char)-29739), (int)l4);
        A = aX7.a(-360311430 - -((char)-19213), 360311430 - (char)-32293, (int)l4);
        at = aX7.a(-360311430 - -((char)-19304), -360311430 - -((char)-16748), (int)l4);
        Q = aX7.a(-360311430 - -((char)-19203), 360311430 - (char)-21280, (int)l4);
        x = aX7.a(-360311430 - -((char)-19211), 360311430 - (char)-13755, (int)l4);
        aj = aX7.a(-360311430 - -((char)-19253), -360311430 - -((char)-7696), (int)l4);
        as = aX7.a(-360311430 - -((char)-19232), -360311430 - -((char)-22386), (int)l4);
        av = aX7.a(-360311430 - -((char)-19238), -360311430 - -((char)-27920), (int)l4);
        C = aX7.a(-360311430 - -((char)-19243), -360311430 - -((char)-27481), (int)l4);
        ad = aX7.a(-360311430 - -((char)-19226), 360311430 - (char)-23901, (int)l4);
        G = ")";
        p = aX7.a(-360311430 - -((char)-19205), 360311430 - (char)-21509, (int)l4);
        I = aX7.a(-360311430 - -((char)-19248), -360311430 - -((char)-12357), (int)l4);
        X = aX7.a(-360311430 - -((char)-19245), -360311430 - -((char)-29739), (int)l4);
        L = aX7.a(-360311430 - -((char)-19213), 360311430 - (char)-32293, (int)l4);
        E = aX7.a(-360311430 - -((char)-19224), -360283065, (int)l4);
        ap = aX7.a(-360311430 - -((char)-19208), 360311430 - (char)-29974, (int)l4);
        az = aX7.a(-360311430 - -((char)-19196), 360311430 - (char)-8963, (int)l4);
        au = aX7.a(-360311430 - -((char)-19200), 360279139, (int)l4);
        aX7.s = aX7.a(-360311430 - -((char)-19241), 360278896, (int)l4);
        W = aX7.a(-360311430 - -((char)-19237), -360311430 - -((char)-31388), (int)l4);
        j = aX7.a(-360311430 - -((char)-19255), 360279904, (int)l4);
        ah = aX7.a(-360311430 - -((char)-19247), 360311430 - (char)-27567, (int)l4);
        Y = aX7.a(-360311430 - -((char)-19304), -360311430 - -((char)-16748), (int)l4);
        D = aX7.a(-360311430 - -((char)-19257), -360311430 - -((char)-10456), (int)l4);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        aX7.bb = a1c.a(-457775327742182059L, -6115732473077405779L, null).a(79095666692274L);
        var8 = aX7.bb ^ 18943174921185L;
        v0 = var8 ^ 109381671749265L;
        var10_1 = (int)(v0 >>> 32);
        var11_2 = (int)(v0 << 32 >>> 48);
        var12_3 = (int)(v0 << 48 >>> 48);
        var5_4 = new String[71];
        var3_5 = 0;
        var2_6 = "\u0014\u00c2\u00b6Lt\u00da\b+\u0017\u00bc\u00d1\u00a8\u00b6\u00cal\fa\u0011\u0002\u0016k\u00b2\u00da\u0082X6\u00c8r\u0006\u00bc=\u00fad/\u00f4\u0006^\u009b\u008f\u00bc\u0088q\t\u00a1\u0006\u00ba\u0099\u0084_\u0007Tr\u0011b\u001e,\u008e\b\u0083\u00fe\u00d4\u009e\u008a\u00a7\u000e\u00de\u00df\u00a1xG\u0006\u0003W\u00c8\u00e3s\u0093\u0011\u00ae\f\u00b5\u00cc;\u00cb\u0098\u00ddR\u00ab>*\u00ed[\u00c7\u00e8\u008b\u0004gg^=\nG\u00d3\u00887\u009c\u00b4l2\u00ccV\u000eEs\u00b8z\u00b5\u001c\u008b\b\u009e\u00d7\u00d7\u008b\u00a0\u00ae\f3\u001d\u00bc`\u00cdA5\u001dq\u000f\u00e2\u00d8\u0002\u00a3\u0018\u0007|jR\u0003d\u0005\u00e0\u0006\u00ed\u00e8\u0015\u0014\u00c8m\bMlp\u00be1[\u00f9\u00d1\t\u00d4\u0005\u00f2\u00e4!\u00bf3t\u00ee\u0004\u00d7\u00f6t\u00db\u00030#\u0017\u001b\u00ba\u00d8(\u0017r\u00a2P\u00d7\u0082A\\\u009d\u00f3J\u00f5\u00df\\89/8:\u00ab7\u00d6\u009b\u00f6\u0007\u00e6wY\u00c6Z \u00ac\u000bX\u00a5\u00aa\u009c$kmpC\u00dc\u00a2\u000e\"\u00e2TH(Z8\u00c0\u00e8\u00ce\u0019\u00a8y\u00ca\u0004\u0014\u00b3\f/\u0003\u00cc\u0086\u00ba\u0003\u00a6\u00a9\u00c5\bzE\u00c1\u00f1\u00eaX\u00f9\u00f8\u0017RX\u00eb#\f\u009co\u00b3\u00a5\u0011\u001e\u00b8\u0084\u00cd\u00bax$o\u0098S\u0004\u00fa\u0001\u000bR\u00cf\u00eb\u00d1\f\u00c2h_\u00fb}\u00ae\u0006\u0082\u00bb\u008c^\u00dd\u00b5\bWi\u00be,\u00a6dr\u00a3\bU\u000e$\u0098Vun]\n\\a\u00ffh\r#\u00fbLA\u009b\u0012\u00f2\u008a\u00ffy\u008e\u00d78\u00cb\u00ed\u0006\u00f8\u001cYHk\u00c9}\u0007\u0003\u00c5\u00d9\u009b\u0010\u00b3^\u00fd\u00a4\u0018\u00db\u00bct\u008f;K\u0012 {\u00b2I\n\u001e\u00fc\u00a3\u00d2\u00f9\b\u00c0\u00a5Y\u00a4\u000b\u00f5S\u00d4\u00a1\u00a9t\u00aa-|MS\u0002Yj\u0011\u00ee=\u0003mq\u00cf\u0093*d\u00d4\u00f55\u0018\u0007\u009a?\u009f\u0010\"\u000b\u00e5I\u00cd\u00d1W\u001a\u00a20\u00f7\r\u009b\u0094^S\u0011\u00a1\u0001C\u00e6A:\u0098\u00ac\u00f2\u0010vs6\u0087\u00db=\u0090\u000e\u0011]\u00a7\u0083\u0085\u0088;#\u00b5t\u001d\u00d1\u00db&\u0006\u0085\u00c1\u00dd\u00fb\u00cb\u0007\u0004Y&\u00ef\u0007\u0011#\u00dd\u00c5\u0093\u00c9\u008a\u00d7q\u00b2F\u00ff\u00be\u00ddJ\u00034\u00cf+z\u00fe\u00ad\u0007_\u0095~\u0085\u0082&\u001f\u00f3\u00e3T\u00bf\u009e\u007f\u0097!\u00d4\u00c6\u0086!\\u\u00f93\u0086\u00b3b=\u001a\u00eb\u000b\u0016\u00ee\u00ba\u00fc\u00a5\u00d4\u00c2$t\fB&f\u00f0\u00e7nK\u0019jE\u008e\u001c\"0\u00d8\u00a73\u0085\u009eY\u00e2\u00c1#}\u00b8\u00e9\u00cctX\u00b0K\u0083\u00ce\u00aaR\u00b5\u00aa\u00f6\u00f5P\u00ee\u00e1\u00fe\u0096\u0010_\u00ed\u0004C\u007f\u001f\u00b0\tM\u00a4\b\u00bcpo\u00e7\u00f77\t!\u0012\u00bd\u0081\u00e6O%\u009e%\t\u0002\u00b7\u00d95j\u00d9\u00b4L\u0017\u0010\u0006\u00f8Kp\u00ceAf'\u00d4Q _M\u00d2\u001f|\u0017\u0087PQ\"[\u00bc\u0085\u00b7\u00f8\u0096\u00a1\u00a1\u00e5>\u0096\u00fa\u00a1?(Y\u0012\u00bb\u00c3\u0004\u0088\u00e8\u009fD\u001f;P\u0011\u00ee\u007f~\u00b4\u00e9\u00be\u00eb\u007f?\u00e0Z$:\u0088\u00ed\u00af\u00fa/u+\u00dd\u00e4\u00aa\u00d1\u00f4\u0012GP\u000f\u00cf\u00e5\u00afU \u00a9\u00f8\u0090\u0015\u000b\u00ee$\u00d2\u00c5u\t\u008f\u00bd\u007f\u00ee<\u00b1\u0010\u0089\u0090\u0013+\u0001\u00c4\b\u00e9\u00f9\u00d4\u000ep\u00beK\u000b/\u00b5\u00ab\u009d\u00aby\u0006\u0005\u0014\u00970\u00de\u00d1\u000e\u0016mc\u0085\u001dHM)\u00e1R\u0093\u00c9\u0096\u0090\b\u00d4\u0015\u00ce\u00a3\u00a8\u0095\u00b3\u009d\u0004\u0095\u00f1D\u00f4\u0018\u00ab\u00a8\u00ab\u00dfd\u00991\u00e00\u008d\u007f\u001eIb\u00b0\u0093\u00da\u00fa\u0017\u0001\u00a0:-Z\u0019PTW\u00ea\u00fc\u00b7\u00c8\u00b2\u00f5\u00c9\u007fE\u00c2\u00d0>_w\u008c0\u00d8\u00dc\u0081}\u00e5a\u0004\"\u0004\u0080C\u0002S\u00fd";
        var4_7 = "\u0014\u00c2\u00b6Lt\u00da\b+\u0017\u00bc\u00d1\u00a8\u00b6\u00cal\fa\u0011\u0002\u0016k\u00b2\u00da\u0082X6\u00c8r\u0006\u00bc=\u00fad/\u00f4\u0006^\u009b\u008f\u00bc\u0088q\t\u00a1\u0006\u00ba\u0099\u0084_\u0007Tr\u0011b\u001e,\u008e\b\u0083\u00fe\u00d4\u009e\u008a\u00a7\u000e\u00de\u00df\u00a1xG\u0006\u0003W\u00c8\u00e3s\u0093\u0011\u00ae\f\u00b5\u00cc;\u00cb\u0098\u00ddR\u00ab>*\u00ed[\u00c7\u00e8\u008b\u0004gg^=\nG\u00d3\u00887\u009c\u00b4l2\u00ccV\u000eEs\u00b8z\u00b5\u001c\u008b\b\u009e\u00d7\u00d7\u008b\u00a0\u00ae\f3\u001d\u00bc`\u00cdA5\u001dq\u000f\u00e2\u00d8\u0002\u00a3\u0018\u0007|jR\u0003d\u0005\u00e0\u0006\u00ed\u00e8\u0015\u0014\u00c8m\bMlp\u00be1[\u00f9\u00d1\t\u00d4\u0005\u00f2\u00e4!\u00bf3t\u00ee\u0004\u00d7\u00f6t\u00db\u00030#\u0017\u001b\u00ba\u00d8(\u0017r\u00a2P\u00d7\u0082A\\\u009d\u00f3J\u00f5\u00df\\89/8:\u00ab7\u00d6\u009b\u00f6\u0007\u00e6wY\u00c6Z \u00ac\u000bX\u00a5\u00aa\u009c$kmpC\u00dc\u00a2\u000e\"\u00e2TH(Z8\u00c0\u00e8\u00ce\u0019\u00a8y\u00ca\u0004\u0014\u00b3\f/\u0003\u00cc\u0086\u00ba\u0003\u00a6\u00a9\u00c5\bzE\u00c1\u00f1\u00eaX\u00f9\u00f8\u0017RX\u00eb#\f\u009co\u00b3\u00a5\u0011\u001e\u00b8\u0084\u00cd\u00bax$o\u0098S\u0004\u00fa\u0001\u000bR\u00cf\u00eb\u00d1\f\u00c2h_\u00fb}\u00ae\u0006\u0082\u00bb\u008c^\u00dd\u00b5\bWi\u00be,\u00a6dr\u00a3\bU\u000e$\u0098Vun]\n\\a\u00ffh\r#\u00fbLA\u009b\u0012\u00f2\u008a\u00ffy\u008e\u00d78\u00cb\u00ed\u0006\u00f8\u001cYHk\u00c9}\u0007\u0003\u00c5\u00d9\u009b\u0010\u00b3^\u00fd\u00a4\u0018\u00db\u00bct\u008f;K\u0012 {\u00b2I\n\u001e\u00fc\u00a3\u00d2\u00f9\b\u00c0\u00a5Y\u00a4\u000b\u00f5S\u00d4\u00a1\u00a9t\u00aa-|MS\u0002Yj\u0011\u00ee=\u0003mq\u00cf\u0093*d\u00d4\u00f55\u0018\u0007\u009a?\u009f\u0010\"\u000b\u00e5I\u00cd\u00d1W\u001a\u00a20\u00f7\r\u009b\u0094^S\u0011\u00a1\u0001C\u00e6A:\u0098\u00ac\u00f2\u0010vs6\u0087\u00db=\u0090\u000e\u0011]\u00a7\u0083\u0085\u0088;#\u00b5t\u001d\u00d1\u00db&\u0006\u0085\u00c1\u00dd\u00fb\u00cb\u0007\u0004Y&\u00ef\u0007\u0011#\u00dd\u00c5\u0093\u00c9\u008a\u00d7q\u00b2F\u00ff\u00be\u00ddJ\u00034\u00cf+z\u00fe\u00ad\u0007_\u0095~\u0085\u0082&\u001f\u00f3\u00e3T\u00bf\u009e\u007f\u0097!\u00d4\u00c6\u0086!\\u\u00f93\u0086\u00b3b=\u001a\u00eb\u000b\u0016\u00ee\u00ba\u00fc\u00a5\u00d4\u00c2$t\fB&f\u00f0\u00e7nK\u0019jE\u008e\u001c\"0\u00d8\u00a73\u0085\u009eY\u00e2\u00c1#}\u00b8\u00e9\u00cctX\u00b0K\u0083\u00ce\u00aaR\u00b5\u00aa\u00f6\u00f5P\u00ee\u00e1\u00fe\u0096\u0010_\u00ed\u0004C\u007f\u001f\u00b0\tM\u00a4\b\u00bcpo\u00e7\u00f77\t!\u0012\u00bd\u0081\u00e6O%\u009e%\t\u0002\u00b7\u00d95j\u00d9\u00b4L\u0017\u0010\u0006\u00f8Kp\u00ceAf'\u00d4Q _M\u00d2\u001f|\u0017\u0087PQ\"[\u00bc\u0085\u00b7\u00f8\u0096\u00a1\u00a1\u00e5>\u0096\u00fa\u00a1?(Y\u0012\u00bb\u00c3\u0004\u0088\u00e8\u009fD\u001f;P\u0011\u00ee\u007f~\u00b4\u00e9\u00be\u00eb\u007f?\u00e0Z$:\u0088\u00ed\u00af\u00fa/u+\u00dd\u00e4\u00aa\u00d1\u00f4\u0012GP\u000f\u00cf\u00e5\u00afU \u00a9\u00f8\u0090\u0015\u000b\u00ee$\u00d2\u00c5u\t\u008f\u00bd\u007f\u00ee<\u00b1\u0010\u0089\u0090\u0013+\u0001\u00c4\b\u00e9\u00f9\u00d4\u000ep\u00beK\u000b/\u00b5\u00ab\u009d\u00aby\u0006\u0005\u0014\u00970\u00de\u00d1\u000e\u0016mc\u0085\u001dHM)\u00e1R\u0093\u00c9\u0096\u0090\b\u00d4\u0015\u00ce\u00a3\u00a8\u0095\u00b3\u009d\u0004\u0095\u00f1D\u00f4\u0018\u00ab\u00a8\u00ab\u00dfd\u00991\u00e00\u008d\u007f\u001eIb\u00b0\u0093\u00da\u00fa\u0017\u0001\u00a0:-Z\u0019PTW\u00ea\u00fc\u00b7\u00c8\u00b2\u00f5\u00c9\u007fE\u00c2\u00d0>_w\u008c0\u00d8\u00dc\u0081}\u00e5a\u0004\"\u0004\u0080C\u0002S\u00fd".length();
        var1_8 = 6;
        var0_9 = -1;
        block0: while (true) {
            block7: {
                v1 = ++var0_9;
                v2 = var2_6.substring(v1, v1 + var1_8).toCharArray();
                v3 = v2.length;
                var7_10 = 0;
                v4 = 7;
                v5 = v2;
                v6 = v3;
                if (v3 > 1) ** GOTO lbl59
                break block7;
                while (true) {
                    var2_6 = "N9\u009a\u00ecG\u00117kl\u00d0\u001d\u00e0'\u00dd\u00f4\u00c7\u000f\u0006\f\u00f73\u00ebj\u00e8\u00cf^\u0003\u00d3\u0003y\u0096";
                    var4_7 = "N9\u009a\u00ecG\u00117kl\u00d0\u001d\u00e0'\u00dd\u00f4\u00c7\u000f\u0006\f\u00f73\u00ebj\u00e8\u00cf^\u0003\u00d3\u0003y\u0096".length();
                    var1_8 = 18;
                    var0_9 = -1;
lbl33:
                    // 2 sources

                    while (true) {
                        v7 = ++var0_9;
                        v8 = var2_6.substring(v7, v7 + var1_8).toCharArray();
                        v9 = v8.length;
                        var7_10 = 0;
                        v10 = 9;
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
                v5[v13] = (char)(v5[v13] ^ (v4 ^ 39));
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
            v11[v15] = (char)(v11[v15] ^ (v10 ^ 39));
            ++var7_10;
            v10 = v10;
lbl79:
            // 2 sources

            v16 = v11;
            v12 = v12;
        } while (v12 > var7_10);
        var5_4[var3_5++] = new String(v16).intern();
        if ((var0_9 += var1_8) >= var4_7) {
            aX7.cb = var5_4;
            aX7.db = new String[71];
            aX7.b(var10_1, (short)var11_2, var12_3);
            return;
        }
        var1_8 = var2_6.charAt(var0_9);
        ** while (true)
    }

    private static String a(int n, int n2, int n3) {
        int n4 = (n ^ n3 ^ 0x726) & 0xFFFF;
        if (db[n4] == null) {
            int n5;
            char[] cArray = cb[n4].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n5 = 205;
                    break;
                }
                case 1: {
                    n5 = 242;
                    break;
                }
                case 2: {
                    n5 = 128;
                    break;
                }
                case 3: {
                    n5 = 71;
                    break;
                }
                case 4: {
                    n5 = 210;
                    break;
                }
                case 5: {
                    n5 = 226;
                    break;
                }
                case 6: {
                    n5 = 98;
                    break;
                }
                case 7: {
                    n5 = 138;
                    break;
                }
                case 8: {
                    n5 = 249;
                    break;
                }
                case 9: {
                    n5 = 142;
                    break;
                }
                case 10: {
                    n5 = 166;
                    break;
                }
                case 11: {
                    n5 = 63;
                    break;
                }
                case 12: {
                    n5 = 6;
                    break;
                }
                case 13: {
                    n5 = 148;
                    break;
                }
                case 14: {
                    n5 = 69;
                    break;
                }
                case 15: {
                    n5 = 111;
                    break;
                }
                case 16: {
                    n5 = 218;
                    break;
                }
                case 17: {
                    n5 = 86;
                    break;
                }
                case 18: {
                    n5 = 198;
                    break;
                }
                case 19: {
                    n5 = 35;
                    break;
                }
                case 20: {
                    n5 = 158;
                    break;
                }
                case 21: {
                    n5 = 2;
                    break;
                }
                case 22: {
                    n5 = 203;
                    break;
                }
                case 23: {
                    n5 = 157;
                    break;
                }
                case 24: {
                    n5 = 78;
                    break;
                }
                case 25: {
                    n5 = 131;
                    break;
                }
                case 26: {
                    n5 = 235;
                    break;
                }
                case 27: {
                    n5 = 217;
                    break;
                }
                case 28: {
                    n5 = 187;
                    break;
                }
                case 29: {
                    n5 = 208;
                    break;
                }
                case 30: {
                    n5 = 171;
                    break;
                }
                case 31: {
                    n5 = 88;
                    break;
                }
                case 32: {
                    n5 = 162;
                    break;
                }
                case 33: {
                    n5 = 5;
                    break;
                }
                case 34: {
                    n5 = 60;
                    break;
                }
                case 35: {
                    n5 = 146;
                    break;
                }
                case 36: {
                    n5 = 132;
                    break;
                }
                case 37: {
                    n5 = 26;
                    break;
                }
                case 38: {
                    n5 = 144;
                    break;
                }
                case 39: {
                    n5 = 246;
                    break;
                }
                case 40: {
                    n5 = 96;
                    break;
                }
                case 41: {
                    n5 = 143;
                    break;
                }
                case 42: {
                    n5 = 10;
                    break;
                }
                case 43: {
                    n5 = 243;
                    break;
                }
                case 44: {
                    n5 = 238;
                    break;
                }
                case 45: {
                    n5 = 43;
                    break;
                }
                case 46: {
                    n5 = 153;
                    break;
                }
                case 47: {
                    n5 = 213;
                    break;
                }
                case 48: {
                    n5 = 181;
                    break;
                }
                case 49: {
                    n5 = 230;
                    break;
                }
                case 50: {
                    n5 = 0;
                    break;
                }
                case 51: {
                    n5 = 233;
                    break;
                }
                case 52: {
                    n5 = 15;
                    break;
                }
                case 53: {
                    n5 = 248;
                    break;
                }
                case 54: {
                    n5 = 214;
                    break;
                }
                case 55: {
                    n5 = 156;
                    break;
                }
                case 56: {
                    n5 = 55;
                    break;
                }
                case 57: {
                    n5 = 97;
                    break;
                }
                case 58: {
                    n5 = 136;
                    break;
                }
                case 59: {
                    n5 = 49;
                    break;
                }
                case 60: {
                    n5 = 211;
                    break;
                }
                case 61: {
                    n5 = 130;
                    break;
                }
                case 62: {
                    n5 = 50;
                    break;
                }
                case 63: {
                    n5 = 1;
                    break;
                }
                case 64: {
                    n5 = 185;
                    break;
                }
                case 65: {
                    n5 = 18;
                    break;
                }
                case 66: {
                    n5 = 175;
                    break;
                }
                case 67: {
                    n5 = 117;
                    break;
                }
                case 68: {
                    n5 = 62;
                    break;
                }
                case 69: {
                    n5 = 67;
                    break;
                }
                case 70: {
                    n5 = 180;
                    break;
                }
                case 71: {
                    n5 = 236;
                    break;
                }
                case 72: {
                    n5 = 23;
                    break;
                }
                case 73: {
                    n5 = 66;
                    break;
                }
                case 74: {
                    n5 = 129;
                    break;
                }
                case 75: {
                    n5 = 34;
                    break;
                }
                case 76: {
                    n5 = 161;
                    break;
                }
                case 77: {
                    n5 = 176;
                    break;
                }
                case 78: {
                    n5 = 65;
                    break;
                }
                case 79: {
                    n5 = 32;
                    break;
                }
                case 80: {
                    n5 = 219;
                    break;
                }
                case 81: {
                    n5 = 155;
                    break;
                }
                case 82: {
                    n5 = 51;
                    break;
                }
                case 83: {
                    n5 = 102;
                    break;
                }
                case 84: {
                    n5 = 221;
                    break;
                }
                case 85: {
                    n5 = 196;
                    break;
                }
                case 86: {
                    n5 = 183;
                    break;
                }
                case 87: {
                    n5 = 255;
                    break;
                }
                case 88: {
                    n5 = 39;
                    break;
                }
                case 89: {
                    n5 = 47;
                    break;
                }
                case 90: {
                    n5 = 48;
                    break;
                }
                case 91: {
                    n5 = 254;
                    break;
                }
                case 92: {
                    n5 = 188;
                    break;
                }
                case 93: {
                    n5 = 126;
                    break;
                }
                case 94: {
                    n5 = 141;
                    break;
                }
                case 95: {
                    n5 = 253;
                    break;
                }
                case 96: {
                    n5 = 139;
                    break;
                }
                case 97: {
                    n5 = 237;
                    break;
                }
                case 98: {
                    n5 = 44;
                    break;
                }
                case 99: {
                    n5 = 41;
                    break;
                }
                case 100: {
                    n5 = 25;
                    break;
                }
                case 101: {
                    n5 = 247;
                    break;
                }
                case 102: {
                    n5 = 57;
                    break;
                }
                case 103: {
                    n5 = 228;
                    break;
                }
                case 104: {
                    n5 = 108;
                    break;
                }
                case 105: {
                    n5 = 40;
                    break;
                }
                case 106: {
                    n5 = 53;
                    break;
                }
                case 107: {
                    n5 = 104;
                    break;
                }
                case 108: {
                    n5 = 28;
                    break;
                }
                case 109: {
                    n5 = 182;
                    break;
                }
                case 110: {
                    n5 = 118;
                    break;
                }
                case 111: {
                    n5 = 147;
                    break;
                }
                case 112: {
                    n5 = 19;
                    break;
                }
                case 113: {
                    n5 = 120;
                    break;
                }
                case 114: {
                    n5 = 14;
                    break;
                }
                case 115: {
                    n5 = 100;
                    break;
                }
                case 116: {
                    n5 = 152;
                    break;
                }
                case 117: {
                    n5 = 33;
                    break;
                }
                case 118: {
                    n5 = 222;
                    break;
                }
                case 119: {
                    n5 = 245;
                    break;
                }
                case 120: {
                    n5 = 68;
                    break;
                }
                case 121: {
                    n5 = 169;
                    break;
                }
                case 122: {
                    n5 = 121;
                    break;
                }
                case 123: {
                    n5 = 59;
                    break;
                }
                case 124: {
                    n5 = 200;
                    break;
                }
                case 125: {
                    n5 = 95;
                    break;
                }
                case 126: {
                    n5 = 125;
                    break;
                }
                case 127: {
                    n5 = 159;
                    break;
                }
                case 128: {
                    n5 = 127;
                    break;
                }
                case 129: {
                    n5 = 61;
                    break;
                }
                case 130: {
                    n5 = 224;
                    break;
                }
                case 131: {
                    n5 = 163;
                    break;
                }
                case 132: {
                    n5 = 167;
                    break;
                }
                case 133: {
                    n5 = 13;
                    break;
                }
                case 134: {
                    n5 = 82;
                    break;
                }
                case 135: {
                    n5 = 173;
                    break;
                }
                case 136: {
                    n5 = 79;
                    break;
                }
                case 137: {
                    n5 = 149;
                    break;
                }
                case 138: {
                    n5 = 140;
                    break;
                }
                case 139: {
                    n5 = 107;
                    break;
                }
                case 140: {
                    n5 = 240;
                    break;
                }
                case 141: {
                    n5 = 227;
                    break;
                }
                case 142: {
                    n5 = 216;
                    break;
                }
                case 143: {
                    n5 = 3;
                    break;
                }
                case 144: {
                    n5 = 186;
                    break;
                }
                case 145: {
                    n5 = 116;
                    break;
                }
                case 146: {
                    n5 = 170;
                    break;
                }
                case 147: {
                    n5 = 54;
                    break;
                }
                case 148: {
                    n5 = 241;
                    break;
                }
                case 149: {
                    n5 = 31;
                    break;
                }
                case 150: {
                    n5 = 99;
                    break;
                }
                case 151: {
                    n5 = 215;
                    break;
                }
                case 152: {
                    n5 = 9;
                    break;
                }
                case 153: {
                    n5 = 91;
                    break;
                }
                case 154: {
                    n5 = 16;
                    break;
                }
                case 155: {
                    n5 = 101;
                    break;
                }
                case 156: {
                    n5 = 223;
                    break;
                }
                case 157: {
                    n5 = 192;
                    break;
                }
                case 158: {
                    n5 = 178;
                    break;
                }
                case 159: {
                    n5 = 22;
                    break;
                }
                case 160: {
                    n5 = 38;
                    break;
                }
                case 161: {
                    n5 = 160;
                    break;
                }
                case 162: {
                    n5 = 105;
                    break;
                }
                case 163: {
                    n5 = 134;
                    break;
                }
                case 164: {
                    n5 = 189;
                    break;
                }
                case 165: {
                    n5 = 29;
                    break;
                }
                case 166: {
                    n5 = 194;
                    break;
                }
                case 167: {
                    n5 = 204;
                    break;
                }
                case 168: {
                    n5 = 37;
                    break;
                }
                case 169: {
                    n5 = 197;
                    break;
                }
                case 170: {
                    n5 = 177;
                    break;
                }
                case 171: {
                    n5 = 58;
                    break;
                }
                case 172: {
                    n5 = 110;
                    break;
                }
                case 173: {
                    n5 = 184;
                    break;
                }
                case 174: {
                    n5 = 239;
                    break;
                }
                case 175: {
                    n5 = 225;
                    break;
                }
                case 176: {
                    n5 = 103;
                    break;
                }
                case 177: {
                    n5 = 73;
                    break;
                }
                case 178: {
                    n5 = 123;
                    break;
                }
                case 179: {
                    n5 = 207;
                    break;
                }
                case 180: {
                    n5 = 206;
                    break;
                }
                case 181: {
                    n5 = 151;
                    break;
                }
                case 182: {
                    n5 = 45;
                    break;
                }
                case 183: {
                    n5 = 244;
                    break;
                }
                case 184: {
                    n5 = 76;
                    break;
                }
                case 185: {
                    n5 = 92;
                    break;
                }
                case 186: {
                    n5 = 209;
                    break;
                }
                case 187: {
                    n5 = 93;
                    break;
                }
                case 188: {
                    n5 = 122;
                    break;
                }
                case 189: {
                    n5 = 112;
                    break;
                }
                case 190: {
                    n5 = 115;
                    break;
                }
                case 191: {
                    n5 = 252;
                    break;
                }
                case 192: {
                    n5 = 212;
                    break;
                }
                case 193: {
                    n5 = 7;
                    break;
                }
                case 194: {
                    n5 = 11;
                    break;
                }
                case 195: {
                    n5 = 46;
                    break;
                }
                case 196: {
                    n5 = 64;
                    break;
                }
                case 197: {
                    n5 = 52;
                    break;
                }
                case 198: {
                    n5 = 109;
                    break;
                }
                case 199: {
                    n5 = 21;
                    break;
                }
                case 200: {
                    n5 = 114;
                    break;
                }
                case 201: {
                    n5 = 234;
                    break;
                }
                case 202: {
                    n5 = 172;
                    break;
                }
                case 203: {
                    n5 = 17;
                    break;
                }
                case 204: {
                    n5 = 193;
                    break;
                }
                case 205: {
                    n5 = 74;
                    break;
                }
                case 206: {
                    n5 = 80;
                    break;
                }
                case 207: {
                    n5 = 42;
                    break;
                }
                case 208: {
                    n5 = 220;
                    break;
                }
                case 209: {
                    n5 = 168;
                    break;
                }
                case 210: {
                    n5 = 190;
                    break;
                }
                case 211: {
                    n5 = 150;
                    break;
                }
                case 212: {
                    n5 = 135;
                    break;
                }
                case 213: {
                    n5 = 174;
                    break;
                }
                case 214: {
                    n5 = 30;
                    break;
                }
                case 215: {
                    n5 = 133;
                    break;
                }
                case 216: {
                    n5 = 191;
                    break;
                }
                case 217: {
                    n5 = 72;
                    break;
                }
                case 218: {
                    n5 = 85;
                    break;
                }
                case 219: {
                    n5 = 4;
                    break;
                }
                case 220: {
                    n5 = 229;
                    break;
                }
                case 221: {
                    n5 = 137;
                    break;
                }
                case 222: {
                    n5 = 89;
                    break;
                }
                case 223: {
                    n5 = 250;
                    break;
                }
                case 224: {
                    n5 = 36;
                    break;
                }
                case 225: {
                    n5 = 202;
                    break;
                }
                case 226: {
                    n5 = 75;
                    break;
                }
                case 227: {
                    n5 = 83;
                    break;
                }
                case 228: {
                    n5 = 20;
                    break;
                }
                case 229: {
                    n5 = 87;
                    break;
                }
                case 230: {
                    n5 = 232;
                    break;
                }
                case 231: {
                    n5 = 145;
                    break;
                }
                case 232: {
                    n5 = 77;
                    break;
                }
                case 233: {
                    n5 = 27;
                    break;
                }
                case 234: {
                    n5 = 94;
                    break;
                }
                case 235: {
                    n5 = 231;
                    break;
                }
                case 236: {
                    n5 = 164;
                    break;
                }
                case 237: {
                    n5 = 124;
                    break;
                }
                case 238: {
                    n5 = 119;
                    break;
                }
                case 239: {
                    n5 = 81;
                    break;
                }
                case 240: {
                    n5 = 90;
                    break;
                }
                case 241: {
                    n5 = 154;
                    break;
                }
                case 242: {
                    n5 = 84;
                    break;
                }
                case 243: {
                    n5 = 24;
                    break;
                }
                case 244: {
                    n5 = 165;
                    break;
                }
                case 245: {
                    n5 = 199;
                    break;
                }
                case 246: {
                    n5 = 201;
                    break;
                }
                case 247: {
                    n5 = 195;
                    break;
                }
                case 248: {
                    n5 = 251;
                    break;
                }
                case 249: {
                    n5 = 70;
                    break;
                }
                case 250: {
                    n5 = 12;
                    break;
                }
                case 251: {
                    n5 = 106;
                    break;
                }
                case 252: {
                    n5 = 113;
                    break;
                }
                case 253: {
                    n5 = 179;
                    break;
                }
                case 254: {
                    n5 = 56;
                    break;
                }
                default: {
                    n5 = 8;
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
            aX7.db[n4] = new String(cArray).intern();
        }
        return db[n4];
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.Hp
 */
public class hp_0 {
    public static String M = "fogMode";
    public static String h = "noisetex";
    public static String O = "eyeAltitude";
    public static String Y = "wetness";
    public static String as = "far";
    public static String x = "colortex7";
    public static String b = "gdepth";
    public static String ap = "depthtex2";
    public static String J = "moonPosition";
    public static String t = "gbufferModelViewInverse";
    public static String P = "terrainIconSize";
    public static String g = "eyeBrightness";
    public static String al = "gaux3";
    private static String[] cb;
    public static String k = "lightmap";
    public static String A = "colortex4";
    public static String a = "normals";
    public static String K = "colortex5";
    public static String au = "texture";
    public static String B = "gaux4";
    public static String R = "colortex3";
    public static String at = "shadowModelView";
    public static String W = "frameTimeCounter";
    public static String am = "colortex2";
    public static String d = "near";
    public static String av = "shadowtex1";
    private static String[] db;
    public static String m = "gaux1";
    public static String u = "shadowcolor1";
    public static String H = "shadowAngle";
    public static String f = "eyeBrightnessSmooth";
    public static String o = "sunPosition";
    public static String ah = "shadowcolor0";
    public static String r = "cameraPosition";
    public static String aj = "sunAngle";
    private static long bb;
    public static String v = "viewWidth";
    public static String ai = "previousCameraPosition";
    public static String ar = "fogColor";
    public static String F = "depthtex1";
    public static String af = "gbufferModelView";
    public static String l = "moonPhase";
    public static String e = "shadowProjection";
    public static String N = "shadow";
    public static String I = "tex";
    public static String an = "watershadow";
    public static String ac = "worldTime";
    public static String q = "gcolor";
    public static String T = "gbufferProjection";
    public static String E = "atlasSize";
    public static String i = "gbufferPreviousModelView";
    public static String ao = "depthtex0";
    public static String Q = "colortex0";
    public static String C = "gbufferPreviousProjection";
    public static String Z = "composite";
    public static String z = "skyColor";
    public static String j = "gaux2";
    public static String ag = "colortex1";
    public static String G = "gnormal";
    public static String c = "centerDepthSmooth";
    public static String ak = "shadowcolor";
    public static String s = "heldItemId";
    public static String V = "aspectRatio";
    public static String n = "upPosition";
    public static String U = "shadowProjectionInverse";
    public static String ad = "specular";
    public static String aq = "isEyeInWater";
    public static String p = "hideGUI";
    public static String ab = "viewHeight";
    public static String y = "rainStrength";
    public static String ae = "gdepthtex";
    public static String L = "gbufferProjectionInverse";
    public static String D = "terrainTextureSize";
    public static String S = "shadowModelViewInverse";
    public static String w = "heldBlockLightValue";
    public static String X = "colortex6";
    public static String aa = "shadowtex0";

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        hp_0.bb = a1c.a(3039467876006682311L, 3116529143359029703L, null).a(200155085180023L);
        var8 = hp_0.bb ^ 125810060961720L;
        v0 = var8 ^ 57705599374984L;
        var10_1 = (int)(v0 >>> 32);
        var11_2 = (int)(v0 << 32 >>> 48);
        var12_3 = (int)(v0 << 48 >>> 48);
        var5_4 = new String[74];
        var3_5 = 0;
        var2_6 = "\bD`\u00f1o\u00ef\u000f1\n\u00d6\u00aa(\t$\u0002\u00fa\u00d5\u008d\u0002\u00eb\u00f8\u000e\b\u00e9\u00f1S\u00dc\u00e6\u00db\u0010\u00af\tD\u0015\u00f67\f^\u00dbs\f\u0004\u001f\u00a3<\u00b7\u0016\u00e7a\u009dU\u00d0{\u00d6\u00a3\u00d2\u008e\u00a6\u000f\u0012\u001bKk\u0083\u0003\u00f7\u00e4G\u00ff\u0011\u00af\u0083\u0016@>\u0089\u001c\u0092Ez\u0086\u00e9\u00da\u0083\u0007m\u00d7\t\u00e1\u0088\u00b9\u00d4`Z\u000f\u00f3\u0092\u0011\u008e\u00e1\u00ad\u00f92\u00f9\u00c8\\-+\u00cb\u008d?\u00e4r\u00e2\u00b9\r\u0003\u0016\u00d1\u00ae\u00c0\u00f8@\t\u007f7\bw\u00f5\u0010\u00acMv\u00992\u00b2\u009d\u00e8h\u0080\u0092\u00d5\u00831\u00b3\u009d\u0018\rjB}\u00b4.Mfo\u00e4\u00c3:r\u00f9\u0012\"u\u00f7\"\u00a6\u0081$\u0002\u00c0\u000b\u00ad\u00f1Ena9{a\u00e6\u0013;\u000b\u0081\u00b6Q\u00afI$\u00e9I\u00bb\u00fb\u00e1\t@14\u00c5U\u00e8\u00ddd\u0012\t>\u0099\u00b9\u00a6\u00e5l\u00e65\u00a9\n?M'\u00e2$\u00ee\u00afIQ\u00cb\u0018\u00da\u00e9\u00b8\r\u00eb \u00a6\u00a7\u0012\u00d6p;\u0097U9\u00b4Hn\u00af\u0007iR\\d\u0006z\u00e6\u00b6\u00c7z%\u0005%\u00cfG\u00b4@\n%\u00872\u0099.\u0096\u00af\u00c5\u00e8\u008f\u000brh \u00fe\u0089\u00b8\u00d9D\u009e\u0000\u0081\u0005v\u000f-\u00ac\u000e\u0013\t\u009f5&D\u000e\u00eey\u00bcq\u0080\u00cdrEG\u00bb\u00057e\u0005\u007f\u0081\f}(\u000fe9\u00cd^\u00da\u001a\u0097\u008f\u00fa\u000b\u00a3\u00bf\u00b2\r_\n'\u00fe\u0085\u00a6\u00d3\u0005\u008ff\u00fb(\u0007\u00cb-\u0089z\u00ef\u00d1D\tw\u00f6\u0091T\u00dc\u00c9sj\u00c7\u0007\b\u00a5\u009eq\u0090\u00e8\u00af\u0007T^F\\\u00d4i\u00a7\u0007\u008aM\u00a8\u0000\u00bb\u0013\u00d8\u0016\u00f6\u00b6\u00d8\u00e4\u00fa\u0005mk\u00bd\f\u0089\u00e8\u00cd\u00b6\u00ef|\u00c9\u001c\u0011\u00e0\u00b4\f\t'\u0084\u009a\u0005\u0081\u0018j\u00bb=\b\u00c5\u0095h\u000b\u00a8h\u00fb\u00a4\u0006\u00f2\u00bf?\u008e\u0084\u0000\fa}0\u00b3\u00cf']\u00e9\u00e1\u00e9l\u00f4\bxv\u00d8G{\u00cf\u00c0A\u0007|\u00fc\u0093\u00c6\u009c\nv\tT\u00f5\u00f4+L\u00dd\u00d3\u0003\u000e\u0013@\u0011\u00b9N\u00cd\u00e4\u00e1\u008aKG\u008ey%b\u00ee\u0092o\u00dcF\u0003\u00d1V\u00a5\u0007|W_]Ne-\u000b\u0015\u0086\u00c3\u00a9\u001b\u00e4\u0081P\u00db\u00fa\u0090\t+\u00af\u0096\u0015.\u00faHe\u0003\n9\"3\u0091\u008f\u00e0\u00f7\u00b1\u00f6\u008f\b\u00c2\u0005!\u009d\\\u00bae\u00fe\t\u0017\u000b\u009c\u00f4A&r|<\t\u00a7!F\u00b0[\u0093S^\u00ca\u0017\u00bcc\u00f6\u0015\u00bdsf\u00bfq\u00bc\u00b1\u0092\u00c57\u0017D4=\u00d1/\u00f3e\u00af\u0006\n\u00df\u00b2\u001b\u00aa;\u000f\u00e0q\u0089\u00ed-\u00a6\u0085\u00e3\u00f8n\u0006]D\u00eb\u0093\b\u00ec\u00d2\u0006\u000e~\u0087Wz\f9\u00d0\u0095\u008e!S\u000e\u00bb G\u00e9\u0083\u0003\b\u00c4\u00c4\t\u00e0\u00c3\u0099\u00bddw\u008fV\u0081\u0017\u00ec\u00c8~)3\u00a4\u00bd*l\u00d8\u0012\u00de\u0093P\u00b1\u00b1\u00ab\u00b9\"\u00bf\u008dw`\u000b\u00aeI\u00f5)\u00e2\u00d6\u0002{\u00a4Vy\bn\u00ae\u00a8\u00b0\u00e8;\u00a4\u00ce\u0005\u0019\u008b\u00c0<\u00b6\u000b\u0000\u0087\u00b1\u009f\u00d2\u00a0\u00d1\u00a0\u0083\u0097\u00b6\u000e\u001a\u0011<rt\u00a8\u00e1\r\u009dW\u00a2\u0086\u008f\u00f9\t.O\u00bb|\u00a57\u00ee^\u00ab\t\u00ce\u0011/\u00b4\u00fcm\u001d$\n\tV4\n\u00cd\u009e\u0007\t\u00ea)\u0010\u00ba\u00056\u00d9\u00a5\u00eae\u008c\u0011\u00da\u00bd^D\u00ae'w\u0012\u0007\rub\u00b2Wv\u00c0\u0080\u00a3\u00d57|[\u00daC\u00051\u0010\u00e5Ej\u0081$\u00ea'\u00d4M\u0004w\u009fL_u\u00eb\t\th\u00a4\u00c8\u00c3\u00d9{\u0083\u001e\n\u00dc\u009c\u00fa\u00ea<\u008crWD\u000f\t\u0000\u00db~\u00ee\u001de\u00f9\u0014N\f\u0093\u0006:\u009b\u0011\u00eaj\u00f8\u0097\u00ac]7";
        var4_7 = "\bD`\u00f1o\u00ef\u000f1\n\u00d6\u00aa(\t$\u0002\u00fa\u00d5\u008d\u0002\u00eb\u00f8\u000e\b\u00e9\u00f1S\u00dc\u00e6\u00db\u0010\u00af\tD\u0015\u00f67\f^\u00dbs\f\u0004\u001f\u00a3<\u00b7\u0016\u00e7a\u009dU\u00d0{\u00d6\u00a3\u00d2\u008e\u00a6\u000f\u0012\u001bKk\u0083\u0003\u00f7\u00e4G\u00ff\u0011\u00af\u0083\u0016@>\u0089\u001c\u0092Ez\u0086\u00e9\u00da\u0083\u0007m\u00d7\t\u00e1\u0088\u00b9\u00d4`Z\u000f\u00f3\u0092\u0011\u008e\u00e1\u00ad\u00f92\u00f9\u00c8\\-+\u00cb\u008d?\u00e4r\u00e2\u00b9\r\u0003\u0016\u00d1\u00ae\u00c0\u00f8@\t\u007f7\bw\u00f5\u0010\u00acMv\u00992\u00b2\u009d\u00e8h\u0080\u0092\u00d5\u00831\u00b3\u009d\u0018\rjB}\u00b4.Mfo\u00e4\u00c3:r\u00f9\u0012\"u\u00f7\"\u00a6\u0081$\u0002\u00c0\u000b\u00ad\u00f1Ena9{a\u00e6\u0013;\u000b\u0081\u00b6Q\u00afI$\u00e9I\u00bb\u00fb\u00e1\t@14\u00c5U\u00e8\u00ddd\u0012\t>\u0099\u00b9\u00a6\u00e5l\u00e65\u00a9\n?M'\u00e2$\u00ee\u00afIQ\u00cb\u0018\u00da\u00e9\u00b8\r\u00eb \u00a6\u00a7\u0012\u00d6p;\u0097U9\u00b4Hn\u00af\u0007iR\\d\u0006z\u00e6\u00b6\u00c7z%\u0005%\u00cfG\u00b4@\n%\u00872\u0099.\u0096\u00af\u00c5\u00e8\u008f\u000brh \u00fe\u0089\u00b8\u00d9D\u009e\u0000\u0081\u0005v\u000f-\u00ac\u000e\u0013\t\u009f5&D\u000e\u00eey\u00bcq\u0080\u00cdrEG\u00bb\u00057e\u0005\u007f\u0081\f}(\u000fe9\u00cd^\u00da\u001a\u0097\u008f\u00fa\u000b\u00a3\u00bf\u00b2\r_\n'\u00fe\u0085\u00a6\u00d3\u0005\u008ff\u00fb(\u0007\u00cb-\u0089z\u00ef\u00d1D\tw\u00f6\u0091T\u00dc\u00c9sj\u00c7\u0007\b\u00a5\u009eq\u0090\u00e8\u00af\u0007T^F\\\u00d4i\u00a7\u0007\u008aM\u00a8\u0000\u00bb\u0013\u00d8\u0016\u00f6\u00b6\u00d8\u00e4\u00fa\u0005mk\u00bd\f\u0089\u00e8\u00cd\u00b6\u00ef|\u00c9\u001c\u0011\u00e0\u00b4\f\t'\u0084\u009a\u0005\u0081\u0018j\u00bb=\b\u00c5\u0095h\u000b\u00a8h\u00fb\u00a4\u0006\u00f2\u00bf?\u008e\u0084\u0000\fa}0\u00b3\u00cf']\u00e9\u00e1\u00e9l\u00f4\bxv\u00d8G{\u00cf\u00c0A\u0007|\u00fc\u0093\u00c6\u009c\nv\tT\u00f5\u00f4+L\u00dd\u00d3\u0003\u000e\u0013@\u0011\u00b9N\u00cd\u00e4\u00e1\u008aKG\u008ey%b\u00ee\u0092o\u00dcF\u0003\u00d1V\u00a5\u0007|W_]Ne-\u000b\u0015\u0086\u00c3\u00a9\u001b\u00e4\u0081P\u00db\u00fa\u0090\t+\u00af\u0096\u0015.\u00faHe\u0003\n9\"3\u0091\u008f\u00e0\u00f7\u00b1\u00f6\u008f\b\u00c2\u0005!\u009d\\\u00bae\u00fe\t\u0017\u000b\u009c\u00f4A&r|<\t\u00a7!F\u00b0[\u0093S^\u00ca\u0017\u00bcc\u00f6\u0015\u00bdsf\u00bfq\u00bc\u00b1\u0092\u00c57\u0017D4=\u00d1/\u00f3e\u00af\u0006\n\u00df\u00b2\u001b\u00aa;\u000f\u00e0q\u0089\u00ed-\u00a6\u0085\u00e3\u00f8n\u0006]D\u00eb\u0093\b\u00ec\u00d2\u0006\u000e~\u0087Wz\f9\u00d0\u0095\u008e!S\u000e\u00bb G\u00e9\u0083\u0003\b\u00c4\u00c4\t\u00e0\u00c3\u0099\u00bddw\u008fV\u0081\u0017\u00ec\u00c8~)3\u00a4\u00bd*l\u00d8\u0012\u00de\u0093P\u00b1\u00b1\u00ab\u00b9\"\u00bf\u008dw`\u000b\u00aeI\u00f5)\u00e2\u00d6\u0002{\u00a4Vy\bn\u00ae\u00a8\u00b0\u00e8;\u00a4\u00ce\u0005\u0019\u008b\u00c0<\u00b6\u000b\u0000\u0087\u00b1\u009f\u00d2\u00a0\u00d1\u00a0\u0083\u0097\u00b6\u000e\u001a\u0011<rt\u00a8\u00e1\r\u009dW\u00a2\u0086\u008f\u00f9\t.O\u00bb|\u00a57\u00ee^\u00ab\t\u00ce\u0011/\u00b4\u00fcm\u001d$\n\tV4\n\u00cd\u009e\u0007\t\u00ea)\u0010\u00ba\u00056\u00d9\u00a5\u00eae\u008c\u0011\u00da\u00bd^D\u00ae'w\u0012\u0007\rub\u00b2Wv\u00c0\u0080\u00a3\u00d57|[\u00daC\u00051\u0010\u00e5Ej\u0081$\u00ea'\u00d4M\u0004w\u009fL_u\u00eb\t\th\u00a4\u00c8\u00c3\u00d9{\u0083\u001e\n\u00dc\u009c\u00fa\u00ea<\u008crWD\u000f\t\u0000\u00db~\u00ee\u001de\u00f9\u0014N\f\u0093\u0006:\u009b\u0011\u00eaj\u00f8\u0097\u00ac]7".length();
        var1_8 = 12;
        var0_9 = -1;
        block0: while (true) {
            block7: {
                v1 = ++var0_9;
                v2 = var2_6.substring(v1, v1 + var1_8).toCharArray();
                v3 = v2.length;
                var7_10 = 0;
                v4 = 86;
                v5 = v2;
                v6 = v3;
                if (v3 > 1) ** GOTO lbl59
                break block7;
                while (true) {
                    var2_6 = "\u00f3\u00b4\u00d0\u00eb\u00ab\u00b1\u00e3\u00d8\u00f7t\u0081\"\u00e4;\u001a)|%\u00d5@\u00b0\u00c2\u00b5\u009d\u00a9\f\u00db\fW\u00b5\u00c4*7\u00c4@%\u00ae\u001a";
                    var4_7 = "\u00f3\u00b4\u00d0\u00eb\u00ab\u00b1\u00e3\u00d8\u00f7t\u0081\"\u00e4;\u001a)|%\u00d5@\u00b0\u00c2\u00b5\u009d\u00a9\f\u00db\fW\u00b5\u00c4*7\u00c4@%\u00ae\u001a".length();
                    var1_8 = 25;
                    var0_9 = -1;
lbl33:
                    // 2 sources

                    while (true) {
                        v7 = ++var0_9;
                        v8 = var2_6.substring(v7, v7 + var1_8).toCharArray();
                        v9 = v8.length;
                        var7_10 = 0;
                        v10 = 55;
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
                v5[v13] = (char)(v5[v13] ^ (v4 ^ 100));
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
            v11[v15] = (char)(v11[v15] ^ (v10 ^ 100));
            ++var7_10;
            v10 = v10;
lbl79:
            // 2 sources

            v16 = v11;
            v12 = v12;
        } while (v12 > var7_10);
        var5_4[var3_5++] = new String(v16).intern();
        if ((var0_9 += var1_8) >= var4_7) {
            hp_0.cb = var5_4;
            hp_0.db = new String[74];
            hp_0.b(var10_1, (char)var11_2, var12_3);
            return;
        }
        var1_8 = var2_6.charAt(var0_9);
        ** while (true)
    }

    public static void b(int n, char c, int n2) {
        long l4 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ bb;
        G = hp_0.a(-834784830 - -((char)-31254), 834784830 - (char)-16074, (int)l4);
        am = hp_0.a(-834784830 - -((char)-31248), 834753565, (int)l4);
        C = hp_0.a(-834784830 - -((char)-31175), -834760898, (int)l4);
        m = hp_0.a(-834784830 - -((char)-31261), 834784830 - (char)-26379, (int)l4);
        ap = hp_0.a(-834784830 - -((char)-31246), 834784830 - (char)-24667, (int)l4);
        z = hp_0.a(-834784830 - -((char)-31269), 834758941, (int)l4);
        F = hp_0.a(-834784830 - -((char)-31294), -834759997, (int)l4);
        Z = hp_0.a(-834784830 - -((char)-31251), 834784830 - (char)-17825, (int)l4);
        p = hp_0.a(-834784830 - -((char)-31277), 834784830 - (char)-18570, (int)l4);
        N = hp_0.a(-834784830 - -((char)-31282), -834758539, (int)l4);
        E = hp_0.a(-834784830 - -((char)-31237), 834754245, (int)l4);
        aq = hp_0.a(-834784830 - -((char)-31275), -834784830 - -((char)-30459), (int)l4);
        u = hp_0.a(-834784830 - -((char)-31247), 834762388, (int)l4);
        au = hp_0.a(-834784830 - -((char)-31252), 834759321, (int)l4);
        aj = hp_0.a(-834784830 - -((char)-31249), -834784830 - -((char)-30694), (int)l4);
        q = hp_0.a(-834784830 - -((char)-31265), 834758771, (int)l4);
        x = hp_0.a(-834784830 - -((char)-31285), 834754102, (int)l4);
        U = hp_0.a(-834784830 - -((char)-31296), 834784830 - (char)-13590, (int)l4);
        af = hp_0.a(-834784830 - -((char)-31241), 834784830 - (char)-26850, (int)l4);
        W = hp_0.a(-834784830 - -((char)-31186), 834784830 - (char)-16523, (int)l4);
        r = hp_0.a(-834784830 - -((char)-31284), 834759880, (int)l4);
        hp_0.n = hp_0.a(-834784830 - -((char)-31259), 834784830 - (char)-30063, (int)l4);
        l = hp_0.a(-834784830 - -((char)-31295), -834784830 - -((char)-30720), (int)l4);
        ad = hp_0.a(-834784830 - -((char)-31289), 834784830 - (char)-19920, (int)l4);
        d = hp_0.a(-834784830 - -((char)-31243), 834784830 - (char)-14083, (int)l4);
        L = hp_0.a(-834784830 - -((char)-31242), -834784830 - -((char)-16482), (int)l4);
        J = hp_0.a(-834784830 - -((char)-31292), -834784830 - -((char)-13630), (int)l4);
        Y = hp_0.a(-834784830 - -((char)-31258), 834763361, (int)l4);
        y = hp_0.a(-834784830 - -((char)-31182), 834761311, (int)l4);
        b = hp_0.a(-834784830 - -((char)-31297), 834757127, (int)l4);
        an = hp_0.a(-834784830 - -((char)-31235), 834757339, (int)l4);
        g = hp_0.a(-834784830 - -((char)-31240), 834752275, (int)l4);
        K = hp_0.a(-834784830 - -((char)-31278), -834784830 - -((char)-27954), (int)l4);
        h = hp_0.a(-834784830 - -((char)-31276), 834757035, (int)l4);
        as = hp_0.a(-834784830 - -((char)-31293), -834784830 - -((char)-16443), (int)l4);
        ae = hp_0.a(-834784830 - -((char)-31267), 834760191, (int)l4);
        A = hp_0.a(-834784830 - -((char)-31238), 834784830 - (char)-18223, (int)l4);
        I = hp_0.a(-834784830 - -((char)-31272), 834784830 - (char)-29414, (int)l4);
        t = hp_0.a(-834784830 - -((char)-31287), 834755979, (int)l4);
        e = hp_0.a(-834784830 - -((char)-31184), 834784830 - (char)-25153, (int)l4);
        k = hp_0.a(-834784830 - -((char)-31291), 834784830 - (char)-32326, (int)l4);
        ao = hp_0.a(-834784830 - -((char)-31179), -834784830 - -((char)-25859), (int)l4);
        M = hp_0.a(-834784830 - -((char)-31273), -834784830 - -((char)-13816), (int)l4);
        aa = hp_0.a(-834784830 - -((char)-31257), -834763017, (int)l4);
        s = hp_0.a(-834784830 - -((char)-31268), -834784830 - -((char)-19777), (int)l4);
        a = hp_0.a(-834784830 - -((char)-31253), -834784830 - -((char)-29743), (int)l4);
        ab = hp_0.a(-834784830 - -((char)-31263), 834756150, (int)l4);
        av = hp_0.a(-834784830 - -((char)-31180), 834755300, (int)l4);
        o = hp_0.a(-834784830 - -((char)-31260), 834759811, (int)l4);
        ac = hp_0.a(-834784830 - -((char)-31286), -834784830 - -((char)-29785), (int)l4);
        w = hp_0.a(-834784830 - -((char)-31262), 834755507, (int)l4);
        ag = hp_0.a(-834784830 - -((char)-31280), -834784830 - -((char)-29659), (int)l4);
        Q = hp_0.a(-834784830 - -((char)-31181), 834784830 - (char)-26033, (int)l4);
        ah = hp_0.a(-834784830 - -((char)-31176), 834784830 - (char)-23105, (int)l4);
        R = hp_0.a(-834784830 - -((char)-31270), 834784830 - (char)-32723, (int)l4);
        v = hp_0.a(-834784830 - -((char)-31183), -834784830 - -((char)-28781), (int)l4);
        al = hp_0.a(-834784830 - -((char)-31255), -834759521, (int)l4);
        ai = hp_0.a(-834784830 - -((char)-31279), 834784830 - (char)-27466, (int)l4);
        ar = hp_0.a(-834784830 - -((char)-31281), 834759812, (int)l4);
        P = hp_0.a(-834784830 - -((char)-31298), 834784830 - (char)-21141, (int)l4);
        at = hp_0.a(-834784830 - -((char)-31256), -834762373, (int)l4);
        ak = hp_0.a(-834784830 - -((char)-31274), -834760457, (int)l4);
        V = hp_0.a(-834784830 - -((char)-31288), -834784830 - -((char)-21989), (int)l4);
        i = hp_0.a(-834784830 - -((char)-31264), 834757287, (int)l4);
        S = hp_0.a(-834784830 - -((char)-31244), -834763359, (int)l4);
        B = hp_0.a(-834784830 - -((char)-31290), 834784830 - (char)-13092, (int)l4);
        H = hp_0.a(-834784830 - -((char)-31236), 834762457, (int)l4);
        D = hp_0.a(-834784830 - -((char)-31185), -834755299, (int)l4);
        O = hp_0.a(-834784830 - -((char)-31283), -834784830 - -((char)-13293), (int)l4);
        j = hp_0.a(-834784830 - -((char)-31266), -834758501, (int)l4);
        T = hp_0.a(-834784830 - -((char)-31245), 834784830 - (char)-15589, (int)l4);
        hp_0.c = hp_0.a(-834784830 - -((char)-31239), 834784830 - (char)-30692, (int)l4);
        X = hp_0.a(-834784830 - -((char)-31250), 834784830 - (char)-19317, (int)l4);
        f = hp_0.a(-834784830 - -((char)-31271), -834784830 - -((char)-30201), (int)l4);
    }

    private static String a(int n, int n2, int n3) {
        int n4 = (n ^ n3 ^ 0x683) & 0xFFFF;
        if (db[n4] == null) {
            int n5;
            char[] cArray = cb[n4].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n5 = 9;
                    break;
                }
                case 1: {
                    n5 = 144;
                    break;
                }
                case 2: {
                    n5 = 205;
                    break;
                }
                case 3: {
                    n5 = 62;
                    break;
                }
                case 4: {
                    n5 = 241;
                    break;
                }
                case 5: {
                    n5 = 49;
                    break;
                }
                case 6: {
                    n5 = 231;
                    break;
                }
                case 7: {
                    n5 = 245;
                    break;
                }
                case 8: {
                    n5 = 148;
                    break;
                }
                case 9: {
                    n5 = 202;
                    break;
                }
                case 10: {
                    n5 = 204;
                    break;
                }
                case 11: {
                    n5 = 78;
                    break;
                }
                case 12: {
                    n5 = 238;
                    break;
                }
                case 13: {
                    n5 = 139;
                    break;
                }
                case 14: {
                    n5 = 153;
                    break;
                }
                case 15: {
                    n5 = 215;
                    break;
                }
                case 16: {
                    n5 = 58;
                    break;
                }
                case 17: {
                    n5 = 228;
                    break;
                }
                case 18: {
                    n5 = 194;
                    break;
                }
                case 19: {
                    n5 = 237;
                    break;
                }
                case 20: {
                    n5 = 255;
                    break;
                }
                case 21: {
                    n5 = 97;
                    break;
                }
                case 22: {
                    n5 = 184;
                    break;
                }
                case 23: {
                    n5 = 59;
                    break;
                }
                case 24: {
                    n5 = 162;
                    break;
                }
                case 25: {
                    n5 = 81;
                    break;
                }
                case 26: {
                    n5 = 137;
                    break;
                }
                case 27: {
                    n5 = 16;
                    break;
                }
                case 28: {
                    n5 = 135;
                    break;
                }
                case 29: {
                    n5 = 32;
                    break;
                }
                case 30: {
                    n5 = 132;
                    break;
                }
                case 31: {
                    n5 = 14;
                    break;
                }
                case 32: {
                    n5 = 150;
                    break;
                }
                case 33: {
                    n5 = 99;
                    break;
                }
                case 34: {
                    n5 = 113;
                    break;
                }
                case 35: {
                    n5 = 224;
                    break;
                }
                case 36: {
                    n5 = 73;
                    break;
                }
                case 37: {
                    n5 = 219;
                    break;
                }
                case 38: {
                    n5 = 60;
                    break;
                }
                case 39: {
                    n5 = 115;
                    break;
                }
                case 40: {
                    n5 = 173;
                    break;
                }
                case 41: {
                    n5 = 126;
                    break;
                }
                case 42: {
                    n5 = 19;
                    break;
                }
                case 43: {
                    n5 = 6;
                    break;
                }
                case 44: {
                    n5 = 65;
                    break;
                }
                case 45: {
                    n5 = 46;
                    break;
                }
                case 46: {
                    n5 = 30;
                    break;
                }
                case 47: {
                    n5 = 190;
                    break;
                }
                case 48: {
                    n5 = 87;
                    break;
                }
                case 49: {
                    n5 = 207;
                    break;
                }
                case 50: {
                    n5 = 142;
                    break;
                }
                case 51: {
                    n5 = 209;
                    break;
                }
                case 52: {
                    n5 = 11;
                    break;
                }
                case 53: {
                    n5 = 236;
                    break;
                }
                case 54: {
                    n5 = 166;
                    break;
                }
                case 55: {
                    n5 = 157;
                    break;
                }
                case 56: {
                    n5 = 216;
                    break;
                }
                case 57: {
                    n5 = 31;
                    break;
                }
                case 58: {
                    n5 = 91;
                    break;
                }
                case 59: {
                    n5 = 48;
                    break;
                }
                case 60: {
                    n5 = 200;
                    break;
                }
                case 61: {
                    n5 = 37;
                    break;
                }
                case 62: {
                    n5 = 100;
                    break;
                }
                case 63: {
                    n5 = 248;
                    break;
                }
                case 64: {
                    n5 = 128;
                    break;
                }
                case 65: {
                    n5 = 102;
                    break;
                }
                case 66: {
                    n5 = 54;
                    break;
                }
                case 67: {
                    n5 = 197;
                    break;
                }
                case 68: {
                    n5 = 86;
                    break;
                }
                case 69: {
                    n5 = 201;
                    break;
                }
                case 70: {
                    n5 = 112;
                    break;
                }
                case 71: {
                    n5 = 47;
                    break;
                }
                case 72: {
                    n5 = 20;
                    break;
                }
                case 73: {
                    n5 = 143;
                    break;
                }
                case 74: {
                    n5 = 119;
                    break;
                }
                case 75: {
                    n5 = 111;
                    break;
                }
                case 76: {
                    n5 = 22;
                    break;
                }
                case 77: {
                    n5 = 133;
                    break;
                }
                case 78: {
                    n5 = 210;
                    break;
                }
                case 79: {
                    n5 = 50;
                    break;
                }
                case 80: {
                    n5 = 134;
                    break;
                }
                case 81: {
                    n5 = 198;
                    break;
                }
                case 82: {
                    n5 = 196;
                    break;
                }
                case 83: {
                    n5 = 189;
                    break;
                }
                case 84: {
                    n5 = 174;
                    break;
                }
                case 85: {
                    n5 = 183;
                    break;
                }
                case 86: {
                    n5 = 1;
                    break;
                }
                case 87: {
                    n5 = 39;
                    break;
                }
                case 88: {
                    n5 = 88;
                    break;
                }
                case 89: {
                    n5 = 222;
                    break;
                }
                case 90: {
                    n5 = 239;
                    break;
                }
                case 91: {
                    n5 = 123;
                    break;
                }
                case 92: {
                    n5 = 15;
                    break;
                }
                case 93: {
                    n5 = 105;
                    break;
                }
                case 94: {
                    n5 = 165;
                    break;
                }
                case 95: {
                    n5 = 43;
                    break;
                }
                case 96: {
                    n5 = 38;
                    break;
                }
                case 97: {
                    n5 = 64;
                    break;
                }
                case 98: {
                    n5 = 181;
                    break;
                }
                case 99: {
                    n5 = 221;
                    break;
                }
                case 100: {
                    n5 = 83;
                    break;
                }
                case 101: {
                    n5 = 187;
                    break;
                }
                case 102: {
                    n5 = 155;
                    break;
                }
                case 103: {
                    n5 = 203;
                    break;
                }
                case 104: {
                    n5 = 44;
                    break;
                }
                case 105: {
                    n5 = 96;
                    break;
                }
                case 106: {
                    n5 = 57;
                    break;
                }
                case 107: {
                    n5 = 27;
                    break;
                }
                case 108: {
                    n5 = 169;
                    break;
                }
                case 109: {
                    n5 = 45;
                    break;
                }
                case 110: {
                    n5 = 95;
                    break;
                }
                case 111: {
                    n5 = 21;
                    break;
                }
                case 112: {
                    n5 = 213;
                    break;
                }
                case 113: {
                    n5 = 18;
                    break;
                }
                case 114: {
                    n5 = 226;
                    break;
                }
                case 115: {
                    n5 = 161;
                    break;
                }
                case 116: {
                    n5 = 75;
                    break;
                }
                case 117: {
                    n5 = 12;
                    break;
                }
                case 118: {
                    n5 = 110;
                    break;
                }
                case 119: {
                    n5 = 120;
                    break;
                }
                case 120: {
                    n5 = 254;
                    break;
                }
                case 121: {
                    n5 = 66;
                    break;
                }
                case 122: {
                    n5 = 253;
                    break;
                }
                case 123: {
                    n5 = 7;
                    break;
                }
                case 124: {
                    n5 = 56;
                    break;
                }
                case 125: {
                    n5 = 67;
                    break;
                }
                case 126: {
                    n5 = 171;
                    break;
                }
                case 127: {
                    n5 = 180;
                    break;
                }
                case 128: {
                    n5 = 175;
                    break;
                }
                case 129: {
                    n5 = 109;
                    break;
                }
                case 130: {
                    n5 = 251;
                    break;
                }
                case 131: {
                    n5 = 145;
                    break;
                }
                case 132: {
                    n5 = 186;
                    break;
                }
                case 133: {
                    n5 = 152;
                    break;
                }
                case 134: {
                    n5 = 172;
                    break;
                }
                case 135: {
                    n5 = 246;
                    break;
                }
                case 136: {
                    n5 = 84;
                    break;
                }
                case 137: {
                    n5 = 159;
                    break;
                }
                case 138: {
                    n5 = 90;
                    break;
                }
                case 139: {
                    n5 = 77;
                    break;
                }
                case 140: {
                    n5 = 85;
                    break;
                }
                case 141: {
                    n5 = 160;
                    break;
                }
                case 142: {
                    n5 = 103;
                    break;
                }
                case 143: {
                    n5 = 158;
                    break;
                }
                case 144: {
                    n5 = 52;
                    break;
                }
                case 145: {
                    n5 = 33;
                    break;
                }
                case 146: {
                    n5 = 229;
                    break;
                }
                case 147: {
                    n5 = 141;
                    break;
                }
                case 148: {
                    n5 = 93;
                    break;
                }
                case 149: {
                    n5 = 250;
                    break;
                }
                case 150: {
                    n5 = 167;
                    break;
                }
                case 151: {
                    n5 = 53;
                    break;
                }
                case 152: {
                    n5 = 147;
                    break;
                }
                case 153: {
                    n5 = 234;
                    break;
                }
                case 154: {
                    n5 = 243;
                    break;
                }
                case 155: {
                    n5 = 13;
                    break;
                }
                case 156: {
                    n5 = 240;
                    break;
                }
                case 157: {
                    n5 = 25;
                    break;
                }
                case 158: {
                    n5 = 23;
                    break;
                }
                case 159: {
                    n5 = 3;
                    break;
                }
                case 160: {
                    n5 = 71;
                    break;
                }
                case 161: {
                    n5 = 156;
                    break;
                }
                case 162: {
                    n5 = 223;
                    break;
                }
                case 163: {
                    n5 = 79;
                    break;
                }
                case 164: {
                    n5 = 124;
                    break;
                }
                case 165: {
                    n5 = 131;
                    break;
                }
                case 166: {
                    n5 = 182;
                    break;
                }
                case 167: {
                    n5 = 0;
                    break;
                }
                case 168: {
                    n5 = 104;
                    break;
                }
                case 169: {
                    n5 = 230;
                    break;
                }
                case 170: {
                    n5 = 34;
                    break;
                }
                case 171: {
                    n5 = 17;
                    break;
                }
                case 172: {
                    n5 = 179;
                    break;
                }
                case 173: {
                    n5 = 163;
                    break;
                }
                case 174: {
                    n5 = 249;
                    break;
                }
                case 175: {
                    n5 = 40;
                    break;
                }
                case 176: {
                    n5 = 217;
                    break;
                }
                case 177: {
                    n5 = 106;
                    break;
                }
                case 178: {
                    n5 = 76;
                    break;
                }
                case 179: {
                    n5 = 41;
                    break;
                }
                case 180: {
                    n5 = 168;
                    break;
                }
                case 181: {
                    n5 = 232;
                    break;
                }
                case 182: {
                    n5 = 114;
                    break;
                }
                case 183: {
                    n5 = 154;
                    break;
                }
                case 184: {
                    n5 = 89;
                    break;
                }
                case 185: {
                    n5 = 108;
                    break;
                }
                case 186: {
                    n5 = 130;
                    break;
                }
                case 187: {
                    n5 = 127;
                    break;
                }
                case 188: {
                    n5 = 51;
                    break;
                }
                case 189: {
                    n5 = 117;
                    break;
                }
                case 190: {
                    n5 = 36;
                    break;
                }
                case 191: {
                    n5 = 176;
                    break;
                }
                case 192: {
                    n5 = 146;
                    break;
                }
                case 193: {
                    n5 = 244;
                    break;
                }
                case 194: {
                    n5 = 191;
                    break;
                }
                case 195: {
                    n5 = 82;
                    break;
                }
                case 196: {
                    n5 = 4;
                    break;
                }
                case 197: {
                    n5 = 5;
                    break;
                }
                case 198: {
                    n5 = 208;
                    break;
                }
                case 199: {
                    n5 = 227;
                    break;
                }
                case 200: {
                    n5 = 129;
                    break;
                }
                case 201: {
                    n5 = 69;
                    break;
                }
                case 202: {
                    n5 = 252;
                    break;
                }
                case 203: {
                    n5 = 136;
                    break;
                }
                case 204: {
                    n5 = 151;
                    break;
                }
                case 205: {
                    n5 = 118;
                    break;
                }
                case 206: {
                    n5 = 178;
                    break;
                }
                case 207: {
                    n5 = 193;
                    break;
                }
                case 208: {
                    n5 = 107;
                    break;
                }
                case 209: {
                    n5 = 28;
                    break;
                }
                case 210: {
                    n5 = 61;
                    break;
                }
                case 211: {
                    n5 = 242;
                    break;
                }
                case 212: {
                    n5 = 220;
                    break;
                }
                case 213: {
                    n5 = 235;
                    break;
                }
                case 214: {
                    n5 = 188;
                    break;
                }
                case 215: {
                    n5 = 72;
                    break;
                }
                case 216: {
                    n5 = 116;
                    break;
                }
                case 217: {
                    n5 = 199;
                    break;
                }
                case 218: {
                    n5 = 177;
                    break;
                }
                case 219: {
                    n5 = 68;
                    break;
                }
                case 220: {
                    n5 = 192;
                    break;
                }
                case 221: {
                    n5 = 185;
                    break;
                }
                case 222: {
                    n5 = 2;
                    break;
                }
                case 223: {
                    n5 = 29;
                    break;
                }
                case 224: {
                    n5 = 225;
                    break;
                }
                case 225: {
                    n5 = 98;
                    break;
                }
                case 226: {
                    n5 = 218;
                    break;
                }
                case 227: {
                    n5 = 125;
                    break;
                }
                case 228: {
                    n5 = 140;
                    break;
                }
                case 229: {
                    n5 = 214;
                    break;
                }
                case 230: {
                    n5 = 70;
                    break;
                }
                case 231: {
                    n5 = 26;
                    break;
                }
                case 232: {
                    n5 = 8;
                    break;
                }
                case 233: {
                    n5 = 211;
                    break;
                }
                case 234: {
                    n5 = 149;
                    break;
                }
                case 235: {
                    n5 = 212;
                    break;
                }
                case 236: {
                    n5 = 10;
                    break;
                }
                case 237: {
                    n5 = 122;
                    break;
                }
                case 238: {
                    n5 = 55;
                    break;
                }
                case 239: {
                    n5 = 101;
                    break;
                }
                case 240: {
                    n5 = 170;
                    break;
                }
                case 241: {
                    n5 = 24;
                    break;
                }
                case 242: {
                    n5 = 94;
                    break;
                }
                case 243: {
                    n5 = 92;
                    break;
                }
                case 244: {
                    n5 = 138;
                    break;
                }
                case 245: {
                    n5 = 247;
                    break;
                }
                case 246: {
                    n5 = 233;
                    break;
                }
                case 247: {
                    n5 = 35;
                    break;
                }
                case 248: {
                    n5 = 80;
                    break;
                }
                case 249: {
                    n5 = 195;
                    break;
                }
                case 250: {
                    n5 = 164;
                    break;
                }
                case 251: {
                    n5 = 42;
                    break;
                }
                case 252: {
                    n5 = 206;
                    break;
                }
                case 253: {
                    n5 = 121;
                    break;
                }
                case 254: {
                    n5 = 74;
                    break;
                }
                default: {
                    n5 = 63;
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
            hp_0.db[n4] = new String(cArray).intern();
        }
        return db[n4];
    }
}


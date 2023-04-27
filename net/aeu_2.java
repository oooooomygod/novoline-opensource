/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aeu
 */
public class aeu_2 {
    public static String s = ".png";
    public static String K = "harm";
    public static String ao = "thick";
    public static String F = "CustomItems file not found: ";
    public static String J = "mcpatcher/cit/potion/";
    public static String h = "damageMask";
    public static String ap = "CustomItems file not found: ";
    public static String an = "_";
    public static String W = "texture.";
    public static String N = "type";
    public static String ak = "lvl";
    public static String X = ".properties";
    public static String P = "regeneration";
    public static String U = "potion.";
    public static String o = "nightVision";
    public static String v = "weakness";
    public static String w = "smooth";
    public static String am = "splash/";
    public static String x = "CustomItems: ";
    public static String D = "item";
    public static String ai = "mcpatcher/cit/Potion/";
    public static String a = "clear";
    public static String g = "type";
    public static String Q = "thin";
    public static String A = "debonair";
    public static String n = "texture.potion_bottle_splash";
    public static String ad = " ";
    public static String ac = "_n";
    public static String f = "texture.potion_bottle_drinkable";
    public static String af = "mcpatcher/cit/";
    public static String R = "charming";
    public static String B = "stinky";
    public static String I = "Invalid item ID: ";
    public static String aa = "normal/";
    public static String c = "acrid";
    public static String V = "bungling";
    public static String G = "refined";
    public static String T = "id";
    public static String Y = "potent";
    public static String E = "damage";
    private static String[] db;
    public static String r = "mcpatcher/cit.properties";
    public static String e = "heal";
    public static String b = "Potion not found for image: ";
    public static String q = "damageBoost";
    private static String[] cb;
    public static String t = "items";
    public static String k = "moveSpeed";
    public static String y = "sparkling";
    public static String S = ".properties";
    public static String m = "";
    public static String ab = "";
    public static String M = "item";
    public static String ah = "items";
    public static String O = "water";
    public static String ae = "empty";
    public static String Z = "fireResistance";
    private static long bb;
    public static String d = "moveSlowdown";
    public static String i = "CustomItems: Loading ";
    public static String ag = "";
    public static String aj = "_layer_";
    public static String H = "waterBreathing";
    public static String al = "poison";
    public static String u = "_s";
    public static String l = "";
    public static String L = "awkward";
    public static String j = "invisibility";
    public static String p = "diffuse";
    public static String z = "useGlint";
    public static String C = "rank";

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        aeu_2.bb = a1c.a(6946321589116325199L, 977249865939474509L, null).a(138718486021396L);
        var8 = aeu_2.bb ^ 58096735675529L;
        v0 = var8 ^ 110429996624031L;
        var10_1 = (int)(v0 >>> 48);
        var11_2 = (int)(v0 << 16 >>> 32);
        var12_3 = (int)(v0 << 48 >>> 48);
        var5_4 = new String[62];
        var3_5 = 0;
        var2_6 = "\u00e1>n\b\u0007\u0011M\u00fa\u00e1\u009b\u00d3\u0007\b\u0013L\u00ccA\u00a1}.+\u0015\u008c&\u009f\u0001\u009a\u0081R\u00ba\u0096\u0096\u00023K\u009d\u001c\u00ce3\u0097\u00fb\u00e76\u0007\u009f\u0003\u00d4\u0015\u0013\u00b1\u009a\u0005wW\u0099\u0017\u0092\u0007\u0015\u00f4%\u001b\u00e2\u00f9\u00f4\u0005\u0002\"\u00af\u009a\u00e9\u0005r;9\u009a\u0086\u0004\u0098\u0096\u00d6\u00b3\u0005\u00a9u\u008e\u00ecB\u001c\u00d5\u007f\u00b4*\u00ff\u00e4\u00fe\u0016\u0003\u0003\u00b0\u009b[\u00f4\u0093f\u00e5\u0001\u00ec\u00c1\u00f5\u009a,\u00da\u0003\u00ff\u00cf\u00fd\u000e\u00b7\u00c3x3z\u00fc\u00ee\u0001jF[Gs\u00e4\u0004\u008dPby\u001c\u00ed\u00d7\u00b3?\u001fF\u00e2B\u0080\u0089\u00c0\u00caU\u00deR#\u00dd\u00a9\u00eb\u00d4\u001580\u008e\u0080u\u00bf\u00ac\r\u0086\u00ee\u00de\u0018\u00b2\u00a2W\u00de6\u001a\u0016\u00a2\u00c9\b\u00fe\u00fd7\u008fX\u0001N.\f\u0000\u009c\u00e0\u001e\u00ecP\u0001\u00a2\u001f\u00f4\u0016i\u000e\u00e4\u00c0'Zw\u00f6j\u008f\u00c9\u001av\u00cb\u00f3\u0090\u000bM\u009ez\u0095\u00f3\u00ac}\r\u0013\u0006\u00fe\u0004\u00b7\u00dd\u00f2\u00f7\u0004\u0002\u00f37\u0083\u000b\u0097&=\u00bf\u00f0&\u00d8G\u0097!\u00af\u0004#B\u00b8\u0011\t\u00fca\u00b5J\u008b/\u00d4T`\u0015\u008c\u001bwg\u00ff\u00f4\u00a7\u00ca:\u00e9r\u0085\u0003\u0011\u00f4^\u00e6JRU-\u0006\u00d9yz\u00b4\u007f\u00d3\u00063,:\b\u00c8\u008a\u0011\u00d6O\u009aA\u009c:\u00dc\u001d\u00c3\u00a538\u00b9Di\u000b\u0097\u000b\u00f4\u00a0Qo}<i\u0004\u00a1Ii\u0002\u00a9l\u000b\u000e\u0019Se\u008e\u00a9\u0088\u00e4\u00e5\u00b8\u00fc\b\u0019@\u001buX\u00cdo\u00a4\b\u00fb\u0002i\u0096\u00f9\u0006z\u00dd\u0004\u00f4\u0097\u00df\u00b8\t\u00ed{]\u00e2[\u00d3\u00fd_\u00cb\u001cL\u000f\u00f1`\u00b0\u0010~\u00f1]\u00bfcp\u0011\u001b\u00f0\u0005\u00cbD)fM\u00a79\u0087\u00ea\u00c3\u00da[\u000e\u0099\u00c4\u00d5\u009c\u00ab\u008b-%k\u0014X:F\u00e6\u0004\u00cf\u0005\u008e]\b|\u0019S\u00ef1(&\u0004\u0007\u00f5\u009a\u00b2\u0099\u0089$<\u0005\u00cb\u00ce\u00bc\u00b5\u00a3\f`\\h+\u00dd~\u000e\u00dcZ\u00e0\u00b4:\u0007\u00fe\u00f9\u00af\u00bb\u0089\u00aa\u00d2\nS\u00e9\u00b9{\u008bq}\u00b8\u00e1g\u001c\u00a7} x\u001d\u00b1\u00d7\u001a\u009a\u00913\u00c2\u00c5\u00b8[\u000f\u00e6\u00d11\u009as\u00d3\r\u00e8\u00ba\u0019\u00f3\u00cc\fC\u00cae\u009fRiQ\u00bb\u00bb\u0005\u0088\u0091\u0018\u00a3k\u0092iC50\u00f2\u00c8\u00ee,e\u00c8\f\u00ad\u00c1\u00f2\u001e\u00a2\u00f9#T\"\u00eb\u0006\u00a9}\u0011j\u00cf\u0091\u0005\u00c8\u00ebpqM\u0007{\u00d03\u009b\u00e8o{\u0007\u00024\u00c3tK\u009c5\u0005\u00a0\u00da(\u00b1\u00a5\u0002\u00bd\u00d2\u0015'c\u0002hQ\u0015r\u00f6\u0080n%u\u00e9\u000f\u0089\u009dm2#Z\u0003\u0002\u0010\u001c\u0004\u00e65\u0000\u00ff\u0006\u00a2\u001b\u0087%L\u00ba\u00038\u001c\u00dc\bV\n\u001e\u0096\u00dal/\u00a1";
        var4_7 = "\u00e1>n\b\u0007\u0011M\u00fa\u00e1\u009b\u00d3\u0007\b\u0013L\u00ccA\u00a1}.+\u0015\u008c&\u009f\u0001\u009a\u0081R\u00ba\u0096\u0096\u00023K\u009d\u001c\u00ce3\u0097\u00fb\u00e76\u0007\u009f\u0003\u00d4\u0015\u0013\u00b1\u009a\u0005wW\u0099\u0017\u0092\u0007\u0015\u00f4%\u001b\u00e2\u00f9\u00f4\u0005\u0002\"\u00af\u009a\u00e9\u0005r;9\u009a\u0086\u0004\u0098\u0096\u00d6\u00b3\u0005\u00a9u\u008e\u00ecB\u001c\u00d5\u007f\u00b4*\u00ff\u00e4\u00fe\u0016\u0003\u0003\u00b0\u009b[\u00f4\u0093f\u00e5\u0001\u00ec\u00c1\u00f5\u009a,\u00da\u0003\u00ff\u00cf\u00fd\u000e\u00b7\u00c3x3z\u00fc\u00ee\u0001jF[Gs\u00e4\u0004\u008dPby\u001c\u00ed\u00d7\u00b3?\u001fF\u00e2B\u0080\u0089\u00c0\u00caU\u00deR#\u00dd\u00a9\u00eb\u00d4\u001580\u008e\u0080u\u00bf\u00ac\r\u0086\u00ee\u00de\u0018\u00b2\u00a2W\u00de6\u001a\u0016\u00a2\u00c9\b\u00fe\u00fd7\u008fX\u0001N.\f\u0000\u009c\u00e0\u001e\u00ecP\u0001\u00a2\u001f\u00f4\u0016i\u000e\u00e4\u00c0'Zw\u00f6j\u008f\u00c9\u001av\u00cb\u00f3\u0090\u000bM\u009ez\u0095\u00f3\u00ac}\r\u0013\u0006\u00fe\u0004\u00b7\u00dd\u00f2\u00f7\u0004\u0002\u00f37\u0083\u000b\u0097&=\u00bf\u00f0&\u00d8G\u0097!\u00af\u0004#B\u00b8\u0011\t\u00fca\u00b5J\u008b/\u00d4T`\u0015\u008c\u001bwg\u00ff\u00f4\u00a7\u00ca:\u00e9r\u0085\u0003\u0011\u00f4^\u00e6JRU-\u0006\u00d9yz\u00b4\u007f\u00d3\u00063,:\b\u00c8\u008a\u0011\u00d6O\u009aA\u009c:\u00dc\u001d\u00c3\u00a538\u00b9Di\u000b\u0097\u000b\u00f4\u00a0Qo}<i\u0004\u00a1Ii\u0002\u00a9l\u000b\u000e\u0019Se\u008e\u00a9\u0088\u00e4\u00e5\u00b8\u00fc\b\u0019@\u001buX\u00cdo\u00a4\b\u00fb\u0002i\u0096\u00f9\u0006z\u00dd\u0004\u00f4\u0097\u00df\u00b8\t\u00ed{]\u00e2[\u00d3\u00fd_\u00cb\u001cL\u000f\u00f1`\u00b0\u0010~\u00f1]\u00bfcp\u0011\u001b\u00f0\u0005\u00cbD)fM\u00a79\u0087\u00ea\u00c3\u00da[\u000e\u0099\u00c4\u00d5\u009c\u00ab\u008b-%k\u0014X:F\u00e6\u0004\u00cf\u0005\u008e]\b|\u0019S\u00ef1(&\u0004\u0007\u00f5\u009a\u00b2\u0099\u0089$<\u0005\u00cb\u00ce\u00bc\u00b5\u00a3\f`\\h+\u00dd~\u000e\u00dcZ\u00e0\u00b4:\u0007\u00fe\u00f9\u00af\u00bb\u0089\u00aa\u00d2\nS\u00e9\u00b9{\u008bq}\u00b8\u00e1g\u001c\u00a7} x\u001d\u00b1\u00d7\u001a\u009a\u00913\u00c2\u00c5\u00b8[\u000f\u00e6\u00d11\u009as\u00d3\r\u00e8\u00ba\u0019\u00f3\u00cc\fC\u00cae\u009fRiQ\u00bb\u00bb\u0005\u0088\u0091\u0018\u00a3k\u0092iC50\u00f2\u00c8\u00ee,e\u00c8\f\u00ad\u00c1\u00f2\u001e\u00a2\u00f9#T\"\u00eb\u0006\u00a9}\u0011j\u00cf\u0091\u0005\u00c8\u00ebpqM\u0007{\u00d03\u009b\u00e8o{\u0007\u00024\u00c3tK\u009c5\u0005\u00a0\u00da(\u00b1\u00a5\u0002\u00bd\u00d2\u0015'c\u0002hQ\u0015r\u00f6\u0080n%u\u00e9\u000f\u0089\u009dm2#Z\u0003\u0002\u0010\u001c\u0004\u00e65\u0000\u00ff\u0006\u00a2\u001b\u0087%L\u00ba\u00038\u001c\u00dc\bV\n\u001e\u0096\u00dal/\u00a1".length();
        var1_8 = 4;
        var0_9 = -1;
        block0: while (true) {
            block7: {
                v1 = ++var0_9;
                v2 = var2_6.substring(v1, v1 + var1_8).toCharArray();
                v3 = v2.length;
                var7_10 = 0;
                v4 = 22;
                v5 = v2;
                v6 = v3;
                if (v3 > 1) ** GOTO lbl59
                break block7;
                while (true) {
                    var2_6 = "\u00eb\u0091\u00fflk\u00c1\u001fN\u00fc\u00bd\u00e8\u000e\u0003\u0015\u00ecb\u00ef\u008c\u00ad\u0092\u00f5\u0011\u0006\u000fP\u00ac\n`a\u00d8\u001cPj\u00b3\u00e5\u008c\u00e4,";
                    var4_7 = "\u00eb\u0091\u00fflk\u00c1\u001fN\u00fc\u00bd\u00e8\u000e\u0003\u0015\u00ecb\u00ef\u008c\u00ad\u0092\u00f5\u0011\u0006\u000fP\u00ac\n`a\u00d8\u001cPj\u00b3\u00e5\u008c\u00e4,".length();
                    var1_8 = 6;
                    var0_9 = -1;
lbl33:
                    // 2 sources

                    while (true) {
                        v7 = ++var0_9;
                        v8 = var2_6.substring(v7, v7 + var1_8).toCharArray();
                        v9 = v8.length;
                        var7_10 = 0;
                        v10 = 50;
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
                v5[v13] = (char)(v5[v13] ^ (v4 ^ 111));
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
            v11[v15] = (char)(v11[v15] ^ (v10 ^ 111));
            ++var7_10;
            v10 = v10;
lbl79:
            // 2 sources

            v16 = v11;
            v12 = v12;
        } while (v12 > var7_10);
        var5_4[var3_5++] = new String(v16).intern();
        if ((var0_9 += var1_8) >= var4_7) {
            aeu_2.cb = var5_4;
            aeu_2.db = new String[62];
            aeu_2.b((char)var10_1, var11_2, var12_3);
            return;
        }
        var1_8 = var2_6.charAt(var0_9);
        ** while (true)
    }

    private static String a(int n, int n2, int n3) {
        int n4 = (n ^ n3 ^ 0xFFFFA889) & 0xFFFF;
        if (db[n4] == null) {
            int n5;
            char[] cArray = cb[n4].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n5 = 25;
                    break;
                }
                case 1: {
                    n5 = 250;
                    break;
                }
                case 2: {
                    n5 = 136;
                    break;
                }
                case 3: {
                    n5 = 215;
                    break;
                }
                case 4: {
                    n5 = 185;
                    break;
                }
                case 5: {
                    n5 = 167;
                    break;
                }
                case 6: {
                    n5 = 202;
                    break;
                }
                case 7: {
                    n5 = 228;
                    break;
                }
                case 8: {
                    n5 = 206;
                    break;
                }
                case 9: {
                    n5 = 149;
                    break;
                }
                case 10: {
                    n5 = 231;
                    break;
                }
                case 11: {
                    n5 = 90;
                    break;
                }
                case 12: {
                    n5 = 159;
                    break;
                }
                case 13: {
                    n5 = 194;
                    break;
                }
                case 14: {
                    n5 = 97;
                    break;
                }
                case 15: {
                    n5 = 242;
                    break;
                }
                case 16: {
                    n5 = 109;
                    break;
                }
                case 17: {
                    n5 = 189;
                    break;
                }
                case 18: {
                    n5 = 129;
                    break;
                }
                case 19: {
                    n5 = 106;
                    break;
                }
                case 20: {
                    n5 = 11;
                    break;
                }
                case 21: {
                    n5 = 216;
                    break;
                }
                case 22: {
                    n5 = 17;
                    break;
                }
                case 23: {
                    n5 = 43;
                    break;
                }
                case 24: {
                    n5 = 176;
                    break;
                }
                case 25: {
                    n5 = 34;
                    break;
                }
                case 26: {
                    n5 = 60;
                    break;
                }
                case 27: {
                    n5 = 145;
                    break;
                }
                case 28: {
                    n5 = 162;
                    break;
                }
                case 29: {
                    n5 = 87;
                    break;
                }
                case 30: {
                    n5 = 142;
                    break;
                }
                case 31: {
                    n5 = 75;
                    break;
                }
                case 32: {
                    n5 = 190;
                    break;
                }
                case 33: {
                    n5 = 92;
                    break;
                }
                case 34: {
                    n5 = 24;
                    break;
                }
                case 35: {
                    n5 = 212;
                    break;
                }
                case 36: {
                    n5 = 192;
                    break;
                }
                case 37: {
                    n5 = 131;
                    break;
                }
                case 38: {
                    n5 = 78;
                    break;
                }
                case 39: {
                    n5 = 73;
                    break;
                }
                case 40: {
                    n5 = 158;
                    break;
                }
                case 41: {
                    n5 = 254;
                    break;
                }
                case 42: {
                    n5 = 49;
                    break;
                }
                case 43: {
                    n5 = 80;
                    break;
                }
                case 44: {
                    n5 = 197;
                    break;
                }
                case 45: {
                    n5 = 178;
                    break;
                }
                case 46: {
                    n5 = 111;
                    break;
                }
                case 47: {
                    n5 = 155;
                    break;
                }
                case 48: {
                    n5 = 112;
                    break;
                }
                case 49: {
                    n5 = 234;
                    break;
                }
                case 50: {
                    n5 = 134;
                    break;
                }
                case 51: {
                    n5 = 232;
                    break;
                }
                case 52: {
                    n5 = 198;
                    break;
                }
                case 53: {
                    n5 = 67;
                    break;
                }
                case 54: {
                    n5 = 91;
                    break;
                }
                case 55: {
                    n5 = 247;
                    break;
                }
                case 56: {
                    n5 = 100;
                    break;
                }
                case 57: {
                    n5 = 65;
                    break;
                }
                case 58: {
                    n5 = 83;
                    break;
                }
                case 59: {
                    n5 = 177;
                    break;
                }
                case 60: {
                    n5 = 0;
                    break;
                }
                case 61: {
                    n5 = 89;
                    break;
                }
                case 62: {
                    n5 = 7;
                    break;
                }
                case 63: {
                    n5 = 147;
                    break;
                }
                case 64: {
                    n5 = 108;
                    break;
                }
                case 65: {
                    n5 = 71;
                    break;
                }
                case 66: {
                    n5 = 164;
                    break;
                }
                case 67: {
                    n5 = 53;
                    break;
                }
                case 68: {
                    n5 = 249;
                    break;
                }
                case 69: {
                    n5 = 57;
                    break;
                }
                case 70: {
                    n5 = 169;
                    break;
                }
                case 71: {
                    n5 = 9;
                    break;
                }
                case 72: {
                    n5 = 188;
                    break;
                }
                case 73: {
                    n5 = 86;
                    break;
                }
                case 74: {
                    n5 = 82;
                    break;
                }
                case 75: {
                    n5 = 115;
                    break;
                }
                case 76: {
                    n5 = 243;
                    break;
                }
                case 77: {
                    n5 = 179;
                    break;
                }
                case 78: {
                    n5 = 224;
                    break;
                }
                case 79: {
                    n5 = 172;
                    break;
                }
                case 80: {
                    n5 = 217;
                    break;
                }
                case 81: {
                    n5 = 48;
                    break;
                }
                case 82: {
                    n5 = 118;
                    break;
                }
                case 83: {
                    n5 = 36;
                    break;
                }
                case 84: {
                    n5 = 117;
                    break;
                }
                case 85: {
                    n5 = 124;
                    break;
                }
                case 86: {
                    n5 = 157;
                    break;
                }
                case 87: {
                    n5 = 64;
                    break;
                }
                case 88: {
                    n5 = 69;
                    break;
                }
                case 89: {
                    n5 = 52;
                    break;
                }
                case 90: {
                    n5 = 210;
                    break;
                }
                case 91: {
                    n5 = 199;
                    break;
                }
                case 92: {
                    n5 = 196;
                    break;
                }
                case 93: {
                    n5 = 40;
                    break;
                }
                case 94: {
                    n5 = 140;
                    break;
                }
                case 95: {
                    n5 = 148;
                    break;
                }
                case 96: {
                    n5 = 33;
                    break;
                }
                case 97: {
                    n5 = 209;
                    break;
                }
                case 98: {
                    n5 = 143;
                    break;
                }
                case 99: {
                    n5 = 32;
                    break;
                }
                case 100: {
                    n5 = 225;
                    break;
                }
                case 101: {
                    n5 = 200;
                    break;
                }
                case 102: {
                    n5 = 76;
                    break;
                }
                case 103: {
                    n5 = 205;
                    break;
                }
                case 104: {
                    n5 = 13;
                    break;
                }
                case 105: {
                    n5 = 236;
                    break;
                }
                case 106: {
                    n5 = 204;
                    break;
                }
                case 107: {
                    n5 = 153;
                    break;
                }
                case 108: {
                    n5 = 12;
                    break;
                }
                case 109: {
                    n5 = 45;
                    break;
                }
                case 110: {
                    n5 = 101;
                    break;
                }
                case 111: {
                    n5 = 156;
                    break;
                }
                case 112: {
                    n5 = 238;
                    break;
                }
                case 113: {
                    n5 = 174;
                    break;
                }
                case 114: {
                    n5 = 10;
                    break;
                }
                case 115: {
                    n5 = 139;
                    break;
                }
                case 116: {
                    n5 = 122;
                    break;
                }
                case 117: {
                    n5 = 1;
                    break;
                }
                case 118: {
                    n5 = 39;
                    break;
                }
                case 119: {
                    n5 = 244;
                    break;
                }
                case 120: {
                    n5 = 5;
                    break;
                }
                case 121: {
                    n5 = 160;
                    break;
                }
                case 122: {
                    n5 = 8;
                    break;
                }
                case 123: {
                    n5 = 201;
                    break;
                }
                case 124: {
                    n5 = 182;
                    break;
                }
                case 125: {
                    n5 = 38;
                    break;
                }
                case 126: {
                    n5 = 240;
                    break;
                }
                case 127: {
                    n5 = 4;
                    break;
                }
                case 128: {
                    n5 = 245;
                    break;
                }
                case 129: {
                    n5 = 170;
                    break;
                }
                case 130: {
                    n5 = 218;
                    break;
                }
                case 131: {
                    n5 = 58;
                    break;
                }
                case 132: {
                    n5 = 151;
                    break;
                }
                case 133: {
                    n5 = 187;
                    break;
                }
                case 134: {
                    n5 = 150;
                    break;
                }
                case 135: {
                    n5 = 93;
                    break;
                }
                case 136: {
                    n5 = 66;
                    break;
                }
                case 137: {
                    n5 = 191;
                    break;
                }
                case 138: {
                    n5 = 184;
                    break;
                }
                case 139: {
                    n5 = 135;
                    break;
                }
                case 140: {
                    n5 = 226;
                    break;
                }
                case 141: {
                    n5 = 94;
                    break;
                }
                case 142: {
                    n5 = 29;
                    break;
                }
                case 143: {
                    n5 = 219;
                    break;
                }
                case 144: {
                    n5 = 105;
                    break;
                }
                case 145: {
                    n5 = 221;
                    break;
                }
                case 146: {
                    n5 = 51;
                    break;
                }
                case 147: {
                    n5 = 21;
                    break;
                }
                case 148: {
                    n5 = 15;
                    break;
                }
                case 149: {
                    n5 = 214;
                    break;
                }
                case 150: {
                    n5 = 63;
                    break;
                }
                case 151: {
                    n5 = 114;
                    break;
                }
                case 152: {
                    n5 = 152;
                    break;
                }
                case 153: {
                    n5 = 223;
                    break;
                }
                case 154: {
                    n5 = 203;
                    break;
                }
                case 155: {
                    n5 = 168;
                    break;
                }
                case 156: {
                    n5 = 163;
                    break;
                }
                case 157: {
                    n5 = 154;
                    break;
                }
                case 158: {
                    n5 = 22;
                    break;
                }
                case 159: {
                    n5 = 137;
                    break;
                }
                case 160: {
                    n5 = 74;
                    break;
                }
                case 161: {
                    n5 = 41;
                    break;
                }
                case 162: {
                    n5 = 2;
                    break;
                }
                case 163: {
                    n5 = 230;
                    break;
                }
                case 164: {
                    n5 = 55;
                    break;
                }
                case 165: {
                    n5 = 121;
                    break;
                }
                case 166: {
                    n5 = 102;
                    break;
                }
                case 167: {
                    n5 = 59;
                    break;
                }
                case 168: {
                    n5 = 213;
                    break;
                }
                case 169: {
                    n5 = 27;
                    break;
                }
                case 170: {
                    n5 = 113;
                    break;
                }
                case 171: {
                    n5 = 253;
                    break;
                }
                case 172: {
                    n5 = 79;
                    break;
                }
                case 173: {
                    n5 = 175;
                    break;
                }
                case 174: {
                    n5 = 98;
                    break;
                }
                case 175: {
                    n5 = 186;
                    break;
                }
                case 176: {
                    n5 = 44;
                    break;
                }
                case 177: {
                    n5 = 23;
                    break;
                }
                case 178: {
                    n5 = 28;
                    break;
                }
                case 179: {
                    n5 = 54;
                    break;
                }
                case 180: {
                    n5 = 229;
                    break;
                }
                case 181: {
                    n5 = 125;
                    break;
                }
                case 182: {
                    n5 = 171;
                    break;
                }
                case 183: {
                    n5 = 77;
                    break;
                }
                case 184: {
                    n5 = 237;
                    break;
                }
                case 185: {
                    n5 = 128;
                    break;
                }
                case 186: {
                    n5 = 37;
                    break;
                }
                case 187: {
                    n5 = 252;
                    break;
                }
                case 188: {
                    n5 = 255;
                    break;
                }
                case 189: {
                    n5 = 104;
                    break;
                }
                case 190: {
                    n5 = 235;
                    break;
                }
                case 191: {
                    n5 = 30;
                    break;
                }
                case 192: {
                    n5 = 195;
                    break;
                }
                case 193: {
                    n5 = 133;
                    break;
                }
                case 194: {
                    n5 = 222;
                    break;
                }
                case 195: {
                    n5 = 161;
                    break;
                }
                case 196: {
                    n5 = 193;
                    break;
                }
                case 197: {
                    n5 = 173;
                    break;
                }
                case 198: {
                    n5 = 239;
                    break;
                }
                case 199: {
                    n5 = 81;
                    break;
                }
                case 200: {
                    n5 = 233;
                    break;
                }
                case 201: {
                    n5 = 31;
                    break;
                }
                case 202: {
                    n5 = 144;
                    break;
                }
                case 203: {
                    n5 = 103;
                    break;
                }
                case 204: {
                    n5 = 141;
                    break;
                }
                case 205: {
                    n5 = 107;
                    break;
                }
                case 206: {
                    n5 = 14;
                    break;
                }
                case 207: {
                    n5 = 180;
                    break;
                }
                case 208: {
                    n5 = 26;
                    break;
                }
                case 209: {
                    n5 = 208;
                    break;
                }
                case 210: {
                    n5 = 181;
                    break;
                }
                case 211: {
                    n5 = 84;
                    break;
                }
                case 212: {
                    n5 = 138;
                    break;
                }
                case 213: {
                    n5 = 61;
                    break;
                }
                case 214: {
                    n5 = 20;
                    break;
                }
                case 215: {
                    n5 = 132;
                    break;
                }
                case 216: {
                    n5 = 42;
                    break;
                }
                case 217: {
                    n5 = 70;
                    break;
                }
                case 218: {
                    n5 = 130;
                    break;
                }
                case 219: {
                    n5 = 207;
                    break;
                }
                case 220: {
                    n5 = 6;
                    break;
                }
                case 221: {
                    n5 = 95;
                    break;
                }
                case 222: {
                    n5 = 88;
                    break;
                }
                case 223: {
                    n5 = 120;
                    break;
                }
                case 224: {
                    n5 = 127;
                    break;
                }
                case 225: {
                    n5 = 47;
                    break;
                }
                case 226: {
                    n5 = 50;
                    break;
                }
                case 227: {
                    n5 = 146;
                    break;
                }
                case 228: {
                    n5 = 18;
                    break;
                }
                case 229: {
                    n5 = 62;
                    break;
                }
                case 230: {
                    n5 = 46;
                    break;
                }
                case 231: {
                    n5 = 241;
                    break;
                }
                case 232: {
                    n5 = 19;
                    break;
                }
                case 233: {
                    n5 = 165;
                    break;
                }
                case 234: {
                    n5 = 246;
                    break;
                }
                case 235: {
                    n5 = 220;
                    break;
                }
                case 236: {
                    n5 = 123;
                    break;
                }
                case 237: {
                    n5 = 72;
                    break;
                }
                case 238: {
                    n5 = 110;
                    break;
                }
                case 239: {
                    n5 = 96;
                    break;
                }
                case 240: {
                    n5 = 211;
                    break;
                }
                case 241: {
                    n5 = 56;
                    break;
                }
                case 242: {
                    n5 = 16;
                    break;
                }
                case 243: {
                    n5 = 68;
                    break;
                }
                case 244: {
                    n5 = 227;
                    break;
                }
                case 245: {
                    n5 = 99;
                    break;
                }
                case 246: {
                    n5 = 35;
                    break;
                }
                case 247: {
                    n5 = 85;
                    break;
                }
                case 248: {
                    n5 = 3;
                    break;
                }
                case 249: {
                    n5 = 248;
                    break;
                }
                case 250: {
                    n5 = 251;
                    break;
                }
                case 251: {
                    n5 = 126;
                    break;
                }
                case 252: {
                    n5 = 166;
                    break;
                }
                case 253: {
                    n5 = 119;
                    break;
                }
                case 254: {
                    n5 = 116;
                    break;
                }
                default: {
                    n5 = 183;
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
            aeu_2.db[n4] = new String(cArray).intern();
        }
        return db[n4];
    }

    public static void b(char c, int n, int n2) {
        long l4 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ bb;
        am = aeu_2.a(806216859, -806216235, (int)l4);
        e = aeu_2.a(806216863, 806219678, (int)l4);
        x = aeu_2.a(806216848, 806211173, (int)l4);
        O = aeu_2.a(806216853, -806219049, (int)l4);
        H = aeu_2.a(806216845, 806209426, (int)l4);
        Z = aeu_2.a(806216851, -806206304, (int)l4);
        ai = aeu_2.a(806216838, 806209517, (int)l4);
        X = aeu_2.a(806216834, 806195735, (int)l4);
        F = aeu_2.a(806216852, 806217000, (int)l4);
        B = aeu_2.a(806216867, -806195098, (int)l4);
        W = aeu_2.a(806216868, 806196960, (int)l4);
        aa = aeu_2.a(806216857, 806198040, (int)l4);
        f = aeu_2.a(806216866, -806216761, (int)l4);
        A = aeu_2.a(806216888, 806199070, (int)l4);
        b = aeu_2.a(806216891, -806207554, (int)l4);
        t = aeu_2.a(806216855, -806210134, (int)l4);
        J = aeu_2.a(806216873, 806195369, (int)l4);
        j = aeu_2.a(806216885, 806209668, (int)l4);
        ae = aeu_2.a(806216856, 806200561, (int)l4);
        aeu_2.n = aeu_2.a(806216882, 806218772, (int)l4);
        aeu_2.c = aeu_2.a(806216878, 806200305, (int)l4);
        y = aeu_2.a(806216839, 806203559, (int)l4);
        L = aeu_2.a(806216884, -806193323, (int)l4);
        g = aeu_2.a(806216840, -806194922, (int)l4);
        ad = " ";
        ao = aeu_2.a(806216886, -806199564, (int)l4);
        S = aeu_2.a(806216841, -806209480, (int)l4);
        T = aeu_2.a(806216874, 806218616, (int)l4);
        l = "";
        z = aeu_2.a(806216847, -806193319, (int)l4);
        r = aeu_2.a(806216880, 806196783, (int)l4);
        w = aeu_2.a(806216879, -806218069, (int)l4);
        I = aeu_2.a(806216835, -806197322, (int)l4);
        ah = aeu_2.a(806216858, 806197470, (int)l4);
        an = "_";
        V = aeu_2.a(806216894, -806203988, (int)l4);
        ac = aeu_2.a(806216872, -806206924, (int)l4);
        Y = aeu_2.a(806216836, -806213222, (int)l4);
        M = aeu_2.a(806216842, 806218957, (int)l4);
        ak = aeu_2.a(806216869, 806210914, (int)l4);
        af = aeu_2.a(806216890, -806208998, (int)l4);
        h = aeu_2.a(806216883, -806206103, (int)l4);
        al = aeu_2.a(806216837, 806214668, (int)l4);
        U = aeu_2.a(806216877, -806208532, (int)l4);
        Q = aeu_2.a(806216854, 806195666, (int)l4);
        D = aeu_2.a(806216889, 806191260, (int)l4);
        C = aeu_2.a(806216843, 806205148, (int)l4);
        K = aeu_2.a(806216893, -806205355, (int)l4);
        u = aeu_2.a(806216833, -806214209, (int)l4);
        P = aeu_2.a(806216881, -806216051, (int)l4);
        m = "";
        E = aeu_2.a(806216870, 806204824, (int)l4);
        v = aeu_2.a(806216861, -806221313, (int)l4);
        aj = aeu_2.a(806216876, 806198779, (int)l4);
        i = aeu_2.a(806216860, -806213105, (int)l4);
        s = aeu_2.a(806216850, -806215765, (int)l4);
        a = aeu_2.a(806216875, -806199274, (int)l4);
        k = aeu_2.a(806216892, -806215906, (int)l4);
        o = aeu_2.a(806216832, -806201317, (int)l4);
        R = aeu_2.a(806216895, 806212914, (int)l4);
        N = aeu_2.a(806216871, 806218082, (int)l4);
        d = aeu_2.a(806216846, -806219870, (int)l4);
        p = aeu_2.a(806216862, 806210831, (int)l4);
        ap = aeu_2.a(806216849, -806203920, (int)l4);
        ab = "";
        G = aeu_2.a(806216887, 806215158, (int)l4);
        q = aeu_2.a(806216844, -806209280, (int)l4);
        ag = "";
    }
}


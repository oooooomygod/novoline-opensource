/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.a4h
 */
public class a4h_0 {
    private static String[] X;
    public static String G = "PersistenceRequired";
    public static String F = "CanPickUpLoot";
    public static String q = "targetSelector";
    public static String P = "Equipment";
    public static String w = "Leashed";
    public static String s = "X";
    public static String K = "jump";
    public static String y = "DropChances";
    public static String h = "Z";
    public static String T = "mobGriefing";
    private static long V;
    public static String f = "NoAI";
    public static String S = "UUIDLeast";
    public static String r = "UUIDMost";
    public static String R = "NoAI";
    public static String c = "Leashed";
    public static String k = "UUIDLeast";
    public static String m = "Z";
    public static String l = "PersistenceRequired";
    public static String j = "looting";
    public static String i = "UUIDMost";
    public static String Q = "Leash";
    public static String d = "DropChances";
    public static String N = "Equipment";
    public static String p = "Z";
    public static String a = "Random spawn bonus";
    public static String M = "controls";
    public static String e = "sensing";
    public static String U = "Equipment";
    public static String C = "Y";
    public static String x = "move";
    public static String b = "Leash";
    public static String g = "Leash";
    public static String v = "mob tick";
    public static String L = "look";
    public static String H = "Y";
    public static String u = "Y";
    private static String[] W;
    public static String D = "CanPickUpLoot";
    public static String A = "checkDespawn";
    public static String E = "X";
    public static String I = "goalSelector";
    public static String o = "UUIDMost";
    public static String t = "CanPickUpLoot";
    public static String O = "UUIDLeast";
    public static String B = "mobBaseTick";
    public static String z = "navigation";
    public static String n = "X";
    public static String J = "DropChances";

    public static void b(int n, int n2, char c) {
        long l4 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)c << 48 >>> 48) ^ V;
        J = a4h_0.a(465404891, -465408922, (int)l4);
        O = a4h_0.a(465404865, -465405239, (int)l4);
        x = a4h_0.a(465404866, -465412166, (int)l4);
        u = "Y";
        f = a4h_0.a(465404864, 465404377, (int)l4);
        v = a4h_0.a(465404884, -465434735, (int)l4);
        C = "Y";
        M = a4h_0.a(465404881, -465421341, (int)l4);
        o = a4h_0.a(465404895, -465405582, (int)l4);
        D = a4h_0.a(465404883, -465422449, (int)l4);
        Q = a4h_0.a(465404874, -465435628, (int)l4);
        N = a4h_0.a(465404875, 465427647, (int)l4);
        s = "X";
        h = "Z";
        t = a4h_0.a(465404892, -465404877, (int)l4);
        R = a4h_0.a(465404893, -465419046, (int)l4);
        d = a4h_0.a(465404876, 465421513, (int)l4);
        H = "Y";
        y = a4h_0.a(465404876, 465421513, (int)l4);
        i = a4h_0.a(465404871, 465425624, (int)l4);
        E = "X";
        a4h_0.n = "X";
        b = a4h_0.a(465404882, -465433645, (int)l4);
        a = a4h_0.a(465404869, -465411729, (int)l4);
        P = a4h_0.a(465404894, -465431820, (int)l4);
        g = a4h_0.a(465404882, -465433645, (int)l4);
        a4h_0.c = a4h_0.a(465404880, 465430765, (int)l4);
        q = a4h_0.a(465404877, 465433928, (int)l4);
        l = a4h_0.a(465404878, -465409849, (int)l4);
        p = "Z";
        A = a4h_0.a(465404870, 465431722, (int)l4);
        I = a4h_0.a(465404886, -465418702, (int)l4);
        r = a4h_0.a(465404871, 465425624, (int)l4);
        S = a4h_0.a(465404887, 465436169, (int)l4);
        j = a4h_0.a(465404879, -465417979, (int)l4);
        w = a4h_0.a(465404889, 465417734, (int)l4);
        F = a4h_0.a(465404892, -465404877, (int)l4);
        T = a4h_0.a(465404868, 465430996, (int)l4);
        B = a4h_0.a(465404890, -465420528, (int)l4);
        e = a4h_0.a(465404885, 465419454, (int)l4);
        K = a4h_0.a(465404873, 465432945, (int)l4);
        k = a4h_0.a(465404887, 465436169, (int)l4);
        G = a4h_0.a(465404872, -465424461, (int)l4);
        U = a4h_0.a(465404894, -465431820, (int)l4);
        m = "Z";
        z = a4h_0.a(465404888, 465419236, (int)l4);
        L = a4h_0.a(465404867, -465412807, (int)l4);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        a4h_0.V = a1c.a(5954021301220386991L, 5397022185599166412L, null).a(55274780367962L);
        var8 = a4h_0.V ^ 118073759840209L;
        v0 = var8 ^ 55998509125907L;
        var10_1 = (int)(v0 >>> 32);
        var11_2 = (int)(v0 << 32 >>> 48);
        var12_3 = (int)(v0 << 48 >>> 48);
        var5_4 = new String[32];
        var3_5 = 0;
        var2_6 = "\u00d3\u00f2\r\u001cE\u00fe\u00ac\u0013Y\u00f1\u00fa0\u0005\u0081\u00b7\u008b\u00e2\".\u0016\u0080\u008co'\u00bdq\u00e0\u000e\u00feh\u00ae\u0093\u0083d\u00cd\u00d0lO\u00bb[\u00fe\u00c4\u000b\u001a\u0091\u0019\u00ca\u00ed\u00a6\u00d0\u001c\u00b4\u00bc^\t[8\n\u0085\u00e5p\u0080c-\u00057`\u00bb\u0002]\u0004V\u00e7y\u00e3\u0013}\u001a~M\u0095.\u00a5~\u00a0\u009cf\u00c1\u0089vNx\u0099\u009ad\b\u00ca\u00f8\u0016\u0010\u00e0H\u00ac<\f\u00cb\u00a4\u00ea&\u00f0fZ\u00b0r\u0093\u00f3^\u0012\u00f7\u00e0q\u0081\u00ed\\8\u00fb\u00d3\u00fa\u00c7s\u00a8\u0088\u009d\u00d1\u00bd^\u000b\u00854\u00eb\u00f7.\u00d1\u00bb\u00dbWF}\u0004*c21\u0004\u000b\u00c2.\u000b\tw\u00ec\u00a1\u0092\u0017\u0012a;\u0095\u0004\u00a1\u00c6\u000b\u00a7\b\u00fa\u00c1\u00107 \u00ac\u00b4\u00a0\t\u00aeV\u00b4H2\u00c9zTr\u0004E\u00e4\u0097\u00e3\r\u00e1\u00b0\u0080\u00bf\u00d5'\u00b2}\u00a0\u00e5\u00b1\u0019)\u000b^\f\u0091y\u00fc\u00d0\u00f2\u00d2\u00f0e\u00d6\u000b\u00ce_\u0082\u009f\u0010c\r\u00e6\u0081\u0098\u00ab\u0007P\u007fW\u00e1\u00c0\u00ad>\n\u00b0\u00e2:\u00cc\u0097U*MPz\t\u009f@\u00bc\u0007\u00b4\u00a0\u0015m\u001b\f\u00aa\u0098FI\u00d9DI\u00e7+\u00b8\u00b1\u0090\u0007d\u0096\u0006\u00dc\u0005\u0001\u00a4\b\u00f6\u00c8\u0085\u000f\u00e5E\u0002D\r/\u0083Y\u00d9\u00ee\u00eb\u00d5\u00e4L\u00d6,\u007f\u009a\u0005\u00ca\u0005\u0004\u00ae\u00aa";
        var4_7 = "\u00d3\u00f2\r\u001cE\u00fe\u00ac\u0013Y\u00f1\u00fa0\u0005\u0081\u00b7\u008b\u00e2\".\u0016\u0080\u008co'\u00bdq\u00e0\u000e\u00feh\u00ae\u0093\u0083d\u00cd\u00d0lO\u00bb[\u00fe\u00c4\u000b\u001a\u0091\u0019\u00ca\u00ed\u00a6\u00d0\u001c\u00b4\u00bc^\t[8\n\u0085\u00e5p\u0080c-\u00057`\u00bb\u0002]\u0004V\u00e7y\u00e3\u0013}\u001a~M\u0095.\u00a5~\u00a0\u009cf\u00c1\u0089vNx\u0099\u009ad\b\u00ca\u00f8\u0016\u0010\u00e0H\u00ac<\f\u00cb\u00a4\u00ea&\u00f0fZ\u00b0r\u0093\u00f3^\u0012\u00f7\u00e0q\u0081\u00ed\\8\u00fb\u00d3\u00fa\u00c7s\u00a8\u0088\u009d\u00d1\u00bd^\u000b\u00854\u00eb\u00f7.\u00d1\u00bb\u00dbWF}\u0004*c21\u0004\u000b\u00c2.\u000b\tw\u00ec\u00a1\u0092\u0017\u0012a;\u0095\u0004\u00a1\u00c6\u000b\u00a7\b\u00fa\u00c1\u00107 \u00ac\u00b4\u00a0\t\u00aeV\u00b4H2\u00c9zTr\u0004E\u00e4\u0097\u00e3\r\u00e1\u00b0\u0080\u00bf\u00d5'\u00b2}\u00a0\u00e5\u00b1\u0019)\u000b^\f\u0091y\u00fc\u00d0\u00f2\u00d2\u00f0e\u00d6\u000b\u00ce_\u0082\u009f\u0010c\r\u00e6\u0081\u0098\u00ab\u0007P\u007fW\u00e1\u00c0\u00ad>\n\u00b0\u00e2:\u00cc\u0097U*MPz\t\u009f@\u00bc\u0007\u00b4\u00a0\u0015m\u001b\f\u00aa\u0098FI\u00d9DI\u00e7+\u00b8\u00b1\u0090\u0007d\u0096\u0006\u00dc\u0005\u0001\u00a4\b\u00f6\u00c8\u0085\u000f\u00e5E\u0002D\r/\u0083Y\u00d9\u00ee\u00eb\u00d5\u00e4L\u00d6,\u007f\u009a\u0005\u00ca\u0005\u0004\u00ae\u00aa".length();
        var1_8 = 7;
        var0_9 = -1;
        block0: while (true) {
            block7: {
                v1 = ++var0_9;
                v2 = var2_6.substring(v1, v1 + var1_8).toCharArray();
                v3 = v2.length;
                var7_10 = 0;
                v4 = 92;
                v5 = v2;
                v6 = v3;
                if (v3 > 1) ** GOTO lbl59
                break block7;
                while (true) {
                    var2_6 = "\u00a7}}\u00fc`\u00f2j}\u0007\u00c0\u008cT\u008e\u00b1Q\u0001";
                    var4_7 = "\u00a7}}\u00fc`\u00f2j}\u0007\u00c0\u008cT\u008e\u00b1Q\u0001".length();
                    var1_8 = 8;
                    var0_9 = -1;
lbl33:
                    // 2 sources

                    while (true) {
                        v7 = ++var0_9;
                        v8 = var2_6.substring(v7, v7 + var1_8).toCharArray();
                        v9 = v8.length;
                        var7_10 = 0;
                        v10 = 6;
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
                v5[v13] = (char)(v5[v13] ^ (v4 ^ 82));
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
            v11[v15] = (char)(v11[v15] ^ (v10 ^ 82));
            ++var7_10;
            v10 = v10;
lbl79:
            // 2 sources

            v16 = v11;
            v12 = v12;
        } while (v12 > var7_10);
        var5_4[var3_5++] = new String(v16).intern();
        if ((var0_9 += var1_8) >= var4_7) {
            a4h_0.W = var5_4;
            a4h_0.X = new String[32];
            a4h_0.b(var10_1, var11_2, (char)var12_3);
            return;
        }
        var1_8 = var2_6.charAt(var0_9);
        ** while (true)
    }

    private static String a(int n, int n2, int n3) {
        int n4 = (n ^ n3 ^ 0x250D) & 0xFFFF;
        if (X[n4] == null) {
            int n5;
            char[] cArray = W[n4].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n5 = 83;
                    break;
                }
                case 1: {
                    n5 = 213;
                    break;
                }
                case 2: {
                    n5 = 1;
                    break;
                }
                case 3: {
                    n5 = 205;
                    break;
                }
                case 4: {
                    n5 = 212;
                    break;
                }
                case 5: {
                    n5 = 16;
                    break;
                }
                case 6: {
                    n5 = 94;
                    break;
                }
                case 7: {
                    n5 = 242;
                    break;
                }
                case 8: {
                    n5 = 150;
                    break;
                }
                case 9: {
                    n5 = 70;
                    break;
                }
                case 10: {
                    n5 = 240;
                    break;
                }
                case 11: {
                    n5 = 211;
                    break;
                }
                case 12: {
                    n5 = 90;
                    break;
                }
                case 13: {
                    n5 = 36;
                    break;
                }
                case 14: {
                    n5 = 204;
                    break;
                }
                case 15: {
                    n5 = 228;
                    break;
                }
                case 16: {
                    n5 = 252;
                    break;
                }
                case 17: {
                    n5 = 84;
                    break;
                }
                case 18: {
                    n5 = 120;
                    break;
                }
                case 19: {
                    n5 = 42;
                    break;
                }
                case 20: {
                    n5 = 187;
                    break;
                }
                case 21: {
                    n5 = 8;
                    break;
                }
                case 22: {
                    n5 = 10;
                    break;
                }
                case 23: {
                    n5 = 74;
                    break;
                }
                case 24: {
                    n5 = 143;
                    break;
                }
                case 25: {
                    n5 = 208;
                    break;
                }
                case 26: {
                    n5 = 130;
                    break;
                }
                case 27: {
                    n5 = 227;
                    break;
                }
                case 28: {
                    n5 = 73;
                    break;
                }
                case 29: {
                    n5 = 9;
                    break;
                }
                case 30: {
                    n5 = 40;
                    break;
                }
                case 31: {
                    n5 = 164;
                    break;
                }
                case 32: {
                    n5 = 20;
                    break;
                }
                case 33: {
                    n5 = 235;
                    break;
                }
                case 34: {
                    n5 = 34;
                    break;
                }
                case 35: {
                    n5 = 217;
                    break;
                }
                case 36: {
                    n5 = 179;
                    break;
                }
                case 37: {
                    n5 = 177;
                    break;
                }
                case 38: {
                    n5 = 115;
                    break;
                }
                case 39: {
                    n5 = 59;
                    break;
                }
                case 40: {
                    n5 = 25;
                    break;
                }
                case 41: {
                    n5 = 162;
                    break;
                }
                case 42: {
                    n5 = 139;
                    break;
                }
                case 43: {
                    n5 = 21;
                    break;
                }
                case 44: {
                    n5 = 141;
                    break;
                }
                case 45: {
                    n5 = 218;
                    break;
                }
                case 46: {
                    n5 = 121;
                    break;
                }
                case 47: {
                    n5 = 152;
                    break;
                }
                case 48: {
                    n5 = 66;
                    break;
                }
                case 49: {
                    n5 = 35;
                    break;
                }
                case 50: {
                    n5 = 46;
                    break;
                }
                case 51: {
                    n5 = 239;
                    break;
                }
                case 52: {
                    n5 = 119;
                    break;
                }
                case 53: {
                    n5 = 103;
                    break;
                }
                case 54: {
                    n5 = 168;
                    break;
                }
                case 55: {
                    n5 = 32;
                    break;
                }
                case 56: {
                    n5 = 39;
                    break;
                }
                case 57: {
                    n5 = 97;
                    break;
                }
                case 58: {
                    n5 = 26;
                    break;
                }
                case 59: {
                    n5 = 44;
                    break;
                }
                case 60: {
                    n5 = 171;
                    break;
                }
                case 61: {
                    n5 = 200;
                    break;
                }
                case 62: {
                    n5 = 183;
                    break;
                }
                case 63: {
                    n5 = 147;
                    break;
                }
                case 64: {
                    n5 = 50;
                    break;
                }
                case 65: {
                    n5 = 118;
                    break;
                }
                case 66: {
                    n5 = 207;
                    break;
                }
                case 67: {
                    n5 = 214;
                    break;
                }
                case 68: {
                    n5 = 80;
                    break;
                }
                case 69: {
                    n5 = 232;
                    break;
                }
                case 70: {
                    n5 = 191;
                    break;
                }
                case 71: {
                    n5 = 11;
                    break;
                }
                case 72: {
                    n5 = 170;
                    break;
                }
                case 73: {
                    n5 = 126;
                    break;
                }
                case 74: {
                    n5 = 157;
                    break;
                }
                case 75: {
                    n5 = 19;
                    break;
                }
                case 76: {
                    n5 = 14;
                    break;
                }
                case 77: {
                    n5 = 146;
                    break;
                }
                case 78: {
                    n5 = 107;
                    break;
                }
                case 79: {
                    n5 = 230;
                    break;
                }
                case 80: {
                    n5 = 144;
                    break;
                }
                case 81: {
                    n5 = 67;
                    break;
                }
                case 82: {
                    n5 = 95;
                    break;
                }
                case 83: {
                    n5 = 52;
                    break;
                }
                case 84: {
                    n5 = 68;
                    break;
                }
                case 85: {
                    n5 = 109;
                    break;
                }
                case 86: {
                    n5 = 85;
                    break;
                }
                case 87: {
                    n5 = 254;
                    break;
                }
                case 88: {
                    n5 = 129;
                    break;
                }
                case 89: {
                    n5 = 63;
                    break;
                }
                case 90: {
                    n5 = 247;
                    break;
                }
                case 91: {
                    n5 = 203;
                    break;
                }
                case 92: {
                    n5 = 88;
                    break;
                }
                case 93: {
                    n5 = 82;
                    break;
                }
                case 94: {
                    n5 = 178;
                    break;
                }
                case 95: {
                    n5 = 60;
                    break;
                }
                case 96: {
                    n5 = 225;
                    break;
                }
                case 97: {
                    n5 = 206;
                    break;
                }
                case 98: {
                    n5 = 197;
                    break;
                }
                case 99: {
                    n5 = 53;
                    break;
                }
                case 100: {
                    n5 = 127;
                    break;
                }
                case 101: {
                    n5 = 233;
                    break;
                }
                case 102: {
                    n5 = 110;
                    break;
                }
                case 103: {
                    n5 = 229;
                    break;
                }
                case 104: {
                    n5 = 172;
                    break;
                }
                case 105: {
                    n5 = 77;
                    break;
                }
                case 106: {
                    n5 = 99;
                    break;
                }
                case 107: {
                    n5 = 221;
                    break;
                }
                case 108: {
                    n5 = 0;
                    break;
                }
                case 109: {
                    n5 = 250;
                    break;
                }
                case 110: {
                    n5 = 154;
                    break;
                }
                case 111: {
                    n5 = 253;
                    break;
                }
                case 112: {
                    n5 = 169;
                    break;
                }
                case 113: {
                    n5 = 182;
                    break;
                }
                case 114: {
                    n5 = 174;
                    break;
                }
                case 115: {
                    n5 = 78;
                    break;
                }
                case 116: {
                    n5 = 149;
                    break;
                }
                case 117: {
                    n5 = 75;
                    break;
                }
                case 118: {
                    n5 = 198;
                    break;
                }
                case 119: {
                    n5 = 186;
                    break;
                }
                case 120: {
                    n5 = 153;
                    break;
                }
                case 121: {
                    n5 = 223;
                    break;
                }
                case 122: {
                    n5 = 23;
                    break;
                }
                case 123: {
                    n5 = 167;
                    break;
                }
                case 124: {
                    n5 = 79;
                    break;
                }
                case 125: {
                    n5 = 185;
                    break;
                }
                case 126: {
                    n5 = 5;
                    break;
                }
                case 127: {
                    n5 = 158;
                    break;
                }
                case 128: {
                    n5 = 55;
                    break;
                }
                case 129: {
                    n5 = 98;
                    break;
                }
                case 130: {
                    n5 = 159;
                    break;
                }
                case 131: {
                    n5 = 210;
                    break;
                }
                case 132: {
                    n5 = 226;
                    break;
                }
                case 133: {
                    n5 = 195;
                    break;
                }
                case 134: {
                    n5 = 29;
                    break;
                }
                case 135: {
                    n5 = 100;
                    break;
                }
                case 136: {
                    n5 = 243;
                    break;
                }
                case 137: {
                    n5 = 184;
                    break;
                }
                case 138: {
                    n5 = 234;
                    break;
                }
                case 139: {
                    n5 = 48;
                    break;
                }
                case 140: {
                    n5 = 117;
                    break;
                }
                case 141: {
                    n5 = 249;
                    break;
                }
                case 142: {
                    n5 = 151;
                    break;
                }
                case 143: {
                    n5 = 176;
                    break;
                }
                case 144: {
                    n5 = 24;
                    break;
                }
                case 145: {
                    n5 = 7;
                    break;
                }
                case 146: {
                    n5 = 43;
                    break;
                }
                case 147: {
                    n5 = 237;
                    break;
                }
                case 148: {
                    n5 = 87;
                    break;
                }
                case 149: {
                    n5 = 180;
                    break;
                }
                case 150: {
                    n5 = 72;
                    break;
                }
                case 151: {
                    n5 = 155;
                    break;
                }
                case 152: {
                    n5 = 163;
                    break;
                }
                case 153: {
                    n5 = 123;
                    break;
                }
                case 154: {
                    n5 = 3;
                    break;
                }
                case 155: {
                    n5 = 128;
                    break;
                }
                case 156: {
                    n5 = 51;
                    break;
                }
                case 157: {
                    n5 = 89;
                    break;
                }
                case 158: {
                    n5 = 56;
                    break;
                }
                case 159: {
                    n5 = 220;
                    break;
                }
                case 160: {
                    n5 = 81;
                    break;
                }
                case 161: {
                    n5 = 246;
                    break;
                }
                case 162: {
                    n5 = 108;
                    break;
                }
                case 163: {
                    n5 = 165;
                    break;
                }
                case 164: {
                    n5 = 45;
                    break;
                }
                case 165: {
                    n5 = 91;
                    break;
                }
                case 166: {
                    n5 = 102;
                    break;
                }
                case 167: {
                    n5 = 192;
                    break;
                }
                case 168: {
                    n5 = 54;
                    break;
                }
                case 169: {
                    n5 = 124;
                    break;
                }
                case 170: {
                    n5 = 236;
                    break;
                }
                case 171: {
                    n5 = 238;
                    break;
                }
                case 172: {
                    n5 = 76;
                    break;
                }
                case 173: {
                    n5 = 111;
                    break;
                }
                case 174: {
                    n5 = 161;
                    break;
                }
                case 175: {
                    n5 = 58;
                    break;
                }
                case 176: {
                    n5 = 132;
                    break;
                }
                case 177: {
                    n5 = 4;
                    break;
                }
                case 178: {
                    n5 = 64;
                    break;
                }
                case 179: {
                    n5 = 156;
                    break;
                }
                case 180: {
                    n5 = 142;
                    break;
                }
                case 181: {
                    n5 = 231;
                    break;
                }
                case 182: {
                    n5 = 122;
                    break;
                }
                case 183: {
                    n5 = 245;
                    break;
                }
                case 184: {
                    n5 = 105;
                    break;
                }
                case 185: {
                    n5 = 30;
                    break;
                }
                case 186: {
                    n5 = 49;
                    break;
                }
                case 187: {
                    n5 = 166;
                    break;
                }
                case 188: {
                    n5 = 244;
                    break;
                }
                case 189: {
                    n5 = 255;
                    break;
                }
                case 190: {
                    n5 = 86;
                    break;
                }
                case 191: {
                    n5 = 13;
                    break;
                }
                case 192: {
                    n5 = 37;
                    break;
                }
                case 193: {
                    n5 = 138;
                    break;
                }
                case 194: {
                    n5 = 224;
                    break;
                }
                case 195: {
                    n5 = 92;
                    break;
                }
                case 196: {
                    n5 = 137;
                    break;
                }
                case 197: {
                    n5 = 194;
                    break;
                }
                case 198: {
                    n5 = 136;
                    break;
                }
                case 199: {
                    n5 = 41;
                    break;
                }
                case 200: {
                    n5 = 173;
                    break;
                }
                case 201: {
                    n5 = 202;
                    break;
                }
                case 202: {
                    n5 = 131;
                    break;
                }
                case 203: {
                    n5 = 215;
                    break;
                }
                case 204: {
                    n5 = 196;
                    break;
                }
                case 205: {
                    n5 = 61;
                    break;
                }
                case 206: {
                    n5 = 216;
                    break;
                }
                case 207: {
                    n5 = 31;
                    break;
                }
                case 208: {
                    n5 = 113;
                    break;
                }
                case 209: {
                    n5 = 101;
                    break;
                }
                case 210: {
                    n5 = 189;
                    break;
                }
                case 211: {
                    n5 = 193;
                    break;
                }
                case 212: {
                    n5 = 241;
                    break;
                }
                case 213: {
                    n5 = 93;
                    break;
                }
                case 214: {
                    n5 = 181;
                    break;
                }
                case 215: {
                    n5 = 201;
                    break;
                }
                case 216: {
                    n5 = 125;
                    break;
                }
                case 217: {
                    n5 = 27;
                    break;
                }
                case 218: {
                    n5 = 148;
                    break;
                }
                case 219: {
                    n5 = 38;
                    break;
                }
                case 220: {
                    n5 = 248;
                    break;
                }
                case 221: {
                    n5 = 22;
                    break;
                }
                case 222: {
                    n5 = 33;
                    break;
                }
                case 223: {
                    n5 = 112;
                    break;
                }
                case 224: {
                    n5 = 104;
                    break;
                }
                case 225: {
                    n5 = 71;
                    break;
                }
                case 226: {
                    n5 = 96;
                    break;
                }
                case 227: {
                    n5 = 65;
                    break;
                }
                case 228: {
                    n5 = 209;
                    break;
                }
                case 229: {
                    n5 = 47;
                    break;
                }
                case 230: {
                    n5 = 222;
                    break;
                }
                case 231: {
                    n5 = 135;
                    break;
                }
                case 232: {
                    n5 = 106;
                    break;
                }
                case 233: {
                    n5 = 251;
                    break;
                }
                case 234: {
                    n5 = 160;
                    break;
                }
                case 235: {
                    n5 = 134;
                    break;
                }
                case 236: {
                    n5 = 12;
                    break;
                }
                case 237: {
                    n5 = 175;
                    break;
                }
                case 238: {
                    n5 = 114;
                    break;
                }
                case 239: {
                    n5 = 69;
                    break;
                }
                case 240: {
                    n5 = 6;
                    break;
                }
                case 241: {
                    n5 = 116;
                    break;
                }
                case 242: {
                    n5 = 17;
                    break;
                }
                case 243: {
                    n5 = 145;
                    break;
                }
                case 244: {
                    n5 = 15;
                    break;
                }
                case 245: {
                    n5 = 62;
                    break;
                }
                case 246: {
                    n5 = 199;
                    break;
                }
                case 247: {
                    n5 = 28;
                    break;
                }
                case 248: {
                    n5 = 190;
                    break;
                }
                case 249: {
                    n5 = 2;
                    break;
                }
                case 250: {
                    n5 = 188;
                    break;
                }
                case 251: {
                    n5 = 133;
                    break;
                }
                case 252: {
                    n5 = 140;
                    break;
                }
                case 253: {
                    n5 = 18;
                    break;
                }
                case 254: {
                    n5 = 57;
                    break;
                }
                default: {
                    n5 = 219;
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
            a4h_0.X[n4] = new String(cArray).intern();
        }
        return X[n4];
    }
}

/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.amD
 */
public class amd_1 {
    public static String p = "X0_Y0";
    public static String z = "X270_Y180";
    private static String[] H;
    public static String y = "X180_Y180";
    public static String C = "X270_Y180";
    public static String k = "X0_Y270";
    public static String q = "X180_Y270";
    public static String w = "X270_Y90";
    public static String b = "X180_Y0";
    public static String t = "X0_Y180";
    public static String E = "X90_Y0";
    public static String v = "X270_Y270";
    public static String l = "X90_Y90";
    public static String e = "X0_Y270";
    public static String a = "X270_Y0";
    public static String r = "X90_Y270";
    public static String A = "X270_Y0";
    public static String j = "X0_Y90";
    public static String s = "X180_Y90";
    private static long G;
    public static String c = "X90_Y90";
    private static String[] I;
    public static String g = "X180_Y0";
    public static String h = "X270_Y90";
    public static String i = "X90_Y0";
    public static String x = "X180_Y270";
    public static String u = "X0_Y90";
    public static String m = "X270_Y270";
    public static String n = "X0_Y0";
    public static String F = "X90_Y180";
    public static String o = "X0_Y180";
    public static String f = "X90_Y270";
    public static String d = "X180_Y90";
    public static String D = "X90_Y180";
    public static String B = "X180_Y180";

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        amd_1.G = a1c.a(-7769698607697864225L, 7395812194212186319L, null).a(209188773745394L);
        var8 = amd_1.G ^ 36752975507199L;
        v0 = var8 ^ 102216006222930L;
        var10_1 = (int)(v0 >>> 32);
        var11_2 = (int)(v0 << 32 >>> 56);
        var12_3 = (int)(v0 << 40 >>> 40);
        var5_4 = new String[32];
        var3_5 = 0;
        var2_6 = "~\u00e2\u00d5\u00abe\u0012>G\u00a4\tk\u0015wU1\u00cd\u00b7\u00b3\u00f6\bM\u0091\u00b3\u00c5\u00a9\u00df\u00ac\u00f9\u0007Tx\u0090\u00f8\u00cdx)\b9\u00a7:\u0006yN~\u00cd\b\u00c7C\u00e2\u009f\u0083\u0094\u00e9\u0090\u0007\u0096\u00e5\u00a0`\u00c3A(\u0007R\u00bbP\u0080\u00d5w*\u0006DD\u00faT\u0083\u00c0\b\u0015<\u00bfu\u00c9#g\u0003\b\u00f7\u00f3\u00e3\u008cB\u001f\u0019\u00e7\t\u0083\u0083e\u00e4\u009d\u00fb\"uD\u0007\r\u00b9\u00d3\u00eb\u00ae?\u00e6\u0005n\b\u00bf\u00dd\"\u0007'\u00f1\u00f1\u00aa\u000f2q\t\u009fx\u00e9\u00f8\u00e2x\u00cd\u0005\u00b9\tBnR:\u0095  \u0001g\b\u00a7\u00bc\u00e1\u0003\r\u00078\u00e2\u0006m\u00bb\u00b0\u0085(<\u0006\u00b7$\u0084XLA\t`\u00d6\u0019N\u0012\u00ae\u00d0\u00d0y\b\u008b\u00d3d\u00ee\u00bd\u00ba.U\u0007\u00b1\u00caD\u0085_\u00fd\u00bb\u0005g\u00d3\u009e\u00a6\u0006\b\u0000\u00cc\u001dk\u009d\u00e0\u00ed{\u0007~\u00c6\u00d2*d\u00c0\u00da\u0007\u00d6D\u00c7z\u00c6\u00ca\u008e\u0007\u00d1\u0098H\u00cf\u00dd\u00bb\u0088\u0007\u008a\u00bcD\u0003\u00b9\u0007\u00a7\t}q\u00ba\u00baf0]\f\u00ab";
        var4_7 = "~\u00e2\u00d5\u00abe\u0012>G\u00a4\tk\u0015wU1\u00cd\u00b7\u00b3\u00f6\bM\u0091\u00b3\u00c5\u00a9\u00df\u00ac\u00f9\u0007Tx\u0090\u00f8\u00cdx)\b9\u00a7:\u0006yN~\u00cd\b\u00c7C\u00e2\u009f\u0083\u0094\u00e9\u0090\u0007\u0096\u00e5\u00a0`\u00c3A(\u0007R\u00bbP\u0080\u00d5w*\u0006DD\u00faT\u0083\u00c0\b\u0015<\u00bfu\u00c9#g\u0003\b\u00f7\u00f3\u00e3\u008cB\u001f\u0019\u00e7\t\u0083\u0083e\u00e4\u009d\u00fb\"uD\u0007\r\u00b9\u00d3\u00eb\u00ae?\u00e6\u0005n\b\u00bf\u00dd\"\u0007'\u00f1\u00f1\u00aa\u000f2q\t\u009fx\u00e9\u00f8\u00e2x\u00cd\u0005\u00b9\tBnR:\u0095  \u0001g\b\u00a7\u00bc\u00e1\u0003\r\u00078\u00e2\u0006m\u00bb\u00b0\u0085(<\u0006\u00b7$\u0084XLA\t`\u00d6\u0019N\u0012\u00ae\u00d0\u00d0y\b\u008b\u00d3d\u00ee\u00bd\u00ba.U\u0007\u00b1\u00caD\u0085_\u00fd\u00bb\u0005g\u00d3\u009e\u00a6\u0006\b\u0000\u00cc\u001dk\u009d\u00e0\u00ed{\u0007~\u00c6\u00d2*d\u00c0\u00da\u0007\u00d6D\u00c7z\u00c6\u00ca\u008e\u0007\u00d1\u0098H\u00cf\u00dd\u00bb\u0088\u0007\u008a\u00bcD\u0003\u00b9\u0007\u00a7\t}q\u00ba\u00baf0]\f\u00ab".length();
        var1_8 = 9;
        var0_9 = -1;
        block0: while (true) {
            block7: {
                v1 = ++var0_9;
                v2 = var2_6.substring(v1, v1 + var1_8).toCharArray();
                v3 = v2.length;
                var7_10 = 0;
                v4 = 113;
                v5 = v2;
                v6 = v3;
                if (v3 > 1) ** GOTO lbl59
                break block7;
                while (true) {
                    var2_6 = "-\u0090\u000b=\u00eb{T\u00d1R\u0006o\u00e8KT\u00ec\u00bd";
                    var4_7 = "-\u0090\u000b=\u00eb{T\u00d1R\u0006o\u00e8KT\u00ec\u00bd".length();
                    var1_8 = 9;
                    var0_9 = -1;
lbl33:
                    // 2 sources

                    while (true) {
                        v7 = ++var0_9;
                        v8 = var2_6.substring(v7, v7 + var1_8).toCharArray();
                        v9 = v8.length;
                        var7_10 = 0;
                        v10 = 77;
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
                v5[v13] = (char)(v5[v13] ^ (v4 ^ 88));
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
            v11[v15] = (char)(v11[v15] ^ (v10 ^ 88));
            ++var7_10;
            v10 = v10;
lbl79:
            // 2 sources

            v16 = v11;
            v12 = v12;
        } while (v12 > var7_10);
        var5_4[var3_5++] = new String(v16).intern();
        if ((var0_9 += var1_8) >= var4_7) {
            amd_1.H = var5_4;
            amd_1.I = new String[32];
            amd_1.b(var10_1, (byte)var11_2, var12_3);
            return;
        }
        var1_8 = var2_6.charAt(var0_9);
        ** while (true)
    }

    public static void b(int n, byte by, int n2) {
        long l4 = ((long)n << 32 | (long)by << 56 >>> 32 | (long)n2 << 40 >>> 40) ^ G;
        amd_1.n = amd_1.a(1018251714, -1018262046, (int)l4);
        y = amd_1.a(1018251742, -1018255507, (int)l4);
        j = amd_1.a(1018251741, 1018258854, (int)l4);
        D = amd_1.a(1018251740, 1018282830 - (char)-20458, (int)l4);
        r = amd_1.a(1018251743, 1018282830 - (char)-16252, (int)l4);
        p = amd_1.a(1018251736, 1018282830 - (char)-32043, (int)l4);
        u = amd_1.a(1018251718, -1018257003, (int)l4);
        h = amd_1.a(1018251728, 1018252851, (int)l4);
        d = amd_1.a(1018251712, 1018257106, (int)l4);
        s = amd_1.a(1018251716, -1018252478, (int)l4);
        k = amd_1.a(1018251731, -1018282830 - -((char)-15721), (int)l4);
        l = amd_1.a(1018251724, 1018260208, (int)l4);
        q = amd_1.a(1018251723, -1018252093, (int)l4);
        F = amd_1.a(1018251725, -1018254895, (int)l4);
        f = amd_1.a(1018251729, 1018264865, (int)l4);
        e = amd_1.a(1018251715, 1018282830 - (char)-24753, (int)l4);
        x = amd_1.a(1018251713, -1018260021, (int)l4);
        A = amd_1.a(1018251730, -1018282830 - -((char)-22124), (int)l4);
        g = amd_1.a(1018251721, 1018256070, (int)l4);
        B = amd_1.a(1018251720, 1018282830 - (char)-23691, (int)l4);
        E = amd_1.a(1018251719, -1018260760, (int)l4);
        o = amd_1.a(1018251737, -1018282830 - -((char)-27093), (int)l4);
        i = amd_1.a(1018251722, 1018282830 - (char)-25620, (int)l4);
        w = amd_1.a(1018251735, -1018250318, (int)l4);
        a = amd_1.a(1018251734, -1018282830 - -((char)-21414), (int)l4);
        C = amd_1.a(1018251732, 1018250100, (int)l4);
        z = amd_1.a(1018251738, -1018282830 - -((char)-24957), (int)l4);
        b = amd_1.a(1018251739, 1018282830 - (char)-22083, (int)l4);
        v = amd_1.a(1018251717, 1018252517, (int)l4);
        m = amd_1.a(1018251733, -1018265104, (int)l4);
        c = amd_1.a(1018251727, -1018253674, (int)l4);
        t = amd_1.a(1018251726, -1018282830 - -((char)-18868), (int)l4);
    }

    private static String a(int n, int n2, int n3) {
        int n4 = (n ^ n3 ^ 0x2378) & 0xFFFF;
        if (I[n4] == null) {
            int n5;
            char[] cArray = H[n4].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n5 = 183;
                    break;
                }
                case 1: {
                    n5 = 13;
                    break;
                }
                case 2: {
                    n5 = 113;
                    break;
                }
                case 3: {
                    n5 = 158;
                    break;
                }
                case 4: {
                    n5 = 236;
                    break;
                }
                case 5: {
                    n5 = 52;
                    break;
                }
                case 6: {
                    n5 = 195;
                    break;
                }
                case 7: {
                    n5 = 207;
                    break;
                }
                case 8: {
                    n5 = 28;
                    break;
                }
                case 9: {
                    n5 = 189;
                    break;
                }
                case 10: {
                    n5 = 84;
                    break;
                }
                case 11: {
                    n5 = 252;
                    break;
                }
                case 12: {
                    n5 = 211;
                    break;
                }
                case 13: {
                    n5 = 45;
                    break;
                }
                case 14: {
                    n5 = 230;
                    break;
                }
                case 15: {
                    n5 = 130;
                    break;
                }
                case 16: {
                    n5 = 68;
                    break;
                }
                case 17: {
                    n5 = 157;
                    break;
                }
                case 18: {
                    n5 = 51;
                    break;
                }
                case 19: {
                    n5 = 55;
                    break;
                }
                case 20: {
                    n5 = 94;
                    break;
                }
                case 21: {
                    n5 = 109;
                    break;
                }
                case 22: {
                    n5 = 167;
                    break;
                }
                case 23: {
                    n5 = 54;
                    break;
                }
                case 24: {
                    n5 = 105;
                    break;
                }
                case 25: {
                    n5 = 71;
                    break;
                }
                case 26: {
                    n5 = 43;
                    break;
                }
                case 27: {
                    n5 = 27;
                    break;
                }
                case 28: {
                    n5 = 171;
                    break;
                }
                case 29: {
                    n5 = 242;
                    break;
                }
                case 30: {
                    n5 = 89;
                    break;
                }
                case 31: {
                    n5 = 185;
                    break;
                }
                case 32: {
                    n5 = 4;
                    break;
                }
                case 33: {
                    n5 = 95;
                    break;
                }
                case 34: {
                    n5 = 59;
                    break;
                }
                case 35: {
                    n5 = 47;
                    break;
                }
                case 36: {
                    n5 = 244;
                    break;
                }
                case 37: {
                    n5 = 219;
                    break;
                }
                case 38: {
                    n5 = 134;
                    break;
                }
                case 39: {
                    n5 = 180;
                    break;
                }
                case 40: {
                    n5 = 93;
                    break;
                }
                case 41: {
                    n5 = 11;
                    break;
                }
                case 42: {
                    n5 = 48;
                    break;
                }
                case 43: {
                    n5 = 160;
                    break;
                }
                case 44: {
                    n5 = 161;
                    break;
                }
                case 45: {
                    n5 = 122;
                    break;
                }
                case 46: {
                    n5 = 69;
                    break;
                }
                case 47: {
                    n5 = 2;
                    break;
                }
                case 48: {
                    n5 = 98;
                    break;
                }
                case 49: {
                    n5 = 86;
                    break;
                }
                case 50: {
                    n5 = 67;
                    break;
                }
                case 51: {
                    n5 = 138;
                    break;
                }
                case 52: {
                    n5 = 250;
                    break;
                }
                case 53: {
                    n5 = 151;
                    break;
                }
                case 54: {
                    n5 = 44;
                    break;
                }
                case 55: {
                    n5 = 143;
                    break;
                }
                case 56: {
                    n5 = 14;
                    break;
                }
                case 57: {
                    n5 = 37;
                    break;
                }
                case 58: {
                    n5 = 166;
                    break;
                }
                case 59: {
                    n5 = 246;
                    break;
                }
                case 60: {
                    n5 = 49;
                    break;
                }
                case 61: {
                    n5 = 239;
                    break;
                }
                case 62: {
                    n5 = 175;
                    break;
                }
                case 63: {
                    n5 = 202;
                    break;
                }
                case 64: {
                    n5 = 153;
                    break;
                }
                case 65: {
                    n5 = 193;
                    break;
                }
                case 66: {
                    n5 = 191;
                    break;
                }
                case 67: {
                    n5 = 208;
                    break;
                }
                case 68: {
                    n5 = 41;
                    break;
                }
                case 69: {
                    n5 = 100;
                    break;
                }
                case 70: {
                    n5 = 106;
                    break;
                }
                case 71: {
                    n5 = 181;
                    break;
                }
                case 72: {
                    n5 = 31;
                    break;
                }
                case 73: {
                    n5 = 85;
                    break;
                }
                case 74: {
                    n5 = 26;
                    break;
                }
                case 75: {
                    n5 = 96;
                    break;
                }
                case 76: {
                    n5 = 248;
                    break;
                }
                case 77: {
                    n5 = 228;
                    break;
                }
                case 78: {
                    n5 = 57;
                    break;
                }
                case 79: {
                    n5 = 9;
                    break;
                }
                case 80: {
                    n5 = 177;
                    break;
                }
                case 81: {
                    n5 = 39;
                    break;
                }
                case 82: {
                    n5 = 139;
                    break;
                }
                case 83: {
                    n5 = 235;
                    break;
                }
                case 84: {
                    n5 = 104;
                    break;
                }
                case 85: {
                    n5 = 58;
                    break;
                }
                case 86: {
                    n5 = 174;
                    break;
                }
                case 87: {
                    n5 = 78;
                    break;
                }
                case 88: {
                    n5 = 199;
                    break;
                }
                case 89: {
                    n5 = 196;
                    break;
                }
                case 90: {
                    n5 = 33;
                    break;
                }
                case 91: {
                    n5 = 168;
                    break;
                }
                case 92: {
                    n5 = 222;
                    break;
                }
                case 93: {
                    n5 = 97;
                    break;
                }
                case 94: {
                    n5 = 149;
                    break;
                }
                case 95: {
                    n5 = 83;
                    break;
                }
                case 96: {
                    n5 = 81;
                    break;
                }
                case 97: {
                    n5 = 182;
                    break;
                }
                case 98: {
                    n5 = 229;
                    break;
                }
                case 99: {
                    n5 = 103;
                    break;
                }
                case 100: {
                    n5 = 227;
                    break;
                }
                case 101: {
                    n5 = 126;
                    break;
                }
                case 102: {
                    n5 = 0;
                    break;
                }
                case 103: {
                    n5 = 212;
                    break;
                }
                case 104: {
                    n5 = 234;
                    break;
                }
                case 105: {
                    n5 = 79;
                    break;
                }
                case 106: {
                    n5 = 32;
                    break;
                }
                case 107: {
                    n5 = 21;
                    break;
                }
                case 108: {
                    n5 = 34;
                    break;
                }
                case 109: {
                    n5 = 214;
                    break;
                }
                case 110: {
                    n5 = 24;
                    break;
                }
                case 111: {
                    n5 = 163;
                    break;
                }
                case 112: {
                    n5 = 88;
                    break;
                }
                case 113: {
                    n5 = 61;
                    break;
                }
                case 114: {
                    n5 = 172;
                    break;
                }
                case 115: {
                    n5 = 254;
                    break;
                }
                case 116: {
                    n5 = 147;
                    break;
                }
                case 117: {
                    n5 = 223;
                    break;
                }
                case 118: {
                    n5 = 110;
                    break;
                }
                case 119: {
                    n5 = 123;
                    break;
                }
                case 120: {
                    n5 = 142;
                    break;
                }
                case 121: {
                    n5 = 216;
                    break;
                }
                case 122: {
                    n5 = 173;
                    break;
                }
                case 123: {
                    n5 = 200;
                    break;
                }
                case 124: {
                    n5 = 136;
                    break;
                }
                case 125: {
                    n5 = 124;
                    break;
                }
                case 126: {
                    n5 = 221;
                    break;
                }
                case 127: {
                    n5 = 42;
                    break;
                }
                case 128: {
                    n5 = 12;
                    break;
                }
                case 129: {
                    n5 = 247;
                    break;
                }
                case 130: {
                    n5 = 75;
                    break;
                }
                case 131: {
                    n5 = 3;
                    break;
                }
                case 132: {
                    n5 = 187;
                    break;
                }
                case 133: {
                    n5 = 99;
                    break;
                }
                case 134: {
                    n5 = 116;
                    break;
                }
                case 135: {
                    n5 = 19;
                    break;
                }
                case 136: {
                    n5 = 111;
                    break;
                }
                case 137: {
                    n5 = 40;
                    break;
                }
                case 138: {
                    n5 = 17;
                    break;
                }
                case 139: {
                    n5 = 188;
                    break;
                }
                case 140: {
                    n5 = 76;
                    break;
                }
                case 141: {
                    n5 = 5;
                    break;
                }
                case 142: {
                    n5 = 25;
                    break;
                }
                case 143: {
                    n5 = 108;
                    break;
                }
                case 144: {
                    n5 = 184;
                    break;
                }
                case 145: {
                    n5 = 220;
                    break;
                }
                case 146: {
                    n5 = 82;
                    break;
                }
                case 147: {
                    n5 = 29;
                    break;
                }
                case 148: {
                    n5 = 23;
                    break;
                }
                case 149: {
                    n5 = 140;
                    break;
                }
                case 150: {
                    n5 = 176;
                    break;
                }
                case 151: {
                    n5 = 46;
                    break;
                }
                case 152: {
                    n5 = 146;
                    break;
                }
                case 153: {
                    n5 = 162;
                    break;
                }
                case 154: {
                    n5 = 243;
                    break;
                }
                case 155: {
                    n5 = 144;
                    break;
                }
                case 156: {
                    n5 = 50;
                    break;
                }
                case 157: {
                    n5 = 121;
                    break;
                }
                case 158: {
                    n5 = 114;
                    break;
                }
                case 159: {
                    n5 = 53;
                    break;
                }
                case 160: {
                    n5 = 129;
                    break;
                }
                case 161: {
                    n5 = 6;
                    break;
                }
                case 162: {
                    n5 = 133;
                    break;
                }
                case 163: {
                    n5 = 112;
                    break;
                }
                case 164: {
                    n5 = 237;
                    break;
                }
                case 165: {
                    n5 = 150;
                    break;
                }
                case 166: {
                    n5 = 87;
                    break;
                }
                case 167: {
                    n5 = 240;
                    break;
                }
                case 168: {
                    n5 = 120;
                    break;
                }
                case 169: {
                    n5 = 251;
                    break;
                }
                case 170: {
                    n5 = 206;
                    break;
                }
                case 171: {
                    n5 = 215;
                    break;
                }
                case 172: {
                    n5 = 20;
                    break;
                }
                case 173: {
                    n5 = 152;
                    break;
                }
                case 174: {
                    n5 = 30;
                    break;
                }
                case 175: {
                    n5 = 60;
                    break;
                }
                case 176: {
                    n5 = 131;
                    break;
                }
                case 177: {
                    n5 = 137;
                    break;
                }
                case 178: {
                    n5 = 156;
                    break;
                }
                case 179: {
                    n5 = 72;
                    break;
                }
                case 180: {
                    n5 = 115;
                    break;
                }
                case 181: {
                    n5 = 213;
                    break;
                }
                case 182: {
                    n5 = 170;
                    break;
                }
                case 183: {
                    n5 = 92;
                    break;
                }
                case 184: {
                    n5 = 22;
                    break;
                }
                case 185: {
                    n5 = 74;
                    break;
                }
                case 186: {
                    n5 = 56;
                    break;
                }
                case 187: {
                    n5 = 91;
                    break;
                }
                case 188: {
                    n5 = 35;
                    break;
                }
                case 189: {
                    n5 = 10;
                    break;
                }
                case 190: {
                    n5 = 209;
                    break;
                }
                case 191: {
                    n5 = 253;
                    break;
                }
                case 192: {
                    n5 = 217;
                    break;
                }
                case 193: {
                    n5 = 125;
                    break;
                }
                case 194: {
                    n5 = 145;
                    break;
                }
                case 195: {
                    n5 = 132;
                    break;
                }
                case 196: {
                    n5 = 190;
                    break;
                }
                case 197: {
                    n5 = 107;
                    break;
                }
                case 198: {
                    n5 = 65;
                    break;
                }
                case 199: {
                    n5 = 77;
                    break;
                }
                case 200: {
                    n5 = 192;
                    break;
                }
                case 201: {
                    n5 = 210;
                    break;
                }
                case 202: {
                    n5 = 231;
                    break;
                }
                case 203: {
                    n5 = 63;
                    break;
                }
                case 204: {
                    n5 = 165;
                    break;
                }
                case 205: {
                    n5 = 15;
                    break;
                }
                case 206: {
                    n5 = 16;
                    break;
                }
                case 207: {
                    n5 = 128;
                    break;
                }
                case 208: {
                    n5 = 36;
                    break;
                }
                case 209: {
                    n5 = 255;
                    break;
                }
                case 210: {
                    n5 = 224;
                    break;
                }
                case 211: {
                    n5 = 101;
                    break;
                }
                case 212: {
                    n5 = 198;
                    break;
                }
                case 213: {
                    n5 = 117;
                    break;
                }
                case 214: {
                    n5 = 226;
                    break;
                }
                case 215: {
                    n5 = 249;
                    break;
                }
                case 216: {
                    n5 = 203;
                    break;
                }
                case 217: {
                    n5 = 238;
                    break;
                }
                case 218: {
                    n5 = 135;
                    break;
                }
                case 219: {
                    n5 = 66;
                    break;
                }
                case 220: {
                    n5 = 62;
                    break;
                }
                case 221: {
                    n5 = 241;
                    break;
                }
                case 222: {
                    n5 = 225;
                    break;
                }
                case 223: {
                    n5 = 141;
                    break;
                }
                case 224: {
                    n5 = 205;
                    break;
                }
                case 225: {
                    n5 = 1;
                    break;
                }
                case 226: {
                    n5 = 201;
                    break;
                }
                case 227: {
                    n5 = 80;
                    break;
                }
                case 228: {
                    n5 = 119;
                    break;
                }
                case 229: {
                    n5 = 118;
                    break;
                }
                case 230: {
                    n5 = 159;
                    break;
                }
                case 231: {
                    n5 = 154;
                    break;
                }
                case 232: {
                    n5 = 64;
                    break;
                }
                case 233: {
                    n5 = 164;
                    break;
                }
                case 234: {
                    n5 = 8;
                    break;
                }
                case 235: {
                    n5 = 245;
                    break;
                }
                case 236: {
                    n5 = 73;
                    break;
                }
                case 237: {
                    n5 = 169;
                    break;
                }
                case 238: {
                    n5 = 232;
                    break;
                }
                case 239: {
                    n5 = 127;
                    break;
                }
                case 240: {
                    n5 = 233;
                    break;
                }
                case 241: {
                    n5 = 204;
                    break;
                }
                case 242: {
                    n5 = 155;
                    break;
                }
                case 243: {
                    n5 = 18;
                    break;
                }
                case 244: {
                    n5 = 102;
                    break;
                }
                case 245: {
                    n5 = 197;
                    break;
                }
                case 246: {
                    n5 = 7;
                    break;
                }
                case 247: {
                    n5 = 90;
                    break;
                }
                case 248: {
                    n5 = 179;
                    break;
                }
                case 249: {
                    n5 = 218;
                    break;
                }
                case 250: {
                    n5 = 38;
                    break;
                }
                case 251: {
                    n5 = 178;
                    break;
                }
                case 252: {
                    n5 = 70;
                    break;
                }
                case 253: {
                    n5 = 194;
                    break;
                }
                case 254: {
                    n5 = 186;
                    break;
                }
                default: {
                    n5 = 148;
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
            amd_1.I[n4] = new String(cArray).intern();
        }
        return I[n4];
    }
}


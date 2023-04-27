/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class a97 {
    public static String j = "SOUTH_EAST";
    public static String b = "south_east";
    private static long u = a1c.a(-2997893127637729237L, -6961885631816055379L, null).a(229858205400197L);
    public static String a = "SOUTH_WEST";
    public static String t = "ASCENDING_NORTH";
    public static String p = "ASCENDING_WEST";
    public static String q = "ascending_north";
    public static String e = "south_west";
    public static String k = "ascending_east";
    public static String l = "NORTH_SOUTH";
    public static String s = "ascending_west";
    private static String[] v;
    public static String r = "NORTH_WEST";
    public static String n = "east_west";
    public static String d = "ASCENDING_EAST";
    public static String m = "NORTH_EAST";
    private static String[] w;
    public static String i = "north_south";
    public static String f = "EAST_WEST";
    public static String o = "ASCENDING_SOUTH";
    public static String h = "north_east";
    public static String g = "ascending_south";
    public static String c = "north_west";

    public static void b(int n, int n2, byte by) {
        long l4 = ((long)n << 32 | (long)n2 << 40 >>> 32 | (long)by << 56 >>> 56) ^ u;
        c = a97.a(-378659265, -378650270, (int)l4);
        h = a97.a(-378659271, 378659127, (int)l4);
        i = a97.a(-378659274, -378638617, (int)l4);
        p = a97.a(-378659281, 378656074, (int)l4);
        l = a97.a(-378659267, -378652254, (int)l4);
        j = a97.a(-378659278, -378646006, (int)l4);
        e = a97.a(-378659275, -378656521, (int)l4);
        m = a97.a(-378659284, 378658423, (int)l4);
        d = a97.a(-378659268, 378661553, (int)l4);
        g = a97.a(-378659277, -378646657, (int)l4);
        r = a97.a(-378659280, -378654535, (int)l4);
        k = a97.a(-378659269, 378665907, (int)l4);
        o = a97.a(-378659282, -378648330, (int)l4);
        t = a97.a(-378659270, -378664284, (int)l4);
        f = a97.a(-378659273, -378635230, (int)l4);
        q = a97.a(-378659272, -378651745, (int)l4);
        b = a97.a(-378659283, -378661329, (int)l4);
        a97.n = a97.a(-378659266, -378654903, (int)l4);
        s = a97.a(-378659279, -378642826, (int)l4);
        a = a97.a(-378659276, 378648838, (int)l4);
    }

    private static String a(int n, int n2, int n3) {
        int n4 = (n ^ n3 ^ 0xFFFFA724) & 0xFFFF;
        if (w[n4] == null) {
            int n5;
            char[] cArray = v[n4].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n5 = 242;
                    break;
                }
                case 1: {
                    n5 = 165;
                    break;
                }
                case 2: {
                    n5 = 212;
                    break;
                }
                case 3: {
                    n5 = 13;
                    break;
                }
                case 4: {
                    n5 = 174;
                    break;
                }
                case 5: {
                    n5 = 86;
                    break;
                }
                case 6: {
                    n5 = 78;
                    break;
                }
                case 7: {
                    n5 = 85;
                    break;
                }
                case 8: {
                    n5 = 41;
                    break;
                }
                case 9: {
                    n5 = 176;
                    break;
                }
                case 10: {
                    n5 = 40;
                    break;
                }
                case 11: {
                    n5 = 167;
                    break;
                }
                case 12: {
                    n5 = 95;
                    break;
                }
                case 13: {
                    n5 = 183;
                    break;
                }
                case 14: {
                    n5 = 124;
                    break;
                }
                case 15: {
                    n5 = 197;
                    break;
                }
                case 16: {
                    n5 = 20;
                    break;
                }
                case 17: {
                    n5 = 200;
                    break;
                }
                case 18: {
                    n5 = 72;
                    break;
                }
                case 19: {
                    n5 = 67;
                    break;
                }
                case 20: {
                    n5 = 193;
                    break;
                }
                case 21: {
                    n5 = 155;
                    break;
                }
                case 22: {
                    n5 = 235;
                    break;
                }
                case 23: {
                    n5 = 158;
                    break;
                }
                case 24: {
                    n5 = 97;
                    break;
                }
                case 25: {
                    n5 = 239;
                    break;
                }
                case 26: {
                    n5 = 214;
                    break;
                }
                case 27: {
                    n5 = 25;
                    break;
                }
                case 28: {
                    n5 = 194;
                    break;
                }
                case 29: {
                    n5 = 153;
                    break;
                }
                case 30: {
                    n5 = 249;
                    break;
                }
                case 31: {
                    n5 = 7;
                    break;
                }
                case 32: {
                    n5 = 1;
                    break;
                }
                case 33: {
                    n5 = 188;
                    break;
                }
                case 34: {
                    n5 = 240;
                    break;
                }
                case 35: {
                    n5 = 229;
                    break;
                }
                case 36: {
                    n5 = 12;
                    break;
                }
                case 37: {
                    n5 = 163;
                    break;
                }
                case 38: {
                    n5 = 169;
                    break;
                }
                case 39: {
                    n5 = 71;
                    break;
                }
                case 40: {
                    n5 = 195;
                    break;
                }
                case 41: {
                    n5 = 127;
                    break;
                }
                case 42: {
                    n5 = 162;
                    break;
                }
                case 43: {
                    n5 = 44;
                    break;
                }
                case 44: {
                    n5 = 60;
                    break;
                }
                case 45: {
                    n5 = 219;
                    break;
                }
                case 46: {
                    n5 = 252;
                    break;
                }
                case 47: {
                    n5 = 206;
                    break;
                }
                case 48: {
                    n5 = 24;
                    break;
                }
                case 49: {
                    n5 = 46;
                    break;
                }
                case 50: {
                    n5 = 5;
                    break;
                }
                case 51: {
                    n5 = 6;
                    break;
                }
                case 52: {
                    n5 = 64;
                    break;
                }
                case 53: {
                    n5 = 116;
                    break;
                }
                case 54: {
                    n5 = 118;
                    break;
                }
                case 55: {
                    n5 = 94;
                    break;
                }
                case 56: {
                    n5 = 211;
                    break;
                }
                case 57: {
                    n5 = 16;
                    break;
                }
                case 58: {
                    n5 = 198;
                    break;
                }
                case 59: {
                    n5 = 182;
                    break;
                }
                case 60: {
                    n5 = 10;
                    break;
                }
                case 61: {
                    n5 = 106;
                    break;
                }
                case 62: {
                    n5 = 111;
                    break;
                }
                case 63: {
                    n5 = 107;
                    break;
                }
                case 64: {
                    n5 = 57;
                    break;
                }
                case 65: {
                    n5 = 136;
                    break;
                }
                case 66: {
                    n5 = 27;
                    break;
                }
                case 67: {
                    n5 = 2;
                    break;
                }
                case 68: {
                    n5 = 142;
                    break;
                }
                case 69: {
                    n5 = 251;
                    break;
                }
                case 70: {
                    n5 = 213;
                    break;
                }
                case 71: {
                    n5 = 171;
                    break;
                }
                case 72: {
                    n5 = 47;
                    break;
                }
                case 73: {
                    n5 = 108;
                    break;
                }
                case 74: {
                    n5 = 254;
                    break;
                }
                case 75: {
                    n5 = 250;
                    break;
                }
                case 76: {
                    n5 = 90;
                    break;
                }
                case 77: {
                    n5 = 147;
                    break;
                }
                case 78: {
                    n5 = 3;
                    break;
                }
                case 79: {
                    n5 = 109;
                    break;
                }
                case 80: {
                    n5 = 52;
                    break;
                }
                case 81: {
                    n5 = 187;
                    break;
                }
                case 82: {
                    n5 = 30;
                    break;
                }
                case 83: {
                    n5 = 237;
                    break;
                }
                case 84: {
                    n5 = 191;
                    break;
                }
                case 85: {
                    n5 = 238;
                    break;
                }
                case 86: {
                    n5 = 202;
                    break;
                }
                case 87: {
                    n5 = 190;
                    break;
                }
                case 88: {
                    n5 = 154;
                    break;
                }
                case 89: {
                    n5 = 83;
                    break;
                }
                case 90: {
                    n5 = 149;
                    break;
                }
                case 91: {
                    n5 = 4;
                    break;
                }
                case 92: {
                    n5 = 42;
                    break;
                }
                case 93: {
                    n5 = 224;
                    break;
                }
                case 94: {
                    n5 = 105;
                    break;
                }
                case 95: {
                    n5 = 207;
                    break;
                }
                case 96: {
                    n5 = 216;
                    break;
                }
                case 97: {
                    n5 = 144;
                    break;
                }
                case 98: {
                    n5 = 102;
                    break;
                }
                case 99: {
                    n5 = 92;
                    break;
                }
                case 100: {
                    n5 = 80;
                    break;
                }
                case 101: {
                    n5 = 48;
                    break;
                }
                case 102: {
                    n5 = 223;
                    break;
                }
                case 103: {
                    n5 = 141;
                    break;
                }
                case 104: {
                    n5 = 31;
                    break;
                }
                case 105: {
                    n5 = 186;
                    break;
                }
                case 106: {
                    n5 = 227;
                    break;
                }
                case 107: {
                    n5 = 120;
                    break;
                }
                case 108: {
                    n5 = 168;
                    break;
                }
                case 109: {
                    n5 = 138;
                    break;
                }
                case 110: {
                    n5 = 150;
                    break;
                }
                case 111: {
                    n5 = 54;
                    break;
                }
                case 112: {
                    n5 = 121;
                    break;
                }
                case 113: {
                    n5 = 61;
                    break;
                }
                case 114: {
                    n5 = 101;
                    break;
                }
                case 115: {
                    n5 = 114;
                    break;
                }
                case 116: {
                    n5 = 215;
                    break;
                }
                case 117: {
                    n5 = 100;
                    break;
                }
                case 118: {
                    n5 = 33;
                    break;
                }
                case 119: {
                    n5 = 243;
                    break;
                }
                case 120: {
                    n5 = 14;
                    break;
                }
                case 121: {
                    n5 = 232;
                    break;
                }
                case 122: {
                    n5 = 156;
                    break;
                }
                case 123: {
                    n5 = 11;
                    break;
                }
                case 124: {
                    n5 = 123;
                    break;
                }
                case 125: {
                    n5 = 50;
                    break;
                }
                case 126: {
                    n5 = 201;
                    break;
                }
                case 127: {
                    n5 = 0;
                    break;
                }
                case 128: {
                    n5 = 134;
                    break;
                }
                case 129: {
                    n5 = 230;
                    break;
                }
                case 130: {
                    n5 = 160;
                    break;
                }
                case 131: {
                    n5 = 77;
                    break;
                }
                case 132: {
                    n5 = 152;
                    break;
                }
                case 133: {
                    n5 = 140;
                    break;
                }
                case 134: {
                    n5 = 65;
                    break;
                }
                case 135: {
                    n5 = 166;
                    break;
                }
                case 136: {
                    n5 = 9;
                    break;
                }
                case 137: {
                    n5 = 26;
                    break;
                }
                case 138: {
                    n5 = 19;
                    break;
                }
                case 139: {
                    n5 = 36;
                    break;
                }
                case 140: {
                    n5 = 175;
                    break;
                }
                case 141: {
                    n5 = 222;
                    break;
                }
                case 142: {
                    n5 = 32;
                    break;
                }
                case 143: {
                    n5 = 15;
                    break;
                }
                case 144: {
                    n5 = 56;
                    break;
                }
                case 145: {
                    n5 = 179;
                    break;
                }
                case 146: {
                    n5 = 89;
                    break;
                }
                case 147: {
                    n5 = 164;
                    break;
                }
                case 148: {
                    n5 = 125;
                    break;
                }
                case 149: {
                    n5 = 139;
                    break;
                }
                case 150: {
                    n5 = 91;
                    break;
                }
                case 151: {
                    n5 = 43;
                    break;
                }
                case 152: {
                    n5 = 135;
                    break;
                }
                case 153: {
                    n5 = 143;
                    break;
                }
                case 154: {
                    n5 = 177;
                    break;
                }
                case 155: {
                    n5 = 130;
                    break;
                }
                case 156: {
                    n5 = 180;
                    break;
                }
                case 157: {
                    n5 = 74;
                    break;
                }
                case 158: {
                    n5 = 133;
                    break;
                }
                case 159: {
                    n5 = 87;
                    break;
                }
                case 160: {
                    n5 = 119;
                    break;
                }
                case 161: {
                    n5 = 37;
                    break;
                }
                case 162: {
                    n5 = 66;
                    break;
                }
                case 163: {
                    n5 = 231;
                    break;
                }
                case 164: {
                    n5 = 181;
                    break;
                }
                case 165: {
                    n5 = 204;
                    break;
                }
                case 166: {
                    n5 = 228;
                    break;
                }
                case 167: {
                    n5 = 79;
                    break;
                }
                case 168: {
                    n5 = 103;
                    break;
                }
                case 169: {
                    n5 = 93;
                    break;
                }
                case 170: {
                    n5 = 76;
                    break;
                }
                case 171: {
                    n5 = 225;
                    break;
                }
                case 172: {
                    n5 = 35;
                    break;
                }
                case 173: {
                    n5 = 159;
                    break;
                }
                case 174: {
                    n5 = 18;
                    break;
                }
                case 175: {
                    n5 = 73;
                    break;
                }
                case 176: {
                    n5 = 137;
                    break;
                }
                case 177: {
                    n5 = 99;
                    break;
                }
                case 178: {
                    n5 = 189;
                    break;
                }
                case 179: {
                    n5 = 218;
                    break;
                }
                case 180: {
                    n5 = 199;
                    break;
                }
                case 181: {
                    n5 = 248;
                    break;
                }
                case 182: {
                    n5 = 255;
                    break;
                }
                case 183: {
                    n5 = 88;
                    break;
                }
                case 184: {
                    n5 = 55;
                    break;
                }
                case 185: {
                    n5 = 117;
                    break;
                }
                case 186: {
                    n5 = 96;
                    break;
                }
                case 187: {
                    n5 = 132;
                    break;
                }
                case 188: {
                    n5 = 51;
                    break;
                }
                case 189: {
                    n5 = 84;
                    break;
                }
                case 190: {
                    n5 = 236;
                    break;
                }
                case 191: {
                    n5 = 129;
                    break;
                }
                case 192: {
                    n5 = 184;
                    break;
                }
                case 193: {
                    n5 = 22;
                    break;
                }
                case 194: {
                    n5 = 126;
                    break;
                }
                case 195: {
                    n5 = 178;
                    break;
                }
                case 196: {
                    n5 = 185;
                    break;
                }
                case 197: {
                    n5 = 21;
                    break;
                }
                case 198: {
                    n5 = 58;
                    break;
                }
                case 199: {
                    n5 = 203;
                    break;
                }
                case 200: {
                    n5 = 247;
                    break;
                }
                case 201: {
                    n5 = 75;
                    break;
                }
                case 202: {
                    n5 = 69;
                    break;
                }
                case 203: {
                    n5 = 82;
                    break;
                }
                case 204: {
                    n5 = 220;
                    break;
                }
                case 205: {
                    n5 = 217;
                    break;
                }
                case 206: {
                    n5 = 157;
                    break;
                }
                case 207: {
                    n5 = 53;
                    break;
                }
                case 208: {
                    n5 = 234;
                    break;
                }
                case 209: {
                    n5 = 172;
                    break;
                }
                case 210: {
                    n5 = 128;
                    break;
                }
                case 211: {
                    n5 = 151;
                    break;
                }
                case 212: {
                    n5 = 62;
                    break;
                }
                case 213: {
                    n5 = 221;
                    break;
                }
                case 214: {
                    n5 = 245;
                    break;
                }
                case 215: {
                    n5 = 63;
                    break;
                }
                case 216: {
                    n5 = 246;
                    break;
                }
                case 217: {
                    n5 = 244;
                    break;
                }
                case 218: {
                    n5 = 196;
                    break;
                }
                case 219: {
                    n5 = 49;
                    break;
                }
                case 220: {
                    n5 = 113;
                    break;
                }
                case 221: {
                    n5 = 8;
                    break;
                }
                case 222: {
                    n5 = 145;
                    break;
                }
                case 223: {
                    n5 = 253;
                    break;
                }
                case 224: {
                    n5 = 110;
                    break;
                }
                case 225: {
                    n5 = 28;
                    break;
                }
                case 226: {
                    n5 = 29;
                    break;
                }
                case 227: {
                    n5 = 233;
                    break;
                }
                case 228: {
                    n5 = 115;
                    break;
                }
                case 229: {
                    n5 = 70;
                    break;
                }
                case 230: {
                    n5 = 209;
                    break;
                }
                case 231: {
                    n5 = 241;
                    break;
                }
                case 232: {
                    n5 = 131;
                    break;
                }
                case 233: {
                    n5 = 112;
                    break;
                }
                case 234: {
                    n5 = 161;
                    break;
                }
                case 235: {
                    n5 = 122;
                    break;
                }
                case 236: {
                    n5 = 173;
                    break;
                }
                case 237: {
                    n5 = 17;
                    break;
                }
                case 238: {
                    n5 = 205;
                    break;
                }
                case 239: {
                    n5 = 81;
                    break;
                }
                case 240: {
                    n5 = 68;
                    break;
                }
                case 241: {
                    n5 = 98;
                    break;
                }
                case 242: {
                    n5 = 38;
                    break;
                }
                case 243: {
                    n5 = 104;
                    break;
                }
                case 244: {
                    n5 = 45;
                    break;
                }
                case 245: {
                    n5 = 23;
                    break;
                }
                case 246: {
                    n5 = 148;
                    break;
                }
                case 247: {
                    n5 = 39;
                    break;
                }
                case 248: {
                    n5 = 34;
                    break;
                }
                case 249: {
                    n5 = 170;
                    break;
                }
                case 250: {
                    n5 = 59;
                    break;
                }
                case 251: {
                    n5 = 192;
                    break;
                }
                case 252: {
                    n5 = 146;
                    break;
                }
                case 253: {
                    n5 = 210;
                    break;
                }
                case 254: {
                    n5 = 226;
                    break;
                }
                default: {
                    n5 = 208;
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
            a97.w[n4] = new String(cArray).intern();
        }
        return w[n4];
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var8 = a97.u ^ 63046682627133L;
        v0 = var8 ^ 31628769293605L;
        var10_1 = (int)(v0 >>> 32);
        var11_2 = (int)(v0 << 32 >>> 40);
        var12_3 = (int)(v0 << 56 >>> 56);
        var5_4 = new String[20];
        var3_5 = 0;
        var2_6 = "\u001av\u00df\u0094\u00eb%\u00c5R\u008e$\u001d\u0004\u0003\u00cb\u000b\u0002=#sA\u00f1L\u00b1\u00f4r\u000f\t\u00a9l9\u0092\u0010\u00c1\u00a5\u00a6\u0018\n5\u00b6\u00c1\u0006\u0019{G\u00ca\u0013R\u000fzi\u00d7s\u00ee\u00ddaI\u001ec\u0000\u00c2\u00cf\u00d8\u00d9\n\u00da\u00f6<\u000e\u00a6z\u00a2\u00ee\u00ffR\u000f\u00d7\u00f6f\u0084\u00dc'#\u0012R,\u008d\u000bz\u00e5k\u000e\u0090\u001f\u008a\u00bdE\u0004\u0014r\u00b0\u0004\u00de \u007fK\n\u0010*\u00d8\u0091\u00d9\u00ad[0\u0094\t\n\u0098\"\u00cd\u0094\u007f)\u008b\u0080\u008a\u001b\u000bO\u00b2\u008e\u0086\u00f0k~\u00c2\u00b6\u0018C\t\u00f2\u007fV\u00f4\u00d9\t\u00bc\u00bb?\nDY\u00eb\u00ffX`k\u0089\u0092>\u000e\u00c9V\u00a1\u0094 !\u00b8\u00d6%\u0090~\u00b6;\u001d\nO~3\u001b\u00a4\u00fc\u00e6\u001esH\u000fj\u008d\u00d5\u00ef\u00aeNi;\u001f-=\u000b\u00d1\u00e1\u00fd\n>C\u00a4\u00bc\u00b1\bD\u0080'\u009b\n|\u00ecQM\u00ec\u0012\u00eb\u00e3\u00d6\u00f3";
        var4_7 = "\u001av\u00df\u0094\u00eb%\u00c5R\u008e$\u001d\u0004\u0003\u00cb\u000b\u0002=#sA\u00f1L\u00b1\u00f4r\u000f\t\u00a9l9\u0092\u0010\u00c1\u00a5\u00a6\u0018\n5\u00b6\u00c1\u0006\u0019{G\u00ca\u0013R\u000fzi\u00d7s\u00ee\u00ddaI\u001ec\u0000\u00c2\u00cf\u00d8\u00d9\n\u00da\u00f6<\u000e\u00a6z\u00a2\u00ee\u00ffR\u000f\u00d7\u00f6f\u0084\u00dc'#\u0012R,\u008d\u000bz\u00e5k\u000e\u0090\u001f\u008a\u00bdE\u0004\u0014r\u00b0\u0004\u00de \u007fK\n\u0010*\u00d8\u0091\u00d9\u00ad[0\u0094\t\n\u0098\"\u00cd\u0094\u007f)\u008b\u0080\u008a\u001b\u000bO\u00b2\u008e\u0086\u00f0k~\u00c2\u00b6\u0018C\t\u00f2\u007fV\u00f4\u00d9\t\u00bc\u00bb?\nDY\u00eb\u00ffX`k\u0089\u0092>\u000e\u00c9V\u00a1\u0094 !\u00b8\u00d6%\u0090~\u00b6;\u001d\nO~3\u001b\u00a4\u00fc\u00e6\u001esH\u000fj\u008d\u00d5\u00ef\u00aeNi;\u001f-=\u000b\u00d1\u00e1\u00fd\n>C\u00a4\u00bc\u00b1\bD\u0080'\u009b\n|\u00ecQM\u00ec\u0012\u00eb\u00e3\u00d6\u00f3".length();
        var1_8 = 14;
        var0_9 = -1;
        block0: while (true) {
            block7: {
                v1 = ++var0_9;
                v2 = var2_6.substring(v1, v1 + var1_8).toCharArray();
                v3 = v2.length;
                var7_10 = 0;
                v4 = 79;
                v5 = v2;
                v6 = v3;
                if (v3 > 1) ** GOTO lbl59
                break block7;
                while (true) {
                    var2_6 = "C\u00a8\u00d6m\u00e88\u0087\u00d3\u00e46dj\u00dc\u00ebz\u000e\u00e9\u00c5\u0083\u00c0B\u008d\u00d2eN\u00e05\u00bat\u00ba";
                    var4_7 = "C\u00a8\u00d6m\u00e88\u0087\u00d3\u00e46dj\u00dc\u00ebz\u000e\u00e9\u00c5\u0083\u00c0B\u008d\u00d2eN\u00e05\u00bat\u00ba".length();
                    var1_8 = 15;
                    var0_9 = -1;
lbl33:
                    // 2 sources

                    while (true) {
                        v7 = ++var0_9;
                        v8 = var2_6.substring(v7, v7 + var1_8).toCharArray();
                        v9 = v8.length;
                        var7_10 = 0;
                        v10 = 4;
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
                v5[v13] = (char)(v5[v13] ^ (v4 ^ 121));
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
            v11[v15] = (char)(v11[v15] ^ (v10 ^ 121));
            ++var7_10;
            v10 = v10;
lbl79:
            // 2 sources

            v16 = v11;
            v12 = v12;
        } while (v12 > var7_10);
        var5_4[var3_5++] = new String(v16).intern();
        if ((var0_9 += var1_8) >= var4_7) {
            a97.v = var5_4;
            a97.w = new String[20];
            a97.b(var10_1, var11_2, (byte)var12_3);
            return;
        }
        var1_8 = var2_6.charAt(var0_9);
        ** while (true)
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.Si
 */
public class si_0 {
    private static String[] e;
    private static String[] d;
    public static String a = "STDERR";
    public static String b = "STDOUT";
    private static long c;

    private static String a(int n, int n2, int n3) {
        int n4 = (n ^ n3 ^ 0xFFFFF437) & 0xFFFF;
        if (e[n4] == null) {
            int n5;
            char[] cArray = d[n4].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n5 = 99;
                    break;
                }
                case 1: {
                    n5 = 236;
                    break;
                }
                case 2: {
                    n5 = 14;
                    break;
                }
                case 3: {
                    n5 = 116;
                    break;
                }
                case 4: {
                    n5 = 32;
                    break;
                }
                case 5: {
                    n5 = 68;
                    break;
                }
                case 6: {
                    n5 = 223;
                    break;
                }
                case 7: {
                    n5 = 58;
                    break;
                }
                case 8: {
                    n5 = 225;
                    break;
                }
                case 9: {
                    n5 = 112;
                    break;
                }
                case 10: {
                    n5 = 82;
                    break;
                }
                case 11: {
                    n5 = 3;
                    break;
                }
                case 12: {
                    n5 = 50;
                    break;
                }
                case 13: {
                    n5 = 46;
                    break;
                }
                case 14: {
                    n5 = 1;
                    break;
                }
                case 15: {
                    n5 = 12;
                    break;
                }
                case 16: {
                    n5 = 71;
                    break;
                }
                case 17: {
                    n5 = 79;
                    break;
                }
                case 18: {
                    n5 = 243;
                    break;
                }
                case 19: {
                    n5 = 110;
                    break;
                }
                case 20: {
                    n5 = 51;
                    break;
                }
                case 21: {
                    n5 = 182;
                    break;
                }
                case 22: {
                    n5 = 61;
                    break;
                }
                case 23: {
                    n5 = 21;
                    break;
                }
                case 24: {
                    n5 = 208;
                    break;
                }
                case 25: {
                    n5 = 72;
                    break;
                }
                case 26: {
                    n5 = 4;
                    break;
                }
                case 27: {
                    n5 = 53;
                    break;
                }
                case 28: {
                    n5 = 47;
                    break;
                }
                case 29: {
                    n5 = 90;
                    break;
                }
                case 30: {
                    n5 = 59;
                    break;
                }
                case 31: {
                    n5 = 92;
                    break;
                }
                case 32: {
                    n5 = 43;
                    break;
                }
                case 33: {
                    n5 = 109;
                    break;
                }
                case 34: {
                    n5 = 172;
                    break;
                }
                case 35: {
                    n5 = 220;
                    break;
                }
                case 36: {
                    n5 = 176;
                    break;
                }
                case 37: {
                    n5 = 122;
                    break;
                }
                case 38: {
                    n5 = 242;
                    break;
                }
                case 39: {
                    n5 = 245;
                    break;
                }
                case 40: {
                    n5 = 36;
                    break;
                }
                case 41: {
                    n5 = 136;
                    break;
                }
                case 42: {
                    n5 = 204;
                    break;
                }
                case 43: {
                    n5 = 123;
                    break;
                }
                case 44: {
                    n5 = 218;
                    break;
                }
                case 45: {
                    n5 = 179;
                    break;
                }
                case 46: {
                    n5 = 42;
                    break;
                }
                case 47: {
                    n5 = 187;
                    break;
                }
                case 48: {
                    n5 = 6;
                    break;
                }
                case 49: {
                    n5 = 199;
                    break;
                }
                case 50: {
                    n5 = 62;
                    break;
                }
                case 51: {
                    n5 = 153;
                    break;
                }
                case 52: {
                    n5 = 63;
                    break;
                }
                case 53: {
                    n5 = 86;
                    break;
                }
                case 54: {
                    n5 = 10;
                    break;
                }
                case 55: {
                    n5 = 240;
                    break;
                }
                case 56: {
                    n5 = 244;
                    break;
                }
                case 57: {
                    n5 = 0;
                    break;
                }
                case 58: {
                    n5 = 19;
                    break;
                }
                case 59: {
                    n5 = 23;
                    break;
                }
                case 60: {
                    n5 = 140;
                    break;
                }
                case 61: {
                    n5 = 102;
                    break;
                }
                case 62: {
                    n5 = 255;
                    break;
                }
                case 63: {
                    n5 = 205;
                    break;
                }
                case 64: {
                    n5 = 157;
                    break;
                }
                case 65: {
                    n5 = 192;
                    break;
                }
                case 66: {
                    n5 = 35;
                    break;
                }
                case 67: {
                    n5 = 9;
                    break;
                }
                case 68: {
                    n5 = 143;
                    break;
                }
                case 69: {
                    n5 = 137;
                    break;
                }
                case 70: {
                    n5 = 252;
                    break;
                }
                case 71: {
                    n5 = 173;
                    break;
                }
                case 72: {
                    n5 = 40;
                    break;
                }
                case 73: {
                    n5 = 168;
                    break;
                }
                case 74: {
                    n5 = 81;
                    break;
                }
                case 75: {
                    n5 = 200;
                    break;
                }
                case 76: {
                    n5 = 83;
                    break;
                }
                case 77: {
                    n5 = 155;
                    break;
                }
                case 78: {
                    n5 = 152;
                    break;
                }
                case 79: {
                    n5 = 124;
                    break;
                }
                case 80: {
                    n5 = 184;
                    break;
                }
                case 81: {
                    n5 = 171;
                    break;
                }
                case 82: {
                    n5 = 120;
                    break;
                }
                case 83: {
                    n5 = 250;
                    break;
                }
                case 84: {
                    n5 = 197;
                    break;
                }
                case 85: {
                    n5 = 132;
                    break;
                }
                case 86: {
                    n5 = 66;
                    break;
                }
                case 87: {
                    n5 = 26;
                    break;
                }
                case 88: {
                    n5 = 115;
                    break;
                }
                case 89: {
                    n5 = 127;
                    break;
                }
                case 90: {
                    n5 = 24;
                    break;
                }
                case 91: {
                    n5 = 174;
                    break;
                }
                case 92: {
                    n5 = 202;
                    break;
                }
                case 93: {
                    n5 = 106;
                    break;
                }
                case 94: {
                    n5 = 251;
                    break;
                }
                case 95: {
                    n5 = 18;
                    break;
                }
                case 96: {
                    n5 = 221;
                    break;
                }
                case 97: {
                    n5 = 125;
                    break;
                }
                case 98: {
                    n5 = 37;
                    break;
                }
                case 99: {
                    n5 = 49;
                    break;
                }
                case 100: {
                    n5 = 33;
                    break;
                }
                case 101: {
                    n5 = 121;
                    break;
                }
                case 102: {
                    n5 = 166;
                    break;
                }
                case 103: {
                    n5 = 73;
                    break;
                }
                case 104: {
                    n5 = 7;
                    break;
                }
                case 105: {
                    n5 = 95;
                    break;
                }
                case 106: {
                    n5 = 160;
                    break;
                }
                case 107: {
                    n5 = 65;
                    break;
                }
                case 108: {
                    n5 = 41;
                    break;
                }
                case 109: {
                    n5 = 135;
                    break;
                }
                case 110: {
                    n5 = 207;
                    break;
                }
                case 111: {
                    n5 = 11;
                    break;
                }
                case 112: {
                    n5 = 254;
                    break;
                }
                case 113: {
                    n5 = 74;
                    break;
                }
                case 114: {
                    n5 = 144;
                    break;
                }
                case 115: {
                    n5 = 77;
                    break;
                }
                case 116: {
                    n5 = 163;
                    break;
                }
                case 117: {
                    n5 = 217;
                    break;
                }
                case 118: {
                    n5 = 20;
                    break;
                }
                case 119: {
                    n5 = 214;
                    break;
                }
                case 120: {
                    n5 = 198;
                    break;
                }
                case 121: {
                    n5 = 249;
                    break;
                }
                case 122: {
                    n5 = 27;
                    break;
                }
                case 123: {
                    n5 = 210;
                    break;
                }
                case 124: {
                    n5 = 183;
                    break;
                }
                case 125: {
                    n5 = 148;
                    break;
                }
                case 126: {
                    n5 = 248;
                    break;
                }
                case 127: {
                    n5 = 104;
                    break;
                }
                case 128: {
                    n5 = 188;
                    break;
                }
                case 129: {
                    n5 = 107;
                    break;
                }
                case 130: {
                    n5 = 177;
                    break;
                }
                case 131: {
                    n5 = 57;
                    break;
                }
                case 132: {
                    n5 = 48;
                    break;
                }
                case 133: {
                    n5 = 158;
                    break;
                }
                case 134: {
                    n5 = 39;
                    break;
                }
                case 135: {
                    n5 = 228;
                    break;
                }
                case 136: {
                    n5 = 131;
                    break;
                }
                case 137: {
                    n5 = 15;
                    break;
                }
                case 138: {
                    n5 = 94;
                    break;
                }
                case 139: {
                    n5 = 145;
                    break;
                }
                case 140: {
                    n5 = 201;
                    break;
                }
                case 141: {
                    n5 = 227;
                    break;
                }
                case 142: {
                    n5 = 239;
                    break;
                }
                case 143: {
                    n5 = 235;
                    break;
                }
                case 144: {
                    n5 = 113;
                    break;
                }
                case 145: {
                    n5 = 80;
                    break;
                }
                case 146: {
                    n5 = 234;
                    break;
                }
                case 147: {
                    n5 = 38;
                    break;
                }
                case 148: {
                    n5 = 44;
                    break;
                }
                case 149: {
                    n5 = 241;
                    break;
                }
                case 150: {
                    n5 = 151;
                    break;
                }
                case 151: {
                    n5 = 161;
                    break;
                }
                case 152: {
                    n5 = 159;
                    break;
                }
                case 153: {
                    n5 = 238;
                    break;
                }
                case 154: {
                    n5 = 178;
                    break;
                }
                case 155: {
                    n5 = 167;
                    break;
                }
                case 156: {
                    n5 = 186;
                    break;
                }
                case 157: {
                    n5 = 91;
                    break;
                }
                case 158: {
                    n5 = 233;
                    break;
                }
                case 159: {
                    n5 = 31;
                    break;
                }
                case 160: {
                    n5 = 117;
                    break;
                }
                case 161: {
                    n5 = 13;
                    break;
                }
                case 162: {
                    n5 = 231;
                    break;
                }
                case 163: {
                    n5 = 105;
                    break;
                }
                case 164: {
                    n5 = 232;
                    break;
                }
                case 165: {
                    n5 = 203;
                    break;
                }
                case 166: {
                    n5 = 206;
                    break;
                }
                case 167: {
                    n5 = 165;
                    break;
                }
                case 168: {
                    n5 = 29;
                    break;
                }
                case 169: {
                    n5 = 119;
                    break;
                }
                case 170: {
                    n5 = 146;
                    break;
                }
                case 171: {
                    n5 = 156;
                    break;
                }
                case 172: {
                    n5 = 180;
                    break;
                }
                case 173: {
                    n5 = 195;
                    break;
                }
                case 174: {
                    n5 = 97;
                    break;
                }
                case 175: {
                    n5 = 96;
                    break;
                }
                case 176: {
                    n5 = 103;
                    break;
                }
                case 177: {
                    n5 = 133;
                    break;
                }
                case 178: {
                    n5 = 253;
                    break;
                }
                case 179: {
                    n5 = 229;
                    break;
                }
                case 180: {
                    n5 = 154;
                    break;
                }
                case 181: {
                    n5 = 134;
                    break;
                }
                case 182: {
                    n5 = 215;
                    break;
                }
                case 183: {
                    n5 = 16;
                    break;
                }
                case 184: {
                    n5 = 88;
                    break;
                }
                case 185: {
                    n5 = 69;
                    break;
                }
                case 186: {
                    n5 = 34;
                    break;
                }
                case 187: {
                    n5 = 78;
                    break;
                }
                case 188: {
                    n5 = 189;
                    break;
                }
                case 189: {
                    n5 = 100;
                    break;
                }
                case 190: {
                    n5 = 193;
                    break;
                }
                case 191: {
                    n5 = 87;
                    break;
                }
                case 192: {
                    n5 = 191;
                    break;
                }
                case 193: {
                    n5 = 196;
                    break;
                }
                case 194: {
                    n5 = 55;
                    break;
                }
                case 195: {
                    n5 = 64;
                    break;
                }
                case 196: {
                    n5 = 2;
                    break;
                }
                case 197: {
                    n5 = 111;
                    break;
                }
                case 198: {
                    n5 = 246;
                    break;
                }
                case 199: {
                    n5 = 190;
                    break;
                }
                case 200: {
                    n5 = 93;
                    break;
                }
                case 201: {
                    n5 = 247;
                    break;
                }
                case 202: {
                    n5 = 170;
                    break;
                }
                case 203: {
                    n5 = 138;
                    break;
                }
                case 204: {
                    n5 = 128;
                    break;
                }
                case 205: {
                    n5 = 70;
                    break;
                }
                case 206: {
                    n5 = 209;
                    break;
                }
                case 207: {
                    n5 = 5;
                    break;
                }
                case 208: {
                    n5 = 175;
                    break;
                }
                case 209: {
                    n5 = 213;
                    break;
                }
                case 210: {
                    n5 = 89;
                    break;
                }
                case 211: {
                    n5 = 149;
                    break;
                }
                case 212: {
                    n5 = 17;
                    break;
                }
                case 213: {
                    n5 = 60;
                    break;
                }
                case 214: {
                    n5 = 84;
                    break;
                }
                case 215: {
                    n5 = 118;
                    break;
                }
                case 216: {
                    n5 = 25;
                    break;
                }
                case 217: {
                    n5 = 76;
                    break;
                }
                case 218: {
                    n5 = 169;
                    break;
                }
                case 219: {
                    n5 = 216;
                    break;
                }
                case 220: {
                    n5 = 56;
                    break;
                }
                case 221: {
                    n5 = 52;
                    break;
                }
                case 222: {
                    n5 = 130;
                    break;
                }
                case 223: {
                    n5 = 162;
                    break;
                }
                case 224: {
                    n5 = 108;
                    break;
                }
                case 225: {
                    n5 = 222;
                    break;
                }
                case 226: {
                    n5 = 185;
                    break;
                }
                case 227: {
                    n5 = 101;
                    break;
                }
                case 228: {
                    n5 = 75;
                    break;
                }
                case 229: {
                    n5 = 28;
                    break;
                }
                case 230: {
                    n5 = 226;
                    break;
                }
                case 231: {
                    n5 = 141;
                    break;
                }
                case 232: {
                    n5 = 219;
                    break;
                }
                case 233: {
                    n5 = 98;
                    break;
                }
                case 234: {
                    n5 = 114;
                    break;
                }
                case 235: {
                    n5 = 237;
                    break;
                }
                case 236: {
                    n5 = 194;
                    break;
                }
                case 237: {
                    n5 = 147;
                    break;
                }
                case 238: {
                    n5 = 211;
                    break;
                }
                case 239: {
                    n5 = 139;
                    break;
                }
                case 240: {
                    n5 = 150;
                    break;
                }
                case 241: {
                    n5 = 8;
                    break;
                }
                case 242: {
                    n5 = 164;
                    break;
                }
                case 243: {
                    n5 = 212;
                    break;
                }
                case 244: {
                    n5 = 45;
                    break;
                }
                case 245: {
                    n5 = 230;
                    break;
                }
                case 246: {
                    n5 = 181;
                    break;
                }
                case 247: {
                    n5 = 129;
                    break;
                }
                case 248: {
                    n5 = 224;
                    break;
                }
                case 249: {
                    n5 = 22;
                    break;
                }
                case 250: {
                    n5 = 126;
                    break;
                }
                case 251: {
                    n5 = 85;
                    break;
                }
                case 252: {
                    n5 = 30;
                    break;
                }
                case 253: {
                    n5 = 54;
                    break;
                }
                case 254: {
                    n5 = 67;
                    break;
                }
                default: {
                    n5 = 142;
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
            si_0.e[n4] = new String(cArray).intern();
        }
        return e[n4];
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        c = a1c.a(-7753371261201703302L, 7612102484587268762L, null).a(143438497008630L);
        long l4 = c ^ 0x227C48B76975L;
        long l5 = l4 ^ 0x33EB8332D055L;
        int n = (int)(l5 >>> 48);
        int n2 = (int)(l5 << 16 >>> 48);
        int n3 = (int)(l5 << 32 >>> 32);
        String[] stringArray = new String[2];
        int n4 = 0;
        String string = "\u00e6@\u00c1\u00e3\u00eb\u00e9\u0006\u0004\u00a7\u009d\u0015gz";
        int n5 = "\u00e6@\u00c1\u00e3\u00eb\u00e9\u0006\u0004\u00a7\u009d\u0015gz".length();
        int n6 = 6;
        int n7 = -1;
        while (true) {
            char[] cArray;
            block5: {
                int n8;
                char[] cArray2;
                int n9;
                int n10;
                block4: {
                    int n11 = ++n7;
                    char[] cArray3 = string.substring(n11, n11 + n6).toCharArray();
                    int n12 = cArray3.length;
                    n10 = 0;
                    n9 = 81;
                    cArray2 = cArray3;
                    n8 = n12;
                    if (n12 <= 1) break block4;
                    cArray = cArray2;
                    n8 = n8;
                    if (n8 <= n10) break block5;
                }
                do {
                    cArray2 = cArray2;
                    int n13 = n10;
                    int cfr_ignored_0 = n10 % 7;
                    cArray2[n13] = (char)(cArray2[n13] ^ (n9 ^ 0x43));
                    ++n10;
                    n9 = n9;
                    cArray = cArray2;
                    n8 = n8;
                } while (n8 > n10);
            }
            stringArray[n4++] = new String(cArray).intern();
            if ((n7 += n6) >= n5) {
                d = stringArray;
                e = new String[2];
                si_0.b((short)n, (char)n2, n3);
                return;
            }
            n6 = string.charAt(n7);
        }
    }

    public static void b(short s, char c, int n) {
        long l4 = ((long)s << 48 | (long)c << 48 >>> 16 | (long)n << 32 >>> 32) ^ si_0.c;
        b = si_0.a(880397190 + (char)-32367, 880426484, (int)l4);
        a = si_0.a(880397190 + (char)-32368, 880397190 + (char)-30436, (int)l4);
    }
}


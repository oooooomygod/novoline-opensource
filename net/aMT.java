/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aMT {
    private static long D = a1c.a(-7255604159919958510L, 9044417468031174237L, null).a(167494819571290L);
    public static String m = "fire_protection";
    public static String z = "aqua_affinity";
    public static String l = "projectile_protection";
    public static String k = "flame";
    public static String w = "Duplicate enchantment id!";
    public static String o = "unbreaking";
    public static String r = "infinity";
    public static String d = "lure";
    private static String[] E;
    public static String f = "enchantment.level.";
    public static String y = "blast_protection";
    public static String b = "depth_strider";
    public static String A = "fire_aspect";
    public static String g = "fortune";
    public static String h = "enchantment.";
    public static String a = "protection";
    public static String c = "bane_of_arthropods";
    public static String t = "sharpness";
    public static String B = "feather_falling";
    public static String p = "respiration";
    public static String u = "punch";
    public static String v = "thorns";
    public static String e = "efficiency";
    public static String i = "luck_of_the_sea";
    public static String x = "silk_touch";
    public static String q = " ";
    public static String s = "looting";
    public static String n = "power";
    public static String j = "smite";
    private static String[] F;
    public static String C = "knockback";

    public static void b(short s, int n, int n2) {
        long l4 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ D;
        c = aMT.a(2139968340, -2139949769, (int)l4);
        t = aMT.a(2139968350, -2139947449, (int)l4);
        l = aMT.a(2139968321, 2139973088, (int)l4);
        A = aMT.a(2139968338, -2139958125, (int)l4);
        a = aMT.a(2139968339, -2139962042, (int)l4);
        u = aMT.a(2139968348, 2139976006, (int)l4);
        q = " ";
        aMT.n = aMT.a(2139968331, -2139968444, (int)l4);
        o = aMT.a(2139968325, -2139972903, (int)l4);
        d = aMT.a(2139968347, -2139958155, (int)l4);
        p = aMT.a(2139968346, 2139970341, (int)l4);
        C = aMT.a(2139968342, 2139971489, (int)l4);
        r = aMT.a(2139968323, 2139966025, (int)l4);
        y = aMT.a(2139968322, -2139971115, (int)l4);
        z = aMT.a(2139968320, -2139967758, (int)l4);
        v = aMT.a(2139968336, -2139951939, (int)l4);
        j = aMT.a(2139968326, 2139976958, (int)l4);
        m = aMT.a(2139968341, -2139971880, (int)l4);
        k = aMT.a(2139968345, 2139961356, (int)l4);
        w = aMT.a(2139968343, -2139973633, (int)l4);
        b = aMT.a(2139968351, -2139961004, (int)l4);
        g = aMT.a(2139968344, 2139954362, (int)l4);
        B = aMT.a(2139968328, -2139971381, (int)l4);
        e = aMT.a(2139968337, -2139972058, (int)l4);
        aMT.s = aMT.a(2139968349, -2139954282, (int)l4);
        f = aMT.a(2139968324, 2139961457, (int)l4);
        h = aMT.a(2139968327, 2139971874, (int)l4);
        x = aMT.a(2139968330, 2139949727, (int)l4);
        i = aMT.a(2139968329, 2139949204, (int)l4);
    }

    private static String a(int n, int n2, int n3) {
        int n4 = (n ^ n3 ^ 0xFFFF8CE4) & 0xFFFF;
        if (F[n4] == null) {
            int n5;
            char[] cArray = E[n4].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n5 = 154;
                    break;
                }
                case 1: {
                    n5 = 17;
                    break;
                }
                case 2: {
                    n5 = 155;
                    break;
                }
                case 3: {
                    n5 = 16;
                    break;
                }
                case 4: {
                    n5 = 9;
                    break;
                }
                case 5: {
                    n5 = 152;
                    break;
                }
                case 6: {
                    n5 = 211;
                    break;
                }
                case 7: {
                    n5 = 30;
                    break;
                }
                case 8: {
                    n5 = 38;
                    break;
                }
                case 9: {
                    n5 = 76;
                    break;
                }
                case 10: {
                    n5 = 120;
                    break;
                }
                case 11: {
                    n5 = 8;
                    break;
                }
                case 12: {
                    n5 = 46;
                    break;
                }
                case 13: {
                    n5 = 200;
                    break;
                }
                case 14: {
                    n5 = 131;
                    break;
                }
                case 15: {
                    n5 = 65;
                    break;
                }
                case 16: {
                    n5 = 85;
                    break;
                }
                case 17: {
                    n5 = 37;
                    break;
                }
                case 18: {
                    n5 = 244;
                    break;
                }
                case 19: {
                    n5 = 195;
                    break;
                }
                case 20: {
                    n5 = 119;
                    break;
                }
                case 21: {
                    n5 = 36;
                    break;
                }
                case 22: {
                    n5 = 129;
                    break;
                }
                case 23: {
                    n5 = 180;
                    break;
                }
                case 24: {
                    n5 = 20;
                    break;
                }
                case 25: {
                    n5 = 141;
                    break;
                }
                case 26: {
                    n5 = 146;
                    break;
                }
                case 27: {
                    n5 = 187;
                    break;
                }
                case 28: {
                    n5 = 3;
                    break;
                }
                case 29: {
                    n5 = 29;
                    break;
                }
                case 30: {
                    n5 = 118;
                    break;
                }
                case 31: {
                    n5 = 52;
                    break;
                }
                case 32: {
                    n5 = 75;
                    break;
                }
                case 33: {
                    n5 = 221;
                    break;
                }
                case 34: {
                    n5 = 217;
                    break;
                }
                case 35: {
                    n5 = 199;
                    break;
                }
                case 36: {
                    n5 = 47;
                    break;
                }
                case 37: {
                    n5 = 12;
                    break;
                }
                case 38: {
                    n5 = 107;
                    break;
                }
                case 39: {
                    n5 = 209;
                    break;
                }
                case 40: {
                    n5 = 67;
                    break;
                }
                case 41: {
                    n5 = 89;
                    break;
                }
                case 42: {
                    n5 = 28;
                    break;
                }
                case 43: {
                    n5 = 182;
                    break;
                }
                case 44: {
                    n5 = 42;
                    break;
                }
                case 45: {
                    n5 = 252;
                    break;
                }
                case 46: {
                    n5 = 156;
                    break;
                }
                case 47: {
                    n5 = 194;
                    break;
                }
                case 48: {
                    n5 = 245;
                    break;
                }
                case 49: {
                    n5 = 229;
                    break;
                }
                case 50: {
                    n5 = 254;
                    break;
                }
                case 51: {
                    n5 = 27;
                    break;
                }
                case 52: {
                    n5 = 78;
                    break;
                }
                case 53: {
                    n5 = 132;
                    break;
                }
                case 54: {
                    n5 = 246;
                    break;
                }
                case 55: {
                    n5 = 173;
                    break;
                }
                case 56: {
                    n5 = 79;
                    break;
                }
                case 57: {
                    n5 = 228;
                    break;
                }
                case 58: {
                    n5 = 94;
                    break;
                }
                case 59: {
                    n5 = 239;
                    break;
                }
                case 60: {
                    n5 = 183;
                    break;
                }
                case 61: {
                    n5 = 130;
                    break;
                }
                case 62: {
                    n5 = 168;
                    break;
                }
                case 63: {
                    n5 = 121;
                    break;
                }
                case 64: {
                    n5 = 83;
                    break;
                }
                case 65: {
                    n5 = 104;
                    break;
                }
                case 66: {
                    n5 = 54;
                    break;
                }
                case 67: {
                    n5 = 64;
                    break;
                }
                case 68: {
                    n5 = 31;
                    break;
                }
                case 69: {
                    n5 = 14;
                    break;
                }
                case 70: {
                    n5 = 234;
                    break;
                }
                case 71: {
                    n5 = 56;
                    break;
                }
                case 72: {
                    n5 = 169;
                    break;
                }
                case 73: {
                    n5 = 248;
                    break;
                }
                case 74: {
                    n5 = 153;
                    break;
                }
                case 75: {
                    n5 = 247;
                    break;
                }
                case 76: {
                    n5 = 105;
                    break;
                }
                case 77: {
                    n5 = 237;
                    break;
                }
                case 78: {
                    n5 = 193;
                    break;
                }
                case 79: {
                    n5 = 145;
                    break;
                }
                case 80: {
                    n5 = 72;
                    break;
                }
                case 81: {
                    n5 = 147;
                    break;
                }
                case 82: {
                    n5 = 215;
                    break;
                }
                case 83: {
                    n5 = 19;
                    break;
                }
                case 84: {
                    n5 = 185;
                    break;
                }
                case 85: {
                    n5 = 35;
                    break;
                }
                case 86: {
                    n5 = 233;
                    break;
                }
                case 87: {
                    n5 = 34;
                    break;
                }
                case 88: {
                    n5 = 62;
                    break;
                }
                case 89: {
                    n5 = 71;
                    break;
                }
                case 90: {
                    n5 = 203;
                    break;
                }
                case 91: {
                    n5 = 49;
                    break;
                }
                case 92: {
                    n5 = 70;
                    break;
                }
                case 93: {
                    n5 = 139;
                    break;
                }
                case 94: {
                    n5 = 151;
                    break;
                }
                case 95: {
                    n5 = 163;
                    break;
                }
                case 96: {
                    n5 = 1;
                    break;
                }
                case 97: {
                    n5 = 100;
                    break;
                }
                case 98: {
                    n5 = 2;
                    break;
                }
                case 99: {
                    n5 = 86;
                    break;
                }
                case 100: {
                    n5 = 48;
                    break;
                }
                case 101: {
                    n5 = 122;
                    break;
                }
                case 102: {
                    n5 = 127;
                    break;
                }
                case 103: {
                    n5 = 231;
                    break;
                }
                case 104: {
                    n5 = 236;
                    break;
                }
                case 105: {
                    n5 = 128;
                    break;
                }
                case 106: {
                    n5 = 108;
                    break;
                }
                case 107: {
                    n5 = 25;
                    break;
                }
                case 108: {
                    n5 = 73;
                    break;
                }
                case 109: {
                    n5 = 208;
                    break;
                }
                case 110: {
                    n5 = 196;
                    break;
                }
                case 111: {
                    n5 = 50;
                    break;
                }
                case 112: {
                    n5 = 206;
                    break;
                }
                case 113: {
                    n5 = 219;
                    break;
                }
                case 114: {
                    n5 = 213;
                    break;
                }
                case 115: {
                    n5 = 0;
                    break;
                }
                case 116: {
                    n5 = 45;
                    break;
                }
                case 117: {
                    n5 = 135;
                    break;
                }
                case 118: {
                    n5 = 53;
                    break;
                }
                case 119: {
                    n5 = 249;
                    break;
                }
                case 120: {
                    n5 = 112;
                    break;
                }
                case 121: {
                    n5 = 99;
                    break;
                }
                case 122: {
                    n5 = 32;
                    break;
                }
                case 123: {
                    n5 = 190;
                    break;
                }
                case 124: {
                    n5 = 124;
                    break;
                }
                case 125: {
                    n5 = 235;
                    break;
                }
                case 126: {
                    n5 = 97;
                    break;
                }
                case 127: {
                    n5 = 243;
                    break;
                }
                case 128: {
                    n5 = 253;
                    break;
                }
                case 129: {
                    n5 = 69;
                    break;
                }
                case 130: {
                    n5 = 58;
                    break;
                }
                case 131: {
                    n5 = 84;
                    break;
                }
                case 132: {
                    n5 = 125;
                    break;
                }
                case 133: {
                    n5 = 197;
                    break;
                }
                case 134: {
                    n5 = 22;
                    break;
                }
                case 135: {
                    n5 = 159;
                    break;
                }
                case 136: {
                    n5 = 174;
                    break;
                }
                case 137: {
                    n5 = 115;
                    break;
                }
                case 138: {
                    n5 = 81;
                    break;
                }
                case 139: {
                    n5 = 136;
                    break;
                }
                case 140: {
                    n5 = 250;
                    break;
                }
                case 141: {
                    n5 = 109;
                    break;
                }
                case 142: {
                    n5 = 24;
                    break;
                }
                case 143: {
                    n5 = 224;
                    break;
                }
                case 144: {
                    n5 = 158;
                    break;
                }
                case 145: {
                    n5 = 160;
                    break;
                }
                case 146: {
                    n5 = 238;
                    break;
                }
                case 147: {
                    n5 = 6;
                    break;
                }
                case 148: {
                    n5 = 91;
                    break;
                }
                case 149: {
                    n5 = 176;
                    break;
                }
                case 150: {
                    n5 = 126;
                    break;
                }
                case 151: {
                    n5 = 110;
                    break;
                }
                case 152: {
                    n5 = 165;
                    break;
                }
                case 153: {
                    n5 = 189;
                    break;
                }
                case 154: {
                    n5 = 114;
                    break;
                }
                case 155: {
                    n5 = 188;
                    break;
                }
                case 156: {
                    n5 = 4;
                    break;
                }
                case 157: {
                    n5 = 57;
                    break;
                }
                case 158: {
                    n5 = 142;
                    break;
                }
                case 159: {
                    n5 = 95;
                    break;
                }
                case 160: {
                    n5 = 40;
                    break;
                }
                case 161: {
                    n5 = 240;
                    break;
                }
                case 162: {
                    n5 = 98;
                    break;
                }
                case 163: {
                    n5 = 82;
                    break;
                }
                case 164: {
                    n5 = 59;
                    break;
                }
                case 165: {
                    n5 = 177;
                    break;
                }
                case 166: {
                    n5 = 157;
                    break;
                }
                case 167: {
                    n5 = 232;
                    break;
                }
                case 168: {
                    n5 = 143;
                    break;
                }
                case 169: {
                    n5 = 218;
                    break;
                }
                case 170: {
                    n5 = 77;
                    break;
                }
                case 171: {
                    n5 = 204;
                    break;
                }
                case 172: {
                    n5 = 43;
                    break;
                }
                case 173: {
                    n5 = 26;
                    break;
                }
                case 174: {
                    n5 = 21;
                    break;
                }
                case 175: {
                    n5 = 60;
                    break;
                }
                case 176: {
                    n5 = 138;
                    break;
                }
                case 177: {
                    n5 = 116;
                    break;
                }
                case 178: {
                    n5 = 255;
                    break;
                }
                case 179: {
                    n5 = 167;
                    break;
                }
                case 180: {
                    n5 = 171;
                    break;
                }
                case 181: {
                    n5 = 172;
                    break;
                }
                case 182: {
                    n5 = 11;
                    break;
                }
                case 183: {
                    n5 = 51;
                    break;
                }
                case 184: {
                    n5 = 230;
                    break;
                }
                case 185: {
                    n5 = 39;
                    break;
                }
                case 186: {
                    n5 = 18;
                    break;
                }
                case 187: {
                    n5 = 164;
                    break;
                }
                case 188: {
                    n5 = 5;
                    break;
                }
                case 189: {
                    n5 = 63;
                    break;
                }
                case 190: {
                    n5 = 90;
                    break;
                }
                case 191: {
                    n5 = 179;
                    break;
                }
                case 192: {
                    n5 = 23;
                    break;
                }
                case 193: {
                    n5 = 149;
                    break;
                }
                case 194: {
                    n5 = 148;
                    break;
                }
                case 195: {
                    n5 = 150;
                    break;
                }
                case 196: {
                    n5 = 225;
                    break;
                }
                case 197: {
                    n5 = 242;
                    break;
                }
                case 198: {
                    n5 = 210;
                    break;
                }
                case 199: {
                    n5 = 74;
                    break;
                }
                case 200: {
                    n5 = 44;
                    break;
                }
                case 201: {
                    n5 = 93;
                    break;
                }
                case 202: {
                    n5 = 251;
                    break;
                }
                case 203: {
                    n5 = 212;
                    break;
                }
                case 204: {
                    n5 = 117;
                    break;
                }
                case 205: {
                    n5 = 111;
                    break;
                }
                case 206: {
                    n5 = 186;
                    break;
                }
                case 207: {
                    n5 = 33;
                    break;
                }
                case 208: {
                    n5 = 92;
                    break;
                }
                case 209: {
                    n5 = 87;
                    break;
                }
                case 210: {
                    n5 = 220;
                    break;
                }
                case 211: {
                    n5 = 175;
                    break;
                }
                case 212: {
                    n5 = 96;
                    break;
                }
                case 213: {
                    n5 = 80;
                    break;
                }
                case 214: {
                    n5 = 10;
                    break;
                }
                case 215: {
                    n5 = 226;
                    break;
                }
                case 216: {
                    n5 = 68;
                    break;
                }
                case 217: {
                    n5 = 201;
                    break;
                }
                case 218: {
                    n5 = 41;
                    break;
                }
                case 219: {
                    n5 = 55;
                    break;
                }
                case 220: {
                    n5 = 198;
                    break;
                }
                case 221: {
                    n5 = 103;
                    break;
                }
                case 222: {
                    n5 = 15;
                    break;
                }
                case 223: {
                    n5 = 214;
                    break;
                }
                case 224: {
                    n5 = 223;
                    break;
                }
                case 225: {
                    n5 = 102;
                    break;
                }
                case 226: {
                    n5 = 241;
                    break;
                }
                case 227: {
                    n5 = 7;
                    break;
                }
                case 228: {
                    n5 = 222;
                    break;
                }
                case 229: {
                    n5 = 61;
                    break;
                }
                case 230: {
                    n5 = 170;
                    break;
                }
                case 231: {
                    n5 = 216;
                    break;
                }
                case 232: {
                    n5 = 13;
                    break;
                }
                case 233: {
                    n5 = 162;
                    break;
                }
                case 234: {
                    n5 = 178;
                    break;
                }
                case 235: {
                    n5 = 202;
                    break;
                }
                case 236: {
                    n5 = 192;
                    break;
                }
                case 237: {
                    n5 = 181;
                    break;
                }
                case 238: {
                    n5 = 191;
                    break;
                }
                case 239: {
                    n5 = 161;
                    break;
                }
                case 240: {
                    n5 = 227;
                    break;
                }
                case 241: {
                    n5 = 137;
                    break;
                }
                case 242: {
                    n5 = 113;
                    break;
                }
                case 243: {
                    n5 = 207;
                    break;
                }
                case 244: {
                    n5 = 123;
                    break;
                }
                case 245: {
                    n5 = 101;
                    break;
                }
                case 246: {
                    n5 = 88;
                    break;
                }
                case 247: {
                    n5 = 205;
                    break;
                }
                case 248: {
                    n5 = 66;
                    break;
                }
                case 249: {
                    n5 = 133;
                    break;
                }
                case 250: {
                    n5 = 106;
                    break;
                }
                case 251: {
                    n5 = 184;
                    break;
                }
                case 252: {
                    n5 = 134;
                    break;
                }
                case 253: {
                    n5 = 166;
                    break;
                }
                case 254: {
                    n5 = 144;
                    break;
                }
                default: {
                    n5 = 140;
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
            aMT.F[n4] = new String(cArray).intern();
        }
        return F[n4];
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var8 = aMT.D ^ 55045708194987L;
        v0 = var8 ^ 85507758422813L;
        var10_1 = (int)(v0 >>> 48);
        var11_2 = (int)(v0 << 16 >>> 32);
        var12_3 = (int)(v0 << 48 >>> 48);
        var5_4 = new String[28];
        var3_5 = 0;
        var2_6 = "\u00c4Bs\u00a1\u00d8\u00bb\b\u009c\u00ca\u00bd,\n\u00a70\u00d6\u0086\u00e8nt}\u00a8\u00b6\u0006\u009f\u00c4UG\u0093\u0080\n\u001b\u00c4\u00ff\u0093\u00e3x\u00c2\u00f3A\u0097\t\u00eb\u001e'\u00cb\u00d83\u00a8\u00fd\u0080\u0019?\u001eh\u00bc\u00cf2\b\u00eb\u009a\u00947\rk\u00be\u00d5o\u00b0\u00eb\\\u00f4\u00e2\u00cb|\n\"\u0012^\u0085\u00b8P>\u008b\u00c1z@\u00ba\u00f9\u00d6\u0090\u0004\u0088\u00de8\u00e2\u000f`-\u00e7LJ\u0017[%\u0090pCf)\u008d\u00d9\u000b]4\u00d7\u00f7[\u00d5\u009a$\u00c4\"z\u0004\u00b4\n67\u0007D\u00ebcC\u00f0\u00dbt\u0005tnv\u00893\t\u0082\u00c6\u001f\u0007\u000b\u0095\u00ae\u00b4\u00dc\rKy\u00c2Z\u009b\u00c9\u00b1/\u00eaE\u00cd\\\u0004\u0005\u00a7\u008b\u00d7\u0001\u00e4\u0007P\u0018\u00b7=\u00c8\u0014\u00ee\u0010\u00ac(\u00e9_\u00d1\u008ed\u00c1.C\u00ea$\u00c76\u00bb_\b\u0005\u00d7\u00b1\u00f8'\u0015\u00e7I\r\u007fw\u00e4\u0018\u00cd\b\u00bf\u00fc\u0087h\u0015\u000f\u00b8\u0015)\u00e0\u0007\u0082\u00d233\u00d6C\u00c8\u001eu\"k\u00da9\u00f1R\u008d\u00f8O\u0005=\u00e1\u00e0@\u00e8\f\u00ec\u00e6\u0004\u00df;\u00d7\u008a\u00e2}\u00c1\u00da`\u0012jn\u00d4\u00ce!\u00f5\u00c9\u00a6\u0015I\u00d7qKt(\u0091\u00e2\u001d\ng\u00c5f\u00a1RN<;\\w\nA\u0088j\u00f6&\u008b\u00cb(+\u0085\u00051\u00c0\u001c7\u00bd";
        var4_7 = "\u00c4Bs\u00a1\u00d8\u00bb\b\u009c\u00ca\u00bd,\n\u00a70\u00d6\u0086\u00e8nt}\u00a8\u00b6\u0006\u009f\u00c4UG\u0093\u0080\n\u001b\u00c4\u00ff\u0093\u00e3x\u00c2\u00f3A\u0097\t\u00eb\u001e'\u00cb\u00d83\u00a8\u00fd\u0080\u0019?\u001eh\u00bc\u00cf2\b\u00eb\u009a\u00947\rk\u00be\u00d5o\u00b0\u00eb\\\u00f4\u00e2\u00cb|\n\"\u0012^\u0085\u00b8P>\u008b\u00c1z@\u00ba\u00f9\u00d6\u0090\u0004\u0088\u00de8\u00e2\u000f`-\u00e7LJ\u0017[%\u0090pCf)\u008d\u00d9\u000b]4\u00d7\u00f7[\u00d5\u009a$\u00c4\"z\u0004\u00b4\n67\u0007D\u00ebcC\u00f0\u00dbt\u0005tnv\u00893\t\u0082\u00c6\u001f\u0007\u000b\u0095\u00ae\u00b4\u00dc\rKy\u00c2Z\u009b\u00c9\u00b1/\u00eaE\u00cd\\\u0004\u0005\u00a7\u008b\u00d7\u0001\u00e4\u0007P\u0018\u00b7=\u00c8\u0014\u00ee\u0010\u00ac(\u00e9_\u00d1\u008ed\u00c1.C\u00ea$\u00c76\u00bb_\b\u0005\u00d7\u00b1\u00f8'\u0015\u00e7I\r\u007fw\u00e4\u0018\u00cd\b\u00bf\u00fc\u0087h\u0015\u000f\u00b8\u0015)\u00e0\u0007\u0082\u00d233\u00d6C\u00c8\u001eu\"k\u00da9\u00f1R\u008d\u00f8O\u0005=\u00e1\u00e0@\u00e8\f\u00ec\u00e6\u0004\u00df;\u00d7\u008a\u00e2}\u00c1\u00da`\u0012jn\u00d4\u00ce!\u00f5\u00c9\u00a6\u0015I\u00d7qKt(\u0091\u00e2\u001d\ng\u00c5f\u00a1RN<;\\w\nA\u0088j\u00f6&\u008b\u00cb(+\u0085\u00051\u00c0\u001c7\u00bd".length();
        var1_8 = 11;
        var0_9 = -1;
        block0: while (true) {
            block7: {
                v1 = ++var0_9;
                v2 = var2_6.substring(v1, v1 + var1_8).toCharArray();
                v3 = v2.length;
                var7_10 = 0;
                v4 = 15;
                v5 = v2;
                v6 = v3;
                if (v3 > 1) ** GOTO lbl59
                break block7;
                while (true) {
                    var2_6 = "'MJ\u008a\u00ef\u00bfh\u00e1\u00b2\u008c\u000e38k\u00a4\u000f\u00bc\u001fp\u00cd\u00dd\u00a1\u00ebiF\u0094\u00c9+\u00f26\u00a2";
                    var4_7 = "'MJ\u008a\u00ef\u00bfh\u00e1\u00b2\u008c\u000e38k\u00a4\u000f\u00bc\u001fp\u00cd\u00dd\u00a1\u00ebiF\u0094\u00c9+\u00f26\u00a2".length();
                    var1_8 = 15;
                    var0_9 = -1;
lbl33:
                    // 2 sources

                    while (true) {
                        v7 = ++var0_9;
                        v8 = var2_6.substring(v7, v7 + var1_8).toCharArray();
                        v9 = v8.length;
                        var7_10 = 0;
                        v10 = 118;
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
                v5[v13] = (char)(v5[v13] ^ (v4 ^ 52));
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
            v11[v15] = (char)(v11[v15] ^ (v10 ^ 52));
            ++var7_10;
            v10 = v10;
lbl79:
            // 2 sources

            v16 = v11;
            v12 = v12;
        } while (v12 > var7_10);
        var5_4[var3_5++] = new String(v16).intern();
        if ((var0_9 += var1_8) >= var4_7) {
            aMT.E = var5_4;
            aMT.F = new String[28];
            aMT.b((short)var10_1, var11_2, var12_3);
            return;
        }
        var1_8 = var2_6.charAt(var0_9);
        ** while (true)
    }
}


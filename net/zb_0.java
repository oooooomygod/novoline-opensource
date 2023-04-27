/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.zB
 */
public class zb_0 {
    public static String s = "You logged in from another location";
    public static String A = ".json";
    public static String m = ", ";
    public static String I = "whitelist.json";
    public static String L = "";
    public static String w = "yyyy-MM-dd 'at' HH:mm:ss z";
    public static String e = "You are not white-listed on this server!";
    public static String B = ", ";
    public static String z = " (";
    public static String q = "doDaylightCycle";
    private static String[] O;
    public static String K = "moving";
    public static String v = "local";
    public static String E = ")";
    public static String F = ")";
    public static String J = "Riding";
    public static String b = "\nYour ban will be removed on ";
    public static String l = "[";
    private static String[] N;
    public static String g = "The server is full!";
    public static String k = "You are banned from this server!\nReason: ";
    public static String y = "banned-players.json";
    public static String H = "multiplayer.player.joined";
    public static String r = "ops.json";
    public static String u = "loading single player";
    public static String x = "banned-ips.json";
    public static String j = ".json";
    public static String C = ", ";
    public static String D = "placing";
    public static String a = "stats";
    public static String f = "Riding";
    public static String h = "reducedDebugInfo";
    public static String p = " at (";
    private static long M;
    public static String i = "\nYour ban will be removed on ";
    public static String c = "removing player mount";
    public static String t = "Server closed";
    public static String o = "MC|Brand";
    public static String n = "Your IP address is banned from this server!\nReason: ";
    public static String d = "multiplayer.player.joined.renamed";
    public static String G = "] logged in with entity id ";

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        zb_0.M = a1c.a(4533568770202791657L, 37175385329581268L, null).a(215173057631953L);
        var8 = zb_0.M ^ 8969200373632L;
        v0 = var8 ^ 16471044597923L;
        var10_1 = (int)(v0 >>> 48);
        var11_2 = v0 << 16 >>> 16;
        var5_3 = new String[33];
        var3_4 = 0;
        var2_5 = "\u00c3\\8\u0000(\u009cb\u00d8\u00aa\u0004eA\u00d3\u0011\u00bbW\u00ef\ng\u0002\u00c4P\r\u0099Wx\u00fd\u00bf.\u009dI\u00f9I\u0005'\u0082\u000fG\u00a6\u00a8_:w \u00bc\u00fe\u00a0'\u008a'\u009aD\b2c\u00de\u00ad\u00b3\u0085\u00a7J\u001a\u001f\u0004\u00cc\u0007\u000b\u00a0'\u000ef-\u00ac\u0083\u008bD\u00c8P\u0092\u00ce\u00c0\u00ae\u008b\u00fc\u00c0\u0091\u008d\u00bc\u001bB\u00dc\u00d2x5\u00b1\u00cb\n\u0092\u00c0\u00b0\u0095\u0099|\r\u00a1{\u009c\u00ccu\u00d0\u00f3%\u00a43=Y\u0010j\u00fd\u0015\u00ab\u00c0\u0090\u00f0L\u0091'&D\r\u00eet\u0013\u0005\u0086bH\u00ac\u0093\u0005\u00cdf\u00c5\u00eao\u0013\u00ab>\u00ce*\u008a_\u00bd\u0087\u00ec:\u00dc\u00fb\u0097\u0098Z@\u008d\u0017\u0098)P\u0080\r\u001a\u00f2N\u00f5\u0006\u0017\u0085\nz\u00dc\u000b\u00a1\u00edb\u00d0\u00f4\u00e3\u00a9\u00e3\u00a4jX\u00ca\u0011\u00b5N\u00ed\u0003\u00fd\u00bf\u00b3Z\u00dc\u00f3\u00b9\u00a5fl\u0002\u0096w\u00055\u0007\u00f6%\u00e5\u0015\u00b1Ug\u00a4\u00b3$#t\u00e5u\\XH\u00a0\u00fe\u00ff\u008e\u001c\u008d4\u009d\u0002#*\u0005\u0095\u00a40\u00df\u008c\bZ\u00a1\u00ba\u00cc\u00c9Z\u00f2\u00eb\u0006\u009e\u00d4\u00af\u001f\u009a\u009b\u000e\u00df|\u000b6\u00a9\u000b\u0016 \u00f07&\u0097\u00d7\u0002\u0019\u00c1q\u0094)\u00f3\u00f4\u00d5R b\u0088B\u0006L\f\u0013\u00a9\u00ee;\u00d0`\u0087\u00e2\u00d13!\u0015\f\u000e\u0086\u00a0\u0001\u00bf\u00ecm\u00b5!\u00b83\u0013\u00aa\u00f8}\u0093\u00a1\u007f3r\u0088o~\u00e3\u000eq@\u0084\u00c6\u0010\u0095\u001d\u00c6\u00b9\u00fc\u0098\u0086\u00b3\r\u00e0\u00e3q\u0000\u008a\u00ae\u00fa\u00c7\u00de\u00b9}e\u00b5~\u00c3{\u009f\u001b\u00f3\u00bf\u00b7\u0086\u00062\u00c0\u00f0[!\u0013#q\u00f2)T{\u009aje\u00a1Cu\u0000\u00bf\u00e7\u00e1\u00a8\u00f9\u00ectgG\u001d=I\u0090\u00d7\u00a0)\u008c\u00a5rg\u0083\"\u00d9\u000f\u00a8\u0095\u00b9\u00f9kE\u00d1\u00fd\u0014@\fb\u0092\u00f5\u00eb4\u00e93:>U\u00e9]\u00ae\u0092\u0095\u00d3\u00c1\u00ac\u00f4\u00fc\u00a1\u00eb\u00cb\u00f0]\u00d88:\u00c1(8\u00d0\u00d2\f\t#=\u00c1o\u00adZ\u00d9\n\u00fc\u0017\u009d\u00ab\u0088AF\u00aeX4\u00aa&\u00efG\u0005z\u00e5\u00d7\\`\u0006u\u00c4\u00d2\u001d5\u00db\u0007a\u00cb3S\u00abP\u00d5\u0015\u008e\u00ecQ\u00d3\u00e7\u00a7\\\u00a4q\u00d9\u00f5\u00f1*SW\u00d1\u00a2\u008d%\u00c2\u0003";
        var4_6 = "\u00c3\\8\u0000(\u009cb\u00d8\u00aa\u0004eA\u00d3\u0011\u00bbW\u00ef\ng\u0002\u00c4P\r\u0099Wx\u00fd\u00bf.\u009dI\u00f9I\u0005'\u0082\u000fG\u00a6\u00a8_:w \u00bc\u00fe\u00a0'\u008a'\u009aD\b2c\u00de\u00ad\u00b3\u0085\u00a7J\u001a\u001f\u0004\u00cc\u0007\u000b\u00a0'\u000ef-\u00ac\u0083\u008bD\u00c8P\u0092\u00ce\u00c0\u00ae\u008b\u00fc\u00c0\u0091\u008d\u00bc\u001bB\u00dc\u00d2x5\u00b1\u00cb\n\u0092\u00c0\u00b0\u0095\u0099|\r\u00a1{\u009c\u00ccu\u00d0\u00f3%\u00a43=Y\u0010j\u00fd\u0015\u00ab\u00c0\u0090\u00f0L\u0091'&D\r\u00eet\u0013\u0005\u0086bH\u00ac\u0093\u0005\u00cdf\u00c5\u00eao\u0013\u00ab>\u00ce*\u008a_\u00bd\u0087\u00ec:\u00dc\u00fb\u0097\u0098Z@\u008d\u0017\u0098)P\u0080\r\u001a\u00f2N\u00f5\u0006\u0017\u0085\nz\u00dc\u000b\u00a1\u00edb\u00d0\u00f4\u00e3\u00a9\u00e3\u00a4jX\u00ca\u0011\u00b5N\u00ed\u0003\u00fd\u00bf\u00b3Z\u00dc\u00f3\u00b9\u00a5fl\u0002\u0096w\u00055\u0007\u00f6%\u00e5\u0015\u00b1Ug\u00a4\u00b3$#t\u00e5u\\XH\u00a0\u00fe\u00ff\u008e\u001c\u008d4\u009d\u0002#*\u0005\u0095\u00a40\u00df\u008c\bZ\u00a1\u00ba\u00cc\u00c9Z\u00f2\u00eb\u0006\u009e\u00d4\u00af\u001f\u009a\u009b\u000e\u00df|\u000b6\u00a9\u000b\u0016 \u00f07&\u0097\u00d7\u0002\u0019\u00c1q\u0094)\u00f3\u00f4\u00d5R b\u0088B\u0006L\f\u0013\u00a9\u00ee;\u00d0`\u0087\u00e2\u00d13!\u0015\f\u000e\u0086\u00a0\u0001\u00bf\u00ecm\u00b5!\u00b83\u0013\u00aa\u00f8}\u0093\u00a1\u007f3r\u0088o~\u00e3\u000eq@\u0084\u00c6\u0010\u0095\u001d\u00c6\u00b9\u00fc\u0098\u0086\u00b3\r\u00e0\u00e3q\u0000\u008a\u00ae\u00fa\u00c7\u00de\u00b9}e\u00b5~\u00c3{\u009f\u001b\u00f3\u00bf\u00b7\u0086\u00062\u00c0\u00f0[!\u0013#q\u00f2)T{\u009aje\u00a1Cu\u0000\u00bf\u00e7\u00e1\u00a8\u00f9\u00ectgG\u001d=I\u0090\u00d7\u00a0)\u008c\u00a5rg\u0083\"\u00d9\u000f\u00a8\u0095\u00b9\u00f9kE\u00d1\u00fd\u0014@\fb\u0092\u00f5\u00eb4\u00e93:>U\u00e9]\u00ae\u0092\u0095\u00d3\u00c1\u00ac\u00f4\u00fc\u00a1\u00eb\u00cb\u00f0]\u00d88:\u00c1(8\u00d0\u00d2\f\t#=\u00c1o\u00adZ\u00d9\n\u00fc\u0017\u009d\u00ab\u0088AF\u00aeX4\u00aa&\u00efG\u0005z\u00e5\u00d7\\`\u0006u\u00c4\u00d2\u001d5\u00db\u0007a\u00cb3S\u00abP\u00d5\u0015\u008e\u00ecQ\u00d3\u00e7\u00a7\\\u00a4q\u00d9\u00f5\u00f1*SW\u00d1\u00a2\u008d%\u00c2\u0003".length();
        var1_7 = 19;
        var0_8 = -1;
        block0: while (true) {
            block7: {
                v1 = ++var0_8;
                v2 = var2_5.substring(v1, v1 + var1_7).toCharArray();
                v3 = v2.length;
                var7_9 = 0;
                v4 = 37;
                v5 = v2;
                v6 = v3;
                if (v3 > 1) ** GOTO lbl58
                break block7;
                while (true) {
                    var2_5 = "\u008cEMy!\u00f9T+\u00f4\u00f5:.J\u00d1\u00b1\u00f2\u00cc\u00fa\u000e>\u000b\u00ff\u00c0\u00ba\u0082\u00e2\u009a\u00a6\u008cA\u00d9MmG\u00b4\u008f\u00f0s\u00a7\u00b4\u001d>D8\u00fc\u00c5\u00e4\u00be\u00d1N\u008cn\u00ee\u00b8\u00ad\u00de\u00efA\u0080\u00a1\u00d1=\u0094\u00c8\u00ae\u00b6\u000e\u00d1\u00d3\u0090";
                    var4_6 = "\u008cEMy!\u00f9T+\u00f4\u00f5:.J\u00d1\u00b1\u00f2\u00cc\u00fa\u000e>\u000b\u00ff\u00c0\u00ba\u0082\u00e2\u009a\u00a6\u008cA\u00d9MmG\u00b4\u008f\u00f0s\u00a7\u00b4\u001d>D8\u00fc\u00c5\u00e4\u00be\u00d1N\u008cn\u00ee\u00b8\u00ad\u00de\u00efA\u0080\u00a1\u00d1=\u0094\u00c8\u00ae\u00b6\u000e\u00d1\u00d3\u0090".length();
                    var1_7 = 40;
                    var0_8 = -1;
lbl32:
                    // 2 sources

                    while (true) {
                        v7 = ++var0_8;
                        v8 = var2_5.substring(v7, v7 + var1_7).toCharArray();
                        v9 = v8.length;
                        var7_9 = 0;
                        v10 = 80;
                        v11 = v8;
                        v12 = v9;
                        if (v9 <= 1) {
                            break block0;
                        }
                        ** GOTO lbl78
                        break;
                    }
                    break;
                }
            }
            do {
                v5 = v5;
                v13 = var7_9;
                var7_9 % 7;
                v5[v13] = (char)(v5[v13] ^ (v4 ^ 28));
                ++var7_9;
                v4 = v4;
lbl58:
                // 2 sources

                v14 = v5;
                v6 = v6;
            } while (v6 > var7_9);
            var5_3[var3_4++] = new String(v14).intern();
            if ((var0_8 += var1_7) >= var4_6) ** continue;
            var1_7 = var2_5.charAt(var0_8);
        }
        do {
            v11 = v11;
            v15 = var7_9;
            var7_9 % 7;
            v11[v15] = (char)(v11[v15] ^ (v10 ^ 28));
            ++var7_9;
            v10 = v10;
lbl78:
            // 2 sources

            v16 = v11;
            v12 = v12;
        } while (v12 > var7_9);
        var5_3[var3_4++] = new String(v16).intern();
        if ((var0_8 += var1_7) >= var4_6) {
            zb_0.N = var5_3;
            zb_0.O = new String[33];
            zb_0.b((short)var10_1, var11_2);
            return;
        }
        var1_7 = var2_5.charAt(var0_8);
        ** while (true)
    }

    private static String a(int n, int n2, int n3) {
        int n4 = (n ^ n3 ^ 0x7D9F) & 0xFFFF;
        if (O[n4] == null) {
            int n5;
            char[] cArray = N[n4].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n5 = 117;
                    break;
                }
                case 1: {
                    n5 = 196;
                    break;
                }
                case 2: {
                    n5 = 83;
                    break;
                }
                case 3: {
                    n5 = 14;
                    break;
                }
                case 4: {
                    n5 = 7;
                    break;
                }
                case 5: {
                    n5 = 23;
                    break;
                }
                case 6: {
                    n5 = 143;
                    break;
                }
                case 7: {
                    n5 = 186;
                    break;
                }
                case 8: {
                    n5 = 218;
                    break;
                }
                case 9: {
                    n5 = 22;
                    break;
                }
                case 10: {
                    n5 = 233;
                    break;
                }
                case 11: {
                    n5 = 122;
                    break;
                }
                case 12: {
                    n5 = 142;
                    break;
                }
                case 13: {
                    n5 = 52;
                    break;
                }
                case 14: {
                    n5 = 172;
                    break;
                }
                case 15: {
                    n5 = 162;
                    break;
                }
                case 16: {
                    n5 = 254;
                    break;
                }
                case 17: {
                    n5 = 190;
                    break;
                }
                case 18: {
                    n5 = 216;
                    break;
                }
                case 19: {
                    n5 = 13;
                    break;
                }
                case 20: {
                    n5 = 255;
                    break;
                }
                case 21: {
                    n5 = 192;
                    break;
                }
                case 22: {
                    n5 = 118;
                    break;
                }
                case 23: {
                    n5 = 99;
                    break;
                }
                case 24: {
                    n5 = 228;
                    break;
                }
                case 25: {
                    n5 = 78;
                    break;
                }
                case 26: {
                    n5 = 230;
                    break;
                }
                case 27: {
                    n5 = 195;
                    break;
                }
                case 28: {
                    n5 = 68;
                    break;
                }
                case 29: {
                    n5 = 33;
                    break;
                }
                case 30: {
                    n5 = 165;
                    break;
                }
                case 31: {
                    n5 = 219;
                    break;
                }
                case 32: {
                    n5 = 56;
                    break;
                }
                case 33: {
                    n5 = 19;
                    break;
                }
                case 34: {
                    n5 = 21;
                    break;
                }
                case 35: {
                    n5 = 168;
                    break;
                }
                case 36: {
                    n5 = 77;
                    break;
                }
                case 37: {
                    n5 = 203;
                    break;
                }
                case 38: {
                    n5 = 26;
                    break;
                }
                case 39: {
                    n5 = 224;
                    break;
                }
                case 40: {
                    n5 = 96;
                    break;
                }
                case 41: {
                    n5 = 181;
                    break;
                }
                case 42: {
                    n5 = 222;
                    break;
                }
                case 43: {
                    n5 = 206;
                    break;
                }
                case 44: {
                    n5 = 146;
                    break;
                }
                case 45: {
                    n5 = 92;
                    break;
                }
                case 46: {
                    n5 = 55;
                    break;
                }
                case 47: {
                    n5 = 60;
                    break;
                }
                case 48: {
                    n5 = 180;
                    break;
                }
                case 49: {
                    n5 = 82;
                    break;
                }
                case 50: {
                    n5 = 201;
                    break;
                }
                case 51: {
                    n5 = 194;
                    break;
                }
                case 52: {
                    n5 = 211;
                    break;
                }
                case 53: {
                    n5 = 123;
                    break;
                }
                case 54: {
                    n5 = 212;
                    break;
                }
                case 55: {
                    n5 = 208;
                    break;
                }
                case 56: {
                    n5 = 131;
                    break;
                }
                case 57: {
                    n5 = 167;
                    break;
                }
                case 58: {
                    n5 = 80;
                    break;
                }
                case 59: {
                    n5 = 183;
                    break;
                }
                case 60: {
                    n5 = 150;
                    break;
                }
                case 61: {
                    n5 = 217;
                    break;
                }
                case 62: {
                    n5 = 62;
                    break;
                }
                case 63: {
                    n5 = 157;
                    break;
                }
                case 64: {
                    n5 = 176;
                    break;
                }
                case 65: {
                    n5 = 189;
                    break;
                }
                case 66: {
                    n5 = 220;
                    break;
                }
                case 67: {
                    n5 = 50;
                    break;
                }
                case 68: {
                    n5 = 51;
                    break;
                }
                case 69: {
                    n5 = 69;
                    break;
                }
                case 70: {
                    n5 = 85;
                    break;
                }
                case 71: {
                    n5 = 49;
                    break;
                }
                case 72: {
                    n5 = 159;
                    break;
                }
                case 73: {
                    n5 = 182;
                    break;
                }
                case 74: {
                    n5 = 114;
                    break;
                }
                case 75: {
                    n5 = 44;
                    break;
                }
                case 76: {
                    n5 = 164;
                    break;
                }
                case 77: {
                    n5 = 89;
                    break;
                }
                case 78: {
                    n5 = 64;
                    break;
                }
                case 79: {
                    n5 = 93;
                    break;
                }
                case 80: {
                    n5 = 115;
                    break;
                }
                case 81: {
                    n5 = 8;
                    break;
                }
                case 82: {
                    n5 = 91;
                    break;
                }
                case 83: {
                    n5 = 144;
                    break;
                }
                case 84: {
                    n5 = 200;
                    break;
                }
                case 85: {
                    n5 = 161;
                    break;
                }
                case 86: {
                    n5 = 90;
                    break;
                }
                case 87: {
                    n5 = 63;
                    break;
                }
                case 88: {
                    n5 = 53;
                    break;
                }
                case 89: {
                    n5 = 139;
                    break;
                }
                case 90: {
                    n5 = 109;
                    break;
                }
                case 91: {
                    n5 = 110;
                    break;
                }
                case 92: {
                    n5 = 132;
                    break;
                }
                case 93: {
                    n5 = 145;
                    break;
                }
                case 94: {
                    n5 = 213;
                    break;
                }
                case 95: {
                    n5 = 98;
                    break;
                }
                case 96: {
                    n5 = 125;
                    break;
                }
                case 97: {
                    n5 = 79;
                    break;
                }
                case 98: {
                    n5 = 86;
                    break;
                }
                case 99: {
                    n5 = 45;
                    break;
                }
                case 100: {
                    n5 = 234;
                    break;
                }
                case 101: {
                    n5 = 107;
                    break;
                }
                case 102: {
                    n5 = 38;
                    break;
                }
                case 103: {
                    n5 = 102;
                    break;
                }
                case 104: {
                    n5 = 28;
                    break;
                }
                case 105: {
                    n5 = 31;
                    break;
                }
                case 106: {
                    n5 = 84;
                    break;
                }
                case 107: {
                    n5 = 241;
                    break;
                }
                case 108: {
                    n5 = 41;
                    break;
                }
                case 109: {
                    n5 = 197;
                    break;
                }
                case 110: {
                    n5 = 129;
                    break;
                }
                case 111: {
                    n5 = 175;
                    break;
                }
                case 112: {
                    n5 = 48;
                    break;
                }
                case 113: {
                    n5 = 225;
                    break;
                }
                case 114: {
                    n5 = 133;
                    break;
                }
                case 115: {
                    n5 = 246;
                    break;
                }
                case 116: {
                    n5 = 239;
                    break;
                }
                case 117: {
                    n5 = 36;
                    break;
                }
                case 118: {
                    n5 = 124;
                    break;
                }
                case 119: {
                    n5 = 43;
                    break;
                }
                case 120: {
                    n5 = 54;
                    break;
                }
                case 121: {
                    n5 = 81;
                    break;
                }
                case 122: {
                    n5 = 137;
                    break;
                }
                case 123: {
                    n5 = 103;
                    break;
                }
                case 124: {
                    n5 = 207;
                    break;
                }
                case 125: {
                    n5 = 138;
                    break;
                }
                case 126: {
                    n5 = 130;
                    break;
                }
                case 127: {
                    n5 = 121;
                    break;
                }
                case 128: {
                    n5 = 111;
                    break;
                }
                case 129: {
                    n5 = 179;
                    break;
                }
                case 130: {
                    n5 = 35;
                    break;
                }
                case 131: {
                    n5 = 113;
                    break;
                }
                case 132: {
                    n5 = 74;
                    break;
                }
                case 133: {
                    n5 = 58;
                    break;
                }
                case 134: {
                    n5 = 46;
                    break;
                }
                case 135: {
                    n5 = 39;
                    break;
                }
                case 136: {
                    n5 = 205;
                    break;
                }
                case 137: {
                    n5 = 73;
                    break;
                }
                case 138: {
                    n5 = 214;
                    break;
                }
                case 139: {
                    n5 = 169;
                    break;
                }
                case 140: {
                    n5 = 120;
                    break;
                }
                case 141: {
                    n5 = 25;
                    break;
                }
                case 142: {
                    n5 = 252;
                    break;
                }
                case 143: {
                    n5 = 221;
                    break;
                }
                case 144: {
                    n5 = 30;
                    break;
                }
                case 145: {
                    n5 = 3;
                    break;
                }
                case 146: {
                    n5 = 66;
                    break;
                }
                case 147: {
                    n5 = 95;
                    break;
                }
                case 148: {
                    n5 = 136;
                    break;
                }
                case 149: {
                    n5 = 187;
                    break;
                }
                case 150: {
                    n5 = 153;
                    break;
                }
                case 151: {
                    n5 = 112;
                    break;
                }
                case 152: {
                    n5 = 215;
                    break;
                }
                case 153: {
                    n5 = 237;
                    break;
                }
                case 154: {
                    n5 = 209;
                    break;
                }
                case 155: {
                    n5 = 17;
                    break;
                }
                case 156: {
                    n5 = 71;
                    break;
                }
                case 157: {
                    n5 = 184;
                    break;
                }
                case 158: {
                    n5 = 248;
                    break;
                }
                case 159: {
                    n5 = 149;
                    break;
                }
                case 160: {
                    n5 = 188;
                    break;
                }
                case 161: {
                    n5 = 198;
                    break;
                }
                case 162: {
                    n5 = 47;
                    break;
                }
                case 163: {
                    n5 = 57;
                    break;
                }
                case 164: {
                    n5 = 87;
                    break;
                }
                case 165: {
                    n5 = 76;
                    break;
                }
                case 166: {
                    n5 = 253;
                    break;
                }
                case 167: {
                    n5 = 34;
                    break;
                }
                case 168: {
                    n5 = 152;
                    break;
                }
                case 169: {
                    n5 = 238;
                    break;
                }
                case 170: {
                    n5 = 70;
                    break;
                }
                case 171: {
                    n5 = 59;
                    break;
                }
                case 172: {
                    n5 = 106;
                    break;
                }
                case 173: {
                    n5 = 210;
                    break;
                }
                case 174: {
                    n5 = 65;
                    break;
                }
                case 175: {
                    n5 = 158;
                    break;
                }
                case 176: {
                    n5 = 0;
                    break;
                }
                case 177: {
                    n5 = 163;
                    break;
                }
                case 178: {
                    n5 = 61;
                    break;
                }
                case 179: {
                    n5 = 251;
                    break;
                }
                case 180: {
                    n5 = 231;
                    break;
                }
                case 181: {
                    n5 = 12;
                    break;
                }
                case 182: {
                    n5 = 242;
                    break;
                }
                case 183: {
                    n5 = 244;
                    break;
                }
                case 184: {
                    n5 = 75;
                    break;
                }
                case 185: {
                    n5 = 119;
                    break;
                }
                case 186: {
                    n5 = 135;
                    break;
                }
                case 187: {
                    n5 = 15;
                    break;
                }
                case 188: {
                    n5 = 29;
                    break;
                }
                case 189: {
                    n5 = 227;
                    break;
                }
                case 190: {
                    n5 = 101;
                    break;
                }
                case 191: {
                    n5 = 154;
                    break;
                }
                case 192: {
                    n5 = 240;
                    break;
                }
                case 193: {
                    n5 = 170;
                    break;
                }
                case 194: {
                    n5 = 127;
                    break;
                }
                case 195: {
                    n5 = 88;
                    break;
                }
                case 196: {
                    n5 = 105;
                    break;
                }
                case 197: {
                    n5 = 134;
                    break;
                }
                case 198: {
                    n5 = 16;
                    break;
                }
                case 199: {
                    n5 = 104;
                    break;
                }
                case 200: {
                    n5 = 202;
                    break;
                }
                case 201: {
                    n5 = 148;
                    break;
                }
                case 202: {
                    n5 = 67;
                    break;
                }
                case 203: {
                    n5 = 177;
                    break;
                }
                case 204: {
                    n5 = 155;
                    break;
                }
                case 205: {
                    n5 = 156;
                    break;
                }
                case 206: {
                    n5 = 245;
                    break;
                }
                case 207: {
                    n5 = 20;
                    break;
                }
                case 208: {
                    n5 = 191;
                    break;
                }
                case 209: {
                    n5 = 126;
                    break;
                }
                case 210: {
                    n5 = 199;
                    break;
                }
                case 211: {
                    n5 = 151;
                    break;
                }
                case 212: {
                    n5 = 32;
                    break;
                }
                case 213: {
                    n5 = 128;
                    break;
                }
                case 214: {
                    n5 = 178;
                    break;
                }
                case 215: {
                    n5 = 171;
                    break;
                }
                case 216: {
                    n5 = 2;
                    break;
                }
                case 217: {
                    n5 = 37;
                    break;
                }
                case 218: {
                    n5 = 185;
                    break;
                }
                case 219: {
                    n5 = 235;
                    break;
                }
                case 220: {
                    n5 = 72;
                    break;
                }
                case 221: {
                    n5 = 160;
                    break;
                }
                case 222: {
                    n5 = 18;
                    break;
                }
                case 223: {
                    n5 = 247;
                    break;
                }
                case 224: {
                    n5 = 141;
                    break;
                }
                case 225: {
                    n5 = 97;
                    break;
                }
                case 226: {
                    n5 = 42;
                    break;
                }
                case 227: {
                    n5 = 9;
                    break;
                }
                case 228: {
                    n5 = 166;
                    break;
                }
                case 229: {
                    n5 = 140;
                    break;
                }
                case 230: {
                    n5 = 108;
                    break;
                }
                case 231: {
                    n5 = 24;
                    break;
                }
                case 232: {
                    n5 = 229;
                    break;
                }
                case 233: {
                    n5 = 173;
                    break;
                }
                case 234: {
                    n5 = 193;
                    break;
                }
                case 235: {
                    n5 = 232;
                    break;
                }
                case 236: {
                    n5 = 223;
                    break;
                }
                case 237: {
                    n5 = 4;
                    break;
                }
                case 238: {
                    n5 = 174;
                    break;
                }
                case 239: {
                    n5 = 5;
                    break;
                }
                case 240: {
                    n5 = 40;
                    break;
                }
                case 241: {
                    n5 = 100;
                    break;
                }
                case 242: {
                    n5 = 116;
                    break;
                }
                case 243: {
                    n5 = 204;
                    break;
                }
                case 244: {
                    n5 = 11;
                    break;
                }
                case 245: {
                    n5 = 249;
                    break;
                }
                case 246: {
                    n5 = 6;
                    break;
                }
                case 247: {
                    n5 = 236;
                    break;
                }
                case 248: {
                    n5 = 226;
                    break;
                }
                case 249: {
                    n5 = 147;
                    break;
                }
                case 250: {
                    n5 = 27;
                    break;
                }
                case 251: {
                    n5 = 243;
                    break;
                }
                case 252: {
                    n5 = 250;
                    break;
                }
                case 253: {
                    n5 = 1;
                    break;
                }
                case 254: {
                    n5 = 10;
                    break;
                }
                default: {
                    n5 = 94;
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
            zb_0.O[n4] = new String(cArray).intern();
        }
        return O[n4];
    }

    public static void b(short s, long l4) {
        long l5 = ((long)s << 48 | l4 << 16 >>> 16) ^ M;
        x = zb_0.a(-1195124033, -1195096260 + -((char)-23937), (int)l5);
        w = zb_0.a(-1195124039, -1195117990, (int)l5);
        l = "[";
        f = zb_0.a(-1195124050, -1195096260 + -((char)-29432), (int)l5);
        n = zb_0.a(-1195124058, 1195096260 + (char)-14937, (int)l5);
        H = zb_0.a(-1195124056, -1195096260 + -((char)-15384), (int)l5);
        e = zb_0.a(-1195124061, -1195096260 + -((char)-26478), (int)l5);
        b = zb_0.a(-1195124054, -1195096260 + -((char)-23604), (int)l5);
        r = zb_0.a(-1195124051, 1195096260 + (char)-21930, (int)l5);
        k = zb_0.a(-1195124041, 1195096260 + (char)-18776, (int)l5);
        d = zb_0.a(-1195124055, 1195096260 + (char)-16852, (int)l5);
        m = zb_0.a(-1195124048, 1195116546, (int)l5);
        A = zb_0.a(-1195124057, 1195096260 + (char)-23560, (int)l5);
        E = ")";
        G = zb_0.a(-1195124038, -1195096260 + -((char)-16242), (int)l5);
        v = zb_0.a(-1195124052, 1195096260 + (char)-26811, (int)l5);
        a = zb_0.a(-1195124043, -1195116367, (int)l5);
        j = zb_0.a(-1195124044, 1195096260 + (char)-27068, (int)l5);
        D = zb_0.a(-1195124063, -1195096260 + -((char)-27202), (int)l5);
        L = "";
        q = zb_0.a(-1195124059, 1195120859, (int)l5);
        h = zb_0.a(-1195124037, -1195128430, (int)l5);
        z = zb_0.a(-1195124045, -1195096260 + -((char)-17863), (int)l5);
        y = zb_0.a(-1195124036, 1195127184, (int)l5);
        p = zb_0.a(-1195124047, 1195116953, (int)l5);
        B = zb_0.a(-1195124035, -1195096260 + -((char)-18869), (int)l5);
        zb_0.s = zb_0.a(-1195124060, -1195123309, (int)l5);
        i = zb_0.a(-1195124068, 1195119838, (int)l5);
        g = zb_0.a(-1195124042, -1195117269, (int)l5);
        I = zb_0.a(-1195124049, 1195121118, (int)l5);
        u = zb_0.a(-1195124062, 1195122412, (int)l5);
        F = ")";
        o = zb_0.a(-1195124040, 1195096260 + (char)-28897, (int)l5);
        J = zb_0.a(-1195124064, 1195124961, (int)l5);
        C = zb_0.a(-1195124035, -1195096260 + -((char)-18869), (int)l5);
        c = zb_0.a(-1195124046, -1195121436, (int)l5);
        K = zb_0.a(-1195124053, -1195096260 + -((char)-32135), (int)l5);
        t = zb_0.a(-1195124034, -1195096260 + -((char)-20560), (int)l5);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.am9
 */
public class am9_0 {
    public static String f = "(this as java.lang.String).getBytes(charset)";
    public static String h = "Failed decrypting";
    public static String w = "AES/CBC/PKCS5Padding";
    public static String s = "json.get(\"ciphertext\")";
    public static String z = "iv";
    public static String B = "ciphertext";
    public static String l = "hmac";
    public static String d = "gson.toJson(json)";
    public static String r = "json.get(\"iv\")";
    public static String D = "HMAC doesn't match";
    public static String k = "cipher";
    public static String o = "data";
    public static String y = "data";
    public static String v = "HmacSHA256";
    public static String m = "hmac";
    public static String t = "Mac.getInstance(\"HmacSHA256\")";
    public static String a = "null cannot be cast to non-null type java.lang.String";
    public static String x = "password";
    private static String[] I;
    public static String i = "cipher.doFinal(ciphertext)";
    public static String c = "(this as java.lang.Strin\u2026ing(startIndex, endIndex)";
    public static String g = "data";
    public static String A = "JsonParser().parse(data)";
    public static String C = "null cannot be cast to non-null type java.lang.String";
    public static String E = "(this as java.lang.String).getBytes(charset)";
    public static String j = "null cannot be cast to non-null type java.lang.String";
    public static String G = "Base64.getDecoder().decode(this.asString)";
    public static String p = "iv";
    public static String q = "(this as java.lang.String).getBytes(charset)";
    private static long H;
    public static String e = "ciphertext";
    public static String F = "Failed instancing the ciphers";
    public static String u = "json.get(\"hmac\")";
    public static String b = "data";
    private static String[] J;
    public static String n = "AES";

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        am9_0.H = a1c.a(6584736702968464676L, -5971613223822314190L, null).a(215221596228900L);
        var8 = am9_0.H ^ 60919924205504L;
        v0 = var8 ^ 11912037144786L;
        var10_1 = (int)(v0 >>> 32);
        var11_2 = (int)(v0 << 32 >>> 48);
        var12_3 = (int)(v0 << 48 >>> 48);
        var5_4 = new String[29];
        var3_5 = 0;
        var2_6 = "\u00f0\u00976-\u001c@\u0014:N\u00bf\u00e0p\u00e8^d,`\u00f8\b3\u00e0\u00900\u0090\u0087\u00c5\u008b\u00d1x5\u00aa\rU\u00e8\u0090\u00ff)-\u0080\u00a69\u008d\u00df\u008eF\u00fdB=\u008a\u00fa\u00a1\u00a7h\u00d7\u00b8\u00cc\u00d8*U\f\u00d2\u00be4\u00ear\u00dd\u0096\u00d7iPa\u00e2\u00beP\u0097\u00de\u0084cq\u0094;\u000f\u00ba\u001aMC\u0019\u00ba\u00c3 \u00e1\u00ef>\u009c\u00d2\u0088\u001f\u00a05\u0010-\u0083r\u000b'o;\u00a0$\u00b1\nW1Z\u00f4\u00ab\u00e9\u00b6\u00d7\u00d2\u0088\u0004z\"\u001c\u0096\u0004SJ9\u009b\u0011\u0099u\u001bq\u00b9\u00cb\u00a0F\u00d3\u008c?\u001c\u00cb\u00df\u00dd\u00e9W,\u00f6\u00ffT\u0092gV\u00ee.6}}\u0005\u00e3H\u00ee\u0005\u009dt\u00c56Y>>Z\u001a:\u0086R\u00ed3\u00f9\u001b\u00ba0\u00a0T\u00ec\u0000\r\u00ec\u00ff\u00ba%1\u000e\u00ecU\u001a'\u0014@rD)\u009f\u009f\u0018\u00f5\u00ec,\u00fb]\u00f5\u00c6S\u00dch\u007f\u00e6Wg@\u00a0\u00e0\u0086\u0010\u0090\u00d6dbm\u00b4\u00b8\u000b\u00ca\u0010\u009c\u0017\u00ae\u009b\u0091\u000e\u00b7\u0092\u0001\u0000\u00d8\u008a\u008b\u00bd/\u0090?t5\u00c5$\u00b8\u00cd-[\u009e\u00b9v4\u00e7\u00df\u0004\u00c4=\u00b4-\u0014g\u00df\u001c\u0003\u00dfCN^\u0006x\u008eF\u00a9\u00f7[\u00c3\u009f\u00f8+s\u00de\u00c4\u0097p`\u0002L\u0094\u00ff*\u001e\u00bd\u00d6*\u0007\nLXfV)\u00ed#}\u00be\"\u0002.\u0089\u0010\u0002\u00b4\u00c7\u001b\u00af\u00c7\u0005\u00b4\u00c7\u0081C\u00c0\f\u00c5]\u00182\u00cdF3\u00a5\u008b\u00b0s\u00f2\u0085\u00e6\u000bv-&7\u00c8\u00a6\u00cd\u00a2\u0001\u00b5\u00d8\u00a3\u0086\u20e8\u00e1\u00f1a\u0006RV\u00c8\u00b9@</\u0005\u00ec\u00ce\u0083\u00ee\u00c2$s\u00a1\u0016\u00cbd\u0097\u00df\nV\u0080z\u00c2\u00af/6\u000f\u00c2\u0093\u0006\u001e\u00fes\r\u008e\u00d6\u0003L\u00b6|\u0012\u00a2\u00b5\u009b\u00ef\u00c1\u00d2\rd\u00d6\u00e4\u001e\u00b0@\u00ff\u00fe\u00cd>\u00d5\u0004Il\u00e2\u00d0\b`i\u00ce\u00edH\u00af\u009c\u00a0\u001d\u009bw;s\u00f4\u0080\u001f#\u00f1\u00b8\u0017\u0090\u0016B\u00b7\u00e9\u00d2\u00a6\u00aa\u0094\u0088?\u00d0P\u0097\u00ad\u00d0zp): \u00f1\u00d2\u00ee\u00c7}\u009e\u00a7\u00e3\u0087\u0018?\u00db?\u001a\u00b2\\\u00b8\u00e8\u0001 -m0\u00b1\u00a6\u00f5\"\u00ab\u009d\u00e14\u00c4\u00e6B\u0011\u0014\u008eZ;\u0004\u008ea\u001aq\u0014n\u00148\u00be\u0086?\u00c6q%`C\u0086\u0016\u00c7\u0083@\u0096w\u00af\u00ad\u0016\u00ea#\u00da\u00e9\f\u0099q\u007fI\u00f8\u0099\u00eb,/-t\u00d7)\u0083\u00f8[\u007f\u0011\u00c6D\u00f3\u0005)\u0017\u00df\u00e1\u008c\u009f\u001c\u00a2*t\u00be{\u00b3";
        var4_7 = "\u00f0\u00976-\u001c@\u0014:N\u00bf\u00e0p\u00e8^d,`\u00f8\b3\u00e0\u00900\u0090\u0087\u00c5\u008b\u00d1x5\u00aa\rU\u00e8\u0090\u00ff)-\u0080\u00a69\u008d\u00df\u008eF\u00fdB=\u008a\u00fa\u00a1\u00a7h\u00d7\u00b8\u00cc\u00d8*U\f\u00d2\u00be4\u00ear\u00dd\u0096\u00d7iPa\u00e2\u00beP\u0097\u00de\u0084cq\u0094;\u000f\u00ba\u001aMC\u0019\u00ba\u00c3 \u00e1\u00ef>\u009c\u00d2\u0088\u001f\u00a05\u0010-\u0083r\u000b'o;\u00a0$\u00b1\nW1Z\u00f4\u00ab\u00e9\u00b6\u00d7\u00d2\u0088\u0004z\"\u001c\u0096\u0004SJ9\u009b\u0011\u0099u\u001bq\u00b9\u00cb\u00a0F\u00d3\u008c?\u001c\u00cb\u00df\u00dd\u00e9W,\u00f6\u00ffT\u0092gV\u00ee.6}}\u0005\u00e3H\u00ee\u0005\u009dt\u00c56Y>>Z\u001a:\u0086R\u00ed3\u00f9\u001b\u00ba0\u00a0T\u00ec\u0000\r\u00ec\u00ff\u00ba%1\u000e\u00ecU\u001a'\u0014@rD)\u009f\u009f\u0018\u00f5\u00ec,\u00fb]\u00f5\u00c6S\u00dch\u007f\u00e6Wg@\u00a0\u00e0\u0086\u0010\u0090\u00d6dbm\u00b4\u00b8\u000b\u00ca\u0010\u009c\u0017\u00ae\u009b\u0091\u000e\u00b7\u0092\u0001\u0000\u00d8\u008a\u008b\u00bd/\u0090?t5\u00c5$\u00b8\u00cd-[\u009e\u00b9v4\u00e7\u00df\u0004\u00c4=\u00b4-\u0014g\u00df\u001c\u0003\u00dfCN^\u0006x\u008eF\u00a9\u00f7[\u00c3\u009f\u00f8+s\u00de\u00c4\u0097p`\u0002L\u0094\u00ff*\u001e\u00bd\u00d6*\u0007\nLXfV)\u00ed#}\u00be\"\u0002.\u0089\u0010\u0002\u00b4\u00c7\u001b\u00af\u00c7\u0005\u00b4\u00c7\u0081C\u00c0\f\u00c5]\u00182\u00cdF3\u00a5\u008b\u00b0s\u00f2\u0085\u00e6\u000bv-&7\u00c8\u00a6\u00cd\u00a2\u0001\u00b5\u00d8\u00a3\u0086\u20e8\u00e1\u00f1a\u0006RV\u00c8\u00b9@</\u0005\u00ec\u00ce\u0083\u00ee\u00c2$s\u00a1\u0016\u00cbd\u0097\u00df\nV\u0080z\u00c2\u00af/6\u000f\u00c2\u0093\u0006\u001e\u00fes\r\u008e\u00d6\u0003L\u00b6|\u0012\u00a2\u00b5\u009b\u00ef\u00c1\u00d2\rd\u00d6\u00e4\u001e\u00b0@\u00ff\u00fe\u00cd>\u00d5\u0004Il\u00e2\u00d0\b`i\u00ce\u00edH\u00af\u009c\u00a0\u001d\u009bw;s\u00f4\u0080\u001f#\u00f1\u00b8\u0017\u0090\u0016B\u00b7\u00e9\u00d2\u00a6\u00aa\u0094\u0088?\u00d0P\u0097\u00ad\u00d0zp): \u00f1\u00d2\u00ee\u00c7}\u009e\u00a7\u00e3\u0087\u0018?\u00db?\u001a\u00b2\\\u00b8\u00e8\u0001 -m0\u00b1\u00a6\u00f5\"\u00ab\u009d\u00e14\u00c4\u00e6B\u0011\u0014\u008eZ;\u0004\u008ea\u001aq\u0014n\u00148\u00be\u0086?\u00c6q%`C\u0086\u0016\u00c7\u0083@\u0096w\u00af\u00ad\u0016\u00ea#\u00da\u00e9\f\u0099q\u007fI\u00f8\u0099\u00eb,/-t\u00d7)\u0083\u00f8[\u007f\u0011\u00c6D\u00f3\u0005)\u0017\u00df\u00e1\u008c\u009f\u001c\u00a2*t\u00be{\u00b3".length();
        var1_8 = 29;
        var0_9 = -1;
        block0: while (true) {
            block7: {
                v1 = ++var0_9;
                v2 = var2_6.substring(v1, v1 + var1_8).toCharArray();
                v3 = v2.length;
                var7_10 = 0;
                v4 = 94;
                v5 = v2;
                v6 = v3;
                if (v3 > 1) ** GOTO lbl59
                break block7;
                while (true) {
                    var2_6 = "\u0015X%\u00a2\u00a9\u00d2G\u00f3\u0013\u00faY\u0095l\u0094\u0090<\u00c7\u0004\u0012iT&\u0004\u00fc\u0002\u00cf\u008b";
                    var4_7 = "\u0015X%\u00a2\u00a9\u00d2G\u00f3\u0013\u00faY\u0095l\u0094\u0090<\u00c7\u0004\u0012iT&\u0004\u00fc\u0002\u00cf\u008b".length();
                    var1_8 = 24;
                    var0_9 = -1;
lbl33:
                    // 2 sources

                    while (true) {
                        v7 = ++var0_9;
                        v8 = var2_6.substring(v7, v7 + var1_8).toCharArray();
                        v9 = v8.length;
                        var7_10 = 0;
                        v10 = 126;
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
                v5[v13] = (char)(v5[v13] ^ (v4 ^ 8));
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
            v11[v15] = (char)(v11[v15] ^ (v10 ^ 8));
            ++var7_10;
            v10 = v10;
lbl79:
            // 2 sources

            v16 = v11;
            v12 = v12;
        } while (v12 > var7_10);
        var5_4[var3_5++] = new String(v16).intern();
        if ((var0_9 += var1_8) >= var4_7) {
            am9_0.I = var5_4;
            am9_0.J = new String[29];
            am9_0.b(var10_1, var11_2, var12_3);
            return;
        }
        var1_8 = var2_6.charAt(var0_9);
        ** while (true)
    }

    private static String a(int n, int n2, int n3) {
        int n4 = (n ^ n3 ^ 0xFFFF868F) & 0xFFFF;
        if (J[n4] == null) {
            int n5;
            char[] cArray = I[n4].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n5 = 163;
                    break;
                }
                case 1: {
                    n5 = 82;
                    break;
                }
                case 2: {
                    n5 = 6;
                    break;
                }
                case 3: {
                    n5 = 11;
                    break;
                }
                case 4: {
                    n5 = 98;
                    break;
                }
                case 5: {
                    n5 = 123;
                    break;
                }
                case 6: {
                    n5 = 58;
                    break;
                }
                case 7: {
                    n5 = 204;
                    break;
                }
                case 8: {
                    n5 = 129;
                    break;
                }
                case 9: {
                    n5 = 251;
                    break;
                }
                case 10: {
                    n5 = 115;
                    break;
                }
                case 11: {
                    n5 = 165;
                    break;
                }
                case 12: {
                    n5 = 97;
                    break;
                }
                case 13: {
                    n5 = 63;
                    break;
                }
                case 14: {
                    n5 = 21;
                    break;
                }
                case 15: {
                    n5 = 61;
                    break;
                }
                case 16: {
                    n5 = 126;
                    break;
                }
                case 17: {
                    n5 = 110;
                    break;
                }
                case 18: {
                    n5 = 235;
                    break;
                }
                case 19: {
                    n5 = 245;
                    break;
                }
                case 20: {
                    n5 = 77;
                    break;
                }
                case 21: {
                    n5 = 53;
                    break;
                }
                case 22: {
                    n5 = 236;
                    break;
                }
                case 23: {
                    n5 = 36;
                    break;
                }
                case 24: {
                    n5 = 5;
                    break;
                }
                case 25: {
                    n5 = 157;
                    break;
                }
                case 26: {
                    n5 = 9;
                    break;
                }
                case 27: {
                    n5 = 156;
                    break;
                }
                case 28: {
                    n5 = 131;
                    break;
                }
                case 29: {
                    n5 = 249;
                    break;
                }
                case 30: {
                    n5 = 74;
                    break;
                }
                case 31: {
                    n5 = 155;
                    break;
                }
                case 32: {
                    n5 = 147;
                    break;
                }
                case 33: {
                    n5 = 113;
                    break;
                }
                case 34: {
                    n5 = 88;
                    break;
                }
                case 35: {
                    n5 = 45;
                    break;
                }
                case 36: {
                    n5 = 46;
                    break;
                }
                case 37: {
                    n5 = 108;
                    break;
                }
                case 38: {
                    n5 = 223;
                    break;
                }
                case 39: {
                    n5 = 114;
                    break;
                }
                case 40: {
                    n5 = 125;
                    break;
                }
                case 41: {
                    n5 = 42;
                    break;
                }
                case 42: {
                    n5 = 73;
                    break;
                }
                case 43: {
                    n5 = 128;
                    break;
                }
                case 44: {
                    n5 = 228;
                    break;
                }
                case 45: {
                    n5 = 190;
                    break;
                }
                case 46: {
                    n5 = 241;
                    break;
                }
                case 47: {
                    n5 = 41;
                    break;
                }
                case 48: {
                    n5 = 43;
                    break;
                }
                case 49: {
                    n5 = 244;
                    break;
                }
                case 50: {
                    n5 = 75;
                    break;
                }
                case 51: {
                    n5 = 221;
                    break;
                }
                case 52: {
                    n5 = 78;
                    break;
                }
                case 53: {
                    n5 = 161;
                    break;
                }
                case 54: {
                    n5 = 107;
                    break;
                }
                case 55: {
                    n5 = 111;
                    break;
                }
                case 56: {
                    n5 = 238;
                    break;
                }
                case 57: {
                    n5 = 203;
                    break;
                }
                case 58: {
                    n5 = 192;
                    break;
                }
                case 59: {
                    n5 = 120;
                    break;
                }
                case 60: {
                    n5 = 232;
                    break;
                }
                case 61: {
                    n5 = 51;
                    break;
                }
                case 62: {
                    n5 = 70;
                    break;
                }
                case 63: {
                    n5 = 13;
                    break;
                }
                case 64: {
                    n5 = 178;
                    break;
                }
                case 65: {
                    n5 = 171;
                    break;
                }
                case 66: {
                    n5 = 237;
                    break;
                }
                case 67: {
                    n5 = 141;
                    break;
                }
                case 68: {
                    n5 = 68;
                    break;
                }
                case 69: {
                    n5 = 197;
                    break;
                }
                case 70: {
                    n5 = 72;
                    break;
                }
                case 71: {
                    n5 = 195;
                    break;
                }
                case 72: {
                    n5 = 7;
                    break;
                }
                case 73: {
                    n5 = 213;
                    break;
                }
                case 74: {
                    n5 = 153;
                    break;
                }
                case 75: {
                    n5 = 118;
                    break;
                }
                case 76: {
                    n5 = 137;
                    break;
                }
                case 77: {
                    n5 = 176;
                    break;
                }
                case 78: {
                    n5 = 187;
                    break;
                }
                case 79: {
                    n5 = 219;
                    break;
                }
                case 80: {
                    n5 = 185;
                    break;
                }
                case 81: {
                    n5 = 160;
                    break;
                }
                case 82: {
                    n5 = 200;
                    break;
                }
                case 83: {
                    n5 = 65;
                    break;
                }
                case 84: {
                    n5 = 229;
                    break;
                }
                case 85: {
                    n5 = 227;
                    break;
                }
                case 86: {
                    n5 = 225;
                    break;
                }
                case 87: {
                    n5 = 23;
                    break;
                }
                case 88: {
                    n5 = 215;
                    break;
                }
                case 89: {
                    n5 = 2;
                    break;
                }
                case 90: {
                    n5 = 181;
                    break;
                }
                case 91: {
                    n5 = 106;
                    break;
                }
                case 92: {
                    n5 = 105;
                    break;
                }
                case 93: {
                    n5 = 184;
                    break;
                }
                case 94: {
                    n5 = 168;
                    break;
                }
                case 95: {
                    n5 = 172;
                    break;
                }
                case 96: {
                    n5 = 246;
                    break;
                }
                case 97: {
                    n5 = 95;
                    break;
                }
                case 98: {
                    n5 = 196;
                    break;
                }
                case 99: {
                    n5 = 37;
                    break;
                }
                case 100: {
                    n5 = 164;
                    break;
                }
                case 101: {
                    n5 = 134;
                    break;
                }
                case 102: {
                    n5 = 199;
                    break;
                }
                case 103: {
                    n5 = 148;
                    break;
                }
                case 104: {
                    n5 = 15;
                    break;
                }
                case 105: {
                    n5 = 99;
                    break;
                }
                case 106: {
                    n5 = 211;
                    break;
                }
                case 107: {
                    n5 = 152;
                    break;
                }
                case 108: {
                    n5 = 243;
                    break;
                }
                case 109: {
                    n5 = 145;
                    break;
                }
                case 110: {
                    n5 = 81;
                    break;
                }
                case 111: {
                    n5 = 255;
                    break;
                }
                case 112: {
                    n5 = 210;
                    break;
                }
                case 113: {
                    n5 = 8;
                    break;
                }
                case 114: {
                    n5 = 182;
                    break;
                }
                case 115: {
                    n5 = 122;
                    break;
                }
                case 116: {
                    n5 = 193;
                    break;
                }
                case 117: {
                    n5 = 18;
                    break;
                }
                case 118: {
                    n5 = 194;
                    break;
                }
                case 119: {
                    n5 = 50;
                    break;
                }
                case 120: {
                    n5 = 33;
                    break;
                }
                case 121: {
                    n5 = 112;
                    break;
                }
                case 122: {
                    n5 = 139;
                    break;
                }
                case 123: {
                    n5 = 138;
                    break;
                }
                case 124: {
                    n5 = 254;
                    break;
                }
                case 125: {
                    n5 = 226;
                    break;
                }
                case 126: {
                    n5 = 198;
                    break;
                }
                case 127: {
                    n5 = 175;
                    break;
                }
                case 128: {
                    n5 = 29;
                    break;
                }
                case 129: {
                    n5 = 52;
                    break;
                }
                case 130: {
                    n5 = 69;
                    break;
                }
                case 131: {
                    n5 = 84;
                    break;
                }
                case 132: {
                    n5 = 19;
                    break;
                }
                case 133: {
                    n5 = 20;
                    break;
                }
                case 134: {
                    n5 = 149;
                    break;
                }
                case 135: {
                    n5 = 150;
                    break;
                }
                case 136: {
                    n5 = 169;
                    break;
                }
                case 137: {
                    n5 = 188;
                    break;
                }
                case 138: {
                    n5 = 135;
                    break;
                }
                case 139: {
                    n5 = 59;
                    break;
                }
                case 140: {
                    n5 = 4;
                    break;
                }
                case 141: {
                    n5 = 40;
                    break;
                }
                case 142: {
                    n5 = 104;
                    break;
                }
                case 143: {
                    n5 = 233;
                    break;
                }
                case 144: {
                    n5 = 83;
                    break;
                }
                case 145: {
                    n5 = 48;
                    break;
                }
                case 146: {
                    n5 = 66;
                    break;
                }
                case 147: {
                    n5 = 22;
                    break;
                }
                case 148: {
                    n5 = 177;
                    break;
                }
                case 149: {
                    n5 = 167;
                    break;
                }
                case 150: {
                    n5 = 136;
                    break;
                }
                case 151: {
                    n5 = 142;
                    break;
                }
                case 152: {
                    n5 = 1;
                    break;
                }
                case 153: {
                    n5 = 189;
                    break;
                }
                case 154: {
                    n5 = 230;
                    break;
                }
                case 155: {
                    n5 = 101;
                    break;
                }
                case 156: {
                    n5 = 26;
                    break;
                }
                case 157: {
                    n5 = 239;
                    break;
                }
                case 158: {
                    n5 = 205;
                    break;
                }
                case 159: {
                    n5 = 87;
                    break;
                }
                case 160: {
                    n5 = 64;
                    break;
                }
                case 161: {
                    n5 = 224;
                    break;
                }
                case 162: {
                    n5 = 35;
                    break;
                }
                case 163: {
                    n5 = 56;
                    break;
                }
                case 164: {
                    n5 = 39;
                    break;
                }
                case 165: {
                    n5 = 146;
                    break;
                }
                case 166: {
                    n5 = 216;
                    break;
                }
                case 167: {
                    n5 = 103;
                    break;
                }
                case 168: {
                    n5 = 234;
                    break;
                }
                case 169: {
                    n5 = 218;
                    break;
                }
                case 170: {
                    n5 = 67;
                    break;
                }
                case 171: {
                    n5 = 162;
                    break;
                }
                case 172: {
                    n5 = 183;
                    break;
                }
                case 173: {
                    n5 = 89;
                    break;
                }
                case 174: {
                    n5 = 252;
                    break;
                }
                case 175: {
                    n5 = 62;
                    break;
                }
                case 176: {
                    n5 = 242;
                    break;
                }
                case 177: {
                    n5 = 93;
                    break;
                }
                case 178: {
                    n5 = 202;
                    break;
                }
                case 179: {
                    n5 = 201;
                    break;
                }
                case 180: {
                    n5 = 71;
                    break;
                }
                case 181: {
                    n5 = 109;
                    break;
                }
                case 182: {
                    n5 = 132;
                    break;
                }
                case 183: {
                    n5 = 86;
                    break;
                }
                case 184: {
                    n5 = 240;
                    break;
                }
                case 185: {
                    n5 = 30;
                    break;
                }
                case 186: {
                    n5 = 222;
                    break;
                }
                case 187: {
                    n5 = 49;
                    break;
                }
                case 188: {
                    n5 = 124;
                    break;
                }
                case 189: {
                    n5 = 91;
                    break;
                }
                case 190: {
                    n5 = 130;
                    break;
                }
                case 191: {
                    n5 = 250;
                    break;
                }
                case 192: {
                    n5 = 166;
                    break;
                }
                case 193: {
                    n5 = 117;
                    break;
                }
                case 194: {
                    n5 = 159;
                    break;
                }
                case 195: {
                    n5 = 217;
                    break;
                }
                case 196: {
                    n5 = 25;
                    break;
                }
                case 197: {
                    n5 = 179;
                    break;
                }
                case 198: {
                    n5 = 3;
                    break;
                }
                case 199: {
                    n5 = 116;
                    break;
                }
                case 200: {
                    n5 = 208;
                    break;
                }
                case 201: {
                    n5 = 14;
                    break;
                }
                case 202: {
                    n5 = 247;
                    break;
                }
                case 203: {
                    n5 = 76;
                    break;
                }
                case 204: {
                    n5 = 80;
                    break;
                }
                case 205: {
                    n5 = 31;
                    break;
                }
                case 206: {
                    n5 = 102;
                    break;
                }
                case 207: {
                    n5 = 60;
                    break;
                }
                case 208: {
                    n5 = 220;
                    break;
                }
                case 209: {
                    n5 = 28;
                    break;
                }
                case 210: {
                    n5 = 144;
                    break;
                }
                case 211: {
                    n5 = 253;
                    break;
                }
                case 212: {
                    n5 = 191;
                    break;
                }
                case 213: {
                    n5 = 17;
                    break;
                }
                case 214: {
                    n5 = 10;
                    break;
                }
                case 215: {
                    n5 = 214;
                    break;
                }
                case 216: {
                    n5 = 0;
                    break;
                }
                case 217: {
                    n5 = 231;
                    break;
                }
                case 218: {
                    n5 = 55;
                    break;
                }
                case 219: {
                    n5 = 186;
                    break;
                }
                case 220: {
                    n5 = 85;
                    break;
                }
                case 221: {
                    n5 = 90;
                    break;
                }
                case 222: {
                    n5 = 174;
                    break;
                }
                case 223: {
                    n5 = 44;
                    break;
                }
                case 224: {
                    n5 = 180;
                    break;
                }
                case 225: {
                    n5 = 100;
                    break;
                }
                case 226: {
                    n5 = 133;
                    break;
                }
                case 227: {
                    n5 = 140;
                    break;
                }
                case 228: {
                    n5 = 12;
                    break;
                }
                case 229: {
                    n5 = 96;
                    break;
                }
                case 230: {
                    n5 = 143;
                    break;
                }
                case 231: {
                    n5 = 92;
                    break;
                }
                case 232: {
                    n5 = 57;
                    break;
                }
                case 233: {
                    n5 = 207;
                    break;
                }
                case 234: {
                    n5 = 24;
                    break;
                }
                case 235: {
                    n5 = 27;
                    break;
                }
                case 236: {
                    n5 = 158;
                    break;
                }
                case 237: {
                    n5 = 47;
                    break;
                }
                case 238: {
                    n5 = 121;
                    break;
                }
                case 239: {
                    n5 = 32;
                    break;
                }
                case 240: {
                    n5 = 206;
                    break;
                }
                case 241: {
                    n5 = 38;
                    break;
                }
                case 242: {
                    n5 = 209;
                    break;
                }
                case 243: {
                    n5 = 119;
                    break;
                }
                case 244: {
                    n5 = 127;
                    break;
                }
                case 245: {
                    n5 = 54;
                    break;
                }
                case 246: {
                    n5 = 79;
                    break;
                }
                case 247: {
                    n5 = 154;
                    break;
                }
                case 248: {
                    n5 = 170;
                    break;
                }
                case 249: {
                    n5 = 151;
                    break;
                }
                case 250: {
                    n5 = 173;
                    break;
                }
                case 251: {
                    n5 = 16;
                    break;
                }
                case 252: {
                    n5 = 212;
                    break;
                }
                case 253: {
                    n5 = 94;
                    break;
                }
                case 254: {
                    n5 = 248;
                    break;
                }
                default: {
                    n5 = 34;
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
            am9_0.J[n4] = new String(cArray).intern();
        }
        return J[n4];
    }

    public static void b(int n, int n2, int n3) {
        long l4 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)n3 << 48 >>> 48) ^ H;
        G = am9_0.a(-2060404341, 2060412723, (int)l4);
        y = am9_0.a(-2060404327, 2060416062, (int)l4);
        d = am9_0.a(-2060404345, 2060409176, (int)l4);
        o = am9_0.a(-2060404328, -2060405298, (int)l4);
        w = am9_0.a(-2060404347, 2060409973, (int)l4);
        i = am9_0.a(-2060404321, -2060413690, (int)l4);
        C = am9_0.a(-2060404329, -2060405759, (int)l4);
        l = am9_0.a(-2060404342, 2060392354, (int)l4);
        h = am9_0.a(-2060404325, 2060407767, (int)l4);
        E = am9_0.a(-2060404332, 2060409292, (int)l4);
        q = am9_0.a(-2060404326, -2060398374, (int)l4);
        a = am9_0.a(-2060404324, 2060390260, (int)l4);
        c = am9_0.a(-2060404333, 2060403722, (int)l4);
        am9_0.n = am9_0.a(-2060404340, -2060394634, (int)l4);
        p = am9_0.a(-2060404351, 2060396796, (int)l4);
        t = am9_0.a(-2060404344, 2060414605, (int)l4);
        s = am9_0.a(-2060404348, -2060398784, (int)l4);
        e = am9_0.a(-2060404322, -2060389978, (int)l4);
        k = am9_0.a(-2060404339, -2060417760, (int)l4);
        F = am9_0.a(-2060404323, -2060413526, (int)l4);
        B = am9_0.a(-2060404334, 2060406548, (int)l4);
        r = am9_0.a(-2060404331, -2060394564, (int)l4);
        D = am9_0.a(-2060404337, 2060411945, (int)l4);
        m = am9_0.a(-2060404338, -2060420400 - -((char)-31696), (int)l4);
        x = am9_0.a(-2060404343, -2060408669, (int)l4);
        b = am9_0.a(-2060404328, -2060405298, (int)l4);
        g = am9_0.a(-2060404328, -2060405298, (int)l4);
        A = am9_0.a(-2060404346, 2060413788, (int)l4);
        z = am9_0.a(-2060404335, -2060401888, (int)l4);
        u = am9_0.a(-2060404336, -2060388559, (int)l4);
        v = am9_0.a(-2060404330, 2060395849, (int)l4);
        f = am9_0.a(-2060404326, -2060398374, (int)l4);
        j = am9_0.a(-2060404324, 2060390260, (int)l4);
    }
}


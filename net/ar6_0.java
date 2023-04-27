/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.ar6
 */
public class ar6_0 {
    public static String f = "PrimedTnt";
    public static String X = "Mob";
    public static String m = "WitherBoss";
    public static String ag = "Wolf";
    public static String E = "Type";
    public static String L = "Skipping Entity with id ";
    private static String[] db;
    public static String q = "PigZombie";
    public static String H = "Giant";
    public static String J = "EntityHorse";
    public static String ak = "Spider";
    public static String A = "ThrownEnderpearl";
    public static String ah = "SnowMan";
    public static String af = "Type";
    public static String as = "Slime";
    public static String v = "Player";
    public static String y = "MushroomCow";
    public static String V = "Monster";
    private static long bb;
    public static String U = "LightningBolt";
    public static String R = "Squid";
    public static String F = "Skeleton";
    public static String at = "id";
    public static String p = "EyeOfEnderSignal";
    public static String ac = "Chicken";
    public static String al = "Cow";
    public static String T = "id";
    public static String x = "Skipping Entity with id ";
    public static String an = "Witch";
    public static String D = "Ghast";
    public static String ap = "CaveSpider";
    public static String c = "ItemFrame";
    public static String r = "Boat";
    public static String j = "Item";
    public static String aa = "Rabbit";
    public static String Y = "Bat";
    public static String l = "Zombie";
    public static String u = "Silverfish";
    public static String k = "Blaze";
    public static String s = "Guardian";
    public static String o = "WitherSkull";
    private static String[] cb;
    public static String ab = "XPOrb";
    public static String b = "VillagerGolem";
    public static String ar = "id";
    public static String a = "Enderman";
    public static String t = "Player";
    public static String W = "LightningBolt";
    public static String h = "ID is already registered: ";
    public static String Z = "Sheep";
    public static String O = "FireworksRocketEntity";
    public static String g = "Villager";
    public static String C = "SmallFireball";
    public static String G = "Snowball";
    public static String ad = "EnderCrystal";
    public static String B = "LeashKnot";
    public static String aq = "ThrownEgg";
    public static String P = "ThrownPotion";
    public static String ai = "ArmorStand";
    public static String am = "ID is already registered: ";
    public static String ae = "ThrownExpBottle";
    public static String e = "id";
    public static String M = "Fireball";
    public static String Q = "Pig";
    public static String aj = "Cannot register null clazz for id: ";
    public static String w = "LavaSlime";
    public static String d = "Endermite";
    public static String n = "EnderDragon";
    public static String S = "Creeper";
    public static String I = "Painting";
    public static String z = "FallingSand";
    public static String K = "Ozelot";
    public static String N = "Cannot register to reserved id: ";
    public static String ao = "Arrow";
    public static String i = "Minecart";

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        ar6_0.bb = a1c.a(499293266323942815L, 1342985599913051736L, null).a(187849765557674L);
        var8 = ar6_0.bb ^ 40236740641251L;
        v0 = var8 ^ 104515435304552L;
        var10_1 = v0 >>> 32;
        var12_2 = (int)(v0 << 32 >>> 32);
        var5_3 = new String[70];
        var3_4 = 0;
        var2_5 = "\u00b7\u00fb\u00b0KHr\u00d6=\u00b8\u00d9\u00cc\u0002q\u00a3\u0006n\u00d9L\u00a6\u0099_\u0004a\u00e0,\u007f\fT\u00d6\u00f7W\u0084\u0017\u00d5\u00b27l\u00f4\u0096\r\u00f5\u0093\u00cd\u00d9w!\u00f1u\u00be\u009e\u00b4\u0084q\u0018{\u00d6\u00ee+\u00d8c\u0087\u00d3\u00d0e\u00d7\u0004!\u0082\u0085)@\u00ef\u00d4\u00c0\u00cc\u0088z\u00a4\t\u00f9\u00f0g_G^1\u00e3\u00a4\u0004\u0004\u00caTI\tq\u0088S\u009c\u0010nR\u0095c\u0005\u00d9\u0011\u00f6\u008d+\u0007\u00b8\u00e7L\u008ao8\u00e9\t\u001a\u00b16\u000b\u00d2&\u00dd\u0015\u00cf\u000bh\u001a>\u00e5~\"`(E\u0083\u0006\u0006\u00bf\u00e6Z\u00bb\u00d3-\u0007\u009d\u00f4 \u001f\u001a\u0098\u00a7\u0018\u00e3N\u00fd8\u00ba\u0001\u00cb\u009fY\u00ec\u00e65\u0007\u00a4A\u00ed\u00d8w\u00c7\u00d3\u00ae\u00ea6\u00e8\n\u00be=\u0002s\u00c3\u00ae\u00bc\u0011\u00a0\u00da\buE#E\u00f9,\u0015\u008d\u0006\u0086\u009f:\u00ec^\u00a8\u0005\u007f\u00f1\u00f0\u0093\u0016\b4\u00aa\u0099{++`\u00d3\u000b\r\u00d0\u00b9\u00b1\u00990%\u00cdK\u0002Y\u000f\f\u00d7\u00fcw\u00e5\u0013\u00ec%\u00a3@\u00e2G\u00bb\u00f2t\u0005\u00b3un\u000en\u0003\u0091V\u00de\n\u0099\u0017+I\u00cb/~*\u0015e\b0[^*`\u00f0\u00dd,\u0005A\u0081\u00a5\u00b7<\u0005[\u0005\u00f6\u0011P\u0003\u00d6\u00acu\b8*&\u00eau\u00ca\n<\rJ^\u00c0\u00e0\b\u00aa\u00055\")kV]\u0006\u00e6\u00a3\u00ce\u00aaN\u00d1\u000bn\u00b1\u0085{\u000fC\u00df\u00cdk\u0099\u00b3\t#\u00f6\u0006u\u001a\u009e\u009f\u00c3q\u0004\u009bS\f\u00de#\\\u0003\u001f\u00c4\u001e^\u00ed\u00df_q\u00cc\u00e7\u00b8\b\u0003K\u00e3\u00bf\u0082Q\u001d4H9\u0015!\u00a6\u00fb\u0003\u0004\u0013R\u0013%&\t\u00b8\u00c4\u00c3\u0088\u00c6\u00b2\u00bb\u009b\u00fc\bZ/fC\u00a3\u00d1\u00ba\u0087\u0007\u00a9M\u00aaw\u00ddS;\u001a%25d\u00c0\u00f9\u00e8\u00eb\u0081(\u00ea\u0099xw\u00b7\f|\u00a6F\u00f5<\u00aa\u0088\u00dceb\n\u00ad\u00de9t\u00fd&cB\u00ee\u0003\u0005\u0083\u009co\u0002\u00e5\u0004\u009cg\u00ecX\u001a\u000e@P*l0}\u00d23\u000f\u00bc}\u00b2\u00eb\u00ee\u009fW\u00d4#\u00bb\u0090c\u001d\u00e5\u00d7E\u000b\u0010_Z\u00aa\u00e0\u00c9\u00de\b#\u00f2\u0006\n\n\u00fc\u00c5*\r\u009e\u0082\u001a*\u00be\t\u00a4\u00a4vB\u00de\u00fd\u00ca\u00a5P\u0005\u00d0)\u00d0\u00f1`\u0006(\u0092\u00efM\u00e4\u009c\u0002\u00f2L\u0003IG\u00a4\u0015\u00b7I\u00db\u008f\u0001FG\u00bd\u00042u\fVg$\u00c3\u00c1f\u00c3S\u00c9\b\u00e3\u00ba\u00fb\u0004\u00aei\u001b\u0090\u0007Q<\u00ad\u00d4Kso\r\u00e5G\u009dG\u0002\u007f\u00e4\u008a\u00b1\u00d3r\u00ac\u00d3\f\u008d\u0011\u00e9c\u0096\u00f7\u00100\u00ee\u00f5&\u0019\b\u00d6\u00c7\u0081^\u00c1r\u00c9\u00eb\u0005\u00ef\u009b|x\u009f\u0003\u0004\u00cb\u00d7 Ln\u001di^\u00eb\u00e5i^\u00a7\u00ec=\u00bcS\u0083 \u00e9\u00c8\u00d6\u00f8\u0017\u00cc\u00ed'\u0085\u008c}\u00f4\u00b2}\u00f9\u00e0\r\u0095\u0001\u00c1\u008b\u00f6k\u00c1<\u00b8\u00b7t\u00a1i\b!*\u00c6\u00e1\u00d9\u00e7#C\u0005.\u00df\u007f\u00e7\u00f6\u0010y]R&09Vv\u00e0\u00d9\u0001\u00b3h\u00e5*>\u0010[\u00862N\u00d8;Sr\u000f\u0005\u00fc\u00c4\u00d0>l\u00ab\t\u00b2\u00aa\u00ba\u00cc\u0082\u00f4<\u00abo";
        var4_6 = "\u00b7\u00fb\u00b0KHr\u00d6=\u00b8\u00d9\u00cc\u0002q\u00a3\u0006n\u00d9L\u00a6\u0099_\u0004a\u00e0,\u007f\fT\u00d6\u00f7W\u0084\u0017\u00d5\u00b27l\u00f4\u0096\r\u00f5\u0093\u00cd\u00d9w!\u00f1u\u00be\u009e\u00b4\u0084q\u0018{\u00d6\u00ee+\u00d8c\u0087\u00d3\u00d0e\u00d7\u0004!\u0082\u0085)@\u00ef\u00d4\u00c0\u00cc\u0088z\u00a4\t\u00f9\u00f0g_G^1\u00e3\u00a4\u0004\u0004\u00caTI\tq\u0088S\u009c\u0010nR\u0095c\u0005\u00d9\u0011\u00f6\u008d+\u0007\u00b8\u00e7L\u008ao8\u00e9\t\u001a\u00b16\u000b\u00d2&\u00dd\u0015\u00cf\u000bh\u001a>\u00e5~\"`(E\u0083\u0006\u0006\u00bf\u00e6Z\u00bb\u00d3-\u0007\u009d\u00f4 \u001f\u001a\u0098\u00a7\u0018\u00e3N\u00fd8\u00ba\u0001\u00cb\u009fY\u00ec\u00e65\u0007\u00a4A\u00ed\u00d8w\u00c7\u00d3\u00ae\u00ea6\u00e8\n\u00be=\u0002s\u00c3\u00ae\u00bc\u0011\u00a0\u00da\buE#E\u00f9,\u0015\u008d\u0006\u0086\u009f:\u00ec^\u00a8\u0005\u007f\u00f1\u00f0\u0093\u0016\b4\u00aa\u0099{++`\u00d3\u000b\r\u00d0\u00b9\u00b1\u00990%\u00cdK\u0002Y\u000f\f\u00d7\u00fcw\u00e5\u0013\u00ec%\u00a3@\u00e2G\u00bb\u00f2t\u0005\u00b3un\u000en\u0003\u0091V\u00de\n\u0099\u0017+I\u00cb/~*\u0015e\b0[^*`\u00f0\u00dd,\u0005A\u0081\u00a5\u00b7<\u0005[\u0005\u00f6\u0011P\u0003\u00d6\u00acu\b8*&\u00eau\u00ca\n<\rJ^\u00c0\u00e0\b\u00aa\u00055\")kV]\u0006\u00e6\u00a3\u00ce\u00aaN\u00d1\u000bn\u00b1\u0085{\u000fC\u00df\u00cdk\u0099\u00b3\t#\u00f6\u0006u\u001a\u009e\u009f\u00c3q\u0004\u009bS\f\u00de#\\\u0003\u001f\u00c4\u001e^\u00ed\u00df_q\u00cc\u00e7\u00b8\b\u0003K\u00e3\u00bf\u0082Q\u001d4H9\u0015!\u00a6\u00fb\u0003\u0004\u0013R\u0013%&\t\u00b8\u00c4\u00c3\u0088\u00c6\u00b2\u00bb\u009b\u00fc\bZ/fC\u00a3\u00d1\u00ba\u0087\u0007\u00a9M\u00aaw\u00ddS;\u001a%25d\u00c0\u00f9\u00e8\u00eb\u0081(\u00ea\u0099xw\u00b7\f|\u00a6F\u00f5<\u00aa\u0088\u00dceb\n\u00ad\u00de9t\u00fd&cB\u00ee\u0003\u0005\u0083\u009co\u0002\u00e5\u0004\u009cg\u00ecX\u001a\u000e@P*l0}\u00d23\u000f\u00bc}\u00b2\u00eb\u00ee\u009fW\u00d4#\u00bb\u0090c\u001d\u00e5\u00d7E\u000b\u0010_Z\u00aa\u00e0\u00c9\u00de\b#\u00f2\u0006\n\n\u00fc\u00c5*\r\u009e\u0082\u001a*\u00be\t\u00a4\u00a4vB\u00de\u00fd\u00ca\u00a5P\u0005\u00d0)\u00d0\u00f1`\u0006(\u0092\u00efM\u00e4\u009c\u0002\u00f2L\u0003IG\u00a4\u0015\u00b7I\u00db\u008f\u0001FG\u00bd\u00042u\fVg$\u00c3\u00c1f\u00c3S\u00c9\b\u00e3\u00ba\u00fb\u0004\u00aei\u001b\u0090\u0007Q<\u00ad\u00d4Kso\r\u00e5G\u009dG\u0002\u007f\u00e4\u008a\u00b1\u00d3r\u00ac\u00d3\f\u008d\u0011\u00e9c\u0096\u00f7\u00100\u00ee\u00f5&\u0019\b\u00d6\u00c7\u0081^\u00c1r\u00c9\u00eb\u0005\u00ef\u009b|x\u009f\u0003\u0004\u00cb\u00d7 Ln\u001di^\u00eb\u00e5i^\u00a7\u00ec=\u00bcS\u0083 \u00e9\u00c8\u00d6\u00f8\u0017\u00cc\u00ed'\u0085\u008c}\u00f4\u00b2}\u00f9\u00e0\r\u0095\u0001\u00c1\u008b\u00f6k\u00c1<\u00b8\u00b7t\u00a1i\b!*\u00c6\u00e1\u00d9\u00e7#C\u0005.\u00df\u007f\u00e7\u00f6\u0010y]R&09Vv\u00e0\u00d9\u0001\u00b3h\u00e5*>\u0010[\u00862N\u00d8;Sr\u000f\u0005\u00fc\u00c4\u00d0>l\u00ab\t\u00b2\u00aa\u00ba\u00cc\u0082\u00f4<\u00abo".length();
        var1_7 = 11;
        var0_8 = -1;
        block0: while (true) {
            block7: {
                v1 = ++var0_8;
                v2 = var2_5.substring(v1, v1 + var1_7).toCharArray();
                v3 = v2.length;
                var7_9 = 0;
                v4 = 73;
                v5 = v2;
                v6 = v3;
                if (v3 > 1) ** GOTO lbl58
                break block7;
                while (true) {
                    var2_5 = "O\u00a6\u00ff\u00c14\u00ce\u0004\u00d6\u00e7\u00dd0";
                    var4_6 = "O\u00a6\u00ff\u00c14\u00ce\u0004\u00d6\u00e7\u00dd0".length();
                    var1_7 = 6;
                    var0_8 = -1;
lbl32:
                    // 2 sources

                    while (true) {
                        v7 = ++var0_8;
                        v8 = var2_5.substring(v7, v7 + var1_7).toCharArray();
                        v9 = v8.length;
                        var7_9 = 0;
                        v10 = 30;
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
                v5[v13] = (char)(v5[v13] ^ (v4 ^ 94));
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
            v11[v15] = (char)(v11[v15] ^ (v10 ^ 94));
            ++var7_9;
            v10 = v10;
lbl78:
            // 2 sources

            v16 = v11;
            v12 = v12;
        } while (v12 > var7_9);
        var5_3[var3_4++] = new String(v16).intern();
        if ((var0_8 += var1_7) >= var4_6) {
            ar6_0.cb = var5_3;
            ar6_0.db = new String[70];
            ar6_0.b(var10_1, var12_2);
            return;
        }
        var1_7 = var2_5.charAt(var0_8);
        ** while (true)
    }

    public static void b(long l4, int n) {
        long l5 = (l4 << 32 | (long)n << 32 >>> 32) ^ bb;
        i = ar6_0.a(1036473579, 1036469911, (int)l5);
        z = ar6_0.a(1036473564, -1036501560 - -((char)-29503), (int)l5);
        p = ar6_0.a(1036473491, 1036475720, (int)l5);
        f = ar6_0.a(1036473569, -1036501560 - -((char)-19758), (int)l5);
        ak = ar6_0.a(1036473555, 1036501560 - (char)-22208, (int)l5);
        as = ar6_0.a(1036473578, 1036501560 - (char)-23133, (int)l5);
        N = ar6_0.a(1036473580, -1036471851, (int)l5);
        c = ar6_0.a(1036473591, 1036501560 - (char)-25723, (int)l5);
        o = ar6_0.a(1036473543, 1036473393, (int)l5);
        Q = ar6_0.a(1036473544, -1036501560 - -((char)-20669), (int)l5);
        am = ar6_0.a(1036473596, -1036477703, (int)l5);
        at = ar6_0.a(1036473570, 1036501560 - (char)-17573, (int)l5);
        ai = ar6_0.a(1036473536, -1036473842, (int)l5);
        Y = ar6_0.a(1036473551, 1036501560 - (char)-25440, (int)l5);
        L = ar6_0.a(1036473559, 1036474150, (int)l5);
        l = ar6_0.a(1036473567, 1036476383, (int)l5);
        W = ar6_0.a(1036473556, -1036477144, (int)l5);
        t = ar6_0.a(1036473571, 1036470960, (int)l5);
        S = ar6_0.a(1036473593, -1036501560 - -((char)-28603), (int)l5);
        ab = ar6_0.a(1036473563, 1036501560 - (char)-22983, (int)l5);
        aq = ar6_0.a(1036473560, 1036501560 - (char)-20981, (int)l5);
        ap = ar6_0.a(1036473595, 1036501560 - (char)-27825, (int)l5);
        ah = ar6_0.a(1036473574, -1036473569, (int)l5);
        V = ar6_0.a(1036473562, 1036501560 - (char)-27783, (int)l5);
        R = ar6_0.a(1036473548, -1036501560 - -((char)-31606), (int)l5);
        r = ar6_0.a(1036473492, -1036501560 - -((char)-32642), (int)l5);
        I = ar6_0.a(1036473582, -1036501560 - -((char)-26175), (int)l5);
        A = ar6_0.a(1036473488, 1036480467, (int)l5);
        ar = ar6_0.a(1036473552, 1036501560 - (char)-18640, (int)l5);
        q = ar6_0.a(1036473490, -1036483754, (int)l5);
        k = ar6_0.a(1036473489, 1036501560 - (char)-19716, (int)l5);
        ag = ar6_0.a(1036473554, 1036501560 - (char)-27327, (int)l5);
        e = ar6_0.a(1036473552, 1036501560 - (char)-18640, (int)l5);
        a = ar6_0.a(1036473546, -1036501560 - -((char)-31859), (int)l5);
        af = ar6_0.a(1036473597, 1036501560 - (char)-21186, (int)l5);
        M = ar6_0.a(1036473590, 1036501560 - (char)-19263, (int)l5);
        U = ar6_0.a(1036473583, -1036469505, (int)l5);
        D = ar6_0.a(1036473594, 1036472821, (int)l5);
        O = ar6_0.a(1036473572, 1036477312, (int)l5);
        d = ar6_0.a(1036473558, -1036474656, (int)l5);
        F = ar6_0.a(1036473539, -1036501560 - -((char)-21346), (int)l5);
        ar6_0.n = ar6_0.a(1036473599, -1036474328, (int)l5);
        B = ar6_0.a(1036473565, -1036483695, (int)l5);
        u = ar6_0.a(1036473598, -1036479918, (int)l5);
        an = ar6_0.a(1036473545, 1036501560 - (char)-25859, (int)l5);
        g = ar6_0.a(1036473550, 1036471853, (int)l5);
        ad = ar6_0.a(1036473576, -1036501560 - -((char)-27312), (int)l5);
        aa = ar6_0.a(1036473493, 1036476767, (int)l5);
        s = ar6_0.a(1036473540, -1036469783, (int)l5);
        v = ar6_0.a(1036473538, 1036475643, (int)l5);
        H = ar6_0.a(1036473541, 1036470300, (int)l5);
        y = ar6_0.a(1036473553, 1036501560 - (char)-20321, (int)l5);
        al = ar6_0.a(1036473573, 1036501560 - (char)-21797, (int)l5);
        ac = ar6_0.a(1036473566, 1036501560 - (char)-30551, (int)l5);
        C = ar6_0.a(1036473585, -1036501560 - -((char)-31676), (int)l5);
        j = ar6_0.a(1036473561, 1036501560 - (char)-28910, (int)l5);
        T = ar6_0.a(1036473552, 1036501560 - (char)-18640, (int)l5);
        X = ar6_0.a(1036473581, 1036501560 - (char)-18178, (int)l5);
        h = ar6_0.a(1036473592, 1036479317, (int)l5);
        E = ar6_0.a(1036473589, 1036501560 - (char)-18925, (int)l5);
        J = ar6_0.a(1036473587, -1036501560 - -((char)-20410), (int)l5);
        ao = ar6_0.a(1036473568, -1036476286, (int)l5);
        x = ar6_0.a(1036473537, -1036501560 - -((char)-29463), (int)l5);
        G = ar6_0.a(1036473575, 1036474801, (int)l5);
        w = ar6_0.a(1036473586, -1036501560 - -((char)-19676), (int)l5);
        b = ar6_0.a(1036473577, -1036476271, (int)l5);
        P = ar6_0.a(1036473557, -1036501560 - -((char)-22284), (int)l5);
        Z = ar6_0.a(1036473549, 1036481135, (int)l5);
        K = ar6_0.a(1036473584, -1036501560 - -((char)-27016), (int)l5);
        aj = ar6_0.a(1036473588, 1036501560 - (char)-28787, (int)l5);
        ae = ar6_0.a(1036473542, 1036483938, (int)l5);
        m = ar6_0.a(1036473547, -1036501560 - -((char)-24494), (int)l5);
    }

    private static String a(int n, int n2, int n3) {
        int n4 = (n ^ n3 ^ 0x435A) & 0xFFFF;
        if (db[n4] == null) {
            int n5;
            char[] cArray = cb[n4].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n5 = 56;
                    break;
                }
                case 1: {
                    n5 = 71;
                    break;
                }
                case 2: {
                    n5 = 17;
                    break;
                }
                case 3: {
                    n5 = 2;
                    break;
                }
                case 4: {
                    n5 = 125;
                    break;
                }
                case 5: {
                    n5 = 197;
                    break;
                }
                case 6: {
                    n5 = 78;
                    break;
                }
                case 7: {
                    n5 = 97;
                    break;
                }
                case 8: {
                    n5 = 79;
                    break;
                }
                case 9: {
                    n5 = 234;
                    break;
                }
                case 10: {
                    n5 = 196;
                    break;
                }
                case 11: {
                    n5 = 7;
                    break;
                }
                case 12: {
                    n5 = 108;
                    break;
                }
                case 13: {
                    n5 = 217;
                    break;
                }
                case 14: {
                    n5 = 152;
                    break;
                }
                case 15: {
                    n5 = 119;
                    break;
                }
                case 16: {
                    n5 = 23;
                    break;
                }
                case 17: {
                    n5 = 231;
                    break;
                }
                case 18: {
                    n5 = 227;
                    break;
                }
                case 19: {
                    n5 = 83;
                    break;
                }
                case 20: {
                    n5 = 183;
                    break;
                }
                case 21: {
                    n5 = 6;
                    break;
                }
                case 22: {
                    n5 = 16;
                    break;
                }
                case 23: {
                    n5 = 74;
                    break;
                }
                case 24: {
                    n5 = 149;
                    break;
                }
                case 25: {
                    n5 = 34;
                    break;
                }
                case 26: {
                    n5 = 109;
                    break;
                }
                case 27: {
                    n5 = 154;
                    break;
                }
                case 28: {
                    n5 = 194;
                    break;
                }
                case 29: {
                    n5 = 139;
                    break;
                }
                case 30: {
                    n5 = 246;
                    break;
                }
                case 31: {
                    n5 = 64;
                    break;
                }
                case 32: {
                    n5 = 18;
                    break;
                }
                case 33: {
                    n5 = 130;
                    break;
                }
                case 34: {
                    n5 = 132;
                    break;
                }
                case 35: {
                    n5 = 254;
                    break;
                }
                case 36: {
                    n5 = 72;
                    break;
                }
                case 37: {
                    n5 = 253;
                    break;
                }
                case 38: {
                    n5 = 162;
                    break;
                }
                case 39: {
                    n5 = 124;
                    break;
                }
                case 40: {
                    n5 = 94;
                    break;
                }
                case 41: {
                    n5 = 89;
                    break;
                }
                case 42: {
                    n5 = 240;
                    break;
                }
                case 43: {
                    n5 = 252;
                    break;
                }
                case 44: {
                    n5 = 35;
                    break;
                }
                case 45: {
                    n5 = 29;
                    break;
                }
                case 46: {
                    n5 = 235;
                    break;
                }
                case 47: {
                    n5 = 45;
                    break;
                }
                case 48: {
                    n5 = 210;
                    break;
                }
                case 49: {
                    n5 = 143;
                    break;
                }
                case 50: {
                    n5 = 99;
                    break;
                }
                case 51: {
                    n5 = 138;
                    break;
                }
                case 52: {
                    n5 = 239;
                    break;
                }
                case 53: {
                    n5 = 251;
                    break;
                }
                case 54: {
                    n5 = 156;
                    break;
                }
                case 55: {
                    n5 = 88;
                    break;
                }
                case 56: {
                    n5 = 220;
                    break;
                }
                case 57: {
                    n5 = 60;
                    break;
                }
                case 58: {
                    n5 = 4;
                    break;
                }
                case 59: {
                    n5 = 58;
                    break;
                }
                case 60: {
                    n5 = 39;
                    break;
                }
                case 61: {
                    n5 = 255;
                    break;
                }
                case 62: {
                    n5 = 67;
                    break;
                }
                case 63: {
                    n5 = 204;
                    break;
                }
                case 64: {
                    n5 = 151;
                    break;
                }
                case 65: {
                    n5 = 76;
                    break;
                }
                case 66: {
                    n5 = 155;
                    break;
                }
                case 67: {
                    n5 = 32;
                    break;
                }
                case 68: {
                    n5 = 86;
                    break;
                }
                case 69: {
                    n5 = 191;
                    break;
                }
                case 70: {
                    n5 = 127;
                    break;
                }
                case 71: {
                    n5 = 52;
                    break;
                }
                case 72: {
                    n5 = 50;
                    break;
                }
                case 73: {
                    n5 = 92;
                    break;
                }
                case 74: {
                    n5 = 198;
                    break;
                }
                case 75: {
                    n5 = 24;
                    break;
                }
                case 76: {
                    n5 = 186;
                    break;
                }
                case 77: {
                    n5 = 241;
                    break;
                }
                case 78: {
                    n5 = 14;
                    break;
                }
                case 79: {
                    n5 = 80;
                    break;
                }
                case 80: {
                    n5 = 212;
                    break;
                }
                case 81: {
                    n5 = 126;
                    break;
                }
                case 82: {
                    n5 = 10;
                    break;
                }
                case 83: {
                    n5 = 100;
                    break;
                }
                case 84: {
                    n5 = 215;
                    break;
                }
                case 85: {
                    n5 = 219;
                    break;
                }
                case 86: {
                    n5 = 223;
                    break;
                }
                case 87: {
                    n5 = 238;
                    break;
                }
                case 88: {
                    n5 = 142;
                    break;
                }
                case 89: {
                    n5 = 172;
                    break;
                }
                case 90: {
                    n5 = 81;
                    break;
                }
                case 91: {
                    n5 = 70;
                    break;
                }
                case 92: {
                    n5 = 228;
                    break;
                }
                case 93: {
                    n5 = 121;
                    break;
                }
                case 94: {
                    n5 = 185;
                    break;
                }
                case 95: {
                    n5 = 87;
                    break;
                }
                case 96: {
                    n5 = 20;
                    break;
                }
                case 97: {
                    n5 = 242;
                    break;
                }
                case 98: {
                    n5 = 188;
                    break;
                }
                case 99: {
                    n5 = 211;
                    break;
                }
                case 100: {
                    n5 = 11;
                    break;
                }
                case 101: {
                    n5 = 93;
                    break;
                }
                case 102: {
                    n5 = 116;
                    break;
                }
                case 103: {
                    n5 = 221;
                    break;
                }
                case 104: {
                    n5 = 104;
                    break;
                }
                case 105: {
                    n5 = 190;
                    break;
                }
                case 106: {
                    n5 = 167;
                    break;
                }
                case 107: {
                    n5 = 57;
                    break;
                }
                case 108: {
                    n5 = 110;
                    break;
                }
                case 109: {
                    n5 = 41;
                    break;
                }
                case 110: {
                    n5 = 30;
                    break;
                }
                case 111: {
                    n5 = 153;
                    break;
                }
                case 112: {
                    n5 = 113;
                    break;
                }
                case 113: {
                    n5 = 26;
                    break;
                }
                case 114: {
                    n5 = 75;
                    break;
                }
                case 115: {
                    n5 = 65;
                    break;
                }
                case 116: {
                    n5 = 160;
                    break;
                }
                case 117: {
                    n5 = 68;
                    break;
                }
                case 118: {
                    n5 = 91;
                    break;
                }
                case 119: {
                    n5 = 0;
                    break;
                }
                case 120: {
                    n5 = 9;
                    break;
                }
                case 121: {
                    n5 = 73;
                    break;
                }
                case 122: {
                    n5 = 36;
                    break;
                }
                case 123: {
                    n5 = 209;
                    break;
                }
                case 124: {
                    n5 = 129;
                    break;
                }
                case 125: {
                    n5 = 203;
                    break;
                }
                case 126: {
                    n5 = 165;
                    break;
                }
                case 127: {
                    n5 = 201;
                    break;
                }
                case 128: {
                    n5 = 177;
                    break;
                }
                case 129: {
                    n5 = 174;
                    break;
                }
                case 130: {
                    n5 = 166;
                    break;
                }
                case 131: {
                    n5 = 69;
                    break;
                }
                case 132: {
                    n5 = 229;
                    break;
                }
                case 133: {
                    n5 = 77;
                    break;
                }
                case 134: {
                    n5 = 170;
                    break;
                }
                case 135: {
                    n5 = 5;
                    break;
                }
                case 136: {
                    n5 = 243;
                    break;
                }
                case 137: {
                    n5 = 224;
                    break;
                }
                case 138: {
                    n5 = 59;
                    break;
                }
                case 139: {
                    n5 = 146;
                    break;
                }
                case 140: {
                    n5 = 214;
                    break;
                }
                case 141: {
                    n5 = 164;
                    break;
                }
                case 142: {
                    n5 = 184;
                    break;
                }
                case 143: {
                    n5 = 44;
                    break;
                }
                case 144: {
                    n5 = 230;
                    break;
                }
                case 145: {
                    n5 = 175;
                    break;
                }
                case 146: {
                    n5 = 216;
                    break;
                }
                case 147: {
                    n5 = 123;
                    break;
                }
                case 148: {
                    n5 = 171;
                    break;
                }
                case 149: {
                    n5 = 237;
                    break;
                }
                case 150: {
                    n5 = 249;
                    break;
                }
                case 151: {
                    n5 = 61;
                    break;
                }
                case 152: {
                    n5 = 117;
                    break;
                }
                case 153: {
                    n5 = 213;
                    break;
                }
                case 154: {
                    n5 = 180;
                    break;
                }
                case 155: {
                    n5 = 248;
                    break;
                }
                case 156: {
                    n5 = 51;
                    break;
                }
                case 157: {
                    n5 = 244;
                    break;
                }
                case 158: {
                    n5 = 133;
                    break;
                }
                case 159: {
                    n5 = 96;
                    break;
                }
                case 160: {
                    n5 = 37;
                    break;
                }
                case 161: {
                    n5 = 181;
                    break;
                }
                case 162: {
                    n5 = 161;
                    break;
                }
                case 163: {
                    n5 = 22;
                    break;
                }
                case 164: {
                    n5 = 189;
                    break;
                }
                case 165: {
                    n5 = 232;
                    break;
                }
                case 166: {
                    n5 = 43;
                    break;
                }
                case 167: {
                    n5 = 47;
                    break;
                }
                case 168: {
                    n5 = 98;
                    break;
                }
                case 169: {
                    n5 = 157;
                    break;
                }
                case 170: {
                    n5 = 225;
                    break;
                }
                case 171: {
                    n5 = 8;
                    break;
                }
                case 172: {
                    n5 = 107;
                    break;
                }
                case 173: {
                    n5 = 38;
                    break;
                }
                case 174: {
                    n5 = 135;
                    break;
                }
                case 175: {
                    n5 = 82;
                    break;
                }
                case 176: {
                    n5 = 199;
                    break;
                }
                case 177: {
                    n5 = 103;
                    break;
                }
                case 178: {
                    n5 = 48;
                    break;
                }
                case 179: {
                    n5 = 46;
                    break;
                }
                case 180: {
                    n5 = 178;
                    break;
                }
                case 181: {
                    n5 = 193;
                    break;
                }
                case 182: {
                    n5 = 136;
                    break;
                }
                case 183: {
                    n5 = 102;
                    break;
                }
                case 184: {
                    n5 = 54;
                    break;
                }
                case 185: {
                    n5 = 128;
                    break;
                }
                case 186: {
                    n5 = 105;
                    break;
                }
                case 187: {
                    n5 = 176;
                    break;
                }
                case 188: {
                    n5 = 187;
                    break;
                }
                case 189: {
                    n5 = 182;
                    break;
                }
                case 190: {
                    n5 = 137;
                    break;
                }
                case 191: {
                    n5 = 120;
                    break;
                }
                case 192: {
                    n5 = 150;
                    break;
                }
                case 193: {
                    n5 = 144;
                    break;
                }
                case 194: {
                    n5 = 168;
                    break;
                }
                case 195: {
                    n5 = 40;
                    break;
                }
                case 196: {
                    n5 = 15;
                    break;
                }
                case 197: {
                    n5 = 140;
                    break;
                }
                case 198: {
                    n5 = 66;
                    break;
                }
                case 199: {
                    n5 = 131;
                    break;
                }
                case 200: {
                    n5 = 200;
                    break;
                }
                case 201: {
                    n5 = 62;
                    break;
                }
                case 202: {
                    n5 = 12;
                    break;
                }
                case 203: {
                    n5 = 236;
                    break;
                }
                case 204: {
                    n5 = 25;
                    break;
                }
                case 205: {
                    n5 = 233;
                    break;
                }
                case 206: {
                    n5 = 222;
                    break;
                }
                case 207: {
                    n5 = 218;
                    break;
                }
                case 208: {
                    n5 = 250;
                    break;
                }
                case 209: {
                    n5 = 158;
                    break;
                }
                case 210: {
                    n5 = 173;
                    break;
                }
                case 211: {
                    n5 = 141;
                    break;
                }
                case 212: {
                    n5 = 1;
                    break;
                }
                case 213: {
                    n5 = 101;
                    break;
                }
                case 214: {
                    n5 = 208;
                    break;
                }
                case 215: {
                    n5 = 55;
                    break;
                }
                case 216: {
                    n5 = 159;
                    break;
                }
                case 217: {
                    n5 = 84;
                    break;
                }
                case 218: {
                    n5 = 148;
                    break;
                }
                case 219: {
                    n5 = 3;
                    break;
                }
                case 220: {
                    n5 = 206;
                    break;
                }
                case 221: {
                    n5 = 114;
                    break;
                }
                case 222: {
                    n5 = 111;
                    break;
                }
                case 223: {
                    n5 = 27;
                    break;
                }
                case 224: {
                    n5 = 247;
                    break;
                }
                case 225: {
                    n5 = 63;
                    break;
                }
                case 226: {
                    n5 = 245;
                    break;
                }
                case 227: {
                    n5 = 85;
                    break;
                }
                case 228: {
                    n5 = 169;
                    break;
                }
                case 229: {
                    n5 = 202;
                    break;
                }
                case 230: {
                    n5 = 53;
                    break;
                }
                case 231: {
                    n5 = 28;
                    break;
                }
                case 232: {
                    n5 = 31;
                    break;
                }
                case 233: {
                    n5 = 90;
                    break;
                }
                case 234: {
                    n5 = 106;
                    break;
                }
                case 235: {
                    n5 = 145;
                    break;
                }
                case 236: {
                    n5 = 95;
                    break;
                }
                case 237: {
                    n5 = 122;
                    break;
                }
                case 238: {
                    n5 = 192;
                    break;
                }
                case 239: {
                    n5 = 19;
                    break;
                }
                case 240: {
                    n5 = 207;
                    break;
                }
                case 241: {
                    n5 = 13;
                    break;
                }
                case 242: {
                    n5 = 118;
                    break;
                }
                case 243: {
                    n5 = 21;
                    break;
                }
                case 244: {
                    n5 = 147;
                    break;
                }
                case 245: {
                    n5 = 49;
                    break;
                }
                case 246: {
                    n5 = 112;
                    break;
                }
                case 247: {
                    n5 = 226;
                    break;
                }
                case 248: {
                    n5 = 115;
                    break;
                }
                case 249: {
                    n5 = 195;
                    break;
                }
                case 250: {
                    n5 = 179;
                    break;
                }
                case 251: {
                    n5 = 134;
                    break;
                }
                case 252: {
                    n5 = 205;
                    break;
                }
                case 253: {
                    n5 = 33;
                    break;
                }
                case 254: {
                    n5 = 163;
                    break;
                }
                default: {
                    n5 = 42;
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
            ar6_0.db[n4] = new String(cArray).intern();
        }
        return db[n4];
    }
}


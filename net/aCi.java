/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aCi {
    public static String a = "u_radius";
    public static String g = "u_direction";
    private static long l = a1c.a(3037895706707868458L, -5058885220533677413L, null).a(138235240890268L);
    public static String d = "color";
    private static String[] n;
    public static String e = "u_diffuse_sampler";
    public static String k = "u_kernel";
    public static String j = "u_other_sampler";
    public static String c = "colored";
    public static String h = "void main() {\n    gl_TexCoord[0] = gl_MultiTexCoord0;\n    gl_Position = gl_ModelViewProjectionMatrix * gl_Vertex;\n}";
    public static String f = "#version 120\n\nuniform sampler2D u_diffuse_sampler;\nuniform sampler2D u_other_sampler;\nuniform vec2 u_texel_size;\nuniform vec2 u_direction;\nuniform float u_radius;\nuniform float u_kernel[128];\nuniform float alpha;\nuniform bool colored;\nuniform vec3 color;\n\nvoid main(void)\n{\n    vec2 uv = gl_TexCoord[0].st;\n\n    if (u_direction.x == 0.0) {\n        float alpha = texture2D(u_other_sampler, uv).a;\n        if (alpha > 0.0) discard;\n    }\n\n    float half_radius = u_radius / 2.0;\n    vec4 pixel_color = texture2D(u_diffuse_sampler, uv);\n    pixel_color.rgb *= pixel_color.a;\n    pixel_color *= u_kernel[0];\n\n    for (float f = 1; f <= u_radius; f++) {\n        vec2 offset = f * u_texel_size * u_direction;\n        vec4 left = texture2D(u_diffuse_sampler, uv - offset);\n        vec4 right = texture2D(u_diffuse_sampler, uv + offset);\n\n        left.rgb *= left.a;\n        right.rgb *= right.a;\n        pixel_color += (left + right) * u_kernel[int(f)];\n    }\n\n    gl_FragColor = vec4(colored ? color.rgb : pixel_color.rgb / pixel_color.a, pixel_color.a * alpha);\n}\n";
    public static String i = "u_texel_size";
    public static String b = "alpha";
    private static String[] m;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var8 = aCi.l ^ 18380007423884L;
        v0 = var8 ^ 82339696909157L;
        var10_1 = (int)(v0 >>> 48);
        var11_2 = (int)(v0 << 16 >>> 48);
        var12_3 = (int)(v0 << 32 >>> 32);
        var5_4 = new String[11];
        var3_5 = 0;
        var2_6 = "jC\u00a5\u00ad\u0013\u0095\u00e7M\u00db\u00fc\u00d2Q\u0088\u00c4s\u00f7S\u00d9\u00ea\u00d6I9\u00fc\u00b86\u00cc'\u00a9TVk\u0084\u00b8\u00fe\u00d3t6cIn\u0004\u00a2^\u00fe\u00d3Z3\u00f6\u00e2x\u00be:'\u00b8=\u00bc\u00f5\u0097\u00c4\u0099\u008f'\u00ea\u009b\u00b2#X2\u0084$X\u0084\u00cf\u00fb\u00eev\u00c6\u0018;\u00be\u00db\u009c'`+\u00e3i\t\t\u00c0\\(\u001a\u0016\u00af\u00c3\u00c0\u0087\u00dd\u00b0\u00e6h\u001b\u00a0\u00eb\u0096\u00ce:\u00149~ek\u00d5u\b4a\u0016\u00daY\u00dav:\b\u000e\u00dfH\t\u00be#N\u00fd\u0005\u00fb\u00bf%9\u00f4\f\u00ea#\u00cb\u00968\u00db\u00dc\u00bb\r\u0093\u00e5\u0090\u0423\u00aayN\u00c6\u00b0(\u00a4y2\u0084st\u00b5r\u00deoP\u000b\u00e2\u001cs\u00c9\u00d9EhV\u0004\u0011E\u00dd\u00e9\u00ccGG\u0097cxw\u00f3\u00f4e\u001c@RATG4\u00bb\"ET\u00ae\u00fb\u00b5\u00948y\"\u00bf\u00c2\"\u00a5\u00be\u00ab}\u00ad\u0014D\u00fb\u00a5\u00cfM0\u00f5\u00b4\u00e8\u008f\u00cc\u00b8\u0087xN\\m\u00b9\u00bd1\u00c6F3F\u008d\u00ed$?\u00fa\u00dc&\u009e\u0086_\u00c2\u00cc4\u00d4\u00141|\u0082\u000b\u009e\u00f4\u00fe\u0082NVG\u00d2QB\u00a5*\u00ac\u001bz40\u0000\u00f8Y\u009b\u00b4\u0098\u00f4\u00bf\u0097\u008d\u00feX\u00ac\u00bdi\u00bf6\u00bd\u001aG\u000f\u0014B\u00b7\u0080\u00b9=\u009aK(\u008e=&\u0011\u00d72\u00fc7\u00ff\rqJ\u000b\u00cc\u00ea\u00f9\u001d\u009f\u00caE\u0001\u00dbT\u00cf{\u00a4\u0099% \u0003\u00eb\u001f}&\u00a5\"\u00a3A\t\u00f4\u00f7\u00a1\u009b\u00d9v\u00ed<\u00e9?\u00b6\u007f\u009f\u00a6\u00a9\u00aa?\u00b3\u00f0sc\u00b2\u00bai6\u00c3G\u00c0N\u00a3\u00a1\u00d4|\u00c9>e\fmk-\u001f6\u00cc'U;\u00b9\u00e6\u00ba\"AQ\u00a0\u00ec9X\u009a\u0004&~E\u00de\u0018\u00bb\u00bf\u0011\u009d\u00a4\u001f\u0017\u00a5\nq\u00efiJ:y\u0015\be\u00f6-SZ|i\u001es\u0086<)\u00f6\u00d2\u00a8.s\u0019r^\u009d\u00eeq\u00c5\u0015\u00a4\u001e(&PR7%\u00db\u0083\u00f5\u0097\u001a&\u0016\u008f^\u00ef\u00f4\u001c\u0097:\u00ad\u00f1\\7\u0090{\\O\u0012\u0080\u00ed\u00d6)\u00c8k\u0014\u009aL\u0097\u00db\u00f2Fy\u000f\u00c8i\u008a\u00a9\u009e{\u008b\u0082\u008c\u008f\u008a\u008d\u0002v\u000bO\u00b5P\u008d\u00a1\u00cc\u009f\u00d4\u00f9'ts\u008d!\u00eeeO\u00da\u001f\u00e8{q\"\u00b9\u0098\b\f\u00f6\u00b3\u001e\u001f*\u0087\u00fa>\u009b\u0095s\u008fI6\u00c1D\n\u000e=\u00a3YX\u00f4\u0018\u00e9>\u00d7\u000eY\u00c3k\u0014\u0019:\u00c7\u009eE\u00ac\u00abN*a\u00e4\u00e8\u00937\u0093\u00ae\u00dat\u009f\u009a\u00bf\u00afT\u00c0BJ[Dy\u00154\u00d2\u001e(Z\u000b\u0093\u0082\u00d3\u007fWB\u00063'^\u0013fT\u00f1Q\u00f7\u00cb\u00ee\u0013\u00a50\u0093\u00c1\u0085\u00b9=\u00ce\u00b18\u00b8\u00a4\u00f6\u00d9L\u0080q\u00b0fE8\u00ad:x\u00c5(\u00c5Q4\u00ad\u00ab\u00fb\u008c\u0006\u00b5{R\u00c2\u00ab\"l\u00ac\u00cb\u0016\u008fqiB`\u00df\u00d0\u00c4\u0005o\u00928PBB\u008f\u00e9e&\u00ae\u00dc\u00ed\u00ce\u009a\u00c2f\u00b1f\u00b9A\u001e\u00b6>\u00d6\u00e7\u00b6\u00d5>|\u00b0\u0090\u00b9\u00b3/\u00b0\u00c8\u00d3\u00b1\u001e\u00c5GaC~h\u00a2c\u0091\u00e8\u00e9\u00dd\u00bbY7\u0005\u00d0\u00c2ZE=d\u001f\u0099\u00f2\u0011\u00fdBS\u0019\u001e\u008e\u0098)|m'\f \u0095KS\u00e8\u00bd\u00fa6\u00ccBV\u0006\u0095a\u00e5~\u0013\u00e9v\u00c4o\u00ce\u00a2F\u0082\u0090:b\u00df>b\u00c9\u008f\u00c7n7\u001a\u0085\u0014\u00e4o\rF\u00f3\u00c8C>\u00affg\u00db3\u00b9j\u00ef\u00aa\u00d9\u00da\u00f0\u000b\u00d4e;\u00905\u0096\u009b\u00eb\u00cbwh:\u00a5e\u0001\u00fdX\u0018|\u0012Uesr\u0011\u00c5\u00bc\u00a0\u00ebj\u00be\u0018\u00ab\u00be\u00e5\u0088\u0014\u00b0FD\u00c8\u00b5>'#\u00ff\u00cf\u00d4\u001e\u00f8\u0087\u0007\u00baqW\u00f9\u0088~\t\r\u00ff\u001b\u00c8\u00cd\u0086\u00a5b]\u0095\u001c\u00b3\u009f\n\u008dU\u000fF\u00b26_\u001d.B\u00e0\u00b7\u008d\u00a8\u00e4G\u007f\u0093(ho\u00a4[QTu\"\u000f\u0080\u00b3\u0010K%\u00f8@\u0004\u00a3\u00ab\u008d\u001b)\u00ea\u001aN\u0080\u00f4\u00dd\u001c\u009c\u00fe\u00c7S\u007fG\u00a1\u0011M\u0006\u0012$\u00efe\u0087\u00b5\u0018\u00f0\u0080\u00e8\u00a3\u0085\u0018\u00fd\u0094c\u00adsBU\u008d\u00aa\u00a94\u0012\u00faM`M\u00f4\u008c\u000b_\u00ca\u00b9Y\n\f\u0086 X\u0013\u0088\u00e6\u00b6\u0097\u00ffl\u0002\u008d`\u00dd9_`\u0000\u008c\u00a2b\u00d0\u0095\u00b1\u00e06!\u00e1\u00e3\u009d\u00ea\u00a8\u0002\u0000\u009c\u0088\u00be]\u00df\u0004\u00c6\u00baT\u001a\u0007N\u00c8\u000fq\u00b9[\u00b0Ay\u0015\be\u00a0hF]\u00bc\u008euo\u00f89\u00c0}\u00d6\u00ff\u00dd(\u00f4o\u0015\u0086)\u00f2X\u0082\u00dem\u00c4#f\u0088eYO..z~\u00a9\u001ax\u00c7\u0095\u0092\u00e0\u008cF\u0098`L\u00ad\u00be\u00d4/\u00df\u00ad<\u0014\u001e\u00fa\u001f\r\u00abf\u00d4O\u00849\u000e\u00c2\u00ed\u00a6sf-\u0018\u0015b\u0006\u0088zT\u00adTQ\u00fe\u00a8\u00ea\u00fc\u00f7[e'\u00bb\u00b6\u00c8\u00a4Y\u00ba\u001d;\u00bb\u00ef\u0010u\u00d5\u000fw\u00fa\u00ecG\u00a5\u00bd\u0093\u00acG|B\u0000\u00c5)&\u00d8\u00c1&\u00a1J\u0097\u00a8\u00bf\u0087L\b)Iv\u00d3\u0097\u0084\u00bc\u008a\u007f\u0097\u0098\u00ed\u00bc\u001c\u008fE\u00dcm3\u00c9\u008e\u009dp}\u0010\u0096\u00b2\u00ee\u00d9\u000e\u00fd\u00b6\u00fa\u0011w3h\u0098@\u0094\u0017\u001dX\u00d8\u0092\r\u0087\\\n\u0094\u00eb\u000f\u00b4\u00dd\u001bXJ1\u009e\u00e6\u00980@\u00f8\u0001\u00c4\u00e5\u0005\u00d1\t>\u008b\u001b";
        var4_7 = "jC\u00a5\u00ad\u0013\u0095\u00e7M\u00db\u00fc\u00d2Q\u0088\u00c4s\u00f7S\u00d9\u00ea\u00d6I9\u00fc\u00b86\u00cc'\u00a9TVk\u0084\u00b8\u00fe\u00d3t6cIn\u0004\u00a2^\u00fe\u00d3Z3\u00f6\u00e2x\u00be:'\u00b8=\u00bc\u00f5\u0097\u00c4\u0099\u008f'\u00ea\u009b\u00b2#X2\u0084$X\u0084\u00cf\u00fb\u00eev\u00c6\u0018;\u00be\u00db\u009c'`+\u00e3i\t\t\u00c0\\(\u001a\u0016\u00af\u00c3\u00c0\u0087\u00dd\u00b0\u00e6h\u001b\u00a0\u00eb\u0096\u00ce:\u00149~ek\u00d5u\b4a\u0016\u00daY\u00dav:\b\u000e\u00dfH\t\u00be#N\u00fd\u0005\u00fb\u00bf%9\u00f4\f\u00ea#\u00cb\u00968\u00db\u00dc\u00bb\r\u0093\u00e5\u0090\u0423\u00aayN\u00c6\u00b0(\u00a4y2\u0084st\u00b5r\u00deoP\u000b\u00e2\u001cs\u00c9\u00d9EhV\u0004\u0011E\u00dd\u00e9\u00ccGG\u0097cxw\u00f3\u00f4e\u001c@RATG4\u00bb\"ET\u00ae\u00fb\u00b5\u00948y\"\u00bf\u00c2\"\u00a5\u00be\u00ab}\u00ad\u0014D\u00fb\u00a5\u00cfM0\u00f5\u00b4\u00e8\u008f\u00cc\u00b8\u0087xN\\m\u00b9\u00bd1\u00c6F3F\u008d\u00ed$?\u00fa\u00dc&\u009e\u0086_\u00c2\u00cc4\u00d4\u00141|\u0082\u000b\u009e\u00f4\u00fe\u0082NVG\u00d2QB\u00a5*\u00ac\u001bz40\u0000\u00f8Y\u009b\u00b4\u0098\u00f4\u00bf\u0097\u008d\u00feX\u00ac\u00bdi\u00bf6\u00bd\u001aG\u000f\u0014B\u00b7\u0080\u00b9=\u009aK(\u008e=&\u0011\u00d72\u00fc7\u00ff\rqJ\u000b\u00cc\u00ea\u00f9\u001d\u009f\u00caE\u0001\u00dbT\u00cf{\u00a4\u0099% \u0003\u00eb\u001f}&\u00a5\"\u00a3A\t\u00f4\u00f7\u00a1\u009b\u00d9v\u00ed<\u00e9?\u00b6\u007f\u009f\u00a6\u00a9\u00aa?\u00b3\u00f0sc\u00b2\u00bai6\u00c3G\u00c0N\u00a3\u00a1\u00d4|\u00c9>e\fmk-\u001f6\u00cc'U;\u00b9\u00e6\u00ba\"AQ\u00a0\u00ec9X\u009a\u0004&~E\u00de\u0018\u00bb\u00bf\u0011\u009d\u00a4\u001f\u0017\u00a5\nq\u00efiJ:y\u0015\be\u00f6-SZ|i\u001es\u0086<)\u00f6\u00d2\u00a8.s\u0019r^\u009d\u00eeq\u00c5\u0015\u00a4\u001e(&PR7%\u00db\u0083\u00f5\u0097\u001a&\u0016\u008f^\u00ef\u00f4\u001c\u0097:\u00ad\u00f1\\7\u0090{\\O\u0012\u0080\u00ed\u00d6)\u00c8k\u0014\u009aL\u0097\u00db\u00f2Fy\u000f\u00c8i\u008a\u00a9\u009e{\u008b\u0082\u008c\u008f\u008a\u008d\u0002v\u000bO\u00b5P\u008d\u00a1\u00cc\u009f\u00d4\u00f9'ts\u008d!\u00eeeO\u00da\u001f\u00e8{q\"\u00b9\u0098\b\f\u00f6\u00b3\u001e\u001f*\u0087\u00fa>\u009b\u0095s\u008fI6\u00c1D\n\u000e=\u00a3YX\u00f4\u0018\u00e9>\u00d7\u000eY\u00c3k\u0014\u0019:\u00c7\u009eE\u00ac\u00abN*a\u00e4\u00e8\u00937\u0093\u00ae\u00dat\u009f\u009a\u00bf\u00afT\u00c0BJ[Dy\u00154\u00d2\u001e(Z\u000b\u0093\u0082\u00d3\u007fWB\u00063'^\u0013fT\u00f1Q\u00f7\u00cb\u00ee\u0013\u00a50\u0093\u00c1\u0085\u00b9=\u00ce\u00b18\u00b8\u00a4\u00f6\u00d9L\u0080q\u00b0fE8\u00ad:x\u00c5(\u00c5Q4\u00ad\u00ab\u00fb\u008c\u0006\u00b5{R\u00c2\u00ab\"l\u00ac\u00cb\u0016\u008fqiB`\u00df\u00d0\u00c4\u0005o\u00928PBB\u008f\u00e9e&\u00ae\u00dc\u00ed\u00ce\u009a\u00c2f\u00b1f\u00b9A\u001e\u00b6>\u00d6\u00e7\u00b6\u00d5>|\u00b0\u0090\u00b9\u00b3/\u00b0\u00c8\u00d3\u00b1\u001e\u00c5GaC~h\u00a2c\u0091\u00e8\u00e9\u00dd\u00bbY7\u0005\u00d0\u00c2ZE=d\u001f\u0099\u00f2\u0011\u00fdBS\u0019\u001e\u008e\u0098)|m'\f \u0095KS\u00e8\u00bd\u00fa6\u00ccBV\u0006\u0095a\u00e5~\u0013\u00e9v\u00c4o\u00ce\u00a2F\u0082\u0090:b\u00df>b\u00c9\u008f\u00c7n7\u001a\u0085\u0014\u00e4o\rF\u00f3\u00c8C>\u00affg\u00db3\u00b9j\u00ef\u00aa\u00d9\u00da\u00f0\u000b\u00d4e;\u00905\u0096\u009b\u00eb\u00cbwh:\u00a5e\u0001\u00fdX\u0018|\u0012Uesr\u0011\u00c5\u00bc\u00a0\u00ebj\u00be\u0018\u00ab\u00be\u00e5\u0088\u0014\u00b0FD\u00c8\u00b5>'#\u00ff\u00cf\u00d4\u001e\u00f8\u0087\u0007\u00baqW\u00f9\u0088~\t\r\u00ff\u001b\u00c8\u00cd\u0086\u00a5b]\u0095\u001c\u00b3\u009f\n\u008dU\u000fF\u00b26_\u001d.B\u00e0\u00b7\u008d\u00a8\u00e4G\u007f\u0093(ho\u00a4[QTu\"\u000f\u0080\u00b3\u0010K%\u00f8@\u0004\u00a3\u00ab\u008d\u001b)\u00ea\u001aN\u0080\u00f4\u00dd\u001c\u009c\u00fe\u00c7S\u007fG\u00a1\u0011M\u0006\u0012$\u00efe\u0087\u00b5\u0018\u00f0\u0080\u00e8\u00a3\u0085\u0018\u00fd\u0094c\u00adsBU\u008d\u00aa\u00a94\u0012\u00faM`M\u00f4\u008c\u000b_\u00ca\u00b9Y\n\f\u0086 X\u0013\u0088\u00e6\u00b6\u0097\u00ffl\u0002\u008d`\u00dd9_`\u0000\u008c\u00a2b\u00d0\u0095\u00b1\u00e06!\u00e1\u00e3\u009d\u00ea\u00a8\u0002\u0000\u009c\u0088\u00be]\u00df\u0004\u00c6\u00baT\u001a\u0007N\u00c8\u000fq\u00b9[\u00b0Ay\u0015\be\u00a0hF]\u00bc\u008euo\u00f89\u00c0}\u00d6\u00ff\u00dd(\u00f4o\u0015\u0086)\u00f2X\u0082\u00dem\u00c4#f\u0088eYO..z~\u00a9\u001ax\u00c7\u0095\u0092\u00e0\u008cF\u0098`L\u00ad\u00be\u00d4/\u00df\u00ad<\u0014\u001e\u00fa\u001f\r\u00abf\u00d4O\u00849\u000e\u00c2\u00ed\u00a6sf-\u0018\u0015b\u0006\u0088zT\u00adTQ\u00fe\u00a8\u00ea\u00fc\u00f7[e'\u00bb\u00b6\u00c8\u00a4Y\u00ba\u001d;\u00bb\u00ef\u0010u\u00d5\u000fw\u00fa\u00ecG\u00a5\u00bd\u0093\u00acG|B\u0000\u00c5)&\u00d8\u00c1&\u00a1J\u0097\u00a8\u00bf\u0087L\b)Iv\u00d3\u0097\u0084\u00bc\u008a\u007f\u0097\u0098\u00ed\u00bc\u001c\u008fE\u00dcm3\u00c9\u008e\u009dp}\u0010\u0096\u00b2\u00ee\u00d9\u000e\u00fd\u00b6\u00fa\u0011w3h\u0098@\u0094\u0017\u001dX\u00d8\u0092\r\u0087\\\n\u0094\u00eb\u000f\u00b4\u00dd\u001bXJ1\u009e\u00e6\u00980@\u00f8\u0001\u00c4\u00e5\u0005\u00d1\t>\u008b\u001b".length();
        var1_8 = 115;
        var0_9 = -1;
        block0: while (true) {
            block7: {
                v1 = ++var0_9;
                v2 = var2_6.substring(v1, v1 + var1_8).toCharArray();
                v3 = v2.length;
                var7_10 = 0;
                v4 = 49;
                v5 = v2;
                v6 = v3;
                if (v3 > 1) ** GOTO lbl59
                break block7;
                while (true) {
                    var2_6 = "\u00ae\u0082\u0013\u0002\u00ae\u009e\u00d1\u000b\u0083\u00bcj\u00f5\u0088\u00a6\u0012\u00a3\u00bcD\u0002";
                    var4_7 = "\u00ae\u0082\u0013\u0002\u00ae\u009e\u00d1\u000b\u0083\u00bcj\u00f5\u0088\u00a6\u0012\u00a3\u00bcD\u0002".length();
                    var1_8 = 7;
                    var0_9 = -1;
lbl33:
                    // 2 sources

                    while (true) {
                        v7 = ++var0_9;
                        v8 = var2_6.substring(v7, v7 + var1_8).toCharArray();
                        v9 = v8.length;
                        var7_10 = 0;
                        v10 = 103;
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
                v5[v13] = (char)(v5[v13] ^ (v4 ^ 75));
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
            v11[v15] = (char)(v11[v15] ^ (v10 ^ 75));
            ++var7_10;
            v10 = v10;
lbl79:
            // 2 sources

            v16 = v11;
            v12 = v12;
        } while (v12 > var7_10);
        var5_4[var3_5++] = new String(v16).intern();
        if ((var0_9 += var1_8) >= var4_7) {
            aCi.m = var5_4;
            aCi.n = new String[11];
            aCi.b((short)var10_1, (short)var11_2, var12_3);
            return;
        }
        var1_8 = var2_6.charAt(var0_9);
        ** while (true)
    }

    public static void b(short s, short s3, int n) {
        long l4 = ((long)s << 48 | (long)s3 << 48 >>> 16 | (long)n << 32 >>> 32) ^ l;
        e = aCi.a(-1504945740 - -((char)-22231), 1504814670 + (char)-9629, (int)l4);
        i = aCi.a(-1504945740 - -((char)-22229), 1504814670 + (char)-1490, (int)l4);
        j = aCi.a(-1504945740 - -((char)-22232), 1504945740 - (char)-17725, (int)l4);
        g = aCi.a(-1504945740 - -((char)-22243), -1504945740 - -((char)-20657), (int)l4);
        d = aCi.a(-1504945740 - -((char)-22236), 1504814670 + (char)-3674, (int)l4);
        b = aCi.a(-1504945740 - -((char)-22241), 1504945740 - (char)-7915, (int)l4);
        k = aCi.a(-1504945740 - -((char)-22235), -1504814670 + -((char)-5145), (int)l4);
        h = aCi.a(-1504945740 - -((char)-22233), -1504945740 - -((char)-4365), (int)l4);
        c = aCi.a(-1504945740 - -((char)-22242), 1504945740 - (char)-7440, (int)l4);
        a = aCi.a(-1504945740 - -((char)-22234), 1504945740 - (char)-7190, (int)l4);
        f = aCi.a(-1504945740 - -((char)-22230), -1504945740 - -((char)-21807), (int)l4);
    }

    private static String a(int n, int n2, int n3) {
        int n4 = (n ^ n3 ^ 0xFFFFA632) & 0xFFFF;
        if (aCi.n[n4] == null) {
            int n5;
            char[] cArray = m[n4].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n5 = 75;
                    break;
                }
                case 1: {
                    n5 = 117;
                    break;
                }
                case 2: {
                    n5 = 225;
                    break;
                }
                case 3: {
                    n5 = 189;
                    break;
                }
                case 4: {
                    n5 = 24;
                    break;
                }
                case 5: {
                    n5 = 28;
                    break;
                }
                case 6: {
                    n5 = 147;
                    break;
                }
                case 7: {
                    n5 = 109;
                    break;
                }
                case 8: {
                    n5 = 42;
                    break;
                }
                case 9: {
                    n5 = 119;
                    break;
                }
                case 10: {
                    n5 = 235;
                    break;
                }
                case 11: {
                    n5 = 118;
                    break;
                }
                case 12: {
                    n5 = 101;
                    break;
                }
                case 13: {
                    n5 = 224;
                    break;
                }
                case 14: {
                    n5 = 215;
                    break;
                }
                case 15: {
                    n5 = 30;
                    break;
                }
                case 16: {
                    n5 = 232;
                    break;
                }
                case 17: {
                    n5 = 216;
                    break;
                }
                case 18: {
                    n5 = 167;
                    break;
                }
                case 19: {
                    n5 = 200;
                    break;
                }
                case 20: {
                    n5 = 14;
                    break;
                }
                case 21: {
                    n5 = 19;
                    break;
                }
                case 22: {
                    n5 = 194;
                    break;
                }
                case 23: {
                    n5 = 93;
                    break;
                }
                case 24: {
                    n5 = 69;
                    break;
                }
                case 25: {
                    n5 = 164;
                    break;
                }
                case 26: {
                    n5 = 236;
                    break;
                }
                case 27: {
                    n5 = 5;
                    break;
                }
                case 28: {
                    n5 = 26;
                    break;
                }
                case 29: {
                    n5 = 61;
                    break;
                }
                case 30: {
                    n5 = 152;
                    break;
                }
                case 31: {
                    n5 = 243;
                    break;
                }
                case 32: {
                    n5 = 74;
                    break;
                }
                case 33: {
                    n5 = 57;
                    break;
                }
                case 34: {
                    n5 = 156;
                    break;
                }
                case 35: {
                    n5 = 138;
                    break;
                }
                case 36: {
                    n5 = 38;
                    break;
                }
                case 37: {
                    n5 = 226;
                    break;
                }
                case 38: {
                    n5 = 143;
                    break;
                }
                case 39: {
                    n5 = 11;
                    break;
                }
                case 40: {
                    n5 = 140;
                    break;
                }
                case 41: {
                    n5 = 248;
                    break;
                }
                case 42: {
                    n5 = 241;
                    break;
                }
                case 43: {
                    n5 = 146;
                    break;
                }
                case 44: {
                    n5 = 161;
                    break;
                }
                case 45: {
                    n5 = 237;
                    break;
                }
                case 46: {
                    n5 = 89;
                    break;
                }
                case 47: {
                    n5 = 160;
                    break;
                }
                case 48: {
                    n5 = 242;
                    break;
                }
                case 49: {
                    n5 = 46;
                    break;
                }
                case 50: {
                    n5 = 137;
                    break;
                }
                case 51: {
                    n5 = 173;
                    break;
                }
                case 52: {
                    n5 = 196;
                    break;
                }
                case 53: {
                    n5 = 233;
                    break;
                }
                case 54: {
                    n5 = 65;
                    break;
                }
                case 55: {
                    n5 = 102;
                    break;
                }
                case 56: {
                    n5 = 227;
                    break;
                }
                case 57: {
                    n5 = 3;
                    break;
                }
                case 58: {
                    n5 = 84;
                    break;
                }
                case 59: {
                    n5 = 39;
                    break;
                }
                case 60: {
                    n5 = 44;
                    break;
                }
                case 61: {
                    n5 = 162;
                    break;
                }
                case 62: {
                    n5 = 166;
                    break;
                }
                case 63: {
                    n5 = 191;
                    break;
                }
                case 64: {
                    n5 = 183;
                    break;
                }
                case 65: {
                    n5 = 50;
                    break;
                }
                case 66: {
                    n5 = 190;
                    break;
                }
                case 67: {
                    n5 = 228;
                    break;
                }
                case 68: {
                    n5 = 104;
                    break;
                }
                case 69: {
                    n5 = 148;
                    break;
                }
                case 70: {
                    n5 = 141;
                    break;
                }
                case 71: {
                    n5 = 197;
                    break;
                }
                case 72: {
                    n5 = 7;
                    break;
                }
                case 73: {
                    n5 = 219;
                    break;
                }
                case 74: {
                    n5 = 81;
                    break;
                }
                case 75: {
                    n5 = 2;
                    break;
                }
                case 76: {
                    n5 = 116;
                    break;
                }
                case 77: {
                    n5 = 177;
                    break;
                }
                case 78: {
                    n5 = 80;
                    break;
                }
                case 79: {
                    n5 = 206;
                    break;
                }
                case 80: {
                    n5 = 105;
                    break;
                }
                case 81: {
                    n5 = 182;
                    break;
                }
                case 82: {
                    n5 = 72;
                    break;
                }
                case 83: {
                    n5 = 179;
                    break;
                }
                case 84: {
                    n5 = 60;
                    break;
                }
                case 85: {
                    n5 = 169;
                    break;
                }
                case 86: {
                    n5 = 249;
                    break;
                }
                case 87: {
                    n5 = 135;
                    break;
                }
                case 88: {
                    n5 = 10;
                    break;
                }
                case 89: {
                    n5 = 90;
                    break;
                }
                case 90: {
                    n5 = 106;
                    break;
                }
                case 91: {
                    n5 = 9;
                    break;
                }
                case 92: {
                    n5 = 144;
                    break;
                }
                case 93: {
                    n5 = 157;
                    break;
                }
                case 94: {
                    n5 = 51;
                    break;
                }
                case 95: {
                    n5 = 97;
                    break;
                }
                case 96: {
                    n5 = 71;
                    break;
                }
                case 97: {
                    n5 = 37;
                    break;
                }
                case 98: {
                    n5 = 99;
                    break;
                }
                case 99: {
                    n5 = 192;
                    break;
                }
                case 100: {
                    n5 = 223;
                    break;
                }
                case 101: {
                    n5 = 247;
                    break;
                }
                case 102: {
                    n5 = 175;
                    break;
                }
                case 103: {
                    n5 = 18;
                    break;
                }
                case 104: {
                    n5 = 229;
                    break;
                }
                case 105: {
                    n5 = 149;
                    break;
                }
                case 106: {
                    n5 = 63;
                    break;
                }
                case 107: {
                    n5 = 58;
                    break;
                }
                case 108: {
                    n5 = 62;
                    break;
                }
                case 109: {
                    n5 = 78;
                    break;
                }
                case 110: {
                    n5 = 92;
                    break;
                }
                case 111: {
                    n5 = 201;
                    break;
                }
                case 112: {
                    n5 = 153;
                    break;
                }
                case 113: {
                    n5 = 48;
                    break;
                }
                case 114: {
                    n5 = 132;
                    break;
                }
                case 115: {
                    n5 = 211;
                    break;
                }
                case 116: {
                    n5 = 33;
                    break;
                }
                case 117: {
                    n5 = 17;
                    break;
                }
                case 118: {
                    n5 = 56;
                    break;
                }
                case 119: {
                    n5 = 15;
                    break;
                }
                case 120: {
                    n5 = 213;
                    break;
                }
                case 121: {
                    n5 = 108;
                    break;
                }
                case 122: {
                    n5 = 23;
                    break;
                }
                case 123: {
                    n5 = 49;
                    break;
                }
                case 124: {
                    n5 = 220;
                    break;
                }
                case 125: {
                    n5 = 68;
                    break;
                }
                case 126: {
                    n5 = 246;
                    break;
                }
                case 127: {
                    n5 = 98;
                    break;
                }
                case 128: {
                    n5 = 103;
                    break;
                }
                case 129: {
                    n5 = 59;
                    break;
                }
                case 130: {
                    n5 = 212;
                    break;
                }
                case 131: {
                    n5 = 52;
                    break;
                }
                case 132: {
                    n5 = 31;
                    break;
                }
                case 133: {
                    n5 = 133;
                    break;
                }
                case 134: {
                    n5 = 139;
                    break;
                }
                case 135: {
                    n5 = 174;
                    break;
                }
                case 136: {
                    n5 = 79;
                    break;
                }
                case 137: {
                    n5 = 96;
                    break;
                }
                case 138: {
                    n5 = 250;
                    break;
                }
                case 139: {
                    n5 = 54;
                    break;
                }
                case 140: {
                    n5 = 145;
                    break;
                }
                case 141: {
                    n5 = 168;
                    break;
                }
                case 142: {
                    n5 = 87;
                    break;
                }
                case 143: {
                    n5 = 170;
                    break;
                }
                case 144: {
                    n5 = 176;
                    break;
                }
                case 145: {
                    n5 = 186;
                    break;
                }
                case 146: {
                    n5 = 181;
                    break;
                }
                case 147: {
                    n5 = 0;
                    break;
                }
                case 148: {
                    n5 = 100;
                    break;
                }
                case 149: {
                    n5 = 1;
                    break;
                }
                case 150: {
                    n5 = 53;
                    break;
                }
                case 151: {
                    n5 = 136;
                    break;
                }
                case 152: {
                    n5 = 178;
                    break;
                }
                case 153: {
                    n5 = 254;
                    break;
                }
                case 154: {
                    n5 = 198;
                    break;
                }
                case 155: {
                    n5 = 125;
                    break;
                }
                case 156: {
                    n5 = 8;
                    break;
                }
                case 157: {
                    n5 = 83;
                    break;
                }
                case 158: {
                    n5 = 234;
                    break;
                }
                case 159: {
                    n5 = 171;
                    break;
                }
                case 160: {
                    n5 = 230;
                    break;
                }
                case 161: {
                    n5 = 158;
                    break;
                }
                case 162: {
                    n5 = 199;
                    break;
                }
                case 163: {
                    n5 = 67;
                    break;
                }
                case 164: {
                    n5 = 40;
                    break;
                }
                case 165: {
                    n5 = 188;
                    break;
                }
                case 166: {
                    n5 = 185;
                    break;
                }
                case 167: {
                    n5 = 73;
                    break;
                }
                case 168: {
                    n5 = 112;
                    break;
                }
                case 169: {
                    n5 = 25;
                    break;
                }
                case 170: {
                    n5 = 123;
                    break;
                }
                case 171: {
                    n5 = 20;
                    break;
                }
                case 172: {
                    n5 = 217;
                    break;
                }
                case 173: {
                    n5 = 202;
                    break;
                }
                case 174: {
                    n5 = 45;
                    break;
                }
                case 175: {
                    n5 = 16;
                    break;
                }
                case 176: {
                    n5 = 131;
                    break;
                }
                case 177: {
                    n5 = 115;
                    break;
                }
                case 178: {
                    n5 = 172;
                    break;
                }
                case 179: {
                    n5 = 134;
                    break;
                }
                case 180: {
                    n5 = 111;
                    break;
                }
                case 181: {
                    n5 = 155;
                    break;
                }
                case 182: {
                    n5 = 222;
                    break;
                }
                case 183: {
                    n5 = 95;
                    break;
                }
                case 184: {
                    n5 = 205;
                    break;
                }
                case 185: {
                    n5 = 64;
                    break;
                }
                case 186: {
                    n5 = 55;
                    break;
                }
                case 187: {
                    n5 = 207;
                    break;
                }
                case 188: {
                    n5 = 208;
                    break;
                }
                case 189: {
                    n5 = 34;
                    break;
                }
                case 190: {
                    n5 = 47;
                    break;
                }
                case 191: {
                    n5 = 32;
                    break;
                }
                case 192: {
                    n5 = 114;
                    break;
                }
                case 193: {
                    n5 = 66;
                    break;
                }
                case 194: {
                    n5 = 180;
                    break;
                }
                case 195: {
                    n5 = 193;
                    break;
                }
                case 196: {
                    n5 = 238;
                    break;
                }
                case 197: {
                    n5 = 107;
                    break;
                }
                case 198: {
                    n5 = 128;
                    break;
                }
                case 199: {
                    n5 = 35;
                    break;
                }
                case 200: {
                    n5 = 195;
                    break;
                }
                case 201: {
                    n5 = 239;
                    break;
                }
                case 202: {
                    n5 = 88;
                    break;
                }
                case 203: {
                    n5 = 77;
                    break;
                }
                case 204: {
                    n5 = 251;
                    break;
                }
                case 205: {
                    n5 = 91;
                    break;
                }
                case 206: {
                    n5 = 165;
                    break;
                }
                case 207: {
                    n5 = 209;
                    break;
                }
                case 208: {
                    n5 = 121;
                    break;
                }
                case 209: {
                    n5 = 13;
                    break;
                }
                case 210: {
                    n5 = 151;
                    break;
                }
                case 211: {
                    n5 = 159;
                    break;
                }
                case 212: {
                    n5 = 124;
                    break;
                }
                case 213: {
                    n5 = 43;
                    break;
                }
                case 214: {
                    n5 = 82;
                    break;
                }
                case 215: {
                    n5 = 27;
                    break;
                }
                case 216: {
                    n5 = 130;
                    break;
                }
                case 217: {
                    n5 = 94;
                    break;
                }
                case 218: {
                    n5 = 163;
                    break;
                }
                case 219: {
                    n5 = 204;
                    break;
                }
                case 220: {
                    n5 = 154;
                    break;
                }
                case 221: {
                    n5 = 142;
                    break;
                }
                case 222: {
                    n5 = 76;
                    break;
                }
                case 223: {
                    n5 = 240;
                    break;
                }
                case 224: {
                    n5 = 70;
                    break;
                }
                case 225: {
                    n5 = 41;
                    break;
                }
                case 226: {
                    n5 = 221;
                    break;
                }
                case 227: {
                    n5 = 29;
                    break;
                }
                case 228: {
                    n5 = 127;
                    break;
                }
                case 229: {
                    n5 = 21;
                    break;
                }
                case 230: {
                    n5 = 85;
                    break;
                }
                case 231: {
                    n5 = 252;
                    break;
                }
                case 232: {
                    n5 = 126;
                    break;
                }
                case 233: {
                    n5 = 203;
                    break;
                }
                case 234: {
                    n5 = 184;
                    break;
                }
                case 235: {
                    n5 = 255;
                    break;
                }
                case 236: {
                    n5 = 150;
                    break;
                }
                case 237: {
                    n5 = 36;
                    break;
                }
                case 238: {
                    n5 = 22;
                    break;
                }
                case 239: {
                    n5 = 120;
                    break;
                }
                case 240: {
                    n5 = 245;
                    break;
                }
                case 241: {
                    n5 = 6;
                    break;
                }
                case 242: {
                    n5 = 214;
                    break;
                }
                case 243: {
                    n5 = 187;
                    break;
                }
                case 244: {
                    n5 = 218;
                    break;
                }
                case 245: {
                    n5 = 231;
                    break;
                }
                case 246: {
                    n5 = 113;
                    break;
                }
                case 247: {
                    n5 = 122;
                    break;
                }
                case 248: {
                    n5 = 210;
                    break;
                }
                case 249: {
                    n5 = 86;
                    break;
                }
                case 250: {
                    n5 = 129;
                    break;
                }
                case 251: {
                    n5 = 244;
                    break;
                }
                case 252: {
                    n5 = 110;
                    break;
                }
                case 253: {
                    n5 = 253;
                    break;
                }
                case 254: {
                    n5 = 12;
                    break;
                }
                default: {
                    n5 = 4;
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
            aCi.n[n4] = new String(cArray).intern();
        }
        return aCi.n[n4];
    }
}


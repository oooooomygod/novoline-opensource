/*
 * Decompiled with CFR 0.152.
 */
package net;

/*
 * Renamed from net.Id
 */
public class id_0 {
    public static VertexFormat e = id_0.b();
    public static int d = 14;
    public static int c = 10;
    public static int b = 8;
    public static int a = 12;

    public static VertexFormat b() {
        VertexFormat aqn_02 = new VertexFormat();
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.FLOAT, aPX.POSITION, 3));
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.UBYTE, aPX.PADDING, 4));
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.FLOAT, aPX.UV, 2));
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.SHORT, aPX.PADDING, 2));
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.BYTE, aPX.NORMAL, 3));
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.BYTE, aPX.PADDING, 1));
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.FLOAT, aPX.PADDING, 2));
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.SHORT, aPX.PADDING, 4));
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.SHORT, aPX.PADDING, 4));
        return aqn_02;
    }

    public static VertexFormat c() {
        VertexFormat aqn_02 = new VertexFormat();
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.FLOAT, aPX.POSITION, 3));
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.UBYTE, aPX.COLOR, 4));
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.FLOAT, aPX.UV, 2));
        zv_2.a(aqn_02, new VertexFormatElement(1, ml_2.SHORT, aPX.UV, 2));
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.BYTE, aPX.NORMAL, 3));
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.BYTE, aPX.PADDING, 1));
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.FLOAT, aPX.PADDING, 2));
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.SHORT, aPX.PADDING, 4));
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.SHORT, aPX.PADDING, 4));
        return aqn_02;
    }

    public static void a(VertexFormat aqn_02) {
        zv_2.b(aqn_02);
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.FLOAT, aPX.POSITION, 3));
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.UBYTE, aPX.COLOR, 4));
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.FLOAT, aPX.UV, 2));
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.SHORT, aPX.PADDING, 2));
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.BYTE, aPX.NORMAL, 3));
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.BYTE, aPX.PADDING, 1));
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.FLOAT, aPX.PADDING, 2));
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.SHORT, aPX.PADDING, 4));
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.SHORT, aPX.PADDING, 4));
    }

    public static VertexFormat a() {
        VertexFormat aqn_02 = new VertexFormat();
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.FLOAT, aPX.POSITION, 3));
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.UBYTE, aPX.COLOR, 4));
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.FLOAT, aPX.UV, 2));
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.SHORT, aPX.PADDING, 2));
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.BYTE, aPX.NORMAL, 3));
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.BYTE, aPX.PADDING, 1));
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.FLOAT, aPX.PADDING, 2));
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.SHORT, aPX.PADDING, 4));
        zv_2.a(aqn_02, new VertexFormatElement(0, ml_2.SHORT, aPX.PADDING, 4));
        return aqn_02;
    }
}


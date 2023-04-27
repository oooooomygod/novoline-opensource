/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

/*
 * Renamed from net.dK
 */
public class dk_1 {
    public static String b(Properties properties, String string, String string2) {
        return properties.getProperty(string, string2);
    }

    public static void a(Properties properties, InputStream inputStream) {
        properties.load(inputStream);
    }

    public static Object a(Properties properties, Object object) {
        return properties.get(object);
    }

    public static boolean a(Properties properties) {
        return properties.isEmpty();
    }

    public static void a(Properties properties, Writer writer, String string) {
        properties.store(writer, string);
    }

    public static int b(Properties properties) {
        return properties.size();
    }

    public static String a(Properties properties, String string) {
        return properties.getProperty(string);
    }

    public static Object a(Properties properties, String string, String string2) {
        return properties.setProperty(string, string2);
    }

    public static Object a(Properties properties, Object object, Object object2) {
        return properties.put(object, object2);
    }

    public static void a(Properties properties, Reader reader) {
        properties.load(reader);
    }

    public static Set c(Properties properties) {
        return properties.keySet();
    }

    public static void a(Properties properties, OutputStream outputStream, String string) {
        properties.store(outputStream, string);
    }
}


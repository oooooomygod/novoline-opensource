/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.FileUtils
 *  org.apache.commons.io.filefilter.IOFileFilter
 */
package net;

import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.IOFileFilter;

/*
 * Renamed from net.iw
 */
public class iw_2 {
    public static Collection a(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        return FileUtils.listFiles((File)file, (IOFileFilter)iOFileFilter, (IOFileFilter)iOFileFilter2);
    }

    public static void a(InputStream inputStream, File file) {
        FileUtils.copyInputStreamToFile((InputStream)inputStream, (File)file);
    }

    public static boolean a(File file) {
        return FileUtils.deleteQuietly((File)file);
    }

    public static void a(File file, String string) {
        FileUtils.writeStringToFile((File)file, (String)string);
    }

    public static String b(File file) {
        return FileUtils.readFileToString((File)file);
    }
}


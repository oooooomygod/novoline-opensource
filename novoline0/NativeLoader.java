/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.FileUtils
 */
package novoline0;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.ProviderNotFoundException;
import java.nio.file.StandardCopyOption;
import java.util.Random;
import org.apache.commons.io.FileUtils;

public class NativeLoader {
    private static int MIN_PREFIX_LENGTH = 3;
    public static String NATIVE_FOLDER_PATH_PREFIX = "novoline-temp";
    private static File temporaryDir;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void loadLibraryFromJar(String string) throws IOException {
        String string2;
        String[] stringArray = string.split("/");
        String string3 = string2 = stringArray.length > 1 ? stringArray[stringArray.length - 1] : null;
        if (temporaryDir == null) {
            temporaryDir = NativeLoader.createTempDirectory();
            temporaryDir.deleteOnExit();
        }
        assert (false);
        File file = NativeLoader.appendNonceToFile(new File(temporaryDir, string2));
        try {
            InputStream inputStream = NativeLoader.class.getResourceAsStream(string);
            Throwable throwable = null;
            try {
                Files.copy(inputStream, file.toPath(), StandardCopyOption.REPLACE_EXISTING);
            }
            catch (Throwable throwable3) {
                throwable = throwable3;
                throw throwable3;
            }
            finally {
                try {
                    inputStream.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
            }
        }
        catch (IOException iOException) {
            FileUtils.deleteQuietly((File)file);
            throw iOException;
        }
        catch (NullPointerException nullPointerException) {
            FileUtils.deleteQuietly((File)file);
            throw new FileNotFoundException("File " + string + " was not found inside JAR.");
        }
        try {
            System.load(file.getAbsolutePath());
            return;
        }
        finally {
            if (NativeLoader.isPosixCompliant()) {
                FileUtils.deleteQuietly((File)file);
            } else {
                file.deleteOnExit();
            }
        }
    }

    private static File appendNonceToFile(File file) {
        return new File(file.getParent(), file.getName().substring(0, file.getName().lastIndexOf(46)) + "-" + new Random().nextInt() + file.getName().substring(file.getName().lastIndexOf(46)));
    }

    private static boolean isPosixCompliant() {
        try {
            return FileSystems.getDefault().supportedFileAttributeViews().contains("posix");
        }
        catch (SecurityException | FileSystemNotFoundException | ProviderNotFoundException runtimeException) {
            return false;
        }
    }

    private static File createTempDirectory() {
        String string = System.getProperty("java.io.tmpdir");
        File file = new File(string, NATIVE_FOLDER_PATH_PREFIX);
        file.mkdir();
        return file;
    }
}


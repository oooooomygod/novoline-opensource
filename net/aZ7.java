/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.CopyOption;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.ProviderNotFoundException;
import java.nio.file.StandardCopyOption;
import java.util.Random;
import net.a5_0;
import net.aIR;
import net.aL0;
import net.aS0;
import net.aWR;
import net.aZ6;
import net.aev_1;
import net.ara_2;
import net.di_0;
import net.iw_2;
import net.lg_2;
import net.zq_2;

public class aZ7 {
    private static String b;
    static /* synthetic */ boolean d;
    private static File a;
    private static int c = 3;
    public static String e = "novoline-temp";

    private static File a() {
        String string = SystemInvoker.c(di_0.f);
        File file = new File(string, di_0.e);
        zq_2.p(file);
        return file;
    }

    public static void b(String string) {
        b = string;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public static String b() {
        return b;
    }

    /*
     * Loose catch block
     */
    public static void a(String string) throws IOException {
        File file;
        block20: {
            String string2;
            aZ7.b();
            String[] stringArray = StringInvoker.g(string, di_0.b);
            String string3 = string2 = stringArray.length > 1 ? stringArray[stringArray.length - 1] : null;
            if (a == null) {
                a = aZ7.a();
                zq_2.s(a);
            }
            if (!d) {
                throw new AssertionError();
            }
            file = aZ7.a(new File(a, string2));
            InputStream inputStream = ara_2.b(aZ7.class, string);
            Throwable throwable = null;
            aev_1.a(inputStream, zq_2.g(file), new CopyOption[]{StandardCopyOption.REPLACE_EXISTING});
            try {
                aZ6.b(inputStream);
            }
            catch (Throwable throwable2) {
                aWR.a(throwable, throwable2);
                ListInvoker.b(new ListInvoker[2]);
                aZ6.b(inputStream);
            }
            break block20;
            {
                catch (Throwable throwable3) {
                    throwable = throwable3;
                    try {
                        throw throwable3;
                    }
                    catch (Throwable throwable4) {
                        try {
                            aZ6.b(inputStream);
                        }
                        catch (Throwable throwable5) {
                            aWR.a(throwable, throwable5);
                            aZ6.b(inputStream);
                        }
                        throw throwable4;
                        {
                            catch (IOException iOException) {
                                iw_2.a(file);
                                throw iOException;
                            }
                            catch (NullPointerException nullPointerException) {
                                iw_2.a(file);
                                throw new FileNotFoundException(aL0.a(aL0.a(aL0.a(new StringBuilder(), di_0.a), string), di_0.d).toString());
                            }
                        }
                    }
                }
            }
        }
        try {
            SystemInvoker.b(zq_2.j(file));
            return;
        }
        finally {
            if (aZ7.c()) {
                iw_2.a(file);
            }
            zq_2.s(file);
        }
    }

    private static File a(File file) {
        return new File(zq_2.c(file), aL0.a(aL0.c(aL0.a(aL0.a(new StringBuilder(), StringInvoker.b(zq_2.q(file), 0, StringInvoker.c(zq_2.q(file), 46))), di_0.g), a5_0.d(new Random())), StringInvoker.a(zq_2.q(file), StringInvoker.c(zq_2.q(file), 46))).toString());
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        if (aZ7.b() != null) {
            aZ7.b("Tg7DPb");
        }
        int n = -1;
        char[] cArray = "5\u000f%=4[Q>M'75B".toCharArray();
        int n2 = 0;
        int n3 = 106;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x31));
            n3 = n3;
        }
    }

    private static boolean c() {
        try {
            return aS0.c(aIR.a(lg_2.a()), di_0.c);
        }
        catch (SecurityException | FileSystemNotFoundException | ProviderNotFoundException runtimeException) {
            return false;
        }
    }
}


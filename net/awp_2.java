/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package net;

import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.StringInvoker;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.C1;
import net.C7;
import net.GP;
import net.a2e_0;
import net.a7b_0;
import net.aMR;
import net.aZB;
import net.asf_1;
import net.yr_1;
import org.apache.logging.log4j.Logger;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

/*
 * Renamed from net.awp
 */
public class awp_2 {
    private static Logger a = LogManagerInvoker.c();

    public static @Nullable KeyPair b() {
        try {
            KeyPairGenerator keyPairGenerator = aMR.a(C1.c);
            aMR.a(keyPairGenerator, 1024);
            return keyPairGenerator.generateKeyPair();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            LoggerInvoker.a(a, C1.b, noSuchAlgorithmException);
            return null;
        }
    }

    public static @Nullable PublicKey a(byte[] byArray) {
        try {
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(byArray);
            KeyFactory keyFactory = a2e_0.a(C1.k);
            return a2e_0.a(keyFactory, x509EncodedKeySpec);
        }
        catch (NoSuchAlgorithmException | InvalidKeySpecException generalSecurityException) {
            LoggerInvoker.f(a, C1.j);
            return null;
        }
    }

    public static byte[] a(Key key, byte[] byArray) {
        return awp_2.a(2, key, byArray);
    }

    public static SecretKey a() {
        try {
            KeyGenerator keyGenerator = aZB.a(C1.i);
            aZB.a(keyGenerator, 128);
            return aZB.a(keyGenerator);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new Error(noSuchAlgorithmException);
        }
    }

    public static @NonNull SecretKey a(PrivateKey privateKey, byte[] byArray) {
        return new SecretKeySpec(awp_2.a((Key)privateKey, byArray), C1.h);
    }

    public static byte[] a(@NonNull String string, @NonNull PublicKey publicKey, @NonNull SecretKey secretKey) {
        byte[][] byArrayArray = new byte[3][];
        try {
            byArrayArray[0] = StringInvoker.a(string, C1.d);
            byArrayArray[1] = asf_1.a(secretKey);
            byArrayArray[2] = C7.a(publicKey);
            return awp_2.a(C1.f, byArrayArray);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            LoggerInvoker.a(a, unsupportedEncodingException);
            return null;
        }
    }

    private static @Nullable Cipher a(int n, String string, Key key) {
        try {
            Cipher cipher = yr_1.b(string);
            yr_1.a(cipher, n, key);
            return cipher;
        }
        catch (Throwable throwable) {
            LoggerInvoker.a(a, C1.e, throwable);
            return null;
        }
    }

    private static byte[] a(String string, byte[] ... byArray) {
        try {
            MessageDigest messageDigest = GP.a(string);
            for (byte[] byArray2 : byArray) {
                GP.b(messageDigest, byArray2);
            }
            return GP.b(messageDigest);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            LoggerInvoker.a(a, noSuchAlgorithmException);
            return null;
        }
    }

    public static @NonNull Cipher a(int n, Key key) {
        try {
            Cipher cipher = yr_1.b(C1.a);
            yr_1.a(cipher, n, key, new IvParameterSpec(a7b_0.b(key)));
            return cipher;
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new RuntimeException(generalSecurityException);
        }
    }

    public static byte[] b(Key key, byte[] byArray) {
        return awp_2.a(1, key, byArray);
    }

    private static byte[] a(int n, Key key, byte[] byArray) {
        try {
            return yr_1.a(awp_2.a(n, a7b_0.a(key), key), byArray);
        }
        catch (BadPaddingException | IllegalBlockSizeException generalSecurityException) {
            LoggerInvoker.a(a, C1.g, generalSecurityException);
            return null;
        }
    }
}


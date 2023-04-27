/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import cc.novoline.utils.notifications.NotificationManager;
import java.util.List;
import net.NotificationType;

public class NotificationManagerInvoker {
    private static String b;

    public static void a(NotificationManager notificationManager, String string, NotificationType notificationType) {
        notificationManager.a(string, notificationType);
    }

    public static String b() {
        return b;
    }

    public static void b(String string) {
        b = string;
    }

    public static void a(NotificationManager notificationManager, String string, String string2, int n, NotificationType notificationType) {
        notificationManager.a(string, string2, n, notificationType);
    }

    public static void a(NotificationManager notificationManager, String string, String string2, NotificationType notificationType) {
        notificationManager.a(string, string2, notificationType);
    }

    public static void pop(NotificationManager notificationManager, String string, int n, NotificationType notificationType) {
        notificationManager.a(string, n, notificationType);
    }

    static {
        if (NotificationManagerInvoker.b() != null) {
            NotificationManagerInvoker.b("jZhsYb");
        }
    }

    public static List a(NotificationManager notificationManager) {
        return notificationManager.a();
    }
}


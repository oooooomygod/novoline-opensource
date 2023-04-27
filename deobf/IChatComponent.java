/*
 * Decompiled with CFR 0.152.
 */
package deobf;

import java.util.List;
import net.ChatStyle;
import net.skidunion.annotations;

public interface IChatComponent
extends Iterable<IChatComponent> {
    public IChatComponent a(String var1);

    public String c();

    @annotations
    public String getUnformattedText();

    @annotations
    public String getFormattedText();

    public IChatComponent a(ChatStyle var1);

    public IChatComponent b();

    public IChatComponent a(IChatComponent var1);

    public List<IChatComponent> a();

    public ChatStyle d();
}


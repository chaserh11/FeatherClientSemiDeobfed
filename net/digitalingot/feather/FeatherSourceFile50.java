package net.digitalingot.feather;

import java.util.function.Consumer;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;

@Singleton
public class FeatherSourceFile50 implements FeatherSourceFile594 {
   private final Minecraft minecraft;
   private final FeatherSourceFile143 lk;

   @Inject
   FeatherSourceFile50(Minecraft var1, FeatherSourceFile143 var2) {
      this.minecraft = var1;
      this.lk = var2;
   }

   public void lh(FeatherSourceFile209 var1, Consumer var2, Consumer var3) {
      boolean var4 = var1.vo().isEmpty();
      ((FeatherSourceFile524)FeatherSourceFile524.ws.sx()).onPageUpdate(var1.vo());
      if (var4 && this.minecraft.field_71462_r == this.lk) {
         this.minecraft.func_147108_a((GuiScreen)null);
      }

   }

   public FeatherSourceFile754 hc() {
      return FeatherSourceFile754.PAGE_UPDATE;
   }
}

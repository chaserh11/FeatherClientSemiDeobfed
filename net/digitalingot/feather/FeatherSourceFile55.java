package net.digitalingot.feather;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
public class FeatherSourceFile55 {
   private final Minecraft minecraft;
   private final List aE = new ArrayList();

   @Inject
   FeatherSourceFile55(Minecraft var1) {
      this.minecraft = var1;
   }

   public void fe() {
      FeatherSourceFile609.cm.oe((var1, var2, var3, var4) -> {
         this.lt(var1, var3);
      });
      FeatherSourceFile609.xw.oe((var1, var2, var3) -> {
         this.lt(var1 + 100001, var2);
      });
      FeatherSourceFile490.je.oe((var1) -> {
         this.uc();
      });
   }

   public @NotNull @Nullable void lh(@NotNull @NotNull Supplier var1, @Nullable @Nullable FeatherSourceFile$nc36 var2) {
      this.lh(var1, var2, (FeatherSourceFile$nc36)null);
   }

   public @NotNull @Nullable @Nullable void lh(@NotNull @NotNull Supplier var1, @Nullable @Nullable FeatherSourceFile$nc36 var2, @Nullable @Nullable FeatherSourceFile$nc36 var3) {
      this.aE.add(new FeatherSourceFile$lh90(var1, var2, var3));
   }

   private void lt(int var1, int var2) {
      if (this.minecraft.field_71462_r == null) {
         Iterator var3 = this.aE.iterator();

         while(true) {
            while(true) {
               FeatherSourceFile$lh90 var4;
               FeatherSourceFile344 var5;
               do {
                  do {
                     if (!var3.hasNext()) {
                        return;
                     }

                     var4 = (FeatherSourceFile$lh90)var3.next();
                     var5 = (FeatherSourceFile344)var4.ef().get();
                  } while(var5.va().length == 0);
               } while(Arrays.stream(var5.va()).noneMatch((var1x) -> {
                  return var1x == var1;
               }));

               boolean var6 = var5.eb();
               if (var2 == 1 && var6 && !var4.isPressed()) {
                  var4.ly(true);
                  if (var4.mw() != null) {
                     var4.mw().onInteract();
                  }
               } else if (!var6 && var4.isPressed()) {
                  var4.ly(false);
                  if (var4.gc() != null) {
                     var4.gc().onInteract();
                  }
               }
            }
         }
      }
   }

   private void uc() {
      Iterator var1 = this.aE.iterator();

      while(var1.hasNext()) {
         FeatherSourceFile$lh90 var2 = (FeatherSourceFile$lh90)var1.next();
         if (var2.isPressed()) {
            if (var2.gc() != null) {
               var2.gc().onInteract();
            }

            var2.ly(false);
         }
      }

   }
}

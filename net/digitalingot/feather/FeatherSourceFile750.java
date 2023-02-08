package net.digitalingot.feather;

import java.util.regex.Pattern;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile750 extends FeatherSourceFile791 {
   @NotNull
   private static final @NotNull Pattern Hd = Pattern.compile("(:?1st(:? Killer| Place)?(:? - |:))|(:?Winner(:?s)?(:?:| - | #1))|(:?Winning Team(:?:| -) )|(:?Damage Dealt)|(:?Game over)|(:? won the game!)|(:?Last team standing!)");
   private static final Pattern He = Pattern.compile("\\S{1,16}: .*");
   private int xM = -1;

   @Inject
   FeatherSourceFile750(@NotNull @NotNull FeatherSourceFile428 var1) {
      super(var1);
   }

   public boolean dE() {
      return this.dO().Ho;
   }

   public void ex() {
      FeatherSourceFile645.ws.oe((var1) -> {
         if (!this.uj()) {
            return var1;
         } else {
            String var2 = var1.func_150260_c();
            if (var2.isEmpty()) {
               return var1;
            } else {
               if (!this.ts(var2) && this.cf(var2)) {
                  this.xM = this.dO().Hp;
               }

               return var1;
            }
         }
      });
      FeatherSourceFile149.oc.oe((var1) -> {
         if (this.uj()) {
            if (var1 == FeatherSourceFile$xj20.START) {
               EntityPlayerSP var2 = Minecraft.func_71410_x().field_71439_g;
               if (var2 != null) {
                  if (this.xM == 0) {
                     FeatherSourceFile709.lh(var2, "/ac gg");
                     this.xM = -1;
                  } else if (this.xM > 0) {
                     --this.xM;
                  }

               }
            }
         }
      });
   }

   private boolean cf(String var1) {
      return Hd.matcher(var1).find(0);
   }

   private boolean ts(String var1) {
      return He.matcher(var1).matches();
   }
}

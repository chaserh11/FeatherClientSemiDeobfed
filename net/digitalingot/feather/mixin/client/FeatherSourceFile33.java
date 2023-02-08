package net.digitalingot.feather.mixin.client;

import java.util.UUID;
import net.minecraft.entity.Entity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

@Mixin({Entity.class})
public abstract class FeatherSourceFile33 {
   @Unique
   private IChatComponent WU;
   @Unique
   private long WV;

   @Shadow
   public abstract String func_70005_c_();

   @Shadow
   public abstract UUID func_110124_au();

   @Overwrite
   public IChatComponent func_145748_c_() {
      long var1 = System.currentTimeMillis();
      if (this.WU != null && this.WV + 50L >= var1) {
         return this.WU;
      } else {
         this.WV = var1;
         ChatComponentText var3 = new ChatComponentText(this.func_70005_c_());
         var3.func_150256_b().func_179989_a(this.func_110124_au().toString());
         return this.WU = var3;
      }
   }
}

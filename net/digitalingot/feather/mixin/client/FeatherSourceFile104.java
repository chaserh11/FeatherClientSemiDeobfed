package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile401;
import net.minecraft.entity.item.EntityItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin({EntityItem.class})
public abstract class FeatherSourceFile104 implements net.digitalingot.feather.FeatherSourceFile138 {
   @Unique
   private FeatherSourceFile401 VK = new FeatherSourceFile401(0.0F, 0.0F, 0.0F);

   public FeatherSourceFile401 feather$getRotation() {
      return this.VK;
   }

   public void feather$setRotation(FeatherSourceFile401 var1) {
      this.VK = var1;
   }

   public void feather$setRotation(float var1, float var2, float var3) {
      this.VK = new FeatherSourceFile401(var1, var2, var3);
   }

   public void feather$addRotation(FeatherSourceFile401 var1) {
      this.VK.nc(var1);
   }

   public void feather$addRotation(float var1, float var2, float var3) {
      this.VK.wz(var1, var2, var3);
   }
}

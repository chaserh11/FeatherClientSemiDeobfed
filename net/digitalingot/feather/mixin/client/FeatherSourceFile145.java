package net.digitalingot.feather.mixin.client;

import com.mojang.authlib.GameProfile;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({EntityPlayerSP.class})
public abstract class FeatherSourceFile145 extends AbstractClientPlayer {
   public FeatherSourceFile145(World var1, GameProfile var2) {
      super(var1, var2);
   }

   public Vec3 func_70676_i(float var1) {
      return this.func_174806_f(this.field_70125_A, this.field_70177_z);
   }
}

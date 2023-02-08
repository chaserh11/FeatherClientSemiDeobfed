package net.digitalingot.feather.mixin.client;

import com.mojang.authlib.GameProfile;
import net.digitalingot.feather.FeatherSourceFile178;
import net.digitalingot.feather.FeatherSourceFile484;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({AbstractClientPlayer.class})
public abstract class FeatherSourceFile4 implements FeatherSourceFile484 {
   private FeatherSourceFile178[] Vm;
   private FeatherSourceFile178[] Vn;
   private boolean Vo = false;
   private long Vp;
   private long Vq;

   public FeatherSourceFile178[] getRenderCloak() {
      return this.Vm;
   }

   public FeatherSourceFile178[] getSimulationCloak() {
      return this.Vn;
   }

   public boolean getCrouchState() {
      return this.Vo;
   }

   public void setCrouchState(boolean var1) {
      this.Vo = var1;
   }

   public long getAccumulator() {
      return this.Vp;
   }

   public void setAccumulator(long var1) {
      this.Vp = var1;
   }

   public long getCurrentTime() {
      return this.Vq;
   }

   public void setCurrentTime(long var1) {
      this.Vq = var1;
   }

   @Inject(
      method = {"<init>"},
      at = {@At("RETURN")}
   )
   private void lh(World var1, GameProfile var2, CallbackInfo var3) {
      this.Vn = new FeatherSourceFile178[2];
      this.Vn[0] = new FeatherSourceFile178(1.0F, 16, 0.85F);
      this.Vn[1] = new FeatherSourceFile178(1.0F, 16, 1.0F);
      this.Vm = new FeatherSourceFile178[4];
      this.Vm[0] = this.Vn[0];
      this.Vm[1] = this.Vn[1];
      this.Vm[2] = this.Vn[1];
      this.Vm[3] = this.Vn[0];
   }
}

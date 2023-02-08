package net.digitalingot.feather.mixin.client;

import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Vec3i;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin({BlockPos.class})
public abstract class FeatherSourceFile147 extends Vec3i {
   public FeatherSourceFile147(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Overwrite
   public BlockPos func_177984_a() {
      return new BlockPos(this.func_177958_n(), this.func_177956_o() + 1, this.func_177952_p());
   }

   @Overwrite
   public BlockPos func_177981_b(int var1) {
      return new BlockPos(this.func_177958_n(), this.func_177956_o() + var1, this.func_177952_p());
   }

   @Overwrite
   public BlockPos func_177977_b() {
      return new BlockPos(this.func_177958_n(), this.func_177956_o() - 1, this.func_177952_p());
   }

   @Overwrite
   public BlockPos func_177979_c(int var1) {
      return new BlockPos(this.func_177958_n(), this.func_177956_o() - var1, this.func_177952_p());
   }

   @Overwrite
   public BlockPos func_177978_c() {
      return new BlockPos(this.func_177958_n(), this.func_177956_o(), this.func_177952_p() - 1);
   }

   @Overwrite
   public BlockPos func_177964_d(int var1) {
      return new BlockPos(this.func_177958_n(), this.func_177956_o(), this.func_177952_p() - var1);
   }

   @Overwrite
   public BlockPos func_177968_d() {
      return new BlockPos(this.func_177958_n(), this.func_177956_o(), this.func_177952_p() + 1);
   }

   @Overwrite
   public BlockPos func_177970_e(int var1) {
      return new BlockPos(this.func_177958_n(), this.func_177956_o(), this.func_177952_p() + var1);
   }

   @Overwrite
   public BlockPos func_177976_e() {
      return new BlockPos(this.func_177958_n() - 1, this.func_177956_o(), this.func_177952_p());
   }

   @Overwrite
   public BlockPos func_177985_f(int var1) {
      return new BlockPos(this.func_177958_n() - var1, this.func_177956_o(), this.func_177952_p());
   }

   @Overwrite
   public BlockPos func_177974_f() {
      return new BlockPos(this.func_177958_n() + 1, this.func_177956_o(), this.func_177952_p());
   }

   @Overwrite
   public BlockPos func_177965_g(int var1) {
      return new BlockPos(this.func_177958_n() + var1, this.func_177956_o(), this.func_177952_p());
   }

   @Overwrite
   public BlockPos func_177972_a(EnumFacing var1) {
      return new BlockPos(this.func_177958_n() + var1.func_82601_c(), this.func_177956_o() + var1.func_96559_d(), this.func_177952_p() + var1.func_82599_e());
   }

   @Overwrite
   public BlockPos func_177967_a(EnumFacing var1, int var2) {
      return new BlockPos(this.func_177958_n() + var1.func_82601_c() * var2, this.func_177956_o() + var1.func_96559_d() * var2, this.func_177952_p() + var1.func_82599_e() * var2);
   }
}

package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

public abstract class FeatherSourceFile791 {
   private FeatherSourceFile$lh113 HQ;
   @NotNull
   protected final @NotNull FeatherSourceFile428 lI;
   protected boolean aB;

   protected FeatherSourceFile791(@NotNull @NotNull FeatherSourceFile428 var1) {
      this.lI = var1;
   }

   public abstract boolean dE();

   public void ex() {
   }

   public void pu() {
   }

   public void ml() {
      this.aB = true;
   }

   public void ze() {
      this.aB = false;
   }

   public boolean uj() {
      return this.aB && this.dE() && this.lI.xK();
   }

   public boolean gg() {
      return this.aB;
   }

   public void lh(FeatherSourceFile$lh113 var1) {
      this.HQ = var1;
   }

   protected FeatherSourceFile$lh113 dO() {
      return this.HQ;
   }
}

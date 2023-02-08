package net.digitalingot.feather;

import java.awt.Color;
import net.digitalingot.vendor.com.google.inject.ImplementedBy;
import org.jetbrains.annotations.NotNull;

@ImplementedBy(FeatherSourceFile566.class)
public interface FeatherSourceFile308 {
   void wk();

   default void ph() {
      this.mq(true);
   }

   default void ia() {
      this.mq(false);
   }

   void mq(boolean var1);

   void sa();

   void mr(boolean var1);

   void ux(boolean var1);

   void ga();

   default void eo() {
      this.lh((FeatherSourceFile243)null, true);
   }

   default void fn() {
      this.lh((FeatherSourceFile243)null, false);
   }

   default void lh(FeatherSourceFile243 var1) {
      this.lh(var1, true);
   }

   default void nc(FeatherSourceFile243 var1) {
      this.lh(var1, false);
   }

   void lh(FeatherSourceFile243 var1, boolean var2);

   void bs();

   @NotNull void lh(@NotNull @NotNull Color var1);

   void lv();

   default void yg() {
      this.si(true);
   }

   default void gs() {
      this.si(false);
   }

   void si(boolean var1);
}

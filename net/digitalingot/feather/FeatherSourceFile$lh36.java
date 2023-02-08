package net.digitalingot.feather;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FeatherSourceFile$lh36 extends FeatherSourceFile624 {
   // $FF: synthetic field
   final FeatherSourceFile787 ER;

   public FeatherSourceFile$lh36(FeatherSourceFile787 var1) {
      this.ER = var1;
   }

   public Object ov() {
      DateTimeFormatter var1 = ((FeatherSourceFile$nc15)FeatherSourceFile787.lh(this.ER)).ET == FeatherSourceFile$nc$lh2.HOUR_12 ? FeatherSourceFile787.cF() : FeatherSourceFile787.cG();
      return LocalDateTime.now().format(var1);
   }

   public boolean mu() {
      return false;
   }

   public FeatherSourceFile374 bp() {
      return ((FeatherSourceFile$nc15)FeatherSourceFile787.nc(this.ER)).zW;
   }

   // $FF: synthetic method
   public FeatherSourceFile89 hk() {
      return this.bp();
   }
}

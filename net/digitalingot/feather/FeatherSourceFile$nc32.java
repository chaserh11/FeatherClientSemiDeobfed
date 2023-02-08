package net.digitalingot.feather;

public class FeatherSourceFile$nc32 {
   private static final FeatherSourceFile$nc32 Sr = new FeatherSourceFile$nc32();
   private char Ss = '\uffff';
   private boolean St;
   private boolean Su;
   private boolean Sv;
   private boolean Sw;
   private boolean Sx;
   private int Sy;
   private int Sz;

   public String yH() {
      StringBuilder var1 = new StringBuilder();
      if (this.yI()) {
         var1.append('§');
         var1.append(this.Ss);
      }

      if (this.St) {
         var1.append('§');
         var1.append('l');
      }

      if (this.Su) {
         var1.append('§');
         var1.append('o');
      }

      if (this.Sv) {
         var1.append('§');
         var1.append('n');
      }

      if (this.Sw) {
         var1.append('§');
         var1.append('m');
      }

      if (this.Sx) {
         var1.append('§');
         var1.append('k');
      }

      return var1.toString();
   }

   public boolean yI() {
      return this.Ss != '\uffff';
   }

   public char yJ() {
      return this.Ss;
   }

   private static FeatherSourceFile$nc32 lh(FeatherSourceFile$nc32 var0) {
      FeatherSourceFile$nc32 var1 = new FeatherSourceFile$nc32();
      if (var0 != null) {
         var1.Ss = var0.Ss;
         var1.St = var0.St;
         var1.Sv = var0.Sv;
         var1.Sw = var0.Sw;
         var1.Sx = var0.Sx;
      }

      return var1;
   }

   private boolean xj(char var1) {
      // $FF: Couldn't be decompiled
   }

   private void oe(char var1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static int lh(FeatherSourceFile$nc32 var0, int var1) {
      return var0.Sz = var1;
   }

   // $FF: synthetic method
   static boolean lh(FeatherSourceFile$nc32 var0, char var1) {
      return var0.xj(var1);
   }

   // $FF: synthetic method
   static FeatherSourceFile$nc32 nc(FeatherSourceFile$nc32 var0) {
      return lh(var0);
   }

   // $FF: synthetic method
   static int nc(FeatherSourceFile$nc32 var0, int var1) {
      return var0.Sy = var1;
   }

   // $FF: synthetic method
   static void nc(FeatherSourceFile$nc32 var0, char var1) {
      var0.oe(var1);
   }

   // $FF: synthetic method
   static char xj(FeatherSourceFile$nc32 var0, char var1) {
      return var0.Ss = var1;
   }

   // $FF: synthetic method
   static int xj(FeatherSourceFile$nc32 var0) {
      return var0.Sy;
   }

   // $FF: synthetic method
   static int oe(FeatherSourceFile$nc32 var0) {
      return var0.Sz;
   }

   // $FF: synthetic method
   static FeatherSourceFile$nc32 yK() {
      return Sr;
   }
}

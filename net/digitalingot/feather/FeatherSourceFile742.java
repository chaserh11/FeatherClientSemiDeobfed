package net.digitalingot.feather;

public class FeatherSourceFile742 {
   private static boolean du;

   public static boolean nw() {
      return du;
   }

   static {
      try {
         Class.forName("io.github.moulberry.notenoughupdates.NEUApi");
         du = true;
      } catch (ClassNotFoundException var1) {
         du = false;
      }

   }
}

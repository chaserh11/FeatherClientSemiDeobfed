package net.digitalingot.feather;

enum FeatherSourceFile$lh94 {
   WINDOWS("explorer"),
   LINUX("xdg-open"),
   MACOS("open");

   private final String command;

   private FeatherSourceFile$lh94(String var3) {
      this.command = var3;
   }

   private boolean open(String var1) {
      return FeatherSourceFile844.mf(this.command + " \"" + var1 + "\"");
   }

   private static FeatherSourceFile$lh94 get() {
      String var0 = getOsName();
      if (var0 != null) {
         if (var0.startsWith("Linux") || var0.startsWith("LINUX")) {
            return LINUX;
         }

         if (var0.startsWith("Mac")) {
            return MACOS;
         }

         if (var0.startsWith("Windows")) {
            return WINDOWS;
         }
      }

      throw new IllegalStateException("Unable to detect OS");
   }

   private static String getOsName() {
      try {
         return System.getProperty("os.name");
      } catch (SecurityException var1) {
         return null;
      }
   }

   // $FF: synthetic method
   static FeatherSourceFile$lh94 access$000() {
      return get();
   }

   // $FF: synthetic method
   static boolean access$100(FeatherSourceFile$lh94 var0, String var1) {
      return var0.open(var1);
   }

   // $FF: synthetic method
   private static FeatherSourceFile$lh94[] $values() {
      return new FeatherSourceFile$lh94[]{WINDOWS, LINUX, MACOS};
   }
}

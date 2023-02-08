package net.digitalingot.feather;

public enum FeatherSourceFile658 {
   GET("GET"),
   POST("POST"),
   PUT("PUT"),
   DELETE("DELETE");

   private final String name;

   private FeatherSourceFile658(String var3) {
      this.name = var3;
   }

   public String getName() {
      return this.name;
   }

   // $FF: synthetic method
   private static FeatherSourceFile658[] $values() {
      return new FeatherSourceFile658[]{GET, POST, PUT, DELETE};
   }
}

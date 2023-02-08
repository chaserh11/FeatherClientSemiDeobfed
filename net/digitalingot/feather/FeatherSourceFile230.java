package net.digitalingot.feather;

public enum FeatherSourceFile230 {
   SHORT(2),
   INTEGER(4);

   private final int size;

   private FeatherSourceFile230(int var3) {
      this.size = var3;
   }

   public int getSize() {
      return this.size;
   }

   // $FF: synthetic method
   private static FeatherSourceFile230[] $values() {
      return new FeatherSourceFile230[]{SHORT, INTEGER};
   }
}

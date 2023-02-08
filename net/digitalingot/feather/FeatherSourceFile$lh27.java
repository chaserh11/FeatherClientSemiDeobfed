package net.digitalingot.feather;

public enum FeatherSourceFile$lh27 {
   SERVER_BOUND,
   CLIENT_BOUND;

   public FeatherSourceFile$lh68 getPacketRegistry(FeatherSourceFile749 var1) {
      return this == SERVER_BOUND ? var1.serverBound : var1.clientBound;
   }

   // $FF: synthetic method
   private static FeatherSourceFile$lh27[] $values() {
      return new FeatherSourceFile$lh27[]{SERVER_BOUND, CLIENT_BOUND};
   }
}

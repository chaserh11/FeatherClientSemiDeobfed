package net.digitalingot.feather;

public enum FeatherSourceFile$nc$lh {
   @FeatherSourceFile558(
      lb = "everyone",
      jc = "feather.modules.voice.ReceiveMode.everyone"
   )
   EVERYONE,
   @FeatherSourceFile558(
      lb = "partyOnly",
      jc = "feather.modules.voice.ReceiveMode.partyOnly"
   )
   PARTY_ONLY;

   public FeatherSourceFile$lh26 toCapnProto() {
      switch (this) {
         case EVERYONE:
            return FeatherSourceFile$lh26.EVERYONE;
         case PARTY_ONLY:
            return FeatherSourceFile$lh26.PARTY_ONLY;
         default:
            throw new IllegalArgumentException();
      }
   }

   // $FF: synthetic method
   private static FeatherSourceFile$nc$lh[] $values() {
      return new FeatherSourceFile$nc$lh[]{EVERYONE, PARTY_ONLY};
   }
}

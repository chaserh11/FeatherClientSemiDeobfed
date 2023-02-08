package net.digitalingot.feather;

public enum FeatherSourceFile749 {
   LOGIN {
      {
         FeatherSourceFile$lh68.lh(this.serverBound, FeatherSourceFile139.class, FeatherSourceFile139::new, 1, true);
         FeatherSourceFile$lh68.lh(this.clientBound, FeatherSourceFile184.class, FeatherSourceFile184::new, 0, false);
         FeatherSourceFile$lh68.lh(this.clientBound, FeatherSourceFile696.class, FeatherSourceFile696::new, 2, false);
      }
   },
   AUTHENTICATED {
      {
         FeatherSourceFile$lh68.lh(this.serverBound, FeatherSourceFile732.class, FeatherSourceFile732::new, 1, true);
         FeatherSourceFile$lh68.lh(this.serverBound, FeatherSourceFile38.class, FeatherSourceFile38::new, 2, true);
         FeatherSourceFile$lh68.lh(this.clientBound, FeatherSourceFile480.class, FeatherSourceFile480::new, 3, false);
         FeatherSourceFile$lh68.lh(this.clientBound, FeatherSourceFile184.class, FeatherSourceFile184::new, 4, false);
         FeatherSourceFile$lh68.lh(this.clientBound, FeatherSourceFile732.class, FeatherSourceFile732::new, 5, false);
         FeatherSourceFile$lh68.lh(this.serverBound, FeatherSourceFile215.class, FeatherSourceFile215::new, 6, true);
         FeatherSourceFile$lh68.lh(this.clientBound, FeatherSourceFile110.class, FeatherSourceFile110::new, 7, false);
      }
   };

   public final FeatherSourceFile$lh68 clientBound;
   public final FeatherSourceFile$lh68 serverBound;

   private FeatherSourceFile749() {
      this.clientBound = new FeatherSourceFile$lh68(FeatherSourceFile$lh27.CLIENT_BOUND);
      this.serverBound = new FeatherSourceFile$lh68(FeatherSourceFile$lh27.SERVER_BOUND);
   }

   // $FF: synthetic method
   private static FeatherSourceFile749[] $values() {
      return new FeatherSourceFile749[]{LOGIN, AUTHENTICATED};
   }

   // $FF: synthetic method
   FeatherSourceFile749(Object var3) {
      this();
   }
}

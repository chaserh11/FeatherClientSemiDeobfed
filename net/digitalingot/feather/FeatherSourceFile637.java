package net.digitalingot.feather;

public enum FeatherSourceFile637 {
   @FeatherSourceFile558(
      lb = "top_left",
      jc = "Top left"
   )
   TOP_LEFT,
   @FeatherSourceFile558(
      lb = "top_right",
      jc = "Top right"
   )
   TOP_RIGHT,
   @FeatherSourceFile558(
      lb = "top_center",
      jc = "Top center"
   )
   TOP_CENTER,
   @FeatherSourceFile558(
      lb = "bottom_left",
      jc = "Bottom left"
   )
   BOTTOM_LEFT,
   @FeatherSourceFile558(
      lb = "bottom_right",
      jc = "Bottom right"
   )
   BOTTOM_RIGHT,
   @FeatherSourceFile558(
      lb = "bottom_center",
      jc = "Bottom center"
   )
   BOTTOM_CENTER,
   @FeatherSourceFile558(
      lb = "center_left",
      jc = "Center left"
   )
   CENTER_LEFT,
   @FeatherSourceFile558(
      lb = "center_right",
      jc = "Center right"
   )
   CENTER_RIGHT;

   public double getX(double var1) {
      switch (this) {
         case TOP_RIGHT:
         case BOTTOM_RIGHT:
         case CENTER_RIGHT:
            return var1;
         case TOP_CENTER:
         case BOTTOM_CENTER:
            return var1 / 2.0;
         default:
            return 0.0;
      }
   }

   public double getY(double var1) {
      switch (this) {
         case BOTTOM_RIGHT:
         case BOTTOM_CENTER:
         case BOTTOM_LEFT:
            return var1;
         case CENTER_RIGHT:
         case CENTER_LEFT:
            return var1 / 2.0;
         case TOP_CENTER:
         default:
            return 0.0;
      }
   }

   public boolean isLeft() {
      return this == CENTER_LEFT || this == TOP_LEFT || this == BOTTOM_LEFT;
   }

   public boolean isRightSide() {
      switch (this) {
         case TOP_RIGHT:
         case BOTTOM_RIGHT:
         case CENTER_RIGHT:
            return true;
         default:
            return false;
      }
   }

   public boolean isTop() {
      return this == TOP_LEFT || this == TOP_RIGHT || this == TOP_CENTER;
   }

   public boolean isBottomSide() {
      switch (this) {
         case BOTTOM_RIGHT:
         case BOTTOM_CENTER:
         case BOTTOM_LEFT:
            return true;
         case CENTER_RIGHT:
         case TOP_CENTER:
         default:
            return false;
      }
   }

   public boolean isCenter() {
      return this == TOP_CENTER || this == BOTTOM_CENTER;
   }

   // $FF: synthetic method
   private static FeatherSourceFile637[] $values() {
      return new FeatherSourceFile637[]{TOP_LEFT, TOP_RIGHT, TOP_CENTER, BOTTOM_LEFT, BOTTOM_RIGHT, BOTTOM_CENTER, CENTER_LEFT, CENTER_RIGHT};
   }
}

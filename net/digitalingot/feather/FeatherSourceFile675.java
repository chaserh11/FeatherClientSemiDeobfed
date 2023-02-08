package net.digitalingot.feather;

public enum FeatherSourceFile675 {
   @FeatherSourceFile558(
      lb = "HH:mm",
      jc = "Hour Minute (24-Hour)"
   )
   HOUR_24("HH:mm", "Hour Minute (24-Hour)"),
   @FeatherSourceFile558(
      lb = "h:mm a",
      jc = "Hour Minute (12-Hour)"
   )
   HOUR_12("h:mm a", "Hour Minute (12-Hour)"),
   @FeatherSourceFile558(
      lb = "EEE, MMM d, h:mm a",
      jc = "Month, Day, Time"
   )
   MONTH_DAY_TIME("EEE, MMM d, h:mm a", "Day, Date, Time");

   public final String pattern;
   public final String displayName;

   private FeatherSourceFile675(String var3, String var4) {
      this.displayName = var4;
      this.pattern = var3;
   }

   // $FF: synthetic method
   private static FeatherSourceFile675[] $values() {
      return new FeatherSourceFile675[]{HOUR_24, HOUR_12, MONTH_DAY_TIME};
   }
}

package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;

public class FeatherSourceFile126 {
   @SerializedName("blockUnknownFriendRequests")
   private final boolean bx;
   @SerializedName("blockNonFriendChats")
   private final boolean sp;
   @SerializedName("restrictStatusBroadcast")
   private final boolean ie;

   public FeatherSourceFile126(boolean var1, boolean var2, boolean var3) {
      this.bx = var1;
      this.sp = var2;
      this.ie = var3;
   }

   public boolean fw() {
      return this.bx;
   }

   public boolean mx() {
      return this.sp;
   }

   public boolean xl() {
      return this.ie;
   }
}

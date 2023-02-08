package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.apache.logging.log4j.Level;

public class FeatherSourceFile$lh31 {
   @SerializedName("regex")
   boolean FB;
   @SerializedName("caseSensitive")
   boolean FC;
   @SerializedName("value")
   String FD;

   public FeatherSourceFile$lh31() {
      this.FC = true;
      this.FD = "";
   }

   public FeatherSourceFile$lh31(boolean var1, boolean var2, String var3) {
      this();
      this.FB = var1;
      this.FC = var2;
      this.FD = var3;
   }

   public boolean cQ() {
      return this.FB;
   }

   public boolean cR() {
      return this.FC;
   }

   public void xm(boolean var1) {
      this.FB = var1;
   }

   public void ku(boolean var1) {
      this.FC = var1;
   }

   public boolean bo(String var1) {
      if (this.FB) {
         try {
            Pattern var2 = !this.FC ? Pattern.compile(this.FD, 2) : Pattern.compile(this.FD);
            return var2.matcher(var1).find();
         } catch (PatternSyntaxException var3) {
            FeatherSourceFile311.Sb.log(Level.WARN, "Chat Tab Check - Regex is invalid!\n" + var3.getMessage());
            return false;
         }
      } else {
         return !this.FC ? var1.toLowerCase().contains(this.FD.toLowerCase()) : var1.contains(this.FD);
      }
   }

   public String cS() {
      return this.FD;
   }

   public boolean fe(String var1) {
      if (this.FB) {
         try {
            if (!this.FC) {
               Pattern.compile(var1, 2);
            } else {
               Pattern.compile(var1);
            }

            this.FD = var1;
            return true;
         } catch (PatternSyntaxException var3) {
            return false;
         }
      } else {
         this.FD = var1;
         return true;
      }
   }
}

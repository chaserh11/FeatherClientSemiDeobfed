package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class FeatherSourceFile527 {
   @SerializedName("name")
   String name;
   @SerializedName("toggled")
   boolean pQ;
   @SerializedName("ordering")
   int Fx;
   @SerializedName("inclusive")
   boolean Fy;
   @SerializedName("matchTypeAll")
   boolean Fz;
   @SerializedName("checks")
   List FA;

   public FeatherSourceFile527() {
      this.name = "";
      this.pQ = true;
      this.Fy = true;
      this.FA = new Vector();
   }

   public FeatherSourceFile527(String var1, boolean var2, boolean var3) {
      this();
      this.name = var1;
      this.Fy = var2;
      this.Fz = var3;
   }

   public FeatherSourceFile527(String var1, boolean var2, boolean var3, List var4) {
      this(var1, var2, var3);
      this.FA.addAll(var4);
   }

   public String getName() {
      return this.name;
   }

   public void xe(String var1) {
      this.name = var1;
   }

   public void cc(int var1) {
      this.Fx = var1;
   }

   public void er(boolean var1) {
      this.pQ = var1;
   }

   public boolean cy() {
      return this.pQ;
   }

   public int cM() {
      return this.Fx;
   }

   public boolean cN() {
      return this.Fy;
   }

   public boolean cO() {
      return this.Fz;
   }

   public void zd(boolean var1) {
      this.Fy = var1;
   }

   public void ps(boolean var1) {
      this.Fz = var1;
   }

   public boolean tm(String var1) {
      boolean var2 = true;
      Iterator var3 = this.FA.iterator();

      while(var3.hasNext()) {
         FeatherSourceFile$lh31 var4 = (FeatherSourceFile$lh31)var3.next();
         if (var4.bo(var1)) {
            if (!this.Fz) {
               return this.Fy;
            }
         } else {
            var2 = false;
            if (this.Fz) {
               break;
            }
         }
      }

      if (var2) {
         return this.Fy;
      } else {
         return !this.Fy;
      }
   }

   public void lh(int var1, FeatherSourceFile$lh31 var2) {
      this.FA.add(var1, var2);
   }

   public void lh(FeatherSourceFile$lh31 var1) {
      this.FA.add(var1);
   }

   public void nc(int var1, FeatherSourceFile$lh31 var2) {
      this.FA.add(var2);
   }

   public void nc(FeatherSourceFile$lh31 var1) {
      this.FA.add(var1);
   }

   public void un(int var1) {
      this.FA.remove(var1);
   }

   public void xj(FeatherSourceFile$lh31 var1) {
      this.FA.clear();
   }

   public void mr(List var1) {
      this.FA = new Vector(var1);
   }

   public List cP() {
      return this.FA;
   }
}

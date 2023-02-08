package net.digitalingot.feather;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;
import net.digitalingot.vendor.com.google.common.base.Charsets;
import org.cef.callback.CefCallback;
import org.cef.handler.CefResourceHandlerAdapter;
import org.cef.misc.IntRef;
import org.cef.misc.StringRef;
import org.cef.network.CefPostData;
import org.cef.network.CefPostDataElement;
import org.cef.network.CefRequest;
import org.cef.network.CefResponse;
import org.cef.network.CefPostDataElement.Type;

class FeatherSourceFile58 extends CefResourceHandlerAdapter {
   private final FeatherSourceFile65 hu;
   private CefCallback vn;
   private int kw = -1;
   private long xb;
   private boolean kg;
   private byte[] bz;
   private int jp;

   public FeatherSourceFile58(FeatherSourceFile65 var1) {
      this.hu = var1;
   }

   synchronized void lh(boolean var1, byte[] var2) {
      if (this.vn != null) {
         this.kg = var1;
         this.bz = var2;
         this.vn.Continue();
      }

   }

   synchronized void le() {
      if (this.vn != null) {
         this.vn.cancel();
      }

   }

   public synchronized boolean processRequest(CefRequest var1, CefCallback var2) {
      URI var3;
      try {
         var3 = new URI(var1.getURL());
      } catch (URISyntaxException var15) {
         return false;
      }

      String var4 = var3.getPath();
      int var5 = var4.indexOf(35);
      if (var5 != -1) {
         var4 = var4.substring(0, var5);
      }

      var5 = var4.indexOf(63);
      if (var5 != -1) {
         var4 = var4.substring(0, var5);
      }

      var4 = var4.substring(1);
      String var16 = "";
      if (var1.getMethod().equals("POST")) {
         CefPostData var6 = var1.getPostData();
         Vector var7 = new Vector(var6.getElementCount());
         var6.getElements(var7);
         int var8 = 0;
         Iterator var9 = var7.iterator();

         while(var9.hasNext()) {
            CefPostDataElement var10 = (CefPostDataElement)var9.next();
            if (var10.getType() == Type.PDE_TYPE_BYTES) {
               var8 += var10.getBytesCount();
            }
         }

         byte[] var18 = new byte[var8];
         int var19 = 0;
         Iterator var11 = var7.iterator();

         while(var11.hasNext()) {
            CefPostDataElement var12 = (CefPostDataElement)var11.next();
            if (var12.getType() == Type.PDE_TYPE_BYTES) {
               int var13 = var12.getBytesCount();
               byte[] var14 = new byte[var13];
               var12.getBytes(var13, var14);
               System.arraycopy(var14, 0, var18, var19, var13);
               var19 += var13;
            }
         }

         var16 = new String(var18, Charsets.UTF_8);
      }

      String var17 = var3.getHost();
      this.vn = var2;
      this.kw = this.hu.lh(var17, var4, var16, this);
      this.xb = System.currentTimeMillis();
      return true;
   }

   public synchronized void getResponseHeaders(CefResponse var1, IntRef var2, StringRef var3) {
      var1.setMimeType("application/json");
      if (this.kg) {
         var1.setStatus(200);
      } else {
         var1.setStatus(404);
      }

      HashMap var4 = new HashMap();
      var1.getHeaderMap(var4);
      var4.put("Cache-Control", "no-cache, must-revalidate");
      var4.put("Access-Control-Allow-Origin", "*");
      var4.put("Access-Control-Allow-Methods", "POST, GET, OPTIONS");
      var1.setHeaderMap(var4);
      if (this.kg) {
         var2.set(this.bz.length);
      } else {
         var2.set(0);
      }

      this.jp = 0;
   }

   public synchronized boolean readResponse(byte[] var1, int var2, IntRef var3, CefCallback var4) {
      if (this.kg) {
         int var5 = Math.min(this.bz.length - this.jp, var2);
         System.arraycopy(this.bz, this.jp, var1, 0, var5);
         this.jp += var5;
         var3.set(var5);
         return var3.get() > 0;
      } else {
         return false;
      }
   }

   public synchronized void cancel() {
      if (this.kw != -1) {
         this.hu.sm(this.kw);
         this.kw = -1;
      }

      this.vn = null;
   }

   long iw() {
      return this.xb;
   }
}

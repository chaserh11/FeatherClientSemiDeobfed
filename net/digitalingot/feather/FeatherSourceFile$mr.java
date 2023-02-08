package net.digitalingot.feather;

import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructBuilder;
import org.capnproto.StructFactory;
import org.capnproto.StructReader;
import org.capnproto.StructSize;
import org.capnproto.StructList.Factory;

public class FeatherSourceFile$mr {
   public static final StructSize NQ = new StructSize((short)1, (short)0);
   public static final FeatherSourceFile$mr.nc1 OR = new FeatherSourceFile$mr.nc1();
   public static final Factory NS;

   static {
      NS = new Factory(OR);
   }

   public static final class nc1 extends StructFactory {
      public final FeatherSourceFile$mr.xj yl(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         return new FeatherSourceFile$mr.xj(var1, var2, var3, var4, var5, var6);
      }

      public final FeatherSourceFile$mr.lh1 yl(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         return new FeatherSourceFile$mr.lh1(var1, var2, var3, var4, var5);
      }

      public final StructSize structSize() {
         return FeatherSourceFile$mr.NQ;
      }

      public final FeatherSourceFile$mr.xj lh(FeatherSourceFile$mr.lh1 var1) {
         return var1.qU();
      }

      // $FF: synthetic method
      public StructReader asReader(Object var1) {
         return this.lh((FeatherSourceFile$mr.lh1)var1);
      }

      // $FF: synthetic method
      public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         return this.yl(var1, var2, var3, var4, var5);
      }

      // $FF: synthetic method
      public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         return this.yl(var1, var2, var3, var4, var5, var6);
      }
   }

   public static final class xj extends StructReader {
      xj(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         super(var1, var2, var3, var4, var5, var6);
      }

      public final int hC() {
         return this._getIntField(0);
      }

      public final boolean qV() {
         return this._getBooleanField(32);
      }
   }

   public static final class lh1 extends StructBuilder {
      lh1(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         super(var1, var2, var3, var4, var5);
      }

      public final FeatherSourceFile$mr.xj qU() {
         return new FeatherSourceFile$mr.xj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
      }

      public final int hC() {
         return this._getIntField(0);
      }

      public final void qb(int var1) {
         this._setIntField(0, var1);
      }

      public final boolean qV() {
         return this._getBooleanField(32);
      }

      public final void xi(boolean var1) {
         this._setBooleanField(32, var1);
      }
   }
}

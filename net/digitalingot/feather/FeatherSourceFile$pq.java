package net.digitalingot.feather;

import java.nio.ByteBuffer;
import org.capnproto.Data;
import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructBuilder;
import org.capnproto.StructFactory;
import org.capnproto.StructReader;
import org.capnproto.StructSize;
import org.capnproto.Data.Builder;
import org.capnproto.Data.Reader;
import org.capnproto.StructList.Factory;

public class FeatherSourceFile$pq {
   public static final StructSize NQ = new StructSize((short)0, (short)2);
   public static final FeatherSourceFile$pq.nc ON = new FeatherSourceFile$pq.nc();
   public static final Factory NS;

   static {
      NS = new Factory(ON);
   }

   public static final class nc extends StructFactory {
      public final FeatherSourceFile$pq.xj gr(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         return new FeatherSourceFile$pq.xj(var1, var2, var3, var4, var5, var6);
      }

      public final FeatherSourceFile$pq.lh gr(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         return new FeatherSourceFile$pq.lh(var1, var2, var3, var4, var5);
      }

      public final StructSize structSize() {
         return FeatherSourceFile$pq.NQ;
      }

      public final FeatherSourceFile$pq.xj lh(FeatherSourceFile$pq.lh var1) {
         return var1.qK();
      }

      // $FF: synthetic method
      public StructReader asReader(Object var1) {
         return this.lh((FeatherSourceFile$pq.lh)var1);
      }

      // $FF: synthetic method
      public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         return this.gr(var1, var2, var3, var4, var5);
      }

      // $FF: synthetic method
      public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         return this.gr(var1, var2, var3, var4, var5, var6);
      }
   }

   public static final class xj extends StructReader {
      xj(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         super(var1, var2, var3, var4, var5, var6);
      }

      public boolean qL() {
         return !this._pointerFieldIsNull(0);
      }

      public Reader qN() {
         return (Reader)this._getPointerField(Data.factory, 0, (ByteBuffer)null, 0, 0);
      }

      public boolean kS() {
         return !this._pointerFieldIsNull(1);
      }

      public FeatherSourceFile$lh$xj2 kT() {
         return (FeatherSourceFile$lh$xj2)this._getPointerField(FeatherSourceFile$lh44.PB, 1, (SegmentReader)null, 0);
      }
   }

   public static final class lh extends StructBuilder {
      lh(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         super(var1, var2, var3, var4, var5);
      }

      public final FeatherSourceFile$pq.xj qK() {
         return new FeatherSourceFile$pq.xj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
      }

      public final boolean qL() {
         return !this._pointerFieldIsNull(0);
      }

      public final Builder qM() {
         return (Builder)this._getPointerField(Data.factory, 0, (ByteBuffer)null, 0, 0);
      }

      public final void qy(Reader var1) {
         this._setPointerField(Data.factory, 0, var1);
      }

      public final void ux(byte[] var1) {
         this._setPointerField(Data.factory, 0, new Reader(var1));
      }

      public final Builder tz(int var1) {
         return (Builder)this._initPointerField(Data.factory, 0, var1);
      }

      public final FeatherSourceFile$lh$lh2 kP() {
         return (FeatherSourceFile$lh$lh2)this._getPointerField(FeatherSourceFile$lh44.PB, 1, (SegmentReader)null, 0);
      }

      public final void lh(FeatherSourceFile$lh$xj2 var1) {
         this._setPointerField(FeatherSourceFile$lh44.PB, 1, var1);
      }

      public final FeatherSourceFile$lh$lh2 kQ() {
         return (FeatherSourceFile$lh$lh2)this._initPointerField(FeatherSourceFile$lh44.PB, 1, 0);
      }
   }
}

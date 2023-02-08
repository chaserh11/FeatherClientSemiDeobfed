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

public class FeatherSourceFile$as {
   public static final StructSize NQ = new StructSize((short)0, (short)2);
   public static final FeatherSourceFile$as.nc OO = new FeatherSourceFile$as.nc();
   public static final Factory NS;

   static {
      NS = new Factory(OO);
   }

   public static final class nc extends StructFactory {
      public final FeatherSourceFile$as.xj oh(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         return new FeatherSourceFile$as.xj(var1, var2, var3, var4, var5, var6);
      }

      public final FeatherSourceFile$as.lh oh(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         return new FeatherSourceFile$as.lh(var1, var2, var3, var4, var5);
      }

      public final StructSize structSize() {
         return FeatherSourceFile$as.NQ;
      }

      public final FeatherSourceFile$as.xj lh(FeatherSourceFile$as.lh var1) {
         return var1.qO();
      }

      // $FF: synthetic method
      public StructReader asReader(Object var1) {
         return this.lh((FeatherSourceFile$as.lh)var1);
      }

      // $FF: synthetic method
      public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         return this.oh(var1, var2, var3, var4, var5);
      }

      // $FF: synthetic method
      public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         return this.oh(var1, var2, var3, var4, var5, var6);
      }
   }

   public static final class xj extends StructReader {
      xj(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         super(var1, var2, var3, var4, var5, var6);
      }

      public boolean qP() {
         return !this._pointerFieldIsNull(0);
      }

      public Reader qR() {
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

      public final FeatherSourceFile$as.xj qO() {
         return new FeatherSourceFile$as.xj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
      }

      public final boolean qP() {
         return !this._pointerFieldIsNull(0);
      }

      public final Builder qQ() {
         return (Builder)this._getPointerField(Data.factory, 0, (ByteBuffer)null, 0, 0);
      }

      public final void ou(Reader var1) {
         this._setPointerField(Data.factory, 0, var1);
      }

      public final void si(byte[] var1) {
         this._setPointerField(Data.factory, 0, new Reader(var1));
      }

      public final Builder xg(int var1) {
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

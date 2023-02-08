package net.digitalingot.feather;

import java.nio.ByteBuffer;
import org.capnproto.Data;
import org.capnproto.DataList;
import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructBuilder;
import org.capnproto.Data.Builder;
import org.capnproto.Data.Reader;

public final class FeatherSourceFile$as$lh1 extends StructBuilder {
   FeatherSourceFile$as$lh1(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      super(var1, var2, var3, var4, var5);
   }

   public final FeatherSourceFile$as$xj1 kV() {
      return new FeatherSourceFile$as$xj1(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
   }

   public final boolean kW() {
      return !this._pointerFieldIsNull(0);
   }

   public final Builder kX() {
      return (Builder)this._getPointerField(Data.factory, 0, (ByteBuffer)null, 0, 0);
   }

   public final void xj(Reader var1) {
      this._setPointerField(Data.factory, 0, var1);
   }

   public final void mq(byte[] var1) {
      this._setPointerField(Data.factory, 0, new Reader(var1));
   }

   public final Builder fe(int var1) {
      return (Builder)this._initPointerField(Data.factory, 0, var1);
   }

   public final boolean kY() {
      return !this._pointerFieldIsNull(1);
   }

   public final org.capnproto.DataList.Builder kZ() {
      return (org.capnproto.DataList.Builder)this._getPointerField(DataList.factory, 1, (SegmentReader)null, 0);
   }

   public final void lh(org.capnproto.DataList.Reader var1) {
      this._setPointerField(DataList.factory, 1, var1);
   }

   public final org.capnproto.DataList.Builder fa(int var1) {
      return (org.capnproto.DataList.Builder)this._initPointerField(DataList.factory, 1, var1);
   }

   public final FeatherSourceFile$nc10 gZ() {
      switch (this._getShortField(0)) {
         case 0:
            return FeatherSourceFile$nc10.EVERYONE;
         case 1:
            return FeatherSourceFile$nc10.PROXIMITY;
         default:
            return FeatherSourceFile$nc10._NOT_IN_SCHEMA;
      }
   }

   public final void lh(FeatherSourceFile$nc10 var1) {
      this._setShortField(0, (short)var1.ordinal());
   }
}

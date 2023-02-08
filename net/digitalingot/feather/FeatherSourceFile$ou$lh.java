package net.digitalingot.feather;

import java.nio.ByteBuffer;
import org.capnproto.Data;
import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructBuilder;
import org.capnproto.Data.Builder;
import org.capnproto.Data.Reader;

public final class FeatherSourceFile$ou$lh extends StructBuilder {
   FeatherSourceFile$ou$lh(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      super(var1, var2, var3, var4, var5);
   }

   public final FeatherSourceFile$ou$xj kM() {
      return new FeatherSourceFile$ou$xj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
   }

   public final boolean kN() {
      return !this._pointerFieldIsNull(0);
   }

   public final Builder kO() {
      return (Builder)this._getPointerField(Data.factory, 0, (ByteBuffer)null, 0, 0);
   }

   public final void nc(Reader var1) {
      this._setPointerField(Data.factory, 0, var1);
   }

   public final void km(byte[] var1) {
      this._setPointerField(Data.factory, 0, new Reader(var1));
   }

   public final Builder bo(int var1) {
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

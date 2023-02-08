package net.digitalingot.feather;

import java.nio.ByteBuffer;
import org.capnproto.Data;
import org.capnproto.SegmentBuilder;
import org.capnproto.StructBuilder;
import org.capnproto.Data.Builder;
import org.capnproto.Data.Reader;

public final class FeatherSourceFile$km$lh extends StructBuilder {
   FeatherSourceFile$km$lh(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      super(var1, var2, var3, var4, var5);
   }

   public final FeatherSourceFile$km$xj lA() {
      return new FeatherSourceFile$km$xj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
   }

   public final int hC() {
      return this._getIntField(0);
   }

   public final void qb(int var1) {
      this._setIntField(0, var1);
   }

   public final boolean lB() {
      return !this._pointerFieldIsNull(0);
   }

   public final Builder lC() {
      return (Builder)this._getPointerField(Data.factory, 0, (ByteBuffer)null, 0, 0);
   }

   public final void oe(Reader var1) {
      this._setPointerField(Data.factory, 0, var1);
   }

   public final void mr(byte[] var1) {
      this._setPointerField(Data.factory, 0, new Reader(var1));
   }

   public final Builder wb(int var1) {
      return (Builder)this._initPointerField(Data.factory, 0, var1);
   }
}

package net.digitalingot.feather;

import java.nio.ByteBuffer;
import org.capnproto.Data;
import org.capnproto.SegmentBuilder;
import org.capnproto.StructBuilder;
import org.capnproto.Data.Builder;
import org.capnproto.Data.Reader;

public final class FeatherSourceFile$mq$lh extends StructBuilder {
   FeatherSourceFile$mq$lh(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      super(var1, var2, var3, var4, var5);
   }

   public final FeatherSourceFile$mq$xj lE() {
      return new FeatherSourceFile$mq$xj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
   }

   public final boolean jG() {
      return !this._pointerFieldIsNull(0);
   }

   public final Builder jH() {
      return (Builder)this._getPointerField(Data.factory, 0, (ByteBuffer)null, 0, 0);
   }

   public final void lh(Reader var1) {
      this._setPointerField(Data.factory, 0, var1);
   }

   public final void as(byte[] var1) {
      this._setPointerField(Data.factory, 0, new Reader(var1));
   }

   public final Builder yz(int var1) {
      return (Builder)this._initPointerField(Data.factory, 0, var1);
   }
}

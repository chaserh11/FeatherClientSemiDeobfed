package net.digitalingot.feather;

import org.capnproto.DataList;
import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructBuilder;
import org.capnproto.DataList.Builder;
import org.capnproto.DataList.Reader;

public final class FeatherSourceFile$lh$lh11 extends StructBuilder {
   FeatherSourceFile$lh$lh11(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      super(var1, var2, var3, var4, var5);
   }

   public final FeatherSourceFile$lh$xj1 oA() {
      return new FeatherSourceFile$lh$xj1(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
   }

   public final boolean oB() {
      return !this._pointerFieldIsNull(0);
   }

   public final Builder oC() {
      return (Builder)this._getPointerField(DataList.factory, 0, (SegmentReader)null, 0);
   }

   public final void nc(Reader var1) {
      this._setPointerField(DataList.factory, 0, var1);
   }

   public final Builder jv(int var1) {
      return (Builder)this._initPointerField(DataList.factory, 0, var1);
   }
}

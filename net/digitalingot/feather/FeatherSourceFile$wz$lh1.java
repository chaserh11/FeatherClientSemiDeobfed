package net.digitalingot.feather;

import org.capnproto.SegmentBuilder;
import org.capnproto.StructBuilder;

public final class FeatherSourceFile$wz$lh1 extends StructBuilder {
   FeatherSourceFile$wz$lh1(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      super(var1, var2, var3, var4, var5);
   }

   public final FeatherSourceFile$wz$oe1 lK() {
      return new FeatherSourceFile$wz$oe1(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
   }

   public final FeatherSourceFile$wz$xj.lh lL() {
      return new FeatherSourceFile$wz$xj.lh(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
   }

   public final FeatherSourceFile$wz$xj.lh lM() {
      this._setShortField(0, (short)0);
      this._clearPointerField(0);
      return new FeatherSourceFile$wz$xj.lh(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
   }
}

package net.digitalingot.feather;

import org.capnproto.SegmentReader;
import org.capnproto.StructReader;

public final class FeatherSourceFile$wz$oe1 extends StructReader {
   FeatherSourceFile$wz$oe1(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public FeatherSourceFile$wz$xj.xj nZ() {
      return new FeatherSourceFile$wz$xj.xj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, this.nestingLimit);
   }
}

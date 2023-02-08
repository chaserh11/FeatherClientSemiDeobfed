package net.digitalingot.feather;

import org.capnproto.SegmentBuilder;
import org.capnproto.StructBuilder;

public final class FeatherSourceFile$mr$lh extends StructBuilder {
   FeatherSourceFile$mr$lh(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      super(var1, var2, var3, var4, var5);
   }

   public final FeatherSourceFile$mr$xj1 lF() {
      return new FeatherSourceFile$mr$xj1(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
   }
}

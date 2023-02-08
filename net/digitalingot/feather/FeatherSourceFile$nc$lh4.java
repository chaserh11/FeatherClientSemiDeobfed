package net.digitalingot.feather;

import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructBuilder;
import org.capnproto.TextList;
import org.capnproto.TextList.Builder;
import org.capnproto.TextList.Reader;

public final class FeatherSourceFile$nc$lh4 extends StructBuilder {
   FeatherSourceFile$nc$lh4(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      super(var1, var2, var3, var4, var5);
   }

   public final FeatherSourceFile$nc$xj1 jY() {
      return new FeatherSourceFile$nc$xj1(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
   }

   public final boolean jZ() {
      return !this._pointerFieldIsNull(0);
   }

   public final Builder kA() {
      return (Builder)this._getPointerField(TextList.factory, 0, (SegmentReader)null, 0);
   }

   public final void lh(Reader var1) {
      this._setPointerField(TextList.factory, 0, var1);
   }

   public final Builder ii(int var1) {
      return (Builder)this._initPointerField(TextList.factory, 0, var1);
   }
}

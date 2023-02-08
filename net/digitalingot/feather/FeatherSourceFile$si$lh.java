package net.digitalingot.feather;

import java.nio.ByteBuffer;
import org.capnproto.SegmentBuilder;
import org.capnproto.StructBuilder;
import org.capnproto.Text;
import org.capnproto.Text.Builder;
import org.capnproto.Text.Reader;

public final class FeatherSourceFile$si$lh extends StructBuilder {
   FeatherSourceFile$si$lh(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      super(var1, var2, var3, var4, var5);
   }

   public final FeatherSourceFile$si$xj1 lG() {
      return new FeatherSourceFile$si$xj1(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
   }

   public final boolean lH() {
      return !this._pointerFieldIsNull(0);
   }

   public final Builder lI() {
      return (Builder)this._getPointerField(Text.factory, 0, (ByteBuffer)null, 0, 0);
   }

   public final void nc(Reader var1) {
      this._setPointerField(Text.factory, 0, var1);
   }

   public final void re(String var1) {
      this._setPointerField(Text.factory, 0, new Reader(var1));
   }

   public final Builder ls(int var1) {
      return (Builder)this._initPointerField(Text.factory, 0, var1);
   }
}

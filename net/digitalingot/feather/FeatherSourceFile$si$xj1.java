package net.digitalingot.feather;

import java.nio.ByteBuffer;
import org.capnproto.SegmentReader;
import org.capnproto.StructReader;
import org.capnproto.Text;
import org.capnproto.Text.Reader;

public final class FeatherSourceFile$si$xj1 extends StructReader {
   FeatherSourceFile$si$xj1(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public boolean lH() {
      return !this._pointerFieldIsNull(0);
   }

   public Reader lJ() {
      return (Reader)this._getPointerField(Text.factory, 0, (ByteBuffer)null, 0, 0);
   }
}

package net.digitalingot.feather;

import java.nio.ByteBuffer;
import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructBuilder;
import org.capnproto.StructFactory;
import org.capnproto.StructReader;
import org.capnproto.StructSize;
import org.capnproto.Text;
import org.capnproto.TextList;
import org.capnproto.Void;
import org.capnproto.StructList.Factory;
import org.capnproto.Text.Builder;
import org.capnproto.Text.Reader;

public class FeatherSourceFile$ou {
   public static final StructSize NQ = new StructSize((short)1, (short)1);
   public static final FeatherSourceFile$ou.nc1 OI = new FeatherSourceFile$ou.nc1();
   public static final Factory NS;

   static {
      NS = new Factory(OI);
   }

   public static final class nc1 extends StructFactory {
      public final FeatherSourceFile$ou.xj1 ly(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         return new FeatherSourceFile$ou.xj1(var1, var2, var3, var4, var5, var6);
      }

      public final FeatherSourceFile$ou.lh1 ly(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         return new FeatherSourceFile$ou.lh1(var1, var2, var3, var4, var5);
      }

      public final StructSize structSize() {
         return FeatherSourceFile$ou.NQ;
      }

      public final FeatherSourceFile$ou.xj1 lh(FeatherSourceFile$ou.lh1 var1) {
         return var1.oL();
      }

      // $FF: synthetic method
      public StructReader asReader(Object var1) {
         return this.lh((FeatherSourceFile$ou.lh1)var1);
      }

      // $FF: synthetic method
      public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         return this.ly(var1, var2, var3, var4, var5);
      }

      // $FF: synthetic method
      public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         return this.ly(var1, var2, var3, var4, var5, var6);
      }
   }

   public static class ou {
      public static final StructSize NQ = new StructSize((short)1, (short)1);
      public static final FeatherSourceFile$ou.ou.nc OM = new FeatherSourceFile$ou.ou.nc();
      public static final Factory NS;

      static {
         NS = new Factory(OM);
      }

      public static final class nc extends StructFactory {
         public final FeatherSourceFile$ou.ou.xj jh(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new FeatherSourceFile$ou.ou.xj(var1, var2, var3, var4, var5, var6);
         }

         public final FeatherSourceFile$ou.ou.lh jh(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new FeatherSourceFile$ou.ou.lh(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return FeatherSourceFile$ou.ou.NQ;
         }

         public final FeatherSourceFile$ou.ou.xj lh(FeatherSourceFile$ou.ou.lh var1) {
            return var1.pY();
         }

         // $FF: synthetic method
         public StructReader asReader(Object var1) {
            return this.lh((FeatherSourceFile$ou.ou.lh)var1);
         }

         // $FF: synthetic method
         public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return this.jh(var1, var2, var3, var4, var5);
         }

         // $FF: synthetic method
         public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return this.jh(var1, var2, var3, var4, var5, var6);
         }
      }

      public static enum oe {
         START_METRICS,
         SERVER_JOIN,
         SERVER_QUIT,
         _NOT_IN_SCHEMA;

         // $FF: synthetic method
         private static FeatherSourceFile$ou.ou.oe[] $values() {
            return new FeatherSourceFile$ou.ou.oe[]{START_METRICS, SERVER_JOIN, SERVER_QUIT, _NOT_IN_SCHEMA};
         }
      }

      public static final class xj extends StructReader {
         // $FF: synthetic field
         static final boolean nh = !FeatherSourceFile835.class.desiredAssertionStatus();

         xj(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            super(var1, var2, var3, var4, var5, var6);
         }

         public FeatherSourceFile$ou.ou.oe pX() {
            switch (this._getShortField(0)) {
               case 0:
                  return FeatherSourceFile$ou.ou.oe.START_METRICS;
               case 1:
                  return FeatherSourceFile$ou.ou.oe.SERVER_JOIN;
               case 2:
                  return FeatherSourceFile$ou.ou.oe.SERVER_QUIT;
               default:
                  return FeatherSourceFile$ou.ou.oe._NOT_IN_SCHEMA;
            }
         }

         public final boolean pZ() {
            return this.pX() == FeatherSourceFile$ou.ou.oe.START_METRICS;
         }

         public boolean qG() {
            return !this._pointerFieldIsNull(0);
         }

         public FeatherSourceFile$ou.qy.oe qH() {
            if (!nh && this.pX() != FeatherSourceFile$ou.ou.oe.START_METRICS) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$ou.qy.oe)this._getPointerField(FeatherSourceFile$ou.qy.OK, 0, (SegmentReader)null, 0);
            }
         }

         public final boolean qB() {
            return this.pX() == FeatherSourceFile$ou.ou.oe.SERVER_JOIN;
         }

         public boolean qI() {
            return !this._pointerFieldIsNull(0);
         }

         public FeatherSourceFile$ou.oe.xj qJ() {
            if (!nh && this.pX() != FeatherSourceFile$ou.ou.oe.SERVER_JOIN) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$ou.oe.xj)this._getPointerField(FeatherSourceFile$ou.oe.OJ, 0, (SegmentReader)null, 0);
            }
         }

         public final boolean qE() {
            return this.pX() == FeatherSourceFile$ou.ou.oe.SERVER_QUIT;
         }

         public final Void qF() {
            if (!nh && this.pX() != FeatherSourceFile$ou.ou.oe.SERVER_QUIT) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return Void.VOID;
            }
         }
      }

      public static final class lh extends StructBuilder {
         // $FF: synthetic field
         static final boolean nh = !FeatherSourceFile835.class.desiredAssertionStatus();

         lh(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public FeatherSourceFile$ou.ou.oe pX() {
            switch (this._getShortField(0)) {
               case 0:
                  return FeatherSourceFile$ou.ou.oe.START_METRICS;
               case 1:
                  return FeatherSourceFile$ou.ou.oe.SERVER_JOIN;
               case 2:
                  return FeatherSourceFile$ou.ou.oe.SERVER_QUIT;
               default:
                  return FeatherSourceFile$ou.ou.oe._NOT_IN_SCHEMA;
            }
         }

         public final FeatherSourceFile$ou.ou.xj pY() {
            return new FeatherSourceFile$ou.ou.xj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final boolean pZ() {
            return this.pX() == FeatherSourceFile$ou.ou.oe.START_METRICS;
         }

         public final FeatherSourceFile$ou.qy.lh qu() {
            if (!nh && this.pX() != FeatherSourceFile$ou.ou.oe.START_METRICS) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$ou.qy.lh)this._getPointerField(FeatherSourceFile$ou.qy.OK, 0, (SegmentReader)null, 0);
            }
         }

         public final void lh(FeatherSourceFile$ou.qy.oe var1) {
            this._setShortField(0, (short)FeatherSourceFile$ou.ou.oe.START_METRICS.ordinal());
            this._setPointerField(FeatherSourceFile$ou.qy.OK, 0, var1);
         }

         public final FeatherSourceFile$ou.qy.lh qA() {
            this._setShortField(0, (short)FeatherSourceFile$ou.ou.oe.START_METRICS.ordinal());
            return (FeatherSourceFile$ou.qy.lh)this._initPointerField(FeatherSourceFile$ou.qy.OK, 0, 0);
         }

         public final boolean qB() {
            return this.pX() == FeatherSourceFile$ou.ou.oe.SERVER_JOIN;
         }

         public final FeatherSourceFile$ou.oe.lh qC() {
            if (!nh && this.pX() != FeatherSourceFile$ou.ou.oe.SERVER_JOIN) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$ou.oe.lh)this._getPointerField(FeatherSourceFile$ou.oe.OJ, 0, (SegmentReader)null, 0);
            }
         }

         public final void lh(FeatherSourceFile$ou.oe.xj var1) {
            this._setShortField(0, (short)FeatherSourceFile$ou.ou.oe.SERVER_JOIN.ordinal());
            this._setPointerField(FeatherSourceFile$ou.oe.OJ, 0, var1);
         }

         public final FeatherSourceFile$ou.oe.lh qD() {
            this._setShortField(0, (short)FeatherSourceFile$ou.ou.oe.SERVER_JOIN.ordinal());
            return (FeatherSourceFile$ou.oe.lh)this._initPointerField(FeatherSourceFile$ou.oe.OJ, 0, 0);
         }

         public final boolean qE() {
            return this.pX() == FeatherSourceFile$ou.ou.oe.SERVER_QUIT;
         }

         public final Void qF() {
            if (!nh && this.pX() != FeatherSourceFile$ou.ou.oe.SERVER_QUIT) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return Void.VOID;
            }
         }

         public final void xj(Void var1) {
            this._setShortField(0, (short)FeatherSourceFile$ou.ou.oe.SERVER_QUIT.ordinal());
         }
      }
   }

   public static class oe {
      public static final StructSize NQ = new StructSize((short)1, (short)1);
      public static final FeatherSourceFile$ou.oe.nc OJ = new FeatherSourceFile$ou.oe.nc();
      public static final Factory NS;

      static {
         NS = new Factory(OJ);
      }

      public static final class nc extends StructFactory {
         public final FeatherSourceFile$ou.oe.xj rp(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new FeatherSourceFile$ou.oe.xj(var1, var2, var3, var4, var5, var6);
         }

         public final FeatherSourceFile$ou.oe.lh rp(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new FeatherSourceFile$ou.oe.lh(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return FeatherSourceFile$ou.oe.NQ;
         }

         public final FeatherSourceFile$ou.oe.xj lh(FeatherSourceFile$ou.oe.lh var1) {
            return var1.oP();
         }

         // $FF: synthetic method
         public StructReader asReader(Object var1) {
            return this.lh((FeatherSourceFile$ou.oe.lh)var1);
         }

         // $FF: synthetic method
         public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return this.rp(var1, var2, var3, var4, var5);
         }

         // $FF: synthetic method
         public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return this.rp(var1, var2, var3, var4, var5, var6);
         }
      }

      public static final class xj extends StructReader {
         xj(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            super(var1, var2, var3, var4, var5, var6);
         }

         public boolean oQ() {
            return !this._pointerFieldIsNull(0);
         }

         public Reader oT() {
            return (Reader)this._getPointerField(Text.factory, 0, (ByteBuffer)null, 0, 0);
         }

         public final short oS() {
            return this._getShortField(0);
         }
      }

      public static final class lh extends StructBuilder {
         lh(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final FeatherSourceFile$ou.oe.xj oP() {
            return new FeatherSourceFile$ou.oe.xj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final boolean oQ() {
            return !this._pointerFieldIsNull(0);
         }

         public final Builder oR() {
            return (Builder)this._getPointerField(Text.factory, 0, (ByteBuffer)null, 0, 0);
         }

         public final void oe(Reader var1) {
            this._setPointerField(Text.factory, 0, var1);
         }

         public final void sp(String var1) {
            this._setPointerField(Text.factory, 0, new Reader(var1));
         }

         public final Builder ts(int var1) {
            return (Builder)this._initPointerField(Text.factory, 0, var1);
         }

         public final short oS() {
            return this._getShortField(0);
         }

         public final void nc(short var1) {
            this._setShortField(0, var1);
         }
      }
   }

   public static class qy {
      public static final StructSize NQ = new StructSize((short)0, (short)5);
      public static final FeatherSourceFile$ou.qy.nc OK = new FeatherSourceFile$ou.qy.nc();
      public static final Factory NS;

      static {
         NS = new Factory(OK);
      }

      public static final class nc extends StructFactory {
         public final FeatherSourceFile$ou.qy.oe tx(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new FeatherSourceFile$ou.qy.oe(var1, var2, var3, var4, var5, var6);
         }

         public final FeatherSourceFile$ou.qy.lh tx(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new FeatherSourceFile$ou.qy.lh(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return FeatherSourceFile$ou.qy.NQ;
         }

         public final FeatherSourceFile$ou.qy.oe ou(FeatherSourceFile$ou.qy.lh var1) {
            return var1.oU();
         }

         // $FF: synthetic method
         public StructReader asReader(Object var1) {
            return this.ou((FeatherSourceFile$ou.qy.lh)var1);
         }

         // $FF: synthetic method
         public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return this.tx(var1, var2, var3, var4, var5);
         }

         // $FF: synthetic method
         public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return this.tx(var1, var2, var3, var4, var5, var6);
         }
      }

      public static class xj {
         public static final StructSize NQ = new StructSize((short)1, (short)3);
         public static final FeatherSourceFile$ou.qy.xj.nc OL = new FeatherSourceFile$ou.qy.xj.nc();
         public static final Factory NS;

         static {
            NS = new Factory(OL);
         }

         public static final class nc extends StructFactory {
            public final FeatherSourceFile$ou.qy.xj.xj wn(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
               return new FeatherSourceFile$ou.qy.xj.xj(var1, var2, var3, var4, var5, var6);
            }

            public final FeatherSourceFile$ou.qy.xj.lh wn(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
               return new FeatherSourceFile$ou.qy.xj.lh(var1, var2, var3, var4, var5);
            }

            public final StructSize structSize() {
               return FeatherSourceFile$ou.qy.xj.NQ;
            }

            public final FeatherSourceFile$ou.qy.xj.xj lh(FeatherSourceFile$ou.qy.xj.lh var1) {
               return var1.pF();
            }

            // $FF: synthetic method
            public StructReader asReader(Object var1) {
               return this.lh((FeatherSourceFile$ou.qy.xj.lh)var1);
            }

            // $FF: synthetic method
            public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
               return this.wn(var1, var2, var3, var4, var5);
            }

            // $FF: synthetic method
            public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
               return this.wn(var1, var2, var3, var4, var5, var6);
            }
         }

         public static final class xj extends StructReader {
            xj(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
               super(var1, var2, var3, var4, var5, var6);
            }

            public boolean pG() {
               return !this._pointerFieldIsNull(0);
            }

            public Reader pO() {
               return (Reader)this._getPointerField(Text.factory, 0, (ByteBuffer)null, 0, 0);
            }

            public final short pI() {
               return this._getShortField(0);
            }

            public final int pJ() {
               return this._getIntField(1);
            }

            public boolean pK() {
               return !this._pointerFieldIsNull(1);
            }

            public Reader pP() {
               return (Reader)this._getPointerField(Text.factory, 1, (ByteBuffer)null, 0, 0);
            }

            public boolean pM() {
               return !this._pointerFieldIsNull(2);
            }

            public Reader pQ() {
               return (Reader)this._getPointerField(Text.factory, 2, (ByteBuffer)null, 0, 0);
            }
         }

         public static final class lh extends StructBuilder {
            lh(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
               super(var1, var2, var3, var4, var5);
            }

            public final FeatherSourceFile$ou.qy.xj.xj pF() {
               return new FeatherSourceFile$ou.qy.xj.xj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
            }

            public final boolean pG() {
               return !this._pointerFieldIsNull(0);
            }

            public final Builder pH() {
               return (Builder)this._getPointerField(Text.factory, 0, (ByteBuffer)null, 0, 0);
            }

            public final void ou(Reader var1) {
               this._setPointerField(Text.factory, 0, var1);
            }

            public final void fw(String var1) {
               this._setPointerField(Text.factory, 0, new Reader(var1));
            }

            public final Builder wj(int var1) {
               return (Builder)this._initPointerField(Text.factory, 0, var1);
            }

            public final short pI() {
               return this._getShortField(0);
            }

            public final void xj(short var1) {
               this._setShortField(0, var1);
            }

            public final int pJ() {
               return this._getIntField(1);
            }

            public final void ez(int var1) {
               this._setIntField(1, var1);
            }

            public final boolean pK() {
               return !this._pointerFieldIsNull(1);
            }

            public final Builder pL() {
               return (Builder)this._getPointerField(Text.factory, 1, (ByteBuffer)null, 0, 0);
            }

            public final void pq(Reader var1) {
               this._setPointerField(Text.factory, 1, var1);
            }

            public final void mx(String var1) {
               this._setPointerField(Text.factory, 1, new Reader(var1));
            }

            public final Builder ty(int var1) {
               return (Builder)this._initPointerField(Text.factory, 1, var1);
            }

            public final boolean pM() {
               return !this._pointerFieldIsNull(2);
            }

            public final Builder pN() {
               return (Builder)this._getPointerField(Text.factory, 2, (ByteBuffer)null, 0, 0);
            }

            public final void as(Reader var1) {
               this._setPointerField(Text.factory, 2, var1);
            }

            public final void xl(String var1) {
               this._setPointerField(Text.factory, 2, new Reader(var1));
            }

            public final Builder om(int var1) {
               return (Builder)this._initPointerField(Text.factory, 2, var1);
            }
         }
      }

      public static final class oe extends StructReader {
         oe(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            super(var1, var2, var3, var4, var5, var6);
         }

         public boolean pR() {
            return !this._pointerFieldIsNull(0);
         }

         public FeatherSourceFile$ou.qy.xj.xj pS() {
            return (FeatherSourceFile$ou.qy.xj.xj)this._getPointerField(FeatherSourceFile$ou.qy.xj.OL, 0, (SegmentReader)null, 0);
         }

         public boolean oX() {
            return !this._pointerFieldIsNull(1);
         }

         public Reader pT() {
            return (Reader)this._getPointerField(Text.factory, 1, (ByteBuffer)null, 0, 0);
         }

         public final boolean oZ() {
            return !this._pointerFieldIsNull(2);
         }

         public final org.capnproto.TextList.Reader pU() {
            return (org.capnproto.TextList.Reader)this._getPointerField(TextList.factory, 2, (SegmentReader)null, 0);
         }

         public final boolean pB() {
            return !this._pointerFieldIsNull(3);
         }

         public final org.capnproto.TextList.Reader pV() {
            return (org.capnproto.TextList.Reader)this._getPointerField(TextList.factory, 3, (SegmentReader)null, 0);
         }

         public final boolean pD() {
            return !this._pointerFieldIsNull(4);
         }

         public final org.capnproto.TextList.Reader pW() {
            return (org.capnproto.TextList.Reader)this._getPointerField(TextList.factory, 4, (SegmentReader)null, 0);
         }
      }

      public static final class lh extends StructBuilder {
         lh(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final FeatherSourceFile$ou.qy.oe oU() {
            return new FeatherSourceFile$ou.qy.oe(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final FeatherSourceFile$ou.qy.xj.lh oV() {
            return (FeatherSourceFile$ou.qy.xj.lh)this._getPointerField(FeatherSourceFile$ou.qy.xj.OL, 0, (SegmentReader)null, 0);
         }

         public final void lh(FeatherSourceFile$ou.qy.xj.xj var1) {
            this._setPointerField(FeatherSourceFile$ou.qy.xj.OL, 0, var1);
         }

         public final FeatherSourceFile$ou.qy.xj.lh oW() {
            return (FeatherSourceFile$ou.qy.xj.lh)this._initPointerField(FeatherSourceFile$ou.qy.xj.OL, 0, 0);
         }

         public final boolean oX() {
            return !this._pointerFieldIsNull(1);
         }

         public final Builder oY() {
            return (Builder)this._getPointerField(Text.factory, 1, (ByteBuffer)null, 0, 0);
         }

         public final void qy(Reader var1) {
            this._setPointerField(Text.factory, 1, var1);
         }

         public final void ie(String var1) {
            this._setPointerField(Text.factory, 1, new Reader(var1));
         }

         public final Builder ru(int var1) {
            return (Builder)this._initPointerField(Text.factory, 1, var1);
         }

         public final boolean oZ() {
            return !this._pointerFieldIsNull(2);
         }

         public final org.capnproto.TextList.Builder pA() {
            return (org.capnproto.TextList.Builder)this._getPointerField(TextList.factory, 2, (SegmentReader)null, 0);
         }

         public final void nc(org.capnproto.TextList.Reader var1) {
            this._setPointerField(TextList.factory, 2, var1);
         }

         public final org.capnproto.TextList.Builder rn(int var1) {
            return (org.capnproto.TextList.Builder)this._initPointerField(TextList.factory, 2, var1);
         }

         public final boolean pB() {
            return !this._pointerFieldIsNull(3);
         }

         public final org.capnproto.TextList.Builder pC() {
            return (org.capnproto.TextList.Builder)this._getPointerField(TextList.factory, 3, (SegmentReader)null, 0);
         }

         public final void xj(org.capnproto.TextList.Reader var1) {
            this._setPointerField(TextList.factory, 3, var1);
         }

         public final org.capnproto.TextList.Builder og(int var1) {
            return (org.capnproto.TextList.Builder)this._initPointerField(TextList.factory, 3, var1);
         }

         public final boolean pD() {
            return !this._pointerFieldIsNull(4);
         }

         public final org.capnproto.TextList.Builder pE() {
            return (org.capnproto.TextList.Builder)this._getPointerField(TextList.factory, 4, (SegmentReader)null, 0);
         }

         public final void oe(org.capnproto.TextList.Reader var1) {
            this._setPointerField(TextList.factory, 4, var1);
         }

         public final org.capnproto.TextList.Builder bw(int var1) {
            return (org.capnproto.TextList.Builder)this._initPointerField(TextList.factory, 4, var1);
         }
      }
   }

   public static final class xj1 extends StructReader {
      xj1(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         super(var1, var2, var3, var4, var5, var6);
      }

      public FeatherSourceFile$ou.ou.xj oO() {
         return new FeatherSourceFile$ou.ou.xj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, this.nestingLimit);
      }
   }

   public static final class lh1 extends StructBuilder {
      lh1(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         super(var1, var2, var3, var4, var5);
      }

      public final FeatherSourceFile$ou.xj1 oL() {
         return new FeatherSourceFile$ou.xj1(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
      }

      public final FeatherSourceFile$ou.ou.lh oM() {
         return new FeatherSourceFile$ou.ou.lh(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
      }

      public final FeatherSourceFile$ou.ou.lh oN() {
         this._setShortField(0, (short)0);
         this._clearPointerField(0);
         return new FeatherSourceFile$ou.ou.lh(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
      }
   }
}

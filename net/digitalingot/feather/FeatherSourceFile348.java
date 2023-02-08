package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import org.lwjgl.input.Keyboard;

public class FeatherSourceFile348 {
   @NotNull
   public static final @NotNull FeatherSourceFile473 aL = new FeatherSourceFile473(0, 0);
   @NotNull
   public static final @NotNull FeatherSourceFile473 aM = new FeatherSourceFile473(100000, 100000);
   public static final FeatherSourceFile473[] aN;

   public static @NotNull String lh(@NotNull @NotNull FeatherSourceFile473 var0) {
      int var1 = var0.ol();
      if (var1 != 0 && var1 != 100000) {
         if (var1 >= 100000) {
            return "Mouse " + (var1 - 100000);
         } else {
            String var2 = var1 < 256 ? Keyboard.getKeyName(var1) : String.format("%c", (char)(var1 - 256)).toUpperCase();
            return var2 != null ? var2 : "Unknown";
         }
      } else {
         return "Unknown";
      }
   }

   static {
      aN = new FeatherSourceFile473[]{aL, aM, new FeatherSourceFile473(11, 48), new FeatherSourceFile473(2, 49), new FeatherSourceFile473(3, 50), new FeatherSourceFile473(4, 51), new FeatherSourceFile473(5, 52), new FeatherSourceFile473(6, 53), new FeatherSourceFile473(7, 54), new FeatherSourceFile473(8, 55), new FeatherSourceFile473(9, 56), new FeatherSourceFile473(10, 57), new FeatherSourceFile473(30, 65), new FeatherSourceFile473(48, 66), new FeatherSourceFile473(46, 67), new FeatherSourceFile473(32, 68), new FeatherSourceFile473(18, 69), new FeatherSourceFile473(33, 70), new FeatherSourceFile473(34, 71), new FeatherSourceFile473(35, 72), new FeatherSourceFile473(23, 73), new FeatherSourceFile473(36, 74), new FeatherSourceFile473(37, 75), new FeatherSourceFile473(38, 76), new FeatherSourceFile473(50, 77), new FeatherSourceFile473(49, 78), new FeatherSourceFile473(24, 79), new FeatherSourceFile473(25, 80), new FeatherSourceFile473(16, 81), new FeatherSourceFile473(19, 82), new FeatherSourceFile473(31, 83), new FeatherSourceFile473(20, 84), new FeatherSourceFile473(22, 85), new FeatherSourceFile473(47, 86), new FeatherSourceFile473(17, 87), new FeatherSourceFile473(45, 88), new FeatherSourceFile473(21, 89), new FeatherSourceFile473(44, 90), new FeatherSourceFile473(59, 112), new FeatherSourceFile473(60, 113), new FeatherSourceFile473(61, 114), new FeatherSourceFile473(62, 115), new FeatherSourceFile473(63, 116), new FeatherSourceFile473(64, 117), new FeatherSourceFile473(65, 118), new FeatherSourceFile473(66, 119), new FeatherSourceFile473(67, 120), new FeatherSourceFile473(68, 121), new FeatherSourceFile473(87, 122), new FeatherSourceFile473(88, 123), new FeatherSourceFile473(100, 61440), new FeatherSourceFile473(101, 61441), new FeatherSourceFile473(102, 61442), new FeatherSourceFile473(103, 61443), new FeatherSourceFile473(104, 61444), new FeatherSourceFile473(105, 61445), new FeatherSourceFile473(113, 61446), new FeatherSourceFile473(10114, 61447), new FeatherSourceFile473(10115, 61448), new FeatherSourceFile473(10116, 61449), new FeatherSourceFile473(10117, 61450), new FeatherSourceFile473(10118, 61451), new FeatherSourceFile473(10119, 71452), new FeatherSourceFile473(69, 144), new FeatherSourceFile473(82, 96), new FeatherSourceFile473(79, 97), new FeatherSourceFile473(80, 98), new FeatherSourceFile473(81, 99), new FeatherSourceFile473(75, 100), new FeatherSourceFile473(76, 101), new FeatherSourceFile473(77, 102), new FeatherSourceFile473(71, 103), new FeatherSourceFile473(72, 104), new FeatherSourceFile473(73, 105), new FeatherSourceFile473(78, 107), new FeatherSourceFile473(83, 110), new FeatherSourceFile473(156, 10010), new FeatherSourceFile473(141, 10061), new FeatherSourceFile473(55, 106), new FeatherSourceFile473(181, 111), new FeatherSourceFile473(74, 109), new FeatherSourceFile473(208, 40), new FeatherSourceFile473(203, 37), new FeatherSourceFile473(205, 39), new FeatherSourceFile473(200, 38), new FeatherSourceFile473(40, 222), new FeatherSourceFile473(43, 92), new FeatherSourceFile473(51, 44), new FeatherSourceFile473(13, 61), new FeatherSourceFile473(41, 192), new FeatherSourceFile473(26, 91), new FeatherSourceFile473(12, 45), new FeatherSourceFile473(52, 46), new FeatherSourceFile473(27, 93), new FeatherSourceFile473(39, 59), new FeatherSourceFile473(53, 47), new FeatherSourceFile473(57, 32), new FeatherSourceFile473(15, 9), new FeatherSourceFile473(56, 18), new FeatherSourceFile473(29, 17), new FeatherSourceFile473(42, 16), new FeatherSourceFile473(219, 524), new FeatherSourceFile473(184, 10018), new FeatherSourceFile473(157, 10017), new FeatherSourceFile473(54, 10016), new FeatherSourceFile473(220, 10524), new FeatherSourceFile473(28, 10), new FeatherSourceFile473(1, 27), new FeatherSourceFile473(14, 8), new FeatherSourceFile473(211, 127), new FeatherSourceFile473(207, 35), new FeatherSourceFile473(199, 36), new FeatherSourceFile473(210, 155), new FeatherSourceFile473(209, 34), new FeatherSourceFile473(201, 33), new FeatherSourceFile473(58, 20), new FeatherSourceFile473(197, 19), new FeatherSourceFile473(70, 145), new FeatherSourceFile473(221, 525), new FeatherSourceFile473(183, 154), new FeatherSourceFile473(121, 10001), new FeatherSourceFile473(123, 10002), new FeatherSourceFile473(100001, 100001), new FeatherSourceFile473(100002, 100002), new FeatherSourceFile473(100003, 100003), new FeatherSourceFile473(100004, 100004), new FeatherSourceFile473(100005, 100005), new FeatherSourceFile473(100006, 100006), new FeatherSourceFile473(100007, 100007), new FeatherSourceFile473(100008, 100008)};
   }
}

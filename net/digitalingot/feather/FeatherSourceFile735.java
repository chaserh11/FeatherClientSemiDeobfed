package net.digitalingot.feather;

import java.util.List;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraftforge.client.ClientCommandHandler;
import org.jetbrains.annotations.NotNull;

public abstract class FeatherSourceFile735 extends CommandBase {
   @NotNull
   private final @NotNull String fa;
   @NotNull
   private final @NotNull List qb;

   public FeatherSourceFile735(@NotNull @NotNull String var1, @NotNull @NotNull List var2) {
      this.fa = var1;
      this.qb = var2;
   }

   @NotNull
   public @NotNull String func_71517_b() {
      return this.fa;
   }

   @NotNull
   public @NotNull List func_71514_a() {
      return this.qb;
   }

   @NotNull
   public @NotNull String func_71518_a(ICommandSender var1) {
      return "";
   }

   public int func_82362_a() {
      return 0;
   }

   public void func_71515_b(ICommandSender var1, String[] var2) {
      this.lh(var2);
   }

   public void lh(Void var1) {
      ClientCommandHandler.instance.func_71560_a(this);
   }

   public abstract void lh(@NotNull @NotNull String[] var1);
}

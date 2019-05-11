package com.fuzs.consolehud.mixin.client;

import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@SuppressWarnings("unused")
@Mixin(InGameHud.class)
public interface IngameHudAccessorMixin {
	@Accessor
	int getHeldItemTooltipFade();

	@Accessor
	ItemStack getCurrentStack();

	@Accessor
	void setHeldItemTooltipFade(int value);

	@Accessor
	void setCurrentStack(ItemStack value);
}

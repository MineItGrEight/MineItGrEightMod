
package net.mcreator.migem.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.migem.block.ColorblockBlock;
import net.mcreator.migem.MigemModElements;

@MigemModElements.ModElement.Tag
public class MineItGrEightmodItemGroup extends MigemModElements.ModElement {
	public MineItGrEightmodItemGroup(MigemModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmineitgreightmod") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ColorblockBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}

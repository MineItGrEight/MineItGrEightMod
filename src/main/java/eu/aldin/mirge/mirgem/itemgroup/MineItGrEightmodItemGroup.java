
package eu.aldin.mirge.mirgem.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import eu.aldin.mirge.mirgem.block.ColorblockBlock;
import eu.aldin.mirge.mirgem.MirgemModElements;

@MirgemModElements.ModElement.Tag
public class MineItGrEightmodItemGroup extends MirgemModElements.ModElement {
	public MineItGrEightmodItemGroup(MirgemModElements instance) {
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

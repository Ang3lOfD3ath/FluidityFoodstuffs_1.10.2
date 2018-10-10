package defeatedcrow.addonforamt.fluidity.api.event;

import net.minecraftforge.event.entity.player.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraftforge.fluids.*;
import net.minecraft.entity.player.*;

@Cancelable
@Event.HasResult
public class EatFluidContEvent extends PlayerEvent {
	public final ItemStack current;
	public final World world;
	public final Fluid fluid;
	public ItemStack container = null;

	public EatFluidContEvent(World world, ItemStack current, EntityPlayer player, Fluid fluid) {
		super(player);
		this.current = current;
		this.world = world;
		this.fluid = fluid;
	}
}

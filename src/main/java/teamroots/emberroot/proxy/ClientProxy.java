package teamroots.emberroot.proxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import teamroots.emberroot.entity.deer.ModelDeer;
import teamroots.emberroot.entity.fairy.ModelFairy;
import teamroots.emberroot.entity.golem.GolemRegistry;
import teamroots.emberroot.entity.golem.ModelGolem;
import teamroots.emberroot.entity.golem.ParticleRendererGolem;
import teamroots.emberroot.entity.golem.RenderAncientGolem;
import teamroots.emberroot.entity.sprout.ModelSprout;
import teamroots.emberroot.particle.ParticleRenderer;

public class ClientProxy extends CommonProxy {
  public static ParticleRenderer particleRenderer = new ParticleRenderer();
  public static ParticleRendererGolem particleRendererGolem = new ParticleRendererGolem();
  @Override
  public void preInit(FMLPreInitializationEvent event) {
    super.preInit(event);
    ModelDeer.instance = new ModelDeer();
    ModelSprout.instance = new ModelSprout();
    ModelFairy.instance = new ModelFairy();
    RenderAncientGolem.model = new ModelGolem();
    GolemRegistry.registerEntityRendering();
  }
}

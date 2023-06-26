package racialgamer.cheese.autocrystal;

import racialgamer.cheese.autocrystal.modules.AutoCrystal;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;

public class Addon extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();

    @Override
    public void onInitialize() {
        LOG.info("Initializing Meteor Addon AutoCrystal");
        // Modules
        Modules.get().add(new AutoCrystal());
    }

    @Override
    public String getPackage() {
        return "racialgamer.cheese.autocrystal";
    }
}

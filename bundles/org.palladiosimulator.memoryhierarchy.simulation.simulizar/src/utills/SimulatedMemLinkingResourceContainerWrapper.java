package utills;

import resources.SimulatedMemLinkingResourceContainer;

/**
 * This is a wrapper to the SimulatedMemLinkingResourceContainer.
 * It stores the hit-rate and miss-rate of the predecessor cache level in addition.
 * Therefore, hit-rate and miss-rate are used during the simulation. 
 * 
 * @author KTruong
 *
 */
public class SimulatedMemLinkingResourceContainerWrapper {

    private SimulatedMemLinkingResourceContainer simulatedMemLinkResourceContainer;
    private double hitRate;

    public SimulatedMemLinkingResourceContainerWrapper(SimulatedMemLinkingResourceContainer simulatedMemLinkResourceContainer,
            double hitRate) {
        this.simulatedMemLinkResourceContainer = simulatedMemLinkResourceContainer;
        this.hitRate = hitRate;
    }

    public double getLocalHitRate() {
        return hitRate;
    }

    public SimulatedMemLinkingResourceContainer getSimMemLinkingResourceContainer() {
        return simulatedMemLinkResourceContainer;
    }

    public double getLocalMissRate() {
        return 1.0 - hitRate;
    }

}

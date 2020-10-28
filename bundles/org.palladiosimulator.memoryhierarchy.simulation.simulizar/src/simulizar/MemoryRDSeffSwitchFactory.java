package simulizar;

import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.simulizar.interpreter.AbstractRDSeffSwitchFactory;
import org.palladiosimulator.simulizar.interpreter.ExplicitDispatchComposedSwitch;
import org.palladiosimulator.simulizar.interpreter.InterpreterDefaultContext;
import org.palladiosimulator.simulizar.runtimestate.SimulatedBasicComponentInstance;

/**
 * Creates switches that interprets call which are not defined in pcm::seff. In our case the
 * MemoryHierarchyCallAwareSwitch() is offered for calls that are defined in the memoryhierarchy
 * meta-model.
 * 
 * @author KTruong
 *
 */
public class MemoryRDSeffSwitchFactory extends AbstractRDSeffSwitchFactory {

    @Override
    protected Switch<Object> createRDSeffSwitch(InterpreterDefaultContext context,
            SimulatedBasicComponentInstance basicComponentInstance,
            ExplicitDispatchComposedSwitch<Object> parentSwitch) {

        return new MemoryHierarchyCallSwitch(context, basicComponentInstance, parentSwitch);
    }

}

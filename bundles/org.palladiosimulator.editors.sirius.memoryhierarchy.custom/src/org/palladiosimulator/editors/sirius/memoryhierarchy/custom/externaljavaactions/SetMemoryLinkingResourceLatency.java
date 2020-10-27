package org.palladiosimulator.editors.sirius.memoryhierarchy.custom.externaljavaactions;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.editors.sirius.custom.externaljavaactions.SetRandomVariable;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResourceSpecification;

import de.uka.ipd.sdq.stoex.RandomVariable;
import de.uka.ipd.sdq.stoex.analyser.visitors.TypeEnum;

public class SetMemoryLinkingResourceLatency extends SetRandomVariable {

    @Override
    public RandomVariable getRandomVariable(EObject element) {
        MemoryHierarchyLinkingResourceSpecification linkResource = (MemoryHierarchyLinkingResourceSpecification) element;
        return linkResource.getLatency_MemoryHierarchyLinkingResourceSpecification();
    }

    @Override
    public TypeEnum getExpectedType() {
        return TypeEnum.ANY;
    }
}

package org.palladiosimulator.editors.sirius.memoryhierarchy.custom.externaljavaactions;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.editors.sirius.custom.externaljavaactions.SetRandomVariable;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResourceSpecification;

import de.uka.ipd.sdq.stoex.RandomVariable;
import de.uka.ipd.sdq.stoex.analyser.visitors.TypeEnum;

public class SetMemoryLinkingResourceThroughput extends SetRandomVariable {

    @Override
    public RandomVariable getRandomVariable(EObject element) {
        MemoryHierarchyLinkingResourceSpecification linkResourceSpecification = (MemoryHierarchyLinkingResourceSpecification) element;
        return linkResourceSpecification.getThroughput_MemoryHierarchyLinkingResourceSpecification();
    }

    @Override
    public TypeEnum getExpectedType() {
        return TypeEnum.ANY;
    }

}

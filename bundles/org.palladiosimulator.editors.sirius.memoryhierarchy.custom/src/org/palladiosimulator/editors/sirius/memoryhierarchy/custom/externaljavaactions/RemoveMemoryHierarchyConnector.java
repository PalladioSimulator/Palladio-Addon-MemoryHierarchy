package org.palladiosimulator.editors.sirius.memoryhierarchy.custom.externaljavaactions;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.EdgeTarget;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResource;

public class RemoveMemoryHierarchyConnector implements IExternalJavaAction {

	public RemoveMemoryHierarchyConnector() {
		super();
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		DEdge edge = (DEdge) parameters.get("elementView");
		MemoryHierarchyLinkingResource linkingResource = (MemoryHierarchyLinkingResource) edge.getTarget();
		if(edge.getSourceNode() instanceof MemoryHierarchyLinkingResource) {
			((MemoryHierarchyLinkingResource) edge.getSourceNode()).setHierarchyPredecessor_MemoryHierarchyLinkingResource(null);
		}
		EdgeTarget targetNode = edge.getTargetNode();

	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}

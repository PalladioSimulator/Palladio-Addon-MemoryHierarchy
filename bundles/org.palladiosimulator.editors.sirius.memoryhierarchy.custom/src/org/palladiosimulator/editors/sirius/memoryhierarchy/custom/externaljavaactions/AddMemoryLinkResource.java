package org.palladiosimulator.editors.sirius.memoryhierarchy.custom.externaljavaactions;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.ui.PlatformUI;
import org.palladiosimulator.editors.commons.dialogs.stoex.StochasticExpressionEditDialog;
import org.palladiosimulator.editors.sirius.custom.util.SiriusCustomUtil;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyLinkingResourceSpecification;
import org.palladiosimulator.memoryhierarchy.MemoryHierarchyResourceEnvironment;
import org.palladiosimulator.pcm.core.CoreFactory;
import org.palladiosimulator.pcm.core.PCMRandomVariable;
import org.palladiosimulator.pcm.resourcetype.CommunicationLinkResourceType;
import org.palladiosimulator.pcm.resourcetype.ResourceRepository;

import de.uka.ipd.sdq.stoex.analyser.visitors.TypeEnum;

/**
 * Duplicate from AddLinkingResource, adapted for
 * MemoryHierarchyLinkingResource, which have another type of
 * MemoryHierarchyLinkingSpecification
 * 
 * @author KTruong
 *
 */
public class AddMemoryLinkResource implements IExternalJavaAction {

	/**
	 * The latency display title.
	 */
	private static final String LATENCY_DISPLAY_TITLE = "Set Latency";

	/**
	 * The throughput display title.
	 */
	private static final String THROUGHPUT_DISPLAY_TITLE = "Set Throughput";

	/**
	 * Parameter name for the newly created communication linking resource. This
	 * name is used as a key in the parameter key-value map.
	 */
	private static final String NEW_MEMORY_LINK_RESOURCE_SPECIFICATION = "newMemoryLinkResourceSpecification";

	private static final String ID_OF_COMMUNICATION_SPECIFICATION = "_kEMDU403EeqdKsmjMd-Eeg";

	private static final String PATH_TO_PREDEFINED_MEMORY_HIERARCHY_RESOURCE = "platform:/plugin/org.palladiosimulator.memoryhierarchy/model/memoryhierarchy.resourcetype";

	public AddMemoryLinkResource() {
		super();
	}

	@Override
	public boolean canExecute(final Collection<? extends EObject> selections) {
		for (final EObject object : selections) {
			if (object instanceof MemoryHierarchyResourceEnvironment)
				return true;
		}
		return false;
	}

	@Override
	public void execute(final Collection<? extends EObject> selections, final Map<String, Object> parameters) {
		System.out.println(parameters);
		final Object parameter = parameters.get(NEW_MEMORY_LINK_RESOURCE_SPECIFICATION);
		System.out.println(parameter);
		if (parameter == null || !(parameter instanceof MemoryHierarchyLinkingResourceSpecification)) {
			System.out.println(parameter instanceof MemoryHierarchyLinkingResourceSpecification);
			return;
		}
		final MemoryHierarchyLinkingResourceSpecification communicationLinkResourceSpecification = (MemoryHierarchyLinkingResourceSpecification) parameter;
		// latency
		final PCMRandomVariable latency = getRandomVariableFromStoExDialog(LATENCY_DISPLAY_TITLE);
		if (latency == null) {
			return;
		}
		communicationLinkResourceSpecification.setLatency_MemoryHierarchyLinkingResourceSpecification(latency);

		// throughput
		final PCMRandomVariable throughput = getRandomVariableFromStoExDialog(THROUGHPUT_DISPLAY_TITLE);
		if (throughput == null) {
			return;
		}
		communicationLinkResourceSpecification.setThroughput_MemoryHierarchyLinkingResourceSpecification(throughput);

		// Communication Link

		Session session = SessionManager.INSTANCE.getSession(communicationLinkResourceSpecification);
		URI uri = URI.createURI(PATH_TO_PREDEFINED_MEMORY_HIERARCHY_RESOURCE);
		Resource palladioResources = SiriusCustomUtil.getResourceByURI(uri, session);

		if (palladioResources != null) {
			ResourceRepository rep = (ResourceRepository) palladioResources.getContents().iterator().next();
			for (EObject o : rep.eContents()) {
				if ((o instanceof MemoryHierarchyLinkingResourceSpecification)
						&& ((MemoryHierarchyLinkingResourceSpecification) o).getId()
								.equals(ID_OF_COMMUNICATION_SPECIFICATION)) {
					communicationLinkResourceSpecification
							.setCommunicationLinkingResourceType_MemoryHierarchyLinkingResourceSpecification(
									(CommunicationLinkResourceType) o);
					break;
				}
			}
		}

	}

	/**
	 * Opens a StoxEx dialog and returns the resulting {@link PCMRandomVariable}.
	 * 
	 * @param displayTitle Title of the StoEx dialog
	 * @return PCMRandomVariable if user entered valid data and confirmed. Will
	 *         return null if user canceled dialog
	 */
	private PCMRandomVariable getRandomVariableFromStoExDialog(final String displayTitle) {
		final PCMRandomVariable randomVariable = CoreFactory.eINSTANCE.createPCMRandomVariable();
		randomVariable.setSpecification("");

		final StochasticExpressionEditDialog dialog = new StochasticExpressionEditDialog(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), TypeEnum.DOUBLE, randomVariable);
		dialog.setDisplayTitle(displayTitle);
		dialog.open();

		if (dialog.getReturnCode() == Dialog.CANCEL) {
			return null;
		}

		randomVariable.setSpecification(dialog.getResultText());
		return randomVariable;
	}

}

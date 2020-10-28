# Palladio-Addon-MemoryHierarchy

This addon allows the modeling of the memory hierarchy and its data transfer to increase the response time prediction accuracy in Palladio with SimuLizar.
The focus is on multicore systems.

It lets you model the memory hierarchy with their bandwidths. See the figure below:
![MemHierarchyImage](documentation/memHierarchyHtHorizontal.pdf)

You can assign the modeled memory hierarchy to a Resource Container that has the \<\<ResourceContainerWithMemoryHierarchy\>\> stereotype. (Currently, the application of the stereotype and assignment of the memory hierarchy only works in the tree editor)

Furthermore, this addon uses an InternalAction with ResourceCall to specify the transferred memory demand.

We provided some example Palladio models, which can be found in the examples folder.


## Technical Limitations
Currently, this addon is either dependent on the 
https://github.com/Arcazer/Palladio-Analyzer-SimuLizar fork or the https://github.com/Arcazer/Palladio-Analyzer-SimuCom fork to work.
The Jira tickets for these two forks are: 
- https://jira.palladio-simulator.com/browse/SIMULIZAR-127

- https://jira.palladio-simulator.com/browse/SIMUCOM-97

Therefore, you have to download both forks into your workspace.

The SimuLizar fork uses the existing rdseff extension point to customize the simulation behavior of a ResourceCall to the memory hierarchy. However, it seems that the rdseff extension point does not work for calls inside ForkedBehaviours. Therefore, this fork is proposed.

The SimuCom fork uses a new ScheduledResource extension point to customize the simulation behaviours of ProcessingResourceSpecifications that are not only reliant on procesingRate,schedulingPolicy, or numberOfReplicas but additional properties, e.g., the structure of memory hierarchy.

We provided two example Palladio models that use the SimuLizar or SimuCom fork approach:
- examples/ParallelMatrixExperiment2ThreadsMemorySwitch (rdseff extension point)
- examples/ParallelMatrixExperiment2ThreadsScheduledResource (scheduledResource extension point)

## How to Start
1. Import both previously described forks of SimuCom and SimuLizar into your workspace.
2. Import all projects inside the bundle folder of this addon into your workspace (except *sirius.memoryhierarchy* and *sirius.seffwithmemoryhierarchy*). **Note** you need to import s*irius.memoryhierarchy.**custom*** to your workspace too! 
3. Launch everything as Eclipse Application
4. Import *sirius.memoryhierarchy* and *sirius.seffwithmemoryhierarchy* into the new Eclipse instance.
5. Clone https://github.com/PalladioSimulator/Palladio-Editors-Sirius and import *org.palladiosimulator.editors.sirius.seff* into your new Eclipse instance.*sirius.seffwithmemoryhierarchy* requires that this project must be available in the same Eclipse instance.
6. Import the example models, which are provided in the examples folder, and start a SimuLizar run.

Tipp you might have to activate the SeffWithMemoryHierarchy viewpoint to see the new calls, which are required when the rdseff extension point is used.

![SeffWithMemoryHierarchyVP](sirius-call-viewpoints.png)

If the viewpoint is activated you should see something like this:
![MatrixRDSeffEPNewCalls](matrixSeffNewSirius.pdf)

If problems with Siiurs occur the following websites might help:
- https://sdqweb.ipd.kit.edu/wiki/Graphical_Editor_Extension_Development
- https://sdqweb.ipd.kit.edu/wiki/PCM_Development/Sirius_Editors


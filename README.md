# IfcSTEP-to-IfcOWL_converters
Roundtrip converters to convert IFC STEP files to IfcOWL RDF files and back, following the buildingSMART ifcOWL candidate standard.
The IfcSTEP-to-IfcOWL converter is based on the code in https://github.com/pipauwel/IFCtoRDF.
They support all the current major IFC versions, including: IFC2X3_TC1, IFC2X3_FINAL, IFC4, IFC4_ADD1, IFC4_ADD2, and IFC4X1_RC3.
Converters are compiled in the JAR folder, with command line interface.

## Command Line interface

### IfcOWL-to-IfcSTEP
```
java -jar IfcOWL2IfcSTEP.jar <input.xxx> <output.ifc> [options]
 -l,--logfile                generate log file
 -u,--updns                  whether using update namespaces in ifcOWL files
                              in resources folder
 -v,--version <version>     specify IFC schema version, if not specified,
                              use default one parsed from model.
```

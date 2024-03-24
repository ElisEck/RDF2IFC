# RDF2IFC
Converter to convert IfcOWL RDF files to IFC STEP files.

It supports all the current major IFC versions, including: IFC2X3_TC1, IFC2X3_FINAL, IFC4, IFC4_ADD1, IFC4_ADD2, and IFC4X1_RC3.

Converters are compiled in the JAR folder, with command line interface.

It is based on the code in https://github.com/BenzclyZhang/IfcSTEP-to-IfcOWL-converters and was slightly adjusted with respect to handling of IFCREAL numbers and the URI of IFC 4 ADD2 TC1.

## Command Line interface

```
java -jar RDF2IFC-1.1.0.jar <input.xxx> <output.ifc> [options]
 -l,--logfile                generate log file
 -u,--updns                  whether using update namespaces in ifcOWL files
                              in resources folder
 -v,--version <version>     specify IFC schema version, if not specified,
                              use default one parsed from model.
```
example using the delivered test file
```
java -jar RDF2IFC-1.1.0.jar ..\src\test\resources\bipl_ifc.ttl ..\src\test\resources\bipl_0D_CLI.ifc -l
```
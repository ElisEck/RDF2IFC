package nl.tue.ddss.convert.rdf2ifc;

import junit.framework.TestCase;
import nl.tue.ddss.convert.IfcVersionException;

import java.io.IOException;

public class Rdf2IfcCmdTest extends TestCase {

    public void test() throws IfcVersionException, IOException {

        Rdf2IfcCmd.main(new String[]{"src/test/resources/bipl_ifc.ttl", "src/test/resources/bipl_0D.ifc", "-l", "-u"});
    }

}
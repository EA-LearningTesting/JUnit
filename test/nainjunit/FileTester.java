/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nainjunit;

import java.io.File;
import java.io.IOException;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

/**
 *
 * @author eslem
 */
public class FileTester {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Test
    public void testUsingTemporaryFolder() throws IOException {
        File createdFolder = folder.newFolder("newFolder");
        File createdFile = folder.newFile("newFile.txt");
        assertTrue(createdFile.exists());
        assertTrue(createdFolder.exists());//Will fail
    }
}

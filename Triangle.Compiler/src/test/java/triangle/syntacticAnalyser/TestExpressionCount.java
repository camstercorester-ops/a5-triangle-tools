package triangle.syntacticAnalyser;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;
import triangle.Compiler;

public class TestExpressionCount {
    @Test
    public void testIntegerExpressionCount(){
        Compiler compiler = new Compiler();
        PrintStream stdout = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream output = new PrintStream(outputStream);

        System.setOut(output);

        String path = "..\\programs\\adddeep.tri";
        compiler.showStats = true;
        
        Compiler.compileProgram(path, "obj.tam", false, false, compiler);

        System.setOut(stdout);

        String capturedOut = outputStream.toString();
        System.out.println(capturedOut);
    }
    
    @Test
    public void testCharacterExpressionCount(){
        Compiler compiler = new Compiler();
        PrintStream stdout = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream output = new PrintStream(outputStream);

        System.setOut(output);

        String path = "..\\programs\\names.tri";
        compiler.showStats = true;
        
        Compiler.compileProgram(path, "obj.tam", false, false, compiler);

        System.setOut(stdout);

        String capturedOut = outputStream.toString();
        System.out.println(capturedOut);
    }

}

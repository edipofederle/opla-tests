package opla_tests.opla_tests;
import arquitetura.builders.ArchitectureBuilder;
import arquitetura.representation.Architecture;


public class Main {

	public static void main(String[] args) throws Exception {
		ArchitectureBuilder archBuilder = new ArchitectureBuilder();
		
		Architecture arch = archBuilder.create("/Users/elf/Documents/opla/opla-tests/MobileMedia.uml");
		
		System.out.println("Concerns: " + arch.getAllConcerns().size());
		System.out.println("Classes: " + arch.getAllClasses().size());
	}

}

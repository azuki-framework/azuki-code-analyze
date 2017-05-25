package org.azkfw.code.analyze;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.FileASTRequestor;
import org.eclipse.jdt.core.dom.IBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.TypeDeclaration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		App app = new App();
		app.analyze();
	}

	public void analyze() {
		ASTParser astParser = ASTParser.newParser(AST.JLS8);

		final HashMap<String, CompilationUnit> compilationUnits = new HashMap<String, CompilationUnit>();

		// set up libraries (.jar, .class or .java)
		astParser.setEnvironment(getLibraries(), getSourcePathDirs(), null, /* use default encoding */
				true /* use VM class path */
		);

		astParser.setResolveBindings(true);

		// with Bingding Recovery on, the compiler can detect 
		// binding among the set of compilation units
		astParser.setBindingsRecovery(true);

		Map<?, ?> options = JavaCore.getOptions();
		JavaCore.setComplianceOptions(JavaCore.VERSION_1_8, options);
		astParser.setCompilerOptions(options);

		FileASTRequestor requestor = new FileASTRequestor() {
			@Override
			public void acceptAST(String sourceFilePath, CompilationUnit ast) {
				compilationUnits.put(sourceFilePath, ast);
			}

			@Override
			public void acceptBinding(String bindingKey, IBinding binding) {
				// do nothing
				// System.out.println("Accept Binding:... " + bindingKey);
				// System.out.println(binding);
			}
		};

		astParser.createASTs(getListFiles(), null, /* use default encoding */
				new String[] {}, /* no binding key */
				requestor, null /* no IProgressMonitor */
		);

		for (String key : compilationUnits.keySet()) {
			CompilationUnit unit = compilationUnits.get(key);
			unit.accept(new PrintVisitor());
		}
	}

	public static class MyVisitor extends ASTVisitor {

		public boolean visit(TypeDeclaration node) {

			ITypeBinding type = node.resolveBinding();

			System.out.println(type.getQualifiedName());

			return super.visit(node);
		}
	}

	private String[] getSourcePathDirs() {
		return new String[] { "source directory" };
	}

	private String[] getLibraries() {
		return new String[0];
	}

	private String[] getListFiles() {
		return new String[] { "java file" };
	}
}

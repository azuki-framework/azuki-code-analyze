/**
 * 
 */
package org.azkfw.code.analyze;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.AnnotationTypeDeclaration;
import org.eclipse.jdt.core.dom.AnnotationTypeMemberDeclaration;
import org.eclipse.jdt.core.dom.AnonymousClassDeclaration;
import org.eclipse.jdt.core.dom.ArrayAccess;
import org.eclipse.jdt.core.dom.ArrayCreation;
import org.eclipse.jdt.core.dom.ArrayInitializer;
import org.eclipse.jdt.core.dom.ArrayType;
import org.eclipse.jdt.core.dom.AssertStatement;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.BlockComment;
import org.eclipse.jdt.core.dom.BooleanLiteral;
import org.eclipse.jdt.core.dom.BreakStatement;
import org.eclipse.jdt.core.dom.CastExpression;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.CharacterLiteral;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ConditionalExpression;
import org.eclipse.jdt.core.dom.ConstructorInvocation;
import org.eclipse.jdt.core.dom.ContinueStatement;
import org.eclipse.jdt.core.dom.CreationReference;
import org.eclipse.jdt.core.dom.Dimension;
import org.eclipse.jdt.core.dom.DoStatement;
import org.eclipse.jdt.core.dom.EmptyStatement;
import org.eclipse.jdt.core.dom.EnhancedForStatement;
import org.eclipse.jdt.core.dom.EnumConstantDeclaration;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.ExpressionMethodReference;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.FieldAccess;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.ForStatement;
import org.eclipse.jdt.core.dom.IfStatement;
import org.eclipse.jdt.core.dom.ImportDeclaration;
import org.eclipse.jdt.core.dom.InfixExpression;
import org.eclipse.jdt.core.dom.Initializer;
import org.eclipse.jdt.core.dom.IntersectionType;
import org.eclipse.jdt.core.dom.Javadoc;
import org.eclipse.jdt.core.dom.LabeledStatement;
import org.eclipse.jdt.core.dom.LambdaExpression;
import org.eclipse.jdt.core.dom.LineComment;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.MemberRef;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.MethodRef;
import org.eclipse.jdt.core.dom.MethodRefParameter;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.NameQualifiedType;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.NullLiteral;
import org.eclipse.jdt.core.dom.NumberLiteral;
import org.eclipse.jdt.core.dom.PackageDeclaration;
import org.eclipse.jdt.core.dom.ParameterizedType;
import org.eclipse.jdt.core.dom.ParenthesizedExpression;
import org.eclipse.jdt.core.dom.PostfixExpression;
import org.eclipse.jdt.core.dom.PrefixExpression;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.QualifiedName;
import org.eclipse.jdt.core.dom.QualifiedType;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SingleMemberAnnotation;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.SuperConstructorInvocation;
import org.eclipse.jdt.core.dom.SuperFieldAccess;
import org.eclipse.jdt.core.dom.SuperMethodReference;
import org.eclipse.jdt.core.dom.SwitchCase;
import org.eclipse.jdt.core.dom.SwitchStatement;
import org.eclipse.jdt.core.dom.SynchronizedStatement;
import org.eclipse.jdt.core.dom.TagElement;
import org.eclipse.jdt.core.dom.TextElement;
import org.eclipse.jdt.core.dom.ThisExpression;
import org.eclipse.jdt.core.dom.ThrowStatement;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclarationStatement;
import org.eclipse.jdt.core.dom.TypeLiteral;
import org.eclipse.jdt.core.dom.TypeMethodReference;
import org.eclipse.jdt.core.dom.TypeParameter;
import org.eclipse.jdt.core.dom.UnionType;
import org.eclipse.jdt.core.dom.VariableDeclarationExpression;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.jdt.core.dom.WhileStatement;
import org.eclipse.jdt.core.dom.WildcardType;

/**
 * @author Kawakicchi
 *
 */
public class PrintVisitor extends ASTVisitor {

	public boolean visit(final AnnotationTypeDeclaration node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final AnnotationTypeMemberDeclaration node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final AnonymousClassDeclaration node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final ArrayAccess node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final ArrayCreation node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final ArrayInitializer node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final ArrayType node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final AssertStatement node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final Assignment node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final Block node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final BlockComment node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final BooleanLiteral node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final BreakStatement node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final CastExpression node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final CatchClause node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final CharacterLiteral node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final ClassInstanceCreation node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final CompilationUnit node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final ConditionalExpression node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final ConstructorInvocation node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final ContinueStatement node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final CreationReference node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final Dimension node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final DoStatement node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final EmptyStatement node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final EnhancedForStatement node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final EnumConstantDeclaration node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final EnumDeclaration node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final ExpressionMethodReference node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final ExpressionStatement node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final FieldAccess node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final FieldDeclaration node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final ForStatement node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final IfStatement node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final ImportDeclaration node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final InfixExpression node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final Initializer node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final IntersectionType node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final Javadoc node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final LabeledStatement node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final LambdaExpression node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final LineComment node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final MarkerAnnotation node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final MemberRef node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final MemberValuePair node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final MethodDeclaration node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final MethodInvocation node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final MethodRef node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final MethodRefParameter node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final Modifier node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final NameQualifiedType node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final NormalAnnotation node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final NullLiteral node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final NumberLiteral node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final PackageDeclaration node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final ParameterizedType node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final ParenthesizedExpression node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final PostfixExpression node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final PrefixExpression node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final PrimitiveType node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final QualifiedName node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final QualifiedType node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final ReturnStatement node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final SimpleName node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final SingleMemberAnnotation node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final SingleVariableDeclaration node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final StringLiteral node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final SuperConstructorInvocation node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final SuperFieldAccess node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final SuperMethodReference node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final SwitchCase node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final SwitchStatement node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final SynchronizedStatement node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final TagElement node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final TextElement node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final ThisExpression node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final ThrowStatement node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final TryStatement node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final TypeDeclaration node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final TypeDeclarationStatement node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final TypeLiteral node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final TypeMethodReference node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final TypeParameter node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final UnionType node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final VariableDeclarationExpression node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final VariableDeclarationFragment node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final VariableDeclarationStatement node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final WhileStatement node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

	public boolean visit(final WildcardType node) {
		System.out.print("#" + node.getClass().getSimpleName() + " ");
		System.out.println(node);
		return super.visit(node);
	}

}

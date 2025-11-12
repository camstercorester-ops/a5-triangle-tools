package triangle.abstractSyntaxTrees.visitors;

import triangle.abstractSyntaxTrees.visitors.CommandVisitor;
import triangle.abstractSyntaxTrees.visitors.VnameVisitor;
import triangle.abstractSyntaxTrees.vnames.DotVname;
import triangle.abstractSyntaxTrees.vnames.SimpleVname;
import triangle.abstractSyntaxTrees.vnames.SubscriptVname;
import triangle.abstractSyntaxTrees.visitors.ExpressionVisitor;

import triangle.abstractSyntaxTrees.AbstractSyntaxTree;

import java.util.HashSet;
import java.util.Set;

import triangle.abstractSyntaxTrees.commands.AssignCommand;
import triangle.abstractSyntaxTrees.commands.CallCommand;
import triangle.abstractSyntaxTrees.commands.EmptyCommand;
import triangle.abstractSyntaxTrees.commands.IfCommand;
import triangle.abstractSyntaxTrees.commands.LetCommand;
import triangle.abstractSyntaxTrees.commands.LoopCommand;
import triangle.abstractSyntaxTrees.commands.RepeatCommand;
import triangle.abstractSyntaxTrees.commands.SequentialCommand;
import triangle.abstractSyntaxTrees.commands.WhileCommand;
import triangle.abstractSyntaxTrees.declarations.ConstDeclaration;
import triangle.abstractSyntaxTrees.expressions.ArrayExpression;
import triangle.abstractSyntaxTrees.expressions.BinaryExpression;
import triangle.abstractSyntaxTrees.expressions.CallExpression;
import triangle.abstractSyntaxTrees.expressions.CharacterExpression;
import triangle.abstractSyntaxTrees.expressions.EmptyExpression;
import triangle.abstractSyntaxTrees.expressions.Expression;
import triangle.abstractSyntaxTrees.expressions.IfExpression;
import triangle.abstractSyntaxTrees.expressions.IntegerExpression;
import triangle.abstractSyntaxTrees.expressions.LetExpression;
import triangle.abstractSyntaxTrees.expressions.RecordExpression;
import triangle.abstractSyntaxTrees.expressions.UnaryExpression;
import triangle.abstractSyntaxTrees.expressions.VnameExpression;
import triangle.abstractSyntaxTrees.terminals.Identifier;

public class HoistVisitor implements CommandVisitor<Void, AbstractSyntaxTree>, VnameVisitor<Void, AbstractSyntaxTree>, ExpressionVisitor<Void, AbstractSyntaxTree> {

	private final Set<String> changedVariables = new HashSet<>();
	private final Set<String> usedVariables = new HashSet<>();


	@Override
	public AbstractSyntaxTree visitArrayExpression(ArrayExpression ast, Void arg) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitArrayExpression'");
	}

	@Override
	public AbstractSyntaxTree visitBinaryExpression(BinaryExpression ast, Void arg) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitBinaryExpression'");
	}

	@Override
	public AbstractSyntaxTree visitCallExpression(CallExpression ast, Void arg) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitCallExpression'");
	}

	@Override
	public AbstractSyntaxTree visitCharacterExpression(CharacterExpression ast, Void arg) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitCharacterExpression'");
	}

	@Override
	public AbstractSyntaxTree visitEmptyExpression(EmptyExpression ast, Void arg) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitEmptyExpression'");
	}

	@Override
	public AbstractSyntaxTree visitIfExpression(IfExpression ast, Void arg) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitIfExpression'");
	}

	@Override
	public AbstractSyntaxTree visitIntegerExpression(IntegerExpression ast, Void arg) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitIntegerExpression'");
	}

	@Override
	public AbstractSyntaxTree visitLetExpression(LetExpression ast, Void arg) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitLetExpression'");
	}

	@Override
	public AbstractSyntaxTree visitRecordExpression(RecordExpression ast, Void arg) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitRecordExpression'");
	}

	@Override
	public AbstractSyntaxTree visitUnaryExpression(UnaryExpression ast, Void arg) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitUnaryExpression'");
	}

	@Override
	public AbstractSyntaxTree visitVnameExpression(VnameExpression ast, Void arg) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitVnameExpression'");
	}

	@Override
	public AbstractSyntaxTree visitDotVname(DotVname ast, Void arg) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitDotVname'");
	}

	@Override
	public AbstractSyntaxTree visitSimpleVname(SimpleVname ast, Void arg) {
		usedVariables.add(ast.I.spelling);
		return ast;
	}

	@Override
	public AbstractSyntaxTree visitSubscriptVname(SubscriptVname ast, Void arg) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitSubscriptVname'");
	}

	@Override
	public AbstractSyntaxTree visitAssignCommand(AssignCommand ast, Void arg) {
		if (ast.V instanceof SimpleVname){
			SimpleVname variableName = (SimpleVname) ast.V;
			changedVariables.add(variableName.I.spelling);
		}

		ast.E.visit(this, arg);

		return ast;
	}

	@Override
	public AbstractSyntaxTree visitCallCommand(CallCommand ast, Void arg) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitCallCommand'");
	}

	@Override
	public AbstractSyntaxTree visitEmptyCommand(EmptyCommand ast, Void arg) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitEmptyCommand'");
	}

	@Override
	public AbstractSyntaxTree visitIfCommand(IfCommand ast, Void arg) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitIfCommand'");
	}

	@Override
	public AbstractSyntaxTree visitLetCommand(LetCommand ast, Void arg) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitLetCommand'");
	}

	@Override
	public AbstractSyntaxTree visitRepeatCommand(RepeatCommand ast, Void arg) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitRepeatCommand'");
	}

	@Override
	public AbstractSyntaxTree visitSequentialCommand(SequentialCommand ast, Void arg) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitSequentialCommand'");
	}

	@Override
	public AbstractSyntaxTree visitWhileCommand(WhileCommand ast, Void arg) {
		changedVariables.clear();
		usedVariables.clear();

		ast.E.visit(this, arg);
		ast.C.visit(this, arg);

		Set<String> unChangedVariables = new HashSet<>();

		for (String variable : usedVariables){
			if (!changedVariables.contains(variable)){
				unChangedVariables.add(variable);
			}
		}

		for (String variable : unChangedVariables){
			SimpleVname unChanged = new SimpleVname(new Identifier(variable, null), null);
			VnameExpression invarientExpression = new VnameExpression(unChanged, null);
			ConstDeclaration invarient = new ConstDeclaration(new Identifier("tmp " + variable, null), invarientExpression, null);
			LetCommand transformedAST = new LetCommand(invarient, ast, null);
		}

		return ast;

	}

	@Override
	public AbstractSyntaxTree visitLoopCommand(LoopCommand ast, Void arg) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitLoopCommand'");
	}


}

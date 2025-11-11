package triangle.abstractSyntaxTrees.commands;
import triangle.abstractSyntaxTrees.expressions.Expression;

import triangle.abstractSyntaxTrees.visitors.CommandVisitor;
import triangle.syntacticAnalyzer.SourcePosition;

public class LoopCommand extends Command {
    public LoopCommand(Command c1AST, Expression eAST, Command c2AST, SourcePosition position){
        super(position);
        Command C1 = c1AST;
        Expression E  = eAST;
        Command C2 = c2AST;
    }

    @Override
    public <TArg, TResult> TResult visit(CommandVisitor<TArg, TResult> visitor, TArg arg) {
        return visitor.visitLoopCommand(this, arg);
    }
}

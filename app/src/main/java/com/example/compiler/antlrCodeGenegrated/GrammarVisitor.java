// Generated from /home/pouya/AndroidStudioProjects/compiler/app/src/main/java/com/example/compiler/antlrCodeGenegrated/Grammar.g4 by ANTLR 4.7.2
package com.example.compiler.antlrCodeGenegrated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(GrammarParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(GrammarParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code beginend}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginend(GrammarParser.BeginendContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(GrammarParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifelse}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelse(GrammarParser.IfelseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(GrammarParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(GrammarParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loop}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(GrammarParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(GrammarParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printf}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintf(GrammarParser.PrintfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code println}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(GrammarParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code put}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPut(GrammarParser.PutContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(GrammarParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getarray}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetarray(GrammarParser.GetarrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code putarray}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPutarray(GrammarParser.PutarrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sizearray}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizearray(GrammarParser.SizearrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code map}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(GrammarParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getmap}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetmap(GrammarParser.GetmapContext ctx);
	/**
	 * Visit a parse tree produced by the {@code putmap}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPutmap(GrammarParser.PutmapContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sizemap}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizemap(GrammarParser.SizemapContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(GrammarParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code complexExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexExpr(GrammarParser.ComplexExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(GrammarParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(GrammarParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(GrammarParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paranthesis}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParanthesis(GrammarParser.ParanthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binopr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinopr(GrammarParser.BinoprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#complexExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexExp(GrammarParser.ComplexExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#div_multi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv_multi(GrammarParser.Div_multiContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#pow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(GrammarParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paran}
	 * labeled alternative in {@link GrammarParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParan(GrammarParser.ParanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idd}
	 * labeled alternative in {@link GrammarParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdd(GrammarParser.IddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numm}
	 * labeled alternative in {@link GrammarParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumm(GrammarParser.NummContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#openBracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenBracket(GrammarParser.OpenBracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#closeBracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseBracket(GrammarParser.CloseBracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#opneParan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpneParan(GrammarParser.OpneParanContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#closeParan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseParan(GrammarParser.CloseParanContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolon(GrammarParser.SemicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(GrammarParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#colon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColon(GrammarParser.ColonContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#plus_minusOP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus_minusOP(GrammarParser.Plus_minusOPContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#div_multiOP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv_multiOP(GrammarParser.Div_multiOPContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(GrammarParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinop(GrammarParser.BinopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(GrammarParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(GrammarParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#numcom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumcom(GrammarParser.NumcomContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(GrammarParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#stringliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringliteral(GrammarParser.StringliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#boolea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolea(GrammarParser.BooleaContext ctx);
}
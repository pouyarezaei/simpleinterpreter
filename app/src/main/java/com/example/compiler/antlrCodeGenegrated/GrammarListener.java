// Generated from /home/pouya/AndroidStudioProjects/compiler/app/src/main/java/com/example/compiler/antlrCodeGenegrated/Grammar.g4 by ANTLR 4.7.2
package com.example.compiler.antlrCodeGenegrated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(GrammarParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(GrammarParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(GrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(GrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code beginend}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBeginend(GrammarParser.BeginendContext ctx);
	/**
	 * Exit a parse tree produced by the {@code beginend}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBeginend(GrammarParser.BeginendContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIf(GrammarParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIf(GrammarParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifelse}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfelse(GrammarParser.IfelseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifelse}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfelse(GrammarParser.IfelseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile(GrammarParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile(GrammarParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFor(GrammarParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFor(GrammarParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loop}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop(GrammarParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loop}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop(GrammarParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint(GrammarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint(GrammarParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printf}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintf(GrammarParser.PrintfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printf}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintf(GrammarParser.PrintfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code println}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(GrammarParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code println}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(GrammarParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code put}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPut(GrammarParser.PutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code put}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPut(GrammarParser.PutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterArray(GrammarParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitArray(GrammarParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getarray}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterGetarray(GrammarParser.GetarrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getarray}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitGetarray(GrammarParser.GetarrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code putarray}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPutarray(GrammarParser.PutarrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code putarray}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPutarray(GrammarParser.PutarrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sizearray}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSizearray(GrammarParser.SizearrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sizearray}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSizearray(GrammarParser.SizearrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code map}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterMap(GrammarParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by the {@code map}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitMap(GrammarParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getmap}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterGetmap(GrammarParser.GetmapContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getmap}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitGetmap(GrammarParser.GetmapContext ctx);
	/**
	 * Enter a parse tree produced by the {@code putmap}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPutmap(GrammarParser.PutmapContext ctx);
	/**
	 * Exit a parse tree produced by the {@code putmap}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPutmap(GrammarParser.PutmapContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sizemap}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSizemap(GrammarParser.SizemapContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sizemap}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSizemap(GrammarParser.SizemapContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(GrammarParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(GrammarParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code complexExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterComplexExpr(GrammarParser.ComplexExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code complexExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitComplexExpr(GrammarParser.ComplexExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBool(GrammarParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBool(GrammarParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNum(GrammarParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNum(GrammarParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(GrammarParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(GrammarParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paranthesis}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParanthesis(GrammarParser.ParanthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paranthesis}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParanthesis(GrammarParser.ParanthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binopr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinopr(GrammarParser.BinoprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binopr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinopr(GrammarParser.BinoprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#complexExp}.
	 * @param ctx the parse tree
	 */
	void enterComplexExp(GrammarParser.ComplexExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#complexExp}.
	 * @param ctx the parse tree
	 */
	void exitComplexExp(GrammarParser.ComplexExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#div_multi}.
	 * @param ctx the parse tree
	 */
	void enterDiv_multi(GrammarParser.Div_multiContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#div_multi}.
	 * @param ctx the parse tree
	 */
	void exitDiv_multi(GrammarParser.Div_multiContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#pow}.
	 * @param ctx the parse tree
	 */
	void enterPow(GrammarParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#pow}.
	 * @param ctx the parse tree
	 */
	void exitPow(GrammarParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paran}
	 * labeled alternative in {@link GrammarParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterParan(GrammarParser.ParanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paran}
	 * labeled alternative in {@link GrammarParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitParan(GrammarParser.ParanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idd}
	 * labeled alternative in {@link GrammarParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterIdd(GrammarParser.IddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idd}
	 * labeled alternative in {@link GrammarParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitIdd(GrammarParser.IddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numm}
	 * labeled alternative in {@link GrammarParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterNumm(GrammarParser.NummContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numm}
	 * labeled alternative in {@link GrammarParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitNumm(GrammarParser.NummContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#openBracket}.
	 * @param ctx the parse tree
	 */
	void enterOpenBracket(GrammarParser.OpenBracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#openBracket}.
	 * @param ctx the parse tree
	 */
	void exitOpenBracket(GrammarParser.OpenBracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#closeBracket}.
	 * @param ctx the parse tree
	 */
	void enterCloseBracket(GrammarParser.CloseBracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#closeBracket}.
	 * @param ctx the parse tree
	 */
	void exitCloseBracket(GrammarParser.CloseBracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#opneParan}.
	 * @param ctx the parse tree
	 */
	void enterOpneParan(GrammarParser.OpneParanContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#opneParan}.
	 * @param ctx the parse tree
	 */
	void exitOpneParan(GrammarParser.OpneParanContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#closeParan}.
	 * @param ctx the parse tree
	 */
	void enterCloseParan(GrammarParser.CloseParanContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#closeParan}.
	 * @param ctx the parse tree
	 */
	void exitCloseParan(GrammarParser.CloseParanContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon(GrammarParser.SemicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon(GrammarParser.SemicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(GrammarParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(GrammarParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#colon}.
	 * @param ctx the parse tree
	 */
	void enterColon(GrammarParser.ColonContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#colon}.
	 * @param ctx the parse tree
	 */
	void exitColon(GrammarParser.ColonContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#plus_minusOP}.
	 * @param ctx the parse tree
	 */
	void enterPlus_minusOP(GrammarParser.Plus_minusOPContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#plus_minusOP}.
	 * @param ctx the parse tree
	 */
	void exitPlus_minusOP(GrammarParser.Plus_minusOPContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#div_multiOP}.
	 * @param ctx the parse tree
	 */
	void enterDiv_multiOP(GrammarParser.Div_multiOPContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#div_multiOP}.
	 * @param ctx the parse tree
	 */
	void exitDiv_multiOP(GrammarParser.Div_multiOPContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(GrammarParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(GrammarParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterBinop(GrammarParser.BinopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitBinop(GrammarParser.BinopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(GrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(GrammarParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(GrammarParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(GrammarParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#numcom}.
	 * @param ctx the parse tree
	 */
	void enterNumcom(GrammarParser.NumcomContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#numcom}.
	 * @param ctx the parse tree
	 */
	void exitNumcom(GrammarParser.NumcomContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(GrammarParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(GrammarParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#stringliteral}.
	 * @param ctx the parse tree
	 */
	void enterStringliteral(GrammarParser.StringliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#stringliteral}.
	 * @param ctx the parse tree
	 */
	void exitStringliteral(GrammarParser.StringliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#boolea}.
	 * @param ctx the parse tree
	 */
	void enterBoolea(GrammarParser.BooleaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#boolea}.
	 * @param ctx the parse tree
	 */
	void exitBoolea(GrammarParser.BooleaContext ctx);
}
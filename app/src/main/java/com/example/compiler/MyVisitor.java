package com.example.compiler;

import com.example.compiler.antlrCodeGenegrated.GrammarBaseVisitor;
import com.example.compiler.antlrCodeGenegrated.GrammarLexer;
import com.example.compiler.antlrCodeGenegrated.GrammarParser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MyVisitor extends GrammarBaseVisitor<String> {

    private static HashMap<String, String> identifiers = new HashMap<>();
    private static ArrayList<String> textResult = new ArrayList<>();
    private static ArrayList<String> putResult = new ArrayList<>();
    private static HashMap<String, HashMap<String, String>> mapItem = new HashMap<>();
    private static HashMap<String, ArrayList<String>> arrayItem = new HashMap<>();

    @Override
    public String visitGetarray(GrammarParser.GetarrayContext ctx) {
        String name = visit(ctx.identifier());
        ArrayList<String> items = arrayItem.get(name);
        String index = visit(ctx.number());
        double indexs = Double.parseDouble(index);
        textResult.add(items.get((int) indexs).concat("\n"));
        return null;
    }

    @Override
    public String visitPutmap(GrammarParser.PutmapContext ctx) {
        String name = visit(ctx.identifier());
        HashMap<String, String> map = mapItem.get(name);
        String key = visit(ctx.stringliteral()).replaceAll("\"", "").
                replaceAll(" ", "");
        map.put(key, visit(ctx.number()));
        mapItem.put(name, map);
        return null;
    }

    @Override
    public String visitSizemap(GrammarParser.SizemapContext ctx) {
        String name = visit(ctx.identifier());
        HashMap<String, String> val = mapItem.get(name);
        textResult.add(String.valueOf(val.size()).concat("\n"));
        return null;
    }

    @Override
    public String visitGetmap(GrammarParser.GetmapContext ctx) {
        String name = visit(ctx.identifier());
        HashMap<String, String> map = mapItem.get(name);
        String key = visit(ctx.stringliteral()).replaceAll("\"", "").
                replaceAll(" ", "");
        textResult.add(map.get(key).concat("\n"));
        return null;
    }

    @Override
    public String visitPutarray(GrammarParser.PutarrayContext ctx) {
        String name = visit(ctx.identifier());
        ArrayList<String> items = arrayItem.get(name);
        items.add(visit(ctx.number()));
        arrayItem.put(name, items);
        return null;
    }

    @Override
    public String visitSizearray(GrammarParser.SizearrayContext ctx) {
        String name = visit(ctx.identifier());
        List<String> items = arrayItem.get(name);
        textResult.add(String.valueOf(items.size()).concat("\n"));
        return null;
    }


    public MyVisitor() {

    }


    @Override
    public String visitPut(GrammarParser.PutContext ctx) {
        String id = visit(ctx.identifier());
        String val = identifiers.get(id);
        String f = id.concat("=").concat(val).concat("\n");
        putResult.add(f);
        return null;
    }


    @Override
    public String visitArray(GrammarParser.ArrayContext ctx) {
        String name = visit(ctx.identifier());
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < ctx.numcom().children.size(); i++) {
            if (i % 2 == 0)
                strings.add(ctx.numcom().children.get(i).getText());
        }

        arrayItem.put(name, strings);
        return null;
    }


    @Override
    public String visitPrintln(GrammarParser.PrintlnContext ctx) {
        String variable = visit(ctx.identifier());
        textResult.add(identifiers.get(variable) + "\n");
        return null;
    }


    public List<List<String>> runVisitor(CharStream input) {
        textResult.clear();
        GrammarLexer lexer = new GrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarParser parser = new GrammarParser(tokens);
        GrammarParser.ProgramContext tree = parser.program();
        GrammarBaseVisitor<String> visitor = new MyVisitor();
        tree.accept(visitor);
        List<String> rules = Arrays.asList(parser.getRuleNames());
        List<List<String>> list = new ArrayList<>();
        list.add(textResult);
        list.add(putResult);
        list.add(rules);
        return list;
    }

    @Override
    public String visitMap(GrammarParser.MapContext ctx) {
        String name = visit(ctx.identifier());
        String[] string = ctx.value().getText().replaceAll("\"", "").
                replaceAll(" ", "").split(",");
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < string.length; i++) {
            String temp = string[i];
            map.put(temp.substring(0, temp.indexOf('=')), temp.substring(temp.indexOf('=') + 1));
        }
        mapItem.put(name, map);
        return null;
    }

    @Override
    public String visitProgram(GrammarParser.ProgramContext ctx) {
        visit(ctx.statements());
        return null;
    }

    @Override
    public String visitStatements(GrammarParser.StatementsContext ctx) {
        for (GrammarParser.StatementContext temp : ctx.statement()) {
            visit(temp);
        }
        return null;
    }


    @Override
    public String visitAssignment(GrammarParser.AssignmentContext ctx) {
        String variable = visit(ctx.identifier());
        String value = visit(ctx.expr());
        identifiers.put(variable, value);
        return null;
    }

    @Override
    public String visitBeginend(GrammarParser.BeginendContext ctx) {
        visit(ctx.statements());
        return null;
    }

    @Override
    public String visitIf(GrammarParser.IfContext ctx) {
        boolean result = visit(ctx.expr()).equals("true");
        if (result)
            visit(ctx.statement());
        return null;
    }

    @Override
    public String visitIfelse(GrammarParser.IfelseContext ctx) {
        boolean result = visit(ctx.expr()).equals("true");
        if (result)
            visit(ctx.statement(0));
        else
            visit(ctx.statement(1));
        return null;
    }

    @Override
    public String visitWhile(GrammarParser.WhileContext ctx) {
        while (visit(ctx.expr()).equals("true")) {
            visit(ctx.statement());
        }
        return null;
    }

    @Override
    public String visitFor(GrammarParser.ForContext ctx) {
        //assigning variable
        String variable = visit(ctx.identifier());
        String value = visit(ctx.number(0));


        //for loop
        double startValue = Double.parseDouble(value);
        double targetValue = Double.parseDouble(visit(ctx.number(1)));
        while (startValue <= targetValue) {
            visit(ctx.statement());
            startValue++;
            identifiers.put(variable, String.valueOf(startValue));
        }
        return null;
    }

    @Override
    public String visitLoop(GrammarParser.LoopContext ctx) {
        String variable = visit(ctx.identifier());
        String value = visit(ctx.number());
        identifiers.put(variable, value);
        double numberLoop = Double.parseDouble(value);
        for (int i = 0; i < numberLoop; i++) {
            visit(ctx.statement());
        }
        return null;
    }


    @Override
    public String visitPrint(GrammarParser.PrintContext ctx) {
        String variable = visit(ctx.identifier());
        textResult.add(identifiers.get(variable));
        return null;
    }

    @Override
    public String visitPrintf(GrammarParser.PrintfContext ctx) {
        String literal = visit(ctx.stringliteral());
        StringBuilder stringBuilder = new StringBuilder(literal);
        stringBuilder.replace(0, 1, "");
        stringBuilder.replace(1, 2, " i");
        stringBuilder.replace(stringBuilder.length() - 1, stringBuilder.length(), "");
        String var = visit(ctx.identifier());
        String value = identifiers.get(var);
        String val = stringBuilder.append(" " + value).toString().trim();
        textResult.add(val);
        return null;
    }

    @Override
    public String visitNot(GrammarParser.NotContext ctx) {
        boolean result;
        String value = visit(ctx.expr());
        if (value.matches("\\d+(\\.\\d+)*")) {
            result = Double.parseDouble(value) != 0;
        } else result = value.equals("true");

        if (result)
            return "false";
        return "true";
    }

    @Override
    public String visitComplexExpr(GrammarParser.ComplexExprContext ctx) {
        return visit(ctx.complexExp());
    }

    @Override
    public String visitBool(GrammarParser.BoolContext ctx) {
        return visit(ctx.boolea());
    }

    @Override
    public String visitNum(GrammarParser.NumContext ctx) {
        return visit(ctx.number());
    }

    @Override
    public String visitId(GrammarParser.IdContext ctx) {
        String variable = visit(ctx.identifier());
        return identifiers.get(variable);
    }

    @Override
    public String visitParanthesis(GrammarParser.ParanthesisContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public String visitBinopr(GrammarParser.BinoprContext ctx) {
        String operator = visit(ctx.binop());

        boolean result;
        try {
            double firstExpr = Double.parseDouble(visit(ctx.expr(0)));
            double SecondExpr = Double.parseDouble(visit(ctx.expr(1)));

            switch (operator) {
                case "<":
                    result = firstExpr < SecondExpr;
                    break;
                case ">":
                    result = firstExpr > SecondExpr;
                    break;
                case "<=":
                    result = firstExpr <= SecondExpr;
                    break;
                case ">=":
                    result = firstExpr >= SecondExpr;
                    break;
                case "==":
                    result = firstExpr == SecondExpr;
                    break;
                case "!=":
                    result = firstExpr != SecondExpr;
                    break;
                default:
                    return null;
            }
            return result ? "true" : "false";
        } catch (Exception e) {
            System.err.println("don't compare boolean!!!");
        }
        return null;
    }

    @Override
    public String visitComplexExp(GrammarParser.ComplexExpContext ctx) {
        //first Div_Multi
        double result = Double.parseDouble(visit(ctx.div_multi(0)));
        //getting rest of them
        for (int i = 0; i < ctx.plus_minusOP().size(); i++) {
            String operation = visit(ctx.plus_minusOP(i));
            double second = Double.parseDouble(visit(ctx.div_multi(i + 1)));
            switch (operation) {
                case "+":
                    result += second;
                    break;
                case "-":
                    result -= second;
                    break;
            }
        }
        return String.valueOf(result);
    }

    @Override
    public String visitDiv_multi(GrammarParser.Div_multiContext ctx) {
        //first Pow
        double result = Double.parseDouble(visit(ctx.pow(0)));

        //getting rest of them
        for (int i = 0; i < ctx.div_multiOP().size(); i++) {
            String operation = visit(ctx.div_multiOP(i));
            double second = Double.parseDouble(visit(ctx.pow(i + 1)));
            switch (operation) {
                case "/":
                    result /= second;
                    break;
                case "*":
                    result *= second;
                    break;
                case "%":
                    result %= second;
                    break;
            }
        }
        return String.valueOf(result);
    }


    @Override
    public String visitPow(GrammarParser.PowContext ctx) {
        double result;
        if (ctx.power().size() == 0) {
            result = Double.parseDouble(visit(ctx.fact(0)));
        } else {
            result = Math.pow(Double.parseDouble(visit(ctx.fact(ctx.power().size() - 1)))
                    , Double.parseDouble(visit(ctx.fact(ctx.power().size()))));
            if (ctx.power().size() > 1) {
                for (int i = ctx.power().size() - 1; i > 0; i--) {
                    result = Math.pow(Double.parseDouble(visit(ctx.fact(i - 1)))
                            , result);
                }
            }
        }
        return String.valueOf(result);
    }


    @Override
    public String visitParan(GrammarParser.ParanContext ctx) {
        return visit(ctx.complexExp());
    }

    @Override
    public String visitIdd(GrammarParser.IddContext ctx) {
        String variable = visit(ctx.identifier());
        return identifiers.get(variable);
    }

    @Override
    public String visitNumm(GrammarParser.NummContext ctx) {
        return visit(ctx.number());
    }

    @Override
    public String visitOpenBracket(GrammarParser.OpenBracketContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitCloseBracket(GrammarParser.CloseBracketContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitOpneParan(GrammarParser.OpneParanContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitCloseParan(GrammarParser.CloseParanContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitSemicolon(GrammarParser.SemicolonContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitEqual(GrammarParser.EqualContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitColon(GrammarParser.ColonContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitPlus_minusOP(GrammarParser.Plus_minusOPContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitDiv_multiOP(GrammarParser.Div_multiOPContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitPower(GrammarParser.PowerContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitBinop(GrammarParser.BinopContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitNumber(GrammarParser.NumberContext ctx) {
        return String.valueOf(Double.parseDouble(ctx.getText()));
    }

    @Override
    public String visitIdentifier(GrammarParser.IdentifierContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitBoolea(GrammarParser.BooleaContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitStringliteral(GrammarParser.StringliteralContext ctx) {
        return ctx.getText();
    }

}

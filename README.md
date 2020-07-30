#### What is this project?

This is a simple interpreter based on Antlr tool and developed using Java and Kotlin for the Android platform

#### What is antlr ?

In computer-based language recognition, ANTLR , or ANother Tool for Language Recognition, is a parser
generator that uses LL(*) for parsing. ANTLR is the successor to the Purdue Compiler Construction Tool
Set (PCCTS), first developed in 1989, and is under active development. Its maintainer is Professor
Terence Parr of the University of San Francisco.

#### How to wok antlr ?

ANTLR takes as input a grammar that specifies a language and generates as output source code for a
recognizer of that language. While Version 3 supported generating code in the programming languages
Ada95, ActionScript, C, C#, Java, JavaScript, Objective-C, Perl, Python, Ruby, and Standard ML,[1] the
current release at present only targets Java, C#, C++,[2] JavaScript, Python, Swift, and Go. A language is
specified using a context-free grammar expressed using Extended Backus–Naur Form (EBNF).

#### What is antlr output ?

ANTLR can generate lexers, parsers, tree parsers, and combined lexer-parsers. Parsers can automatically
generate parse trees or abstract syntax trees, which can be further processed with tree parsers. ANTLR
provides a single consistent notation for specifying lexers, parsers, and tree parsers.

#### What we need to implement ?

We should implement visitor class for traversing syntax tree

![](https://github.com/pouyarezaei/simpleinterpreter/blob/master/visitor.png)

This is the Grammar i worked on

```g4
grammar Grammar;

program: statements ;

statements: (statement)+ ;

statement: identifier equal expr semicolon                                			
        | 'begin' statements 'end'                              				        
        | 'if' expr 'then' statement                        	  			            
        | 'if' expr 'then' statement 'else' statement          		                	
        | 'while' expr 'do' statement                                          			
        | 'for'  identifier equal number colon number 'do' statement 	                
        | 'loop' identifier colon number 'do' statement	                                
        | 'print' identifier semicolon                                 					
        | 'print' stringliteral ',' identifier semicolon                                
        | 'println' identifier semicolon                                 			    
        | 'put' identifier semicolon                                                    
        | 'array' identifier colon openBracket numcom closeBracket semicolon            
        | 'array.get' identifier opneParan number closeParan semicolon                  
        | 'array.put' identifier opneParan number closeParan semicolon                  
        | 'array.size' identifier semicolon                                             
        | 'map' identifier colon openBracket value closeBracket semicolon               
        | 'map.get' identifier opneParan stringliteral closeParan semicolon             
        | 'map.put' identifier opneParan stringliteral ',' number closeParan semicolon  
        | 'map.size' identifier semicolon                                               
        ;

expr: expr binop expr                                            	
		| '!' expr                                                  
		| opneParan expr closeParan                                 
		| identifier                                                
		| number                                                   
		| boolea                                                    
		| complexExp 							 					
		;

complexExp	: div_multi ( plus_minusOP div_multi )* ;
div_multi	: pow  ( div_multiOP pow )* ;
pow 		: fact ( power fact )* ;
fact		: opneParan complexExp closeParan						 
				| identifier										 
				| number											 
				;

openBracket	 : '{';
closeBracket : '}';
opneParan	 : '(';
closeParan	 : ')';
semicolon	 : ';';
equal 		 : '=';
colon 		 : ':';


plus_minusOP : '+' | '-';
div_multiOP  : '/' | '*' | '%' ;
power		 : '^' ;
binop 		 : '<' | '>' | '<=' | '>='  | '==' | '!=' ;
number 		 : ('+' | '-')? DIGITS ('.' DIGITS)? ;
identifier 	 : ALPHABET ('_' | ALPHABET | DIGITS)* ;
numcom       : (number | ',')* ;
value        : ( (stringliteral '=' number) | ',')* ;
stringliteral: ('"'(ALPHABET)*'"');
boolea 		 : 'true' | 'false' ;
DIGITS 		 : [0-9]+ ;
ALPHABET 	 : [a-zA-Z] ;
ALPHABETS	 : [a-zA-Z]+ ;

WS: [ \t\r\n] -> channel(HIDDEN) ;
```
![](https://github.com/pouyarezaei/simpleinterpreter/blob/master/loop-if.gif) ![](https://github.com/pouyarezaei/simpleinterpreter/blob/master/map-array.gif)

###### Array

1. Array - this rule generate array(list) for us
2. Array.size identifier - print array size
3. Array.get (index) - print index element
4. Array.put (value) - add this value to array

###### Map

1. Map - this rule generate Map for us ( key,value data structure) 
2. Map.size identifier - print Map size
3. Map.get (key) - print value for this input key
4. Map.put (key,val) - add this element to map


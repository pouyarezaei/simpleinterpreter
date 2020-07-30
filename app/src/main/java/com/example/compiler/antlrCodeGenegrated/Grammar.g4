grammar Grammar;

program: statements ;

statements: (statement)+ ;

statement: identifier equal expr semicolon                                				#assignment
        | 'begin' statements 'end'                              				        #beginend
        | 'if' expr 'then' statement                        	  			            #if
        | 'if' expr 'then' statement 'else' statement          		                	#ifelse
        | 'while' expr 'do' statement                                          			#while
        | 'for'  identifier equal number colon number 'do' statement 	                #for
        | 'loop' identifier colon number 'do' statement	                                #loop
        | 'print' identifier semicolon                                 					#print
        | 'print' stringliteral ',' identifier semicolon                                #printf
        | 'println' identifier semicolon                                 			    #println
        | 'put' identifier semicolon                                                    #put
        | 'array' identifier colon openBracket numcom closeBracket semicolon            #array
        | 'array.get' identifier opneParan number closeParan semicolon                  #getarray
        | 'array.put' identifier opneParan number closeParan semicolon                  #putarray
        | 'array.size' identifier semicolon                                             #sizearray
        | 'map' identifier colon openBracket value closeBracket semicolon               #map
        | 'map.get' identifier opneParan stringliteral closeParan semicolon             #getmap
        | 'map.put' identifier opneParan stringliteral ',' number closeParan semicolon  #putmap
        | 'map.size' identifier semicolon                                               #sizemap
        ;

expr: expr binop expr                                            	#binopr
		| '!' expr                                                  #not
		| opneParan expr closeParan                                 #paranthesis
		| identifier                                                #id
		| number                                                    #num
		| boolea                                                    #bool
		| complexExp 							 					#complexExpr
		;

complexExp	: div_multi ( plus_minusOP div_multi )* ;
div_multi	: pow  ( div_multiOP pow )* ;
pow 		: fact ( power fact )* ;
fact		: opneParan complexExp closeParan						 #paran
				| identifier										 #idd
				| number											 #numm
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
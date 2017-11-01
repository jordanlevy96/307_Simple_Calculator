import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Calculator extends Application {
	boolean operatorPressed = false;
    String operator;
    int num1;
    int num2;
	
	@Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Simple Calculator");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        Button zero = new Button("0");
        Button one = new Button("1");
        Button two = new Button("2");
        Button three = new Button("3");
        Button four = new Button("4");
        Button five = new Button("5");
        Button six = new Button("6");
        Button seven = new Button("7");
        Button eight = new Button("8");
        Button nine = new Button("9"); 
        
        Button plus = new Button("+");
        Button minus = new Button("-");
        Button times = new Button("*");
        Button divide = new Button("/");
        Button clear = new Button("C");
        Button equals = new Button("=");
        
        TextField field = new TextField();
        field.setDisable(true);
        field.setPrefWidth(80.0);
        
        zero.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String current = field.getCharacters().toString();
                if (operatorPressed) {
                		current = "";
                		operatorPressed = false;
                }
                current += "0";
                field.setText(current);
            }
        });
        
        one.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            		String current = field.getCharacters().toString();
            		if (operatorPressed) {
                		current = "";
                		operatorPressed = false;
                }
                current += "1";
                field.setText(current);
            }
        });
        
        two.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            		String current = field.getCharacters().toString();
            		if (operatorPressed) {
                		current = "";
                		operatorPressed = false;
                }
                current += "2";
                field.setText(current);
            }
        });
        
        three.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            		String current = field.getCharacters().toString();
            		if (operatorPressed) {
                		current = "";
                		operatorPressed = false;
                }
                current += "3";
                field.setText(current);
            }
        });
        
        four.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            		String current = field.getCharacters().toString();
            		if (operatorPressed) {
                		current = "";
                		operatorPressed = false;
                }
                current += "4";
                field.setText(current);
            }
        });

        five.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            		String current = field.getCharacters().toString();
            		if (operatorPressed) {
                		current = "";
                		operatorPressed = false;
                }
                current += "5";
                field.setText(current);
            }
        });
        
        six.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            		String current = field.getCharacters().toString();
            		if (operatorPressed) {
                		current = "";
                		operatorPressed = false;
                }
                current += "6";
                field.setText(current);
            }
        });
        
        seven.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            		String current = field.getCharacters().toString();
            		if (operatorPressed) {
                		current = "";
                		operatorPressed = false;
                }
                current += "7";
                field.setText(current);
            }
        });
        
        eight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            		String current = field.getCharacters().toString();
            		if (operatorPressed) {
                		current = "";
                		operatorPressed = false;
                }
                current += "8";
                field.setText(current);
            }
        });
        
        nine.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            		String current = field.getCharacters().toString();
            		if (operatorPressed) {
                		current = "";
                		operatorPressed = false;
                }
                current += "9";
                field.setText(current);
            }
        });
        
        plus.setOnAction(new EventHandler<ActionEvent>() {
        		@Override
        		public void handle(ActionEvent event) {
        			handleOperator("+", field);
        		}
        });
        
        minus.setOnAction(new EventHandler<ActionEvent>() {
	    		@Override
	    		public void handle(ActionEvent event) {
	    			handleOperator("-", field);
	    		}
        });
        
        times.setOnAction(new EventHandler<ActionEvent>() {
	    		@Override
	    		public void handle(ActionEvent event) {
	    			handleOperator("*", field);
	    		}
        });
        
        divide.setOnAction(new EventHandler<ActionEvent>() {
	    		@Override
	    		public void handle(ActionEvent event) {
	    			handleOperator("/", field);
	    		}
        });
        
        equals.setOnAction(new EventHandler<ActionEvent>() {
	    		@Override
	    		public void handle(ActionEvent event) {
	    			handleEquals(field);
	    		}
	    });
        
        clear.setOnAction(new EventHandler<ActionEvent>() {
	    		@Override
	    		public void handle(ActionEvent event) {
	    			field.setText("");
	    		}
	    });
        
        grid.add(one, 0, 1);
        grid.add(two, 1, 1);
        grid.add(three, 2, 1);
        grid.add(four, 0, 2);
        grid.add(five, 1, 2);
        grid.add(six, 2, 2);
        grid.add(seven, 0, 3);
        grid.add(eight, 1, 3);
        grid.add(nine, 2, 3);
        grid.add(zero, 0, 4);
        
        grid.add(plus, 3, 1);
        grid.add(minus, 3, 2);
        grid.add(times, 3, 3);
        grid.add(divide, 3, 4);
        grid.add(equals, 2, 4);
        grid.add(clear, 1, 4);

        grid.add(field, 0, 0, 4, 1);
        

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }
	
	public void handleOperator(String op, TextField field) {
		operator = op;
		operatorPressed = true;
		num1 = Integer.parseInt(field.getCharacters().toString());
	}
	
	public void handleEquals(TextField field) {
		num2 = Integer.parseInt(field.getCharacters().toString());
		String answer = "";
		
		switch (operator) {
		case "+":
			Addition a = new Addition();
			answer = a.handleOperator(num1, num2);
			break;
		case "-":
			Subtraction s = new Subtraction();
			answer = s.handleOperator(num1, num2);
			break;
		case "*":
			Multiplication m = new Multiplication();
			answer = m.handleOperator(num1, num2);
			break;
		case "/":
			Division d = new Division();
			answer = d.handleOperator(num1, num2);
			break;
		}
		
		field.setText(answer);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

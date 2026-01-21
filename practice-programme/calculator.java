class calculator{

// Method for addition

void addition(int a, int b){
int sum = a+b;
System.out.println("addition = " +sum);
}

// Method for subtraction

void subtraction(int a, int b){
int sub = a-b;
System.out.println("subtraction = " +sub);
}

// Method for multiplication

void multiplication(int a, int b){
int mul = a*b;
System.out.println("multiplication = " +mul);
}

// Method for division

void division(int a, int b){
int div = a/b;
System.out.println("division = " +div);
}

// Method for modulus

void modulus(int a, int b){
int mod = a%b;
System.out.println("modulus = " +mod);
}

// Main method

public static void main (String[] args){

// Creating object of calculator class

calculator calc = new calculator();

// Calling method using object

calc.addition(20, 15);
calc.subtraction(20, 15);
calc.multiplication(20, 15);
calc.division(20, 15);
calc.modulus(20, 15);
}
}
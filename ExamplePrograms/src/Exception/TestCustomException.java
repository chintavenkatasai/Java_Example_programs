package Exception;

class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}

class TestCustomException {
 static void validateAge(int age) throws InvalidAgeException {
     if (age < 18) {
         throw new InvalidAgeException("Age is not valid for voting, must be 18 or older.");
     } else {
         System.out.println("Age is valid for voting.");
     }
 }
 public static void main(String[] args) {
     try {
         validateAge(10);
     } catch (InvalidAgeException e) {
         System.out.println("Caught Exception: " + e);
     }
     
//     try {
//         validateAge(20);
//     } catch (InvalidAgeException e) {
//         System.out.println("Caught Exception: " + e);
//     }
 }
}

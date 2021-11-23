public class CWH_chp4_conditionals {
    public static void main(String[] args) {
        int age = 14;
        boolean a=true;
        boolean b=false;
        //! relational operators
        /*
        == ;comparision operators
        != ;not eqauals to operator
        >= ;grater than or equal to operator
        <= ;less than or equal to operator
        */

        if (age>=18) {
            System.out.println("You can drive");
        } else {
            System.out.println("You can't drive");//! else is optional
        }
        
        /*
        logical operators
        && ;logical AND operator
            ! return true when both conditions are true
        || ;logical OR operator
            ! return true if only one condition is true
        !  ;logical NOT operator
            invert true to false and false to true
        */
        if (a || b){
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
    }
}
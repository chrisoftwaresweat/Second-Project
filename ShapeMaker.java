import java.util.Scanner;
//SECOND PROJECT AS A BEGINNER
public class ShapeMaker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's make shapes using stars!");
        String shapeChoice;
        //user input
        do {
            System.out.print("What shape do you wanna make?\nSquare, Rectangle, Triangle?\nType 'Exit' if you're done\nType here: ");
            shapeChoice= scanner.nextLine().toLowerCase().trim();
            //
            switch (shapeChoice){
                case "square":
                    System.out.print("Enter the length&width: ");
                    int n=scanner.nextInt();
                    scanner.nextLine();
                    if(n<=0){
                        System.out.println("THE WIDTH AND LENGTH CANNOT BE ZERO!");
                    }
                    else{
                        for(int i=1; i<=n;i++){
                            for (int j=1; j<=n;j++){
                                System.out.print("*  ");
                            }
                            System.out.println();
                        }
                    }
                    break;
                case "rectangle":
                    System.out.print("Enter the width: ");
                    int w=scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter the length: ");
                    int l=scanner.nextInt();
                    scanner.nextLine();
                    if(w<=0||l<=0){
                        System.out.println("The width or length cannot be zero!");
                    }
                    else if(w==l){
                        System.out.println("WIDTH AND LENGTH CANNOT BE EQUAL FOR A RECTANGLE.\nImma just add one in the length you've given.");
                        l++;
                        System.out.printf("Length is now: %d\n", l);
                        for(int i=1; i<=w;i++) {
                            for (int j = 1; j <= l; j++) {
                                System.out.print("*  ");
                            }
                            System.out.println();
                        }
                    }
                    else {
                        for(int i=1; i<=w;i++) {
                            for (int j = 1; j <= l; j++) {
                                System.out.print("*  ");
                            }
                            System.out.println();
                        }
                    }
                    break;
                case "triangle":
                    System.out.print("Do u want it center, right, left?: ");
                    String triChoice= scanner.nextLine().trim().toLowerCase();
                    switch (triChoice){
                        case "center":
                            System.out.print("How many rows for the centered triangle?: ");
                            int c= scanner.nextInt();
                            scanner.nextLine();
                            if(c<=0){
                                System.out.println("ROWS CANNOT BE ZERO!");
                            }
                            else {
                                for(int i=1; i<=c; i++){
                                    for (int j=i; j<=c; j++){
                                        System.out.print("  ");
                                    }
                                    for (int k=1; k<i; k++){
                                        System.out.print("* ");
                                    }
                                    for(int h=1; h<=i; h++){
                                        System.out.print("* ");
                                    }
                                    System.out.println();
                                }
                            }
                            break;
                        case "right":
                            System.out.print("How many rows for the right sided triangle?: ");
                            int r= scanner.nextInt();
                            scanner.nextLine();
                            if(r<=0){
                                System.out.println("ROWS CANNOT BE ZERO!");
                            }
                            else {
                                for (int i=1; i<=r; i++){
                                    for (int j=1; j<=i; j++){
                                        System.out.print("* ");
                                    }
                                    System.out.println();
                                }
                            }
                            break;
                        case "left":
                            System.out.print("How many rows for the left sided triangle?: ");
                            int le= scanner.nextInt();
                            scanner.nextLine();
                            if(le<=0){
                                System.out.println("ROWS CANNOT BE ZERO!");
                            }
                            else {
                                for (int i=1; i<=le; i++){
                                    for (int j=i; j<=le; j++){
                                        System.out.print("  ");
                                    }
                                    for (int k=1; k<=i; k++){
                                        System.out.print("* ");
                                    }
                                    System.out.println();
                                }
                            }
                            break;
                        default:
                            System.out.println("Invalid answer!");
                    }
                    break;
                case "exit":
                    System.out.println("Thank you for playing with us. Come again!");
                    break;
                default:
                    System.out.println("INVALID ANSWER!");
            }
        }while (!shapeChoice.equalsIgnoreCase("exit"));
        scanner.close();
    }
}
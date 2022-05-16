import java.util.Scanner;

public class slopedraft {


    static Scanner input = new Scanner(System.in);
//fix your variables / use global variables then modify the code
//almost there naman na yung gawa mo need lang iayos pa and check your variables kasi wala yung iba dun sa orig code mo
    double input1; 
    double input2; 
    double input3;
    double input4;
    double input5;
    double input6;
    double input7;

static int get_problem() { 
    int choice; 
    System.out.print("select the form that you would like to convert to slope-double intercept form:\n"); 
    System.out.print("\t1) Two-podouble form (you know two podoubles on the line)\n"); 
    System.out.print("\t2) Podouble slope form (you know the line's slope and podouble):\n"); 
    System.out.print("\t3) Exit\n"); 
    choice = input.nextInt(); 

    return choice;
}

    static void get2_pt() { 
    System.out.print("\n"); 
    System.out.print("Enter the x-y coordinates of the !rst podouble separated by a space=>"); 
    int input1 = input.nextInt(); 
    int input2 = input.nextInt(); 
    System.out.print("\n"); 
    
    System.out.print("Enter the x-y coordinates of the second podouble separated by a space=>"); 
    int input3 = input.nextInt(); 
    int input4 = input.nextInt();}
    
    static void get_pt_slope() { 
        System.out.print("\n"); 
        System.out.print("Enter the slope=>"); 
        int input5 = input.nextInt(); 
        System.out.print("Enter the x-y coordinates of the second podouble separated by a space=>"); 
        int input6 = input.nextInt();  
        int input7 = input.nextInt();
}
    static void slope_intercept_from2_pt() {    
        System.out.print("\n"); 
        System.out.print("\nTwo-point form:\n"); 
        System.out.print("\t(%lf - %lf)\n", y2, y1); 
        System.out.print("m = --------------"); 
        System.out.print("\t(%lf - %lf)\n", x2, x1); 
        double m = (y2 - y1) / (x2 - x1); 
        double constant = y1 - (m * x1); 
        System.out.print("\n"); 
        System.out.print("Slope-intercept from: y = %lfx + %lf", m, constant);
 }
static void slope_intercept_from_pt_slope() { 
System.out.print("\n"); 
System.out.print("Point slope form: y - %lf = %lf (x- %lf)", y1, m, x1); 
double constant = y1 - (m * x1); 
System.out.print("\n"); 
System.out.print("Slope-intercept from: y=%lfx - %lf ", m, constant);
}
public static void main (String [] args) {
int choice;
double input1, input2, input4, input5, input6, input7;
double x1,  y1,  x2,  y2, m; 
choice = get_choice();  
if (problem == 1) { 
get2_pt(input1, input2, input3, input4); 
slope_intercept_from2_pt(input1, input2, input3, input4); 
    } 
else if (problem == 2) { 
get_pt_slope(); 
slope_intercept_from_pt_slope(); 
} 
    }
}

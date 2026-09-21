//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] interior={"Bathrooms","Kitchens","Garden"};
        String[] months={"JAN","FEB","MAR","APR","MAY","JUN"};
        int[][]jobs={{8,2,5},{7,4,5},{5,5,2},{2,2,3},{7,7,9},{7,8,5}};

        System.out.println("*".repeat(120));
        System.out.println("HOME MAKEOVER REPORT");
        System.out.println("*".repeat(120));
        System.out.printf("%-20s%-10s%-10s%-10s%n","",interior[0],interior[1],interior[2]);

        for (int i = 0; i < jobs.length; i++) {
            System.out.printf("%-20s",months[i]);
            for (int j = 0; j <jobs[i].length ; j++) {
                System.out.printf("%-10d",jobs[i][j]);
            }
            System.out.println();
        }
        int total=0;
        System.out.println("*".repeat(120));
        System.out.println("MONTHLY TOTALS");
        System.out.println("*".repeat(120));
        for (int i = 0; i < jobs.length ; i++) {
            System.out.printf("%-20s",months[i]);
            for (int j = 0; j <jobs[i].length ; j++) {
                total+=jobs[i][j];
                System.out.printf("%-10d",total);
                if (total>=15) {
                    System.out.println("***");
                }
            }

        }


    }
}
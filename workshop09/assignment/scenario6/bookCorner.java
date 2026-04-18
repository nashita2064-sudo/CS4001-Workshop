public class bookCorner{
    public static void main(String[] args){
        String[] categories={"Fiction","Nepali"};
        
        String[][] titles= new String[2][1];
        double[][] prices=new double [2][1];
        
        titles[0][0]="The Hunger Games";
        prices[0][0]=150.0;
        
        titles[1][0]="Asahamati-5";
        prices[1][0]=750.0;
        
        System.out.println("Mini Book Corner");
        for (int i=0;i<categories.length;i++){
        System.out.println("Categories" + " " + categories[i]);
        System.out.println("Titles" + " " + titles[i][0]);
        System.out.printf("Prices %.2f\n",prices[i][0]);
        System.out.println();
    }
    }
}
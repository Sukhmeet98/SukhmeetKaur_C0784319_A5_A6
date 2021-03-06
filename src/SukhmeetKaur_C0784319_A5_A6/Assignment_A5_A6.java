package SukhmeetKaur_C0784319_A5_A6;

import javax.swing.*;

public class Assignment_A5_A6 {
    double ServicePackageA;
    double ServicePackageB;
    double optionCostSmall;
    double optionCostLarge;
    double itemBoxesSmall;
    double itemBoxesLarge;

    public Assignment_A5_A6(){
        setServicePackageA();
        setServicePackageB();
        setOptionCostSmall();
        setOptionCostLarge();
        setItemBoxesSmall();
        setItemBoxesLarge();
    }

    public double getServicePackageA() {
        return ServicePackageA;
    }

    public void setServicePackageA() {
        this.ServicePackageA = 100.00;
    }

    public double getServicePackageB() {
        return ServicePackageB;
    }

    public void setServicePackageB() {
        this.ServicePackageB = 150.00;
    }

    public double getOptionCostSmall() {
        return optionCostSmall;
    }

    public void setOptionCostSmall() {
        this.optionCostSmall = 8.00;
    }

    public double getOptionCostLarge() {
        return optionCostLarge;
    }

    public void setOptionCostLarge() {
        this.optionCostLarge = 20.11;
    }

    public double getItemBoxesSmall() {
        return itemBoxesSmall;
    }

    public void setItemBoxesSmall() {
        this.itemBoxesSmall = 2.50;
    }

    public double getItemBoxesLarge() {
        return itemBoxesLarge;
    }

    public void setItemBoxesLarge() {
        this.itemBoxesLarge = 4.50;
    }

    public static void main(String[] args) {
        Assignment_A5_A6 cost = new Assignment_A5_A6();

        int j = 0;
        JOptionPane.showMessageDialog(null,"The username and password for login is\n" +
                "Sukhmeet Kaur");
        while (true){
            String userName = JOptionPane.showInputDialog(
                    null,"Please enter user name ");
            String userPass = JOptionPane.showInputDialog(
                    null,"Please enter the password ");
            if(userName.equals("Sukhmeet") && userPass.equals("Kaur")){
                JOptionPane.showMessageDialog(null,
                        "You have successfully logged in");
                double servicePackage = getServicePackage(cost.getServicePackageA(),cost.getServicePackageB());
                System.out.println(servicePackage);
                double storageOption = StorageOption(cost.getOptionCostSmall(),cost.getOptionCostLarge());
                System.out.println(storageOption);
                double boxOption = ItemOption(cost.getItemBoxesSmall(),cost.getItemBoxesLarge());
                System.out.println(boxOption);
                JOptionPane.showMessageDialog(null,
                        "The total Service Package for your selected option is $"+ servicePackage );
                JOptionPane.showMessageDialog(null,
                        "The total cost of Storage for your selected option is $"+ storageOption );
                JOptionPane.showMessageDialog(null,
                        "The total cost per box for your selected option is $"+ boxOption );
                JOptionPane.showMessageDialog(null,
                        "The total final cost is $"+ (servicePackage + storageOption + boxOption) );
                break;
            }else{
                JOptionPane.showMessageDialog(null,
                        "Please enter correct username and password");
            }
            j+=1;
            if(j == 3){
                break;
            }
        }
    }

    private static double ItemOption(double itemBoxesSmall, double itemBoxesLarge) {
        String servicePackage = JOptionPane.showInputDialog(null,
                "Please enter type of storage box (S/L) you want from the given options" +
                        "\n$" + itemBoxesSmall + " for small Storage or $" +
                        itemBoxesLarge + " for large storage");
        if(servicePackage.equalsIgnoreCase("S")){
            return itemBoxesSmall;
        }else if(servicePackage.equalsIgnoreCase("L")){
            return itemBoxesLarge;
        }else  {
            return 0.0;
        }
    }

    private static double StorageOption(double optionCostSmall, double optionCostLarge) {
        String servicePackage = JOptionPane.showInputDialog(null,
                "Please enter type of storage (S/L) you want from the given options" +
                        "\n$" + optionCostSmall + " for small Storage or $" +
                        optionCostLarge + " for large storage");
        if(servicePackage.equalsIgnoreCase("S")){
            return optionCostSmall;
        }else if(servicePackage.equalsIgnoreCase("L")){
            return optionCostLarge;
        }else  {
            return 0.0;
        }
    }

    private static double getServicePackage(double costA, double costB) {
        String servicePackage = JOptionPane.showInputDialog(null,
                "Please enter type of service(A/B) you want from the given options" +
                        "\n$" + costA + " for package A or $" + costB + " for package B");
        if(servicePackage.equalsIgnoreCase("A")){
            return costA;
        }else if(servicePackage.equalsIgnoreCase("B")){
            return costB;
        }else  {
            return 0.0;
        }
    }
}





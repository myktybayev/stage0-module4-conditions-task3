package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        /*
        Basic Salary <= 10000: taxes - 15%.
        10000 < Basic Salary <= 20000: taxes - 18%
        Basic Salary > 20000 : taxes - 20%
        Basic salary < 0 -> "wrong input!"
         */
        int taxes = 0;
        if(salary < 0){
            System.out.println("wrong input!");
        }else if(salary <= 10000){
            taxes = 15;
            double res = salary - salary * ((double)taxes/100);
            System.out.println(res);
        }else if(salary <= 20000 && salary > 10000){
            taxes = 18;
            double res = salary - salary * ((double)taxes/100);
            System.out.println(res);
        }else{
            taxes = 20;
            double res = salary - salary * ((double)taxes/100);
            System.out.println(res);
        }
    }
}

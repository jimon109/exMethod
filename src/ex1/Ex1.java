package ex1;

public class Ex1 {

    // Method No param, No Return

        // Wage ค่าแรง total=(40*rate)+(hour-40)*(1.5f*rate)
        public int hour;
        public float rate;

        // Method Wage
        public void calWage(){
            float total = (40*rate)+(hour-40)*(1.5f*rate);
            System.out.println("ค่าแรงรวม = " + total + "บาท");
        }

        public static void main(String[] args) {
            Ex1 emp_wage = new Ex1();
            emp_wage.hour = 50;
            emp_wage.rate = 100.0f;
            emp_wage.calWage();
        }

    }



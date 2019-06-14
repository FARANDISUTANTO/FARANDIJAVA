public class testemployee {

    public static void main(String[] args) {
        ComissionedEmployee budi;
        budi = new ComissionedEmployee();
        budi.setName("Kontol");
        budi.setSalary(100000.0);
        budi.setComission(1000.0);
        
        System.out.printf("Nama :%s \n", budi.getName());
        System.out.printf("Salary : %f\n", budi.getSalary());
        System.out.printf("Komisi : %f\n",budi.getComission());
        System.out.printf("Tax : %f\n",budi.getTax());
        System.out.printf("Salary after comission : %f\n",budi.getComissionEmployee());
        System.out.printf("Gaji bersih : %f\n",budi.getTakeHomePay());
        
    }
    
}

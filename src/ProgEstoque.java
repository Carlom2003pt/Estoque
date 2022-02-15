import java.util.Scanner;
public class ProgEstoque {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Estoque p = new Estoque();

        System.out.println("Dados do produto em Stock:");
        System.out.print("Nome: ");
        p.name=sc.nextLine();

        System.out.print("Price: ");
        p.price=sc.nextDouble();

        System.out.print("Quantity: ");
        p.quantity=sc.nextInt();

        System.out.println("Products Data: ");
        System.out.println("nome: " + p.name);
        System.out.println("price: " + p.price);
        System.out.println("quantity: " + p.quantity);
        System.out.println("Total in Stock: " + p.TotalValueStock());

        //entrada em stock
        System.out.println("\nStock in: ");
        System.out.print("Quantity: ");
        int qt=sc.nextInt();

        p.AddProducts(qt);
        System.out.printf("Products Data after Stock in: ");
        System.out.printf("Name: %s, Price: %2f%n, Quantity: %d, Total in Stock: %.2f",p.name,p.price,p.quantity,p.TotalValueStock());

        //saida em stock
        System.out.println("\nStock out: ");
        System.out.print("Quantity: ");
        qt=sc.nextInt();

        p.RemoveProducts(qt);
        System.out.printf("Products Data after Stock out: ");
        System.out.printf("Name: %s, Price: %2f%n, Quantity: %d, Total in Stock: %.2f",p.name,p.price,p.quantity,p.TotalValueStock());
    }
}

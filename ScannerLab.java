public class ScannerLab
{
    Scanner input = new Scanner(System.in);
    input.nextInt();
    
    while(input != "quit")
    {
        System.out.println(input);
        input.next();
    }
    if(input == "quit")
    {
        break;
    }
}
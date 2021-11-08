class Recursion_palindrome{
    public static boolean palin(String a){
        if(a.length() == 2 || a.length() == 3){
            if(a.charAt(0) == a.charAt(1) || a.charAt(0) == a.charAt(2))
        return true;}

        if(a.charAt(0) == a.charAt(a.length()-1))
        return palin(a.substring(1, a.length()-1));

        return false;


    }


    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(palin(input))
        {
        
            System.out.println("string is palindrome");
        }

        else{
            System.out.println("not palindrome");
        }

    }
}
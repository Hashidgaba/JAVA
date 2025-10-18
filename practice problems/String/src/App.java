public class App {
    public static void main(String[] args) throws Exception {
      String a = "Hello, World!";
      String b = "This is Hashid gaba";
      // System.out.println(a); 
      // System.out.println(b);
      // System.out.println(a.length());
      // System.out.println(b.charAt(5));
      // System.out.println(b.indexOf("gaba"));
      // System.out.println(b.indexOf('a'));
      System.out.println(b.substring(8).equalsIgnoreCase("Hashid gaba"));
      System.out.println(a.length());
      for(int i = a.length() - 1; i >= 0;i--){
       System.out.print(a.charAt(i));
      }
    }
}

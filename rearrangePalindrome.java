class Main {
  public static void main(String[] args) {
    
    String input="aaaaaba";

    int str[]=new int[26];

    for(int i=0;i<input.length();i++){
        str[input.charAt(i)-97]++;
        System.out.println(input.charAt(i)-97);
    }

    int c=0;
    for(int i=0;i<26;i++){
      //System.out.println(str[i]);
      if(str[i]%2==1)
        c++;
    }
    if(c>1)
      System.out.println("False");
    else
      System.out.println("True");


  }
}

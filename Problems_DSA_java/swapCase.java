public class swapCase {
    public static void main(String ar[]){
        String strr="HElo-Lol";
        StringBuffer str=new StringBuffer(strr);  
    for(int i=0;i<str.length();i++){
      Character c=str.charAt(i);
      if(Character.isLowerCase(c)){
        str.replace(i,i+1,Character.toUpperCase(c)+"");
      }
      else
          str.replace(i,i+1,Character.toLowerCase(c)+"");
    }
    System.out.println(str.toString());
  }
    }


public class TImeinMinutes {
    public static void main(String ar[]){
        String str="6:30pm-7:20pm";
        //String str1="1:20am-1:22am";
        //String str2="2:30am-3:25am";
        //String str3="3:12am-2:44am";
        String[] strr=str.split("-");
        String arg1=strr[0].substring(strr[0].length()-2);
        String arg2=strr[1].substring(strr[1].length()-2);
        //System.out.println(arg1.equals(arg2));

        String left1=(strr[0].split(":")[1].substring(0,strr[0].split(":")[1].length()-2));
        String right1=(strr[1].split(":")[1].substring(0,strr[1].split(":")[1].length()-2));
        String left2=strr[0].split(":")[0];
        System.out.println(left2);
        String right2=strr[1].split(":")[0];
        System.out.println(right2);
        int res=0;
        if(Integer.parseInt(left2)==12 && Integer.parseInt(right2)!=12 || Integer.parseInt(right2)==12 && Integer.parseInt(left2)!=12) {
            if(arg1.equals(arg2)){
                arg1="";
            }
            else{
                arg1=arg2;
            }
        }
        if(arg1.equals(arg2)){
            System.out.println("Here");
           if(Integer.parseInt(left2+left1)>Integer.parseInt(right2+right1)){
                 res=1440+(Integer.parseInt(right1)-Integer.parseInt(left1))-(int)Math.abs((Integer.parseInt(left2)-Integer.parseInt(right2)))*60;
            }
           else if(Integer.parseInt(left2+left1)<Integer.parseInt(right2+right1)){
                res=Math.abs((Integer.parseInt(left2)-Integer.parseInt(right2))*60+((Integer.parseInt(left1)-Integer.parseInt(right1))));
           }
           else 
               res=0;
           System.out.println(res);
        }
        else if (arg1.equals(arg2)==false){

            if(Integer.parseInt(left2+left1)>Integer.parseInt(right2+right1)){
               // System.out.println("here");
                res=720+((Integer.parseInt(right1)-Integer.parseInt(left1)))-(Integer.parseInt(left2)-Integer.parseInt(right2))*60;
            }
            else{
                res=720+(Integer.parseInt(right1)-Integer.parseInt(left1))+(Integer.parseInt(right2)-Integer.parseInt(left2))*60;
            }

        }
        System.out.println(res);
    }
}

    


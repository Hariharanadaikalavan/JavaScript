public class RemoveVowels {
    public static void main(String args[]){
       String str="hariharan";
      char ch[]=str.toCharArray();
       for(int i=0;i<str.length();i++)
             {
                 if(ch[i]=='a'|| ch[i]=='e'||ch[i]=='i' ||ch[i]=='o'||ch[i]=='u'){
                 ch[i]='$';
             }else{
                     System.out.print(ch[i]);
                  }
              }
        
       
    }
}

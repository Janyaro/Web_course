
public class FireAir {
    public void disply(String [] d)throws Exception{
        for (String list : d) {

            System.out.println(list);
            Thread.sleep(100);
        }
    }
    public void Add_Song(String soname, String [] d,int position) {
     String playlist [] = new String [d.length+1];
        for (int i = 0; i < d.length; i++) {
            if(i<position){          // 12,3,4,5
                                    // 12,3,6,
                playlist[i]=d[i];
            }
            if(i==position){
                playlist[i]=soname;
            }
            else
                playlist[i]=d[i+1];
            

        }
        
        for (int h=0;h<playlist.length;h++) {
            System.out.println(playlist[h]);
        }
    }
    public void delname(int num, String []d) {
        String []uplist = new String [d.length-1];
          for(int b=0;b<d.length;b++){
              if (b<num) {
                  uplist[b]=d[b];
              }
             else if(b==num){
              continue;
             }
              else 
                  uplist[b-1]=d[b];            }
          
  for (int i = 0; i <d.length-1; i++) {
      System.out.println(uplist[i]);
  }
  
        }
    public void   search_Song(String sname , String [] d ) {
        for (int k = 0; k < d.length; k++) 
            if(d[k].equalsIgnoreCase(sname)){
        System.out.println("The given song is at index "+ (k+1));
    }     
        
    }
    public void  update(int index,String updateSong ,String [] d) {
        for (int x = 0; x < d.length; x++) {
            if(x==index){
                d[x]=updateSong;
            }
        }
        
        for(int y=0;y<d.length;y++){
            System.out.println(d[y]);
        }
    }
}

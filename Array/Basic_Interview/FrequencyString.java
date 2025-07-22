 class FrequencyString {
    public static void main(String[] args){
        // String str = "banana";
         String str = "Engineer";

        for(int i =0 ; i<str.length(); i++){
            char ch = str.charAt(i);

            boolean alredaycount = false;

            for(int j = 0; j<i ; j++){
                if(str.charAt(j) ==ch){
                    alredaycount =true;
                    break;

                }

            }

            if(alredaycount){
                continue;
            }

            int count = 0;

            for(int k =0 ; k<str.length(); k++){
                if(str.charAt(k)==ch){
                    count++;
                }
            }

            System.out.println(ch +"="+ count);


        }

    }
    
}

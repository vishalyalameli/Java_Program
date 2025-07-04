class StringDupliCharRemove {
    public static void main(String [] args){
        String input = "geeksforgeeks";
        String output= "";

        for(int i = 0 ;i< input.length() ; i++) {

            char CurrentChar = input.charAt(i);

            if(output.indexOf(CurrentChar) == -1 ){
                output = output + CurrentChar;
            }

        }
        System.out.println("Output:" + output);
    }

    
}

//Output:geksfor

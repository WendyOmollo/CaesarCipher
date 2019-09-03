 class Encrypt {
    private String response;
    private int key;
    private String encrypted = "";

    public Encrypt(String response,int key){
        this.key= key;
        this.response = response;

        for (int i =0;i<response.length();i++) {
            int ascii = (int) response.charAt(i);
            ascii += key;
            Character ch = (char) ascii;
            encrypted+=ch;
        }
    }
     public int getKey() {

         return key;
     }

     public String getResponse() {

         return response;
     }

     public String setEncrypted() {

         return encrypted;
     }




}

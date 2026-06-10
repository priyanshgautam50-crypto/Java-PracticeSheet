class CheckNumberInArray {
    public static void main(String[] args) {
        float[] marks ={ 10.0F, 20.0F, 30.0F, 40.0F, 50.0F};
        float num = 30.0F;
        boolean isInArray = false;
        for(float element:marks) {
            if (num==element) {
                isInArray = true;
                break;
            } 
        }
        if(isInArray) {
              System.out.println("The num is in an array");
        }
        else {
              System.out.println("The num is not in an array");
        }
    }
}

class FloatMarksSum {
    public static void main(String[] args) {
        float[] marks ={ 10.0F, 20.0F, 30.0F, 40.0F, 50.0F};
        float sum = 0;
        for(float element:marks) {
            sum = sum + element;
        }
        System.out.println("The value of sum is :" + sum);
    }
}
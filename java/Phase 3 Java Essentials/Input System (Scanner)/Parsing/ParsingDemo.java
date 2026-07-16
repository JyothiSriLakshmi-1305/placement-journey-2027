public class ParsingDemo {

    public static void main(String[] args) {

        String age = "20";
        String cgpa = "8.91";
        String active = "true";

        int a = Integer.parseInt(age);
        double c = Double.parseDouble(cgpa);
        boolean b = Boolean.parseBoolean(active);

        System.out.println(a);
        System.out.println(c);
        System.out.println(b);

    }

}
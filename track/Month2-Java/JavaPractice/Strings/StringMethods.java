
class StringMethods {

    public static void main(String[] args) {
        String str = "KodNest Technologies";
        System.out.println(str);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(4));
        System.out.println(str.contains("Nest"));
        System.out.println(str.startsWith("Kod"));
        System.out.println(str.endsWith("gies"));
        System.out.println(str.indexOf('N'));
        System.out.println(str.length());
        System.out.println(str.replace('e', 'A'));
        System.out.println(str.substring(5));
        System.out.println(str.substring(5, 14));

    }
}

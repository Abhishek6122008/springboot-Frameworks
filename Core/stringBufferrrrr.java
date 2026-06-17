public class stringBufferrrrr {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Navin");
        sb.append("Reddy");
        System.out.println(sb);
        sb.deleteCharAt(2);
        sb.insert(6,"java");
        String str = sb.toString();
        System.out.println(str);
    }
}
